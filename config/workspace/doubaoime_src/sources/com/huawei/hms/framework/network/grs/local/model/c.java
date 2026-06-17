package com.huawei.hms.framework.network.grs.local.model;

import android.text.TextUtils;
import com.huawei.hms.framework.common.Logger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class c {
    private String a;
    private String b;

    /* renamed from: c, reason: collision with root package name */
    private final Map<String, d> f7322c = new ConcurrentHashMap(16);

    /* renamed from: d, reason: collision with root package name */
    private List<b> f7323d = new ArrayList(16);

    public d a(String str) {
        if (!TextUtils.isEmpty(str)) {
            return this.f7322c.get(str);
        }
        Logger.w("Service", "In servings.getServing(String groupId), the groupId is Empty or null");
        return null;
    }

    public List<b> a() {
        return this.f7323d;
    }

    public void a(String str, d dVar) {
        if (TextUtils.isEmpty(str) || dVar == null) {
            return;
        }
        this.f7322c.put(str, dVar);
    }

    public void a(List<b> list) {
        this.f7323d = list;
    }

    public String b() {
        return this.b;
    }

    public void b(String str) {
        this.a = str;
    }

    public JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("name", this.a);
        jSONObject.put("routeBy", this.b);
        JSONArray jSONArray = new JSONArray();
        Iterator<String> it2 = this.f7322c.keySet().iterator();
        while (it2.hasNext()) {
            d dVar = this.f7322c.get(it2.next());
            if (dVar != null) {
                jSONArray.put(dVar.c());
            }
        }
        jSONObject.put("servings", jSONArray);
        if (this.f7323d != null) {
            JSONArray jSONArray2 = new JSONArray();
            Iterator<b> it3 = this.f7323d.iterator();
            while (it3.hasNext()) {
                jSONArray2.put(it3.next().c());
            }
            jSONObject.put("countryGroups", jSONArray2);
        }
        return jSONObject;
    }

    public void c(String str) {
        this.b = str;
    }
}
