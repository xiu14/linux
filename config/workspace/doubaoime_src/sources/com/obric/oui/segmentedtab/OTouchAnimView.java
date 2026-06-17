package com.obric.oui.segmentedtab;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.animation.DecelerateInterpolator;
import android.widget.RelativeLayout;
import androidx.core.app.NotificationCompat;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
public abstract class OTouchAnimView extends RelativeLayout {
    private float a;
    private ValueAnimator b;

    /* renamed from: c, reason: collision with root package name */
    private ValueAnimator f7983c;

    public OTouchAnimView(Context context) {
        this(context, null, 0);
    }

    public abstract boolean c();

    public final void d() {
        ValueAnimator valueAnimator = this.b;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.f7983c;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        l.f(motionEvent, NotificationCompat.CATEGORY_EVENT);
        int action = motionEvent.getAction();
        if (action != 0) {
            if ((action == 1 || action == 3) && c()) {
                ValueAnimator valueAnimator = this.b;
                if (valueAnimator != null) {
                    valueAnimator.removeAllUpdateListeners();
                }
                ValueAnimator valueAnimator2 = this.b;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                ValueAnimator valueAnimator3 = this.f7983c;
                if (valueAnimator3 != null) {
                    valueAnimator3.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.a, 0.0f);
                ofFloat.setDuration(200L);
                ofFloat.setInterpolator(new DecelerateInterpolator());
                ofFloat.addUpdateListener(new d(this));
                ofFloat.start();
                this.f7983c = ofFloat;
            }
        } else if (c()) {
            ValueAnimator valueAnimator4 = this.f7983c;
            if (valueAnimator4 != null) {
                valueAnimator4.removeAllUpdateListeners();
            }
            ValueAnimator valueAnimator5 = this.f7983c;
            if (valueAnimator5 != null) {
                valueAnimator5.cancel();
            }
            ValueAnimator valueAnimator6 = this.b;
            if (valueAnimator6 != null) {
                valueAnimator6.cancel();
            }
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.a, 1.0f);
            ofFloat2.setDuration(50L);
            ofFloat2.setInterpolator(new DecelerateInterpolator());
            ofFloat2.addUpdateListener(new c(this));
            ofFloat2.start();
            this.b = ofFloat2;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final boolean e() {
        ValueAnimator valueAnimator = this.b;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            return true;
        }
        ValueAnimator valueAnimator2 = this.f7983c;
        return valueAnimator2 != null && valueAnimator2.isRunning();
    }

    public abstract void f(float f2, String str);

    public OTouchAnimView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OTouchAnimView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        l.f(context, "context");
    }
}
