package com.airbnb.lottie.model.content;

import androidx.annotation.Nullable;
import com.airbnb.lottie.model.i.l;
import com.airbnb.lottie.v.b.p;

/* loaded from: classes.dex */
public class g implements b {
    private final String a;
    private final com.airbnb.lottie.model.i.b b;

    /* renamed from: c, reason: collision with root package name */
    private final com.airbnb.lottie.model.i.b f1327c;

    /* renamed from: d, reason: collision with root package name */
    private final l f1328d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f1329e;

    public g(String str, com.airbnb.lottie.model.i.b bVar, com.airbnb.lottie.model.i.b bVar2, l lVar, boolean z) {
        this.a = str;
        this.b = bVar;
        this.f1327c = bVar2;
        this.f1328d = lVar;
        this.f1329e = z;
    }

    @Override // com.airbnb.lottie.model.content.b
    @Nullable
    public com.airbnb.lottie.v.b.c a(com.airbnb.lottie.i iVar, com.airbnb.lottie.model.layer.b bVar) {
        return new p(iVar, bVar, this);
    }

    public com.airbnb.lottie.model.i.b b() {
        return this.b;
    }

    public String c() {
        return this.a;
    }

    public com.airbnb.lottie.model.i.b d() {
        return this.f1327c;
    }

    public l e() {
        return this.f1328d;
    }

    public boolean f() {
        return this.f1329e;
    }
}
