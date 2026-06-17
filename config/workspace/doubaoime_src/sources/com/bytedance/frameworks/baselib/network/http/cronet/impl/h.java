package com.bytedance.frameworks.baselib.network.http.cronet.impl;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import com.bytedance.retrofit2.client.Request;
import com.ss.android.socialbase.downloader.constants.DownloadErrorCode;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class h {

    /* renamed from: c, reason: collision with root package name */
    private static volatile h f5107c = null;

    /* renamed from: d, reason: collision with root package name */
    private static final String f5108d = "h";
    private volatile int a = 0;
    private List<a> b = new CopyOnWriteArrayList();

    static class a {
        final List<String> a;
        final List<String> b;

        /* renamed from: c, reason: collision with root package name */
        List<String> f5109c;

        /* renamed from: d, reason: collision with root package name */
        List<String> f5110d;

        /* renamed from: e, reason: collision with root package name */
        List<Pattern> f5111e;

        /* renamed from: f, reason: collision with root package name */
        Set<Integer> f5112f;
        boolean q = false;
        int r = 0;
        volatile long k = SystemClock.uptimeMillis();
        volatile int j = 0;
        int h = Integer.MAX_VALUE;

        /* renamed from: g, reason: collision with root package name */
        int f5113g = 0;
        volatile boolean l = false;
        String i = UUID.randomUUID().toString();
        boolean n = false;
        int m = DownloadErrorCode.ERROR_CRONET_HTTP_ERROR_END;
        boolean o = true;
        String p = null;

        public a(List<String> list, List<String> list2) {
            this.a = list;
            this.b = list2;
        }
    }

    private h() {
    }

    private a a(String str) {
        for (a aVar : this.b) {
            if (aVar.i.equals(str)) {
                return aVar;
            }
        }
        return null;
    }

    public static h d() {
        if (f5107c == null) {
            synchronized (h.class) {
                if (f5107c == null) {
                    f5107c = new h();
                }
            }
        }
        return f5107c;
    }

    private static boolean f(List<?> list) {
        return list == null || list.isEmpty();
    }

    private static boolean i(JSONObject jSONObject, String str, List<String> list) {
        JSONArray optJSONArray;
        if (jSONObject == null || TextUtils.isEmpty(str) || (optJSONArray = jSONObject.optJSONArray(str)) == null) {
            return false;
        }
        for (int i = 0; i < optJSONArray.length(); i++) {
            String optString = optJSONArray.optString(i);
            if (!TextUtils.isEmpty(optString)) {
                list.add(optString);
            }
        }
        return true;
    }

    private void j(JSONObject jSONObject) throws JSONException {
        ArrayList arrayList = new ArrayList();
        i(jSONObject, "host_group", arrayList);
        ArrayList arrayList2 = new ArrayList();
        i(jSONObject, "concurrent_hosts", arrayList2);
        if (arrayList.isEmpty() || arrayList2.size() < 2) {
            return;
        }
        a aVar = new a(arrayList, arrayList2);
        ArrayList arrayList3 = new ArrayList();
        if (i(jSONObject, "equal_group", arrayList3)) {
            aVar.f5109c = arrayList3;
        }
        ArrayList arrayList4 = new ArrayList();
        if (i(jSONObject, "prefix_group", arrayList4)) {
            aVar.f5110d = arrayList4;
        }
        ArrayList arrayList5 = new ArrayList();
        JSONArray optJSONArray = jSONObject.optJSONArray("pattern_group");
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                String optString = optJSONArray.optString(i);
                if (!TextUtils.isEmpty(optString)) {
                    try {
                        arrayList5.add(Pattern.compile(optString, 2));
                    } catch (Throwable unused) {
                    }
                }
            }
            aVar.f5111e = arrayList5;
        }
        aVar.h = jSONObject.optInt("fail_count", Integer.MAX_VALUE);
        aVar.f5113g = jSONObject.optInt("forbid_seconds", 0);
        aVar.m = jSONObject.optInt("connect_interval_millis", DownloadErrorCode.ERROR_CRONET_HTTP_ERROR_END);
        aVar.o = jSONObject.optInt("bypass_rs_enabled", 1) > 0;
        String optString2 = jSONObject.optString("concurrent_route");
        aVar.p = optString2;
        if (TextUtils.isEmpty(optString2)) {
            aVar.p = jSONObject.optString("rs_name", null);
        }
        aVar.q = jSONObject.optInt("fin_fix_enabled", 0) > 0;
        aVar.r = jSONObject.optInt("max_wait_seconds", 0);
        if (aVar.m <= 0) {
            return;
        }
        aVar.n = jSONObject.optInt("retry_for_not_2xx_code", 0) > 0;
        HashSet hashSet = new HashSet();
        JSONArray optJSONArray2 = jSONObject.optJSONArray("block_code_list");
        if (optJSONArray2 != null) {
            for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                hashSet.add(Integer.valueOf(optJSONArray2.optInt(i2)));
            }
            aVar.f5112f = hashSet;
        }
        this.b.add(aVar);
    }

    public a b(Request request) {
        boolean z;
        boolean z2;
        for (a aVar : this.b) {
            if (aVar.l) {
                long uptimeMillis = SystemClock.uptimeMillis() - aVar.k;
                if (uptimeMillis > aVar.f5113g * 1000) {
                    aVar.l = false;
                }
                if (Logger.debug()) {
                    String str = f5108d;
                    StringBuilder M = e.a.a.a.a.M("Rule id: ");
                    M.append(aVar.i);
                    M.append(" has forbidden duration: ");
                    M.append(uptimeMillis);
                    M.append(" fail count: ");
                    M.append(aVar.j);
                    M.append(" forbidden duration: ");
                    M.append(aVar.f5113g * 1000);
                    Logger.d(str, M.toString());
                }
            }
        }
        for (a aVar2 : this.b) {
            if (aVar2.f5113g <= 0 || !aVar2.l) {
                String url = request.getUrl();
                if (!TextUtils.isEmpty(url)) {
                    Iterator<String> it2 = aVar2.a.iterator();
                    while (true) {
                        z = true;
                        if (!it2.hasNext()) {
                            z2 = false;
                            break;
                        }
                        if (com.bytedance.frameworks.baselib.network.http.p.l.b(request.getHost(), it2.next())) {
                            z2 = true;
                            break;
                        }
                    }
                    if (z2) {
                        String path = request.getPath();
                        if (!TextUtils.isEmpty(path)) {
                            if (!f(aVar2.f5109c)) {
                                Iterator<String> it3 = aVar2.f5109c.iterator();
                                while (it3.hasNext()) {
                                    if (path.equals(it3.next())) {
                                        break;
                                    }
                                }
                            }
                            if (!f(aVar2.f5110d)) {
                                Iterator<String> it4 = aVar2.f5110d.iterator();
                                while (it4.hasNext()) {
                                    if (path.startsWith(it4.next())) {
                                        break;
                                    }
                                }
                            }
                            if (!f(aVar2.f5111e)) {
                                for (Pattern pattern : aVar2.f5111e) {
                                    if (pattern != null) {
                                        try {
                                            if (pattern.matcher(path).matches()) {
                                                break;
                                            }
                                        } catch (IllegalArgumentException unused) {
                                            continue;
                                        }
                                    }
                                }
                            }
                        }
                    } else if (Logger.debug()) {
                        e.a.a.a.a.s0("host not match: ", url, f5108d);
                    }
                }
            }
            z = false;
            if (z) {
                return aVar2;
            }
        }
        return null;
    }

    public boolean c(int i, String str) {
        a a2;
        Set<Integer> set;
        if (i == 0 || TextUtils.isEmpty(str) || (a2 = a(str)) == null || (set = a2.f5112f) == null) {
            return false;
        }
        return set.contains(Integer.valueOf(i));
    }

    public boolean e() {
        return this.a > 0;
    }

    public void g(String str, boolean z) {
        a a2;
        if (TextUtils.isEmpty(str) || (a2 = a(str)) == null) {
            return;
        }
        if (Logger.debug()) {
            String str2 = f5108d;
            StringBuilder M = e.a.a.a.a.M("Forbidden: ");
            M.append(a2.l);
            M.append(" failed count: ");
            M.append(a2.j);
            M.append(" max count: ");
            e.a.a.a.a.D0(M, a2.h, str2);
        }
        if (z) {
            if (a2.j != 0 || a2.l) {
                a2.j = 0;
                a2.l = false;
                return;
            }
            return;
        }
        int i = a2.j + 1;
        a2.j = i;
        if (i < a2.h) {
            return;
        }
        if (!a2.l) {
            a2.l = true;
            a2.k = SystemClock.uptimeMillis();
        }
        if (Logger.debug()) {
            String str3 = f5108d;
            StringBuilder M2 = e.a.a.a.a.M("Forbidden: ");
            M2.append(a2.l);
            M2.append(" failed count: ");
            e.a.a.a.a.D0(M2, a2.j, str3);
        }
    }

    public void h(String str) {
        if (Logger.debug()) {
            e.a.a.a.a.s0("onNetConfigChanged config: ", str, f5108d);
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.a = jSONObject.optInt("enabled_v2", 0);
            this.b.clear();
            JSONArray jSONArray = jSONObject.getJSONArray("match_rules");
            for (int i = 0; i < jSONArray.length(); i++) {
                j((JSONObject) jSONArray.get(i));
            }
        } catch (Throwable unused) {
            if (Logger.debug()) {
                Logger.d(f5108d, "parse json config error");
            }
        }
    }
}
