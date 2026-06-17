package com.bytedance.frameworks.baselib.network.e;

import android.text.TextUtils;
import android.util.Pair;
import androidx.exifinterface.media.ExifInterface;
import com.bytedance.common.utility.Logger;
import com.bytedance.frameworks.baselib.network.http.p.k;
import com.bytedance.frameworks.baselib.network.http.p.l;
import com.bytedance.retrofit2.RetrofitMetrics;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.mime.i;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.vivo.push.PushClient;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class d {

    /* renamed from: f, reason: collision with root package name */
    private static volatile d f5066f;
    private volatile String a;
    private volatile boolean b = false;

    /* renamed from: c, reason: collision with root package name */
    private List<c> f5067c = new CopyOnWriteArrayList();

    /* renamed from: d, reason: collision with root package name */
    private List<String> f5068d = new CopyOnWriteArrayList();

    /* renamed from: e, reason: collision with root package name */
    private boolean f5069e = true;

    class a implements Comparator<c> {
        a(d dVar) {
        }

        @Override // java.util.Comparator
        public int compare(c cVar, c cVar2) {
            return cVar.c() - cVar2.c();
        }
    }

    private d() {
    }

    private static void a(List<com.bytedance.retrofit2.client.b> list, RetrofitMetrics.EncryptType encryptType) {
        int ordinal = encryptType.ordinal();
        if (ordinal == 1) {
            list.add(new com.bytedance.retrofit2.client.b("x-tt-cipher-version", "1.0.0"));
            list.add(new com.bytedance.retrofit2.client.b("x-tt-encrypt-info", "0"));
        } else if (ordinal == 2) {
            list.add(new com.bytedance.retrofit2.client.b("x-tt-cipher-version", "1.0.0"));
            list.add(new com.bytedance.retrofit2.client.b("x-tt-encrypt-info", PushClient.DEFAULT_REQUEST_ID));
        } else {
            if (ordinal != 3) {
                return;
            }
            list.add(new com.bytedance.retrofit2.client.b("x-tt-cipher-version", "1.0.0"));
            list.add(new com.bytedance.retrofit2.client.b("x-tt-encrypt-info", ExifInterface.GPS_MEASUREMENT_2D));
        }
    }

    private boolean b(Request request, Map<String, List<String>> map) {
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        request.setQueryFilterPriority(0);
        Iterator<c> it2 = this.f5067c.iterator();
        while (it2.hasNext()) {
            if (it2.next().i(request, map, arrayList)) {
                z = true;
            }
        }
        if (Logger.debug()) {
            Logger.d("QueryFilterEngine", "dispatchQueryMap hit: " + z);
        }
        if (request.getMetrics() != null) {
            RetrofitMetrics metrics = request.getMetrics();
            JSONArray jSONArray = new JSONArray();
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                com.bytedance.frameworks.baselib.network.e.a aVar = (com.bytedance.frameworks.baselib.network.e.a) it3.next();
                try {
                    long b = aVar.b();
                    if (!this.f5069e || aVar.c() || b > 0) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("hit", aVar.c());
                        jSONObject.put(RemoteMessageConst.Notification.PRIORITY, aVar.a());
                        if (b > 0) {
                            jSONObject.put("consume", b);
                        }
                        jSONArray.put(jSONObject);
                    }
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
            }
            if (Logger.debug()) {
                StringBuilder M = e.a.a.a.a.M("action info: ");
                M.append(jSONArray.toString());
                Logger.d("QueryFilterEngine", M.toString());
            }
            metrics.g0 = jSONArray;
        }
        return z;
    }

    public static d e() {
        if (f5066f == null) {
            synchronized (d.class) {
                if (f5066f == null) {
                    f5066f = new d();
                }
            }
        }
        return f5066f;
    }

    static void g(JSONArray jSONArray, List<String> list) {
        if (jSONArray == null || list == null) {
            return;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                String string = jSONArray.getString(i);
                if (!TextUtils.isEmpty(string)) {
                    list.add(string);
                }
            } catch (JSONException unused) {
                return;
            }
        }
    }

    private synchronized void h(String str) throws JSONException {
        if (!TextUtils.isEmpty(this.a) && this.a.equals(str)) {
            if (Logger.debug()) {
                Logger.d("QueryFilterEngine", "Config is same with local config, do not parse.");
            }
            return;
        }
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = new JSONArray(str);
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            String string = jSONObject.getString("action");
            int i2 = jSONObject.getInt("act_priority");
            if (i2 >= 0) {
                JSONObject jSONObject2 = jSONObject.getJSONObject(RemoteMessageConst.MessageBody.PARAM);
                int optInt = jSONObject.optInt("set_req_priority", i2);
                if (optInt == -1) {
                    optInt = Integer.MAX_VALUE;
                }
                c a2 = c.a(string, i2, optInt, jSONObject2);
                if (a2 != null) {
                    arrayList.add(a2);
                }
            }
        }
        Collections.sort(arrayList, new a(this));
        this.f5067c.clear();
        this.f5067c.addAll(arrayList);
        this.a = str;
    }

    private static void j(Request.a aVar, Request request, String str) {
        boolean z;
        if (request.getBody() instanceof com.bytedance.retrofit2.mime.a) {
            z = ((com.bytedance.retrofit2.mime.a) request.getBody()).j();
            if (z) {
                Logger.i("QueryFilterEngine", "Request body has been encrypted before.");
            }
        } else {
            z = false;
        }
        if (request.isQueryEncryptEnabled() || request.isBodyEncryptEnabled() || z) {
            ArrayList arrayList = new ArrayList();
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(new com.bytedance.retrofit2.client.b("x-tt-encrypt-queries", str));
            }
            if (request.getHeaders() != null) {
                arrayList.addAll(request.getHeaders());
            }
            RetrofitMetrics metrics = request.getMetrics();
            if (!z && request.isBodyEncryptEnabled()) {
                i body = request.getBody();
                if (body instanceof com.bytedance.retrofit2.mime.a) {
                    com.bytedance.retrofit2.mime.a aVar2 = (com.bytedance.retrofit2.mime.a) body;
                    if (metrics != null) {
                        metrics.F0.b.c();
                    }
                    try {
                        z = aVar2.i();
                    } finally {
                        if (metrics != null) {
                            metrics.j();
                        }
                    }
                }
            }
            RetrofitMetrics.EncryptType encryptType = RetrofitMetrics.EncryptType.ENCRYPT_NONE;
            if (z && request.isQueryEncryptEnabled()) {
                encryptType = RetrofitMetrics.EncryptType.ENCRYPT_BOTH_QUERY_AND_BODY;
                a(arrayList, encryptType);
            } else if (z) {
                encryptType = RetrofitMetrics.EncryptType.ENCRYPT_BODY;
                a(arrayList, encryptType);
            } else if (request.isQueryEncryptEnabled()) {
                encryptType = RetrofitMetrics.EncryptType.ENCRYPT_QUERY;
                a(arrayList, encryptType);
            }
            if (metrics != null) {
                metrics.Z(encryptType);
            }
            aVar.b(arrayList);
        }
    }

    public void c(boolean z) {
        this.b = z;
    }

    public Request d(Request request) {
        String str;
        List list;
        List list2;
        if (!this.b) {
            if (Logger.debug()) {
                Logger.d("QueryFilterEngine", "Query filter engine is not enabled");
            }
            return null;
        }
        if (request.isPureRequest()) {
            return null;
        }
        String url = request.getUrl();
        if (TextUtils.isEmpty(url)) {
            return null;
        }
        if (request.getMetrics() != null) {
            request.getMetrics().F0.f5887c.c();
        }
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Pair<String, String> d2 = l.d(url, linkedHashMap);
            if (!b(request, linkedHashMap)) {
                return null;
            }
            if (!request.isQueryEncryptEnabled() || !linkedHashMap.containsKey("x-tt-encrypt-queries") || (list2 = (List) linkedHashMap.get("x-tt-encrypt-queries")) == null || list2.size() <= 0) {
                str = null;
            } else {
                str = (String) list2.get(0);
                linkedHashMap.remove("x-tt-encrypt-queries");
            }
            k kVar = new k(((String) d2.first) + ((String) d2.second));
            if (!linkedHashMap.isEmpty()) {
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    if (entry != null && entry.getKey() != null && (list = (List) entry.getValue()) != null && !list.isEmpty()) {
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            kVar.b((String) entry.getKey(), (String) it2.next());
                        }
                    }
                }
            }
            Request.a newBuilder = request.newBuilder();
            j(newBuilder, request, str);
            newBuilder.g(kVar.c());
            Request a2 = newBuilder.a();
            if (request.getMetrics() != null) {
                request.getMetrics().P();
            }
            return a2;
        } catch (Throwable th) {
            try {
                th.printStackTrace();
                if (request.getMetrics() != null) {
                    request.getMetrics().P();
                }
                return null;
            } finally {
                if (request.getMetrics() != null) {
                    request.getMetrics().P();
                }
            }
        }
    }

    public void f(String str) {
        if (Logger.debug()) {
            StringBuilder U = e.a.a.a.a.U("onNetConfigChanged config: ", str, " enabled: ");
            U.append(this.b);
            Logger.d("QueryFilterEngine", U.toString());
        }
        if (!this.b || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            h(str);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void i(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f5068d.clear();
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i = 0; i < jSONArray.length(); i++) {
                this.f5068d.add(jSONArray.getString(i));
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }
}
