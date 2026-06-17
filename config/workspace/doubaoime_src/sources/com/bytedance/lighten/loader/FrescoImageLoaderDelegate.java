package com.bytedance.lighten.loader;

import android.app.ActivityManager;
import android.net.Uri;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.lighten.loader.l;
import com.facebook.cache.disk.b;
import com.facebook.fresco.animation.drawable.AnimatedDrawable2;
import com.facebook.imagepipeline.memory.A;
import com.facebook.imagepipeline.memory.z;
import e.c.h.g.j;
import java.io.File;

/* loaded from: classes.dex */
public class FrescoImageLoaderDelegate implements com.bytedance.lighten.core.f {
    private com.bytedance.lighten.core.b mFrescoCache;
    private com.bytedance.lighten.core.d mImpl;

    @Override // com.bytedance.lighten.core.d
    public void display(com.bytedance.lighten.core.i iVar) {
        this.mImpl.display(iVar);
    }

    @Override // com.bytedance.lighten.core.d
    public void download(com.bytedance.lighten.core.i iVar) {
        this.mImpl.download(iVar);
    }

    public com.bytedance.lighten.core.b getCache() {
        return this.mFrescoCache;
    }

    @Override // com.bytedance.lighten.core.f
    public void init(@NonNull com.bytedance.lighten.core.h hVar) {
        l lVar;
        l lVar2;
        com.bytedance.lighten.core.c.b(hVar.b());
        if (hVar.e()) {
            if (e.c.e.b.a.b.b()) {
                Log.e("Lighten:", "Fresco has been initialized, lighten will override the fresco config!!!");
            }
            if (hVar.d() >= 0) {
                e.c.h.c.a.b.c(hVar.d());
            }
            j.a z = e.c.h.g.j.z(hVar.b());
            b.C0322b n = com.facebook.cache.disk.b.n(hVar.b());
            n.o(null);
            n.n("fresco_cache");
            n.p(e.c.c.a.c.a());
            z.v(n.m());
            b.C0322b n2 = com.facebook.cache.disk.b.n(hVar.b());
            n2.o(null);
            n2.n("fresco_small_cache");
            n2.p(e.c.c.a.c.a());
            z.y(n2.m());
            z.s(hVar.a());
            z.t(true);
            if (hVar.f()) {
                lVar = l.b.a;
                z.w(lVar);
                z.b k = z.k();
                lVar2 = l.b.a;
                k.c(lVar2);
                z.x(new A(k.b()));
            }
            int i = (int) 0;
            z.r(new c((ActivityManager) hVar.b().getSystemService("activity"), i));
            z.u(new e(i));
            AnimatedDrawable2.f(new n(hVar));
            e.c.e.b.a.b.c(hVar.b(), z.q());
            int c2 = hVar.c();
            int i2 = e.c.c.e.a.a;
            e.c.c.e.b.b.h(c2);
        }
        j jVar = new j();
        this.mFrescoCache = jVar;
        this.mImpl = new k(jVar);
    }

    @Override // com.bytedance.lighten.core.f
    public com.bytedance.lighten.core.j load(int i) {
        StringBuilder M = e.a.a.a.a.M("res://");
        M.append(com.bytedance.lighten.core.g.f5339d);
        M.append("/");
        M.append(i);
        return new com.bytedance.lighten.core.j(Uri.parse(M.toString()));
    }

    @Override // com.bytedance.lighten.core.d
    public void loadBitmap(com.bytedance.lighten.core.i iVar) {
        this.mImpl.loadBitmap(iVar);
    }

    @Override // com.bytedance.lighten.core.d
    public void trimDisk(int i) {
        this.mImpl.trimDisk(i);
    }

    @Override // com.bytedance.lighten.core.d
    public void trimMemory(int i) {
        this.mImpl.trimMemory(i);
    }

    public com.bytedance.lighten.core.j load(@NonNull File file) {
        return new com.bytedance.lighten.core.j(Uri.fromFile(file));
    }

    public com.bytedance.lighten.core.j load(@NonNull String str) {
        return new com.bytedance.lighten.core.j(str);
    }

    @Override // com.bytedance.lighten.core.f
    public com.bytedance.lighten.core.j load(@NonNull Uri uri) {
        return new com.bytedance.lighten.core.j(uri);
    }

    public com.bytedance.lighten.core.j load(@NonNull com.bytedance.lighten.core.k.a aVar) {
        return new com.bytedance.lighten.core.j(aVar);
    }

    public com.bytedance.lighten.core.j load(@Nullable Object obj) {
        return new com.bytedance.lighten.core.j(obj);
    }
}
