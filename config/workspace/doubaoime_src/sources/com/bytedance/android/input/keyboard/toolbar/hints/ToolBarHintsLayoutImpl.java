package com.bytedance.android.input.keyboard.toolbar.hints;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.android.doubaoime.KeyboardJni;
import com.bytedance.android.doubaoime.databinding.LayoutToolBarHintsBinding;
import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.android.input.constants.ImeScreenOrientation;
import com.bytedance.android.input.keyboard.areacontrol.k;
import com.bytedance.android.input.keyboard.toolbar.entity.ToolbarType;
import com.bytedance.android.input.r.j;
import kotlin.o;
import kotlin.s.c.l;
import kotlin.s.c.m;

/* loaded from: classes.dex */
public final class ToolBarHintsLayoutImpl extends FrameLayout implements com.bytedance.android.input.keyboard.t.a.b {
    private LayoutToolBarHintsBinding a;
    private AnimatorSet b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f2800c;

    static final class a extends m implements kotlin.s.b.a<o> {
        a() {
            super(0);
        }

        @Override // kotlin.s.b.a
        public o invoke() {
            j.i("ImeToolBarHintsLayoutImpl", "prepare start animator");
            ToolBarHintsLayoutImpl.this.k(true, 300L, new d());
            return o.a;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ToolBarHintsLayoutImpl(Context context) {
        this(context, null);
        l.f(context, "context");
    }

    private final void f() {
        j.i("ImeToolBarHintsLayoutImpl", "prepare cancelAnimator");
        AnimatorSet animatorSet = this.b;
        if (animatorSet != null && animatorSet.isRunning()) {
            j.i("ImeToolBarHintsLayoutImpl", "cancelAnimator");
            AnimatorSet animatorSet2 = this.b;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
        }
        this.b = null;
    }

    private final void g(float f2) {
        AppCompatTextView appCompatTextView;
        LayoutToolBarHintsBinding layoutToolBarHintsBinding = this.a;
        if (layoutToolBarHintsBinding == null || (appCompatTextView = layoutToolBarHintsBinding.b) == null) {
            return;
        }
        k kVar = k.a;
        appCompatTextView.setTextSize(1, k.c(f2));
    }

    public static void h(ToolBarHintsLayoutImpl toolBarHintsLayoutImpl, View view) {
        l.f(toolBarHintsLayoutImpl, "this$0");
        j.i("ImeToolBarHintsLayoutImpl", "click hint");
        toolBarHintsLayoutImpl.k(false, 300L, new c());
    }

    public static void i(e eVar, ToolBarHintsLayoutImpl toolBarHintsLayoutImpl) {
        l.f(eVar, "$viewData");
        l.f(toolBarHintsLayoutImpl, "this$0");
        j.i("ImeToolBarHintsLayoutImpl", "delayDismiss time = " + eVar.a());
        toolBarHintsLayoutImpl.k(false, 300L, new c());
    }

    private final void j() {
        e.a.a.a.a.N0(e.a.a.a.a.M("restoreNativeToolbarIfNeeded, hiddenNativeToolbar = "), this.f2800c, "ImeToolBarHintsLayoutImpl");
        if (this.f2800c) {
            KeyboardJni.getKeyboardJni().showToolbar(true);
            this.f2800c = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k(boolean z, long j, Animator.AnimatorListener animatorListener) {
        AppCompatTextView appCompatTextView;
        LayoutToolBarHintsBinding layoutToolBarHintsBinding = this.a;
        if (layoutToolBarHintsBinding == null || (appCompatTextView = layoutToolBarHintsBinding.b) == null) {
            return;
        }
        f();
        appCompatTextView.setAlpha(0.0f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(appCompatTextView, "alpha", z ? 0.0f : 1.0f, z ? 1.0f : 0.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ofFloat);
        animatorSet.setDuration(j);
        animatorSet.setInterpolator(new LinearInterpolator());
        if (animatorListener != null) {
            animatorSet.addListener(animatorListener);
        }
        animatorSet.start();
        this.b = animatorSet;
    }

    @Override // com.bytedance.android.input.keyboard.t.a.b
    public View a() {
        return this;
    }

    @Override // com.bytedance.android.input.keyboard.t.a.b
    public ToolbarType b() {
        return ToolbarType.HINTS;
    }

    @Override // com.bytedance.android.input.keyboard.t.a.b
    public void c(ImeScreenOrientation imeScreenOrientation) {
        l.f(imeScreenOrientation, "orientation");
        int ordinal = imeScreenOrientation.ordinal();
        if (ordinal == 0) {
            g(16.0f);
        } else if (ordinal == 1) {
            g(16.0f);
        } else {
            if (ordinal != 2) {
                return;
            }
            g(12.8f);
        }
    }

    @Override // com.bytedance.android.input.keyboard.t.a.b
    public void d(com.bytedance.android.input.keyboard.toolbar.entity.a aVar) {
        ConstraintLayout a2;
        ConstraintLayout a3;
        ConstraintLayout a4;
        j.i("ImeToolBarHintsLayoutImpl", "show");
        if (aVar instanceof e) {
            final e eVar = (e) aVar;
            String b = eVar.b();
            if (b != null) {
                LayoutToolBarHintsBinding layoutToolBarHintsBinding = this.a;
                AppCompatTextView appCompatTextView = layoutToolBarHintsBinding != null ? layoutToolBarHintsBinding.b : null;
                if (appCompatTextView != null) {
                    appCompatTextView.setText(b);
                }
            }
            IAppGlobals.a aVar2 = IAppGlobals.a;
            if (!aVar2.K() || KeyboardJni.isFloatingMode()) {
                LayoutToolBarHintsBinding layoutToolBarHintsBinding2 = this.a;
                if (layoutToolBarHintsBinding2 != null && (a2 = layoutToolBarHintsBinding2.a()) != null) {
                    a2.setBackgroundResource(C0838R.color.navigation_bar_normal);
                }
            } else {
                LayoutToolBarHintsBinding layoutToolBarHintsBinding3 = this.a;
                if (layoutToolBarHintsBinding3 != null && (a4 = layoutToolBarHintsBinding3.a()) != null) {
                    a4.setBackgroundResource(C0838R.color.navigation_bar_transparent);
                }
                LayoutToolBarHintsBinding layoutToolBarHintsBinding4 = this.a;
                if ((layoutToolBarHintsBinding4 != null ? layoutToolBarHintsBinding4.a() : null) != null) {
                    com.bytedance.common_biz.ui.utils.b bVar = com.bytedance.common_biz.ui.utils.b.a;
                    LayoutToolBarHintsBinding layoutToolBarHintsBinding5 = this.a;
                    ConstraintLayout a5 = layoutToolBarHintsBinding5 != null ? layoutToolBarHintsBinding5.a() : null;
                    l.c(a5);
                    com.bytedance.common_biz.ui.utils.b.d(a5, 32);
                }
            }
            if (aVar2.K() && !KeyboardJni.isFloatingMode()) {
                this.f2800c = true;
                KeyboardJni.getKeyboardJni().showToolbar(false);
                StringBuilder sb = new StringBuilder();
                sb.append("show, hiddenNativeToolbar = ");
                e.a.a.a.a.N0(sb, this.f2800c, "ImeToolBarHintsLayoutImpl");
            }
            com.bytedance.android.input.basic.d.c cVar = com.bytedance.android.input.basic.d.c.a;
            LayoutToolBarHintsBinding layoutToolBarHintsBinding6 = this.a;
            cVar.c(layoutToolBarHintsBinding6 != null ? layoutToolBarHintsBinding6.b : null, new a());
            LayoutToolBarHintsBinding layoutToolBarHintsBinding7 = this.a;
            if (layoutToolBarHintsBinding7 == null || (a3 = layoutToolBarHintsBinding7.a()) == null) {
                return;
            }
            a3.postDelayed(new Runnable() { // from class: com.bytedance.android.input.keyboard.toolbar.hints.b
                @Override // java.lang.Runnable
                public final void run() {
                    ToolBarHintsLayoutImpl.i(e.this, this);
                }
            }, eVar.a());
        }
    }

    @Override // com.bytedance.android.input.keyboard.t.a.b
    public void dismiss() {
        j.i("ImeToolBarHintsLayoutImpl", "[WordSegmentationLayoutNew] dismiss hints toolbar");
        j();
        f();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        j();
        super.onDetachedFromWindow();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ToolBarHintsLayoutImpl(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ConstraintLayout a2;
        l.f(context, "context");
        this.a = LayoutToolBarHintsBinding.b(LayoutInflater.from(context), this, true);
        g(16.0f);
        LayoutToolBarHintsBinding layoutToolBarHintsBinding = this.a;
        if (layoutToolBarHintsBinding == null || (a2 = layoutToolBarHintsBinding.a()) == null) {
            return;
        }
        a2.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.android.input.keyboard.toolbar.hints.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ToolBarHintsLayoutImpl.h(ToolBarHintsLayoutImpl.this, view);
            }
        });
    }
}
