package com.bytedance.crash.dumper;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
class h {
    long a = 0;
    long b = 0;

    /* renamed from: c, reason: collision with root package name */
    long f4592c = 0;

    /* renamed from: d, reason: collision with root package name */
    long f4593d = 0;

    /* renamed from: e, reason: collision with root package name */
    int f4594e = 0;

    /* renamed from: f, reason: collision with root package name */
    int f4595f = 0;

    /* renamed from: g, reason: collision with root package name */
    long f4596g = 0;
    String h = null;
    long i = 0;
    Map<String, Long> j = new HashMap();
    long k;

    h(long j) {
        this.k = j;
    }

    long a() {
        long j = this.k;
        if (j == 0) {
            return 0L;
        }
        long j2 = ((this.f4593d + this.f4592c) * 100) / j;
        long j3 = (this.a * 100) / j;
        long j4 = (this.b * 25) / j;
        this.f4596g = j2;
        if (j2 <= 30) {
            this.f4596g = j2 + j3;
        }
        if (j3 <= 30) {
            this.f4596g += j4;
        }
        if (this.f4596g > 500) {
            this.f4596g = 500L;
        }
        return this.f4596g;
    }

    String b() {
        String str = this.h;
        if (str != null) {
            return str;
        }
        for (Map.Entry<String, Long> entry : this.j.entrySet()) {
            if (entry.getValue().longValue() > this.i) {
                this.i = entry.getValue().longValue();
                this.h = entry.getKey();
            }
        }
        return this.h;
    }

    JSONObject c() {
        if (this.f4595f == 0 || this.f4592c == 0) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("blockGcCost", this.a);
            jSONObject.put("blockGcCount", this.f4594e);
            jSONObject.put("gcCount", this.f4595f);
            jSONObject.put("gcCost", this.b);
            jSONObject.put("mainWaitCount", 0);
            jSONObject.put("mainWait", this.f4592c);
            jSONObject.put("mainPerformCount", 0);
            jSONObject.put("mainPerform", this.f4593d);
            jSONObject.put("blockGcCause", b());
            jSONObject.put("blockGcCauseCost", this.i);
            jSONObject.put("gcScore", a());
        } catch (JSONException unused) {
        }
        return jSONObject;
    }
}
