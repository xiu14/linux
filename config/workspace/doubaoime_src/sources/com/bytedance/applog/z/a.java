package com.bytedance.applog.z;

import android.text.TextUtils;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class a {
    final int a;
    private final Set<String> b;

    /* renamed from: c, reason: collision with root package name */
    private final Map<String, List<Set<String>>> f3931c;

    /* renamed from: d, reason: collision with root package name */
    private final Map<String, List<Map<String, Object>>> f3932d;

    a(int i, Set<String> set, Map<String, List<Set<String>>> map, Map<String, List<Map<String, Object>>> map2) {
        this.a = i;
        this.b = set;
        this.f3931c = map;
        this.f3932d = map2;
    }

    private boolean c(String str, JSONObject jSONObject) {
        List<Map<String, Object>> list;
        boolean z;
        List<Set<String>> list2;
        Map<String, List<Set<String>>> map = this.f3931c;
        if (map != null && map.containsKey(str) && (list2 = this.f3931c.get(str)) != null && !list2.isEmpty()) {
            for (Set<String> set : list2) {
                if (set != null && !set.isEmpty() && e(jSONObject, set)) {
                    return true;
                }
            }
        }
        Map<String, List<Map<String, Object>>> map2 = this.f3932d;
        if (map2 != null && map2.containsKey(str) && (list = this.f3932d.get(str)) != null && !list.isEmpty()) {
            for (Map<String, Object> map3 : list) {
                if (map3 != null && !map3.isEmpty() && e(jSONObject, map3.keySet())) {
                    for (Map.Entry<String, Object> entry : map3.entrySet()) {
                        String key = entry.getKey();
                        Object value = entry.getValue();
                        if (TextUtils.isEmpty(key) || value == null || !value.equals(jSONObject.opt(key))) {
                            z = false;
                            break;
                        }
                    }
                    z = true;
                    if (z) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private boolean e(JSONObject jSONObject, Set<String> set) {
        Iterator<String> it2 = set.iterator();
        while (it2.hasNext()) {
            if (!jSONObject.has(it2.next())) {
                return false;
            }
        }
        return true;
    }

    final int a() {
        int i = this.a;
        if (i <= 0) {
            return -1;
        }
        return i >= 10000 ? 1 : 0;
    }

    final boolean b(String str, String str2) {
        Map<String, List<Map<String, Object>>> map;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Set<String> set = this.b;
        if (set != null && set.contains(str)) {
            return true;
        }
        if (TextUtils.isEmpty(str2)) {
            return false;
        }
        Map<String, List<Set<String>>> map2 = this.f3931c;
        if ((map2 != null && map2.containsKey(str)) || ((map = this.f3932d) != null && map.containsKey(str))) {
            try {
                return c(str, new JSONObject(str2));
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    abstract boolean d(b bVar);
}
