package com.bytedance.common.a.e;

/* loaded from: classes.dex */
final class d extends kotlin.s.c.m implements kotlin.s.b.a<g> {
    public static final d a = new d();

    d() {
        super(0);
    }

    @Override // kotlin.s.b.a
    public g invoke() {
        g gVar = (g) com.bytedance.dataplatform.m.j("keyboard_default_layout", g.class, new g(false, false, false), true, false, true, false, new com.bytedance.dataplatform.u.a("com.bytedance.common.ad_test.experiment.KbdDefaultLayoutExperiment", 0.0d, "abtest", new String[]{"keyboard_default_layout"}, new com.bytedance.dataplatform.u.b("16290311", 0.5d, new g(false, false, false)), new com.bytedance.dataplatform.u.b("16290312", 0.5d, new g(true, true, true))));
        kotlin.s.c.l.e(gVar, "getKeyboardDefaultLayout(true)");
        return gVar;
    }
}
