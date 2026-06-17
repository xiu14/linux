package com.bytedance.common_biz.ui.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.android.doubaoime.C0838R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.o;
import kotlin.s.b.l;
import kotlin.s.b.p;
import kotlin.s.c.m;

@SuppressLint({"Recycle"})
/* loaded from: classes.dex */
public final class ImeCheckBoxList extends LinearLayout {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f4343g = 0;
    private final List<ImeCheckBox> a;
    private final List<TextView> b;

    /* renamed from: c, reason: collision with root package name */
    private List<String> f4344c;

    /* renamed from: d, reason: collision with root package name */
    private a f4345d;

    /* renamed from: e, reason: collision with root package name */
    private int f4346e;

    /* renamed from: f, reason: collision with root package name */
    private int f4347f;

    public interface a {
        void a(int i, String str);
    }

    static final class b extends m implements l<View, o> {
        final /* synthetic */ int b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i) {
            super(1);
            this.b = i;
        }

        @Override // kotlin.s.b.l
        public o invoke(View view) {
            kotlin.s.c.l.f(view, "it");
            ImeCheckBoxList.this.setSelectedIndex(this.b);
            return o.a;
        }
    }

    public static final class c implements a {
        final /* synthetic */ p<Integer, String, o> a;

        /* JADX WARN: Multi-variable type inference failed */
        c(p<? super Integer, ? super String, o> pVar) {
            this.a = pVar;
        }

        @Override // com.bytedance.common_biz.ui.widget.ImeCheckBoxList.a
        public void a(int i, String str) {
            kotlin.s.c.l.f(str, "text");
            this.a.invoke(Integer.valueOf(i), str);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ImeCheckBoxList(Context context) {
        this(context, null, 0);
        kotlin.s.c.l.f(context, "context");
    }

    public final int a() {
        Iterator<ImeCheckBox> it2 = this.a.iterator();
        int i = 0;
        while (it2.hasNext()) {
            if (it2.next().isChecked()) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public final void b(int i) {
        if (i < 0 || i >= this.a.size() || a() == i) {
            return;
        }
        int i2 = 0;
        int i3 = 0;
        for (Object obj : this.a) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                kotlin.collections.g.b0();
                throw null;
            }
            ((ImeCheckBox) obj).setChecked(i3 == i);
            i3 = i4;
        }
        for (Object obj2 : this.b) {
            int i5 = i2 + 1;
            if (i2 < 0) {
                kotlin.collections.g.b0();
                throw null;
            }
            ((TextView) obj2).setTextColor(getResources().getColor(i2 == i ? this.f4347f : C0838R.color.ime_color_common_text_d9_color));
            i2 = i5;
        }
    }

    public final void setItems(List<String> list) {
        kotlin.s.c.l.f(list, "items");
        this.f4344c = list;
        removeAllViews();
        this.a.clear();
        final int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                kotlin.collections.g.b0();
                throw null;
            }
            View inflate = LayoutInflater.from(getContext()).inflate(this.f4346e, (ViewGroup) this, false);
            TextView textView = (TextView) inflate.findViewById(C0838R.id.item_text);
            ImeCheckBox imeCheckBox = (ImeCheckBox) inflate.findViewById(C0838R.id.item_checkbox);
            textView.setText((String) obj);
            List<ImeCheckBox> list2 = this.a;
            kotlin.s.c.l.e(imeCheckBox, "checkBox");
            list2.add(imeCheckBox);
            List<TextView> list3 = this.b;
            kotlin.s.c.l.e(textView, "textView");
            list3.add(textView);
            kotlin.s.c.l.e(inflate, "itemView");
            e.b.d.a.a.e.g(inflate, new b(i));
            imeCheckBox.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.common_biz.ui.widget.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ImeCheckBoxList imeCheckBoxList = ImeCheckBoxList.this;
                    int i3 = i;
                    int i4 = ImeCheckBoxList.f4343g;
                    kotlin.s.c.l.f(imeCheckBoxList, "this$0");
                    imeCheckBoxList.setSelectedIndex(i3);
                }
            });
            addView(inflate);
            if (i > 0) {
                ViewGroup.LayoutParams layoutParams = inflate.getLayoutParams();
                kotlin.s.c.l.d(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.topMargin = getResources().getDimensionPixelSize(C0838R.dimen.ime_dp_21);
                inflate.setLayoutParams(marginLayoutParams);
            }
            i = i2;
        }
    }

    public final void setOnSelectionChangedListener(a aVar) {
        this.f4345d = aVar;
    }

    public final void setSelectedIndex(int i) {
        if (i < 0 || i >= this.a.size() || a() == i) {
            return;
        }
        int i2 = 0;
        int i3 = 0;
        for (Object obj : this.a) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                kotlin.collections.g.b0();
                throw null;
            }
            ((ImeCheckBox) obj).setChecked(i3 == i);
            i3 = i4;
        }
        for (Object obj2 : this.b) {
            int i5 = i2 + 1;
            if (i2 < 0) {
                kotlin.collections.g.b0();
                throw null;
            }
            ((TextView) obj2).setTextColor(getResources().getColor(i2 == i ? this.f4347f : C0838R.color.ime_color_common_text_d9_color));
            i2 = i5;
        }
        a aVar = this.f4345d;
        if (aVar != null) {
            aVar.a(i, this.f4344c.get(i));
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ImeCheckBoxList(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.s.c.l.f(context, "context");
    }

    public final void setOnSelectionChangedListener(p<? super Integer, ? super String, o> pVar) {
        kotlin.s.c.l.f(pVar, "listener");
        this.f4345d = new c(pVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImeCheckBoxList(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.s.c.l.f(context, "context");
        this.a = new ArrayList();
        this.b = new ArrayList();
        this.f4344c = kotlin.collections.l.a;
        this.f4346e = C0838R.layout.ime_checkbox_list_item;
        this.f4347f = C0838R.color.ime_color_common_text_d9_color;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.bytedance.android.input.k.b.b.f2456d);
        kotlin.s.c.l.e(obtainStyledAttributes, "context.obtainStyledAttr…tyleable.ImeCheckBoxList)");
        this.f4346e = obtainStyledAttributes.getResourceId(0, C0838R.layout.ime_checkbox_list_item);
        this.f4347f = obtainStyledAttributes.getResourceId(1, C0838R.color.ime_color_common_text_d9_color);
        setOrientation(1);
    }
}
