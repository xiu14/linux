package com.bytedance.android.input.fragment.settings;

import com.bytedance.android.input.basic.applog.api.IAppLog;
import org.json.JSONObject;

/* loaded from: classes.dex */
final class c1 extends kotlin.s.c.m implements kotlin.s.b.a<kotlin.o> {
    public static final c1 a = new c1();

    c1() {
        super(0);
    }

    @Override // kotlin.s.b.a
    public kotlin.o invoke() {
        IAppLog.a.t("speech_action_set_click", new JSONObject());
        return kotlin.o.a;
    }
}
