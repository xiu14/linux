package com.bytedance.apm6.hub.z.j;

import android.text.TextUtils;
import com.bytedance.apm6.util.timetask.AsyncTaskManagerType;
import com.bytedance.news.common.service.manager.c;
import com.bytedance.services.slardar.config.IConfigManager;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class a {
    private static volatile a i;
    private volatile boolean a = false;
    private List<com.bytedance.apm6.hub.z.j.b> b;

    /* renamed from: c, reason: collision with root package name */
    private volatile JSONObject f3715c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f3716d;

    /* renamed from: e, reason: collision with root package name */
    private volatile boolean f3717e;

    /* renamed from: f, reason: collision with root package name */
    private com.bytedance.apm6.util.timetask.a f3718f;

    /* renamed from: g, reason: collision with root package name */
    private IConfigManager f3719g;
    private com.bytedance.apm6.util.timetask.a h;

    /* renamed from: com.bytedance.apm6.hub.z.j.a$a, reason: collision with other inner class name */
    class C0140a extends com.bytedance.apm6.util.timetask.a {
        C0140a(long j, long j2) {
            super(j, j2);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (TextUtils.isEmpty(e.b.b.h.c.a.l())) {
                e.b.b.n.g.b.a("APM-Config", "DeviceId not ready. try again later.");
                return;
            }
            if (a.this.f3715c == null) {
                if (e.b.b.n.a.b()) {
                    StringBuilder M = e.a.a.a.a.M("DeviceId ready. initConfig with device_id=");
                    M.append(e.b.b.h.c.a.l());
                    e.b.b.n.g.b.a("APM-Config", M.toString());
                }
                a.b(a.this);
            } else if (e.b.b.n.a.b()) {
                e.b.b.n.g.b.a("APM-Config", "config is ready");
            }
            com.bytedance.apm6.util.timetask.b.a(AsyncTaskManagerType.LIGHT_WEIGHT).b(a.this.f3718f);
        }
    }

    class b implements com.bytedance.services.slardar.config.a {

        /* renamed from: com.bytedance.apm6.hub.z.j.a$b$a, reason: collision with other inner class name */
        class C0141a extends com.bytedance.apm6.util.timetask.a {

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ JSONObject f3721d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ boolean f3722e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0141a(JSONObject jSONObject, boolean z) {
                super(0L, 0L);
                this.f3721d = jSONObject;
                this.f3722e = z;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    com.bytedance.apm6.util.timetask.b.a(AsyncTaskManagerType.LIGHT_WEIGHT).b(a.this.h);
                    a.this.h = null;
                    a.this.j(this.f3721d, this.f3722e);
                    if (e.b.b.n.a.b()) {
                        e.b.b.n.g.b.a("APM-Config", "updateCurrentConfig:" + this.f3721d);
                    }
                } catch (Exception e2) {
                    e.b.b.n.g.b.c("APM-Config", "onConfigChanged", e2);
                }
            }
        }

        b() {
        }

        @Override // com.bytedance.services.slardar.config.a
        public void onReady() {
        }

        @Override // com.bytedance.services.slardar.config.a
        public void onRefresh(JSONObject jSONObject, boolean z) {
            if (jSONObject == null) {
                return;
            }
            try {
                if (e.b.b.n.a.b()) {
                    e.b.b.n.g.b.a("APM-Config", "onRefresh:" + z + " " + jSONObject);
                }
                if (e.b.b.h.c.a.y() && a.this.f3715c != null && z) {
                    return;
                }
                a.this.h = new C0141a(new JSONObject(jSONObject.toString()), z);
                com.bytedance.apm6.util.timetask.b.a(AsyncTaskManagerType.LIGHT_WEIGHT).c(a.this.h);
            } catch (Exception unused) {
            }
        }
    }

    private a() {
    }

    static void b(a aVar) {
        if (aVar.f3719g == null) {
            aVar.f3719g = (IConfigManager) c.a(IConfigManager.class);
        }
        IConfigManager iConfigManager = aVar.f3719g;
        if (iConfigManager == null) {
            return;
        }
        String queryConfig = iConfigManager.queryConfig();
        if (e.b.b.n.a.b()) {
            e.b.b.n.g.b.a("APM-Config", "initConfig:" + queryConfig);
        }
        try {
            if (TextUtils.isEmpty(queryConfig)) {
                return;
            }
            aVar.j(new JSONObject(queryConfig), true);
        } catch (Exception unused) {
        }
    }

    public static a g() {
        if (i == null) {
            synchronized (a.class) {
                if (i == null) {
                    i = new a();
                }
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j(JSONObject jSONObject, boolean z) {
        if (e.b.b.n.b.c(jSONObject)) {
            return;
        }
        this.f3715c = jSONObject;
        this.f3716d = z;
        this.f3717e = true;
        List<com.bytedance.apm6.hub.z.j.b> list = this.b;
        if (list != null) {
            Iterator<com.bytedance.apm6.hub.z.j.b> it2 = list.iterator();
            while (it2.hasNext()) {
                try {
                    it2.next().a(jSONObject, z);
                } catch (Throwable unused) {
                }
            }
        }
    }

    public synchronized void h() {
        if (this.a) {
            return;
        }
        this.a = true;
        if (e.b.b.h.c.a.y()) {
            this.f3718f = new C0140a(500L, 1000L);
            com.bytedance.apm6.util.timetask.b.a(AsyncTaskManagerType.LIGHT_WEIGHT).c(this.f3718f);
        }
        IConfigManager iConfigManager = (IConfigManager) c.a(IConfigManager.class);
        this.f3719g = iConfigManager;
        iConfigManager.registerConfigListener(new b());
    }

    public void i(com.bytedance.apm6.hub.z.j.b bVar) {
        if (this.b == null) {
            this.b = new CopyOnWriteArrayList();
        }
        if (!this.b.contains(bVar)) {
            this.b.add(bVar);
        }
        if (this.f3717e) {
            bVar.a(this.f3715c, this.f3716d);
        }
    }
}
