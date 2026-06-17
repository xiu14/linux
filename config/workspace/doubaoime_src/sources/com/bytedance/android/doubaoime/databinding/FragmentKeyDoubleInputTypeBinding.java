package com.bytedance.android.doubaoime.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.common_biz.ui.widget.ImeCheckBox;
import com.bytedance.common_biz.ui.widget.ImeTitleBar;

/* loaded from: classes.dex */
public final class FragmentKeyDoubleInputTypeBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final ImeCheckBox b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final ImeCheckBox f1972c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final ImageView f1973d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final LinearLayout f1974e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final LinearLayout f1975f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final ImeTitleBar f1976g;

    private FragmentKeyDoubleInputTypeBinding(@NonNull LinearLayout linearLayout, @NonNull ImeCheckBox imeCheckBox, @NonNull ImeCheckBox imeCheckBox2, @NonNull ImageView imageView, @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout3, @NonNull ImeTitleBar imeTitleBar) {
        this.a = linearLayout;
        this.b = imeCheckBox;
        this.f1972c = imeCheckBox2;
        this.f1973d = imageView;
        this.f1974e = linearLayout2;
        this.f1975f = linearLayout3;
        this.f1976g = imeTitleBar;
    }

    @NonNull
    public static FragmentKeyDoubleInputTypeBinding b(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C0838R.layout.fragment_key_double_input_type, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        int i = C0838R.id.check_box_double_input_type_xh;
        ImeCheckBox imeCheckBox = (ImeCheckBox) inflate.findViewById(C0838R.id.check_box_double_input_type_xh);
        if (imeCheckBox != null) {
            i = C0838R.id.check_box_double_input_type_zrm;
            ImeCheckBox imeCheckBox2 = (ImeCheckBox) inflate.findViewById(C0838R.id.check_box_double_input_type_zrm);
            if (imeCheckBox2 != null) {
                i = C0838R.id.iv_double_input_preview;
                ImageView imageView = (ImageView) inflate.findViewById(C0838R.id.iv_double_input_preview);
                if (imageView != null) {
                    i = C0838R.id.kbd_select_layout_double_xh;
                    LinearLayout linearLayout = (LinearLayout) inflate.findViewById(C0838R.id.kbd_select_layout_double_xh);
                    if (linearLayout != null) {
                        i = C0838R.id.kbd_select_layout_double_zrm;
                        LinearLayout linearLayout2 = (LinearLayout) inflate.findViewById(C0838R.id.kbd_select_layout_double_zrm);
                        if (linearLayout2 != null) {
                            i = C0838R.id.settings_title_bar;
                            ImeTitleBar imeTitleBar = (ImeTitleBar) inflate.findViewById(C0838R.id.settings_title_bar);
                            if (imeTitleBar != null) {
                                return new FragmentKeyDoubleInputTypeBinding((LinearLayout) inflate, imeCheckBox, imeCheckBox2, imageView, linearLayout, linearLayout2, imeTitleBar);
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
