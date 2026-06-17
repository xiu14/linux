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
import androidx.appcompat.widget.SwitchCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.bytedance.android.doubaoime.C0838R;

/* loaded from: classes.dex */
public final class ImeListItemViewBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final ImageView b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f2272c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f2273d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final View f2274e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final FrameLayout f2275f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final LinearLayout f2276g;

    @NonNull
    public final ImageView h;

    @NonNull
    public final LinearLayout i;

    @NonNull
    public final TextView j;

    @NonNull
    public final View k;

    @NonNull
    public final SwitchCompat l;

    @NonNull
    public final TextView m;

    @NonNull
    public final TextView n;

    @NonNull
    public final LinearLayout o;

    @NonNull
    public final ConstraintLayout p;

    private ImeListItemViewBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull RelativeLayout relativeLayout, @NonNull TextView textView2, @NonNull View view, @NonNull FrameLayout frameLayout, @NonNull LinearLayout linearLayout, @NonNull ImageView imageView2, @NonNull LinearLayout linearLayout2, @NonNull TextView textView3, @NonNull View view2, @NonNull SwitchCompat switchCompat, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull LinearLayout linearLayout3, @NonNull ConstraintLayout constraintLayout2) {
        this.a = constraintLayout;
        this.b = imageView;
        this.f2272c = textView;
        this.f2273d = textView2;
        this.f2274e = view;
        this.f2275f = frameLayout;
        this.f2276g = linearLayout;
        this.h = imageView2;
        this.i = linearLayout2;
        this.j = textView3;
        this.k = view2;
        this.l = switchCompat;
        this.m = textView4;
        this.n = textView5;
        this.o = linearLayout3;
        this.p = constraintLayout2;
    }

    @NonNull
    public static ImeListItemViewBinding a(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C0838R.layout.ime_list_item_view, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        int i = C0838R.id.arrow_icon;
        ImageView imageView = (ImageView) inflate.findViewById(C0838R.id.arrow_icon);
        if (imageView != null) {
            i = C0838R.id.arrow_text;
            TextView textView = (TextView) inflate.findViewById(C0838R.id.arrow_text);
            if (textView != null) {
                i = C0838R.id.container;
                RelativeLayout relativeLayout = (RelativeLayout) inflate.findViewById(C0838R.id.container);
                if (relativeLayout != null) {
                    i = C0838R.id.description;
                    TextView textView2 = (TextView) inflate.findViewById(C0838R.id.description);
                    if (textView2 != null) {
                        i = C0838R.id.ime_list_item_overlay;
                        View findViewById = inflate.findViewById(C0838R.id.ime_list_item_overlay);
                        if (findViewById != null) {
                            i = C0838R.id.item_accessory_container;
                            FrameLayout frameLayout = (FrameLayout) inflate.findViewById(C0838R.id.item_accessory_container);
                            if (frameLayout != null) {
                                i = C0838R.id.item_arrow_container;
                                LinearLayout linearLayout = (LinearLayout) inflate.findViewById(C0838R.id.item_arrow_container);
                                if (linearLayout != null) {
                                    i = C0838R.id.item_clear;
                                    ImageView imageView2 = (ImageView) inflate.findViewById(C0838R.id.item_clear);
                                    if (imageView2 != null) {
                                        i = C0838R.id.item_clear_container;
                                        LinearLayout linearLayout2 = (LinearLayout) inflate.findViewById(C0838R.id.item_clear_container);
                                        if (linearLayout2 != null) {
                                            i = C0838R.id.item_clear_tip;
                                            TextView textView3 = (TextView) inflate.findViewById(C0838R.id.item_clear_tip);
                                            if (textView3 != null) {
                                                i = C0838R.id.item_dot;
                                                View findViewById2 = inflate.findViewById(C0838R.id.item_dot);
                                                if (findViewById2 != null) {
                                                    i = C0838R.id.item_switch_button;
                                                    SwitchCompat switchCompat = (SwitchCompat) inflate.findViewById(C0838R.id.item_switch_button);
                                                    if (switchCompat != null) {
                                                        i = C0838R.id.item_title;
                                                        TextView textView4 = (TextView) inflate.findViewById(C0838R.id.item_title);
                                                        if (textView4 != null) {
                                                            i = C0838R.id.item_title_horizontal_desc;
                                                            TextView textView5 = (TextView) inflate.findViewById(C0838R.id.item_title_horizontal_desc);
                                                            if (textView5 != null) {
                                                                i = C0838R.id.item_top_title_contaier;
                                                                LinearLayout linearLayout3 = (LinearLayout) inflate.findViewById(C0838R.id.item_top_title_contaier);
                                                                if (linearLayout3 != null) {
                                                                    i = C0838R.id.text_container;
                                                                    ConstraintLayout constraintLayout = (ConstraintLayout) inflate.findViewById(C0838R.id.text_container);
                                                                    if (constraintLayout != null) {
                                                                        return new ImeListItemViewBinding((ConstraintLayout) inflate, imageView, textView, relativeLayout, textView2, findViewById, frameLayout, linearLayout, imageView2, linearLayout2, textView3, findViewById2, switchCompat, textView4, textView5, linearLayout3, constraintLayout);
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
