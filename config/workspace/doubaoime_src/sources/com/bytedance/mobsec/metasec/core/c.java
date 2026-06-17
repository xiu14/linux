package com.bytedance.mobsec.metasec.core;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import ms.bd.c.d4;
import org.json.JSONArray;

/* loaded from: classes.dex */
public abstract class c {
    protected String a = "";
    protected String b = "";

    /* renamed from: c, reason: collision with root package name */
    protected String f5402c = "";

    /* renamed from: d, reason: collision with root package name */
    protected String f5403d = "";

    /* renamed from: e, reason: collision with root package name */
    protected String f5404e = "";

    /* renamed from: f, reason: collision with root package name */
    protected int f5405f = -1;

    /* renamed from: g, reason: collision with root package name */
    protected int f5406g = 99999;
    protected Map<String, String> h = new HashMap();
    protected Map<String, String> i = new HashMap();
    protected String j;
    protected int k;

    protected c() {
    }

    synchronized String a() {
        JSONArray jSONArray;
        jSONArray = new JSONArray();
        jSONArray.put(b(this.a));
        jSONArray.put(b(""));
        jSONArray.put(b(""));
        jSONArray.put(b(this.f5404e));
        jSONArray.put(b(d4.a));
        jSONArray.put(b(this.b));
        jSONArray.put(b(this.f5402c));
        jSONArray.put(b(""));
        jSONArray.put(b(this.f5403d));
        jSONArray.put(b(""));
        jSONArray.put(String.valueOf(this.f5405f));
        jSONArray.put(String.valueOf(-1));
        jSONArray.put(String.valueOf(this.f5406g));
        jSONArray.put(b(this.j));
        jSONArray.put(String.valueOf(this.k));
        JSONArray jSONArray2 = new JSONArray();
        for (Map.Entry<String, String> entry : this.h.entrySet()) {
            if (!TextUtils.isEmpty(entry.getKey())) {
                jSONArray2.put(b(entry.getKey()));
                jSONArray2.put(b(entry.getValue()));
            }
        }
        jSONArray.put(jSONArray2);
        JSONArray jSONArray3 = new JSONArray();
        for (Map.Entry<String, String> entry2 : this.i.entrySet()) {
            if (!TextUtils.isEmpty(entry2.getKey())) {
                jSONArray3.put(b(entry2.getKey()));
                jSONArray3.put(b(entry2.getValue()));
            }
        }
        jSONArray.put(jSONArray3);
        return jSONArray.toString();
    }

    String b(Object obj) {
        return (obj == null || !(obj instanceof String)) ? "" : ((String) obj).trim();
    }
}
