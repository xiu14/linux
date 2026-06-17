package com.obric.oui.tab.optimize;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.LinearLayout;
import com.bytedance.android.doubaoime.C0838R;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
public final class OBottomTabBar extends LinearLayout {
    private float a;
    private final Paint b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f8086c;

    public interface a {
    }

    static {
        new e.i.b.c.a();
    }

    public OBottomTabBar(Context context) {
        this(context, null, 0);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (canvas == null || !this.f8086c) {
            return;
        }
        canvas.save();
        canvas.drawLine(0.0f, this.a / 2.0f, getWidth(), this.a, this.b);
        canvas.restore();
    }

    public final void setOnTabSelectedListener(a aVar) {
        l.f(aVar, "listener");
    }

    public final void setShowTopLine(boolean z) {
        this.f8086c = z;
        invalidate();
    }

    public OBottomTabBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OBottomTabBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        l.f(context, "context");
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(getResources().getColor(C0838R.color.oui_line_2));
        this.b = paint;
        setOrientation(0);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        int dimension = (int) getResources().getDimension(C0838R.dimen.oui_p_container_2);
        int e0 = e.a.a.a.a.e0("Resources.getSystem()", 1, (float) 4.5d);
        int dimension2 = (int) getResources().getDimension(C0838R.dimen.oui_p_container_2);
        Resources system = Resources.getSystem();
        l.e(system, "Resources.getSystem()");
        setPadding(dimension, e0, dimension2, kotlin.t.a.a(TypedValue.applyDimension(1, 2, system.getDisplayMetrics())));
        Resources system2 = Resources.getSystem();
        l.e(system2, "Resources.getSystem()");
        float a2 = kotlin.t.a.a(TypedValue.applyDimension(1, 0.6f, system2.getDisplayMetrics()));
        this.a = a2;
        paint.setStrokeWidth(a2);
        setWillNotDraw(false);
        this.f8086c = true;
    }
}
