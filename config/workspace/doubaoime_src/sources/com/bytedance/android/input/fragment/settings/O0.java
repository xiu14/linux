package com.bytedance.android.input.fragment.settings;

/* loaded from: classes.dex */
final class O0 extends kotlin.s.c.m implements kotlin.s.b.a<kotlin.o> {
    final /* synthetic */ InputRecommendFragment a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    O0(InputRecommendFragment inputRecommendFragment) {
        super(0);
        this.a = inputRecommendFragment;
    }

    @Override // kotlin.s.b.a
    public kotlin.o invoke() {
        com.bytedance.android.input.r.j.i("InputRecommendFragment", "[ASSOCIATE] rightClickListener.");
        InputRecommendFragment.s(this.a, true);
        return kotlin.o.a;
    }
}
