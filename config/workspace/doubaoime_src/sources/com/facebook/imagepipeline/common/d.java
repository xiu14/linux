package com.facebook.imagepipeline.common;

import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.graphics.Rect;
import com.facebook.imagepipeline.common.d;

/* loaded from: classes2.dex */
public class d<T extends d> {

    /* renamed from: c, reason: collision with root package name */
    private boolean f6457c;

    /* renamed from: e, reason: collision with root package name */
    private boolean f6459e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f6460f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f6461g;
    private e.c.h.j.c j;
    private e.c.h.o.a k;
    private Object l;
    private boolean m;
    private boolean n;
    private Rect o;
    private ColorSpace p;
    private int a = 100;
    private int b = Integer.MAX_VALUE;

    /* renamed from: d, reason: collision with root package name */
    private int f6458d = e.c.h.c.a.b.b();
    private Bitmap.Config h = Bitmap.Config.ARGB_8888;
    private boolean i = false;

    public Bitmap.Config a() {
        return this.h;
    }

    public e.c.h.o.a b() {
        return this.k;
    }

    public ColorSpace c() {
        return this.p;
    }

    public e.c.h.j.c d() {
        return this.j;
    }

    public boolean e() {
        return this.f6460f;
    }

    public Object f() {
        return this.l;
    }

    public boolean g() {
        return this.f6457c;
    }

    public boolean h() {
        return this.f6461g;
    }

    public int i() {
        return this.b;
    }

    public int j() {
        return this.a;
    }

    public int k() {
        return this.f6458d;
    }

    public Rect l() {
        return this.o;
    }

    public boolean m() {
        return this.f6459e;
    }

    public boolean n() {
        return this.i;
    }

    public boolean o() {
        return this.m;
    }

    public boolean p() {
        return this.n;
    }

    public T q(Bitmap.Config config) {
        this.h = config;
        this.m = true;
        return this;
    }

    public T r(boolean z) {
        this.f6460f = z;
        return this;
    }

    public void s(Object obj) {
        this.l = obj;
    }

    public d t(c cVar) {
        this.a = cVar.a;
        this.b = cVar.b;
        this.f6457c = cVar.f6452c;
        this.f6458d = cVar.f6453d;
        this.f6459e = cVar.f6454e;
        this.f6460f = cVar.f6455f;
        this.f6461g = cVar.f6456g;
        this.h = cVar.h;
        this.i = cVar.i;
        this.j = cVar.j;
        this.k = cVar.k;
        this.l = cVar.m;
        this.m = cVar.n;
        this.n = cVar.o;
        this.o = cVar.p;
        this.p = cVar.l;
        return this;
    }

    public d u(int i) {
        this.f6458d = i;
        return this;
    }
}
