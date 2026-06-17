package com.bytedance.android.doubaoime.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.android.input.keyboard.ImeKeyboardTitleBar;

/* loaded from: classes.dex */
public final class LayoutWordSegmentationBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final TextView b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final RecyclerView f2015c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final ImeKeyboardTitleBar f2016d;

    private LayoutWordSegmentationBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull RecyclerView recyclerView, @NonNull ImeKeyboardTitleBar imeKeyboardTitleBar) {
        this.a = linearLayout;
        this.b = textView;
        this.f2015c = recyclerView;
        this.f2016d = imeKeyboardTitleBar;
    }

    @NonNull
    public static LayoutWordSegmentationBinding b(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C0838R.layout.layout_word_segmentation, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        int i = C0838R.id.word_segmentation_add_to_common_phrase;
        TextView textView = (TextView) inflate.findViewById(C0838R.id.word_segmentation_add_to_common_phrase);
        if (textView != null) {
            i = C0838R.id.word_segmentation_recycler_view;
            RecyclerView recyclerView = (RecyclerView) inflate.findViewById(C0838R.id.word_segmentation_recycler_view);
            if (recyclerView != null) {
                i = C0838R.id.word_segmentation_title_bar;
                ImeKeyboardTitleBar imeKeyboardTitleBar = (ImeKeyboardTitleBar) inflate.findViewById(C0838R.id.word_segmentation_title_bar);
                if (imeKeyboardTitleBar != null) {
                    return new LayoutWordSegmentationBinding((LinearLayout) inflate, textView, recyclerView, imeKeyboardTitleBar);
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
