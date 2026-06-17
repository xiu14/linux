package e.c.e.b.a.i.i;

import com.facebook.imagepipeline.request.ImageRequest;
import e.c.e.b.a.i.h;

/* loaded from: classes2.dex */
public class c extends e.c.h.l.b {
    private final com.facebook.common.time.b a;
    private final h b;

    public c(com.facebook.common.time.b bVar, h hVar) {
        this.a = bVar;
        this.b = hVar;
    }

    @Override // e.c.h.l.b, e.c.h.l.f
    public void a(ImageRequest imageRequest, Object obj, String str, boolean z) {
        this.b.r(this.a.now());
        this.b.p(imageRequest);
        this.b.d(obj);
        this.b.w(str);
        this.b.v(z);
    }

    @Override // e.c.h.l.b, e.c.h.l.f
    public void c(ImageRequest imageRequest, String str, boolean z) {
        this.b.q(this.a.now());
        this.b.p(imageRequest);
        this.b.w(str);
        this.b.v(z);
    }

    @Override // e.c.h.l.b, e.c.h.l.f
    public void g(ImageRequest imageRequest, String str, Throwable th, boolean z) {
        this.b.q(this.a.now());
        this.b.p(imageRequest);
        this.b.w(str);
        this.b.v(z);
    }

    @Override // e.c.h.l.b, e.c.h.l.f
    public void k(String str) {
        this.b.q(this.a.now());
        this.b.w(str);
    }
}
