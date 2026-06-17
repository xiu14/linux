package com.bytedance.common.a.e;

/* loaded from: classes.dex */
final class n extends kotlin.s.c.m implements kotlin.s.b.a<Boolean> {
    public static final n a = new n();

    n() {
        super(0);
    }

    @Override // kotlin.s.b.a
    public Boolean invoke() {
        return Boolean.valueOf(!((Boolean) com.bytedance.dataplatform.m.j("audio_frontier_quic_enable", Boolean.class, Boolean.TRUE, true, false, true, false, null)).booleanValue());
    }
}
