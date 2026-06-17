package com.bytedance.android.input.fragment.settings;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.appcompat.widget.SwitchCompat;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.android.doubaoime.KeyboardJni;
import com.bytedance.android.doubaoime.activity.SettingsActivityNext;
import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.android.input.basic.applog.api.IAppLog;
import com.bytedance.android.input.common.SettingsConfigNext;
import com.bytedance.common.wschannel.WsConstants;
import com.bytedance.common_biz.ui.widget.ImeTitleImageItemView;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class GuideSettingsStep2Fragment extends BaseSettingsFragment {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f2373c = 0;
    private View b;

    private final void s() {
        Intent intent = new Intent(requireActivity(), (Class<?>) SettingsActivityNext.class);
        intent.addFlags(67108864);
        intent.putExtra(SettingsActivityNext.EXTRA_SETTINGS_SOURCE, SettingsActivityNext.SETTINGS_SOURCE_PRIVACY);
        startActivity(intent);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    private final JSONObject t() {
        JSONObject jSONObject = new JSONObject();
        if (u()) {
            jSONObject.put(WsConstants.KEY_CONNECTION_STATE, "基础模式");
        } else {
            jSONObject.put(WsConstants.KEY_CONNECTION_STATE, "智能输入模式");
        }
        return jSONObject;
    }

    private final boolean u() {
        return ((Integer) e.a.a.a.a.L0(IAppGlobals.a, C0838R.string.full_base_input_mode, "IAppGlobals.context.getS…ing.full_base_input_mode)", "null cannot be cast to non-null type kotlin.Int")).intValue() == 1;
    }

    public static void v(GuideSettingsStep2Fragment guideSettingsStep2Fragment, View view) {
        kotlin.s.c.l.f(guideSettingsStep2Fragment, "this$0");
        JSONObject t = guideSettingsStep2Fragment.t();
        if (guideSettingsStep2Fragment.u()) {
            com.bytedance.android.input.s.f.a.a("welcome_done", t);
        } else {
            IAppLog.a.t("welcome_done", t);
        }
        guideSettingsStep2Fragment.s();
    }

    public static void w(GuideSettingsStep2Fragment guideSettingsStep2Fragment, View view) {
        kotlin.s.c.l.f(guideSettingsStep2Fragment, "this$0");
        JSONObject t = guideSettingsStep2Fragment.t();
        t.put("page", "commonsettings");
        if (guideSettingsStep2Fragment.u()) {
            com.bytedance.android.input.s.f.a.a("skip_click", t);
        } else {
            IAppLog.a.t("skip_click", t);
        }
        guideSettingsStep2Fragment.s();
    }

    @Override // com.bytedance.android.input.framework.fragment.BaseImeFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.s.c.l.f(layoutInflater, "inflater");
        if (this.b == null) {
            View inflate = layoutInflater.inflate(C0838R.layout.fragment_guide_step2_layout, viewGroup, false);
            kotlin.s.c.l.e(inflate, "inflater.inflate(R.layou…layout, container, false)");
            this.b = inflate;
            if (inflate == null) {
                kotlin.s.c.l.l("mRoot");
                throw null;
            }
            Bundle arguments = getArguments();
            boolean z = arguments != null ? arguments.getBoolean("is_step1_skipped", false) : false;
            Button button = (Button) inflate.findViewById(C0838R.id.complete_button);
            if (z) {
                button.setText(getString(C0838R.string.guide_complete));
            } else {
                button.setText(getString(C0838R.string.guide_complete_step2_button_text));
            }
            View view = this.b;
            if (view == null) {
                kotlin.s.c.l.l("mRoot");
                throw null;
            }
            KeyboardLayoutSelectView keyboardLayoutSelectView = (KeyboardLayoutSelectView) view.findViewById(C0838R.id.kbd_layout_list_item);
            String string = getString(C0838R.string.kbd_layout_26key_number_symbol);
            kotlin.s.c.l.e(string, "getString(R.string.kbd_layout_26key_number_symbol)");
            keyboardLayoutSelectView.setTitle(string);
            kotlin.s.c.l.e(keyboardLayoutSelectView, "keyboardLayoutSelectView");
            String string2 = getString(C0838R.string.kbd_layout_26key_number_symbol_merge_period_comma_merge);
            kotlin.s.c.l.e(string2, "getString(R.string.kbd_l…merge_period_comma_merge)");
            String string3 = getString(C0838R.string.kbd_layout_26key_number_symbol_split_period_comma_merge);
            kotlin.s.c.l.e(string3, "getString(R.string.kbd_l…split_period_comma_merge)");
            String string4 = getString(C0838R.string.kbd_layout_26key_number_symbol_split_period_comma_split);
            kotlin.s.c.l.e(string4, "getString(R.string.kbd_l…split_period_comma_split)");
            String string5 = getString(C0838R.string.kbd_layout_26key_number_symbol_split_period_comma_split);
            kotlin.s.c.l.e(string5, "getString(R.string.kbd_l…split_period_comma_split)");
            KeyboardLayoutSelectView.a(keyboardLayoutSelectView, kotlin.collections.g.K(string2, string3, string4, string5), kotlin.collections.g.K(Integer.valueOf(C0838R.drawable.kbd_layout_26key_number_symbol_merge_period_comma_merge), Integer.valueOf(C0838R.drawable.kbd_layout_26key_number_symbol_split), Integer.valueOf(C0838R.drawable.kbd_layout_26key_number_symbol_split_period_comma_split), Integer.valueOf(C0838R.drawable.kbd_layout_26key_number_symbol_split_period_comma_merge)), C0838R.string.key26_number_symbol_key_style, false, 8, null);
            keyboardLayoutSelectView.setOnItemClickListener(new D0(this));
            View view2 = this.b;
            if (view2 == null) {
                kotlin.s.c.l.l("mRoot");
                throw null;
            }
            ImeTitleImageItemView imeTitleImageItemView = (ImeTitleImageItemView) view2.findViewById(C0838R.id.enable_key_fusiyin_list_item);
            final String string6 = getString(C0838R.string.enable_key_fusiyin);
            kotlin.s.c.l.e(string6, "getString(R.string.enable_key_fusiyin)");
            final SwitchCompat a = imeTitleImageItemView.a();
            a.setHapticFeedbackEnabled(false);
            Object f2 = SettingsConfigNext.f(string6);
            kotlin.s.c.l.d(f2, "null cannot be cast to non-null type kotlin.Boolean");
            a.setChecked(((Boolean) f2).booleanValue());
            a.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.android.input.fragment.settings.s
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    String str = string6;
                    int i = GuideSettingsStep2Fragment.f2373c;
                    kotlin.s.c.l.f(str, "$preferencesString");
                    kotlin.s.c.l.d(view3, "null cannot be cast to non-null type androidx.appcompat.widget.SwitchCompat");
                    KeyboardJni.updateSettingsBooleanValue(str, ((SwitchCompat) view3).isChecked());
                }
            });
            imeTitleImageItemView.b().setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.android.input.fragment.settings.t
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    SwitchCompat switchCompat = SwitchCompat.this;
                    String str = string6;
                    int i = GuideSettingsStep2Fragment.f2373c;
                    kotlin.s.c.l.f(switchCompat, "$this_apply");
                    kotlin.s.c.l.f(str, "$preferencesString");
                    boolean z2 = !switchCompat.isChecked();
                    switchCompat.setChecked(z2);
                    KeyboardJni.updateSettingsBooleanValue(str, z2);
                }
            });
            View view3 = this.b;
            if (view3 == null) {
                kotlin.s.c.l.l("mRoot");
                throw null;
            }
            View findViewById = view3.findViewById(C0838R.id.tv_right_text);
            if (findViewById != null) {
                com.obric.oui.common.util.b.i(findViewById, true);
                findViewById.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.android.input.fragment.settings.v
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view4) {
                        GuideSettingsStep2Fragment.w(GuideSettingsStep2Fragment.this, view4);
                    }
                });
            }
            if (z) {
                View view4 = this.b;
                if (view4 == null) {
                    kotlin.s.c.l.l("mRoot");
                    throw null;
                }
                View findViewById2 = view4.findViewById(C0838R.id.iv_back);
                if (findViewById2 != null) {
                    com.obric.oui.common.util.b.i(findViewById2, false);
                }
            }
            View view5 = this.b;
            if (view5 == null) {
                kotlin.s.c.l.l("mRoot");
                throw null;
            }
            View findViewById3 = view5.findViewById(C0838R.id.complete_button);
            if (findViewById3 != null) {
                findViewById3.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.android.input.fragment.settings.u
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view6) {
                        GuideSettingsStep2Fragment.v(GuideSettingsStep2Fragment.this, view6);
                    }
                });
            }
        }
        View view6 = this.b;
        if (view6 != null) {
            return view6;
        }
        kotlin.s.c.l.l("mRoot");
        throw null;
    }

    @Override // com.bytedance.android.input.fragment.settings.BaseSettingsFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        l();
        JSONObject t = t();
        if (u()) {
            com.bytedance.android.input.s.f.a.a("welcome_commonsettings_pageview", t);
        } else {
            IAppLog.a.t("welcome_commonsettings_pageview", t);
        }
    }

    @Override // com.bytedance.android.input.fragment.settings.BaseSettingsFragment
    public void r() {
        l();
    }
}
