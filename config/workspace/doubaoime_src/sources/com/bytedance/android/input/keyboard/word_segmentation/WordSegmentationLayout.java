package com.bytedance.android.input.keyboard.word_segmentation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.android.doubaoime.databinding.LayoutWordSegmentationBinding;
import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.android.input.keyboard.ImeKeyboardTitleBar;
import com.google.android.flexbox.FlexboxLayoutManager;
import java.util.ArrayList;
import java.util.Objects;

/* loaded from: classes.dex */
public final class WordSegmentationLayout extends FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f2811d = 0;
    private LayoutWordSegmentationBinding a;
    private WordSegmentationAdapter b;

    /* renamed from: c, reason: collision with root package name */
    private com.bytedance.android.input.keyboard.word_segmentation.o.a f2812c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WordSegmentationLayout(Context context) {
        this(context, null);
        kotlin.s.c.l.f(context, "context");
    }

    public static final void a(WordSegmentationLayout wordSegmentationLayout) {
        ArrayList<j> d2;
        Objects.requireNonNull(wordSegmentationLayout);
        ArrayList<Integer> arrayList = new ArrayList<>();
        WordSegmentationAdapter wordSegmentationAdapter = wordSegmentationLayout.b;
        if (wordSegmentationAdapter != null && (d2 = wordSegmentationAdapter.d()) != null) {
            for (j jVar : d2) {
                if (jVar.e() && jVar.b() >= 0) {
                    arrayList.add(Integer.valueOf(jVar.b()));
                }
            }
        }
        com.bytedance.android.input.keyboard.word_segmentation.data.f.a.f("", arrayList, false, new k(wordSegmentationLayout));
    }

    public static final void d(WordSegmentationLayout wordSegmentationLayout, String str) {
        Objects.requireNonNull(wordSegmentationLayout);
        IAppGlobals.a.j("WordSegmentationLayout", str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WordSegmentationLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        RecyclerView recyclerView;
        ImeKeyboardTitleBar imeKeyboardTitleBar;
        ImeKeyboardTitleBar imeKeyboardTitleBar2;
        kotlin.s.c.l.f(context, "context");
        this.f2812c = new com.bytedance.android.input.keyboard.word_segmentation.o.d();
        LayoutWordSegmentationBinding b = LayoutWordSegmentationBinding.b(LayoutInflater.from(context), this, true);
        this.a = b;
        if (b != null && (imeKeyboardTitleBar2 = b.f2016d) != null) {
            String string = getContext().getString(C0838R.string.word_segmentation_title);
            kotlin.s.c.l.e(string, "context.getString(R.stri….word_segmentation_title)");
            imeKeyboardTitleBar2.b(string);
        }
        LayoutWordSegmentationBinding layoutWordSegmentationBinding = this.a;
        if (layoutWordSegmentationBinding != null && (imeKeyboardTitleBar = layoutWordSegmentationBinding.f2016d) != null) {
            imeKeyboardTitleBar.a(new View.OnClickListener() { // from class: com.bytedance.android.input.keyboard.word_segmentation.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i = WordSegmentationLayout.f2811d;
                    com.bytedance.android.input.r.j.i("WordSegmentationLayout", "click wordSegmentationTitleBar back");
                    n.a();
                }
            });
        }
        LayoutWordSegmentationBinding layoutWordSegmentationBinding2 = this.a;
        if (layoutWordSegmentationBinding2 == null || (recyclerView = layoutWordSegmentationBinding2.f2015c) == null) {
            return;
        }
        FlexboxLayoutManager flexboxLayoutManager = new FlexboxLayoutManager(getContext());
        flexboxLayoutManager.O(0);
        flexboxLayoutManager.P(1);
        flexboxLayoutManager.Q(0);
        recyclerView.setLayoutManager(flexboxLayoutManager);
        recyclerView.addOnItemTouchListener(new ItemDragSelectImpl(new l(this)));
        WordSegmentationAdapter wordSegmentationAdapter = new WordSegmentationAdapter();
        this.b = wordSegmentationAdapter;
        wordSegmentationAdapter.e(new m(this));
        recyclerView.setAdapter(this.b);
    }
}
