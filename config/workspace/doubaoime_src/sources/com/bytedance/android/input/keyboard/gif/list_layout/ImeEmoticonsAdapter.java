package com.bytedance.android.input.keyboard.gif.list_layout;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.android.doubaoime.databinding.EmoticonsEmptyItemBinding;
import com.bytedance.android.doubaoime.databinding.EmoticonsGifItemBinding;
import com.bytedance.android.doubaoime.databinding.EmoticonsImageItemBinding;
import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.android.input.keyboard.aiwrite.C0603x;
import com.bytedance.android.input.keyboard.gif.list_layout.models.ImeImageState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class ImeEmoticonsAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private final ArrayList<com.bytedance.android.input.keyboard.gif.list_layout.models.b> a = new ArrayList<>();
    private RecyclerView b;

    /* renamed from: c, reason: collision with root package name */
    private kotlin.s.b.p<? super Integer, ? super com.bytedance.android.input.keyboard.gif.list_layout.models.b, kotlin.o> f2728c;

    /* renamed from: d, reason: collision with root package name */
    private long f2729d;

    /* renamed from: e, reason: collision with root package name */
    private C0603x f2730e;

    static final class a extends kotlin.s.c.m implements kotlin.s.b.a<kotlin.o> {
        public static final a a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.s.b.a
        public kotlin.o invoke() {
            return kotlin.o.a;
        }
    }

    private final void a(View view) {
        int i;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            int width = recyclerView.getWidth();
            int paddingEnd = recyclerView.getPaddingEnd() + recyclerView.getPaddingStart();
            ViewGroup.LayoutParams layoutParams2 = recyclerView.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
            if (marginLayoutParams != null) {
                marginLayoutParams.getMarginStart();
                marginLayoutParams.getMarginEnd();
            }
            RecyclerView recyclerView2 = this.b;
            Object layoutManager = recyclerView2 != null ? recyclerView2.getLayoutManager() : null;
            GridLayoutManager gridLayoutManager = layoutManager instanceof GridLayoutManager ? (GridLayoutManager) layoutManager : null;
            int max = Math.max(gridLayoutManager != null ? gridLayoutManager.getSpanCount() : 1, 1);
            int i2 = width - paddingEnd;
            ImeEmoticonsLayout imeEmoticonsLayout = ImeEmoticonsLayout.i;
            i = ImeEmoticonsLayout.j;
            int i3 = (i2 - ((max - 1) * i)) / max;
            layoutParams.width = i3;
            layoutParams.height = i3;
            view.setLayoutParams(layoutParams);
        }
    }

    private final void b(int i, int i2, com.bytedance.android.input.keyboard.gif.list_layout.models.b bVar) {
        if (i != i2) {
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - this.f2729d < 500) {
            com.bytedance.android.input.r.j.i("ImeEmoticons-Adapter", "handleItemClick click fast");
            return;
        }
        this.f2729d = elapsedRealtime;
        if (bVar.a() == ImeImageState.LOADING || bVar.a() == null) {
            StringBuilder M = e.a.a.a.a.M("handleItemClick itemData.imageState = ");
            M.append(bVar.a());
            M.append("---position = ");
            M.append(i);
            com.bytedance.android.input.r.j.i("ImeEmoticons-Adapter", M.toString());
            return;
        }
        if (bVar.a() == ImeImageState.FAILED) {
            e.a.a.a.a.j0("handleItemClick imageState is = FAILED position = ", i, "ImeEmoticons-Adapter");
            String string = IAppGlobals.a.getContext().getString(C0838R.string.emoticons_image_load_failed);
            kotlin.s.c.l.e(string, "IAppGlobals.context.getS…ticons_image_load_failed)");
            j(string);
            return;
        }
        kotlin.s.b.p<? super Integer, ? super com.bytedance.android.input.keyboard.gif.list_layout.models.b, kotlin.o> pVar = this.f2728c;
        if (pVar != null) {
            pVar.invoke(Integer.valueOf(i), bVar);
        }
    }

    public static void e(ImeEmoticonsAdapter imeEmoticonsAdapter, int i, ImageViewHolder imageViewHolder, com.bytedance.android.input.keyboard.gif.list_layout.models.b bVar, View view) {
        kotlin.s.c.l.f(imeEmoticonsAdapter, "this$0");
        kotlin.s.c.l.f(imageViewHolder, "$holder");
        kotlin.s.c.l.f(bVar, "$itemData");
        imeEmoticonsAdapter.b(i, imageViewHolder.getAdapterPosition(), bVar);
    }

    public static void f(ImeEmoticonsAdapter imeEmoticonsAdapter, int i, GifViewHolder gifViewHolder, com.bytedance.android.input.keyboard.gif.list_layout.models.b bVar, View view) {
        kotlin.s.c.l.f(imeEmoticonsAdapter, "this$0");
        kotlin.s.c.l.f(gifViewHolder, "$holder");
        kotlin.s.c.l.f(bVar, "$itemData");
        imeEmoticonsAdapter.b(i, gifViewHolder.getAdapterPosition(), bVar);
    }

    public final void c() {
        C0603x c0603x = this.f2730e;
        if (c0603x != null) {
            c0603x.a();
        }
        this.f2730e = null;
    }

    public final boolean d() {
        if (getItemCount() == 0) {
            return true;
        }
        Iterator<com.bytedance.android.input.keyboard.gif.list_layout.models.b> it2 = this.a.iterator();
        while (it2.hasNext()) {
            if (it2.next().d()) {
                return true;
            }
        }
        return false;
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void g(List<com.bytedance.android.input.keyboard.gif.list_layout.models.b> list) {
        kotlin.s.c.l.f(list, "list");
        this.a.clear();
        this.a.addAll(list);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        com.bytedance.android.input.keyboard.gif.list_layout.models.b bVar = this.a.get(i);
        kotlin.s.c.l.e(bVar, "items[position]");
        com.bytedance.android.input.keyboard.gif.list_layout.models.b bVar2 = bVar;
        if (bVar2.d()) {
            return 3;
        }
        int ordinal = bVar2.b().ordinal();
        if (ordinal == 0) {
            return 2;
        }
        if (ordinal == 1) {
            return 1;
        }
        throw new kotlin.f();
    }

    public final void h(kotlin.s.b.p<? super Integer, ? super com.bytedance.android.input.keyboard.gif.list_layout.models.b, kotlin.o> pVar) {
        kotlin.s.c.l.f(pVar, "onItemClickListener");
        this.f2728c = pVar;
    }

    public final void i(RecyclerView recyclerView) {
        this.b = recyclerView;
    }

    public final void j(String str) {
        kotlin.s.c.l.f(str, "msg");
        C0603x c0603x = new C0603x(str, a.a);
        C0603x.d(c0603x, -1, 17, 0, 0, 0, 0L, 60);
        this.f2730e = c0603x;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, final int i) {
        kotlin.s.c.l.f(viewHolder, "holder");
        com.bytedance.android.input.keyboard.gif.list_layout.models.b bVar = this.a.get(i);
        kotlin.s.c.l.e(bVar, "items[position]");
        final com.bytedance.android.input.keyboard.gif.list_layout.models.b bVar2 = bVar;
        if (viewHolder instanceof GifViewHolder) {
            final GifViewHolder gifViewHolder = (GifViewHolder) viewHolder;
            ImageView imageView = gifViewHolder.a().b;
            kotlin.s.c.l.e(imageView, "holder.binding.emoticonsGifItem");
            View view = gifViewHolder.itemView;
            kotlin.s.c.l.e(view, "holder.itemView");
            a(view);
            Context context = gifViewHolder.itemView.getContext();
            kotlin.s.c.l.e(context, "holder.itemView.context");
            com.bytedance.android.input.basic.image.j.a(new com.bytedance.android.input.basic.image.i(context, bVar2.c(), imageView, 0, 0, (int) e.a.a.a.a.m("Resources.getSystem()", 1, 8), gifViewHolder.itemView.getWidth(), gifViewHolder.itemView.getHeight(), false, new h(gifViewHolder, i, bVar2), new i(gifViewHolder, i, bVar2), 280));
            gifViewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.android.input.keyboard.gif.list_layout.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    ImeEmoticonsAdapter.f(ImeEmoticonsAdapter.this, i, gifViewHolder, bVar2, view2);
                }
            });
            return;
        }
        if (!(viewHolder instanceof ImageViewHolder)) {
            if (viewHolder instanceof EmoticonsEmptyItemViewHolder) {
                View view2 = ((EmoticonsEmptyItemViewHolder) viewHolder).itemView;
                kotlin.s.c.l.e(view2, "holder.itemView");
                a(view2);
                return;
            }
            return;
        }
        final ImageViewHolder imageViewHolder = (ImageViewHolder) viewHolder;
        ImageView imageView2 = imageViewHolder.a().b;
        kotlin.s.c.l.e(imageView2, "holder.binding.emoticonsImageItem");
        View view3 = imageViewHolder.itemView;
        kotlin.s.c.l.e(view3, "holder.itemView");
        a(view3);
        Context context2 = imageViewHolder.itemView.getContext();
        kotlin.s.c.l.e(context2, "holder.itemView.context");
        com.bytedance.android.input.basic.image.j.a(new com.bytedance.android.input.basic.image.i(context2, bVar2.c(), imageView2, 0, 0, (int) e.a.a.a.a.m("Resources.getSystem()", 1, 8), imageViewHolder.itemView.getWidth(), imageViewHolder.itemView.getHeight(), false, new j(imageViewHolder, i, bVar2), new k(imageViewHolder, i, bVar2), 280));
        imageViewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.android.input.keyboard.gif.list_layout.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                ImeEmoticonsAdapter.e(ImeEmoticonsAdapter.this, i, imageViewHolder, bVar2, view4);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        kotlin.s.c.l.f(viewGroup, "parent");
        if (i == 1) {
            kotlin.s.c.l.f(viewGroup, "parent");
            EmoticonsGifItemBinding b = EmoticonsGifItemBinding.b(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            kotlin.s.c.l.e(b, "inflate(LayoutInflater.f….context), parent, false)");
            return new GifViewHolder(b);
        }
        if (i != 2) {
            kotlin.s.c.l.f(viewGroup, "parent");
            EmoticonsEmptyItemBinding b2 = EmoticonsEmptyItemBinding.b(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            kotlin.s.c.l.e(b2, "inflate(\n               …  false\n                )");
            return new EmoticonsEmptyItemViewHolder(b2);
        }
        kotlin.s.c.l.f(viewGroup, "parent");
        EmoticonsImageItemBinding b3 = EmoticonsImageItemBinding.b(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        kotlin.s.c.l.e(b3, "inflate(\n               …  false\n                )");
        return new ImageViewHolder(b3);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        kotlin.s.c.l.f(viewHolder, "holder");
        super.onViewAttachedToWindow(viewHolder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        kotlin.s.c.l.f(viewHolder, "holder");
        super.onViewDetachedFromWindow(viewHolder);
    }
}
