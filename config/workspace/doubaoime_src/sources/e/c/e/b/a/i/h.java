package e.c.e.b.a.i;

import com.facebook.imagepipeline.request.ImageRequest;
import e.c.f.b.a.b;

/* loaded from: classes2.dex */
public class h {
    private b.a A;
    private String a;
    private String b;

    /* renamed from: c, reason: collision with root package name */
    private ImageRequest f9782c;

    /* renamed from: d, reason: collision with root package name */
    private Object f9783d;

    /* renamed from: e, reason: collision with root package name */
    private com.facebook.imagepipeline.image.h f9784e;

    /* renamed from: f, reason: collision with root package name */
    private ImageRequest f9785f;

    /* renamed from: g, reason: collision with root package name */
    private ImageRequest f9786g;
    private ImageRequest[] h;
    private String q;
    private boolean r;
    private Throwable u;
    private long i = -1;
    private long j = -1;
    private long k = -1;
    private long l = -1;
    private long m = -1;
    private long n = -1;
    private long o = -1;
    private int p = 1;
    private int s = -1;
    private int t = -1;
    private int v = -1;
    private int w = -1;
    private long x = -1;
    private long y = -1;
    private long z = -1;

    public d A() {
        return new d(this.a, this.b, this.f9782c, this.f9783d, this.f9784e, this.f9785f, this.f9786g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.w, this.x, this.y, null, this.z, this.A);
    }

    public int a() {
        return this.v;
    }

    public void b() {
        this.b = null;
        this.f9782c = null;
        this.f9783d = null;
        this.f9784e = null;
        this.f9785f = null;
        this.f9786g = null;
        this.h = null;
        this.p = 1;
        this.q = null;
        this.r = false;
        this.s = -1;
        this.t = -1;
        this.u = null;
        this.v = -1;
        this.w = -1;
        this.A = null;
        c();
    }

    public void c() {
        this.n = -1L;
        this.o = -1L;
        this.i = -1L;
        this.k = -1L;
        this.l = -1L;
        this.m = -1L;
        this.x = -1L;
        this.y = -1L;
        this.z = -1L;
    }

    public void d(Object obj) {
        this.f9783d = obj;
    }

    public void e(long j) {
        this.m = j;
    }

    public void f(long j) {
        this.l = j;
    }

    public void g(long j) {
        this.k = j;
    }

    public void h(String str) {
        this.a = str;
    }

    public void i(ImageRequest imageRequest, ImageRequest imageRequest2, ImageRequest[] imageRequestArr) {
        this.f9785f = imageRequest;
        this.f9786g = imageRequest2;
        this.h = imageRequestArr;
    }

    public void j(long j) {
        this.i = j;
    }

    public void k(Throwable th) {
        this.u = th;
    }

    public void l(b.a aVar) {
        this.A = aVar;
    }

    public void m(com.facebook.imagepipeline.image.h hVar) {
        this.f9784e = hVar;
    }

    public void n(int i) {
        this.v = i;
    }

    public void o(int i) {
        this.p = i;
    }

    public void p(ImageRequest imageRequest) {
        this.f9782c = imageRequest;
    }

    public void q(long j) {
        this.o = j;
    }

    public void r(long j) {
        this.n = j;
    }

    public void s(long j) {
        this.y = j;
    }

    public void t(int i) {
        this.t = i;
    }

    public void u(int i) {
        this.s = i;
    }

    public void v(boolean z) {
        this.r = z;
    }

    public void w(String str) {
        this.b = str;
    }

    public void x(String str) {
        this.q = str;
    }

    public void y(long j) {
        this.x = j;
    }

    public void z(boolean z) {
        this.w = z ? 1 : 2;
    }
}
