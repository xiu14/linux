package com.airbnb.lottie.v.b;

import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.airbnb.lottie.v.c.a;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class s implements c, a.b {
    private final boolean a;
    private final List<a.b> b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private final ShapeTrimPath.Type f1419c;

    /* renamed from: d, reason: collision with root package name */
    private final com.airbnb.lottie.v.c.a<?, Float> f1420d;

    /* renamed from: e, reason: collision with root package name */
    private final com.airbnb.lottie.v.c.a<?, Float> f1421e;

    /* renamed from: f, reason: collision with root package name */
    private final com.airbnb.lottie.v.c.a<?, Float> f1422f;

    public s(com.airbnb.lottie.model.layer.b bVar, ShapeTrimPath shapeTrimPath) {
        this.a = shapeTrimPath.f();
        this.f1419c = shapeTrimPath.e();
        com.airbnb.lottie.v.c.a<Float, Float> a = shapeTrimPath.d().a();
        this.f1420d = a;
        com.airbnb.lottie.v.c.a<Float, Float> a2 = shapeTrimPath.b().a();
        this.f1421e = a2;
        com.airbnb.lottie.v.c.a<Float, Float> a3 = shapeTrimPath.c().a();
        this.f1422f = a3;
        bVar.i(a);
        bVar.i(a2);
        bVar.i(a3);
        a.a(this);
        a2.a(this);
        a3.a(this);
    }

    @Override // com.airbnb.lottie.v.c.a.b
    public void a() {
        for (int i = 0; i < this.b.size(); i++) {
            this.b.get(i).a();
        }
    }

    @Override // com.airbnb.lottie.v.b.c
    public void b(List<c> list, List<c> list2) {
    }

    void c(a.b bVar) {
        this.b.add(bVar);
    }

    public com.airbnb.lottie.v.c.a<?, Float> e() {
        return this.f1421e;
    }

    public com.airbnb.lottie.v.c.a<?, Float> g() {
        return this.f1422f;
    }

    public com.airbnb.lottie.v.c.a<?, Float> h() {
        return this.f1420d;
    }

    ShapeTrimPath.Type i() {
        return this.f1419c;
    }

    public boolean j() {
        return this.a;
    }
}
