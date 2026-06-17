package com.bytedance.android.input.speech.M;

import java.util.Map;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public final class g implements com.ss.ugc.effectplatform.i.a {
    @Override // com.ss.ugc.effectplatform.i.a
    public void a(String str, int i, Map<String, ? extends Object> map) {
        l.f(str, "serviceName");
        l.f(map, "logExtraMap");
        com.bytedance.android.input.r.j.i("Effect-PlatformMonitor", "serviceName = " + str + ", status = " + i + ", logExtraMap = " + map);
    }
}
