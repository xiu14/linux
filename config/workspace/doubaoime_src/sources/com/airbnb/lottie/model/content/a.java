package com.airbnb.lottie.model.content;

import android.graphics.PointF;
import com.airbnb.lottie.model.i.m;

/* loaded from: classes.dex */
public class a implements b {
    private final String a;
    private final m<PointF, PointF> b;

    /* renamed from: c, reason: collision with root package name */
    private final com.airbnb.lottie.model.i.f f1311c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f1312d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f1313e;

    public a(String str, m<PointF, PointF> mVar, com.airbnb.lottie.model.i.f fVar, boolean z, boolean z2) {
        this.a = str;
        this.b = mVar;
        this.f1311c = fVar;
        this.f1312d = z;
        this.f1313e = z2;
    }

    @Override // com.airbnb.lottie.model.content.b
    public com.airbnb.lottie.v.b.c a(com.airbnb.lottie.i iVar, com.airbnb.lottie.model.layer.b bVar) {
        return new com.airbnb.lottie.v.b.f(iVar, bVar, this);
    }

    public String b() {
        return this.a;
    }

    public m<PointF, PointF> c() {
        return this.b;
    }

    public com.airbnb.lottie.model.i.f d() {
        return this.f1311c;
    }

    public boolean e() {
        return this.f1313e;
    }

    public boolean f() {
        return this.f1312d;
    }
}
