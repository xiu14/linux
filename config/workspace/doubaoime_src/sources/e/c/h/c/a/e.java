package e.c.h.c.a;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import com.facebook.common.memory.g;
import com.facebook.imagepipeline.animated.impl.AnimatedImageCompositor;
import com.facebook.imagepipeline.image.f;
import com.facebook.imagepipeline.image.i;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* loaded from: classes2.dex */
public class e implements d {

    /* renamed from: c, reason: collision with root package name */
    static e.c.h.c.a.c f9849c = i("com.facebook.animated.gif.GifImage");

    /* renamed from: d, reason: collision with root package name */
    static e.c.h.c.a.c f9850d = i("com.facebook.animated.webp.WebPImage");

    /* renamed from: e, reason: collision with root package name */
    static e.c.h.c.a.c f9851e = i("com.bytedance.fresco.animatedheif.HeifImage");
    private final com.facebook.imagepipeline.animated.impl.b a;
    private final e.c.h.d.b b;

    class a implements AnimatedImageCompositor.a {
        a(e eVar) {
        }

        @Override // com.facebook.imagepipeline.animated.impl.AnimatedImageCompositor.a
        public void a(int i, Bitmap bitmap) {
        }

        @Override // com.facebook.imagepipeline.animated.impl.AnimatedImageCompositor.a
        public e.c.c.g.a<Bitmap> b(int i) {
            return null;
        }
    }

    class b implements AnimatedImageCompositor.a {
        final /* synthetic */ List a;

        b(e eVar, List list) {
            this.a = list;
        }

        @Override // com.facebook.imagepipeline.animated.impl.AnimatedImageCompositor.a
        public void a(int i, Bitmap bitmap) {
        }

        @Override // com.facebook.imagepipeline.animated.impl.AnimatedImageCompositor.a
        public e.c.c.g.a<Bitmap> b(int i) {
            return e.c.c.g.a.h((e.c.c.g.a) this.a.get(i));
        }
    }

    class c implements AnimatedImageCompositor.a {
        final /* synthetic */ List a;

        c(e eVar, List list) {
            this.a = list;
        }

        @Override // com.facebook.imagepipeline.animated.impl.AnimatedImageCompositor.a
        public void a(int i, Bitmap bitmap) {
        }

        @Override // com.facebook.imagepipeline.animated.impl.AnimatedImageCompositor.a
        public e.c.c.g.a<Bitmap> b(int i) {
            return e.c.c.g.a.h((e.c.c.g.a) this.a.get(i));
        }
    }

    public e(com.facebook.imagepipeline.animated.impl.b bVar, e.c.h.d.b bVar2) {
        this.a = bVar;
        this.b = bVar2;
    }

    @SuppressLint({"NewApi"})
    private e.c.c.g.a<Bitmap> a(int i, int i2, Bitmap.Config config) {
        e.c.c.g.a<Bitmap> a2 = this.b.a(i, i2, config);
        a2.r().eraseColor(0);
        a2.r().setHasAlpha(true);
        return a2;
    }

    private e.c.c.g.a<Bitmap> b(com.facebook.imagepipeline.animated.base.b bVar, Bitmap.Config config, int i) {
        e.c.c.g.a<Bitmap> a2 = a(bVar.getWidth(), bVar.getHeight(), config);
        new AnimatedImageCompositor(this.a.a(com.facebook.imagepipeline.animated.base.d.b(bVar), null), new a(this)).d(i, a2.r());
        return a2;
    }

    private List<e.c.c.g.a<Bitmap>> c(com.facebook.imagepipeline.animated.base.b bVar, Bitmap.Config config) {
        com.facebook.imagepipeline.animated.impl.a aVar = (com.facebook.imagepipeline.animated.impl.a) this.a.a(com.facebook.imagepipeline.animated.base.d.b(bVar), null);
        ArrayList arrayList = new ArrayList(aVar.e());
        AnimatedImageCompositor animatedImageCompositor = new AnimatedImageCompositor(aVar, new b(this, arrayList));
        for (int i = 0; i < aVar.e(); i++) {
            e.c.c.g.a<Bitmap> a2 = a(aVar.k(), aVar.g(), config);
            animatedImageCompositor.d(i, a2.r());
            arrayList.add(a2);
        }
        return arrayList;
    }

    private List<e.c.c.g.a<Bitmap>> d(com.facebook.imagepipeline.animated.base.b bVar, Bitmap.Config config, int i) {
        com.facebook.imagepipeline.animated.impl.a aVar = (com.facebook.imagepipeline.animated.impl.a) this.a.a(com.facebook.imagepipeline.animated.base.d.b(bVar), null);
        int e2 = aVar.e();
        if (i > e2) {
            i = e2;
        }
        aVar.q(1);
        ArrayList arrayList = new ArrayList(i);
        AnimatedImageCompositor animatedImageCompositor = new AnimatedImageCompositor(aVar, new c(this, arrayList));
        for (int i2 = 0; i2 < i; i2++) {
            e.c.c.g.a<Bitmap> a2 = a(aVar.k(), aVar.g(), config);
            try {
                animatedImageCompositor.d(i2, a2.r());
                arrayList.add(a2);
            } catch (IllegalStateException e3) {
                e.c.c.e.a.y("AnimatedImageFactoryImp", e3, "preview decode failed", new Object[0]);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Iterable, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v2, types: [com.facebook.imagepipeline.animated.base.e] */
    private com.facebook.imagepipeline.image.d h(com.facebook.imagepipeline.common.c cVar, com.facebook.imagepipeline.animated.base.b bVar, e.c.g.d dVar) {
        ?? r2;
        List<e.c.c.g.a<Bitmap>> list;
        e.c.c.g.a<Bitmap> aVar = null;
        try {
            int a2 = cVar.f6454e ? bVar.a() - 1 : 0;
            if (cVar.f6456g) {
                com.facebook.imagepipeline.image.e eVar = new com.facebook.imagepipeline.image.e(b(bVar, cVar.h, a2), i.f6481d, 0);
                e.c.c.g.a.p(null);
                return eVar;
            }
            r2 = e.c.g.c.b(dVar);
            try {
                if (r2 == 0) {
                    if (cVar.f6455f) {
                        List<e.c.c.g.a<Bitmap>> c2 = c(bVar, cVar.h);
                        ArrayList arrayList = (ArrayList) c2;
                        list = c2;
                        if (arrayList.size() > a2) {
                            aVar = e.c.c.g.a.h((e.c.c.g.a) arrayList.get(a2));
                            list = c2;
                        }
                    } else {
                        int i = cVar.f6453d;
                        if (i > 0) {
                            List<e.c.c.g.a<Bitmap>> d2 = d(bVar, cVar.h, i);
                            ArrayList arrayList2 = (ArrayList) d2;
                            list = d2;
                            if (arrayList2.size() > a2) {
                                aVar = e.c.c.g.a.h((e.c.c.g.a) arrayList2.get(a2));
                                list = d2;
                            }
                        } else {
                            list = null;
                        }
                    }
                    r2 = list;
                    r2 = list;
                    if (cVar.f6452c && aVar == null) {
                        aVar = b(bVar, cVar.h, a2);
                        r2 = list;
                    }
                } else {
                    r2 = 0;
                }
                ?? g2 = com.facebook.imagepipeline.animated.base.d.g(bVar);
                g2.g(aVar);
                g2.f(a2);
                g2.e(r2);
                com.facebook.imagepipeline.image.a aVar2 = new com.facebook.imagepipeline.image.a(g2.a(), cVar, dVar);
                if (aVar != null) {
                    aVar.close();
                }
                e.c.c.g.a.p(r2);
                return aVar2;
            } catch (Throwable th) {
                th = th;
                int i2 = e.c.c.g.a.h;
                if (aVar != null) {
                    aVar.close();
                }
                e.c.c.g.a.p(r2);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            r2 = 0;
        }
    }

    private static e.c.h.c.a.c i(String str) {
        try {
            return (e.c.h.c.a.c) Class.forName(str).newInstance();
        } catch (Throwable unused) {
            return null;
        }
    }

    public com.facebook.imagepipeline.image.d e(f fVar, com.facebook.imagepipeline.common.c cVar, Bitmap.Config config) {
        if (f9849c == null) {
            throw new UnsupportedOperationException("To encode animated gif please add the dependency to the animated-gif module");
        }
        e.c.c.g.a<g> l = fVar.l();
        Objects.requireNonNull(l);
        try {
            g r = l.r();
            return h(cVar, r.g() != null ? f9849c.j(r.g()) : f9849c.f(r.i(), r.size()), fVar.z());
        } finally {
            l.close();
        }
    }

    public com.facebook.imagepipeline.image.d f(f fVar, com.facebook.imagepipeline.common.c cVar, Bitmap.Config config) {
        if (f9850d == null) {
            throw new UnsupportedOperationException("To encode animated heif please add the dependency to the animated-heif module");
        }
        e.c.c.g.a<g> l = fVar.l();
        Objects.requireNonNull(l);
        try {
            g r = l.r();
            com.facebook.imagepipeline.animated.base.b j = r.g() != null ? f9851e.j(r.g()) : f9851e.f(r.i(), r.size());
            if (j instanceof com.facebook.imagepipeline.animated.base.f) {
                ((com.facebook.imagepipeline.animated.base.f) j).m(fVar.p());
            }
            return h(cVar, j, fVar.z());
        } finally {
            l.close();
        }
    }

    public com.facebook.imagepipeline.image.d g(f fVar, com.facebook.imagepipeline.common.c cVar, Bitmap.Config config) {
        if (f9850d == null) {
            throw new UnsupportedOperationException("To encode animated webp please add the dependency to the animated-webp module");
        }
        e.c.c.g.a<g> l = fVar.l();
        Objects.requireNonNull(l);
        try {
            g r = l.r();
            com.facebook.imagepipeline.animated.base.b j = r.g() != null ? f9850d.j(r.g()) : f9850d.f(r.i(), r.size());
            if (j instanceof com.facebook.imagepipeline.animated.base.f) {
                ((com.facebook.imagepipeline.animated.base.f) j).m(fVar.p());
            }
            return h(cVar, j, fVar.z());
        } finally {
            l.close();
        }
    }
}
