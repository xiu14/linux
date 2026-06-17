package com.bytedance.android.input.common.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import androidx.core.view.OneShotPreDrawListener;
import androidx.core.widget.NestedScrollView;
import com.bytedance.android.doubaoime.C0838R;
import com.obric.oui.layout.OUIFrameLayout;
import e.i.b.c.b.g;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public class ScrollableOListItemGeneral extends OUIFrameLayout {

    /* renamed from: g, reason: collision with root package name */
    public FrameLayout f2238g;
    public FrameLayout h;
    public FrameLayout i;
    public ImageView j;
    public TextView k;
    public TextView l;
    public ConstraintLayout m;
    public NestedScrollView n;
    private final int o;
    private CharSequence p;
    private Drawable q;
    private Drawable r;
    private boolean s;
    private float t;

    public static final class a implements Runnable {
        final /* synthetic */ View a;
        final /* synthetic */ ScrollableOListItemGeneral b;

        public a(View view, ScrollableOListItemGeneral scrollableOListItemGeneral) {
            this.a = view;
            this.b = scrollableOListItemGeneral;
        }

        @Override // java.lang.Runnable
        public final void run() {
            int p = this.b.p();
            ViewGroup.LayoutParams layoutParams = this.b.n().getLayoutParams();
            if (this.b.o().getLineCount() <= p) {
                if (layoutParams.height != -2) {
                    layoutParams.height = -2;
                    this.b.n().setLayoutParams(layoutParams);
                    return;
                }
                return;
            }
            int paddingBottom = this.b.o().getPaddingBottom() + this.b.o().getPaddingTop() + this.b.o().getLayout().getLineBottom(p - 1);
            if (layoutParams.height != paddingBottom) {
                layoutParams.height = paddingBottom;
                this.b.n().setLayoutParams(layoutParams);
            }
        }
    }

    public static final class b implements Runnable {
        final /* synthetic */ View a;
        final /* synthetic */ boolean b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ScrollableOListItemGeneral f2239c;

        public b(View view, boolean z, ScrollableOListItemGeneral scrollableOListItemGeneral) {
            this.a = view;
            this.b = z;
            this.f2239c = scrollableOListItemGeneral;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.b) {
                ScrollableOListItemGeneral scrollableOListItemGeneral = this.f2239c;
                scrollableOListItemGeneral.c(scrollableOListItemGeneral.j().getLeft(), 0, e.a.a.a.a.e0("Resources.getSystem()", 1, (float) 0.6d), this.f2239c.getResources().getColor(C0838R.color.oui_line_2));
            } else {
                ScrollableOListItemGeneral scrollableOListItemGeneral2 = this.f2239c;
                scrollableOListItemGeneral2.c(scrollableOListItemGeneral2.j().getLeft(), 0, 0, C0838R.color.oui_line_2);
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ScrollableOListItemGeneral(Context context) {
        this(context, null);
        l.f(context, "context");
    }

    public static /* synthetic */ void setChildToParent$default(ScrollableOListItemGeneral scrollableOListItemGeneral, ViewGroup viewGroup, View view, ViewGroup.LayoutParams layoutParams, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setChildToParent");
        }
        if ((i & 4) != 0) {
            layoutParams = null;
        }
        scrollableOListItemGeneral.setChildToParent(viewGroup, view, layoutParams);
    }

    @Override // com.obric.oui.layout.OUIFrameLayout, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        l.f(motionEvent, NotificationCompat.CATEGORY_EVENT);
        if (isEnabled()) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // com.obric.oui.layout.OUIFrameLayout, e.i.b.c.b.f
    public boolean e() {
        return true;
    }

    public final ConstraintLayout j() {
        ConstraintLayout constraintLayout = this.m;
        if (constraintLayout != null) {
            return constraintLayout;
        }
        l.l("mClContent");
        throw null;
    }

    public final FrameLayout k() {
        FrameLayout frameLayout = this.i;
        if (frameLayout != null) {
            return frameLayout;
        }
        l.l("mContentElement");
        throw null;
    }

    public final ImageView l() {
        ImageView imageView = this.j;
        if (imageView != null) {
            return imageView;
        }
        l.l("mIvContent");
        throw null;
    }

    public final FrameLayout m() {
        FrameLayout frameLayout = this.f2238g;
        if (frameLayout != null) {
            return frameLayout;
        }
        l.l("mLeadingElement");
        throw null;
    }

    public final NestedScrollView n() {
        NestedScrollView nestedScrollView = this.n;
        if (nestedScrollView != null) {
            return nestedScrollView;
        }
        l.l("mSvSubtitleContainer");
        throw null;
    }

    public final TextView o() {
        TextView textView = this.l;
        if (textView != null) {
            return textView;
        }
        l.l("mTvSubtitle");
        throw null;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        setShowDivider(this.s);
    }

    @Override // com.obric.oui.layout.OUIFrameLayout, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
    }

    public final int p() {
        return this.o;
    }

    public final CharSequence q() {
        return this.p;
    }

    public final void setAlpha(boolean z) {
        setAlpha(!z ? 0.3f : 1.0f);
    }

    public final void setChildToParent(ViewGroup viewGroup, View view, ViewGroup.LayoutParams layoutParams) {
        if (view == null) {
            if (viewGroup != null) {
                com.obric.oui.common.util.b.f(viewGroup);
                return;
            }
            return;
        }
        if (viewGroup != null) {
            com.obric.oui.common.util.b.g(viewGroup);
        }
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        if (layoutParams == null) {
            if (viewGroup != null) {
                viewGroup.addView(view);
            }
        } else if (viewGroup != null) {
            viewGroup.addView(view, layoutParams);
        }
    }

    public final void setContentImage(Drawable drawable) {
        boolean z;
        this.q = drawable;
        if (drawable != null) {
            l().setImageDrawable(this.q);
            l().setVisibility(0);
            k().setVisibility(0);
        } else {
            l().setVisibility(8);
        }
        FrameLayout k = k();
        l.f(k, "parent");
        int childCount = k.getChildCount();
        int i = 0;
        while (true) {
            if (i >= childCount) {
                z = false;
                break;
            } else {
                if (k.getChildAt(i).getVisibility() == 0) {
                    z = true;
                    break;
                }
                i++;
            }
        }
        if (z) {
            e.i.a.b.a.i(k(), kotlin.t.a.a(getResources().getDimension(C0838R.dimen.oui_listitem_content_width_middle)));
        } else {
            e.i.a.b.a.i(k(), kotlin.t.a.a(getResources().getDimension(C0838R.dimen.oui_listitem_content_width_empty)));
        }
        if (this.t == 0.0f) {
            return;
        }
        e.i.a.b.a.i(k(), (int) this.t);
    }

    @Override // com.obric.oui.layout.OUIFrameLayout, android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (z) {
            m().setAlpha(1.0f);
            j().setAlpha(1.0f);
            k().setAlpha(1.0f);
        } else {
            m().setAlpha(0.3f);
            j().setAlpha(0.3f);
            k().setAlpha(0.3f);
        }
    }

    public final void setLeadingView(View view) {
        if (view != null) {
            setChildToParent$default(this, m(), view, null, 4, null);
        }
    }

    public final void setMClContent(ConstraintLayout constraintLayout) {
        l.f(constraintLayout, "<set-?>");
        this.m = constraintLayout;
    }

    public final void setMContentElement(FrameLayout frameLayout) {
        l.f(frameLayout, "<set-?>");
        this.i = frameLayout;
    }

    public final void setMContentElementWidth(float f2) {
        this.t = f2;
        if (f2 == 0.0f) {
            return;
        }
        e.i.a.b.a.i(k(), (int) f2);
    }

    public final void setMIvContent(ImageView imageView) {
        l.f(imageView, "<set-?>");
        this.j = imageView;
    }

    public final void setMLeadingElement(FrameLayout frameLayout) {
        l.f(frameLayout, "<set-?>");
        this.f2238g = frameLayout;
    }

    public final void setMSvSubtitleContainer(NestedScrollView nestedScrollView) {
        l.f(nestedScrollView, "<set-?>");
        this.n = nestedScrollView;
    }

    public final void setMTrailingElement(FrameLayout frameLayout) {
        l.f(frameLayout, "<set-?>");
        this.h = frameLayout;
    }

    public final void setMTvSubtitle(TextView textView) {
        l.f(textView, "<set-?>");
        this.l = textView;
    }

    public final void setMTvTitle(TextView textView) {
        l.f(textView, "<set-?>");
        this.k = textView;
    }

    @Override // com.obric.oui.layout.OUIFrameLayout, android.view.View
    public void setSelected(boolean z) {
        super.setSelected(z);
        ((g) g()).k(this, z);
    }

    public final void setShowBackground(boolean z) {
        setShowPreDefineBackground(z);
    }

    public final void setShowDivider(boolean z) {
        this.s = z;
        l.e(OneShotPreDrawListener.add(this, new b(this, z, this)), "View.doOnPreDraw(\n    cr…dd(this) { action(this) }");
    }

    public final void setShowPreDefineBackground(boolean z) {
        if (getBackground() == null) {
            setBackground(z ? new ColorDrawable(getResources().getColor(C0838R.color.oui_fill_list_item_card, null)) : null);
        }
    }

    public final void setSubTitleString(CharSequence charSequence) {
        this.p = charSequence;
        if (TextUtils.isEmpty(charSequence)) {
            com.obric.oui.common.util.b.f(o());
            com.obric.oui.common.util.b.f(n());
            return;
        }
        com.obric.oui.common.util.b.g(o());
        com.obric.oui.common.util.b.g(n());
        o().setText(charSequence);
        TextView o = o();
        l.e(OneShotPreDrawListener.add(o, new a(o, this)), "View.doOnPreDraw(\n    cr…dd(this) { action(this) }");
    }

    public final void setTitleString(CharSequence charSequence) {
        TextView textView = this.k;
        if (textView != null) {
            textView.setText(charSequence);
        } else {
            l.l("mTvTitle");
            throw null;
        }
    }

    public final void setTrailingImage(Drawable drawable) {
        this.r = drawable;
        setTrailingImageView(drawable);
    }

    public final void setTrailingImageView(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        ImageView imageView = new ImageView(getContext());
        imageView.setImageDrawable(drawable);
        setTrailingView(imageView);
    }

    public final void setTrailingView(View view) {
        if (view != null) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 8388629;
            ViewGroup viewGroup = this.h;
            if (viewGroup != null) {
                setChildToParent(viewGroup, view, layoutParams);
            } else {
                l.l("mTrailingElement");
                throw null;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollableOListItemGeneral(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, null, 12);
        l.f(context, "context");
        this.o = 10;
        LayoutInflater.from(getContext()).inflate(C0838R.layout.view_scrollable_listitem_general, this);
        View findViewById = findViewById(C0838R.id.fl_leading_element);
        l.e(findViewById, "findViewById(AppR.id.fl_leading_element)");
        setMLeadingElement((FrameLayout) findViewById);
        View findViewById2 = findViewById(C0838R.id.fl_trailing_element);
        l.e(findViewById2, "findViewById(AppR.id.fl_trailing_element)");
        setMTrailingElement((FrameLayout) findViewById2);
        View findViewById3 = findViewById(C0838R.id.fl_content_element);
        l.e(findViewById3, "findViewById(AppR.id.fl_content_element)");
        setMContentElement((FrameLayout) findViewById3);
        View findViewById4 = findViewById(C0838R.id.iv_content_img);
        l.e(findViewById4, "findViewById(AppR.id.iv_content_img)");
        setMIvContent((ImageView) findViewById4);
        View findViewById5 = findViewById(C0838R.id.cl_content_container);
        l.e(findViewById5, "findViewById(AppR.id.cl_content_container)");
        setMClContent((ConstraintLayout) findViewById5);
        View findViewById6 = findViewById(C0838R.id.tv_content_title);
        l.e(findViewById6, "findViewById(AppR.id.tv_content_title)");
        setMTvTitle((TextView) findViewById6);
        View findViewById7 = findViewById(C0838R.id.tv_content_subtitle);
        l.e(findViewById7, "findViewById(AppR.id.tv_content_subtitle)");
        setMTvSubtitle((TextView) findViewById7);
        View findViewById8 = findViewById(C0838R.id.sv_content_subtitle_container);
        l.e(findViewById8, "findViewById(AppR.id.sv_…ntent_subtitle_container)");
        setMSvSubtitleContainer((NestedScrollView) findViewById8);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e.i.a.b.b.w);
        setTitleString(obtainStyledAttributes.getString(5));
        setSubTitleString(obtainStyledAttributes.getString(4));
        setTrailingImage(obtainStyledAttributes.getDrawable(6));
        setContentImage(obtainStyledAttributes.getDrawable(0));
        setShowPreDefineBackground(obtainStyledAttributes.getBoolean(2, true));
        setShowDivider(obtainStyledAttributes.getBoolean(3, false));
        setMContentElementWidth(obtainStyledAttributes.getDimension(1, 0.0f));
        obtainStyledAttributes.recycle();
        setRadius((int) getResources().getDimension(C0838R.dimen.oui_r_l3_rect));
        setChangeAlphaWhenDisable(false);
    }
}
