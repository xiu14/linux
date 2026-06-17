package com.airbnb.lottie.model.content;

import android.graphics.PointF;
import com.airbnb.lottie.model.i.m;
import com.airbnb.lottie.v.b.o;

/* loaded from: classes.dex */
public class f implements b {
    private final String a;
    private final m<PointF, PointF> b;

    /* renamed from: c, reason: collision with root package name */
    private final m<PointF, PointF> f1324c;

    /* renamed from: d, reason: collision with root package name */
    private final com.airbnb.lottie.model.i.b f1325d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f1326e;

    public f(String str, m<PointF, PointF> mVar, m<PointF, PointF> mVar2, com.airbnb.lottie.model.i.b bVar, boolean z) {
        this.a = str;
        this.b = mVar;
        this.f1324c = mVar2;
        this.f1325d = bVar;
        this.f1326e = z;
    }

    @Override // com.airbnb.lottie.model.content.b
    public com.airbnb.lottie.v.b.c a(com.airbnb.lottie.i iVar, com.airbnb.lottie.model.layer.b bVar) {
        return new o(iVar, bVar, this);
    }

    public com.airbnb.lottie.model.i.b b() {
        return this.f1325d;
    }

    public String c() {
        return this.a;
    }

    public m<PointF, PointF> d() {
        return this.b;
    }

    public m<PointF, PointF> e() {
        return this.f1324c;
    }

    public boolean f() {
        return this.f1326e;
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("RectangleShape{position=");
        M.append(this.b);
        M.append(", size=");
        M.append(this.f1324c);
        M.append('}');
        return M.toString();
    }
}
