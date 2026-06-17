package com.bytedance.android.input.keyboard.emoji;

import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.content.res.ResourcesCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.doubaoime.C0838R;
import com.ss.android.message.log.PushLog;
import java.util.List;

/* loaded from: classes.dex */
public final class EmojiAdapter extends RecyclerView.Adapter<EmojiViewHolder> {
    private kotlin.s.b.l<? super i, kotlin.o> a;
    private List<i> b;

    public EmojiAdapter(kotlin.s.b.l<? super i, kotlin.o> lVar) {
        kotlin.s.c.l.f(lVar, "onEmojiItemClick");
        this.a = lVar;
        this.b = kotlin.collections.l.a;
    }

    public final List<i> a() {
        return this.b;
    }

    public final void b(List<i> list) {
        kotlin.s.c.l.f(list, PushLog.KEY_VALUE);
        this.b = list;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(EmojiViewHolder emojiViewHolder, int i) {
        EmojiViewHolder emojiViewHolder2 = emojiViewHolder;
        kotlin.s.c.l.f(emojiViewHolder2, "holder");
        emojiViewHolder2.a(this.b.get(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public EmojiViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        kotlin.s.c.l.f(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0838R.layout.emoji_item, viewGroup, false);
        kotlin.s.c.l.d(inflate, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) inflate;
        try {
            textView.setTypeface(ResourcesCompat.getFont(viewGroup.getContext(), C0838R.font.noto_color_emoji));
            if (textView.getTypeface() == null) {
                textView.setTypeface(Typeface.DEFAULT);
            }
        } catch (Exception unused) {
            textView.setTypeface(Typeface.DEFAULT);
        }
        return new EmojiViewHolder(textView, this.a);
    }
}
