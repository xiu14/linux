package com.huawei.hms.framework.network.grs.f;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.StringUtils;
import com.huawei.hms.framework.network.grs.GrsApp;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class a {
    protected com.huawei.hms.framework.network.grs.local.model.a a;
    protected List<com.huawei.hms.framework.network.grs.local.model.b> b;

    /* renamed from: c, reason: collision with root package name */
    protected boolean f7287c = false;

    /* renamed from: d, reason: collision with root package name */
    protected boolean f7288d = false;

    /* renamed from: e, reason: collision with root package name */
    protected Set<String> f7289e = new HashSet(16);

    private Map<String, String> a(List<com.huawei.hms.framework.network.grs.local.model.b> list, GrsBaseInfo grsBaseInfo, String str) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(16);
        concurrentHashMap.put("no_route_country", "no-country");
        for (com.huawei.hms.framework.network.grs.local.model.b bVar : list) {
            if (bVar.a().contains(grsBaseInfo.getIssueCountry())) {
                concurrentHashMap.put(grsBaseInfo.getIssueCountry(), bVar.b());
            }
            if (bVar.a().contains(grsBaseInfo.getRegCountry())) {
                concurrentHashMap.put(grsBaseInfo.getRegCountry(), bVar.b());
            }
            if (bVar.a().contains(grsBaseInfo.getSerCountry())) {
                concurrentHashMap.put(grsBaseInfo.getSerCountry(), bVar.b());
            }
            if (bVar.a().contains(str)) {
                Logger.v("AbstractLocalManager", "get countryGroupID from geoIp");
                concurrentHashMap.put(str, bVar.b());
            }
        }
        return concurrentHashMap;
    }

    private int b(String str, Context context) {
        if (h(com.huawei.hms.framework.network.grs.h.c.a(str, context)) != 0) {
            return -1;
        }
        Logger.i("AbstractLocalManager", "load APP_CONFIG_FILE success{%s}.", str);
        return 0;
    }

    private int h(String str) {
        int c2;
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (this.f7288d && (c2 = c(str)) != 0) {
            return c2;
        }
        int b = b(str);
        return b != 0 ? b : g(str);
    }

    private int i(String str) {
        List<com.huawei.hms.framework.network.grs.local.model.b> list;
        int e2;
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        return (!this.f7288d || !((list = this.b) == null || list.isEmpty()) || (e2 = e(str)) == 0) ? f(str) : e2;
    }

    int a(String str, Context context) {
        StringBuilder sb = new StringBuilder();
        sb.append(GrsApp.getInstance().getBrand("/"));
        sb.append(str);
        return b(sb.toString(), context) != 0 ? -1 : 0;
    }

    public String a(Context context, com.huawei.hms.framework.network.grs.e.a aVar, GrsBaseInfo grsBaseInfo, String str, String str2, boolean z) {
        Map<String, String> a = a(context, aVar, grsBaseInfo, str, z);
        if (a != null) {
            return a.get(str2);
        }
        Logger.w("AbstractLocalManager", "addresses not found by routeby in local config{%s}", str);
        return null;
    }

    public String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if ("no_route_country".equals(str)) {
            return "no-country";
        }
        List<com.huawei.hms.framework.network.grs.local.model.b> list = this.b;
        if (list != null && !list.isEmpty()) {
            for (com.huawei.hms.framework.network.grs.local.model.b bVar : this.b) {
                if (bVar.a().contains(str)) {
                    return bVar.b();
                }
            }
        }
        return null;
    }

    public List<com.huawei.hms.framework.network.grs.local.model.b> a(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList(16);
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            com.huawei.hms.framework.network.grs.local.model.b bVar = new com.huawei.hms.framework.network.grs.local.model.b();
            bVar.b(jSONObject.getString("id"));
            bVar.c(jSONObject.getString("name"));
            bVar.a(jSONObject.getString(com.heytap.mcssdk.constant.b.i));
            JSONArray jSONArray2 = null;
            String str = "countriesOrAreas";
            if (!jSONObject.has("countriesOrAreas")) {
                str = "countries";
                if (!jSONObject.has("countries")) {
                    Logger.w("AbstractLocalManager", "current country or area group has not config countries or areas.");
                    HashSet hashSet = new HashSet(16);
                    if (jSONArray2 != null || jSONArray2.length() == 0) {
                        return new ArrayList();
                    }
                    for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                        hashSet.add((String) jSONArray2.get(i2));
                    }
                    bVar.a(hashSet);
                    arrayList.add(bVar);
                }
            }
            jSONArray2 = jSONObject.getJSONArray(str);
            HashSet hashSet2 = new HashSet(16);
            if (jSONArray2 != null) {
            }
            return new ArrayList();
        }
        return arrayList;
    }

    public Map<String, String> a(Context context, com.huawei.hms.framework.network.grs.e.a aVar, GrsBaseInfo grsBaseInfo, String str, boolean z) {
        com.huawei.hms.framework.network.grs.local.model.a aVar2 = this.a;
        if (aVar2 == null) {
            Logger.w("AbstractLocalManager", "application data is null.");
            return null;
        }
        com.huawei.hms.framework.network.grs.local.model.c a = aVar2.a(str);
        if (a == null) {
            Logger.w("AbstractLocalManager", "service not found in local config{%s}", str);
            return null;
        }
        String b = e.b(context, aVar, a.b(), grsBaseInfo, z);
        if (b == null) {
            Logger.w("AbstractLocalManager", "country not found by routeby in local config{%s}", a.b());
            return null;
        }
        List<com.huawei.hms.framework.network.grs.local.model.b> a2 = a.a();
        com.huawei.hms.framework.network.grs.local.model.d a3 = a.a((a2 == null || a2.size() == 0) ? a(b) : a(a2, grsBaseInfo, b).get(b));
        if (a3 == null) {
            return null;
        }
        return a3.a();
    }

    public JSONObject a() {
        JSONObject b = this.a.b();
        if (this.b != null) {
            JSONArray jSONArray = new JSONArray();
            Iterator<com.huawei.hms.framework.network.grs.local.model.b> it2 = this.b.iterator();
            while (it2.hasNext()) {
                jSONArray.put(it2.next().c());
            }
            b.put("countryGroups", jSONArray);
        }
        return b;
    }

    public void a(Context context, List<String> list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        for (String str : list) {
            Logger.d("AbstractLocalManager", "getBatchLoadSdkSuccessFlag file:" + str);
            if (TextUtils.isEmpty(str) || !Pattern.matches("^grs_sdk_global_route_config_[a-zA-Z]+\\.json$", str)) {
                Logger.d("AbstractLocalManager", "load SDK_CONFIG_FILE: %s, skipped.", str);
            } else {
                if (i(com.huawei.hms.framework.network.grs.h.c.a(GrsApp.getInstance().getBrand("/") + str, context)) == 0) {
                    Logger.d("AbstractLocalManager", "load SDK_CONFIG_FILE: %s, sucess.", str);
                } else {
                    Logger.w("AbstractLocalManager", "load SDK_CONFIG_FILE: %s, failure.", str);
                }
            }
        }
    }

    public abstract int b(String str);

    public com.huawei.hms.framework.network.grs.local.model.a b() {
        return this.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void b(org.json.JSONArray r15) {
        /*
            r14 = this;
            if (r15 == 0) goto Lf6
            int r0 = r15.length()
            if (r0 != 0) goto La
            goto Lf6
        La:
            r0 = 0
            r1 = r0
        Lc:
            int r2 = r15.length()
            if (r1 >= r2) goto Lf6
            org.json.JSONObject r2 = r15.getJSONObject(r1)
            com.huawei.hms.framework.network.grs.local.model.c r3 = new com.huawei.hms.framework.network.grs.local.model.c
            r3.<init>()
            java.lang.String r4 = "name"
            java.lang.String r4 = r2.getString(r4)
            r3.b(r4)
            java.util.Set<java.lang.String> r5 = r14.f7289e
            boolean r5 = r5.contains(r4)
            if (r5 != 0) goto Lf2
            java.util.Set<java.lang.String> r5 = r14.f7289e
            r5.add(r4)
            boolean r5 = r14.f7288d
            if (r5 == 0) goto Lf2
            java.lang.String r5 = "routeBy"
            java.lang.String r5 = r2.getString(r5)
            r3.c(r5)
            java.lang.String r5 = "servings"
            org.json.JSONArray r5 = r2.getJSONArray(r5)
            r6 = r0
        L45:
            int r7 = r5.length()
            java.lang.String r8 = "AbstractLocalManager"
            if (r6 >= r7) goto Lbf
            java.lang.Object r7 = r5.get(r6)
            org.json.JSONObject r7 = (org.json.JSONObject) r7
            com.huawei.hms.framework.network.grs.local.model.d r9 = new com.huawei.hms.framework.network.grs.local.model.d
            r9.<init>()
            java.lang.String r10 = "countryOrAreaGroup"
            boolean r11 = r7.has(r10)
            if (r11 == 0) goto L65
        L60:
            java.lang.String r8 = r7.getString(r10)
            goto L7a
        L65:
            java.lang.String r10 = "countryGroup"
            boolean r11 = r7.has(r10)
            if (r11 == 0) goto L6e
            goto L60
        L6e:
            r10 = 1
            java.lang.Object[] r10 = new java.lang.Object[r10]
            r10[r0] = r4
            java.lang.String r11 = "maybe this service{%s} routeBy is unconditional."
            com.huawei.hms.framework.common.Logger.v(r8, r11, r10)
            java.lang.String r8 = "no-country"
        L7a:
            r9.a(r8)
            java.lang.String r8 = "addresses"
            org.json.JSONObject r7 = r7.getJSONObject(r8)
            java.util.concurrent.ConcurrentHashMap r8 = new java.util.concurrent.ConcurrentHashMap
            r10 = 16
            r8.<init>(r10)
            java.util.Iterator r10 = r7.keys()
        L8e:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto Lb2
            java.lang.Object r11 = r10.next()
            java.lang.String r11 = (java.lang.String) r11
            java.lang.String r12 = r7.getString(r11)
            boolean r13 = android.text.TextUtils.isEmpty(r11)
            if (r13 != 0) goto L8e
            boolean r12 = android.text.TextUtils.isEmpty(r12)
            if (r12 != 0) goto L8e
            java.lang.String r12 = r7.getString(r11)
            r8.put(r11, r12)
            goto L8e
        Lb2:
            r9.a(r8)
            java.lang.String r7 = r9.b()
            r3.a(r7, r9)
            int r6 = r6 + 1
            goto L45
        Lbf:
            r5 = 0
            java.lang.String r6 = "countryOrAreaGroups"
            boolean r7 = r2.has(r6)
            if (r7 == 0) goto Ld1
        Lc8:
            org.json.JSONArray r2 = r2.getJSONArray(r6)
            java.util.List r5 = r14.a(r2)
            goto Ldf
        Ld1:
            java.lang.String r6 = "countryGroups"
            boolean r7 = r2.has(r6)
            if (r7 == 0) goto Lda
            goto Lc8
        Lda:
            java.lang.String r2 = "service use default countryOrAreaGroup"
            com.huawei.hms.framework.common.Logger.i(r8, r2)
        Ldf:
            r3.a(r5)
            com.huawei.hms.framework.network.grs.local.model.a r2 = r14.a
            if (r2 != 0) goto Led
            com.huawei.hms.framework.network.grs.local.model.a r2 = new com.huawei.hms.framework.network.grs.local.model.a
            r2.<init>()
            r14.a = r2
        Led:
            com.huawei.hms.framework.network.grs.local.model.a r2 = r14.a
            r2.a(r4, r3)
        Lf2:
            int r1 = r1 + 1
            goto Lc
        Lf6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.framework.network.grs.f.a.b(org.json.JSONArray):void");
    }

    public abstract int c(String str);

    public Set<String> c() {
        return this.f7289e;
    }

    public boolean d() {
        return this.f7287c;
    }

    public boolean d(String str) {
        String sb;
        try {
            this.a = new com.huawei.hms.framework.network.grs.local.model.a();
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("name")) {
                this.a.b(jSONObject.getString("name"));
            }
            if (jSONObject.has("cacheControl")) {
                this.a.a(jSONObject.getLong("cacheControl"));
            }
            if (jSONObject.has("services")) {
                b(jSONObject.getJSONArray("services"));
            }
            if (jSONObject.has("countryGroups")) {
                JSONArray jSONArray = jSONObject.getJSONArray("countryGroups");
                ArrayList arrayList = new ArrayList(16);
                this.b = arrayList;
                arrayList.addAll(a(jSONArray));
            }
            Logger.i("AbstractLocalManager", "parse from sp services size : %d, countryGroups size: %d:", Integer.valueOf(this.f7289e.size()), Integer.valueOf(this.b.size()));
            return true;
        } catch (JSONException unused) {
            sb = "Parse local config from sp failed, JSONException";
            Logger.w("AbstractLocalManager", sb);
            return false;
        } catch (Throwable th) {
            StringBuilder M = e.a.a.a.a.M("Parse local config from sp failed, Throwable:");
            M.append(StringUtils.anonymizeMessage(th.getMessage()));
            sb = M.toString();
            Logger.w("AbstractLocalManager", sb);
            return false;
        }
    }

    public int e(String str) {
        this.b = new ArrayList(16);
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONArray jSONArray = null;
            if (jSONObject.has("countryOrAreaGroups")) {
                jSONArray = jSONObject.getJSONArray("countryOrAreaGroups");
            } else if (jSONObject.has("countryGroups")) {
                jSONArray = jSONObject.getJSONArray("countryGroups");
            } else {
                Logger.e("AbstractLocalManager", "maybe local config json is wrong because the default countryOrAreaGroups isn't config.");
            }
            if (jSONArray == null) {
                return -1;
            }
            this.b.addAll(a(jSONArray));
            return 0;
        } catch (JSONException e2) {
            Logger.w("AbstractLocalManager", "parse countrygroup failed maybe json style is wrong. %s", StringUtils.anonymizeMessage(e2.getMessage()));
            return -1;
        }
    }

    public int f(String str) {
        try {
            b(new JSONObject(str).getJSONArray("services"));
            return 0;
        } catch (JSONException e2) {
            Logger.w("AbstractLocalManager", "parse 2.0 services failed maybe because of json style.please check! %s", StringUtils.anonymizeMessage(e2.getMessage()));
            return -1;
        }
    }

    public abstract int g(String str);
}
