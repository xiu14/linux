package com.obric.oui.forms;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.EditText;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
public abstract class AbsOInput extends ConstraintLayout {
    private float a;
    private float b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f7745c;

    public AbsOInput(Context context) {
        this(context, null, 0);
    }

    public static /* synthetic */ void setTextFading$default(AbsOInput absOInput, boolean z, boolean z2, boolean z3, boolean z4, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setTextFading");
        }
        absOInput.setTextFading((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? false : z2, (i2 & 4) != 0 ? false : z3, (i2 & 8) != 0 ? false : z4, i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null && this.f7745c) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int action = motionEvent.getAction();
            if (action == 0) {
                this.a = x;
                this.a = y;
            } else if (action == 1) {
                super.requestDisallowInterceptTouchEvent(false);
            } else if (action == 2) {
                EditText g2 = g();
                if ((x > this.b && g2.canScrollHorizontally(-1)) || ((x < this.b && g2.canScrollHorizontally(1)) || ((y < this.a && g2.canScrollVertically(1)) || (y > this.a && g2.canScrollVertically(-1))))) {
                    super.requestDisallowInterceptTouchEvent(true);
                }
                this.b = x;
                this.a = y;
            } else if (action == 3) {
                super.requestDisallowInterceptTouchEvent(false);
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    protected abstract EditText g();

    public final void setInScrollView(boolean z) {
        this.f7745c = z;
    }

    public final void setTextFading(boolean z, boolean z2, boolean z3, boolean z4, int i) {
        EditText g2 = g();
        if (g2 instanceof OEditText) {
            ((OEditText) g2).setTextFading(z, z2, z3, z4, i);
            return;
        }
        g2.setFadingEdgeLength(i);
        g2.setHorizontalFadingEdgeEnabled(z || z3);
        g2.setVerticalFadingEdgeEnabled(z2 || z4);
    }

    public AbsOInput(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbsOInput(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        l.f(context, "context");
    }
}
