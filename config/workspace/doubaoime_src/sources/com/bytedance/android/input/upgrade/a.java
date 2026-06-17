package com.bytedance.android.input.upgrade;

import android.content.Context;
import androidx.lifecycle.LifecycleCoroutineScope;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.android.doubaoime.KeyboardJni;
import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.android.input.basic.applog.api.IAppLog;
import com.bytedance.android.input.basic.settings.api.IInputSettings;
import com.bytedance.android.input.keyboard.InputView;
import com.bytedance.android.input.popup.WindowId;
import com.bytedance.android.input.r.j;
import com.bytedance.android.input.upgrade.DownloadClient;
import com.obric.common.upgrade.VersionCheckResponse;
import com.obric.common.upgrade.h;
import com.prolificinteractive.materialcalendarview.r;
import java.io.File;
import java.util.Objects;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.o;
import kotlin.r.h.a.i;
import kotlin.s.b.l;
import kotlin.s.b.p;
import kotlin.s.c.m;
import kotlinx.coroutines.C0795d;
import kotlinx.coroutines.G;
import kotlinx.coroutines.N0.q;
import kotlinx.coroutines.S;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class a {
    private final Context a;
    private final LifecycleCoroutineScope b;

    /* renamed from: c, reason: collision with root package name */
    private final InputView f3218c;

    /* renamed from: d, reason: collision with root package name */
    private final DownloadClient f3219d;

    /* renamed from: e, reason: collision with root package name */
    private VersionCheckResponse f3220e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f3221f;

    /* renamed from: g, reason: collision with root package name */
    private final DownloadClient.b f3222g;

    /* renamed from: com.bytedance.android.input.upgrade.a$a, reason: collision with other inner class name */
    static final class C0101a extends m implements l<VersionCheckResponse, o> {
        C0101a() {
            super(1);
        }

        @Override // kotlin.s.b.l
        public o invoke(VersionCheckResponse versionCheckResponse) {
            VersionCheckResponse versionCheckResponse2 = versionCheckResponse;
            kotlin.s.c.l.f(versionCheckResponse2, "response");
            a.e(a.this, versionCheckResponse2);
            return o.a;
        }
    }

    public static final class b implements DownloadClient.c {

        /* renamed from: com.bytedance.android.input.upgrade.a$b$a, reason: collision with other inner class name */
        static final class C0102a extends m implements l<VersionCheckResponse, o> {
            final /* synthetic */ a a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0102a(a aVar) {
                super(1);
                this.a = aVar;
            }

            @Override // kotlin.s.b.l
            public o invoke(VersionCheckResponse versionCheckResponse) {
                VersionCheckResponse versionCheckResponse2 = versionCheckResponse;
                kotlin.s.c.l.f(versionCheckResponse2, "response");
                a.e(this.a, versionCheckResponse2);
                return o.a;
            }
        }

        b() {
        }

        @Override // com.bytedance.android.input.upgrade.DownloadClient.c
        public void a() {
            a.this.f3219d.v();
            a.this.f3219d.n(false, null, new C0102a(a.this));
        }
    }

    public static final class c implements DownloadClient.b {
        c() {
        }

        @Override // com.bytedance.android.input.upgrade.DownloadClient.b
        public void a(int i, String str) {
            kotlin.s.c.l.f(str, "errorMsg");
            kotlin.s.c.l.f(str, "errorMsg");
            IAppLog.a aVar = IAppLog.a;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("reason", str);
            aVar.t("upgrade_downloadfailed", jSONObject);
            j.i("OAppUpgrade", "下载失败 " + i + ". " + str);
            a.this.m(null);
        }

        @Override // com.bytedance.android.input.upgrade.DownloadClient.b
        public void b(VersionCheckResponse versionCheckResponse) {
            kotlin.s.c.l.f(versionCheckResponse, "response");
            a.this.m(versionCheckResponse);
            VersionCheckResponse g2 = a.this.g();
            if (g2 != null) {
                a aVar = a.this;
                if (g2.n()) {
                    IAppLog.a.t("upgrade_downloaded", new JSONObject());
                }
                StringBuilder M = e.a.a.a.a.M("下载完成了 ");
                M.append(g2.a());
                j.i("OAppUpgrade", M.toString());
                VersionCheckResponse g3 = aVar.g();
                aVar.o(g3 != null ? g3.k() : 0L);
            }
        }

        @Override // com.bytedance.android.input.upgrade.DownloadClient.b
        public void c(int i, long j, long j2, String str) {
            kotlin.s.c.l.f(str, "downloadUrl");
            j.i("OAppUpgrade", "下载进度: " + i + '%');
        }
    }

    public static final class d implements com.obric.common.upgrade.o.a {
        final /* synthetic */ VersionCheckResponse b;

        d(VersionCheckResponse versionCheckResponse) {
            this.b = versionCheckResponse;
        }

        @Override // com.obric.common.upgrade.o.a
        public void a() {
            a.d(a.this, this.b);
        }

        @Override // com.obric.common.upgrade.o.a
        public void b() {
        }
    }

    @kotlin.r.h.a.e(c = "com.bytedance.android.input.upgrade.AppUpgradeHelper$showAppUpgradeTips$1", f = "AppUpgradeHelper.kt", l = {}, m = "invokeSuspend")
    static final class e extends i implements p<G, kotlin.r.d<? super o>, Object> {
        e(kotlin.r.d<? super e> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.r.h.a.a
        public final kotlin.r.d<o> create(Object obj, kotlin.r.d<?> dVar) {
            return a.this.new e(dVar);
        }

        @Override // kotlin.s.b.p
        public Object invoke(G g2, kotlin.r.d<? super o> dVar) {
            e eVar = a.this.new e(dVar);
            o oVar = o.a;
            eVar.invokeSuspend(oVar);
            return oVar;
        }

        @Override // kotlin.r.h.a.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            r.k0(obj);
            Objects.requireNonNull(a.this);
            IAppGlobals.a aVar = IAppGlobals.a;
            KeyboardJni.showGuideTips(aVar.getContext().getString(C0838R.string.app_upgrade_guide_text), aVar.getContext().getString(C0838R.string.guide_popup_upgrade_action_text), WindowId.APP_UPGRADE_TIPS_UI);
            return o.a;
        }
    }

    public a(Context context, LifecycleCoroutineScope lifecycleCoroutineScope, InputView inputView) {
        kotlin.s.c.l.f(context, "context");
        kotlin.s.c.l.f(lifecycleCoroutineScope, "lifecycleScope");
        this.a = context;
        this.b = lifecycleCoroutineScope;
        this.f3218c = inputView;
        DownloadClient.a aVar = DownloadClient.k;
        IAppGlobals.a aVar2 = IAppGlobals.a;
        Objects.requireNonNull(aVar2);
        this.f3219d = aVar.a(aVar2.getContext(), false);
        this.f3222g = new c();
    }

    public static final void d(a aVar, VersionCheckResponse versionCheckResponse) {
        Objects.requireNonNull(aVar);
        f.c();
        if (h.f7570d == null) {
            throw new IllegalStateException("AppUpgradeManager 还未初始化，请先调用 init 方法。".toString());
        }
        h hVar = h.f7570d;
        kotlin.s.c.l.c(hVar);
        hVar.r(versionCheckResponse.g(), versionCheckResponse.k());
        j.i("OAppUpgrade", "成功触发安装界面");
        aVar.q(versionCheckResponse.k(), versionCheckResponse.g(), true);
        aVar.h(versionCheckResponse);
    }

    public static final void e(a aVar, VersionCheckResponse versionCheckResponse) {
        Objects.requireNonNull(aVar);
        if (versionCheckResponse.e()) {
            StringBuilder M = e.a.a.a.a.M("有新版本，版本号: ");
            M.append(versionCheckResponse.k());
            M.append(", 下载url: ");
            M.append(versionCheckResponse.b());
            M.append(", md5: ");
            M.append(versionCheckResponse.f());
            M.append(", 升级模式");
            M.append(versionCheckResponse.j());
            j.i("OAppUpgrade", M.toString());
            aVar.f3219d.r(aVar.f3222g);
            aVar.f3219d.t(versionCheckResponse);
        } else {
            j.i("OAppUpgrade", "没有新版本");
        }
        f.d(versionCheckResponse);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h(VersionCheckResponse versionCheckResponse) {
        this.f3220e = null;
        InputView inputView = this.f3218c;
        if (inputView != null) {
            inputView.r(false);
        }
        this.f3221f = false;
        kotlin.s.c.l.f(versionCheckResponse, "<this>");
        IAppLog.a aVar = IAppLog.a;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("versionCode", versionCheckResponse.k());
        jSONObject.put("versionName", versionCheckResponse.m());
        aVar.t("upgrade_ignore", jSONObject);
        this.f3219d.p(versionCheckResponse.k(), true);
        if (h.f7570d == null) {
            throw new IllegalStateException("AppUpgradeManager 还未初始化，请先调用 init 方法。".toString());
        }
        h hVar = h.f7570d;
        kotlin.s.c.l.c(hVar);
        hVar.l(versionCheckResponse.k(), true);
        this.f3220e = null;
    }

    private final void q(long j, long j2, boolean z) {
        IAppGlobals.a aVar = IAppGlobals.a;
        Objects.requireNonNull(aVar);
        aVar.o().edit().putBoolean("upgrade_install_performed_" + j, z).apply();
        if (z) {
            Objects.requireNonNull(aVar);
            aVar.o().edit().putLong(e.a.a.a.a.n("upgrade_install_taskId_", j), j2).apply();
            Objects.requireNonNull(aVar);
            Objects.requireNonNull(aVar);
            aVar.o().edit().putLong("upgrade_install_preversion_" + j, 100309006).apply();
        }
    }

    public final void f() {
        boolean z;
        z = h.f7571e;
        if (!z) {
            j.i("OAppUpgrade", "还未完成初始化，本次请求return");
            return;
        }
        if (this.f3221f) {
            j.i("OAppUpgrade", "mRequestingPermission为true，不再重复请求和弹窗了");
            return;
        }
        if (((Integer) e.a.a.a.a.L0(IAppGlobals.a, C0838R.string.full_base_input_mode, "IAppGlobals.context.getS…ing.full_base_input_mode)", "null cannot be cast to non-null type kotlin.Int")).intValue() == 1) {
            j.i("OAppUpgrade", "基础打字模式，不检查升级");
            return;
        }
        if (this.f3219d.q()) {
            j.i("AppUpgradeHelper", "服务绑定上了");
            this.f3219d.v();
            this.f3219d.n(false, null, new C0101a());
        } else {
            j.i("AppUpgradeHelper", "服务没有绑定");
            this.f3219d.m();
            this.f3219d.s(new b());
        }
    }

    public final VersionCheckResponse g() {
        return this.f3220e;
    }

    public final void i() {
        if (!KeyboardJni.getService().isInputViewShown()) {
            j.i("ImeService", "KeyboardJni.getService().isInputViewShown 为false，直接return");
            return;
        }
        j.i("ImeService", "用户点击了tipsbar上的升级按钮");
        VersionCheckResponse versionCheckResponse = this.f3220e;
        if (versionCheckResponse != null) {
            j.i("ImeService", "mAppUpgradeResponse不为空，弹出升级对话框");
            kotlin.s.c.l.f(versionCheckResponse, "response");
            IAppLog.a.t("upgrade_show", new JSONObject());
            LifecycleCoroutineScope lifecycleCoroutineScope = this.b;
            int i = S.f10199c;
            C0795d.l(lifecycleCoroutineScope, q.f10173c, null, new com.bytedance.android.input.upgrade.c(this, versionCheckResponse, null), 2, null);
        }
    }

    public final void j() {
        if (!KeyboardJni.getService().isInputViewShown()) {
            j.i("ImeService", "onUpgradeTipsClosed 输入法界面没有显示，直接return");
            return;
        }
        j.i("ImeService", "用户关闭了升级tips bar");
        VersionCheckResponse versionCheckResponse = this.f3220e;
        if (versionCheckResponse != null) {
            h(versionCheckResponse);
        }
    }

    public final void k() {
        boolean z;
        z = h.f7571e;
        if (!z) {
            j.i("OAppUpgrade", "reportNewVersionUpgraded AppUpgradeManager 还未初始化");
            return;
        }
        IAppGlobals.a aVar = IAppGlobals.a;
        Objects.requireNonNull(aVar);
        Objects.requireNonNull(aVar);
        if (aVar.o().getBoolean("upgrade_install_performed_100309006", false)) {
            j.i("OAppUpgrade", "上报新版本升级成功埋点 100309006");
            IAppLog.a aVar2 = IAppLog.a;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("versionCode", 100309006);
            aVar2.t("upgrade_success", jSONObject);
            Objects.requireNonNull(aVar);
            final long j = aVar.o().getLong("upgrade_install_taskId_100309006", 0L);
            Objects.requireNonNull(aVar);
            final long j2 = aVar.o().getLong("upgrade_install_preversion_100309006", 0L);
            if (h.f7570d == null) {
                throw new IllegalStateException("AppUpgradeManager 还未初始化，请先调用 init 方法。".toString());
            }
            kotlin.s.c.l.c(h.f7570d);
            final long j3 = 100309006;
            Runnable runnable = new Runnable() { // from class: com.obric.common.upgrade.b
                @Override // java.lang.Runnable
                public final void run() {
                    com.obric.common.upgrade.p.a.b.a().c(6, j, j2, j3, (r19 & 16) != 0 ? "" : null);
                }
            };
            com.obric.common.upgrade.util.f fVar = com.obric.common.upgrade.util.f.a;
            com.obric.common.upgrade.util.f.a(runnable);
            q(j3, j, false);
        }
    }

    public final void l() {
        j.i("OAppUpgrade", "reshowUpgradeUIifNeeded");
        VersionCheckResponse versionCheckResponse = this.f3220e;
        if (versionCheckResponse != null) {
            if (!this.f3221f) {
                this.f3220e = null;
                return;
            }
            if (h.f7570d == null) {
                throw new IllegalStateException("AppUpgradeManager 还未初始化，请先调用 init 方法。".toString());
            }
            h hVar = h.f7570d;
            kotlin.s.c.l.c(hVar);
            if (hVar.k(this.a)) {
                this.f3220e = null;
                InputView inputView = this.f3218c;
                if (inputView != null) {
                    inputView.r(false);
                }
                this.f3221f = false;
                if (h.f7570d == null) {
                    throw new IllegalStateException("AppUpgradeManager 还未初始化，请先调用 init 方法。".toString());
                }
                h hVar2 = h.f7570d;
                kotlin.s.c.l.c(hVar2);
                hVar2.m(new File(versionCheckResponse.a()), new d(versionCheckResponse));
            }
        }
    }

    public final void m(VersionCheckResponse versionCheckResponse) {
        this.f3220e = versionCheckResponse;
    }

    public final void n(boolean z) {
        this.f3221f = z;
    }

    public final void o(long j) {
        if (KeyboardJni.isFloatingMode()) {
            j.i("ImeService", "悬浮状态不显示tipsbar");
            return;
        }
        if (KeyboardJni.getService().isInputViewShown()) {
            j.i("ImeService", "有新版本了，展示tipbar layout中的提示框,versionCode: " + j);
            if (h.f7570d == null) {
                throw new IllegalStateException("AppUpgradeManager 还未初始化，请先调用 init 方法。".toString());
            }
            h hVar = h.f7570d;
            kotlin.s.c.l.c(hVar);
            hVar.s();
            LifecycleCoroutineScope lifecycleCoroutineScope = this.b;
            int i = S.f10199c;
            C0795d.l(lifecycleCoroutineScope, q.f10173c, null, new e(null), 2, null);
        }
    }

    public final void p() {
        boolean z;
        z = h.f7571e;
        if (!z) {
            j.i("OAppUpgrade", "AppUpgradeManager not initialized");
            return;
        }
        com.bytedance.android.input.basic.settings.api.c.e a = IInputSettings.a.a();
        StringBuilder M = e.a.a.a.a.M("updateAppUpgradeGap ");
        M.append(a.a());
        M.append(' ');
        M.append(a.b());
        j.m("OAppUpgrade", M.toString());
        if (h.f7570d == null) {
            throw new IllegalStateException("AppUpgradeManager 还未初始化，请先调用 init 方法。".toString());
        }
        h hVar = h.f7570d;
        kotlin.s.c.l.c(hVar);
        hVar.t(a.a(), a.b());
    }
}
