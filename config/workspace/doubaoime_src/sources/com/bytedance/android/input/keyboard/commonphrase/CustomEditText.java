package com.bytedance.android.input.keyboard.commonphrase;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.EditText;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bytedance.android.doubaoime.KeyboardJni;
import com.bytedance.android.input.keyboard.commonphrase.CustomEditText;
import com.bytedance.android.input.speech.AsrManager;

@SuppressLint({"AppCompatCustomView"})
/* loaded from: classes.dex */
public final class CustomEditText extends EditText {
    private final String a;
    private InputConnection b;

    /* renamed from: c, reason: collision with root package name */
    private final Handler f2685c;

    /* JADX INFO: Access modifiers changed from: private */
    final class a extends InputConnectionWrapper {
        private boolean a;
        final /* synthetic */ CustomEditText b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(CustomEditText customEditText, InputConnection inputConnection, boolean z) {
            super(inputConnection, z);
            kotlin.s.c.l.f(inputConnection, TypedValues.AttributesType.S_TARGET);
            this.b = customEditText;
        }

        public static void b(a aVar, CharSequence charSequence, int i) {
            kotlin.s.c.l.f(aVar, "this$0");
            super.commitText(charSequence, i);
        }

        public final boolean a() {
            return this.a;
        }

        public final void c(boolean z) {
            this.a = z;
        }

        @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
        public boolean commitText(final CharSequence charSequence, final int i) {
            com.bytedance.android.input.r.j.i(this.b.a, "commitText : " + ((Object) charSequence) + ", " + i);
            this.a = true;
            if (kotlin.s.c.l.a(Looper.myLooper(), Looper.getMainLooper())) {
                return super.commitText(charSequence, i);
            }
            com.bytedance.android.input.r.j.j(this.b.a, "commitText is not in main thread");
            this.b.f2685c.post(new Runnable() { // from class: com.bytedance.android.input.keyboard.commonphrase.i
                @Override // java.lang.Runnable
                public final void run() {
                    CustomEditText.a.b(CustomEditText.a.this, charSequence, i);
                }
            });
            return true;
        }

        @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
        public boolean deleteSurroundingText(int i, int i2) {
            com.bytedance.android.input.r.j.m(this.b.a, "deleteSurroundingText : " + i + ", " + i2);
            this.a = true;
            return super.deleteSurroundingText(i, i2);
        }

        @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
        public boolean deleteSurroundingTextInCodePoints(int i, int i2) {
            this.a = true;
            com.bytedance.android.input.r.j.m(this.b.a, "deleteSurroundingTextInCodePoints : " + i + ", " + i2);
            return super.deleteSurroundingTextInCodePoints(i, i2);
        }

        @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
        public boolean sendKeyEvent(KeyEvent keyEvent) {
            com.bytedance.android.input.r.j.i(this.b.a, "sendKeyEvent : " + keyEvent);
            this.a = true;
            boolean z = false;
            if (keyEvent != null && keyEvent.getKeyCode() == 67) {
                CustomEditText.d(this.b);
                return true;
            }
            if (keyEvent != null && keyEvent.getKeyCode() == 66) {
                z = true;
            }
            if (!z) {
                return super.sendKeyEvent(keyEvent);
            }
            CustomEditText.c(this.b);
            return true;
        }

        @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
        public boolean setComposingText(CharSequence charSequence, int i) {
            this.a = true;
            return super.setComposingText(charSequence, i);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CustomEditText(Context context) {
        this(context, null, 0);
        kotlin.s.c.l.f(context, "context");
    }

    public static final void c(CustomEditText customEditText) {
        int selectionStart = customEditText.getSelectionStart();
        Editable text = customEditText.getText();
        com.bytedance.android.input.r.j.m(customEditText.a, "handleEnterKeyPressed start = " + selectionStart + ", editable = " + ((Object) text));
        text.insert(selectionStart, "\n");
    }

    public static final void d(CustomEditText customEditText) {
        com.bytedance.android.input.r.j.i(customEditText.a, "onDeleteKeyPressed");
        InputConnection inputConnection = customEditText.b;
        if (inputConnection != null) {
            inputConnection.deleteSurroundingTextInCodePoints(1, 0);
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        requestFocus();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        kotlin.s.c.l.f(editorInfo, "outAttrs");
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        com.bytedance.android.input.r.j.i(this.a, "onCreateInputConnection : " + onCreateInputConnection);
        kotlin.s.c.l.e(onCreateInputConnection, "onCreateInputConnection");
        a aVar = new a(this, onCreateInputConnection, true);
        this.b = aVar;
        return aVar;
    }

    @Override // android.widget.TextView
    protected void onSelectionChanged(int i, int i2) {
        a aVar;
        com.bytedance.android.input.r.j.m(this.a, "onSelectionChanged : " + i + ", " + i2);
        InputConnection inputConnection = this.b;
        if (inputConnection != null) {
            aVar = (a) inputConnection;
            if ((aVar == null || aVar.a()) ? false : true) {
                AsrManager.a.p0(true, "");
            }
        } else {
            aVar = null;
        }
        super.onSelectionChanged(i, i2);
        KeyboardJni.getKeyboardJni().postPostUpdateSelectionEvent();
        if (aVar == null) {
            return;
        }
        aVar.c(false);
    }

    @Override // android.widget.TextView, android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            requestFocus();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CustomEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.s.c.l.f(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.s.c.l.f(context, "context");
        this.a = "CustomEditText";
        this.f2685c = new Handler(Looper.getMainLooper());
    }
}
