package com.huawei.hms.framework.network.grs.local.model;

import android.text.TextUtils;
import com.huawei.hms.framework.common.Logger;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class a {
    private String a;
    private long b;

    /* renamed from: c, reason: collision with root package name */
    private final Map<String, c> f7319c = new ConcurrentHashMap(16);

    public c a(String str) {
        if (!TextUtils.isEmpty(str)) {
            return this.f7319c.get(str);
        }
        Logger.w("ApplicationBean", "In getServing(String serviceName), the serviceName is Empty or null");
        return null;
    }

    public String a() {
        return this.a;
    }

    public void a(long j) {
        this.b = j;
    }

    public void a(String str, c cVar) {
        if (TextUtils.isEmpty(str) || cVar == null) {
            return;
        }
        this.f7319c.put(str, cVar);
    }

    public JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("name", TextUtils.isEmpty(this.a) ? "" : this.a);
        jSONObject.put("cacheControl", this.b);
        JSONArray jSONArray = new JSONArray();
        Iterator<String> it2 = this.f7319c.keySet().iterator();
        while (it2.hasNext()) {
            c cVar = this.f7319c.get(it2.next());
            if (cVar != null) {
                jSONArray.put(cVar.c());
            }
        }
        StringBuilder M = e.a.a.a.a.M("local config save to sp, services count:");
        M.append(jSONArray.length());
        Logger.i("ApplicationBean", M.toString());
        jSONObject.put("services", jSONArray);
        return jSONObject;
    }

    public void b(String str) {
        this.a = str;
    }
}
