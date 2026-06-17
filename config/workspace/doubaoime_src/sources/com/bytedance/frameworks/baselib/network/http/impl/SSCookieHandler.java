package com.bytedance.frameworks.baselib.network.http.impl;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import com.bytedance.frameworks.baselib.network.http.f;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.CookieManager;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class SSCookieHandler extends CookieManager {
    private final android.webkit.CookieManager a;
    private volatile c b;

    /* renamed from: c, reason: collision with root package name */
    private final Pattern f5125c = Pattern.compile("(?<=Domain=)([^;]*)", 2);

    /* renamed from: d, reason: collision with root package name */
    private final b f5126d;

    /* renamed from: e, reason: collision with root package name */
    private final ArrayList<String> f5127e;

    private enum ReqCookieSource {
        UNKNOWN,
        APP_COOKIE_STORE,
        SHARE_INTERCEPTOR_MAIN,
        SHARE_INTERCEPTOR_BACKUP,
        MAIN,
        BACKUP
    }

    class a implements Runnable {
        final /* synthetic */ Context a;

        a(Context context) {
            this.a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            SSCookieHandler.this.b = new c(this.a, d.a);
        }
    }

    public interface b {
        boolean a();

        void b(String str, String str2, JSONObject jSONObject);
    }

    public SSCookieHandler(Context context, int i, android.webkit.CookieManager cookieManager, ArrayList<String> arrayList, b bVar) {
        if (i > 0) {
            com.bytedance.common.utility.h.a.d().schedule(new a(context), i, TimeUnit.SECONDS);
        } else {
            this.b = new c(context, d.a);
        }
        this.a = cookieManager;
        this.f5127e = null;
        if (!bVar.a()) {
            this.f5126d = null;
            return;
        }
        this.f5126d = bVar;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("init", "success");
        } catch (JSONException unused) {
        }
        this.f5126d.b("TTNET-COOKIE", "init", jSONObject);
    }

    private void b(String str, boolean z) {
        if (z) {
            android.webkit.CookieManager.getInstance().flush();
            if (Logger.debug()) {
                e.a.a.a.a.s0("Force flush cookie: ", str, "SSCookieHandler");
                return;
            }
            return;
        }
        ArrayList<String> arrayList = this.f5127e;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        Iterator<String> it2 = this.f5127e.iterator();
        while (it2.hasNext()) {
            if (str.equals(it2.next())) {
                android.webkit.CookieManager.getInstance().flush();
                if (Logger.debug()) {
                    e.a.a.a.a.s0("Path match flush cookie: ", str, "SSCookieHandler");
                    return;
                }
                return;
            }
        }
    }

    private Map<String, List<String>> c(List<String> list, Map<String, List<String>> map) {
        Map<String, List<String>> emptyMap = Collections.emptyMap();
        if (map == null) {
            return Collections.singletonMap("Cookie", list);
        }
        List<String> e2 = e(map, "Cookie");
        return (e2 == null || e2.isEmpty()) ? Collections.singletonMap("Cookie", list) : emptyMap;
    }

    private static Map<String, List<String>> d(boolean z, Map<String, List<String>> map, ReqCookieSource reqCookieSource) {
        if (!z) {
            return map;
        }
        if (map == null) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put("x-tt-get-cookie-source", Collections.singletonList(String.valueOf(reqCookieSource.ordinal())));
        return linkedHashMap;
    }

    private List<String> e(Map<String, List<String>> map, String str) {
        if (map.isEmpty() || TextUtils.isEmpty(str)) {
            return null;
        }
        List<String> list = map.get(str);
        return (list == null || list.isEmpty()) ? map.get(str.toLowerCase()) : list;
    }

    private boolean f(URI uri, String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                String lowerCase = uri.getHost().toLowerCase();
                Matcher matcher = this.f5125c.matcher(str);
                String lowerCase2 = matcher.find() ? matcher.group().toLowerCase() : "";
                if (TextUtils.isEmpty(lowerCase2)) {
                    return false;
                }
                return lowerCase.endsWith(lowerCase2);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return false;
    }

    private static void h(JSONObject jSONObject, String str, String str2) {
        if (jSONObject == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        try {
            jSONObject.put(str, str2);
        } catch (JSONException unused) {
        }
    }

    private void i(String str, String str2, Set<String> set) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        set.add(str);
        this.a.setCookie(str, str2);
        try {
            int i = com.bytedance.frameworks.baselib.network.http.f.v;
        } catch (Throwable unused) {
        }
    }

    private void j(String str, List<String> list, Set<String> set) {
        if (TextUtils.isEmpty(str) || com.bytedance.android.input.k.b.a.Z(list)) {
            return;
        }
        set.add(str);
        boolean z = false;
        if (com.bytedance.frameworks.baselib.network.c.b.b()) {
            try {
                Method declaredMethod = this.a.getClass().getDeclaredMethod("setCookieList", String.class, List.class);
                declaredMethod.setAccessible(true);
                z = ((Boolean) declaredMethod.invoke(this.a, str, list)).booleanValue();
            } catch (Throwable th) {
                Logger.d("SSCookieHandler", "Batch save cookie failed:" + th);
            }
        }
        int i = com.bytedance.frameworks.baselib.network.http.f.v;
        if (z) {
            return;
        }
        for (String str2 : list) {
            if (!z) {
                this.a.setCookie(str, str2);
            }
        }
    }

    private void k(JSONObject jSONObject, String str, boolean z) {
        if (jSONObject == null || this.f5126d == null || !z) {
            return;
        }
        try {
            jSONObject.put("return", str);
        } catch (JSONException unused) {
        }
        this.f5126d.b("TTNET-COOKIE", "put", jSONObject);
    }

    private String l(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        try {
            Matcher matcher = this.f5125c.matcher(str2);
            String lowerCase = matcher.find() ? matcher.group().toLowerCase() : null;
            if (TextUtils.isEmpty(lowerCase)) {
                return str2;
            }
            boolean z = false;
            if (lowerCase.length() >= 2) {
                int i = 0;
                for (int i2 = 1; i2 < lowerCase.length() && (lowerCase.charAt(i2) != '.' || (i = i + 1) < 2); i2++) {
                }
                if (i >= 2) {
                    z = true;
                }
            }
            if (z) {
                return matcher.replaceFirst(str);
            }
            return null;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    private void m(String str, List<String> list, Set<String> set) {
        ArrayList arrayList = new ArrayList();
        Iterator<String> it2 = list.iterator();
        while (it2.hasNext()) {
            String l = l(str, it2.next());
            if (!TextUtils.isEmpty(l)) {
                arrayList.add(l);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        if (Logger.debug()) {
            e.a.a.a.a.s0("Sync cookies list for WebView request, original url: ", str, "SSCookieHandler");
        }
        j(str, arrayList, set);
    }

    public /* synthetic */ void g(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            try {
                this.b.a((URI) entry.getKey(), (List) entry.getValue());
            } catch (Throwable unused) {
            }
        }
    }

    @Override // java.net.CookieManager, java.net.CookieHandler
    public Map<String, List<String>> get(URI uri, Map<String, List<String>> map) throws IOException {
        if (uri == null) {
            return Collections.emptyMap();
        }
        String str = null;
        boolean z = false;
        try {
            str = uri.toString();
            if (map != null && !map.isEmpty()) {
                z = map.containsKey("x-tt-get-cookie-source");
                List<String> e2 = e(map, "X-SS-No-Cookie");
                if (e2 != null && !e2.isEmpty()) {
                    for (String str2 : e2) {
                        if (str2 != null && Boolean.parseBoolean(str2)) {
                            if (Logger.debug()) {
                                Logger.v("SSCookieHandler", "X-SS-No-Cookie " + str);
                            }
                            return Collections.emptyMap();
                        }
                    }
                }
            }
            int i = com.bytedance.frameworks.baselib.network.http.f.v;
        } catch (Throwable th) {
            th.printStackTrace();
        }
        if (this.a == null) {
            return Collections.emptyMap();
        }
        try {
            f.g h = com.bytedance.frameworks.baselib.network.http.f.h();
            if (h != null) {
                List<String> c2 = h.c(this.a, this.b, uri);
                if (!com.bytedance.android.input.k.b.a.g0(c2)) {
                    ReqCookieSource reqCookieSource = ReqCookieSource.SHARE_INTERCEPTOR_MAIN;
                    if (c2.remove("x-tt-cookie-backup-source=1")) {
                        reqCookieSource = ReqCookieSource.SHARE_INTERCEPTOR_BACKUP;
                    }
                    return d(z, c(c2, map), reqCookieSource);
                }
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
        try {
            String cookie = this.a.getCookie(str);
            if (!TextUtils.isEmpty(cookie)) {
                if (Logger.debug()) {
                    Logger.v("SSCookieHandler", "send cookie: " + str + " " + cookie);
                }
                return d(z, c(Collections.singletonList(cookie), map), ReqCookieSource.MAIN);
            }
        } catch (Exception e3) {
            e3.printStackTrace();
        }
        if (this.b == null) {
            return Collections.emptyMap();
        }
        try {
            Map<String, List<String>> map2 = this.b.get(uri, map == null ? new LinkedHashMap<>() : map);
            if (map2 != null && !map2.isEmpty()) {
                return d(z, c(map2.get("Cookie"), map), ReqCookieSource.BACKUP);
            }
        } catch (Throwable th3) {
            th3.printStackTrace();
        }
        return Collections.emptyMap();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:255|(2:372|(3:376|377|369))(1:259)|260|261|262|263|264|265|(10:268|(1:270)|(1:365)(3:274|(1:276)(1:364)|363)|278|(3:280|(2:284|(3:286|(1:288)(1:294)|289))|295)(4:296|297|298|(5:306|(6:309|310|311|(1:352)(5:313|314|315|316|(3:347|348|349)(8:318|319|(14:321|322|323|324|325|326|327|328|329|330|331|332|333|334)|346|345|342|333|334))|335|307)|355|356|(3:358|359|293)(4:360|291|292|293)))|290|291|292|293|266)|366|367|368|369) */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x046c, code lost:
    
        if (r12.toLowerCase().trim().contains(r5) != false) goto L244;
     */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.net.CookieManager, java.net.CookieHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void put(java.net.URI r34, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r35) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1713
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.baselib.network.http.impl.SSCookieHandler.put(java.net.URI, java.util.Map):void");
    }
}
