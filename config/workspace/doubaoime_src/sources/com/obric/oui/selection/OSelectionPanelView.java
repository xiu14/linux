package com.obric.oui.selection;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import com.bytedance.android.doubaoime.C0838R;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.collections.g;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
public abstract class OSelectionPanelView extends LinearLayout {
    private boolean a;
    private final LinearLayout b;

    /* renamed from: c, reason: collision with root package name */
    private final FrameLayout f7992c;

    /* renamed from: d, reason: collision with root package name */
    private final NestedScrollView f7993d;

    /* renamed from: e, reason: collision with root package name */
    private final ConstraintLayout f7994e;

    /* renamed from: f, reason: collision with root package name */
    private b f7995f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f7996g;
    private final List<OSelectionPanelItemView> h;

    public static final class a implements b {
        @Override // com.obric.oui.selection.OSelectionPanelView.b
        public void a(ImageView imageView, c cVar, Context context) {
            l.f(imageView, "iconImageView");
            l.f(cVar, RemoteMessageConst.DATA);
            l.f(context, "context");
            imageView.setImageDrawable(cVar.a());
        }
    }

    public interface b {
        void a(ImageView imageView, c cVar, Context context);
    }

    public static final class c {
        private final Drawable a = null;
        private final String b = null;

        /* renamed from: c, reason: collision with root package name */
        private final String f7997c = null;

        public final Drawable a() {
            return this.a;
        }

        public final String b() {
            return this.f7997c;
        }

        public final String c() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return l.a(this.a, cVar.a) && l.a(this.b, cVar.b) && l.a(this.f7997c, cVar.f7997c);
        }

        public int hashCode() {
            Drawable drawable = this.a;
            int hashCode = (drawable != null ? drawable.hashCode() : 0) * 31;
            String str = this.b;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f7997c;
            return hashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            StringBuilder M = e.a.a.a.a.M("SelectionItemData(iconDrawable=");
            M.append(this.a);
            M.append(", title=");
            M.append(this.b);
            M.append(", iconUrl=");
            return e.a.a.a.a.J(M, this.f7997c, ")");
        }
    }

    static final class d implements View.OnClickListener {
        final /* synthetic */ OSelectionPanelItemView a;
        final /* synthetic */ int b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ OSelectionPanelView f7998c;

        d(OSelectionPanelItemView oSelectionPanelItemView, c cVar, int i, OSelectionPanelView oSelectionPanelView) {
            this.a = oSelectionPanelItemView;
            this.b = i;
            this.f7998c = oSelectionPanelView;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (this.f7998c.c()) {
                this.a.setItemSelected(!r4.k());
                this.f7998c.c();
                if (this.a.k()) {
                    Objects.requireNonNull(this.f7998c);
                    return;
                }
                return;
            }
            if (!this.a.k()) {
                for (OSelectionPanelItemView oSelectionPanelItemView : this.f7998c.a()) {
                    oSelectionPanelItemView.setItemSelected(l.a(view, oSelectionPanelItemView));
                }
            }
            this.f7998c.c();
        }
    }

    public OSelectionPanelView(Context context) {
        this(context, null, C0838R.style.OSelectionPanel);
    }

    public static void setItemMargin$default(OSelectionPanelView oSelectionPanelView, int i, int i2, int i3, int i4, int i5, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setItemMargin");
        }
        if ((i5 & 1) != 0) {
            i = 0;
        }
        if ((i5 & 2) != 0) {
            i2 = 0;
        }
        if ((i5 & 4) != 0) {
            i3 = 0;
        }
        if ((i5 & 8) != 0) {
            Resources resources = oSelectionPanelView.getResources();
            l.e(resources, "resources");
            i4 = kotlin.t.a.a(resources.getDisplayMetrics().density * 12);
        }
        oSelectionPanelView.setItemMargin(i, i2, i3, i4);
    }

    protected final List<OSelectionPanelItemView> a() {
        return this.h;
    }

    public abstract void b();

    protected abstract boolean c();

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    public final void setBottomDivider(View view) {
        l.f(view, "<set-?>");
    }

    public final void setIconLoader(b bVar) {
        l.f(bVar, "loader");
        this.f7995f = bVar;
    }

    public final void setItemMargin(int i, int i2, int i3, int i4) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.f7994e.getLayoutParams());
        layoutParams.setMargins(i, i2, i3, i4);
        this.f7994e.setLayoutParams(layoutParams);
        this.f7994e.requestLayout();
    }

    public final void setItems(List<c> list) {
        l.f(list, "items");
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                g.b0();
                throw null;
            }
            c cVar = (c) obj;
            List<OSelectionPanelItemView> list2 = this.h;
            Context context = getContext();
            l.e(context, "context");
            OSelectionPanelItemView oSelectionPanelItemView = new OSelectionPanelItemView(context, null, false, false, 6);
            oSelectionPanelItemView.setSelectMode(c());
            oSelectionPanelItemView.m(this.a);
            if (cVar.a() == null && TextUtils.isEmpty(cVar.b())) {
                com.obric.oui.common.util.b.f(oSelectionPanelItemView.i());
            } else {
                com.obric.oui.common.util.b.g(oSelectionPanelItemView.i());
                b bVar = this.f7995f;
                ImageView i3 = oSelectionPanelItemView.i();
                Context context2 = oSelectionPanelItemView.getContext();
                l.e(context2, "context");
                bVar.a(i3, cVar, context2);
            }
            oSelectionPanelItemView.j().setText(cVar.c());
            oSelectionPanelItemView.setOnClickListener(new d(oSelectionPanelItemView, cVar, i, this));
            this.b.addView(oSelectionPanelItemView);
            list2.add(oSelectionPanelItemView);
            i = i2;
        }
        ((OSelectionPanelItemView) g.D(this.h)).h();
        b();
    }

    public final void setScrollViewHeight(int i) {
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(-1, i);
        if (this.h.size() < 4 && this.f7996g) {
            ConstraintLayout.LayoutParams layoutParams2 = new ConstraintLayout.LayoutParams(-1, -2);
            layoutParams2.topToBottom = -1;
            layoutParams2.bottomToBottom = 0;
            this.f7992c.setLayoutParams(layoutParams2);
            layoutParams.bottomToTop = -1;
        }
        this.f7993d.setLayoutParams(layoutParams);
    }

    public OSelectionPanelView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0838R.style.OSelectionPanel);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OSelectionPanelView(Context context, AttributeSet attributeSet, int i) {
        super(new ContextThemeWrapper(context, i), attributeSet);
        l.f(context, "context");
        this.a = true;
        this.f7995f = new a();
        this.f7996g = true;
        this.h = new ArrayList();
        LinearLayout.inflate(getContext(), C0838R.layout.o_view_selection_panel, this);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        setOrientation(1);
        View findViewById = findViewById(C0838R.id.item_container);
        l.e(findViewById, "findViewById(R.id.item_container)");
        this.b = (LinearLayout) findViewById;
        View findViewById2 = findViewById(C0838R.id.btn_container);
        l.e(findViewById2, "findViewById(R.id.btn_container)");
        this.f7992c = (FrameLayout) findViewById2;
        View findViewById3 = findViewById(C0838R.id.item_scroll_view);
        l.e(findViewById3, "findViewById(R.id.item_scroll_view)");
        this.f7993d = (NestedScrollView) findViewById3;
        View findViewById4 = findViewById(C0838R.id.root_constraint);
        l.e(findViewById4, "findViewById(R.id.root_constraint)");
        this.f7994e = (ConstraintLayout) findViewById4;
        l.e(findViewById(C0838R.id.bottom_divider), "findViewById(R.id.bottom_divider)");
    }
}
