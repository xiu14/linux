package com.bytedance.android.doubaoime.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.android.input.keyboard.component.ActionButtonKeyComponent;
import com.bytedance.android.input.keyboard.component.NumberButtonKeyComponent;
import com.bytedance.android.input.keyboard.component.SpaceButtonKeyComponent;
import com.bytedance.android.input.keyboard.component.SwitchBoardButtonKeyComponent;
import com.bytedance.android.input.keyboard.component.SymbolButtonKeyComponent;
import com.bytedance.android.input.keyboard.custom_symbol.KeyboardCustomSymbolLayout;
import com.bytedance.android.input.keyboard.handwriting.ToolBarTipsLayout;
import com.bytedance.android.input.popup.HandwriteView;

/* loaded from: classes.dex */
public final class LayoutHandWritingBoardViewBinding implements ViewBinding {

    @NonNull
    private final FrameLayout a;

    @NonNull
    public final KeyboardCustomSymbolLayout b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final LinearLayout f2006c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final ImageView f2007d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final ActionButtonKeyComponent f2008e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final NumberButtonKeyComponent f2009f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final SpaceButtonKeyComponent f2010g;

    @NonNull
    public final SwitchBoardButtonKeyComponent h;

    @NonNull
    public final SymbolButtonKeyComponent i;

    @NonNull
    public final LinearLayout j;

    @NonNull
    public final HandwriteView k;

    @NonNull
    public final ToolBarTipsLayout l;

    @NonNull
    public final LinearLayout m;

    @NonNull
    public final View n;

    private LayoutHandWritingBoardViewBinding(@NonNull FrameLayout frameLayout, @NonNull KeyboardCustomSymbolLayout keyboardCustomSymbolLayout, @NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull ActionButtonKeyComponent actionButtonKeyComponent, @NonNull NumberButtonKeyComponent numberButtonKeyComponent, @NonNull SpaceButtonKeyComponent spaceButtonKeyComponent, @NonNull SwitchBoardButtonKeyComponent switchBoardButtonKeyComponent, @NonNull SymbolButtonKeyComponent symbolButtonKeyComponent, @NonNull LinearLayout linearLayout2, @NonNull HandwriteView handwriteView, @NonNull ToolBarTipsLayout toolBarTipsLayout, @NonNull LinearLayout linearLayout3, @NonNull View view) {
        this.a = frameLayout;
        this.b = keyboardCustomSymbolLayout;
        this.f2006c = linearLayout;
        this.f2007d = imageView;
        this.f2008e = actionButtonKeyComponent;
        this.f2009f = numberButtonKeyComponent;
        this.f2010g = spaceButtonKeyComponent;
        this.h = switchBoardButtonKeyComponent;
        this.i = symbolButtonKeyComponent;
        this.j = linearLayout2;
        this.k = handwriteView;
        this.l = toolBarTipsLayout;
        this.m = linearLayout3;
        this.n = view;
    }

    @NonNull
    public static LayoutHandWritingBoardViewBinding b(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C0838R.layout.layout_hand_writing_board_view, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        int i = C0838R.id.custom_symbol_component;
        KeyboardCustomSymbolLayout keyboardCustomSymbolLayout = (KeyboardCustomSymbolLayout) inflate.findViewById(C0838R.id.custom_symbol_component);
        if (keyboardCustomSymbolLayout != null) {
            i = C0838R.id.hand_writing_btn_key_layout;
            LinearLayout linearLayout = (LinearLayout) inflate.findViewById(C0838R.id.hand_writing_btn_key_layout);
            if (linearLayout != null) {
                i = C0838R.id.hand_writing_iv_delete;
                ImageView imageView = (ImageView) inflate.findViewById(C0838R.id.hand_writing_iv_delete);
                if (imageView != null) {
                    i = C0838R.id.hand_writing_key_action;
                    ActionButtonKeyComponent actionButtonKeyComponent = (ActionButtonKeyComponent) inflate.findViewById(C0838R.id.hand_writing_key_action);
                    if (actionButtonKeyComponent != null) {
                        i = C0838R.id.hand_writing_key_number;
                        NumberButtonKeyComponent numberButtonKeyComponent = (NumberButtonKeyComponent) inflate.findViewById(C0838R.id.hand_writing_key_number);
                        if (numberButtonKeyComponent != null) {
                            i = C0838R.id.hand_writing_key_space;
                            SpaceButtonKeyComponent spaceButtonKeyComponent = (SpaceButtonKeyComponent) inflate.findViewById(C0838R.id.hand_writing_key_space);
                            if (spaceButtonKeyComponent != null) {
                                i = C0838R.id.hand_writing_key_switch;
                                SwitchBoardButtonKeyComponent switchBoardButtonKeyComponent = (SwitchBoardButtonKeyComponent) inflate.findViewById(C0838R.id.hand_writing_key_switch);
                                if (switchBoardButtonKeyComponent != null) {
                                    i = C0838R.id.hand_writing_key_symbol;
                                    SymbolButtonKeyComponent symbolButtonKeyComponent = (SymbolButtonKeyComponent) inflate.findViewById(C0838R.id.hand_writing_key_symbol);
                                    if (symbolButtonKeyComponent != null) {
                                        i = C0838R.id.hand_writing_symbol_layout;
                                        LinearLayout linearLayout2 = (LinearLayout) inflate.findViewById(C0838R.id.hand_writing_symbol_layout);
                                        if (linearLayout2 != null) {
                                            i = C0838R.id.handwriteView;
                                            HandwriteView handwriteView = (HandwriteView) inflate.findViewById(C0838R.id.handwriteView);
                                            if (handwriteView != null) {
                                                i = C0838R.id.toolbar_tips_layout;
                                                ToolBarTipsLayout toolBarTipsLayout = (ToolBarTipsLayout) inflate.findViewById(C0838R.id.toolbar_tips_layout);
                                                if (toolBarTipsLayout != null) {
                                                    i = C0838R.id.transparent_tool_bar_layout;
                                                    LinearLayout linearLayout3 = (LinearLayout) inflate.findViewById(C0838R.id.transparent_tool_bar_layout);
                                                    if (linearLayout3 != null) {
                                                        i = C0838R.id.view_line;
                                                        View findViewById = inflate.findViewById(C0838R.id.view_line);
                                                        if (findViewById != null) {
                                                            return new LayoutHandWritingBoardViewBinding((FrameLayout) inflate, keyboardCustomSymbolLayout, linearLayout, imageView, actionButtonKeyComponent, numberButtonKeyComponent, spaceButtonKeyComponent, switchBoardButtonKeyComponent, symbolButtonKeyComponent, linearLayout2, handwriteView, toolBarTipsLayout, linearLayout3, findViewById);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }

    @NonNull
    public FrameLayout a() {
        return this.a;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.a;
    }
}
