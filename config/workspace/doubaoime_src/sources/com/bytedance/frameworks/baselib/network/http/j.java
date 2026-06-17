package com.bytedance.frameworks.baselib.network.http;

import com.bytedance.common.utility.Logger;
import com.bytedance.retrofit2.RetrofitMetrics;

/* loaded from: classes.dex */
public class j implements RetrofitMetrics.c {
    private static final j a = new j();
    private static boolean b = false;

    /* renamed from: c, reason: collision with root package name */
    private static boolean f5147c = false;

    public static void a() {
        RetrofitMetrics.m0(a);
    }

    private void d(Object obj) {
        b bVar = (b) obj;
        if (bVar.r != null) {
            StringBuilder M = e.a.a.a.a.M("monitor cast error");
            M.append(bVar.r.getPath());
            Logger.e("TTNetCallMonitor", M.toString());
        }
    }

    public static void e(boolean z) {
        f5147c = z;
    }

    public static void f(boolean z) {
        b = z;
    }

    public void b(String str, Object obj, Throwable th) {
        try {
            b bVar = (b) obj;
            if (!f5147c || bVar.R.compareAndSet(false, true)) {
                if (b) {
                    f.p(str, bVar, th);
                } else {
                    f.o(str, bVar, th);
                }
            }
        } catch (ClassCastException unused) {
            d(obj);
        }
    }

    public void c(String str, Object obj) {
        try {
            b bVar = (b) obj;
            if (!f5147c || bVar.R.compareAndSet(false, true)) {
                if (b) {
                    f.s(str, bVar);
                } else {
                    f.r(str, bVar);
                }
            }
        } catch (ClassCastException unused) {
            d(obj);
        }
    }
}
