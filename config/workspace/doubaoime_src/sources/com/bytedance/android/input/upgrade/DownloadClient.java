package com.bytedance.android.input.upgrade;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.bytedance.android.input.h.d;
import com.bytedance.android.input.r.j;
import com.obric.common.upgrade.VersionCheckResponse;
import java.util.ArrayList;
import java.util.List;
import kotlin.o;
import kotlin.s.c.g;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public final class DownloadClient implements IBinder.DeathRecipient {
    public static final a k = new a(null);
    private static volatile DownloadClient l;
    private final Context a;
    private final boolean b;

    /* renamed from: c, reason: collision with root package name */
    private com.bytedance.android.input.h.b f3213c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f3214d;

    /* renamed from: e, reason: collision with root package name */
    private VersionCheckResponse f3215e;
    private c h;
    private final com.bytedance.android.input.upgrade.d j;

    /* renamed from: f, reason: collision with root package name */
    private DownloadStatus f3216f = DownloadStatus.NOT_STARTED;

    /* renamed from: g, reason: collision with root package name */
    private final List<b> f3217g = new ArrayList();
    private final e i = new e(this);

    public enum DownloadStatus {
        NOT_STARTED,
        IN_PROGRESS,
        SUCCESS,
        FAILED
    }

    public static final class a {
        public a(g gVar) {
        }

        public final DownloadClient a(Context context, boolean z) {
            l.f(context, "context");
            DownloadClient downloadClient = DownloadClient.l;
            if (downloadClient == null) {
                synchronized (this) {
                    downloadClient = DownloadClient.l;
                    if (downloadClient == null) {
                        Context applicationContext = context.getApplicationContext();
                        l.e(applicationContext, "context.applicationContext");
                        downloadClient = new DownloadClient(applicationContext, z, null);
                        DownloadClient.l = downloadClient;
                    }
                }
            }
            return downloadClient;
        }
    }

    public interface b {
        void a(int i, String str);

        void b(VersionCheckResponse versionCheckResponse);

        void c(int i, long j, long j2, String str);
    }

    public interface c {
        void a();
    }

    public static final class d extends d.a {
        final /* synthetic */ kotlin.s.b.l<VersionCheckResponse, o> b;

        /* JADX WARN: Multi-variable type inference failed */
        d(kotlin.s.b.l<? super VersionCheckResponse, o> lVar) {
            this.b = lVar;
        }

        @Override // com.bytedance.android.input.h.d
        public void R(VersionCheckResponse versionCheckResponse) {
            l.f(versionCheckResponse, "response");
            this.b.invoke(versionCheckResponse);
        }
    }

    public DownloadClient(Context context, boolean z, g gVar) {
        this.a = context;
        this.b = z;
        m();
        this.j = new com.bytedance.android.input.upgrade.d(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u(VersionCheckResponse versionCheckResponse) {
        if (this.f3214d) {
            try {
                this.f3216f = DownloadStatus.IN_PROGRESS;
                com.bytedance.android.input.h.b bVar = this.f3213c;
                if (bVar != null) {
                    bVar.Z(versionCheckResponse, this.b);
                }
            } catch (Exception e2) {
                j.k("ImeDownload", "Error starting download", e2);
                e2.printStackTrace();
            }
        }
    }

    @Override // android.os.IBinder.DeathRecipient
    public void binderDied() {
        IBinder asBinder;
        try {
            j.r("ImeDownload", "Service has died. Reconnecting...");
            com.bytedance.android.input.h.b bVar = this.f3213c;
            if (bVar != null && (asBinder = bVar.asBinder()) != null) {
                asBinder.unlinkToDeath(this, 0);
            }
            this.f3214d = false;
            this.f3213c = null;
            m();
        } catch (Exception e2) {
            e.a.a.a.a.o0("binderDied error: ", e2, "ImeDownload");
        }
    }

    public final void m() {
        if (this.f3214d) {
            return;
        }
        try {
            Intent intent = new Intent();
            intent.setAction("com.bytedance.android.doubaoime.upgrade.AppUpgradeDownloadService");
            intent.setPackage(this.a.getPackageName());
            this.a.bindService(intent, this.i, 1);
        } catch (Exception e2) {
            StringBuilder M = e.a.a.a.a.M("bindService error: ");
            M.append(e2.getMessage());
            j.m("ImeDownload", M.toString());
        }
    }

    public final void n(boolean z, String str, kotlin.s.b.l<? super VersionCheckResponse, o> lVar) {
        l.f(lVar, "block");
        if (!this.f3214d) {
            j.m("ImeDownload", "服务没有绑定");
            return;
        }
        try {
            com.bytedance.android.input.h.b bVar = this.f3213c;
            if (bVar != null) {
                bVar.J(z, str, new d(lVar));
            }
        } catch (Exception e2) {
            j.k("ImeDownload", "Error checking for upgrade", e2);
            e2.printStackTrace();
        }
    }

    public final DownloadStatus o() {
        return this.f3216f;
    }

    public final void p(long j, boolean z) {
        if (this.f3214d) {
            try {
                j.m("ImeDownload", "忽略版本 " + j);
                com.bytedance.android.input.h.b bVar = this.f3213c;
                if (bVar != null) {
                    bVar.X(j, z);
                }
            } catch (Exception e2) {
                j.k("ImeDownload", "Error ignoring version", e2);
                e2.printStackTrace();
            }
        }
    }

    public final boolean q() {
        return this.f3214d;
    }

    public final void r(b bVar) {
        l.f(bVar, "listener");
        if (this.f3217g.contains(bVar)) {
            return;
        }
        this.f3217g.add(bVar);
    }

    public final void s(c cVar) {
        l.f(cVar, "callback");
        this.h = cVar;
    }

    public final void t(VersionCheckResponse versionCheckResponse) {
        l.f(versionCheckResponse, "response");
        if (this.f3214d) {
            u(versionCheckResponse);
        } else {
            this.f3215e = versionCheckResponse;
        }
    }

    public final void v() {
        if (this.f3214d) {
            try {
                com.bytedance.android.input.h.b bVar = this.f3213c;
                if (bVar != null) {
                    bVar.m();
                }
            } catch (Exception e2) {
                j.k("ImeDownload", "Error triggering late initializer", e2);
            }
        }
    }

    public final void w(b bVar) {
        l.f(bVar, "listener");
        this.f3217g.remove(bVar);
    }
}
