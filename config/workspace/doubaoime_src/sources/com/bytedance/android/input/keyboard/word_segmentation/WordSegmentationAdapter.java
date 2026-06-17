package com.bytedance.android.input.keyboard.word_segmentation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.android.doubaoime.databinding.WordSegmentationImageItemBinding;
import com.bytedance.android.doubaoime.databinding.WordSegmentationTextItemBinding;
import com.bytedance.android.input.basic.IAppGlobals;
import com.google.android.flexbox.FlexboxLayoutManager;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class WordSegmentationAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private final ArrayList<j> a = new ArrayList<>();
    private com.bytedance.android.input.keyboard.word_segmentation.listener.b b;

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            WordSegmentationItemType.values();
            int[] iArr = new int[3];
            try {
                WordSegmentationItemType wordSegmentationItemType = WordSegmentationItemType.IMAGE;
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            a = iArr;
        }
    }

    private final void a(j jVar, WordSegmentationTextHolder wordSegmentationTextHolder) {
        if (jVar.e()) {
            wordSegmentationTextHolder.a().setBackground(ContextCompat.getDrawable(wordSegmentationTextHolder.a().getContext(), C0838R.drawable.bg_word_seg_item_selected));
            wordSegmentationTextHolder.a().setTextColor(ContextCompat.getColor(wordSegmentationTextHolder.a().getContext(), C0838R.color.ime_word_segmentation_item_selected_text_color));
        } else {
            wordSegmentationTextHolder.a().setBackground(ContextCompat.getDrawable(wordSegmentationTextHolder.a().getContext(), C0838R.drawable.bg_word_seg_item_unselect));
            wordSegmentationTextHolder.a().setTextColor(ContextCompat.getColor(wordSegmentationTextHolder.a().getContext(), C0838R.color.ime_word_segmentation_item_text_color));
        }
    }

    public static void b(int i, WordSegmentationTextHolder wordSegmentationTextHolder, WordSegmentationAdapter wordSegmentationAdapter, j jVar, View view) {
        kotlin.s.c.l.f(wordSegmentationTextHolder, "$holder");
        kotlin.s.c.l.f(wordSegmentationAdapter, "this$0");
        kotlin.s.c.l.f(jVar, "$itemData");
        if (i != wordSegmentationTextHolder.getAdapterPosition()) {
            return;
        }
        StringBuilder N = e.a.a.a.a.N("textItem click position = ", i, "---before.isSelected = ");
        N.append(jVar.e());
        IAppGlobals.a.j("WordSegmentationAdapter", N.toString());
        jVar.f(!jVar.e());
        wordSegmentationAdapter.a(jVar, wordSegmentationTextHolder);
        com.bytedance.android.input.keyboard.word_segmentation.listener.b bVar = wordSegmentationAdapter.b;
        if (bVar != null) {
            bVar.a(i, jVar);
        }
    }

    public static void c(int i, WordSegmentationImageHolder wordSegmentationImageHolder, WordSegmentationAdapter wordSegmentationAdapter, j jVar, View view) {
        com.bytedance.android.input.keyboard.word_segmentation.listener.b bVar;
        kotlin.s.c.l.f(wordSegmentationImageHolder, "$holder");
        kotlin.s.c.l.f(wordSegmentationAdapter, "this$0");
        kotlin.s.c.l.f(jVar, "$itemData");
        if (i == wordSegmentationImageHolder.getAdapterPosition() && (bVar = wordSegmentationAdapter.b) != null) {
            bVar.a(i, jVar);
        }
    }

    public final ArrayList<j> d() {
        return this.a;
    }

    public final void e(com.bytedance.android.input.keyboard.word_segmentation.listener.b bVar) {
        kotlin.s.c.l.f(bVar, "itemClickListener");
        this.b = bVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        j jVar = this.a.get(i);
        kotlin.s.c.l.e(jVar, "listData[position]");
        return jVar.a().getItemTypeValue();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, final int i) {
        kotlin.s.c.l.f(viewHolder, "holder");
        j jVar = this.a.get(i);
        kotlin.s.c.l.e(jVar, "listData[position]");
        final j jVar2 = jVar;
        if (!(viewHolder instanceof WordSegmentationTextHolder)) {
            if (viewHolder instanceof WordSegmentationImageHolder) {
                final WordSegmentationImageHolder wordSegmentationImageHolder = (WordSegmentationImageHolder) viewHolder;
                wordSegmentationImageHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.android.input.keyboard.word_segmentation.b
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        WordSegmentationAdapter.c(i, wordSegmentationImageHolder, this, jVar2, view);
                    }
                });
                return;
            }
            return;
        }
        final WordSegmentationTextHolder wordSegmentationTextHolder = (WordSegmentationTextHolder) viewHolder;
        ViewGroup.LayoutParams layoutParams = wordSegmentationTextHolder.itemView.getLayoutParams();
        FlexboxLayoutManager.LayoutParams layoutParams2 = layoutParams instanceof FlexboxLayoutManager.LayoutParams ? (FlexboxLayoutManager.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            layoutParams2.a(jVar2.d());
        }
        wordSegmentationTextHolder.a().setText(jVar2.c());
        a(jVar2, wordSegmentationTextHolder);
        wordSegmentationTextHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.android.input.keyboard.word_segmentation.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WordSegmentationAdapter.b(i, wordSegmentationTextHolder, this, jVar2, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        kotlin.s.c.l.f(viewGroup, "parent");
        if (a.a[WordSegmentationItemType.Companion.a(i).ordinal()] == 1) {
            WordSegmentationImageItemBinding b = WordSegmentationImageItemBinding.b(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            kotlin.s.c.l.e(b, "inflate(\n               …  false\n                )");
            return new WordSegmentationImageHolder(b);
        }
        WordSegmentationTextItemBinding b2 = WordSegmentationTextItemBinding.b(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        kotlin.s.c.l.e(b2, "inflate(\n               …  false\n                )");
        return new WordSegmentationTextHolder(b2);
    }
}
