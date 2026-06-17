package com.obric.oui.forms;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.R;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.bytedance.android.doubaoime.C0838R;
import com.obric.oui.text.OTextView;
import com.ss.android.message.log.PushLog;
import java.util.Objects;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
public final class OFormItem extends LinearLayoutCompat {
    private final OTextView a;
    private final OInputView b;

    public OFormItem(Context context) {
        this(context, null, 0);
    }

    public final OInputView a() {
        return this.b;
    }

    public final OTextView b() {
        return this.a;
    }

    public OFormItem(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OFormItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        l.f(context, "context");
        OTextView oTextView = new OTextView(new ContextThemeWrapper(context, C0838R.style.Label_L), null, 0, null, 14);
        this.a = oTextView;
        OInputView oInputView = new OInputView(context, null, 0, 6);
        this.b = oInputView;
        setGravity(16);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.LinearLayoutCompat, i, 0);
        int i2 = obtainStyledAttributes.getInt(R.styleable.LinearLayoutCompat_android_gravity, -1);
        if (i2 >= 0) {
            setGravity(i2);
        }
        obtainStyledAttributes.recycle();
        addView(oTextView);
        addView(oInputView);
        oInputView.setShowLabel(false);
        ViewGroup.LayoutParams layoutParams = oTextView.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type androidx.appcompat.widget.LinearLayoutCompat.LayoutParams");
        LinearLayoutCompat.LayoutParams layoutParams2 = (LinearLayoutCompat.LayoutParams) layoutParams;
        ((LinearLayout.LayoutParams) layoutParams2).width = getOrientation() == 0 ? e.a.a.a.a.e0("Resources.getSystem()", 1, 72) : -1;
        ((LinearLayout.LayoutParams) layoutParams2).height = -2;
        oTextView.setLayoutParams(layoutParams2);
        oTextView.setText(PushLog.KEY_LABEL);
        oInputView.setHint("hint");
        ViewGroup.LayoutParams layoutParams3 = oInputView.getLayoutParams();
        Objects.requireNonNull(layoutParams3, "null cannot be cast to non-null type androidx.appcompat.widget.LinearLayoutCompat.LayoutParams");
        LinearLayoutCompat.LayoutParams layoutParams4 = (LinearLayoutCompat.LayoutParams) layoutParams3;
        ((LinearLayout.LayoutParams) layoutParams4).weight = 1.0f;
        ((LinearLayout.LayoutParams) layoutParams4).width = -1;
        ((LinearLayout.LayoutParams) layoutParams4).height = -2;
        if (getOrientation() == 1) {
            ((LinearLayout.LayoutParams) layoutParams4).topMargin = e.a.a.a.a.e0("Resources.getSystem()", 1, 8);
        } else if (getOrientation() == 0) {
            float f2 = 12;
            Resources system = Resources.getSystem();
            l.e(system, "Resources.getSystem()");
            layoutParams4.setMarginStart(kotlin.t.a.a(TypedValue.applyDimension(1, f2, system.getDisplayMetrics())));
            Resources system2 = Resources.getSystem();
            l.e(system2, "Resources.getSystem()");
            ((LinearLayout.LayoutParams) layoutParams4).leftMargin = kotlin.t.a.a(TypedValue.applyDimension(1, f2, system2.getDisplayMetrics()));
        }
        oInputView.setLayoutParams(layoutParams4);
    }
}
