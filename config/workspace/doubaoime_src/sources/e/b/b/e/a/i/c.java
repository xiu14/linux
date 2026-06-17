package e.b.b.e.a.i;

import android.os.Build;
import android.text.TextUtils;
import com.bytedance.apm6.util.timetask.AsyncTaskManagerType;
import e.b.b.e.a.i.d;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class c {

    /* renamed from: f, reason: collision with root package name */
    private static volatile c f9391f;
    private a b;

    /* renamed from: e, reason: collision with root package name */
    private com.bytedance.apm6.util.timetask.a f9394e;
    private Map<String, a> a = new ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    private long f9392c = -1;

    /* renamed from: d, reason: collision with root package name */
    private long f9393d = -1;

    static /* synthetic */ com.bytedance.apm6.util.timetask.a d(c cVar, com.bytedance.apm6.util.timetask.a aVar) {
        cVar.f9394e = null;
        return null;
    }

    public static c f() {
        if (f9391f == null) {
            synchronized (c.class) {
                if (f9391f == null) {
                    f9391f = new c();
                }
            }
        }
        return f9391f;
    }

    public a e(String str) {
        d dVar;
        a aVar;
        if (this.a.containsKey(str)) {
            aVar = this.a.get(str);
        } else {
            dVar = d.b.a;
            a b = dVar.b(str);
            if (b == null) {
                return this.b;
            }
            this.a.put(str, b);
            aVar = b;
        }
        if (aVar != null) {
            if (TextUtils.isEmpty(aVar.h())) {
                aVar.M(e.b.b.h.c.a.l());
            }
            if (e.b.b.h.c.a.g() != null) {
                aVar.Q(null);
            }
            long j = this.f9393d;
            if (j != -1) {
                aVar.V(j);
                aVar.U(this.f9392c);
            } else {
                com.bytedance.apm.x.c o = e.b.b.h.c.a.o();
                if (o != null && this.f9394e == null) {
                    synchronized (c.class) {
                        this.f9394e = new b(this, o);
                        com.bytedance.apm6.util.timetask.b.a(AsyncTaskManagerType.LIGHT_WEIGHT).c(this.f9394e);
                    }
                }
            }
            if (e.b.b.n.a.b()) {
                List<String> list = e.b.b.e.a.a.a;
                StringBuilder M = e.a.a.a.a.M("nptTime:");
                M.append(this.f9393d);
                M.append(" nptOffset:");
                M.append(this.f9392c);
                e.b.b.n.g.b.a("APM-Slardar", M.toString());
            }
            aVar.f0(e.b.b.h.c.a.v());
            aVar.J(e.b.b.h.c.a.j());
            a aVar2 = this.b;
            if (aVar2 != null) {
                aVar.K(aVar2.B());
            }
        }
        return aVar;
    }

    public void g() {
        d dVar;
        d dVar2;
        a aVar = new a();
        aVar.W("Android");
        aVar.P("android");
        aVar.X(Build.VERSION.RELEASE);
        aVar.G(Build.VERSION.SDK_INT);
        aVar.O(Build.MODEL);
        aVar.L(Build.BRAND);
        aVar.N(Build.MANUFACTURER);
        aVar.a0(e.b.b.h.c.a.k());
        aVar.d0(e.b.b.h.c.a.s());
        aVar.c0(e.b.b.n.c.a());
        aVar.h0(e.b.b.e.a.b.d());
        aVar.Z(e.b.b.h.c.a.m());
        aVar.I(e.b.b.h.c.a.i());
        aVar.F(e.b.b.h.c.a.f());
        aVar.f0(e.b.b.h.c.a.v());
        aVar.g0(String.valueOf(e.b.b.h.c.a.t()));
        aVar.j0(e.b.b.h.c.a.x());
        aVar.i0(String.valueOf(e.b.b.h.c.a.w()));
        aVar.H(e.b.b.h.c.a.h());
        aVar.b0(e.b.b.h.c.a.p());
        aVar.Y(e.b.b.n.a.a().getPackageName());
        aVar.K(aVar.B());
        aVar.S(e.b.b.h.c.a.n());
        aVar.J(e.b.b.h.c.a.j());
        JSONObject jSONObject = new JSONObject();
        try {
            e.b.b.n.b.a(jSONObject, e.b.b.h.c.a.r());
            if (jSONObject.has("version_code")) {
                jSONObject.remove("version_code");
            }
            if (jSONObject.has("app_version")) {
                jSONObject.remove("app_version");
            }
            if (jSONObject.has("uid")) {
                jSONObject.remove("uid");
            }
            if (jSONObject.has("update_version_code")) {
                jSONObject.remove("update_version_code");
            }
            if (jSONObject.has("manifest_version_code")) {
                jSONObject.remove("manifest_version_code");
            }
        } catch (Exception e2) {
            StringBuilder M = e.a.a.a.a.M("header json exception");
            M.append(e2.toString());
            e.b.b.n.g.b.b("APM", M.toString());
        }
        aVar.e0(jSONObject);
        aVar.T("5.0.21.11");
        if (e.b.b.h.c.a.y()) {
            dVar2 = d.b.a;
            dVar2.a();
        }
        String valueOf = String.valueOf(e.a());
        this.a.put(valueOf, aVar);
        this.b = aVar;
        dVar = d.b.a;
        dVar.d(valueOf, aVar);
    }
}
