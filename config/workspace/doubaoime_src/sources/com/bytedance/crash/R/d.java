package com.bytedance.crash.R;

import android.os.Process;
import android.text.TextUtils;
import com.bytedance.crash.C0652g;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.I;
import com.bytedance.crash.J;
import com.bytedance.crash.entity.Header;
import com.bytedance.crash.upload.CrashUploader;
import com.bytedance.crash.upload.l;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class d implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    private static int f4487e = 100;

    /* renamed from: f, reason: collision with root package name */
    private static int f4488f = 30;

    /* renamed from: g, reason: collision with root package name */
    private static boolean f4489g = false;
    private static boolean h;
    private static CopyOnWriteArrayList<d> i = new CopyOnWriteArrayList<>();
    private static HashSet<String> j = new HashSet<>();
    private c a;

    /* renamed from: d, reason: collision with root package name */
    private com.bytedance.crash.monitor.h f4491d;

    /* renamed from: c, reason: collision with root package name */
    private final ConcurrentLinkedQueue<e> f4490c = new ConcurrentLinkedQueue<>();
    private final ConcurrentLinkedQueue<e> b = new ConcurrentLinkedQueue<>();

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d.a(d.this);
        }
    }

    class b implements Runnable {
        final /* synthetic */ e a;

        b(e eVar) {
            this.a = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (d.this.f(this.a)) {
                d.this.f4490c.add(this.a);
            }
            d.a(d.this);
        }
    }

    public d(com.bytedance.crash.monitor.h hVar) {
        this.f4491d = hVar;
        i.add(this);
    }

    static void a(d dVar) {
        dVar.d();
        if (dVar.f4490c.size() >= f4488f) {
            dVar.u();
        }
    }

    public static void c(String str) {
        j.add(str);
    }

    private void d() {
        while (!this.b.isEmpty()) {
            e poll = this.b.poll();
            if (f(poll)) {
                this.f4490c.add(poll);
            }
        }
    }

    public static void e() {
        try {
            Iterator<d> it2 = i.iterator();
            while (it2.hasNext()) {
                d next = it2.next();
                next.f4490c.clear();
                next.b.clear();
            }
        } catch (Throwable unused) {
        }
    }

    private boolean g(String str, String str2) {
        if (f4489g ? !j.contains(str) : false) {
            com.bytedance.android.input.k.b.a.X("CustomException", "isStopUpload：the logType = " + str + " message:" + str2);
            return true;
        }
        if (this.a == null && this.b.size() >= f4487e) {
            com.bytedance.android.input.k.b.a.X("CustomException", "the logType = " + str + "is discarded the cache exceed 100");
            return true;
        }
        if (f4488f <= 0) {
            return true;
        }
        if (l.e() && l.d().a()) {
            com.bytedance.android.input.k.b.a.X("CustomException", "the logType = " + str + "is discarded beacuse the report is exceed 100");
            return true;
        }
        if (this.a != null || this.b.size() < f4487e) {
            if (this.a == null) {
                return false;
            }
            StringBuilder W = e.a.a.a.a.W("the logType = ", str, "message = ", str2, " isSample = ");
            W.append(this.a.c(str, str2));
            com.bytedance.android.input.k.b.a.X("CustomException", W.toString());
            return !this.a.c(str, str2);
        }
        com.bytedance.android.input.k.b.a.X("CustomException", "the logType = " + str + "is discarded the cache exceed 100");
        return true;
    }

    private void l(e eVar) {
        if (this.a != null) {
            com.bytedance.crash.runtime.b.d(new b(eVar));
            return;
        }
        if (this.b.size() >= f4487e) {
            return;
        }
        com.bytedance.android.input.k.b.a.D("CustomException", "cache:" + eVar);
        this.b.add(eVar);
    }

    public static void p(boolean z) {
        h = z;
    }

    public static void q(int i2) {
        if (i2 > 0) {
            f4487e = i2;
        }
    }

    public static void s(int i2) {
        if (i2 <= 0) {
            f4489g = true;
        } else {
            f4488f = i2;
        }
    }

    private void u() {
        if (this.f4490c.isEmpty()) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            Map<String, String> map = null;
            if (!J.E()) {
                map = this.f4491d.j().x();
                Map<String, String> k = I.k();
                if (k != null) {
                    HashMap hashMap = new HashMap();
                    hashMap.putAll(map);
                    hashMap.putAll(k);
                    map = hashMap;
                }
            }
            for (int i2 = 0; !this.f4490c.isEmpty() && i2 <= f4488f; i2++) {
                e poll = this.f4490c.poll();
                com.bytedance.android.input.k.b.a.X("CustomException", "upload:message:" + poll.e() + " log_type:" + poll.d());
                jSONArray.put(poll.h(this.f4491d, map));
            }
            jSONObject.put(RemoteMessageConst.DATA, jSONArray);
            JSONObject e2 = Header.b(this.f4491d, System.currentTimeMillis(), CrashType.ENSURE, Process.myPid()).e();
            jSONObject.put("header", e2);
            if (h) {
                return;
            }
            String d2 = CrashUploader.d(com.bytedance.crash.N.g.h(), e2);
            com.bytedance.android.input.k.b.a.X("CustomException", "isSuccess:" + CrashUploader.q(d2, jSONObject) + "  upload:" + d2);
            l.d().i();
        } catch (Exception unused) {
        }
    }

    public boolean f(e eVar) {
        if (this.a == null) {
            StringBuilder M = e.a.a.a.a.M("isCanReport:config = null and event type");
            M.append(eVar.d());
            com.bytedance.android.input.k.b.a.X("CustomException", M.toString());
            return false;
        }
        if (f4489g ? !j.contains(eVar.d()) : false) {
            StringBuilder M2 = e.a.a.a.a.M("the log_type = ");
            M2.append(eVar.d());
            M2.append(" and message = ");
            M2.append(eVar.e());
            M2.append("is discard because the stop upload");
            com.bytedance.android.input.k.b.a.X("CustomException", M2.toString());
            return false;
        }
        if (!this.a.c(eVar.d(), eVar.e())) {
            StringBuilder M3 = e.a.a.a.a.M("the log_type = ");
            M3.append(eVar.d());
            M3.append(" and message = ");
            M3.append(eVar.e());
            M3.append("is discard because the config");
            M3.append(this.a.b(eVar.d()));
            M3.append(" ");
            M3.append(this.a.a(eVar.e()));
            com.bytedance.android.input.k.b.a.X("CustomException", M3.toString());
            return false;
        }
        String N = TextUtils.isEmpty(eVar.e()) ? null : com.bytedance.android.input.k.b.a.N(eVar.e());
        String f2 = eVar.f();
        boolean b2 = l.d().b(N, f2);
        StringBuilder M4 = e.a.a.a.a.M("the message ");
        M4.append(eVar.e());
        M4.append("  is exceed limit:");
        M4.append(b2);
        com.bytedance.android.input.k.b.a.X("CustomException", M4.toString());
        if (b2) {
            return false;
        }
        l.d().g(f2, N);
        return true;
    }

    public boolean h() {
        c cVar = this.a;
        if (cVar == null) {
            return false;
        }
        return cVar.d();
    }

    public void i(int i2) {
        if (g("core_exception_monitor", null)) {
            return;
        }
        Thread currentThread = Thread.currentThread();
        l(new e(null, currentThread.getStackTrace(), i2, null, true, null, currentThread.getName(), "EnsureNotReachHere", "core_exception_monitor", "exception"));
    }

    public void j(String str, int i2) {
        if (!g("core_exception_monitor", str)) {
            Thread currentThread = Thread.currentThread();
            l(new e(null, currentThread.getStackTrace(), i2, str, true, null, currentThread.getName(), "EnsureNotReachHere", "core_exception_monitor", "exception"));
        } else {
            com.bytedance.android.input.k.b.a.X("CustomException", "reportMessage：isDrop:" + str);
        }
    }

    public void k(String str, Map<String, String> map, int i2) {
        if (!g("core_exception_monitor", str)) {
            Thread currentThread = Thread.currentThread();
            l(new e(null, currentThread.getStackTrace(), i2, str, true, map, currentThread.getName(), "EnsureNotReachHere", "core_exception_monitor", "exception"));
        } else {
            com.bytedance.android.input.k.b.a.X("CustomException", "reportMessage：isDrop:" + str);
        }
    }

    public void m(String str, Map<String, String> map, Throwable th, String str2) {
        String name = Thread.currentThread().getName();
        String str3 = TextUtils.isEmpty(str2) ? "core_exception_monitor" : str2;
        StringBuilder U = e.a.a.a.a.U("reportJavaEnsure:message:", str, " ");
        U.append(com.bytedance.crash.util.a.i());
        com.bytedance.android.input.k.b.a.q("CustomException", U.toString());
        if (!g(str3, str)) {
            l(new e(th, null, 0, str, true, map, name, "EnsureNotReachHere", str3, "exception"));
            return;
        }
        com.bytedance.android.input.k.b.a.X("CustomException", "reportJavaEnsure：isDrop:" + str3 + " " + str);
    }

    public void n(Throwable th) {
        if (g("core_exception_monitor", null)) {
            com.bytedance.android.input.k.b.a.X("CustomException", "reportThrowable：isDrop:");
        } else {
            m(null, null, th, "core_exception_monitor");
        }
    }

    public void o(Throwable th, String str) {
        m(str, null, th, "core_exception_monitor");
    }

    public void r(com.bytedance.crash.monitor.h hVar) {
        this.f4491d = hVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        StringBuilder sb = new StringBuilder();
        sb.append("run:");
        C0652g.g();
        sb.append(com.bytedance.crash.util.a.f());
        sb.append(" ");
        sb.append(this.f4491d.b());
        com.bytedance.android.input.k.b.a.q("CustomException", sb.toString());
        d();
        u();
        com.bytedance.crash.runtime.b.f(this, 30000L);
    }

    public void t(c cVar) {
        if (cVar == null) {
            return;
        }
        StringBuilder M = e.a.a.a.a.M("updateConfig :");
        M.append(this.f4491d.b());
        M.append(" :");
        M.append(cVar);
        com.bytedance.android.input.k.b.a.X("CustomException", M.toString());
        this.a = cVar;
        com.bytedance.crash.runtime.b.h(this);
        com.bytedance.crash.runtime.b.d(new a());
        com.bytedance.crash.runtime.b.f(this, 30000L);
    }
}
