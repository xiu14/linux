package com.vivo.push.model;

import android.text.TextUtils;

/* loaded from: classes2.dex */
public final class a {
    private String a;

    /* renamed from: d, reason: collision with root package name */
    private String f8852d;
    private long b = -1;

    /* renamed from: c, reason: collision with root package name */
    private int f8851c = -1;

    /* renamed from: e, reason: collision with root package name */
    private boolean f8853e = false;

    /* renamed from: f, reason: collision with root package name */
    private boolean f8854f = false;

    public a(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalAccessError("PushPackageInfo need a non-null pkgName.");
        }
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    public final long b() {
        return this.b;
    }

    public final boolean c() {
        return this.f8853e;
    }

    public final boolean d() {
        return this.f8854f;
    }

    public final String toString() {
        return "PushPackageInfo{mPackageName=" + this.a + ", mPushVersion=" + this.b + ", mPackageVersion=" + this.f8851c + ", mInBlackList=" + this.f8853e + ", mPushEnable=" + this.f8854f + "}";
    }

    public final void a(long j) {
        this.b = j;
    }

    public final void a(boolean z) {
        this.f8854f = z;
    }

    public final void a(int i) {
        this.f8851c = i;
    }

    public final void a(String str) {
        this.f8852d = str;
    }
}
