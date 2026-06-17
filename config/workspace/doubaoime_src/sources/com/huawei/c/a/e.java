package com.huawei.c.a;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import com.huawei.android.os.VibratorEx;

/* loaded from: classes2.dex */
final class e extends c {

    /* renamed from: e, reason: collision with root package name */
    private static final Bundle f6976e;

    /* renamed from: f, reason: collision with root package name */
    private static final Uri f6977f;

    /* renamed from: c, reason: collision with root package name */
    private VibratorEx f6978c;

    /* renamed from: d, reason: collision with root package name */
    private String f6979d;

    static {
        Bundle bundle = new Bundle();
        bundle.putString("func", "sound_to_vibrate_effect");
        f6976e = bundle;
        f6977f = Uri.parse("content://com.huawei.gameassistant.provider.PublicThirdApi");
    }

    protected e(Handler handler, Context context) {
        super(handler, context);
        this.f6978c = new VibratorEx();
        this.f6979d = context.getPackageName();
        Log.i("HapticAdapter", "mPkgName = " + this.f6979d);
    }

    @Override // com.huawei.c.a.c
    public final String a(String str) {
        Log.i("HapticAdapter", "getParameter " + str);
        Handler handler = this.a;
        if (handler != null) {
            this.a.sendMessage(handler.obtainMessage(2, new com.huawei.devices.utils.b("getParameter", 0, str)));
            this.a.sendMessage(this.a.obtainMessage(1));
        }
        if (str.equals("haptic.grade.value")) {
            VibratorEx vibratorEx = this.f6978c;
            if (vibratorEx == null) {
                return null;
            }
            return vibratorEx.getHwParameter("haptic.grade.value");
        }
        if (!str.equals("haptic.direction.value")) {
            return null;
        }
        String str2 = Build.MODEL;
        if (str2 == null) {
            Log.e("HapticAdapter", "Phone Model is null");
            return null;
        }
        if (str2.matches("LIO-.*") || str2.matches("NLE-.*")) {
            return "X";
        }
        VibratorEx vibratorEx2 = this.f6978c;
        if (vibratorEx2 == null) {
            return null;
        }
        String hwParameter = vibratorEx2.getHwParameter("haptic.grade.value");
        return (hwParameter == null || hwParameter.equals("unsupport")) ? "unsupport" : "Z";
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0065  */
    @Override // com.huawei.c.a.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(java.lang.String r10) {
        /*
            r9 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "setHwVibrator "
            r0.<init>(r1)
            r0.append(r10)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "HapticAdapter"
            android.util.Log.i(r1, r0)
            r0 = 0
            r2 = 1
            if (r10 == 0) goto L21
            java.lang.String r3 = "haptic.game"
            boolean r3 = r10.startsWith(r3)
            if (r3 == 0) goto L21
            r3 = r2
            goto L22
        L21:
            r3 = r0
        L22:
            r4 = 2
            if (r3 == 0) goto L5d
            java.lang.String r3 = r9.f6979d
            android.content.Context r5 = r9.b     // Catch: java.lang.Exception -> L49 java.lang.SecurityException -> L4c java.lang.IllegalArgumentException -> L4f
            android.content.ContentResolver r5 = r5.getContentResolver()     // Catch: java.lang.Exception -> L49 java.lang.SecurityException -> L4c java.lang.IllegalArgumentException -> L4f
            android.net.Uri r6 = com.huawei.c.a.e.f6977f     // Catch: java.lang.Exception -> L49 java.lang.SecurityException -> L4c java.lang.IllegalArgumentException -> L4f
            java.lang.String r7 = "getSwitchStatus"
            android.os.Bundle r8 = com.huawei.c.a.e.f6976e     // Catch: java.lang.Exception -> L49 java.lang.SecurityException -> L4c java.lang.IllegalArgumentException -> L4f
            android.os.Bundle r3 = r5.call(r6, r7, r3, r8)     // Catch: java.lang.Exception -> L49 java.lang.SecurityException -> L4c java.lang.IllegalArgumentException -> L4f
            if (r3 == 0) goto L40
            java.lang.String r5 = "status"
            int r3 = r3.getInt(r5, r4)     // Catch: java.lang.Exception -> L49 java.lang.SecurityException -> L4c java.lang.IllegalArgumentException -> L4f
            goto L41
        L40:
            r3 = r4
        L41:
            r5 = -1
            if (r3 == r5) goto L54
            if (r3 != r4) goto L47
            goto L54
        L47:
            r3 = r0
            goto L55
        L49:
            java.lang.String r3 = "Exception happened"
            goto L51
        L4c:
            java.lang.String r3 = "SecurityException happened"
            goto L51
        L4f:
            java.lang.String r3 = "IllegalArgumentException happened"
        L51:
            android.util.Log.e(r1, r3)
        L54:
            r3 = r2
        L55:
            if (r3 != 0) goto L5d
            java.lang.String r10 = "4D Switch is not open"
            android.util.Log.e(r1, r10)
            return
        L5d:
            if (r10 != 0) goto L65
            java.lang.String r10 = "Input value is null"
            android.util.Log.e(r1, r10)
            return
        L65:
            com.huawei.android.os.VibratorEx r1 = r9.f6978c
            if (r1 != 0) goto L6a
            return
        L6a:
            boolean r1 = r1.isSupportHwVibrator(r10)
            java.lang.String r3 = "setParameter"
            if (r1 == 0) goto L95
            com.huawei.android.os.VibratorEx r1 = r9.f6978c
            r1.setHwVibrator(r10)
            android.os.Handler r1 = r9.a
            if (r1 == 0) goto Lb2
            com.huawei.devices.utils.b r5 = new com.huawei.devices.utils.b
            r5.<init>(r3, r0, r10)
            android.os.Message r10 = r1.obtainMessage(r4, r5)
            android.os.Handler r0 = r9.a
            r0.sendMessage(r10)
            android.os.Handler r10 = r9.a
            android.os.Message r10 = r10.obtainMessage(r2)
            android.os.Handler r0 = r9.a
            r0.sendMessage(r10)
            return
        L95:
            android.os.Handler r0 = r9.a
            if (r0 == 0) goto Lb2
            com.huawei.devices.utils.b r1 = new com.huawei.devices.utils.b
            r1.<init>(r3, r2, r10)
            android.os.Message r10 = r0.obtainMessage(r4, r1)
            android.os.Handler r0 = r9.a
            r0.sendMessage(r10)
            android.os.Handler r10 = r9.a
            android.os.Message r10 = r10.obtainMessage(r2)
            android.os.Handler r0 = r9.a
            r0.sendMessage(r10)
        Lb2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.c.a.e.b(java.lang.String):void");
    }
}
