package com.bytedance.ttnet.config;

/* loaded from: classes2.dex */
class h extends com.bytedance.common.utility.h.c {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ String f6161e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ String f6162f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ i f6163g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    h(i iVar, String str, String str2, String str3) {
        super(str);
        this.f6163g = iVar;
        this.f6161e = str2;
        this.f6162f = str3;
    }

    @Override // com.bytedance.common.utility.h.c, java.lang.Runnable
    public void run() {
        i.a(this.f6163g, this.f6161e, this.f6162f);
    }
}
