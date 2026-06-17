package com.bytedance.android.input.keyboard.gif.list_layout.models;

@kotlin.r.h.a.e(c = "com.bytedance.android.input.keyboard.gif.list_layout.models.EmoticonsWordManager", f = "EmoticonsWordManager.kt", l = {81}, m = "doUpdate")
/* loaded from: classes.dex */
final class e extends kotlin.r.h.a.c {
    /* synthetic */ Object a;
    final /* synthetic */ g b;

    /* renamed from: c, reason: collision with root package name */
    int f2754c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    e(g gVar, kotlin.r.d<? super e> dVar) {
        super(dVar);
        this.b = gVar;
    }

    @Override // kotlin.r.h.a.a
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.f2754c |= Integer.MIN_VALUE;
        return g.a(this.b, this);
    }
}
