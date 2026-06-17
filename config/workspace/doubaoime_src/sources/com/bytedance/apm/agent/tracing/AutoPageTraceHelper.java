package com.bytedance.apm.agent.tracing;

import android.text.TextUtils;
import androidx.annotation.Keep;
import java.util.HashSet;
import java.util.concurrent.ConcurrentLinkedQueue;

/* loaded from: classes.dex */
public class AutoPageTraceHelper {
    private static boolean a;
    private static final HashSet<String> b = new HashSet<>(32);

    /* renamed from: c, reason: collision with root package name */
    private static final ConcurrentLinkedQueue<com.bytedance.apm.agent.tracing.b> f3320c = new ConcurrentLinkedQueue<>();

    /* renamed from: d, reason: collision with root package name */
    private static long f3321d = 20000;

    static class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AutoPageTraceHelper.a();
        }
    }

    static class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AutoPageTraceHelper.a();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0103  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static void a() {
        /*
            Method dump skipped, instructions count: 313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.apm.agent.tracing.AutoPageTraceHelper.a():void");
    }

    public static void b(long j, String str) {
        com.bytedance.apm.agent.tracing.b peek = f3320c.peek();
        if (peek == null || !TextUtils.equals(str, peek.a)) {
            return;
        }
        peek.f3331g = j;
        com.bytedance.apm.F.b.e().h(new b());
    }

    public static void c(long j) {
        f3321d = j;
    }

    @Keep
    public static void onTrace(String str, String str2, boolean z) {
        if (TextUtils.equals("onCreate", str2)) {
            if (z) {
                if (!a) {
                    com.bytedance.apm.agent.tracing.a.d(str);
                }
                ConcurrentLinkedQueue<com.bytedance.apm.agent.tracing.b> concurrentLinkedQueue = f3320c;
                if (concurrentLinkedQueue.size() > 50) {
                    concurrentLinkedQueue.poll();
                }
                concurrentLinkedQueue.add(new com.bytedance.apm.agent.tracing.b(str, System.currentTimeMillis()));
                return;
            }
            if (!a) {
                com.bytedance.apm.agent.tracing.a.c();
            }
            com.bytedance.apm.agent.tracing.b peek = f3320c.peek();
            if (peek != null) {
                peek.f3327c = System.currentTimeMillis();
                return;
            }
            return;
        }
        if (TextUtils.equals("onResume", str2)) {
            if (z) {
                if (!a) {
                    com.bytedance.apm.agent.tracing.a.f(str);
                }
                com.bytedance.apm.agent.tracing.b peek2 = f3320c.peek();
                if (peek2 != null) {
                    peek2.f3328d = System.currentTimeMillis();
                    return;
                }
                return;
            }
            if (!a) {
                com.bytedance.apm.agent.tracing.a.e();
            }
            com.bytedance.apm.agent.tracing.b peek3 = f3320c.peek();
            if (peek3 != null) {
                peek3.f3329e = System.currentTimeMillis();
                return;
            }
            return;
        }
        if (!TextUtils.equals("onWindowFocusChanged", str2)) {
            if (TextUtils.equals("onStart", str2)) {
                if (z) {
                    if (a) {
                        return;
                    }
                    com.bytedance.apm.agent.tracing.a.h(str);
                    return;
                } else {
                    if (a) {
                        return;
                    }
                    com.bytedance.apm.agent.tracing.a.g();
                    return;
                }
            }
            return;
        }
        if (z) {
            if (!a) {
                com.bytedance.apm.agent.tracing.a.i(str);
                a = true;
            }
            com.bytedance.apm.agent.tracing.b peek4 = f3320c.peek();
            if (peek4 == null || peek4.f3330f != 0) {
                return;
            }
            peek4.f3330f = System.currentTimeMillis();
            if (com.bytedance.apm.G.i.a.a(str) == null) {
                com.bytedance.apm.F.b.e().h(new a());
            }
        }
    }
}
