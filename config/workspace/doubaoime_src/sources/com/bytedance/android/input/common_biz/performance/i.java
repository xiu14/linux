package com.bytedance.android.input.common_biz.performance;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Window;
import android.view.WindowManager;
import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.android.input.common_biz.performance.api.PerformanceConfig;
import com.prolificinteractive.materialcalendarview.r;
import java.util.Objects;
import kotlin.h;

/* loaded from: classes.dex */
public final class i {
    private static String a;
    private static int b;

    /* renamed from: c, reason: collision with root package name */
    private static boolean f2255c;

    /* renamed from: d, reason: collision with root package name */
    private static boolean f2256d;

    public static final void a(Window window) {
        IAppGlobals.a aVar = IAppGlobals.a;
        Objects.requireNonNull(aVar);
        aVar.j("HighRefreshRateHelper", "[HighRefresh] disableHighRefreshRate isSetHighRefreshRate=" + f2256d);
        f2255c = false;
        if (window != null && PerformanceConfig.INSTANCE.isSupportHighRefreshRate() && f2256d) {
            try {
                if (Build.VERSION.SDK_INT >= 31) {
                    WindowManager.LayoutParams attributes = window.getAttributes();
                    kotlin.s.c.l.e(attributes, "window.attributes");
                    if (!(attributes.preferredRefreshRate == 0.0f)) {
                        attributes.preferredRefreshRate = 0.0f;
                        window.setAttributes(attributes);
                        Objects.requireNonNull(aVar);
                        aVar.j("HighRefreshRateHelper", "[HighRefresh] disableHighRefreshRate 01 to default");
                    }
                } else {
                    WindowManager.LayoutParams attributes2 = window.getAttributes();
                    kotlin.s.c.l.e(attributes2, "window.attributes");
                    if (attributes2.preferredDisplayModeId != 0) {
                        attributes2.preferredDisplayModeId = 0;
                        window.setAttributes(attributes2);
                        Objects.requireNonNull(aVar);
                        aVar.j("HighRefreshRateHelper", "[HighRefresh] disableHighRefreshRate 02 to default");
                    }
                }
            } catch (Exception e2) {
                IAppGlobals.a aVar2 = IAppGlobals.a;
                Objects.requireNonNull(aVar2);
                StringBuilder sb = new StringBuilder();
                sb.append("[HighRefresh] disableHighRefreshRate error=");
                e.a.a.a.a.d0(e2, sb, aVar2, "HighRefreshRateHelper");
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x010c A[Catch: Exception -> 0x0115, TRY_LEAVE, TryCatch #0 {Exception -> 0x0115, blocks: (B:6:0x001e, B:8:0x007c, B:11:0x0099, B:13:0x00b6, B:15:0x00bf, B:17:0x00e3, B:19:0x00ee, B:21:0x00fa, B:24:0x010c, B:25:0x00ff, B:29:0x00e8), top: B:5:0x001e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean b(android.view.Window r9) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.input.common_biz.performance.i.b(android.view.Window):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    @android.annotation.SuppressLint({"WrongConstant"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final float c(android.view.Window r8) {
        /*
            r0 = 1114636288(0x42700000, float:60.0)
            r1 = 0
            android.content.Context r8 = r8.getContext()     // Catch: java.lang.Throwable -> L77
            java.lang.String r2 = "window"
            java.lang.Object r8 = r8.getSystemService(r2)     // Catch: java.lang.Throwable -> L77
            boolean r2 = r8 instanceof android.view.WindowManager     // Catch: java.lang.Throwable -> L77
            if (r2 == 0) goto L14
            android.view.WindowManager r8 = (android.view.WindowManager) r8     // Catch: java.lang.Throwable -> L77
            goto L15
        L14:
            r8 = r1
        L15:
            if (r8 != 0) goto L18
            goto L71
        L18:
            android.view.Display r8 = r8.getDefaultDisplay()     // Catch: java.lang.Throwable -> L77
            if (r8 == 0) goto L23
            android.view.Display$Mode[] r8 = r8.getSupportedModes()     // Catch: java.lang.Throwable -> L77
            goto L24
        L23:
            r8 = r1
        L24:
            if (r8 != 0) goto L27
            goto L71
        L27:
            java.lang.String r2 = "display?.supportedModes ?: return@runCatching 60f"
            kotlin.s.c.l.e(r8, r2)     // Catch: java.lang.Throwable -> L77
            int r2 = r8.length     // Catch: java.lang.Throwable -> L77
            r3 = 1
            r4 = 0
            if (r2 != 0) goto L33
            r2 = r3
            goto L34
        L33:
            r2 = r4
        L34:
            if (r2 == 0) goto L38
            r2 = r1
            goto L6a
        L38:
            r2 = r8[r4]     // Catch: java.lang.Throwable -> L77
            int r4 = kotlin.collections.g.y(r8)     // Catch: java.lang.Throwable -> L77
            if (r4 != 0) goto L41
            goto L6a
        L41:
            float r5 = r2.getRefreshRate()     // Catch: java.lang.Throwable -> L77
            kotlin.w.d r6 = new kotlin.w.d     // Catch: java.lang.Throwable -> L77
            r6.<init>(r3, r4)     // Catch: java.lang.Throwable -> L77
            kotlin.collections.o r3 = r6.iterator()     // Catch: java.lang.Throwable -> L77
        L4e:
            r4 = r3
            kotlin.w.c r4 = (kotlin.w.c) r4     // Catch: java.lang.Throwable -> L77
            boolean r4 = r4.hasNext()     // Catch: java.lang.Throwable -> L77
            if (r4 == 0) goto L6a
            int r4 = r3.nextInt()     // Catch: java.lang.Throwable -> L77
            r4 = r8[r4]     // Catch: java.lang.Throwable -> L77
            float r6 = r4.getRefreshRate()     // Catch: java.lang.Throwable -> L77
            int r7 = java.lang.Float.compare(r5, r6)     // Catch: java.lang.Throwable -> L77
            if (r7 >= 0) goto L4e
            r2 = r4
            r5 = r6
            goto L4e
        L6a:
            if (r2 == 0) goto L71
            float r8 = r2.getRefreshRate()     // Catch: java.lang.Throwable -> L77
            goto L72
        L71:
            r8 = r0
        L72:
            java.lang.Float r8 = java.lang.Float.valueOf(r8)     // Catch: java.lang.Throwable -> L77
            goto L7c
        L77:
            r8 = move-exception
            java.lang.Object r8 = com.prolificinteractive.materialcalendarview.r.J(r8)
        L7c:
            boolean r2 = r8 instanceof kotlin.h.a
            if (r2 == 0) goto L81
            goto L82
        L81:
            r1 = r8
        L82:
            java.lang.Float r1 = (java.lang.Float) r1
            if (r1 == 0) goto L8a
            float r0 = r1.floatValue()
        L8a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.input.common_biz.performance.i.c(android.view.Window):float");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void d(android.view.Window r10, float r11) {
        /*
            Method dump skipped, instructions count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.input.common_biz.performance.i.d(android.view.Window, float):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    @android.annotation.SuppressLint({"WrongConstant"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final boolean e(android.view.Window r11, float r12) {
        /*
            Method dump skipped, instructions count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.input.common_biz.performance.i.e(android.view.Window, float):boolean");
    }

    private static final boolean f(Window window, float f2) {
        Object J2;
        try {
            WindowManager.LayoutParams attributes = window.getAttributes();
            kotlin.s.c.l.e(attributes, "window.attributes");
            if (attributes.preferredRefreshRate == f2) {
                IAppGlobals.a aVar = IAppGlobals.a;
                Objects.requireNonNull(aVar);
                aVar.j("HighRefreshRateHelper", "[HighRefresh] setHighRefreshRateForAndroidS already " + f2);
            } else {
                attributes.preferredRefreshRate = f2;
                window.setAttributes(attributes);
                IAppGlobals.a aVar2 = IAppGlobals.a;
                Objects.requireNonNull(aVar2);
                aVar2.j("HighRefreshRateHelper", "[HighRefresh] setHighRefreshRateForAndroidS set " + f2);
            }
            J2 = Boolean.TRUE;
        } catch (Throwable th) {
            J2 = r.J(th);
        }
        if (J2 instanceof h.a) {
            J2 = null;
        }
        Boolean bool = (Boolean) J2;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    private static final void g(final Window window, final float f2) {
        IAppGlobals.a aVar = IAppGlobals.a;
        Objects.requireNonNull(aVar);
        aVar.j("HighRefreshRateHelper", "[HighRefresh] verifyRefreshRateSetting expected=" + f2);
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.bytedance.android.input.common_biz.performance.b
            @Override // java.lang.Runnable
            public final void run() {
                i.d(window, f2);
            }
        }, 800L);
    }
}
