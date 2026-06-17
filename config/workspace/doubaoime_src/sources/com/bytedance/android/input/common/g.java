package com.bytedance.android.input.common;

import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import com.bytedance.android.doubaoime.ImeService;
import com.bytedance.android.doubaoime.KeyboardJni;

/* loaded from: classes.dex */
public final class g {
    private static boolean a;

    public static final String a() {
        CharSequence charSequence;
        InputConnection currentInputConnection;
        ImeService service = KeyboardJni.getService();
        ExtractedText extractedText = (service == null || (currentInputConnection = service.getCurrentInputConnection()) == null) ? null : currentInputConnection.getExtractedText(new ExtractedTextRequest(), 0);
        if (extractedText == null || (charSequence = extractedText.text) == null) {
            return com.bytedance.android.input.m.a.c(true).a();
        }
        String obj = charSequence.toString();
        return obj.length() == 0 ? com.bytedance.android.input.m.a.c(true).a() : obj;
    }

    public static final String b() {
        EditorInfo currentInputEditorInfo;
        ImeService service = KeyboardJni.getService();
        String str = (service == null || (currentInputEditorInfo = service.getCurrentInputEditorInfo()) == null) ? null : currentInputEditorInfo.packageName;
        return str == null ? "" : str;
    }

    public static final CharSequence c() {
        InputConnection currentInputConnection;
        ImeService service = KeyboardJni.getService();
        CharSequence selectedText = (service == null || (currentInputConnection = service.getCurrentInputConnection()) == null) ? null : currentInputConnection.getSelectedText(0);
        return selectedText == null ? "" : selectedText;
    }

    public static final boolean d() {
        return a;
    }

    public static final void e(EditorInfo editorInfo) {
        a = false;
        if (editorInfo == null) {
            return;
        }
        a = KeyboardJni.getKeyboardJni().checkIsNumberInputBox(editorInfo);
    }
}
