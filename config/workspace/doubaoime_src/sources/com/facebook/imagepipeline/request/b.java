package com.facebook.imagepipeline.request;

import android.net.Uri;
import com.facebook.imagepipeline.common.Priority;
import com.facebook.imagepipeline.request.ImageRequest;
import e.c.h.l.f;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes2.dex */
public class b {
    private f q;
    private Map<String, String> t;
    private Uri a = null;
    private List<Uri> b = null;

    /* renamed from: c, reason: collision with root package name */
    private ImageRequest.RequestLevel f6681c = ImageRequest.RequestLevel.FULL_FETCH;

    /* renamed from: d, reason: collision with root package name */
    private com.facebook.imagepipeline.common.e f6682d = null;

    /* renamed from: e, reason: collision with root package name */
    private com.facebook.imagepipeline.common.f f6683e = null;

    /* renamed from: f, reason: collision with root package name */
    private com.facebook.imagepipeline.common.c f6684f = com.facebook.imagepipeline.common.c.a();

    /* renamed from: g, reason: collision with root package name */
    private ImageRequest.CacheChoice f6685g = ImageRequest.CacheChoice.DEFAULT;
    private boolean h = false;
    private boolean i = false;
    private boolean j = false;
    private boolean k = false;
    private Priority l = Priority.HIGH;
    private c m = null;
    private boolean n = true;
    private boolean o = true;
    private Boolean p = null;
    private com.facebook.imagepipeline.common.a r = null;
    private String s = null;
    private int u = 1;
    private long v = -1;
    private boolean w = true;

    public static class a extends RuntimeException {
        public a(String str) {
            super(e.a.a.a.a.s("Invalid request builder: ", str));
        }
    }

    private b() {
    }

    public static b b(ImageRequest imageRequest) {
        b y = y(imageRequest.v());
        y.f6684f = imageRequest.h();
        y.r = imageRequest.c();
        y.f6685g = imageRequest.d();
        y.k = imageRequest.i();
        y.f6681c = imageRequest.j();
        y.m = imageRequest.k();
        y.h = imageRequest.p();
        y.l = imageRequest.n();
        y.f6682d = imageRequest.s();
        y.q = imageRequest.r();
        y.f6683e = imageRequest.t();
        return y;
    }

    public static b y(Uri uri) {
        b bVar = new b();
        Objects.requireNonNull(uri);
        bVar.a = uri;
        return bVar;
    }

    public b A(com.facebook.imagepipeline.common.a aVar) {
        this.r = aVar;
        return this;
    }

    public b B(ImageRequest.CacheChoice cacheChoice) {
        this.f6685g = cacheChoice;
        return this;
    }

    public b C(com.facebook.imagepipeline.common.c cVar) {
        this.f6684f = cVar;
        return this;
    }

    public b D(boolean z) {
        this.h = z;
        return this;
    }

    public b E(Priority priority) {
        this.l = priority;
        return this;
    }

    public b F(com.facebook.imagepipeline.common.e eVar) {
        this.f6682d = eVar;
        return this;
    }

    public b G(com.facebook.imagepipeline.common.f fVar) {
        this.f6683e = fVar;
        return this;
    }

    public Boolean H() {
        return this.p;
    }

    public ImageRequest a() {
        Uri uri = this.a;
        if (uri == null) {
            throw new a("Source must be set!");
        }
        if (com.facebook.common.util.c.g(uri)) {
            if (!this.a.isAbsolute()) {
                throw new a("Resource URI path must be absolute.");
            }
            if (this.a.getPath().isEmpty()) {
                throw new a("Resource URI must not be empty");
            }
            try {
                Integer.parseInt(this.a.getPath().substring(1));
            } catch (NumberFormatException unused) {
                throw new a("Resource URI path must be a resource id.");
            }
        }
        if (this.s == null && this.f6685g.equals(ImageRequest.CacheChoice.CUSTOM)) {
            throw new a("CustomCacheName must be set as you have choice your cacheChoice as 'CUSTOM'");
        }
        if (!"asset".equals(com.facebook.common.util.c.b(this.a)) || this.a.isAbsolute()) {
            return new ImageRequest(this);
        }
        throw new a("Asset URI path must be absolute.");
    }

    public int c() {
        return this.u;
    }

    public List<Uri> d() {
        return this.b;
    }

    public com.facebook.imagepipeline.common.a e() {
        return this.r;
    }

    public ImageRequest.CacheChoice f() {
        return this.f6685g;
    }

    public String g() {
        return this.s;
    }

    public long h() {
        return this.v;
    }

    public Map<String, String> i() {
        return this.t;
    }

    public com.facebook.imagepipeline.common.c j() {
        return this.f6684f;
    }

    public ImageRequest.RequestLevel k() {
        return this.f6681c;
    }

    public c l() {
        return this.m;
    }

    public f m() {
        return this.q;
    }

    public Priority n() {
        return this.l;
    }

    public com.facebook.imagepipeline.common.e o() {
        return this.f6682d;
    }

    public com.facebook.imagepipeline.common.f p() {
        return this.f6683e;
    }

    public Uri q() {
        return this.a;
    }

    public boolean r() {
        return this.n && com.facebook.common.util.c.h(this.a);
    }

    public boolean s() {
        return this.k;
    }

    public boolean t() {
        return this.o;
    }

    public boolean u() {
        return this.w;
    }

    public boolean v() {
        return this.i;
    }

    public boolean w() {
        return this.h;
    }

    public boolean x() {
        return this.j;
    }

    @Deprecated
    public b z(boolean z) {
        if (z) {
            this.f6683e = com.facebook.imagepipeline.common.f.a();
            return this;
        }
        this.f6683e = com.facebook.imagepipeline.common.f.d();
        return this;
    }
}
