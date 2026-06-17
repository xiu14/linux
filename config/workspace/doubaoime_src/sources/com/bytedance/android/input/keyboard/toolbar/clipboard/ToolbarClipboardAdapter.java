package com.bytedance.android.input.keyboard.toolbar.clipboard;

import android.text.TextPaint;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.doubaoime.databinding.LayoutToolbarClipboardOriginTextItemBinding;
import com.bytedance.android.doubaoime.databinding.LayoutToolbarClipboardPreviewItemBinding;
import com.bytedance.android.input.r.j;
import com.prolificinteractive.materialcalendarview.r;
import java.util.ArrayList;
import kotlin.o;
import kotlin.s.b.p;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public final class ToolbarClipboardAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private final ArrayList<f> a = new ArrayList<>();
    private p<? super Integer, ? super f, o> b;

    public static void a(int i, ToolbarClipboardPreviewVH toolbarClipboardPreviewVH, ToolbarClipboardAdapter toolbarClipboardAdapter, f fVar, View view) {
        p<? super Integer, ? super f, o> pVar;
        l.f(toolbarClipboardPreviewVH, "$holder");
        l.f(toolbarClipboardAdapter, "this$0");
        l.f(fVar, "$itemData");
        if (i == toolbarClipboardPreviewVH.getAdapterPosition() && (pVar = toolbarClipboardAdapter.b) != null) {
            pVar.invoke(Integer.valueOf(i), fVar);
        }
    }

    public static void b(int i, ToolbarClipboardOriginTextVH toolbarClipboardOriginTextVH, ToolbarClipboardAdapter toolbarClipboardAdapter, f fVar, View view) {
        p<? super Integer, ? super f, o> pVar;
        l.f(toolbarClipboardOriginTextVH, "$holder");
        l.f(toolbarClipboardAdapter, "this$0");
        l.f(fVar, "$itemData");
        if (i == toolbarClipboardOriginTextVH.getAdapterPosition() && (pVar = toolbarClipboardAdapter.b) != null) {
            pVar.invoke(Integer.valueOf(i), fVar);
        }
    }

    public final void c(ArrayList<f> arrayList) {
        l.f(arrayList, "listData");
        j.i("ToolbarClipboardAdapter", "[WordSegmentationLayoutNew] refreshData listData.size = " + arrayList.size());
        this.a.clear();
        this.a.addAll(arrayList);
    }

    public final void d(p<? super Integer, ? super f, o> pVar) {
        this.b = pVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        f fVar = this.a.get(i);
        l.e(fVar, "listData[position]");
        return fVar.b() ? 1 : 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, final int i) {
        l.f(viewHolder, "holder");
        f fVar = this.a.get(i);
        l.e(fVar, "listData[position]");
        final f fVar2 = fVar;
        if (viewHolder instanceof ToolbarClipboardPreviewVH) {
            final ToolbarClipboardPreviewVH toolbarClipboardPreviewVH = (ToolbarClipboardPreviewVH) viewHolder;
            toolbarClipboardPreviewVH.a();
            toolbarClipboardPreviewVH.b().b.setText(fVar2.a());
            toolbarClipboardPreviewVH.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.android.input.keyboard.toolbar.clipboard.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ToolbarClipboardAdapter.a(i, toolbarClipboardPreviewVH, this, fVar2, view);
                }
            });
            return;
        }
        if (viewHolder instanceof ToolbarClipboardOriginTextVH) {
            final ToolbarClipboardOriginTextVH toolbarClipboardOriginTextVH = (ToolbarClipboardOriginTextVH) viewHolder;
            toolbarClipboardOriginTextVH.a();
            final TextView textView = toolbarClipboardOriginTextVH.b().b;
            l.e(textView, "holder.mBinding.tvClipboardOriginTextItem");
            textView.setText(fVar2.a());
            if (this.a.size() == 1) {
                textView.setMaxWidth(Math.min(toolbarClipboardOriginTextVH.itemView.getResources().getDisplayMetrics().widthPixels, toolbarClipboardOriginTextVH.itemView.getResources().getDisplayMetrics().heightPixels));
                textView.getLayoutParams().width = -2;
            }
            textView.post(new Runnable() { // from class: com.bytedance.android.input.keyboard.toolbar.clipboard.b
                @Override // java.lang.Runnable
                public final void run() {
                    Object J2;
                    float width;
                    int i2 = i;
                    ToolbarClipboardOriginTextVH toolbarClipboardOriginTextVH2 = toolbarClipboardOriginTextVH;
                    ToolbarClipboardAdapter toolbarClipboardAdapter = this;
                    TextView textView2 = textView;
                    f fVar3 = fVar2;
                    l.f(toolbarClipboardOriginTextVH2, "$holder");
                    l.f(toolbarClipboardAdapter, "this$0");
                    l.f(textView2, "$tv");
                    l.f(fVar3, "$itemData");
                    if (i2 != toolbarClipboardOriginTextVH2.getAdapterPosition()) {
                        return;
                    }
                    String a = fVar3.a();
                    try {
                        width = (textView2.getWidth() - textView2.getPaddingLeft()) - textView2.getPaddingRight();
                    } catch (Throwable th) {
                        J2 = r.J(th);
                    }
                    if (width <= 0.0f) {
                        return;
                    }
                    TextPaint paint = textView2.getPaint();
                    CharSequence ellipsize = TextUtils.ellipsize(a, paint, width, TextUtils.TruncateAt.END);
                    String obj = ellipsize.toString();
                    if (!kotlin.text.a.g(obj, "…", false, 2, null)) {
                        if (l.a(ellipsize, textView2.getText())) {
                            return;
                        }
                        textView2.setText(ellipsize);
                        return;
                    }
                    String e2 = kotlin.text.a.e(obj, 1);
                    String str = e2 + "...";
                    while (true) {
                        if (!(e2.length() > 0) || paint.measureText(str) <= width) {
                            break;
                        }
                        e2 = kotlin.text.a.e(e2, 1);
                        str = e2 + "...";
                    }
                    if (!l.a(str, textView2.getText().toString())) {
                        textView2.setText(str);
                    }
                    J2 = o.a;
                    Throwable b = kotlin.h.b(J2);
                    if (b != null) {
                        j.i("ToolbarClipboardAdapter", "applyEndEllipsizeWithThreeDots error = " + b);
                    }
                }
            });
            toolbarClipboardOriginTextVH.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.android.input.keyboard.toolbar.clipboard.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ToolbarClipboardAdapter.b(i, toolbarClipboardOriginTextVH, this, fVar2, view);
                }
            });
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder toolbarClipboardOriginTextVH;
        l.f(viewGroup, "parent");
        try {
            if (i == 0) {
                LayoutToolbarClipboardPreviewItemBinding b = LayoutToolbarClipboardPreviewItemBinding.b(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
                l.e(b, "inflate(\n               …  false\n                )");
                toolbarClipboardOriginTextVH = new ToolbarClipboardPreviewVH(b);
            } else {
                LayoutToolbarClipboardOriginTextItemBinding b2 = LayoutToolbarClipboardOriginTextItemBinding.b(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
                l.e(b2, "inflate(\n               …  false\n                )");
                toolbarClipboardOriginTextVH = new ToolbarClipboardOriginTextVH(b2);
            }
            return toolbarClipboardOriginTextVH;
        } catch (Throwable th) {
            r.J(th);
            final View view = new View(viewGroup.getContext());
            view.setLayoutParams(new ViewGroup.LayoutParams(0, 0));
            return new RecyclerView.ViewHolder(view) { // from class: com.bytedance.android.input.keyboard.toolbar.clipboard.ToolbarClipboardAdapter$onCreateViewHolder$2
            };
        }
    }
}
