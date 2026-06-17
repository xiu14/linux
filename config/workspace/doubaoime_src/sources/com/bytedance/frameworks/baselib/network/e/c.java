package com.bytedance.frameworks.baselib.network.e;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import com.bytedance.frameworks.baselib.network.http.p.l;
import com.bytedance.retrofit2.client.Request;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class c {
    private static final String h = "c";
    private int a;
    private int b;

    /* renamed from: c, reason: collision with root package name */
    protected boolean f5061c = false;

    /* renamed from: d, reason: collision with root package name */
    private Set<String> f5062d = new HashSet();

    /* renamed from: e, reason: collision with root package name */
    private Set<String> f5063e = new HashSet();

    /* renamed from: f, reason: collision with root package name */
    private Set<String> f5064f = new HashSet();

    /* renamed from: g, reason: collision with root package name */
    private Set<Pattern> f5065g = new HashSet();

    public c(int i) {
        this.a = i;
        this.b = i;
    }

    protected static c a(String str, int i, int i2, JSONObject jSONObject) {
        c bVar;
        if (str.equals("rm")) {
            bVar = new f(i);
        } else {
            if (!str.equals("encrypt")) {
                return null;
            }
            bVar = new b(i);
        }
        bVar.f(jSONObject);
        bVar.b = i2;
        return bVar;
    }

    private static boolean d(Set<?> set) {
        return set == null || set.isEmpty();
    }

    private void h(JSONArray jSONArray, Set<String> set) {
        if (jSONArray == null || set == null) {
            return;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                String string = jSONArray.getString(i);
                if (!TextUtils.isEmpty(string)) {
                    set.add(string);
                }
            } catch (JSONException unused) {
                return;
            }
        }
    }

    protected abstract boolean b(Request request, Map<String, List<String>> map);

    public int c() {
        return this.a;
    }

    protected boolean e(Request request) {
        boolean z;
        if (this.f5061c && !e.f().f5071c.get()) {
            return false;
        }
        if (!d(this.f5062d)) {
            String host = request.getHost();
            if (!TextUtils.isEmpty(host)) {
                Iterator<String> it2 = this.f5062d.iterator();
                while (it2.hasNext()) {
                    if (l.b(host, it2.next())) {
                        z = true;
                        break;
                    }
                }
            }
            z = false;
            if (!z) {
                return false;
            }
        }
        String path = request.getPath();
        if (TextUtils.isEmpty(path)) {
            if (Logger.debug()) {
                e.a.a.a.a.s0("Path is empty: ", path, h);
            }
            return false;
        }
        int length = path.length();
        if (length > 1) {
            int i = length - 1;
            if (path.substring(i).equals("/")) {
                path = path.substring(0, i);
            }
        }
        if (!d(this.f5063e) && this.f5063e.contains(path)) {
            return true;
        }
        if (!d(this.f5064f)) {
            Iterator<String> it3 = this.f5064f.iterator();
            while (it3.hasNext()) {
                if (path.startsWith(it3.next())) {
                    return true;
                }
            }
        }
        if (!d(this.f5065g)) {
            for (Pattern pattern : this.f5065g) {
                if (pattern != null) {
                    try {
                        if (pattern.matcher(path).matches()) {
                            return true;
                        }
                    } catch (IllegalArgumentException unused) {
                        continue;
                    }
                }
            }
        }
        return false;
    }

    protected abstract void f(JSONObject jSONObject);

    protected void g(JSONObject jSONObject) {
        h(jSONObject.optJSONArray("host_group"), this.f5062d);
        h(jSONObject.optJSONArray("equal_group"), this.f5063e);
        h(jSONObject.optJSONArray("prefix_group"), this.f5064f);
        JSONArray optJSONArray = jSONObject.optJSONArray("pattern_group");
        Set<Pattern> set = this.f5065g;
        if (optJSONArray == null || set == null) {
            return;
        }
        for (int i = 0; i < optJSONArray.length(); i++) {
            try {
                String string = optJSONArray.getString(i);
                if (!TextUtils.isEmpty(string)) {
                    try {
                        set.add(Pattern.compile(string, 2));
                    } catch (Throwable unused) {
                    }
                }
            } catch (JSONException unused2) {
                return;
            }
        }
    }

    protected boolean i(Request request, Map<String, List<String>> map, List<a> list) {
        a aVar = new a();
        aVar.g(SystemClock.uptimeMillis());
        boolean b = request.getQueryFilterPriority() <= this.a ? b(request, map) : false;
        if (b) {
            request.setQueryFilterPriority(this.b);
        }
        aVar.e(b);
        aVar.f(this.a);
        aVar.d(SystemClock.uptimeMillis());
        list.add(aVar);
        return b;
    }
}
