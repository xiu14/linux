package com.bytedance.common.a.e;

/* loaded from: classes.dex */
final class k extends kotlin.s.c.m implements kotlin.s.b.a<Boolean> {
    public static final k a = new k();

    k() {
        super(0);
    }

    @Override // kotlin.s.b.a
    public Boolean invoke() {
        Boolean bool = (Boolean) com.bytedance.dataplatform.m.j("voice_send_command_enabled", Boolean.class, Boolean.FALSE, true, false, true, false, null);
        kotlin.s.c.l.e(bool, "getVoiceSendCommandEnabled(true)");
        return bool;
    }
}
