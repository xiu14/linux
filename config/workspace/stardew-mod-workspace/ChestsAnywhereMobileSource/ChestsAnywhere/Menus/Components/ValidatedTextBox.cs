using System;
using System.Collections.Concurrent;
using System.Linq;
using System.Reflection;
using System.Text;
using System.Threading.Tasks;
using Microsoft.Xna.Framework;
using Microsoft.Xna.Framework.Graphics;
using Microsoft.Xna.Framework.Input;
using StardewModdingAPI;
using StardewValley;
using StardewValley.Menus;

namespace Pathoschild.Stardew.ChestsAnywhere.Menus.Components;

/// <summary>A textbox control which only allows valid characters.</summary>
internal class ValidatedTextBox : IKeyboardSubscriber
{
    /*********
    ** Fields
    *********/
    /// <summary>The underlying textbox.</summary>
    private readonly TextBox Textbox;

    /// <summary>A lambda which returns an error message for the text value (if applicable).</summary>
    private readonly Func<char, bool> Validator;

    /// <summary>Completed Android input changes waiting for the game thread.</summary>
    private readonly ConcurrentQueue<Action> CompletedMobileInputs = new();

    /// <summary>Whether Android's native text input is already being shown for this field.</summary>
    private bool IsOpeningMobileInput;

    /*********
    ** Accessors
    *********/
    /// <summary>The input text.</summary>
    public string Text
    {
        get => this.Textbox.Text;
        set => this.Textbox.Text = value;
    }

    /// <summary>Whether the focus is in the textbox.</summary>
    public bool Selected
    {
        get => this.Textbox.Selected;
        set => this.Textbox.Selected = value;
    }

    /// <summary>The X position of the rendered textbox.</summary>
    public int X
    {
        get => this.Textbox.X;
        set => this.Textbox.X = value;
    }

    /// <summary>The Y position of the rendered textbox.</summary>
    public int Y
    {
        get => this.Textbox.Y;
        set => this.Textbox.Y = value;
    }

    /// <summary>The width of the rendered textbox.</summary>
    public int Width
    {
        get => this.Textbox.Width;
        set => this.Textbox.Width = value;
    }

    /// <summary>The height of the rendered textbox.</summary>
    public int Height
    {
        get => this.Textbox.Height;
        set => this.Textbox.Height = value;
    }


    /*********
    ** Public methods
    *********/
    /// <summary>Construct an instance.</summary>
    /// <param name="font">The text font.</param>
    /// <param name="textColor">The text color.</param>
    /// <param name="validate">A lambda which indicates whether the specified character is allowed.</param>
    public ValidatedTextBox(SpriteFont font, Color textColor, Func<char, bool> validate)
    {
        this.Validator = validate;
        this.Textbox = new TextBox(Sprites.Textbox.Sheet, null, font, textColor)
        {
            limitWidth = false
        };
    }

    /// <summary>Set the input focus to this control.</summary>
    public void Select()
    {
        this.Textbox.Selected = true;
        if (Constants.TargetPlatform != GamePlatform.Android || !this.TryOpenMobileTextInput())
            Game1.keyboardDispatcher.Subscriber = this;
    }

    /// <summary>Receive input from the user.</summary>
    /// <param name="inputChar">The input character.</param>
    public void RecieveTextInput(char inputChar)
    {
        if (this.Validator(inputChar))
            this.Textbox.RecieveTextInput(inputChar);
    }

    /// <summary>Receive input from the user.</summary>
    /// <param name="text">The input text.</param>
    public void RecieveTextInput(string text)
    {
        StringBuilder builder = new StringBuilder(text.Length);
        foreach (char ch in text)
        {
            if (this.Validator(ch))
                builder.Append(ch);
        }
        this.Textbox.RecieveTextInput(builder.ToString());
    }

    /// <summary>Receive input from the user.</summary>
    /// <param name="command">The input command.</param>
    public void RecieveCommandInput(char command)
    {
        this.Textbox.RecieveCommandInput(command);
    }

    /// <summary>Receive input from the user.</summary>
    /// <param name="key">The input key.</param>
    public void RecieveSpecialInput(Keys key)
    {
        this.Textbox.RecieveSpecialInput(key);
    }

    /// <summary>Get the textbox's bounds on the screen.</summary>
    public Rectangle GetBounds()
    {
        return new Rectangle(this.Textbox.X, this.Textbox.Y, this.Textbox.Width, this.Textbox.Height);
    }

    /// <summary>Draw the textbox.</summary>
    /// <param name="batch">The sprite batch.</param>
    public void Draw(SpriteBatch batch)
    {
        while (this.CompletedMobileInputs.TryDequeue(out Action? action))
            action();

        this.Textbox.Draw(batch);
    }

    /// <summary>Try to show Android's native text entry dialog for Chinese and other IME input.</summary>
    private bool TryOpenMobileTextInput()
    {
        if (this.IsOpeningMobileInput)
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

        this.IsOpeningMobileInput = true;
        _ = Task.Run(async () =>
        {
            try
            {
                object? taskObject = showMethod.Invoke(null, new object?[] { "箱子", "输入文字", this.Text, false });
                if (taskObject is not Task task)
                    throw new InvalidOperationException("Android input dialog didn't return a task.");

                await task.ConfigureAwait(false);
                string? entered = task.GetType().GetProperty("Result")?.GetValue(task) as string;
                this.CompletedMobileInputs.Enqueue(() =>
                {
                    this.IsOpeningMobileInput = false;
                    if (entered is not null)
                        this.Text = new string(entered.Where(this.Validator).ToArray());
                });
            }
            catch
            {
                this.CompletedMobileInputs.Enqueue(() =>
                {
                    this.IsOpeningMobileInput = false;
                    Game1.addHUDMessage(new HUDMessage("无法打开系统输入法"));
                });
            }
        });
        return true;
    }
}
