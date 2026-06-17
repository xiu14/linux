package com.bytedance.android.input.keyboard.emoji;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.doubaoime.C0838R;
import com.ss.android.message.log.PushLog;
import java.util.List;

/* loaded from: classes.dex */
public final class KaomojiAdapter extends RecyclerView.Adapter<KaomojiViewHolder> {
    private kotlin.s.b.l<? super i, kotlin.o> a;
    private List<i> b;

    public KaomojiAdapter(kotlin.s.b.l<? super i, kotlin.o> lVar) {
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
    public void onBindViewHolder(KaomojiViewHolder kaomojiViewHolder, int i) {
        KaomojiViewHolder kaomojiViewHolder2 = kaomojiViewHolder;
        kotlin.s.c.l.f(kaomojiViewHolder2, "holder");
        kaomojiViewHolder2.a(this.b.get(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public KaomojiViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        kotlin.s.c.l.f(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0838R.layout.emoji_kaomoji_item, viewGroup, false);
        kotlin.s.c.l.d(inflate, "null cannot be cast to non-null type android.widget.TextView");
        return new KaomojiViewHolder((TextView) inflate, this.a);
    }
}
