package com.airbnb.lottie.model.content;

import android.graphics.Path;

/* loaded from: classes.dex */
public class d implements b {
    private final GradientType a;
    private final Path.FillType b;

    /* renamed from: c, reason: collision with root package name */
    private final com.airbnb.lottie.model.i.c f1314c;

    /* renamed from: d, reason: collision with root package name */
    private final com.airbnb.lottie.model.i.d f1315d;

    /* renamed from: e, reason: collision with root package name */
    private final com.airbnb.lottie.model.i.f f1316e;

    /* renamed from: f, reason: collision with root package name */
    private final com.airbnb.lottie.model.i.f f1317f;

    /* renamed from: g, reason: collision with root package name */
    private final String f1318g;
    private final boolean h;

    public d(String str, GradientType gradientType, Path.FillType fillType, com.airbnb.lottie.model.i.c cVar, com.airbnb.lottie.model.i.d dVar, com.airbnb.lottie.model.i.f fVar, com.airbnb.lottie.model.i.f fVar2, com.airbnb.lottie.model.i.b bVar, com.airbnb.lottie.model.i.b bVar2, boolean z) {
        this.a = gradientType;
        this.b = fillType;
        this.f1314c = cVar;
        this.f1315d = dVar;
        this.f1316e = fVar;
        this.f1317f = fVar2;
        this.f1318g = str;
        this.h = z;
    }

    @Override // com.airbnb.lottie.model.content.b
    public com.airbnb.lottie.v.b.c a(com.airbnb.lottie.i iVar, com.airbnb.lottie.model.layer.b bVar) {
        return new com.airbnb.lottie.v.b.h(iVar, bVar, this);
    }

    public com.airbnb.lottie.model.i.f b() {
        return this.f1317f;
    }

    public Path.FillType c() {
        return this.b;
    }

    public com.airbnb.lottie.model.i.c d() {
        return this.f1314c;
    }

    public GradientType e() {
        return this.a;
    }

    public String f() {
        return this.f1318g;
    }

    public com.airbnb.lottie.model.i.d g() {
        return this.f1315d;
    }

    public com.airbnb.lottie.model.i.f h() {
        return this.f1316e;
    }

    public boolean i() {
        return this.h;
    }
}
