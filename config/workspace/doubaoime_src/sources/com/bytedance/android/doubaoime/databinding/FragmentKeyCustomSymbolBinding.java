package com.bytedance.android.doubaoime.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.common_biz.ui.widget.ImeTitleBar;

/* loaded from: classes.dex */
public final class FragmentKeyCustomSymbolBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final LinearLayout b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final ImageView f1967c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final ImageView f1968d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final NestedScrollView f1969e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final RecyclerView f1970f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final Space f1971g;

    @NonNull
    public final Space h;

    @NonNull
    public final TextView i;

    @NonNull
    public final TextView j;

    @NonNull
    public final TextView k;

    @NonNull
    public final LinearLayout l;

    @NonNull
    public final LinearLayout m;

    private FragmentKeyCustomSymbolBinding(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull NestedScrollView nestedScrollView, @NonNull RecyclerView recyclerView, @NonNull Space space, @NonNull Space space2, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull LinearLayout linearLayout3, @NonNull LinearLayout linearLayout4, @NonNull ImeTitleBar imeTitleBar) {
        this.a = linearLayout;
        this.b = linearLayout2;
        this.f1967c = imageView;
        this.f1968d = imageView2;
        this.f1969e = nestedScrollView;
        this.f1970f = recyclerView;
        this.f1971g = space;
        this.h = space2;
        this.i = textView;
        this.j = textView2;
        this.k = textView3;
        this.l = linearLayout3;
        this.m = linearLayout4;
    }

    @NonNull
    public static FragmentKeyCustomSymbolBinding b(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C0838R.layout.fragment_key_custom_symbol, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        int i = C0838R.id.key_custom_symbol_add_layout;
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(C0838R.id.key_custom_symbol_add_layout);
        if (linearLayout != null) {
            i = C0838R.id.key_custom_symbol_iv_select_number9;
            ImageView imageView = (ImageView) inflate.findViewById(C0838R.id.key_custom_symbol_iv_select_number9);
            if (imageView != null) {
                i = C0838R.id.key_custom_symbol_iv_select_py9;
                ImageView imageView2 = (ImageView) inflate.findViewById(C0838R.id.key_custom_symbol_iv_select_py9);
                if (imageView2 != null) {
                    i = C0838R.id.key_custom_symbol_nested_scroll_view;
                    NestedScrollView nestedScrollView = (NestedScrollView) inflate.findViewById(C0838R.id.key_custom_symbol_nested_scroll_view);
                    if (nestedScrollView != null) {
                        i = C0838R.id.key_custom_symbol_recycler_view;
                        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(C0838R.id.key_custom_symbol_recycler_view);
                        if (recyclerView != null) {
                            i = C0838R.id.key_custom_symbol_space_12;
                            Space space = (Space) inflate.findViewById(C0838R.id.key_custom_symbol_space_12);
                            if (space != null) {
                                i = C0838R.id.key_custom_symbol_space_6;
                                Space space2 = (Space) inflate.findViewById(C0838R.id.key_custom_symbol_space_6);
                                if (space2 != null) {
                                    i = C0838R.id.key_custom_symbol_tv_editor;
                                    TextView textView = (TextView) inflate.findViewById(C0838R.id.key_custom_symbol_tv_editor);
                                    if (textView != null) {
                                        i = C0838R.id.key_custom_symbol_tv_select_number9;
                                        TextView textView2 = (TextView) inflate.findViewById(C0838R.id.key_custom_symbol_tv_select_number9);
                                        if (textView2 != null) {
                                            i = C0838R.id.key_custom_symbol_tv_select_py9;
                                            TextView textView3 = (TextView) inflate.findViewById(C0838R.id.key_custom_symbol_tv_select_py9);
                                            if (textView3 != null) {
                                                i = C0838R.id.key_image_entrance_9_number_layout;
                                                LinearLayout linearLayout2 = (LinearLayout) inflate.findViewById(C0838R.id.key_image_entrance_9_number_layout);
                                                if (linearLayout2 != null) {
                                                    i = C0838R.id.key_image_entrance_9_py_layout;
                                                    LinearLayout linearLayout3 = (LinearLayout) inflate.findViewById(C0838R.id.key_image_entrance_9_py_layout);
                                                    if (linearLayout3 != null) {
                                                        i = C0838R.id.settings_title_bar;
                                                        ImeTitleBar imeTitleBar = (ImeTitleBar) inflate.findViewById(C0838R.id.settings_title_bar);
                                                        if (imeTitleBar != null) {
                                                            return new FragmentKeyCustomSymbolBinding((LinearLayout) inflate, linearLayout, imageView, imageView2, nestedScrollView, recyclerView, space, space2, textView, textView2, textView3, linearLayout2, linearLayout3, imeTitleBar);
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
    public LinearLayout a() {
        return this.a;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.a;
    }
}
