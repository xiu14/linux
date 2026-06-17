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
public final class LayoutImageKeyBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final AppCompatImageView b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f2011c;

    private LayoutImageKeyBinding(@NonNull ConstraintLayout constraintLayout, @NonNull AppCompatImageView appCompatImageView, @NonNull AppCompatTextView appCompatTextView) {
        this.a = constraintLayout;
        this.b = appCompatImageView;
        this.f2011c = appCompatTextView;
    }

    @NonNull
    public static LayoutImageKeyBinding a(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C0838R.layout.layout_image_key, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        int i = C0838R.id.keyboard_image;
        AppCompatImageView appCompatImageView = (AppCompatImageView) inflate.findViewById(C0838R.id.keyboard_image);
        if (appCompatImageView != null) {
            i = C0838R.id.keyboard_text;
            AppCompatTextView appCompatTextView = (AppCompatTextView) inflate.findViewById(C0838R.id.keyboard_text);
            if (appCompatTextView != null) {
                return new LayoutImageKeyBinding((ConstraintLayout) inflate, appCompatImageView, appCompatTextView);
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
