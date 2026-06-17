package com.bytedance.common.a.e;

/* loaded from: classes.dex */
final class a extends kotlin.s.c.m implements kotlin.s.b.a<Boolean> {
    public static final a a = new a();

    a() {
        super(0);
    }

    @Override // kotlin.s.b.a
    public Boolean invoke() {
        Boolean bool = (Boolean) com.bytedance.dataplatform.m.j("is_support_high_hz", Boolean.class, Boolean.FALSE, true, false, true, false, null);
        kotlin.s.c.l.e(bool, "getIsSupportHighHz(true)");
        return bool;
    }
}
