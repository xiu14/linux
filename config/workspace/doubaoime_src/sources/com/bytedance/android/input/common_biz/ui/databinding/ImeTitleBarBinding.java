package com.bytedance.android.input.common_biz.ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.viewbinding.ViewBinding;
import com.bytedance.android.doubaoime.C0838R;

/* loaded from: classes.dex */
public final class ImeTitleBarBinding implements ViewBinding {

    @NonNull
    private final RelativeLayout a;

    @NonNull
    public final FrameLayout b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final ImageView f2278c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final AppCompatImageView f2279d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final ImageView f2280e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final ImageView f2281f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final TextView f2282g;

    @NonNull
    public final TextView h;

    @NonNull
    public final View i;

    private ImeTitleBarBinding(@NonNull RelativeLayout relativeLayout, @NonNull FrameLayout frameLayout, @NonNull ImageView imageView, @NonNull AppCompatImageView appCompatImageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull View view) {
        this.a = relativeLayout;
        this.b = frameLayout;
        this.f2278c = imageView;
        this.f2279d = appCompatImageView;
        this.f2280e = imageView2;
        this.f2281f = imageView3;
        this.f2282g = textView;
        this.h = textView2;
        this.i = view;
    }

    @NonNull
    public static ImeTitleBarBinding a(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C0838R.layout.ime_title_bar, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        int i = C0838R.id.fl_right_tips;
        FrameLayout frameLayout = (FrameLayout) inflate.findViewById(C0838R.id.fl_right_tips);
        if (frameLayout != null) {
            i = C0838R.id.iv_back;
            ImageView imageView = (ImageView) inflate.findViewById(C0838R.id.iv_back);
            if (imageView != null) {
                i = C0838R.id.iv_right;
                AppCompatImageView appCompatImageView = (AppCompatImageView) inflate.findViewById(C0838R.id.iv_right);
                if (appCompatImageView != null) {
                    i = C0838R.id.iv_title_icon;
                    ImageView imageView2 = (ImageView) inflate.findViewById(C0838R.id.iv_title_icon);
                    if (imageView2 != null) {
                        i = C0838R.id.iv_title_image;
                        ImageView imageView3 = (ImageView) inflate.findViewById(C0838R.id.iv_title_image);
                        if (imageView3 != null) {
                            i = C0838R.id.ll_title_container;
                            LinearLayout linearLayout = (LinearLayout) inflate.findViewById(C0838R.id.ll_title_container);
                            if (linearLayout != null) {
                                i = C0838R.id.tv_right_text;
                                TextView textView = (TextView) inflate.findViewById(C0838R.id.tv_right_text);
                                if (textView != null) {
                                    i = C0838R.id.tv_title;
                                    TextView textView2 = (TextView) inflate.findViewById(C0838R.id.tv_title);
                                    if (textView2 != null) {
                                        i = C0838R.id.v_right_tips;
                                        View findViewById = inflate.findViewById(C0838R.id.v_right_tips);
                                        if (findViewById != null) {
                                            return new ImeTitleBarBinding((RelativeLayout) inflate, frameLayout, imageView, appCompatImageView, imageView2, imageView3, linearLayout, textView, textView2, findViewById);
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

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.a;
    }
}
