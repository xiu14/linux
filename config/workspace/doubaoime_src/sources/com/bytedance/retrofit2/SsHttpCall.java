package com.bytedance.retrofit2;

import com.bytedance.common.utility.Logger;
import com.bytedance.retrofit2.I;
import com.bytedance.retrofit2.client.Request;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

/* loaded from: classes2.dex */
public class SsHttpCall<T> implements InterfaceC0701e<T>, q, r {
    private static b sCustomInterceptorControl;
    private static c sPriorityControl;
    private static d sRequestFlagHandler;
    private static com.bytedance.retrofit2.T.a sThrottleControl;
    private final Object[] args;
    private final C0703g callServerInterceptor;
    private final RetrofitMetrics metrics;
    private Request originalRequest;
    private final G<T> requestFactory;
    private Request delayRequest = null;
    private Throwable requestException = null;

    class a implements O {
        private final InterfaceC0704h<T> a;
        private final InterfaceC0710n b;

        a(InterfaceC0704h<T> interfaceC0704h) {
            this.a = interfaceC0704h;
            this.b = interfaceC0704h instanceof InterfaceC0710n ? (InterfaceC0710n) interfaceC0704h : null;
        }

        private void a(Throwable th) {
            try {
                this.a.b(SsHttpCall.this, th);
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }

        private void b(N<T> n) {
            try {
                this.a.a(SsHttpCall.this, n);
                InterfaceC0710n interfaceC0710n = this.b;
                if (interfaceC0710n != null) {
                    interfaceC0710n.d(SsHttpCall.this, n);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }

        @Override // com.bytedance.retrofit2.O
        public int G() {
            if (SsHttpCall.sRequestFlagHandler != null) {
                d dVar = SsHttpCall.sRequestFlagHandler;
                Request request = SsHttpCall.this.originalRequest;
                Objects.requireNonNull((com.bytedance.ttnet.f) dVar);
                int i = request.getExtraInfo() instanceof com.bytedance.frameworks.baselib.network.http.c ? ((com.bytedance.frameworks.baselib.network.http.c) request.getExtraInfo()).j : -999;
                if (i != -999) {
                    SsHttpCall.this.metrics.j0(i);
                    return i;
                }
            }
            if (SsHttpCall.sPriorityControl == null || SsHttpCall.this.originalRequest == null) {
                return SsHttpCall.this.originalRequest != null ? SsHttpCall.this.originalRequest.getPriorityLevel() : SsHttpCall.this.requestFactory.f5941e;
            }
            int a = SsHttpCall.sPriorityControl.a(SsHttpCall.this.originalRequest.getPath(), SsHttpCall.this.requestFactory.f5941e);
            SsHttpCall.this.metrics.j0(a);
            return a;
        }

        @Override // com.bytedance.retrofit2.O
        public boolean N() {
            return SsHttpCall.this.isStreaming().booleanValue();
        }

        @Override // java.lang.Runnable
        public void run() {
            N responseWithInterceptorChain;
            try {
                SsHttpCall.this.metrics.W();
                responseWithInterceptorChain = SsHttpCall.this.getResponseWithInterceptorChain();
                if (SsHttpCall.sThrottleControl != null) {
                    SsHttpCall.sThrottleControl.c(SsHttpCall.this.delayRequest);
                }
                SsHttpCall.this.metrics.i();
                SsHttpCall.this.metrics.s();
            } catch (Throwable th) {
                try {
                    SsHttpCall.this.requestException = th;
                    SsHttpCall.this.metrics.E0.f5964e.f5982e = new WeakReference<>(th);
                    if (SsHttpCall.sThrottleControl != null) {
                        SsHttpCall.sThrottleControl.c(SsHttpCall.this.delayRequest);
                    }
                    SsHttpCall.this.metrics.i();
                    SsHttpCall.this.metrics.s();
                    try {
                        if (SsHttpCall.this.requestException != null) {
                            a(SsHttpCall.this.requestException);
                        } else {
                            b(null);
                        }
                    } finally {
                    }
                } catch (Throwable th2) {
                    if (SsHttpCall.sThrottleControl != null) {
                        SsHttpCall.sThrottleControl.c(SsHttpCall.this.delayRequest);
                    }
                    SsHttpCall.this.metrics.i();
                    SsHttpCall.this.metrics.s();
                    try {
                        if (SsHttpCall.this.requestException != null) {
                            a(SsHttpCall.this.requestException);
                        } else {
                            b(null);
                        }
                        SsHttpCall.this.metrics.r();
                        SsHttpCall.this.metrics.H();
                        throw th2;
                    } finally {
                    }
                }
            }
            try {
                if (SsHttpCall.this.requestException != null) {
                    a(SsHttpCall.this.requestException);
                } else {
                    b(responseWithInterceptorChain);
                }
                SsHttpCall.this.metrics.r();
                SsHttpCall.this.metrics.H();
            } finally {
            }
        }

        @Override // com.bytedance.retrofit2.O
        public RetrofitMetrics w() {
            return SsHttpCall.this.getRetrofitMetrics();
        }

        @Override // com.bytedance.retrofit2.O
        public int x() {
            return 0;
        }
    }

    public interface b {
        List<com.bytedance.retrofit2.S.a> a(Request request, List<com.bytedance.retrofit2.S.a> list);
    }

    public interface c {
        int a(String str, int i);
    }

    public interface d {
    }

    SsHttpCall(G<T> g2, Object[] objArr) {
        this.requestFactory = g2;
        this.args = objArr;
        this.callServerInterceptor = new C0703g(g2);
        RetrofitMetrics a2 = g2.a();
        Objects.requireNonNull(a2);
        RetrofitMetrics retrofitMetrics = new RetrofitMetrics();
        retrofitMetrics.v = a2.v;
        retrofitMetrics.n = a2.o;
        retrofitMetrics.t = a2.t;
        retrofitMetrics.u = a2.u;
        retrofitMetrics.b = a2.b;
        I i = retrofitMetrics.E0;
        I.b bVar = i.a;
        I i2 = a2.E0;
        I.b bVar2 = i2.a;
        bVar.f5972e = bVar2.f5972e;
        bVar.f5973f = bVar2.f5973f;
        bVar.f5974g = bVar2.f5974g;
        I.c cVar = i.f5962c;
        I.c cVar2 = i2.f5962c;
        cVar.b = cVar2.b;
        cVar.f5975c = cVar2.f5975c;
        this.metrics = retrofitMetrics;
        bVar.f5974g = System.nanoTime();
    }

    private Request addDebugMetricsInfoToRequest(Request request) {
        if (request.getMetrics().B < 0) {
            return request;
        }
        Request.a newBuilder = request.newBuilder();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(request.getHeaders());
        arrayList.add(new com.bytedance.retrofit2.client.b("state-delay", String.valueOf(request.getMetrics().B)));
        newBuilder.b(arrayList);
        return newBuilder.a();
    }

    private List<com.bytedance.retrofit2.S.a> constructInterceptorList() {
        d dVar;
        LinkedList linkedList = new LinkedList();
        d dVar2 = sRequestFlagHandler;
        if (dVar2 != null) {
            this.originalRequest = ((com.bytedance.ttnet.f) dVar2).b(this.originalRequest);
        }
        if (sCustomInterceptorControl != null && (dVar = sRequestFlagHandler) != null) {
            Request request = this.originalRequest;
            Objects.requireNonNull((com.bytedance.ttnet.f) dVar);
            boolean z = false;
            if ((request.getExtraInfo() instanceof com.bytedance.frameworks.baselib.network.http.c) && (((com.bytedance.frameworks.baselib.network.http.c) request.getExtraInfo()).f5090f & 8192) > 0) {
                z = true;
            }
            if (z) {
                List<com.bytedance.retrofit2.S.a> a2 = sCustomInterceptorControl.a(this.originalRequest, this.requestFactory.f5939c);
                if (a2 != null) {
                    linkedList.addAll(a2);
                }
                linkedList.add(this.callServerInterceptor);
                return linkedList;
            }
        }
        if (shouldAddInterceptors(this.originalRequest)) {
            linkedList.addAll(this.requestFactory.f5939c);
        }
        linkedList.add(this.callServerInterceptor);
        return linkedList;
    }

    private synchronized void ensureOriginalRequestCreated() {
        if (this.originalRequest != null) {
            return;
        }
        try {
            this.metrics.s0();
            this.originalRequest = this.requestFactory.c(null, this.args);
            this.metrics.r0();
            Request request = this.originalRequest;
            if (request == null) {
                throw new RuntimeException("Unable to create request.");
            }
            request.setMetrics(this.metrics);
            if (Logger.debug()) {
                Logger.d("ToRequestLog", "originalRequest build success, path: " + this.originalRequest.getPath());
            }
        } catch (IOException e2) {
            throw new RuntimeException("Unable to create request.", e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Boolean isStreaming() {
        return Boolean.valueOf(this.requestFactory.h);
    }

    public static void setCustomInterceptorControl(b bVar) {
        sCustomInterceptorControl = bVar;
    }

    public static void setPriorityControl(c cVar) {
        sPriorityControl = cVar;
    }

    public static void setRequestFlagHandler(d dVar) {
        sRequestFlagHandler = dVar;
    }

    public static void setThrottleControl(com.bytedance.retrofit2.T.a aVar) {
        sThrottleControl = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean shouldAddInterceptors(com.bytedance.retrofit2.client.Request r4) {
        /*
            r3 = this;
            boolean r0 = r4.isPureRequest()
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            com.bytedance.retrofit2.SsHttpCall$d r0 = com.bytedance.retrofit2.SsHttpCall.sRequestFlagHandler
            r2 = 1
            if (r0 == 0) goto L2f
            com.bytedance.ttnet.f r0 = (com.bytedance.ttnet.f) r0
            java.util.Objects.requireNonNull(r0)
            java.lang.Object r0 = r4.getExtraInfo()
            boolean r0 = r0 instanceof com.bytedance.frameworks.baselib.network.http.c
            if (r0 == 0) goto L2c
            java.lang.Object r4 = r4.getExtraInfo()
            com.bytedance.frameworks.baselib.network.http.c r4 = (com.bytedance.frameworks.baselib.network.http.c) r4
            int r4 = r4.f5090f
            r0 = r4 & 1024(0x400, float:1.435E-42)
            if (r0 > 0) goto L2a
            r4 = r4 & 2048(0x800, float:2.87E-42)
            if (r4 <= 0) goto L2c
        L2a:
            r4 = r2
            goto L2d
        L2c:
            r4 = r1
        L2d:
            if (r4 != 0) goto L30
        L2f:
            r1 = r2
        L30:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.retrofit2.SsHttpCall.shouldAddInterceptors(com.bytedance.retrofit2.client.Request):boolean");
    }

    @Override // com.bytedance.retrofit2.InterfaceC0701e
    public void cancel() {
        C0703g c0703g = this.callServerInterceptor;
        if (c0703g != null) {
            c0703g.b();
        }
    }

    @Deprecated
    public void cancelNormalRequest(boolean z, Throwable th, boolean z2) {
        C0703g c0703g = this.callServerInterceptor;
        if (c0703g != null) {
            c0703g.c(z);
        }
    }

    @Override // com.bytedance.retrofit2.q
    public void doCollect() {
    }

    @Override // com.bytedance.retrofit2.InterfaceC0701e
    public void enqueue(InterfaceC0704h<T> interfaceC0704h) {
        Throwable th;
        Objects.requireNonNull(interfaceC0704h, "callback == null");
        if (isExecuted()) {
            throw new IllegalStateException("Already executed.");
        }
        this.metrics.p0(true);
        a aVar = new a(interfaceC0704h);
        try {
            ensureOriginalRequestCreated();
            com.bytedance.retrofit2.T.a aVar2 = sThrottleControl;
            if (aVar2 != null) {
                Request d2 = aVar2.d(this.originalRequest);
                this.originalRequest = d2;
                this.delayRequest = d2;
                if (sThrottleControl.a(d2, this.requestFactory.f5940d, aVar)) {
                    if (th != null) {
                        return;
                    } else {
                        return;
                    }
                }
            }
            this.requestFactory.f5940d.execute(aVar);
            this.metrics.o0();
            if (this.requestException == null) {
                return;
            }
        } catch (Throwable th2) {
            try {
                this.requestException = th2;
                th2.printStackTrace();
                this.metrics.E0.f5964e.f5982e = new WeakReference<>(th2);
                this.metrics.s();
                try {
                    interfaceC0704h.b(this, th2);
                    this.metrics.r();
                    com.bytedance.retrofit2.T.a aVar3 = sThrottleControl;
                    if (aVar3 != null) {
                        aVar3.c(this.delayRequest);
                    }
                    this.metrics.o0();
                    if (this.requestException == null) {
                        return;
                    }
                } catch (Throwable th3) {
                    this.metrics.r();
                    throw th3;
                }
            } finally {
                this.metrics.o0();
                if (this.requestException != null) {
                    this.metrics.G();
                    this.metrics.H();
                }
            }
        }
        this.metrics.G();
        this.metrics.H();
    }

    @Override // com.bytedance.retrofit2.InterfaceC0701e
    @Deprecated
    public N<T> execute() throws Exception {
        this.metrics.p0(false);
        ensureOriginalRequestCreated();
        try {
            com.bytedance.retrofit2.T.a aVar = sThrottleControl;
            if (aVar != null) {
                Request d2 = aVar.d(this.originalRequest);
                this.originalRequest = d2;
                this.delayRequest = d2;
                sThrottleControl.b(d2);
            }
            this.metrics.W();
            return getResponseWithInterceptorChain();
        } catch (Throwable th) {
            try {
                this.requestException = th;
                this.metrics.E0.f5964e.f5982e = new WeakReference<>(th);
                throw th;
            } finally {
                com.bytedance.retrofit2.T.a aVar2 = sThrottleControl;
                if (aVar2 != null) {
                    aVar2.c(this.delayRequest);
                }
                this.metrics.i();
                this.metrics.o0();
                this.metrics.H();
            }
        }
    }

    @Override // com.bytedance.retrofit2.r
    public Object getRequestInfo() {
        C0703g c0703g = this.callServerInterceptor;
        if (c0703g != null) {
            return c0703g.getRequestInfo();
        }
        return null;
    }

    N getResponseWithInterceptorChain() throws Exception {
        if (Logger.debug()) {
            StringBuilder M = e.a.a.a.a.M("real send ");
            M.append(this.originalRequest.getPath());
            Logger.d("SsHttpCall", M.toString());
        }
        List<com.bytedance.retrofit2.S.a> constructInterceptorList = constructInterceptorList();
        if (Logger.debug()) {
            this.originalRequest = addDebugMetricsInfoToRequest(this.originalRequest);
        }
        com.bytedance.retrofit2.S.b bVar = new com.bytedance.retrofit2.S.b(constructInterceptorList, 0, this.originalRequest, this);
        N c2 = com.bytedance.retrofit2.S.b.a() ? bVar.c(this.originalRequest) : bVar.b(this.originalRequest);
        c2.i(this.metrics);
        return c2;
    }

    public RetrofitMetrics getRetrofitMetrics() {
        return this.metrics;
    }

    @Override // com.bytedance.retrofit2.InterfaceC0701e
    public boolean isCanceled() {
        C0703g c0703g = this.callServerInterceptor;
        return c0703g != null && c0703g.d();
    }

    public synchronized boolean isExecuted() {
        boolean z;
        C0703g c0703g = this.callServerInterceptor;
        if (c0703g != null) {
            z = c0703g.e();
        }
        return z;
    }

    @Override // com.bytedance.retrofit2.InterfaceC0701e
    public Request request() {
        Request f2;
        C0703g c0703g = this.callServerInterceptor;
        if (c0703g != null && (f2 = c0703g.f()) != null) {
            return f2;
        }
        ensureOriginalRequestCreated();
        return this.originalRequest;
    }

    public boolean setThrottleNetSpeed(long j) {
        C0703g c0703g = this.callServerInterceptor;
        if (c0703g != null) {
            return c0703g.h(j);
        }
        return false;
    }

    public T toResponseBody(com.bytedance.retrofit2.mime.h hVar) throws IOException {
        return this.requestFactory.o.a(hVar);
    }

    @Override // com.bytedance.retrofit2.InterfaceC0701e
    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public SsHttpCall<T> m10clone() {
        return new SsHttpCall<>(this.requestFactory, this.args);
    }
}
