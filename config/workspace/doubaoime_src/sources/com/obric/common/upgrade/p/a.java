package com.obric.common.upgrade.p;

import com.bytedance.crash.general.RomInfo;
import com.google.gson.Gson;
import com.obric.common.upgrade.h;
import com.obric.common.upgrade.util.c;
import com.obric.common.upgrade.util.e;
import com.prolificinteractive.materialcalendarview.r;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import kotlin.s.c.g;
import kotlin.s.c.l;
import okhttp3.A;
import okhttp3.B;
import okhttp3.D;
import okhttp3.Request;
import okhttp3.v;
import okhttp3.x;
import okhttp3.y;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class a {
    public static final C0357a b = new C0357a(null);

    /* renamed from: c, reason: collision with root package name */
    private static final v f7598c = v.d("application/json; charset=utf-8");

    /* renamed from: d, reason: collision with root package name */
    private static volatile a f7599d;
    private final x a;

    /* renamed from: com.obric.common.upgrade.p.a$a, reason: collision with other inner class name */
    public static final class C0357a {
        public C0357a(g gVar) {
        }

        public final a a() {
            a aVar = a.f7599d;
            if (aVar == null) {
                synchronized (this) {
                    aVar = a.f7599d;
                    if (aVar == null) {
                        aVar = new a(null);
                        C0357a c0357a = a.b;
                        a.f7599d = aVar;
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
        new Gson();
    }

    public final boolean c(int i, long j, long j2, long j3, String str) {
        boolean z;
        l.f(str, "reason");
        if (h.f7570d == null) {
            throw new IllegalStateException("AppUpgradeManager 还未初始化，请先调用 init 方法。".toString());
        }
        h hVar = h.f7570d;
        l.c(hVar);
        String str2 = hVar.i().l() ? "https://os-boe.bytedance.net/api/upgrade/v1/batch_report" : "https://os.oceancloudapi.com/api/upgrade/v1/batch_report";
        c.c("reportStatus url = " + str2);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("uuid", h.j().i().e());
        jSONObject.put("did", h.j().i().e());
        jSONObject.put(RomInfo.KEY_ROM_OS_VERSION, h.j().i().f());
        jSONObject.put("model", h.j().i().d());
        jSONObject.put("app_id", h.j().i().b());
        l.f(str, "reason");
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("task_id", j);
        if (h.f7570d == null) {
            throw new IllegalStateException("AppUpgradeManager 还未初始化，请先调用 init 方法。".toString());
        }
        h hVar2 = h.f7570d;
        l.c(hVar2);
        jSONObject2.put("app_id", hVar2.i().b());
        if (h.f7570d == null) {
            throw new IllegalStateException("AppUpgradeManager 还未初始化，请先调用 init 方法。".toString());
        }
        h hVar3 = h.f7570d;
        l.c(hVar3);
        jSONObject2.put("package", hVar3.i().g());
        jSONObject2.put("old_version_code", j2);
        jSONObject2.put("new_version_code", j3);
        jSONObject2.put("reason", str);
        jSONObject2.put("event_time", System.currentTimeMillis());
        jSONObject2.put("status", i);
        jSONArray.put(jSONObject2);
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("body", jSONArray);
        jSONObject3.put("head", jSONObject);
        String jSONObject4 = jSONObject3.toString();
        l.e(jSONObject4, "fullData.toString()");
        A c2 = A.c(f7598c, jSONObject4);
        com.obric.common.upgrade.l i2 = h.j().i();
        Request.a aVar = new Request.a();
        aVar.j(str2);
        String a = i2.a();
        String h = i2.h();
        byte[] bytes = jSONObject4.getBytes(kotlin.text.c.a);
        l.e(bytes, "this as java.lang.String).getBytes(charset)");
        aVar.a("X-Signature", e.a(a, h, bytes));
        aVar.f("POST", c2);
        Request b2 = aVar.b();
        c.a("reportStatus_requestBody = " + jSONObject4);
        try {
            B c3 = ((y) this.a.m(b2)).c();
            try {
                if (c3.z()) {
                    D a2 = c3.a();
                    String p = a2 != null ? a2.p() : null;
                    if (p != null) {
                        c.a("reportStatus_responseBody = " + p);
                    }
                    z = true;
                } else {
                    z = false;
                }
                r.E(c3, null);
                return z;
            } finally {
            }
        } catch (IOException e2) {
            e2.printStackTrace();
            return false;
        }
    }
}
