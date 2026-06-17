package com.huawei.hms.framework.network.grs.g;

import android.content.Context;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public class a {
    protected d a;
    private final String b;

    /* renamed from: c, reason: collision with root package name */
    private final c f7291c;

    /* renamed from: d, reason: collision with root package name */
    private final int f7292d;

    /* renamed from: e, reason: collision with root package name */
    private final Context f7293e;

    /* renamed from: f, reason: collision with root package name */
    private final String f7294f;

    /* renamed from: g, reason: collision with root package name */
    private final GrsBaseInfo f7295g;
    private final com.huawei.hms.framework.network.grs.e.c h;

    public a(String str, int i, c cVar, Context context, String str2, GrsBaseInfo grsBaseInfo, com.huawei.hms.framework.network.grs.e.c cVar2) {
        this.b = str;
        this.f7291c = cVar;
        this.f7292d = i;
        this.f7293e = context;
        this.f7294f = str2;
        this.f7295g = grsBaseInfo;
        this.h = cVar2;
    }

    public Context a() {
        return this.f7293e;
    }

    public c b() {
        return this.f7291c;
    }

    public String c() {
        return this.b;
    }

    public int d() {
        return this.f7292d;
    }

    public String e() {
        return this.f7294f;
    }

    public com.huawei.hms.framework.network.grs.e.c f() {
        return this.h;
    }

    public Callable<d> g() {
        return new f(this.b, this.f7292d, this.f7291c, this.f7293e, this.f7294f, this.f7295g, this.h);
    }
}
