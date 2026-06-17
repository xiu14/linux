package com.obric.oui.oswitch;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.TransitionDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import com.bytedance.android.doubaoime.C0838R;
import java.util.Objects;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
public final class OSwitchBak extends SwitchCompat {
    private boolean V;
    private boolean W;
    private boolean a0;

    public OSwitchBak(Context context) {
        this(context, null, 0);
    }

    private final void h(boolean z, boolean z2, boolean z3) {
        if (z != isChecked() && z3 && (g() instanceof TransitionDrawable)) {
            if (z) {
                Drawable g2 = g();
                Objects.requireNonNull(g2, "null cannot be cast to non-null type android.graphics.drawable.TransitionDrawable");
                ((TransitionDrawable) g2).startTransition(180);
            } else {
                Drawable g3 = g();
                Objects.requireNonNull(g3, "null cannot be cast to non-null type android.graphics.drawable.TransitionDrawable");
                ((TransitionDrawable) g3).reverseTransition(180);
            }
            if (z2) {
                performHapticFeedback(1, 2);
            }
        }
        super.setChecked(z);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.V) {
            Resources system = Resources.getSystem();
            l.e(system, "Resources.getSystem()");
            com.obric.oui.common.util.b.a(this, kotlin.t.a.a(TypedValue.applyDimension(1, 45, system.getDisplayMetrics())));
        }
    }

    @Override // com.obric.oui.oswitch.SwitchCompat, android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        h(z, true, true);
    }

    public final void setCheckedWithoutFeedback(boolean z) {
        h(z, false, true);
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        setAlpha(z ? 1.0f : 0.5f);
    }

    public OSwitchBak(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public OSwitchBak(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        boolean z;
        int i2;
        Resources.Theme theme;
        this.V = true;
        TypedArray obtainStyledAttributes = (context == null || (theme = context.getTheme()) == null) ? null : theme.obtainStyledAttributes(attributeSet, e.i.a.b.b.K, 0, 0);
        if (obtainStyledAttributes != null) {
            try {
                z = obtainStyledAttributes.getBoolean(1, false);
            } catch (Throwable th) {
                if (obtainStyledAttributes != null) {
                    obtainStyledAttributes.recycle();
                }
                throw th;
            }
        } else {
            z = false;
        }
        this.W = z;
        this.a0 = obtainStyledAttributes != null ? obtainStyledAttributes.getBoolean(0, false) : false;
        if (obtainStyledAttributes != null) {
            obtainStyledAttributes.recycle();
        }
        setLayerType(1, null);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new b(context));
        float f2 = 21;
        Resources system = Resources.getSystem();
        l.e(system, "Resources.getSystem()");
        shapeDrawable.setIntrinsicHeight(kotlin.t.a.a(TypedValue.applyDimension(1, f2, system.getDisplayMetrics())));
        Resources system2 = Resources.getSystem();
        l.e(system2, "Resources.getSystem()");
        shapeDrawable.setIntrinsicWidth(kotlin.t.a.a(TypedValue.applyDimension(1, f2, system2.getDisplayMetrics())));
        setThumbDrawable(shapeDrawable);
        ShapeDrawable shapeDrawable2 = new ShapeDrawable();
        Resources system3 = Resources.getSystem();
        l.e(system3, "Resources.getSystem()");
        shapeDrawable2.setIntrinsicHeight(kotlin.t.a.a(TypedValue.applyDimension(1, 24, system3.getDisplayMetrics())));
        Resources system4 = Resources.getSystem();
        l.e(system4, "Resources.getSystem()");
        shapeDrawable2.setIntrinsicWidth(kotlin.t.a.a(TypedValue.applyDimension(1, 36, system4.getDisplayMetrics())));
        float f3 = (float) 12.5d;
        shapeDrawable2.setShape(new RoundRectShape(new float[]{e.a.a.a.a.m("Resources.getSystem()", 1, f3), e.a.a.a.a.m("Resources.getSystem()", 1, f3), e.a.a.a.a.m("Resources.getSystem()", 1, f3), e.a.a.a.a.m("Resources.getSystem()", 1, f3), e.a.a.a.a.m("Resources.getSystem()", 1, f3), e.a.a.a.a.m("Resources.getSystem()", 1, f3), e.a.a.a.a.m("Resources.getSystem()", 1, f3), e.a.a.a.a.m("Resources.getSystem()", 1, f3)}, new RectF(), new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f}));
        if (this.W) {
            i2 = C0838R.color.LineReverse;
        } else {
            i2 = this.a0 ? C0838R.color.ConstLineInverse : C0838R.color.LinePrimary2;
        }
        l.c(context);
        DrawableCompat.setTint(shapeDrawable2, ContextCompat.getColor(context, i2));
        ShapeDrawable shapeDrawable3 = new ShapeDrawable();
        Resources system5 = Resources.getSystem();
        l.e(system5, "Resources.getSystem()");
        shapeDrawable3.setIntrinsicHeight(kotlin.t.a.a(TypedValue.applyDimension(1, 25, system5.getDisplayMetrics())));
        Resources system6 = Resources.getSystem();
        l.e(system6, "Resources.getSystem()");
        shapeDrawable3.setIntrinsicWidth(kotlin.t.a.a(TypedValue.applyDimension(1, 43, system6.getDisplayMetrics())));
        shapeDrawable3.setShape(new RoundRectShape(new float[]{e.a.a.a.a.m("Resources.getSystem()", 1, f3), e.a.a.a.a.m("Resources.getSystem()", 1, f3), e.a.a.a.a.m("Resources.getSystem()", 1, f3), e.a.a.a.a.m("Resources.getSystem()", 1, f3), e.a.a.a.a.m("Resources.getSystem()", 1, f3), e.a.a.a.a.m("Resources.getSystem()", 1, f3), e.a.a.a.a.m("Resources.getSystem()", 1, f3), e.a.a.a.a.m("Resources.getSystem()", 1, f3)}, new RectF(), new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f}));
        DrawableCompat.setTint(shapeDrawable3, ContextCompat.getColor(context, C0838R.color.blue_2761f2_100));
        TransitionDrawable transitionDrawable = new TransitionDrawable(new ShapeDrawable[]{shapeDrawable2, shapeDrawable3});
        transitionDrawable.setCrossFadeEnabled(true);
        setTrackDrawable(transitionDrawable);
        Drawable g2 = g();
        Objects.requireNonNull(g2, "null cannot be cast to non-null type android.graphics.drawable.TransitionDrawable");
        ((TransitionDrawable) g2).resetTransition();
        float f4 = 2;
        Resources system7 = Resources.getSystem();
        l.e(system7, "Resources.getSystem()");
        setThumbConstraintRight(kotlin.t.a.a(TypedValue.applyDimension(1, f4, system7.getDisplayMetrics())));
        Resources system8 = Resources.getSystem();
        l.e(system8, "Resources.getSystem()");
        setThumbConstraintLeft(kotlin.t.a.a(TypedValue.applyDimension(1, f4, system8.getDisplayMetrics())));
        if (isChecked()) {
            Drawable g3 = g();
            Objects.requireNonNull(g3, "null cannot be cast to non-null type android.graphics.drawable.TransitionDrawable");
            ((TransitionDrawable) g3).startTransition(180);
        }
    }
}
