package com.airbnb.lottie.v.b;

import android.graphics.Path;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.airbnb.lottie.v.c.a;
import java.util.List;

/* loaded from: classes.dex */
public class q implements m, a.b {
    private final boolean b;

    /* renamed from: c, reason: collision with root package name */
    private final com.airbnb.lottie.i f1415c;

    /* renamed from: d, reason: collision with root package name */
    private final com.airbnb.lottie.v.c.a<?, Path> f1416d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f1417e;
    private final Path a = new Path();

    /* renamed from: f, reason: collision with root package name */
    private b f1418f = new b();

    public q(com.airbnb.lottie.i iVar, com.airbnb.lottie.model.layer.b bVar, com.airbnb.lottie.model.content.k kVar) {
        this.b = kVar.c();
        this.f1415c = iVar;
        com.airbnb.lottie.v.c.a<com.airbnb.lottie.model.content.h, Path> a = kVar.b().a();
        this.f1416d = a;
        bVar.i(a);
        a.a(this);
    }

    @Override // com.airbnb.lottie.v.c.a.b
    public void a() {
        this.f1417e = false;
        this.f1415c.invalidateSelf();
    }

    @Override // com.airbnb.lottie.v.b.c
    public void b(List<c> list, List<c> list2) {
        for (int i = 0; i < list.size(); i++) {
            c cVar = list.get(i);
            if (cVar instanceof s) {
                s sVar = (s) cVar;
                if (sVar.i() == ShapeTrimPath.Type.SIMULTANEOUSLY) {
                    this.f1418f.a(sVar);
                    sVar.c(this);
                }
            }
        }
    }

    @Override // com.airbnb.lottie.v.b.m
    public Path getPath() {
        if (this.f1417e) {
            return this.a;
        }
        this.a.reset();
        if (this.b) {
            this.f1417e = true;
            return this.a;
        }
        this.a.set(this.f1416d.g());
        this.a.setFillType(Path.FillType.EVEN_ODD);
        this.f1418f.b(this.a);
        this.f1417e = true;
        return this.a;
    }
}
