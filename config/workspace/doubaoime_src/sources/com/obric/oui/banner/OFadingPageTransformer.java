package com.obric.oui.banner;

import android.annotation.SuppressLint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;
import com.bytedance.android.doubaoime.C0838R;
import kotlin.o;
import kotlin.s.c.l;
import kotlin.s.c.m;

/* loaded from: classes2.dex */
public final class OFadingPageTransformer implements ViewPager.PageTransformer, ViewPager2.PageTransformer {
    private final int a;

    /* compiled from: kotlin-style lambda group */
    static final class a extends m implements kotlin.s.b.a<o> {
        public final /* synthetic */ int a;
        public final /* synthetic */ float b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Object f7629c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i, float f2, Object obj) {
            super(0);
            this.a = i;
            this.b = f2;
            this.f7629c = obj;
        }

        @Override // kotlin.s.b.a
        public final o invoke() {
            int i = this.a;
            if (i != 0) {
                if (i != 1) {
                    throw null;
                }
                ((View) this.f7629c).setAlpha(this.b);
                return o.a;
            }
            Drawable foreground = ((View) this.f7629c).getForeground();
            l.e(foreground, "view.foreground");
            foreground.setAlpha((int) ((1 - this.b) * 255));
            return o.a;
        }
    }

    /* compiled from: kotlin-style lambda group */
    static final class b extends m implements kotlin.s.b.a<o> {
        public final /* synthetic */ int a;
        public final /* synthetic */ Object b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i, Object obj) {
            super(0);
            this.a = i;
            this.b = obj;
        }

        @Override // kotlin.s.b.a
        public final o invoke() {
            int i = this.a;
            if (i == 0) {
                Drawable foreground = ((View) this.b).getForeground();
                if (foreground != null) {
                    foreground.setAlpha(0);
                }
                return o.a;
            }
            if (i == 1) {
                ((View) this.b).setAlpha(0.0f);
                return o.a;
            }
            if (i != 2) {
                if (i != 3) {
                    throw null;
                }
                ((View) this.b).setAlpha(0.0f);
                return o.a;
            }
            Drawable foreground2 = ((View) this.b).getForeground();
            if (foreground2 != null) {
                foreground2.setAlpha(0);
            }
            return o.a;
        }
    }

    static final class c extends m implements kotlin.s.b.a<o> {
        final /* synthetic */ View b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(View view) {
            super(0);
            this.b = view;
        }

        @Override // kotlin.s.b.a
        public o invoke() {
            if (this.b.getForeground() == null) {
                View view = this.b;
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setAlpha(0);
                gradientDrawable.setColor(ContextCompat.getColorStateList(this.b.getContext(), OFadingPageTransformer.this.a()));
                view.setForeground(gradientDrawable);
            }
            return o.a;
        }
    }

    static final class d extends m implements kotlin.s.b.a<o> {
        public static final d a = new d();

        d() {
            super(0);
        }

        @Override // kotlin.s.b.a
        public o invoke() {
            return o.a;
        }
    }

    public OFadingPageTransformer() {
        this.a = C0838R.color.Transparent;
    }

    public final int a() {
        return this.a;
    }

    @Override // androidx.viewpager.widget.ViewPager.PageTransformer, androidx.viewpager2.widget.ViewPager2.PageTransformer
    @SuppressLint({"AnnotateVersionCheck"})
    public void transformPage(View view, float f2) {
        l.f(view, "view");
        c cVar = new c(view);
        d dVar = d.a;
        cVar.invoke();
        if (f2 < -1) {
            b bVar = new b(0, view);
            new b(1, view);
            bVar.invoke();
            return;
        }
        float f3 = 1;
        if (f2 > f3) {
            b bVar2 = new b(2, view);
            new b(3, view);
            bVar2.invoke();
        } else {
            float max = Math.max(0.5f, f3 - Math.abs(f2));
            a aVar = new a(0, max, view);
            new a(1, max, view);
            aVar.invoke();
        }
    }

    public OFadingPageTransformer(int i, int i2) {
        this.a = (i2 & 1) != 0 ? C0838R.color.Transparent : i;
    }
}
