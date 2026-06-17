package com.bytedance.lighten.core;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.widget.ImageView;
import androidx.annotation.DrawableRes;
import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public class i {
    private Uri a;
    private Context b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f5346c;

    /* renamed from: d, reason: collision with root package name */
    private int f5347d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f5348e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f5349f;

    /* renamed from: g, reason: collision with root package name */
    private int f5350g;
    private boolean h;
    private int i;
    private int j;
    private int k;

    @DrawableRes
    private int l;

    @DrawableRes
    private int m;
    private Bitmap.Config n;
    private ScaleType o;

    @Nullable
    private final CircleOptions p;

    @Nullable
    private final ImagePiplinePriority q;
    private String r;
    private CacheChoice s;
    private ImageView t;
    private com.bytedance.lighten.core.m.b u = null;
    private boolean v;
    private com.bytedance.lighten.core.k.a w;

    public i(j jVar) {
        this.a = jVar.u();
        this.b = jVar.n();
        this.f5346c = jVar.z();
        this.f5348e = jVar.A();
        this.f5349f = jVar.B();
        this.f5350g = jVar.s();
        this.h = jVar.C();
        this.i = jVar.w();
        this.j = jVar.q();
        this.k = jVar.o();
        this.l = jVar.r();
        this.m = jVar.p();
        this.n = jVar.j();
        this.o = jVar.g();
        this.p = jVar.m();
        this.q = jVar.t();
        this.r = jVar.l();
        this.s = jVar.k();
        this.t = jVar.i();
        this.v = jVar.y();
        this.w = jVar.v();
        this.f5347d = jVar.h();
    }

    public ScaleType a() {
        return this.o;
    }

    public int b() {
        return this.f5347d;
    }

    public ImageView c() {
        return this.t;
    }

    public Bitmap.Config d() {
        return this.n;
    }

    public CacheChoice e() {
        return this.s;
    }

    @Nullable
    public CircleOptions f() {
        return this.p;
    }

    public int g() {
        return this.k;
    }

    public int h() {
        return this.m;
    }

    public int i() {
        return this.j;
    }

    public com.bytedance.lighten.core.m.b j() {
        return this.u;
    }

    public int k() {
        return this.l;
    }

    public int l() {
        return this.f5350g;
    }

    @Nullable
    public ImagePiplinePriority m() {
        return this.q;
    }

    public Uri n() {
        return this.a;
    }

    public com.bytedance.lighten.core.k.a o() {
        return this.w;
    }

    public int p() {
        return this.i;
    }

    public boolean q() {
        return this.v;
    }

    public boolean r() {
        return this.f5346c;
    }

    public boolean s() {
        return this.f5348e;
    }

    public boolean t() {
        return this.f5349f;
    }

    public boolean u() {
        return this.h;
    }
}
