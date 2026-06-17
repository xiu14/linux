package com.bytedance.android.doubaoime.activity;

/* loaded from: classes.dex */
final class SettingsActivityNext$settingsFragmentActive$1 extends kotlin.s.c.m implements kotlin.s.b.l<com.bytedance.android.input.h.c, kotlin.o> {
    final /* synthetic */ boolean $active;
    final /* synthetic */ int $page;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SettingsActivityNext$settingsFragmentActive$1(int i, boolean z) {
        super(1);
        this.$page = i;
        this.$active = z;
    }

    @Override // kotlin.s.b.l
    public /* bridge */ /* synthetic */ kotlin.o invoke(com.bytedance.android.input.h.c cVar) {
        invoke2(cVar);
        return kotlin.o.a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(com.bytedance.android.input.h.c cVar) {
        kotlin.s.c.l.f(cVar, "it");
        cVar.V(this.$page, this.$active);
    }
}
