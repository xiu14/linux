package okhttp3.F.f;

import java.io.IOException;
import java.util.List;
import okhttp3.B;
import okhttp3.InterfaceC0836d;
import okhttp3.Request;
import okhttp3.o;
import okhttp3.u;

/* loaded from: classes2.dex */
public final class f implements u.a {
    private final List<u> a;
    private final okhttp3.F.e.g b;

    /* renamed from: c, reason: collision with root package name */
    private final c f10530c;

    /* renamed from: d, reason: collision with root package name */
    private final okhttp3.F.e.c f10531d;

    /* renamed from: e, reason: collision with root package name */
    private final int f10532e;

    /* renamed from: f, reason: collision with root package name */
    private final Request f10533f;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC0836d f10534g;
    private final o h;
    private final int i;
    private final int j;
    private final int k;
    private int l;

    public f(List<u> list, okhttp3.F.e.g gVar, c cVar, okhttp3.F.e.c cVar2, int i, Request request, InterfaceC0836d interfaceC0836d, o oVar, int i2, int i3, int i4) {
        this.a = list;
        this.f10531d = cVar2;
        this.b = gVar;
        this.f10530c = cVar;
        this.f10532e = i;
        this.f10533f = request;
        this.f10534g = interfaceC0836d;
        this.h = oVar;
        this.i = i2;
        this.j = i3;
        this.k = i4;
    }

    public InterfaceC0836d a() {
        return this.f10534g;
    }

    public int b() {
        return this.i;
    }

    public okhttp3.h c() {
        return this.f10531d;
    }

    public o d() {
        return this.h;
    }

    public c e() {
        return this.f10530c;
    }

    public B f(Request request) throws IOException {
        return g(request, this.b, this.f10530c, this.f10531d);
    }

    public B g(Request request, okhttp3.F.e.g gVar, c cVar, okhttp3.F.e.c cVar2) throws IOException {
        if (this.f10532e >= this.a.size()) {
            throw new AssertionError();
        }
        this.l++;
        if (this.f10530c != null && !this.f10531d.q(request.url())) {
            StringBuilder M = e.a.a.a.a.M("network interceptor ");
            M.append(this.a.get(this.f10532e - 1));
            M.append(" must retain the same host and port");
            throw new IllegalStateException(M.toString());
        }
        if (this.f10530c != null && this.l > 1) {
            StringBuilder M2 = e.a.a.a.a.M("network interceptor ");
            M2.append(this.a.get(this.f10532e - 1));
            M2.append(" must call proceed() exactly once");
            throw new IllegalStateException(M2.toString());
        }
        List<u> list = this.a;
        int i = this.f10532e;
        f fVar = new f(list, gVar, cVar, cVar2, i + 1, request, this.f10534g, this.h, this.i, this.j, this.k);
        u uVar = list.get(i);
        B a = uVar.a(fVar);
        if (cVar != null && this.f10532e + 1 < this.a.size() && fVar.l != 1) {
            throw new IllegalStateException("network interceptor " + uVar + " must call proceed() exactly once");
        }
        if (a == null) {
            throw new NullPointerException("interceptor " + uVar + " returned null");
        }
        if (a.a() != null) {
            return a;
        }
        throw new IllegalStateException("interceptor " + uVar + " returned a response with no body");
    }

    public int h() {
        return this.j;
    }

    public Request i() {
        return this.f10533f;
    }

    public okhttp3.F.e.g j() {
        return this.b;
    }

    public int k() {
        return this.k;
    }
}
