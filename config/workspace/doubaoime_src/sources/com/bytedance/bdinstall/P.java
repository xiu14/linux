package com.bytedance.bdinstall;

import android.text.TextUtils;
import com.bytedance.common.wschannel.WsConstants;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class P implements Cloneable {
    private String a = "";
    private String b = "";

    /* renamed from: c, reason: collision with root package name */
    private String f3949c;

    /* renamed from: d, reason: collision with root package name */
    private String f3950d;

    /* renamed from: e, reason: collision with root package name */
    private String f3951e;

    /* renamed from: f, reason: collision with root package name */
    private String f3952f;

    static P h(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            P p = new P();
            p.a = jSONObject.optString("did", "");
            p.b = jSONObject.optString(WsConstants.KEY_INSTALL_ID, "");
            p.f3949c = jSONObject.optString("openudid", "");
            p.f3950d = jSONObject.optString("cliend_udid", "");
            p.f3951e = jSONObject.optString("ssid", "");
            p.f3951e = jSONObject.optString("eDid", "");
            p.f3951e = jSONObject.optString("eIid", "");
            p.f3952f = jSONObject.optString("egdi", "");
            String str2 = "aaa# parse install info " + p;
            int i = C0640u.a;
            return p;
        } catch (JSONException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public P a() {
        try {
            return (P) super.clone();
        } catch (CloneNotSupportedException unused) {
            int i = C0640u.a;
            return null;
        }
    }

    public String b() {
        return this.f3950d;
    }

    public String c() {
        return this.a;
    }

    public Object clone() throws CloneNotSupportedException {
        try {
            return (P) super.clone();
        } catch (CloneNotSupportedException unused) {
            int i = C0640u.a;
            return null;
        }
    }

    public String d() {
        return this.f3952f;
    }

    public String e() {
        return this.b;
    }

    public String f() {
        return this.f3949c;
    }

    public String g() {
        return this.f3951e;
    }

    public void i(String str) {
        this.f3950d = str;
    }

    public void j(String str) {
        this.a = str;
    }

    public void k(String str) {
        this.f3952f = str;
    }

    public void l(String str) {
        this.b = str;
    }

    public void m(String str) {
        this.f3949c = str;
    }

    public void n(String str) {
        this.f3951e = str;
    }

    JSONObject o() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("did", this.a);
            jSONObject.put(WsConstants.KEY_INSTALL_ID, this.b);
            jSONObject.put("openudid", this.f3949c);
            jSONObject.put("cliend_udid", this.f3950d);
            jSONObject.put("ssid", this.f3951e);
            jSONObject.put("eDid", (Object) null);
            jSONObject.put("eIid", (Object) null);
            jSONObject.put("egdi", this.f3952f);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return jSONObject;
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("{d='");
        e.a.a.a.a.G0(M, this.a, '\'', ", i='");
        e.a.a.a.a.G0(M, this.b, '\'', ", o='");
        e.a.a.a.a.G0(M, this.f3949c, '\'', ", c='");
        e.a.a.a.a.G0(M, this.f3950d, '\'', ", s='");
        M.append(this.f3951e);
        M.append('\'');
        M.append(", eDid='");
        M.append((String) null);
        M.append('\'');
        M.append(", eIid='");
        M.append((String) null);
        M.append('\'');
        M.append(", e='");
        return e.a.a.a.a.H(M, this.f3952f, '\'', '}');
    }
}
