package com.bytedance.apm.B;

import com.bytedance.crash.dumper.Scraps;
import com.bytedance.services.slardar.config.IConfigManager;
import com.ss.android.socialbase.downloader.constants.MonitorConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class b implements com.bytedance.services.slardar.config.a {

    /* renamed from: c, reason: collision with root package name */
    private List<String> f3231c;

    /* renamed from: d, reason: collision with root package name */
    private List<String> f3232d;

    /* renamed from: e, reason: collision with root package name */
    private List<String> f3233e;

    /* renamed from: g, reason: collision with root package name */
    private volatile JSONObject f3235g;
    private final Map<String, Boolean> a = new ConcurrentHashMap();
    private final Map<String, Boolean> b = new ConcurrentHashMap();

    /* renamed from: f, reason: collision with root package name */
    private Map<String, String> f3234f = new HashMap();

    /* renamed from: com.bytedance.apm.B.b$b, reason: collision with other inner class name */
    private static class C0105b {
        private static final b a = new b(null);
    }

    b(a aVar) {
        LinkedList linkedList = new LinkedList();
        this.f3231c = linkedList;
        linkedList.addAll(Arrays.asList(Scraps.BATTERY, "smooth", MonitorConstants.CPU, "disk", "memory", "thread", "fd", "page_load", "page_load_trace", "start", "start_trace", "traffic", "ui"));
        ArrayList arrayList = new ArrayList();
        this.f3232d = arrayList;
        arrayList.add("enable_upload");
        this.f3232d.add("drop_enable_upload");
        this.f3232d.add("serious_block_enable_upload");
        this.f3232d.add("block_enable_upload");
        this.f3232d.add("slow_method_enable_upload");
        LinkedList linkedList2 = new LinkedList();
        this.f3233e = linkedList2;
        linkedList2.add("enable_perf_data_collect");
        this.f3234f.put("enable_upload", "fps");
        this.f3234f.put("drop_enable_upload", "fps_drop");
        this.f3234f.put("block_enable_upload", "block_monitor");
        this.f3234f.put("slow_method_enable_upload", "drop_frame_stack");
        this.f3234f.put("serious_block_enable_upload", "serious_block_monitor");
        ((IConfigManager) com.bytedance.news.common.service.manager.c.a(IConfigManager.class)).registerConfigListener(this);
    }

    public static b a() {
        return C0105b.a;
    }

    public boolean b(String str) {
        Boolean bool = this.a.get(str);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public boolean c(String str, String str2) {
        Boolean bool = this.b.get(str);
        return (bool != null && bool.booleanValue()) || (this.f3235g != null && this.f3235g.optInt(str2) == 1);
    }

    public boolean d(String str) {
        Boolean bool = this.b.get(str);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Override // com.bytedance.services.slardar.config.a
    public void onReady() {
    }

    @Override // com.bytedance.services.slardar.config.a
    public void onRefresh(JSONObject jSONObject, boolean z) {
        JSONObject optJSONObject;
        if (jSONObject == null || (optJSONObject = jSONObject.optJSONObject("performance_modules")) == null) {
            return;
        }
        for (String str : this.f3231c) {
            JSONObject optJSONObject2 = optJSONObject.optJSONObject(str);
            if (!"smooth".equals(str)) {
                if ("memory".equals(str) && optJSONObject2 != null) {
                    this.b.put("memory_object_monitor", Boolean.valueOf(optJSONObject2.optInt("memory_object_monitor", 0) == 1));
                }
                if (Scraps.BATTERY.equals(str) && optJSONObject2 != null) {
                    this.b.put("temperature", Boolean.valueOf(optJSONObject2.optInt("temperature_enable_upload", 0) == 1));
                    this.b.put("battery_trace", Boolean.valueOf(optJSONObject2.optInt("exception_enable_upload", 0) == 1));
                }
                if (MonitorConstants.CPU.equals(str) && optJSONObject2 != null) {
                    this.b.put("cpu_trace", Boolean.valueOf(optJSONObject2.optInt("exception", 0) == 1));
                }
                if ("start_trace".equals(str) && optJSONObject2 != null) {
                    for (String str2 : this.f3233e) {
                        try {
                            this.b.put(str2, Boolean.valueOf(optJSONObject2.optInt(str2, 0) == 1));
                        } catch (Exception e2) {
                            e2.printStackTrace();
                        }
                    }
                }
                if (optJSONObject2 == null || optJSONObject2.optInt("enable_upload", 0) != 1) {
                    this.a.put(str, Boolean.FALSE);
                } else {
                    this.a.put(str, Boolean.TRUE);
                }
            } else if (optJSONObject2 != null) {
                for (String str3 : this.f3232d) {
                    try {
                        this.b.put(this.f3234f.get(str3), Boolean.valueOf(optJSONObject2.optInt(str3, 0) == 1));
                    } catch (Exception e3) {
                        e3.printStackTrace();
                    }
                }
            }
        }
        this.f3235g = com.bytedance.android.input.k.b.a.r0(optJSONObject, "smooth", "scene_enable_upload");
    }
}
