package com.xiaomi.push.service;

import android.content.SharedPreferences;
import android.util.Base64;
import com.xiaomi.push.ai;
import com.xiaomi.push.cv;
import com.xiaomi.push.ee;
import com.xiaomi.push.ef;
import com.xiaomi.push.hn;
import java.io.BufferedOutputStream;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class bi {
    private static bi a = new bi();

    /* renamed from: a, reason: collision with other field name */
    private static String f1080a;

    /* renamed from: a, reason: collision with other field name */
    private ai.b f1081a;

    /* renamed from: a, reason: collision with other field name */
    private ee.a f1082a;

    /* renamed from: a, reason: collision with other field name */
    private List<a> f1083a = new ArrayList();

    public static abstract class a {
        public void a(ee.a aVar) {
        }

        public void a(ef.b bVar) {
        }
    }

    private bi() {
    }

    private void b() {
        if (this.f1082a == null) {
            d();
        }
    }

    private void c() {
        if (this.f1081a != null) {
            return;
        }
        ai.b bVar = new ai.b() { // from class: com.xiaomi.push.service.bi.1

            /* renamed from: a, reason: collision with other field name */
            boolean f1084a = false;

            @Override // com.xiaomi.push.ai.b
            public void b() {
                try {
                    ee.a a2 = ee.a.a(Base64.decode(cv.a(com.xiaomi.push.t.m841a(), "https://resolver.msg.xiaomi.net/psc/?t=a", (List<com.xiaomi.push.aw>) null), 10));
                    if (a2 != null) {
                        bi.this.f1082a = a2;
                        this.f1084a = true;
                        bi.this.e();
                    }
                } catch (Exception e2) {
                    StringBuilder M = e.a.a.a.a.M("fetch config failure: ");
                    M.append(e2.getMessage());
                    com.xiaomi.channel.commonutils.logger.c.m15a(M.toString());
                }
            }

            @Override // com.xiaomi.push.ai.b
            /* renamed from: c */
            public void mo256c() {
                a[] aVarArr;
                bi.this.f1081a = null;
                if (this.f1084a) {
                    synchronized (bi.this) {
                        aVarArr = (a[]) bi.this.f1083a.toArray(new a[bi.this.f1083a.size()]);
                    }
                    for (a aVar : aVarArr) {
                        aVar.a(bi.this.f1082a);
                    }
                }
            }
        };
        this.f1081a = bVar;
        hn.a(bVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void d() {
        /*
            r4 = this;
            r0 = 0
            android.content.Context r1 = com.xiaomi.push.t.m841a()     // Catch: java.lang.Throwable -> L23 java.lang.Exception -> L27
            java.lang.String r2 = "XMCloudCfg"
            java.io.FileInputStream r1 = r1.openFileInput(r2)     // Catch: java.lang.Throwable -> L23 java.lang.Exception -> L27
            java.io.BufferedInputStream r2 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L23 java.lang.Exception -> L27
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L23 java.lang.Exception -> L27
            com.xiaomi.push.c r0 = com.xiaomi.push.c.a(r2)     // Catch: java.lang.Exception -> L21 java.lang.Throwable -> L4f
            com.xiaomi.push.ee$a r0 = com.xiaomi.push.ee.a.b(r0)     // Catch: java.lang.Exception -> L21 java.lang.Throwable -> L4f
            r4.f1082a = r0     // Catch: java.lang.Exception -> L21 java.lang.Throwable -> L4f
            r2.close()     // Catch: java.lang.Exception -> L21 java.lang.Throwable -> L4f
        L1d:
            com.xiaomi.push.y.a(r2)
            goto L43
        L21:
            r0 = move-exception
            goto L2a
        L23:
            r1 = move-exception
            r2 = r0
            r0 = r1
            goto L50
        L27:
            r1 = move-exception
            r2 = r0
            r0 = r1
        L2a:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4f
            r1.<init>()     // Catch: java.lang.Throwable -> L4f
            java.lang.String r3 = "load config failure: "
            r1.append(r3)     // Catch: java.lang.Throwable -> L4f
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> L4f
            r1.append(r0)     // Catch: java.lang.Throwable -> L4f
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> L4f
            com.xiaomi.channel.commonutils.logger.c.m15a(r0)     // Catch: java.lang.Throwable -> L4f
            goto L1d
        L43:
            com.xiaomi.push.ee$a r0 = r4.f1082a
            if (r0 != 0) goto L4e
            com.xiaomi.push.ee$a r0 = new com.xiaomi.push.ee$a
            r0.<init>()
            r4.f1082a = r0
        L4e:
            return
        L4f:
            r0 = move-exception
        L50:
            com.xiaomi.push.y.a(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.service.bi.d():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        try {
            if (this.f1082a != null) {
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(com.xiaomi.push.t.m841a().openFileOutput("XMCloudCfg", 0));
                com.xiaomi.push.d a2 = com.xiaomi.push.d.a(bufferedOutputStream);
                this.f1082a.a(a2);
                a2.m205a();
                bufferedOutputStream.close();
            }
        } catch (Exception e2) {
            StringBuilder M = e.a.a.a.a.M("save config failure: ");
            M.append(e2.getMessage());
            com.xiaomi.channel.commonutils.logger.c.m15a(M.toString());
        }
    }

    public static bi a() {
        return a;
    }

    public synchronized void a(a aVar) {
        this.f1083a.add(aVar);
    }

    /* renamed from: a, reason: collision with other method in class */
    synchronized void m785a() {
        this.f1083a.clear();
    }

    /* renamed from: a, reason: collision with other method in class */
    int m783a() {
        b();
        ee.a aVar = this.f1082a;
        if (aVar != null) {
            return aVar.c();
        }
        return 0;
    }

    /* renamed from: a, reason: collision with other method in class */
    public ee.a m784a() {
        b();
        return this.f1082a;
    }

    void a(ef.b bVar) {
        a[] aVarArr;
        if (bVar.m291d() && bVar.d() > m783a()) {
            c();
        }
        synchronized (this) {
            List<a> list = this.f1083a;
            aVarArr = (a[]) list.toArray(new a[list.size()]);
        }
        for (a aVar : aVarArr) {
            aVar.a(bVar);
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public static synchronized String m780a() {
        String str;
        synchronized (bi.class) {
            if (f1080a == null) {
                SharedPreferences sharedPreferences = com.xiaomi.push.t.m841a().getSharedPreferences("XMPushServiceConfig", 0);
                String string = sharedPreferences.getString("DeviceUUID", null);
                f1080a = string;
                if (string == null) {
                    String a2 = com.xiaomi.push.j.a(com.xiaomi.push.t.m841a(), false);
                    f1080a = a2;
                    if (a2 != null) {
                        sharedPreferences.edit().putString("DeviceUUID", f1080a).commit();
                    }
                }
            }
            str = f1080a;
        }
        return str;
    }
}
