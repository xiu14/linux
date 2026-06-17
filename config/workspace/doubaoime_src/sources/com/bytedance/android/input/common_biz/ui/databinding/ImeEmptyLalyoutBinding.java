package com.bytedance.android.input.common_biz.ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.viewbinding.ViewBinding;
import com.bytedance.android.doubaoime.C0838R;
import com.obric.oui.text.OTextView;

/* loaded from: classes.dex */
public final class ImeEmptyLalyoutBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final AppCompatImageView b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final OTextView f2270c;

    private ImeEmptyLalyoutBinding(@NonNull LinearLayout linearLayout, @NonNull RelativeLayout relativeLayout, @NonNull LinearLayout linearLayout2, @NonNull AppCompatImageView appCompatImageView, @NonNull OTextView oTextView) {
        this.a = linearLayout;
        this.b = appCompatImageView;
        this.f2270c = oTextView;
    }

    @NonNull
    public static ImeEmptyLalyoutBinding a(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C0838R.layout.ime_empty_lalyout, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        int i = C0838R.id.clipboard_empty_view_container;
        RelativeLayout relativeLayout = (RelativeLayout) inflate.findViewById(C0838R.id.clipboard_empty_view_container);
        if (relativeLayout != null) {
            LinearLayout linearLayout = (LinearLayout) inflate;
            i = C0838R.id.empty_layout_icon;
            AppCompatImageView appCompatImageView = (AppCompatImageView) inflate.findViewById(C0838R.id.empty_layout_icon);
            if (appCompatImageView != null) {
                i = C0838R.id.empty_layout_text;
                OTextView oTextView = (OTextView) inflate.findViewById(C0838R.id.empty_layout_text);
                if (oTextView != null) {
                    return new ImeEmptyLalyoutBinding(linearLayout, relativeLayout, linearLayout, appCompatImageView, oTextView);
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
