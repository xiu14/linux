package com.bytedance.frameworks.baselib.network.http.o;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import com.bytedance.frameworks.baselib.network.http.p.k;
import com.bytedance.frameworks.baselib.network.http.p.l;
import com.bytedance.retrofit2.client.Request;
import com.huawei.hms.framework.common.ContainerUtils;
import com.vivo.push.PushClient;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class b {
    private static volatile b n;
    private boolean h;
    private Context k;
    private boolean l;
    private com.bytedance.frameworks.baselib.network.http.o.a m;
    private String a = "";
    private String b = "";

    /* renamed from: c, reason: collision with root package name */
    private String f5150c = "";

    /* renamed from: d, reason: collision with root package name */
    private String f5151d = "";

    /* renamed from: e, reason: collision with root package name */
    private String f5152e = "";

    /* renamed from: f, reason: collision with root package name */
    private String f5153f = "";

    /* renamed from: g, reason: collision with root package name */
    private String f5154g = "";
    private List<String> i = new ArrayList();
    private List<String> j = new ArrayList();

    private class a {
        String a;
        String b;

        /* renamed from: c, reason: collision with root package name */
        String f5155c;

        a(b bVar, String str, String str2, String str3) {
            this.a = str;
            this.b = str2;
            this.f5155c = str3;
        }
    }

    /* renamed from: com.bytedance.frameworks.baselib.network.http.o.b$b, reason: collision with other inner class name */
    public interface InterfaceC0257b {
    }

    private b() {
    }

    private boolean c(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Iterator<String> it2 = this.i.iterator();
        while (it2.hasNext()) {
            if (l.b(str, it2.next())) {
                return true;
            }
        }
        return false;
    }

    private a d(List<String> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        String str = "";
        String str2 = "";
        String str3 = str2;
        for (String str4 : list) {
            if (str4.toLowerCase().startsWith("store-country-code=")) {
                str = str4;
            } else if (str4.toLowerCase().startsWith("store-country-code-src=")) {
                str2 = str4;
            } else if (str4.toLowerCase().startsWith("region_legacy_user=")) {
                str3 = str4;
            }
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String e2 = e(str);
        if (e2.isEmpty()) {
            return null;
        }
        return new a(this, e2, e(str2), e(str3));
    }

    private String e(String str) {
        String[] split;
        String[] split2;
        return (TextUtils.isEmpty(str) || (split = str.split(";")) == null || split.length <= 0 || (split2 = split[0].trim().split(ContainerUtils.KEY_VALUE_DELIMITER)) == null || split2.length != 2) ? "" : split2[1];
    }

    private static String f(Map<String, List<String>> map, String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        List<String> list = null;
        Iterator<String> it2 = map.keySet().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            String next = it2.next();
            if (str.equalsIgnoreCase(next)) {
                list = map.get(next);
                break;
            }
        }
        return (list == null || list.size() <= 0) ? "" : list.get(list.size() - 1);
    }

    public static b j() {
        if (n == null) {
            synchronized (b.class) {
                if (n == null) {
                    n = new b();
                }
            }
        }
        return n;
    }

    private void l() {
        SharedPreferences sharedPreferences = this.k.getSharedPreferences("ttnet_store_region", 0);
        this.a = sharedPreferences.getString("store_region", "");
        this.b = sharedPreferences.getString("store_region_src", "");
        this.f5150c = sharedPreferences.getString("region_legacy_user", "");
        this.f5151d = sharedPreferences.getString("store_sec_uid", "");
        this.f5153f = sharedPreferences.getString("update_region_info", "");
        this.h = sharedPreferences.getBoolean("received_region_config", false);
        if (TextUtils.isEmpty(this.a) && !TextUtils.isEmpty(this.f5152e)) {
            this.a = this.f5152e;
            this.b = "local";
        }
        this.m.onStoreIdcChanged("", this.a, this.b, this.f5150c, this.f5151d, "");
        if (Logger.debug()) {
            StringBuilder M = e.a.a.a.a.M("Init region:");
            M.append(this.a);
            M.append(" sec_uid:");
            M.append(this.f5151d);
            M.append(" source:");
            M.append(this.b);
            M.append(" local:");
            M.append(this.f5152e);
            M.append(" init region:");
            M.append(this.f5154g);
            M.append(" region config:");
            M.append(this.h);
            Logger.d("StoreRegionManager", M.toString());
        }
    }

    public void a(Map<String, String> map) {
        if (!this.l || this.h || TextUtils.isEmpty(this.f5154g)) {
            return;
        }
        map.put("x-tt-app-init-region", this.f5154g);
    }

    public Request b(Request request) {
        boolean z;
        boolean z2;
        boolean z3;
        if (!this.l || TextUtils.isEmpty(request.getHost()) || request.isPureRequest()) {
            return null;
        }
        Iterator<String> it2 = this.j.iterator();
        while (true) {
            z = false;
            if (!it2.hasNext()) {
                z2 = false;
                break;
            }
            if (l.b(request.getHost(), it2.next())) {
                z2 = true;
                break;
            }
        }
        ArrayList arrayList = new ArrayList();
        if (!this.h && !TextUtils.isEmpty(this.f5154g)) {
            arrayList.add(new com.bytedance.retrofit2.client.b("x-tt-app-init-region", this.f5154g));
            z2 = true;
        }
        if (!z2) {
            return null;
        }
        if (request.getHeaders() != null) {
            arrayList.addAll(request.getHeaders());
        }
        Request.a newBuilder = request.newBuilder();
        if (!TextUtils.isEmpty(request.getPath())) {
            if (!"/get_domains/v5/".equals(request.getPath())) {
                Iterator<String> it3 = this.i.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        z3 = false;
                        break;
                    }
                    if (l.b(request.getPath(), it3.next())) {
                        z3 = true;
                        break;
                    }
                }
                if (z3) {
                    k kVar = new k(request.getUrl());
                    kVar.b("okhttp_version", "4.2.243.8-doubao");
                    kVar.b("use_store_region_cookie", PushClient.DEFAULT_REQUEST_ID);
                    newBuilder.g(kVar.c());
                }
            }
            z = true;
        }
        if (z) {
            newBuilder.b(arrayList);
            return newBuilder.a();
        }
        String str = !this.a.isEmpty() ? this.a : !this.f5152e.isEmpty() ? this.f5152e : "";
        if (!TextUtils.isEmpty(str)) {
            arrayList.add(new com.bytedance.retrofit2.client.b("x-tt-store-region", str));
        }
        if (!TextUtils.isEmpty(this.b)) {
            arrayList.add(new com.bytedance.retrofit2.client.b("x-tt-store-region-src", this.b));
        }
        newBuilder.b(arrayList);
        return newBuilder.a();
    }

    public JSONObject g() {
        if (!this.l) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("region", this.a);
            jSONObject.put("source", this.b);
            jSONObject.put("local_region", this.f5152e);
            jSONObject.put("update_region", this.f5153f);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return jSONObject;
    }

    public String h() {
        return this.a;
    }

    public void i(String str, String str2, String str3, Context context, com.bytedance.frameworks.baselib.network.http.o.a aVar) {
        if (Logger.debug()) {
            e.a.a.a.a.s0("rule json: ", str2, "StoreRegionManager");
        }
        if (TextUtils.isEmpty(str2) || context == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str2);
            JSONArray optJSONArray = jSONObject.optJSONArray("update_store_idc_path_list");
            for (int i = 0; i < optJSONArray.length(); i++) {
                String string = optJSONArray.getString(i);
                if (!TextUtils.isEmpty(string)) {
                    this.i.add(string);
                }
            }
            JSONArray optJSONArray2 = jSONObject.optJSONArray("add_store_idc_host_list");
            for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                String string2 = optJSONArray2.getString(i2);
                if (!TextUtils.isEmpty(string2)) {
                    this.j.add(string2);
                }
            }
            this.k = context;
            this.m = aVar;
            if (!TextUtils.isEmpty(str)) {
                this.f5152e = str.toLowerCase();
            }
            if (this.j.isEmpty() || this.i.isEmpty()) {
                return;
            }
            this.l = true;
            this.f5154g = str3;
            l();
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    public boolean k() {
        return this.l;
    }

    public void m(String str, String str2, String str3, String str4) {
        if (this.k == null || !this.l || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        if (this.a.equalsIgnoreCase(str) && this.b.equalsIgnoreCase(str2) && this.f5151d.equalsIgnoreCase(str4)) {
            return;
        }
        this.f5151d = str4;
        this.a = str;
        this.b = str2;
        this.f5150c = str3;
        if (Logger.debug()) {
            StringBuilder M = e.a.a.a.a.M("saveStoreRegionForCronet region:");
            M.append(this.a);
            M.append(" source:");
            M.append(this.b);
            M.append(" sec uid:");
            e.a.a.a.a.I0(M, this.f5151d, "StoreRegionManager");
        }
        SharedPreferences.Editor edit = this.k.getSharedPreferences("ttnet_store_region", 0).edit();
        edit.putString("store_region", this.a);
        edit.putString("store_region_src", this.b);
        edit.putString("store_sec_uid", this.f5151d);
        edit.apply();
    }

    public void n() {
        if (this.h) {
            return;
        }
        this.h = true;
        SharedPreferences.Editor edit = this.k.getSharedPreferences("ttnet_store_region", 0).edit();
        edit.putBoolean("received_region_config", true);
        edit.apply();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:9|(1:44)|13|(4:(4:17|18|19|(8:(1:25)|26|27|28|29|30|31|33)(1:23))|30|31|33)|43|(1:21)|(0)|26|27|28|29) */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0102, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0103, code lost:
    
        r0.printStackTrace();
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void o(java.net.HttpURLConnection r18, byte[] r19, com.bytedance.frameworks.baselib.network.http.o.b.InterfaceC0257b r20) {
        /*
            Method dump skipped, instructions count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.baselib.network.http.o.b.o(java.net.HttpURLConnection, byte[], com.bytedance.frameworks.baselib.network.http.o.b$b):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x018b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void p(okhttp3.B r17, java.lang.String r18, byte[] r19) {
        /*
            Method dump skipped, instructions count: 560
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.baselib.network.http.o.b.p(okhttp3.B, java.lang.String, byte[]):void");
    }
}
