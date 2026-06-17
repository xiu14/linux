package com.bytedance.retrofit2.S;

import com.bytedance.retrofit2.C0703g;
import com.bytedance.retrofit2.InterfaceC0701e;
import com.bytedance.retrofit2.J;
import com.bytedance.retrofit2.N;
import com.bytedance.retrofit2.S.a;
import com.bytedance.retrofit2.client.Request;
import java.util.List;

/* loaded from: classes2.dex */
public class b implements a.InterfaceC0308a {

    /* renamed from: f, reason: collision with root package name */
    private static volatile boolean f5999f = false;
    private final List<a> a;
    private final int b;

    /* renamed from: c, reason: collision with root package name */
    private final Request f6000c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC0701e f6001d;

    /* renamed from: e, reason: collision with root package name */
    private int f6002e;

    public b(List<a> list, int i, Request request, InterfaceC0701e interfaceC0701e) {
        this.a = list;
        this.b = i;
        this.f6000c = request;
        this.f6001d = interfaceC0701e;
    }

    public static boolean a() {
        return f5999f;
    }

    public static void e(boolean z) {
        f5999f = z;
    }

    public N b(Request request) throws Exception {
        request.setMetrics(this.f6000c.getMetrics());
        if (request.getMetrics() != null) {
            request.getMetrics().S();
        }
        if (this.b >= this.a.size()) {
            throw new AssertionError();
        }
        int i = this.f6002e + 1;
        this.f6002e = i;
        if (i > 1) {
            for (a aVar : this.a) {
                if (aVar instanceof C0703g) {
                    ((C0703g) aVar).g();
                }
            }
        }
        List<a> list = this.a;
        int i2 = this.b;
        b bVar = new b(list, i2 + 1, request, this.f6001d);
        a aVar2 = list.get(i2);
        StringBuilder M = e.a.a.a.a.M("interceptor = ");
        M.append(aVar2 != null ? aVar2.toString() : "");
        M.append(" url = ");
        M.append(request.getUrl());
        J.a("RealInterceptorChain", M.toString());
        if (aVar2 == null) {
            throw new NullPointerException(e.a.a.a.a.D(e.a.a.a.a.M("interceptor "), this.b, " is null"));
        }
        if (request.getMetrics() != null) {
            request.getMetrics().T(aVar2);
            request.getMetrics().g(aVar2);
        }
        try {
            try {
                N a = aVar2.a(bVar);
                if (a == null) {
                    throw new NullPointerException("interceptor " + aVar2 + " returned null");
                }
                if (a.h() != null) {
                    return a;
                }
                throw new IllegalStateException("interceptor " + aVar2 + " returned a ssResponse with no body");
            } catch (Exception e2) {
                throw e2;
            }
        } finally {
            if (request.getMetrics() != null) {
                request.getMetrics().U(null);
                if (this.b > 0) {
                    request.getMetrics().V(this.a.get(this.b - 1));
                }
                this.f6000c.getMetrics().e(null);
            }
        }
    }

    public N c(Request request) throws Exception {
        request.setMetrics(this.f6000c.getMetrics());
        if (request.getMetrics() != null) {
            request.getMetrics().S();
        }
        if (this.b >= this.a.size()) {
            throw new AssertionError();
        }
        int i = this.f6002e + 1;
        this.f6002e = i;
        if (i > 1) {
            for (a aVar : this.a) {
                if (aVar instanceof C0703g) {
                    ((C0703g) aVar).g();
                }
            }
        }
        List<a> list = this.a;
        int i2 = this.b;
        b bVar = new b(list, i2 + 1, request, this.f6001d);
        a aVar2 = list.get(i2);
        StringBuilder M = e.a.a.a.a.M("interceptor = ");
        M.append(aVar2 != null ? aVar2.toString() : "");
        M.append(" url = ");
        M.append(request.getUrl());
        J.a("RealInterceptorChain", M.toString());
        if (aVar2 == null) {
            throw new NullPointerException(e.a.a.a.a.D(e.a.a.a.a.M("interceptor "), this.b, " is null"));
        }
        if (request.getMetrics() != null) {
            request.getMetrics().T(aVar2);
            request.getMetrics().g(aVar2);
        }
        try {
            try {
                N a = aVar2.a(bVar);
                if (a == null) {
                    throw new NullPointerException("interceptor " + aVar2 + " returned null");
                }
                if (a.h() != null) {
                    return a;
                }
                throw new IllegalStateException("interceptor " + aVar2 + " returned a ssResponse with no body");
            } catch (Exception e2) {
                throw e2;
            }
        } finally {
            if (request.getMetrics() != null) {
                request.getMetrics().U(null);
                if (this.b > 0) {
                    request.getMetrics().V(this.a.get(this.b - 1));
                }
                this.f6000c.getMetrics().e(null);
            }
        }
    }

    public Request d() {
        return this.f6000c;
    }
}
