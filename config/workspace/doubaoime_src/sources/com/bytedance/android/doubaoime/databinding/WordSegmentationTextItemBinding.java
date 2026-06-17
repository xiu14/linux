package com.bytedance.android.doubaoime.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.android.input.fragment.custom_symbol.ui.SymbolTextView;
import java.util.Objects;

/* loaded from: classes.dex */
public final class WordSegmentationTextItemBinding implements ViewBinding {

    @NonNull
    private final SymbolTextView a;

    @NonNull
    public final SymbolTextView b;

    private WordSegmentationTextItemBinding(@NonNull SymbolTextView symbolTextView, @NonNull SymbolTextView symbolTextView2) {
        this.a = symbolTextView;
        this.b = symbolTextView2;
    }

    @NonNull
    public static WordSegmentationTextItemBinding b(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C0838R.layout.word_segmentation_text_item, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        Objects.requireNonNull(inflate, "rootView");
        SymbolTextView symbolTextView = (SymbolTextView) inflate;
        return new WordSegmentationTextItemBinding(symbolTextView, symbolTextView);
    }

    @NonNull
    public SymbolTextView a() {
        return this.a;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.a;
    }
}
