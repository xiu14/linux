package com.bytedance.android.input.common.u;

import android.content.Context;
import android.content.SharedPreferences;
import android.provider.Settings;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodInfo;
import android.view.inputmethod.InputMethodManager;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.android.input.common.SettingsConfigNext;
import com.bytedance.android.input.r.j;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class c {
    private static boolean a = false;

    public static int a(InputConnection inputConnection) {
        if (inputConnection == null) {
            return -1;
        }
        ExtractedText extractedText = ((com.bytedance.android.input.editor.a) inputConnection).getExtractedText(new ExtractedTextRequest(), 0);
        if (extractedText == null) {
            return -1;
        }
        int i = extractedText.partialStartOffset;
        return i != -1 ? i + extractedText.selectionStart : extractedText.selectionStart;
    }

    public static int b(Context context) {
        return ((Integer) SettingsConfigNext.g(context.getString(C0838R.string.full_base_input_mode), -1)).intValue();
    }

    public static long c() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("/proc/meminfo"));
            String[] strArr = new String[2];
            for (int i = 0; i < 2; i++) {
                strArr[i] = bufferedReader.readLine();
            }
            bufferedReader.close();
            return Long.parseLong(strArr[0].replaceAll("\\D+", ""));
        } catch (IOException e2) {
            e2.printStackTrace();
            return 0L;
        }
    }

    public static String d(InputConnection inputConnection, int i) {
        CharSequence textAfterCursor = ((com.bytedance.android.input.editor.a) inputConnection).getTextAfterCursor(i, 0);
        String str = "";
        if (textAfterCursor != null) {
            if (textAfterCursor.length() == 2 && textAfterCursor.charAt(0) == '\n' && textAfterCursor.charAt(1) == '\n') {
                return "";
            }
            String charSequence = textAfterCursor.toString();
            if (charSequence != null && !charSequence.isEmpty()) {
                int length = charSequence.length();
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    }
                    int codePointAt = charSequence.codePointAt(i2);
                    if (!Character.isValidCodePoint(codePointAt)) {
                        j.r("InputMethodUtils", "getValidPrefix found invalid code point：" + codePointAt);
                        break;
                    }
                    if (codePointAt >= 55296 && codePointAt <= 57343) {
                        j.r("InputMethodUtils", "getValidPrefix found solo surrogate code point：" + codePointAt);
                        break;
                    }
                    i2 += Character.charCount(codePointAt);
                }
                if (i2 > 0) {
                    str = charSequence.substring(0, i2);
                }
            }
            j.i("InputMethodUtils", "getValidTextAfterCursor, maxLength = " + i + ", result = " + str);
        }
        return str;
    }

    public static String e(InputConnection inputConnection, final int i) {
        final CharSequence textBeforeCursor = ((com.bytedance.android.input.editor.a) inputConnection).getTextBeforeCursor(i, 0);
        final String str = "";
        if (textBeforeCursor != null) {
            final String charSequence = textBeforeCursor.toString();
            if (charSequence != null && !charSequence.isEmpty()) {
                int length = charSequence.length();
                int i2 = -1;
                while (true) {
                    if (length <= 0) {
                        break;
                    }
                    int codePointBefore = Character.codePointBefore(charSequence, length);
                    length -= Character.charCount(codePointBefore);
                    if (!Character.isValidCodePoint(codePointBefore)) {
                        j.r("InputMethodUtils", "buildValidStringFromEnd found invalid code point：" + codePointBefore);
                        break;
                    }
                    if (codePointBefore >= 55296 && codePointBefore <= 57343) {
                        j.r("InputMethodUtils", "buildValidStringFromEnd found solo surrogate code point：" + codePointBefore);
                        break;
                    }
                    i2 = length;
                }
                if (i2 != -1) {
                    str = charSequence.substring(i2);
                }
            }
            com.bytedance.android.input.basic.a.e.a("InputMethodUtils", new kotlin.s.b.a() { // from class: com.bytedance.android.input.common.u.a
                @Override // kotlin.s.b.a
                public final Object invoke() {
                    int i3 = i;
                    String str2 = str;
                    String str3 = charSequence;
                    CharSequence charSequence2 = textBeforeCursor;
                    StringBuilder P = e.a.a.a.a.P("getValidTextBeforeCursor, maxLength = ", i3, ", result=[", str2, "], rawStr=[");
                    P.append(str3);
                    P.append("] contextSequence=[");
                    P.append((Object) charSequence2);
                    P.append("]");
                    return P.toString();
                }
            });
        }
        return str;
    }

    public static boolean f() {
        IAppGlobals.a aVar = IAppGlobals.a;
        Objects.requireNonNull(aVar);
        if (aVar.F()) {
            return true;
        }
        String c2 = d.a.b.a.c(aVar);
        if (c2.equals("bd_alpha_test") || c2.equals("bd_alpha_test_debug") || c2.equals("bdtest")) {
            return i();
        }
        return true;
    }

    public static boolean g(Context context) {
        List<InputMethodInfo> enabledInputMethodList = ((InputMethodManager) context.getSystemService("input_method")).getEnabledInputMethodList();
        String c2 = e.a.a.a.a.c(context, new StringBuilder(), "/");
        Iterator<InputMethodInfo> it2 = enabledInputMethodList.iterator();
        while (it2.hasNext()) {
            if (it2.next().getId().startsWith(c2)) {
                return true;
            }
        }
        return false;
    }

    public static boolean h(Context context) {
        String c2 = e.a.a.a.a.c(context, new StringBuilder(), "/");
        String string = Settings.Secure.getString(context.getContentResolver(), "default_input_method");
        return string != null && string.startsWith(c2);
    }

    public static boolean i() {
        IAppGlobals.a aVar = IAppGlobals.a;
        Objects.requireNonNull(aVar);
        if (aVar.F()) {
            return true;
        }
        String c2 = d.a.b.a.c(aVar);
        if (!c2.equals("bd_alpha_test") && !c2.equals("bd_alpha_test_debug") && !c2.equals("bdtest")) {
            return true;
        }
        if (!a) {
            Objects.requireNonNull(aVar);
            Context context = aVar.getContext();
            Objects.requireNonNull(aVar);
            if (aVar.o().getBoolean(context.getString(C0838R.string.is_lark_sso_sucess), false)) {
                a = true;
            }
        }
        return a;
    }

    public static void j(boolean z) {
        a = z;
        IAppGlobals.a aVar = IAppGlobals.a;
        Objects.requireNonNull(aVar);
        Context context = aVar.getContext();
        Objects.requireNonNull(aVar);
        SharedPreferences.Editor edit = aVar.o().edit();
        edit.putBoolean(context.getString(C0838R.string.is_lark_sso_sucess), a);
        edit.apply();
    }
}
