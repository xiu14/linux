package com.bytedance.apm.config;

import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.bytedance.apm.F.b;
import com.bytedance.apm.doctor.DoctorManager;
import com.bytedance.apm.util.j;
import com.bytedance.common.wschannel.WsConstants;
import com.bytedance.monitor.collector.g;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.ss.android.socialbase.downloader.utils.DownloadHelper;
import com.vivo.push.PushClient;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.zip.GZIPOutputStream;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class i implements b.e {
    private volatile boolean a;

    /* renamed from: c, reason: collision with root package name */
    private volatile JSONObject f3414c;

    /* renamed from: d, reason: collision with root package name */
    private volatile JSONObject f3415d;

    /* renamed from: e, reason: collision with root package name */
    private volatile JSONObject f3416e;
    private volatile SharedPreferences h;
    private com.bytedance.apm.core.d i;
    private JSONObject j;
    private boolean k;
    private boolean p;
    private boolean q;
    private volatile long r;
    private volatile long s;
    private List<com.bytedance.services.slardar.config.a> t;
    private volatile boolean b = false;

    /* renamed from: f, reason: collision with root package name */
    private List<String> f3417f = com.bytedance.apm.u.a.a;

    /* renamed from: g, reason: collision with root package name */
    private volatile long f3418g = 1200;
    private long l = -1;
    private long m = com.heytap.mcssdk.constant.a.f6886d;
    private long n = -1;
    private volatile boolean o = false;

    class a implements g.c {

        /* renamed from: com.bytedance.apm.config.i$a$a, reason: collision with other inner class name */
        class RunnableC0116a implements Runnable {
            final /* synthetic */ long a;

            RunnableC0116a(long j) {
                this.a = j;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("looper_monitor", this.a);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("is_main_process", i.this.q);
                    com.bytedance.apm.c.g("apm_cost", jSONObject2, jSONObject, null);
                } catch (JSONException unused) {
                }
            }
        }

        a() {
        }

        @Override // com.bytedance.monitor.collector.g.c
        public void a(long j) {
            com.bytedance.apm.F.b.e().h(new RunnableC0116a(j));
        }
    }

    i() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean A() {
        /*
            Method dump skipped, instructions count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.apm.config.i.A():boolean");
    }

    public static byte[] d(byte[] bArr, Map<String, String> map) throws IOException {
        if (bArr.length <= 128) {
            return bArr;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(8192);
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        try {
            try {
                gZIPOutputStream.write(bArr);
                gZIPOutputStream.close();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                map.put(DownloadHelper.CONTENT_ENCODING, DownloadHelper.GZIP);
                return byteArray;
            } catch (IOException e2) {
                com.bytedance.services.apm.api.a.e(e2, "SlardarConfigFetcher->compress");
                throw e2;
            }
        } catch (Throwable th) {
            gZIPOutputStream.close();
            throw th;
        }
    }

    private boolean m(com.bytedance.services.apm.api.c cVar) throws JSONException {
        if (cVar == null || cVar.c() != 200) {
            if (com.bytedance.apm.g.B()) {
                DoctorManager doctorManager = DoctorManager.getInstance();
                StringBuilder M = e.a.a.a.a.M("statusCode error:");
                M.append(cVar == null ? "null" : Integer.valueOf(cVar.c()));
                doctorManager.b("APM_SETTING_UPDATE_FROM_NET_ERROR", M.toString());
            }
            return false;
        }
        byte[] b = cVar.b();
        if (b == null) {
            return false;
        }
        JSONObject jSONObject = new JSONObject(new String(b));
        if (com.bytedance.apm.g.B()) {
            e.b.b.n.g.b.a("SlardarConfigFetcher", "resultJSON:" + jSONObject);
            DoctorManager.getInstance().b("APM_SETTING_UPDATE_FROM_NET_RESULT", jSONObject.toString());
        }
        JSONObject optJSONObject = jSONObject.optJSONObject(com.bytedance.apm.g.k().optString(WsConstants.KEY_APP_ID));
        if (optJSONObject == null) {
            return false;
        }
        return B(optJSONObject);
    }

    private void p() {
        if (this.h == null) {
            synchronized (this) {
                if (this.h == null) {
                    this.h = com.bytedance.apm.core.e.e(com.bytedance.apm.g.h(), "monitor_config");
                }
            }
        }
    }

    private boolean q() {
        return this.q || this.p;
    }

    private boolean r(long j) {
        long j2 = this.m;
        return j2 > com.heytap.mcssdk.constant.a.f6886d ? j - this.n > j2 : j - this.l > this.f3418g * 1000;
    }

    private void t() {
        if (this.a) {
            return;
        }
        this.a = true;
        List<com.bytedance.services.slardar.config.a> list = this.t;
        if (list != null) {
            Iterator<com.bytedance.services.slardar.config.a> it2 = list.iterator();
            while (it2.hasNext()) {
                try {
                    it2.next().onReady();
                } catch (Throwable th) {
                    if (com.bytedance.apm.g.B()) {
                        th.printStackTrace();
                    }
                    com.bytedance.services.apm.api.a.d(th);
                }
            }
        }
    }

    private void u(JSONObject jSONObject, boolean z) {
        List<com.bytedance.services.slardar.config.a> list = this.t;
        if (list != null) {
            Iterator<com.bytedance.services.slardar.config.a> it2 = list.iterator();
            while (it2.hasNext()) {
                try {
                    it2.next().onRefresh(jSONObject, z);
                } catch (Throwable th) {
                    if (com.bytedance.apm.g.B()) {
                        th.printStackTrace();
                    }
                    com.bytedance.services.apm.api.a.d(th);
                }
            }
        }
    }

    private void w(boolean z) {
        if (com.bytedance.apm.g.B()) {
            StringBuilder M = e.a.a.a.a.M("SlardarConfigFetcher.queryFromNet.");
            M.append(q());
            M.append(" ");
            M.append(r(System.currentTimeMillis()));
            com.bytedance.apm.y.d.d("apm_initializing", M.toString());
            DoctorManager.getInstance().b("APM_SETTING_UPDATE_FROM_NET", "queryFromNet:" + z);
        }
        if (q() && (z || r(System.currentTimeMillis()))) {
            if (!j.b(com.bytedance.apm.g.h())) {
                if (com.bytedance.apm.g.B()) {
                    com.bytedance.apm.y.d.d("apm_initializing", "SlardarConfigFetcher.queryFromNet.NetworkUnavailable");
                    DoctorManager.getInstance().b("APM_SETTING_UPDATE_FROM_NET_ERROR", "network not available");
                    return;
                }
                return;
            }
            com.bytedance.apm.core.d dVar = this.i;
            if (dVar == null || dVar.a() == null || this.i.a().isEmpty()) {
                if (com.bytedance.apm.g.B()) {
                    com.bytedance.apm.y.d.d("apm_initializing", "SlardarConfigFetcher.queryFromNet.ParamsEmpty");
                    DoctorManager.getInstance().b("APM_SETTING_UPDATE_FROM_NET_ERROR", "mQueryParams not available");
                    return;
                }
                return;
            }
            if (this.r == 0) {
                this.r = this.h.getLong("monitor_last_calculate_timestamp_v5", 0L);
            }
            if (this.s == 0) {
                this.s = this.h.getLong("monitor_last_full_calculate_timestamp_v5", 0L);
            }
            this.n = System.currentTimeMillis();
            boolean z2 = false;
            for (String str : this.f3417f) {
                try {
                    JSONObject y = y();
                    String optString = com.bytedance.apm.g.k().optString(WsConstants.KEY_APP_ID);
                    HashMap hashMap = new HashMap();
                    hashMap.put(DownloadHelper.CONTENT_TYPE, "application/json; charset=utf-8");
                    JSONObject jSONObject = new JSONObject();
                    if (!TextUtils.isEmpty(optString) && !optString.equals("0")) {
                        jSONObject.put(optString, y);
                    }
                    com.bytedance.services.apm.api.c d2 = com.bytedance.apm.g.d(str, d(jSONObject.toString().getBytes(), hashMap), hashMap);
                    if (com.bytedance.apm.g.B()) {
                        DoctorManager.getInstance().b("APM_SETTING_UPDATE_FROM_NET_REQUEST", str);
                    }
                    z2 = m(d2);
                    if (com.bytedance.apm.g.B()) {
                        com.bytedance.apm.y.d.d("apm_initializing", "SlardarConfigFetcher.queryFromNet.fetchResult: " + d2.b().length + " " + z2);
                    }
                } catch (Throwable th) {
                    if (com.bytedance.apm.g.B()) {
                        DoctorManager.getInstance().b("APM_SETTING_UPDATE_FROM_NET_ERROR", "queFromNetError:" + th);
                    }
                }
                if (z2) {
                    break;
                }
            }
            if (z2) {
                this.m = com.heytap.mcssdk.constant.a.f6886d;
            } else {
                this.m = Math.min(this.m * 2, 600000L);
            }
        }
    }

    private void z(JSONObject jSONObject) {
        JSONObject optJSONObject;
        if (com.bytedance.android.input.k.b.a.c0(jSONObject)) {
            return;
        }
        JSONObject r0 = com.bytedance.android.input.k.b.a.r0(jSONObject, "general", "slardar_api_settings");
        if (r0 != null) {
            JSONObject optJSONObject2 = r0.optJSONObject("fetch_setting");
            if (optJSONObject2 != null) {
                this.f3418g = optJSONObject2.optLong("fetch_setting_interval", 1200L);
            }
            if (this.f3418g < 600) {
                this.f3418g = 600L;
            }
        }
        JSONObject optJSONObject3 = jSONObject.optJSONObject("custom_event_settings");
        if (optJSONObject3 != null) {
            this.f3414c = optJSONObject3.optJSONObject("allow_log_type");
            this.f3415d = optJSONObject3.optJSONObject("allow_metric_type");
            this.f3416e = optJSONObject3.optJSONObject("allow_service_name");
        }
        this.j = jSONObject;
        JSONObject h = h("exception_modules");
        if (h != null && (optJSONObject = h.optJSONObject("exception")) != null) {
            this.b = optJSONObject.optInt("enable_upload") == 1;
        }
        if (k("apm_cost")) {
            com.bytedance.monitor.collector.g.k(new a());
            com.bytedance.monitor.collector.g.e(true);
        }
    }

    public boolean B(JSONObject jSONObject) {
        JSONObject jSONObject2;
        int optInt = jSONObject.optInt("code", -1);
        if (optInt == -1) {
            return false;
        }
        if (optInt == 1) {
            this.l = System.currentTimeMillis();
            this.r = jSONObject.optInt("last_calculate_timestamp", 0) * 1000;
            this.s = jSONObject.optInt("last_full_calculate_timestamp", 0) * 1000;
            SharedPreferences.Editor edit = this.h.edit();
            edit.putLong("monitor_configure_refresh_time", this.l);
            edit.putLong("monitor_last_calculate_timestamp_v5", this.r);
            edit.putLong("monitor_last_full_calculate_timestamp_v5", this.s);
            edit.commit();
            return true;
        }
        if (optInt != 0 && optInt != 2) {
            return false;
        }
        JSONObject optJSONObject = jSONObject.optJSONObject(RemoteMessageConst.DATA);
        if (optJSONObject == null) {
            String v = v();
            if (TextUtils.isEmpty(v)) {
                v = "{}";
            }
            String str = v;
            try {
                optJSONObject = new JSONObject(str);
            } catch (JSONException e2) {
                com.bytedance.services.apm.api.a.e(e2, "SlardarConfigFetcher->updateWithSpecificAidResult");
                if (com.bytedance.apm.g.B()) {
                    e.b.b.n.g.b.b("SlardarConfigFetcher", "error parse configStr:" + str);
                }
                jSONObject2 = null;
            }
        }
        jSONObject2 = optJSONObject;
        if (jSONObject2 == null) {
            return false;
        }
        try {
            JSONObject optJSONObject2 = jSONObject.optJSONObject("data_to_merge");
            if (optJSONObject2 != null) {
                e.b.b.n.b.d(jSONObject2, optJSONObject2);
            }
        } catch (JSONException e3) {
            com.bytedance.services.apm.api.a.e(e3, "SlardarConfigFetcher->updateWithSpecificAidResult 2");
            if (com.bytedance.apm.g.B()) {
                e.b.b.n.g.b.b("SlardarConfigFetcher", "error nested data: dataToMerge");
            }
        }
        try {
            JSONObject optJSONObject3 = jSONObject.optJSONObject("data_to_delete");
            if (optJSONObject3 != null) {
                e.b.b.n.b.b(jSONObject2, optJSONObject3);
            }
        } catch (JSONException e4) {
            com.bytedance.services.apm.api.a.e(e4, "SlardarConfigFetcher->updateWithSpecificAidResult 3");
            if (com.bytedance.apm.g.B()) {
                e.b.b.n.g.b.b("SlardarConfigFetcher", "error nested data: dataToDelete");
            }
        }
        this.r = jSONObject.optInt("last_calculate_timestamp", 0) * 1000;
        this.s = jSONObject.optInt("last_full_calculate_timestamp", 0) * 1000;
        this.l = System.currentTimeMillis();
        this.k = false;
        z(jSONObject2);
        if (jSONObject2.optJSONObject("general") != null) {
            com.bytedance.apm.internal.g.h(32, !r0.optBoolean("enable_salvage_log", true));
        }
        JSONObject r0 = com.bytedance.android.input.k.b.a.r0(jSONObject2, "performance_modules", "smooth");
        if (r0 != null) {
            com.bytedance.apm.internal.g.h(1, r0.optInt("block_enable_upload", 0) == 1);
            com.bytedance.apm.internal.g.h(2, r0.optInt("enable_trace", 0) == 1);
            com.bytedance.apm.internal.g.h(64, r0.optInt("enable_stack_sampling", 0) == 1);
            com.bytedance.apm.internal.g.f(r0.optLong("atrace_tag", 0L));
            int q0 = com.bytedance.android.input.k.b.a.q0(jSONObject2, "performance_modules", "smooth", "block_monitor_mode");
            com.bytedance.apm.internal.g.g(-536870912, (q0 != 11 ? q0 != 101 ? q0 != 1001 ? 1 : 0 : 3 : 2) << 29);
        }
        JSONObject r02 = com.bytedance.android.input.k.b.a.r0(jSONObject2, "performance_modules", "start_trace");
        if (r02 != null) {
            com.bytedance.apm.internal.g.h(4, r02.optInt("enable_perf_data_collect", 0) == 1);
            com.bytedance.apm.internal.g.h(8, r02.optInt("enable_lock_data_collect", 0) == 1);
            com.bytedance.apm.internal.g.h(16, r02.optInt("enable_long_sleep_data_collect", 0) == 1);
        }
        if (r0 != null || r02 != null) {
            com.bytedance.apm.internal.g.e();
        }
        SharedPreferences.Editor edit2 = this.h.edit();
        edit2.putString("monitor_net_config", jSONObject2.toString());
        edit2.putInt("setting_version", 5);
        edit2.putLong("monitor_configure_refresh_time", this.l);
        edit2.putLong("monitor_last_calculate_timestamp_v5", this.r);
        edit2.putLong("monitor_last_full_calculate_timestamp_v5", this.s);
        edit2.commit();
        u(jSONObject2, false);
        t();
        com.bytedance.apm.g.e("config_time", this.l + "");
        e.b.b.h.c.a.A(this.l);
        com.bytedance.apm.F.b.e().j(new h(this), 1000L);
        com.bytedance.apm.y.a.b("apm_debug", "APM_SETTING_READY");
        return true;
    }

    void c(com.bytedance.services.slardar.config.a aVar) {
        if (aVar == null) {
            return;
        }
        if (this.t == null) {
            this.t = new CopyOnWriteArrayList();
        }
        if (!this.t.contains(aVar)) {
            this.t.add(aVar);
        }
        if (com.bytedance.apm.g.B()) {
            StringBuilder M = e.a.a.a.a.M("addConfigListener, mReady=");
            M.append(this.a);
            com.bytedance.apm.y.d.d("apm_initializing", M.toString());
        }
        if (this.a) {
            aVar.onRefresh(this.j, this.k);
            aVar.onReady();
        }
    }

    @WorkerThread
    public void e(@Nullable com.bytedance.apm.core.d dVar, @Nullable List<String> list) {
        A();
        if (dVar != null) {
            this.i = dVar;
        }
        if (!com.bytedance.android.input.k.b.a.a0(list)) {
            this.f3417f = new ArrayList(list);
        }
        w(true);
    }

    public JSONObject f() {
        return this.j;
    }

    int g(String str, int i) {
        JSONObject jSONObject;
        return (TextUtils.isEmpty(str) || (jSONObject = this.j) == null) ? i : jSONObject.optInt(str, i);
    }

    JSONObject h(String str) {
        JSONObject jSONObject;
        return (TextUtils.isEmpty(str) || (jSONObject = this.j) == null) ? new JSONObject() : jSONObject.optJSONObject(str);
    }

    public boolean i(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (TextUtils.equals(str, "block_monitor")) {
            str = "caton_monitor";
        }
        return TextUtils.equals(str, "core_exception_monitor") ? this.b : this.f3414c != null && this.f3414c.optInt(str) == 1;
    }

    boolean j(String str) {
        return (this.f3415d == null || TextUtils.isEmpty(str) || this.f3415d.optInt(str) != 1) ? false : true;
    }

    boolean k(String str) {
        return (this.f3416e == null || TextUtils.isEmpty(str) || this.f3416e.optInt(str) != 1) ? false : true;
    }

    boolean l(String str) {
        JSONObject jSONObject;
        if (TextUtils.isEmpty(str) || (jSONObject = this.j) == null) {
            return false;
        }
        return jSONObject.optBoolean(str);
    }

    @WorkerThread
    void n() {
        boolean A = A();
        if (com.bytedance.apm.g.F()) {
            if (this.l > System.currentTimeMillis()) {
                A = true;
            }
            w(A);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.util.List<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.util.ArrayList] */
    public void o(boolean z, com.bytedance.apm.core.d dVar, List<String> list) {
        ?? emptyList;
        this.p = z;
        this.q = com.bytedance.apm.g.F();
        p();
        this.i = dVar;
        if (!com.bytedance.android.input.k.b.a.a0(list)) {
            if (!com.bytedance.android.input.k.b.a.a0(list)) {
                emptyList = new ArrayList(2);
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    String host = new URL(list.get(i)).getHost();
                    if (!TextUtils.isEmpty(host) && host.indexOf(46) > 0) {
                        emptyList.add("https://" + host + "/monitor/appmonitor/v5/batch_settings");
                    }
                }
                this.f3417f = emptyList;
            }
            emptyList = Collections.emptyList();
            this.f3417f = emptyList;
        }
        if (this.o) {
            return;
        }
        this.o = true;
        if (q()) {
            com.bytedance.apm.F.b.e().b(this);
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.apm.setting.update.action");
        g gVar = new g(this);
        if (com.bytedance.apm.g.h() != null) {
            try {
                if (Build.VERSION.SDK_INT > 33) {
                    com.bytedance.apm.g.h().registerReceiver(gVar, intentFilter, 2);
                } else {
                    com.bytedance.apm.g.h().registerReceiver(gVar, intentFilter);
                }
            } catch (Throwable th) {
                e.b.b.n.g.b.c("SlardarConfigFetcher", "registerBroadUpdateSetting", th);
            }
        }
    }

    @Override // com.bytedance.apm.F.b.e
    public void onTimeEvent(long j) {
        w(false);
    }

    boolean s() {
        return this.a;
    }

    String v() {
        p();
        return this.h.getString("monitor_net_config", "");
    }

    void x(com.bytedance.services.slardar.config.a aVar) {
        List<com.bytedance.services.slardar.config.a> list;
        if (aVar == null || (list = this.t) == null) {
            return;
        }
        list.remove(aVar);
    }

    public JSONObject y() {
        Map<String, String> a2 = this.i.a();
        HashMap hashMap = a2 != null ? new HashMap(a2) : new HashMap();
        hashMap.put("last_calculate_timestamp", String.valueOf(this.r / 1000));
        hashMap.put("last_full_calculate_timestamp", String.valueOf(this.s / 1000));
        if (System.currentTimeMillis() - this.r >= 345600000) {
            hashMap.put("force_refresh", String.valueOf(1));
        }
        hashMap.put("minor_version", PushClient.DEFAULT_REQUEST_ID);
        return new JSONObject(hashMap);
    }
}
