package com.bytedance.android.input.r;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.android.input.common.SettingsConfigNext;
import com.bytedance.android.input.environment.api.IProjectMode;
import com.bytedance.android.input.popup.WindowId;
import com.bytedance.android.input.popup.h;
import com.bytedance.android.input.popup.q;
import com.bytedance.apm.config.a;
import com.bytedance.apm.config.b;
import com.bytedance.apm.config.c;
import com.bytedance.apm.util.n;
import com.bytedance.common.utility.NetworkUtils;
import com.bytedance.memory.MemoryWidget;
import com.bytedance.memory.e.a;
import com.ss.android.c.d;
import java.io.File;
import java.util.Objects;
import kotlin.s.c.l;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: f, reason: collision with root package name */
    public static final j f3013f = new j();
    private com.bytedance.android.input.popup.i b;

    /* renamed from: c, reason: collision with root package name */
    private com.bytedance.android.input.popup.h f3014c;
    private boolean a = false;

    /* renamed from: d, reason: collision with root package name */
    private boolean f3015d = false;

    /* renamed from: e, reason: collision with root package name */
    private final Handler f3016e = new Handler(Looper.getMainLooper());

    class a implements Runnable {
        final /* synthetic */ Context a;

        a(Context context) {
            this.a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            IAppGlobals.a aVar = IAppGlobals.a;
            Objects.requireNonNull(aVar);
            Context context = aVar.getContext();
            boolean h = NetworkUtils.h(context);
            Context context2 = this.a;
            int i = C0838R.string.tip_feedback_rep;
            if (context2 == null) {
                if (j.this.b == null) {
                    j.c(j.this);
                }
                com.bytedance.android.input.popup.i iVar = j.this.b;
                if (!h) {
                    i = C0838R.string.tip_feedback_neterror;
                } else if (!j.this.f3015d) {
                    i = C0838R.string.tip_feedback;
                }
                iVar.B(i);
                q.f().m(j.this.b, 0);
            } else {
                if (j.this.f3014c == null) {
                    j.g(j.this, this.a);
                }
                j.this.f3014c.g(!h ? context.getString(C0838R.string.tip_feedback_neterror) : j.this.f3015d ? context.getString(C0838R.string.tip_feedback_rep) : context.getString(C0838R.string.tip_feedback));
                try {
                    j.this.f3014c.show();
                } catch (Exception e2) {
                    e2.printStackTrace();
                    return;
                }
            }
            if (j.this.f3015d || !h) {
                return;
            }
            j.this.q("input", 8);
            j.this.f3015d = true;
            j.this.f3016e.postDelayed(new Runnable() { // from class: com.bytedance.android.input.r.a
                @Override // java.lang.Runnable
                public final void run() {
                    j.this.f3015d = false;
                }
            }, com.heytap.mcssdk.constant.a.f6886d);
        }
    }

    private j() {
    }

    public static void a(Context context) {
        j jVar = f3013f;
        if (jVar.a) {
            return;
        }
        Objects.requireNonNull(jVar);
        a.b a2 = com.bytedance.apm.config.a.a();
        a2.g(false);
        a2.h(true);
        a2.j(com.heytap.mcssdk.constant.a.f6886d);
        a2.i(true);
        a2.f(new com.bytedance.apm.B.j.f() { // from class: com.bytedance.android.input.common_biz.performance.c
        });
        com.bytedance.apm.config.a aVar = new com.bytedance.apm.config.a(a2);
        l.e(aVar, "builder()\n            .g…   }\n            .build()");
        b.C0115b a3 = com.bytedance.apm.config.b.a();
        a3.s(true);
        a3.v(true);
        a3.q(true);
        a3.u(true);
        a3.r(1000L);
        a3.o(300);
        a3.x(1);
        a3.w(30000L);
        a3.t(20000000L);
        a3.p(aVar);
        a3.n(true);
        com.bytedance.apm.b.a().b(context, new com.bytedance.apm.config.b(a3));
        c.b a4 = com.bytedance.apm.config.c.a();
        IAppGlobals.a aVar2 = IAppGlobals.a;
        Objects.requireNonNull(aVar2);
        a4.a(401734);
        a4.c("1.3.9");
        a4.i(d.a.b.a.c(aVar2));
        a4.o(String.valueOf(100309006));
        a4.j(com.bytedance.applog.a.c());
        a4.m(n.c());
        a4.e(true);
        a4.n(true);
        a4.g(2500L);
        a4.p(true);
        a4.f(true);
        a4.q(new e.h.a.c());
        a4.d(true);
        a.C0271a c0271a = new a.C0271a();
        c0271a.b(f.a);
        a4.q(new MemoryWidget(c0271a.a(), null));
        a4.l(c.a);
        a4.b(new com.bytedance.apm.x.a() { // from class: com.bytedance.android.input.r.e
            @Override // com.bytedance.apm.x.a
            public final void a(String str, String str2, JSONObject jSONObject) {
                j jVar2 = j.f3013f;
                IAppGlobals.a aVar3 = IAppGlobals.a;
                Objects.requireNonNull(aVar3);
                aVar3.j("AlogHelper", "[MemoryAnalysis]  logType: " + str + "  logSubType: " + str2 + "  log: " + jSONObject);
            }
        });
        a4.k(new h(jVar));
        com.bytedance.apm.b.a().c(a4.h());
        Objects.requireNonNull(jVar);
        Objects.requireNonNull(aVar2);
        File externalFilesDir = aVar2.F() ? context.getExternalFilesDir("") : context.getFilesDir();
        String s = externalFilesDir != null ? e.a.a.a.a.s(externalFilesDir.getAbsolutePath(), "/logs") : "";
        d.b bVar = new d.b(context);
        bVar.c(20971520);
        bVar.e(true);
        bVar.d(true);
        bVar.b(s);
        if (!com.ss.android.c.a.m(bVar.a())) {
            Log.e("AlogHelper", "InitAlog: init falied");
        }
        d.a.b.a.g(aVar2);
        Log.d("AlogHelper", "InitAlog: init isDebugMode=false");
        if (d.a.b.a.h(aVar2)) {
            boolean booleanValue = ((Boolean) SettingsConfigNext.f(context.getString(C0838R.string.enable_alog_log))).booleanValue();
            com.ss.android.c.a.s(booleanValue);
            com.ss.android.c.a.d(booleanValue ? 3 : 4);
        } else {
            com.ss.android.c.a.s(false);
            com.ss.android.c.a.d(4);
        }
        e.h.a.a.l(new i(jVar));
        jVar.a = true;
    }

    static void c(final j jVar) {
        Objects.requireNonNull(jVar);
        IAppGlobals.a aVar = IAppGlobals.a;
        Objects.requireNonNull(aVar);
        Context context = aVar.getContext();
        com.bytedance.android.input.popup.i iVar = new com.bytedance.android.input.popup.i(context, WindowId.CONFIRM_SPEECH_PERMISSION, 0);
        jVar.b = iVar;
        iVar.C(context.getString(C0838R.string.tip_feedback));
        jVar.b.t("");
        jVar.b.A(context.getString(C0838R.string.option_ok));
        jVar.b.u(true);
        jVar.b.y(new View.OnClickListener() { // from class: com.bytedance.android.input.r.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                j.this.o(view);
            }
        });
    }

    static void g(final j jVar, Context context) {
        Objects.requireNonNull(jVar);
        h.b bVar = new h.b(context);
        bVar.b("");
        IAppGlobals.a aVar = IAppGlobals.a;
        Objects.requireNonNull(aVar);
        bVar.d(aVar.getContext().getString(C0838R.string.option_ok));
        com.bytedance.android.input.popup.h a2 = bVar.a();
        jVar.f3014c = a2;
        a2.a();
        jVar.f3014c.f(new View.OnClickListener() { // from class: com.bytedance.android.input.r.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                j.this.n(view);
            }
        });
    }

    public static void i(String str, String str2) {
        if (f3013f.a) {
            com.ss.android.c.a.g(str, str2);
            return;
        }
        IProjectMode iProjectMode = (IProjectMode) com.bytedance.news.common.service.manager.c.a(IProjectMode.class);
        if (iProjectMode != null) {
            iProjectMode.androidLog(3, str, str2, null);
        }
    }

    public static void j(String str, String str2) {
        if (f3013f.a) {
            com.ss.android.c.a.h(str, str2);
            return;
        }
        IProjectMode iProjectMode = (IProjectMode) com.bytedance.news.common.service.manager.c.a(IProjectMode.class);
        if (iProjectMode != null) {
            iProjectMode.androidLog(6, str, str2, null);
        }
    }

    public static void k(String str, String str2, Throwable th) {
        if (f3013f.a) {
            com.ss.android.c.a.i(str, str2, th);
            return;
        }
        IProjectMode iProjectMode = (IProjectMode) com.bytedance.news.common.service.manager.c.a(IProjectMode.class);
        if (iProjectMode != null) {
            iProjectMode.androidLog(6, str, str2, th);
        }
    }

    public static void l(String str, Throwable th) {
        if (f3013f.a) {
            com.ss.android.c.a.j(str, th);
            return;
        }
        IProjectMode iProjectMode = (IProjectMode) com.bytedance.news.common.service.manager.c.a(IProjectMode.class);
        if (iProjectMode != null) {
            iProjectMode.androidLog(6, str, "", th);
        }
    }

    public static void m(String str, String str2) {
        if (f3013f.a) {
            com.ss.android.c.a.l(str, str2);
            return;
        }
        IProjectMode iProjectMode = (IProjectMode) com.bytedance.news.common.service.manager.c.a(IProjectMode.class);
        if (iProjectMode != null) {
            iProjectMode.androidLog(4, str, str2, null);
        }
    }

    public static void r(String str, String str2) {
        if (f3013f.a) {
            com.ss.android.c.a.u(str, str2);
            return;
        }
        IProjectMode iProjectMode = (IProjectMode) com.bytedance.news.common.service.manager.c.a(IProjectMode.class);
        if (iProjectMode != null) {
            iProjectMode.androidLog(5, str, str2, null);
        }
    }

    public /* synthetic */ void n(View view) {
        this.f3014c.dismiss();
    }

    public /* synthetic */ void o(View view) {
        if (this.b.isShowing()) {
            q.f().d(this.b.f());
            this.b = null;
        }
    }

    public void p(Context context) {
        if (f3013f.a) {
            this.f3016e.post(new a(context));
        } else {
            Log.e("AlogHelper", "Alog is not initialized!");
        }
    }

    public void q(String str, int i) {
        if (!f3013f.a) {
            Log.e("AlogHelper", "Alog is not initialized!");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        Long valueOf = Long.valueOf(currentTimeMillis - (i * 3600000));
        Long valueOf2 = Long.valueOf(currentTimeMillis);
        com.ss.android.c.d dVar = com.ss.android.c.a.b;
        if (dVar == null || TextUtils.isEmpty(dVar.g())) {
            StringBuilder M = e.a.a.a.a.M("[uploadAlogInternal] Error : ");
            M.append(com.ss.android.c.a.b);
            i("AlogHelper", M.toString() == null ? "ALog.sConfig is null" : "Alog logDirPath is empty!");
        } else {
            i("AlogHelper", "uploadAlogInternal begin");
            com.bytedance.apm.c.a(com.ss.android.c.a.b.g(), valueOf.longValue() / 1000, valueOf2.longValue() / 1000, str, new com.bytedance.apm.r.e() { // from class: com.bytedance.android.input.r.b
                @Override // com.bytedance.apm.r.e
                public final void a() {
                    j jVar = j.f3013f;
                    com.ss.android.c.a.c();
                    try {
                        Thread.sleep(1000L);
                    } catch (InterruptedException e2) {
                        throw new RuntimeException(e2);
                    }
                }
            }, null);
            i("AlogHelper", "uploadAlogInternal end");
        }
    }
}
