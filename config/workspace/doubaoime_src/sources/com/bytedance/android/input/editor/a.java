package com.bytedance.android.input.editor;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.UnderlineSpan;
import android.view.KeyEvent;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.android.input.common.g;
import com.bytedance.android.input.common.u.c;
import com.bytedance.android.input.popup.q;
import com.bytedance.android.input.r.j;
import com.bytedance.android.input.speech.D;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public class a implements InputConnection {
    protected InputConnection a;
    protected SelectionTracker b;

    /* renamed from: c, reason: collision with root package name */
    private final ExecutorService f2291c = Executors.newSingleThreadExecutor();

    public a() {
        new Handler(Looper.getMainLooper());
    }

    private CharSequence e(CharSequence charSequence, boolean z) {
        if (!g.b().equals("com.tencent.tmgp.sgame") || charSequence.length() <= 0) {
            return charSequence;
        }
        SpannableString spannableString = new SpannableString(charSequence);
        if (z) {
            spannableString.setSpan(new UnderlineSpan(), 0, charSequence.length(), 33);
        }
        spannableString.setSpan(new AbsoluteSizeSpan(16, true), 0, charSequence.length(), 33);
        return spannableString;
    }

    public boolean a(CharSequence charSequence, int i) {
        SelectionTracker selectionTracker = this.b;
        if (selectionTracker != null) {
            selectionTracker.c(charSequence, i);
        }
        InputConnection inputConnection = this.a;
        return inputConnection != null && inputConnection.commitText(e(charSequence, false), i);
    }

    public boolean b(CharSequence charSequence, int i) {
        SelectionTracker selectionTracker = this.b;
        if (selectionTracker != null) {
            selectionTracker.e(charSequence, i);
        }
        IAppGlobals.a aVar = IAppGlobals.a;
        Objects.requireNonNull(aVar);
        aVar.j("Asr-Flow-commitVoiceText", "newCursorPosition = " + i + ", commitVoiceText = " + ((Object) charSequence));
        InputConnection inputConnection = this.a;
        boolean z = false;
        if (inputConnection != null && inputConnection.commitText(e(charSequence, false), i)) {
            z = true;
        }
        q.f().k();
        D.a();
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean beginBatchEdit() {
        InputConnection inputConnection = this.a;
        return inputConnection != null && inputConnection.beginBatchEdit();
    }

    public boolean c() {
        SelectionTracker selectionTracker = this.b;
        if (selectionTracker != null) {
            selectionTracker.h();
        }
        InputConnection inputConnection = this.a;
        boolean z = inputConnection != null && inputConnection.finishComposingText();
        D.a();
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean clearMetaKeyStates(int i) {
        InputConnection inputConnection = this.a;
        return inputConnection != null && inputConnection.clearMetaKeyStates(i);
    }

    @Override // android.view.inputmethod.InputConnection
    public void closeConnection() {
        InputConnection inputConnection = this.a;
        if (inputConnection != null) {
            inputConnection.closeConnection();
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitCompletion(CompletionInfo completionInfo) {
        InputConnection inputConnection = this.a;
        return inputConnection != null && inputConnection.commitCompletion(completionInfo);
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitContent(@NonNull InputContentInfo inputContentInfo, int i, @Nullable Bundle bundle) {
        InputConnection inputConnection = this.a;
        return inputConnection != null && inputConnection.commitContent(inputContentInfo, i, bundle);
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitCorrection(CorrectionInfo correctionInfo) {
        InputConnection inputConnection = this.a;
        return inputConnection != null && inputConnection.commitCorrection(correctionInfo);
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitText(CharSequence charSequence, int i) {
        SelectionTracker selectionTracker = this.b;
        if (selectionTracker != null) {
            selectionTracker.d(charSequence, i);
        }
        InputConnection inputConnection = this.a;
        boolean z = false;
        if (inputConnection != null && inputConnection.commitText(e(charSequence, false), i)) {
            z = true;
        }
        q.f().k();
        return z;
    }

    public int d() {
        return this.b.m() != -1 ? this.b.m() : c.a(this);
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int i, int i2) {
        SelectionTracker selectionTracker = this.b;
        if (selectionTracker != null) {
            selectionTracker.f(i, i2);
        }
        InputConnection inputConnection = this.a;
        return inputConnection != null && inputConnection.deleteSurroundingText(i, i2);
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean endBatchEdit() {
        InputConnection inputConnection = this.a;
        return inputConnection != null && inputConnection.endBatchEdit();
    }

    public void f(SelectionTracker selectionTracker) {
        this.b = selectionTracker;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean finishComposingText() {
        SelectionTracker selectionTracker = this.b;
        if (selectionTracker != null) {
            selectionTracker.g();
        }
        InputConnection inputConnection = this.a;
        return inputConnection != null && inputConnection.finishComposingText();
    }

    public boolean g(CharSequence charSequence, int i) {
        SelectionTracker selectionTracker = this.b;
        if (selectionTracker != null) {
            selectionTracker.u(charSequence, i);
        }
        InputConnection inputConnection = this.a;
        boolean z = false;
        if (inputConnection != null && inputConnection.setComposingText(e(charSequence, false), i)) {
            z = true;
        }
        q.f().k();
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public int getCursorCapsMode(int i) {
        InputConnection inputConnection = this.a;
        if (inputConnection != null) {
            return inputConnection.getCursorCapsMode(i);
        }
        return 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i) {
        InputConnection inputConnection = this.a;
        if (inputConnection != null) {
            return inputConnection.getExtractedText(extractedTextRequest, i);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public Handler getHandler() {
        InputConnection inputConnection = this.a;
        if (inputConnection == null) {
            return null;
        }
        inputConnection.getHandler();
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public CharSequence getSelectedText(int i) {
        j.i("InputConnectionWrapper", "getSelectedText");
        InputConnection inputConnection = this.a;
        if (inputConnection != null) {
            return inputConnection.getSelectedText(i);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public CharSequence getTextAfterCursor(int i, int i2) {
        e.a.a.a.a.j0("getTextAfterCursor, maxLength = ", i, "InputConnectionWrapper");
        InputConnection inputConnection = this.a;
        if (inputConnection != null) {
            return inputConnection.getTextAfterCursor(i, i2);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public CharSequence getTextBeforeCursor(int i, int i2) {
        e.a.a.a.a.j0("getTextBeforeCursor, maxLength = ", i, "InputConnectionWrapper");
        InputConnection inputConnection = this.a;
        if (inputConnection != null) {
            return inputConnection.getTextBeforeCursor(i, i2);
        }
        return null;
    }

    public a h(InputConnection inputConnection) {
        if (this.a != inputConnection && !(inputConnection instanceof a)) {
            this.a = inputConnection;
        }
        return this;
    }

    public void i(int i, int i2, int i3, int i4, int i5, int i6) {
        SelectionTracker selectionTracker = this.b;
        if (selectionTracker != null) {
            selectionTracker.v(i, i2, i3, i4, i5, i6);
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performContextMenuAction(int i) {
        InputConnection inputConnection = this.a;
        return inputConnection != null && inputConnection.performContextMenuAction(i);
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performEditorAction(int i) {
        InputConnection inputConnection = this.a;
        return inputConnection != null && inputConnection.performEditorAction(i);
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performPrivateCommand(String str, Bundle bundle) {
        InputConnection inputConnection = this.a;
        return inputConnection != null && inputConnection.performPrivateCommand(str, bundle);
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean reportFullscreenMode(boolean z) {
        InputConnection inputConnection = this.a;
        return inputConnection != null && inputConnection.reportFullscreenMode(z);
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean requestCursorUpdates(int i) {
        InputConnection inputConnection = this.a;
        return inputConnection != null && inputConnection.requestCursorUpdates(i);
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean sendKeyEvent(KeyEvent keyEvent) {
        SelectionTracker selectionTracker = this.b;
        if (selectionTracker != null) {
            selectionTracker.q(keyEvent);
        }
        InputConnection inputConnection = this.a;
        return inputConnection != null && inputConnection.sendKeyEvent(keyEvent);
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setComposingRegion(int i, int i2) {
        SelectionTracker selectionTracker = this.b;
        if (selectionTracker != null) {
            selectionTracker.r(i, i2);
        }
        InputConnection inputConnection = this.a;
        return inputConnection != null && inputConnection.setComposingRegion(i, i2);
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setComposingText(CharSequence charSequence, int i) {
        SelectionTracker selectionTracker = this.b;
        if (selectionTracker != null) {
            selectionTracker.s(charSequence, i);
        }
        InputConnection inputConnection = this.a;
        boolean z = inputConnection != null && inputConnection.setComposingText(e(charSequence, true), i);
        q.f().k();
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setSelection(int i, int i2) {
        SelectionTracker selectionTracker = this.b;
        if (selectionTracker != null) {
            selectionTracker.t(i, i2);
        }
        InputConnection inputConnection = this.a;
        return inputConnection != null && inputConnection.setSelection(i, i2);
    }
}
