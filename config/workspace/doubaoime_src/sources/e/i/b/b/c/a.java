package e.i.b.b.c;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.animation.PathInterpolator;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import e.i.b.b.b.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.o;
import kotlin.s.c.l;
import kotlin.s.c.m;
import kotlin.s.c.x;
import kotlin.w.h;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: e.i.b.b.c.a$a, reason: collision with other inner class name */
    public static final class C0464a implements Animator.AnimatorListener {
        final /* synthetic */ View a;
        final /* synthetic */ e.i.b.b.a.c b;

        C0464a(View view, e.i.b.b.a.c cVar) {
            this.a = view;
            this.b = cVar;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            l.f(animator, "animation");
            this.b.g();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            l.f(animator, "animation");
            this.b.g();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            l.f(animator, "animation");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            l.f(animator, "animation");
            this.b.h();
            View view = this.a;
            l.f(view, "rootView");
            List<EditText> d2 = e.i.a.b.a.d(view);
            Object systemService = view.getContext().getSystemService("input_method");
            Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            InputMethodManager inputMethodManager = (InputMethodManager) systemService;
            Iterator it2 = ((ArrayList) d2).iterator();
            while (it2.hasNext()) {
                EditText editText = (EditText) it2.next();
                if (inputMethodManager.isActive(editText)) {
                    inputMethodManager.hideSoftInputFromWindow(editText.getWindowToken(), 0);
                }
            }
        }
    }

    static final class b implements ValueAnimator.AnimatorUpdateListener {
        final /* synthetic */ Window a;
        final /* synthetic */ float b;

        b(Window window, float f2, float f3) {
            this.a = window;
            this.b = f2;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            l.f(valueAnimator, "animation");
            a.a(this.a, valueAnimator.getAnimatedFraction(), this.b, 0.0f);
        }
    }

    static final class c extends m implements kotlin.s.b.l<e.i.b.b.a.b, o> {
        public static final c a = new c();

        c() {
            super(1);
        }

        @Override // kotlin.s.b.l
        public o invoke(e.i.b.b.a.b bVar) {
            e.i.b.b.a.b bVar2 = bVar;
            l.f(bVar2, "$receiver");
            bVar2.b(1.0f);
            bVar2.f(480.0f);
            return o.a;
        }
    }

    static final class d implements b.k {
        final /* synthetic */ float a;
        final /* synthetic */ Window b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f9999c;

        d(float f2, float f3, Window window, boolean z, x xVar, float f4) {
            this.a = f2;
            this.b = window;
            this.f9999c = f4;
        }

        @Override // e.i.b.b.b.b.k
        public final void a(e.i.b.b.b.b<?> bVar, float f2, float f3) {
            Window window = this.b;
            float f4 = this.a;
            a.a(window, (f2 - f4) / (0.0f - f4), 0.0f, this.f9999c);
        }
    }

    static final class e extends m implements kotlin.s.b.l<e.i.b.b.a.b, o> {
        final /* synthetic */ x a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(x xVar) {
            super(1);
            this.a = xVar;
        }

        @Override // kotlin.s.b.l
        public o invoke(e.i.b.b.a.b bVar) {
            e.i.b.b.a.b bVar2 = bVar;
            l.f(bVar2, "$receiver");
            bVar2.b(1.0f);
            bVar2.f(480.0f);
            bVar2.e(this.a.a);
            return o.a;
        }
    }

    public static final void a(Window window, float f2, float f3, float f4) {
        try {
            window.setDimAmount(((f4 - f3) * h.e(f2, 0.0f, 1.0f)) + f3);
        } catch (Exception e2) {
            StringBuilder M = e.a.a.a.a.M("updateWindowDimWithAnim: ");
            M.append(e2.getMessage());
            Log.w("CommonAnimStyle", M.toString());
        }
    }

    @SuppressLint({"Recycle"})
    public static final ObjectAnimator b(View view, Window window, boolean z) {
        l.f(view, "$this$windowBottomHide");
        Resources system = Resources.getSystem();
        l.e(system, "Resources.getSystem()");
        int i = system.getDisplayMetrics().heightPixels;
        int i2 = i / 2;
        if (view.getHeight() < i2) {
            i = i2;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f);
        ofFloat.setDuration(150L);
        ofFloat.setInterpolator(new PathInterpolator(0.25f, 0.1f, 0.25f, 1.0f));
        e.i.b.b.a.c j = e.i.a.b.a.j(view);
        j.i(i, c.a);
        ofFloat.addListener(new C0464a(view, j));
        if (window != null && z) {
            try {
                window.addFlags(2);
                ofFloat.addUpdateListener(new b(window, window.getAttributes().dimAmount, 0.0f));
            } catch (Exception e2) {
                StringBuilder M = e.a.a.a.a.M("windowBottomHide, can't show dim anim: ");
                M.append(e2.getMessage());
                Log.w("CommonAnimStyle", M.toString());
            }
        }
        l.e(ofFloat, "animator");
        return ofFloat;
    }

    public static final e.i.b.b.a.c<View> c(View view, Window window, boolean z, float f2) {
        l.f(view, "$this$windowBottomShow");
        Resources system = Resources.getSystem();
        l.e(system, "Resources.getSystem()");
        int i = system.getDisplayMetrics().heightPixels;
        int height = view.getHeight();
        x xVar = new x();
        int i2 = i / 2;
        if (height < i2) {
            i = i2;
        }
        xVar.a = i;
        view.setAlpha(1.0f);
        e.i.b.b.a.c<View> j = e.i.a.b.a.j(view);
        j.i(0.0f, new e(xVar));
        if (window != null && z) {
            try {
                window.addFlags(2);
                j.f(new d(xVar.a, 0.0f, window, z, xVar, f2));
            } catch (Exception e2) {
                StringBuilder M = e.a.a.a.a.M("windowBottomShow, can't show dim anim: ");
                M.append(e2.getMessage());
                Log.w("CommonAnimStyle", M.toString());
            }
        }
        return j;
    }
}
