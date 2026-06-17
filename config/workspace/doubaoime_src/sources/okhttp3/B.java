package okhttp3;

import java.io.Closeable;
import java.util.List;
import java.util.Objects;
import okhttp3.s;

/* loaded from: classes2.dex */
public final class B implements Closeable {
    final Request a;
    final Protocol b;

    /* renamed from: c, reason: collision with root package name */
    final int f10485c;

    /* renamed from: d, reason: collision with root package name */
    final String f10486d;

    /* renamed from: e, reason: collision with root package name */
    final r f10487e;

    /* renamed from: f, reason: collision with root package name */
    final s f10488f;

    /* renamed from: g, reason: collision with root package name */
    final D f10489g;
    final B h;
    final B i;
    final B j;
    final long k;
    final long l;
    private volatile C0835c m;

    B(a aVar) {
        this.a = aVar.a;
        this.b = aVar.b;
        this.f10485c = aVar.f10490c;
        this.f10486d = aVar.f10491d;
        this.f10487e = aVar.f10492e;
        this.f10488f = new s(aVar.f10493f);
        this.f10489g = aVar.f10494g;
        this.h = aVar.h;
        this.i = aVar.i;
        this.j = aVar.j;
        this.k = aVar.k;
        this.l = aVar.l;
    }

    public String A() {
        return this.f10486d;
    }

    public B D() {
        return this.h;
    }

    public a G() {
        return new a(this);
    }

    public B H() {
        return this.j;
    }

    public Protocol I() {
        return this.b;
    }

    public long M() {
        return this.l;
    }

    public Request N() {
        return this.a;
    }

    public long P() {
        return this.k;
    }

    public D a() {
        return this.f10489g;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        D d2 = this.f10489g;
        if (d2 == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed");
        }
        d2.close();
    }

    public C0835c d() {
        C0835c c0835c = this.m;
        if (c0835c != null) {
            return c0835c;
        }
        C0835c j = C0835c.j(this.f10488f);
        this.m = j;
        return j;
    }

    public B h() {
        return this.i;
    }

    public int l() {
        return this.f10485c;
    }

    public r o() {
        return this.f10487e;
    }

    public String p(String str) {
        String d2 = this.f10488f.d(str);
        if (d2 != null) {
            return d2;
        }
        return null;
    }

    public String r(String str, String str2) {
        String d2 = this.f10488f.d(str);
        if (d2 != null) {
            return d2;
        }
        return null;
    }

    public List<String> s(String str) {
        return this.f10488f.l(str);
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("Response{protocol=");
        M.append(this.b);
        M.append(", code=");
        M.append(this.f10485c);
        M.append(", message=");
        M.append(this.f10486d);
        M.append(", url=");
        M.append(this.a.url());
        M.append('}');
        return M.toString();
    }

    public s w() {
        return this.f10488f;
    }

    public boolean x() {
        int i = this.f10485c;
        if (i == 307 || i == 308) {
            return true;
        }
        switch (i) {
            case 300:
            case 301:
            case 302:
            case 303:
                return true;
            default:
                return false;
        }
    }

    public boolean z() {
        int i = this.f10485c;
        return i >= 200 && i < 300;
    }

    public static class a {
        Request a;
        Protocol b;

        /* renamed from: c, reason: collision with root package name */
        int f10490c;

        /* renamed from: d, reason: collision with root package name */
        String f10491d;

        /* renamed from: e, reason: collision with root package name */
        r f10492e;

        /* renamed from: f, reason: collision with root package name */
        s.a f10493f;

        /* renamed from: g, reason: collision with root package name */
        D f10494g;
        B h;
        B i;
        B j;
        long k;
        long l;

        public a() {
            this.f10490c = -1;
            this.f10493f = new s.a();
        }

        private void e(String str, B b) {
            if (b.f10489g != null) {
                throw new IllegalArgumentException(e.a.a.a.a.s(str, ".body != null"));
            }
            if (b.h != null) {
                throw new IllegalArgumentException(e.a.a.a.a.s(str, ".networkResponse != null"));
            }
            if (b.i != null) {
                throw new IllegalArgumentException(e.a.a.a.a.s(str, ".cacheResponse != null"));
            }
            if (b.j != null) {
                throw new IllegalArgumentException(e.a.a.a.a.s(str, ".priorResponse != null"));
            }
        }

        public a a(String str, String str2) {
            this.f10493f.a(str, str2);
            return this;
        }

        public a b(D d2) {
            this.f10494g = d2;
            return this;
        }

        public B c() {
            if (this.a == null) {
                throw new IllegalStateException("request == null");
            }
            if (this.b == null) {
                throw new IllegalStateException("protocol == null");
            }
            if (this.f10490c >= 0) {
                if (this.f10491d != null) {
                    return new B(this);
                }
                throw new IllegalStateException("message == null");
            }
            StringBuilder M = e.a.a.a.a.M("code < 0: ");
            M.append(this.f10490c);
            throw new IllegalStateException(M.toString());
        }

        public a d(B b) {
            if (b != null) {
                e("cacheResponse", b);
            }
            this.i = b;
            return this;
        }

        public a f(int i) {
            this.f10490c = i;
            return this;
        }

        public a g(r rVar) {
            this.f10492e = rVar;
            return this;
        }

        public a h(String str, String str2) {
            s.a aVar = this.f10493f;
            Objects.requireNonNull(aVar);
            s.b(str);
            s.c(str2, str);
            aVar.d(str);
            aVar.a.add(str);
            aVar.a.add(str2.trim());
            return this;
        }

        public a i(s sVar) {
            this.f10493f = sVar.g();
            return this;
        }

        public a j(String str) {
            this.f10491d = str;
            return this;
        }

        public a k(B b) {
            if (b != null) {
                e("networkResponse", b);
            }
            this.h = b;
            return this;
        }

        public a l(B b) {
            if (b.f10489g != null) {
                throw new IllegalArgumentException("priorResponse.body != null");
            }
            this.j = b;
            return this;
        }

        public a m(Protocol protocol) {
            this.b = protocol;
            return this;
        }

        public a n(long j) {
            this.l = j;
            return this;
        }

        public a o(Request request) {
            this.a = request;
            return this;
        }

        public a p(long j) {
            this.k = j;
            return this;
        }

        a(B b) {
            this.f10490c = -1;
            this.a = b.a;
            this.b = b.b;
            this.f10490c = b.f10485c;
            this.f10491d = b.f10486d;
            this.f10492e = b.f10487e;
            this.f10493f = b.f10488f.g();
            this.f10494g = b.f10489g;
            this.h = b.h;
            this.i = b.i;
            this.j = b.j;
            this.k = b.k;
            this.l = b.l;
        }
    }
}
