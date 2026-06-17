package com.obric.oui.indicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.ColorInt;
import androidx.annotation.StyleableRes;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;
import com.bytedance.android.doubaoime.C0838R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import kotlin.o;
import kotlin.s.c.l;
import kotlin.s.c.m;

/* loaded from: classes2.dex */
public abstract class OBaseIndicator extends FrameLayout {
    private final String a;
    private boolean b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f7827c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f7828d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f7829e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f7830f;

    /* renamed from: g, reason: collision with root package name */
    protected final ArrayList<com.obric.oui.indicator.a> f7831g;
    private float h;
    private float i;
    private float j;
    private int k;
    private float l;
    private int m;

    @ColorInt
    private int n;
    private float o;
    private boolean p;

    @ColorInt
    private int q;
    private float r;
    private b s;
    private c t;

    public static final class a {
        private final float a;
        private final float b;

        /* renamed from: c, reason: collision with root package name */
        private final float f7832c;

        /* renamed from: d, reason: collision with root package name */
        private final int[] f7833d;

        /* renamed from: e, reason: collision with root package name */
        private final int f7834e;

        /* renamed from: f, reason: collision with root package name */
        private final int f7835f;

        /* renamed from: g, reason: collision with root package name */
        private final int f7836g;
        private final int h;
        private final int i;
        private final int j;
        private final int k;
        private final int l;
        private final int m;
        private final int n;

        public a(float f2, float f3, float f4, @StyleableRes int[] iArr, @StyleableRes int i, @StyleableRes int i2, @StyleableRes int i3, @StyleableRes int i4, @StyleableRes int i5, @StyleableRes int i6, @StyleableRes int i7, @StyleableRes int i8, @StyleableRes int i9, @StyleableRes int i10) {
            l.f(iArr, "styleableId");
            this.a = f2;
            this.b = f3;
            this.f7832c = f4;
            this.f7833d = iArr;
            this.f7834e = i;
            this.f7835f = i2;
            this.f7836g = i3;
            this.h = i4;
            this.i = i5;
            this.j = i6;
            this.k = i7;
            this.l = i8;
            this.m = i9;
            this.n = i10;
        }

        public final float a() {
            return this.b;
        }

        public final float b() {
            return this.f7832c;
        }

        public final float c() {
            return this.a;
        }

        public final int d() {
            return this.l;
        }

        public final int e() {
            return this.j;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Float.compare(this.a, aVar.a) == 0 && Float.compare(this.b, aVar.b) == 0 && Float.compare(this.f7832c, aVar.f7832c) == 0 && l.a(this.f7833d, aVar.f7833d) && this.f7834e == aVar.f7834e && this.f7835f == aVar.f7835f && this.f7836g == aVar.f7836g && this.h == aVar.h && this.i == aVar.i && this.j == aVar.j && this.k == aVar.k && this.l == aVar.l && this.m == aVar.m && this.n == aVar.n;
        }

        public final int f() {
            return this.k;
        }

        public final int g() {
            return this.h;
        }

        public final int h() {
            return this.i;
        }

        public int hashCode() {
            int x = e.a.a.a.a.x(this.f7832c, e.a.a.a.a.x(this.b, Float.hashCode(this.a) * 31, 31), 31);
            int[] iArr = this.f7833d;
            return Integer.hashCode(this.n) + e.a.a.a.a.I(this.m, e.a.a.a.a.I(this.l, e.a.a.a.a.I(this.k, e.a.a.a.a.I(this.j, e.a.a.a.a.I(this.i, e.a.a.a.a.I(this.h, e.a.a.a.a.I(this.f7836g, e.a.a.a.a.I(this.f7835f, e.a.a.a.a.I(this.f7834e, (x + (iArr != null ? Arrays.hashCode(iArr) : 0)) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31);
        }

        public final int i() {
            return this.m;
        }

        public final int j() {
            return this.n;
        }

        public final int k() {
            return this.f7836g;
        }

        public final int l() {
            return this.f7835f;
        }

        public final int[] m() {
            return this.f7833d;
        }

        public final int n() {
            return this.f7834e;
        }

        public String toString() {
            StringBuilder M = e.a.a.a.a.M("CustomDot(defaultWidth=");
            M.append(this.a);
            M.append(", defaultHeight=");
            M.append(this.b);
            M.append(", defaultSpacing=");
            M.append(this.f7832c);
            M.append(", styleableId=");
            M.append(Arrays.toString(this.f7833d));
            M.append(", typeId=");
            M.append(this.f7834e);
            M.append(", layoutHeightId=");
            M.append(this.f7835f);
            M.append(", dotsWidthId=");
            M.append(this.f7836g);
            M.append(", dotsHeightId=");
            M.append(this.h);
            M.append(", dotsSpacingId=");
            M.append(this.i);
            M.append(", dotsColorId=");
            M.append(this.j);
            M.append(", dotsCornerRadiusId=");
            M.append(this.k);
            M.append(", dotsClickableId=");
            M.append(this.l);
            M.append(", dotsStrokeColorId=");
            M.append(this.m);
            M.append(", dotsStrokeWidthId=");
            return e.a.a.a.a.D(M, this.n, ")");
        }
    }

    public interface b {
        void a(int i, boolean z);

        int b();

        void c();

        void d(com.obric.oui.indicator.c cVar);

        boolean e();

        int getCount();
    }

    public interface c {
        kotlin.s.b.l<c, o> a();
    }

    static final class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            OBaseIndicator.e(OBaseIndicator.this);
            OBaseIndicator.this.B();
            OBaseIndicator.this.C();
            OBaseIndicator.h(OBaseIndicator.this);
            b v = OBaseIndicator.this.v();
            if (v == null || v.getCount() != 1) {
                com.obric.oui.common.util.b.g(OBaseIndicator.this);
                return;
            }
            OBaseIndicator oBaseIndicator = OBaseIndicator.this;
            l.f(oBaseIndicator, "$this$makeInvisible");
            oBaseIndicator.setVisibility(4);
        }
    }

    static final class e extends m implements kotlin.s.b.a<Integer> {
        final /* synthetic */ int a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(int i) {
            super(0);
            this.a = i;
        }

        @Override // kotlin.s.b.a
        public Integer invoke() {
            return Integer.valueOf(this.a);
        }
    }

    public static final class f extends DataSetObserver implements c {
        final /* synthetic */ ViewPager b;

        static final class a extends m implements kotlin.s.b.l<c, o> {
            a() {
                super(1);
            }

            @Override // kotlin.s.b.l
            public o invoke(c cVar) {
                c cVar2 = cVar;
                l.f(cVar2, "it");
                PagerAdapter adapter = f.this.b.getAdapter();
                l.c(adapter);
                adapter.unregisterDataSetObserver((DataSetObserver) cVar2);
                return o.a;
            }
        }

        f(ViewPager viewPager) {
            this.b = viewPager;
        }

        @Override // com.obric.oui.indicator.OBaseIndicator.c
        public kotlin.s.b.l<c, o> a() {
            return new a();
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            super.onChanged();
            OBaseIndicator.this.A();
        }
    }

    static final class g extends m implements kotlin.s.b.a<Integer> {
        final /* synthetic */ int a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(int i) {
            super(0);
            this.a = i;
        }

        @Override // kotlin.s.b.a
        public Integer invoke() {
            return Integer.valueOf(this.a);
        }
    }

    public OBaseIndicator(Context context) {
        this(context, null, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C() {
        if (!this.b) {
            this.f7830f = true;
            return;
        }
        this.f7830f = false;
        b bVar = this.s;
        if (bVar == null) {
            return;
        }
        l.c(bVar);
        int count = bVar.getCount();
        for (int i = 0; i < count; i++) {
            b bVar2 = this.s;
            l.c(bVar2);
            if (i != bVar2.b()) {
                this.f7831g.get(i).setWidth((int) this.h);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D() {
        if (!this.b) {
            this.f7829e = true;
            return;
        }
        this.f7829e = false;
        b bVar = this.s;
        if (bVar == null) {
            return;
        }
        l.c(bVar);
        int b2 = bVar.b();
        for (int i = 0; i < b2; i++) {
            this.f7831g.get(i).setHorizontalMargin((int) this.l);
        }
    }

    public static final int d(OBaseIndicator oBaseIndicator, int i, int i2) {
        Objects.requireNonNull(oBaseIndicator);
        if (i2 == 0) {
            e.i.b.f.e.b.f(oBaseIndicator.a, "mod num is 0");
            return i;
        }
        try {
            return i % i2;
        } catch (Exception e2) {
            if (e2 instanceof ArithmeticException) {
                String str = oBaseIndicator.a;
                StringBuilder M = e.a.a.a.a.M("不要乱除0呀 ");
                M.append(e2.getMessage());
                e.i.b.f.e.b.f(str, M.toString());
                return i;
            }
            String str2 = oBaseIndicator.a;
            StringBuilder M2 = e.a.a.a.a.M("抓住了一个Exception并ignore, ");
            M2.append(e2.getMessage());
            e.i.b.f.e.b.f(str2, M2.toString());
            return i;
        }
    }

    public static final void e(OBaseIndicator oBaseIndicator) {
        if (oBaseIndicator.s == null) {
            return;
        }
        int size = oBaseIndicator.f7831g.size();
        b bVar = oBaseIndicator.s;
        l.c(bVar);
        int i = 0;
        if (size < bVar.getCount()) {
            b bVar2 = oBaseIndicator.s;
            l.c(bVar2);
            int count = bVar2.getCount() - oBaseIndicator.f7831g.size();
            int size2 = oBaseIndicator.f7831g.size();
            while (i < count) {
                oBaseIndicator.i(i + size2);
                i++;
            }
            return;
        }
        int size3 = oBaseIndicator.f7831g.size();
        b bVar3 = oBaseIndicator.s;
        l.c(bVar3);
        if (size3 > bVar3.getCount()) {
            int size4 = oBaseIndicator.f7831g.size();
            b bVar4 = oBaseIndicator.s;
            l.c(bVar4);
            int count2 = size4 - bVar4.getCount();
            int size5 = oBaseIndicator.f7831g.size();
            while (i < count2) {
                oBaseIndicator.F(i + size5);
                i++;
            }
        }
    }

    public static final void h(OBaseIndicator oBaseIndicator) {
        b bVar = oBaseIndicator.s;
        if (bVar == null) {
            return;
        }
        l.c(bVar);
        if (bVar.e()) {
            b bVar2 = oBaseIndicator.s;
            l.c(bVar2);
            bVar2.c();
            com.obric.oui.indicator.c j = oBaseIndicator.j();
            b bVar3 = oBaseIndicator.s;
            l.c(bVar3);
            bVar3.d(j);
            b bVar4 = oBaseIndicator.s;
            l.c(bVar4);
            j.c(bVar4.b(), 0.0f);
        }
    }

    public final void A() {
        if (this.s == null) {
            return;
        }
        post(new d());
    }

    protected final void B() {
        if (!this.b) {
            this.f7828d = true;
            return;
        }
        this.f7828d = false;
        int size = this.f7831g.size();
        for (int i = 0; i < size; i++) {
            z(i);
        }
    }

    public abstract void E();

    public abstract void F(int i);

    protected final void G() {
        this.b = true;
    }

    protected final void H(boolean z) {
        this.f7827c = z;
    }

    public abstract void i(int i);

    public abstract com.obric.oui.indicator.c j();

    public abstract a k();

    public final boolean l() {
        return this.p;
    }

    public final int m() {
        return this.n;
    }

    public final float n() {
        return this.o;
    }

    public final float o() {
        return this.i;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        A();
        post(new com.obric.oui.indicator.b(this));
    }

    public final float p() {
        return this.l;
    }

    public final int q() {
        return this.q;
    }

    public final float r() {
        return this.r;
    }

    public final float s() {
        return this.h;
    }

    public final void setDotsClickable(boolean z) {
        this.p = z;
    }

    public final void setDotsColor(int i) {
        if (this.m == 1) {
            this.n = 872415231;
            B();
        } else if (this.n != i) {
            this.n = i;
            B();
        }
    }

    public final void setDotsCornerRadius(float f2) {
        if (this.o != f2) {
            this.o = f2;
            B();
        }
    }

    public final void setDotsHeight(float f2) {
        if (this.i != f2) {
            this.i = f2;
            C();
        }
    }

    public final void setDotsSpacing(float f2) {
        if (this.l != f2) {
            this.l = f2;
            D();
        }
    }

    public final void setDotsStrokeColor(int i) {
        if (this.q != i) {
            this.q = i;
            B();
        }
    }

    public final void setDotsStrokeWidth(float f2) {
        if (this.r != f2) {
            this.r = f2;
            B();
        }
    }

    public final void setDotsWidth(float f2) {
        if (this.h != f2) {
            this.h = f2;
            C();
        }
    }

    public final void setLayoutHeight(float f2) {
        if (this.j != f2) {
            this.j = f2;
            E();
        }
    }

    public final void setPager(b bVar) {
        b bVar2 = this.s;
        if (bVar2 != null) {
            l.c(bVar2);
            bVar2.c();
        }
        this.s = bVar;
    }

    public final void setSidePadding(int i) {
        if (this.k != i) {
            this.k = i;
            E();
        }
    }

    public final void setType(int i) {
        if (this.m != i) {
            this.m = i;
            E();
            B();
        }
    }

    public final void setViewPager(ViewPager viewPager) {
        l.f(viewPager, "viewPager");
        PagerAdapter adapter = viewPager.getAdapter();
        setViewPager(viewPager, adapter != null ? adapter.getCount() : 1);
    }

    public final void setViewPager2(ViewPager2 viewPager2, int i) {
        l.f(viewPager2, "viewPager");
        setViewPager2(viewPager2, new g(i));
    }

    protected final boolean t() {
        return this.b;
    }

    public final float u() {
        return this.j;
    }

    public final b v() {
        return this.s;
    }

    protected final boolean w() {
        return this.f7827c;
    }

    public final int x() {
        return this.k;
    }

    public final int y() {
        return this.m;
    }

    public abstract void z(int i);

    public OBaseIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void setViewPager(ViewPager viewPager, int i) {
        l.f(viewPager, "viewPager");
        setViewPager(viewPager, new e(i));
    }

    public final void setViewPager2(ViewPager2 viewPager2, kotlin.s.b.a<Integer> aVar) {
        l.f(viewPager2, "viewPager");
        l.f(aVar, "pageCount");
        if (viewPager2.getAdapter() == null) {
            throw new IllegalStateException("Set an adapter to the view pager before initializing the dots indicator ~");
        }
        OBaseIndicator$setViewPager2$2 oBaseIndicator$setViewPager2$2 = new OBaseIndicator$setViewPager2$2(this, viewPager2);
        c cVar = this.t;
        if (cVar != null) {
            l.c(cVar);
            kotlin.s.b.l<c, o> a2 = cVar.a();
            c cVar2 = this.t;
            l.c(cVar2);
            a2.invoke(cVar2);
        }
        this.t = oBaseIndicator$setViewPager2$2;
        RecyclerView.Adapter adapter = viewPager2.getAdapter();
        l.c(adapter);
        Object obj = this.t;
        Objects.requireNonNull(obj, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.AdapterDataObserver");
        adapter.registerAdapterDataObserver((RecyclerView.AdapterDataObserver) obj);
        setPager(new OBaseIndicator$setViewPager2$3(this, viewPager2, aVar));
        A();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OBaseIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        l.f(context, "context");
        this.a = "OBaseIndicator";
        this.f7831g = new ArrayList<>();
        this.h = k().c();
        this.i = k().a();
        this.j = e.a.a.a.a.m("Resources.getSystem()", 1, 32);
        this.k = e.a.a.a.a.e0("Resources.getSystem()", 1, 12);
        this.l = k().b();
        this.n = ContextCompat.getColor(context, C0838R.color.oui_text_4);
        this.o = this.i / 2;
        this.p = true;
        this.q = ContextCompat.getColor(context, C0838R.color.Transparent);
        this.r = e.a.a.a.a.m("Resources.getSystem()", 1, 0);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k().m());
            l.e(obtainStyledAttributes, "context.obtainStyledAttr…ttrs, custom.styleableId)");
            setType(obtainStyledAttributes.getInt(k().n(), this.m));
            setDotsWidth(obtainStyledAttributes.getDimension(k().k(), this.h));
            setDotsHeight(obtainStyledAttributes.getDimension(k().g(), this.i));
            setLayoutHeight(obtainStyledAttributes.getDimension(k().l(), this.j));
            setDotsSpacing(obtainStyledAttributes.getDimension(k().h(), this.l));
            setDotsColor(obtainStyledAttributes.getColor(k().e(), this.n));
            setDotsCornerRadius(obtainStyledAttributes.getDimension(k().f(), this.o));
            this.p = obtainStyledAttributes.getBoolean(k().d(), true);
            setDotsStrokeColor(obtainStyledAttributes.getColor(k().i(), this.q));
            setDotsStrokeWidth(obtainStyledAttributes.getDimension(k().j(), this.r));
            obtainStyledAttributes.recycle();
        }
    }

    public final void setViewPager(ViewPager viewPager, kotlin.s.b.a<Integer> aVar) {
        l.f(viewPager, "viewPager");
        l.f(aVar, "pageCount");
        if (viewPager.getAdapter() != null) {
            f fVar = new f(viewPager);
            c cVar = this.t;
            if (cVar != null) {
                l.c(cVar);
                kotlin.s.b.l<c, o> a2 = cVar.a();
                c cVar2 = this.t;
                l.c(cVar2);
                a2.invoke(cVar2);
            }
            this.t = fVar;
            PagerAdapter adapter = viewPager.getAdapter();
            l.c(adapter);
            Object obj = this.t;
            Objects.requireNonNull(obj, "null cannot be cast to non-null type android.database.DataSetObserver");
            adapter.registerDataSetObserver((DataSetObserver) obj);
            setPager(new OBaseIndicator$setViewPager$3(this, viewPager, aVar));
            A();
            return;
        }
        throw new IllegalStateException("Set an adapter to the view pager before initializing the dots indicator ~");
    }
}
