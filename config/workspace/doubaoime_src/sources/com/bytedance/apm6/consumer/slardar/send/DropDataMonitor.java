package com.bytedance.apm6.consumer.slardar.send;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.huawei.hms.framework.common.BundleUtil;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
class DropDataMonitor {
    private SharedPreferences a;
    private JSONArray b = new JSONArray();

    /* renamed from: c, reason: collision with root package name */
    private volatile boolean f3621c;

    /* renamed from: d, reason: collision with root package name */
    private String f3622d;

    /* renamed from: e, reason: collision with root package name */
    private long f3623e;

    enum Reason {
        SERVER_DROP("server drop message"),
        FULL_DISK("disk is full");

        private String reason;

        Reason(String str) {
            this.reason = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.reason;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class a {
        private static final DropDataMonitor a = new DropDataMonitor();
    }

    DropDataMonitor() {
    }

    private synchronized void a() {
        if (this.f3621c) {
            return;
        }
        this.f3621c = true;
        SharedPreferences sharedPreferences = e.b.b.n.a.a().getSharedPreferences(e.b.b.h.c.a.k() + BundleUtil.UNDERLINE_TAG + "drop_message", 0);
        this.a = sharedPreferences;
        String string = sharedPreferences.getString("drop_data_items", "");
        if (!TextUtils.isEmpty(string)) {
            try {
                this.b = new JSONArray(string);
            } catch (Exception unused) {
            }
        }
    }

    JSONArray b() {
        a();
        JSONArray jSONArray = new JSONArray();
        JSONArray jSONArray2 = new JSONArray();
        for (int i = 0; i < this.b.length(); i++) {
            try {
                if (i < 10) {
                    jSONArray.put(this.b.get(i));
                } else {
                    jSONArray2.put(this.b.get(i));
                }
            } catch (Exception unused) {
            }
        }
        this.b = jSONArray2;
        this.a.edit().putString("drop_data_items", this.b.toString()).commit();
        return jSONArray;
    }

    void c(long j, long j2, long j3, Reason reason) {
        a();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("log_type", "server_drop_data");
            jSONObject.put("timestamp", j3);
            jSONObject.put("drop_data_count", j);
            jSONObject.put("drop_data_bytes", j2);
            if (reason == Reason.SERVER_DROP) {
                jSONObject.put("x-tt-logid", this.f3622d);
                jSONObject.put("drop_timestamp", this.f3623e);
            }
            if (reason != null) {
                jSONObject.put("drop_reason", reason);
            }
            this.b.put(jSONObject);
            if (e.b.b.n.a.b()) {
                List<String> list = e.b.b.e.a.a.a;
                e.b.b.n.g.b.a("APM-Slardar", "monitorDropLog:" + this.b.toString());
            }
            this.a.edit().putString("drop_data_items", this.b.toString()).commit();
        } catch (Exception e2) {
            List<String> list2 = e.b.b.e.a.a.a;
            e.b.b.n.g.b.c("APM-Slardar", "monitorDropLog:", e2);
        }
    }

    void d(String str) {
        this.f3622d = str;
    }

    void e(long j) {
        this.f3623e = j;
    }
}
