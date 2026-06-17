package com.bytedance.android.input.keyboard.word_segmentation;

import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.doubaoime.databinding.WordSegmentationTextItemBinding;
import com.bytedance.android.input.fragment.custom_symbol.ui.SymbolTextView;

/* loaded from: classes.dex */
public final class WordSegmentationTextHolder extends RecyclerView.ViewHolder {
    private final TextView a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WordSegmentationTextHolder(WordSegmentationTextItemBinding wordSegmentationTextItemBinding) {
        super(wordSegmentationTextItemBinding.a());
        kotlin.s.c.l.f(wordSegmentationTextItemBinding, "binding");
        SymbolTextView symbolTextView = wordSegmentationTextItemBinding.b;
        kotlin.s.c.l.e(symbolTextView, "binding.wordSegmentationTextItem");
        this.a = symbolTextView;
    }

    public final TextView a() {
        return this.a;
    }
}
