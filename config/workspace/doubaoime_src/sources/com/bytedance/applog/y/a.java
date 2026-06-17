package com.bytedance.applog.y;

import android.text.TextUtils;
import com.bytedance.applog.w.k;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class a {

    /* renamed from: d, reason: collision with root package name */
    private Map<Integer, b> f3922d;

    /* renamed from: f, reason: collision with root package name */
    Map<String, Integer> f3924f;

    /* renamed from: g, reason: collision with root package name */
    private JSONArray f3925g;
    int a = 0;
    int b = 5;

    /* renamed from: c, reason: collision with root package name */
    int f3921c = -1;

    /* renamed from: e, reason: collision with root package name */
    private final Set<String> f3923e = new HashSet();
    boolean h = false;

    a() {
    }

    public b a(int i) {
        Map<Integer, b> map = this.f3922d;
        if (map != null) {
            return map.get(Integer.valueOf(i));
        }
        return null;
    }

    public Map<Integer, b> b() {
        return this.f3922d;
    }

    public int c(String str, String str2) {
        boolean contains;
        Map<Integer, b> map;
        b value;
        List<Map<String, Object>> list;
        boolean z;
        List<Set<String>> list2;
        if (TextUtils.isEmpty(str)) {
            contains = false;
        } else {
            Map<String, Integer> map2 = this.f3924f;
            contains = (map2 == null || !map2.containsKey(str)) ? this.f3923e.contains(str) : true;
        }
        if (!contains) {
            return -1;
        }
        Map<String, Integer> map3 = this.f3924f;
        if (map3 != null && map3.containsKey(str)) {
            Integer num = this.f3924f.get(str);
            if (num != null) {
                return num.intValue();
            }
            return -1;
        }
        if (!TextUtils.isEmpty(str2) && (map = this.f3922d) != null && !map.isEmpty()) {
            try {
                JSONObject jSONObject = new JSONObject(str2);
                for (Map.Entry<Integer, b> entry : this.f3922d.entrySet()) {
                    int intValue = entry.getKey().intValue();
                    if (-1 != intValue && (value = entry.getValue()) != null) {
                        Map<String, List<Set<String>>> map4 = value.f3928e;
                        if (map4 != null && !map4.isEmpty() && value.f3928e.containsKey(str) && (list2 = value.f3928e.get(str)) != null && !list2.isEmpty()) {
                            for (Set<String> set : list2) {
                                if (set != null && !set.isEmpty() && com.bytedance.android.input.k.b.a.k0(jSONObject, set)) {
                                    return intValue;
                                }
                            }
                        }
                        Map<String, List<Map<String, Object>>> map5 = value.f3929f;
                        if (map5 != null && !map5.isEmpty() && value.f3929f.containsKey(str) && (list = value.f3929f.get(str)) != null && !list.isEmpty()) {
                            for (Map<String, Object> map6 : list) {
                                if (map6 != null && !map6.isEmpty() && com.bytedance.android.input.k.b.a.k0(jSONObject, map6.keySet())) {
                                    for (Map.Entry<String, Object> entry2 : map6.entrySet()) {
                                        String key = entry2.getKey();
                                        Object value2 = entry2.getValue();
                                        if (TextUtils.isEmpty(key) || value2 == null || !value2.equals(jSONObject.opt(key))) {
                                            z = false;
                                            break;
                                        }
                                    }
                                    z = true;
                                    if (z) {
                                        return intValue;
                                    }
                                }
                            }
                        }
                    }
                }
                return -1;
            } catch (JSONException e2) {
                k.z().i("Cannot parse event params", e2, new Object[0]);
            }
        }
        return -1;
    }

    public int d() {
        return this.a;
    }

    public boolean e(a aVar) {
        b bVar;
        if (aVar == null || aVar.b != this.b) {
            return true;
        }
        Map<Integer, b> map = this.f3922d;
        Map<Integer, b> map2 = aVar.f3922d;
        if (map == null || map2 == null || map.size() != map2.size()) {
            return true;
        }
        for (Map.Entry<Integer, b> entry : map.entrySet()) {
            Integer key = entry.getKey();
            b value = entry.getValue();
            if (key == null || value == null || !map2.containsKey(key) || (bVar = map2.get(key)) == null || value.f3927d != bVar.f3927d) {
                return true;
            }
        }
        return false;
    }

    public boolean f() {
        return this.h;
    }

    public boolean g() {
        Map<Integer, b> map;
        b bVar;
        return this.a >= 0 && this.b > 0 && (map = this.f3922d) != null && !map.isEmpty() && map.containsKey(-1) && (bVar = map.get(-1)) != null && bVar.f3926c > 0;
    }

    public void h(Map<Integer, b> map) {
        b value;
        this.f3922d = map;
        this.f3923e.clear();
        Map<Integer, b> map2 = this.f3922d;
        if (map2 == null) {
            return;
        }
        for (Map.Entry<Integer, b> entry : map2.entrySet()) {
            if (-1 != entry.getKey().intValue() && (value = entry.getValue()) != null) {
                Map<String, List<Set<String>>> map3 = value.f3928e;
                if (map3 != null && !map3.isEmpty()) {
                    this.f3923e.addAll(value.f3928e.keySet());
                }
                Map<String, List<Map<String, Object>>> map4 = value.f3929f;
                if (map4 != null && !map4.isEmpty()) {
                    this.f3923e.addAll(value.f3929f.keySet());
                }
            }
        }
    }

    public void i(JSONArray jSONArray) {
        this.f3925g = jSONArray;
    }
}
