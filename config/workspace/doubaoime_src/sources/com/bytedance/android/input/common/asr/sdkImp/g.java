package com.bytedance.android.input.common.asr.sdkImp;

@kotlin.r.h.a.e(c = "com.bytedance.android.input.common.asr.sdkImp.SdkImpl", f = "SdkImpl.kt", l = {555}, m = "destroyHandle")
/* loaded from: classes.dex */
final class g extends kotlin.r.h.a.c {
    Object a;
    /* synthetic */ Object b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ SdkImpl f2187c;

    /* renamed from: d, reason: collision with root package name */
    int f2188d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    g(SdkImpl sdkImpl, kotlin.r.d<? super g> dVar) {
        super(dVar);
        this.f2187c = sdkImpl;
    }

    @Override // kotlin.r.h.a.a
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.f2188d |= Integer.MIN_VALUE;
        return SdkImpl.i(this.f2187c, this);
    }
}
