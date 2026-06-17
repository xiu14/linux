package com.huawei.hianalytics.process;

import android.content.Context;
import com.huawei.hianalytics.f.f.h;
import com.huawei.hianalytics.f.g.i;
import java.util.LinkedHashMap;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: c, reason: collision with root package name */
    private static b f7169c;
    private Context a;
    private final Object b = new Object();

    private b() {
    }

    public static b a() {
        if (f7169c == null) {
            synchronized (b.class) {
                if (f7169c == null) {
                    f7169c = new b();
                }
            }
        }
        return f7169c;
    }

    public final void a(Context context) {
        synchronized (this.b) {
            if (this.a != null) {
                return;
            }
            this.a = context;
            h.a().a(this.a);
            com.huawei.hianalytics.f.h.a.a.a(this.a);
        }
    }

    public final void a(String str) {
        com.huawei.hianalytics.f.h.a.a.b(str);
    }

    public final void a(String str, int i) {
        h.a().a(str, i);
    }

    public final void a(String str, int i, String str2, LinkedHashMap<String, String> linkedHashMap) {
        h.a().a(str, i, str2, linkedHashMap);
    }

    public final void a(String str, Context context) {
        h.a().a(str, context);
    }

    public final void a(String str, Context context, int i) {
        h.a().a(str, context, i.a(i), com.huawei.hianalytics.a.b.g());
    }

    public final void a(String str, Context context, String str2, String str3) {
        h.a().a(str, str2, str3);
    }

    public final void a(String str, Context context, LinkedHashMap<String, String> linkedHashMap) {
        h.a().a(str, context, linkedHashMap);
    }

    public final void a(String str, String str2) {
        h.a().b(str, str2);
    }

    public final void a(String str, String str2, LinkedHashMap<String, String> linkedHashMap) {
        h.a().a(str, str2, linkedHashMap);
    }

    public final void a(boolean z) {
        h.a().a(z);
    }

    public final void b() {
        h.a().c();
    }

    public final void b(String str, int i, String str2, LinkedHashMap<String, String> linkedHashMap) {
        h.a().b(str, i, str2, linkedHashMap);
    }

    public final void b(String str, Context context) {
        h.a().b(str, context);
    }

    public final void b(String str, Context context, LinkedHashMap<String, String> linkedHashMap) {
        h.a().b(str, context, linkedHashMap);
    }

    public final void b(String str, String str2) {
        h.a().c(str, str2);
    }

    public final void b(String str, String str2, LinkedHashMap<String, String> linkedHashMap) {
        h.a().b(str, str2, linkedHashMap);
    }
}
