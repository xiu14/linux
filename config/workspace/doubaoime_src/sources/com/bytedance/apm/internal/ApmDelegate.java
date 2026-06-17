package com.bytedance.apm.internal;

import android.app.Application;
import android.content.Context;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import com.bytedance.apm.agent.tracing.AutoPageTraceHelper;
import com.bytedance.apm.config.SlardarConfigManagerImpl;
import com.bytedance.apm.core.ActivityLifeObserver;
import com.bytedance.apm.doctor.DoctorManager;
import com.bytedance.apm.internal.h;
import com.bytedance.apm.n;
import com.bytedance.crash.dumper.Scraps;
import com.bytedance.crash.x;
import com.bytedance.monitor.collector.i;
import com.bytedance.monitor.collector.j;
import com.bytedance.monitor.collector.m;
import com.bytedance.services.apm.api.IApmAgent;
import com.bytedance.services.apm.api.IHttpService;
import com.bytedance.services.apm.api.ILaunchTrace;
import com.bytedance.services.apm.api.k;
import com.bytedance.services.slardar.config.IConfigManager;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ApmDelegate implements com.bytedance.services.slardar.config.a {
    private static long l;
    private static boolean m;
    private com.bytedance.apm.config.b a;
    private com.bytedance.apm.config.c b;

    /* renamed from: c, reason: collision with root package name */
    private com.bytedance.services.apm.api.e f3441c;

    /* renamed from: d, reason: collision with root package name */
    private SlardarConfigManagerImpl f3442d;

    /* renamed from: e, reason: collision with root package name */
    private volatile boolean f3443e;

    /* renamed from: f, reason: collision with root package name */
    private volatile boolean f3444f;

    /* renamed from: g, reason: collision with root package name */
    private volatile boolean f3445g;
    private boolean h;
    private Set<com.bytedance.services.apm.api.h> i;
    boolean j = false;
    private boolean k = true;

    class a implements Runnable {
        a(ApmDelegate apmDelegate) {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.bytedance.monitor.collector.g.g();
        }
    }

    class b implements Runnable {
        final /* synthetic */ com.bytedance.apm.config.b a;
        final /* synthetic */ Context b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Runnable f3446c;

        b(com.bytedance.apm.config.b bVar, Context context, Runnable runnable) {
            this.a = bVar;
            this.b = context;
            this.f3446c = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            ApmDelegate.this.f3442d.registerConfigListener(g.a);
            com.bytedance.apm.data.pipeline.d.o((this.a.j() & 1) == 0 || com.bytedance.apm.launch.a.b().a().c());
            com.bytedance.apm.data.pipeline.d.p(this.a.i());
            com.bytedance.apm.internal.g.d(this.b);
            int i = com.bytedance.apm.g.A;
            if (ApmDelegate.this.h) {
                com.bytedance.apm.t.l.d.i().s();
                i.a aVar = new i.a();
                aVar.g(com.bytedance.apm.internal.g.a());
                aVar.h(com.bytedance.apm.internal.g.a() != 0 && com.bytedance.apm.internal.g.c(2));
                aVar.i(this.a.m() && com.bytedance.apm.internal.g.c(2));
                aVar.k(com.bytedance.apm.internal.g.c(64));
                Objects.requireNonNull(ApmDelegate.this.a);
                aVar.j(true);
                aVar.l(com.bytedance.apm.internal.g.b());
                j.h().k(com.bytedance.apm.g.h(), new i(aVar));
                j.h().r();
                j h = j.h();
                Objects.requireNonNull(ApmDelegate.this.a);
                h.p(false);
            } else {
                j.m(com.bytedance.apm.g.h());
            }
            com.bytedance.apm.t.f.a().b();
            Runnable runnable = this.f3446c;
            if (runnable != null) {
                runnable.run();
            }
            if (com.bytedance.apm.g.B()) {
                DoctorManager.getInstance().b(ApmDelegate.this.h ? "APM_INIT_ASYNC" : "APM_INIT_ASYNC_OTHER_PROCESS", null);
            }
        }
    }

    class c implements e.b.j.b.b {
        final /* synthetic */ com.bytedance.apm.t.l.b a;

        c(ApmDelegate apmDelegate, com.bytedance.apm.t.l.b bVar) {
            this.a = bVar;
        }

        @Override // e.b.j.b.b
        public void a(long j, boolean z) {
            this.a.j(j, z);
        }
    }

    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ApmDelegate.d(ApmDelegate.this);
        }
    }

    class e implements n.a {
        e(ApmDelegate apmDelegate) {
        }

        @Override // com.bytedance.apm.n.a
        public void a(Throwable th, String str) {
            com.bytedance.article.common.monitor.stack.d.j().h(th, str);
        }

        @Override // com.bytedance.apm.n.a
        public void ensureNotReachHere(Throwable th, String str) {
            com.bytedance.article.common.monitor.stack.b.c(th, str);
        }

        @Override // com.bytedance.apm.n.a
        public void ensureNotReachHere(String str) {
            com.bytedance.article.common.monitor.stack.b.b(str);
        }
    }

    class f implements Runnable {

        class a implements com.bytedance.apm.core.d {
            a(f fVar) {
            }

            @Override // com.bytedance.apm.core.d
            public Map<String, String> a() {
                return com.bytedance.apm.g.x();
            }
        }

        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SlardarConfigManagerImpl slardarConfigManagerImpl = ApmDelegate.this.f3442d;
            Objects.requireNonNull(ApmDelegate.this.b);
            slardarConfigManagerImpl.initParams(false, new a(this), ApmDelegate.this.b.k());
            Objects.requireNonNull(ApmDelegate.this.b);
            ApmDelegate.this.f3442d.fetchConfig();
        }
    }

    private static class g {
        private static final ApmDelegate a = new ApmDelegate(null);
    }

    private ApmDelegate() {
    }

    static void d(ApmDelegate apmDelegate) {
        Objects.requireNonNull(apmDelegate);
        try {
            long nanoTime = System.nanoTime();
            Objects.requireNonNull(apmDelegate.b);
            e.b.b.h.c.a.C(null);
            apmDelegate.r();
            if (apmDelegate.h) {
                com.bytedance.apm.g.b0(System.nanoTime() - nanoTime);
                apmDelegate.p();
            }
        } catch (Throwable th) {
            if (com.bytedance.apm.g.B()) {
                th.printStackTrace();
                DoctorManager.getInstance().b("APM_START_ERROR", com.bytedance.android.input.k.b.a.Q(th, 30));
            }
            try {
                com.bytedance.apm.F.b.e().n();
            } catch (Throwable unused) {
            }
        }
    }

    public static ApmDelegate i() {
        return g.a;
    }

    private void initEvilMethodTraceInject() {
    }

    private static void initTraceEvilMethod() {
        e.b.j.b.a.l(l);
        e.b.j.b.a.m = m;
        e.b.j.b.a.l = true;
        com.bytedance.apm.t.l.d.i().k();
        com.bytedance.apm.t.l.e.y().D();
        new e.b.j.b.a(false, false).m();
        j.h().q(true);
    }

    private void n() {
        if (this.j) {
            return;
        }
        this.j = true;
        com.bytedance.apm.F.a.a().post(new a(this));
        com.bytedance.apm.t.b bVar = new com.bytedance.apm.t.b();
        bVar.i(this.b.c());
        bVar.k(this.b.q());
        bVar.h();
        if (ActivityLifeObserver.getInstance().isForeground()) {
            bVar.l();
        }
        Objects.requireNonNull(this.a);
        bVar.j(false);
    }

    @WorkerThread
    private void p() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("init", com.bytedance.apm.g.m());
            jSONObject.put("init_finish", com.bytedance.apm.g.n());
            jSONObject.put("init_step2", com.bytedance.apm.g.o());
            jSONObject.put("init_step3", com.bytedance.apm.g.p());
            jSONObject.put("init_step4", com.bytedance.apm.g.q());
            jSONObject.put("init_step5", com.bytedance.apm.g.r());
            jSONObject.put("start", com.bytedance.apm.g.y());
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("is_main_process", this.h);
            com.bytedance.apm.c.g("apm_cost", jSONObject2, jSONObject, null);
        } catch (JSONException unused) {
        }
    }

    private void r() {
        h unused = h.b.a;
        System.currentTimeMillis();
        Objects.requireNonNull(this.b);
        com.bytedance.apm.g.a0(null);
        if (com.bytedance.android.input.k.b.a.a0(this.b.k()) && !com.bytedance.android.input.k.b.a.a0(null)) {
            this.b.t(null);
        }
        if (com.bytedance.android.input.k.b.a.a0(this.b.d()) && !com.bytedance.android.input.k.b.a.a0(null)) {
            this.b.r(null);
        }
        if (com.bytedance.android.input.k.b.a.a0(this.b.g()) && !com.bytedance.android.input.k.b.a.a0(null)) {
            this.b.s(null);
        }
        com.bytedance.apm.D.c.f(new com.bytedance.apm.C.a());
        n.e().f(new e(this));
        com.bytedance.apm.g.P(this.b.h());
        com.bytedance.apm.g.O(this.b.e());
        com.bytedance.apm.g.Q(this.b.i());
        this.b.k();
        Objects.requireNonNull(this.b);
        com.bytedance.apm.g.I(null);
        this.f3441c = this.b.f();
        this.i = this.b.m();
        e.b.b.j.c.e().g();
        if (this.h) {
            com.bytedance.apm.B.e eVar = new com.bytedance.apm.B.e();
            Objects.requireNonNull(this.b);
            eVar.G(null);
            eVar.c();
        }
        Objects.requireNonNull(this.b);
        com.bytedance.apm.B.l.i.n(null);
        Objects.requireNonNull(this.b);
        e.b.b.f.c.p().x(null);
        e.b.b.j.c.e().h(this.b.j());
        if (this.b.p() && !this.b.n()) {
            n();
        }
        com.bytedance.apm.A.a.b().a(this.b.b());
        com.bytedance.apm.data.pipeline.a k = com.bytedance.apm.data.pipeline.a.k();
        Objects.requireNonNull(k);
        ((IConfigManager) com.bytedance.news.common.service.manager.c.a(IConfigManager.class)).registerConfigListener(k);
        com.bytedance.apm.data.pipeline.d l2 = com.bytedance.apm.data.pipeline.d.l();
        Objects.requireNonNull(l2);
        ((IConfigManager) com.bytedance.news.common.service.manager.c.a(IConfigManager.class)).registerConfigListener(l2);
        com.bytedance.apm.data.pipeline.d l3 = com.bytedance.apm.data.pipeline.d.l();
        Objects.requireNonNull(this.b);
        l3.q(false);
        com.bytedance.apm.g.h();
        com.bytedance.apm.r.b.a(this.a.c());
        try {
            String c2 = x.c();
            if (!TextUtils.isEmpty(c2)) {
                com.bytedance.apm.g.k().put("bytrace_id", c2);
                com.bytedance.apm.g.k().put("pid", String.valueOf(Process.myPid()));
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        Objects.requireNonNull(this.b);
        com.bytedance.apm.F.b.e().h(new f());
        if (com.bytedance.apm.g.B()) {
            com.bytedance.apm.y.a.b("apm_debug", "delayRequestSeconds:0");
        }
        if (this.h) {
            String d2 = h.b.a.d("update_version_code");
            String optString = com.bytedance.apm.g.k().optString("update_version_code");
            if (TextUtils.equals(d2, optString)) {
                com.bytedance.apm.g.Z(2);
            } else {
                com.bytedance.apm.g.Z(1);
                h.b.a.g("update_version_code", optString);
            }
        }
        Context h = com.bytedance.apm.g.h();
        Set<com.bytedance.services.apm.api.h> set = this.i;
        if (set != null) {
            Iterator<com.bytedance.services.apm.api.h> it2 = set.iterator();
            while (it2.hasNext()) {
                try {
                    it2.next().init(h);
                } catch (Throwable unused2) {
                }
            }
        }
        k kVar = new k();
        kVar.b(this.b.d());
        Set<com.bytedance.services.apm.api.h> set2 = this.i;
        if (set2 != null) {
            Iterator<com.bytedance.services.apm.api.h> it3 = set2.iterator();
            while (it3.hasNext()) {
                try {
                    it3.next().notifyParams(kVar);
                } catch (Throwable unused3) {
                }
            }
        }
        Set<com.bytedance.services.apm.api.h> set3 = this.i;
        if (set3 != null) {
            Iterator<com.bytedance.services.apm.api.h> it4 = set3.iterator();
            while (it4.hasNext()) {
                try {
                    it4.next().start();
                } catch (Throwable unused4) {
                }
            }
        }
        com.bytedance.apm.F.b e2 = com.bytedance.apm.F.b.e();
        Objects.requireNonNull(this.b);
        e2.g(null);
        com.bytedance.apm.config.c cVar = this.b;
        List<String> d3 = cVar.d();
        if (!com.bytedance.android.input.k.b.a.a0(d3)) {
            try {
                String host = new URL(d3.get(0)).getHost();
                com.bytedance.android.input.k.b.a.a = host;
                com.bytedance.apm.r.g.a.a = "https://" + host + "/monitor/collect/c/logcollect";
            } catch (MalformedURLException unused5) {
            }
            ArrayList arrayList = new ArrayList(2);
            int size = d3.size();
            for (int i = 0; i < size; i++) {
                try {
                    String host2 = new URL(d3.get(i)).getHost();
                    if (!TextUtils.isEmpty(host2) && host2.indexOf(46) > 0) {
                        arrayList.add("https://" + host2 + "/monitor/collect/batch/");
                    }
                } catch (Exception unused6) {
                }
            }
            com.bytedance.apm6.consumer.slardar.send.b.e().q(arrayList);
        }
        com.bytedance.apm6.consumer.slardar.send.b.e().r(com.bytedance.apm.u.a.f3578c);
        com.bytedance.apm6.consumer.slardar.send.b.e().p(com.bytedance.apm.u.a.f3579d);
        List<String> g2 = cVar.g();
        com.bytedance.apm6.consumer.slardar.send.b.e().p(g2);
        if (!com.bytedance.android.input.k.b.a.a0(d3)) {
            String str = g2.get(0);
            if (!TextUtils.isEmpty(str)) {
                com.bytedance.article.common.monitor.stack.d.k(str);
            }
        }
        List<String> l4 = cVar.l();
        if (!com.bytedance.android.input.k.b.a.a0(l4)) {
            com.bytedance.apm6.consumer.slardar.send.b.e().r(l4);
        }
        Objects.requireNonNull(this.b);
        com.bytedance.apm.agent.tracing.a.j();
        com.bytedance.news.common.service.manager.c.d(IHttpService.class, new IHttpService() { // from class: com.bytedance.apm.internal.ApmDelegate.7
            @Override // com.bytedance.services.apm.api.IHttpService
            public com.bytedance.services.apm.api.g buildMultipartUpload(String str2, String str3, boolean z) throws Exception {
                return com.bytedance.apm.g.a(str2, str3, z);
            }

            @Override // com.bytedance.services.apm.api.IHttpService
            public com.bytedance.services.apm.api.c doGet(String str2, Map<String, String> map) throws Exception {
                return com.bytedance.apm.g.c(str2, map);
            }

            @Override // com.bytedance.services.apm.api.IHttpService
            public com.bytedance.services.apm.api.c doPost(String str2, byte[] bArr, Map<String, String> map) throws Exception {
                return com.bytedance.apm.g.d(str2, bArr, map);
            }

            @Override // com.bytedance.services.apm.api.IHttpService
            public com.bytedance.services.apm.api.c uploadFiles(String str2, List<File> list, Map<String, String> map) throws Exception {
                return com.bytedance.apm.g.e0(str2, list, map);
            }

            @Override // com.bytedance.services.apm.api.IHttpService
            public com.bytedance.services.apm.api.g buildMultipartUpload(String str2, String str3, boolean z, Map<String, String> map) throws Exception {
                return com.bytedance.apm.g.b(str2, str3, z, map);
            }
        });
        if (com.bytedance.apm.g.B()) {
            DoctorManager.getInstance().b(this.h ? "APM_START" : "APM_START_OTHER_PROCESS", this.b.toString());
        }
    }

    public void f(String str, long j, long j2, String str2, com.bytedance.apm.r.e eVar, com.bytedance.android.input.basic.a.b bVar) {
        if (this.k) {
            com.bytedance.apm.F.b.e().o(new com.bytedance.apm.internal.e(this, str, j, j2, str2, eVar, bVar));
        } else if (bVar != null) {
            bVar.a(false, com.bytedance.android.input.k.b.a.P(false, 9, null, null));
        }
    }

    public com.bytedance.apm.config.b g() {
        com.bytedance.apm.config.b bVar = this.a;
        return bVar == null ? new com.bytedance.apm.config.b(com.bytedance.apm.config.b.a()) : bVar;
    }

    public com.bytedance.services.apm.api.e h() {
        return this.f3441c;
    }

    public boolean j(String str) {
        SlardarConfigManagerImpl slardarConfigManagerImpl;
        if (!this.f3443e || (slardarConfigManagerImpl = this.f3442d) == null) {
            return false;
        }
        return slardarConfigManagerImpl.getLogTypeSwitch(str);
    }

    public boolean k(String str) {
        SlardarConfigManagerImpl slardarConfigManagerImpl;
        if (!this.f3443e || (slardarConfigManagerImpl = this.f3442d) == null) {
            return false;
        }
        return slardarConfigManagerImpl.getMetricTypeSwitch(str);
    }

    public boolean l(String str) {
        SlardarConfigManagerImpl slardarConfigManagerImpl;
        if (!this.f3443e || (slardarConfigManagerImpl = this.f3442d) == null) {
            return false;
        }
        return slardarConfigManagerImpl.getServiceSwitch(str);
    }

    public void m(@NonNull Context context, @NonNull com.bytedance.apm.config.b bVar) {
        Application application;
        if (this.f3444f) {
            return;
        }
        long nanoTime = System.nanoTime();
        this.f3444f = true;
        com.bytedance.apm.g.z();
        com.bytedance.apm.g.X(System.currentTimeMillis());
        System.currentTimeMillis();
        SystemClock.uptimeMillis();
        this.a = bVar;
        Objects.requireNonNull(bVar);
        com.bytedance.apm.util.j.d(null);
        com.bytedance.apm.v.a.i(bVar.d());
        com.bytedance.apm.v.a.j(false);
        e.b.b.d.a.j(false);
        if (context == null) {
            application = null;
        } else {
            application = (Application) (context instanceof Application ? context : context.getApplicationContext());
        }
        com.bytedance.apm.g.K(application);
        ActivityLifeObserver.init(application);
        com.bytedance.apm.g.S(System.nanoTime() - nanoTime);
        SlardarConfigManagerImpl slardarConfigManagerImpl = new SlardarConfigManagerImpl();
        this.f3442d = slardarConfigManagerImpl;
        slardarConfigManagerImpl.registerConfigListener(this);
        com.bytedance.news.common.service.manager.c.d(IConfigManager.class, this.f3442d);
        com.bytedance.news.common.service.manager.c.c(IApmAgent.class, new com.bytedance.apm.internal.a(this));
        com.bytedance.news.common.service.manager.c.c(ILaunchTrace.class, new com.bytedance.apm.internal.b(this));
        com.bytedance.news.common.service.manager.c.c(com.bytedance.services.apm.api.i.class, new com.bytedance.apm.internal.c(this));
        com.bytedance.news.common.service.manager.c.c(com.bytedance.services.apm.api.j.class, new com.bytedance.apm.internal.d(this));
        if (com.bytedance.apm.g.B()) {
            DoctorManager.getInstance().registerApmListener(new com.bytedance.apm.internal.f());
        }
        com.bytedance.apm.g.T(System.nanoTime() - nanoTime);
        com.bytedance.apm.g.L(null);
        this.h = com.bytedance.apm.g.F();
        Runnable b2 = e.b.b.a.b(context);
        com.bytedance.apm.g.U(System.nanoTime() - nanoTime);
        com.bytedance.apm.F.b.e().h(new b(bVar, context, b2));
        com.bytedance.apm.g.V(System.nanoTime() - nanoTime);
        if (this.h) {
            com.bytedance.apm.B.j.e.i(application, this.a.b());
            if (bVar.p()) {
                new com.bytedance.apm.G.d().k(bVar.h(), true);
            }
            AutoPageTraceHelper.c(bVar.h());
            com.bytedance.apm.agent.tracing.a.k(bVar.g());
            l = bVar.e();
            m = bVar.o();
            com.bytedance.apm.t.l.b.l(bVar.l());
            boolean n = bVar.n();
            com.bytedance.apm.t.l.d.i().k();
            com.bytedance.apm.t.l.d.i().p(false);
            com.bytedance.apm.t.l.d.i().o(false);
            com.bytedance.apm.t.l.d.i().p = false;
            Objects.requireNonNull(this.a);
            m.a = false;
            if (n) {
                com.bytedance.apm.t.l.b bVar2 = new com.bytedance.apm.t.l.b();
                e.b.j.b.a.k(new c(this, bVar2));
                Objects.requireNonNull(this.a);
                com.bytedance.apm.t.l.d.i().h(bVar2);
                com.bytedance.apm.t.l.d.i().q(bVar2);
            }
            initEvilMethodTraceInject();
            com.bytedance.apm.launch.evil.a.a();
            com.bytedance.apm.launch.a.b().e(bVar.f());
            com.bytedance.apm.g.R(System.nanoTime() - nanoTime);
            com.bytedance.apm.g.N(false);
            com.bytedance.apm.g.c0(bVar.q());
        }
        if (com.bytedance.apm.g.B()) {
            DoctorManager.getInstance().b(this.h ? "APM_INIT" : "APM_INIT_OTHER_PROCESS", bVar.toString());
        }
        com.bytedance.apm.g.W(System.nanoTime() - nanoTime);
    }

    public boolean o() {
        return this.f3443e;
    }

    @Override // com.bytedance.services.slardar.config.a
    public void onReady() {
        this.f3443e = true;
        JSONObject config = this.f3442d.getConfig();
        if (this.h) {
            new com.bytedance.apm.B.i().c();
            if (com.bytedance.android.input.k.b.a.q0(config, "performance_modules", "traffic", "enable_collect") == 1) {
                com.bytedance.apm.B.l.i.l().c();
            }
        }
        if (this.b.o()) {
            boolean z = com.bytedance.android.input.k.b.a.q0(config, "performance_modules", Scraps.BATTERY, "enable_upload") == 1;
            if (z) {
                if (com.bytedance.apm.util.a.b(com.bytedance.apm.g.h())) {
                    com.bytedance.apm.s.d.m().c();
                }
                new com.bytedance.apm.s.e().c();
            }
            if (z) {
                Objects.requireNonNull(this.b);
                com.bytedance.apm.s.a.B().C(false);
            } else {
                Objects.requireNonNull(this.b);
            }
            if ((com.bytedance.android.input.k.b.a.q0(config, "performance_modules", Scraps.BATTERY, "power_monitor_enable") == 1) && com.bytedance.apm.util.a.b(com.bytedance.apm.g.h())) {
                com.bytedance.apm.s.g.l().c();
            }
            if (com.bytedance.android.input.k.b.a.q0(config, "performance_modules", Scraps.BATTERY, "temperature_enable_upload") == 1) {
                Objects.requireNonNull(this.b);
                if (com.bytedance.apm.util.a.b(com.bytedance.apm.g.h())) {
                    com.bytedance.apm.s.f.q().r(false);
                }
            } else {
                Objects.requireNonNull(this.b);
            }
        }
        if (this.b.n() && com.bytedance.apm.B.b.a().d("block_monitor")) {
            n();
        }
    }

    @Override // com.bytedance.services.slardar.config.a
    public void onRefresh(JSONObject jSONObject, boolean z) {
        JSONObject optJSONObject = jSONObject.optJSONObject("general");
        if (optJSONObject != null) {
            this.k = optJSONObject.optBoolean("enable_active_upload_alog", true);
        } else {
            this.k = true;
        }
    }

    public void q(@NonNull com.bytedance.apm.config.c cVar) {
        if (!this.f3444f) {
            throw new IllegalArgumentException("You must call Apm.getInstance().init() on Application.onCreate from version 5.x.x, pls call init() before start().");
        }
        if (cVar == null) {
            throw new IllegalArgumentException("startConfig must not be allowed");
        }
        if (this.f3445g) {
            return;
        }
        com.bytedance.apm.F.b.e().m();
        this.f3445g = true;
        this.b = cVar;
        com.bytedance.apm.F.b.e().h(new d());
    }

    ApmDelegate(b bVar) {
    }
}
