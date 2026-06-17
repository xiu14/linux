package com.obric.oui.filterpanel;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.doubaoime.C0838R;
import com.obric.oui.filter.OFilter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.collections.g;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
public final class OFilterGroupView extends ConstraintLayout {
    public static final /* synthetic */ int m = 0;
    private final String a;
    private final TextView b;

    /* renamed from: c, reason: collision with root package name */
    private final TextView f7738c;

    /* renamed from: d, reason: collision with root package name */
    private final GridLayout f7739d;

    /* renamed from: e, reason: collision with root package name */
    private int f7740e;

    /* renamed from: f, reason: collision with root package name */
    private int f7741f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f7742g;
    private final List<CharSequence> h;
    private final List<CharSequence> i;
    private final List<OFilter> j;
    private int k;
    private boolean l;

    static final class a implements View.OnClickListener {
        final /* synthetic */ Context b;

        a(Context context) {
            this.b = context;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            OFilterGroupView.this.q().removeAllViews();
            if (OFilterGroupView.this.f7742g) {
                TextView textView = OFilterGroupView.this.f7738c;
                if (textView != null) {
                    textView.setText(this.b.getResources().getString(C0838R.string.oui_show_more));
                }
                OFilterGroupView oFilterGroupView = OFilterGroupView.this;
                oFilterGroupView.p(oFilterGroupView.h, OFilterGroupView.this.f7741f);
                OFilterGroupView.this.f7742g = false;
                return;
            }
            TextView textView2 = OFilterGroupView.this.f7738c;
            if (textView2 != null) {
                textView2.setText(this.b.getResources().getString(C0838R.string.oui_show_less));
            }
            OFilterGroupView oFilterGroupView2 = OFilterGroupView.this;
            oFilterGroupView2.p(oFilterGroupView2.i, OFilterGroupView.this.f7741f);
            OFilterGroupView.this.f7742g = true;
        }
    }

    public static final class b implements OFilter.a {
        b(int i) {
        }

        @Override // com.obric.oui.filter.OFilter.a
        public void a(OFilter oFilter, boolean z) {
            l.f(oFilter, "filter");
            if (z) {
                OFilterGroupView oFilterGroupView = OFilterGroupView.this;
                int i = OFilterGroupView.m;
                Objects.requireNonNull(oFilterGroupView);
            } else {
                OFilterGroupView oFilterGroupView2 = OFilterGroupView.this;
                int i2 = OFilterGroupView.m;
                Objects.requireNonNull(oFilterGroupView2);
            }
        }
    }

    static final class c implements View.OnClickListener {
        final /* synthetic */ OFilter a;
        final /* synthetic */ OFilterGroupView b;

        c(OFilter oFilter, OFilterGroupView oFilterGroupView, int i) {
            this.a = oFilter;
            this.b = oFilterGroupView;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            l.e(view, "it");
            if (!view.isSelected() || (this.b.f7740e == 1 && !this.b.l)) {
                this.b.r((OFilter) view);
            } else {
                this.a.setSelected(false);
            }
            OFilterGroupView oFilterGroupView = this.b;
            int i = OFilterGroupView.m;
            Objects.requireNonNull(oFilterGroupView);
        }
    }

    public OFilterGroupView(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p(List<? extends CharSequence> list, int i) {
        this.j.clear();
        int i2 = 0;
        for (Object obj : list) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                g.b0();
                throw null;
            }
            GridLayout.LayoutParams layoutParams = new GridLayout.LayoutParams();
            layoutParams.height = -2;
            layoutParams.width = 0;
            layoutParams.rightMargin = e.a.a.a.a.e0("Resources.getSystem()", 1, 8);
            layoutParams.topMargin = e.a.a.a.a.e0("Resources.getSystem()", 1, 5);
            layoutParams.setGravity(17);
            layoutParams.columnSpec = GridLayout.spec(i2 % i, 1.0f);
            layoutParams.rowSpec = GridLayout.spec(i2 / i, 1.0f);
            Context context = getContext();
            l.e(context, "context");
            OFilter oFilter = new OFilter(context, null, 0, true, 6);
            oFilter.setText((CharSequence) obj);
            oFilter.setStyle(this.k, true);
            oFilter.setSelectChangeListener(new b(i));
            oFilter.setOnClickListener(new c(oFilter, this, i));
            this.j.add(oFilter);
            this.f7739d.addView(oFilter, layoutParams);
            i2 = i3;
        }
    }

    public static /* synthetic */ void setFilterItems$default(OFilterGroupView oFilterGroupView, List list, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 3;
        }
        if ((i3 & 4) != 0) {
            i2 = Integer.MAX_VALUE;
        }
        oFilterGroupView.setFilterItems(list, i, i2);
    }

    public static /* synthetic */ void setFilterStyle$default(OFilterGroupView oFilterGroupView, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = true;
        }
        oFilterGroupView.setFilterStyle(i, z);
    }

    public final GridLayout q() {
        return this.f7739d;
    }

    public final void r(OFilter oFilter) {
        int i;
        l.f(oFilter, "filter");
        if (oFilter.isSelected()) {
            return;
        }
        List<OFilter> list = this.j;
        if ((list instanceof Collection) && list.isEmpty()) {
            i = 0;
        } else {
            Iterator<T> it2 = list.iterator();
            i = 0;
            while (it2.hasNext()) {
                if (((OFilter) it2.next()).isSelected() && (i = i + 1) < 0) {
                    g.a0();
                    throw null;
                }
            }
        }
        if (i >= this.f7740e) {
            Log.d(this.a, "unSelectAll() called");
            for (OFilter oFilter2 : this.j) {
                if (oFilter2.isSelected()) {
                    oFilter2.setSelected(false);
                }
            }
        }
        oFilter.setSelected(true);
    }

    public final void setEnableClickWhenSelected(boolean z) {
        this.l = z;
    }

    public final void setFilterItems(List<? extends CharSequence> list, int i, int i2) {
        l.f(list, "items");
        this.f7741f = i;
        this.f7739d.setAlignmentMode(0);
        this.f7739d.setColumnCount(i);
        this.f7739d.setRowCount(((list.size() + i) - 1) / i);
        if (((list.size() - 1) / i) + 1 <= i2) {
            p(list, i);
            return;
        }
        this.i.addAll(list);
        List<? extends CharSequence> subList = list.subList(0, i2 * i);
        this.h.addAll(subList);
        p(subList, i);
        TextView textView = this.f7738c;
        if (textView != null) {
            textView.setVisibility(0);
        }
    }

    public final void setFilterStyle(int i, boolean z) {
        this.k = i;
        Iterator<T> it2 = this.j.iterator();
        while (it2.hasNext()) {
            ((OFilter) it2.next()).setStyle(i, z);
        }
    }

    public final void setMaxSelectCount(int i) {
        this.f7740e = i;
    }

    public final void setTitle(CharSequence charSequence) {
        this.b.setText(charSequence);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OFilterGroupView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        l.f(context, "context");
        this.a = "OFilterPanelView";
        this.f7740e = 1;
        this.f7741f = 3;
        this.h = new ArrayList();
        this.i = new ArrayList();
        this.j = new ArrayList();
        this.l = true;
        ViewGroup.inflate(context, C0838R.layout.o_layout_filter_group_view, this);
        float f2 = 16;
        int e0 = e.a.a.a.a.e0("Resources.getSystem()", 1, f2);
        int e02 = e.a.a.a.a.e0("Resources.getSystem()", 1, f2);
        Resources system = Resources.getSystem();
        l.e(system, "Resources.getSystem()");
        setPadding(e0, 0, e02, kotlin.t.a.a(TypedValue.applyDimension(1, f2, system.getDisplayMetrics())));
        View findViewById = findViewById(C0838R.id.tv_title);
        l.e(findViewById, "findViewById(R.id.tv_title)");
        this.b = (TextView) findViewById;
        TextView textView = (TextView) findViewById(C0838R.id.tv_show_more);
        this.f7738c = textView;
        View findViewById2 = findViewById(C0838R.id.grid_layout);
        l.e(findViewById2, "findViewById(R.id.grid_layout)");
        this.f7739d = (GridLayout) findViewById2;
        textView.setOnClickListener(new a(context));
    }
}
