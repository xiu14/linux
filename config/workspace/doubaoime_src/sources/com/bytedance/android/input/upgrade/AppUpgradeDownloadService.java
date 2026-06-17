package com.bytedance.android.input.upgrade;

import android.app.Application;
import android.app.Service;
import android.content.Intent;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.RemoteException;
import com.bytedance.android.doubaoime.ImeApplication;
import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.android.input.g;
import com.bytedance.android.input.h.b;
import com.bytedance.android.input.r.j;
import com.obric.common.upgrade.VersionCheckResponse;
import com.obric.common.upgrade.h;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.o;
import kotlin.s.b.l;
import kotlin.s.c.m;

/* loaded from: classes.dex */
public final class AppUpgradeDownloadService extends Service {
    private boolean b;

    /* renamed from: c, reason: collision with root package name */
    private VersionCheckResponse f3211c;
    private final CopyOnWriteArrayList<com.bytedance.android.input.h.a> a = new CopyOnWriteArrayList<>();

    /* renamed from: d, reason: collision with root package name */
    private final a f3212d = new a();

    public static final class a extends b.a {

        /* renamed from: com.bytedance.android.input.upgrade.AppUpgradeDownloadService$a$a, reason: collision with other inner class name */
        static final class C0100a extends m implements l<VersionCheckResponse, o> {
            final /* synthetic */ AppUpgradeDownloadService a;
            final /* synthetic */ com.bytedance.android.input.h.d b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0100a(AppUpgradeDownloadService appUpgradeDownloadService, com.bytedance.android.input.h.d dVar) {
                super(1);
                this.a = appUpgradeDownloadService;
                this.b = dVar;
            }

            @Override // kotlin.s.b.l
            public o invoke(VersionCheckResponse versionCheckResponse) {
                com.bytedance.android.input.h.d dVar;
                VersionCheckResponse versionCheckResponse2 = versionCheckResponse;
                kotlin.s.c.l.f(versionCheckResponse2, "it");
                try {
                    if (AppUpgradeDownloadService.f(this.a) && (dVar = this.b) != null) {
                        dVar.R(versionCheckResponse2);
                    }
                } catch (DeadObjectException e2) {
                    StringBuilder M = e.a.a.a.a.M("DeadObjectException in check: ");
                    M.append(e2.getMessage());
                    j.j("ImeDownload", M.toString());
                }
                return o.a;
            }
        }

        public static final class b implements com.obric.common.upgrade.j {
            final /* synthetic */ AppUpgradeDownloadService a;

            b(AppUpgradeDownloadService appUpgradeDownloadService) {
                this.a = appUpgradeDownloadService;
            }

            @Override // com.obric.common.upgrade.j
            public void a(int i, String str) {
                kotlin.s.c.l.f(str, "errorMsg");
                AppUpgradeDownloadService.d(this.a, i, str);
                this.a.b = false;
            }

            @Override // com.obric.common.upgrade.j
            public void b(VersionCheckResponse versionCheckResponse) {
                kotlin.s.c.l.f(versionCheckResponse, "response");
                AppUpgradeDownloadService.e(this.a, versionCheckResponse);
                this.a.b = false;
            }

            @Override // com.obric.common.upgrade.j
            public void c(int i, long j, long j2, String str) {
                AppUpgradeDownloadService.i(this.a, i, j, j2, str);
                this.a.b = true;
            }
        }

        a() {
        }

        @Override // com.bytedance.android.input.h.b
        public void J(boolean z, String str, com.bytedance.android.input.h.d dVar) {
            Application application = ImeApplication.f1883e;
            kotlin.s.c.l.e(application, "sApplication");
            f.a(application, str);
            if (h.f7570d == null) {
                throw new IllegalStateException("AppUpgradeManager 还未初始化，请先调用 init 方法。".toString());
            }
            h hVar = h.f7570d;
            kotlin.s.c.l.c(hVar);
            hVar.e(z, new C0100a(AppUpgradeDownloadService.this, dVar));
        }

        @Override // com.bytedance.android.input.h.b
        public void K(com.bytedance.android.input.h.a aVar) {
            kotlin.s.c.l.f(aVar, "callback");
            if (AppUpgradeDownloadService.this.a.contains(aVar)) {
                return;
            }
            AppUpgradeDownloadService.this.a.add(aVar);
        }

        @Override // com.bytedance.android.input.h.b
        public void X(long j, boolean z) {
            Application application = ImeApplication.f1883e;
            kotlin.s.c.l.e(application, "sApplication");
            f.b(application, null, 2);
            if (h.f7570d == null) {
                throw new IllegalStateException("AppUpgradeManager 还未初始化，请先调用 init 方法。".toString());
            }
            h hVar = h.f7570d;
            kotlin.s.c.l.c(hVar);
            hVar.l(j, z);
        }

        @Override // com.bytedance.android.input.h.b
        public void Z(VersionCheckResponse versionCheckResponse, boolean z) {
            kotlin.s.c.l.f(versionCheckResponse, "response");
            j.m("ImeDownload", " service中 收到startDownload请求");
            try {
                Application application = ImeApplication.f1883e;
                kotlin.s.c.l.e(application, "sApplication");
                f.b(application, null, 2);
                if (AppUpgradeDownloadService.this.b) {
                    return;
                }
                AppUpgradeDownloadService.this.b = true;
                AppUpgradeDownloadService.this.f3211c = versionCheckResponse;
                if (h.f7570d == null) {
                    throw new IllegalStateException("AppUpgradeManager 还未初始化，请先调用 init 方法。".toString());
                }
                h hVar = h.f7570d;
                kotlin.s.c.l.c(hVar);
                hVar.g(z, versionCheckResponse, new b(AppUpgradeDownloadService.this));
            } catch (Exception e2) {
                e.a.a.a.a.o0("startDownload error: ", e2, "ImeDownload");
            }
        }

        public VersionCheckResponse h() {
            return AppUpgradeDownloadService.this.f3211c;
        }

        public void l(com.bytedance.android.input.h.a aVar) {
            kotlin.s.c.l.f(aVar, "callback");
            AppUpgradeDownloadService.this.a.remove(aVar);
        }

        @Override // com.bytedance.android.input.h.b
        public void m() {
            j.m("ImeDownload", "Manually triggering AppLateInitializer from binder call.");
            g.c(AppUpgradeDownloadService.this.getApplicationContext());
        }
    }

    public static final void d(AppUpgradeDownloadService appUpgradeDownloadService, int i, String str) {
        Iterator<com.bytedance.android.input.h.a> it2 = appUpgradeDownloadService.a.iterator();
        while (it2.hasNext()) {
            com.bytedance.android.input.h.a next = it2.next();
            try {
                next.a(i, str);
            } catch (RemoteException e2) {
                StringBuilder M = e.a.a.a.a.M("Error updating result: ");
                M.append(e2.getMessage());
                j.j("ImeDownload", M.toString());
                appUpgradeDownloadService.a.remove(next);
            }
        }
    }

    public static final void e(AppUpgradeDownloadService appUpgradeDownloadService, VersionCheckResponse versionCheckResponse) {
        Iterator<com.bytedance.android.input.h.a> it2 = appUpgradeDownloadService.a.iterator();
        while (it2.hasNext()) {
            com.bytedance.android.input.h.a next = it2.next();
            try {
                next.b(versionCheckResponse);
            } catch (RemoteException e2) {
                StringBuilder M = e.a.a.a.a.M("Error updating result: ");
                M.append(e2.getMessage());
                j.j("ImeDownload", M.toString());
                appUpgradeDownloadService.a.remove(next);
            }
        }
    }

    public static final boolean f(AppUpgradeDownloadService appUpgradeDownloadService) {
        Objects.requireNonNull(appUpgradeDownloadService);
        try {
            return appUpgradeDownloadService.f3212d.pingBinder();
        } catch (Exception unused) {
            return false;
        }
    }

    public static final void i(AppUpgradeDownloadService appUpgradeDownloadService, int i, long j, long j2, String str) {
        Iterator<com.bytedance.android.input.h.a> it2 = appUpgradeDownloadService.a.iterator();
        while (it2.hasNext()) {
            com.bytedance.android.input.h.a next = it2.next();
            try {
                next.c(i, j, j2, str);
            } catch (RemoteException e2) {
                StringBuilder M = e.a.a.a.a.M("Error updating progress: ");
                M.append(e2.getMessage());
                j.j("ImeDownload", M.toString());
                appUpgradeDownloadService.a.remove(next);
            }
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        IAppGlobals.a.getContext();
        j.m("ImeDownload", "onBind processName = " + d.a.b.a.e());
        return this.f3212d;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        j.m("ImeDownload", "Service creating.");
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        j.m("ImeDownload", "Service destroying.");
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        j.m("ImeDownload", "onStartCommand received.");
        IAppGlobals.a.getContext();
        j.m("ImeDownload", "onStartCommand processName = " + d.a.b.a.e());
        return super.onStartCommand(intent, i, i2);
    }
}
