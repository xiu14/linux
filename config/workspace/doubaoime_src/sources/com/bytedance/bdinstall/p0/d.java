package com.bytedance.bdinstall.p0;

import android.text.TextUtils;
import com.bytedance.bdinstall.e0;
import java.util.List;

/* loaded from: classes.dex */
public abstract class d implements h {
    private d a;

    class a implements g<String> {
        a() {
        }

        @Override // com.bytedance.bdinstall.p0.d.g
        public boolean a(String str, String str2) {
            return e0.e(str, str2);
        }

        @Override // com.bytedance.bdinstall.p0.d.g
        public boolean b(String str) {
            return e0.g(str);
        }

        @Override // com.bytedance.bdinstall.p0.d.g
        public String c(String str, String str2, d dVar) {
            return dVar.j(str, str2);
        }

        @Override // com.bytedance.bdinstall.p0.d.g
        public void d(String str) {
            d.this.a("openudid", str);
        }

        @Override // com.bytedance.bdinstall.p0.d.g
        public String e() {
            return d.this.b("openudid");
        }
    }

    class b implements g<String> {
        b() {
        }

        @Override // com.bytedance.bdinstall.p0.d.g
        public boolean a(String str, String str2) {
            return e0.e(str, str2);
        }

        @Override // com.bytedance.bdinstall.p0.d.g
        public boolean b(String str) {
            return e0.g(str);
        }

        @Override // com.bytedance.bdinstall.p0.d.g
        public String c(String str, String str2, d dVar) {
            return dVar.i(str, str2);
        }

        @Override // com.bytedance.bdinstall.p0.d.g
        public void d(String str) {
            d.this.a("clientudid", str);
        }

        @Override // com.bytedance.bdinstall.p0.d.g
        public String e() {
            return d.this.b("clientudid");
        }
    }

    class c implements g<String> {
        c() {
        }

        @Override // com.bytedance.bdinstall.p0.d.g
        public boolean a(String str, String str2) {
            return e0.e(str, str2);
        }

        @Override // com.bytedance.bdinstall.p0.d.g
        public boolean b(String str) {
            String str2 = str;
            return (TextUtils.isEmpty(str2) || TextUtils.equals(str2, "unknown")) ? false : true;
        }

        @Override // com.bytedance.bdinstall.p0.d.g
        public String c(String str, String str2, d dVar) {
            return dVar.k(str, str2);
        }

        @Override // com.bytedance.bdinstall.p0.d.g
        public void d(String str) {
            d.this.a("serial_number", str);
        }

        @Override // com.bytedance.bdinstall.p0.d.g
        public String e() {
            return d.this.b("serial_number");
        }
    }

    /* renamed from: com.bytedance.bdinstall.p0.d$d, reason: collision with other inner class name */
    class C0167d implements g<String[]> {
        C0167d() {
        }

        @Override // com.bytedance.bdinstall.p0.d.g
        public boolean a(String[] strArr, String[] strArr2) {
            String[] strArr3 = strArr;
            String[] strArr4 = strArr2;
            if (strArr3 == strArr4) {
                return true;
            }
            if (strArr3 != null && strArr4 != null && strArr3.length == strArr4.length) {
                for (String str : strArr3) {
                    boolean z = false;
                    for (String str2 : strArr4) {
                        z = e0.e(str2, str) || z;
                    }
                    if (z) {
                    }
                }
                return true;
            }
            return false;
        }

        @Override // com.bytedance.bdinstall.p0.d.g
        public boolean b(String[] strArr) {
            String[] strArr2 = strArr;
            return strArr2 != null && strArr2.length > 0;
        }

        @Override // com.bytedance.bdinstall.p0.d.g
        public String[] c(String[] strArr, String[] strArr2, d dVar) {
            return dVar.h(strArr, strArr2);
        }

        @Override // com.bytedance.bdinstall.p0.d.g
        public void d(String[] strArr) {
            d.this.d("sim_serial_number", strArr);
        }

        @Override // com.bytedance.bdinstall.p0.d.g
        public String[] e() {
            return d.this.f("sim_serial_number");
        }
    }

    class e implements g<String> {
        e() {
        }

        @Override // com.bytedance.bdinstall.p0.d.g
        public boolean a(String str, String str2) {
            return e0.e(str, str2);
        }

        @Override // com.bytedance.bdinstall.p0.d.g
        public boolean b(String str) {
            return e0.g(str);
        }

        @Override // com.bytedance.bdinstall.p0.d.g
        public String c(String str, String str2, d dVar) {
            return dVar.l(str, str2);
        }

        @Override // com.bytedance.bdinstall.p0.d.g
        public void d(String str) {
            d.this.a("udid", str);
        }

        @Override // com.bytedance.bdinstall.p0.d.g
        public String e() {
            return d.this.b("udid");
        }
    }

    class f implements g<String> {
        f() {
        }

        @Override // com.bytedance.bdinstall.p0.d.g
        public boolean a(String str, String str2) {
            return e0.e(str, str2);
        }

        @Override // com.bytedance.bdinstall.p0.d.g
        public boolean b(String str) {
            return !TextUtils.isEmpty(str);
        }

        @Override // com.bytedance.bdinstall.p0.d.g
        public String c(String str, String str2, d dVar) {
            return dVar.c(str, str2);
        }

        @Override // com.bytedance.bdinstall.p0.d.g
        public void d(String str) {
            d.this.a("device_id", str);
        }

        @Override // com.bytedance.bdinstall.p0.d.g
        public String e() {
            return d.this.b("device_id");
        }
    }

    interface g<L> {
        boolean a(L l, L l2);

        boolean b(L l);

        L c(L l, L l2, d dVar);

        void d(L l);

        L e();
    }

    private <T> T g(T t, T t2, g<T> gVar) {
        d dVar = this.a;
        T e2 = gVar.e();
        boolean b2 = gVar.b(t);
        boolean b3 = gVar.b(e2);
        if (!b2 && b3) {
            t = e2;
        }
        if (dVar != null) {
            T c2 = gVar.c(t, t2, dVar);
            if (!gVar.a(c2, e2)) {
                gVar.d(c2);
            }
            return c2;
        }
        boolean z = false;
        if (b2 || b3) {
            t2 = t;
        } else {
            z = true;
        }
        if ((z && gVar.b(t2)) || (b2 && !gVar.a(t2, e2))) {
            gVar.d(t2);
        }
        return t2;
    }

    @Override // com.bytedance.bdinstall.p0.h
    public abstract void a(String str, String str2);

    @Override // com.bytedance.bdinstall.p0.h
    public abstract String b(String str);

    @Override // com.bytedance.bdinstall.p0.h
    public String c(String str, String str2) {
        return (String) g(str, str2, new f());
    }

    protected abstract void d(String str, String[] strArr);

    public void e(List<String> list) {
        d dVar = this.a;
        if (dVar != null) {
            dVar.e(list);
        }
    }

    protected abstract String[] f(String str);

    public String[] h(String[] strArr, String[] strArr2) {
        return (String[]) g(strArr, strArr2, new C0167d());
    }

    public String i(String str, String str2) {
        return (String) g(str, str2, new b());
    }

    public String j(String str, String str2) {
        return (String) g(str, str2, new a());
    }

    public String k(String str, String str2) {
        return (String) g(str, str2, new c());
    }

    public String l(String str, String str2) {
        return (String) g(str, str2, new e());
    }

    void m(d dVar) {
        this.a = dVar;
    }
}
