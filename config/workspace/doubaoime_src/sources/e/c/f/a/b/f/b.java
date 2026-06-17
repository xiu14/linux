package e.c.f.a.b.f;

import android.graphics.Bitmap;
import android.graphics.Rect;
import com.facebook.imagepipeline.animated.impl.AnimatedImageCompositor;
import e.c.f.a.b.c;

/* loaded from: classes2.dex */
public class b implements c {
    private final e.c.f.a.b.b a;
    private com.facebook.imagepipeline.animated.base.a b;

    /* renamed from: c, reason: collision with root package name */
    private AnimatedImageCompositor f9822c;

    /* renamed from: d, reason: collision with root package name */
    private final AnimatedImageCompositor.a f9823d;

    class a implements AnimatedImageCompositor.a {
        a() {
        }

        @Override // com.facebook.imagepipeline.animated.impl.AnimatedImageCompositor.a
        public void a(int i, Bitmap bitmap) {
        }

        @Override // com.facebook.imagepipeline.animated.impl.AnimatedImageCompositor.a
        public e.c.c.g.a<Bitmap> b(int i) {
            return b.this.a.d(i);
        }
    }

    public b(e.c.f.a.b.b bVar, com.facebook.imagepipeline.animated.base.a aVar) {
        a aVar2 = new a();
        this.f9823d = aVar2;
        this.a = bVar;
        this.b = aVar;
        this.f9822c = new AnimatedImageCompositor(aVar, aVar2);
    }

    public int b() {
        return ((com.facebook.imagepipeline.animated.impl.a) this.b).g();
    }

    public int c() {
        return ((com.facebook.imagepipeline.animated.impl.a) this.b).k();
    }

    public boolean d(int i, Bitmap bitmap) {
        try {
            this.f9822c.d(i, bitmap);
            return true;
        } catch (IllegalStateException e2) {
            e.c.c.e.a.h(b.class, e2, "Rendering of frame unsuccessful. Frame number: %d", Integer.valueOf(i));
            return false;
        }
    }

    public void e(Rect rect) {
        com.facebook.imagepipeline.animated.base.a a2 = ((com.facebook.imagepipeline.animated.impl.a) this.b).a(rect);
        if (a2 != this.b) {
            this.b = a2;
            this.f9822c = new AnimatedImageCompositor(a2, this.f9823d);
        }
    }
}
