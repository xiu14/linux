package com.bytedance.news.common.settings.e.j;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.bytedance.news.common.settings.internal.b;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class a {

    /* renamed from: f, reason: collision with root package name */
    private static volatile a f5509f = null;

    /* renamed from: g, reason: collision with root package name */
    private static volatile boolean f5510g = false;
    private static volatile boolean h = false;
    private static volatile long i = -1;
    private static volatile long j = -1;
    private static ConcurrentHashMap k = new ConcurrentHashMap();
    private static ConcurrentHashMap l = new ConcurrentHashMap();
    private static b m;
    public static volatile com.bytedance.news.common.settings.e.a n;
    private JSONObject a;
    private SharedPreferences b;

    /* renamed from: c, reason: collision with root package name */
    private SharedPreferences f5511c;

    /* renamed from: d, reason: collision with root package name */
    private SharedPreferences f5512d;

    /* renamed from: e, reason: collision with root package name */
    private SharedPreferences.Editor f5513e;

    private a(Context context) {
        this.b = context.getSharedPreferences("__ab_vid_info.sp", 0);
        this.f5512d = context.getSharedPreferences("__ab_exposed_info.sp", 0);
        SharedPreferences sharedPreferences = context.getSharedPreferences("__ab_local_exposed_info.sp", 0);
        this.f5511c = sharedPreferences;
        sharedPreferences.edit();
        this.f5513e = this.f5512d.edit();
        String string = this.b.getString("key_vid_info", "");
        if (TextUtils.isEmpty(string)) {
            return;
        }
        try {
            this.a = new JSONObject(string);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    public static a a(Context context) {
        if (f5509f == null) {
            synchronized (a.class) {
                if (f5509f == null) {
                    f5509f = new a(context);
                }
            }
        }
        return f5509f;
    }

    public static long b() {
        if (i < 0) {
            i = System.currentTimeMillis();
        }
        j = System.currentTimeMillis() - i;
        return j;
    }

    public static boolean c() {
        return f5510g;
    }

    public static boolean e(String str) {
        if (!h || k.containsKey(str)) {
            return false;
        }
        k.put(str, "");
        return true;
    }

    public static void f(b bVar) {
        m = bVar;
    }

    public static void g(long j2) {
        i = j2;
    }

    public static void h(boolean z) {
        h = z;
    }

    public static void i(boolean z) {
        f5510g = z;
    }

    public void d(String str) {
        b bVar;
        l.put(str, Long.valueOf(System.currentTimeMillis()));
        if (n != null && n.a().booleanValue() && (bVar = m) != null) {
            ((com.bytedance.news.common.settings.a) bVar).k();
        }
        if (this.a != null) {
            synchronized (this) {
                JSONObject jSONObject = this.a;
                if (jSONObject != null) {
                    long optLong = jSONObject.optLong(str);
                    if (optLong > 0) {
                        if (this.f5512d.contains(str)) {
                            try {
                                if (optLong != Long.parseLong(this.f5512d.getString(str, "0"))) {
                                    this.f5513e.putString(str, String.valueOf(optLong)).apply();
                                }
                            } catch (Exception e2) {
                                e2.printStackTrace();
                            }
                        } else {
                            this.f5513e.putString(str, String.valueOf(optLong)).apply();
                        }
                    }
                }
            }
        }
    }

    public synchronized void j(@NonNull JSONObject jSONObject) {
        this.a = jSONObject;
        this.b.edit().putString("key_vid_info", jSONObject.toString()).apply();
        for (String str : this.f5512d.getAll().keySet()) {
            if (this.a.has(str)) {
                try {
                    if (this.a.optLong(str) != Long.parseLong(this.f5512d.getString(str, "0"))) {
                        this.f5513e.remove(str);
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            } else {
                this.f5513e.remove(str);
            }
        }
        this.f5513e.apply();
    }
}
