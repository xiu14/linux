package com.bytedance.android.input.fragment.settings;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.SwitchCompat;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.android.doubaoime.databinding.FragmentInputRecommendBinding;
import com.bytedance.android.input.basic.applog.api.IAppLog;
import com.bytedance.android.input.common.SettingsConfigNext;
import com.bytedance.android.input.popup.WindowId;
import com.bytedance.common_biz.ui.widget.ImeListItemView;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class InputRecommendFragment extends BaseSettingsFragment {
    private FragmentInputRecommendBinding b;

    public static final void s(InputRecommendFragment inputRecommendFragment, boolean z) {
        Objects.requireNonNull(inputRecommendFragment);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("result_type", Integer.valueOf(z ? 1 : 0));
        kotlin.s.c.l.f("typing_assist_popup_result", "eventName");
        com.bytedance.android.input.r.j.i("ImeEventAppLog", "reportEvent typing_assist_popup_result ");
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            jSONObject.put((String) entry.getKey(), entry.getValue());
        }
        IAppLog.a.t("typing_assist_popup_result", jSONObject);
    }

    @Override // com.bytedance.android.input.fragment.settings.BaseSettingsFragment, com.bytedance.android.doubaoime.activity.Q
    public boolean j() {
        Object J2;
        ImeListItemView imeListItemView;
        com.bytedance.android.input.popup.q f2 = com.bytedance.android.input.popup.q.f();
        WindowId windowId = WindowId.ASSOCIATE_CLOSE;
        if (!f2.j(windowId)) {
            return false;
        }
        com.bytedance.android.input.popup.q.f().d(windowId);
        try {
            FragmentInputRecommendBinding fragmentInputRecommendBinding = this.b;
            SwitchCompat a = (fragmentInputRecommendBinding == null || (imeListItemView = fragmentInputRecommendBinding.f1964d) == null) ? null : imeListItemView.a();
            if (a != null) {
                a.setChecked(true);
            }
            String string = getString(C0838R.string.typing_associate_enabled);
            kotlin.s.c.l.e(string, "getString(R.string.typing_associate_enabled)");
            SettingsConfigNext.l(string, Boolean.TRUE);
            J2 = kotlin.o.a;
        } catch (Throwable th) {
            J2 = com.prolificinteractive.materialcalendarview.r.J(th);
        }
        Throwable b = kotlin.h.b(J2);
        if (b != null) {
            e.a.a.a.a.v0("onBackPressed, e: ", b, "InputRecommendFragment");
        }
        return true;
    }

    @Override // com.bytedance.android.input.framework.fragment.BaseImeFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.s.c.l.f(layoutInflater, "inflater");
        FragmentInputRecommendBinding b = FragmentInputRecommendBinding.b(layoutInflater, viewGroup, false);
        this.b = b;
        LinearLayout a = b.a();
        kotlin.s.c.l.e(a, "inflate(inflater, contai…        it.root\n        }");
        return a;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.b = null;
    }

    @Override // com.bytedance.android.input.fragment.settings.BaseSettingsFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        r();
    }

    @Override // com.bytedance.android.input.fragment.settings.BaseSettingsFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        kotlin.s.c.l.f(view, "view");
        super.onViewCreated(view, bundle);
        r();
    }

    @Override // com.bytedance.android.input.fragment.settings.BaseSettingsFragment
    public void p() {
        l();
        FragmentInputRecommendBinding fragmentInputRecommendBinding = this.b;
        if (fragmentInputRecommendBinding != null) {
            ImeListItemView imeListItemView = fragmentInputRecommendBinding.f1964d;
            kotlin.s.c.l.e(imeListItemView, "typingAssociateItem");
            n(imeListItemView, C0838R.string.typing_associate_enabled, new P0(fragmentInputRecommendBinding, this));
            ImeListItemView imeListItemView2 = fragmentInputRecommendBinding.b;
            kotlin.s.c.l.e(imeListItemView2, "emojiRecommendItem");
            BaseSettingsFragment.o(this, imeListItemView2, C0838R.string.emoji_recommend_enabled, null, 4, null);
            ImeListItemView imeListItemView3 = fragmentInputRecommendBinding.f1963c;
            kotlin.s.c.l.e(imeListItemView3, "kaomojiRecommendItem");
            BaseSettingsFragment.o(this, imeListItemView3, C0838R.string.kaomoji_recommend_enabled, null, 4, null);
        }
    }

    @Override // com.bytedance.android.input.fragment.settings.BaseSettingsFragment
    public void r() {
        l();
        FragmentInputRecommendBinding fragmentInputRecommendBinding = this.b;
        if (fragmentInputRecommendBinding != null) {
            String string = getString(C0838R.string.typing_associate_enabled);
            kotlin.s.c.l.e(string, "getString(R.string.typing_associate_enabled)");
            Object f2 = SettingsConfigNext.f(string);
            kotlin.s.c.l.d(f2, "null cannot be cast to non-null type kotlin.Boolean");
            boolean booleanValue = ((Boolean) f2).booleanValue();
            String string2 = getString(C0838R.string.emoji_recommend_enabled);
            kotlin.s.c.l.e(string2, "getString(R.string.emoji_recommend_enabled)");
            Object f3 = SettingsConfigNext.f(string2);
            kotlin.s.c.l.d(f3, "null cannot be cast to non-null type kotlin.Boolean");
            boolean booleanValue2 = ((Boolean) f3).booleanValue();
            String string3 = getString(C0838R.string.kaomoji_recommend_enabled);
            kotlin.s.c.l.e(string3, "getString(R.string.kaomoji_recommend_enabled)");
            Object f4 = SettingsConfigNext.f(string3);
            kotlin.s.c.l.d(f4, "null cannot be cast to non-null type kotlin.Boolean");
            boolean booleanValue3 = ((Boolean) f4).booleanValue();
            StringBuilder sb = new StringBuilder();
            sb.append("updateUI typing_associate_enabled = ");
            sb.append(booleanValue);
            sb.append("---emojiRecommendEnabled = ");
            sb.append(booleanValue2);
            sb.append("---kaomojiRecommendEnabled = ");
            e.a.a.a.a.N0(sb, booleanValue3, "InputRecommendFragment");
            fragmentInputRecommendBinding.f1964d.a().setChecked(booleanValue);
            fragmentInputRecommendBinding.b.a().setChecked(booleanValue2);
            fragmentInputRecommendBinding.f1963c.a().setChecked(booleanValue3);
        }
    }
}
