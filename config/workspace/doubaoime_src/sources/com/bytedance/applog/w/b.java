package com.bytedance.applog.w;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public abstract class b implements e {

    /* renamed from: c, reason: collision with root package name */
    private static final Map<String, e> f3901c = new ConcurrentHashMap();
    private String a;
    private final List<String> b;

    public b() {
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        StringBuilder M = e.a.a.a.a.M("logger@");
        M.append(hashCode());
        arrayList.add(M.toString());
    }

    public static e w(String str) {
        return f3901c.get(str);
    }

    @Override // com.bytedance.applog.w.e
    public void d(String str) {
        this.a = str;
        f3901c.put(str, this);
        ((k) this).j(0, null, "Current logger bind to appId {}", str);
    }

    protected String v(String str, Object... objArr) {
        try {
            StringBuilder sb = new StringBuilder();
            if (objArr != null && objArr.length != 0 && str.contains("{}")) {
                int length = str.length();
                int i = 0;
                int i2 = 0;
                while (i < length) {
                    char charAt = str.charAt(i);
                    char charAt2 = i < length + (-1) ? str.charAt(i + 1) : ' ';
                    if (charAt == '{' && charAt2 == '}') {
                        if (i2 < objArr.length) {
                            int i3 = i2 + 1;
                            Object obj = objArr[i2];
                            sb.append(obj != null ? obj.toString() : "");
                            i2 = i3;
                        }
                        i++;
                    } else {
                        sb.append(charAt);
                    }
                    i++;
                }
                return sb.toString();
            }
            sb.append(str);
            return sb.toString();
        } catch (Throwable unused) {
            return str;
        }
    }

    protected List<String> x(List<String> list) {
        if (list == null || list.size() <= 0) {
            return this.b;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.b);
        arrayList.addAll(list);
        return arrayList;
    }

    protected void y(int i, int i2, List<String> list, Throwable th, String str, Object... objArr) {
        if (i.d()) {
            return;
        }
        int i3 = g.j;
        h hVar = new h();
        hVar.a(this.a);
        hVar.c(i);
        hVar.d(i2);
        hVar.g(Thread.currentThread().getName());
        hVar.h(th);
        hVar.f(x(list));
        hVar.e(v(str, objArr));
        g b = hVar.b();
        i.a(b);
        f b2 = i.b(this.a);
        if (b2 != null) {
            b2.a(b);
        }
    }
}
