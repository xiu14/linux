package com.bytedance.android.input.common.asr.sdkImp;

@kotlin.r.h.a.e(c = "com.bytedance.android.input.common.asr.sdkImp.SdkImpl", f = "SdkImpl.kt", l = {528}, m = "unInitEngine")
/* loaded from: classes.dex */
final class i extends kotlin.r.h.a.c {
    Object a;
    /* synthetic */ Object b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ SdkImpl f2191c;

    /* renamed from: d, reason: collision with root package name */
    int f2192d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    i(SdkImpl sdkImpl, kotlin.r.d<? super i> dVar) {
        super(dVar);
        this.f2191c = sdkImpl;
    }

    @Override // kotlin.r.h.a.a
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.f2192d |= Integer.MIN_VALUE;
        return SdkImpl.u(this.f2191c, this);
    }
}
