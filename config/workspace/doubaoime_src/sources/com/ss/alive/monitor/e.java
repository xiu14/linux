package com.ss.alive.monitor;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import com.ss.android.pushmanager.setting.PushMultiProcessSharedProvider;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class e {

    /* renamed from: c, reason: collision with root package name */
    private static volatile e f8246c;
    private PushMultiProcessSharedProvider.b a;
    private a b;

    public static class a {
        public boolean a;
        public boolean b;

        /* renamed from: c, reason: collision with root package name */
        public List<String> f8247c;

        public a(String str) {
            int i = 0;
            this.a = false;
            this.b = false;
            this.f8247c = null;
            if (TextUtils.isEmpty(str)) {
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                this.a = jSONObject.optInt("is_monitor_alive_enable", 0) > 0;
                jSONObject.optInt("monitor_live_interval_second", 30);
                jSONObject.optInt("max_send_start_info_num", 100);
                jSONObject.optInt("default_send_data_interval", 7200);
                this.b = jSONObject.optBoolean("enable_upload_unactive_apps", false);
                JSONArray optJSONArray = jSONObject.optJSONArray("upload_unactive_app_packages");
                if (optJSONArray != null) {
                    this.f8247c = new ArrayList();
                    for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                        try {
                            String string = optJSONArray.getString(i2);
                            if (!TextUtils.isEmpty(string)) {
                                this.f8247c.add(string);
                            }
                        } catch (JSONException e2) {
                            com.bytedance.push.g0.f.c("MonitorLiveSetting", "setConfigJson error" + e2.getMessage());
                        }
                    }
                }
                if (com.bytedance.push.g0.f.d()) {
                    com.bytedance.push.g0.f.c("MonitorLiveSetting", "enable_upload_unactive_apps : " + this.b);
                    StringBuilder sb = new StringBuilder();
                    sb.append("upload_unactive_app_packages size : ");
                    List<String> list = this.f8247c;
                    if (list != null) {
                        i = list.size();
                    }
                    sb.append(i);
                    sb.append("");
                    com.bytedance.push.g0.f.c("MonitorLiveSetting", sb.toString());
                }
            } catch (Exception e3) {
                e3.printStackTrace();
            }
        }
    }

    private e(Context context) {
        this.a = PushMultiProcessSharedProvider.e(context instanceof Application ? context : context.getApplicationContext());
    }

    public static e a(Context context) {
        if (f8246c == null) {
            synchronized (e.class) {
                if (f8246c == null) {
                    f8246c = new e(context);
                }
            }
        }
        return f8246c;
    }

    public synchronized a b() {
        if (this.b == null) {
            this.b = new a(this.a.b("monitor_alive_config", ""));
        }
        return this.b;
    }
}
