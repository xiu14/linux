package com.huawei.hms.framework.network.grs.local.model;

import java.util.Iterator;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class b {
    private String a;
    private String b;

    /* renamed from: c, reason: collision with root package name */
    private Set<String> f7320c;

    /* renamed from: d, reason: collision with root package name */
    private String f7321d;

    public Set<String> a() {
        return this.f7320c;
    }

    public void a(String str) {
        this.f7321d = str;
    }

    public void a(Set<String> set) {
        this.f7320c = set;
    }

    public String b() {
        return this.a;
    }

    public void b(String str) {
        this.a = str;
    }

    public JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", this.a);
        jSONObject.put("name", this.b);
        JSONArray jSONArray = new JSONArray();
        Iterator<String> it2 = this.f7320c.iterator();
        while (it2.hasNext()) {
            jSONArray.put(it2.next());
        }
        jSONObject.put("countries", jSONArray);
        jSONObject.put(com.heytap.mcssdk.constant.b.i, this.f7321d);
        return jSONObject;
    }

    public void c(String str) {
        this.b = str;
    }
}
