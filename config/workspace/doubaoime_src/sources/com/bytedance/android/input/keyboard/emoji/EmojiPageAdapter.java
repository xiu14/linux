package com.bytedance.android.input.keyboard.emoji;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.doubaoime.C0838R;
import java.util.List;

/* loaded from: classes.dex */
public final class EmojiPageAdapter extends RecyclerView.Adapter<EmojiPageHolder> {
    private kotlin.s.b.l<? super i, kotlin.o> a;
    private List<h> b;

    public EmojiPageAdapter(kotlin.s.b.l<? super i, kotlin.o> lVar) {
        kotlin.s.c.l.f(lVar, "onEmojiItemClick");
        this.a = lVar;
        this.b = kotlin.collections.l.a;
    }

    public final List<h> a() {
        return this.b;
    }

    public final void b(List<h> list) {
        kotlin.s.c.l.f(list, "<set-?>");
        this.b = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return i > 0 ? 1 : 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(EmojiPageHolder emojiPageHolder, int i) {
        EmojiPageHolder emojiPageHolder2 = emojiPageHolder;
        kotlin.s.c.l.f(emojiPageHolder2, "holder");
        emojiPageHolder2.a(this.b.get(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public EmojiPageHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        int i2;
        kotlin.s.c.l.f(viewGroup, "parent");
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        boolean z = true;
        if (i == 1) {
            i2 = C0838R.layout.emoji_page;
            z = false;
        } else {
            i2 = C0838R.layout.emoji_empty;
        }
        View inflate = from.inflate(i2, viewGroup, false);
        kotlin.s.c.l.e(inflate, "view");
        return new EmojiPageHolder(inflate, this.a, z);
    }
}
