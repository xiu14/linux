package com.airbnb.lottie.model.content;

import android.graphics.PointF;
import com.airbnb.lottie.model.i.m;
import com.airbnb.lottie.v.b.n;

/* loaded from: classes.dex */
public class PolystarShape implements b {
    private final String a;
    private final Type b;

    /* renamed from: c, reason: collision with root package name */
    private final com.airbnb.lottie.model.i.b f1297c;

    /* renamed from: d, reason: collision with root package name */
    private final m<PointF, PointF> f1298d;

    /* renamed from: e, reason: collision with root package name */
    private final com.airbnb.lottie.model.i.b f1299e;

    /* renamed from: f, reason: collision with root package name */
    private final com.airbnb.lottie.model.i.b f1300f;

    /* renamed from: g, reason: collision with root package name */
    private final com.airbnb.lottie.model.i.b f1301g;
    private final com.airbnb.lottie.model.i.b h;
    private final com.airbnb.lottie.model.i.b i;
    private final boolean j;

    public enum Type {
        STAR(1),
        POLYGON(2);

        private final int value;

        Type(int i) {
            this.value = i;
        }

        public static Type forValue(int i) {
            Type[] values = values();
            for (int i2 = 0; i2 < 2; i2++) {
                Type type = values[i2];
                if (type.value == i) {
                    return type;
                }
            }
            return null;
        }
    }

    public PolystarShape(String str, Type type, com.airbnb.lottie.model.i.b bVar, m<PointF, PointF> mVar, com.airbnb.lottie.model.i.b bVar2, com.airbnb.lottie.model.i.b bVar3, com.airbnb.lottie.model.i.b bVar4, com.airbnb.lottie.model.i.b bVar5, com.airbnb.lottie.model.i.b bVar6, boolean z) {
        this.a = str;
        this.b = type;
        this.f1297c = bVar;
        this.f1298d = mVar;
        this.f1299e = bVar2;
        this.f1300f = bVar3;
        this.f1301g = bVar4;
        this.h = bVar5;
        this.i = bVar6;
        this.j = z;
    }

    @Override // com.airbnb.lottie.model.content.b
    public com.airbnb.lottie.v.b.c a(com.airbnb.lottie.i iVar, com.airbnb.lottie.model.layer.b bVar) {
        return new n(iVar, bVar, this);
    }

    public com.airbnb.lottie.model.i.b b() {
        return this.f1300f;
    }

    public com.airbnb.lottie.model.i.b c() {
        return this.h;
    }

    public String d() {
        return this.a;
    }

    public com.airbnb.lottie.model.i.b e() {
        return this.f1301g;
    }

    public com.airbnb.lottie.model.i.b f() {
        return this.i;
    }

    public com.airbnb.lottie.model.i.b g() {
        return this.f1297c;
    }

    public m<PointF, PointF> h() {
        return this.f1298d;
    }

    public com.airbnb.lottie.model.i.b i() {
        return this.f1299e;
    }

    public Type j() {
        return this.b;
    }

    public boolean k() {
        return this.j;
    }
}
