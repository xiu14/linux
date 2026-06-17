package com.obric.oui.sectiontitlebar;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.android.doubaoime.C0838R;
import e.i.a.b.b;
import kotlin.e;
import kotlin.s.c.l;
import kotlin.s.c.m;

@SuppressLint({"AppCompatCustomView"})
/* loaded from: classes2.dex */
public final class OSectionSupportiveText extends FrameLayout {
    private final e a;

    static final class a extends m implements kotlin.s.b.a<TextView> {
        a() {
            super(0);
        }

        @Override // kotlin.s.b.a
        public TextView invoke() {
            return (TextView) OSectionSupportiveText.this.findViewById(C0838R.id.section_des);
        }
    }

    public OSectionSupportiveText(Context context) {
        this(context, null, 0);
    }

    public final void setSectionDes(String str) {
        l.f(str, "sectionText");
        ((TextView) this.a.getValue()).setText(str);
    }

    public OSectionSupportiveText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OSectionSupportiveText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        l.f(context, "context");
        e c2 = kotlin.a.c(new a());
        this.a = c2;
        LayoutInflater.from(context).inflate(C0838R.layout.o_view_section_supportive_text, (ViewGroup) this, true);
        float f2 = 16;
        int e0 = e.a.a.a.a.e0("Resources.getSystem()", 1, f2);
        float f3 = 4;
        int e02 = e.a.a.a.a.e0("Resources.getSystem()", 1, f3);
        int e03 = e.a.a.a.a.e0("Resources.getSystem()", 1, f2);
        Resources system = Resources.getSystem();
        l.e(system, "Resources.getSystem()");
        setPadding(e0, e02, e03, kotlin.t.a.a(TypedValue.applyDimension(1, f3, system.getDisplayMetrics())));
        int[] iArr = b.E;
        l.e(iArr, "R.styleable.OSectionSupportiveText");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        ((TextView) c2.getValue()).setText(obtainStyledAttributes.getString(0));
        obtainStyledAttributes.recycle();
    }
}
