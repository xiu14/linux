package com.facebook.drawee.components;

/* loaded from: classes2.dex */
public class c {
    private boolean a = false;
    private int b = 4;

    /* renamed from: c, reason: collision with root package name */
    private int f6334c = 0;

    public void a() {
        this.a = false;
        this.b = 4;
        this.f6334c = 0;
    }

    public void b() {
        this.f6334c++;
    }

    public void c() {
        this.f6334c = 0;
    }

    public void d(boolean z) {
        this.a = z;
    }

    public boolean e() {
        return this.a && this.f6334c < this.b;
    }
}
