package com.bytedance.news.common.settings.e;

import org.json.JSONObject;

/* loaded from: classes.dex */
public class d {
    private JSONObject a;
    private JSONObject b;

    /* renamed from: c, reason: collision with root package name */
    private String f5507c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f5508d;

    public d(JSONObject jSONObject, JSONObject jSONObject2, String str, boolean z) {
        this.f5508d = true;
        this.a = jSONObject;
        this.b = jSONObject2;
        this.f5507c = str;
        this.f5508d = z;
    }

    public JSONObject a() {
        return this.a;
    }

    public String b() {
        return this.f5507c;
    }

    public JSONObject c() {
        return this.b;
    }

    public boolean d() {
        return this.f5508d;
    }
}
