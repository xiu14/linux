package com.bytedance.android.input.fragment.settings;

import com.bytedance.android.doubaoime.C0838R;
import com.obric.common.upgrade.VersionCheckResponse;
import com.obric.oui.badge.OBadgeView;
import com.obric.oui.lisitem.OListItemSettings;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

@kotlin.r.h.a.e(c = "com.bytedance.android.input.fragment.settings.AboutFragment$onCheckResultGet$1", f = "AboutFragment.kt", l = {}, m = "invokeSuspend")
/* renamed from: com.bytedance.android.input.fragment.settings.y0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0578y0 extends kotlin.r.h.a.i implements kotlin.s.b.p<kotlinx.coroutines.G, kotlin.r.d<? super kotlin.o>, Object> {
    final /* synthetic */ AboutFragment a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C0578y0(AboutFragment aboutFragment, kotlin.r.d<? super C0578y0> dVar) {
        super(2, dVar);
        this.a = aboutFragment;
    }

    @Override // kotlin.r.h.a.a
    public final kotlin.r.d<kotlin.o> create(Object obj, kotlin.r.d<?> dVar) {
        return new C0578y0(this.a, dVar);
    }

    @Override // kotlin.s.b.p
    public Object invoke(kotlinx.coroutines.G g2, kotlin.r.d<? super kotlin.o> dVar) {
        return new C0578y0(this.a, dVar).invokeSuspend(kotlin.o.a);
    }

    @Override // kotlin.r.h.a.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        com.prolificinteractive.materialcalendarview.r.k0(obj);
        String str = "";
        if (!this.a.isAdded()) {
            OListItemSettings oListItemSettings = this.a.h;
            if (oListItemSettings != null) {
                oListItemSettings.setTrailingText("");
                return kotlin.o.a;
            }
            kotlin.s.c.l.l("mUpgradeTips");
            throw null;
        }
        StringBuilder M = e.a.a.a.a.M("版本检测结果，是否有新版本? ");
        VersionCheckResponse versionCheckResponse = this.a.b;
        kotlin.s.c.l.c(versionCheckResponse);
        M.append(versionCheckResponse.e());
        com.bytedance.android.input.r.j.i("AboutFragment", M.toString());
        VersionCheckResponse versionCheckResponse2 = this.a.b;
        kotlin.s.c.l.c(versionCheckResponse2);
        if (!versionCheckResponse2.e()) {
            str = this.a.getString(C0838R.string.update_version_no_newversion);
            kotlin.s.c.l.e(str, "{\n//                acti…newversion)\n            }");
        } else {
            if (com.obric.common.upgrade.h.f7570d == null) {
                throw new IllegalStateException("AppUpgradeManager 还未初始化，请先调用 init 方法。".toString());
            }
            com.obric.common.upgrade.h hVar = com.obric.common.upgrade.h.f7570d;
            kotlin.s.c.l.c(hVar);
            VersionCheckResponse versionCheckResponse3 = this.a.b;
            kotlin.s.c.l.c(versionCheckResponse3);
            String h = hVar.h(versionCheckResponse3.b());
            if (h == null || h.length() == 0) {
                OBadgeView oBadgeView = this.a.i;
                if (oBadgeView != null) {
                    oBadgeView.setVisibility(0);
                }
            } else {
                OBadgeView oBadgeView2 = this.a.i;
                if (oBadgeView2 != null) {
                    oBadgeView2.setVisibility(8);
                }
                str = this.a.getString(C0838R.string.update_version_downloaded_success);
                kotlin.s.c.l.e(str, "{\n                    mN…uccess)\n                }");
            }
        }
        OListItemSettings oListItemSettings2 = this.a.h;
        if (oListItemSettings2 != null) {
            oListItemSettings2.setTrailingText(str);
            return kotlin.o.a;
        }
        kotlin.s.c.l.l("mUpgradeTips");
        throw null;
    }
}
