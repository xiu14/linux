package com.bytedance.android.input.keyboard.aiwrite;

import android.view.inputmethod.InputConnectionExt;
import com.bytedance.android.doubaoime.KeyboardJni;

/* loaded from: classes.dex */
public final class V {
    private static boolean a;

    public static final void a(CharSequence charSequence, String str) {
        com.bytedance.android.input.r.j.i("InputConnectionExt", "commitText: text=" + ((Object) charSequence) + ", htmlText=" + str);
        InputConnectionExt d2 = d();
        if (d2 != null) {
            d2.commitText(charSequence, str);
        }
    }

    public static final void b(CharSequence charSequence, String str, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("commitText: text=");
        sb.append((Object) charSequence);
        sb.append(", htmlText=");
        sb.append(str);
        sb.append(", clearCache=");
        e.a.a.a.a.N0(sb, z, "InputConnectionExt");
        InputConnectionExt d2 = d();
        if (d2 != null) {
            d2.commitText(charSequence, str, z);
        }
    }

    public static final kotlin.o c(boolean z) {
        e.a.a.a.a.y0("finishAiWriting, aiPanelClosed=", z, "InputConnectionExt");
        InputConnectionExt d2 = d();
        if (d2 == null) {
            return null;
        }
        d2.finishAiWriting(z);
        return kotlin.o.a;
    }

    private static final InputConnectionExt d() {
        return KeyboardJni.getService().p();
    }

    public static final Boolean e(int i) {
        e.a.a.a.a.j0("highlightError: order=", i, "InputConnectionExt");
        InputConnectionExt d2 = d();
        if (d2 != null) {
            return Boolean.valueOf(d2.highlightError(i));
        }
        return null;
    }

    public static final boolean f() {
        return a;
    }

    public static final void g() {
        i(2);
        a = true;
    }

    public static final void h() {
        com.bytedance.android.input.r.j.i("InputConnectionExt", "onAiPanelClosed");
        InputConnectionExt d2 = d();
        if (d2 != null) {
            d2.onAiPanelClosed();
        }
    }

    public static final void i(int i) {
        e.a.a.a.a.j0("onAiPanelStarted, reason=", i, "InputConnectionExt");
        try {
            InputConnectionExt d2 = d();
            if (d2 != null) {
                d2.onAiPanelStarted(i);
            }
        } catch (NoSuchMethodError unused) {
        }
    }

    public static final void j() {
        a = false;
    }

    public static final void k(int[] iArr, int[] iArr2, String[] strArr) {
        com.bytedance.android.input.r.j.i("InputConnectionExt", "setErrors, starts=" + iArr + ", ends=" + iArr2 + ", corrections=" + strArr);
        InputConnectionExt d2 = d();
        if (d2 != null) {
            d2.setErrors(iArr, iArr2, strArr);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x003e, code lost:
    
        if (r2.startAiWriting(r8, r9, r10, r11, r12) == true) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Boolean l(boolean r8, android.view.inputmethod.InputConnectionExt.Callback r9, int r10, boolean r11, int r12) {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "startAiWriting: aiPanelStarted="
            r0.append(r1)
            r0.append(r8)
            java.lang.String r1 = ", callback="
            r0.append(r1)
            r0.append(r9)
            java.lang.String r1 = ", minLength="
            r0.append(r1)
            r0.append(r10)
            java.lang.String r1 = ", needAnimation="
            r0.append(r1)
            r0.append(r11)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "InputConnectionExt"
            com.bytedance.android.input.r.j.i(r1, r0)
            android.view.inputmethod.InputConnectionExt r2 = d()     // Catch: java.lang.NoSuchMethodError -> L41
            r0 = 1
            if (r2 == 0) goto L41
            r3 = r8
            r4 = r9
            r5 = r10
            r6 = r11
            r7 = r12
            boolean r8 = r2.startAiWriting(r3, r4, r5, r6, r7)     // Catch: java.lang.NoSuchMethodError -> L41
            if (r8 != r0) goto L41
            goto L42
        L41:
            r0 = 0
        L42:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r0)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.input.keyboard.aiwrite.V.l(boolean, android.view.inputmethod.InputConnectionExt$Callback, int, boolean, int):java.lang.Boolean");
    }
}
