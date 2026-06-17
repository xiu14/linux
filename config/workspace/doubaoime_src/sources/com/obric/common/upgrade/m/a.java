package com.obric.common.upgrade.m;

import com.bytedance.crash.general.RomInfo;
import com.google.gson.Gson;
import com.obric.common.upgrade.h;
import com.obric.common.upgrade.i;
import com.obric.common.upgrade.util.c;
import com.obric.common.upgrade.util.e;
import com.prolificinteractive.materialcalendarview.r;
import com.ss.android.socialbase.downloader.constants.MonitorConstants;
import java.util.concurrent.TimeUnit;
import kotlin.s.c.g;
import kotlin.s.c.l;
import okhttp3.A;
import okhttp3.B;
import okhttp3.Request;
import okhttp3.v;
import okhttp3.x;
import okhttp3.y;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static final C0355a f7589d = new C0355a(null);

    /* renamed from: e, reason: collision with root package name */
    private static final v f7590e = v.d("application/json; charset=utf-8");

    /* renamed from: f, reason: collision with root package name */
    private static volatile a f7591f;
    private final x a;
    private final Gson b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f7592c;

    /* renamed from: com.obric.common.upgrade.m.a$a, reason: collision with other inner class name */
    public static final class C0355a {
        public C0355a(g gVar) {
        }

        public final a a() {
            a aVar = a.f7591f;
            if (aVar == null) {
                synchronized (this) {
                    aVar = a.f7591f;
                    if (aVar == null) {
                        aVar = new a(null);
                        C0355a c0355a = a.f7589d;
                        a.f7591f = aVar;
                    }
                }
            }
            return aVar;
        }
    }

    public a(g gVar) {
        x.b bVar = new x.b();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        bVar.d(60L, timeUnit);
        bVar.o(300L, timeUnit);
        bVar.s(300L, timeUnit);
        bVar.p(true);
        bVar.a(com.obric.common.upgrade.util.a.a);
        x c2 = bVar.c();
        l.e(c2, "Builder()\n            .c…  })\n            .build()");
        this.a = c2;
        this.b = new Gson();
    }

    public final boolean c() {
        return this.f7592c;
    }

    public final i d() {
        i iVar;
        this.f7592c = true;
        if (h.f7570d == null) {
            throw new IllegalStateException("AppUpgradeManager 还未初始化，请先调用 init 方法。".toString());
        }
        h hVar = h.f7570d;
        l.c(hVar);
        String str = hVar.i().l() ? "https://os-boe.bytedance.net/api/upgrade/v1/check/single" : "https://os.oceancloudapi.com/api/upgrade/v1/check/single";
        c.c("requestUpgradeInfo url = " + str);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("uuid", h.j().i().e());
        jSONObject.put("did", h.j().i().e());
        jSONObject.put(RomInfo.KEY_ROM_OS_VERSION, h.j().i().f());
        jSONObject.put("model", h.j().i().d());
        jSONObject.put("app_id", h.j().i().b());
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(MonitorConstants.PKG_NAME, h.j().i().g());
        jSONArray.put(jSONObject2);
        JSONArray jSONArray2 = new JSONArray();
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("apk_identity", "4ee46b65f081fd83f59b5d8c54c0f193");
        jSONObject3.put(MonitorConstants.PKG_NAME, h.j().i().g());
        jSONObject3.put("version_code", h.j().i().j());
        jSONObject3.put("version_name", h.j().i().k());
        jSONArray2.put(jSONObject3);
        JSONObject jSONObject4 = new JSONObject();
        jSONObject4.put("need_upgrade_apps", jSONArray);
        jSONObject4.put("business_id", h.j().i().l() ? 335 : 48);
        jSONObject4.put("apps", jSONArray2);
        JSONObject jSONObject5 = new JSONObject();
        jSONObject5.put("body", jSONObject4);
        jSONObject5.put("head", jSONObject);
        String jSONObject6 = jSONObject5.toString();
        l.e(jSONObject6, "fullData.toString()");
        A c2 = A.c(f7590e, jSONObject6);
        com.obric.common.upgrade.l i = h.j().i();
        Request.a aVar = new Request.a();
        aVar.j(str);
        String a = i.a();
        String h = i.h();
        byte[] bytes = jSONObject6.getBytes(kotlin.text.c.a);
        l.e(bytes, "this as java.lang.String).getBytes(charset)");
        aVar.a("X-Signature", e.a(a, h, bytes));
        aVar.f("POST", c2);
        Request b = aVar.b();
        c.a("requestBody = " + jSONObject6);
        try {
            B c3 = ((y) this.a.m(b)).c();
            try {
                if (c3.z()) {
                    String p = c3.a().p();
                    if (p != null) {
                        l.e(p, "responseBody");
                        c.a("responseBody = " + p);
                        this.f7592c = false;
                        iVar = (i) this.b.c(p, i.class);
                        r.E(c3, null);
                        return iVar;
                    }
                } else {
                    this.f7592c = false;
                }
                iVar = null;
                r.E(c3, null);
                return iVar;
            } finally {
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            this.f7592c = false;
            return null;
        }
    }
}
