package com.obric.oui.lisitem;

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
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import androidx.core.view.OneShotPreDrawListener;
import com.bytedance.android.doubaoime.C0838R;
import com.obric.oui.common.util.b;
import com.obric.oui.layout.OUIFrameLayout;
import e.i.b.c.b.e;
import e.i.b.c.b.g;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
public class OListItemGeneral extends OUIFrameLayout {

    /* renamed from: g, reason: collision with root package name */
    public FrameLayout f7863g;
    public FrameLayout h;
    public FrameLayout i;
    public ImageView j;
    public TextView k;
    public TextView l;
    public ConstraintLayout m;
    private CharSequence n;
    private Drawable o;
    private Drawable p;
    private boolean q;
    private float r;

    public static final class a implements Runnable {
        final /* synthetic */ View a;
        final /* synthetic */ OListItemGeneral b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f7864c;

        public a(View view, OListItemGeneral oListItemGeneral, boolean z) {
            this.a = view;
            this.b = oListItemGeneral;
            this.f7864c = z;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f7864c) {
                OListItemGeneral oListItemGeneral = this.b;
                oListItemGeneral.c(oListItemGeneral.l().getLeft(), 0, e.a.a.a.a.e0("Resources.getSystem()", 1, (float) 0.6d), this.b.getResources().getColor(C0838R.color.oui_line_2));
            } else {
                OListItemGeneral oListItemGeneral2 = this.b;
                oListItemGeneral2.c(oListItemGeneral2.l().getLeft(), 0, 0, C0838R.color.oui_line_2);
            }
        }
    }

    public OListItemGeneral(Context context) {
        this(context, null);
    }

    public static /* synthetic */ void setChildToParent$default(OListItemGeneral oListItemGeneral, ViewGroup viewGroup, View view, ViewGroup.LayoutParams layoutParams, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setChildToParent");
        }
        if ((i & 4) != 0) {
            layoutParams = null;
        }
        oListItemGeneral.setChildToParent(viewGroup, view, layoutParams);
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

    public int j() {
        return kotlin.t.a.a(getResources().getDimension(C0838R.dimen.oui_listitem_content_width_middle));
    }

    public final Drawable k() {
        return this.o;
    }

    public final ConstraintLayout l() {
        ConstraintLayout constraintLayout = this.m;
        if (constraintLayout != null) {
            return constraintLayout;
        }
        l.l("mClContent");
        throw null;
    }

    public final FrameLayout m() {
        FrameLayout frameLayout = this.i;
        if (frameLayout != null) {
            return frameLayout;
        }
        l.l("mContentElement");
        throw null;
    }

    public final FrameLayout n() {
        FrameLayout frameLayout = this.f7863g;
        if (frameLayout != null) {
            return frameLayout;
        }
        l.l("mLeadingElement");
        throw null;
    }

    public final FrameLayout o() {
        FrameLayout frameLayout = this.h;
        if (frameLayout != null) {
            return frameLayout;
        }
        l.l("mTrailingElement");
        throw null;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        setShowDivider(this.q);
    }

    @Override // com.obric.oui.layout.OUIFrameLayout, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
    }

    public final CharSequence p() {
        return this.n;
    }

    public void q() {
        LayoutInflater.from(getContext()).inflate(C0838R.layout.o_listitem_general, this);
    }

    public final void r() {
        FrameLayout frameLayout = this.i;
        if (frameLayout == null) {
            l.l("mContentElement");
            throw null;
        }
        l.f(frameLayout, "parent");
        int childCount = frameLayout.getChildCount();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= childCount) {
                break;
            }
            View childAt = frameLayout.getChildAt(i);
            l.e(childAt, "child");
            if (childAt.getVisibility() == 0) {
                z = true;
                break;
            }
            i++;
        }
        if (z) {
            FrameLayout frameLayout2 = this.i;
            if (frameLayout2 == null) {
                l.l("mContentElement");
                throw null;
            }
            e.i.a.b.a.i(frameLayout2, j());
        } else {
            FrameLayout frameLayout3 = this.i;
            if (frameLayout3 == null) {
                l.l("mContentElement");
                throw null;
            }
            e.i.a.b.a.i(frameLayout3, kotlin.t.a.a(getResources().getDimension(C0838R.dimen.oui_listitem_content_width_empty)));
        }
        float f2 = this.r;
        if (f2 != 0.0f) {
            FrameLayout frameLayout4 = this.i;
            if (frameLayout4 != null) {
                e.i.a.b.a.i(frameLayout4, (int) f2);
            } else {
                l.l("mContentElement");
                throw null;
            }
        }
    }

    public final void setAlpha(boolean z) {
        setAlpha(!z ? 0.3f : 1.0f);
    }

    public final void setChildToParent(ViewGroup viewGroup, View view, ViewGroup.LayoutParams layoutParams) {
        if (view == null) {
            if (viewGroup != null) {
                b.f(viewGroup);
                return;
            }
            return;
        }
        if (viewGroup != null) {
            b.g(viewGroup);
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
        this.o = drawable;
        if (drawable != null) {
            ImageView imageView = this.j;
            if (imageView == null) {
                l.l("mIvContent");
                throw null;
            }
            imageView.setImageDrawable(drawable);
            ImageView imageView2 = this.j;
            if (imageView2 == null) {
                l.l("mIvContent");
                throw null;
            }
            imageView2.setVisibility(0);
            FrameLayout frameLayout = this.i;
            if (frameLayout == null) {
                l.l("mContentElement");
                throw null;
            }
            frameLayout.setVisibility(0);
        } else {
            ImageView imageView3 = this.j;
            if (imageView3 == null) {
                l.l("mIvContent");
                throw null;
            }
            imageView3.setVisibility(8);
        }
        r();
    }

    @Override // com.obric.oui.layout.OUIFrameLayout, android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (z) {
            FrameLayout frameLayout = this.f7863g;
            if (frameLayout == null) {
                l.l("mLeadingElement");
                throw null;
            }
            frameLayout.setAlpha(1.0f);
            ConstraintLayout constraintLayout = this.m;
            if (constraintLayout == null) {
                l.l("mClContent");
                throw null;
            }
            constraintLayout.setAlpha(1.0f);
            FrameLayout frameLayout2 = this.i;
            if (frameLayout2 != null) {
                frameLayout2.setAlpha(1.0f);
                return;
            } else {
                l.l("mContentElement");
                throw null;
            }
        }
        FrameLayout frameLayout3 = this.f7863g;
        if (frameLayout3 == null) {
            l.l("mLeadingElement");
            throw null;
        }
        frameLayout3.setAlpha(0.3f);
        ConstraintLayout constraintLayout2 = this.m;
        if (constraintLayout2 == null) {
            l.l("mClContent");
            throw null;
        }
        constraintLayout2.setAlpha(0.3f);
        FrameLayout frameLayout4 = this.i;
        if (frameLayout4 != null) {
            frameLayout4.setAlpha(0.3f);
        } else {
            l.l("mContentElement");
            throw null;
        }
    }

    public final void setLeadingView(View view) {
        if (view != null) {
            FrameLayout frameLayout = this.f7863g;
            if (frameLayout != null) {
                setChildToParent$default(this, frameLayout, view, null, 4, null);
            } else {
                l.l("mLeadingElement");
                throw null;
            }
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
        this.r = f2;
        if (f2 != 0.0f) {
            FrameLayout frameLayout = this.i;
            if (frameLayout != null) {
                e.i.a.b.a.i(frameLayout, (int) f2);
            } else {
                l.l("mContentElement");
                throw null;
            }
        }
    }

    public final void setMIvContent(ImageView imageView) {
        l.f(imageView, "<set-?>");
        this.j = imageView;
    }

    public final void setMLeadingElement(FrameLayout frameLayout) {
        l.f(frameLayout, "<set-?>");
        this.f7863g = frameLayout;
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
        this.q = z;
        l.b(OneShotPreDrawListener.add(this, new a(this, this, z)), "OneShotPreDrawListener.add(this) { action(this) }");
    }

    public final void setShowPreDefineBackground(boolean z) {
        if (getBackground() == null) {
            setBackground(z ? new ColorDrawable(getResources().getColor(C0838R.color.oui_fill_list_item_card, null)) : null);
        }
    }

    public final void setSubTitleString(CharSequence charSequence) {
        this.n = charSequence;
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.l;
            if (textView != null) {
                b.f(textView);
                return;
            } else {
                l.l("mTvSubtitle");
                throw null;
            }
        }
        TextView textView2 = this.l;
        if (textView2 == null) {
            l.l("mTvSubtitle");
            throw null;
        }
        b.g(textView2);
        TextView textView3 = this.l;
        if (textView3 != null) {
            textView3.setText(this.n);
        } else {
            l.l("mTvSubtitle");
            throw null;
        }
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
        this.p = drawable;
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
    public OListItemGeneral(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, null, 12);
        l.f(context, "context");
        q();
        ViewParent viewParent = (ViewGroup) findViewById(C0838R.id.ll_root);
        e eVar = (e) ((viewParent == null || !(viewParent instanceof e)) ? null : viewParent);
        if (eVar != null) {
            eVar.setChangeAlphaWhenPress(false);
        }
        View findViewById = findViewById(C0838R.id.fl_leading_element);
        l.e(findViewById, "findViewById(R.id.fl_leading_element)");
        this.f7863g = (FrameLayout) findViewById;
        View findViewById2 = findViewById(C0838R.id.fl_trailing_element);
        l.e(findViewById2, "findViewById(R.id.fl_trailing_element)");
        this.h = (FrameLayout) findViewById2;
        View findViewById3 = findViewById(C0838R.id.fl_content_element);
        l.e(findViewById3, "findViewById(R.id.fl_content_element)");
        this.i = (FrameLayout) findViewById3;
        View findViewById4 = findViewById(C0838R.id.iv_content_img);
        l.e(findViewById4, "findViewById(R.id.iv_content_img)");
        this.j = (ImageView) findViewById4;
        View findViewById5 = findViewById(C0838R.id.cl_content_container);
        l.e(findViewById5, "findViewById(R.id.cl_content_container)");
        this.m = (ConstraintLayout) findViewById5;
        View findViewById6 = findViewById(C0838R.id.tv_content_title);
        l.e(findViewById6, "findViewById(R.id.tv_content_title)");
        this.k = (TextView) findViewById6;
        View findViewById7 = findViewById(C0838R.id.tv_content_subtitle);
        l.e(findViewById7, "findViewById(R.id.tv_content_subtitle)");
        this.l = (TextView) findViewById7;
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

    public final void setTrailingView(View view, ViewGroup.LayoutParams layoutParams) {
        ViewGroup.LayoutParams layoutParams2 = layoutParams;
        if (view != null) {
            if (layoutParams == null) {
                FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
                layoutParams3.gravity = 8388629;
                layoutParams2 = layoutParams3;
            }
            FrameLayout frameLayout = this.h;
            if (frameLayout != null) {
                setChildToParent(frameLayout, view, layoutParams2);
            } else {
                l.l("mTrailingElement");
                throw null;
            }
        }
    }
}
