package com.bytedance.android.input.fragment.settings;

import android.content.ContentResolver;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.android.input.common.SettingsConfigNext;
import com.bytedance.common_biz.ui.widget.ImeCheckBox;
import java.util.Objects;

/* loaded from: classes.dex */
public final class InputModeFragment extends BaseSettingsFragment {
    private final String b = "InputModeFragment";

    /* renamed from: c, reason: collision with root package name */
    private View f2374c;

    /* renamed from: d, reason: collision with root package name */
    private ImeCheckBox[] f2375d;

    /* renamed from: e, reason: collision with root package name */
    private LinearLayout f2376e;

    public static void s(InputModeFragment inputModeFragment, View view) {
        kotlin.s.c.l.f(inputModeFragment, "this$0");
        ImeCheckBox[] imeCheckBoxArr = inputModeFragment.f2375d;
        if (imeCheckBoxArr == null) {
            kotlin.s.c.l.l("mSelectionGroup");
            throw null;
        }
        for (ImeCheckBox imeCheckBox : imeCheckBoxArr) {
            imeCheckBox.setChecked(false);
        }
        ImeCheckBox[] imeCheckBoxArr2 = inputModeFragment.f2375d;
        if (imeCheckBoxArr2 == null) {
            kotlin.s.c.l.l("mSelectionGroup");
            throw null;
        }
        int length = imeCheckBoxArr2.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            } else if (imeCheckBoxArr2[i].getId() == view.getId()) {
                break;
            } else {
                i++;
            }
        }
        ImeCheckBox[] imeCheckBoxArr3 = inputModeFragment.f2375d;
        if (imeCheckBoxArr3 == null) {
            kotlin.s.c.l.l("mSelectionGroup");
            throw null;
        }
        imeCheckBoxArr3[i].setChecked(true);
        if (i == 0 && com.bytedance.android.input.k.a.a.a()) {
            com.bytedance.android.input.k.a.a.b(false);
            try {
                IAppGlobals.a aVar = IAppGlobals.a;
                Objects.requireNonNull(aVar);
                ContentResolver contentResolver = aVar.getContext().getContentResolver();
                Uri parse = Uri.parse("content://com.bytedance.android.doubaoime.provider");
                kotlin.s.c.l.e(parse, "parse(this)");
                contentResolver.call(parse, "notifyInitTask", "", new Bundle());
            } catch (Exception e2) {
                e.a.a.a.a.n0("notifyInitTask failed:", e2, "KeyboardImeComms");
            }
        }
        String string = inputModeFragment.getString(C0838R.string.full_base_input_mode);
        kotlin.s.c.l.e(string, "getString(R.string.full_base_input_mode)");
        SettingsConfigNext.l(string, Integer.valueOf(i));
        inputModeFragment.t(i);
    }

    private final void t(int i) {
        if (i == 0) {
            LinearLayout linearLayout = this.f2376e;
            if (linearLayout != null) {
                e.b.d.a.a.e.h(linearLayout);
                return;
            }
            return;
        }
        LinearLayout linearLayout2 = this.f2376e;
        if (linearLayout2 != null) {
            e.b.d.a.a.e.e(linearLayout2);
        }
    }

    @Override // com.bytedance.android.input.framework.fragment.BaseImeFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.s.c.l.f(layoutInflater, "inflater");
        if (this.f2374c == null) {
            View inflate = layoutInflater.inflate(C0838R.layout.fragment_input_mode, viewGroup, false);
            kotlin.s.c.l.e(inflate, "inflater.inflate(R.layou…t_mode, container, false)");
            this.f2374c = inflate;
            if (inflate == null) {
                kotlin.s.c.l.l("mRoot");
                throw null;
            }
            ImeCheckBox imeCheckBox = (ImeCheckBox) inflate.findViewById(C0838R.id.ai_input_checkbox);
            ImeCheckBox imeCheckBox2 = (ImeCheckBox) inflate.findViewById(C0838R.id.base_input_checkbox);
            kotlin.s.c.l.e(imeCheckBox, "aiInputCheckbox");
            kotlin.s.c.l.e(imeCheckBox2, "baseInputCheckbox");
            ImeCheckBox[] imeCheckBoxArr = {imeCheckBox, imeCheckBox2};
            this.f2375d = imeCheckBoxArr;
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.bytedance.android.input.fragment.settings.w
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    InputModeFragment.s(InputModeFragment.this, view);
                }
            };
            for (int i = 0; i < 2; i++) {
                imeCheckBoxArr[i].setHookOnClickListener(onClickListener);
            }
            View findViewById = inflate.findViewById(C0838R.id.ai_input_container);
            kotlin.s.c.l.e(findViewById, "root.findViewById<Linear…(R.id.ai_input_container)");
            e.b.d.a.a.e.g(findViewById, new E0(onClickListener, imeCheckBox));
            View findViewById2 = inflate.findViewById(C0838R.id.base_input_container);
            kotlin.s.c.l.e(findViewById2, "root.findViewById<Linear….id.base_input_container)");
            e.b.d.a.a.e.g(findViewById2, new F0(onClickListener, imeCheckBox2));
            LinearLayout linearLayout = (LinearLayout) inflate.findViewById(C0838R.id.more_settings_container);
            this.f2376e = linearLayout;
            if (linearLayout != null) {
                e.b.d.a.a.e.g(linearLayout, new G0(this));
            }
            String string = getString(C0838R.string.full_base_input_mode);
            kotlin.s.c.l.e(string, "getString(R.string.full_base_input_mode)");
            Object f2 = SettingsConfigNext.f(string);
            kotlin.s.c.l.d(f2, "null cannot be cast to non-null type kotlin.Int");
            int intValue = ((Integer) f2).intValue();
            ImeCheckBox[] imeCheckBoxArr2 = this.f2375d;
            if (imeCheckBoxArr2 == null) {
                kotlin.s.c.l.l("mSelectionGroup");
                throw null;
            }
            imeCheckBoxArr2[intValue].setChecked(true);
            e.a.a.a.a.j0("initInputModeOption index=", intValue, this.b);
            t(intValue);
            View findViewById3 = inflate.findViewById(C0838R.id.privacy_personal_information);
            kotlin.s.c.l.e(findViewById3, "root.findViewById<ImeLis…acy_personal_information)");
            e.b.d.a.a.e.g(findViewById3, new H0(this));
            View findViewById4 = inflate.findViewById(C0838R.id.privacy_three_part);
            kotlin.s.c.l.e(findViewById4, "root.findViewById<ImeLis…(R.id.privacy_three_part)");
            e.b.d.a.a.e.g(findViewById4, new I0(this));
            View findViewById5 = inflate.findViewById(C0838R.id.privacy_user_agreement);
            kotlin.s.c.l.e(findViewById5, "root.findViewById<ImeLis…d.privacy_user_agreement)");
            e.b.d.a.a.e.g(findViewById5, new J0(this));
            View findViewById6 = inflate.findViewById(C0838R.id.privacy_policy);
            kotlin.s.c.l.e(findViewById6, "root.findViewById<ImeLis…iew>(R.id.privacy_policy)");
            e.b.d.a.a.e.g(findViewById6, new K0(this));
            View findViewById7 = inflate.findViewById(C0838R.id.privacy_policy_summary);
            kotlin.s.c.l.e(findViewById7, "root.findViewById<ImeLis…d.privacy_policy_summary)");
            e.b.d.a.a.e.g(findViewById7, new L0(this));
            View findViewById8 = inflate.findViewById(C0838R.id.privacy_application_permission_list);
            kotlin.s.c.l.e(findViewById8, "root.findViewById<ImeLis…lication_permission_list)");
            e.b.d.a.a.e.g(findViewById8, new M0(this));
        }
        View view = this.f2374c;
        if (view != null) {
            return view;
        }
        kotlin.s.c.l.l("mRoot");
        throw null;
    }

    @Override // com.bytedance.android.input.fragment.settings.BaseSettingsFragment, androidx.fragment.app.Fragment
    public void onResume() {
        com.bytedance.android.input.r.j.i(this.b, "onResume, updateOption");
        super.onResume();
        r();
    }

    @Override // com.bytedance.android.input.fragment.settings.BaseSettingsFragment
    public void r() {
        l();
        String string = getString(C0838R.string.full_base_input_mode);
        kotlin.s.c.l.e(string, "getString(R.string.full_base_input_mode)");
        Object f2 = SettingsConfigNext.f(string);
        kotlin.s.c.l.d(f2, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((Integer) f2).intValue();
        ImeCheckBox[] imeCheckBoxArr = this.f2375d;
        if (imeCheckBoxArr == null) {
            kotlin.s.c.l.l("mSelectionGroup");
            throw null;
        }
        for (ImeCheckBox imeCheckBox : imeCheckBoxArr) {
            ImeCheckBox[] imeCheckBoxArr2 = this.f2375d;
            if (imeCheckBoxArr2 == null) {
                kotlin.s.c.l.l("mSelectionGroup");
                throw null;
            }
            imeCheckBox.setChecked(kotlin.s.c.l.a(imeCheckBoxArr2[intValue], imeCheckBox));
        }
        t(intValue);
    }
}
