package com.ttnet.org.chromium.net.impl;

import com.ttnet.org.chromium.base.annotations.CalledByNative;
import com.ttnet.org.chromium.net.z;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes2.dex */
public final class TTCronetNetExpRequest extends com.ttnet.org.chromium.net.z {
    private CronetUrlRequestContext a;
    private int b;

    /* renamed from: c, reason: collision with root package name */
    private List<String> f8725c;

    /* renamed from: d, reason: collision with root package name */
    private int f8726d;

    /* renamed from: e, reason: collision with root package name */
    private int f8727e;

    /* renamed from: f, reason: collision with root package name */
    private int f8728f;

    /* renamed from: g, reason: collision with root package name */
    private final z.b f8729g;
    private Executor h;
    private long i;
    private boolean j;
    private final Object k = new Object();

    class a implements Runnable {
        final /* synthetic */ boolean a;
        final /* synthetic */ String b;

        a(boolean z, String str) {
            this.a = z;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!this.a) {
                synchronized (TTCronetNetExpRequest.this.k) {
                    if (!TTCronetNetExpRequest.this.h()) {
                        TTCronetNetExpRequest.f(TTCronetNetExpRequest.this);
                    }
                }
            }
            try {
                TTCronetNetExpRequest.this.f8729g.a(TTCronetNetExpRequest.this, this.b);
            } catch (Exception e2) {
                com.ttnet.org.chromium.base.d.a("TTCronetNetExpRequest", "Exception in callback: ", e2);
            }
        }
    }

    public TTCronetNetExpRequest(CronetUrlRequestContext cronetUrlRequestContext, z.b bVar, Executor executor, int i, List<String> list, int i2, int i3, int i4) {
        this.a = cronetUrlRequestContext;
        this.f8729g = bVar;
        this.h = executor;
        this.b = i;
        this.f8725c = list;
        this.f8726d = i2;
        this.f8727e = i3;
        this.f8728f = i4;
    }

    static void f(TTCronetNetExpRequest tTCronetNetExpRequest) {
        long j = tTCronetNetExpRequest.i;
        if (j == 0) {
            return;
        }
        J.N.M6$xRvea(j, tTCronetNetExpRequest);
        tTCronetNetExpRequest.i = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean h() {
        return this.j && this.i == 0;
    }

    @CalledByNative
    private void onNetExpRequestComplete(String str, boolean z) {
        a aVar = new a(z, str);
        try {
            Executor executor = this.h;
            if (executor != null) {
                executor.execute(aVar);
            } else {
                new Thread(aVar, "NetExpCallback").start();
            }
        } catch (RejectedExecutionException e2) {
            com.ttnet.org.chromium.base.d.a("TTCronetNetExpRequest", "Exception posting task to executor", e2);
        }
    }

    @Override // com.ttnet.org.chromium.net.z
    public void a() {
        synchronized (this.k) {
            if (!h() && this.j) {
                long j = this.i;
                if (j != 0) {
                    J.N.M6$xRvea(j, this);
                    this.i = 0L;
                }
            }
        }
    }

    @Override // com.ttnet.org.chromium.net.z
    public void b(String str, String str2) {
        synchronized (this.k) {
            if (!h() && this.j) {
                J.N.MDZjmtTn(this.i, this, str, str2);
            }
        }
    }

    @Override // com.ttnet.org.chromium.net.z
    public void c() {
        synchronized (this.k) {
            if (this.j) {
                return;
            }
            long h0 = this.a.h0();
            int i = this.b;
            List<String> list = this.f8725c;
            long MPJAsrFC = J.N.MPJAsrFC(this, h0, i, (String[]) list.toArray(new String[list.size()]), this.f8726d, this.f8727e, this.f8728f);
            this.i = MPJAsrFC;
            if (MPJAsrFC == 0) {
                throw new NullPointerException("Create native net exp request adapter failed.");
            }
            this.j = true;
            J.N.MLiR9ZbW(MPJAsrFC, this);
        }
    }
}
