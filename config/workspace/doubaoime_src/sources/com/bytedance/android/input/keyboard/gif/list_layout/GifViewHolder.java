package com.bytedance.android.input.keyboard.gif.list_layout;

import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.doubaoime.databinding.EmoticonsGifItemBinding;

/* loaded from: classes.dex */
public final class GifViewHolder extends RecyclerView.ViewHolder {
    private final EmoticonsGifItemBinding a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GifViewHolder(EmoticonsGifItemBinding emoticonsGifItemBinding) {
        super(emoticonsGifItemBinding.a());
        kotlin.s.c.l.f(emoticonsGifItemBinding, "binding");
        this.a = emoticonsGifItemBinding;
    }

    public final EmoticonsGifItemBinding a() {
        return this.a;
    }
}
