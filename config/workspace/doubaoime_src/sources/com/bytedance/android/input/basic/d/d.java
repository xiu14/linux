package com.bytedance.android.input.basic.d;

import android.annotation.TargetApi;
import android.app.Activity;
import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public final class d {
    @TargetApi(16)
    private static final void a(Window window, View view, int i) {
        if (view != null) {
            int i2 = Build.VERSION.SDK_INT;
            if (c(window)) {
                window.clearFlags(1024);
            }
            int systemUiVisibility = view.getSystemUiVisibility();
            if (i2 >= 28) {
                WindowManager.LayoutParams attributes = window.getAttributes();
                l.e(attributes, "window.attributes");
                attributes.layoutInDisplayCutoutMode = 1;
                window.setAttributes(attributes);
            }
            int i3 = i != 0 ? 5124 | i : 5124;
            if (systemUiVisibility != i3) {
                view.setSystemUiVisibility(i3);
            }
        }
    }

    public static final void b(Activity activity) {
        Window window = activity.getWindow();
        if (window == null) {
            return;
        }
        a(window, window.getDecorView(), 514);
    }

    public static final boolean c(Window window) {
        return window.getAttributes() != null && (window.getAttributes().flags & 1024) == 1024;
    }

    public static final void d(Activity activity, boolean z) {
        Window window = activity.getWindow();
        if (window == null) {
            return;
        }
        WindowInsetsControllerCompat insetsController = WindowCompat.getInsetsController(window, window.getDecorView());
        l.e(insetsController, "getInsetsController(window, window.decorView)");
        boolean z2 = !z;
        insetsController.setAppearanceLightNavigationBars(z2);
        insetsController.setAppearanceLightStatusBars(z2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ab, code lost:
    
        if (kotlin.text.a.d(r2, "flyme", false, 2, null) != false) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e(android.app.Activity r9) {
        /*
            if (r9 == 0) goto Lf5
            android.view.Window r0 = r9.getWindow()
            android.view.View r0 = r0.getDecorView()
            r1 = 0
            if (r0 != 0) goto Lf
            goto Le4
        Lf:
            android.view.Window r0 = r9.getWindow()
            android.view.View r0 = r0.getDecorView()
            r2 = 9216(0x2400, float:1.2914E-41)
            if (r0 != 0) goto L1c
            goto L29
        L1c:
            int r3 = r0.getSystemUiVisibility()
            r4 = r3 & 9216(0x2400, float:1.2914E-41)
            if (r4 != r2) goto L25
            goto L29
        L25:
            r3 = r3 | r2
            r0.setSystemUiVisibility(r3)
        L29:
            r0 = 2
            r3 = 1
            android.view.Window r4 = r9.getWindow()     // Catch: java.lang.Throwable -> L86
            if (r4 == 0) goto L86
            boolean r5 = com.bytedance.android.input.basic.d.g.b()     // Catch: java.lang.Throwable -> L86
            if (r5 == 0) goto L86
            java.lang.Class r4 = r4.getClass()     // Catch: java.lang.Throwable -> L86
            java.lang.String r5 = "android.view.MiuiWindowManager$LayoutParams"
            java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch: java.lang.Throwable -> L86
            java.lang.String r6 = "EXTRA_FLAG_STATUS_BAR_DARK_MODE"
            java.lang.reflect.Field r6 = r5.getField(r6)     // Catch: java.lang.Throwable -> L86
            int r5 = r6.getInt(r5)     // Catch: java.lang.Throwable -> L86
            java.lang.String r6 = "setExtraFlags"
            java.lang.Class[] r7 = new java.lang.Class[r0]     // Catch: java.lang.Throwable -> L86
            java.lang.Class r8 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L86
            r7[r1] = r8     // Catch: java.lang.Throwable -> L86
            r7[r3] = r8     // Catch: java.lang.Throwable -> L86
            java.lang.reflect.Method r4 = r4.getMethod(r6, r7)     // Catch: java.lang.Throwable -> L86
            android.view.Window r6 = r9.getWindow()     // Catch: java.lang.Throwable -> L86
            java.lang.Object[] r7 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L86
            java.lang.Integer r8 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L86
            r7[r1] = r8     // Catch: java.lang.Throwable -> L86
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L86
            r7[r3] = r5     // Catch: java.lang.Throwable -> L86
            r4.invoke(r6, r7)     // Catch: java.lang.Throwable -> L86
            android.view.Window r4 = r9.getWindow()     // Catch: java.lang.Throwable -> L86
            android.view.View r4 = r4.getDecorView()     // Catch: java.lang.Throwable -> L86
            if (r4 != 0) goto L79
            goto L86
        L79:
            int r5 = r4.getSystemUiVisibility()     // Catch: java.lang.Throwable -> L86
            r6 = r5 & 9216(0x2400, float:1.2914E-41)
            if (r6 != r2) goto L82
            goto L86
        L82:
            r2 = r2 | r5
            r4.setSystemUiVisibility(r2)     // Catch: java.lang.Throwable -> L86
        L86:
            java.lang.String r2 = android.os.Build.USER
            java.lang.String r4 = "flyme"
            boolean r2 = kotlin.text.a.i(r4, r2, r3)
            r5 = 0
            if (r2 != 0) goto Lb0
            java.lang.String r2 = android.os.Build.DISPLAY
            boolean r6 = android.text.TextUtils.isEmpty(r2)
            if (r6 != 0) goto Lae
            java.lang.String r6 = "DISPLAY"
            kotlin.s.c.l.e(r2, r6)
            java.lang.String r2 = r2.toLowerCase()
            java.lang.String r6 = "this as java.lang.String).toLowerCase()"
            kotlin.s.c.l.e(r2, r6)
            boolean r0 = kotlin.text.a.d(r2, r4, r1, r0, r5)
            if (r0 == 0) goto Lae
            goto Lb0
        Lae:
            r0 = r1
            goto Lb1
        Lb0:
            r0 = r3
        Lb1:
            if (r0 == 0) goto Le4
            android.view.Window r0 = r9.getWindow()     // Catch: java.lang.Throwable -> Le4
            android.view.WindowManager$LayoutParams r0 = r0.getAttributes()     // Catch: java.lang.Throwable -> Le4
            java.lang.Class<android.view.WindowManager$LayoutParams> r2 = android.view.WindowManager.LayoutParams.class
            java.lang.String r4 = "MEIZU_FLAG_DARK_STATUS_BAR_ICON"
            java.lang.reflect.Field r2 = r2.getDeclaredField(r4)     // Catch: java.lang.Throwable -> Le4
            java.lang.Class<android.view.WindowManager$LayoutParams> r4 = android.view.WindowManager.LayoutParams.class
            java.lang.String r6 = "meizuFlags"
            java.lang.reflect.Field r4 = r4.getDeclaredField(r6)     // Catch: java.lang.Throwable -> Le4
            r2.setAccessible(r3)     // Catch: java.lang.Throwable -> Le4
            r4.setAccessible(r3)     // Catch: java.lang.Throwable -> Le4
            int r2 = r2.getInt(r5)     // Catch: java.lang.Throwable -> Le4
            int r3 = r4.getInt(r0)     // Catch: java.lang.Throwable -> Le4
            r2 = r2 | r3
            r4.setInt(r0, r2)     // Catch: java.lang.Throwable -> Le4
            android.view.Window r2 = r9.getWindow()     // Catch: java.lang.Throwable -> Le4
            r2.setAttributes(r0)     // Catch: java.lang.Throwable -> Le4
        Le4:
            android.view.Window r9 = r9.getWindow()
            if (r9 != 0) goto Leb
            goto Lf5
        Leb:
            int r0 = r9.getStatusBarColor()
            if (r0 != 0) goto Lf2
            goto Lf5
        Lf2:
            r9.setStatusBarColor(r1)
        Lf5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.input.basic.d.d.e(android.app.Activity):void");
    }

    public static final void f(Activity activity) {
        Window window;
        View decorView = (activity == null || (window = activity.getWindow()) == null) ? null : window.getDecorView();
        if (decorView == null) {
            return;
        }
        decorView.setSystemUiVisibility(0);
    }
}
