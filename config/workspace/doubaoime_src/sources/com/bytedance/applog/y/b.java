package com.bytedance.applog.y;

import android.text.TextUtils;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class b {
    int a;
    int b;

    /* renamed from: c, reason: collision with root package name */
    int f3926c;

    /* renamed from: d, reason: collision with root package name */
    long f3927d;

    /* renamed from: e, reason: collision with root package name */
    Map<String, List<Set<String>>> f3928e;

    /* renamed from: f, reason: collision with root package name */
    Map<String, List<Map<String, Object>>> f3929f;

    /* renamed from: g, reason: collision with root package name */
    String f3930g;
    String h;
    String[] i = null;
    boolean j = false;
    com.bytedance.applog.E.a k;

    public void a(int i) {
        int i2 = com.bytedance.applog.A.a.f3729f;
        this.j = 404 == i;
    }

    public com.bytedance.applog.E.a b() {
        return this.k;
    }

    public long c() {
        return this.f3927d;
    }

    public int d() {
        return this.b;
    }

    public int e() {
        return this.a;
    }

    public String[] f(String[] strArr, String str) {
        String[] strArr2;
        if (TextUtils.isEmpty(this.f3930g) && TextUtils.isEmpty(this.h)) {
            return null;
        }
        if (this.i == null) {
            this.i = new String[strArr.length];
            for (int i = 0; i < strArr.length; i++) {
                int indexOf = strArr[i].indexOf(str);
                if (indexOf > 0) {
                    String substring = strArr[i].substring(0, indexOf);
                    String substring2 = strArr[i].substring(indexOf);
                    if (!TextUtils.isEmpty(this.f3930g) && this.f3930g.startsWith("https://") && !this.f3930g.endsWith("/")) {
                        substring = this.f3930g;
                    }
                    if (!TextUtils.isEmpty(this.h) && this.h.startsWith("/") && this.h.endsWith("/")) {
                        substring2 = this.h;
                    }
                    this.i[i] = e.a.a.a.a.s(substring, substring2);
                } else {
                    this.i[i] = strArr[i];
                }
            }
        }
        if (this.j || (strArr2 = this.i) == null || strArr2.length <= 0) {
            return null;
        }
        return strArr2;
    }

    public boolean g() {
        return this.a == -1;
    }
}
