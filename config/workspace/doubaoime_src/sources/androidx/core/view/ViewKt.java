package androidx.core.view;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.Px;
import androidx.annotation.RequiresApi;
import java.util.Objects;
import kotlin.o;
import kotlin.s.b.l;

/* loaded from: classes.dex */
public final class ViewKt {
    public static final void doOnAttach(final View view, final l<? super View, o> lVar) {
        kotlin.s.c.l.f(view, "<this>");
        kotlin.s.c.l.f(lVar, "action");
        if (ViewCompat.isAttachedToWindow(view)) {
            lVar.invoke(view);
        } else {
            view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: androidx.core.view.ViewKt$doOnAttach$1
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(View view2) {
                    kotlin.s.c.l.f(view2, "view");
                    view.removeOnAttachStateChangeListener(this);
                    lVar.invoke(view2);
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(View view2) {
                    kotlin.s.c.l.f(view2, "view");
                }
            });
        }
    }

    public static final void doOnDetach(final View view, final l<? super View, o> lVar) {
        kotlin.s.c.l.f(view, "<this>");
        kotlin.s.c.l.f(lVar, "action");
        if (ViewCompat.isAttachedToWindow(view)) {
            view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: androidx.core.view.ViewKt$doOnDetach$1
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(View view2) {
                    kotlin.s.c.l.f(view2, "view");
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(View view2) {
                    kotlin.s.c.l.f(view2, "view");
                    view.removeOnAttachStateChangeListener(this);
                    lVar.invoke(view2);
                }
            });
        } else {
            lVar.invoke(view);
        }
    }

    public static final void doOnLayout(View view, final l<? super View, o> lVar) {
        kotlin.s.c.l.f(view, "<this>");
        kotlin.s.c.l.f(lVar, "action");
        if (!ViewCompat.isLaidOut(view) || view.isLayoutRequested()) {
            view.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: androidx.core.view.ViewKt$doOnLayout$$inlined$doOnNextLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    kotlin.s.c.l.f(view2, "view");
                    view2.removeOnLayoutChangeListener(this);
                    l.this.invoke(view2);
                }
            });
        } else {
            lVar.invoke(view);
        }
    }

    public static final void doOnNextLayout(View view, final l<? super View, o> lVar) {
        kotlin.s.c.l.f(view, "<this>");
        kotlin.s.c.l.f(lVar, "action");
        view.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: androidx.core.view.ViewKt$doOnNextLayout$1
            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                kotlin.s.c.l.f(view2, "view");
                view2.removeOnLayoutChangeListener(this);
                lVar.invoke(view2);
            }
        });
    }

    public static final OneShotPreDrawListener doOnPreDraw(final View view, final l<? super View, o> lVar) {
        kotlin.s.c.l.f(view, "<this>");
        kotlin.s.c.l.f(lVar, "action");
        OneShotPreDrawListener add = OneShotPreDrawListener.add(view, new Runnable() { // from class: androidx.core.view.ViewKt$doOnPreDraw$1
            @Override // java.lang.Runnable
            public final void run() {
                lVar.invoke(view);
            }
        });
        kotlin.s.c.l.e(add, "View.doOnPreDraw(\n    cr…dd(this) { action(this) }");
        return add;
    }

    public static final Bitmap drawToBitmap(View view, Bitmap.Config config) {
        kotlin.s.c.l.f(view, "<this>");
        kotlin.s.c.l.f(config, "config");
        if (!ViewCompat.isLaidOut(view)) {
            throw new IllegalStateException("View needs to be laid out before calling drawToBitmap()");
        }
        Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), config);
        kotlin.s.c.l.e(createBitmap, "createBitmap(width, height, config)");
        Canvas canvas = new Canvas(createBitmap);
        canvas.translate(-view.getScrollX(), -view.getScrollY());
        view.draw(canvas);
        return createBitmap;
    }

    public static /* synthetic */ Bitmap drawToBitmap$default(View view, Bitmap.Config config, int i, Object obj) {
        if ((i & 1) != 0) {
            config = Bitmap.Config.ARGB_8888;
        }
        return drawToBitmap(view, config);
    }

    public static final kotlin.x.e<View> getAllViews(View view) {
        kotlin.s.c.l.f(view, "<this>");
        ViewKt$allViews$1 viewKt$allViews$1 = new ViewKt$allViews$1(view, null);
        kotlin.s.c.l.f(viewKt$allViews$1, "block");
        return new kotlin.x.i(viewKt$allViews$1);
    }

    public static final kotlin.x.e<ViewParent> getAncestors(View view) {
        kotlin.s.c.l.f(view, "<this>");
        return kotlin.x.h.d(view.getParent(), ViewKt$ancestors$1.INSTANCE);
    }

    public static final int getMarginBottom(View view) {
        kotlin.s.c.l.f(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            return marginLayoutParams.bottomMargin;
        }
        return 0;
    }

    public static final int getMarginEnd(View view) {
        kotlin.s.c.l.f(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return MarginLayoutParamsCompat.getMarginEnd((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return 0;
    }

    public static final int getMarginLeft(View view) {
        kotlin.s.c.l.f(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            return marginLayoutParams.leftMargin;
        }
        return 0;
    }

    public static final int getMarginRight(View view) {
        kotlin.s.c.l.f(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            return marginLayoutParams.rightMargin;
        }
        return 0;
    }

    public static final int getMarginStart(View view) {
        kotlin.s.c.l.f(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return MarginLayoutParamsCompat.getMarginStart((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return 0;
    }

    public static final int getMarginTop(View view) {
        kotlin.s.c.l.f(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            return marginLayoutParams.topMargin;
        }
        return 0;
    }

    public static final boolean isGone(View view) {
        kotlin.s.c.l.f(view, "<this>");
        return view.getVisibility() == 8;
    }

    public static final boolean isInvisible(View view) {
        kotlin.s.c.l.f(view, "<this>");
        return view.getVisibility() == 4;
    }

    public static final boolean isVisible(View view) {
        kotlin.s.c.l.f(view, "<this>");
        return view.getVisibility() == 0;
    }

    public static final Runnable postDelayed(View view, long j, final kotlin.s.b.a<o> aVar) {
        kotlin.s.c.l.f(view, "<this>");
        kotlin.s.c.l.f(aVar, "action");
        Runnable runnable = new Runnable() { // from class: androidx.core.view.ViewKt$postDelayed$runnable$1
            @Override // java.lang.Runnable
            public final void run() {
                aVar.invoke();
            }
        };
        view.postDelayed(runnable, j);
        return runnable;
    }

    @RequiresApi(16)
    public static final Runnable postOnAnimationDelayed(View view, long j, final kotlin.s.b.a<o> aVar) {
        kotlin.s.c.l.f(view, "<this>");
        kotlin.s.c.l.f(aVar, "action");
        Runnable runnable = new Runnable() { // from class: androidx.core.view.e
            @Override // java.lang.Runnable
            public final void run() {
                ViewKt.m8postOnAnimationDelayed$lambda1(kotlin.s.b.a.this);
            }
        };
        Api16Impl.postOnAnimationDelayed(view, runnable, j);
        return runnable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: postOnAnimationDelayed$lambda-1, reason: not valid java name */
    public static final void m8postOnAnimationDelayed$lambda1(kotlin.s.b.a aVar) {
        kotlin.s.c.l.f(aVar, "$action");
        aVar.invoke();
    }

    public static final void setGone(View view, boolean z) {
        kotlin.s.c.l.f(view, "<this>");
        view.setVisibility(z ? 8 : 0);
    }

    public static final void setInvisible(View view, boolean z) {
        kotlin.s.c.l.f(view, "<this>");
        view.setVisibility(z ? 4 : 0);
    }

    public static final void setPadding(View view, @Px int i) {
        kotlin.s.c.l.f(view, "<this>");
        view.setPadding(i, i, i, i);
    }

    public static final void setVisible(View view, boolean z) {
        kotlin.s.c.l.f(view, "<this>");
        view.setVisibility(z ? 0 : 8);
    }

    public static final void updateLayoutParams(View view, l<? super ViewGroup.LayoutParams, o> lVar) {
        kotlin.s.c.l.f(view, "<this>");
        kotlin.s.c.l.f(lVar, "block");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        lVar.invoke(layoutParams);
        view.setLayoutParams(layoutParams);
    }

    public static final /* synthetic */ <T extends ViewGroup.LayoutParams> void updateLayoutParamsTyped(View view, l<? super T, o> lVar) {
        kotlin.s.c.l.f(view, "<this>");
        kotlin.s.c.l.f(lVar, "block");
        view.getLayoutParams();
        kotlin.s.c.l.i();
        throw null;
    }

    public static final void updatePadding(View view, @Px int i, @Px int i2, @Px int i3, @Px int i4) {
        kotlin.s.c.l.f(view, "<this>");
        view.setPadding(i, i2, i3, i4);
    }

    public static /* synthetic */ void updatePadding$default(View view, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = view.getPaddingLeft();
        }
        if ((i5 & 2) != 0) {
            i2 = view.getPaddingTop();
        }
        if ((i5 & 4) != 0) {
            i3 = view.getPaddingRight();
        }
        if ((i5 & 8) != 0) {
            i4 = view.getPaddingBottom();
        }
        kotlin.s.c.l.f(view, "<this>");
        view.setPadding(i, i2, i3, i4);
    }

    @RequiresApi(17)
    @SuppressLint({"ClassVerificationFailure"})
    public static final void updatePaddingRelative(View view, @Px int i, @Px int i2, @Px int i3, @Px int i4) {
        kotlin.s.c.l.f(view, "<this>");
        view.setPaddingRelative(i, i2, i3, i4);
    }

    public static /* synthetic */ void updatePaddingRelative$default(View view, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = view.getPaddingStart();
        }
        if ((i5 & 2) != 0) {
            i2 = view.getPaddingTop();
        }
        if ((i5 & 4) != 0) {
            i3 = view.getPaddingEnd();
        }
        if ((i5 & 8) != 0) {
            i4 = view.getPaddingBottom();
        }
        kotlin.s.c.l.f(view, "<this>");
        view.setPaddingRelative(i, i2, i3, i4);
    }
}
