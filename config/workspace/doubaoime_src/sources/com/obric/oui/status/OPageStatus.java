package com.obric.oui.status;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.LinearLayout;
import e.i.a.b.b;
import java.util.Objects;
import kotlin.s.c.l;
import kotlin.t.a;

/* loaded from: classes2.dex */
public final class OPageStatus extends LinearLayout {
    private SizeSpec a;
    private StatusSpec b;

    public OPageStatus(Context context) {
        this(context, null, 0);
    }

    public final void setPaddingInternal(int i) {
    }

    public final void setTopImageSize(int i) {
    }

    public OPageStatus(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OPageStatus(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        StatusSpec statusSpec;
        SizeSpec sizeSpec;
        l.f(context, "context");
        SizeSpec sizeSpec2 = SizeSpec.MEDIUM;
        this.a = sizeSpec2;
        StatusSpec statusSpec2 = StatusSpec.EMPTY;
        this.b = statusSpec2;
        setOrientation(1);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.y);
        l.e(obtainStyledAttributes, "context.obtainStyledAttr… R.styleable.OPageStatus)");
        int i2 = obtainStyledAttributes.getInt(0, sizeSpec2.getValue());
        int i3 = obtainStyledAttributes.getInt(1, statusSpec2.getValue());
        Objects.requireNonNull(SizeSpec.Companion);
        SizeSpec[] values = SizeSpec.values();
        int i4 = 0;
        while (true) {
            statusSpec = null;
            if (i4 >= 3) {
                sizeSpec = null;
                break;
            }
            sizeSpec = values[i4];
            i4++;
            if (sizeSpec.getValue() == i2) {
                break;
            }
        }
        this.a = sizeSpec == null ? SizeSpec.MEDIUM : sizeSpec;
        Objects.requireNonNull(StatusSpec.Companion);
        StatusSpec[] values2 = StatusSpec.values();
        int i5 = 0;
        while (true) {
            if (i5 >= 2) {
                break;
            }
            StatusSpec statusSpec3 = values2[i5];
            i5++;
            if (statusSpec3.getValue() == i3) {
                statusSpec = statusSpec3;
                break;
            }
        }
        this.b = statusSpec == null ? StatusSpec.EMPTY : statusSpec;
        obtainStyledAttributes.recycle();
        int ordinal = this.a.ordinal();
        if (ordinal == 0) {
            Resources system = Resources.getSystem();
            l.e(system, "Resources.getSystem()");
            a.a(TypedValue.applyDimension(1, 24, system.getDisplayMetrics()));
            Resources system2 = Resources.getSystem();
            l.e(system2, "Resources.getSystem()");
            a.a(TypedValue.applyDimension(1, 108, system2.getDisplayMetrics()));
        } else if (ordinal == 1) {
            Resources system3 = Resources.getSystem();
            l.e(system3, "Resources.getSystem()");
            a.a(TypedValue.applyDimension(1, 24, system3.getDisplayMetrics()));
            Resources system4 = Resources.getSystem();
            l.e(system4, "Resources.getSystem()");
            a.a(TypedValue.applyDimension(1, 72, system4.getDisplayMetrics()));
        } else if (ordinal == 2) {
            Resources system5 = Resources.getSystem();
            l.e(system5, "Resources.getSystem()");
            a.a(TypedValue.applyDimension(1, 20, system5.getDisplayMetrics()));
            Resources system6 = Resources.getSystem();
            l.e(system6, "Resources.getSystem()");
            a.a(TypedValue.applyDimension(1, 48, system6.getDisplayMetrics()));
        }
        if (this.b == StatusSpec.LOADING && this.a == SizeSpec.SMALL) {
            Resources system7 = Resources.getSystem();
            l.e(system7, "Resources.getSystem()");
            a.a(TypedValue.applyDimension(1, 12, system7.getDisplayMetrics()));
        }
        setLayoutParams(new LinearLayout.LayoutParams(e.a.a.a.a.e0("Resources.getSystem()", 1, 300), -2));
        setGravity(1);
    }
}
