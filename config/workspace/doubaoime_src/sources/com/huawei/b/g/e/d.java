package com.huawei.b.g.e;

import android.text.TextUtils;

/* loaded from: classes2.dex */
public class d {
    private final String a;
    private final String b;

    /* renamed from: c, reason: collision with root package name */
    private final String f6964c;

    /* renamed from: d, reason: collision with root package name */
    private final String f6965d;

    /* renamed from: e, reason: collision with root package name */
    private final String f6966e;

    /* renamed from: f, reason: collision with root package name */
    private final int f6967f;

    /* renamed from: g, reason: collision with root package name */
    private int f6968g;

    public d(String str, String str2, String str3, String str4, String str5, int i) {
        this.f6968g = 0;
        this.a = str;
        this.b = str2;
        this.f6964c = str3;
        this.f6965d = str4;
        this.f6966e = str5;
        this.f6967f = i;
        if (str != null) {
            this.f6968g = str.length() / 2;
        }
    }

    public boolean a() {
        return (TextUtils.isEmpty(this.a) || TextUtils.isEmpty(this.b) || TextUtils.isEmpty(this.f6964c) || TextUtils.isEmpty(this.f6965d) || this.a.length() != this.b.length() || this.b.length() != this.f6964c.length() || this.f6964c.length() != this.f6968g * 2 || this.f6967f < 0 || TextUtils.isEmpty(this.f6966e)) ? false : true;
    }

    public String b() {
        return this.a;
    }

    public String c() {
        return this.b;
    }

    public String d() {
        return this.f6964c;
    }

    public String e() {
        return this.f6965d;
    }

    public String f() {
        return this.f6966e;
    }

    public int g() {
        return this.f6967f;
    }

    public int h() {
        return this.f6968g;
    }
}
