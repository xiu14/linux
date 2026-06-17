package com.obric.oui.forms;

import android.content.Context;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.EditText;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
public abstract class AbsOForm extends ConstraintLayout {
    private ArrayList<WeakReference<TextWatcher>> a;
    private float b;

    /* renamed from: c, reason: collision with root package name */
    private float f7743c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f7744d;

    public AbsOForm(Context context) {
        this(context, null, 0);
    }

    public static /* synthetic */ void setTextFading$default(AbsOForm absOForm, boolean z, boolean z2, boolean z3, boolean z4, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setTextFading");
        }
        absOForm.setTextFading((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? false : z2, (i2 & 4) != 0 ? false : z3, (i2 & 8) != 0 ? false : z4, i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null && this.f7744d) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int action = motionEvent.getAction();
            if (action == 0) {
                this.b = x;
                this.b = y;
            } else if (action == 1) {
                super.requestDisallowInterceptTouchEvent(false);
            } else if (action == 2) {
                EditText g2 = g();
                l.c(g2);
                if ((x > this.f7743c && g2.canScrollHorizontally(-1)) || ((x < this.f7743c && g2.canScrollHorizontally(1)) || ((y < this.b && g2.canScrollVertically(1)) || (y > this.b && g2.canScrollVertically(-1))))) {
                    super.requestDisallowInterceptTouchEvent(true);
                }
                this.f7743c = x;
                this.b = y;
            } else if (action == 3) {
                super.requestDisallowInterceptTouchEvent(false);
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public abstract EditText g();

    protected final ArrayList<WeakReference<TextWatcher>> h() {
        return this.a;
    }

    public final void setInScrollView(boolean z) {
        this.f7744d = z;
    }

    public final void setInScrollView1(boolean z) {
        this.f7744d = z;
    }

    public final void setTextFading(boolean z, boolean z2, boolean z3, boolean z4, int i) {
        EditText g2 = g();
        if (g2 instanceof OFormEditText) {
            ((OFormEditText) g2).setTextFading(z, z2, z3, z4, i);
        }
    }

    public AbsOForm(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbsOForm(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        l.f(context, "context");
        this.a = new ArrayList<>();
    }
}
