package com.airbnb.lottie.model.i;

import android.graphics.PointF;
import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public class l implements com.airbnb.lottie.model.content.b {

    @Nullable
    private final e a;

    @Nullable
    private final m<PointF, PointF> b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    private final g f1342c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    private final b f1343d;

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    private final d f1344e;

    /* renamed from: f, reason: collision with root package name */
    @Nullable
    private final b f1345f;

    /* renamed from: g, reason: collision with root package name */
    @Nullable
    private final b f1346g;

    @Nullable
    private final b h;

    @Nullable
    private final b i;

    public l() {
        this(null, null, null, null, null, null, null, null, null);
    }

    @Override // com.airbnb.lottie.model.content.b
    @Nullable
    public com.airbnb.lottie.v.b.c a(com.airbnb.lottie.i iVar, com.airbnb.lottie.model.layer.b bVar) {
        return null;
    }

    @Nullable
    public e b() {
        return this.a;
    }

    @Nullable
    public b c() {
        return this.i;
    }

    @Nullable
    public d d() {
        return this.f1344e;
    }

    @Nullable
    public m<PointF, PointF> e() {
        return this.b;
    }

    @Nullable
    public b f() {
        return this.f1343d;
    }

    @Nullable
    public g g() {
        return this.f1342c;
    }

    @Nullable
    public b h() {
        return this.f1345f;
    }

    @Nullable
    public b i() {
        return this.f1346g;
    }

    @Nullable
    public b j() {
        return this.h;
    }

    public l(@Nullable e eVar, @Nullable m<PointF, PointF> mVar, @Nullable g gVar, @Nullable b bVar, @Nullable d dVar, @Nullable b bVar2, @Nullable b bVar3, @Nullable b bVar4, @Nullable b bVar5) {
        this.a = eVar;
        this.b = mVar;
        this.f1342c = gVar;
        this.f1343d = bVar;
        this.f1344e = dVar;
        this.h = bVar2;
        this.i = bVar3;
        this.f1345f = bVar4;
        this.f1346g = bVar5;
    }
}
