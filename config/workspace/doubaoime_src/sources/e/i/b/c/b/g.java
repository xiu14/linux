package e.i.b.c.b;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import androidx.core.content.ContextCompat;
import com.bytedance.android.doubaoime.C0838R;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public class g implements e {
    private WeakReference<View> a;
    private boolean b = true;

    /* renamed from: c, reason: collision with root package name */
    private boolean f10000c = false;

    /* renamed from: d, reason: collision with root package name */
    private boolean f10001d = true;

    /* renamed from: e, reason: collision with root package name */
    private boolean f10002e = false;

    /* renamed from: f, reason: collision with root package name */
    private int f10003f = 0;

    /* renamed from: g, reason: collision with root package name */
    private float f10004g = 0.3f;
    private Context h;
    private AttributeSet i;
    private int j;
    private int k;
    private ColorDrawable l;
    private ColorDrawable m;
    private ObjectAnimator n;
    private ObjectAnimator o;

    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            g.this.c();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            g.this.c();
        }
    }

    public g(Context context, AttributeSet attributeSet, int i, int i2) {
        this.h = context;
        this.i = attributeSet;
        this.j = i;
        this.k = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void c() {
        View view = this.a.get();
        if (view == 0) {
            return;
        }
        if (this.b && view.isPressed()) {
            view.setForeground(this.l);
            return;
        }
        if (this.b && (view instanceof f) && ((f) view).a()) {
            view.setForeground(this.l);
        } else if (this.f10002e && view.isSelected()) {
            view.setForeground(this.m);
        } else {
            view.setForeground(null);
        }
    }

    private void e(View view) {
        int color = ContextCompat.getColor(view.getContext(), C0838R.color.oui_fill_element_3);
        int[] iArr = {ContextCompat.getColor(view.getContext(), C0838R.color.oui_accent_bg), ContextCompat.getColor(view.getContext(), C0838R.color.oui_functional_red_6)};
        this.f10003f = color;
        TypedArray obtainStyledAttributes = this.h.obtainStyledAttributes(this.i, e.i.a.b.b.R, this.j, this.k);
        if (this.i != null || this.j != 0 || this.k != 0) {
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 1) {
                    this.f10003f = obtainStyledAttributes.getColor(index, color);
                } else if (index == 0) {
                    this.f10004g = obtainStyledAttributes.getFloat(index, -1.0f);
                }
            }
        }
        if (this.f10003f == color) {
            Drawable background = view.getBackground();
            if (background instanceof ColorDrawable) {
                for (int i2 = 0; i2 < 2; i2++) {
                    if (((ColorDrawable) background).getColor() == iArr[i2]) {
                        this.f10003f = ContextCompat.getColor(view.getContext(), C0838R.color.oui_pressed_on_color);
                    }
                }
            }
        }
        this.l = new ColorDrawable(this.f10003f);
        this.m = new ColorDrawable(this.f10003f);
        this.b = this.f10003f > 0;
        this.f10001d = this.f10004g > 0.0f;
        i(view, view.isEnabled());
        ObjectAnimator ofInt = ObjectAnimator.ofInt(this.l, "alpha", 0, 255);
        this.n = ofInt;
        ofInt.setDuration(50L);
        this.n.setInterpolator(new DecelerateInterpolator());
        this.n.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: e.i.b.c.b.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                g.this.g(valueAnimator);
            }
        });
        ObjectAnimator ofInt2 = ObjectAnimator.ofInt(this.l, "alpha", 255, 0);
        this.o = ofInt2;
        ofInt2.setDuration(200L);
        this.o.setInterpolator(new DecelerateInterpolator());
        this.o.addListener(new a());
        this.o.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: e.i.b.c.b.b
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                g.this.h(valueAnimator);
            }
        });
    }

    private void l(ValueAnimator valueAnimator, String str) {
        KeyEvent.Callback callback = (View) this.a.get();
        if (callback instanceof f) {
            f fVar = (f) callback;
            Object animatedValue = valueAnimator.getAnimatedValue("alpha");
            if (fVar.e() && (animatedValue instanceof Integer)) {
                int intValue = ((Integer) animatedValue).intValue();
                if (intValue < 0 || intValue > 255) {
                    e.i.b.f.e.b.b("OUIAlphaHelper", "pressColorAnimSideEffect, invalid alpha: " + intValue + ", scene: " + str);
                } else {
                    fVar.f((255 - intValue) / 255.0f);
                }
            }
            if (animatedValue instanceof Integer) {
                fVar.d(((Integer) animatedValue).intValue());
            }
        }
    }

    @Override // e.i.b.c.b.e
    public void b(String str) {
        View view = this.a.get();
        if (view == null) {
            e.i.b.f.e.b.b("OUIAlphaHelper", "refreshColors: owner is null");
        } else {
            e(view);
        }
    }

    public void d(MotionEvent motionEvent) {
        motionEvent.getAction();
    }

    public void f(View view) {
        this.a = new WeakReference<>(view);
        e(view);
    }

    public /* synthetic */ void g(ValueAnimator valueAnimator) {
        l(valueAnimator, "press anim");
    }

    public /* synthetic */ void h(ValueAnimator valueAnimator) {
        l(valueAnimator, "release anim");
    }

    public void i(View view, boolean z) {
        View view2 = this.a.get();
        if (view2 == null) {
            return;
        }
        float f2 = 1.0f;
        if (this.f10001d && !z) {
            f2 = this.f10004g;
        }
        if (view != view2 && view2.isEnabled() != z) {
            view2.setEnabled(z);
        }
        view2.setAlpha(f2);
    }

    public void j(boolean z) {
        if (this.a.get() == null) {
            return;
        }
        this.n.cancel();
        this.o.cancel();
        if (!this.b || this.f10000c) {
            return;
        }
        if (!z) {
            this.o.start();
        } else {
            c();
            this.n.start();
        }
    }

    public void k(View view, boolean z) {
        if (this.f10002e) {
            c();
        }
    }

    @Override // e.i.b.c.b.e
    public void setChangeAlphaWhenDisable(boolean z) {
        this.f10001d = z;
        View view = this.a.get();
        if (view != null) {
            i(view, view.isEnabled());
        }
    }

    @Override // e.i.b.c.b.e
    public void setChangeAlphaWhenPress(boolean z) {
        this.b = z;
        this.a.get();
    }

    @Override // e.i.b.c.b.e
    public void setChangeAlphaWhenSelected(boolean z) {
        this.f10002e = z;
    }

    @Override // e.i.b.c.b.e
    public void setKeepPressAlpha(final boolean z) {
        StringBuilder X = e.a.a.a.a.X("setKeepPressAlpha, ", z, ", target: ");
        X.append(this.a.get());
        e.i.b.f.e.b.e("OUIAlphaHelper", X.toString());
        if (this.f10000c != z) {
            this.f10000c = z;
            if (!z) {
                this.a.get();
                j(false);
            }
        }
        View view = this.a.get();
        kotlin.s.b.l lVar = new kotlin.s.b.l() { // from class: e.i.b.c.b.c
            @Override // kotlin.s.b.l
            public final Object invoke(Object obj) {
                boolean z2 = z;
                KeyEvent.Callback callback = (View) obj;
                if (!(callback instanceof e)) {
                    return null;
                }
                ((e) callback).setKeepPressAlpha(z2);
                return null;
            }
        };
        kotlin.s.c.l.f(lVar, "visitor");
        if (view != null && (view instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt != null) {
                    lVar.invoke(childAt);
                }
            }
        }
    }
}
