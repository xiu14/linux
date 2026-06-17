package e.c.f.a.b.f;

import e.c.f.a.a.d;

/* loaded from: classes2.dex */
public class a implements d {
    private final com.facebook.imagepipeline.animated.base.a a;

    public a(com.facebook.imagepipeline.animated.base.a aVar) {
        this.a = aVar;
    }

    @Override // e.c.f.a.a.d
    public int a() {
        return ((com.facebook.imagepipeline.animated.impl.a) this.a).e();
    }

    @Override // e.c.f.a.a.d
    public int c() {
        return ((com.facebook.imagepipeline.animated.impl.a) this.a).h();
    }

    public com.facebook.imagepipeline.animated.base.a d() {
        return this.a;
    }

    @Override // e.c.f.a.a.d
    public int f(int i) {
        return ((com.facebook.imagepipeline.animated.impl.a) this.a).d(i);
    }
}
