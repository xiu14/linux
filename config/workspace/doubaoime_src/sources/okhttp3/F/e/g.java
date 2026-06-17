package okhttp3.F.e;

import java.io.IOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.ArrayList;
import okhttp3.C0833a;
import okhttp3.E;
import okhttp3.F.e.f;
import okhttp3.InterfaceC0836d;
import okhttp3.i;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.p;
import okhttp3.o;
import okhttp3.u;
import okhttp3.x;
import okhttp3.y;

/* loaded from: classes2.dex */
public final class g {
    public final C0833a a;
    private f.a b;

    /* renamed from: c, reason: collision with root package name */
    private E f10524c;

    /* renamed from: d, reason: collision with root package name */
    private final i f10525d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC0836d f10526e;

    /* renamed from: f, reason: collision with root package name */
    public final o f10527f;

    /* renamed from: g, reason: collision with root package name */
    private final Object f10528g;
    private final f h;
    private int i;
    private c j;
    private boolean k;
    private boolean l;
    private boolean m;
    private int n = -1;
    private okhttp3.F.f.c o;

    public static final class a extends WeakReference<g> {
        public final Object a;

        a(g gVar, Object obj) {
            super(gVar);
            this.a = obj;
        }
    }

    public g(i iVar, C0833a c0833a, InterfaceC0836d interfaceC0836d, o oVar, Object obj) {
        this.f10525d = iVar;
        this.a = c0833a;
        this.f10526e = interfaceC0836d;
        this.f10527f = oVar;
        this.h = new f(c0833a, okhttp3.F.a.a.k(iVar), interfaceC0836d, oVar);
        this.f10528g = obj;
    }

    private Socket e(boolean z, boolean z2, boolean z3) {
        Socket socket;
        if (z3) {
            this.o = null;
        }
        if (z2) {
            this.l = true;
        }
        c cVar = this.j;
        if (cVar == null) {
            return null;
        }
        if (z) {
            cVar.k = true;
        }
        if (this.o != null) {
            return null;
        }
        if (!this.l && !cVar.k) {
            return null;
        }
        int size = cVar.n.size();
        for (int i = 0; i < size; i++) {
            if (cVar.n.get(i).get() == this) {
                cVar.n.remove(i);
                if (this.j.n.isEmpty()) {
                    this.j.o = System.nanoTime();
                    if (okhttp3.F.a.a.e(this.f10525d, this.j)) {
                        socket = this.j.o();
                        this.j = null;
                        return socket;
                    }
                }
                socket = null;
                this.j = null;
                return socket;
            }
        }
        throw new IllegalStateException();
    }

    private c f(int i, int i2, int i3, int i4, boolean z, boolean z2) throws IOException {
        c cVar;
        Socket socket;
        Socket e2;
        c cVar2;
        E e3;
        boolean z3;
        boolean z4;
        f.a aVar;
        while (true) {
            synchronized (this.f10525d) {
                if (this.l) {
                    throw new IllegalStateException("released");
                }
                if (this.o != null) {
                    throw new IllegalStateException("codec != null");
                }
                if (this.m) {
                    throw new IOException("Canceled#Reason=" + this.n);
                }
                cVar = this.j;
                socket = null;
                e2 = (cVar == null || !cVar.k) ? null : e(false, false, true);
                cVar2 = this.j;
                if (cVar2 != null) {
                    cVar = null;
                } else {
                    cVar2 = null;
                }
                if (!this.k) {
                    cVar = null;
                }
                if (cVar2 == null) {
                    okhttp3.F.a.a.h(this.f10525d, this.a, this, null);
                    c cVar3 = this.j;
                    if (cVar3 != null) {
                        z3 = true;
                        cVar2 = cVar3;
                        e3 = null;
                    } else {
                        e3 = this.f10524c;
                    }
                } else {
                    e3 = null;
                }
                z3 = false;
            }
            okhttp3.F.c.h(e2);
            if (cVar != null) {
                this.f10527f.k(this.f10526e, cVar);
            }
            if (z3) {
                this.f10527f.j(this.f10526e, cVar2);
            }
            if (cVar2 != null) {
                this.f10524c = this.j.n();
            } else {
                if (e3 != null || ((aVar = this.b) != null && aVar.b())) {
                    z4 = false;
                } else {
                    this.b = this.h.d();
                    if (okhttp3.G.a.j().e() <= 0 || !okhttp3.G.a.j().l()) {
                        this.b.e(false);
                    }
                    z4 = true;
                }
                synchronized (this.f10525d) {
                    if (this.m) {
                        throw new IOException("Canceled#Reason=" + this.n);
                    }
                    if (z4) {
                        ArrayList arrayList = (ArrayList) this.b.a();
                        int size = arrayList.size();
                        int i5 = 0;
                        while (true) {
                            if (i5 >= size) {
                                break;
                            }
                            E e4 = (E) arrayList.get(i5);
                            okhttp3.F.a.a.h(this.f10525d, this.a, this, e4);
                            c cVar4 = this.j;
                            if (cVar4 != null) {
                                this.f10524c = e4;
                                z3 = true;
                                cVar2 = cVar4;
                                break;
                            }
                            i5++;
                        }
                    }
                    if (!z3) {
                        if (e3 == null) {
                            e3 = this.b.d();
                        }
                        this.f10524c = e3;
                        this.i = 0;
                        c cVar5 = new c(this.f10525d, e3);
                        a(cVar5, false);
                        cVar2 = cVar5;
                    }
                }
                if (z3) {
                    this.f10527f.j(this.f10526e, cVar2);
                } else {
                    f.a aVar2 = this.b;
                    int e5 = (aVar2 == null || !aVar2.c()) ? i : okhttp3.G.a.j().e();
                    if (this.b == null && this.f10524c != null && okhttp3.G.a.j().l() && okhttp3.G.a.j().e() > 0) {
                        e5 = okhttp3.G.a.j().e();
                    }
                    cVar2.d(e5, i2, i3, i4, z, this.f10526e, this.f10527f);
                    okhttp3.F.a.a.k(this.f10525d).a(cVar2.n());
                    synchronized (this.f10525d) {
                        this.k = true;
                        okhttp3.F.a.a.j(this.f10525d, cVar2);
                        if (cVar2.k()) {
                            socket = okhttp3.F.a.a.f(this.f10525d, this.a, this);
                            cVar2 = this.j;
                        }
                    }
                    okhttp3.F.c.h(socket);
                    this.f10527f.j(this.f10526e, cVar2);
                }
            }
            synchronized (this.f10525d) {
                if (cVar2.l == 0 && !cVar2.k()) {
                    return cVar2;
                }
                if (cVar2.j(z2)) {
                    return cVar2;
                }
                i();
            }
        }
    }

    public void a(c cVar, boolean z) {
        if (this.j != null) {
            throw new IllegalStateException();
        }
        this.j = cVar;
        this.k = z;
        cVar.n.add(new a(this, this.f10528g));
    }

    public void b(int i) {
        okhttp3.F.f.c cVar;
        c cVar2;
        synchronized (this.f10525d) {
            this.m = true;
            this.n = i;
            cVar = this.o;
            cVar2 = this.j;
        }
        if (cVar != null) {
            cVar.cancel();
        } else if (cVar2 != null) {
            cVar2.c();
        }
    }

    public okhttp3.F.f.c c() {
        okhttp3.F.f.c cVar;
        synchronized (this.f10525d) {
            cVar = this.o;
        }
        return cVar;
    }

    public synchronized c d() {
        return this.j;
    }

    public boolean g() {
        f.a aVar;
        return this.f10524c != null || ((aVar = this.b) != null && aVar.b()) || this.h.b();
    }

    public okhttp3.F.f.c h(x xVar, u.a aVar, boolean z) {
        okhttp3.F.f.f fVar = (okhttp3.F.f.f) aVar;
        int b = fVar.b();
        int h = fVar.h();
        int k = fVar.k();
        int n = xVar.n();
        InterfaceC0836d interfaceC0836d = this.f10526e;
        if (interfaceC0836d != null && ((y) interfaceC0836d).f() != null && ((y) this.f10526e).f().url() != null && ((y) this.f10526e).f().url().k() != null) {
            n = xVar.o(((y) this.f10526e).f().url().k(), ((y) this.f10526e).f().url().t());
        }
        try {
            okhttp3.F.f.c l = f(b, h, k, n, xVar.t(), z).l(xVar, fVar, this);
            synchronized (this.f10525d) {
                this.o = l;
            }
            return l;
        } catch (IOException e2) {
            throw new e(e2);
        }
    }

    public void i() {
        c cVar;
        Socket e2;
        synchronized (this.f10525d) {
            cVar = this.j;
            e2 = e(true, false, false);
            if (this.j != null) {
                cVar = null;
            }
        }
        okhttp3.F.c.h(e2);
        if (cVar != null) {
            this.f10527f.k(this.f10526e, cVar);
        }
    }

    public void j() {
        c cVar;
        Socket e2;
        synchronized (this.f10525d) {
            cVar = this.j;
            e2 = e(false, true, false);
            if (this.j != null) {
                cVar = null;
            }
        }
        okhttp3.F.c.h(e2);
        if (cVar != null) {
            okhttp3.F.a.a.m(this.f10526e, null);
            this.f10527f.k(this.f10526e, cVar);
            this.f10527f.a(this.f10526e);
        }
    }

    public Socket k(c cVar) {
        if (this.o != null || this.j.n.size() != 1) {
            throw new IllegalStateException();
        }
        Reference<g> reference = this.j.n.get(0);
        Socket e2 = e(true, false, false);
        this.j = cVar;
        cVar.n.add(reference);
        return e2;
    }

    public void l(int i) {
        this.h.e(i);
        this.b = null;
    }

    public E m() {
        return this.f10524c;
    }

    public void n(IOException iOException) {
        c cVar;
        boolean z;
        Socket e2;
        synchronized (this.f10525d) {
            cVar = null;
            if (iOException instanceof p) {
                ErrorCode errorCode = ((p) iOException).a;
                if (errorCode == ErrorCode.REFUSED_STREAM) {
                    int i = this.i + 1;
                    this.i = i;
                    if (i > 1) {
                        this.f10524c = null;
                        z = true;
                    }
                    z = false;
                } else {
                    if (errorCode != ErrorCode.CANCEL) {
                        this.f10524c = null;
                        z = true;
                    }
                    z = false;
                }
            } else {
                c cVar2 = this.j;
                if (cVar2 != null && (!cVar2.k() || (iOException instanceof okhttp3.internal.http2.a))) {
                    if (this.j.l == 0) {
                        E e3 = this.f10524c;
                        if (e3 != null && iOException != null) {
                            this.h.a(e3, iOException);
                        }
                        this.f10524c = null;
                    }
                    z = true;
                }
                z = false;
            }
            c cVar3 = this.j;
            e2 = e(z, false, true);
            if (this.j == null && this.k) {
                cVar = cVar3;
            }
        }
        okhttp3.F.c.h(e2);
        if (cVar != null) {
            this.f10527f.k(this.f10526e, cVar);
        }
    }

    public void o(boolean z, okhttp3.F.f.c cVar, long j, IOException iOException) {
        c cVar2;
        Socket e2;
        boolean z2;
        this.f10527f.s(this.f10526e, j);
        synchronized (this.f10525d) {
            if (cVar != null) {
                if (cVar == this.o) {
                    if (!z) {
                        this.j.l++;
                    }
                    cVar2 = this.j;
                    e2 = e(z, false, true);
                    if (this.j != null) {
                        cVar2 = null;
                    }
                    z2 = this.l;
                }
            }
            throw new IllegalStateException("expected " + this.o + " but was " + cVar);
        }
        okhttp3.F.c.h(e2);
        if (cVar2 != null) {
            this.f10527f.k(this.f10526e, cVar2);
        }
        if (iOException != null) {
            this.f10527f.b(this.f10526e, okhttp3.F.a.a.m(this.f10526e, iOException));
        } else if (z2) {
            okhttp3.F.a.a.m(this.f10526e, null);
            this.f10527f.a(this.f10526e);
        }
    }

    public String toString() {
        c d2 = d();
        return d2 != null ? d2.toString() : this.a.toString();
    }
}
