package com.bytedance.android.input.keyboard.word_segmentation;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.android.doubaoime.databinding.WordSegmentationTextItemBinding;
import com.bytedance.android.input.fragment.custom_symbol.ui.SymbolTextView;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class WordSegmentationAdapterNew extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private final ArrayList<j> a = new ArrayList<>();

    public static final class WordSegmentationSpaceHolder extends RecyclerView.ViewHolder {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WordSegmentationSpaceHolder(View view) {
            super(view);
            kotlin.s.c.l.f(view, "view");
        }
    }

    public static final class WordSegmentationTextHolder extends RecyclerView.ViewHolder {
        private final WordSegmentationTextItemBinding a;
        private final SymbolTextView b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WordSegmentationTextHolder(WordSegmentationTextItemBinding wordSegmentationTextItemBinding) {
            super(wordSegmentationTextItemBinding.a());
            kotlin.s.c.l.f(wordSegmentationTextItemBinding, "binding");
            this.a = wordSegmentationTextItemBinding;
            SymbolTextView symbolTextView = wordSegmentationTextItemBinding.b;
            kotlin.s.c.l.e(symbolTextView, "binding.wordSegmentationTextItem");
            this.b = symbolTextView;
        }

        public final SymbolTextView a() {
            return this.b;
        }
    }

    public final ArrayList<j> a() {
        return this.a;
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void b(ArrayList<j> arrayList) {
        kotlin.s.c.l.f(arrayList, RemoteMessageConst.DATA);
        com.bytedance.android.input.r.j.i("WordSegmentationLayoutNew", "refreshData");
        int size = this.a.size();
        this.a.clear();
        this.a.addAll(arrayList);
        if (size == 0) {
            notifyItemRangeInserted(0, arrayList.size());
        } else {
            notifyDataSetChanged();
        }
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
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        kotlin.s.c.l.f(viewHolder, "holder");
        j jVar = this.a.get(i);
        kotlin.s.c.l.e(jVar, "listData[position]");
        j jVar2 = jVar;
        if (!(viewHolder instanceof WordSegmentationTextHolder)) {
            if (viewHolder instanceof WordSegmentationSpaceHolder) {
                ViewGroup.LayoutParams layoutParams = viewHolder.itemView.getLayoutParams();
                kotlin.s.c.l.d(layoutParams, "null cannot be cast to non-null type com.google.android.flexbox.FlexboxLayoutManager.LayoutParams");
                FlexboxLayoutManager.LayoutParams layoutParams2 = (FlexboxLayoutManager.LayoutParams) layoutParams;
                layoutParams2.a(true);
                viewHolder.itemView.setLayoutParams(layoutParams2);
                return;
            }
            return;
        }
        WordSegmentationTextHolder wordSegmentationTextHolder = (WordSegmentationTextHolder) viewHolder;
        ViewGroup.LayoutParams layoutParams3 = wordSegmentationTextHolder.itemView.getLayoutParams();
        kotlin.s.c.l.d(layoutParams3, "null cannot be cast to non-null type com.google.android.flexbox.FlexboxLayoutManager.LayoutParams");
        FlexboxLayoutManager.LayoutParams layoutParams4 = (FlexboxLayoutManager.LayoutParams) layoutParams3;
        layoutParams4.a(jVar2.d());
        wordSegmentationTextHolder.itemView.setLayoutParams(layoutParams4);
        wordSegmentationTextHolder.a().setText(jVar2.c());
        com.bytedance.android.input.r.j.i("WordSegmentationLayoutNew", "handleTextItemStyle itemData index = " + jVar2.b() + " isSelected = " + jVar2.e() + " text = " + jVar2.c());
        if (jVar2.e()) {
            wordSegmentationTextHolder.a().setBackground(ContextCompat.getDrawable(wordSegmentationTextHolder.a().getContext(), C0838R.drawable.bg_word_seg_item_selected));
            wordSegmentationTextHolder.a().setTextColor(ContextCompat.getColor(wordSegmentationTextHolder.a().getContext(), C0838R.color.ime_word_segmentation_item_selected_text_color));
        } else {
            wordSegmentationTextHolder.a().setBackground(ContextCompat.getDrawable(wordSegmentationTextHolder.a().getContext(), C0838R.drawable.bg_word_seg_item_unselect));
            wordSegmentationTextHolder.a().setTextColor(ContextCompat.getColor(wordSegmentationTextHolder.a().getContext(), C0838R.color.ime_word_segmentation_item_text_color));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        kotlin.s.c.l.f(viewGroup, "parent");
        int ordinal = WordSegmentationItemType.Companion.a(i).ordinal();
        if (ordinal == 0) {
            WordSegmentationTextItemBinding b = WordSegmentationTextItemBinding.b(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            kotlin.s.c.l.e(b, "inflate(\n               …  false\n                )");
            return new WordSegmentationTextHolder(b);
        }
        if (ordinal == 1) {
            WordSegmentationTextItemBinding b2 = WordSegmentationTextItemBinding.b(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            kotlin.s.c.l.e(b2, "inflate(\n               …  false\n                )");
            return new WordSegmentationTextHolder(b2);
        }
        if (ordinal != 2) {
            throw new kotlin.f();
        }
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0838R.layout.word_segmentation_space_item, viewGroup, false);
        kotlin.s.c.l.e(inflate, "view");
        return new WordSegmentationSpaceHolder(inflate);
    }
}
