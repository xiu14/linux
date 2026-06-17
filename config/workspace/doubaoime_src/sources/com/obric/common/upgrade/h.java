package com.obric.common.upgrade;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.text.TextUtils;
import android.widget.Toast;
import androidx.core.content.FileProvider;
import com.obric.common.upgrade.n.a;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.o;

@SourceDebugExtension({"SMAP\nAppUpgradeManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppUpgradeManager.kt\ncom/obric/common/upgrade/AppUpgradeManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,301:1\n1#2:302\n*E\n"})
/* loaded from: classes2.dex */
public final class h {

    /* renamed from: d, reason: collision with root package name */
    private static h f7570d;

    /* renamed from: e, reason: collision with root package name */
    private static boolean f7571e;
    private final Context a;
    private l b;

    /* renamed from: c, reason: collision with root package name */
    private final String f7572c = "obric_app_upgrade";

    public h(Context context, l lVar, kotlin.s.c.g gVar) {
        this.a = context;
        this.b = lVar;
    }

    private final VersionCheckResponse f(int i) {
        return new VersionCheckResponse(false, -1L, "", "", "", -1, null, null, i, false, 0L, 1728);
    }

    public static final h j() {
        if (f7570d == null) {
            throw new IllegalStateException("AppUpgradeManager 还未初始化，请先调用 init 方法。".toString());
        }
        h hVar = f7570d;
        kotlin.s.c.l.c(hVar);
        return hVar;
    }

    public static void o(h hVar, VersionCheckResponse versionCheckResponse, j jVar) {
        com.obric.common.upgrade.n.a aVar;
        kotlin.s.c.l.f(hVar, "this$0");
        kotlin.s.c.l.f(versionCheckResponse, "$response");
        kotlin.s.c.l.f(jVar, "$listener");
        a.C0356a c0356a = com.obric.common.upgrade.n.a.f7593f;
        Context context = hVar.a;
        kotlin.s.c.l.f(context, "context");
        kotlin.s.c.l.f(versionCheckResponse, "upgradeInfo");
        aVar = com.obric.common.upgrade.n.a.f7594g;
        if (aVar != null) {
            aVar.b = versionCheckResponse;
        } else {
            synchronized (c0356a) {
                aVar = com.obric.common.upgrade.n.a.f7594g;
                if (aVar == null) {
                    Context applicationContext = context.getApplicationContext();
                    kotlin.s.c.l.e(applicationContext, "context.applicationContext");
                    aVar = new com.obric.common.upgrade.n.a(applicationContext, versionCheckResponse, null);
                    com.obric.common.upgrade.n.a.f7594g = aVar;
                }
            }
        }
        aVar.h(jVar);
    }

    public static void p(long j, long j2) {
        com.obric.common.upgrade.p.a a = com.obric.common.upgrade.p.a.b.a();
        if (f7570d == null) {
            throw new IllegalStateException("AppUpgradeManager 还未初始化，请先调用 init 方法。".toString());
        }
        h hVar = f7570d;
        kotlin.s.c.l.c(hVar);
        a.c(5, j, hVar.b.j(), j2, (r19 & 16) != 0 ? "" : null);
    }

    public static void q(h hVar, boolean z, kotlin.s.b.l lVar) {
        VersionCheckResponse f2;
        g b;
        List<e> a;
        e eVar;
        kotlin.s.c.l.f(hVar, "this$0");
        kotlin.s.c.l.f(lVar, "$block");
        i d2 = com.obric.common.upgrade.m.a.f7589d.a().d();
        if (f7570d == null) {
            throw new IllegalStateException("AppUpgradeManager 还未初始化，请先调用 init 方法。".toString());
        }
        h hVar2 = f7570d;
        kotlin.s.c.l.c(hVar2);
        long j = hVar2.b.j();
        if (d2 != null) {
            boolean z2 = true;
            if (!(d2.a() == 0)) {
                d2 = null;
            }
            if (d2 != null && (b = d2.b()) != null && (a = b.a()) != null && (eVar = (e) kotlin.collections.g.u(a)) != null) {
                boolean z3 = eVar.f() > j;
                boolean z4 = !z && hVar.n(eVar.f());
                if (!z) {
                    if (!(System.currentTimeMillis() - com.obric.common.upgrade.util.d.f7600c.a(hVar.a, hVar.f7572c).d("last_check_tips_time", 0L) > ((long) (hVar.b.i() * 60)) * 1000)) {
                        z2 = false;
                    }
                }
                if (z4) {
                    StringBuilder M = e.a.a.a.a.M("用户忽略了");
                    M.append(eVar.f());
                    M.append("这一版本的升级，不提示");
                    com.obric.common.upgrade.util.c.c(M.toString());
                }
                if (!z2) {
                    com.obric.common.upgrade.util.c.c("用户之前点击了 稍后再试，间隔时间不够，不提示");
                }
                if (z3 && !z4 && z2) {
                    com.obric.common.upgrade.p.a.b.a().c(1, eVar.c(), j, eVar.f(), (r19 & 16) != 0 ? "" : null);
                    f2 = new VersionCheckResponse(true, eVar.f(), eVar.g(), eVar.b(), eVar.a(), eVar.e(), eVar.d(), null, 0, false, eVar.c(), 896);
                } else {
                    int i = z2 ? 0 : -1;
                    if (z4) {
                        i = -2;
                    }
                    f2 = hVar.f(i);
                }
                lVar.invoke(f2);
            }
        }
        f2 = hVar.f(0);
        lVar.invoke(f2);
    }

    public final void e(final boolean z, final kotlin.s.b.l<? super VersionCheckResponse, o> lVar) {
        NetworkInfo activeNetworkInfo;
        NetworkInfo networkInfo;
        NetworkInfo.State state;
        kotlin.s.c.l.f(lVar, "block");
        if (!z) {
            Context context = this.a;
            kotlin.s.c.l.f(context, "context");
            Object systemService = context.getSystemService("connectivity");
            ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
            if (!((connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isAvailable() || (networkInfo = connectivityManager.getNetworkInfo(1)) == null || (state = networkInfo.getState()) == null || state != NetworkInfo.State.CONNECTED) ? false : true)) {
                com.obric.common.upgrade.util.c.c("不是wifi网络，不检查");
                lVar.invoke(f(0));
                return;
            }
        }
        if (!z) {
            if (!(System.currentTimeMillis() - com.obric.common.upgrade.util.d.f7600c.a(this.a, this.f7572c).d("last_check_time", 0L) > ((long) (this.b.c() * 60)) * 1000)) {
                StringBuilder M = e.a.a.a.a.M("还未到时间，不检查. checkGap = ");
                M.append(this.b.c());
                M.append(" tipsGap = ");
                M.append(this.b.i());
                com.obric.common.upgrade.util.c.c(M.toString());
                lVar.invoke(f(0));
                return;
            }
        }
        if (com.obric.common.upgrade.m.a.f7589d.a().c()) {
            com.obric.common.upgrade.util.c.c("上次check网络请求正在处理中，此次check请求抛弃");
            return;
        }
        if (!z) {
            com.obric.common.upgrade.util.d.f7600c.a(this.a, this.f7572c).f("last_check_time", System.currentTimeMillis());
        }
        Runnable runnable = new Runnable() { // from class: com.obric.common.upgrade.d
            @Override // java.lang.Runnable
            public final void run() {
                h.q(h.this, z, lVar);
            }
        };
        com.obric.common.upgrade.util.f fVar = com.obric.common.upgrade.util.f.a;
        com.obric.common.upgrade.util.f.a(runnable);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x006a, code lost:
    
        if (r4 == true) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(boolean r4, final com.obric.common.upgrade.VersionCheckResponse r5, final com.obric.common.upgrade.j r6) {
        /*
            r3 = this;
            java.lang.String r0 = "response"
            kotlin.s.c.l.f(r5, r0)
            java.lang.String r0 = "listener"
            kotlin.s.c.l.f(r6, r0)
            r0 = 1
            r1 = 0
            if (r4 != 0) goto L51
            android.content.Context r4 = r3.a
            java.lang.String r2 = "context"
            kotlin.s.c.l.f(r4, r2)
            java.lang.String r2 = "connectivity"
            java.lang.Object r4 = r4.getSystemService(r2)
            boolean r2 = r4 instanceof android.net.ConnectivityManager
            if (r2 == 0) goto L22
            android.net.ConnectivityManager r4 = (android.net.ConnectivityManager) r4
            goto L23
        L22:
            r4 = 0
        L23:
            if (r4 != 0) goto L26
            goto L45
        L26:
            android.net.NetworkInfo r2 = r4.getActiveNetworkInfo()
            if (r2 == 0) goto L45
            boolean r2 = r2.isAvailable()
            if (r2 != 0) goto L33
            goto L45
        L33:
            android.net.NetworkInfo r4 = r4.getNetworkInfo(r0)
            if (r4 == 0) goto L45
            android.net.NetworkInfo$State r4 = r4.getState()
            if (r4 == 0) goto L45
            android.net.NetworkInfo$State r2 = android.net.NetworkInfo.State.CONNECTED
            if (r4 != r2) goto L45
            r4 = r0
            goto L46
        L45:
            r4 = r1
        L46:
            if (r4 != 0) goto L51
            r4 = -2
            com.bytedance.android.input.upgrade.AppUpgradeDownloadService$a$b r6 = (com.bytedance.android.input.upgrade.AppUpgradeDownloadService.a.b) r6
            java.lang.String r5 = "不是wifi网络，不下载(暂时的策略，后期会修改)"
            r6.a(r4, r5)
            return
        L51:
            boolean r4 = r5.e()
            if (r4 != 0) goto L60
            r4 = -1
            com.bytedance.android.input.upgrade.AppUpgradeDownloadService$a$b r6 = (com.bytedance.android.input.upgrade.AppUpgradeDownloadService.a.b) r6
            java.lang.String r5 = "没有新版本可下载"
            r6.a(r4, r5)
            return
        L60:
            com.obric.common.upgrade.n.a r4 = com.obric.common.upgrade.n.a.b()
            if (r4 == 0) goto L6d
            boolean r4 = com.obric.common.upgrade.n.a.c(r4)
            if (r4 != r0) goto L6d
            goto L6e
        L6d:
            r0 = r1
        L6e:
            if (r0 == 0) goto L79
            r4 = -3
            com.bytedance.android.input.upgrade.AppUpgradeDownloadService$a$b r6 = (com.bytedance.android.input.upgrade.AppUpgradeDownloadService.a.b) r6
            java.lang.String r5 = "当前正在下载，此次下载请求抛弃"
            r6.a(r4, r5)
            return
        L79:
            com.obric.common.upgrade.a r4 = new com.obric.common.upgrade.a
            r4.<init>()
            com.obric.common.upgrade.util.f r5 = com.obric.common.upgrade.util.f.a
            com.obric.common.upgrade.util.f.a(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obric.common.upgrade.h.g(boolean, com.obric.common.upgrade.VersionCheckResponse, com.obric.common.upgrade.j):void");
    }

    public final String h(String str) {
        kotlin.s.c.l.f(str, "apkUrl");
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String O = kotlin.text.a.O(str, "/", null, 2, null);
        if (kotlin.text.a.d(O, ".apk", false, 2, null)) {
            O = kotlin.text.a.Q(O, ".apk", null, 2, null) + ".apk";
        }
        File file = new File(this.a.getFilesDir(), "upgrade");
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(file, O);
        if (file2.exists()) {
            return file2.getAbsolutePath();
        }
        return null;
    }

    public final l i() {
        return this.b;
    }

    public final boolean k(Context context) {
        kotlin.s.c.l.f(context, "context");
        kotlin.s.c.l.f(context, "context");
        return context.getPackageManager().canRequestPackageInstalls();
    }

    public final void l(long j, boolean z) {
        com.obric.common.upgrade.util.d.f7600c.a(this.a, this.f7572c).e("ignored_version_codes_" + j, z);
    }

    public final void m(File file, com.obric.common.upgrade.o.a aVar) {
        kotlin.s.c.l.f(file, "apkFile");
        kotlin.s.c.l.f(aVar, "installListener");
        Context context = this.a;
        kotlin.s.c.l.f(context, "context");
        kotlin.s.c.l.f(file, "apkFile");
        kotlin.s.c.l.f(aVar, "installCallback");
        if (!context.getPackageManager().canRequestPackageInstalls()) {
            Toast.makeText(context, "请在系统设置中开启允许安装未知来源应用的权限", 1).show();
            Intent intent = new Intent("android.settings.MANAGE_UNKNOWN_APP_SOURCES");
            StringBuilder M = e.a.a.a.a.M("package:");
            M.append(context.getPackageName());
            intent.setData(Uri.parse(M.toString()));
            intent.addFlags(268435456);
            context.startActivity(intent);
            aVar.b();
            return;
        }
        kotlin.s.c.l.f(context, "context");
        kotlin.s.c.l.f(file, "apkFile");
        Intent intent2 = new Intent("android.intent.action.VIEW");
        intent2.addFlags(1);
        Uri uriForFile = FileProvider.getUriForFile(context, context.getPackageName() + ".appupgrade.FileProvider", file);
        kotlin.s.c.l.e(uriForFile, "{\n                intent…y, apkFile)\n            }");
        intent2.putExtra("android.intent.extra.RETURN_RESULT", true);
        intent2.addFlags(268435456);
        intent2.setDataAndType(uriForFile, "application/vnd.android.package-archive");
        try {
            context.startActivity(intent2);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        aVar.a();
    }

    public final boolean n(long j) {
        return com.obric.common.upgrade.util.d.f7600c.a(this.a, this.f7572c).c("ignored_version_codes_" + j, false);
    }

    public final void r(final long j, final long j2) {
        Runnable runnable = new Runnable() { // from class: com.obric.common.upgrade.c
            @Override // java.lang.Runnable
            public final void run() {
                h.p(j, j2);
            }
        };
        com.obric.common.upgrade.util.f fVar = com.obric.common.upgrade.util.f.a;
        com.obric.common.upgrade.util.f.a(runnable);
    }

    public final void s() {
        com.obric.common.upgrade.util.d.f7600c.a(this.a, this.f7572c).f("last_check_tips_time", System.currentTimeMillis());
    }

    public final void t(int i, int i2) {
        this.b.m(i);
        this.b.n(i2);
    }
}
