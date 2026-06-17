package com.bytedance.android.input.fragment.settings;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.android.doubaoime.activity.SettingsActivityNext;
import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.android.input.basic.applog.api.IAppLog;
import com.bytedance.android.input.upgrade.DownloadClient;
import com.obric.common.upgrade.VersionCheckResponse;
import com.obric.oui.badge.OBadgeView;
import com.obric.oui.lisitem.OListItemGeneral;
import com.obric.oui.lisitem.OListItemSettings;
import com.obric.oui.toast.a;
import java.io.File;
import java.util.Objects;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.C0795d;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class AboutFragment extends BaseSettingsFragment {
    public static final /* synthetic */ int n = 0;
    private VersionCheckResponse b;

    /* renamed from: c, reason: collision with root package name */
    private final DownloadClient f2358c;

    /* renamed from: d, reason: collision with root package name */
    private int f2359d;

    /* renamed from: e, reason: collision with root package name */
    private long f2360e;

    /* renamed from: f, reason: collision with root package name */
    private final DownloadClient.b f2361f;

    /* renamed from: g, reason: collision with root package name */
    private View f2362g;
    private OListItemSettings h;
    private OBadgeView i;
    private boolean j;
    private DialogInterface k;
    private boolean l;
    private com.obric.oui.dialog.alert.b m;

    public static final class a implements DownloadClient.b {

        @kotlin.r.h.a.e(c = "com.bytedance.android.input.fragment.settings.AboutFragment$listener$1$onDownloadFailed$1", f = "AboutFragment.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.bytedance.android.input.fragment.settings.AboutFragment$a$a, reason: collision with other inner class name */
        static final class C0070a extends kotlin.r.h.a.i implements kotlin.s.b.p<kotlinx.coroutines.G, kotlin.r.d<? super kotlin.o>, Object> {
            final /* synthetic */ AboutFragment a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0070a(AboutFragment aboutFragment, kotlin.r.d<? super C0070a> dVar) {
                super(2, dVar);
                this.a = aboutFragment;
            }

            @Override // kotlin.r.h.a.a
            public final kotlin.r.d<kotlin.o> create(Object obj, kotlin.r.d<?> dVar) {
                return new C0070a(this.a, dVar);
            }

            @Override // kotlin.s.b.p
            public Object invoke(kotlinx.coroutines.G g2, kotlin.r.d<? super kotlin.o> dVar) {
                C0070a c0070a = new C0070a(this.a, dVar);
                kotlin.o oVar = kotlin.o.a;
                c0070a.invokeSuspend(oVar);
                return oVar;
            }

            @Override // kotlin.r.h.a.a
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                com.prolificinteractive.materialcalendarview.r.k0(obj);
                a.C0363a c0363a = com.obric.oui.toast.a.p;
                FragmentActivity activity = this.a.getActivity();
                kotlin.s.c.l.d(activity, "null cannot be cast to non-null type android.app.Activity");
                String string = this.a.getString(C0838R.string.update_version_download_failed);
                kotlin.s.c.l.e(string, "getString(R.string.update_version_download_failed)");
                c0363a.a(activity, string, 80);
                OListItemSettings oListItemSettings = this.a.h;
                if (oListItemSettings == null) {
                    kotlin.s.c.l.l("mUpgradeTips");
                    throw null;
                }
                oListItemSettings.setTrailingText("");
                OBadgeView oBadgeView = this.a.i;
                if (oBadgeView != null) {
                    oBadgeView.setVisibility(0);
                }
                return kotlin.o.a;
            }
        }

        @kotlin.r.h.a.e(c = "com.bytedance.android.input.fragment.settings.AboutFragment$listener$1$onDownloadSuccess$1", f = "AboutFragment.kt", l = {}, m = "invokeSuspend")
        static final class b extends kotlin.r.h.a.i implements kotlin.s.b.p<kotlinx.coroutines.G, kotlin.r.d<? super kotlin.o>, Object> {
            final /* synthetic */ AboutFragment a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(AboutFragment aboutFragment, kotlin.r.d<? super b> dVar) {
                super(2, dVar);
                this.a = aboutFragment;
            }

            @Override // kotlin.r.h.a.a
            public final kotlin.r.d<kotlin.o> create(Object obj, kotlin.r.d<?> dVar) {
                return new b(this.a, dVar);
            }

            @Override // kotlin.s.b.p
            public Object invoke(kotlinx.coroutines.G g2, kotlin.r.d<? super kotlin.o> dVar) {
                b bVar = new b(this.a, dVar);
                kotlin.o oVar = kotlin.o.a;
                bVar.invokeSuspend(oVar);
                return oVar;
            }

            @Override // kotlin.r.h.a.a
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                com.prolificinteractive.materialcalendarview.r.k0(obj);
                a.C0363a c0363a = com.obric.oui.toast.a.p;
                FragmentActivity activity = this.a.getActivity();
                kotlin.s.c.l.d(activity, "null cannot be cast to non-null type android.app.Activity");
                String string = this.a.getString(C0838R.string.update_version_downloaded_success);
                kotlin.s.c.l.e(string, "getString(R.string.updat…rsion_downloaded_success)");
                c0363a.a(activity, string, 80);
                OListItemSettings oListItemSettings = this.a.h;
                if (oListItemSettings == null) {
                    kotlin.s.c.l.l("mUpgradeTips");
                    throw null;
                }
                String string2 = this.a.getString(C0838R.string.update_version_downloaded_success);
                kotlin.s.c.l.e(string2, "getString(R.string.updat…rsion_downloaded_success)");
                oListItemSettings.setTrailingText(string2);
                OBadgeView oBadgeView = this.a.i;
                if (oBadgeView != null) {
                    oBadgeView.setVisibility(8);
                }
                return kotlin.o.a;
            }
        }

        static final class c extends kotlin.s.c.m implements kotlin.s.b.l<Boolean, kotlin.o> {
            final /* synthetic */ AboutFragment a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(AboutFragment aboutFragment) {
                super(1);
                this.a = aboutFragment;
            }

            @Override // kotlin.s.b.l
            public kotlin.o invoke(Boolean bool) {
                this.a.F(bool.booleanValue());
                return kotlin.o.a;
            }
        }

        @kotlin.r.h.a.e(c = "com.bytedance.android.input.fragment.settings.AboutFragment$listener$1$onProgressUpdate$1", f = "AboutFragment.kt", l = {}, m = "invokeSuspend")
        static final class d extends kotlin.r.h.a.i implements kotlin.s.b.p<kotlinx.coroutines.G, kotlin.r.d<? super kotlin.o>, Object> {
            final /* synthetic */ AboutFragment a;
            final /* synthetic */ int b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(AboutFragment aboutFragment, int i, kotlin.r.d<? super d> dVar) {
                super(2, dVar);
                this.a = aboutFragment;
                this.b = i;
            }

            @Override // kotlin.r.h.a.a
            public final kotlin.r.d<kotlin.o> create(Object obj, kotlin.r.d<?> dVar) {
                return new d(this.a, this.b, dVar);
            }

            @Override // kotlin.s.b.p
            public Object invoke(kotlinx.coroutines.G g2, kotlin.r.d<? super kotlin.o> dVar) {
                d dVar2 = new d(this.a, this.b, dVar);
                kotlin.o oVar = kotlin.o.a;
                dVar2.invokeSuspend(oVar);
                return oVar;
            }

            @Override // kotlin.r.h.a.a
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                com.prolificinteractive.materialcalendarview.r.k0(obj);
                OListItemSettings oListItemSettings = this.a.h;
                if (oListItemSettings == null) {
                    kotlin.s.c.l.l("mUpgradeTips");
                    throw null;
                }
                StringBuilder M = e.a.a.a.a.M("下载进度");
                M.append(this.b);
                M.append('%');
                oListItemSettings.setTrailingText(M.toString());
                OBadgeView oBadgeView = this.a.i;
                if (oBadgeView != null) {
                    oBadgeView.setVisibility(8);
                }
                return kotlin.o.a;
            }
        }

        a() {
        }

        @Override // com.bytedance.android.input.upgrade.DownloadClient.b
        public void a(int i, String str) {
            kotlin.s.c.l.f(str, "errorMsg");
            if (AboutFragment.this.getActivity() == null) {
                return;
            }
            com.bytedance.android.input.r.j.i("OAppUpgrade", "下载失败 " + i + ". " + str);
            if (i != -3) {
                kotlin.s.c.l.f(str, "errorMsg");
                e.a.a.a.a.q0("reason", str, IAppLog.a, "upgrade_downloadfailed");
                LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(AboutFragment.this);
                int i2 = kotlinx.coroutines.S.f10199c;
                C0795d.l(lifecycleScope, kotlinx.coroutines.N0.q.f10173c, null, new C0070a(AboutFragment.this, null), 2, null);
            }
        }

        @Override // com.bytedance.android.input.upgrade.DownloadClient.b
        public void b(VersionCheckResponse versionCheckResponse) {
            String a;
            kotlin.s.c.l.f(versionCheckResponse, "response");
            if (AboutFragment.this.getActivity() == null) {
                return;
            }
            AboutFragment.this.b = versionCheckResponse;
            VersionCheckResponse versionCheckResponse2 = AboutFragment.this.b;
            if (versionCheckResponse2 != null && versionCheckResponse2.n()) {
                IAppLog.a.t("upgrade_downloaded", new JSONObject());
            }
            StringBuilder M = e.a.a.a.a.M("下载完成了 ");
            VersionCheckResponse versionCheckResponse3 = AboutFragment.this.b;
            e.a.a.a.a.H0(M, versionCheckResponse3 != null ? versionCheckResponse3.a() : null, "OAppUpgrade");
            LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(AboutFragment.this);
            int i = kotlinx.coroutines.S.f10199c;
            C0795d.l(lifecycleScope, kotlinx.coroutines.N0.q.f10173c, null, new b(AboutFragment.this, null), 2, null);
            VersionCheckResponse versionCheckResponse4 = AboutFragment.this.b;
            if (versionCheckResponse4 == null || (a = versionCheckResponse4.a()) == null) {
                return;
            }
            AboutFragment aboutFragment = AboutFragment.this;
            AboutFragment.x(aboutFragment, a, new c(aboutFragment));
        }

        @Override // com.bytedance.android.input.upgrade.DownloadClient.b
        public void c(int i, long j, long j2, String str) {
            kotlin.s.c.l.f(str, "downloadUrl");
            if (AboutFragment.this.getActivity() == null) {
                return;
            }
            com.bytedance.android.input.r.j.i("OAppUpgrade", "下载进度: " + i + '%');
            LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(AboutFragment.this);
            int i2 = kotlinx.coroutines.S.f10199c;
            C0795d.l(lifecycleScope, kotlinx.coroutines.N0.q.f10173c, null, new d(AboutFragment.this, i, null), 2, null);
        }
    }

    @kotlin.r.h.a.e(c = "com.bytedance.android.input.fragment.settings.AboutFragment$onStartInstallResult$2", f = "AboutFragment.kt", l = {}, m = "invokeSuspend")
    static final class b extends kotlin.r.h.a.i implements kotlin.s.b.p<kotlinx.coroutines.G, kotlin.r.d<? super kotlin.o>, Object> {
        b(kotlin.r.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.r.h.a.a
        public final kotlin.r.d<kotlin.o> create(Object obj, kotlin.r.d<?> dVar) {
            return AboutFragment.this.new b(dVar);
        }

        @Override // kotlin.s.b.p
        public Object invoke(kotlinx.coroutines.G g2, kotlin.r.d<? super kotlin.o> dVar) {
            b bVar = AboutFragment.this.new b(dVar);
            kotlin.o oVar = kotlin.o.a;
            bVar.invokeSuspend(oVar);
            return oVar;
        }

        @Override // kotlin.r.h.a.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            com.prolificinteractive.materialcalendarview.r.k0(obj);
            a.C0363a c0363a = com.obric.oui.toast.a.p;
            FragmentActivity activity = AboutFragment.this.getActivity();
            kotlin.s.c.l.d(activity, "null cannot be cast to non-null type android.app.Activity");
            String string = AboutFragment.this.getString(C0838R.string.toast_tip_open_install_permission);
            kotlin.s.c.l.e(string, "getString(R.string.toast…_open_install_permission)");
            c0363a.a(activity, string, 80);
            return kotlin.o.a;
        }
    }

    public static final class c implements com.obric.common.upgrade.o.a {
        c() {
        }

        @Override // com.obric.common.upgrade.o.a
        public void a() {
            if (AboutFragment.this.k != null) {
                DialogInterface dialogInterface = AboutFragment.this.k;
                if (dialogInterface == null) {
                    kotlin.s.c.l.l("mUpgradeDialog");
                    throw null;
                }
                dialogInterface.dismiss();
            }
            com.bytedance.android.input.upgrade.f.c();
            if (com.obric.common.upgrade.h.f7570d == null) {
                throw new IllegalStateException("AppUpgradeManager 还未初始化，请先调用 init 方法。".toString());
            }
            com.obric.common.upgrade.h hVar = com.obric.common.upgrade.h.f7570d;
            kotlin.s.c.l.c(hVar);
            VersionCheckResponse versionCheckResponse = AboutFragment.this.b;
            kotlin.s.c.l.c(versionCheckResponse);
            long g2 = versionCheckResponse.g();
            VersionCheckResponse versionCheckResponse2 = AboutFragment.this.b;
            kotlin.s.c.l.c(versionCheckResponse2);
            hVar.r(g2, versionCheckResponse2.k());
            com.bytedance.android.input.r.j.i("OAppUpgrade", "onPermissionGranted");
            AboutFragment aboutFragment = AboutFragment.this;
            VersionCheckResponse versionCheckResponse3 = aboutFragment.b;
            kotlin.s.c.l.c(versionCheckResponse3);
            long k = versionCheckResponse3.k();
            VersionCheckResponse versionCheckResponse4 = AboutFragment.this.b;
            kotlin.s.c.l.c(versionCheckResponse4);
            aboutFragment.G(k, versionCheckResponse4.g(), true);
        }

        @Override // com.obric.common.upgrade.o.a
        public void b() {
        }
    }

    public AboutFragment() {
        DownloadClient.a aVar = DownloadClient.k;
        IAppGlobals.a aVar2 = IAppGlobals.a;
        Objects.requireNonNull(aVar2);
        this.f2358c = aVar.a(aVar2.getContext(), true);
        this.f2361f = new a();
    }

    public static void D(AboutFragment aboutFragment, View view, View view2) {
        kotlin.s.c.l.f(aboutFragment, "this$0");
        kotlin.s.c.l.f(view, "$root");
        FragmentActivity activity = aboutFragment.getActivity();
        SettingsActivityNext settingsActivityNext = activity instanceof SettingsActivityNext ? (SettingsActivityNext) activity : null;
        if ((settingsActivityNext != null ? settingsActivityNext.getMDebugSettingsFragment() : null) == null) {
            com.bytedance.android.input.r.j.i("AboutFragment", "fragment is null");
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - aboutFragment.f2360e > 800) {
            aboutFragment.f2359d = 0;
        }
        aboutFragment.f2360e = elapsedRealtime;
        int i = aboutFragment.f2359d + 1;
        aboutFragment.f2359d = i;
        if (i >= 5) {
            view.findViewById(C0838R.id.debug_settings).setVisibility(0);
            aboutFragment.f2359d = 0;
        }
    }

    public static void E(AboutFragment aboutFragment, View view) {
        boolean z;
        boolean z2;
        boolean z3;
        VersionCheckResponse versionCheckResponse;
        kotlin.s.c.l.f(aboutFragment, "this$0");
        VersionCheckResponse versionCheckResponse2 = aboutFragment.b;
        if (versionCheckResponse2 != null) {
            kotlin.s.c.l.c(versionCheckResponse2);
            if (versionCheckResponse2.e()) {
                z2 = com.obric.common.upgrade.h.f7571e;
                if (z2) {
                    if (aboutFragment.f2358c.o() == DownloadClient.DownloadStatus.IN_PROGRESS) {
                        FragmentActivity activity = aboutFragment.getActivity();
                        if (activity != null) {
                            a.C0363a c0363a = com.obric.oui.toast.a.p;
                            String string = aboutFragment.getString(C0838R.string.update_version_downloading);
                            kotlin.s.c.l.e(string, "getString(R.string.update_version_downloading)");
                            c0363a.a(activity, string, 80);
                            return;
                        }
                        return;
                    }
                    z3 = com.obric.common.upgrade.h.f7571e;
                    if (!z3 || aboutFragment.getActivity() == null || (versionCheckResponse = aboutFragment.b) == null) {
                        return;
                    }
                    kotlin.s.c.l.c(versionCheckResponse);
                    if (versionCheckResponse.e()) {
                        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(aboutFragment);
                        int i = kotlinx.coroutines.S.f10199c;
                        C0795d.l(lifecycleScope, kotlinx.coroutines.N0.q.f10173c, null, new C0580z0(versionCheckResponse, aboutFragment, null), 2, null);
                        return;
                    }
                    return;
                }
                return;
            }
        }
        if (((Integer) e.a.a.a.a.L0(IAppGlobals.a, C0838R.string.full_base_input_mode, "IAppGlobals.context.getS…ing.full_base_input_mode)", "null cannot be cast to non-null type kotlin.Int")).intValue() == 1) {
            com.bytedance.android.input.r.j.i("OAppUpgrade", "基础打字模式，不检查升级");
            return;
        }
        z = com.obric.common.upgrade.h.f7571e;
        if (!z) {
            com.bytedance.android.input.r.j.i("AboutFragment", "AppUpgradeManager还没完成初始化，return");
            return;
        }
        if (com.obric.common.upgrade.h.f7570d == null) {
            throw new IllegalStateException("AppUpgradeManager 还未初始化，请先调用 init 方法。".toString());
        }
        kotlin.s.c.l.c(com.obric.common.upgrade.h.f7570d);
        if (com.obric.common.upgrade.m.a.f7589d.a().c()) {
            com.bytedance.android.input.r.j.i("AboutFragment", "上次检测进行中，防重点击");
            return;
        }
        if (!aboutFragment.isAdded() || aboutFragment.isDetached()) {
            com.bytedance.android.input.r.j.i("AboutFragment", "fragment 不可见，return");
            return;
        }
        OListItemSettings oListItemSettings = aboutFragment.h;
        if (oListItemSettings == null) {
            kotlin.s.c.l.l("mUpgradeTips");
            throw null;
        }
        String string2 = aboutFragment.getString(C0838R.string.update_version_checking);
        kotlin.s.c.l.e(string2, "getString(R.string.update_version_checking)");
        oListItemSettings.setTrailingText(string2);
        aboutFragment.f2358c.n(true, com.bytedance.applog.a.c(), new C0572v0(aboutFragment));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G(long j, long j2, boolean z) {
        IAppGlobals.a aVar = IAppGlobals.a;
        Objects.requireNonNull(aVar);
        aVar.o().edit().putBoolean("upgrade_install_performed_" + j, z).apply();
        Objects.requireNonNull(aVar);
        aVar.o().edit().putLong(e.a.a.a.a.n("upgrade_install_taskId_", j), j2).apply();
        Objects.requireNonNull(aVar);
        Objects.requireNonNull(aVar);
        aVar.o().edit().putLong("upgrade_install_preversion_" + j, 100309006).apply();
    }

    public static final void s(AboutFragment aboutFragment) {
        DownloadClient.DownloadStatus o = aboutFragment.f2358c.o();
        if (o == DownloadClient.DownloadStatus.IN_PROGRESS || o == DownloadClient.DownloadStatus.SUCCESS) {
            return;
        }
        VersionCheckResponse versionCheckResponse = aboutFragment.b;
        if (versionCheckResponse != null) {
            com.bytedance.android.input.r.j.i("AboutFragment", "升级下载任务未启动，startDownload");
            aboutFragment.f2358c.t(versionCheckResponse);
        }
        a.C0363a c0363a = com.obric.oui.toast.a.p;
        FragmentActivity activity = aboutFragment.getActivity();
        kotlin.s.c.l.d(activity, "null cannot be cast to non-null type android.app.Activity");
        String string = aboutFragment.getString(C0838R.string.update_version_downloading);
        kotlin.s.c.l.e(string, "getString(R.string.update_version_downloading)");
        c0363a.a(activity, string, 80);
    }

    public static final void x(AboutFragment aboutFragment, String str, kotlin.s.b.l lVar) {
        Objects.requireNonNull(aboutFragment);
        com.bytedance.android.input.r.j.i("AboutFragment", "MainFragment 执行installNewVersion111");
        if (!aboutFragment.l) {
            com.bytedance.android.input.r.j.i("AboutFragment", "MainFragment 不在前台，return");
            return;
        }
        if (com.obric.common.upgrade.h.f7570d == null) {
            throw new IllegalStateException("AppUpgradeManager 还未初始化，请先调用 init 方法。".toString());
        }
        com.obric.common.upgrade.h hVar = com.obric.common.upgrade.h.f7570d;
        kotlin.s.c.l.c(hVar);
        FragmentActivity activity = aboutFragment.getActivity();
        kotlin.s.c.l.d(activity, "null cannot be cast to non-null type android.app.Activity");
        if (!hVar.k(activity)) {
            lVar.invoke(Boolean.FALSE);
            return;
        }
        com.bytedance.android.input.r.j.i("OAppUpgrade", "用户选择了升级，在这里可以做埋点上报");
        File file = new File(str);
        if (com.obric.common.upgrade.h.f7570d == null) {
            throw new IllegalStateException("AppUpgradeManager 还未初始化，请先调用 init 方法。".toString());
        }
        com.obric.common.upgrade.h hVar2 = com.obric.common.upgrade.h.f7570d;
        kotlin.s.c.l.c(hVar2);
        hVar2.m(file, new C0576x0(lVar));
    }

    public static final void y(AboutFragment aboutFragment) {
        if (aboutFragment.b == null) {
            return;
        }
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(aboutFragment);
        int i = kotlinx.coroutines.S.f10199c;
        C0795d.l(lifecycleScope, kotlinx.coroutines.N0.q.f10173c, null, new C0578y0(aboutFragment, null), 2, null);
    }

    public final void F(boolean z) {
        if (z) {
            com.bytedance.android.input.upgrade.f.c();
            VersionCheckResponse versionCheckResponse = this.b;
            if (versionCheckResponse != null) {
                if (com.obric.common.upgrade.h.f7570d == null) {
                    throw new IllegalStateException("AppUpgradeManager 还未初始化，请先调用 init 方法。".toString());
                }
                com.obric.common.upgrade.h hVar = com.obric.common.upgrade.h.f7570d;
                kotlin.s.c.l.c(hVar);
                hVar.r(versionCheckResponse.g(), versionCheckResponse.k());
                com.bytedance.android.input.r.j.i("AboutFragment", "onPermissionGranted");
                G(versionCheckResponse.k(), versionCheckResponse.g(), true);
                return;
            }
            return;
        }
        com.bytedance.android.input.r.j.i("AboutFragment", "has no permission");
        this.j = true;
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
        int i = kotlinx.coroutines.S.f10199c;
        C0795d.l(lifecycleScope, kotlinx.coroutines.N0.q.f10173c, null, new b(null), 2, null);
        if (com.obric.common.upgrade.h.f7570d == null) {
            throw new IllegalStateException("AppUpgradeManager 还未初始化，请先调用 init 方法。".toString());
        }
        kotlin.s.c.l.c(com.obric.common.upgrade.h.f7570d);
        FragmentActivity activity = getActivity();
        kotlin.s.c.l.d(activity, "null cannot be cast to non-null type android.app.Activity");
        kotlin.s.c.l.f(activity, "activity");
        kotlin.s.c.l.f(activity, "activity");
        Intent intent = new Intent("android.settings.MANAGE_UNKNOWN_APP_SOURCES");
        StringBuilder M = e.a.a.a.a.M("package:");
        M.append(activity.getPackageName());
        intent.setData(Uri.parse(M.toString()));
        intent.addFlags(268435456);
        activity.startActivityForResult(intent, 100);
    }

    @Override // com.bytedance.android.input.framework.fragment.BaseImeFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.s.c.l.f(layoutInflater, "inflater");
        if (this.f2362g == null) {
            final View inflate = layoutInflater.inflate(C0838R.layout.fragment_about, viewGroup, false);
            kotlin.s.c.l.e(inflate, "inflater.inflate(R.layou…_about, container, false)");
            this.f2362g = inflate;
            if (inflate == null) {
                kotlin.s.c.l.l("mRoot");
                throw null;
            }
            final SettingsActivityNext.FragmentType fragmentType = SettingsActivityNext.FragmentType.DEBUG_SETTINGS;
            OListItemSettings oListItemSettings = (OListItemSettings) inflate.findViewById(C0838R.id.debug_settings);
            oListItemSettings.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.android.input.fragment.settings.d
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AboutFragment aboutFragment = AboutFragment.this;
                    SettingsActivityNext.FragmentType fragmentType2 = fragmentType;
                    int i = AboutFragment.n;
                    kotlin.s.c.l.f(aboutFragment, "this$0");
                    kotlin.s.c.l.f(fragmentType2, "$subFragmentType");
                    FragmentActivity activity = aboutFragment.getActivity();
                    kotlin.s.c.l.d(activity, "null cannot be cast to non-null type com.bytedance.android.doubaoime.activity.SettingsActivityNext");
                    SettingsActivityNext.switchFragment$default((SettingsActivityNext) activity, fragmentType2, null, 2, null);
                }
            });
            kotlin.s.c.l.e(oListItemSettings, "listItemView");
            IAppGlobals.a aVar = IAppGlobals.a;
            Objects.requireNonNull(aVar);
            ((TextView) inflate.findViewById(C0838R.id.version)).setText("1.3.9");
            View findViewById = inflate.findViewById(C0838R.id.new_version_check);
            kotlin.s.c.l.e(findViewById, "root.findViewById<OListI…>(R.id.new_version_check)");
            OListItemSettings oListItemSettings2 = (OListItemSettings) findViewById;
            this.h = oListItemSettings2;
            oListItemSettings2.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.android.input.fragment.settings.e
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AboutFragment.E(AboutFragment.this, view);
                }
            });
            this.i = (OBadgeView) inflate.findViewById(C0838R.id.new_version_badge);
            this.f2358c.r(this.f2361f);
            if (this.f2358c.q()) {
                com.bytedance.android.input.r.j.i("AboutFragment", "服务绑定上了");
                inflate.findViewById(C0838R.id.new_version_check).performClick();
            } else {
                com.bytedance.android.input.r.j.i("AboutFragment", "服务没有绑定");
                this.f2358c.m();
                this.f2358c.s(new C0574w0(this, inflate));
            }
            View view = this.f2362g;
            if (view == null) {
                kotlin.s.c.l.l("mRoot");
                throw null;
            }
            final OListItemGeneral oListItemGeneral = (OListItemGeneral) view.findViewById(C0838R.id.dev_options_info);
            IAppLog.a aVar2 = IAppLog.a;
            Objects.requireNonNull(aVar2);
            String deviceId = aVar2.getDeviceId();
            StringBuilder W = e.a.a.a.a.W("version: ", "1.3.9.6", "_release\nbuild time: ", "20260528.1605", "\ndid: ");
            W.append(deviceId);
            final String sb = W.toString();
            oListItemGeneral.setSubTitleString(sb);
            oListItemGeneral.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.android.input.fragment.settings.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    OListItemGeneral oListItemGeneral2 = OListItemGeneral.this;
                    String str = sb;
                    AboutFragment aboutFragment = this;
                    int i = AboutFragment.n;
                    kotlin.s.c.l.f(str, "$info");
                    kotlin.s.c.l.f(aboutFragment, "this$0");
                    Context context = oListItemGeneral2.getContext();
                    Object systemService = context != null ? context.getSystemService("clipboard") : null;
                    kotlin.s.c.l.d(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
                    ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText("ime", str));
                    FragmentActivity activity = aboutFragment.getActivity();
                    if (activity != null) {
                        a.C0363a c0363a = com.obric.oui.toast.a.p;
                        String string = aboutFragment.getString(C0838R.string.tip_copy);
                        kotlin.s.c.l.e(string, "getString(R.string.tip_copy)");
                        c0363a.a(activity, string, 80);
                    }
                }
            });
            com.bytedance.android.input.r.j.i("AboutFragment", "currentChannel = " + d.a.b.a.c(aVar));
            inflate.findViewById(C0838R.id.icon).setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.android.input.fragment.settings.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    AboutFragment.D(AboutFragment.this, inflate, view2);
                }
            });
        }
        View view2 = this.f2362g;
        if (view2 != null) {
            return view2;
        }
        kotlin.s.c.l.l("mRoot");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        com.bytedance.android.input.r.j.i("AboutFragment", "onDestroy");
        super.onDestroy();
        this.f2358c.w(this.f2361f);
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        com.bytedance.android.input.r.j.i("AboutFragment", "onPause");
        super.onPause();
        this.l = false;
        com.obric.oui.dialog.alert.b bVar = this.m;
        if (bVar != null) {
            bVar.dismiss();
        }
    }

    @Override // com.bytedance.android.input.fragment.settings.BaseSettingsFragment, androidx.fragment.app.Fragment
    public void onResume() {
        com.bytedance.android.input.r.j.i("AboutFragment", "onResume");
        super.onResume();
        r();
    }

    @Override // com.bytedance.android.input.fragment.settings.BaseSettingsFragment
    public void r() {
        boolean z;
        l();
        com.bytedance.android.input.r.j.i("AboutFragment", "updateUI");
        boolean z2 = true;
        this.l = true;
        z = com.obric.common.upgrade.h.f7571e;
        if (z && this.j && this.b != null) {
            if (com.obric.common.upgrade.h.f7570d == null) {
                throw new IllegalStateException("AppUpgradeManager 还未初始化，请先调用 init 方法。".toString());
            }
            com.obric.common.upgrade.h hVar = com.obric.common.upgrade.h.f7570d;
            kotlin.s.c.l.c(hVar);
            FragmentActivity activity = getActivity();
            kotlin.s.c.l.d(activity, "null cannot be cast to non-null type android.app.Activity");
            if (hVar.k(activity)) {
                this.j = false;
                VersionCheckResponse versionCheckResponse = this.b;
                kotlin.s.c.l.c(versionCheckResponse);
                String a2 = versionCheckResponse.a();
                if (a2 != null && a2.length() != 0) {
                    z2 = false;
                }
                if (z2) {
                    return;
                }
                if (com.obric.common.upgrade.h.f7570d == null) {
                    throw new IllegalStateException("AppUpgradeManager 还未初始化，请先调用 init 方法。".toString());
                }
                com.obric.common.upgrade.h hVar2 = com.obric.common.upgrade.h.f7570d;
                kotlin.s.c.l.c(hVar2);
                hVar2.m(new File(a2), new c());
            }
        }
    }
}
