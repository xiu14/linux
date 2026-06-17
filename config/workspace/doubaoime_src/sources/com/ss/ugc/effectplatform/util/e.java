package com.ss.ugc.effectplatform.util;

import android.content.Context;
import android.os.Build;
import com.bytedance.common.wschannel.WsConstants;
import com.bytedance.crash.general.RomInfo;
import com.prolificinteractive.materialcalendarview.r;
import com.ss.ugc.effectplatform.EffectConfig;
import com.ss.ugc.effectplatform.util.b;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.h;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class e {
    public static final e a = new e();

    private e() {
    }

    public static HashMap a(e eVar, EffectConfig effectConfig, boolean z, boolean z2, int i) {
        Object J2;
        HashMap<String, String> hashMap;
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            z2 = true;
        }
        kotlin.s.c.l.g(effectConfig, "configuration");
        HashMap hashMap2 = new HashMap();
        if (!l.b(null)) {
            kotlin.s.c.l.k();
            throw null;
        }
        if (!l.b(effectConfig.g())) {
            String g2 = effectConfig.g();
            if (g2 == null) {
                kotlin.s.c.l.k();
                throw null;
            }
            hashMap2.put("device_id", g2);
        }
        if (!l.b(effectConfig.h())) {
            String h = effectConfig.h();
            if (h == null) {
                kotlin.s.c.l.k();
                throw null;
            }
            hashMap2.put("device_type", h);
        }
        if (!l.b(null)) {
            kotlin.s.c.l.k();
            throw null;
        }
        if (!l.b(effectConfig.t())) {
            String t = effectConfig.t();
            if (t == null) {
                kotlin.s.c.l.k();
                throw null;
            }
            hashMap2.put("device_platform", t);
        }
        if (!l.b(effectConfig.v())) {
            String v = effectConfig.v();
            if (v == null) {
                kotlin.s.c.l.k();
                throw null;
            }
            hashMap2.put("region", v);
        }
        if (!l.b(effectConfig.w())) {
            String w = effectConfig.w();
            if (w == null) {
                kotlin.s.c.l.k();
                throw null;
            }
            hashMap2.put("sdk_version", w);
        }
        if (!l.b(effectConfig.d())) {
            String d2 = effectConfig.d();
            if (d2 == null) {
                kotlin.s.c.l.k();
                throw null;
            }
            hashMap2.put("app_version", d2);
        }
        if (!l.b(effectConfig.f())) {
            String f2 = effectConfig.f();
            if (f2 == null) {
                kotlin.s.c.l.k();
                throw null;
            }
            hashMap2.put("channel", f2);
        }
        if (!l.b(effectConfig.c())) {
            String c2 = effectConfig.c();
            if (c2 == null) {
                kotlin.s.c.l.k();
                throw null;
            }
            hashMap2.put(WsConstants.KEY_APP_ID, c2);
        }
        if (!l.b(null)) {
            kotlin.s.c.l.k();
            throw null;
        }
        HashMap<String, String> m = effectConfig.m();
        if (!(m == null || m.isEmpty())) {
            if (z) {
                hashMap = effectConfig.m();
            } else {
                HashMap<String, String> m2 = effectConfig.m();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry<String, String> entry : m2.entrySet()) {
                    String key = entry.getKey();
                    if ((kotlin.s.c.l.a(key, "lx") ^ true) && (kotlin.s.c.l.a(key, "ly") ^ true)) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                hashMap = linkedHashMap;
            }
            hashMap2.putAll(hashMap);
        }
        Object b = effectConfig.b();
        HashMap hashMap3 = new HashMap();
        hashMap3.put(WsConstants.KEY_PLATFORM, 1);
        try {
            J2 = Float.valueOf(Float.parseFloat(g.f8537e.i()));
        } catch (Throwable th) {
            J2 = r.J(th);
        }
        Float f3 = (Float) (J2 instanceof h.a ? null : J2);
        if (f3 != null) {
            hashMap3.put("gl_version", Float.valueOf(f3.floatValue()));
        }
        g gVar = g.f8537e;
        hashMap3.put("gl_vendor", gVar.h());
        hashMap3.put("gl_renderer", gVar.g());
        if (z2) {
            hashMap3.put("gl_extension", gVar.d());
        }
        if (b != null && (b instanceof Context)) {
            b.a d3 = b.d((Context) b);
            kotlin.s.c.l.b(d3, "DeviceUtil.getMemoryInfo(context)");
            long b2 = d3.b();
            if (b2 > 0) {
                hashMap3.put("memory_total_size", Long.valueOf(b2));
            }
        }
        String c3 = b.c();
        kotlin.s.c.l.b(c3, "DeviceUtil.getCpuModel()");
        hashMap3.put("cpu_vendor", c3);
        String str = Build.VERSION.RELEASE;
        kotlin.s.c.l.b(str, "Build.VERSION.RELEASE");
        hashMap3.put(RomInfo.KEY_ROM_OS_VERSION, str);
        String jSONObject = new JSONObject(hashMap3).toString();
        if (jSONObject != null) {
            hashMap2.put("device_info", jSONObject);
        }
        hashMap2.put("platform_ab_params", String.valueOf(0));
        d dVar = d.b;
        hashMap2.put("platform_sdk_version", "760.0.0.269-alpha.5");
        return hashMap2;
    }
}
