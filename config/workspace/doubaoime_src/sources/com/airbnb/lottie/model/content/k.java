package com.airbnb.lottie.model.content;

import com.airbnb.lottie.v.b.q;

/* loaded from: classes.dex */
public class k implements b {
    private final String a;
    private final int b;

    /* renamed from: c, reason: collision with root package name */
    private final com.airbnb.lottie.model.i.h f1336c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f1337d;

    public k(String str, int i, com.airbnb.lottie.model.i.h hVar, boolean z) {
        this.a = str;
        this.b = i;
        this.f1336c = hVar;
        this.f1337d = z;
    }

    @Override // com.airbnb.lottie.model.content.b
    public com.airbnb.lottie.v.b.c a(com.airbnb.lottie.i iVar, com.airbnb.lottie.model.layer.b bVar) {
        return new q(iVar, bVar, this);
    }

    public com.airbnb.lottie.model.i.h b() {
        return this.f1336c;
    }

    public boolean c() {
        return this.f1337d;
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("ShapePath{name=");
        M.append(this.a);
        M.append(", index=");
        return e.a.a.a.a.C(M, this.b, '}');
    }
}
