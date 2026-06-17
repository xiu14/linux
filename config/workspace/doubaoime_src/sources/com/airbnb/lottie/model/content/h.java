package com.airbnb.lottie.model.content;

import android.graphics.PointF;
import androidx.annotation.FloatRange;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class h {
    private final List<com.airbnb.lottie.model.a> a;
    private PointF b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f1330c;

    public h(PointF pointF, boolean z, List<com.airbnb.lottie.model.a> list) {
        this.b = pointF;
        this.f1330c = z;
        this.a = new ArrayList(list);
    }

    public List<com.airbnb.lottie.model.a> a() {
        return this.a;
    }

    public PointF b() {
        return this.b;
    }

    public void c(h hVar, h hVar2, @FloatRange(from = 0.0d, to = 1.0d) float f2) {
        if (this.b == null) {
            this.b = new PointF();
        }
        this.f1330c = hVar.f1330c || hVar2.f1330c;
        if (hVar.a.size() != hVar2.a.size()) {
            StringBuilder M = e.a.a.a.a.M("Curves must have the same number of control points. Shape 1: ");
            M.append(hVar.a.size());
            M.append("\tShape 2: ");
            M.append(hVar2.a.size());
            com.airbnb.lottie.y.d.c(M.toString());
        }
        int min = Math.min(hVar.a.size(), hVar2.a.size());
        if (this.a.size() < min) {
            for (int size = this.a.size(); size < min; size++) {
                this.a.add(new com.airbnb.lottie.model.a());
            }
        } else if (this.a.size() > min) {
            for (int size2 = this.a.size() - 1; size2 >= min; size2--) {
                List<com.airbnb.lottie.model.a> list = this.a;
                list.remove(list.size() - 1);
            }
        }
        PointF pointF = hVar.b;
        PointF pointF2 = hVar2.b;
        float f3 = com.airbnb.lottie.y.g.f(pointF.x, pointF2.x, f2);
        float f4 = com.airbnb.lottie.y.g.f(pointF.y, pointF2.y, f2);
        if (this.b == null) {
            this.b = new PointF();
        }
        this.b.set(f3, f4);
        for (int size3 = this.a.size() - 1; size3 >= 0; size3--) {
            com.airbnb.lottie.model.a aVar = hVar.a.get(size3);
            com.airbnb.lottie.model.a aVar2 = hVar2.a.get(size3);
            PointF a = aVar.a();
            PointF b = aVar.b();
            PointF c2 = aVar.c();
            PointF a2 = aVar2.a();
            PointF b2 = aVar2.b();
            PointF c3 = aVar2.c();
            this.a.get(size3).d(com.airbnb.lottie.y.g.f(a.x, a2.x, f2), com.airbnb.lottie.y.g.f(a.y, a2.y, f2));
            this.a.get(size3).e(com.airbnb.lottie.y.g.f(b.x, b2.x, f2), com.airbnb.lottie.y.g.f(b.y, b2.y, f2));
            this.a.get(size3).f(com.airbnb.lottie.y.g.f(c2.x, c3.x, f2), com.airbnb.lottie.y.g.f(c2.y, c3.y, f2));
        }
    }

    public boolean d() {
        return this.f1330c;
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("ShapeData{numCurves=");
        M.append(this.a.size());
        M.append("closed=");
        return e.a.a.a.a.L(M, this.f1330c, '}');
    }

    public h() {
        this.a = new ArrayList();
    }
}
