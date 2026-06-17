package com.facebook.imagepipeline.producers;

import com.facebook.imagepipeline.request.ImageRequest;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public abstract class E implements U<com.facebook.imagepipeline.image.f> {
    private final Executor a;
    private final com.facebook.common.memory.h b;

    class a extends d0<com.facebook.imagepipeline.image.f> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ImageRequest f6534f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ X f6535g;
        final /* synthetic */ V h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC0732l interfaceC0732l, X x, V v, String str, ImageRequest imageRequest, X x2, V v2) {
            super(interfaceC0732l, x, v, str);
            this.f6534f = imageRequest;
            this.f6535g = x2;
            this.h = v2;
        }

        @Override // e.c.c.b.g
        protected void b(Object obj) {
            com.facebook.imagepipeline.image.f.d((com.facebook.imagepipeline.image.f) obj);
        }

        @Override // e.c.c.b.g
        protected Object c() throws Exception {
            com.facebook.imagepipeline.image.f d2 = E.this.d(this.f6534f);
            if (d2 == null) {
                this.f6535g.c(this.h, E.this.e(), false);
                this.h.l("local");
                return null;
            }
            d2.e0();
            this.f6535g.c(this.h, E.this.e(), true);
            this.h.l("local");
            return d2;
        }
    }

    class b extends C0725e {
        final /* synthetic */ d0 a;

        b(E e2, d0 d0Var) {
            this.a = d0Var;
        }

        @Override // com.facebook.imagepipeline.producers.W
        public void a() {
            this.a.a();
        }
    }

    protected E(Executor executor, com.facebook.common.memory.h hVar) {
        this.a = executor;
        this.b = hVar;
    }

    @Override // com.facebook.imagepipeline.producers.U
    public void b(InterfaceC0732l<com.facebook.imagepipeline.image.f> interfaceC0732l, V v) {
        X n = v.n();
        ImageRequest d2 = v.d();
        v.g("local", "fetch");
        a aVar = new a(interfaceC0732l, n, v, e(), d2, n, v);
        v.e(new b(this, aVar));
        this.a.execute(aVar);
    }

    protected com.facebook.imagepipeline.image.f c(InputStream inputStream, int i) throws IOException {
        e.c.c.g.a aVar = null;
        try {
            aVar = i <= 0 ? e.c.c.g.a.z(this.b.d(inputStream)) : e.c.c.g.a.z(this.b.e(inputStream, i));
            com.facebook.imagepipeline.image.f fVar = new com.facebook.imagepipeline.image.f(aVar);
            e.c.c.d.a.b(inputStream);
            aVar.close();
            return fVar;
        } catch (Throwable th) {
            e.c.c.d.a.b(inputStream);
            int i2 = e.c.c.g.a.h;
            if (aVar != null) {
                aVar.close();
            }
            throw th;
        }
    }

    protected abstract com.facebook.imagepipeline.image.f d(ImageRequest imageRequest) throws IOException;

    protected abstract String e();
}
