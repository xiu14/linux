package com.huawei.hms.framework.network.grs.g.j;

import android.content.Context;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class c {
    private final GrsBaseInfo a;
    private final Context b;

    /* renamed from: c, reason: collision with root package name */
    private final Set<String> f7317c = new HashSet();

    public c(GrsBaseInfo grsBaseInfo, Context context) {
        this.a = grsBaseInfo;
        this.b = context;
    }

    private String e() {
        Set<String> b = com.huawei.hms.framework.network.grs.f.b.a(this.b.getPackageName()).b();
        if (b.isEmpty()) {
            return "";
        }
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        Iterator<String> it2 = b.iterator();
        while (it2.hasNext()) {
            jSONArray.put(it2.next());
        }
        try {
            jSONObject.put("services", jSONArray);
            Logger.d("GrsRequestInfo", "post service list is:%s", jSONObject.toString());
            return jSONObject.toString();
        } catch (JSONException unused) {
            return "";
        }
    }

    private String f() {
        Logger.v("GrsRequestInfo", "getGeoipService enter");
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        Iterator<String> it2 = this.f7317c.iterator();
        while (it2.hasNext()) {
            jSONArray.put(it2.next());
        }
        try {
            jSONObject.put("services", jSONArray);
            Logger.v("GrsRequestInfo", "post query service list is:%s", jSONObject.toString());
            return jSONObject.toString();
        } catch (JSONException unused) {
            return "";
        }
    }

    public Context a() {
        return this.b;
    }

    public void a(String str) {
        this.f7317c.add(str);
    }

    public GrsBaseInfo b() {
        return this.a;
    }

    public String c() {
        return this.f7317c.size() == 0 ? e() : f();
    }

    public Set<String> d() {
        return this.f7317c;
    }
}
