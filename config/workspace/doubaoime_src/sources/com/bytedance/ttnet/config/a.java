package com.bytedance.ttnet.config;

/* loaded from: classes2.dex */
class a extends com.bytedance.common.utility.h.c {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ b f6132e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    a(b bVar, String str) {
        super(str);
        this.f6132e = bVar;
    }

    @Override // com.bytedance.common.utility.h.c, java.lang.Runnable
    public void run() {
        this.f6132e.C();
    }
}
