package com.bytedance.frameworks.baselib.network.g;

import java.util.Arrays;

/* loaded from: classes.dex */
public class b {
    private boolean a;
    private boolean b;

    /* renamed from: c, reason: collision with root package name */
    private String[] f5073c;

    /* renamed from: d, reason: collision with root package name */
    private String[] f5074d;

    /* renamed from: e, reason: collision with root package name */
    private String[] f5075e;

    /* renamed from: f, reason: collision with root package name */
    private String[] f5076f;

    /* renamed from: g, reason: collision with root package name */
    private String[] f5077g;
    private String[] h;
    private String[] i;

    public b(boolean z, boolean z2, String[] strArr, String[] strArr2, String[] strArr3, String[] strArr4, String[] strArr5, String[] strArr6, String[] strArr7) {
        this.a = z;
        this.b = z2;
        this.f5073c = strArr;
        this.f5074d = strArr2;
        this.f5075e = strArr3;
        this.f5076f = strArr4;
        this.f5077g = strArr5;
        this.h = strArr6;
        this.i = strArr7;
    }

    public boolean a() {
        return this.b;
    }

    public boolean b() {
        return this.a;
    }

    public String[] c() {
        return this.i;
    }

    public String[] d() {
        return this.f5075e;
    }

    public String[] e() {
        return this.f5074d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.a == bVar.a && this.b == bVar.b && Arrays.equals(this.f5073c, bVar.f5073c) && Arrays.equals(this.f5074d, bVar.f5074d) && Arrays.equals(this.f5075e, bVar.f5075e) && Arrays.equals(this.f5076f, bVar.f5076f) && Arrays.equals(this.f5077g, bVar.f5077g) && Arrays.equals(this.h, bVar.h) && Arrays.equals(this.i, bVar.i);
    }

    public String[] f() {
        return this.f5076f;
    }

    public String[] g() {
        return this.f5077g;
    }

    public String[] h() {
        return this.f5073c;
    }

    public String[] i() {
        return this.h;
    }
}
