package com.bytedance.push.R;

import android.text.TextUtils;
import com.xiaomi.mipush.sdk.Constants;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class b {
    public String a;
    public String[] b;

    /* renamed from: c, reason: collision with root package name */
    public long f5576c;

    /* renamed from: d, reason: collision with root package name */
    public long f5577d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f5578e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f5579f;

    /* renamed from: g, reason: collision with root package name */
    public long f5580g;
    public long h;
    public boolean i;
    public boolean j;
    public boolean k;
    public int l;

    public b(Map<String, String> map) {
        map = map == null ? new HashMap<>() : map;
        this.a = map.get("callback_intent");
        String str = map.get("screen_action");
        if (!TextUtils.isEmpty(str)) {
            this.b = str.split(Constants.ACCEPT_TIME_SEPARATOR_SP);
        }
        this.f5576c = com.ss.android.message.f.a.F(map.get("delay_report_in_mill"), 0L);
        this.f5577d = com.ss.android.message.f.a.F(map.get("kill_self_delay_in_mill"), 6000L);
        this.f5578e = com.ss.android.message.f.a.D(map.get("kill_self_after_signal_report"), true);
        this.f5580g = com.ss.android.message.f.a.F(map.get("min_install_time_in_mill"), 259200000L);
        this.h = com.ss.android.message.f.a.F(map.get("min_signal_interval_in_mill"), 3600000L);
        this.f5579f = com.ss.android.message.f.a.D(map.get("filter_debug_device"), true);
        this.i = com.ss.android.message.f.a.D(map.get("filter_sim_card"), true);
        this.j = com.ss.android.message.f.a.D(map.get("unregister_for_risk_signal"), true);
        this.k = com.ss.android.message.f.a.D(map.get("unregister_for_un_risk_signal"), false);
        this.l = com.ss.android.message.f.a.E(map.get("kill_process_mode"), 1);
    }
}
