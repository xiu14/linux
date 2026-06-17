using System.Text.RegularExpressions;
using StardewValley;

namespace Libala.CompanionGuide;

internal sealed class CompanionLoanController
{
    private const string DebtKey = "libala.CompanionGuide/loan-debt";
    private const string DeclineKey = "libala.CompanionGuide/loan-declines";
    private const int MaximumLoan = 2000;
    private const int ProtectedGold = 500;
    private const int MaximumDeclines = 3;
    private bool continuingSleep;

    public string GetSummary()
    {
        int debt = this.GetDebt();
        if (debt <= 0)
            return "";

        int declines = this.GetDeclines();
        return declines > 0
            ? $"欠款：{debt:N0} 金（延期 {declines}/{MaximumDeclines} 天）"
            : $"欠款：{debt:N0} 金";
    }

    public bool TryCreateOffer(string text, out CompanionLoanOffer? offer, out string reply)
    {
        offer = null;
        reply = "";
        string compact = text.Replace(" ", "").Replace("\r", "").Replace("\n", "");
        Match match = Regex.Match(compact, @"借(?:给)?我(?:先)?(?<amount>[0-9]+|[零〇一二两三四五六七八九十百千]+)(?:个)?(?:金币|金)");
        if (!match.Success)
            return false;

        int existingDebt = this.GetDebt();
        if (existingDebt > 0)
        {
            reply = $"你还欠我 {existingDebt:N0} 金呢。先把上一次的还清，我们再商量。";
            return true;
        }

        int requestedAmount = Math.Max(1, ParseQuantity(match.Groups["amount"].Value));
        int amount = Math.Min(MaximumLoan, requestedAmount);
        offer = new CompanionLoanOffer(amount);
        reply = requestedAmount > MaximumLoan
            ? $"我一次最多先借你 {MaximumLoan:N0} 金。按这个数给你，可以吗？"
            : $"我可以先借你 {amount:N0} 金。等你手头宽裕些，睡前再还我，可以吗？";
        return true;
    }

    public string Accept(CompanionLoanOffer offer)
    {
        int existingDebt = this.GetDebt();
        if (existingDebt > 0)
            return $"你还欠我 {existingDebt:N0} 金，暂时不能再借了。";

        Game1.player.Money += offer.Amount;
        this.SetDebt(offer.Amount);
        this.SetDeclines(0);
        Game1.playSound("purchase");
        return $"给你先垫上 {offer.Amount:N0} 金。别慌着还，先把眼前的事办好。";
    }

    public bool TryInterceptSleep(GameLocation location)
    {
        if (this.continuingSleep)
        {
            this.continuingSleep = false;
            return false;
        }

        int debt = this.GetDebt();
        int repayment = Math.Min(debt, Math.Max(0, Game1.player.Money - ProtectedGold));
        if (debt <= 0 || repayment <= 0)
            return false;

        int declines = this.GetDeclines();
        string question = declines >= MaximumDeclines - 1
            ? $"你还欠小豪 {debt:N0} 金。今晚可偿还 {repayment:N0} 金；这是第三次询问，再延期也会自动偿还。"
            : $"你还欠小豪 {debt:N0} 金。现在金币超过 {ProtectedGold}，今晚先偿还 {repayment:N0} 金吗？";
        Response[] choices =
        {
            new("Repay", "偿还"),
            new("Delay", "暂不偿还")
        };
        location.createQuestionDialogue(question, choices, (_, answer) => this.HandleRepaymentAnswer(location, answer));
        return true;
    }

    private void HandleRepaymentAnswer(GameLocation location, string answer)
    {
        if (answer == "Repay")
        {
            int paid = this.PayAvailableAmount();
            Game1.addHUDMessage(HUDMessage.ForCornerTextbox($"已偿还小豪 {paid:N0} 金"));
        }
        else
        {
            int declines = this.GetDeclines() + 1;
            if (declines >= MaximumDeclines)
            {
                int paid = this.PayAvailableAmount();
                Game1.addHUDMessage(HUDMessage.ForCornerTextbox($"已经延期三次，自动偿还小豪 {paid:N0} 金"));
            }
            else
            {
                this.SetDeclines(declines);
                Game1.addHUDMessage(HUDMessage.ForCornerTextbox($"本次暂不偿还，还可延期 {MaximumDeclines - declines} 次"));
            }
        }

        this.continuingSleep = true;
        location.answerDialogueAction("Sleep_Yes", Array.Empty<string>());
    }

    private int PayAvailableAmount()
    {
        int debt = this.GetDebt();
        int amount = Math.Min(debt, Math.Max(0, Game1.player.Money - ProtectedGold));
        if (amount <= 0)
            return 0;

        Game1.player.Money -= amount;
        this.SetDebt(debt - amount);
        this.SetDeclines(0);
        return amount;
    }

    private int GetDebt()
    {
        return ReadData(DebtKey);
    }

    private int GetDeclines()
    {
        return ReadData(DeclineKey);
    }

    private void SetDebt(int amount)
    {
        WriteData(DebtKey, amount);
    }

    private void SetDeclines(int amount)
    {
        WriteData(DeclineKey, amount);
    }

    private static int ReadData(string key)
    {
        return Game1.player?.modData.TryGetValue(key, out string? raw) == true && int.TryParse(raw, out int value)
            ? Math.Max(0, value)
            : 0;
    }

    private static void WriteData(string key, int value)
    {
        if (value <= 0)
            Game1.player.modData.Remove(key);
        else
            Game1.player.modData[key] = value.ToString();
    }

    private static int ParseQuantity(string value)
    {
        if (int.TryParse(value, out int numeric))
            return numeric;

        Dictionary<char, int> digits = new()
        {
            ['零'] = 0, ['〇'] = 0, ['一'] = 1, ['二'] = 2, ['两'] = 2, ['三'] = 3,
            ['四'] = 4, ['五'] = 5, ['六'] = 6, ['七'] = 7, ['八'] = 8, ['九'] = 9
        };
        int total = 0;
        int current = 0;
        foreach (char character in value)
        {
            if (digits.TryGetValue(character, out int digit))
            {
                current = digit;
                continue;
            }

            int unit = character switch { '十' => 10, '百' => 100, '千' => 1000, _ => 0 };
            if (unit > 0)
            {
                total += (current == 0 ? 1 : current) * unit;
                current = 0;
            }
        }

        return Math.Max(1, total + current);
    }
}

internal sealed record CompanionLoanOffer(int Amount);
