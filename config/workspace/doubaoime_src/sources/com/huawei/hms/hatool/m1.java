package com.huawei.hms.hatool;

/* loaded from: classes2.dex */
public class m1 {
    private static m1 b = new m1();
    private a a = new a();

    class a {
        String a;
        String b;

        /* renamed from: c, reason: collision with root package name */
        long f7383c = 0;

        a() {
        }

        void a(long j) {
            m1.this.a.f7383c = j;
        }

        void a(String str) {
            m1.this.a.b = str;
        }

        void b(String str) {
            m1.this.a.a = str;
        }
    }

    public static m1 d() {
        return b;
    }

    public String a() {
        return this.a.b;
    }

    public void a(String str, String str2) {
        long b2 = b();
        String c2 = w0.c(str, str2);
        if (c2 == null || c2.isEmpty()) {
            v.e("WorkKeyHandler", "get rsa pubkey config error");
            return;
        }
        if (b2 == 0) {
            b2 = System.currentTimeMillis();
        } else if (System.currentTimeMillis() - b2 <= com.heytap.mcssdk.constant.a.f6889g) {
            return;
        }
        String d2 = com.huawei.e.a.a.a.d.b.d(16);
        String a2 = h0.a(c2, d2);
        this.a.a(b2);
        this.a.b(d2);
        this.a.a(a2);
    }

    public long b() {
        return this.a.f7383c;
    }

    public String c() {
        return this.a.a;
    }
}
