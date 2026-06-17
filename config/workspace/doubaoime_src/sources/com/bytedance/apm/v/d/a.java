package com.bytedance.apm.v.d;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class a implements com.bytedance.apm.v.c {
    public String a;
    public long b;

    /* renamed from: c, reason: collision with root package name */
    public long f3595c;

    /* renamed from: d, reason: collision with root package name */
    public String f3596d;

    /* renamed from: e, reason: collision with root package name */
    public String f3597e;

    /* renamed from: f, reason: collision with root package name */
    public String f3598f;

    /* renamed from: g, reason: collision with root package name */
    public int f3599g;
    public JSONObject h;

    public a(String str, long j, long j2, String str2, String str3, String str4, int i, JSONObject jSONObject) {
        this.a = str;
        this.b = j;
        this.f3595c = j2;
        this.f3596d = str2;
        this.f3597e = str3;
        this.f3598f = str4;
        this.f3599g = i;
        if (jSONObject == null) {
            this.h = new JSONObject();
        } else {
            this.h = jSONObject;
        }
    }

    @Override // com.bytedance.apm.v.c
    public String a() {
        return null;
    }

    @Override // com.bytedance.apm.v.c
    public boolean b(JSONObject jSONObject) {
        return false;
    }

    @Override // com.bytedance.apm.v.c
    @Nullable
    public JSONObject c() {
        if (TextUtils.isEmpty(this.a)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("log_type", this.a);
            jSONObject.put("duration", this.b);
            jSONObject.put("uri", Uri.parse(this.f3596d));
            long j = this.f3595c;
            if (j > 0) {
                jSONObject.put("timestamp", j);
            }
            jSONObject.put("status", this.f3599g);
            if (!TextUtils.isEmpty(this.f3597e)) {
                jSONObject.put("ip", this.f3597e);
            }
            if (TextUtils.isEmpty(this.f3598f)) {
                jSONObject.put("trace_code", "");
            } else {
                jSONObject.put("trace_code", this.f3598f);
            }
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.bytedance.apm.v.c
    public boolean d() {
        return true;
    }

    @Override // com.bytedance.apm.v.c
    public String e() {
        return null;
    }
}
