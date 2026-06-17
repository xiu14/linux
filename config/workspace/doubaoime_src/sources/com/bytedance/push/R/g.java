package com.bytedance.push.R;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class g {
    public long a;
    private String b;

    /* renamed from: c, reason: collision with root package name */
    private String f5588c;

    /* renamed from: d, reason: collision with root package name */
    public String f5589d;

    /* renamed from: e, reason: collision with root package name */
    public int f5590e;

    /* renamed from: f, reason: collision with root package name */
    public String f5591f;

    public g(int i, String str, String str2, String str3, long j, String str4) {
        this.f5590e = i;
        this.f5589d = str;
        this.b = str2;
        this.f5588c = str3;
        this.a = j;
        this.f5591f = str4;
    }

    public boolean a(g gVar) {
        if (gVar == this) {
            return true;
        }
        return gVar.f5590e == this.f5590e && TextUtils.equals(this.f5588c, gVar.f5588c) && TextUtils.equals(this.f5589d, gVar.f5589d) && TextUtils.equals(this.b, gVar.b) && TextUtils.equals(this.f5591f, gVar.f5591f);
    }

    public JSONObject b() {
        if (this.f5590e <= 0) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", this.f5590e);
            jSONObject.put("token", this.f5589d);
            jSONObject.put("did", this.b);
            jSONObject.put("vc", this.f5588c);
            jSONObject.put("t", this.a);
            if (!TextUtils.isEmpty(this.f5591f)) {
                jSONObject.put("alias", this.f5591f);
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return jSONObject;
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("{updateTime=");
        M.append(this.a);
        M.append(", deviceId='");
        e.a.a.a.a.G0(M, this.b, '\'', ", versionCode='");
        e.a.a.a.a.G0(M, this.f5588c, '\'', ", token='");
        e.a.a.a.a.G0(M, this.f5589d, '\'', ", type=");
        return e.a.a.a.a.C(M, this.f5590e, '}');
    }
}
