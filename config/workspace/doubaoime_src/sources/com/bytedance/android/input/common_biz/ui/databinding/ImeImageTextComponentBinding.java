package com.bytedance.android.input.common_biz.ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.bytedance.android.doubaoime.C0838R;

/* loaded from: classes.dex */
public final class ImeImageTextComponentBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final ImageView b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f2271c;

    private ImeImageTextComponentBinding(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull TextView textView) {
        this.a = linearLayout;
        this.b = imageView;
        this.f2271c = textView;
    }

    @NonNull
    public static ImeImageTextComponentBinding a(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C0838R.layout.ime_image_text_component, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        int i = C0838R.id.iv_icon;
        ImageView imageView = (ImageView) inflate.findViewById(C0838R.id.iv_icon);
        if (imageView != null) {
            i = C0838R.id.tv_text;
            TextView textView = (TextView) inflate.findViewById(C0838R.id.tv_text);
            if (textView != null) {
                return new ImeImageTextComponentBinding((LinearLayout) inflate, imageView, textView);
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
