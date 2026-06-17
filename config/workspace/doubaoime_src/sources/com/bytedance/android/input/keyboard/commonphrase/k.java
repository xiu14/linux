package com.bytedance.android.input.keyboard.commonphrase;

import com.bytedance.android.input.keyboard.commonphrase.CommonPhraseItemAdapter;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.s.c.m;

/* loaded from: classes.dex */
final class k extends m implements kotlin.s.b.l<Map.Entry<Integer, WeakReference<CommonPhraseItemAdapter.ItemHolder>>, Boolean> {
    final /* synthetic */ CommonPhraseItemAdapter.ItemHolder a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    k(CommonPhraseItemAdapter.ItemHolder itemHolder) {
        super(1);
        this.a = itemHolder;
    }

    @Override // kotlin.s.b.l
    public Boolean invoke(Map.Entry<Integer, WeakReference<CommonPhraseItemAdapter.ItemHolder>> entry) {
        Map.Entry<Integer, WeakReference<CommonPhraseItemAdapter.ItemHolder>> entry2 = entry;
        kotlin.s.c.l.f(entry2, "it");
        return Boolean.valueOf(kotlin.s.c.l.a(entry2.getValue().get(), this.a));
    }
}
