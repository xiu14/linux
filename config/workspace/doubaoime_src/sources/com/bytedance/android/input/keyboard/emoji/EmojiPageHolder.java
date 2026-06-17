package com.bytedance.android.input.keyboard.emoji;

import android.content.Context;
import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.doubaoime.C0838R;

/* loaded from: classes.dex */
public final class EmojiPageHolder extends RecyclerView.ViewHolder {
    private RecyclerView a;
    private RecyclerView b;

    /* renamed from: c, reason: collision with root package name */
    private EmojiAdapter f2707c;

    /* renamed from: d, reason: collision with root package name */
    private EmojiAdapter f2708d;

    /* renamed from: e, reason: collision with root package name */
    private EmojiAdapter f2709e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f2710f;

    /* renamed from: g, reason: collision with root package name */
    private TextView f2711g;
    private TextView h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmojiPageHolder(View view, kotlin.s.b.l<? super i, kotlin.o> lVar, boolean z) {
        super(view);
        kotlin.s.c.l.f(view, "itemView");
        kotlin.s.c.l.f(lVar, "onEmojiItemClick");
        this.f2710f = z;
        if (!z) {
            if (view instanceof RecyclerView) {
                RecyclerView recyclerView = (RecyclerView) view;
                EmojiAdapter emojiAdapter = new EmojiAdapter(lVar);
                this.f2709e = emojiAdapter;
                recyclerView.setAdapter(emojiAdapter);
                recyclerView.setLayoutManager(new GridLayoutManager(recyclerView.getContext(), 8));
                Context context = recyclerView.getContext();
                kotlin.s.c.l.e(context, "itemView.context");
                int w = com.bytedance.android.input.k.b.a.w(context, 3.0f);
                Context context2 = recyclerView.getContext();
                kotlin.s.c.l.e(context2, "itemView.context");
                int w2 = com.bytedance.android.input.k.b.a.w(context2, 9.0f);
                Context context3 = recyclerView.getContext();
                kotlin.s.c.l.e(context3, "itemView.context");
                view.setPadding(w, w2, com.bytedance.android.input.k.b.a.w(context3, 3.0f), 0);
                return;
            }
            return;
        }
        ScrollView scrollView = view instanceof ScrollView ? (ScrollView) view : null;
        if (scrollView != null) {
            this.f2711g = (TextView) scrollView.findViewById(C0838R.id.emoji_page_histroy_title);
            RecyclerView recyclerView2 = (RecyclerView) scrollView.findViewById(C0838R.id.emoji_page_histroy);
            this.a = recyclerView2;
            if (recyclerView2 != null) {
                EmojiAdapter emojiAdapter2 = new EmojiAdapter(lVar);
                this.f2707c = emojiAdapter2;
                recyclerView2.setAdapter(emojiAdapter2);
                recyclerView2.setLayoutManager(new GridLayoutManager(recyclerView2.getContext(), 8));
                recyclerView2.setNestedScrollingEnabled(false);
                recyclerView2.setOverScrollMode(2);
            }
            RecyclerView recyclerView3 = (RecyclerView) scrollView.findViewById(C0838R.id.emoji_page_hot);
            this.b = recyclerView3;
            if (recyclerView3 != null) {
                EmojiAdapter emojiAdapter3 = new EmojiAdapter(lVar);
                this.f2708d = emojiAdapter3;
                recyclerView3.setAdapter(emojiAdapter3);
                recyclerView3.setLayoutManager(new GridLayoutManager(recyclerView3.getContext(), 8));
                recyclerView3.setNestedScrollingEnabled(false);
                recyclerView3.setOverScrollMode(2);
            }
            this.h = (TextView) scrollView.findViewById(C0838R.id.emoji_hot_laber);
            com.bytedance.android.input.basic.d.c cVar = com.bytedance.android.input.basic.d.c.a;
            com.bytedance.android.input.basic.d.c.a(cVar, this.f2711g, null, null, null, null, null, 0, 62);
            com.bytedance.android.input.basic.d.c.a(cVar, this.h, null, null, null, null, null, 0, 62);
        }
    }

    public final void a(h hVar) {
        Integer num;
        Context context;
        kotlin.s.c.l.f(hVar, "group");
        if (!this.f2710f) {
            EmojiAdapter emojiAdapter = this.f2709e;
            if (emojiAdapter != null) {
                emojiAdapter.b(hVar.d());
                return;
            }
            return;
        }
        EmojiAdapter emojiAdapter2 = this.f2707c;
        if (emojiAdapter2 != null) {
            emojiAdapter2.b(kotlin.collections.g.Z(hVar.d(), hVar.b()));
            TextView textView = this.f2711g;
            if (textView != null) {
                textView.setVisibility(emojiAdapter2.a().isEmpty() ^ true ? 0 : 8);
            }
            TextView textView2 = this.f2711g;
            if (textView2 == null || (context = textView2.getContext()) == null) {
                num = null;
            } else {
                kotlin.s.c.l.e(context, "context");
                TextView textView3 = this.f2711g;
                num = Integer.valueOf(textView3 != null && textView3.getVisibility() == 0 ? 0 : com.bytedance.android.input.k.b.a.w(context, 10.0f));
            }
            com.bytedance.android.input.basic.d.c.a(com.bytedance.android.input.basic.d.c.a, this.h, null, null, null, null, num, null, 94);
        }
        EmojiAdapter emojiAdapter3 = this.f2708d;
        if (emojiAdapter3 != null) {
            emojiAdapter3.b(kotlin.collections.g.n(hVar.d(), hVar.b()));
        }
    }
}
