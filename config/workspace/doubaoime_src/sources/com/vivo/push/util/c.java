package com.vivo.push.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Looper;
import android.text.TextUtils;
import java.util.HashMap;

/* loaded from: classes2.dex */
public class c {
    protected Context a;
    private String b;

    /* renamed from: c, reason: collision with root package name */
    private volatile SharedPreferences f8913c;

    /* renamed from: d, reason: collision with root package name */
    private HashMap<String, String> f8914d = new HashMap<>();

    /* renamed from: e, reason: collision with root package name */
    private HashMap<String, Long> f8915e = new HashMap<>();

    /* renamed from: f, reason: collision with root package name */
    private HashMap<String, Integer> f8916f = new HashMap<>();

    /* renamed from: g, reason: collision with root package name */
    private HashMap<String, Boolean> f8917g = new HashMap<>();

    public final void a(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            throw new RuntimeException("sharedFileName can't be null");
        }
        this.b = str;
        this.f8913c = context.getSharedPreferences(str, 0);
        this.a = context;
    }

    public final String b(String str, String str2) {
        String str3 = this.f8914d.get(str);
        if (str3 != null) {
            return str3;
        }
        c();
        if (this.f8913c != null) {
            str3 = this.f8913c.getString(str, str2);
            if (!TextUtils.isEmpty(str3) && !str3.equals(str2)) {
                this.f8914d.put(str, str3);
            }
        }
        return str3;
    }

    public final void c(String str) {
        this.f8915e.remove(str);
        this.f8916f.remove(str);
        this.f8917g.remove(str);
        this.f8914d.remove(str);
        c();
        if (this.f8913c != null) {
            SharedPreferences.Editor edit = this.f8913c.edit();
            if (this.f8913c.contains(str)) {
                edit.remove(str);
                a(edit);
            }
        }
    }

    public final SharedPreferences a() {
        c();
        return this.f8913c;
    }

    public final boolean b(String str) {
        Boolean bool = this.f8917g.get(str);
        if (bool != null) {
            return bool.booleanValue();
        }
        c();
        Boolean bool2 = Boolean.FALSE;
        if (this.f8913c != null) {
            Boolean valueOf = Boolean.valueOf(this.f8913c.getBoolean(str, false));
            if (valueOf != null && !valueOf.equals(bool2)) {
                this.f8917g.put(str, valueOf);
            }
            bool2 = valueOf;
        }
        return bool2.booleanValue();
    }

    public final void a(String str, String str2) {
        this.f8914d.put(str, str2);
        c();
        if (this.f8913c != null) {
            SharedPreferences.Editor edit = this.f8913c.edit();
            edit.putString(str, str2);
            a(edit);
        }
    }

    private synchronized void c() {
        if (this.f8913c == null) {
            Context context = this.a;
            if (context != null) {
                this.f8913c = context.getSharedPreferences(this.b, 0);
            } else {
                throw new RuntimeException("SharedPreferences is not init", new Throwable());
            }
        }
    }

    public final void a(String str, int i) {
        this.f8916f.put(str, Integer.valueOf(i));
        c();
        if (this.f8913c != null) {
            SharedPreferences.Editor edit = this.f8913c.edit();
            edit.putInt(str, i);
            a(edit);
        }
    }

    public final int b(String str, int i) {
        Integer num = this.f8916f.get(str);
        if (num != null) {
            return num.intValue();
        }
        c();
        if (this.f8913c != null) {
            num = Integer.valueOf(this.f8913c.getInt(str, i));
            if (!num.equals(Integer.valueOf(i))) {
                this.f8916f.put(str, num);
            }
        }
        return num.intValue();
    }

    public final void a(String str, long j) {
        this.f8915e.put(str, Long.valueOf(j));
        c();
        if (this.f8913c != null) {
            SharedPreferences.Editor edit = this.f8913c.edit();
            edit.putLong(str, j);
            a(edit);
        }
    }

    public final long b(String str, long j) {
        Long l = this.f8915e.get(str);
        if (l != null) {
            return l.longValue();
        }
        c();
        if (this.f8913c != null) {
            l = Long.valueOf(this.f8913c.getLong(str, j));
            if (!l.equals(Long.valueOf(j))) {
                this.f8915e.put(str, l);
            }
        }
        return l.longValue();
    }

    public final void a(String str) {
        this.f8917g.put(str, Boolean.TRUE);
        c();
        if (this.f8913c != null) {
            SharedPreferences.Editor edit = this.f8913c.edit();
            edit.putBoolean(str, true);
            a(edit);
        }
    }

    public static void a(SharedPreferences.Editor editor) {
        if (editor == null) {
            return;
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            editor.apply();
        } else {
            editor.commit();
        }
    }

    public final void b() {
        this.f8915e.clear();
        this.f8916f.clear();
        this.f8917g.clear();
        this.f8914d.clear();
        c();
        if (this.f8913c != null) {
            SharedPreferences.Editor edit = this.f8913c.edit();
            edit.clear();
            a(edit);
        }
    }
}
