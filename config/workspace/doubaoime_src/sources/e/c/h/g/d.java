package e.c.h.g;

import com.facebook.cache.disk.d;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes2.dex */
public class d implements g {
    private e a;

    public d(e eVar) {
        this.a = eVar;
    }

    public com.facebook.cache.disk.i a(com.facebook.cache.disk.b bVar) {
        Objects.requireNonNull(this.a);
        com.facebook.cache.disk.f fVar = new com.facebook.cache.disk.f(bVar.m(), bVar.c(), bVar.b(), bVar.g(), bVar.f(), bVar.d());
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        return new com.facebook.cache.disk.d(fVar, bVar.j(), new d.c(bVar.l(), bVar.k(), bVar.h()), bVar.e(), bVar.d(), bVar.i(), newSingleThreadExecutor, false);
    }
}
