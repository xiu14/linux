using System.Collections.Concurrent;
using System.Reflection;
using System.Text;
using Microsoft.Xna.Framework;
using Microsoft.Xna.Framework.Graphics;
using Microsoft.Xna.Framework.Input;
using StardewModdingAPI;
using StardewValley;
using StardewValley.Menus;

namespace Libala.NpcChat;

internal sealed class NpcChatMenu : IClickableMenu
{
    private readonly NPC npc;
    private readonly IClickableMenu previousMenu;
    private readonly ModConfig config;
    private readonly IMonitor monitor;
    private readonly NpcProfile profile;
    private readonly ConversationStore conversationStore;
    private readonly bool isRemoteChat;
    private readonly ApiChatClient client;
    private readonly CancellationTokenSource cancellationToken = new();
    private readonly ConcurrentQueue<Action> completedRequests = new();
    private readonly List<ChatMessage> conversation = new();
    private TextBox inputBox = null!;
    private Rectangle messagesArea;
    private Rectangle sendButton;
    private Rectangle scrollUpButton;
    private Rectangle scrollDownButton;
    private Rectangle clearMemoryButton;
    private Rectangle closeButton;
    private bool waitingForReply;
    private bool openingMobileInput;
    private bool confirmingClearMemory;
    private bool summarizingMemory;
    private bool isClosed;
    private int conversationGeneration;
    private int scrollLineOffset;
    private string status = "";
    private ConversationRecord memory;

    public NpcChatMenu(NPC npc, IClickableMenu previousMenu, ModConfig config, IMonitor monitor, NpcProfile profile, ConversationStore conversationStore, bool isRemoteChat = false)
    {
        this.npc = npc;
        this.previousMenu = previousMenu;
        this.config = config;
        this.monitor = monitor;
        this.profile = profile;
        this.conversationStore = conversationStore;
        this.isRemoteChat = isRemoteChat;
        this.client = new ApiChatClient(config);
        this.memory = config.EnableMemory
            ? conversationStore.Load(npc.Name)
            : new ConversationRecord { NpcName = npc.Name };
        this.conversation.AddRange(this.memory.Messages);
        this.Reflow();
        if (this.conversation.Count == 0)
            this.status = "输入内容开始聊天";
        else
            this.status = "已载入此前记忆";
    }

    public override void update(GameTime time)
    {
        base.update(time);
        while (this.completedRequests.TryDequeue(out Action? action))
            action();

        this.inputBox.Update();
    }

    public override void draw(SpriteBatch b)
    {
        b.Draw(Game1.fadeToBlackRect, Game1.graphics.GraphicsDevice.Viewport.Bounds, Color.Black * 0.55f);
        IClickableMenu.drawTextureBox(
            b,
            Game1.menuTexture,
            new Rectangle(0, 256, 60, 60),
            this.xPositionOnScreen,
            this.yPositionOnScreen,
            this.width,
            this.height,
            Color.White,
            1f,
            true
        );

        Utility.drawTextWithShadow(b, $"{this.npc.displayName} - 聊天", Game1.dialogueFont, new Vector2(this.xPositionOnScreen + 28, this.yPositionOnScreen + 22), Game1.textColor);
        this.DrawButton(b, this.clearMemoryButton, this.confirmingClearMemory ? "确认清除" : "清除记忆");
        this.DrawButton(b, this.closeButton, "X");
        b.Draw(Game1.staminaRect, this.messagesArea, Color.Wheat * 0.18f);
        this.DrawConversation(b);
        this.DrawButton(b, this.scrollUpButton, "上");
        this.DrawButton(b, this.scrollDownButton, "下");

        if (!string.IsNullOrWhiteSpace(this.status))
            Utility.drawTextWithShadow(b, this.status, Game1.smallFont, new Vector2(this.messagesArea.X + 18, this.messagesArea.Bottom - 35), Color.DarkSlateGray);

        this.inputBox.Draw(b);
        this.DrawButton(b, this.sendButton, this.waitingForReply ? "..." : "发送");
        this.drawMouse(b);
    }

    public override void receiveLeftClick(int x, int y, bool playSound = true)
    {
        if (this.clearMemoryButton.Contains(x, y))
        {
            if (this.confirmingClearMemory)
                this.ClearMemory();
            else
            {
                this.confirmingClearMemory = true;
                this.status = "再次点击“确认清除”将删除这个 NPC 的聊天记忆";
                Game1.playSound("smallSelect");
            }
            return;
        }

        this.confirmingClearMemory = false;
        if (this.closeButton.Contains(x, y))
        {
            Game1.playSound("bigDeSelect");
            this.Close();
            return;
        }

        if (this.sendButton.Contains(x, y))
        {
            this.SendCurrentText();
            return;
        }

        if (this.scrollUpButton.Contains(x, y))
        {
            this.ScrollConversation(1);
            return;
        }

        if (this.scrollDownButton.Contains(x, y))
        {
            this.ScrollConversation(-1);
            return;
        }

        this.inputBox.Update();
        Rectangle inputBounds = new(this.inputBox.X, this.inputBox.Y, this.inputBox.Width, 52);
        this.inputBox.Selected = inputBounds.Contains(x, y);
        if (this.inputBox.Selected)
        {
            Game1.keyboardDispatcher.Subscriber = this.inputBox;
            if (!this.TryOpenMobileTextInput())
                Game1.showTextEntry(this.inputBox);
        }
    }

    public override void receiveKeyPress(Keys key)
    {
        if (key == Keys.Escape)
        {
            this.Close();
            return;
        }

        if (key == Keys.Enter)
        {
            this.SendCurrentText();
            return;
        }

        base.receiveKeyPress(key);
    }

    public override void gameWindowSizeChanged(Rectangle oldBounds, Rectangle newBounds)
    {
        base.gameWindowSizeChanged(oldBounds, newBounds);
        this.Reflow();
    }

    private void Reflow()
    {
        this.width = Math.Min(900, Math.Max(420, Game1.uiViewport.Width - 64));
        this.height = Math.Min(680, Math.Max(420, Game1.uiViewport.Height - 64));
        this.xPositionOnScreen = (Game1.uiViewport.Width - this.width) / 2;
        this.yPositionOnScreen = (Game1.uiViewport.Height - this.height) / 2;

        this.closeButton = new Rectangle(this.xPositionOnScreen + this.width - 68, this.yPositionOnScreen + 20, 42, 42);
        this.clearMemoryButton = new Rectangle(this.xPositionOnScreen + this.width - 204, this.yPositionOnScreen + 20, 126, 42);
        this.messagesArea = new Rectangle(this.xPositionOnScreen + 28, this.yPositionOnScreen + 86, this.width - 56, this.height - 186);
        this.sendButton = new Rectangle(this.xPositionOnScreen + this.width - 144, this.yPositionOnScreen + this.height - 76, 112, 52);
        this.scrollUpButton = new Rectangle(this.messagesArea.Right - 50, this.messagesArea.Y + 10, 40, 38);
        this.scrollDownButton = new Rectangle(this.messagesArea.Right - 50, this.messagesArea.Y + 54, 40, 38);

        this.inputBox = new TextBox(null, null, Game1.smallFont, Game1.textColor)
        {
            X = this.xPositionOnScreen + 34,
            Y = this.yPositionOnScreen + this.height - 75,
            Width = this.width - 196,
            Text = this.inputBox?.Text ?? ""
        };
    }

    private void DrawConversation(SpriteBatch b)
    {
        int availableWidth = this.messagesArea.Width - 88;
        int top = this.messagesArea.Y + 12;
        int bottom = this.messagesArea.Bottom - (string.IsNullOrEmpty(this.status) ? 16 : 54);
        int lineHeight = Game1.smallFont.LineSpacing + 4;
        int visibleLines = Math.Max(1, (bottom - top) / lineHeight);
        List<(string Text, Color Color)> lines = new();
        foreach (ChatMessage message in this.conversation)
        {
            if (message.Role == "system")
                continue;

            string prefix = message.Role == "assistant" ? $"{this.npc.displayName}: " : $"{Game1.player.displayName}: ";
            string text = Game1.parseText(prefix + message.Content, Game1.smallFont, availableWidth);
            Color color = message.Role == "assistant" ? Game1.textColor : new Color(35, 82, 117);
            foreach (string line in text.Replace("\r\n", "\n").Split('\n'))
                lines.Add((line, color));
            lines.Add(("", color));
        }

        int maxScroll = Math.Max(0, lines.Count - visibleLines);
        this.scrollLineOffset = Math.Min(this.scrollLineOffset, maxScroll);
        int end = Math.Max(0, lines.Count - this.scrollLineOffset);
        int start = Math.Max(0, end - visibleLines);
        int y = bottom - (end - start) * lineHeight;
        for (int i = start; i < end; i++)
        {
            Utility.drawTextWithShadow(b, lines[i].Text, Game1.smallFont, new Vector2(this.messagesArea.X + 16, y), lines[i].Color);
            y += lineHeight;
        }
    }

    private void ScrollConversation(int direction)
    {
        int top = this.messagesArea.Y + 12;
        int bottom = this.messagesArea.Bottom - (string.IsNullOrEmpty(this.status) ? 16 : 54);
        int pageLines = Math.Max(1, (bottom - top) / (Game1.smallFont.LineSpacing + 4) - 1);
        this.scrollLineOffset = Math.Max(0, this.scrollLineOffset + direction * pageLines);
        Game1.playSound("shwip");
    }

    private void DrawButton(SpriteBatch b, Rectangle bounds, string label)
    {
        IClickableMenu.drawTextureBox(b, Game1.menuTexture, new Rectangle(0, 256, 60, 60), bounds.X, bounds.Y, bounds.Width, bounds.Height, Color.White, 1f, false);
        Vector2 size = Game1.smallFont.MeasureString(label);
        Utility.drawTextWithShadow(b, label, Game1.smallFont, new Vector2(bounds.X + (bounds.Width - size.X) / 2f, bounds.Y + (bounds.Height - size.Y) / 2f), Game1.textColor);
    }

    private void SendCurrentText()
    {
        string text = this.inputBox.Text.Trim();
        if (this.waitingForReply || string.IsNullOrWhiteSpace(text))
            return;

        this.inputBox.Text = "";
        this.conversation.Add(new ChatMessage("user", text));
        this.scrollLineOffset = 0;
        this.SaveMemory();
        this.RequestAssistantReply(null, includeUserBubble: true);
        Game1.playSound("smallSelect");
    }

    private bool TryOpenMobileTextInput()
    {
        if (this.openingMobileInput)
            return true;

        Type? inputType = AppDomain.CurrentDomain.GetAssemblies()
            .Select(assembly => assembly.GetType("Microsoft.Xna.Framework.Input.KeyboardInput", throwOnError: false))
            .FirstOrDefault(type => type is not null);
        MethodInfo? showMethod = inputType?.GetMethods(BindingFlags.Public | BindingFlags.Static)
            .FirstOrDefault(method =>
            {
                ParameterInfo[] parameters = method.GetParameters();
                return method.Name == "Show"
                    && parameters.Length == 4
                    && parameters[0].ParameterType == typeof(string)
                    && parameters[1].ParameterType == typeof(string)
                    && parameters[2].ParameterType == typeof(string)
                    && parameters[3].ParameterType == typeof(bool);
            });
        if (showMethod is null)
            return false;

        this.openingMobileInput = true;
        string existingText = this.inputBox.Text;
        _ = Task.Run(async () =>
        {
            try
            {
                object? resultTaskObject = showMethod.Invoke(null, new object?[]
                {
                    $"{this.npc.displayName} - 聊天",
                    "输入你想说的话",
                    existingText,
                    false
                });
                if (resultTaskObject is not Task resultTask)
                    throw new InvalidOperationException("系统输入接口没有返回可等待的任务。");

                await resultTask.ConfigureAwait(false);
                string? enteredText = resultTask.GetType().GetProperty("Result")?.GetValue(resultTask) as string;
                this.completedRequests.Enqueue(() =>
                {
                    this.openingMobileInput = false;
                    if (enteredText is not null)
                        this.inputBox.Text = enteredText;
                });
            }
            catch (Exception ex)
            {
                this.monitor.Log($"Opening Android text input failed: {ex}", LogLevel.Error);
                this.completedRequests.Enqueue(() =>
                {
                    this.openingMobileInput = false;
                    this.status = "系统输入法打开失败，请查看 SMAPI 日志。";
                });
            }
        });

        return true;
    }

    private void RequestAssistantReply(string? invisibleInstruction, bool includeUserBubble)
    {
        this.waitingForReply = true;
        this.status = "正在等待回复...";
        List<ChatMessage> requestMessages = this.BuildRequestMessages(invisibleInstruction);
        int generation = this.conversationGeneration;

        _ = Task.Run(async () =>
        {
            try
            {
                string reply = await this.client.CompleteAsync(requestMessages, this.cancellationToken.Token);
                this.completedRequests.Enqueue(() =>
                {
                    if (!this.isClosed && generation == this.conversationGeneration)
                    {
                        this.conversation.Add(new ChatMessage("assistant", reply));
                        this.scrollLineOffset = 0;
                        this.status = "";
                        this.waitingForReply = false;
                        this.SaveMemory();
                        this.TryStartSummary();
                    }
                });
            }
            catch (OperationCanceledException)
            {
            }
            catch (Exception ex)
            {
                this.monitor.Log($"NPC CHAT API request failed: {ex}", LogLevel.Error);
                this.completedRequests.Enqueue(() =>
                {
                    if (generation == this.conversationGeneration)
                    {
                        this.status = $"请求失败：{ex.Message}";
                        this.waitingForReply = false;
                    }
                });
            }
        });
    }

    private List<ChatMessage> BuildRequestMessages(string? invisibleInstruction)
    {
        List<ChatMessage> messages = new()
        {
            new ChatMessage("system", this.BuildCharacterContext())
        };
        if (!string.IsNullOrWhiteSpace(this.memory.Summary))
            messages.Add(new ChatMessage("system", $"以下是你与玩家以前聊天的重要记忆摘要。自然运用这些记忆，不要复述摘要本身：\n{this.memory.Summary}"));

        int instructionSlots = invisibleInstruction is null ? 0 : 1;
        int remainingSlots = Math.Max(2, Math.Max(4, this.config.MaxHistoryMessages) - messages.Count - instructionSlots);
        messages.AddRange(this.conversation.TakeLast(remainingSlots).Select(CloneMessage));
        if (invisibleInstruction is not null)
            messages.Add(new ChatMessage("user", invisibleInstruction));

        return messages;
    }

    private string BuildCharacterContext()
    {
        StringBuilder text = new();
        text.Append($"你正在扮演星露谷物语中的 NPC {this.npc.displayName} ({this.npc.Name})。");
        text.Append($"身份背景：{this.profile.Identity} ");
        text.Append($"人格特征：{this.profile.Personality} ");
        text.Append($"说话风格：{this.profile.SpeechStyle} ");
        text.Append($"角色边界：{this.profile.Boundaries} ");
        text.Append($"你正在与玩家 {Game1.player.displayName} 交谈。");
        if (this.isRemoteChat)
            text.Append($"这是远程聊天，玩家目前位于 {Game1.currentLocation?.NameOrUniqueName ?? "未知地点"}，并没有站在你面前；不要描述面对面动作或假装两人处于同一地点。");
        else
            text.Append("这是当面交谈，玩家当前就在你附近。");
        text.Append($"当前时间背景：第 {Game1.year} 年 {Game1.currentSeason} 第 {Game1.dayOfMonth} 天，时间 {FormatTime(Game1.timeOfDay)}，天气 {GetWeatherDescription()}。");
        text.Append($"你当前所在地点是 {this.npc.currentLocation?.NameOrUniqueName ?? "未知地点"}。");

        if (Utility.isFestivalDay())
            text.Append("今天是节日，聊天可自然反映节日氛围。");
        if (this.npc.Birthday_Season == Game1.currentSeason && this.npc.Birthday_Day == Game1.dayOfMonth)
            text.Append("今天是你的生日。");

        if (Game1.player.friendshipData.TryGetValue(this.npc.Name, out Friendship? friendship))
        {
            int hearts = Math.Max(0, friendship.Points / 250);
            text.Append($"玩家与你的关系状态为 {DescribeRelationship(friendship)}，好感约 {hearts} 心（{friendship.Points} 点）。");
            text.Append($"本周玩家已向你送礼 {friendship.GiftsThisWeek} 次，今天已送礼 {friendship.GiftsToday} 次。");
        }
        else
            text.Append("玩家与你还不熟悉，请保持初识时的距离感。");

        text.Append($"请始终使用 {this.config.Language} 回复，回复自然、简短、有生活感；不要提及 AI、系统提示、数据值或游戏机制。");
        return text.ToString();
    }

    private void SaveMemory()
    {
        if (!this.config.EnableMemory)
            return;

        this.memory.Messages = this.conversation.Select(CloneMessage).ToList();
        this.memory.LastUpdatedUtcTicks = DateTime.UtcNow.Ticks;
        this.conversationStore.Save(this.memory);
    }

    private void TryStartSummary()
    {
        if (!this.config.EnableMemory || !this.config.EnableSummaries || this.summarizingMemory || this.isClosed)
            return;

        int recentMessagesToSend = Math.Max(4, this.config.MaxHistoryMessages - 2);
        int shouldBeSummarized = Math.Max(0, this.conversation.Count - recentMessagesToSend);
        if (shouldBeSummarized <= this.memory.SummarizedMessageCount)
            return;

        int targetCount = Math.Min(shouldBeSummarized, this.memory.SummarizedMessageCount + 12);
        List<ChatMessage> newMessages = this.conversation
            .Skip(this.memory.SummarizedMessageCount)
            .Take(targetCount - this.memory.SummarizedMessageCount)
            .Select(CloneMessage)
            .ToList();
        string transcript = string.Join("\n", newMessages.Select(message =>
            $"{(message.Role == "assistant" ? this.npc.displayName : Game1.player.displayName)}: {message.Content}"));
        string existingSummary = this.memory.Summary;
        List<ChatMessage> summaryRequest = new()
        {
            new ChatMessage("system", "你是对话记忆整理器。把对话压缩成供角色未来自然记起的简洁中文记忆，保留关系变化、偏好、约定、情绪和重要事实，不加入未发生事件。只输出摘要。"),
            new ChatMessage("user", $"已有摘要：\n{(string.IsNullOrWhiteSpace(existingSummary) ? "无" : existingSummary)}\n\n需要合并的新对话：\n{transcript}")
        };
        int generation = this.conversationGeneration;
        this.summarizingMemory = true;

        _ = Task.Run(async () =>
        {
            try
            {
                string updatedSummary = await this.client.CompleteAsync(summaryRequest, this.cancellationToken.Token);
                this.completedRequests.Enqueue(() =>
                {
                    if (!this.isClosed && generation == this.conversationGeneration)
                    {
                        this.memory.Summary = updatedSummary;
                        this.memory.SummarizedMessageCount = targetCount;
                        this.summarizingMemory = false;
                        this.SaveMemory();
                        this.TryStartSummary();
                    }
                });
            }
            catch (OperationCanceledException)
            {
            }
            catch (Exception ex)
            {
                this.monitor.Log($"NPC CHAT memory summary failed: {ex}", LogLevel.Warn);
                this.completedRequests.Enqueue(() => this.summarizingMemory = false);
            }
        });
    }

    private void ClearMemory()
    {
        this.conversationGeneration++;
        this.confirmingClearMemory = false;
        this.waitingForReply = false;
        this.summarizingMemory = false;
        this.memory = new ConversationRecord { NpcName = this.npc.Name };
        this.conversation.Clear();
        this.scrollLineOffset = 0;
        if (this.config.EnableMemory)
            this.conversationStore.Clear(this.npc.Name);

        this.status = "记忆已清除，请输入内容开始聊天";
        Game1.playSound("trashcan");
    }

    private static ChatMessage CloneMessage(ChatMessage message)
    {
        return new ChatMessage(message.Role, message.Content);
    }

    private static string FormatTime(int time)
    {
        int hours = time / 100;
        int minutes = time % 100;
        return $"{hours:00}:{minutes:00}";
    }

    private static string DescribeRelationship(Friendship friendship)
    {
        return friendship.Status switch
        {
            FriendshipStatus.Dating => "正在交往",
            FriendshipStatus.Engaged => "已经订婚",
            FriendshipStatus.Married => "已经结婚",
            FriendshipStatus.Divorced => "已经离婚",
            _ => "朋友"
        };
    }

    private static string GetWeatherDescription()
    {
        return Game1.weatherIcon switch
        {
            Game1.legacy_weather_rain => "下雨",
            Game1.legacy_weather_lightning => "雷雨",
            Game1.legacy_weather_snow => "下雪",
            Game1.legacy_weather_debris => "大风",
            Game1.legacy_weather_festival => "节日天气",
            Game1.legacy_weather_wedding => "婚礼日",
            _ => "晴朗"
        };
    }

    private void Close()
    {
        if (this.isClosed)
            return;

        this.isClosed = true;
        this.cancellationToken.Cancel();
        this.client.Dispose();
        this.inputBox.Selected = false;
        if (Game1.keyboardDispatcher.Subscriber == this.inputBox)
            Game1.keyboardDispatcher.Subscriber = null;
        Game1.closeTextEntry();
        Game1.activeClickableMenu = this.previousMenu;
    }
}
