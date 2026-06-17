package com.bytedance.android.input.fragment.settings;

import android.content.ContentResolver;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.android.doubaoime.activity.SettingsActivityNext;
import com.bytedance.android.doubaoime.databinding.FragmentKeyMultipleInputTypeBinding;
import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.android.input.common.SettingsConfigNext;
import com.bytedance.android.input.constants.DoubleSpellType;
import com.bytedance.android.input.constants.KeyboardInputMode;
import com.bytedance.android.input.keyboard.WizardSelectChineseBoard;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.util.Objects;

/* loaded from: classes.dex */
public final class KeyMultipleInputTypeFragment extends BaseSettingsFragment {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f2393d = 0;
    private FragmentKeyMultipleInputTypeBinding b;

    /* renamed from: c, reason: collision with root package name */
    private KeyboardLayoutSelectView f2394c;

    static final class a extends kotlin.s.c.m implements kotlin.s.b.l<Integer, kotlin.o> {
        final /* synthetic */ KeyboardLayoutSelectView b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(KeyboardLayoutSelectView keyboardLayoutSelectView) {
            super(1);
            this.b = keyboardLayoutSelectView;
        }

        @Override // kotlin.s.b.l
        public kotlin.o invoke(Integer num) {
            int intValue = num.intValue();
            if (intValue == 0) {
                KeyMultipleInputTypeFragment.u(KeyMultipleInputTypeFragment.this);
                this.b.setSelectItem(0);
            } else if (intValue == 1) {
                KeyMultipleInputTypeFragment.t(KeyMultipleInputTypeFragment.this);
                this.b.setSelectItem(1);
            } else if (intValue == 2) {
                KeyMultipleInputTypeFragment.s(KeyMultipleInputTypeFragment.this);
                this.b.setSelectItem(2);
            } else if (intValue == 3) {
                IAppGlobals.a aVar = IAppGlobals.a;
                String e2 = e.a.a.a.a.e(aVar, C0838R.string.key_double_spell_select, "IAppGlobals.context.getS….key_double_spell_select)");
                DoubleSpellType doubleSpellType = DoubleSpellType.DEFAULT;
                Object g2 = SettingsConfigNext.g(e2, doubleSpellType.getDoubleSpellName());
                kotlin.s.c.l.d(g2, "null cannot be cast to non-null type kotlin.String");
                if (true ^ kotlin.s.c.l.a((String) g2, doubleSpellType.getDoubleSpellName())) {
                    KeyMultipleInputTypeFragment keyMultipleInputTypeFragment = KeyMultipleInputTypeFragment.this;
                    int i = KeyMultipleInputTypeFragment.f2393d;
                    Objects.requireNonNull(keyMultipleInputTypeFragment);
                    KeyboardInputMode keyboardInputMode = KeyboardInputMode.DOUBLE_SPELL;
                    kotlin.s.c.l.f(keyboardInputMode, RemoteMessageConst.INPUT_TYPE);
                    String string = aVar.getContext().getString(C0838R.string.input_mode);
                    kotlin.s.c.l.e(string, "IAppGlobals.context.getString(R.string.input_mode)");
                    SettingsConfigNext.o(string, Integer.valueOf(keyboardInputMode.getInputModeValue()));
                    try {
                        com.bytedance.android.input.r.j.i("KeyboardImeComms", "[InputModeSync] setInputMode begin inputMode=3");
                        Bundle bundle = new Bundle();
                        bundle.putInt("input_mode", 3);
                        ContentResolver contentResolver = aVar.getContext().getContentResolver();
                        Uri parse = Uri.parse("content://com.bytedance.android.doubaoime.provider");
                        kotlin.s.c.l.e(parse, "parse(this)");
                        contentResolver.call(parse, "setInputMode", "", bundle);
                    } catch (Exception e3) {
                        e.a.a.a.a.n0("[InputModeSync] setInputMode failed:", e3, "KeyboardImeComms");
                    }
                    WizardSelectChineseBoard.a.b();
                    this.b.setSelectItem(3);
                } else {
                    KeyMultipleInputTypeFragment keyMultipleInputTypeFragment2 = KeyMultipleInputTypeFragment.this;
                    int i2 = KeyMultipleInputTypeFragment.f2393d;
                    FragmentActivity activity = keyMultipleInputTypeFragment2.getActivity();
                    if (activity != null) {
                        SettingsActivityNext.switchFragment$default((SettingsActivityNext) activity, SettingsActivityNext.FragmentType.DOUBLE_SPELL_PAGE, null, 2, null);
                    }
                }
            }
            return kotlin.o.a;
        }
    }

    static final class b extends kotlin.s.c.m implements kotlin.s.b.l<Integer, kotlin.o> {
        final /* synthetic */ KeyboardLayoutSelectView b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(KeyboardLayoutSelectView keyboardLayoutSelectView) {
            super(1);
            this.b = keyboardLayoutSelectView;
        }

        @Override // kotlin.s.b.l
        public kotlin.o invoke(Integer num) {
            int intValue = num.intValue();
            if (intValue == 0) {
                KeyMultipleInputTypeFragment.u(KeyMultipleInputTypeFragment.this);
                this.b.setSelectItem(0);
            } else if (intValue == 1) {
                KeyMultipleInputTypeFragment.t(KeyMultipleInputTypeFragment.this);
                this.b.setSelectItem(1);
            } else if (intValue == 2) {
                KeyMultipleInputTypeFragment.s(KeyMultipleInputTypeFragment.this);
                this.b.setSelectItem(2);
            } else if (intValue == 3) {
                KeyMultipleInputTypeFragment keyMultipleInputTypeFragment = KeyMultipleInputTypeFragment.this;
                int i = KeyMultipleInputTypeFragment.f2393d;
                FragmentActivity activity = keyMultipleInputTypeFragment.getActivity();
                if (activity != null) {
                    SettingsActivityNext.switchFragment$default((SettingsActivityNext) activity, SettingsActivityNext.FragmentType.DOUBLE_SPELL_PAGE, null, 2, null);
                }
            }
            return kotlin.o.a;
        }
    }

    public static final void s(KeyMultipleInputTypeFragment keyMultipleInputTypeFragment) {
        Objects.requireNonNull(keyMultipleInputTypeFragment);
        KeyboardInputMode keyboardInputMode = KeyboardInputMode.HANDWRITING;
        kotlin.s.c.l.f(keyboardInputMode, RemoteMessageConst.INPUT_TYPE);
        IAppGlobals.a aVar = IAppGlobals.a;
        SettingsConfigNext.o(e.a.a.a.a.e(aVar, C0838R.string.input_mode, "IAppGlobals.context.getString(R.string.input_mode)"), Integer.valueOf(keyboardInputMode.getInputModeValue()));
        try {
            com.bytedance.android.input.r.j.i("KeyboardImeComms", "[InputModeSync] setInputMode begin inputMode=4");
            Bundle bundle = new Bundle();
            bundle.putInt("input_mode", 4);
            Objects.requireNonNull(aVar);
            ContentResolver contentResolver = aVar.getContext().getContentResolver();
            Uri parse = Uri.parse("content://com.bytedance.android.doubaoime.provider");
            kotlin.s.c.l.e(parse, "parse(this)");
            contentResolver.call(parse, "setInputMode", "", bundle);
        } catch (Exception e2) {
            e.a.a.a.a.n0("[InputModeSync] setInputMode failed:", e2, "KeyboardImeComms");
        }
        WizardSelectChineseBoard.a.b();
    }

    public static final void t(KeyMultipleInputTypeFragment keyMultipleInputTypeFragment) {
        Objects.requireNonNull(keyMultipleInputTypeFragment);
        KeyboardInputMode keyboardInputMode = KeyboardInputMode.PY26;
        kotlin.s.c.l.f(keyboardInputMode, RemoteMessageConst.INPUT_TYPE);
        IAppGlobals.a aVar = IAppGlobals.a;
        SettingsConfigNext.o(e.a.a.a.a.e(aVar, C0838R.string.input_mode, "IAppGlobals.context.getString(R.string.input_mode)"), Integer.valueOf(keyboardInputMode.getInputModeValue()));
        try {
            com.bytedance.android.input.r.j.i("KeyboardImeComms", "[InputModeSync] setInputMode begin inputMode=0");
            Bundle bundle = new Bundle();
            bundle.putInt("input_mode", 0);
            Objects.requireNonNull(aVar);
            ContentResolver contentResolver = aVar.getContext().getContentResolver();
            Uri parse = Uri.parse("content://com.bytedance.android.doubaoime.provider");
            kotlin.s.c.l.e(parse, "parse(this)");
            contentResolver.call(parse, "setInputMode", "", bundle);
        } catch (Exception e2) {
            e.a.a.a.a.n0("[InputModeSync] setInputMode failed:", e2, "KeyboardImeComms");
        }
        WizardSelectChineseBoard.a.b();
    }

    public static final void u(KeyMultipleInputTypeFragment keyMultipleInputTypeFragment) {
        Objects.requireNonNull(keyMultipleInputTypeFragment);
        KeyboardInputMode keyboardInputMode = KeyboardInputMode.PY9;
        kotlin.s.c.l.f(keyboardInputMode, RemoteMessageConst.INPUT_TYPE);
        IAppGlobals.a aVar = IAppGlobals.a;
        SettingsConfigNext.o(e.a.a.a.a.e(aVar, C0838R.string.input_mode, "IAppGlobals.context.getString(R.string.input_mode)"), Integer.valueOf(keyboardInputMode.getInputModeValue()));
        try {
            com.bytedance.android.input.r.j.i("KeyboardImeComms", "[InputModeSync] setInputMode begin inputMode=1");
            Bundle bundle = new Bundle();
            bundle.putInt("input_mode", 1);
            Objects.requireNonNull(aVar);
            ContentResolver contentResolver = aVar.getContext().getContentResolver();
            Uri parse = Uri.parse("content://com.bytedance.android.doubaoime.provider");
            kotlin.s.c.l.e(parse, "parse(this)");
            contentResolver.call(parse, "setInputMode", "", bundle);
        } catch (Exception e2) {
            e.a.a.a.a.n0("[InputModeSync] setInputMode failed:", e2, "KeyboardImeComms");
        }
        WizardSelectChineseBoard.a.b();
    }

    @Override // com.bytedance.android.input.framework.fragment.BaseImeFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String string;
        FragmentActivity activity;
        kotlin.s.c.l.f(layoutInflater, "inflater");
        this.b = FragmentKeyMultipleInputTypeBinding.b(layoutInflater, viewGroup, false);
        com.bytedance.android.input.r.j.i("KeyboardInputTypeFragment", "initData");
        Bundle arguments = getArguments();
        if (arguments != null && (string = arguments.getString("KEY_TARGET_PAGE")) != null && string.hashCode() == -689219684 && string.equals("TARGET_PAGE_DOUBLE_SPELL") && (activity = getActivity()) != null) {
            SettingsActivityNext.switchFragment$default((SettingsActivityNext) activity, SettingsActivityNext.FragmentType.DOUBLE_SPELL_PAGE, null, 2, null);
        }
        FragmentKeyMultipleInputTypeBinding fragmentKeyMultipleInputTypeBinding = this.b;
        if (fragmentKeyMultipleInputTypeBinding != null) {
            return fragmentKeyMultipleInputTypeBinding.a();
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        com.bytedance.android.input.r.j.i("KeyboardInputTypeFragment", "onDestroy");
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        com.bytedance.android.input.r.j.i("KeyboardInputTypeFragment", "onDestroyView");
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        com.bytedance.android.input.r.j.i("KeyboardInputTypeFragment", "onPause");
    }

    @Override // com.bytedance.android.input.fragment.settings.BaseSettingsFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        com.bytedance.android.input.r.j.i("KeyboardInputTypeFragment", "onResume");
        r();
    }

    @Override // com.bytedance.android.input.fragment.settings.BaseSettingsFragment
    public void p() {
        l();
        com.bytedance.android.input.r.j.i("KeyboardInputTypeFragment", "initView");
        FragmentKeyMultipleInputTypeBinding fragmentKeyMultipleInputTypeBinding = this.b;
        if (fragmentKeyMultipleInputTypeBinding != null) {
            KeyboardLayoutSelectView keyboardLayoutSelectView = fragmentKeyMultipleInputTypeBinding.b;
            this.f2394c = keyboardLayoutSelectView;
            if (keyboardLayoutSelectView != null) {
                keyboardLayoutSelectView.b(true);
                keyboardLayoutSelectView.setShowIcArrowIndex(3);
                String string = getString(C0838R.string.kbd_layout_multiple_input_type_item_title);
                kotlin.s.c.l.e(string, "getString(R.string.kbd_l…le_input_type_item_title)");
                keyboardLayoutSelectView.setTitle(string);
                String string2 = getString(C0838R.string.kbd_layout_multiple_input_type_item_py9_select);
                kotlin.s.c.l.e(string2, "getString(R.string.kbd_l…put_type_item_py9_select)");
                String string3 = getString(C0838R.string.kbd_layout_multiple_input_type_item_py26_select);
                kotlin.s.c.l.e(string3, "getString(R.string.kbd_l…ut_type_item_py26_select)");
                String string4 = getString(C0838R.string.kbd_layout_multiple_input_type_item_hand_writing_input);
                kotlin.s.c.l.e(string4, "getString(R.string.kbd_l…_item_hand_writing_input)");
                String string5 = getString(C0838R.string.kbd_layout_multiple_input_type_item_db_input);
                kotlin.s.c.l.e(string5, "getString(R.string.kbd_l…input_type_item_db_input)");
                KeyboardLayoutSelectView.a(keyboardLayoutSelectView, kotlin.collections.g.K(string2, string3, string4, string5), kotlin.collections.g.K(Integer.valueOf(C0838R.drawable.kbd_multiple_input_type_py9), Integer.valueOf(C0838R.drawable.kbd_multiple_input_type_py26), Integer.valueOf(C0838R.drawable.kbd_multiple_input_type_hand_writing_input), Integer.valueOf(C0838R.drawable.kbd_multiple_input_type_db_input)), 0, true, 4, null);
                keyboardLayoutSelectView.setOnItemClickListener(new a(keyboardLayoutSelectView));
                keyboardLayoutSelectView.setOnCheckBoxLayoutItemClickListener(new b(keyboardLayoutSelectView));
            }
        }
    }

    @Override // com.bytedance.android.input.fragment.settings.BaseSettingsFragment
    public void r() {
        l();
        com.bytedance.android.input.r.j.i("KeyboardInputTypeFragment", "updateUI");
        KeyboardLayoutSelectView keyboardLayoutSelectView = this.f2394c;
        if (keyboardLayoutSelectView != null) {
            Object g2 = SettingsConfigNext.g(e.a.a.a.a.e(IAppGlobals.a, C0838R.string.input_mode, "IAppGlobals.context.getString(R.string.input_mode)"), Integer.valueOf(KeyboardInputMode.PY9.getInputModeValue()));
            kotlin.s.c.l.d(g2, "null cannot be cast to non-null type kotlin.Int");
            int intValue = ((Integer) g2).intValue();
            e.a.a.a.a.j0("currentSelectKeyboardType value = ", intValue, "KeyboardInputTypeConfigManager");
            KeyboardInputMode a2 = KeyboardInputMode.Companion.a(intValue);
            StringBuilder M = e.a.a.a.a.M("currentSelectKeyboardType = ");
            M.append(a2.name());
            com.bytedance.android.input.r.j.i("KeyboardInputTypeFragment", M.toString());
            int ordinal = a2.ordinal();
            if (ordinal == 0) {
                keyboardLayoutSelectView.setSelectItem(1);
                return;
            }
            if (ordinal == 1) {
                keyboardLayoutSelectView.setSelectItem(0);
                return;
            }
            if (ordinal != 2) {
                if (ordinal == 3) {
                    keyboardLayoutSelectView.setSelectItem(3);
                    return;
                } else {
                    if (ordinal != 4) {
                        return;
                    }
                    keyboardLayoutSelectView.setSelectItem(2);
                    return;
                }
            }
            Object g3 = SettingsConfigNext.g(e.a.a.a.a.e(IAppGlobals.a, C0838R.string.last_chinese_input_mode, "IAppGlobals.context.getS….last_chinese_input_mode)"), Integer.valueOf(KeyboardInputMode.PY9.getInputModeValue()));
            kotlin.s.c.l.d(g3, "null cannot be cast to non-null type kotlin.Int");
            int intValue2 = ((Integer) g3).intValue();
            e.a.a.a.a.j0("currentLastChineseInputMode value = ", intValue2, "KeyboardInputTypeConfigManager");
            int ordinal2 = KeyboardInputMode.Companion.a(intValue2).ordinal();
            if (ordinal2 == 0) {
                keyboardLayoutSelectView.setSelectItem(1);
                return;
            }
            if (ordinal2 == 1) {
                keyboardLayoutSelectView.setSelectItem(0);
                return;
            }
            if (ordinal2 == 2) {
                keyboardLayoutSelectView.setSelectItem(0);
            } else if (ordinal2 == 3) {
                keyboardLayoutSelectView.setSelectItem(3);
            } else {
                if (ordinal2 != 4) {
                    return;
                }
                keyboardLayoutSelectView.setSelectItem(2);
            }
        }
    }
}
