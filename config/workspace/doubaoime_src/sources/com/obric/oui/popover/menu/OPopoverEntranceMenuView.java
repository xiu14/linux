package com.obric.oui.popover.menu;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import com.bytedance.android.doubaoime.C0838R;
import java.util.ArrayList;
import kotlin.e;
import kotlin.o;
import kotlin.s.b.l;
import kotlin.s.c.m;

/* loaded from: classes2.dex */
public final class OPopoverEntranceMenuView extends OPopoverMenuView {
    private final e b;

    static final class a extends m implements l<View, o> {
        public static final a a = new a();

        a() {
            super(1);
        }

        @Override // kotlin.s.b.l
        public o invoke(View view) {
            kotlin.s.c.l.f(view, "it");
            return o.a;
        }
    }

    static final class b extends m implements kotlin.s.b.a<Integer> {
        final /* synthetic */ Context a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Context context) {
            super(0);
            this.a = context;
        }

        @Override // kotlin.s.b.a
        public Integer invoke() {
            return Integer.valueOf(this.a.getResources().getDimensionPixelSize(C0838R.dimen.oui_p_container_tiny_2));
        }
    }

    public OPopoverEntranceMenuView(Context context) {
        this(context, null, 0);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    public OPopoverEntranceMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OPopoverEntranceMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.s.c.l.f(context, "context");
        a aVar = a.a;
        new ArrayList();
        Resources system = Resources.getSystem();
        kotlin.s.c.l.e(system, "Resources.getSystem()");
        kotlin.t.a.a(TypedValue.applyDimension(1, 200, system.getDisplayMetrics()));
        this.b = kotlin.a.c(new b(context));
    }
}
