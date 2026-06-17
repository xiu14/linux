package com.bytedance.ttnet.config;

import android.os.Build;
import com.bytedance.common.utility.Logger;
import com.bytedance.retrofit2.A;
import com.bytedance.retrofit2.I;
import com.bytedance.retrofit2.RetrofitMetrics;
import com.bytedance.ttnet.TTNetInit;
import com.bytedance.ttnet.config.f;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class d {
    private static final AtomicBoolean a = new AtomicBoolean(false);
    private static final AtomicBoolean b = new AtomicBoolean(false);

    /* renamed from: c, reason: collision with root package name */
    private static final AtomicBoolean f6146c = new AtomicBoolean(false);

    /* renamed from: d, reason: collision with root package name */
    private static final AtomicBoolean f6147d = new AtomicBoolean(false);

    /* renamed from: e, reason: collision with root package name */
    private static final AtomicBoolean f6148e = new AtomicBoolean(false);

    /* renamed from: f, reason: collision with root package name */
    private static final AtomicBoolean f6149f = new AtomicBoolean(true);

    /* renamed from: g, reason: collision with root package name */
    private static final List<String> f6150g = new CopyOnWriteArrayList();

    public static boolean a() {
        return f6148e.get();
    }

    public static boolean b() {
        return f6149f.get();
    }

    public static boolean c() {
        return f6146c.get();
    }

    public static void d(Object obj) {
        JSONObject optJSONObject;
        try {
            if (obj instanceof f.a) {
                JSONObject b2 = ((f.a) obj).b();
                optJSONObject = b2 != null ? b2.optJSONObject(RemoteMessageConst.DATA) : null;
            } else {
                optJSONObject = (!(obj instanceof JSONObject) || ((JSONObject) obj).isNull(RemoteMessageConst.DATA)) ? (JSONObject) obj : ((JSONObject) obj).optJSONObject(RemoteMessageConst.DATA);
            }
            if (optJSONObject == null) {
                return;
            }
            a.set(optJSONObject.optInt("enable_json_wrapper") > 0);
            b.set(optJSONObject.optInt("enable_tnc_jsonopt") > 0);
            JSONObject optJSONObject2 = optJSONObject.optJSONObject("cronet_fallback_config");
            if (optJSONObject2 != null) {
                f6146c.set(optJSONObject2.optInt("enable_with_contain_armabi") > 0);
                f6147d.set(optJSONObject2.optInt("disable_reason_boot") > 0);
                f6148e.set(optJSONObject2.optInt("disable_reason_cronet_exception") > 0);
                f6149f.set(optJSONObject2.optInt("disable_reason_null_appconfig", 1) > 0);
                JSONArray optJSONArray = optJSONObject2.optJSONArray("merge_model_black_list");
                List<String> list = f6150g;
                if (list != null) {
                    list.clear();
                    if (optJSONArray != null) {
                        for (int i = 0; i < optJSONArray.length(); i++) {
                            try {
                                list.add(optJSONArray.getString(i));
                            } catch (JSONException e2) {
                                throw new RuntimeException(e2);
                            }
                        }
                    }
                }
                AtomicBoolean atomicBoolean = f6147d;
                if (atomicBoolean.get()) {
                    b.q(((com.bytedance.android.input.ttnet.d) TTNetInit.getTTNetDepend()).c()).y();
                }
                if (f6150g.contains(Build.MODEL)) {
                    b.L = true;
                }
                if (Logger.debug()) {
                    Logger.d("ExperimentalSwitches", "sEnableWithContainArmabi is " + f6146c);
                    Logger.d("ExperimentalSwitches", "sDisableFallbackReasonCronetException is " + f6148e);
                    Logger.d("ExperimentalSwitches", "sDisableFallbackReasonBoot is " + atomicBoolean);
                    Logger.d("ExperimentalSwitches", "sDisableFallbackReasonNullAppconfig is " + f6149f);
                }
            }
            JSONObject optJSONObject3 = optJSONObject.optJSONObject("ttnet_okio");
            if (optJSONObject3 != null) {
                com.bytedance.frameworks.baselib.network.http.impl.b.E(optJSONObject3.optInt("okio_read_enabled", 1) > 0);
                com.bytedance.frameworks.baselib.network.http.cronet.impl.c.T(optJSONObject3.optInt("zero_copy_enabled", 1) > 0);
            }
            boolean z = optJSONObject.optInt("enable_monitor_v2") > 0;
            com.bytedance.frameworks.baselib.network.http.j.f(z);
            com.bytedance.frameworks.baselib.network.http.f.L(z);
            boolean z2 = optJSONObject.optInt("disallow_dup_report") > 0;
            com.bytedance.frameworks.baselib.network.http.j.e(z2);
            com.bytedance.frameworks.baselib.network.http.f.F(z2);
            if (optJSONObject.optInt("fix_cancel_req_report_v2") > 0) {
                com.bytedance.frameworks.baselib.network.http.cronet.impl.c.N();
            }
            RetrofitMetrics.n0(optJSONObject.optInt("sync_report_log") > 0);
            RetrofitMetrics.k0(optJSONObject.optInt("report_new_metrics") > 0);
            if (optJSONObject.optInt("use_thread_pool") > 0) {
                RetrofitMetrics.h0(new com.bytedance.frameworks.baselib.network.d.a());
            }
            if (optJSONObject.optInt("opt_reflection") > 0) {
                com.bytedance.frameworks.baselib.network.i.a.f(true);
                com.bytedance.frameworks.baselib.network.http.f.J(true);
            } else {
                com.bytedance.frameworks.baselib.network.i.a.f(false);
                com.bytedance.frameworks.baselib.network.http.f.J(false);
            }
            int optInt = optJSONObject.optInt("report_detail", -1);
            I.c(optInt);
            A.b(optInt);
        } catch (JSONException e3) {
            throw new RuntimeException(e3);
        }
    }
}
