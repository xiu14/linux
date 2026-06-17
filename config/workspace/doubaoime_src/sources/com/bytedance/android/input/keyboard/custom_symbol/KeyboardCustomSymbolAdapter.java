package com.bytedance.android.input.keyboard.custom_symbol;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.doubaoime.databinding.LayoutKeyboardCustomSymbolItemAddBinding;
import com.bytedance.android.doubaoime.databinding.LayoutKeyboardCustomSymbolItemTextBinding;
import java.util.ArrayList;
import java.util.Objects;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public final class KeyboardCustomSymbolAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private com.bytedance.android.input.keyboard.custom_symbol.i.a a;
    private final ArrayList<h> b = new ArrayList<>();

    public static void a(int i, KeyboardCustomSymbolAddViewHolder keyboardCustomSymbolAddViewHolder, KeyboardCustomSymbolAdapter keyboardCustomSymbolAdapter, h hVar, View view) {
        com.bytedance.android.input.keyboard.custom_symbol.i.a aVar;
        l.f(keyboardCustomSymbolAddViewHolder, "$holder");
        l.f(keyboardCustomSymbolAdapter, "this$0");
        l.f(hVar, "$itemData");
        if (i != keyboardCustomSymbolAddViewHolder.getAdapterPosition() || (aVar = keyboardCustomSymbolAdapter.a) == null) {
            return;
        }
        aVar.a(i, hVar);
    }

    public static void b(int i, KeyboardCustomSymbolTextViewHolder keyboardCustomSymbolTextViewHolder, KeyboardCustomSymbolAdapter keyboardCustomSymbolAdapter, h hVar, View view) {
        com.bytedance.android.input.keyboard.custom_symbol.i.a aVar;
        l.f(keyboardCustomSymbolTextViewHolder, "$holder");
        l.f(keyboardCustomSymbolAdapter, "this$0");
        l.f(hVar, "$itemData");
        if (i != keyboardCustomSymbolTextViewHolder.getAdapterPosition() || (aVar = keyboardCustomSymbolAdapter.a) == null) {
            return;
        }
        aVar.a(i, hVar);
    }

    public final void c(ArrayList<h> arrayList) {
        l.f(arrayList, "listData");
        this.b.clear();
        this.b.addAll(arrayList);
    }

    public final void d(com.bytedance.android.input.keyboard.custom_symbol.i.a aVar) {
        l.f(aVar, "onItemClickListener");
        this.a = aVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        h hVar = this.b.get(i);
        l.e(hVar, "listData[position]");
        return hVar.a().getItemTypeValue();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, final int i) {
        l.f(viewHolder, "holder");
        h hVar = this.b.get(i);
        l.e(hVar, "listData[position]");
        final h hVar2 = hVar;
        if (viewHolder instanceof KeyboardCustomSymbolTextViewHolder) {
            final KeyboardCustomSymbolTextViewHolder keyboardCustomSymbolTextViewHolder = (KeyboardCustomSymbolTextViewHolder) viewHolder;
            keyboardCustomSymbolTextViewHolder.a().setText(hVar2.b());
            keyboardCustomSymbolTextViewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.android.input.keyboard.custom_symbol.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    KeyboardCustomSymbolAdapter.b(i, keyboardCustomSymbolTextViewHolder, this, hVar2, view);
                }
            });
            keyboardCustomSymbolTextViewHolder.itemView.setOnTouchListener(new g(i, keyboardCustomSymbolTextViewHolder, this));
            return;
        }
        if (viewHolder instanceof KeyboardCustomSymbolAddViewHolder) {
            final KeyboardCustomSymbolAddViewHolder keyboardCustomSymbolAddViewHolder = (KeyboardCustomSymbolAddViewHolder) viewHolder;
            keyboardCustomSymbolAddViewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.android.input.keyboard.custom_symbol.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    KeyboardCustomSymbolAdapter.a(i, keyboardCustomSymbolAddViewHolder, this, hVar2, view);
                }
            });
            keyboardCustomSymbolAddViewHolder.itemView.setOnTouchListener(new g(i, keyboardCustomSymbolAddViewHolder, this));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        KeyboardCustomSymbolItemType keyboardCustomSymbolItemType;
        l.f(viewGroup, "parent");
        Objects.requireNonNull(KeyboardCustomSymbolItemType.Companion);
        KeyboardCustomSymbolItemType[] values = KeyboardCustomSymbolItemType.values();
        int i2 = 0;
        while (true) {
            if (i2 >= 2) {
                keyboardCustomSymbolItemType = null;
                break;
            }
            keyboardCustomSymbolItemType = values[i2];
            if (keyboardCustomSymbolItemType.getItemTypeValue() == i) {
                break;
            }
            i2++;
        }
        if (keyboardCustomSymbolItemType == null) {
            keyboardCustomSymbolItemType = KeyboardCustomSymbolItemType.TEXT;
        }
        int ordinal = keyboardCustomSymbolItemType.ordinal();
        if (ordinal == 0) {
            LayoutKeyboardCustomSymbolItemTextBinding b = LayoutKeyboardCustomSymbolItemTextBinding.b(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            l.e(b, "inflate(\n               …  false\n                )");
            return new KeyboardCustomSymbolTextViewHolder(b);
        }
        if (ordinal != 1) {
            throw new kotlin.f();
        }
        LayoutKeyboardCustomSymbolItemAddBinding b2 = LayoutKeyboardCustomSymbolItemAddBinding.b(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        l.e(b2, "inflate(\n               …  false\n                )");
        return new KeyboardCustomSymbolAddViewHolder(b2);
    }
}
