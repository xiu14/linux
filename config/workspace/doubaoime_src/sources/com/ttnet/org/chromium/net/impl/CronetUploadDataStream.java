package com.ttnet.org.chromium.net.impl;

import android.annotation.SuppressLint;
import androidx.annotation.VisibleForTesting;
import com.ttnet.org.chromium.base.annotations.CalledByNative;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;

@VisibleForTesting
/* loaded from: classes2.dex */
public final class CronetUploadDataStream extends com.ttnet.org.chromium.net.E {
    private final Executor a;
    private final P b;

    /* renamed from: c, reason: collision with root package name */
    private final CronetUrlRequest f8668c;

    /* renamed from: d, reason: collision with root package name */
    private long f8669d;

    /* renamed from: e, reason: collision with root package name */
    private long f8670e;

    /* renamed from: f, reason: collision with root package name */
    private long f8671f;
    private ByteBuffer i;
    private long k;
    private boolean m;
    private final Runnable h = new a();
    private final Object j = new Object();
    private int l = 3;

    /* renamed from: g, reason: collision with root package name */
    private volatile boolean f8672g = false;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (CronetUploadDataStream.this.j) {
                if (CronetUploadDataStream.this.k == 0) {
                    return;
                }
                CronetUploadDataStream.this.n(3);
                if (CronetUploadDataStream.this.i == null) {
                    throw new IllegalStateException("Unexpected readData call. Buffer is null");
                }
                CronetUploadDataStream.this.l = 0;
                try {
                    CronetUploadDataStream.i(CronetUploadDataStream.this);
                    P p = CronetUploadDataStream.this.b;
                    CronetUploadDataStream cronetUploadDataStream = CronetUploadDataStream.this;
                    p.d(cronetUploadDataStream, cronetUploadDataStream.i);
                } catch (Exception e2) {
                    CronetUploadDataStream.this.r(e2);
                }
            }
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (CronetUploadDataStream.this.j) {
                if (CronetUploadDataStream.this.k == 0) {
                    return;
                }
                CronetUploadDataStream.this.n(3);
                CronetUploadDataStream.this.l = 1;
                try {
                    CronetUploadDataStream.i(CronetUploadDataStream.this);
                    CronetUploadDataStream.this.b.h(CronetUploadDataStream.this);
                } catch (Exception e2) {
                    CronetUploadDataStream.this.r(e2);
                }
            }
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                CronetUploadDataStream.i(CronetUploadDataStream.this);
                if (CronetUploadDataStream.this.f8672g) {
                    return;
                }
                CronetUploadDataStream.this.b.close();
            } catch (Exception e2) {
                com.ttnet.org.chromium.base.d.a("CronetUploadDataStream", "Exception thrown when closing", e2);
            }
        }
    }

    public CronetUploadDataStream(com.ttnet.org.chromium.net.D d2, Executor executor, CronetUrlRequest cronetUrlRequest) {
        this.a = executor;
        this.b = new P(d2);
        this.f8668c = cronetUrlRequest;
    }

    static void i(CronetUploadDataStream cronetUploadDataStream) {
        cronetUploadDataStream.f8668c.M();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n(int i) {
        if (this.l == i) {
            return;
        }
        StringBuilder N = e.a.a.a.a.N("Expected ", i, ", but was ");
        N.append(this.l);
        throw new IllegalStateException(N.toString());
    }

    private void o() {
        synchronized (this.j) {
            if (this.l == 0) {
                this.m = true;
                return;
            }
            long j = this.k;
            if (j == 0) {
                return;
            }
            J.N.Mx3T_YwB(j);
            this.k = 0L;
            s(new c());
        }
    }

    private void p() {
        synchronized (this.j) {
            if (this.l == 0) {
                throw new IllegalStateException("Method should not be called when read has not completed.");
            }
            if (this.m) {
                o();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r(Throwable th) {
        boolean z;
        synchronized (this.j) {
            int i = this.l;
            if (i == 3) {
                throw new IllegalStateException("There is no read or rewind or length check in progress.");
            }
            z = i == 2;
            this.l = 3;
            this.i = null;
            p();
        }
        if (z) {
            try {
                this.b.close();
                this.f8672g = true;
            } catch (Exception e2) {
                com.ttnet.org.chromium.base.d.a("CronetUploadDataStream", "Failure closing data provider", e2);
            }
        }
        this.f8668c.S(th);
    }

    @Override // com.ttnet.org.chromium.net.E
    @SuppressLint({"DefaultLocale"})
    public void a(boolean z) {
        synchronized (this.j) {
            n(0);
            if (this.f8671f != this.i.limit()) {
                throw new IllegalStateException("ByteBuffer limit changed");
            }
            if (z && this.f8669d >= 0) {
                throw new IllegalArgumentException("Non-chunked upload can't have last chunk");
            }
            int position = this.i.position();
            long j = this.f8670e - position;
            this.f8670e = j;
            if (j < 0 && this.f8669d >= 0) {
                throw new IllegalArgumentException(String.format("Read upload data length %d exceeds expected length %d", Long.valueOf(this.f8669d - this.f8670e), Long.valueOf(this.f8669d)));
            }
            this.i.position(0);
            this.i = null;
            this.l = 3;
            p();
            long j2 = this.k;
            if (j2 == 0) {
                return;
            }
            J.N.MYsxiVBk(j2, this, position, z);
        }
    }

    @Override // com.ttnet.org.chromium.net.E
    public void b(Exception exc) {
        synchronized (this.j) {
            n(1);
            r(exc);
        }
    }

    @Override // com.ttnet.org.chromium.net.E
    public void c() {
        synchronized (this.j) {
            n(1);
            this.l = 3;
            this.f8670e = this.f8669d;
            long j = this.k;
            if (j == 0) {
                return;
            }
            J.N.M3Tck9nA(j, this);
        }
    }

    void m(long j) {
        synchronized (this.j) {
            this.k = J.N.M89UGLMC(this, j, this.f8669d);
        }
    }

    @CalledByNative
    void onUploadDataStreamDestroyed() {
        o();
    }

    void q() {
        synchronized (this.j) {
            this.l = 2;
        }
        try {
            this.f8668c.M();
            long a2 = this.b.a();
            this.f8669d = a2;
            this.f8670e = a2;
        } catch (Throwable th) {
            r(th);
        }
        synchronized (this.j) {
            this.l = 3;
        }
    }

    @CalledByNative
    void readData(ByteBuffer byteBuffer) {
        this.i = byteBuffer;
        this.f8671f = byteBuffer.limit();
        s(this.h);
    }

    @CalledByNative
    void rewind() {
        s(new b());
    }

    void s(Runnable runnable) {
        try {
            this.a.execute(runnable);
        } catch (Throwable th) {
            CronetUrlRequest cronetUrlRequest = this.f8668c;
            if (cronetUrlRequest == null) {
                throw new IllegalStateException(e.a.a.a.a.w("Unexpected request usage, caught in CronetUploadDataStream, caused by ", th));
            }
            cronetUrlRequest.S(th);
        }
    }
}
