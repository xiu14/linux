package com.bytedance.applog.o;

import android.content.SharedPreferences;
import com.bytedance.applog.util.k;
import com.bytedance.bdinstall.A;
import com.bytedance.bdinstall.C0632l;
import com.bytedance.bdinstall.InterfaceC0645z;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.json.JSONObject;

/* loaded from: classes.dex */
final class c implements A {

    /* renamed from: e, reason: collision with root package name */
    private static final List<String> f3860e = Collections.singletonList("CustomHeaderAdapter");
    private final com.bytedance.applog.c a;
    private volatile SharedPreferences b;

    /* renamed from: c, reason: collision with root package name */
    private volatile JSONObject f3861c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC0645z f3862d;

    c(com.bytedance.applog.c cVar, InterfaceC0645z interfaceC0645z) {
        this.a = cVar;
        this.f3862d = interfaceC0645z;
    }

    private JSONObject c() {
        if (this.f3861c == null) {
            try {
                SharedPreferences d2 = d();
                if (d2 != null) {
                    String string = d2.getString("header_custom_info", null);
                    if (k.g(string)) {
                        this.f3861c = new JSONObject(string);
                    } else {
                        this.f3861c = new JSONObject();
                    }
                }
            } catch (Throwable th) {
                this.a.I().t(f3860e, "getCustomInfo failed", th, new Object[0]);
            }
        }
        return this.f3861c;
    }

    private SharedPreferences d() {
        if (this.b == null && this.a.o() != null) {
            this.b = this.a.o().getSharedPreferences(com.bytedance.applog.b.b(this.a, "header_custom"), 0);
        }
        return this.b;
    }

    @Override // com.bytedance.bdinstall.A
    public Map<String, Object> a() {
        JSONObject c2 = c();
        if (c2 == null) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap();
        Iterator<String> keys = c2.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            if (next != null) {
                hashMap.put(next, c2.opt(next));
            }
        }
        return hashMap;
    }

    public void b(Map<String, Object> map) {
        if (map == null || map.isEmpty()) {
            return;
        }
        try {
            JSONObject c2 = c();
            boolean z = true;
            if (c2 != null) {
                Iterator<Map.Entry<String, Object>> it2 = map.entrySet().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        z = false;
                        break;
                    }
                    if (!k.f(it2.next().getKey()) && (!Objects.equals(c2.opt(r4.getKey()), r4.getValue()))) {
                        break;
                    }
                }
            }
            if (!z) {
                this.a.I().n(f3860e, "appendHeaderInfo no value changed", new Object[0]);
                return;
            }
            JSONObject jSONObject = new JSONObject();
            if (c2 != null) {
                k.b(jSONObject, c2);
            }
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                if (k.g(entry.getKey())) {
                    jSONObject.put(entry.getKey(), entry.getValue());
                }
            }
            this.f3861c = jSONObject;
            SharedPreferences d2 = d();
            if (d2 != null) {
                d2.edit().putString("header_custom_info", jSONObject.toString()).apply();
            }
            ((C0632l) this.f3862d).r(this.a.o(), jSONObject);
        } catch (Throwable th) {
            this.a.I().t(f3860e, "appendHeaderInfo failed", th, new Object[0]);
        }
    }
}
