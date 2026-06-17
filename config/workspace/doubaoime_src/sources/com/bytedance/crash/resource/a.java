package com.bytedance.crash.resource;

import androidx.annotation.NonNull;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.bytedance.crash.jni.NativeBridge;
import com.bytedance.crash.resource.j.d;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class a {
    protected d a;
    protected com.bytedance.crash.resource.d.b b;

    /* renamed from: c, reason: collision with root package name */
    protected com.bytedance.crash.resource.g.b f4655c;

    /* renamed from: d, reason: collision with root package name */
    protected com.bytedance.crash.resource.e.b f4656d;

    /* renamed from: e, reason: collision with root package name */
    protected com.bytedance.crash.resource.f.b f4657e;

    /* renamed from: f, reason: collision with root package name */
    protected com.bytedance.crash.resource.h.b f4658f;

    /* renamed from: com.bytedance.crash.resource.a$a, reason: collision with other inner class name */
    private static class C0210a {
        public static final a a = new a();
    }

    public static void a(@NonNull JSONObject jSONObject, @NonNull JSONObject jSONObject2) {
        a aVar = C0210a.a;
        boolean z = jSONObject.optInt("enable_native_heap_track") == 1;
        boolean z2 = jSONObject.optInt("app_32_or_64") == 1;
        boolean z3 = jSONObject.optInt("enable_gwp_asan") == 1;
        int i = jSONObject.optInt("enable_mmap_monitor") == 1 ? 1 : 0;
        boolean z4 = jSONObject.optInt("enable_mprotect_monitor") == 1;
        boolean z5 = jSONObject.optInt("enable_monitor_reference") == 1;
        boolean z6 = jSONObject2.optInt("enable_fd_track") == 1;
        boolean z7 = jSONObject.optInt("enable_pthread_key_monitor") == 1;
        boolean z8 = i != 0 || z4;
        if (z7) {
            com.bytedance.crash.resource.h.b bVar = new com.bytedance.crash.resource.h.b();
            aVar.f4658f = bVar;
            com.bytedance.crash.resource.h.a.e(bVar);
        }
        if (z && NativeBridge.E() == z2) {
            com.bytedance.crash.resource.f.b bVar2 = new com.bytedance.crash.resource.f.b(jSONObject.optJSONArray("native_heap_params"));
            aVar.f4657e = bVar2;
            com.bytedance.crash.resource.f.a.q(bVar2);
        }
        if (z3 && !z && !z8) {
            com.bytedance.crash.resource.e.b bVar3 = new com.bytedance.crash.resource.e.b(jSONObject.optJSONArray("gwp_asan_set_init_param"));
            aVar.f4656d = bVar3;
            com.bytedance.crash.resource.e.a.g(bVar3);
        }
        if (z8 && !z && !z3) {
            if (z4) {
                i |= 2;
            }
            d dVar = new d(i, jSONObject.optJSONArray("mmap_water_config"), jSONObject.optJSONArray("mmap_monitor_params"), jSONObject.optJSONArray("mprotect_monitor_prots"), jSONObject.optJSONArray("mmap_phy_config"));
            aVar.a = dVar;
            com.bytedance.crash.resource.j.c.v(dVar);
        }
        if (z6) {
            com.bytedance.crash.resource.d.b bVar4 = new com.bytedance.crash.resource.d.b(true, jSONObject2.optInt("allow_loop_monitor") == 1, jSONObject2.optInt("track_water_line"), jSONObject2.optInt("track_dump_line"), jSONObject2.optInt("track_sleep_time"), jSONObject2.optInt("backtrace_limit"));
            aVar.b = bVar4;
            com.bytedance.crash.resource.d.a.k(bVar4);
        }
        if ((!z8 || z || z3) && z5) {
            int optInt = jSONObject.optInt("ref_monitor_type");
            int optInt2 = jSONObject.optInt("ref_monitor_bt_flag");
            JSONArray optJSONArray = jSONObject.optJSONArray("ref_monitor_limits");
            if (optJSONArray == null || optJSONArray.length() < 3) {
                optJSONArray = new JSONArray();
                optJSONArray.put(AccessibilityNodeInfoCompat.EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_MAX_LENGTH);
                optJSONArray.put(AccessibilityNodeInfoCompat.EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_MAX_LENGTH);
                optJSONArray.put(500);
            }
            com.bytedance.crash.resource.g.b bVar5 = new com.bytedance.crash.resource.g.b(optInt, optJSONArray, optInt2);
            aVar.f4655c = bVar5;
            com.bytedance.crash.resource.g.a.e(bVar5);
        }
    }
}
