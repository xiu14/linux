package com.bytedance.android.input.fragment.settings;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.SwitchCompat;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.android.input.common.SettingsConfigNext;
import com.bytedance.android.input.constants.KeyboardInputMode;
import com.bytedance.android.input.popup.AlertPopupWindowType;
import com.bytedance.android.input.popup.WindowId;
import com.bytedance.common_biz.ui.widget.ImeTitleImageItemView;
import java.util.List;

/* loaded from: classes.dex */
public final class KbdLayoutFragment extends BaseSettingsFragment {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f2377d = 0;
    private View b;

    /* renamed from: c, reason: collision with root package name */
    private final Bundle f2378c = new Bundle();

    public enum KeyBoardStyle {
        MERGE(0),
        SPLIT(1);

        private final int index;

        KeyBoardStyle(int i) {
            this.index = i;
        }

        public final int getIndex() {
            return this.index;
        }
    }

    private final List<Integer> t() {
        Object g2 = SettingsConfigNext.g(e.a.a.a.a.e(IAppGlobals.a, C0838R.string.input_mode, "IAppGlobals.context.getString(R.string.input_mode)"), Integer.valueOf(KeyboardInputMode.PY26.getInputModeValue()));
        kotlin.s.c.l.d(g2, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((Integer) g2).intValue();
        e.a.a.a.a.j0("currentSelectKeyboardType value = ", intValue, "KeyboardInputTypeConfigManager");
        int ordinal = KeyboardInputMode.Companion.a(intValue).ordinal();
        return ordinal != 1 ? ordinal != 4 ? kotlin.collections.g.K(Integer.valueOf(C0838R.drawable.lang_switch_26_left), Integer.valueOf(C0838R.drawable.lang_switch_26_right)) : kotlin.collections.g.K(Integer.valueOf(C0838R.drawable.lang_switch_write_left), Integer.valueOf(C0838R.drawable.lang_switch_write_right)) : kotlin.collections.g.K(Integer.valueOf(C0838R.drawable.lang_switch_9_left), Integer.valueOf(C0838R.drawable.lang_switch_9_right));
    }

    public static void u(KbdLayoutFragment kbdLayoutFragment, ImeTitleImageItemView imeTitleImageItemView, String str, View view) {
        kotlin.s.c.l.f(kbdLayoutFragment, "this$0");
        kotlin.s.c.l.f(str, "$enterPreferencesString");
        kotlin.s.c.l.d(view, "null cannot be cast to non-null type androidx.appcompat.widget.SwitchCompat");
        boolean isChecked = ((SwitchCompat) view).isChecked();
        kotlin.s.c.l.e(imeTitleImageItemView, "enterKeySendMsgListItem");
        kbdLayoutFragment.v(imeTitleImageItemView, str, isChecked, true);
    }

    private final void v(ImeTitleImageItemView imeTitleImageItemView, String str, boolean z, boolean z2) {
        imeTitleImageItemView.setImageResource(z ? C0838R.drawable.ic_key_enter_select : C0838R.drawable.ic_key_enter);
        imeTitleImageItemView.setSubTitleVisibility(true);
        if (z2) {
            SettingsConfigNext.l(str, Boolean.valueOf(z));
        }
    }

    @Override // com.bytedance.android.input.fragment.settings.BaseSettingsFragment, com.bytedance.android.doubaoime.activity.Q
    public boolean j() {
        com.bytedance.android.input.popup.q f2 = com.bytedance.android.input.popup.q.f();
        WindowId windowId = WindowId.ENTER_KEY_SEND_MSG_CONFIRM;
        if (!f2.j(windowId)) {
            return false;
        }
        com.bytedance.android.input.popup.q.f().d(windowId);
        return true;
    }

    @Override // com.bytedance.android.input.framework.fragment.BaseImeFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.s.c.l.f(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(C0838R.layout.fragment_kbd_layout, viewGroup, false);
        kotlin.s.c.l.e(inflate, "inflater.inflate(R.layou…layout, container, false)");
        this.b = inflate;
        if (inflate == null) {
            kotlin.s.c.l.l("mRoot");
            throw null;
        }
        KeyboardLayoutSelectView keyboardLayoutSelectView = (KeyboardLayoutSelectView) inflate.findViewById(C0838R.id.kbd_pinyin_location_item);
        keyboardLayoutSelectView.setVisibility(IAppGlobals.a.F() ? 8 : 0);
        String string = getString(C0838R.string.kbd_layout_pinyin_location_title);
        kotlin.s.c.l.e(string, "getString(R.string.kbd_l…ut_pinyin_location_title)");
        keyboardLayoutSelectView.setTitle(string);
        kotlin.s.c.l.e(keyboardLayoutSelectView, "keyboardPinyinLocationItem");
        String string2 = getString(C0838R.string.kbd_layout_pinyin_location_in_keyboard);
        kotlin.s.c.l.e(string2, "getString(R.string.kbd_l…yin_location_in_keyboard)");
        String string3 = getString(C0838R.string.kbd_layout_pinyin_location_in_editor);
        kotlin.s.c.l.e(string3, "getString(R.string.kbd_l…inyin_location_in_editor)");
        KeyboardLayoutSelectView.a(keyboardLayoutSelectView, kotlin.collections.g.K(string2, string3), kotlin.collections.g.K(Integer.valueOf(C0838R.drawable.kbd_layout_pinyin_in_keyboard), Integer.valueOf(C0838R.drawable.kbd_layout_pinyin_in_editor)), C0838R.string.pinyin_location_style, false, 8, null);
        keyboardLayoutSelectView.setOnItemClickListener(new Q0(this));
        View view = this.b;
        if (view == null) {
            kotlin.s.c.l.l("mRoot");
            throw null;
        }
        KeyboardLayoutSelectView keyboardLayoutSelectView2 = (KeyboardLayoutSelectView) view.findViewById(C0838R.id.kbd_layout_list_item);
        String string4 = getString(C0838R.string.kbd_layout_26key_number_symbol);
        kotlin.s.c.l.e(string4, "getString(R.string.kbd_layout_26key_number_symbol)");
        keyboardLayoutSelectView2.setTitle(string4);
        kotlin.s.c.l.e(keyboardLayoutSelectView2, "keyboardLayoutSelectView");
        String string5 = getString(C0838R.string.kbd_layout_26key_number_symbol_merge_period_comma_merge);
        kotlin.s.c.l.e(string5, "getString(R.string.kbd_l…merge_period_comma_merge)");
        String string6 = getString(C0838R.string.kbd_layout_26key_number_symbol_split_period_comma_merge);
        kotlin.s.c.l.e(string6, "getString(R.string.kbd_l…split_period_comma_merge)");
        String string7 = getString(C0838R.string.kbd_layout_26key_number_symbol_split_period_comma_split);
        kotlin.s.c.l.e(string7, "getString(R.string.kbd_l…split_period_comma_split)");
        String string8 = getString(C0838R.string.kbd_layout_26key_number_symbol_split_period_comma_split);
        kotlin.s.c.l.e(string8, "getString(R.string.kbd_l…split_period_comma_split)");
        KeyboardLayoutSelectView.a(keyboardLayoutSelectView2, kotlin.collections.g.K(string5, string6, string7, string8), kotlin.collections.g.K(Integer.valueOf(C0838R.drawable.kbd_layout_26key_number_symbol_merge_period_comma_merge), Integer.valueOf(C0838R.drawable.kbd_layout_26key_number_symbol_split), Integer.valueOf(C0838R.drawable.kbd_layout_26key_number_symbol_split_period_comma_split), Integer.valueOf(C0838R.drawable.kbd_layout_26key_number_symbol_split_period_comma_merge)), C0838R.string.key26_number_symbol_key_style, false, 8, null);
        keyboardLayoutSelectView2.setOnItemClickListener(new R0(this));
        View view2 = this.b;
        if (view2 == null) {
            kotlin.s.c.l.l("mRoot");
            throw null;
        }
        KeyboardLayoutSelectView keyboardLayoutSelectView3 = (KeyboardLayoutSelectView) view2.findViewById(C0838R.id.lang_switch_position_list_item);
        String string9 = getString(C0838R.string.kbd_layout_lang_switch_position_title);
        kotlin.s.c.l.e(string9, "getString(R.string.kbd_l…ng_switch_position_title)");
        keyboardLayoutSelectView3.setTitle(string9);
        kotlin.s.c.l.e(keyboardLayoutSelectView3, "langSwitchPositionSelectView");
        String string10 = getString(C0838R.string.kbd_layout_lang_switch_position_left);
        kotlin.s.c.l.e(string10, "getString(R.string.kbd_l…ang_switch_position_left)");
        String string11 = getString(C0838R.string.kbd_layout_lang_switch_position_right);
        kotlin.s.c.l.e(string11, "getString(R.string.kbd_l…ng_switch_position_right)");
        KeyboardLayoutSelectView.a(keyboardLayoutSelectView3, kotlin.collections.g.K(string10, string11), t(), C0838R.string.lang_switch_key_position, false, 8, null);
        keyboardLayoutSelectView3.setOnItemClickListener(new S0(this));
        View view3 = this.b;
        if (view3 == null) {
            kotlin.s.c.l.l("mRoot");
            throw null;
        }
        ImeTitleImageItemView imeTitleImageItemView = (ImeTitleImageItemView) view3.findViewById(C0838R.id.enable_key_fusiyin_list_item);
        kotlin.s.c.l.e(getString(C0838R.string.enable_key_fusiyin), "getString(R.string.enable_key_fusiyin)");
        SwitchCompat a = imeTitleImageItemView.a();
        a.setHapticFeedbackEnabled(false);
        com.bytedance.android.input.common.h hVar = com.bytedance.android.input.common.h.a;
        Context requireContext = requireContext();
        kotlin.s.c.l.e(requireContext, "requireContext()");
        a.setChecked(hVar.d(requireContext));
        a.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.android.input.fragment.settings.x
            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                KbdLayoutFragment kbdLayoutFragment = KbdLayoutFragment.this;
                int i = KbdLayoutFragment.f2377d;
                kotlin.s.c.l.f(kbdLayoutFragment, "this$0");
                com.bytedance.android.input.common.h hVar2 = com.bytedance.android.input.common.h.a;
                Context requireContext2 = kbdLayoutFragment.requireContext();
                kotlin.s.c.l.e(requireContext2, "requireContext()");
                kotlin.s.c.l.d(view4, "null cannot be cast to non-null type androidx.appcompat.widget.SwitchCompat");
                hVar2.j(requireContext2, ((SwitchCompat) view4).isChecked(), false);
            }
        });
        View view4 = this.b;
        if (view4 == null) {
            kotlin.s.c.l.l("mRoot");
            throw null;
        }
        final ImeTitleImageItemView imeTitleImageItemView2 = (ImeTitleImageItemView) view4.findViewById(C0838R.id.enable_key_enter_list_item);
        final String string12 = getString(C0838R.string.enable_key_enter_send_msg);
        kotlin.s.c.l.e(string12, "getString(R.string.enable_key_enter_send_msg)");
        SwitchCompat a2 = imeTitleImageItemView2.a();
        a2.setHapticFeedbackEnabled(false);
        Object f2 = SettingsConfigNext.f(string12);
        kotlin.s.c.l.d(f2, "null cannot be cast to non-null type kotlin.Boolean");
        boolean booleanValue = ((Boolean) f2).booleanValue();
        kotlin.s.c.l.e(imeTitleImageItemView2, "enterKeySendMsgListItem");
        v(imeTitleImageItemView2, string12, booleanValue, false);
        a2.setChecked(booleanValue);
        a2.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.android.input.fragment.settings.y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view5) {
                KbdLayoutFragment.u(KbdLayoutFragment.this, imeTitleImageItemView2, string12, view5);
            }
        });
        imeTitleImageItemView2.setSubTitleContainerOnClickListener(new View.OnClickListener() { // from class: com.bytedance.android.input.fragment.settings.z
            @Override // android.view.View.OnClickListener
            public final void onClick(View view5) {
                int i = KbdLayoutFragment.f2377d;
                com.bytedance.android.input.popup.q f3 = com.bytedance.android.input.popup.q.f();
                WindowId windowId = WindowId.ENTER_KEY_SEND_MSG_CONFIRM;
                if (f3.j(windowId)) {
                    com.bytedance.android.input.popup.q.f().d(windowId);
                }
                com.bytedance.android.input.n.d.a(com.bytedance.android.input.n.d.a, windowId, C0838R.string.enter_key_send_msg_confirm_title, C0838R.string.enter_key_send_msg_confirm_content, 0, 0, C0838R.string.enter_key_send_msg_confirm_btn_confirm, AlertPopupWindowType.GOT_IT_WIDTH_FULL, null, null, T0.a, 408);
            }
        });
        View view5 = this.b;
        if (view5 == null) {
            kotlin.s.c.l.l("mRoot");
            throw null;
        }
        KeyboardLayoutSelectView keyboardLayoutSelectView4 = (KeyboardLayoutSelectView) view5.findViewById(C0838R.id.kbd_layout_appearance_item);
        String string13 = getString(C0838R.string.kbd_layout_appearance);
        kotlin.s.c.l.e(string13, "getString(R.string.kbd_layout_appearance)");
        keyboardLayoutSelectView4.setTitle(string13);
        kotlin.s.c.l.e(keyboardLayoutSelectView4, "keyboardAppearanceSelectView");
        String string14 = getString(C0838R.string.kbd_layout_appearance_system);
        kotlin.s.c.l.e(string14, "getString(R.string.kbd_layout_appearance_system)");
        String string15 = getString(C0838R.string.kbd_layout_appearance_light);
        kotlin.s.c.l.e(string15, "getString(R.string.kbd_layout_appearance_light)");
        String string16 = getString(C0838R.string.kbd_layout_appearance_dark);
        kotlin.s.c.l.e(string16, "getString(R.string.kbd_layout_appearance_dark)");
        KeyboardLayoutSelectView.a(keyboardLayoutSelectView4, kotlin.collections.g.K(string14, string15, string16), kotlin.collections.g.K(Integer.valueOf(C0838R.drawable.ic_apperance_system), Integer.valueOf(C0838R.drawable.ic_appearance_light), Integer.valueOf(C0838R.drawable.ic_appearance_dark)), C0838R.string.color_scheme, false, 8, null);
        View view6 = this.b;
        if (view6 == null) {
            kotlin.s.c.l.l("mRoot");
            throw null;
        }
        ((KeyboardEntranceLayout) view6.findViewById(C0838R.id.settings_image_entrance_custom_symbol)).setOnItemClickListener(new U0(this));
        View view7 = this.b;
        if (view7 != null) {
            return view7;
        }
        kotlin.s.c.l.l("mRoot");
        throw null;
    }

    @Override // com.bytedance.android.input.fragment.settings.BaseSettingsFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        r();
    }

    @Override // com.bytedance.android.input.fragment.settings.BaseSettingsFragment
    public void r() {
        l();
        View view = this.b;
        if (view == null) {
            kotlin.s.c.l.l("mRoot");
            throw null;
        }
        ((KeyboardLayoutSelectView) view.findViewById(C0838R.id.kbd_layout_appearance_item)).c();
        View view2 = this.b;
        if (view2 == null) {
            kotlin.s.c.l.l("mRoot");
            throw null;
        }
        KeyboardLayoutSelectView keyboardLayoutSelectView = (KeyboardLayoutSelectView) view2.findViewById(C0838R.id.lang_switch_position_list_item);
        keyboardLayoutSelectView.setImageList(t());
        keyboardLayoutSelectView.c();
    }
}
