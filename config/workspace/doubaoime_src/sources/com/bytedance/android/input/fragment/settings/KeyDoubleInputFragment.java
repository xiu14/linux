package com.bytedance.android.input.fragment.settings;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.content.ContextCompat;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.android.doubaoime.databinding.FragmentKeyDoubleInputTypeBinding;
import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.android.input.common.SettingsConfigNext;
import com.bytedance.android.input.constants.DoubleSpellType;
import com.bytedance.android.input.constants.KeyboardInputMode;
import com.bytedance.android.input.keyboard.WizardSelectChineseBoard;
import com.bytedance.common_biz.ui.widget.ImeCheckBox;
import com.bytedance.common_biz.ui.widget.ImeTitleBar;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.util.Objects;

/* loaded from: classes.dex */
public final class KeyDoubleInputFragment extends BaseSettingsFragment {
    private FragmentKeyDoubleInputTypeBinding b;

    /* renamed from: c, reason: collision with root package name */
    private ImeTitleBar f2385c;

    /* renamed from: d, reason: collision with root package name */
    private ImeCheckBox f2386d;

    /* renamed from: e, reason: collision with root package name */
    private ImeCheckBox f2387e;

    public static void s(KeyDoubleInputFragment keyDoubleInputFragment, View view) {
        kotlin.s.c.l.f(keyDoubleInputFragment, "this$0");
        keyDoubleInputFragment.w();
    }

    public static void t(KeyDoubleInputFragment keyDoubleInputFragment, View view) {
        kotlin.s.c.l.f(keyDoubleInputFragment, "this$0");
        keyDoubleInputFragment.v();
    }

    public static void u(KeyDoubleInputFragment keyDoubleInputFragment, View view) {
        kotlin.s.c.l.f(keyDoubleInputFragment, "this$0");
        ImeCheckBox imeCheckBox = keyDoubleInputFragment.f2386d;
        boolean z = imeCheckBox != null && imeCheckBox.isChecked();
        ImeCheckBox imeCheckBox2 = keyDoubleInputFragment.f2387e;
        boolean z2 = imeCheckBox2 != null && imeCheckBox2.isChecked();
        com.bytedance.android.input.r.j.i("KeyboardInputTypeDoubleSpellFragment", "handleCLickFinish xhSelected = " + z + " --- zrmSelected = " + z2);
        if (z2) {
            DoubleSpellType doubleSpellType = DoubleSpellType.ZRM;
            kotlin.s.c.l.f(doubleSpellType, "doubleSpellType");
            SettingsConfigNext.a.m(e.a.a.a.a.e(IAppGlobals.a, C0838R.string.key_double_spell_select, "IAppGlobals.context.getS….key_double_spell_select)"), doubleSpellType.getDoubleSpellName());
        } else {
            DoubleSpellType doubleSpellType2 = DoubleSpellType.XH;
            kotlin.s.c.l.f(doubleSpellType2, "doubleSpellType");
            SettingsConfigNext.a.m(e.a.a.a.a.e(IAppGlobals.a, C0838R.string.key_double_spell_select, "IAppGlobals.context.getS….key_double_spell_select)"), doubleSpellType2.getDoubleSpellName());
        }
        KeyboardInputMode keyboardInputMode = KeyboardInputMode.DOUBLE_SPELL;
        kotlin.s.c.l.f(keyboardInputMode, RemoteMessageConst.INPUT_TYPE);
        IAppGlobals.a aVar = IAppGlobals.a;
        SettingsConfigNext.o(e.a.a.a.a.e(aVar, C0838R.string.input_mode, "IAppGlobals.context.getString(R.string.input_mode)"), Integer.valueOf(keyboardInputMode.getInputModeValue()));
        WizardSelectChineseBoard.a.b();
        try {
            com.bytedance.android.input.r.j.i("KeyboardImeComms", "[InputModeSync] setInputMode begin inputMode=3");
            Bundle bundle = new Bundle();
            bundle.putInt("input_mode", 3);
            ContentResolver contentResolver = aVar.getContext().getContentResolver();
            Uri parse = Uri.parse("content://com.bytedance.android.doubaoime.provider");
            kotlin.s.c.l.e(parse, "parse(this)");
            contentResolver.call(parse, "setInputMode", "", bundle);
        } catch (Exception e2) {
            e.a.a.a.a.n0("[InputModeSync] setInputMode failed:", e2, "KeyboardImeComms");
        }
        keyDoubleInputFragment.q();
    }

    private final void v() {
        ImageView imageView;
        ImeCheckBox imeCheckBox = this.f2386d;
        if (imeCheckBox != null) {
            imeCheckBox.setChecked(true);
        }
        ImeCheckBox imeCheckBox2 = this.f2387e;
        if (imeCheckBox2 != null) {
            imeCheckBox2.setChecked(false);
        }
        FragmentKeyDoubleInputTypeBinding fragmentKeyDoubleInputTypeBinding = this.b;
        if (fragmentKeyDoubleInputTypeBinding == null || (imageView = fragmentKeyDoubleInputTypeBinding.f1973d) == null) {
            return;
        }
        imageView.setImageResource(C0838R.drawable.kbd_multiple_input_type_db_xh);
    }

    private final void w() {
        ImageView imageView;
        ImeCheckBox imeCheckBox = this.f2386d;
        if (imeCheckBox != null) {
            imeCheckBox.setChecked(false);
        }
        ImeCheckBox imeCheckBox2 = this.f2387e;
        if (imeCheckBox2 != null) {
            imeCheckBox2.setChecked(true);
        }
        FragmentKeyDoubleInputTypeBinding fragmentKeyDoubleInputTypeBinding = this.b;
        if (fragmentKeyDoubleInputTypeBinding == null || (imageView = fragmentKeyDoubleInputTypeBinding.f1973d) == null) {
            return;
        }
        imageView.setImageResource(C0838R.drawable.kbd_multiple_input_type_db_zrm);
    }

    @Override // com.bytedance.android.input.framework.fragment.BaseImeFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.s.c.l.f(layoutInflater, "inflater");
        this.b = FragmentKeyDoubleInputTypeBinding.b(layoutInflater, viewGroup, false);
        com.bytedance.android.input.r.j.i("KeyboardInputTypeDoubleSpellFragment", "initData");
        FragmentKeyDoubleInputTypeBinding fragmentKeyDoubleInputTypeBinding = this.b;
        if (fragmentKeyDoubleInputTypeBinding != null) {
            return fragmentKeyDoubleInputTypeBinding.a();
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        com.bytedance.android.input.r.j.i("KeyboardInputTypeDoubleSpellFragment", "onDestroy");
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        com.bytedance.android.input.r.j.i("KeyboardInputTypeDoubleSpellFragment", "onDestroyView");
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        com.bytedance.android.input.r.j.i("KeyboardInputTypeDoubleSpellFragment", "onPause");
    }

    @Override // com.bytedance.android.input.fragment.settings.BaseSettingsFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        com.bytedance.android.input.r.j.i("KeyboardInputTypeDoubleSpellFragment", "onResume");
        r();
    }

    @Override // com.bytedance.android.input.fragment.settings.BaseSettingsFragment
    public void p() {
        LinearLayout linearLayout;
        LinearLayout linearLayout2;
        Context context;
        l();
        com.bytedance.android.input.r.j.i("KeyboardInputTypeDoubleSpellFragment", "initView");
        FragmentKeyDoubleInputTypeBinding fragmentKeyDoubleInputTypeBinding = this.b;
        if (fragmentKeyDoubleInputTypeBinding != null) {
            this.f2385c = fragmentKeyDoubleInputTypeBinding.f1976g;
            this.f2386d = fragmentKeyDoubleInputTypeBinding.b;
            this.f2387e = fragmentKeyDoubleInputTypeBinding.f1972c;
        }
        ImeTitleBar imeTitleBar = this.f2385c;
        if (imeTitleBar != null && (context = getContext()) != null) {
            imeTitleBar.h(true);
            String string = getString(C0838R.string.kbd_layout_double_input_title_right_text);
            kotlin.s.c.l.e(string, "getString(R.string.kbd_l…e_input_title_right_text)");
            imeTitleBar.e(string);
            imeTitleBar.f(ContextCompat.getColor(context, C0838R.color.ime_title_right_text));
            imeTitleBar.g(new View.OnClickListener() { // from class: com.bytedance.android.input.fragment.settings.L
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    KeyDoubleInputFragment.u(KeyDoubleInputFragment.this, view);
                }
            });
        }
        ImeCheckBox imeCheckBox = this.f2386d;
        if (imeCheckBox != null) {
            imeCheckBox.setClickable(false);
        }
        ImeCheckBox imeCheckBox2 = this.f2387e;
        if (imeCheckBox2 != null) {
            imeCheckBox2.setClickable(false);
        }
        FragmentKeyDoubleInputTypeBinding fragmentKeyDoubleInputTypeBinding2 = this.b;
        if (fragmentKeyDoubleInputTypeBinding2 != null && (linearLayout2 = fragmentKeyDoubleInputTypeBinding2.f1974e) != null) {
            linearLayout2.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.android.input.fragment.settings.K
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    KeyDoubleInputFragment.t(KeyDoubleInputFragment.this, view);
                }
            });
        }
        FragmentKeyDoubleInputTypeBinding fragmentKeyDoubleInputTypeBinding3 = this.b;
        if (fragmentKeyDoubleInputTypeBinding3 == null || (linearLayout = fragmentKeyDoubleInputTypeBinding3.f1975f) == null) {
            return;
        }
        linearLayout.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.android.input.fragment.settings.J
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                KeyDoubleInputFragment.s(KeyDoubleInputFragment.this, view);
            }
        });
    }

    @Override // com.bytedance.android.input.fragment.settings.BaseSettingsFragment
    public void r() {
        DoubleSpellType doubleSpellType;
        l();
        Object g2 = SettingsConfigNext.g(e.a.a.a.a.e(IAppGlobals.a, C0838R.string.key_double_spell_select, "IAppGlobals.context.getS….key_double_spell_select)"), DoubleSpellType.DEFAULT.getDoubleSpellName());
        kotlin.s.c.l.d(g2, "null cannot be cast to non-null type kotlin.String");
        String str = (String) g2;
        Objects.requireNonNull(DoubleSpellType.Companion);
        kotlin.s.c.l.f(str, "doubleSpellName");
        DoubleSpellType[] values = DoubleSpellType.values();
        int i = 0;
        while (true) {
            if (i >= 3) {
                doubleSpellType = null;
                break;
            }
            doubleSpellType = values[i];
            if (kotlin.s.c.l.a(doubleSpellType.getDoubleSpellName(), str)) {
                break;
            } else {
                i++;
            }
        }
        if (doubleSpellType == null) {
            doubleSpellType = DoubleSpellType.DEFAULT;
        }
        com.bytedance.android.input.r.j.i("KeyboardInputTypeDoubleSpellFragment", "updateUI currentSelectDoubleSpellType = " + doubleSpellType);
        int ordinal = doubleSpellType.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            v();
        } else {
            if (ordinal != 2) {
                return;
            }
            w();
        }
    }
}
