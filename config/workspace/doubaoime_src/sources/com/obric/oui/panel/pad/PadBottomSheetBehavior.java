package com.obric.oui.panel.pad;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.app.NotificationCompat;
import com.obric.oui.panel.BottomSheetBehavior;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
public final class PadBottomSheetBehavior<V extends View> extends BottomSheetBehavior<V> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PadBottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        l.f(context, "context");
        l.f(attributeSet, "attributes");
    }

    @Override // com.obric.oui.panel.BottomSheetBehavior
    protected void calculateCollapsedOffset() {
        int i;
        if (this.a) {
            i = this.v - this.h;
            int i2 = this.i;
            if (i < i2) {
                i = i2;
            }
        } else {
            i = this.v - this.h;
        }
        this.k = i;
        this.k = i / 2;
    }

    @Override // com.obric.oui.panel.BottomSheetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        l.f(coordinatorLayout, "parent");
        l.f(v, "child");
        l.f(motionEvent, NotificationCompat.CATEGORY_EVENT);
        return false;
    }

    @Override // com.obric.oui.panel.BottomSheetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
        l.f(coordinatorLayout, "coordinatorLayout");
        l.f(v, "child");
        l.f(view, "directTargetChild");
        l.f(view2, TypedValues.AttributesType.S_TARGET);
        return false;
    }

    @Override // com.obric.oui.panel.BottomSheetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        l.f(coordinatorLayout, "parent");
        l.f(v, "child");
        l.f(motionEvent, NotificationCompat.CATEGORY_EVENT);
        return false;
    }
}
