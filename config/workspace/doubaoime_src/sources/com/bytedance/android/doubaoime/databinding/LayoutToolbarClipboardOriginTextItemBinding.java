package com.bytedance.android.doubaoime.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.bytedance.android.doubaoime.C0838R;

/* loaded from: classes.dex */
public final class LayoutToolbarClipboardOriginTextItemBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final TextView b;

    private LayoutToolbarClipboardOriginTextItemBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView) {
        this.a = linearLayout;
        this.b = textView;
    }

    @NonNull
    public static LayoutToolbarClipboardOriginTextItemBinding b(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C0838R.layout.layout_toolbar_clipboard_origin_text_item, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        TextView textView = (TextView) inflate.findViewById(C0838R.id.tv_clipboard_origin_text_item);
        if (textView != null) {
            return new LayoutToolbarClipboardOriginTextItemBinding((LinearLayout) inflate, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(C0838R.id.tv_clipboard_origin_text_item)));
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
