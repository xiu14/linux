package com.bytedance.android.input.fragment.message;

import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.doubaoime.databinding.ItemMessageCenterBinding;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public final class MessageCenterViewHolder extends RecyclerView.ViewHolder {
    private final ItemMessageCenterBinding a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageCenterViewHolder(ItemMessageCenterBinding itemMessageCenterBinding) {
        super(itemMessageCenterBinding.a());
        l.f(itemMessageCenterBinding, "binding");
        this.a = itemMessageCenterBinding;
    }

    public final ItemMessageCenterBinding a() {
        return this.a;
    }
}
