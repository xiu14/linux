package com.huawei.hms.hatool;

import android.text.TextUtils;

/* loaded from: classes2.dex */
public class o0 {

    /* renamed from: c, reason: collision with root package name */
    private static o0 f7385c;
    private String a;
    private String b;

    /* JADX WARN: Code restructure failed: missing block: B:9:0x003b, code lost:
    
        if (f() != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String a(java.lang.String r3) {
        /*
            r2 = this;
            boolean r0 = r2.f()
            if (r0 == 0) goto Ld
            java.lang.String r0 = "analytics_keystore"
            java.lang.String r0 = com.huawei.e.a.a.a.c.a.a.e(r0, r3)
            goto Lf
        Ld:
            java.lang.String r0 = ""
        Lf:
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L4f
            java.lang.String r0 = "hmsSdk"
            java.lang.String r1 = "deCrypt work key first"
            com.huawei.hms.hatool.v.c(r0, r1)
            java.lang.String r0 = r2.e()
            java.lang.String r0 = com.huawei.hms.hatool.n.a(r3, r0)
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            if (r3 == 0) goto L41
            r3 = 16
            java.lang.String r0 = com.huawei.e.a.a.a.d.b.d(r3)
            java.lang.String r3 = r2.b(r0)
            r2.c(r3)
            boolean r3 = r2.f()
            if (r3 == 0) goto L4f
        L3d:
            com.huawei.hms.hatool.x.c()
            goto L4f
        L41:
            boolean r3 = r2.f()
            if (r3 == 0) goto L4f
            java.lang.String r3 = r2.b(r0)
            r2.c(r3)
            goto L3d
        L4f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.hatool.o0.a(java.lang.String):java.lang.String");
    }

    private String b(String str) {
        return f() ? com.huawei.e.a.a.a.c.a.a.g("analytics_keystore", str) : n.b(str, e());
    }

    private String c() {
        String a = d.a(q0.i(), "Privacy_MY", "PrivacyData", "");
        if (!TextUtils.isEmpty(a)) {
            return a(a);
        }
        String d2 = com.huawei.e.a.a.a.d.b.d(16);
        c(b(d2));
        return d2;
    }

    private boolean c(String str) {
        v.c("hmsSdk", "refresh sp aes key");
        if (TextUtils.isEmpty(str)) {
            v.c("hmsSdk", "refreshLocalKey(): encrypted key is empty");
            return false;
        }
        d.b(q0.i(), "Privacy_MY", "PrivacyData", str);
        d.b(q0.i(), "Privacy_MY", "flashKeyTime", System.currentTimeMillis());
        return true;
    }

    public static o0 d() {
        if (f7385c == null) {
            g();
        }
        return f7385c;
    }

    private String e() {
        if (TextUtils.isEmpty(this.b)) {
            this.b = new x().a();
        }
        return this.b;
    }

    private boolean f() {
        return true;
    }

    private static synchronized void g() {
        synchronized (o0.class) {
            if (f7385c == null) {
                f7385c = new o0();
            }
        }
    }

    public String a() {
        if (TextUtils.isEmpty(this.a)) {
            this.a = c();
        }
        return this.a;
    }

    public void b() {
        String d2 = com.huawei.e.a.a.a.d.b.d(16);
        if (c(b(d2))) {
            this.a = d2;
        }
    }
}
