package com.airbnb.lottie.model.content;

import android.graphics.Path;
import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public class i implements b {
    private final boolean a;
    private final Path.FillType b;

    /* renamed from: c, reason: collision with root package name */
    private final String f1331c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    private final com.airbnb.lottie.model.i.a f1332d;

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    private final com.airbnb.lottie.model.i.d f1333e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f1334f;

    public i(String str, boolean z, Path.FillType fillType, @Nullable com.airbnb.lottie.model.i.a aVar, @Nullable com.airbnb.lottie.model.i.d dVar, boolean z2) {
        this.f1331c = str;
        this.a = z;
        this.b = fillType;
        this.f1332d = aVar;
        this.f1333e = dVar;
        this.f1334f = z2;
    }

    @Override // com.airbnb.lottie.model.content.b
    public com.airbnb.lottie.v.b.c a(com.airbnb.lottie.i iVar, com.airbnb.lottie.model.layer.b bVar) {
        return new com.airbnb.lottie.v.b.g(iVar, bVar, this);
    }

    @Nullable
    public com.airbnb.lottie.model.i.a b() {
        return this.f1332d;
    }

    public Path.FillType c() {
        return this.b;
    }

    public String d() {
        return this.f1331c;
    }

    @Nullable
    public com.airbnb.lottie.model.i.d e() {
        return this.f1333e;
    }

    public boolean f() {
        return this.f1334f;
    }

    public String toString() {
        return e.a.a.a.a.L(e.a.a.a.a.M("ShapeFill{color=, fillEnabled="), this.a, '}');
    }
}
