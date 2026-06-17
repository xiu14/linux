package com.bytedance.android.input.fragment.settings;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import androidx.annotation.IdRes;
import androidx.annotation.StringRes;
import androidx.appcompat.widget.SwitchCompat;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.android.doubaoime.activity.SettingsActivityNext;
import com.bytedance.android.doubaoime.databinding.FragmentSettingsMainBinding;
import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.android.input.basic.applog.api.IAppLog;
import com.bytedance.android.input.basic.data_storage.api.ImeKv;
import com.bytedance.android.input.basic.data_storage.api.KvRepoStrategy;
import com.bytedance.android.input.basic.settings.api.IInputSettings;
import com.bytedance.android.input.common.SettingsConfigNext;
import com.bytedance.common.utility.NetworkUtils;
import com.bytedance.common.wschannel.WsConstants;
import com.bytedance.common_biz.ui.widget.ImeListItemView;
import com.bytedance.common_biz.ui.widget.ImeTitleBar;
import com.bytedance.lego.init.InitScheduler;
import java.util.Objects;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class MainFragment extends BaseSettingsFragment {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f2403f = 0;
    private FragmentSettingsMainBinding b;

    /* renamed from: c, reason: collision with root package name */
    private ImeListItemView f2404c;

    /* renamed from: d, reason: collision with root package name */
    private int f2405d = 1;

    /* renamed from: e, reason: collision with root package name */
    private final ImeKv.a f2406e = new b();

    static final class a extends kotlin.s.c.m implements kotlin.s.b.l<View, kotlin.o> {
        final /* synthetic */ kotlin.s.b.a<kotlin.o> a;
        final /* synthetic */ MainFragment b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ SettingsActivityNext.FragmentType f2407c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(kotlin.s.b.a<kotlin.o> aVar, MainFragment mainFragment, SettingsActivityNext.FragmentType fragmentType) {
            super(1);
            this.a = aVar;
            this.b = mainFragment;
            this.f2407c = fragmentType;
        }

        @Override // kotlin.s.b.l
        public kotlin.o invoke(View view) {
            kotlin.s.c.l.f(view, "it");
            this.a.invoke();
            FragmentActivity activity = this.b.getActivity();
            kotlin.s.c.l.d(activity, "null cannot be cast to non-null type com.bytedance.android.doubaoime.activity.SettingsActivityNext");
            SettingsActivityNext.switchFragment$default((SettingsActivityNext) activity, this.f2407c, null, 2, null);
            return kotlin.o.a;
        }
    }

    public static final class b implements ImeKv.a {
        b() {
        }

        @Override // com.bytedance.android.input.basic.data_storage.api.ImeKv.a
        public void a(KvRepoStrategy kvRepoStrategy, String str) {
            kotlin.s.c.l.f(kvRepoStrategy, "repoStrategy");
            kotlin.s.c.l.f(str, "key");
            if (kvRepoStrategy == KvRepoStrategy.DEFAULT_SINGLE_PROCESS && kotlin.s.c.l.a(str, "entrance_has_un_read")) {
                IAppGlobals.a aVar = IAppGlobals.a;
                StringBuilder M = e.a.a.a.a.M("MessageCenter KEY_SETTING_ENTRANCE_MESSAGE_VERSION change = ");
                M.append(com.bytedance.android.input.fragment.message.data.f.a.r());
                M.append("---CurrentThreadName = ");
                M.append(Thread.currentThread().getName());
                aVar.j("MainFragment", M.toString());
                com.bytedance.android.input.basic.d.h.a(new RunnableC0539e0(MainFragment.this));
            }
        }
    }

    private final boolean u(String str, @StringRes int i) {
        boolean a2 = com.bytedance.android.input.common_biz.permission.i.a(getActivity(), str);
        String string = getString(i);
        kotlin.s.c.l.e(string, "getString(preferencesStringId)");
        Object f2 = SettingsConfigNext.f(string);
        kotlin.s.c.l.d(f2, "null cannot be cast to non-null type kotlin.Boolean");
        boolean booleanValue = ((Boolean) f2).booleanValue();
        StringBuilder sb = new StringBuilder();
        sb.append("权限类型: ");
        sb.append(str);
        sb.append(", 功能开关: ");
        sb.append(booleanValue);
        sb.append(", 权限状态: ");
        e.a.a.a.a.N0(sb, a2, "MainFragment");
        if (booleanValue && !a2) {
            String string2 = getString(i);
            kotlin.s.c.l.e(string2, "getString(preferencesStringId)");
            SettingsConfigNext.l(string2, Boolean.FALSE);
        }
        return booleanValue && a2;
    }

    private final void v(ImeListItemView imeListItemView, @StringRes int i, final kotlin.s.b.a<kotlin.o> aVar, final String str) {
        final SwitchCompat a2 = imeListItemView.a();
        a2.setHapticFeedbackEnabled(false);
        final String string = getString(i);
        kotlin.s.c.l.e(string, "getString(preferencesStringId)");
        a2.setChecked(u(str, i));
        a2.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.android.input.fragment.settings.b0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String str2 = str;
                SwitchCompat switchCompat = a2;
                MainFragment mainFragment = this;
                String str3 = string;
                kotlin.s.b.a aVar2 = aVar;
                int i2 = MainFragment.f2403f;
                kotlin.s.c.l.f(str2, "$permissionType");
                kotlin.s.c.l.f(switchCompat, "$switchView");
                kotlin.s.c.l.f(mainFragment, "this$0");
                kotlin.s.c.l.f(str3, "$preferencesString");
                kotlin.s.c.l.f(aVar2, "$requestPermission");
                com.bytedance.android.input.r.j.m("MainFragment", str2 + " switchView clicked, targetState: " + switchCompat.isChecked());
                boolean z = false;
                if (!switchCompat.isChecked()) {
                    SettingsConfigNext.l(str3, Boolean.FALSE);
                    switchCompat.setChecked(false);
                    return;
                }
                String string2 = mainFragment.getString(C0838R.string.full_base_input_mode);
                kotlin.s.c.l.e(string2, "getString(R.string.full_base_input_mode)");
                Object f2 = SettingsConfigNext.f(string2);
                kotlin.s.c.l.d(f2, "null cannot be cast to non-null type kotlin.Int");
                if (!(((Integer) f2).intValue() == 0)) {
                    Context context = mainFragment.getContext();
                    if (context != null) {
                        com.bytedance.android.input.keyboard.q.c(context, 0, false, 2);
                    }
                    switchCompat.setChecked(false);
                    SettingsConfigNext.l(str3, Boolean.FALSE);
                    z = true;
                }
                if (z) {
                    return;
                }
                boolean a3 = com.bytedance.android.input.common_biz.permission.i.a(mainFragment.getActivity(), str2);
                switchCompat.setChecked(a3);
                SettingsConfigNext.l(str3, Boolean.valueOf(a3));
                com.bytedance.android.input.r.j.m("MainFragment", "checkPermissionAndSwitchState hasPermission " + a3);
                if (a3) {
                    return;
                }
                aVar2.invoke();
            }
        });
        com.obric.oui.common.util.b.i(imeListItemView, true);
    }

    private final ImeListItemView w(@IdRes int i, SettingsActivityNext.FragmentType fragmentType, kotlin.s.b.a<kotlin.o> aVar) {
        FragmentSettingsMainBinding fragmentSettingsMainBinding = this.b;
        if (fragmentSettingsMainBinding == null) {
            kotlin.s.c.l.l("binding");
            throw null;
        }
        View findViewById = fragmentSettingsMainBinding.a().findViewById(i);
        kotlin.s.c.l.e(findViewById, "binding.root.findViewById(listItemId)");
        ImeListItemView imeListItemView = (ImeListItemView) findViewById;
        e.b.d.a.a.e.g(imeListItemView, new a(aVar, this, fragmentType));
        return imeListItemView;
    }

    static /* synthetic */ ImeListItemView x(MainFragment mainFragment, int i, SettingsActivityNext.FragmentType fragmentType, kotlin.s.b.a aVar, int i2) {
        return mainFragment.w(i, fragmentType, (i2 & 4) != 0 ? a1.a : null);
    }

    public static void y(MainFragment mainFragment, View view, int i, int i2, int i3, int i4) {
        kotlin.s.c.l.f(mainFragment, "this$0");
        FragmentSettingsMainBinding fragmentSettingsMainBinding = mainFragment.b;
        if (fragmentSettingsMainBinding == null) {
            kotlin.s.c.l.l("binding");
            throw null;
        }
        if (i2 >= fragmentSettingsMainBinding.n.getTop()) {
            FragmentSettingsMainBinding fragmentSettingsMainBinding2 = mainFragment.b;
            if (fragmentSettingsMainBinding2 != null) {
                fragmentSettingsMainBinding2.k.setVisibility(0);
                return;
            } else {
                kotlin.s.c.l.l("binding");
                throw null;
            }
        }
        FragmentSettingsMainBinding fragmentSettingsMainBinding3 = mainFragment.b;
        if (fragmentSettingsMainBinding3 != null) {
            fragmentSettingsMainBinding3.k.setVisibility(8);
        } else {
            kotlin.s.c.l.l("binding");
            throw null;
        }
    }

    public static void z(MainFragment mainFragment) {
        kotlin.s.c.l.f(mainFragment, "this$0");
        boolean a2 = com.bytedance.common.a.e.m.a();
        e.a.a.a.a.y0("voiceSendCommandEnabled ", a2, "MainFragment");
        FragmentSettingsMainBinding fragmentSettingsMainBinding = mainFragment.b;
        if (fragmentSettingsMainBinding == null) {
            kotlin.s.c.l.l("binding");
            throw null;
        }
        fragmentSettingsMainBinding.m.setVisibility(a2 ? 0 : 8);
        IAppLog.a aVar = IAppLog.a;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(WsConstants.KEY_CONNECTION_STATE, a2);
        aVar.t("speech_action_set_show", jSONObject);
    }

    public final void A(boolean z) {
        FragmentSettingsMainBinding fragmentSettingsMainBinding = this.b;
        if (fragmentSettingsMainBinding == null) {
            kotlin.s.c.l.l("binding");
            throw null;
        }
        fragmentSettingsMainBinding.j.i(z);
        com.bytedance.android.input.r.j.m("MainFragment", "updateBackButtonVisibility, showBackButton: " + z);
    }

    @Override // com.bytedance.android.input.fragment.settings.BaseSettingsFragment, com.bytedance.android.doubaoime.activity.Q
    public boolean j() {
        return false;
    }

    @Override // com.bytedance.android.input.fragment.settings.BaseSettingsFragment
    public void l() {
        Window window;
        com.bytedance.android.input.r.j.i("MainFragment", "changeNavigationBarColor");
        FragmentActivity activity = getActivity();
        if (activity == null || (window = activity.getWindow()) == null) {
            return;
        }
        window.setNavigationBarColor(activity.getColor(C0838R.color.ime_color_main_setting_bg));
    }

    @Override // com.bytedance.android.input.fragment.settings.BaseSettingsFragment
    public int m() {
        return getResources().getDimensionPixelSize(C0838R.dimen.ime_dp_12);
    }

    @Override // com.bytedance.android.input.framework.fragment.BaseImeFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.s.c.l.f(layoutInflater, "inflater");
        FragmentSettingsMainBinding b2 = FragmentSettingsMainBinding.b(layoutInflater, viewGroup, false);
        kotlin.s.c.l.e(b2, "inflate(inflater, container, false)");
        this.b = b2;
        if (b2 == null) {
            kotlin.s.c.l.l("binding");
            throw null;
        }
        LinearLayout a2 = b2.a();
        kotlin.s.c.l.e(a2, "binding.root");
        return a2;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        com.bytedance.android.input.r.j.i("MainFragment", "onDestroy");
        super.onDestroy();
        ImeKv.a.b(KvRepoStrategy.DEFAULT_SINGLE_PROCESS, this.f2406e);
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        com.bytedance.android.input.r.j.i("MainFragment", "onPause");
        super.onPause();
    }

    @Override // com.bytedance.android.input.fragment.settings.BaseSettingsFragment, androidx.fragment.app.Fragment
    public void onResume() {
        com.bytedance.android.input.r.j.i("MainFragment", "onResume");
        super.onResume();
        if (((Integer) e.a.a.a.a.L0(IAppGlobals.a, C0838R.string.full_base_input_mode, "IAppGlobals.context.getS…ing.full_base_input_mode)", "null cannot be cast to non-null type kotlin.Int")).intValue() == 0 && this.f2405d == 1) {
            this.f2405d = 0;
            InitScheduler.afterPrivacyPopupWindow();
        } else {
            IAppGlobals.a.j("ImeAbTestManager", "[refresh]");
            try {
                com.bytedance.dataplatform.m.m();
            } catch (Throwable th) {
                com.prolificinteractive.materialcalendarview.r.J(th);
            }
        }
        r();
        com.bytedance.android.input.fragment.message.data.f.a.e("setting_main");
        t();
    }

    @Override // com.bytedance.android.input.fragment.settings.BaseSettingsFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        kotlin.s.c.l.f(view, "view");
        super.onViewCreated(view, bundle);
        this.f2405d = ((Integer) e.a.a.a.a.L0(IAppGlobals.a, C0838R.string.full_base_input_mode, "IAppGlobals.context.getS…ing.full_base_input_mode)", "null cannot be cast to non-null type kotlin.Int")).intValue();
        FragmentSettingsMainBinding fragmentSettingsMainBinding = this.b;
        if (fragmentSettingsMainBinding == null) {
            kotlin.s.c.l.l("binding");
            throw null;
        }
        ImeTitleBar imeTitleBar = fragmentSettingsMainBinding.j;
        imeTitleBar.setOnBackClickListener(new b1(this));
        imeTitleBar.setTextStyle(C0838R.style.misans_demibold_20dp);
        imeTitleBar.b(true);
        imeTitleBar.c(com.bytedance.android.input.fragment.message.data.f.a.r());
        ImeKv.a.d(KvRepoStrategy.DEFAULT_SINGLE_PROCESS, this.f2406e);
        imeTitleBar.setIvRightOnClickListener(new View.OnClickListener() { // from class: com.bytedance.android.input.fragment.settings.c0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                MainFragment mainFragment = MainFragment.this;
                int i = MainFragment.f2403f;
                kotlin.s.c.l.f(mainFragment, "this$0");
                int f2 = com.bytedance.android.input.fragment.message.data.f.a.f();
                IAppLog.a aVar = IAppLog.a;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("unreadmessage_number", f2);
                aVar.t("messagebox_click", jSONObject);
                FragmentActivity activity = mainFragment.getActivity();
                kotlin.s.c.l.d(activity, "null cannot be cast to non-null type com.bytedance.android.doubaoime.activity.SettingsActivityNext");
                SettingsActivityNext.switchFragment$default((SettingsActivityNext) activity, SettingsActivityNext.FragmentType.MESSAGE_CENTER, null, 2, null);
            }
        });
        Bundle arguments = getArguments();
        A(arguments != null ? arguments.getBoolean(SettingsActivityNext.SHOW_MAIN_FRAGMENT_BACK_BUTTON, false) : false);
        FragmentSettingsMainBinding fragmentSettingsMainBinding2 = this.b;
        if (fragmentSettingsMainBinding2 == null) {
            kotlin.s.c.l.l("binding");
            throw null;
        }
        fragmentSettingsMainBinding2.k.setVisibility(8);
        FragmentSettingsMainBinding fragmentSettingsMainBinding3 = this.b;
        if (fragmentSettingsMainBinding3 == null) {
            kotlin.s.c.l.l("binding");
            throw null;
        }
        fragmentSettingsMainBinding3.i.setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: com.bytedance.android.input.fragment.settings.a0
            @Override // android.view.View.OnScrollChangeListener
            public final void onScrollChange(View view2, int i, int i2, int i3, int i4) {
                MainFragment.y(MainFragment.this, view2, i, i2, i3, i4);
            }
        });
        this.f2404c = x(this, C0838R.id.fuzzy_title_list_item, SettingsActivityNext.FragmentType.FUZZY, null, 4);
        x(this, C0838R.id.input_recommend_list_item, SettingsActivityNext.FragmentType.INPUT_RECOMMEND, null, 4);
        x(this, C0838R.id.key_auxiliary_input_title_list_item, SettingsActivityNext.FragmentType.KEY_AUXILIARY_INPUT, null, 4);
        x(this, C0838R.id.key_feedback_title_list_item, SettingsActivityNext.FragmentType.KEY_FEEDBACK, null, 4);
        x(this, C0838R.id.input_mode_title_list_item, SettingsActivityNext.FragmentType.INPUT_MODE, null, 4);
        x(this, C0838R.id.ai_chat_assistant_list_item, SettingsActivityNext.FragmentType.AI_CHAT_ASSISTANT, null, 4);
        x(this, C0838R.id.voice_input_list_item, SettingsActivityNext.FragmentType.VOICE_INPUT, null, 4);
        w(C0838R.id.voice_input_action_item, SettingsActivityNext.FragmentType.VOICE_INPUT_ACTION, c1.a);
        x(this, C0838R.id.about, SettingsActivityNext.FragmentType.ABOUT, null, 4);
        x(this, C0838R.id.kbd_layout_list_item, SettingsActivityNext.FragmentType.KBD_LAYOUT, null, 4);
        x(this, C0838R.id.kbd_layout_list_item_multiple_input_type, SettingsActivityNext.FragmentType.MULTIPLE_INPUT_TYPE, null, 4);
        x(this, C0838R.id.clipboard_list_item, SettingsActivityNext.FragmentType.CLIPBOARD, null, 4);
        x(this, C0838R.id.lexicon_management_list_item, SettingsActivityNext.FragmentType.LEXICON_MANAGEMENT, null, 4);
        x(this, C0838R.id.system_permission_list_item, SettingsActivityNext.FragmentType.SYSTEM_PERMISSION, null, 4);
        x(this, C0838R.id.desktop_list_item, SettingsActivityNext.FragmentType.DESKTOP, null, 4);
        x(this, C0838R.id.debug_settings, SettingsActivityNext.FragmentType.DEBUG_SETTINGS, null, 4);
        FragmentSettingsMainBinding fragmentSettingsMainBinding4 = this.b;
        if (fragmentSettingsMainBinding4 == null) {
            kotlin.s.c.l.l("binding");
            throw null;
        }
        ImeListItemView imeListItemView = fragmentSettingsMainBinding4.l;
        kotlin.s.c.l.e(imeListItemView, "binding.userFeedbackListItem");
        e.b.d.a.a.e.g(imeListItemView, d1.a);
        FragmentSettingsMainBinding fragmentSettingsMainBinding5 = this.b;
        if (fragmentSettingsMainBinding5 == null) {
            kotlin.s.c.l.l("binding");
            throw null;
        }
        View view2 = fragmentSettingsMainBinding5.f1988c;
        kotlin.s.c.l.e(view2, "binding.clickableViewEnableAiAssistant");
        e.b.d.a.a.e.g(view2, new e1(this));
        FragmentSettingsMainBinding fragmentSettingsMainBinding6 = this.b;
        if (fragmentSettingsMainBinding6 == null) {
            kotlin.s.c.l.l("binding");
            throw null;
        }
        View view3 = fragmentSettingsMainBinding6.f1989d;
        kotlin.s.c.l.e(view3, "binding.clickableViewEnableReportInputdata");
        e.b.d.a.a.e.g(view3, new f1(this));
        com.bytedance.android.input.r.j.m("MainFragment", "memory size = " + (com.bytedance.android.input.common.u.c.c() / 1048576));
        FragmentSettingsMainBinding fragmentSettingsMainBinding7 = this.b;
        if (fragmentSettingsMainBinding7 == null) {
            kotlin.s.c.l.l("binding");
            throw null;
        }
        ImeListItemView imeListItemView2 = fragmentSettingsMainBinding7.f1991f;
        kotlin.s.c.l.e(imeListItemView2, "binding.enableSmsPermissionListItem");
        v(imeListItemView2, C0838R.string.sms_verification_enabled, g1.a, "android.permission.READ_SMS");
        FragmentSettingsMainBinding fragmentSettingsMainBinding8 = this.b;
        if (fragmentSettingsMainBinding8 == null) {
            kotlin.s.c.l.l("binding");
            throw null;
        }
        ImeListItemView imeListItemView3 = fragmentSettingsMainBinding8.f1992g;
        kotlin.s.c.l.e(imeListItemView3, "binding.enableUpdateContactsListItem");
        v(imeListItemView3, C0838R.string.enable_update_contacts, h1.a, "android.permission.READ_CONTACTS");
        final String string = getString(C0838R.string.enable_report_inputdata);
        kotlin.s.c.l.e(string, "getString(preferencesStringId)");
        FragmentSettingsMainBinding fragmentSettingsMainBinding9 = this.b;
        if (fragmentSettingsMainBinding9 == null) {
            kotlin.s.c.l.l("binding");
            throw null;
        }
        ImeListItemView imeListItemView4 = (ImeListItemView) fragmentSettingsMainBinding9.a().findViewById(C0838R.id.enable_report_inputdata);
        SwitchCompat a2 = imeListItemView4.a();
        a2.setHapticFeedbackEnabled(false);
        Object f2 = SettingsConfigNext.f(string);
        kotlin.s.c.l.d(f2, "null cannot be cast to non-null type kotlin.Boolean");
        a2.setChecked(((Boolean) f2).booleanValue());
        a2.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.android.input.fragment.settings.f0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                String str = string;
                int i = MainFragment.f2403f;
                kotlin.s.c.l.f(str, "$preferencesString");
                kotlin.s.c.l.d(view4, "null cannot be cast to non-null type androidx.appcompat.widget.SwitchCompat");
                SettingsConfigNext.l(str, Boolean.valueOf(((SwitchCompat) view4).isChecked()));
            }
        });
        kotlin.s.c.l.e(imeListItemView4, "listItemView");
        com.obric.oui.common.util.b.i(imeListItemView4, true);
        FragmentSettingsMainBinding fragmentSettingsMainBinding10 = this.b;
        if (fragmentSettingsMainBinding10 == null) {
            kotlin.s.c.l.l("binding");
            throw null;
        }
        ImeListItemView imeListItemView5 = fragmentSettingsMainBinding10.h;
        kotlin.s.c.l.e(imeListItemView5, "binding.helpAndTipsView");
        e.b.d.a.a.e.g(imeListItemView5, new i1(this));
        com.bytedance.dataplatform.m.o(new Z(this));
        r();
    }

    @Override // com.bytedance.android.input.fragment.settings.BaseSettingsFragment
    public void r() {
        l();
        com.bytedance.android.input.r.j.i("MainFragment", "updateUI");
        try {
            IInputSettings.a aVar = IInputSettings.a;
            Objects.requireNonNull(aVar);
            if (aVar.a().k()) {
                com.bytedance.android.input.r.j.i("MainFragment", "[initialize] settings immediately pull");
                Objects.requireNonNull(aVar);
                aVar.e();
            }
        } catch (Exception e2) {
            e.a.a.a.a.o0("updateUI, settings e: ", e2, "MainFragment");
        }
        ImeListItemView imeListItemView = this.f2404c;
        if (imeListItemView != null) {
            String string = getString(C0838R.string.enable_fuzzy);
            kotlin.s.c.l.e(string, "getString(R.string.enable_fuzzy)");
            Object f2 = SettingsConfigNext.f(string);
            kotlin.s.c.l.d(f2, "null cannot be cast to non-null type kotlin.Boolean");
            imeListItemView.setTrailingText(((Boolean) f2).booleanValue() ? getText(C0838R.string.option_open_status).toString() : getText(C0838R.string.option_close_status).toString());
        }
        String string2 = getString(C0838R.string.full_base_input_mode);
        kotlin.s.c.l.e(string2, "getString(R.string.full_base_input_mode)");
        Object f3 = SettingsConfigNext.f(string2);
        kotlin.s.c.l.d(f3, "null cannot be cast to non-null type kotlin.Int");
        boolean z = ((Integer) f3).intValue() == 0;
        com.bytedance.android.input.r.j.m("MainFragment", "updateUI, isFullInputMode: " + z);
        if (!z) {
            String string3 = getString(C0838R.string.sms_verification_enabled);
            kotlin.s.c.l.e(string3, "getString(R.string.sms_verification_enabled)");
            Boolean bool = Boolean.FALSE;
            SettingsConfigNext.l(string3, bool);
            String string4 = getString(C0838R.string.enable_update_contacts);
            kotlin.s.c.l.e(string4, "getString(R.string.enable_update_contacts)");
            SettingsConfigNext.l(string4, bool);
        }
        FragmentSettingsMainBinding fragmentSettingsMainBinding = this.b;
        if (fragmentSettingsMainBinding == null) {
            kotlin.s.c.l.l("binding");
            throw null;
        }
        ImeListItemView imeListItemView2 = fragmentSettingsMainBinding.f1990e;
        kotlin.s.c.l.e(imeListItemView2, "binding.enableReportInputdata");
        com.obric.oui.common.util.b.h(imeListItemView2, z);
        FragmentSettingsMainBinding fragmentSettingsMainBinding2 = this.b;
        if (fragmentSettingsMainBinding2 == null) {
            kotlin.s.c.l.l("binding");
            throw null;
        }
        ImeListItemView imeListItemView3 = fragmentSettingsMainBinding2.b;
        kotlin.s.c.l.e(imeListItemView3, "binding.aiChatAssistantListItem");
        com.obric.oui.common.util.b.h(imeListItemView3, z && IAppGlobals.a.F());
        IAppGlobals.a aVar2 = IAppGlobals.a;
        if (aVar2.h() || !aVar2.F()) {
            FragmentSettingsMainBinding fragmentSettingsMainBinding3 = this.b;
            if (fragmentSettingsMainBinding3 == null) {
                kotlin.s.c.l.l("binding");
                throw null;
            }
            ImeListItemView imeListItemView4 = fragmentSettingsMainBinding3.b;
            kotlin.s.c.l.e(imeListItemView4, "binding.aiChatAssistantListItem");
            com.obric.oui.common.util.b.i(imeListItemView4, false);
        }
        FragmentSettingsMainBinding fragmentSettingsMainBinding4 = this.b;
        if (fragmentSettingsMainBinding4 == null) {
            kotlin.s.c.l.l("binding");
            throw null;
        }
        View view = fragmentSettingsMainBinding4.f1988c;
        kotlin.s.c.l.e(view, "binding.clickableViewEnableAiAssistant");
        com.obric.oui.common.util.b.i(view, !z);
        FragmentSettingsMainBinding fragmentSettingsMainBinding5 = this.b;
        if (fragmentSettingsMainBinding5 == null) {
            kotlin.s.c.l.l("binding");
            throw null;
        }
        View view2 = fragmentSettingsMainBinding5.f1989d;
        kotlin.s.c.l.e(view2, "binding.clickableViewEnableReportInputdata");
        com.obric.oui.common.util.b.i(view2, !z);
        FragmentSettingsMainBinding fragmentSettingsMainBinding6 = this.b;
        if (fragmentSettingsMainBinding6 == null) {
            kotlin.s.c.l.l("binding");
            throw null;
        }
        fragmentSettingsMainBinding6.f1991f.a().setChecked(u("android.permission.READ_SMS", C0838R.string.sms_verification_enabled));
        FragmentSettingsMainBinding fragmentSettingsMainBinding7 = this.b;
        if (fragmentSettingsMainBinding7 == null) {
            kotlin.s.c.l.l("binding");
            throw null;
        }
        fragmentSettingsMainBinding7.f1992g.a().setChecked(u("android.permission.READ_CONTACTS", C0838R.string.enable_update_contacts));
        l();
    }

    public final void t() {
        com.bytedance.common.praise_dialog.f fVar;
        FragmentSettingsMainBinding fragmentSettingsMainBinding = this.b;
        if (fragmentSettingsMainBinding == null) {
            kotlin.s.c.l.l("binding");
            throw null;
        }
        if (fragmentSettingsMainBinding.j.d()) {
            com.bytedance.android.input.r.j.i("MainFragment", "checkShowPraiseDialog 返回按钮可见");
            return;
        }
        IAppGlobals.a aVar = IAppGlobals.a;
        if (!NetworkUtils.h(aVar.getContext())) {
            com.bytedance.android.input.r.j.i("MainFragment", "checkShowPraiseDialog 网络不可用");
            return;
        }
        boolean z = aVar.o().getBoolean(getString(C0838R.string.have_show_praise_dialog), false);
        e.a.a.a.a.y0("checkShowPraiseDialog haveShow ", z, "MainFragment");
        if (z) {
            return;
        }
        String string = getString(C0838R.string.keyboard_first_show_time);
        kotlin.s.c.l.e(string, "getString(R.string.keyboard_first_show_time)");
        Object f2 = SettingsConfigNext.f(string);
        kotlin.s.c.l.d(f2, "null cannot be cast to non-null type kotlin.Long");
        long longValue = ((Long) f2).longValue();
        com.bytedance.android.input.r.j.i("MainFragment", "checkShowPraiseDialog firstShowTime " + longValue);
        if (longValue == 0) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        StringBuilder M = e.a.a.a.a.M("checkShowPraiseDialog currentTime ");
        long j = currentTimeMillis - longValue;
        M.append(j);
        com.bytedance.android.input.r.j.i("MainFragment", M.toString());
        if (j > 604800000) {
            com.bytedance.common.praise_dialog.g gVar = com.bytedance.common.praise_dialog.g.a;
            Application application = aVar.getApplication();
            FragmentActivity activity = getActivity();
            kotlin.s.c.l.f(application, "application");
            com.bytedance.common.praise_dialog.g.a(application);
            fVar = com.bytedance.common.praise_dialog.f.f4159c;
            fVar.d(activity);
            com.bytedance.praisedialoglib.manager.d.h().p(application.getBaseContext(), "favorite");
            aVar.o().edit().putBoolean(getString(C0838R.string.have_show_praise_dialog), true).apply();
        }
    }
}
