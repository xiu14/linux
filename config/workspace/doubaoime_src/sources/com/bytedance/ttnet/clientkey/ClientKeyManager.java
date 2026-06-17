package com.bytedance.ttnet.clientkey;

import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.wschannel.WsConstants;
import com.bytedance.feedbackerlib.a;
import com.bytedance.frameworks.baselib.network.http.p.l;
import com.bytedance.keva.Keva;
import com.bytedance.retrofit2.I;
import com.bytedance.retrofit2.RetrofitMetrics;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.client.b;
import com.bytedance.retrofit2.client.c;
import com.bytedance.ttnet.config.f;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.io.IOException;
import java.net.CookieHandler;
import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class ClientKeyManager {
    private static volatile ClientKeyManager h = null;
    private static Keva i = null;
    private static volatile boolean j = false;
    private static boolean k = true;
    private static Map<String, String> l;
    private List<String> a = new CopyOnWriteArrayList();
    private List<String> b = new CopyOnWriteArrayList();

    /* renamed from: c, reason: collision with root package name */
    private String f6113c = "";

    /* renamed from: d, reason: collision with root package name */
    private String f6114d = "";

    /* renamed from: e, reason: collision with root package name */
    private String f6115e = "";

    /* renamed from: f, reason: collision with root package name */
    private String f6116f = "";

    /* renamed from: g, reason: collision with root package name */
    private boolean f6117g = true;

    private ClientKeyManager() {
    }

    private void d(JSONObject jSONObject) throws Exception {
        j = jSONObject.optInt("client_key_sign_enabled", 0) > 0;
        if (!j) {
            if (Logger.debug()) {
                Logger.d("ClientKeyManager", "clear client key storage.");
            }
            i.clear();
            return;
        }
        this.f6117g = jSONObject.optInt("rewrite_session_enabled", 1) > 0;
        this.a.clear();
        String optString = jSONObject.optString("update_host_list", null);
        if (!TextUtils.isEmpty(optString)) {
            JSONArray jSONArray = new JSONArray(optString);
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                String string = jSONArray.getString(i2);
                if (!TextUtils.isEmpty(string)) {
                    this.a.add(string);
                }
            }
        }
        this.b.clear();
        String optString2 = jSONObject.optString("update_path_list", null);
        if (TextUtils.isEmpty(optString2)) {
            return;
        }
        JSONArray jSONArray2 = new JSONArray(optString2);
        for (int i3 = 0; i3 < jSONArray2.length(); i3++) {
            String string2 = jSONArray2.getString(i3);
            if (!TextUtils.isEmpty(string2)) {
                this.b.add(string2);
            }
        }
    }

    private void e(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("report_time", System.currentTimeMillis() + "");
            jSONObject.put("cookie_line", str);
            jSONObject.put("session_id", str2);
            jSONObject.put("url", this.f6115e);
            a.B0("cookie_mismatch", jSONObject, Integer.MAX_VALUE, null);
        } catch (Throwable unused) {
        }
    }

    private void g(Request request, c cVar) {
        URI uri;
        boolean z;
        String str;
        String str2;
        int i2;
        String str3;
        boolean z2;
        try {
            uri = a.E0(request.getUrl());
        } catch (Throwable unused) {
            uri = null;
        }
        if (uri == null) {
            return;
        }
        int i3 = 1;
        if (!this.a.isEmpty()) {
            Iterator<String> it2 = this.a.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    z2 = false;
                    break;
                } else {
                    if (l.b(uri.getHost(), it2.next())) {
                        z2 = true;
                        break;
                    }
                }
            }
            if (!z2) {
                return;
            }
        }
        if (!this.b.isEmpty()) {
            Iterator<String> it3 = this.b.iterator();
            while (it3.hasNext()) {
                if (l.b(uri.getPath(), it3.next())) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        if (z) {
            List<b> i4 = cVar.i("Set-Cookie");
            if (i4 != null && !i4.isEmpty()) {
                Iterator<b> it4 = i4.iterator();
                while (it4.hasNext()) {
                    String trim = it4.next().b().trim();
                    if (trim.toLowerCase().startsWith("sessionid=")) {
                        str = trim;
                        break;
                    }
                }
            }
            str = "";
            String[] split = str.split(";");
            String trim2 = (split == null || split.length <= 0) ? "" : split[0].trim();
            if (TextUtils.isEmpty(trim2)) {
                return;
            }
            if (Logger.debug()) {
                StringBuilder M = e.a.a.a.a.M("original sessionid: ");
                M.append(this.f6114d);
                M.append(" new sessionid: ");
                M.append(trim2);
                Logger.d("ClientKeyManager", M.toString());
            }
            b c2 = cVar.c("x-bd-lanusk");
            b c3 = cVar.c("x-bd-lanusv");
            if (c2 != null && c3 != null) {
                String b = c2.b();
                String b2 = c3.b();
                if (!TextUtils.isEmpty(b) && !TextUtils.isEmpty(b2)) {
                    str3 = b;
                    i2 = 0;
                    str2 = b2;
                }
                i2 = i3;
                str3 = "";
                str2 = str3;
            } else if (trim2.equals(this.f6114d)) {
                String str4 = this.f6113c;
                str2 = this.f6116f;
                i2 = 2;
                str3 = str4;
            } else {
                i3 = 3;
                i2 = i3;
                str3 = "";
                str2 = str3;
            }
            if (i2 != 0) {
                try {
                    l(i2, this.f6114d, trim2, this.f6113c, str3, this.f6116f, str2, cVar, uri.getPath());
                } catch (Throwable unused2) {
                }
            }
            this.f6113c = str3;
            this.f6116f = str2;
            String url = request.getUrl();
            this.f6115e = url;
            this.f6114d = trim2;
            i.storeString("session_url", url);
            i.storeString("session_id", str);
            i.storeString("client_key", this.f6113c);
            i.storeString("kms_version", this.f6116f);
            i.storeLong("session_time", System.currentTimeMillis());
            l = i(this.f6113c, this.f6116f);
            if (Logger.debug()) {
                StringBuilder M2 = e.a.a.a.a.M("save session url: ");
                e.a.a.a.a.M0(M2, this.f6115e, " session cookie: ", str, " client key: ");
                M2.append(this.f6113c);
                M2.append(" kms version: ");
                e.a.a.a.a.I0(M2, this.f6116f, "ClientKeyManager");
            }
        }
    }

    public static Map<String, String> getClientKeyHeaders() {
        if (i == null || !j) {
            return null;
        }
        return k ? l : i(i.getString("client_key", ""), i.getString("kms_version", ""));
    }

    private static String h(c cVar, String str) {
        b c2 = cVar.c(str);
        if (c2 == null) {
            return "";
        }
        StringBuilder M = e.a.a.a.a.M("");
        M.append(c2.toString());
        return e.a.a.a.a.s(M.toString(), "; ");
    }

    private static Map<String, String> i(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("x-bd-client-key", str);
        hashMap.put("x-bd-kmsv", str2);
        return hashMap;
    }

    public static ClientKeyManager j() {
        if (h == null) {
            synchronized (ClientKeyManager.class) {
                if (h == null) {
                    h = new ClientKeyManager();
                }
            }
        }
        return h;
    }

    private void k(String str, CookieHandler cookieHandler, URI uri) throws IOException {
        if (this.f6117g) {
            Map<String, List<String>> linkedHashMap = new LinkedHashMap<>();
            ArrayList arrayList = new ArrayList();
            arrayList.add(str);
            linkedHashMap.put("Set-Cookie", arrayList);
            cookieHandler.put(uri, linkedHashMap);
            if (Logger.debug()) {
                e.a.a.a.a.s0("Refresh session cookie: ", str, "ClientKeyManager");
            }
        }
    }

    private void l(int i2, String str, String str2, String str3, String str4, String str5, String str6, c cVar, String str7) throws Exception {
        JSONObject a0 = e.a.a.a.a.a0("origin_sid", str, WsConstants.KEY_SESSION_ID, str2);
        a0.put("origin_key", str3);
        a0.put("key", str4);
        a0.put("origin_kms", str5);
        a0.put("kms", str6);
        StringBuilder M = e.a.a.a.a.M(h(cVar, "x-tt-token"));
        M.append(h(cVar, "x-tt-logid"));
        StringBuilder M2 = e.a.a.a.a.M(M.toString());
        M2.append(h(cVar, "x-bd-lanusk"));
        StringBuilder M3 = e.a.a.a.a.M(M2.toString());
        M3.append(h(cVar, "x-bd-lanusv"));
        String sb = M3.toString();
        if (!TextUtils.isEmpty(sb)) {
            a0.put("headers", sb);
        }
        a.B0("client_key", a0, i2, str7);
    }

    public void a(List<b> list, RetrofitMetrics retrofitMetrics) {
        if (i == null || !j || TextUtils.isEmpty(this.f6113c) || TextUtils.isEmpty(this.f6116f)) {
            return;
        }
        if (retrofitMetrics != null) {
            retrofitMetrics.E0.f5962c.c();
        }
        list.add(new b("x-bd-client-key", this.f6113c));
        list.add(new b("x-bd-kmsv", this.f6116f));
        if (retrofitMetrics != null) {
            I.c cVar = retrofitMetrics.E0.f5962c;
            cVar.i = cVar.a();
            retrofitMetrics.Y = a.p0(retrofitMetrics.E0.f5962c.i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x015e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(boolean r19) {
        /*
            Method dump skipped, instructions count: 454
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ttnet.clientkey.ClientKeyManager.b(boolean):void");
    }

    public void c(Object obj) {
        if (i == null || !f.a(obj)) {
            return;
        }
        try {
            JSONObject jSONObject = obj instanceof String ? new JSONObject((String) obj) : obj instanceof JSONObject ? (JSONObject) obj : obj instanceof f.a ? ((f.a) obj).b() : null;
            JSONObject optJSONObject = jSONObject != null ? jSONObject.getJSONObject(RemoteMessageConst.DATA).optJSONObject("client_key_config") : null;
            if (optJSONObject == null) {
                if (Logger.debug()) {
                    Logger.d("ClientKeyManager", "clear client key storage.");
                }
                j = false;
                i.clear();
                return;
            }
            String jSONObject2 = optJSONObject.toString();
            if (Logger.debug()) {
                Logger.d("ClientKeyManager", "config: " + jSONObject2);
            }
            i.storeString("client_key_config", jSONObject2);
            d(optJSONObject);
        } catch (Throwable unused) {
        }
    }

    public synchronized void f(Request request, c cVar) {
        if (i != null && j) {
            if (request.getMetrics() != null) {
                request.getMetrics().E0.f5962c.c();
            }
            try {
                g(request, cVar);
            } finally {
                if (request.getMetrics() != null) {
                    request.getMetrics().u0();
                }
            }
        }
    }
}
