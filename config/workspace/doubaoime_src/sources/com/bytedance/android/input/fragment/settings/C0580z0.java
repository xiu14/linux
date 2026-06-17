package com.bytedance.android.input.fragment.settings;

import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.android.input.basic.applog.api.IAppLog;
import com.obric.common.upgrade.VersionCheckResponse;
import com.obric.oui.badge.OBadgeView;
import com.obric.oui.button.OButton;
import com.obric.oui.dialog.alert.view.DialogMultiTextView;
import com.obric.oui.lisitem.OListItemSettings;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import org.json.JSONObject;

@kotlin.r.h.a.e(c = "com.bytedance.android.input.fragment.settings.AboutFragment$showUpgradeUI$1", f = "AboutFragment.kt", l = {}, m = "invokeSuspend")
/* renamed from: com.bytedance.android.input.fragment.settings.z0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0580z0 extends kotlin.r.h.a.i implements kotlin.s.b.p<kotlinx.coroutines.G, kotlin.r.d<? super kotlin.o>, Object> {
    final /* synthetic */ VersionCheckResponse a;
    final /* synthetic */ AboutFragment b;

    /* renamed from: com.bytedance.android.input.fragment.settings.z0$a */
    static final class a extends kotlin.s.c.m implements kotlin.s.b.l<FrameLayout, kotlin.o> {
        final /* synthetic */ AboutFragment a;
        final /* synthetic */ VersionCheckResponse b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(AboutFragment aboutFragment, VersionCheckResponse versionCheckResponse) {
            super(1);
            this.a = aboutFragment;
            this.b = versionCheckResponse;
        }

        @Override // kotlin.s.b.l
        public kotlin.o invoke(FrameLayout frameLayout) {
            FrameLayout frameLayout2 = frameLayout;
            kotlin.s.c.l.f(frameLayout2, "it");
            FragmentActivity activity = this.a.getActivity();
            kotlin.s.c.l.d(activity, "null cannot be cast to non-null type android.app.Activity");
            DialogMultiTextView dialogMultiTextView = new DialogMultiTextView(activity, null);
            dialogMultiTextView.g().setText(this.b.i());
            frameLayout2.addView(dialogMultiTextView);
            return kotlin.o.a;
        }
    }

    /* renamed from: com.bytedance.android.input.fragment.settings.z0$b */
    static final class b extends kotlin.s.c.m implements kotlin.s.b.p<DialogInterface, Integer, kotlin.o> {
        final /* synthetic */ String a;
        final /* synthetic */ AboutFragment b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, AboutFragment aboutFragment) {
            super(2);
            this.a = str;
            this.b = aboutFragment;
        }

        @Override // kotlin.s.b.p
        public kotlin.o invoke(DialogInterface dialogInterface, Integer num) {
            DialogInterface dialogInterface2 = dialogInterface;
            num.intValue();
            kotlin.s.c.l.f(dialogInterface2, "dialog");
            String str = this.a;
            if (str == null || str.length() == 0) {
                AboutFragment.s(this.b);
                dialogInterface2.dismiss();
                OBadgeView oBadgeView = this.b.i;
                if (oBadgeView != null) {
                    oBadgeView.setVisibility(8);
                }
                OListItemSettings oListItemSettings = this.b.h;
                if (oListItemSettings == null) {
                    kotlin.s.c.l.l("mUpgradeTips");
                    throw null;
                }
                oListItemSettings.setTrailingText("准备开始下载");
            } else {
                AboutFragment aboutFragment = this.b;
                AboutFragment.x(aboutFragment, this.a, new A0(aboutFragment, dialogInterface2));
            }
            return kotlin.o.a;
        }
    }

    /* renamed from: com.bytedance.android.input.fragment.settings.z0$c */
    static final class c extends kotlin.s.c.m implements kotlin.s.b.p<DialogInterface, Integer, kotlin.o> {
        public static final c a = new c();

        c() {
            super(2);
        }

        @Override // kotlin.s.b.p
        public kotlin.o invoke(DialogInterface dialogInterface, Integer num) {
            DialogInterface dialogInterface2 = dialogInterface;
            num.intValue();
            kotlin.s.c.l.f(dialogInterface2, "dialog");
            dialogInterface2.dismiss();
            return kotlin.o.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C0580z0(VersionCheckResponse versionCheckResponse, AboutFragment aboutFragment, kotlin.r.d<? super C0580z0> dVar) {
        super(2, dVar);
        this.a = versionCheckResponse;
        this.b = aboutFragment;
    }

    @Override // kotlin.r.h.a.a
    public final kotlin.r.d<kotlin.o> create(Object obj, kotlin.r.d<?> dVar) {
        return new C0580z0(this.a, this.b, dVar);
    }

    @Override // kotlin.s.b.p
    public Object invoke(kotlinx.coroutines.G g2, kotlin.r.d<? super kotlin.o> dVar) {
        C0580z0 c0580z0 = new C0580z0(this.a, this.b, dVar);
        kotlin.o oVar = kotlin.o.a;
        c0580z0.invokeSuspend(oVar);
        return oVar;
    }

    @Override // kotlin.r.h.a.a
    public final Object invokeSuspend(Object obj) {
        OButton p;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        com.prolificinteractive.materialcalendarview.r.k0(obj);
        if (com.obric.common.upgrade.h.f7570d == null) {
            throw new IllegalStateException("AppUpgradeManager 还未初始化，请先调用 init 方法。".toString());
        }
        com.obric.common.upgrade.h hVar = com.obric.common.upgrade.h.f7570d;
        kotlin.s.c.l.c(hVar);
        String h = hVar.h(this.a.b());
        FragmentActivity activity = this.b.getActivity();
        kotlin.s.c.l.d(activity, "null cannot be cast to non-null type android.app.Activity");
        com.obric.oui.dialog.alert.e eVar = new com.obric.oui.dialog.alert.e(activity);
        eVar.g(false);
        com.obric.oui.dialog.alert.e.m(eVar, "发现新版本 " + this.a.m(), false, 2, null);
        eVar.h(new com.obric.oui.dialog.alert.f(new a(this.b, this.a)));
        com.obric.oui.dialog.alert.e.i(eVar, false, 1, null);
        eVar.l(h == null || h.length() == 0 ? "升级" : "安装", new b(h, this.b));
        eVar.k("忽略", c.a);
        com.obric.oui.dialog.alert.b a2 = eVar.a();
        AboutFragment aboutFragment = this.b;
        com.obric.oui.dialog.alert.b bVar = a2;
        TextView r = bVar.r();
        if (r != null) {
            r.setGravity(3);
        }
        FragmentActivity activity2 = aboutFragment.getActivity();
        if (activity2 != null && (p = bVar.p()) != null) {
            kotlin.s.c.l.e(activity2, "it");
            kotlin.s.c.l.f(activity2, "context");
            p.setBackground(new ColorDrawable(ContextCompat.getColor(activity2, C0838R.color.ime_color_primary)));
        }
        AboutFragment aboutFragment2 = this.b;
        if (h == null || h.length() == 0) {
            IAppLog.a.t("upgrade_show", new JSONObject());
        }
        bVar.show();
        aboutFragment2.m = bVar;
        return kotlin.o.a;
    }
}
