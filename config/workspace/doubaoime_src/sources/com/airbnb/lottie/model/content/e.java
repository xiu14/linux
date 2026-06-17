package com.airbnb.lottie.model.content;

import androidx.annotation.Nullable;
import com.airbnb.lottie.model.content.ShapeStroke;
import java.util.List;

/* loaded from: classes.dex */
public class e implements b {
    private final String a;
    private final GradientType b;

    /* renamed from: c, reason: collision with root package name */
    private final com.airbnb.lottie.model.i.c f1319c;

    /* renamed from: d, reason: collision with root package name */
    private final com.airbnb.lottie.model.i.d f1320d;

    /* renamed from: e, reason: collision with root package name */
    private final com.airbnb.lottie.model.i.f f1321e;

    /* renamed from: f, reason: collision with root package name */
    private final com.airbnb.lottie.model.i.f f1322f;

    /* renamed from: g, reason: collision with root package name */
    private final com.airbnb.lottie.model.i.b f1323g;
    private final ShapeStroke.LineCapType h;
    private final ShapeStroke.LineJoinType i;
    private final float j;
    private final List<com.airbnb.lottie.model.i.b> k;

    @Nullable
    private final com.airbnb.lottie.model.i.b l;
    private final boolean m;

    public e(String str, GradientType gradientType, com.airbnb.lottie.model.i.c cVar, com.airbnb.lottie.model.i.d dVar, com.airbnb.lottie.model.i.f fVar, com.airbnb.lottie.model.i.f fVar2, com.airbnb.lottie.model.i.b bVar, ShapeStroke.LineCapType lineCapType, ShapeStroke.LineJoinType lineJoinType, float f2, List<com.airbnb.lottie.model.i.b> list, @Nullable com.airbnb.lottie.model.i.b bVar2, boolean z) {
        this.a = str;
        this.b = gradientType;
        this.f1319c = cVar;
        this.f1320d = dVar;
        this.f1321e = fVar;
        this.f1322f = fVar2;
        this.f1323g = bVar;
        this.h = lineCapType;
        this.i = lineJoinType;
        this.j = f2;
        this.k = list;
        this.l = bVar2;
        this.m = z;
    }

    @Override // com.airbnb.lottie.model.content.b
    public com.airbnb.lottie.v.b.c a(com.airbnb.lottie.i iVar, com.airbnb.lottie.model.layer.b bVar) {
        return new com.airbnb.lottie.v.b.i(iVar, bVar, this);
    }

    public ShapeStroke.LineCapType b() {
        return this.h;
    }

    @Nullable
    public com.airbnb.lottie.model.i.b c() {
        return this.l;
    }

    public com.airbnb.lottie.model.i.f d() {
        return this.f1322f;
    }

    public com.airbnb.lottie.model.i.c e() {
        return this.f1319c;
    }

    public GradientType f() {
        return this.b;
    }

    public ShapeStroke.LineJoinType g() {
        return this.i;
    }

    public List<com.airbnb.lottie.model.i.b> h() {
        return this.k;
    }

    public float i() {
        return this.j;
    }

    public String j() {
        return this.a;
    }

    public com.airbnb.lottie.model.i.d k() {
        return this.f1320d;
    }

    public com.airbnb.lottie.model.i.f l() {
        return this.f1321e;
    }

    public com.airbnb.lottie.model.i.b m() {
        return this.f1323g;
    }

    public boolean n() {
        return this.m;
    }
}
