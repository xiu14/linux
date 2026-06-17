package com.huawei.hms.hatool;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class b1 implements o1 {
    private String a;
    private String b;

    /* renamed from: c, reason: collision with root package name */
    private String f7335c;

    /* renamed from: d, reason: collision with root package name */
    private String f7336d;

    /* renamed from: e, reason: collision with root package name */
    private String f7337e;

    /* renamed from: f, reason: collision with root package name */
    private String f7338f;

    @Override // com.huawei.hms.hatool.o1
    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", this.a);
        jSONObject.put("eventtime", this.f7336d);
        jSONObject.put(NotificationCompat.CATEGORY_EVENT, this.b);
        jSONObject.put("event_session_name", this.f7337e);
        jSONObject.put("first_session_event", this.f7338f);
        if (TextUtils.isEmpty(this.f7335c)) {
            return null;
        }
        jSONObject.put("properties", new JSONObject(this.f7335c));
        return jSONObject;
    }

    public void a(String str) {
        this.f7335c = str;
    }

    public void a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        this.b = jSONObject.optString(NotificationCompat.CATEGORY_EVENT);
        this.f7335c = n.a(jSONObject.optString("properties"), o0.d().a());
        this.a = jSONObject.optString("type");
        this.f7336d = jSONObject.optString("eventtime");
        this.f7337e = jSONObject.optString("event_session_name");
        this.f7338f = jSONObject.optString("first_session_event");
    }

    public String b() {
        return this.f7336d;
    }

    public void b(String str) {
        this.b = str;
    }

    public String c() {
        return this.a;
    }

    public void c(String str) {
        this.f7336d = str;
    }

    public JSONObject d() {
        JSONObject a = a();
        a.put("properties", n.b(this.f7335c, o0.d().a()));
        return a;
    }

    public void d(String str) {
        this.a = str;
    }

    public void e(String str) {
        this.f7338f = str;
    }

    public void f(String str) {
        this.f7337e = str;
    }
}
