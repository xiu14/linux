package com.bytedance.common.a.e;

/* loaded from: classes.dex */
final class h extends kotlin.s.c.m implements kotlin.s.b.a<String> {
    public static final h a = new h();

    h() {
        super(0);
    }

    @Override // kotlin.s.b.a
    public String invoke() {
        String str = (String) com.bytedance.dataplatform.m.j("server_args", String.class, "", true, false, true, false, null);
        kotlin.s.c.l.e(str, "getServerArgs(true)");
        return str;
    }
}
