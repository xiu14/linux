package com.bytedance.android.doubaoime.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.bytedance.android.doubaoime.C0838R;

/* loaded from: classes.dex */
public final class LayoutImeKeyboardTitleBarBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final AppCompatImageView b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f2012c;

    private LayoutImeKeyboardTitleBarBinding(@NonNull ConstraintLayout constraintLayout, @NonNull AppCompatImageView appCompatImageView, @NonNull AppCompatTextView appCompatTextView, @NonNull AppCompatImageView appCompatImageView2) {
        this.a = constraintLayout;
        this.b = appCompatImageView;
        this.f2012c = appCompatTextView;
    }

    @NonNull
    public static LayoutImeKeyboardTitleBarBinding a(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C0838R.layout.layout_ime_keyboard_title_bar, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        int i = C0838R.id.keyboard_title_bar_left_img;
        AppCompatImageView appCompatImageView = (AppCompatImageView) inflate.findViewById(C0838R.id.keyboard_title_bar_left_img);
        if (appCompatImageView != null) {
            i = C0838R.id.keyboard_title_bar_middle_text;
            AppCompatTextView appCompatTextView = (AppCompatTextView) inflate.findViewById(C0838R.id.keyboard_title_bar_middle_text);
            if (appCompatTextView != null) {
                i = C0838R.id.keyboard_title_bar_right_img;
                AppCompatImageView appCompatImageView2 = (AppCompatImageView) inflate.findViewById(C0838R.id.keyboard_title_bar_right_img);
                if (appCompatImageView2 != null) {
                    return new LayoutImeKeyboardTitleBarBinding((ConstraintLayout) inflate, appCompatImageView, appCompatTextView, appCompatImageView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.a;
    }
}
