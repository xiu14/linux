package com.bytedance.android.input.keyboard.emoji;

import android.content.Context;
import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.doubaoime.C0838R;

/* loaded from: classes.dex */
public final class KaomojiPageHolder extends RecyclerView.ViewHolder {
    private RecyclerView a;
    private RecyclerView b;

    /* renamed from: c, reason: collision with root package name */
    private KaomojiAdapter f2712c;

    /* renamed from: d, reason: collision with root package name */
    private KaomojiAdapter f2713d;

    /* renamed from: e, reason: collision with root package name */
    private KaomojiAdapter f2714e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f2715f;

    /* renamed from: g, reason: collision with root package name */
    private TextView f2716g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KaomojiPageHolder(View view, kotlin.s.b.l<? super i, kotlin.o> lVar, boolean z) {
        super(view);
        kotlin.s.c.l.f(view, "itemView");
        kotlin.s.c.l.f(lVar, "onEmojiItemClick");
        this.f2715f = z;
        if (!z) {
            if (view instanceof RecyclerView) {
                RecyclerView recyclerView = (RecyclerView) view;
                KaomojiAdapter kaomojiAdapter = new KaomojiAdapter(lVar);
                this.f2714e = kaomojiAdapter;
                recyclerView.setAdapter(kaomojiAdapter);
                GridLayoutManager gridLayoutManager = new GridLayoutManager(recyclerView.getContext(), 4);
                gridLayoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() { // from class: com.bytedance.android.input.keyboard.emoji.KaomojiPageHolder$2$1$1
                    @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
                    public int getSpanSize(int i) {
                        KaomojiAdapter kaomojiAdapter2;
                        kaomojiAdapter2 = KaomojiPageHolder.this.f2714e;
                        kotlin.s.c.l.c(kaomojiAdapter2);
                        return kaomojiAdapter2.a().get(i).b();
                    }
                });
                recyclerView.setLayoutManager(gridLayoutManager);
                Context context = recyclerView.getContext();
                kotlin.s.c.l.e(context, "context");
                int w = com.bytedance.android.input.k.b.a.w(context, 4.0f);
                Context context2 = recyclerView.getContext();
                kotlin.s.c.l.e(context2, "context");
                int w2 = com.bytedance.android.input.k.b.a.w(context2, 3.0f);
                Context context3 = recyclerView.getContext();
                kotlin.s.c.l.e(context3, "context");
                recyclerView.addItemDecoration(new EmojiGridSpacingItemDecoration(w, false, w2, com.bytedance.android.input.k.b.a.w(context3, 4.0f)));
                com.bytedance.android.input.basic.d.c cVar = com.bytedance.android.input.basic.d.c.a;
                Context context4 = recyclerView.getContext();
                kotlin.s.c.l.e(context4, "context");
                Integer valueOf = Integer.valueOf(com.bytedance.android.input.k.b.a.w(context4, 12.0f));
                Context context5 = recyclerView.getContext();
                kotlin.s.c.l.e(context5, "context");
                com.bytedance.android.input.basic.d.c.a(cVar, view, null, null, valueOf, Integer.valueOf(com.bytedance.android.input.k.b.a.w(context5, 12.0f)), null, null, 102);
                Context context6 = recyclerView.getContext();
                kotlin.s.c.l.e(context6, "context");
                int w3 = com.bytedance.android.input.k.b.a.w(context6, 12.0f);
                Context context7 = recyclerView.getContext();
                kotlin.s.c.l.e(context7, "context");
                view.setPadding(0, w3, 0, com.bytedance.android.input.k.b.a.w(context7, 4.0f));
                return;
            }
            return;
        }
        ScrollView scrollView = view instanceof ScrollView ? (ScrollView) view : null;
        if (scrollView != null) {
            this.f2716g = (TextView) scrollView.findViewById(C0838R.id.emoji_page_histroy_title);
            RecyclerView recyclerView2 = (RecyclerView) scrollView.findViewById(C0838R.id.emoji_page_histroy);
            this.a = recyclerView2;
            if (recyclerView2 != null) {
                KaomojiAdapter kaomojiAdapter2 = new KaomojiAdapter(lVar);
                this.f2712c = kaomojiAdapter2;
                recyclerView2.setAdapter(kaomojiAdapter2);
                GridLayoutManager gridLayoutManager2 = new GridLayoutManager(recyclerView2.getContext(), 4);
                gridLayoutManager2.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() { // from class: com.bytedance.android.input.keyboard.emoji.KaomojiPageHolder$1$1$1$1
                    @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
                    public int getSpanSize(int i) {
                        KaomojiAdapter kaomojiAdapter3;
                        kaomojiAdapter3 = KaomojiPageHolder.this.f2712c;
                        kotlin.s.c.l.c(kaomojiAdapter3);
                        return kaomojiAdapter3.a().get(i).b();
                    }
                });
                recyclerView2.setLayoutManager(gridLayoutManager2);
                Context context8 = recyclerView2.getContext();
                kotlin.s.c.l.e(context8, "context");
                int w4 = com.bytedance.android.input.k.b.a.w(context8, 4.0f);
                Context context9 = recyclerView2.getContext();
                kotlin.s.c.l.e(context9, "context");
                int w5 = com.bytedance.android.input.k.b.a.w(context9, 3.0f);
                Context context10 = recyclerView2.getContext();
                kotlin.s.c.l.e(context10, "context");
                recyclerView2.addItemDecoration(new EmojiGridSpacingItemDecoration(w4, false, w5, com.bytedance.android.input.k.b.a.w(context10, 4.0f)));
                recyclerView2.setNestedScrollingEnabled(false);
                recyclerView2.setOverScrollMode(2);
                com.bytedance.android.input.basic.d.c cVar2 = com.bytedance.android.input.basic.d.c.a;
                RecyclerView recyclerView3 = this.a;
                Context context11 = recyclerView2.getContext();
                kotlin.s.c.l.e(context11, "context");
                Integer valueOf2 = Integer.valueOf(com.bytedance.android.input.k.b.a.w(context11, 12.0f));
                Context context12 = recyclerView2.getContext();
                kotlin.s.c.l.e(context12, "context");
                com.bytedance.android.input.basic.d.c.a(cVar2, recyclerView3, null, null, valueOf2, Integer.valueOf(com.bytedance.android.input.k.b.a.w(context12, 12.0f)), null, null, 102);
                RecyclerView recyclerView4 = this.a;
                if (recyclerView4 != null) {
                    Context context13 = recyclerView2.getContext();
                    kotlin.s.c.l.e(context13, "context");
                    recyclerView4.setPadding(0, 0, 0, com.bytedance.android.input.k.b.a.w(context13, 4.0f));
                }
            }
            RecyclerView recyclerView5 = (RecyclerView) scrollView.findViewById(C0838R.id.emoji_page_hot);
            this.b = recyclerView5;
            if (recyclerView5 != null) {
                KaomojiAdapter kaomojiAdapter3 = new KaomojiAdapter(lVar);
                this.f2713d = kaomojiAdapter3;
                recyclerView5.setAdapter(kaomojiAdapter3);
                GridLayoutManager gridLayoutManager3 = new GridLayoutManager(recyclerView5.getContext(), 4);
                gridLayoutManager3.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() { // from class: com.bytedance.android.input.keyboard.emoji.KaomojiPageHolder$1$2$1$1
                    @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
                    public int getSpanSize(int i) {
                        KaomojiAdapter kaomojiAdapter4;
                        kaomojiAdapter4 = KaomojiPageHolder.this.f2713d;
                        kotlin.s.c.l.c(kaomojiAdapter4);
                        return kaomojiAdapter4.a().get(i).b();
                    }
                });
                recyclerView5.setLayoutManager(gridLayoutManager3);
                Context context14 = recyclerView5.getContext();
                kotlin.s.c.l.e(context14, "context");
                int w6 = com.bytedance.android.input.k.b.a.w(context14, 4.0f);
                Context context15 = recyclerView5.getContext();
                kotlin.s.c.l.e(context15, "context");
                int w7 = com.bytedance.android.input.k.b.a.w(context15, 3.0f);
                Context context16 = recyclerView5.getContext();
                kotlin.s.c.l.e(context16, "context");
                recyclerView5.addItemDecoration(new EmojiGridSpacingItemDecoration(w6, false, w7, com.bytedance.android.input.k.b.a.w(context16, 4.0f)));
                recyclerView5.setNestedScrollingEnabled(false);
                recyclerView5.setOverScrollMode(2);
                com.bytedance.android.input.basic.d.c cVar3 = com.bytedance.android.input.basic.d.c.a;
                RecyclerView recyclerView6 = this.b;
                Context context17 = recyclerView5.getContext();
                kotlin.s.c.l.e(context17, "context");
                Integer valueOf3 = Integer.valueOf(com.bytedance.android.input.k.b.a.w(context17, 12.0f));
                Context context18 = recyclerView5.getContext();
                kotlin.s.c.l.e(context18, "context");
                com.bytedance.android.input.basic.d.c.a(cVar3, recyclerView6, null, null, valueOf3, Integer.valueOf(com.bytedance.android.input.k.b.a.w(context18, 12.0f)), null, null, 102);
                RecyclerView recyclerView7 = this.b;
                if (recyclerView7 != null) {
                    Context context19 = recyclerView5.getContext();
                    kotlin.s.c.l.e(context19, "context");
                    recyclerView7.setPadding(0, 0, 0, com.bytedance.android.input.k.b.a.w(context19, 4.0f));
                }
            }
        }
    }

    public final void d(h hVar) {
        kotlin.s.c.l.f(hVar, "group");
        if (!this.f2715f) {
            KaomojiAdapter kaomojiAdapter = this.f2714e;
            if (kaomojiAdapter != null) {
                kaomojiAdapter.b(hVar.d());
                return;
            }
            return;
        }
        KaomojiAdapter kaomojiAdapter2 = this.f2712c;
        if (kaomojiAdapter2 != null) {
            kaomojiAdapter2.b(kotlin.collections.g.Z(hVar.d(), hVar.b()));
            TextView textView = this.f2716g;
            if (textView != null) {
                textView.setVisibility(hVar.b() > 0 ? 0 : 8);
            }
        }
        KaomojiAdapter kaomojiAdapter3 = this.f2713d;
        if (kaomojiAdapter3 != null) {
            kaomojiAdapter3.b(kotlin.collections.g.n(hVar.d(), hVar.b()));
        }
    }
}
