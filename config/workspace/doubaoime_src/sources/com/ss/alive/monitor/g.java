package com.ss.alive.monitor;

import android.content.Intent;
import android.content.pm.ServiceInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.hms.support.api.entity.core.CommonCode;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class g {

    /* renamed from: d, reason: collision with root package name */
    public ServiceInfo f8249d;

    /* renamed from: f, reason: collision with root package name */
    public Intent f8251f;

    /* renamed from: g, reason: collision with root package name */
    public String f8252g;
    public int h;
    public long a = 0;
    public String b = "";

    /* renamed from: c, reason: collision with root package name */
    public List<String> f8248c = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public int f8250e = 0;

    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("start_time", this.a);
            jSONObject.put("process", this.b);
            jSONObject.put("start_flag", this.f8250e);
            jSONObject.put("screen_state", this.h);
            ServiceInfo serviceInfo = this.f8249d;
            if (serviceInfo != null) {
                jSONObject.put("start_component", serviceInfo.name);
            }
            Intent intent = this.f8251f;
            if (intent != null) {
                jSONObject.put(CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, intent.toString());
                jSONObject.put("intent_action", this.f8251f.getAction());
                if (this.f8251f.getComponent() != null) {
                    jSONObject.put("start_component", this.f8251f.getComponent().getClassName());
                }
                Bundle extras = this.f8251f.getExtras();
                JSONObject jSONObject2 = new JSONObject();
                if (extras != null && !extras.isEmpty()) {
                    for (String str : extras.keySet()) {
                        jSONObject2.put(str, extras.get(str));
                    }
                }
                Uri data = this.f8251f.getData();
                if (data != null) {
                    jSONObject2.put("intent_data_string", data.toString());
                }
                jSONObject.put("intent_data", jSONObject2);
            }
            JSONArray jSONArray = new JSONArray();
            for (int i = 0; i < this.f8248c.size(); i++) {
                jSONArray.put(this.f8248c.get(i));
            }
            jSONObject.put("message_list", jSONArray);
            if (!TextUtils.isEmpty(this.f8252g)) {
                jSONObject.put("referrer", this.f8252g);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return jSONObject;
    }

    public String toString() {
        return a().toString();
    }
}
