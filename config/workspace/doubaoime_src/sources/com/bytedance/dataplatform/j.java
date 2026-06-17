package com.bytedance.dataplatform;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.android.input.fragment.settings.MainFragment;
import com.bytedance.android.input.fragment.settings.Z;
import com.huawei.hms.framework.common.ContainerUtils;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.lang.reflect.Type;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
class j {
    private static Map<String, String> k = new ConcurrentHashMap();
    private final String a;
    private final Context b;

    /* renamed from: c, reason: collision with root package name */
    private JSONObject f4729c;

    /* renamed from: d, reason: collision with root package name */
    private Map<String, Integer> f4730d;

    /* renamed from: f, reason: collision with root package name */
    private q f4732f;

    /* renamed from: g, reason: collision with root package name */
    private com.bytedance.common.a.b f4733g;
    private o h;
    private Future i;

    /* renamed from: e, reason: collision with root package name */
    private final Map<String, Object> f4731e = new ConcurrentHashMap();
    private final Map<String, Runnable> j = new ConcurrentHashMap();

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            j.a(j.this);
        }
    }

    class b implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ boolean b;

        b(String str, boolean z) {
            this.a = str;
            this.b = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            j.this.h.d(this.a, this.b);
        }
    }

    class c implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ com.bytedance.dataplatform.u.a b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.bytedance.dataplatform.u.b f4735c;

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                o oVar = j.this.h;
                c cVar = c.this;
                oVar.e(cVar.a, cVar.b, cVar.f4735c.c());
            }
        }

        c(String str, com.bytedance.dataplatform.u.a aVar, com.bytedance.dataplatform.u.b bVar) {
            this.a = str;
            this.b = aVar;
            this.f4735c = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            s.a(new a());
        }
    }

    class d implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ com.bytedance.dataplatform.u.a b;

        d(String str, com.bytedance.dataplatform.u.a aVar) {
            this.a = str;
            this.b = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            j.this.h.e(this.a, this.b, null);
        }
    }

    j(Application application, String str, boolean z, q qVar, p pVar, com.bytedance.common.a.b bVar, Map<String, String> map, Set<String> set) {
        this.a = str;
        k = map;
        this.b = application;
        this.f4729c = com.bytedance.dataplatform.d.d(application, "SP_EXPERIMENT_CACHE", "SP_EXPERIMENT_CACHE");
        this.f4730d = com.bytedance.dataplatform.d.b(application, "CLIENT_EXPERIMENT_CACHE_TAG");
        o oVar = new o(application, pVar, set);
        this.h = oVar;
        h.f4728f.d(oVar);
        this.f4732f = qVar;
        this.f4733g = bVar;
        if (z) {
            this.i = s.a.scheduleWithFixedDelay(new i(this), 2000L, 3600000L, TimeUnit.MILLISECONDS);
        }
    }

    static void a(j jVar) {
        Objects.requireNonNull(jVar);
        try {
            StringBuilder sb = new StringBuilder(jVar.a);
            if (!k.isEmpty()) {
                if (jVar.a.indexOf(63) < 0) {
                    sb.append("?");
                } else {
                    sb.append(ContainerUtils.FIELD_DELIMITER);
                }
                boolean z = true;
                for (Map.Entry<String, String> entry : k.entrySet()) {
                    if (z) {
                        z = false;
                    } else {
                        sb.append(ContainerUtils.FIELD_DELIMITER);
                    }
                    sb.append(URLEncoder.encode(entry.getKey(), "UTF-8"));
                    sb.append(ContainerUtils.KEY_VALUE_DELIMITER);
                    sb.append(URLEncoder.encode(entry.getValue(), "UTF-8"));
                }
            }
            JSONObject jSONObject = new JSONObject(jVar.f4733g.a(sb.toString()));
            if (jSONObject.has("code") && jSONObject.has(RemoteMessageConst.DATA) && jSONObject.optInt("code", -1) == 0) {
                jVar.g(jSONObject.getJSONObject(RemoteMessageConst.DATA));
            }
        } catch (Exception unused) {
        }
    }

    private void g(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                JSONObject jSONObject3 = jSONObject.getJSONObject(next);
                jSONObject2.put(next, jSONObject3.get("val"));
                String string = jSONObject3.getString("vid");
                if (!TextUtils.isEmpty(string)) {
                    hashMap.put(next, string);
                    long j = jSONObject3.getLong("et");
                    if (j > 0) {
                        hashMap2.put(string, Long.valueOf(j));
                    }
                }
            } catch (JSONException unused) {
            }
        }
        this.f4731e.clear();
        this.f4729c = jSONObject2;
        s.a(new com.bytedance.dataplatform.b(this.b, "SP_EXPERIMENT_CACHE", "SP_EXPERIMENT_CACHE", jSONObject2));
        this.h.g(hashMap);
        Z i = m.i();
        if (i != null) {
            final MainFragment mainFragment = i.a;
            int i2 = MainFragment.f2403f;
            kotlin.s.c.l.f(mainFragment, "this$0");
            e.b.b.n.d.a(new Runnable() { // from class: com.bytedance.android.input.fragment.settings.d0
                @Override // java.lang.Runnable
                public final void run() {
                    MainFragment.z(MainFragment.this);
                }
            });
        }
    }

    public void c(String str) {
        Runnable runnable = this.j.get(str);
        if (runnable != null) {
            this.j.remove(str);
            runnable.run();
        }
    }

    <T> T d(String str, com.bytedance.dataplatform.u.a<T> aVar, boolean z) {
        int i;
        if (aVar == null || TextUtils.isEmpty(aVar.b()) || aVar.a() == null || aVar.a().length == 0) {
            return null;
        }
        String b2 = aVar.b();
        synchronized (this) {
            if (this.f4730d.containsKey(b2)) {
                i = this.f4730d.get(b2).intValue();
            } else {
                int nextInt = new Random().nextInt(1000);
                this.f4730d.put(b2, Integer.valueOf(nextInt));
                s.a(new com.bytedance.dataplatform.c(this.b, "CLIENT_EXPERIMENT_CACHE_TAG", b2, nextInt));
                com.bytedance.dataplatform.t.b.d(b2, Integer.valueOf(nextInt));
                i = nextInt;
            }
        }
        int e2 = (int) (aVar.e() * 1000.0d);
        if (i < e2) {
            return null;
        }
        for (com.bytedance.dataplatform.u.b<T> bVar : aVar.a()) {
            if (bVar != null) {
                e2 = (int) ((bVar.a() * 1000.0d) + e2);
                if (i < e2) {
                    c cVar = new c(str, aVar, bVar);
                    if (z) {
                        cVar.run();
                    } else {
                        this.j.put(str, cVar);
                    }
                    return bVar.b();
                }
            }
        }
        s.a(new d(str, aVar));
        return null;
    }

    <T> T e(String str, Type type, T t, boolean z, boolean z2) {
        T t2;
        Object obj = null;
        if (type == Boolean.class || type == Boolean.TYPE) {
            if (this.f4729c.has(str)) {
                t2 = (T) Boolean.valueOf(this.f4729c.optBoolean(str));
            }
            t2 = (T) obj;
        } else if (type == Integer.class || type == Short.class || type == Integer.TYPE || type == Short.TYPE) {
            if (this.f4729c.has(str)) {
                t2 = (T) Integer.valueOf(this.f4729c.optInt(str));
            }
            t2 = (T) obj;
        } else if (type == Float.class || type == Float.TYPE) {
            if (this.f4729c.has(str)) {
                t2 = (T) Float.valueOf((float) this.f4729c.optDouble(str));
            }
            t2 = (T) obj;
        } else if (type == Long.class || type == Long.TYPE) {
            if (this.f4729c.has(str)) {
                t2 = (T) Long.valueOf(this.f4729c.optLong(str));
            }
            t2 = (T) obj;
        } else if (type == Double.class || type == Double.TYPE) {
            if (this.f4729c.has(str)) {
                t2 = (T) Double.valueOf(this.f4729c.optDouble(str));
            }
            t2 = (T) obj;
        } else if (type == String.class) {
            t2 = (T) this.f4729c.optString(str, null);
        } else {
            try {
                if (this.f4731e.containsKey(str) && this.f4731e.get(str).getClass() == type) {
                    obj = this.f4731e.get(str);
                } else {
                    Object a2 = this.f4732f.a(this.f4729c.optString(str, ""), type);
                    if (a2 == null) {
                        this.f4731e.remove(str);
                    } else {
                        this.f4731e.put(str, a2);
                        obj = a2;
                    }
                }
            } catch (Exception unused) {
                this.f4731e.remove(str);
            }
            t2 = (T) obj;
        }
        b bVar = new b(str, z2);
        if (z) {
            bVar.run();
        } else {
            this.j.put(str, bVar);
        }
        return t2;
    }

    synchronized void f(Map<String, String> map) {
        Future future = this.i;
        if (future != null) {
            future.cancel(true);
        }
        if (map != null) {
            k.putAll(map);
        }
        this.i = s.a.scheduleWithFixedDelay(new a(), 0L, 3600000L, TimeUnit.MILLISECONDS);
    }
}
