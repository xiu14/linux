package com.huawei.hianalytics.d;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.huawei.hianalytics.log.e.e;
import com.huawei.hianalytics.util.d;

/* loaded from: classes2.dex */
public class a {
    private static a b;
    private Context a;

    /* renamed from: com.huawei.hianalytics.d.a$a, reason: collision with other inner class name */
    private static class C0345a extends com.huawei.hianalytics.d.b {
        String a;
        String b;

        public C0345a(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        @Override // com.huawei.hianalytics.d.b
        public String a() {
            return com.huawei.hianalytics.a.a.b(this.a, this.b);
        }

        @Override // com.huawei.hianalytics.d.b
        public String a(String str) {
            return d.a(str);
        }

        @Override // com.huawei.hianalytics.d.b
        public String b() {
            return com.huawei.hianalytics.a.a.a(this.a, this.b);
        }

        @Override // com.huawei.hianalytics.d.b
        public String c() {
            return com.huawei.hianalytics.a.a.d(this.a, this.b);
        }

        @Override // com.huawei.hianalytics.d.b
        public int d() {
            return (com.huawei.hianalytics.a.a.h(this.a, this.b) ? 4 : 0) | 0 | (com.huawei.hianalytics.a.a.g(this.a, this.b) ? 2 : 0) | (com.huawei.hianalytics.a.a.j(this.a, this.b) ? 1 : 0);
        }
    }

    private static class b extends com.huawei.hianalytics.d.b {
        private b() {
        }

        b(AnonymousClass1 anonymousClass1) {
        }

        @Override // com.huawei.hianalytics.d.b
        public String a() {
            return com.huawei.hianalytics.a.d.p();
        }

        @Override // com.huawei.hianalytics.d.b
        public String a(String str) {
            return str;
        }

        @Override // com.huawei.hianalytics.d.b
        public String b() {
            return com.huawei.hianalytics.a.d.o();
        }

        @Override // com.huawei.hianalytics.d.b
        public String c() {
            return com.huawei.hianalytics.a.d.q();
        }

        @Override // com.huawei.hianalytics.d.b
        public int d() {
            return (com.huawei.hianalytics.a.d.m() ? 4 : 0) | 0 | (com.huawei.hianalytics.a.d.l() ? 2 : 0) | (com.huawei.hianalytics.a.d.n() ? 1 : 0);
        }
    }

    public static a a() {
        a aVar;
        synchronized (a.class) {
            if (b == null) {
                b = new a();
            }
            aVar = b;
        }
        return aVar;
    }

    public com.huawei.hianalytics.c.a a(String str, String str2) {
        return new C0345a(str, str2).a(this.a);
    }

    public void a(Context context) {
        if (this.a == null) {
            this.a = context;
        }
    }

    public Pair<String, String> b(String str, String str2) {
        if (!com.huawei.hianalytics.a.a.f(str, str2)) {
            return new Pair<>("", "");
        }
        String o = com.huawei.hianalytics.e.a.a().f().o();
        String p = com.huawei.hianalytics.e.a.a().f().p();
        if (!TextUtils.isEmpty(o) && !TextUtils.isEmpty(p)) {
            return new Pair<>(o, p);
        }
        Pair<String, String> g2 = com.huawei.hianalytics.c.c.g(this.a);
        com.huawei.hianalytics.e.a.a().f().l((String) g2.first);
        com.huawei.hianalytics.e.a.a().f().m((String) g2.second);
        return g2;
    }

    public com.huawei.hianalytics.c.a b() {
        return new b(null).a(this.a);
    }

    public String c() {
        return b().b();
    }

    public String c(String str, String str2) {
        return c.b(str, str2);
    }

    public String d() {
        String i = com.huawei.hianalytics.a.b.i();
        if (!TextUtils.isEmpty(i)) {
            return i;
        }
        String c2 = e.c(this.a);
        com.huawei.hianalytics.a.b.b(c2);
        return c2;
    }

    public String d(String str, String str2) {
        return c.a(this.a, str, str2);
    }

    public String e() {
        String f2 = com.huawei.hianalytics.a.b.f();
        if (!TextUtils.isEmpty(f2)) {
            return f2;
        }
        String packageName = this.a.getPackageName();
        com.huawei.hianalytics.a.b.a(packageName);
        return packageName;
    }

    public String e(String str, String str2) {
        return c.b(this.a, str, str2);
    }

    public String f() {
        return com.huawei.hianalytics.a.b.g();
    }

    public String f(String str, String str2) {
        return c.a(str, str2);
    }

    public boolean g(String str, String str2) {
        return c.c(str, str2);
    }
}
