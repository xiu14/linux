package com.bytedance.android.input.keyboard.gif.list_layout;

import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.doubaoime.databinding.EmoticonsImageItemBinding;

/* loaded from: classes.dex */
public final class ImageViewHolder extends RecyclerView.ViewHolder {
    private final EmoticonsImageItemBinding a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageViewHolder(EmoticonsImageItemBinding emoticonsImageItemBinding) {
        super(emoticonsImageItemBinding.a());
        kotlin.s.c.l.f(emoticonsImageItemBinding, "binding");
        this.a = emoticonsImageItemBinding;
    }

    public final EmoticonsImageItemBinding a() {
        return this.a;
    }
}
