package com.bytedance.android.input.fragment.settings;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.IdRes;
import androidx.annotation.StringRes;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.android.input.common.SettingsConfigNext;
import com.obric.oui.lisitem.OListItemGeneral;
import com.obric.oui.oswitch.OSwitch;

/* loaded from: classes.dex */
public final class AiChatAssistantFragment extends BaseSettingsFragment {

    /* renamed from: c, reason: collision with root package name */
    private View f2363c;

    /* renamed from: f, reason: collision with root package name */
    private OSwitch f2366f;

    /* renamed from: g, reason: collision with root package name */
    private TextView f2367g;
    private final String b = "AiChatAssistantFragment";

    /* renamed from: d, reason: collision with root package name */
    private int f2364d = -1;

    /* renamed from: e, reason: collision with root package name */
    private int f2365e = -1;

    private final void s(final View view, @IdRes final int i, @StringRes int i2, boolean z) {
        OListItemGeneral oListItemGeneral = (OListItemGeneral) view.findViewById(i);
        final String string = getString(i2);
        kotlin.s.c.l.e(string, "getString(preferencesStringId)");
        if (!z) {
            com.bytedance.android.input.r.j.i(this.b, "initPreferencesSubSwitch set invisible,return");
            kotlin.s.c.l.e(oListItemGeneral, "listItemView");
            com.obric.oui.common.util.b.e(oListItemGeneral);
            oListItemGeneral.setVisibility(4);
            SettingsConfigNext.l(string, Boolean.FALSE);
            return;
        }
        Context requireContext = requireContext();
        kotlin.s.c.l.e(requireContext, "requireContext()");
        final OSwitch oSwitch = new OSwitch(requireContext, null, 0, 6);
        Object f2 = SettingsConfigNext.f(string);
        kotlin.s.c.l.d(f2, "null cannot be cast to non-null type kotlin.Boolean");
        boolean booleanValue = ((Boolean) f2).booleanValue();
        oSwitch.setHapticFeedbackEnabled(false);
        oSwitch.setChecked(booleanValue);
        oSwitch.setChecked(booleanValue);
        if (kotlin.s.c.l.a(string, getString(C0838R.string.enable_ai_chat_assistant_wechat))) {
            this.f2364d = oSwitch.isChecked() ? 1 : 0;
        } else if (kotlin.s.c.l.a(string, getString(C0838R.string.enable_ai_chat_assistant_qq))) {
            this.f2365e = oSwitch.isChecked() ? 1 : 0;
        }
        oSwitch.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.android.input.fragment.settings.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                AiChatAssistantFragment.t(AiChatAssistantFragment.this, i, oSwitch, string, view, view2);
            }
        });
        oListItemGeneral.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.android.input.fragment.settings.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                AiChatAssistantFragment.v(OSwitch.this, this, string, view, view2);
            }
        });
        oListItemGeneral.setTrailingView(oSwitch);
        kotlin.s.c.l.e(oListItemGeneral, "listItemView");
        com.obric.oui.common.util.b.i(oListItemGeneral, true);
    }

    public static void t(AiChatAssistantFragment aiChatAssistantFragment, int i, OSwitch oSwitch, String str, View view, View view2) {
        kotlin.s.c.l.f(aiChatAssistantFragment, "this$0");
        kotlin.s.c.l.f(oSwitch, "$switch");
        kotlin.s.c.l.f(str, "$preferencesString");
        kotlin.s.c.l.f(view, "$root");
        String str2 = aiChatAssistantFragment.b;
        StringBuilder N = e.a.a.a.a.N("initPreferencesSubSwitch switch status change listItemid=", i, ", status=");
        N.append(oSwitch.isChecked());
        com.bytedance.android.input.r.j.i(str2, N.toString());
        SettingsConfigNext.l(str, Boolean.valueOf(oSwitch.isChecked()));
        if (oSwitch.isChecked()) {
            if (kotlin.s.c.l.a(str, aiChatAssistantFragment.getString(C0838R.string.enable_ai_chat_assistant_wechat))) {
                aiChatAssistantFragment.f2364d = 1;
                return;
            } else {
                if (kotlin.s.c.l.a(str, aiChatAssistantFragment.getString(C0838R.string.enable_ai_chat_assistant_qq))) {
                    aiChatAssistantFragment.f2365e = 1;
                    return;
                }
                return;
            }
        }
        if (kotlin.s.c.l.a(str, aiChatAssistantFragment.getString(C0838R.string.enable_ai_chat_assistant_wechat))) {
            aiChatAssistantFragment.f2364d = 0;
        } else if (kotlin.s.c.l.a(str, aiChatAssistantFragment.getString(C0838R.string.enable_ai_chat_assistant_qq))) {
            aiChatAssistantFragment.f2365e = 0;
        }
        if (aiChatAssistantFragment.f2364d == 0 && aiChatAssistantFragment.f2365e == 0) {
            com.bytedance.android.input.r.j.m(aiChatAssistantFragment.b, "all app close, total switch change to close");
            String string = aiChatAssistantFragment.getString(C0838R.string.enable_ai_chat_assistant_all);
            kotlin.s.c.l.e(string, "getString(R.string.enable_ai_chat_assistant_all)");
            SettingsConfigNext.l(string, 0);
            OSwitch oSwitch2 = aiChatAssistantFragment.f2366f;
            if (oSwitch2 == null) {
                kotlin.s.c.l.l("mTotalSwitch");
                throw null;
            }
            oSwitch2.setChecked(false);
            TextView textView = aiChatAssistantFragment.f2367g;
            if (textView != null) {
                textView.setVisibility(4);
            }
            aiChatAssistantFragment.s(view, C0838R.id.enable_wechat_ai_chat_assistant_item, C0838R.string.enable_ai_chat_assistant_wechat, false);
            aiChatAssistantFragment.s(view, C0838R.id.enable_QQ_ai_chat_assistant_item, C0838R.string.enable_ai_chat_assistant_qq, false);
        }
    }

    public static void u(AiChatAssistantFragment aiChatAssistantFragment, String str, View view, View view2) {
        kotlin.s.c.l.f(aiChatAssistantFragment, "this$0");
        kotlin.s.c.l.f(str, "$preferencesString");
        kotlin.s.c.l.f(view, "$root");
        OSwitch oSwitch = aiChatAssistantFragment.f2366f;
        if (oSwitch == null) {
            kotlin.s.c.l.l("mTotalSwitch");
            throw null;
        }
        boolean z = !oSwitch.isChecked();
        OSwitch oSwitch2 = aiChatAssistantFragment.f2366f;
        if (oSwitch2 == null) {
            kotlin.s.c.l.l("mTotalSwitch");
            throw null;
        }
        oSwitch2.setChecked(z);
        SettingsConfigNext.l(str, Integer.valueOf(z ? 1 : 0));
        if (z) {
            com.bytedance.android.input.r.j.i(aiChatAssistantFragment.b, "initPreferencesTotalSwitch itemview click open");
            aiChatAssistantFragment.x(view, true);
        } else {
            com.bytedance.android.input.r.j.i(aiChatAssistantFragment.b, "initPreferencesTotalSwitch itemview click close");
            aiChatAssistantFragment.x(view, false);
        }
    }

    public static void v(OSwitch oSwitch, AiChatAssistantFragment aiChatAssistantFragment, String str, View view, View view2) {
        kotlin.s.c.l.f(oSwitch, "$switch");
        kotlin.s.c.l.f(aiChatAssistantFragment, "this$0");
        kotlin.s.c.l.f(str, "$preferencesString");
        kotlin.s.c.l.f(view, "$root");
        boolean z = !oSwitch.isChecked();
        oSwitch.setChecked(z);
        com.bytedance.android.input.r.j.i(aiChatAssistantFragment.b, "initPreferencesSubSwitch listItemView click, change state targetState: " + z);
        SettingsConfigNext.l(str, Boolean.valueOf(z));
        if (oSwitch.isChecked()) {
            if (kotlin.s.c.l.a(str, aiChatAssistantFragment.getString(C0838R.string.enable_ai_chat_assistant_wechat))) {
                aiChatAssistantFragment.f2364d = 1;
                return;
            } else {
                if (kotlin.s.c.l.a(str, aiChatAssistantFragment.getString(C0838R.string.enable_ai_chat_assistant_qq))) {
                    aiChatAssistantFragment.f2365e = 1;
                    return;
                }
                return;
            }
        }
        if (kotlin.s.c.l.a(str, aiChatAssistantFragment.getString(C0838R.string.enable_ai_chat_assistant_wechat))) {
            aiChatAssistantFragment.f2364d = 0;
        } else if (kotlin.s.c.l.a(str, aiChatAssistantFragment.getString(C0838R.string.enable_ai_chat_assistant_qq))) {
            aiChatAssistantFragment.f2365e = 0;
        }
        if (aiChatAssistantFragment.f2364d == 0 && aiChatAssistantFragment.f2365e == 0) {
            com.bytedance.android.input.r.j.m(aiChatAssistantFragment.b, "all app close, total switch change to close");
            String string = aiChatAssistantFragment.getString(C0838R.string.enable_ai_chat_assistant_all);
            kotlin.s.c.l.e(string, "getString(R.string.enable_ai_chat_assistant_all)");
            SettingsConfigNext.l(string, 0);
            OSwitch oSwitch2 = aiChatAssistantFragment.f2366f;
            if (oSwitch2 == null) {
                kotlin.s.c.l.l("mTotalSwitch");
                throw null;
            }
            oSwitch2.setChecked(false);
            TextView textView = aiChatAssistantFragment.f2367g;
            if (textView != null) {
                textView.setVisibility(4);
            }
            aiChatAssistantFragment.s(view, C0838R.id.enable_wechat_ai_chat_assistant_item, C0838R.string.enable_ai_chat_assistant_wechat, false);
            aiChatAssistantFragment.s(view, C0838R.id.enable_QQ_ai_chat_assistant_item, C0838R.string.enable_ai_chat_assistant_qq, false);
        }
    }

    public static void w(String str, AiChatAssistantFragment aiChatAssistantFragment, View view, View view2) {
        kotlin.s.c.l.f(str, "$preferencesString");
        kotlin.s.c.l.f(aiChatAssistantFragment, "this$0");
        kotlin.s.c.l.f(view, "$root");
        kotlin.s.c.l.d(view2, "null cannot be cast to non-null type com.obric.oui.oswitch.OSwitch");
        OSwitch oSwitch = (OSwitch) view2;
        SettingsConfigNext.l(str, Integer.valueOf(oSwitch.isChecked() ? 1 : 0));
        if (oSwitch.isChecked()) {
            com.bytedance.android.input.r.j.i(aiChatAssistantFragment.b, "initPreferencesTotalSwitch open");
            aiChatAssistantFragment.x(view, true);
        } else {
            com.bytedance.android.input.r.j.i(aiChatAssistantFragment.b, "initPreferencesTotalSwitch close");
            aiChatAssistantFragment.x(view, false);
        }
    }

    private final void x(View view, boolean z) {
        if (z) {
            TextView textView = this.f2367g;
            if (textView != null) {
                textView.setVisibility(0);
            }
        } else {
            TextView textView2 = this.f2367g;
            if (textView2 != null) {
                textView2.setVisibility(4);
            }
        }
        String string = getString(C0838R.string.enable_ai_chat_assistant_wechat);
        kotlin.s.c.l.e(string, "getString(R.string.enabl…ai_chat_assistant_wechat)");
        SettingsConfigNext.l(string, Boolean.valueOf(z));
        String string2 = getString(C0838R.string.enable_ai_chat_assistant_qq);
        kotlin.s.c.l.e(string2, "getString(R.string.enable_ai_chat_assistant_qq)");
        SettingsConfigNext.l(string2, Boolean.valueOf(z));
        s(view, C0838R.id.enable_wechat_ai_chat_assistant_item, C0838R.string.enable_ai_chat_assistant_wechat, z);
        s(view, C0838R.id.enable_QQ_ai_chat_assistant_item, C0838R.string.enable_ai_chat_assistant_qq, z);
        this.f2364d = z ? 1 : 0;
        this.f2365e = z ? 1 : 0;
    }

    @Override // com.bytedance.android.input.framework.fragment.BaseImeFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.s.c.l.f(layoutInflater, "inflater");
        if (this.f2363c == null) {
            final View inflate = layoutInflater.inflate(C0838R.layout.fragment_ai_chat_assistant, viewGroup, false);
            kotlin.s.c.l.e(inflate, "inflater.inflate(R.layou…istant, container, false)");
            this.f2363c = inflate;
            if (inflate == null) {
                kotlin.s.c.l.l("mRoot");
                throw null;
            }
            if (this.f2366f == null) {
                Context requireContext = requireContext();
                kotlin.s.c.l.e(requireContext, "requireContext()");
                OSwitch oSwitch = new OSwitch(requireContext, null, 0, 6);
                this.f2366f = oSwitch;
                oSwitch.setHapticFeedbackEnabled(false);
            }
            final String string = getString(C0838R.string.enable_ai_chat_assistant_all);
            kotlin.s.c.l.e(string, "getString(preferencesStringId)");
            OListItemGeneral oListItemGeneral = (OListItemGeneral) inflate.findViewById(C0838R.id.enable_ai_chat_assistant_all_item);
            this.f2367g = (TextView) inflate.findViewById(C0838R.id.aichat_settings_app_all_text);
            Object f2 = SettingsConfigNext.f(string);
            kotlin.s.c.l.d(f2, "null cannot be cast to non-null type kotlin.Int");
            int intValue = ((Integer) f2).intValue();
            com.bytedance.android.input.r.j.i(this.b, "initPreferencesTotalSwitch key: " + string + ", isChecked=" + intValue);
            if (intValue == -1) {
                com.bytedance.android.input.r.j.i(this.b, "initPreferencesTotalSwitch aichat  default config");
                TextView textView = this.f2367g;
                if (textView != null) {
                    textView.setVisibility(4);
                }
                s(inflate, C0838R.id.enable_wechat_ai_chat_assistant_item, C0838R.string.enable_ai_chat_assistant_wechat, false);
                s(inflate, C0838R.id.enable_QQ_ai_chat_assistant_item, C0838R.string.enable_ai_chat_assistant_qq, false);
            } else if (intValue == 0) {
                com.bytedance.android.input.r.j.i(this.b, "initPreferencesTotalSwitch aichat close.");
                TextView textView2 = this.f2367g;
                if (textView2 != null) {
                    textView2.setVisibility(4);
                }
                s(inflate, C0838R.id.enable_wechat_ai_chat_assistant_item, C0838R.string.enable_ai_chat_assistant_wechat, false);
                s(inflate, C0838R.id.enable_QQ_ai_chat_assistant_item, C0838R.string.enable_ai_chat_assistant_qq, false);
            } else if (intValue == 1) {
                com.bytedance.android.input.r.j.i(this.b, "initPreferencesTotalSwitch aichat open.");
                TextView textView3 = this.f2367g;
                if (textView3 != null) {
                    textView3.setVisibility(0);
                }
                s(inflate, C0838R.id.enable_wechat_ai_chat_assistant_item, C0838R.string.enable_ai_chat_assistant_wechat, true);
                s(inflate, C0838R.id.enable_QQ_ai_chat_assistant_item, C0838R.string.enable_ai_chat_assistant_qq, true);
            }
            OSwitch oSwitch2 = this.f2366f;
            if (oSwitch2 == null) {
                kotlin.s.c.l.l("mTotalSwitch");
                throw null;
            }
            oSwitch2.setChecked(intValue > 0);
            OSwitch oSwitch3 = this.f2366f;
            if (oSwitch3 == null) {
                kotlin.s.c.l.l("mTotalSwitch");
                throw null;
            }
            oSwitch3.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.android.input.fragment.settings.i
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AiChatAssistantFragment.w(string, this, inflate, view);
                }
            });
            oListItemGeneral.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.android.input.fragment.settings.g
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AiChatAssistantFragment.u(AiChatAssistantFragment.this, string, inflate, view);
                }
            });
            OSwitch oSwitch4 = this.f2366f;
            if (oSwitch4 == null) {
                kotlin.s.c.l.l("mTotalSwitch");
                throw null;
            }
            oListItemGeneral.setTrailingView(oSwitch4);
            kotlin.s.c.l.e(oListItemGeneral, "listItemView");
            com.obric.oui.common.util.b.i(oListItemGeneral, true);
        }
        View view = this.f2363c;
        if (view != null) {
            return view;
        }
        kotlin.s.c.l.l("mRoot");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
    }

    @Override // com.bytedance.android.input.fragment.settings.BaseSettingsFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
    }
}
