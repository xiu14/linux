package e.c.h.f;

import e.c.h.f.j;
import e.c.h.f.s;
import java.util.Objects;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: e.c.h.f.a$a, reason: collision with other inner class name */
    static class C0452a implements y<com.facebook.imagepipeline.image.d> {
        C0452a() {
        }

        @Override // e.c.h.f.y
        public int a(com.facebook.imagepipeline.image.d dVar) {
            com.facebook.imagepipeline.image.d dVar2 = dVar;
            if (dVar2 == null) {
                return 0;
            }
            return dVar2.o();
        }
    }

    public static j<com.facebook.cache.common.b, com.facebook.common.memory.g> a(e.c.c.d.j<t> jVar, com.facebook.common.memory.c cVar) {
        j<com.facebook.cache.common.b, com.facebook.common.memory.g> jVar2 = new j<>(new n(), new v(), jVar, null);
        cVar.a(jVar2);
        return jVar2;
    }

    public static j<com.facebook.cache.common.b, com.facebook.imagepipeline.image.d> b(e.c.c.d.j<t> jVar, com.facebook.common.memory.c cVar, s.a aVar, j.c<com.facebook.cache.common.b> cVar2) {
        j<com.facebook.cache.common.b, com.facebook.imagepipeline.image.d> jVar2 = new j<>(new C0452a(), aVar, jVar, null);
        cVar.a(jVar2);
        return jVar2;
    }

    public static r<com.facebook.cache.common.b, com.facebook.imagepipeline.image.d> c(s<com.facebook.cache.common.b, com.facebook.imagepipeline.image.d> sVar, p pVar) {
        Objects.requireNonNull((w) pVar);
        return new r<>(sVar, new b(pVar));
    }

    public static r<com.facebook.cache.common.b, com.facebook.common.memory.g> d(s<com.facebook.cache.common.b, com.facebook.common.memory.g> sVar, p pVar) {
        Objects.requireNonNull((w) pVar);
        return new r<>(sVar, new o(pVar));
    }
}
