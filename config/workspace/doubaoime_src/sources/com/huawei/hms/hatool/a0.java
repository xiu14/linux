package com.huawei.hms.hatool;

import android.content.Context;
import android.text.TextUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class a0 implements g {
    private Context a = q0.i();
    private String b;

    /* renamed from: c, reason: collision with root package name */
    private JSONObject f7324c;

    /* renamed from: d, reason: collision with root package name */
    private String f7325d;

    /* renamed from: e, reason: collision with root package name */
    private String f7326e;

    /* renamed from: f, reason: collision with root package name */
    private String f7327f;

    /* renamed from: g, reason: collision with root package name */
    private String f7328g;
    private Boolean h;

    public a0(String str, JSONObject jSONObject, String str2, String str3, long j) {
        this.b = str;
        this.f7324c = jSONObject;
        this.f7325d = str2;
        this.f7326e = str3;
        this.f7327f = String.valueOf(j);
        if (z.i(str2, "oper")) {
            p0 a = y.a().a(str2, j);
            this.f7328g = a.a();
            this.h = Boolean.valueOf(a.b());
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        JSONArray jSONArray;
        v.a("hmsSdk", "Begin to run EventRecordTask...");
        int h = q0.h();
        int k = a1.k(this.f7325d, this.f7326e);
        if (c0.a(this.a, "stat_v2_1", h * 1048576)) {
            v.c("hmsSdk", "stat sp file reach max limited size, delete it");
            d.a(this.a, "stat_v2_1", new String[0]);
            return;
        }
        b1 b1Var = new b1();
        b1Var.b(this.b);
        b1Var.a(this.f7324c.toString());
        b1Var.d(this.f7326e);
        b1Var.c(this.f7327f);
        b1Var.f(this.f7328g);
        Boolean bool = this.h;
        b1Var.e(bool == null ? null : String.valueOf(bool));
        try {
            JSONObject d2 = b1Var.d();
            String a = n1.a(this.f7325d, this.f7326e);
            String a2 = d.a(this.a, "stat_v2_1", a, "");
            try {
                jSONArray = !TextUtils.isEmpty(a2) ? new JSONArray(a2) : new JSONArray();
            } catch (JSONException unused) {
                v.d("hmsSdk", "Cached data corrupted: stat_v2_1");
                jSONArray = new JSONArray();
            }
            jSONArray.put(d2);
            d.b(this.a, "stat_v2_1", a, jSONArray.toString());
            if (jSONArray.toString().length() > k * 1024) {
                e.a().a(this.f7325d, this.f7326e);
            }
        } catch (JSONException unused2) {
            v.e("hmsSdk", "eventRecord toJson error! The record failed.");
        }
    }
}
