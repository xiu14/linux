package com.huawei.hianalytics.abtesting.a;

import com.ss.android.message.log.PushLog;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class b {

    /* renamed from: e, reason: collision with root package name */
    private static b f7013e = new b();
    private ConcurrentHashMap<String, c> a = null;
    private volatile boolean b = false;

    /* renamed from: c, reason: collision with root package name */
    private volatile boolean f7014c = false;

    /* renamed from: d, reason: collision with root package name */
    private a f7015d = null;

    public static b a() {
        return f7013e;
    }

    public void a(a aVar) {
        this.f7015d = aVar;
        this.f7014c = false;
        this.b = false;
    }

    public void a(String str) {
        JSONArray jSONArray = new JSONObject(str).getJSONArray("parameters");
        c[] cVarArr = new c[jSONArray.length()];
        ConcurrentHashMap<String, c> concurrentHashMap = new ConcurrentHashMap<>();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            String string = jSONObject.getString("groupId");
            String string2 = jSONObject.getString("key");
            cVarArr[i] = new c(jSONObject.getString(PushLog.KEY_VALUE), string);
            concurrentHashMap.put(string2, cVarArr[i]);
        }
        this.a = concurrentHashMap;
    }

    public synchronized void a(boolean z) {
        this.f7014c = z;
    }

    public String b(String str) {
        ConcurrentHashMap<String, c> concurrentHashMap = this.a;
        if (concurrentHashMap == null) {
            com.huawei.hianalytics.g.b.c("ABDataCenter", "getParamValue(): Experiment data is empty.");
            return "";
        }
        if (concurrentHashMap.get(str) != null) {
            return this.a.get(str).a();
        }
        com.huawei.hianalytics.g.b.c("ABDataCenter", "getParamValue() : No corresponding value was found.");
        return "";
    }

    public synchronized void b(boolean z) {
        this.b = z;
    }

    public synchronized boolean b() {
        return this.f7014c;
    }

    public String c(String str) {
        String str2;
        ConcurrentHashMap<String, c> concurrentHashMap = this.a;
        if (concurrentHashMap == null) {
            com.huawei.hianalytics.g.b.c("ABDataCenter", "getGroupID(): Experiment data is empty.");
            return "";
        }
        if (concurrentHashMap.get(str) == null) {
            str2 = "getGroupID: Not found getGroupId from expParamKey";
        } else {
            String b = this.a.get(str).b();
            if (b != null) {
                return b;
            }
            str2 = "getGroupID: groupId is null";
        }
        com.huawei.hianalytics.g.b.b("ABDataCenter", str2);
        return "";
    }

    public synchronized boolean c() {
        return this.b;
    }

    public String d() {
        a aVar = this.f7015d;
        if (aVar != null) {
            return aVar.c();
        }
        com.huawei.hianalytics.g.b.b("ABDataCenter", "getABServerURL(): ABDataCenter needs init first");
        return "";
    }

    public String e() {
        a aVar = this.f7015d;
        if (aVar != null) {
            return aVar.d();
        }
        com.huawei.hianalytics.g.b.b("ABDataCenter", "getUserID(): ABDataCenter needs init first");
        return "";
    }

    public String f() {
        a aVar = this.f7015d;
        if (aVar != null) {
            return aVar.a();
        }
        com.huawei.hianalytics.g.b.b("ABDataCenter", "getSecretKey(): ABDataCenter needs init first");
        return "";
    }
}
