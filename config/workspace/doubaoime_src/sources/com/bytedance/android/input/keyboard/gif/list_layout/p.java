package com.bytedance.android.input.keyboard.gif.list_layout;

import kotlinx.coroutines.C0795d;
import kotlinx.coroutines.G;
import kotlinx.coroutines.S;

/* loaded from: classes.dex */
final class p extends kotlin.s.c.m implements kotlin.s.b.p<Integer, com.bytedance.android.input.keyboard.gif.list_layout.models.b, kotlin.o> {
    final /* synthetic */ ImeEmoticonsLayout a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    p(ImeEmoticonsLayout imeEmoticonsLayout) {
        super(2);
        this.a = imeEmoticonsLayout;
    }

    @Override // kotlin.s.b.p
    public kotlin.o invoke(Integer num, com.bytedance.android.input.keyboard.gif.list_layout.models.b bVar) {
        G g2;
        int intValue = num.intValue();
        com.bytedance.android.input.keyboard.gif.list_layout.models.b bVar2 = bVar;
        kotlin.s.c.l.f(bVar2, "itemData");
        com.bytedance.android.input.r.j.i("ImeEmoticons-UI", "handleItemClick position = " + intValue + "---itemData = " + bVar2);
        g2 = this.a.f2733e;
        C0795d.b(g2, S.b(), null, new o(this.a, intValue, bVar2, null), 2, null);
        return kotlin.o.a;
    }
}
