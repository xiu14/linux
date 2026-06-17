package com.xiaomi.push;

import android.content.Context;
import android.os.Build;

/* loaded from: classes2.dex */
public class dy {
    public static byte[] a(String str, byte[] bArr) {
        byte[] m131a = bj.m131a(str);
        try {
            a(m131a);
            return i.a(m131a, bArr);
        } catch (Exception unused) {
            return null;
        }
    }

    public static byte[] b(String str, byte[] bArr) {
        byte[] m131a = bj.m131a(str);
        try {
            a(m131a);
            return i.b(m131a, bArr);
        } catch (Exception unused) {
            return null;
        }
    }

    private static void a(byte[] bArr) {
        if (bArr.length >= 2) {
            bArr[0] = 99;
            bArr[1] = 100;
        }
    }

    public static boolean a(Context context, String str, long j) {
        if (com.xiaomi.push.service.aq.a(context).a(hz.DCJobMutualSwitch.a(), false)) {
            return (Build.VERSION.SDK_INT < 29 || context.getApplicationInfo().targetSdkVersion < 29) && !af.a(context, str, j);
        }
        return false;
    }
}
