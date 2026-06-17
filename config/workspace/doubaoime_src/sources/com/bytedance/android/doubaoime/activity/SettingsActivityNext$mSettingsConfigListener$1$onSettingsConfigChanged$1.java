package com.bytedance.android.doubaoime.activity;

/* loaded from: classes.dex */
final class SettingsActivityNext$mSettingsConfigListener$1$onSettingsConfigChanged$1 extends kotlin.s.c.m implements kotlin.s.b.l<com.bytedance.android.input.h.c, kotlin.o> {
    final /* synthetic */ String $key;
    final /* synthetic */ T $value;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SettingsActivityNext$mSettingsConfigListener$1$onSettingsConfigChanged$1(String str, T t) {
        super(1);
        this.$key = str;
        this.$value = t;
    }

    @Override // kotlin.s.b.l
    public /* bridge */ /* synthetic */ kotlin.o invoke(com.bytedance.android.input.h.c cVar) {
        invoke2(cVar);
        return kotlin.o.a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(com.bytedance.android.input.h.c cVar) {
        kotlin.s.c.l.f(cVar, "it");
        cVar.g0(this.$key, String.valueOf(this.$value));
    }
}
