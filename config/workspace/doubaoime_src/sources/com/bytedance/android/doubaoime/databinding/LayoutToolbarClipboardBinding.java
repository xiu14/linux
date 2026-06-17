package com.bytedance.android.doubaoime.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.bytedance.android.doubaoime.C0838R;

/* loaded from: classes.dex */
public final class LayoutToolbarClipboardBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final AppCompatImageView b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final RecyclerView f2013c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final AppCompatImageView f2014d;

    private LayoutToolbarClipboardBinding(@NonNull LinearLayout linearLayout, @NonNull AppCompatImageView appCompatImageView, @NonNull RecyclerView recyclerView, @NonNull AppCompatImageView appCompatImageView2) {
        this.a = linearLayout;
        this.b = appCompatImageView;
        this.f2013c = recyclerView;
        this.f2014d = appCompatImageView2;
    }

    @NonNull
    public static LayoutToolbarClipboardBinding b(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C0838R.layout.layout_toolbar_clipboard, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        int i = C0838R.id.toolbar_clipboard_close;
        AppCompatImageView appCompatImageView = (AppCompatImageView) inflate.findViewById(C0838R.id.toolbar_clipboard_close);
        if (appCompatImageView != null) {
            i = C0838R.id.toolbar_clipboard_content;
            RecyclerView recyclerView = (RecyclerView) inflate.findViewById(C0838R.id.toolbar_clipboard_content);
            if (recyclerView != null) {
                i = C0838R.id.toolbar_clipboard_word_segmentation;
                AppCompatImageView appCompatImageView2 = (AppCompatImageView) inflate.findViewById(C0838R.id.toolbar_clipboard_word_segmentation);
                if (appCompatImageView2 != null) {
                    return new LayoutToolbarClipboardBinding((LinearLayout) inflate, appCompatImageView, recyclerView, appCompatImageView2);
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
