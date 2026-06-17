package com.xiaomi.push;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class p {
    private static volatile p a;

    /* renamed from: a, reason: collision with other field name */
    private Context f927a;

    /* renamed from: a, reason: collision with other field name */
    private Handler f928a = new Handler(Looper.getMainLooper());

    /* renamed from: a, reason: collision with other field name */
    private Map<String, Map<String, String>> f929a = new HashMap();

    private p(Context context) {
        this.f927a = context;
    }

    private synchronized void b(String str, String str2, String str3) {
        if (this.f929a == null) {
            this.f929a = new HashMap();
        }
        Map<String, String> map = this.f929a.get(str);
        if (map == null) {
            map = new HashMap<>();
        }
        map.put(str2, str3);
        this.f929a.put(str, map);
    }

    public static p a(Context context) {
        if (a == null) {
            synchronized (p.class) {
                if (a == null) {
                    a = new p(context);
                }
            }
        }
        return a;
    }

    /* renamed from: a, reason: collision with other method in class */
    public synchronized void m666a(final String str, final String str2, final String str3) {
        b(str, str2, str3);
        this.f928a.post(new Runnable() { // from class: com.xiaomi.push.p.1
            @Override // java.lang.Runnable
            public void run() {
                SharedPreferences.Editor edit = p.this.f927a.getSharedPreferences(str, 4).edit();
                edit.putString(str2, str3);
                edit.commit();
            }
        });
    }

    private synchronized String a(String str, String str2) {
        if (this.f929a != null && !TextUtils.isEmpty(str)) {
            if (!TextUtils.isEmpty(str2)) {
                try {
                    Map<String, String> map = this.f929a.get(str);
                    if (map == null) {
                        return "";
                    }
                    return map.get(str2);
                } catch (Throwable unused) {
                    return "";
                }
            }
        }
        return "";
    }

    public synchronized String a(String str, String str2, String str3) {
        String a2 = a(str, str2);
        if (!TextUtils.isEmpty(a2)) {
            return a2;
        }
        return this.f927a.getSharedPreferences(str, 4).getString(str2, str3);
    }
}
