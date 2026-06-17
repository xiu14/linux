package com.facebook.imagepipeline.request;

import android.net.Uri;
import android.text.TextUtils;
import com.facebook.imagepipeline.common.Priority;
import com.facebook.imagepipeline.common.f;
import com.huawei.hms.push.constant.RemoteMessageConst;
import e.c.c.d.h;
import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes2.dex */
public class ImageRequest {
    public static final e.c.c.d.d<ImageRequest, Uri> B = new a();
    private boolean A;
    private final CacheChoice a;
    private final Uri b;

    /* renamed from: c, reason: collision with root package name */
    private final List<Uri> f6676c;

    /* renamed from: d, reason: collision with root package name */
    private final int f6677d;

    /* renamed from: e, reason: collision with root package name */
    private File f6678e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f6679f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f6680g;
    private final boolean h;
    private final boolean i;
    private final com.facebook.imagepipeline.common.c j;
    private final com.facebook.imagepipeline.common.e k;
    private final f l;
    private final com.facebook.imagepipeline.common.a m;
    private final Priority n;
    private final RequestLevel o;
    private final boolean p;
    private final boolean q;
    private final Boolean r;
    private final c s;
    private final e.c.h.l.f t;
    private long u;
    private final String v;
    private boolean w;
    private boolean x;
    private Map<String, String> y;
    private int z;

    public enum CacheChoice {
        CUSTOM,
        SMALL,
        DEFAULT
    }

    public enum RequestLevel {
        FULL_FETCH(1),
        DISK_CACHE(2),
        ENCODED_MEMORY_CACHE(3),
        BITMAP_MEMORY_CACHE(4);

        private int mValue;

        RequestLevel(int i) {
            this.mValue = i;
        }

        public static RequestLevel getMax(RequestLevel requestLevel, RequestLevel requestLevel2) {
            return requestLevel.getValue() > requestLevel2.getValue() ? requestLevel : requestLevel2;
        }

        public int getValue() {
            return this.mValue;
        }
    }

    static class a implements e.c.c.d.d<ImageRequest, Uri> {
        a() {
        }

        @Override // e.c.c.d.d
        public Uri apply(ImageRequest imageRequest) {
            ImageRequest imageRequest2 = imageRequest;
            if (imageRequest2 != null) {
                return imageRequest2.v();
            }
            return null;
        }
    }

    protected ImageRequest(b bVar) {
        String lowerCase;
        this.a = bVar.f();
        Uri q = bVar.q();
        this.b = q;
        this.f6676c = bVar.d();
        int i = -1;
        if (q != null) {
            if (com.facebook.common.util.c.h(q)) {
                i = 0;
            } else {
                String str = null;
                if (com.facebook.common.util.c.f(q)) {
                    String path = q.getPath();
                    Map<String, String> map = e.c.c.f.a.a;
                    int lastIndexOf = path.lastIndexOf(46);
                    String substring = (lastIndexOf < 0 || lastIndexOf == path.length() + (-1)) ? null : path.substring(lastIndexOf + 1);
                    if (substring != null && (str = e.c.c.f.b.a((lowerCase = substring.toLowerCase(Locale.US)))) == null) {
                        str = e.c.c.f.a.a.get(lowerCase);
                    }
                    i = e.c.c.f.a.a(str) ? 2 : 3;
                } else if (com.facebook.common.util.c.e(q)) {
                    i = (TextUtils.isEmpty(null) || !e.c.c.f.a.a(null)) ? 4 : 9;
                } else if ("asset".equals(com.facebook.common.util.c.b(q))) {
                    i = 5;
                } else if (com.facebook.common.util.c.g(q)) {
                    i = 6;
                } else if (RemoteMessageConst.DATA.equals(com.facebook.common.util.c.b(q))) {
                    i = 7;
                } else if ("android.resource".equals(com.facebook.common.util.c.b(q))) {
                    i = 8;
                }
            }
        }
        this.f6677d = i;
        this.f6679f = bVar.w();
        this.h = bVar.v();
        this.f6680g = bVar.x();
        this.i = bVar.s();
        this.j = bVar.j();
        this.k = bVar.o();
        this.l = bVar.p() == null ? f.a() : bVar.p();
        this.m = bVar.e();
        this.n = bVar.n();
        this.o = bVar.k();
        this.p = bVar.r();
        this.q = bVar.t();
        this.r = bVar.H();
        this.s = bVar.l();
        this.t = bVar.m();
        this.u = bVar.h();
        this.v = bVar.g();
        this.w = bVar.u();
        this.y = bVar.i();
        this.z = bVar.c();
    }

    public static ImageRequest a(Uri uri) {
        if (uri == null) {
            return null;
        }
        return b.y(uri).a();
    }

    public boolean A() {
        return this.A;
    }

    public void B(boolean z) {
        this.x = z;
    }

    public void C(boolean z) {
        this.A = z;
    }

    public int b() {
        return this.z;
    }

    public com.facebook.imagepipeline.common.a c() {
        return this.m;
    }

    public CacheChoice d() {
        return this.a;
    }

    public String e() {
        return this.v;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ImageRequest)) {
            return false;
        }
        ImageRequest imageRequest = (ImageRequest) obj;
        if (this.i == imageRequest.i && this.p == imageRequest.p && this.q == imageRequest.q && h.h(this.b, imageRequest.b) && h.h(this.a, imageRequest.a) && h.h(this.f6678e, imageRequest.f6678e) && h.h(this.m, imageRequest.m) && h.h(this.j, imageRequest.j) && h.h(this.k, imageRequest.k) && h.h(this.n, imageRequest.n) && h.h(this.o, imageRequest.o) && h.h(this.r, imageRequest.r)) {
            if (h.h(null, null) && h.h(this.l, imageRequest.l)) {
                c cVar = this.s;
                com.facebook.cache.common.b c2 = cVar != null ? cVar.c() : null;
                c cVar2 = imageRequest.s;
                return h.h(c2, cVar2 != null ? cVar2.c() : null);
            }
        }
        return false;
    }

    public long f() {
        return this.u;
    }

    public boolean g() {
        return this.x;
    }

    public com.facebook.imagepipeline.common.c h() {
        return this.j;
    }

    public int hashCode() {
        c cVar = this.s;
        return Arrays.hashCode(new Object[]{this.a, this.b, Boolean.valueOf(this.i), this.m, this.n, this.o, Boolean.valueOf(this.p), Boolean.valueOf(this.q), this.j, this.r, this.k, this.l, cVar != null ? cVar.c() : null, null});
    }

    public boolean i() {
        return this.i;
    }

    public RequestLevel j() {
        return this.o;
    }

    public c k() {
        return this.s;
    }

    public int l() {
        com.facebook.imagepipeline.common.e eVar = this.k;
        if (eVar != null) {
            return eVar.b;
        }
        return 2048;
    }

    public int m() {
        com.facebook.imagepipeline.common.e eVar = this.k;
        if (eVar != null) {
            return eVar.a;
        }
        return 2048;
    }

    public Priority n() {
        return this.n;
    }

    public boolean o() {
        return this.h;
    }

    public boolean p() {
        return this.f6679f;
    }

    public boolean q() {
        return this.f6680g;
    }

    public e.c.h.l.f r() {
        return this.t;
    }

    public com.facebook.imagepipeline.common.e s() {
        return this.k;
    }

    public f t() {
        return this.l;
    }

    public String toString() {
        h.b k = h.k(this);
        k.b("uri", this.b);
        k.b("cacheChoice", this.a);
        k.b("decodeOptions", this.j);
        k.b("postprocessor", this.s);
        k.b(RemoteMessageConst.Notification.PRIORITY, this.n);
        k.b("resizeOptions", this.k);
        k.b("rotationOptions", this.l);
        k.b("bytesRange", this.m);
        k.b("resizingAllowedOverride", null);
        k.c("progressiveRenderingEnabled", this.f6679f);
        k.c("localThumbnailPreviewsEnabled", this.i);
        k.b("lowestPermittedRequestLevel", this.o);
        k.c("isDiskCacheEnabled", this.p);
        k.c("isMemoryCacheEnabled", this.q);
        k.b("decodePrefetches", this.r);
        return k.toString();
    }

    public synchronized File u() {
        if (this.f6678e == null) {
            this.f6678e = new File(this.b.getPath());
        }
        return this.f6678e;
    }

    public Uri v() {
        return this.b;
    }

    public int w() {
        return this.f6677d;
    }

    public boolean x() {
        return this.p;
    }

    public boolean y() {
        return this.q;
    }

    public boolean z() {
        return this.w;
    }
}
