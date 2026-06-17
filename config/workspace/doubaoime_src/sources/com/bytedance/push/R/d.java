package com.bytedance.push.R;

import android.app.NotificationChannel;
import com.huawei.hms.push.constant.RemoteMessageConst;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class d {
    private String a;
    private boolean b;

    /* renamed from: c, reason: collision with root package name */
    private String f5583c;

    /* renamed from: d, reason: collision with root package name */
    private String f5584d;

    /* renamed from: e, reason: collision with root package name */
    private int f5585e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f5586f;

    /* renamed from: g, reason: collision with root package name */
    private int f5587g;
    private boolean h;
    private boolean i;
    private boolean j;
    private String k;
    private JSONObject l;

    public d(JSONObject jSONObject) {
        this.b = true;
        this.f5583c = jSONObject.optString("id");
        this.f5584d = jSONObject.optString("name");
        this.f5585e = jSONObject.optInt("importance", 3);
        this.f5586f = jSONObject.optBoolean("bypassDnd", true);
        this.f5587g = jSONObject.optInt("lockscreenVisibility", -1);
        this.h = jSONObject.optBoolean("lights", true);
        this.i = jSONObject.optBoolean("vibration", true);
        this.j = jSONObject.optBoolean("showBadge", true);
        this.b = jSONObject.optBoolean("enable", true);
        this.a = jSONObject.optString("desc");
        this.k = jSONObject.optString(RemoteMessageConst.Notification.SOUND);
        JSONObject optJSONObject = jSONObject.optJSONObject("channel_fields");
        this.l = optJSONObject;
        if (optJSONObject == null) {
            this.l = new JSONObject();
        }
    }

    public boolean a() {
        return this.f5586f;
    }

    public JSONObject b() {
        return this.l;
    }

    public String c() {
        return this.a;
    }

    public String d() {
        return this.f5583c;
    }

    public int e() {
        return this.f5585e;
    }

    public int f() {
        return this.f5587g;
    }

    public String g() {
        return this.f5584d;
    }

    public String h() {
        return this.k;
    }

    public boolean i() {
        return this.b;
    }

    public boolean j() {
        return this.j;
    }

    public boolean k() {
        return this.h;
    }

    public boolean l() {
        return this.i;
    }

    public JSONObject m() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", this.f5583c);
        jSONObject.put("name", this.f5584d);
        jSONObject.put("importance", this.f5585e);
        jSONObject.put("bypassDnd", this.f5586f);
        jSONObject.put("lockscreenVisibility", this.f5587g);
        jSONObject.put("lights", this.h);
        jSONObject.put("vibration", this.i);
        jSONObject.put("showBadge", this.j);
        jSONObject.put("enable", this.b);
        jSONObject.put("desc", this.a);
        jSONObject.put("channel_fields", this.l);
        return jSONObject;
    }

    public d(NotificationChannel notificationChannel) {
        this.b = true;
        this.f5583c = notificationChannel.getId();
        this.f5584d = String.valueOf(notificationChannel.getName());
        this.f5585e = notificationChannel.getImportance();
        this.f5586f = notificationChannel.canBypassDnd();
        this.f5587g = notificationChannel.getLockscreenVisibility();
        this.h = notificationChannel.shouldShowLights();
        this.i = notificationChannel.shouldVibrate();
        this.j = notificationChannel.canShowBadge();
        this.a = notificationChannel.getDescription();
        this.l = new JSONObject();
    }
}
