package com.bytedance.android.input.keyboard.emoji;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class EmojiViewHolder extends RecyclerView.ViewHolder {
    private final TextView a;
    private kotlin.s.b.l<? super i, kotlin.o> b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmojiViewHolder(TextView textView, kotlin.s.b.l<? super i, kotlin.o> lVar) {
        super(textView);
        kotlin.s.c.l.f(textView, "textView");
        kotlin.s.c.l.f(lVar, "onEmojiItemClick");
        this.a = textView;
        this.b = lVar;
    }

    public static void b(EmojiViewHolder emojiViewHolder, i iVar, View view) {
        kotlin.s.c.l.f(emojiViewHolder, "this$0");
        kotlin.s.c.l.f(iVar, "$itemData");
        emojiViewHolder.b.invoke(iVar);
    }

    public final void a(final i iVar) {
        kotlin.s.c.l.f(iVar, "itemData");
        this.a.setText(iVar.d());
        this.a.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.android.input.keyboard.emoji.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EmojiViewHolder.b(EmojiViewHolder.this, iVar, view);
            }
        });
    }
}
