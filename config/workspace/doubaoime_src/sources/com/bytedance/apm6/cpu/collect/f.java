package com.bytedance.apm6.cpu.collect;

import android.util.Log;
import androidx.annotation.Nullable;
import com.bytedance.apm.util.k;
import com.bytedance.apm6.cpu.collect.CpuCacheItem;
import com.bytedance.common.utility.NetworkUtils;
import com.ss.android.socialbase.downloader.constants.MonitorConstants;
import e.b.o.a.a.b;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class f extends com.bytedance.apm6.perf.base.model.a {
    private CpuCacheItem.CpuDataType b;

    /* renamed from: c, reason: collision with root package name */
    private b.a f3678c;

    /* renamed from: d, reason: collision with root package name */
    private String f3679d;

    /* renamed from: e, reason: collision with root package name */
    private double f3680e;

    /* renamed from: f, reason: collision with root package name */
    private double f3681f;

    /* renamed from: g, reason: collision with root package name */
    private double f3682g;
    private double h;
    private float i;
    private boolean j;
    private List<k<String, Double>> k;

    public f(CpuCacheItem.CpuDataType cpuDataType, String str, double d2, double d3, double d4, double d5, @Nullable b.a aVar) {
        this.f3680e = -1.0d;
        this.f3681f = -1.0d;
        this.f3682g = -1.0d;
        this.h = -1.0d;
        this.i = -1.0f;
        this.j = true;
        this.b = cpuDataType;
        this.f3679d = str;
        this.f3680e = d2;
        this.f3681f = d3;
        this.f3682g = d4;
        this.h = d5;
        this.f3678c = aVar;
    }

    @Override // e.b.b.k.c
    public boolean b() {
        return true;
    }

    @Override // com.bytedance.apm6.perf.base.model.a
    protected JSONObject e() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("process_name", com.bytedance.apm.g.i());
            jSONObject.put("is_main_process", com.bytedance.apm.g.F());
            jSONObject.put("scene", this.f3679d);
            int ordinal = this.b.ordinal();
            if (ordinal == 0) {
                jSONObject.put("data_type", "mix");
            } else if (ordinal == 1) {
                jSONObject.put("data_type", "front");
            } else if (ordinal == 2) {
                jSONObject.put("data_type", "back");
            }
            return jSONObject;
        } catch (Throwable th) {
            StringBuilder M = e.a.a.a.a.M("error: ");
            M.append(th.getLocalizedMessage());
            Log.e("APM-CPU", M.toString());
            return null;
        }
    }

    @Override // com.bytedance.apm6.perf.base.model.a
    protected JSONObject f() {
        String str;
        Double d2;
        try {
            JSONObject jSONObject = new JSONObject();
            List<k<String, Double>> list = this.k;
            if ((list == null || list.isEmpty()) ? false : true) {
                for (k<String, Double> kVar : this.k) {
                    if (kVar != null && (str = kVar.a) != null && !str.isEmpty() && (d2 = kVar.b) != null && d2.doubleValue() != 0.0d) {
                        jSONObject.put(kVar.a, kVar.b);
                    }
                }
            } else {
                double d3 = this.f3680e;
                if (d3 > -1.0d && this.f3681f > -1.0d) {
                    jSONObject.put("app_usage_rate", d3);
                    jSONObject.put("app_max_usage_rate", this.f3681f);
                }
                double d4 = this.f3682g;
                if (d4 > -1.0d && this.h > -1.0d) {
                    jSONObject.put("app_stat_speed", d4);
                    jSONObject.put("app_max_stat_speed", this.h);
                }
            }
            return jSONObject;
        } catch (Throwable th) {
            StringBuilder M = e.a.a.a.a.M("error: ");
            M.append(th.getLocalizedMessage());
            Log.e("APM-CPU", M.toString());
            return null;
        }
    }

    @Override // com.bytedance.apm6.perf.base.model.a
    protected JSONObject g() {
        try {
            JSONObject b = e.b.b.l.a.a.a().b();
            b.put("is_auto_sample", true);
            if (this.f3678c != null) {
                b.put("network_type", NetworkUtils.f(com.bytedance.apm.g.h()));
                b.put("battery_level", this.f3678c.f9700c);
                b.put("cpu_hardware", this.f3678c.a);
                b.put("is_charging", this.f3678c.b);
                b.put("power_save_mode", this.f3678c.f9702e);
                b.put("thermal_status", this.f3678c.f9701d);
                b.put("battery_thermal", this.f3678c.f9703f);
                b.put("is_normal_sample_state", this.j);
            }
            float f2 = this.i;
            if (f2 > 0.0f) {
                b.put("battery_current", f2);
            }
            return b;
        } catch (Throwable th) {
            StringBuilder M = e.a.a.a.a.M("error: ");
            M.append(th.getLocalizedMessage());
            Log.e("APM-CPU", M.toString());
            return null;
        }
    }

    @Override // com.bytedance.apm6.perf.base.model.a
    protected String h() {
        List<k<String, Double>> list = this.k;
        return list != null && !list.isEmpty() ? "cpu_thread" : MonitorConstants.CPU;
    }

    public void i(float f2) {
        this.i = f2;
    }

    public void j(boolean z) {
        this.j = z;
    }

    public f(CpuCacheItem.CpuDataType cpuDataType, String str, List<k<String, Double>> list, b.a aVar) {
        this.f3680e = -1.0d;
        this.f3681f = -1.0d;
        this.f3682g = -1.0d;
        this.h = -1.0d;
        this.i = -1.0f;
        this.j = true;
        this.k = new ArrayList(list);
        this.b = cpuDataType;
        this.f3679d = str;
        this.f3678c = aVar;
    }
}
