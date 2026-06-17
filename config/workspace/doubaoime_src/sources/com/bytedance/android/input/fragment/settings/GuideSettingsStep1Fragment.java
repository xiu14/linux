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
import com.bytedance.android.doubaoime.activity.ImeGuideSettingsActivity;
import com.bytedance.android.doubaoime.activity.SettingsActivityNext;
import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.android.input.basic.applog.api.IAppLog;
import com.bytedance.common.wschannel.WsConstants;
import com.bytedance.common_biz.ui.widget.ImeListItemView;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class GuideSettingsStep1Fragment extends BaseSettingsFragment {
    private View b;

    /* renamed from: c, reason: collision with root package name */
    private ImeListItemView f2369c;

    /* renamed from: d, reason: collision with root package name */
    private ImeListItemView f2370d;

    /* renamed from: e, reason: collision with root package name */
    private String f2371e;

    /* renamed from: f, reason: collision with root package name */
    private String f2372f;

    private final void s() {
        y();
        Intent intent = new Intent(requireActivity(), (Class<?>) SettingsActivityNext.class);
        intent.addFlags(67108864);
        intent.putExtra(SettingsActivityNext.EXTRA_SETTINGS_SOURCE, SettingsActivityNext.SETTINGS_SOURCE_PRIVACY);
        startActivity(intent);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    public static void t(GuideSettingsStep1Fragment guideSettingsStep1Fragment, View view) {
        kotlin.s.c.l.f(guideSettingsStep1Fragment, "this$0");
        JSONObject jSONObject = new JSONObject();
        if (((Integer) e.a.a.a.a.L0(IAppGlobals.a, C0838R.string.full_base_input_mode, "IAppGlobals.context.getS…ing.full_base_input_mode)", "null cannot be cast to non-null type kotlin.Int")).intValue() == 1) {
            jSONObject.put(WsConstants.KEY_CONNECTION_STATE, "基础模式");
        } else {
            jSONObject.put(WsConstants.KEY_CONNECTION_STATE, "智能输入模式");
        }
        jSONObject.put("page", "smartsettings");
        IAppLog.a.t("skip_click", jSONObject);
        guideSettingsStep1Fragment.s();
    }

    public static void u(GuideSettingsStep1Fragment guideSettingsStep1Fragment, View view) {
        kotlin.s.c.l.f(guideSettingsStep1Fragment, "this$0");
        KeyboardJni.updateSettingsBooleanValue(guideSettingsStep1Fragment.getString(C0838R.string.guide_step1_has_completed), true);
        guideSettingsStep1Fragment.s();
    }

    public static void v(GuideSettingsStep1Fragment guideSettingsStep1Fragment, View view) {
        kotlin.s.c.l.f(guideSettingsStep1Fragment, "this$0");
        String str = guideSettingsStep1Fragment.f2372f;
        if (str == null) {
            kotlin.s.c.l.l("mUsePersonalDictSettingString");
            throw null;
        }
        kotlin.s.c.l.d(view, "null cannot be cast to non-null type androidx.appcompat.widget.SwitchCompat");
        KeyboardJni.updateSettingsBooleanValue(str, ((SwitchCompat) view).isChecked());
    }

    public static void w(GuideSettingsStep1Fragment guideSettingsStep1Fragment, View view) {
        kotlin.s.c.l.f(guideSettingsStep1Fragment, "this$0");
        String str = guideSettingsStep1Fragment.f2371e;
        if (str == null) {
            kotlin.s.c.l.l("mUseInputHistorySettingString");
            throw null;
        }
        kotlin.s.c.l.d(view, "null cannot be cast to non-null type androidx.appcompat.widget.SwitchCompat");
        KeyboardJni.updateSettingsBooleanValue(str, ((SwitchCompat) view).isChecked());
    }

    public static void x(GuideSettingsStep1Fragment guideSettingsStep1Fragment, View view) {
        kotlin.s.c.l.f(guideSettingsStep1Fragment, "this$0");
        IAppLog.a.i("welcome_smartsettings_nextclick");
        guideSettingsStep1Fragment.y();
        KeyboardJni.updateSettingsBooleanValue(guideSettingsStep1Fragment.getString(C0838R.string.guide_step1_has_completed), true);
        FragmentActivity activity = guideSettingsStep1Fragment.getActivity();
        ImeGuideSettingsActivity imeGuideSettingsActivity = activity instanceof ImeGuideSettingsActivity ? (ImeGuideSettingsActivity) activity : null;
        if (imeGuideSettingsActivity != null) {
            imeGuideSettingsActivity.h();
        }
    }

    private final void y() {
        String str = this.f2371e;
        if (str == null) {
            kotlin.s.c.l.l("mUseInputHistorySettingString");
            throw null;
        }
        ImeListItemView imeListItemView = this.f2369c;
        if (imeListItemView == null) {
            kotlin.s.c.l.l("mUseInputHistory");
            throw null;
        }
        KeyboardJni.updateSettingsBooleanValue(str, imeListItemView.a().isChecked());
        String str2 = this.f2372f;
        if (str2 == null) {
            kotlin.s.c.l.l("mUsePersonalDictSettingString");
            throw null;
        }
        ImeListItemView imeListItemView2 = this.f2370d;
        if (imeListItemView2 != null) {
            KeyboardJni.updateSettingsBooleanValue(str2, imeListItemView2.a().isChecked());
        } else {
            kotlin.s.c.l.l("mUsePersonalDict");
            throw null;
        }
    }

    @Override // com.bytedance.android.input.framework.fragment.BaseImeFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.s.c.l.f(layoutInflater, "inflater");
        if (this.b == null) {
            com.bytedance.android.input.r.j.m("BaseSettingsFragment", "onCreateView");
            View inflate = layoutInflater.inflate(C0838R.layout.fragment_guide_step1_layout, viewGroup, false);
            kotlin.s.c.l.e(inflate, "inflater.inflate(R.layou…layout, container, false)");
            this.b = inflate;
            if (inflate == null) {
                kotlin.s.c.l.l("mRoot");
                throw null;
            }
            if (inflate == null) {
                kotlin.s.c.l.l("mRoot");
                throw null;
            }
            View findViewById = inflate.findViewById(C0838R.id.use_input_history_list_item);
            kotlin.s.c.l.e(findViewById, "mRoot.findViewById<ImeLi…_input_history_list_item)");
            this.f2369c = (ImeListItemView) findViewById;
            String string = getString(C0838R.string.enable_cloud_use_partial_input);
            kotlin.s.c.l.e(string, "getString(R.string.enable_cloud_use_partial_input)");
            this.f2371e = string;
            ImeListItemView imeListItemView = this.f2369c;
            if (imeListItemView == null) {
                kotlin.s.c.l.l("mUseInputHistory");
                throw null;
            }
            SwitchCompat a = imeListItemView.a();
            a.setHapticFeedbackEnabled(false);
            a.setChecked(true);
            a.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.android.input.fragment.settings.q
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    GuideSettingsStep1Fragment.w(GuideSettingsStep1Fragment.this, view);
                }
            });
            View view = this.b;
            if (view == null) {
                kotlin.s.c.l.l("mRoot");
                throw null;
            }
            View findViewById2 = view.findViewById(C0838R.id.use_personal_dict_list_item);
            kotlin.s.c.l.e(findViewById2, "mRoot.findViewById<ImeLi…_personal_dict_list_item)");
            this.f2370d = (ImeListItemView) findViewById2;
            String string2 = getString(C0838R.string.enable_cloud_use_personal_lexicon);
            kotlin.s.c.l.e(string2, "getString(R.string.enabl…oud_use_personal_lexicon)");
            this.f2372f = string2;
            ImeListItemView imeListItemView2 = this.f2370d;
            if (imeListItemView2 == null) {
                kotlin.s.c.l.l("mUsePersonalDict");
                throw null;
            }
            SwitchCompat a2 = imeListItemView2.a();
            a2.setHapticFeedbackEnabled(false);
            a2.setChecked(true);
            a2.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.android.input.fragment.settings.p
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    GuideSettingsStep1Fragment.v(GuideSettingsStep1Fragment.this, view2);
                }
            });
            Button button = (Button) inflate.findViewById(C0838R.id.next_button);
            Bundle arguments = getArguments();
            if (arguments != null ? arguments.getBoolean("ARG_SHOW_AS_STANDALONE", false) : false) {
                button.setText(getString(C0838R.string.guide_complete));
                button.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.android.input.fragment.settings.o
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        GuideSettingsStep1Fragment.u(GuideSettingsStep1Fragment.this, view2);
                    }
                });
            } else {
                button.setText(getString(C0838R.string.guide_next_step1_button_text));
                button.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.android.input.fragment.settings.r
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        GuideSettingsStep1Fragment.x(GuideSettingsStep1Fragment.this, view2);
                    }
                });
            }
            View view2 = this.b;
            if (view2 == null) {
                kotlin.s.c.l.l("mRoot");
                throw null;
            }
            View findViewById3 = view2.findViewById(C0838R.id.tv_right_text);
            if (findViewById3 != null) {
                com.obric.oui.common.util.b.i(findViewById3, true);
                findViewById3.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.android.input.fragment.settings.n
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view3) {
                        GuideSettingsStep1Fragment.t(GuideSettingsStep1Fragment.this, view3);
                    }
                });
            }
            View view3 = this.b;
            if (view3 == null) {
                kotlin.s.c.l.l("mRoot");
                throw null;
            }
            View findViewById4 = view3.findViewById(C0838R.id.iv_back);
            kotlin.s.c.l.e(findViewById4, "mRoot.findViewById<View>(R.id.iv_back)");
            com.obric.oui.common.util.b.i(findViewById4, false);
            String str = this.f2371e;
            if (str == null) {
                kotlin.s.c.l.l("mUseInputHistorySettingString");
                throw null;
            }
            KeyboardJni.updateSettingsBooleanValue(str, false);
            String str2 = this.f2372f;
            if (str2 == null) {
                kotlin.s.c.l.l("mUsePersonalDictSettingString");
                throw null;
            }
            KeyboardJni.updateSettingsBooleanValue(str2, false);
        }
        View view4 = this.b;
        if (view4 != null) {
            return view4;
        }
        kotlin.s.c.l.l("mRoot");
        throw null;
    }

    @Override // com.bytedance.android.input.fragment.settings.BaseSettingsFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        l();
        IAppLog.a.i("welcome_smartsettings_pageview");
    }

    @Override // com.bytedance.android.input.fragment.settings.BaseSettingsFragment
    public void r() {
        l();
    }
}
