package com.bytedance.android.input.common_biz.performance;

import java.util.Map;
import kotlin.s.c.m;

/* loaded from: classes.dex */
final class l extends m implements kotlin.s.b.l<Map.Entry<String, Object>, CharSequence> {
    public static final l a = new l();

    l() {
        super(1);
    }

    @Override // kotlin.s.b.l
    public CharSequence invoke(Map.Entry<String, Object> entry) {
        Map.Entry<String, Object> entry2 = entry;
        kotlin.s.c.l.f(entry2, "it");
        return entry2.getKey() + '=' + entry2.getValue();
    }
}
