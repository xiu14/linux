package com.huawei.hms.framework.network.grs;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.StringUtils;
import com.huawei.hms.framework.network.grs.g.g;
import com.huawei.hms.framework.network.grs.local.model.CountryCodeBean;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: e, reason: collision with root package name */
    private static final String f7263e = "a";
    private final GrsBaseInfo a;
    private com.huawei.hms.framework.network.grs.e.a b;

    /* renamed from: c, reason: collision with root package name */
    private g f7264c;

    /* renamed from: d, reason: collision with root package name */
    private com.huawei.hms.framework.network.grs.e.c f7265d;

    /* renamed from: com.huawei.hms.framework.network.grs.a$a, reason: collision with other inner class name */
    private static class C0351a implements com.huawei.hms.framework.network.grs.b {
        String a;
        Map<String, String> b;

        /* renamed from: c, reason: collision with root package name */
        IQueryUrlsCallBack f7266c;

        /* renamed from: d, reason: collision with root package name */
        Context f7267d;

        /* renamed from: e, reason: collision with root package name */
        GrsBaseInfo f7268e;

        /* renamed from: f, reason: collision with root package name */
        com.huawei.hms.framework.network.grs.e.a f7269f;

        C0351a(String str, Map<String, String> map, IQueryUrlsCallBack iQueryUrlsCallBack, Context context, GrsBaseInfo grsBaseInfo, com.huawei.hms.framework.network.grs.e.a aVar) {
            this.a = str;
            this.b = map;
            this.f7266c = iQueryUrlsCallBack;
            this.f7267d = context;
            this.f7268e = grsBaseInfo;
            this.f7269f = aVar;
        }

        @Override // com.huawei.hms.framework.network.grs.b
        public void a() {
            Map<String, String> map = this.b;
            if (map != null && !map.isEmpty()) {
                Logger.i(a.f7263e, "GrsClientManager.ayncGetGrsUrls: Return [%s] Urls: %s", this.a, StringUtils.anonymizeMessage(new JSONObject(this.b).toString()));
                this.f7266c.onCallBackSuccess(this.b);
                return;
            }
            if (this.b != null) {
                Logger.i(a.f7263e, "GrsClientManager.ayncGetGrsUrls：Return [%s] Urls is Empty", this.a);
                this.f7266c.onCallBackFail(-3);
                return;
            }
            Logger.i(a.f7263e, "GrsClientManager.ayncGetGrsUrls: Get URL from Local JSON File");
            Map<String, String> a = com.huawei.hms.framework.network.grs.f.b.a(this.f7267d.getPackageName()).a(this.f7267d, this.f7269f, this.f7268e, this.a, true);
            if (a == null || a.isEmpty()) {
                Logger.e(a.f7263e, "The serviceName[%s] is not configured in the JSON configuration files to reveal all the details", this.a);
            }
            if (a == null) {
                a = new ConcurrentHashMap<>();
            }
            Logger.i(a.f7263e, "GrsClientManager.ayncGetGrsUrls: Return [%s] Urls: %s", this.a, StringUtils.anonymizeMessage(new JSONObject(a).toString()));
            this.f7266c.onCallBackSuccess(a);
        }

        @Override // com.huawei.hms.framework.network.grs.b
        public void a(com.huawei.hms.framework.network.grs.g.d dVar) {
            IQueryUrlsCallBack iQueryUrlsCallBack;
            String j = dVar.j();
            Map<String, String> a = a.a(j, this.a);
            if (a.isEmpty()) {
                Map<String, String> map = this.b;
                if (map == null || map.isEmpty()) {
                    if (this.b != null) {
                        Logger.i(a.f7263e, "GrsClientManager.ayncGetGrsUrls：Return [%s] Urls is Empty", this.a);
                        this.f7266c.onCallBackFail(-5);
                        return;
                    }
                    if (!TextUtils.isEmpty(j)) {
                        Logger.e(a.f7263e, "The serviceName[%s] is not configured on the GRS server.", this.a);
                    }
                    Logger.i(a.f7263e, "GrsClientManager.ayncGetGrsUrls: Get URL from Local JSON File");
                    Map<String, String> a2 = com.huawei.hms.framework.network.grs.f.b.a(this.f7267d.getPackageName()).a(this.f7267d, this.f7269f, this.f7268e, this.a, true);
                    if (a2 == null || a2.isEmpty()) {
                        Logger.e(a.f7263e, "The serviceName[%s] is not configured in the JSON configuration files to reveal all the details", this.a);
                    }
                    if (a2 == null) {
                        a2 = new ConcurrentHashMap<>();
                    }
                    Logger.i(a.f7263e, "GrsClientManager.ayncGetGrsUrls: Return [%s] Urls: %s", this.a, StringUtils.anonymizeMessage(new JSONObject(a2).toString()));
                    this.f7266c.onCallBackSuccess(a2);
                    return;
                }
                Logger.i(a.f7263e, "GrsClientManager.ayncGetGrsUrls: Return [%s][%s] Url: %s", this.a, StringUtils.anonymizeMessage(new JSONObject(this.b).toString()));
                iQueryUrlsCallBack = this.f7266c;
                a = this.b;
            } else {
                Logger.i(a.f7263e, "GrsClientManager.ayncGetGrsUrls: Get URL from Current Called GRS Server Return [%s] Urls: %s", this.a, StringUtils.anonymizeMessage(new JSONObject(a).toString()));
                iQueryUrlsCallBack = this.f7266c;
            }
            iQueryUrlsCallBack.onCallBackSuccess(a);
        }
    }

    private static class b implements com.huawei.hms.framework.network.grs.b {
        String a;
        String b;

        /* renamed from: c, reason: collision with root package name */
        IQueryUrlCallBack f7270c;

        /* renamed from: d, reason: collision with root package name */
        String f7271d;

        /* renamed from: e, reason: collision with root package name */
        Context f7272e;

        /* renamed from: f, reason: collision with root package name */
        GrsBaseInfo f7273f;

        /* renamed from: g, reason: collision with root package name */
        com.huawei.hms.framework.network.grs.e.a f7274g;

        b(String str, String str2, IQueryUrlCallBack iQueryUrlCallBack, String str3, Context context, GrsBaseInfo grsBaseInfo, com.huawei.hms.framework.network.grs.e.a aVar) {
            this.a = str;
            this.b = str2;
            this.f7270c = iQueryUrlCallBack;
            this.f7271d = str3;
            this.f7272e = context;
            this.f7273f = grsBaseInfo;
            this.f7274g = aVar;
        }

        @Override // com.huawei.hms.framework.network.grs.b
        public void a() {
            if (!TextUtils.isEmpty(this.f7271d)) {
                Logger.i(a.f7263e, "GrsClientManager.ayncGetGrsUrl: Return [%s][%s] Url: %s", this.a, this.b, StringUtils.anonymizeMessage(this.f7271d));
                this.f7270c.onCallBackSuccess(this.f7271d);
                return;
            }
            if (!TextUtils.isEmpty(this.f7271d)) {
                Logger.i(a.f7263e, "GrsClientManager.ayncGetGrsUrl：Return [%s][%s] Url is Empty", this.a, this.b);
                this.f7270c.onCallBackFail(-3);
                return;
            }
            Logger.i(a.f7263e, "GrsClientManager.ayncGetGrsUrl: Get URL from Local JSON File");
            String a = com.huawei.hms.framework.network.grs.f.b.a(this.f7272e.getPackageName()).a(this.f7272e, this.f7274g, this.f7273f, this.a, this.b, true);
            if (a == null || a.isEmpty()) {
                Logger.e(a.f7263e, "The serviceName[%s][%s] is not configured in the JSON configuration files to reveal all the details", this.a, this.b);
            }
            Logger.i(a.f7263e, "GrsClientManager.ayncGetGrsUrl: Return [%s][%s] Url: %s", this.a, this.b, StringUtils.anonymizeMessage(a));
            this.f7270c.onCallBackSuccess(a);
        }

        @Override // com.huawei.hms.framework.network.grs.b
        public void a(com.huawei.hms.framework.network.grs.g.d dVar) {
            IQueryUrlCallBack iQueryUrlCallBack;
            String str;
            String j = dVar.j();
            Map<String, String> a = a.a(j, this.a);
            if (a.containsKey(this.b)) {
                String str2 = a.f7263e;
                String str3 = this.b;
                Logger.i(str2, "GrsClientManager.ayncGetGrsUrl: Get URL from Current Called GRS Server, Return [%s][%s] Url: %s", this.a, str3, StringUtils.anonymizeMessage(a.get(str3)));
                iQueryUrlCallBack = this.f7270c;
                str = a.get(this.b);
            } else {
                if (TextUtils.isEmpty(this.f7271d)) {
                    if (!TextUtils.isEmpty(this.f7271d)) {
                        Logger.i(a.f7263e, "GrsClientManager.ayncGetGrsUrl：Return [%s][%s] Url is Empty", this.a, this.b);
                        this.f7270c.onCallBackFail(-5);
                        return;
                    }
                    if (!TextUtils.isEmpty(j)) {
                        Logger.e(a.f7263e, "The serviceName[%s][%s] is not configured on the GRS server.", this.a, this.b);
                    }
                    Logger.i(a.f7263e, "GrsClientManager.ayncGetGrsUrl: Get URL from Local JSON File");
                    String a2 = com.huawei.hms.framework.network.grs.f.b.a(this.f7272e.getPackageName()).a(this.f7272e, this.f7274g, this.f7273f, this.a, this.b, true);
                    if (a2 == null || a2.isEmpty()) {
                        Logger.e(a.f7263e, "The serviceName[%s][%s] is not configured in the JSON configuration files to reveal all the details", this.a, this.b);
                    }
                    Logger.i(a.f7263e, "GrsClientManager.ayncGetGrsUrl: Return [%s][%s] Url: %s", this.a, this.b, StringUtils.anonymizeMessage(a2));
                    this.f7270c.onCallBackSuccess(a2);
                    return;
                }
                String str4 = a.f7263e;
                String str5 = this.b;
                Logger.i(str4, "GrsClientManager.ayncGetGrsUrl: Return [%s][%s] Url: %s", this.a, str5, StringUtils.anonymizeMessage(a.get(str5)));
                iQueryUrlCallBack = this.f7270c;
                str = this.f7271d;
            }
            iQueryUrlCallBack.onCallBackSuccess(str);
        }
    }

    public a(GrsBaseInfo grsBaseInfo, com.huawei.hms.framework.network.grs.e.a aVar, g gVar, com.huawei.hms.framework.network.grs.e.c cVar) {
        this.a = grsBaseInfo;
        this.b = aVar;
        this.f7264c = gVar;
        this.f7265d = cVar;
    }

    public static CountryCodeBean a(Context context, boolean z) {
        return new CountryCodeBean(context, z);
    }

    public static Map<String, Map<String, String>> a(String str) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(16);
        if (TextUtils.isEmpty(str)) {
            Logger.v(f7263e, "isSpExpire jsonValue is null.");
            return concurrentHashMap;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                if (!TextUtils.isEmpty(next)) {
                    concurrentHashMap.put(next, a(jSONObject2));
                }
            }
            return concurrentHashMap;
        } catch (JSONException e2) {
            Logger.w(f7263e, "getServicesUrlsMap occur a JSONException: %s", StringUtils.anonymizeMessage(e2.getMessage()));
            return concurrentHashMap;
        }
    }

    private Map<String, String> a(String str, com.huawei.hms.framework.network.grs.e.b bVar, Context context) {
        Map<String, String> a = this.b.a(this.a, str, bVar, context);
        if (a != null && !a.isEmpty()) {
            Logger.i(f7263e, "GrsClientManager.getUrlsLocal: Get URL from GRS Server Cache");
            return a;
        }
        Map<String, String> a2 = com.huawei.hms.framework.network.grs.f.b.a(context.getPackageName()).a(context, this.b, this.a, str, false);
        Logger.i(f7263e, "GrsClientManager.getUrlsLocal: Get URL from Local JSON File");
        return a2 != null ? a2 : new HashMap();
    }

    public static Map<String, String> a(String str, String str2) {
        HashMap hashMap = new HashMap();
        if (TextUtils.isEmpty(str)) {
            Logger.w(f7263e, "isSpExpire jsonValue from server is null.");
            return hashMap;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONObject jSONObject2 = jSONObject.has(str2) ? jSONObject.getJSONObject(str2) : null;
            if (jSONObject2 == null) {
                Logger.w(f7263e, "getServiceNameUrls: paser null from server json data by {%s}.", str2);
                return hashMap;
            }
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject2.get(next).toString());
            }
            return hashMap;
        } catch (JSONException e2) {
            Logger.w(f7263e, "Method{getServiceNameUrls} query url from SP occur an JSONException: %s", StringUtils.anonymizeMessage(e2.getMessage()));
            return hashMap;
        }
    }

    public static Map<String, String> a(JSONObject jSONObject) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(16);
        try {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                String obj = jSONObject.get(next).toString();
                if (!TextUtils.isEmpty(next) && !TextUtils.isEmpty(obj)) {
                    concurrentHashMap.put(next, obj);
                }
            }
            return concurrentHashMap;
        } catch (JSONException e2) {
            Logger.w(f7263e, "getServiceUrls occur a JSONException: %s", StringUtils.anonymizeMessage(e2.getMessage()));
            return concurrentHashMap;
        }
    }

    public String a(Context context, String str, int i) {
        com.huawei.hms.framework.network.grs.g.d a = this.f7264c.a(new com.huawei.hms.framework.network.grs.g.j.c(this.a, context), str, this.f7265d, i);
        return a == null ? "" : a.m() ? this.b.a().a(this.a.getGrsParasKey(true, true, context), "") : a.j();
    }

    public String a(String str, String str2, Context context, int i) {
        com.huawei.hms.framework.network.grs.e.b bVar = new com.huawei.hms.framework.network.grs.e.b();
        String str3 = a(str, bVar, context).get(str2);
        if (bVar.a() && !TextUtils.isEmpty(str3)) {
            Logger.i(f7263e, "GrsClientManager.synGetGrsUrl: Return [%s][%s] Url: %s", str, str2, StringUtils.anonymizeMessage(str3));
            return str3;
        }
        String a = a(context, str, i);
        String str4 = a(a, str).get(str2);
        if (!TextUtils.isEmpty(str4)) {
            Logger.i(f7263e, "GrsClientManager.synGetGrsUrl: Get URL from Current Called GRS Server, Return [%s][%s] Url: %s", str, str2, StringUtils.anonymizeMessage(str4));
            return str4;
        }
        if (TextUtils.isEmpty(str3)) {
            if (!TextUtils.isEmpty(a)) {
                Logger.e(f7263e, "The serviceName[%s][%s] is not configured on the GRS server.", str, str2);
            }
            String str5 = f7263e;
            Logger.i(str5, "GrsClientManager.synGetGrsUrl: Get URL from Local JSON File.");
            str3 = com.huawei.hms.framework.network.grs.f.b.a(context.getPackageName()).a(context, this.b, this.a, str, str2, true);
            if (str3 == null || str3.isEmpty()) {
                Logger.e(str5, "The serviceName[%s][%s] is not configured in the JSON configuration files to reveal all the details", str, str2);
            }
        }
        Logger.i(f7263e, "GrsClientManager.synGetGrsUrl: Return [%s][%s] Url: %s", str, str2, StringUtils.anonymizeMessage(str3));
        return str3;
    }

    public Map<String, String> a(String str, Context context, int i) {
        com.huawei.hms.framework.network.grs.e.b bVar = new com.huawei.hms.framework.network.grs.e.b();
        Map<String, String> a = a(str, bVar, context);
        if (bVar.a() && !a.isEmpty()) {
            Logger.i(f7263e, "Return [%s] Urls: %s", str, StringUtils.anonymizeMessage(new JSONObject(a).toString()));
            return a;
        }
        String a2 = a(context, str, i);
        Map<String, String> a3 = a(a2, str);
        if (!a3.isEmpty()) {
            Logger.i(f7263e, "GrsClientManager.synGetGrsUrls: Get URL from Current Called GRS Server Return [%s] Urls: %s", str, StringUtils.anonymizeMessage(new JSONObject(a3).toString()));
            return a3;
        }
        if (a.isEmpty()) {
            if (!TextUtils.isEmpty(a2)) {
                Logger.e(f7263e, "The serviceName[%s] is not configured on the GRS server.", str);
            }
            String str2 = f7263e;
            Logger.i(str2, "GrsClientManager.synGetGrsUrls: Get URL from Local JSON File.");
            a = com.huawei.hms.framework.network.grs.f.b.a(context.getPackageName()).a(context, this.b, this.a, str, true);
            if (a == null || a.isEmpty()) {
                Logger.e(str2, "The serviceName[%s] is not configured in the JSON configuration files to reveal all the details", str);
            }
        }
        String str3 = f7263e;
        Object[] objArr = new Object[2];
        objArr[0] = str;
        objArr[1] = StringUtils.anonymizeMessage(a != null ? new JSONObject(a).toString() : "");
        Logger.i(str3, "GrsClientManager.synGetGrsUrls: Return [%s] Urls: %s", objArr);
        return a;
    }

    public void a(String str, IQueryUrlsCallBack iQueryUrlsCallBack, Context context, int i) {
        com.huawei.hms.framework.network.grs.e.b bVar = new com.huawei.hms.framework.network.grs.e.b();
        Map<String, String> a = a(str, bVar, context);
        if (!bVar.a()) {
            this.f7264c.a(new com.huawei.hms.framework.network.grs.g.j.c(this.a, context), new C0351a(str, a, iQueryUrlsCallBack, context, this.a, this.b), str, this.f7265d, i);
            return;
        }
        if (a.isEmpty()) {
            Logger.i(f7263e, "GrsClientManager.ayncGetGrsUrls：Return [%s] Urls is Empty", str);
            iQueryUrlsCallBack.onCallBackFail(-5);
        } else {
            String str2 = f7263e;
            Logger.i(str2, "GrsClientManager.ayncGetGrsUrls：Return [%s] Urls: %s", str, StringUtils.anonymizeMessage(new JSONObject(a).toString()));
            Logger.i(str2, "ayncGetGrsUrls: %s", StringUtils.anonymizeMessage(new JSONObject(a).toString()));
            iQueryUrlsCallBack.onCallBackSuccess(a);
        }
    }

    public void a(String str, String str2, IQueryUrlCallBack iQueryUrlCallBack, Context context, int i) {
        com.huawei.hms.framework.network.grs.e.b bVar = new com.huawei.hms.framework.network.grs.e.b();
        String str3 = a(str, bVar, context).get(str2);
        if (!bVar.a()) {
            this.f7264c.a(new com.huawei.hms.framework.network.grs.g.j.c(this.a, context), new b(str, str2, iQueryUrlCallBack, str3, context, this.a, this.b), str, this.f7265d, i);
        } else if (TextUtils.isEmpty(str3)) {
            Logger.i(f7263e, "GrsClientManager.ayncGetGrsUrl：Return [%s][%s] Url is Empty", str, str2);
            iQueryUrlCallBack.onCallBackFail(-5);
        } else {
            Logger.i(f7263e, "GrsClientManager.ayncGetGrsUrl：Return [%s][%s] Url: %s", str, str2, StringUtils.anonymizeMessage(str3));
            iQueryUrlCallBack.onCallBackSuccess(str3);
        }
    }
}
