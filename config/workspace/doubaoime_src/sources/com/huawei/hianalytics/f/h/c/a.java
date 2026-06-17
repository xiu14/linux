package com.huawei.hianalytics.f.h.c;

import android.text.TextUtils;

/* loaded from: classes2.dex */
public class a {
    private String a;
    private long b;

    /* renamed from: c, reason: collision with root package name */
    private long f7112c;

    public a(String str, long j) {
        this.a = "";
        this.b = 0L;
        this.f7112c = 0L;
        this.a = str;
        this.b = j;
    }

    public a(String str, long j, long j2) {
        this.a = "";
        this.b = 0L;
        this.f7112c = 0L;
        this.a = str;
        this.b = j;
        this.f7112c = j2;
    }

    public String a() {
        return this.a;
    }

    public long b() {
        return this.b;
    }

    public long c() {
        return this.f7112c;
    }

    public boolean d() {
        return !TextUtils.isEmpty(this.a) && this.b > 0 && this.f7112c >= 0;
    }
}
