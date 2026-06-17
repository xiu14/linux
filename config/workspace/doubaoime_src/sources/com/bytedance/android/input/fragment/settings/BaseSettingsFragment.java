package com.bytedance.android.input.fragment.settings;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.activity.OnBackPressedDispatcher;
import androidx.annotation.StringRes;
import androidx.appcompat.widget.SwitchCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.android.input.basic.settings.api.ISettingsConfigNextService;
import com.bytedance.android.input.framework.fragment.BaseImeFragment;
import com.bytedance.common_biz.ui.widget.ImeListItemView;
import com.bytedance.common_biz.ui.widget.ImeTitleBar;

/* loaded from: classes.dex */
public abstract class BaseSettingsFragment extends BaseImeFragment implements com.bytedance.android.doubaoime.activity.Q {
    public static final /* synthetic */ int a = 0;

    static final class a extends kotlin.s.c.m implements kotlin.s.b.a<kotlin.o> {
        a() {
            super(0);
        }

        @Override // kotlin.s.b.a
        public kotlin.o invoke() {
            BaseSettingsFragment.this.q();
            return kotlin.o.a;
        }
    }

    public static /* synthetic */ void o(BaseSettingsFragment baseSettingsFragment, ImeListItemView imeListItemView, int i, kotlin.s.b.q qVar, int i2, Object obj) {
        int i3 = i2 & 4;
        baseSettingsFragment.n(imeListItemView, i, null);
    }

    @Override // com.bytedance.android.doubaoime.activity.Q
    public boolean j() {
        return false;
    }

    public void l() {
        Window window;
        FragmentActivity activity = getActivity();
        if (activity == null || (window = activity.getWindow()) == null) {
            return;
        }
        window.setNavigationBarColor(ContextCompat.getColor(activity, C0838R.color.ime_color_setting_bg));
    }

    public int m() {
        return 0;
    }

    public final void n(ImeListItemView imeListItemView, @StringRes int i, final kotlin.s.b.q<? super SwitchCompat, ? super Boolean, ? super String, kotlin.o> qVar) {
        kotlin.s.c.l.f(imeListItemView, "listItemView");
        final SwitchCompat a2 = imeListItemView.a();
        a2.setHapticFeedbackEnabled(false);
        final String string = getString(i);
        kotlin.s.c.l.e(string, "getString(preferencesStringId)");
        Object a3 = ISettingsConfigNextService.a.a(string);
        Boolean bool = a3 instanceof Boolean ? (Boolean) a3 : null;
        boolean booleanValue = bool != null ? bool.booleanValue() : false;
        a2.setChecked(booleanValue);
        IAppGlobals.a.x("BaseSettingsFragment", getClass().getSimpleName() + " initImeListItemSwitch, preferencesString=" + string + ", initialState: " + a2.isChecked() + " state=" + booleanValue);
        a2.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.android.input.fragment.settings.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BaseSettingsFragment baseSettingsFragment = BaseSettingsFragment.this;
                String str = string;
                SwitchCompat switchCompat = a2;
                kotlin.s.b.q qVar2 = qVar;
                int i2 = BaseSettingsFragment.a;
                kotlin.s.c.l.f(baseSettingsFragment, "this$0");
                kotlin.s.c.l.f(str, "$preferencesString");
                kotlin.s.c.l.f(switchCompat, "$switchView");
                IAppGlobals.a.x("BaseSettingsFragment", baseSettingsFragment.getClass().getSimpleName() + " switchView clicked, preferencesString=" + str + ", targetState: " + switchCompat.isChecked());
                ISettingsConfigNextService.a.b(str, Boolean.valueOf(switchCompat.isChecked()));
                if (qVar2 != null) {
                    qVar2.d(switchCompat, Boolean.valueOf(switchCompat.isChecked()), "switchViewClick");
                }
            }
        });
        com.obric.oui.common.util.b.i(imeListItemView, true);
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        IAppGlobals.a aVar = IAppGlobals.a;
        StringBuilder M = e.a.a.a.a.M("onHiddenChanged: ");
        M.append(getClass().getSimpleName());
        M.append(", hidden: ");
        M.append(z);
        aVar.j("BaseSettingsFragment", M.toString());
        if (z) {
            return;
        }
        r();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        try {
            com.bytedance.android.input.basic.d.d.f(getActivity());
            com.bytedance.android.input.basic.d.d.e(getActivity());
            FragmentActivity activity = getActivity();
            if (activity != null) {
                com.bytedance.android.input.basic.d.d.d(activity, (activity.getResources().getConfiguration().uiMode & 48) == 32);
            }
            l();
        } catch (Exception e2) {
            IAppGlobals.a.J("BaseSettingsFragment", e2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        kotlin.s.c.l.f(view, "view");
        super.onViewCreated(view, bundle);
        int identifier = getResources().getIdentifier("settings_title_bar", "id", requireContext().getPackageName());
        ImeTitleBar imeTitleBar = identifier != 0 ? (ImeTitleBar) view.findViewById(identifier) : null;
        if (imeTitleBar != null) {
            com.bytedance.common_biz.ui.utils.a.a(imeTitleBar, m());
            imeTitleBar.setOnBackClickListener(new a());
        }
        p();
    }

    public void p() {
        l();
    }

    public void q() {
        Object J2;
        FragmentActivity activity;
        OnBackPressedDispatcher onBackPressedDispatcher;
        try {
            if (!getParentFragmentManager().popBackStackImmediate() && (activity = getActivity()) != null && (onBackPressedDispatcher = activity.getOnBackPressedDispatcher()) != null) {
                onBackPressedDispatcher.onBackPressed();
            }
            J2 = kotlin.o.a;
        } catch (Throwable th) {
            J2 = com.prolificinteractive.materialcalendarview.r.J(th);
        }
        Throwable b = kotlin.h.b(J2);
        if (b != null) {
            e.a.a.a.a.O0(b, e.a.a.a.a.M("onTitleBarBackClick: "), IAppGlobals.a, "BaseSettingsFragment");
        }
    }

    public void r() {
        l();
    }
}
