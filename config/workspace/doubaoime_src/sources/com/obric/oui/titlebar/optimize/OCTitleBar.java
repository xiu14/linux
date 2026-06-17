package com.obric.oui.titlebar.optimize;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import com.bytedance.android.doubaoime.C0838R;
import com.obric.oui.button.OButton;
import com.obric.oui.text.OBaseTextView;
import e.i.b.f.e.b;
import java.util.List;
import java.util.Objects;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
public final class OCTitleBar extends RelativeLayout {
    private boolean a;
    private View b;

    /* renamed from: c, reason: collision with root package name */
    private View f8153c;

    /* renamed from: d, reason: collision with root package name */
    private List<View> f8154d;

    /* renamed from: e, reason: collision with root package name */
    private List<View> f8155e;

    /* renamed from: f, reason: collision with root package name */
    private OButton f8156f;

    /* renamed from: g, reason: collision with root package name */
    private TextView f8157g;
    private TextView h;
    private final ViewTreeObserver.OnGlobalLayoutListener i;

    static final class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            OCTitleBar.c(OCTitleBar.this);
            if (OCTitleBar.b(OCTitleBar.this)) {
                OCTitleBar.a(OCTitleBar.this, "OnGlobalLayoutListener");
            }
        }
    }

    public OCTitleBar(Context context) {
        this(context, null, 0);
    }

    public static final void a(OCTitleBar oCTitleBar, String str) {
        Objects.requireNonNull(oCTitleBar);
        Rect rect = new Rect();
        Rect rect2 = new Rect();
        List<View> list = oCTitleBar.f8154d;
        if (list != null) {
            for (View view : list) {
                Rect rect3 = new Rect();
                view.getGlobalVisibleRect(rect3);
                rect.union(rect3.left, rect3.top, rect3.right, rect3.bottom);
            }
        }
        List<View> list2 = oCTitleBar.f8155e;
        if (list2 != null) {
            for (View view2 : list2) {
                Rect rect4 = new Rect();
                view2.getGlobalVisibleRect(rect4);
                rect2.union(rect4.left, rect4.top, rect4.right, rect4.bottom);
            }
        }
        int i = rect.isEmpty() ? 0 : rect.right;
        if (i < 0) {
            i = 0;
        }
        int width = rect2.isEmpty() ? 0 : oCTitleBar.getWidth() - rect2.left;
        int i2 = width >= 0 ? width : 0;
        int max = Math.max(i, i2);
        StringBuilder V = e.a.a.a.a.V("adjustTitleViewSpace, scene: ", str, ", leftSpace: ", i, ", rightSpace: ");
        V.append(i2);
        V.append(", leftViewRectF: ");
        V.append(rect);
        V.append(", rightViewRectF: ");
        V.append(rect2);
        V.append(", width: ");
        V.append(oCTitleBar.getWidth());
        V.append(", height: ");
        V.append(oCTitleBar.getHeight());
        b.a("OCTitleBar", V.toString());
        if (max > 0) {
            TextView textView = oCTitleBar.f8157g;
            ViewGroup.LayoutParams layoutParams = null;
            ViewGroup.LayoutParams layoutParams2 = textView != null ? textView.getLayoutParams() : null;
            if (layoutParams2 == null || !(layoutParams2 instanceof RelativeLayout.LayoutParams)) {
                layoutParams2 = null;
            }
            RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) layoutParams2;
            if (layoutParams3 != null) {
                layoutParams3.leftMargin = max;
                layoutParams3.rightMargin = max;
            }
            TextView textView2 = oCTitleBar.h;
            ViewGroup.LayoutParams layoutParams4 = textView2 != null ? textView2.getLayoutParams() : null;
            if (layoutParams4 != null && (layoutParams4 instanceof RelativeLayout.LayoutParams)) {
                layoutParams = layoutParams4;
            }
            RelativeLayout.LayoutParams layoutParams5 = (RelativeLayout.LayoutParams) layoutParams;
            if (layoutParams5 != null) {
                layoutParams5.leftMargin = max;
                layoutParams5.rightMargin = max;
            }
            oCTitleBar.requestLayout();
        }
    }

    public static final boolean b(OCTitleBar oCTitleBar) {
        return oCTitleBar.a;
    }

    public static final void c(OCTitleBar oCTitleBar) {
        Objects.requireNonNull(oCTitleBar);
        try {
            oCTitleBar.getViewTreeObserver().removeOnGlobalLayoutListener(oCTitleBar.i);
        } catch (Exception e2) {
            b.c("OCTitleBar", "removeGlobalLayoutListener: ", e2);
        }
    }

    private final RelativeLayout.LayoutParams d(View view, boolean z) {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        if (layoutParams2 instanceof RelativeLayout.LayoutParams) {
            return (RelativeLayout.LayoutParams) layoutParams2;
        }
        if (z) {
            ViewGroup.LayoutParams generateDefaultLayoutParams = generateDefaultLayoutParams();
            Objects.requireNonNull(generateDefaultLayoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) generateDefaultLayoutParams;
            layoutParams3.addRule(13);
            layoutParams = layoutParams3;
        } else {
            layoutParams = generateDefaultLayoutParams();
        }
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        return (RelativeLayout.LayoutParams) layoutParams;
    }

    private final void f(String str) {
        TextView textView = this.h;
        if (textView != null) {
            l.c(textView);
        } else {
            Context context = getContext();
            l.e(context, "context");
            OBaseTextView oBaseTextView = new OBaseTextView(context, null, 0, 6);
            oBaseTextView.setMaxLines(1);
            oBaseTextView.setEllipsize(TextUtils.TruncateAt.END);
            oBaseTextView.setTextAppearance(C0838R.style.Label_M);
            Context context2 = oBaseTextView.getContext();
            l.e(context2, "context");
            oBaseTextView.setTextColor(context2.getResources().getColor(C0838R.color.oui_text_3b));
            this.h = oBaseTextView;
            ViewGroup.LayoutParams generateDefaultLayoutParams = generateDefaultLayoutParams();
            Objects.requireNonNull(generateDefaultLayoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) generateDefaultLayoutParams;
            layoutParams.addRule(14);
            layoutParams.topMargin = e.a.a.a.a.e0("Resources.getSystem()", 1, 30);
            addView(this.h, layoutParams);
            textView = this.h;
            l.c(textView);
        }
        textView.setText(str);
        TextView textView2 = this.f8157g;
        if (textView2 == null || this.h == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams2 = textView2.getLayoutParams();
        Objects.requireNonNull(layoutParams2, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) layoutParams2;
        layoutParams3.removeRule(13);
        layoutParams3.addRule(14);
        layoutParams3.topMargin = e.a.a.a.a.e0("Resources.getSystem()", 1, 9);
        Context context3 = getContext();
        l.e(context3, "context");
        Resources resources = context3.getResources();
        l.e(resources, "context.resources");
        if (resources.getConfiguration().fontScale > 1.0f) {
            layoutParams3.topMargin = e.a.a.a.a.e0("Resources.getSystem()", 1, 6);
            TextView textView3 = this.h;
            if (textView3 != null) {
                ViewGroup.LayoutParams layoutParams4 = textView3.getLayoutParams();
                Objects.requireNonNull(layoutParams4, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                ((RelativeLayout.LayoutParams) layoutParams4).topMargin = e.a.a.a.a.e0("Resources.getSystem()", 1, 31);
            }
        }
    }

    private final void g(String str) {
        TextView textView;
        View view = this.b;
        if (view == null || view != (textView = this.f8157g)) {
            if (this.f8157g == null) {
                Context context = getContext();
                l.e(context, "context");
                OBaseTextView oBaseTextView = new OBaseTextView(context, null, 0, 6);
                oBaseTextView.setMaxLines(1);
                oBaseTextView.setEllipsize(TextUtils.TruncateAt.END);
                oBaseTextView.setTextAppearance(C0838R.style.Title_Title_M_Thick);
                Context context2 = oBaseTextView.getContext();
                l.e(context2, "context");
                oBaseTextView.setTextColor(context2.getResources().getColor(C0838R.color.oui_text_1));
                this.f8157g = oBaseTextView;
            }
            View view2 = this.b;
            if (view2 != null) {
                removeView(view2);
                this.b = null;
            }
            View view3 = this.f8157g;
            ViewGroup.LayoutParams generateDefaultLayoutParams = generateDefaultLayoutParams();
            Objects.requireNonNull(generateDefaultLayoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) generateDefaultLayoutParams;
            layoutParams.addRule(13);
            addView(view3, layoutParams);
            textView = this.f8157g;
            this.b = textView;
            l.c(textView);
        } else {
            l.c(textView);
        }
        textView.setText(str);
    }

    public final OButton e() {
        return this.f8156f;
    }

    @Override // android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        Context context = getContext();
        l.e(context, "context");
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec((int) context.getResources().getDimension(C0838R.dimen.oui_h_title_bar_window), BasicMeasure.EXACTLY));
    }

    public final void setCenterText(int i) {
        g(getContext().getString(i));
    }

    public final void setCenterView(View view) {
        if (view == null) {
            return;
        }
        RelativeLayout.LayoutParams d2 = d(view, true);
        if (l.a(this.b, view)) {
            return;
        }
        View view2 = this.b;
        if (view2 != null) {
            removeView(view2);
            this.b = null;
        }
        this.b = view;
        addView(view, d2);
    }

    public final void setMCenterView(View view) {
        this.b = view;
    }

    public final void setMLeftActionBack(OButton oButton) {
        this.f8156f = oButton;
    }

    public final void setMLeftLastView(View view) {
        this.f8153c = view;
    }

    public final void setMLeftViewList(List<View> list) {
        this.f8154d = list;
    }

    public final void setMRightLastView(View view) {
    }

    public final void setMRightViewList(List<View> list) {
        this.f8155e = list;
    }

    public final void setMSubTitleView(TextView textView) {
        this.h = textView;
    }

    public final void setMTitleView(TextView textView) {
        this.f8157g = textView;
    }

    public final void setSubTitleText(String str) {
        f(str);
    }

    public final void setTitleText(String str) {
        g(str);
    }

    public OCTitleBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x014e, code lost:
    
        if (r7 == r2.size()) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public OCTitleBar(android.content.Context r11, android.util.AttributeSet r12, int r13) {
        /*
            Method dump skipped, instructions count: 420
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obric.oui.titlebar.optimize.OCTitleBar.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
