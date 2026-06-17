package com.ss.ttffmpeg;

import android.util.Log;
import e.a.a.a.a;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public class CustomVerify {
    private static Method a;
    private static Class<?> b;

    /* renamed from: c, reason: collision with root package name */
    private static Method f8419c;

    static {
        try {
            a = Class.forName("com.ttnet.org.chromium.net.H").getMethod("verifyServerCertificates", byte[][].class, String.class, String.class);
            Class<?> cls = Class.forName("com.ttnet.org.chromium.net.AndroidCertVerifyResult");
            b = cls;
            f8419c = cls.getMethod("getStatus", new Class[0]);
        } catch (Exception e2) {
            StringBuilder M = a.M("found verify class or method exception:");
            M.append(e2.getMessage());
            Log.e("custom_verify_ffmpeg", M.toString());
        }
        if (a == null || b == null) {
            return;
        }
        Log.e("custom_verify_ffmpeg", "get verify method or verify result class suc");
    }

    private static final native void _init();

    public static int doVerify(byte[][] bArr, String str, String str2) {
        if (a == null || b == null || f8419c == null) {
            Log.e("custom_verify_ffmpeg", "verify method is null ecception");
            return -99995;
        }
        try {
            Log.e("custom_verify_ffmpeg", "host: " + str2 + "  authType: " + str);
            Object invoke = a.invoke(null, bArr, str, str2);
            Log.e("custom_verify_ffmpeg", "get status end");
            int intValue = ((Integer) f8419c.invoke(invoke, new Object[0])).intValue();
            Log.e("custom_verify_ffmpeg", "verify result status: " + intValue);
            return intValue;
        } catch (Throwable th) {
            th.printStackTrace();
            Log.e("custom_verify_ffmpeg", "verify exception stacktrace:" + th.getMessage());
            return -99996;
        }
    }
}
