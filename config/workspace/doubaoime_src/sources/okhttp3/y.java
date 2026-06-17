package okhttp3;

import androidx.core.app.NotificationCompat;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class y implements InterfaceC0836d {
    final x a;
    final okhttp3.F.f.i b;

    /* renamed from: c, reason: collision with root package name */
    final f.b f10740c;

    /* renamed from: d, reason: collision with root package name */
    private o f10741d;

    /* renamed from: e, reason: collision with root package name */
    final Request f10742e;

    /* renamed from: f, reason: collision with root package name */
    final boolean f10743f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f10744g;

    class a extends f.b {
        a() {
        }

        @Override // f.b
        protected void v() {
            y.this.b.b(-192);
        }
    }

    final class b extends okhttp3.F.b {
        private final InterfaceC0837e b;

        b(InterfaceC0837e interfaceC0837e) {
            super("OkHttp %s", y.this.f10742e.url().w());
            this.b = interfaceC0837e;
        }

        @Override // okhttp3.F.b
        protected void a() {
            boolean z;
            Throwable th;
            IOException e2;
            x xVar;
            y.this.f10740c.q();
            try {
                try {
                    z = true;
                    try {
                        this.b.onResponse(y.this, y.this.d());
                        xVar = y.this.a;
                    } catch (IOException e3) {
                        e2 = e3;
                        IOException g2 = y.this.g(e2);
                        if (z) {
                            okhttp3.F.h.g.h().n(4, "Callback failure for " + y.this.h(), g2);
                        } else {
                            y.this.f10741d.b(y.this, g2);
                            this.b.onFailure(y.this, g2);
                        }
                        xVar = y.this.a;
                        xVar.a.d(this);
                    } catch (Throwable th2) {
                        th = th2;
                        y.this.cancel();
                        if (!z) {
                            this.b.onFailure(y.this, new IOException("canceled due to " + th));
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    y.this.a.a.d(this);
                    throw th3;
                }
            } catch (IOException e4) {
                z = false;
                e2 = e4;
            } catch (Throwable th4) {
                z = false;
                th = th4;
            }
            xVar.a.d(this);
        }

        void b(ExecutorService executorService) {
            try {
                try {
                    executorService.execute(this);
                } catch (RejectedExecutionException e2) {
                    InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                    interruptedIOException.initCause(e2);
                    y.this.f10741d.b(y.this, interruptedIOException);
                    this.b.onFailure(y.this, interruptedIOException);
                    y.this.a.a.d(this);
                }
            } catch (Throwable th) {
                y.this.a.a.d(this);
                throw th;
            }
        }
    }

    private y(x xVar, Request request, boolean z) {
        this.a = xVar;
        this.f10742e = request;
        this.f10743f = z;
        this.b = new okhttp3.F.f.i(xVar, z);
        a aVar = new a();
        this.f10740c = aVar;
        aVar.g(xVar.w, TimeUnit.MILLISECONDS);
    }

    static y e(x xVar, Request request, boolean z) {
        y yVar = new y(xVar, request, z);
        yVar.f10741d = ((p) xVar.f10734g).a;
        return yVar;
    }

    public void b(InterfaceC0837e interfaceC0837e) {
        synchronized (this) {
            if (this.f10744g) {
                throw new IllegalStateException("Already Executed");
            }
            this.f10744g = true;
        }
        this.b.j(okhttp3.F.h.g.h().k("response.body().close()"));
        this.f10741d.e(this);
        this.a.a.a(new b(interfaceC0837e));
    }

    public B c() throws IOException {
        synchronized (this) {
            if (this.f10744g) {
                throw new IllegalStateException("Already Executed");
            }
            this.f10744g = true;
        }
        this.b.j(okhttp3.F.h.g.h().k("response.body().close()"));
        this.f10740c.q();
        this.f10741d.e(this);
        try {
            try {
                this.a.a.b(this);
                B d2 = d();
                if (d2 != null) {
                    return d2;
                }
                throw new IOException("Canceled");
            } catch (IOException e2) {
                IOException g2 = g(e2);
                this.f10741d.b(this, g2);
                throw g2;
            }
        } finally {
            this.a.a.e(this);
        }
    }

    public void cancel() {
        this.b.b(-1);
    }

    public Object clone() throws CloneNotSupportedException {
        return e(this.a, this.f10742e, this.f10743f);
    }

    B d() throws IOException {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.a.f10732e);
        arrayList.add(this.b);
        arrayList.add(new okhttp3.F.f.a(this.a.i));
        arrayList.add(new okhttp3.F.d.b(this.a.j));
        arrayList.add(new okhttp3.F.e.a(this.a));
        if (!this.f10743f) {
            arrayList.addAll(this.a.f10733f);
        }
        arrayList.add(new okhttp3.F.f.b(this.f10743f));
        Request request = this.f10742e;
        o oVar = this.f10741d;
        x xVar = this.a;
        B f2 = new okhttp3.F.f.f(arrayList, null, null, null, 0, request, this, oVar, xVar.x, xVar.y, xVar.z).f(request);
        if (!this.b.f()) {
            return f2;
        }
        okhttp3.F.c.g(f2);
        StringBuilder M = e.a.a.a.a.M("Canceled#Reason=");
        M.append(this.b.c());
        throw new IOException(M.toString());
    }

    public Request f() {
        return this.f10742e;
    }

    IOException g(IOException iOException) {
        if (!this.f10740c.r()) {
            return iOException;
        }
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    String h() {
        StringBuilder sb = new StringBuilder();
        sb.append(isCanceled() ? "canceled " : "");
        sb.append(this.f10743f ? "web socket" : NotificationCompat.CATEGORY_CALL);
        sb.append(" to ");
        sb.append(this.f10742e.url().w());
        return sb.toString();
    }

    public boolean isCanceled() {
        return this.b.f();
    }
}
