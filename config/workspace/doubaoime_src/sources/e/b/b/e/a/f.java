package e.b.b.e.a;

import e.b.b.e.a.c;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class f implements e.b.b.k.d {

    /* renamed from: c, reason: collision with root package name */
    private static volatile f f9378c = new f();
    private e.b.b.e.a.j.c a;
    private volatile boolean b = false;

    private f() {
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0074 A[Catch: Exception -> 0x00b6, TRY_ENTER, TryCatch #1 {Exception -> 0x00b6, blocks: (B:3:0x0006, B:5:0x0010, B:6:0x0019, B:8:0x001f, B:10:0x0034, B:12:0x003a, B:26:0x0074, B:30:0x0079, B:32:0x007f, B:34:0x0090, B:36:0x0096, B:37:0x009d, B:39:0x00a8, B:44:0x0089), top: B:2:0x0006 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void b(org.json.JSONObject r8, boolean r9) {
        /*
            r7 = this;
            java.lang.String r0 = "sid"
            java.lang.String r1 = "network_type"
            java.lang.String r2 = "timestamp"
            java.lang.String r3 = e.b.b.h.c.a.q()     // Catch: java.lang.Exception -> Lb6
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Exception -> Lb6
            if (r3 != 0) goto L19
            java.lang.String r3 = "session_id"
            java.lang.String r4 = e.b.b.h.c.a.q()     // Catch: java.lang.Exception -> Lb6
            r8.put(r3, r4)     // Catch: java.lang.Exception -> Lb6
        L19:
            boolean r3 = r8.isNull(r1)     // Catch: java.lang.Exception -> Lb6
            if (r3 == 0) goto L79
            android.app.Application r3 = e.b.b.n.a.a()     // Catch: java.lang.Exception -> Lb6
            com.bytedance.common.utility.NetworkUtils$NetworkType r3 = com.bytedance.common.utility.NetworkUtils.f(r3)     // Catch: java.lang.Exception -> Lb6
            int r4 = r3.getValue()     // Catch: java.lang.Exception -> Lb6
            r8.put(r1, r4)     // Catch: java.lang.Exception -> Lb6
            boolean r1 = r3.is2G()     // Catch: java.lang.Exception -> Lb6
            if (r1 != 0) goto L3a
            boolean r1 = r3.is3GOrHigher()     // Catch: java.lang.Exception -> Lb6
            if (r1 == 0) goto L79
        L3a:
            android.app.Application r1 = e.b.b.n.a.a()     // Catch: java.lang.Exception -> Lb6
            r3 = -10000(0xffffffffffffd8f0, float:NaN)
            java.lang.String r4 = "connectivity"
            java.lang.Object r4 = r1.getSystemService(r4)     // Catch: java.lang.Throwable -> L71
            android.net.ConnectivityManager r4 = (android.net.ConnectivityManager) r4     // Catch: java.lang.Throwable -> L71
            r5 = 0
            java.lang.String r6 = "android.permission.ACCESS_NETWORK_STATE"
            int r6 = androidx.core.content.ContextCompat.checkSelfPermission(r1, r6)     // Catch: java.lang.Throwable -> L71
            if (r6 != 0) goto L55
            android.net.NetworkInfo r5 = r4.getActiveNetworkInfo()     // Catch: java.lang.Throwable -> L71
        L55:
            if (r5 == 0) goto L71
            boolean r4 = r5.isAvailable()     // Catch: java.lang.Throwable -> L71
            if (r4 != 0) goto L5e
            goto L71
        L5e:
            int r4 = r5.getType()     // Catch: java.lang.Throwable -> L71
            if (r4 != 0) goto L71
            java.lang.String r4 = "phone"
            java.lang.Object r1 = r1.getSystemService(r4)     // Catch: java.lang.Throwable -> L71
            android.telephony.TelephonyManager r1 = (android.telephony.TelephonyManager) r1     // Catch: java.lang.Throwable -> L71
            int r1 = r1.getNetworkType()     // Catch: java.lang.Throwable -> L71
            goto L72
        L71:
            r1 = r3
        L72:
            if (r1 == r3) goto L79
            java.lang.String r3 = "network_type_code"
            r8.put(r3, r1)     // Catch: java.lang.Exception -> Lb6
        L79:
            boolean r1 = r8.isNull(r2)     // Catch: java.lang.Exception -> Lb6
            if (r1 != 0) goto L89
            long r3 = r8.optLong(r2)     // Catch: java.lang.Exception -> Lb6
            r5 = 0
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 > 0) goto L90
        L89:
            long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> Lb6
            r8.put(r2, r3)     // Catch: java.lang.Exception -> Lb6
        L90:
            boolean r1 = r8.isNull(r0)     // Catch: java.lang.Exception -> Lb6
            if (r1 == 0) goto L9d
            long r1 = e.b.b.h.c.a.s()     // Catch: java.lang.Exception -> Lb6
            r8.put(r0, r1)     // Catch: java.lang.Exception -> Lb6
        L9d:
            java.lang.String r0 = "process_name"
            java.lang.String r1 = e.b.b.h.c.a.k()     // Catch: java.lang.Exception -> Lb6
            r8.put(r0, r1)     // Catch: java.lang.Exception -> Lb6
            if (r9 == 0) goto Lc0
            java.lang.String r9 = "seq_no"
            e.b.b.e.a.e r0 = e.b.b.e.a.e.a.a()     // Catch: java.lang.Exception -> Lb6
            long r0 = r0.a()     // Catch: java.lang.Exception -> Lb6
            r8.put(r9, r0)     // Catch: java.lang.Exception -> Lb6
            goto Lc0
        Lb6:
            r8 = move-exception
            java.util.List<java.lang.String> r9 = e.b.b.e.a.a.a
            java.lang.String r9 = "APM-Slardar"
            java.lang.String r0 = "addExtension"
            android.util.Log.e(r9, r0, r8)
        Lc0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e.b.b.e.a.f.b(org.json.JSONObject, boolean):void");
    }

    public static f c() {
        return f9378c;
    }

    @Override // e.b.b.k.d
    public void a(e.b.b.k.c cVar) {
        if (!this.b) {
            synchronized (this) {
                if (!this.b) {
                    if (e.b.b.n.a.b()) {
                        List<String> list = a.a;
                        e.b.b.n.g.b.a("APM-Slardar", "Initializing SlardarHandler...");
                    }
                    e.b.b.e.a.i.c.f().g();
                    com.bytedance.apm6.consumer.slardar.send.downgrade.a.a().b(e.b.b.n.a.a());
                    e.b.b.e.a.h.b bVar = (e.b.b.e.a.h.b) e.b.b.m.c.a(e.b.b.e.a.h.b.class);
                    if (bVar != null) {
                        d(bVar.getConfig());
                    }
                    this.a = new e.b.b.e.a.j.c(e.b.b.e.a.i.e.a(), b.c(), b.a());
                    c.d.a.j(this.a);
                    e.b.b.e.a.k.c.g().f(c.d.a);
                    e.b.b.e.a.k.c.g().f(com.bytedance.apm6.consumer.slardar.send.c.i());
                    e.b.b.e.a.k.c.g().h();
                    c.d.a.f();
                    com.bytedance.apm6.consumer.slardar.send.c.i().j();
                    this.b = true;
                }
            }
        }
        JSONObject c2 = cVar.c();
        if (a.a.contains(cVar.a()) || "tracing".equals(cVar.a())) {
            b(c2, false);
        } else {
            if (!com.bytedance.apm6.consumer.slardar.send.downgrade.a.a().d(c2, e.b.b.h.c.a.f())) {
                if (e.b.b.n.a.b()) {
                    com.bytedance.apm.doctor.a.a(cVar.a(), c2);
                    List<String> list2 = a.a;
                    StringBuilder M = e.a.a.a.a.M("push failed: event(aid=");
                    M.append(e.b.b.h.c.a.f());
                    M.append(" is downgraded: ");
                    M.append(c2.toString());
                    e.b.b.n.g.b.a("APM-Slardar", M.toString());
                    return;
                }
                return;
            }
            b(c2, true);
        }
        if (e.b.b.n.a.b()) {
            com.bytedance.apm.doctor.a.b(cVar.a(), c2, true);
        }
        this.a.f(c2);
    }

    public synchronized void d(e.b.b.e.a.h.a aVar) {
        if (aVar != null) {
            com.bytedance.apm6.consumer.slardar.send.b.e().t(aVar);
            c.d.a.h(aVar.g());
            c.d.a.i(aVar.f());
            e.b.b.e.a.k.c.g().j(aVar.d(), aVar.c(), aVar.e());
            com.bytedance.apm6.consumer.slardar.send.d.h(aVar.a());
        }
        if (e.b.b.n.a.b()) {
            List<String> list = a.a;
            e.b.b.n.g.b.a("APM-Slardar", "setSlardarHandlerConfig:" + aVar);
        }
    }
}
