package com.bytedance.bdinstall.k0;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.bytedance.bdinstall.C0632l;
import com.bytedance.bdinstall.C0635o;
import com.bytedance.bdinstall.C0640u;
import com.bytedance.bdinstall.C0641v;
import com.bytedance.bdinstall.C0643x;
import com.bytedance.bdinstall.D;
import com.bytedance.bdinstall.P;
import com.bytedance.bdinstall.Q;
import com.bytedance.bdinstall.e0;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class m implements com.bytedance.bdinstall.g0.h {
    private static final com.bytedance.bdinstall.util.p<i> s;

    /* renamed from: d, reason: collision with root package name */
    private C0641v f4030d;

    /* renamed from: e, reason: collision with root package name */
    protected final Context f4031e;

    /* renamed from: f, reason: collision with root package name */
    protected final Q f4032f;

    /* renamed from: g, reason: collision with root package name */
    private final j f4033g;
    private com.bytedance.bdinstall.p0.h j;
    private boolean k;
    private com.bytedance.bdinstall.g0.c m;
    private com.bytedance.bdinstall.util.b n;
    private com.bytedance.bdinstall.migrate.a o;
    private final com.bytedance.bdinstall.util.s p;
    private com.bytedance.bdinstall.g0.e q;
    private final Map<Class<?>, d> a = new LinkedHashMap(32);
    private final Object b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private boolean f4029c = false;
    private volatile boolean h = false;
    private final AtomicBoolean l = new AtomicBoolean(false);
    private int r = 0;
    private JSONObject i = new JSONObject();

    static class a extends com.bytedance.bdinstall.util.p<i> {
        a() {
        }

        @Override // com.bytedance.bdinstall.util.p
        protected i a(Object[] objArr) {
            return new i((Context) objArr[0], (Q) objArr[1], (C0641v) objArr[2]);
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            m.this.p();
        }
    }

    static {
        new AtomicBoolean(true);
        s = new a();
    }

    public m(Context context, Q q, C0641v c0641v) {
        this.n = null;
        this.f4031e = context;
        this.f4030d = c0641v;
        this.f4032f = q;
        this.f4033g = new j(q);
        this.j = c(context, c0641v);
        this.n = C0632l.n(String.valueOf(q.h())).j();
        C0643x.h(q.i(), new b());
        this.p = new com.bytedance.bdinstall.util.s();
    }

    private com.bytedance.bdinstall.p0.h c(Context context, C0641v c0641v) {
        com.bytedance.bdinstall.o0.c cVar = (com.bytedance.bdinstall.o0.c) com.bytedance.bdinstall.o0.d.a(com.bytedance.bdinstall.o0.c.class, String.valueOf(this.f4032f.h()));
        com.bytedance.bdinstall.p0.i iVar = new com.bytedance.bdinstall.p0.i(context, c0641v.b(this.f4032f), this.f4032f);
        return cVar != null ? (com.bytedance.bdinstall.p0.h) cVar.c(com.bytedance.bdinstall.p0.h.class, iVar) : iVar;
    }

    @WorkerThread
    private boolean d(Context context, C0641v c0641v) {
        SharedPreferences b2;
        com.bytedance.bdinstall.migrate.a aVar = new com.bytedance.bdinstall.migrate.a(context, this.f4032f);
        this.o = aVar;
        boolean b3 = aVar.b();
        int i = C0640u.a;
        if (b3) {
            com.bytedance.bdinstall.migrate.a.c(context, this.f4032f, f(), true);
            Q q = this.f4032f;
            com.bytedance.bdinstall.util.g.d(context, q).edit().remove("google_aid").remove("gaid_limited").apply();
            e0.i(q.A(), new String[]{"device_id", "bd_did", "install_id", RemoteMessageConst.DEVICE_TOKEN});
            if (c0641v != null && (b2 = c0641v.b(q)) != null) {
                e0.i(b2, new String[]{"device_id", "bd_did", "install_id", RemoteMessageConst.DEVICE_TOKEN});
            }
            try {
                e0.i(context.getSharedPreferences("snssdk_openudid", 0), new String[]{"clientudid", "openudid", "serial_number"});
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            e0.i(com.bytedance.bdinstall.util.g.d(context, q), new String[]{"clientudid", "openudid", "serial_number"});
            C0635o.b(context, q);
            com.bytedance.bdinstall.m0.k.n(context).i();
        }
        this.o.a();
        return b3;
    }

    private void q(com.bytedance.bdinstall.o0.a aVar, String str, String str2) throws JSONException {
        String d2 = aVar.d();
        JSONObject a0 = e.a.a.a.a.a0("old_id", str2, "new_id", str);
        if (!this.f4030d.d()) {
            a0.put("openudid", aVar.c(true));
        }
        a0.put("clientudid", d2);
        D u = this.f4032f.u();
        if (u != null) {
            u.a("did_change", a0);
        }
    }

    public void a(C0641v c0641v, boolean z) {
        this.f4030d = c0641v;
        this.j = c(this.f4031e, c0641v);
        com.bytedance.bdinstall.p0.e.a(this.f4031e, c0641v, this.f4032f);
        synchronized (this.a) {
            this.a.put(w.class, new w(this.f4032f, c0641v));
            this.a.put(n.class, new n(this.f4031e, this.f4032f, c0641v));
            this.a.put(g.class, new g(this.f4031e, this.f4032f, c0641v));
            this.a.put(f.class, new f(this.f4031e, this.f4032f));
        }
        SharedPreferences b2 = c0641v.b(this.f4032f);
        if (b2 != null) {
            b2.edit().putLong("register_time", 0L).apply();
        }
        if (z) {
            n();
            com.bytedance.bdinstall.g0.c cVar = this.m;
            if (cVar != null) {
                cVar.b(new com.bytedance.bdinstall.g0.i.a(this.i));
            }
            s();
        }
    }

    public void b() {
        com.bytedance.bdinstall.o0.a aVar = (com.bytedance.bdinstall.o0.a) com.bytedance.bdinstall.o0.d.a(com.bytedance.bdinstall.o0.a.class, String.valueOf(this.f4032f.h()));
        if (aVar != null) {
            aVar.a();
        }
        C0635o.b(this.f4031e, this.f4032f);
        com.bytedance.bdinstall.util.m.a();
    }

    @NonNull
    public JSONObject e() {
        return this.i;
    }

    public String f() {
        com.bytedance.bdinstall.o0.a aVar = (com.bytedance.bdinstall.o0.a) com.bytedance.bdinstall.o0.d.a(com.bytedance.bdinstall.o0.a.class, this.f4032f.i());
        return aVar != null ? aVar.getDeviceId() : this.j.c("", "");
    }

    public JSONObject g() {
        if (this.k) {
            return this.i;
        }
        return null;
    }

    public P h() {
        synchronized (this.b) {
            while (!this.h) {
                try {
                    this.b.wait();
                } catch (InterruptedException unused) {
                    int i = C0640u.a;
                }
            }
        }
        String f2 = f();
        String b2 = this.j.b("install_id");
        String string = com.bytedance.bdinstall.util.g.d(this.f4031e, this.f4032f).getString("openudid", null);
        String string2 = com.bytedance.bdinstall.util.g.d(this.f4031e, this.f4032f).getString("clientudid", null);
        String b3 = this.j.b("ssid");
        String string3 = com.bytedance.bdinstall.util.g.d(this.f4031e, this.f4032f).getString("klink_egdi", null);
        P p = new P();
        if (TextUtils.isEmpty(f2)) {
            f2 = "";
        }
        p.j(f2);
        if (TextUtils.isEmpty(b2)) {
            b2 = "";
        }
        p.l(b2);
        p.i(string2);
        p.m(string);
        p.n(b3);
        p.k(string3);
        return p;
    }

    public int i() {
        String optString = this.i.optString("device_id", "");
        String optString2 = this.i.optString("install_id", "");
        String optString3 = this.i.optString("bd_did", "");
        if ((e0.b(optString) || e0.b(optString3)) && e0.b(optString2)) {
            return com.bytedance.bdinstall.util.g.d(this.f4031e, this.f4032f).getLong("dr_install_vc", 0L) == this.i.optLong("version_code", -1L) ? 1 : 2;
        }
        return 0;
    }

    public com.bytedance.bdinstall.util.s j() {
        return this.p;
    }

    public boolean k() {
        return !TextUtils.equals(com.bytedance.bdinstall.util.g.d(this.f4031e, this.f4032f).getString("dr_aid", null), String.valueOf(this.f4032f.h()));
    }

    public boolean l() {
        return !TextUtils.equals(com.bytedance.bdinstall.util.g.d(this.f4031e, this.f4032f).getString("dr_channel", null), this.f4032f.o());
    }

    public boolean m() {
        return com.bytedance.bdinstall.util.g.d(this.f4031e, this.f4032f).getLong("dr_install_vc", 0L) != this.i.optLong("version_code", 0L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0127, code lost:
    
        if (r11 != false) goto L72;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean n() {
        /*
            Method dump skipped, instructions count: 392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.bdinstall.k0.m.n():boolean");
    }

    public void o() {
        n();
        com.bytedance.bdinstall.g0.c cVar = this.m;
        if (cVar != null) {
            cVar.b(new com.bytedance.bdinstall.g0.i.a(this.i));
        }
        s();
    }

    protected void p() {
        boolean d2;
        Context context = this.f4031e;
        try {
            if (this.f4032f.b()) {
                d2 = d(context, this.f4030d);
            } else {
                int i = C0640u.a;
                d2 = false;
            }
            if (!d2) {
                s.a(context, this.f4030d, this.f4032f);
            }
            synchronized (this.b) {
                this.h = true;
                this.b.notifyAll();
            }
        } catch (Throwable th) {
            synchronized (this.b) {
                this.h = true;
                this.b.notifyAll();
                throw th;
            }
        }
    }

    public void r() {
        com.bytedance.bdinstall.g0.c cVar;
        P h = h();
        String c2 = h.c();
        String e2 = h.e();
        String g2 = h.g();
        com.bytedance.bdinstall.util.b bVar = this.n;
        if (bVar != null) {
            bVar.b(c2, e2, g2);
        }
        if (TextUtils.isEmpty(h.c()) || TextUtils.isEmpty(h.e()) || (cVar = this.m) == null) {
            return;
        }
        cVar.b(new com.bytedance.bdinstall.g0.i.b(h));
    }

    public void s() {
        com.bytedance.bdinstall.g0.c cVar;
        P h = h();
        if (TextUtils.isEmpty(h.c()) || TextUtils.isEmpty(h.e()) || (cVar = this.m) == null) {
            return;
        }
        cVar.b(new com.bytedance.bdinstall.g0.i.b(h));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(49:10|11|12|13|14|15|(2:176|177)|17|(1:174)(2:(1:173)(2:23|24)|25)|(3:163|164|(31:166|167|168|29|30|(4:32|(2:34|15c)(1:159)|62|(3:64|(1:66)|67))(1:160)|68|69|(3:73|(2:75|(1:77))|78)|(2:82|83)|84|(1:140)(2:88|89)|90|(1:92)|93|(1:95)|96|(1:139)(1:100)|101|(1:138)(1:105)|(1:109)|(4:133|134|135|136)(1:113)|114|(3:116|117|118)(1:130)|119|(1:127)(1:123)|124|125|(1:52)(1:44)|(1:48)|49))(1:27)|28|29|30|(0)(0)|68|69|(4:71|73|(0)|78)|(3:80|82|83)|84|(1:86)|140|90|(0)|93|(0)|96|(1:98)|139|101|(1:103)|138|(2:107|109)|(0)|133|134|135|136|114|(0)(0)|119|(1:121)|127|124|125|(0)|50|52|(2:46|48)|49) */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x02e9, code lost:
    
        r4 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x02ed, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x02eb, code lost:
    
        r23 = r3;
     */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x014c A[Catch: JSONException -> 0x013f, TRY_ENTER, TryCatch #3 {JSONException -> 0x013f, blocks: (B:168:0x0137, B:32:0x014c, B:35:0x015c), top: B:167:0x0137 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0301 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01c4 A[Catch: JSONException -> 0x0294, TryCatch #5 {JSONException -> 0x0294, blocks: (B:60:0x016f, B:62:0x0187, B:64:0x018d, B:66:0x0193, B:71:0x01af, B:73:0x01b7, B:75:0x01c4, B:77:0x01db, B:80:0x01e6, B:82:0x01ee, B:86:0x020f, B:88:0x0217, B:98:0x0269, B:103:0x0279, B:107:0x0285, B:109:0x0289), top: B:59:0x016f }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0234 A[Catch: JSONException -> 0x02ed, TryCatch #12 {JSONException -> 0x02ed, blocks: (B:69:0x01a3, B:84:0x01f9, B:90:0x0224, B:92:0x0234, B:93:0x0239, B:95:0x023f, B:96:0x0244, B:101:0x0273, B:133:0x02a6), top: B:68:0x01a3 }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x023f A[Catch: JSONException -> 0x02ed, TryCatch #12 {JSONException -> 0x02ed, blocks: (B:69:0x01a3, B:84:0x01f9, B:90:0x0224, B:92:0x0234, B:93:0x0239, B:95:0x023f, B:96:0x0244, B:101:0x0273, B:133:0x02a6), top: B:68:0x01a3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean t(com.bytedance.bdinstall.l0.a r25, com.bytedance.bdinstall.C0641v r26, com.bytedance.bdinstall.o0.a r27) {
        /*
            Method dump skipped, instructions count: 794
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.bdinstall.k0.m.t(com.bytedance.bdinstall.l0.a, com.bytedance.bdinstall.v, com.bytedance.bdinstall.o0.a):boolean");
    }

    public void u(com.bytedance.bdinstall.g0.c cVar) {
        this.m = cVar;
    }

    public void v(com.bytedance.bdinstall.g0.e eVar) {
        this.q = eVar;
    }

    public void w() {
        if (this.l.getAndSet(true)) {
            return;
        }
        com.bytedance.bdinstall.p0.e.a(this.f4031e, this.f4030d, this.f4032f);
    }

    public void x(JSONObject jSONObject, C0641v c0641v) {
        try {
            this.f4033g.a(jSONObject, c0641v);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    public boolean y(String str, @Nullable Object obj) {
        boolean z;
        Object opt = this.i.opt(str);
        if ((obj == null || obj.equals(opt)) && (obj != null || opt == null)) {
            z = false;
        } else {
            synchronized (m.class) {
                try {
                    JSONObject jSONObject = this.i;
                    JSONObject jSONObject2 = new JSONObject();
                    e0.d(jSONObject2, jSONObject);
                    jSONObject2.put(str, obj);
                    this.i = jSONObject2;
                } catch (JSONException unused) {
                    int i = C0640u.a;
                }
            }
            z = true;
        }
        int i2 = C0640u.a;
        return z;
    }
}
