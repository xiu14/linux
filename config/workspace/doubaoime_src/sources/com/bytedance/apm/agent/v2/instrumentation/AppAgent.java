package com.bytedance.apm.agent.v2.instrumentation;

import android.text.TextUtils;
import androidx.annotation.Keep;
import com.bytedance.apm.agent.tracing.a;

/* loaded from: classes.dex */
public class AppAgent {
    private static long a;
    private static long b;

    /* renamed from: c, reason: collision with root package name */
    private static long f3332c;

    /* renamed from: d, reason: collision with root package name */
    private static long f3333d;

    /* renamed from: e, reason: collision with root package name */
    private static long f3334e;

    /* renamed from: f, reason: collision with root package name */
    private static long f3335f;

    @Keep
    public static void onTrace(String str, boolean z) {
        if (TextUtils.equals(str, "<init>")) {
            if (z) {
                a = System.currentTimeMillis();
                return;
            } else {
                b = System.currentTimeMillis();
                return;
            }
        }
        if (TextUtils.equals(str, "attachBaseContext")) {
            if (z) {
                f3332c = System.currentTimeMillis();
                return;
            } else {
                f3333d = System.currentTimeMillis();
                return;
            }
        }
        if (TextUtils.equals(str, "onCreate")) {
            if (z) {
                f3334e = System.currentTimeMillis();
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            f3335f = currentTimeMillis;
            a.b(a, b, f3332c, f3333d, f3334e, currentTimeMillis);
        }
    }
}
