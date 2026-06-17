package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.xiaomi.push.ba;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.FutureTask;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class b {
    private static volatile b a;

    /* renamed from: a, reason: collision with other field name */
    private Context f45a;

    /* renamed from: a, reason: collision with other field name */
    private a f46a;

    /* renamed from: a, reason: collision with other field name */
    String f47a;

    /* renamed from: a, reason: collision with other field name */
    private Map<String, a> f48a;

    /* renamed from: a, reason: collision with other field name */
    private ConcurrentHashMap<String, CopyOnWriteArraySet<FutureTask>> f49a = new ConcurrentHashMap<>();

    private b(Context context) {
        this.f45a = context;
        c();
    }

    private void c() {
        this.f46a = new a(this.f45a);
        this.f48a = new HashMap();
        SharedPreferences a2 = a(this.f45a);
        this.f46a.f51a = a2.getString("appId", null);
        this.f46a.b = a2.getString("appToken", null);
        this.f46a.f8961c = a2.getString("regId", null);
        this.f46a.f8962d = a2.getString("regSec", null);
        this.f46a.f8963e = a2.getString("vName", null);
        this.f46a.f52a = a2.getBoolean("valid", true);
        this.f46a.f53b = a2.getBoolean("paused", false);
        this.f46a.a = a2.getInt("envType", 1);
        this.f46a.f8964f = a2.getString("regResource", null);
        this.f46a.f8965g = a2.getString("appRegion", null);
    }

    /* renamed from: b, reason: collision with other method in class */
    public boolean m48b() {
        if (this.f46a.m55a()) {
            return true;
        }
        com.xiaomi.channel.commonutils.logger.c.m15a("Don't send message before initialization succeeded!");
        return false;
    }

    public String d() {
        return this.f46a.f8962d;
    }

    public String e() {
        return this.f46a.f8964f;
    }

    public String f() {
        return this.f46a.f8965g;
    }

    /* renamed from: a, reason: collision with other method in class */
    public static b m41a(Context context) {
        if (a == null) {
            synchronized (b.class) {
                if (a == null) {
                    a = new b(context);
                }
            }
        }
        return a;
    }

    /* renamed from: d, reason: collision with other method in class */
    public boolean m51d() {
        return (TextUtils.isEmpty(this.f46a.f51a) || TextUtils.isEmpty(this.f46a.b) || TextUtils.isEmpty(this.f46a.f8961c) || TextUtils.isEmpty(this.f46a.f8962d)) ? false : true;
    }

    /* renamed from: e, reason: collision with other method in class */
    public boolean m52e() {
        return this.f46a.f53b;
    }

    /* renamed from: f, reason: collision with other method in class */
    public boolean m53f() {
        return !this.f46a.f52a;
    }

    public void b(String str, FutureTask futureTask) {
        if (!TextUtils.isEmpty(str) && futureTask != null) {
            synchronized (this.f49a) {
                CopyOnWriteArraySet<FutureTask> copyOnWriteArraySet = this.f49a.get(str);
                if (copyOnWriteArraySet != null) {
                    copyOnWriteArraySet.remove(futureTask);
                }
            }
            return;
        }
        com.xiaomi.channel.commonutils.logger.c.m15a("key or task is empty when removing pending task");
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m45a() {
        Context context = this.f45a;
        return !TextUtils.equals(com.xiaomi.push.h.m454a(context, context.getPackageName()), this.f46a.f8963e);
    }

    public static class a {

        /* renamed from: a, reason: collision with other field name */
        private Context f50a;

        /* renamed from: a, reason: collision with other field name */
        public String f51a;
        public String b;

        /* renamed from: c, reason: collision with root package name */
        public String f8961c;

        /* renamed from: d, reason: collision with root package name */
        public String f8962d;

        /* renamed from: e, reason: collision with root package name */
        public String f8963e;

        /* renamed from: f, reason: collision with root package name */
        public String f8964f;

        /* renamed from: g, reason: collision with root package name */
        public String f8965g;

        /* renamed from: a, reason: collision with other field name */
        public boolean f52a = true;

        /* renamed from: b, reason: collision with other field name */
        public boolean f53b = false;
        public int a = 1;

        public a(Context context) {
            this.f50a = context;
        }

        public void a(String str, String str2, String str3) {
            this.f51a = str;
            this.b = str2;
            this.f8964f = str3;
            SharedPreferences.Editor edit = b.a(this.f50a).edit();
            edit.putString("appId", this.f51a);
            edit.putString("appToken", str2);
            edit.putString("regResource", str3);
            edit.commit();
        }

        public void b(String str, String str2, String str3) {
            this.f8961c = str;
            this.f8962d = str2;
            this.f8963e = a();
            this.f52a = true;
            this.f8965g = str3;
            SharedPreferences.Editor edit = b.a(this.f50a).edit();
            edit.putString("regId", str);
            edit.putString("regSec", str2);
            edit.putString("vName", a());
            edit.putBoolean("valid", true);
            edit.putString("appRegion", str3);
            edit.commit();
            b.m41a(this.f50a).c("REGISTER");
        }

        public void c(String str, String str2, String str3) {
            this.f51a = str;
            this.b = str2;
            this.f8964f = str3;
        }

        public void a(String str, String str2) {
            this.f8961c = str;
            this.f8962d = str2;
            this.f8963e = a();
            this.f52a = true;
        }

        /* renamed from: a, reason: collision with other method in class */
        public boolean m56a(String str, String str2) {
            boolean equals = TextUtils.equals(this.f51a, str);
            boolean equals2 = TextUtils.equals(this.b, str2);
            boolean z = !TextUtils.isEmpty(this.f8961c);
            boolean z2 = !TextUtils.isEmpty(this.f8962d);
            boolean z3 = equals && equals2 && z && z2;
            if (!z3) {
                com.xiaomi.channel.commonutils.logger.c.e(String.format("register invalid, aid=%s;atn=%s;rid=%s;rse=%s", Boolean.valueOf(equals), Boolean.valueOf(equals2), Boolean.valueOf(z), Boolean.valueOf(z2)));
            }
            return z3;
        }

        public void b() {
            this.f52a = false;
            b.a(this.f50a).edit().putBoolean("valid", this.f52a).commit();
        }

        /* renamed from: a, reason: collision with other method in class */
        public boolean m55a() {
            return m56a(this.f51a, this.b);
        }

        private String a() {
            Context context = this.f50a;
            return com.xiaomi.push.h.m454a(context, context.getPackageName());
        }

        /* renamed from: a, reason: collision with other method in class */
        public void m54a() {
            b.a(this.f50a).edit().clear().commit();
            this.f51a = null;
            this.b = null;
            this.f8961c = null;
            this.f8962d = null;
            this.f8963e = null;
            this.f52a = false;
            this.f53b = false;
            this.f8965g = null;
            this.a = 1;
            b.m41a(this.f50a).c("UNREGISTER");
        }

        public void a(boolean z) {
            this.f53b = z;
        }

        public void a(int i) {
            this.a = i;
        }

        public static a a(Context context, String str) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                a aVar = new a(context);
                aVar.f51a = jSONObject.getString("appId");
                aVar.b = jSONObject.getString("appToken");
                aVar.f8961c = jSONObject.getString("regId");
                aVar.f8962d = jSONObject.getString("regSec");
                aVar.f8963e = jSONObject.getString("vName");
                aVar.f52a = jSONObject.getBoolean("valid");
                aVar.f53b = jSONObject.getBoolean("paused");
                aVar.a = jSONObject.getInt("envType");
                aVar.f8964f = jSONObject.getString("regResource");
                return aVar;
            } catch (Throwable th) {
                com.xiaomi.channel.commonutils.logger.c.m18a(th);
                return null;
            }
        }

        public static String a(a aVar) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("appId", aVar.f51a);
                jSONObject.put("appToken", aVar.b);
                jSONObject.put("regId", aVar.f8961c);
                jSONObject.put("regSec", aVar.f8962d);
                jSONObject.put("vName", aVar.f8963e);
                jSONObject.put("valid", aVar.f52a);
                jSONObject.put("paused", aVar.f53b);
                jSONObject.put("envType", aVar.a);
                jSONObject.put("regResource", aVar.f8964f);
                return jSONObject.toString();
            } catch (Throwable th) {
                com.xiaomi.channel.commonutils.logger.c.m18a(th);
                return null;
            }
        }
    }

    public String b() {
        return this.f46a.b;
    }

    /* renamed from: a, reason: collision with other method in class */
    public void m44a(String str) {
        SharedPreferences.Editor edit = a(this.f45a).edit();
        edit.putString("vName", str);
        edit.commit();
        this.f46a.f8963e = str;
    }

    public void b(String str, String str2, String str3) {
        this.f46a.b(str, str2, str3);
    }

    public void b(String str) {
        this.f48a.remove(str);
        a(this.f45a).edit().remove("hybrid_app_info_" + str).commit();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(String str) {
        if (TextUtils.isEmpty(str)) {
            com.xiaomi.channel.commonutils.logger.c.m15a("event is empty when triggering event");
            return;
        }
        try {
            CopyOnWriteArraySet<FutureTask> remove = this.f49a.remove(str);
            if (remove == null) {
                return;
            }
            Iterator<FutureTask> it2 = remove.iterator();
            while (it2.hasNext()) {
                ba.a("executeWaitingTask:" + System.nanoTime(), it2.next(), false);
            }
        } catch (Throwable th) {
            com.xiaomi.channel.commonutils.logger.c.d("error occurred when triggering register event . exception:" + th);
        }
    }

    /* renamed from: b, reason: collision with other method in class */
    public void m47b() {
        this.f46a.b();
    }

    public void a(String str, FutureTask futureTask) {
        if (!TextUtils.isEmpty(str) && futureTask != null) {
            synchronized (this.f49a) {
                CopyOnWriteArraySet<FutureTask> copyOnWriteArraySet = this.f49a.get(str);
                if (copyOnWriteArraySet == null) {
                    copyOnWriteArraySet = new CopyOnWriteArraySet<>();
                    this.f49a.put(str, copyOnWriteArraySet);
                }
                copyOnWriteArraySet.add(futureTask);
            }
            return;
        }
        com.xiaomi.channel.commonutils.logger.c.m15a("key or task is empty when adding pending task");
    }

    /* renamed from: c, reason: collision with other method in class */
    public String m49c() {
        return this.f46a.f8961c;
    }

    /* renamed from: c, reason: collision with other method in class */
    public boolean m50c() {
        return this.f46a.m55a();
    }

    /* renamed from: a, reason: collision with other method in class */
    public String m42a() {
        return this.f46a.f51a;
    }

    public boolean a(String str, String str2) {
        return this.f46a.m56a(str, str2);
    }

    public void a(String str, String str2, String str3) {
        this.f46a.a(str, str2, str3);
    }

    /* renamed from: a, reason: collision with other method in class */
    public void m43a() {
        this.f46a.m54a();
    }

    public a a(String str) {
        if (this.f48a.containsKey(str)) {
            return this.f48a.get(str);
        }
        String s = e.a.a.a.a.s("hybrid_app_info_", str);
        SharedPreferences a2 = a(this.f45a);
        if (!a2.contains(s)) {
            return null;
        }
        a a3 = a.a(this.f45a, a2.getString(s, ""));
        this.f48a.put(s, a3);
        return a3;
    }

    public void a(String str, a aVar) {
        this.f48a.put(str, aVar);
        String a2 = a.a(aVar);
        a(this.f45a).edit().putString(e.a.a.a.a.s("hybrid_app_info_", str), a2).commit();
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m46a(String str, String str2, String str3) {
        a a2 = a(str3);
        return a2 != null && TextUtils.equals(str, a2.f51a) && TextUtils.equals(str2, a2.b);
    }

    public static SharedPreferences a(Context context) {
        return context.getSharedPreferences("mipush", 0);
    }

    public int a() {
        return this.f46a.a;
    }

    public void a(boolean z) {
        this.f46a.a(z);
        a(this.f45a).edit().putBoolean("paused", z).commit();
    }

    public void a(int i) {
        this.f46a.a(i);
        a(this.f45a).edit().putInt("envType", i).commit();
    }
}
