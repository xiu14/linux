package com.bytedance.android.input.common_biz.ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.bytedance.android.doubaoime.C0838R;

/* loaded from: classes.dex */
public final class ImeTipsLayoutBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final ImageView b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f2277c;

    private ImeTipsLayoutBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull LinearLayout linearLayout, @NonNull TextView textView) {
        this.a = constraintLayout;
        this.b = imageView;
        this.f2277c = textView;
    }

    @NonNull
    public static ImeTipsLayoutBinding b(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C0838R.layout.ime_tips_layout, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        int i = C0838R.id.iv_circle;
        ImageView imageView = (ImageView) inflate.findViewById(C0838R.id.iv_circle);
        if (imageView != null) {
            i = C0838R.id.ll_content_container;
            LinearLayout linearLayout = (LinearLayout) inflate.findViewById(C0838R.id.ll_content_container);
            if (linearLayout != null) {
                i = C0838R.id.tv_tips;
                TextView textView = (TextView) inflate.findViewById(C0838R.id.tv_tips);
                if (textView != null) {
                    return new ImeTipsLayoutBinding((ConstraintLayout) inflate, imageView, linearLayout, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }

    @NonNull
    public ConstraintLayout a() {
        return this.a;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.a;
    }
}
