package com.bytedance.apm.internal;

/* loaded from: classes.dex */
class e implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ long b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ long f3448c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ String f3449d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ com.bytedance.apm.r.e f3450e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ com.bytedance.android.input.basic.a.b f3451f;

    e(ApmDelegate apmDelegate, String str, long j, long j2, String str2, com.bytedance.apm.r.e eVar, com.bytedance.android.input.basic.a.b bVar) {
        this.a = str;
        this.b = j;
        this.f3448c = j2;
        this.f3449d = str2;
        this.f3450e = eVar;
        this.f3451f = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.bytedance.apm.r.b.b(this.a, this.b, this.f3448c, this.f3449d, this.f3450e, this.f3451f);
    }
}
