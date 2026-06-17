package com.bytedance.android.input.keyboard.handwriting;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.android.doubaoime.KeyboardJni;
import com.bytedance.android.doubaoime.databinding.LayoutToolbarTipsBinding;
import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.android.input.common.SettingsConfigNext;
import com.prolificinteractive.materialcalendarview.r;
import java.util.Objects;

/* loaded from: classes.dex */
public final class ToolBarTipsLayout extends FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f2771d = 0;
    private LayoutToolbarTipsBinding a;
    private AppCompatTextView b;

    /* renamed from: c, reason: collision with root package name */
    private ObjectAnimator f2772c;

    public static final class a implements View.OnLayoutChangeListener {
        final /* synthetic */ AppCompatTextView a;
        final /* synthetic */ ToolBarTipsLayout b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ kotlin.s.b.l<Integer, kotlin.o> f2773c;

        /* JADX WARN: Multi-variable type inference failed */
        a(AppCompatTextView appCompatTextView, ToolBarTipsLayout toolBarTipsLayout, kotlin.s.b.l<? super Integer, kotlin.o> lVar) {
            this.a = appCompatTextView;
            this.b = toolBarTipsLayout;
            this.f2773c = lVar;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            if (view != null) {
                view.removeOnLayoutChangeListener(this);
            }
            int width = this.a.getWidth();
            ViewGroup.LayoutParams layoutParams = this.a.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            int i9 = width + (marginLayoutParams != null ? marginLayoutParams.leftMargin : 0);
            ViewGroup.LayoutParams layoutParams2 = this.a.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
            int i10 = i9 + (marginLayoutParams2 != null ? marginLayoutParams2.rightMargin : 0);
            ToolBarTipsLayout toolBarTipsLayout = this.b;
            StringBuilder N = e.a.a.a.a.N("realWidth = ", i10, "---mView.marginLeft = ");
            ViewGroup.LayoutParams layoutParams3 = this.a.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
            N.append(marginLayoutParams3 != null ? marginLayoutParams3.leftMargin : 0);
            N.append("---mView.marginRight = ");
            ViewGroup.LayoutParams layoutParams4 = this.a.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams4 : null;
            N.append(marginLayoutParams4 != null ? marginLayoutParams4.rightMargin : 0);
            toolBarTipsLayout.e(N.toString());
            this.f2773c.invoke(Integer.valueOf(i10));
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ToolBarTipsLayout(Context context) {
        this(context, null);
        kotlin.s.c.l.f(context, "context");
    }

    public static final void a(ToolBarTipsLayout toolBarTipsLayout, final View view, int i) {
        view.animate().cancel();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ObjectAnimator objectAnimator = toolBarTipsLayout.f2772c;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        ObjectAnimator ofInt = ObjectAnimator.ofInt(layoutParams, "width", i, 0);
        toolBarTipsLayout.f2772c = ofInt;
        if (ofInt != null) {
            ofInt.setDuration(300L);
            ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.android.input.keyboard.handwriting.l
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    View view2 = view;
                    int i2 = ToolBarTipsLayout.f2771d;
                    kotlin.s.c.l.f(view2, "$view");
                    kotlin.s.c.l.f(valueAnimator, "it");
                    ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
                    Object animatedValue = valueAnimator.getAnimatedValue();
                    kotlin.s.c.l.d(animatedValue, "null cannot be cast to non-null type kotlin.Int");
                    layoutParams2.width = ((Integer) animatedValue).intValue();
                    view2.setLayoutParams(layoutParams2);
                }
            });
            ofInt.addListener(new q(view));
            ofInt.start();
        }
    }

    public static final void c(ToolBarTipsLayout toolBarTipsLayout, final View view, int i) {
        Objects.requireNonNull(toolBarTipsLayout);
        view.animate().cancel();
        KeyboardJni.getKeyboardJni().setToolbarToastMode(true);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.setVisibility(toolBarTipsLayout.getVisibility());
        ObjectAnimator ofInt = ObjectAnimator.ofInt(layoutParams, "width", 0, i);
        toolBarTipsLayout.f2772c = ofInt;
        if (ofInt != null) {
            ofInt.setDuration(300L);
            ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.android.input.keyboard.handwriting.k
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    View view2 = view;
                    int i2 = ToolBarTipsLayout.f2771d;
                    kotlin.s.c.l.f(view2, "$view");
                    kotlin.s.c.l.f(valueAnimator, "it");
                    ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
                    Object animatedValue = valueAnimator.getAnimatedValue();
                    kotlin.s.c.l.d(animatedValue, "null cannot be cast to non-null type kotlin.Int");
                    layoutParams2.width = ((Integer) animatedValue).intValue();
                    view2.setLayoutParams(layoutParams2);
                }
            });
            ofInt.start();
            String string = toolBarTipsLayout.getContext().getString(C0838R.string.hand_writing_has_shown_tips);
            kotlin.s.c.l.e(string, "context.getString(R.stri…d_writing_has_shown_tips)");
            SettingsConfigNext.l(string, Boolean.TRUE);
        }
        toolBarTipsLayout.setClickable(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e(String str) {
        IAppGlobals.a.j("ToolBarTips", str);
    }

    private final void f(kotlin.s.b.l<? super Integer, kotlin.o> lVar) {
        AppCompatTextView appCompatTextView = this.b;
        if (appCompatTextView != null) {
            StringBuilder M = e.a.a.a.a.M("prepareCheckView mView.isLaidOut = ");
            M.append(appCompatTextView.isLaidOut());
            e(M.toString());
            if (!appCompatTextView.isLaidOut()) {
                appCompatTextView.addOnLayoutChangeListener(new a(appCompatTextView, this, lVar));
                return;
            }
            int width = appCompatTextView.getWidth();
            ViewGroup.LayoutParams layoutParams = appCompatTextView.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            int i = width + (marginLayoutParams != null ? marginLayoutParams.leftMargin : 0);
            ViewGroup.LayoutParams layoutParams2 = appCompatTextView.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
            int i2 = i + (marginLayoutParams2 != null ? marginLayoutParams2.rightMargin : 0);
            StringBuilder N = e.a.a.a.a.N("isLaidOut = true, realWidth = ", i2, "---mView.marginLeft = ");
            ViewGroup.LayoutParams layoutParams3 = appCompatTextView.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
            N.append(marginLayoutParams3 != null ? marginLayoutParams3.leftMargin : 0);
            N.append("---mView.marginRight = ");
            ViewGroup.LayoutParams layoutParams4 = appCompatTextView.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams4 : null;
            N.append(marginLayoutParams4 != null ? marginLayoutParams4.rightMargin : 0);
            e(N.toString());
            ((p) lVar).invoke(Integer.valueOf(i2));
        }
    }

    public final void d() {
        AppCompatTextView appCompatTextView = this.b;
        if (!(appCompatTextView != null && appCompatTextView.getVisibility() == 0)) {
            e("current is gone or invisible");
            return;
        }
        e("hideTips");
        AppCompatTextView appCompatTextView2 = this.b;
        if (appCompatTextView2 != null) {
            appCompatTextView2.setVisibility(8);
        }
        ObjectAnimator objectAnimator = this.f2772c;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        KeyboardJni.getKeyboardJni().setToolbarToastMode(false);
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent == null || motionEvent.getAction() != 0) {
            return false;
        }
        d();
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ToolBarTipsLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.s.c.l.f(context, "context");
        LayoutToolbarTipsBinding a2 = LayoutToolbarTipsBinding.a(LayoutInflater.from(context), this, true);
        this.a = a2;
        Object obj = null;
        this.b = a2 != null ? a2.b : null;
        String string = getContext().getString(C0838R.string.hand_writing_has_shown_tips);
        kotlin.s.c.l.e(string, "context.getString(R.stri…d_writing_has_shown_tips)");
        Object g2 = SettingsConfigNext.g(string, Boolean.FALSE);
        kotlin.s.c.l.d(g2, "null cannot be cast to non-null type kotlin.Boolean");
        if (((Boolean) g2).booleanValue()) {
            e("hasShown = true");
            return;
        }
        try {
            AppCompatTextView appCompatTextView = this.b;
            if (appCompatTextView != null) {
                e("prepare show tips");
                f(new p(this, appCompatTextView));
                obj = kotlin.o.a;
            }
        } catch (Throwable th) {
            obj = r.J(th);
        }
        Throwable b = kotlin.h.b(obj);
        if (b != null) {
            IAppGlobals.a.e("ToolBarTips", e.a.a.a.a.w("handleToolbarTips exception = ", b));
        }
    }
}
