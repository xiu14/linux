package com.facebook.fresco.animation.factory;

import android.content.Context;
import android.graphics.Bitmap;
import com.facebook.common.time.RealtimeSinceBootClock;
import com.facebook.imagepipeline.image.k;
import e.c.c.b.h;
import e.c.h.f.j;
import e.c.h.g.f;

@e.c.c.d.c
/* loaded from: classes2.dex */
public class AnimatedFactoryV2Impl implements e.c.h.c.a.a {
    private final e.c.h.d.b a;
    private final f b;

    /* renamed from: c, reason: collision with root package name */
    private final j<com.facebook.cache.common.b, com.facebook.imagepipeline.image.d> f6427c;

    /* renamed from: d, reason: collision with root package name */
    private e.c.h.c.a.d f6428d;

    /* renamed from: e, reason: collision with root package name */
    private com.facebook.imagepipeline.animated.impl.b f6429e;

    /* renamed from: f, reason: collision with root package name */
    private e.c.h.c.b.a f6430f;

    /* renamed from: g, reason: collision with root package name */
    private e.c.h.k.a f6431g;

    class a implements e.c.h.j.c {
        final /* synthetic */ Bitmap.Config a;

        a(Bitmap.Config config) {
            this.a = config;
        }

        @Override // e.c.h.j.c
        public com.facebook.imagepipeline.image.d a(com.facebook.imagepipeline.image.f fVar, int i, k kVar, com.facebook.imagepipeline.common.c cVar) {
            return ((e.c.h.c.a.e) AnimatedFactoryV2Impl.e(AnimatedFactoryV2Impl.this)).e(fVar, cVar, this.a);
        }
    }

    class b implements e.c.h.j.c {
        final /* synthetic */ Bitmap.Config a;

        b(Bitmap.Config config) {
            this.a = config;
        }

        @Override // e.c.h.j.c
        public com.facebook.imagepipeline.image.d a(com.facebook.imagepipeline.image.f fVar, int i, k kVar, com.facebook.imagepipeline.common.c cVar) {
            return ((e.c.h.c.a.e) AnimatedFactoryV2Impl.e(AnimatedFactoryV2Impl.this)).g(fVar, cVar, this.a);
        }
    }

    class c implements e.c.h.j.c {
        final /* synthetic */ Bitmap.Config a;

        c(Bitmap.Config config) {
            this.a = config;
        }

        @Override // e.c.h.j.c
        public com.facebook.imagepipeline.image.d a(com.facebook.imagepipeline.image.f fVar, int i, k kVar, com.facebook.imagepipeline.common.c cVar) {
            return ((e.c.h.c.a.e) AnimatedFactoryV2Impl.e(AnimatedFactoryV2Impl.this)).f(fVar, cVar, this.a);
        }
    }

    @e.c.c.d.c
    public AnimatedFactoryV2Impl(e.c.h.d.b bVar, f fVar, j<com.facebook.cache.common.b, com.facebook.imagepipeline.image.d> jVar) {
        this.a = bVar;
        this.b = fVar;
        this.f6427c = jVar;
    }

    static e.c.h.c.a.d e(AnimatedFactoryV2Impl animatedFactoryV2Impl) {
        if (animatedFactoryV2Impl.f6428d == null) {
            animatedFactoryV2Impl.f6428d = new e.c.h.c.a.e(new d(animatedFactoryV2Impl), animatedFactoryV2Impl.a);
        }
        return animatedFactoryV2Impl.f6428d;
    }

    static e.c.h.c.b.a f(AnimatedFactoryV2Impl animatedFactoryV2Impl) {
        if (animatedFactoryV2Impl.f6430f == null) {
            animatedFactoryV2Impl.f6430f = new e.c.h.c.b.a();
        }
        return animatedFactoryV2Impl.f6430f;
    }

    @Override // e.c.h.c.a.a
    public e.c.h.k.a a(Context context) {
        if (this.f6431g == null) {
            com.facebook.fresco.animation.factory.a aVar = new com.facebook.fresco.animation.factory.a(this);
            e.c.c.b.d dVar = new e.c.c.b.d(this.b.a());
            com.facebook.fresco.animation.factory.b bVar = new com.facebook.fresco.animation.factory.b(this);
            if (this.f6429e == null) {
                this.f6429e = new com.facebook.fresco.animation.factory.c(this);
            }
            this.f6431g = new e(this.f6429e, h.b(), dVar, RealtimeSinceBootClock.get(), this.a, this.f6427c, aVar, bVar);
        }
        return this.f6431g;
    }

    @Override // e.c.h.c.a.a
    public e.c.h.j.c b(Bitmap.Config config) {
        return new a(config);
    }

    @Override // e.c.h.c.a.a
    public e.c.h.j.c c(Bitmap.Config config) {
        return new b(config);
    }

    @Override // e.c.h.c.a.a
    public e.c.h.j.c d(Bitmap.Config config) {
        return new c(config);
    }
}
