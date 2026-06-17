package com.bytedance.bdinstall;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.text.TextUtils;

/* renamed from: com.bytedance.bdinstall.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0628h {
    private final String a;
    private final String b;

    /* renamed from: c, reason: collision with root package name */
    private final long f3989c;

    /* renamed from: d, reason: collision with root package name */
    private final long f3990d;

    /* renamed from: e, reason: collision with root package name */
    private final long f3991e;

    /* renamed from: f, reason: collision with root package name */
    private final Context f3992f;

    /* renamed from: g, reason: collision with root package name */
    private final com.bytedance.bdinstall.util.p<PackageInfo> f3993g = new a();

    /* renamed from: com.bytedance.bdinstall.h$a */
    class a extends com.bytedance.bdinstall.util.p<PackageInfo> {
        a() {
        }

        @Override // com.bytedance.bdinstall.util.p
        protected PackageInfo a(Object[] objArr) {
            try {
                return C0628h.this.f3992f.getPackageManager().getPackageInfo(C0628h.this.f3992f.getPackageName(), 0);
            } catch (Throwable unused) {
                int i = C0640u.a;
                return null;
            }
        }
    }

    C0628h(C0633m c0633m) {
        this.f3992f = c0633m.k;
        this.a = c0633m.n;
        this.b = TextUtils.isEmpty(c0633m.o) ? "" : c0633m.o;
        this.f3989c = c0633m.p;
        this.f3990d = c0633m.q;
        this.f3991e = c0633m.r;
    }

    public long b() {
        PackageInfo b;
        return (this.f3991e != 0 || (b = this.f3993g.b(new Object[0])) == null) ? this.f3991e : b.versionCode;
    }

    public long c() {
        PackageInfo b;
        return (this.f3990d != 0 || (b = this.f3993g.b(new Object[0])) == null) ? this.f3990d : b.versionCode;
    }

    public String d() {
        PackageInfo b;
        return (!TextUtils.isEmpty(this.a) || (b = this.f3993g.b(new Object[0])) == null) ? this.a : b.versionName;
    }

    public long e() {
        PackageInfo b;
        return (this.f3989c != 0 || (b = this.f3993g.b(new Object[0])) == null) ? this.f3989c : b.versionCode;
    }

    public String f() {
        return this.b;
    }
}
