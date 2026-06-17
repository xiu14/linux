package e.c.h.g;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import com.facebook.imagepipeline.producers.C0734n;
import com.facebook.imagepipeline.producers.C0738s;
import com.facebook.imagepipeline.producers.F;
import com.facebook.imagepipeline.producers.LocalExifThumbnailProducer;
import com.facebook.imagepipeline.producers.U;
import com.facebook.imagepipeline.producers.a0;
import com.facebook.imagepipeline.producers.r;
import e.c.h.f.s;
import java.util.HashMap;

/* loaded from: classes2.dex */
public class o {
    private final boolean A;
    protected ContentResolver a;
    protected Resources b;

    /* renamed from: c, reason: collision with root package name */
    protected AssetManager f9916c;

    /* renamed from: d, reason: collision with root package name */
    protected final com.facebook.common.memory.a f9917d;

    /* renamed from: e, reason: collision with root package name */
    protected final e.c.h.j.c f9918e;

    /* renamed from: f, reason: collision with root package name */
    protected final e.c.h.j.e f9919f;

    /* renamed from: g, reason: collision with root package name */
    protected final boolean f9920g;
    protected final boolean h;
    protected final boolean i;
    protected final f j;
    protected final com.facebook.common.memory.h k;
    protected final e.c.h.f.f l;
    protected final e.c.h.f.f m;
    private final HashMap<String, e.c.h.f.f> n;
    protected final s<com.facebook.cache.common.b, com.facebook.common.memory.g> o;
    protected final s<com.facebook.cache.common.b, com.facebook.imagepipeline.image.d> p;
    protected final e.c.h.f.g q;
    protected final e.c.h.f.e<com.facebook.cache.common.b> r;
    protected final e.c.h.f.e<com.facebook.cache.common.b> s;
    protected final e.c.h.d.b t;
    protected final int u;
    protected final int v;
    protected boolean w;
    protected final b x;
    protected final int y;
    protected final boolean z;

    public o(Context context, com.facebook.common.memory.a aVar, e.c.h.j.c cVar, e.c.h.j.e eVar, boolean z, boolean z2, boolean z3, f fVar, com.facebook.common.memory.h hVar, s<com.facebook.cache.common.b, com.facebook.imagepipeline.image.d> sVar, s<com.facebook.cache.common.b, com.facebook.common.memory.g> sVar2, e.c.h.f.f fVar2, e.c.h.f.f fVar3, HashMap<String, e.c.h.f.f> hashMap, e.c.h.f.g gVar, e.c.h.d.b bVar, int i, int i2, boolean z4, int i3, b bVar2, boolean z5, int i4, boolean z6) {
        this.a = context.getApplicationContext().getContentResolver();
        this.b = context.getApplicationContext().getResources();
        this.f9916c = context.getApplicationContext().getAssets();
        this.f9917d = aVar;
        this.f9918e = cVar;
        this.f9919f = eVar;
        this.f9920g = z;
        this.h = z2;
        this.i = z3;
        this.j = fVar;
        this.k = hVar;
        this.p = sVar;
        this.o = sVar2;
        this.l = fVar2;
        this.m = fVar3;
        this.n = hashMap;
        this.q = gVar;
        this.t = bVar;
        this.r = new e.c.h.f.e<>(i4);
        this.s = new e.c.h.f.e<>(i4);
        this.u = i;
        this.v = i2;
        this.w = z4;
        this.y = i3;
        this.x = bVar2;
        this.z = z5;
        this.A = z6;
    }

    public C0734n a(U<com.facebook.imagepipeline.image.f> u) {
        return new C0734n(this.f9917d, this.j.a(), this.f9918e, this.f9919f, this.f9920g, this.h, this.i, u, this.y, this.x, null, e.c.c.d.k.a, this.A);
    }

    public r b(U<com.facebook.imagepipeline.image.f> u) {
        return new r(this.l, this.m, this.n, this.q, u, this.k);
    }

    public C0738s c(U<com.facebook.imagepipeline.image.f> u) {
        return new C0738s(this.l, this.m, this.n, this.q, u, this.k);
    }

    public LocalExifThumbnailProducer d() {
        return new LocalExifThumbnailProducer(this.j.f(), this.k, this.a);
    }

    public F e() {
        return new F(this.j.e(), this.k);
    }

    public a0 f(U<com.facebook.imagepipeline.image.f> u, boolean z, e.c.h.n.d dVar) {
        return new a0(this.j.c(), this.k, u, z, dVar);
    }
}
