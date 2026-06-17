package com.obric.oui.indexscrollbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.GridView;

/* loaded from: classes2.dex */
public final class SurnameGridView extends GridView {
    private a a;
    private int b;

    /* renamed from: c, reason: collision with root package name */
    private int f7811c;

    public interface a {
        void a(int i);
    }

    public SurnameGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = -1;
        this.f7811c = -1;
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        kotlin.s.c.l.f(motionEvent, "ev");
        int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1 && actionMasked == 2 && (i = this.b) == pointToPosition) {
                pointToPosition = i;
            }
            pointToPosition = -1;
        } else {
            this.b = pointToPosition;
        }
        if (this.f7811c != pointToPosition) {
            a aVar = this.a;
            kotlin.s.c.l.c(aVar);
            aVar.a(pointToPosition);
            this.f7811c = pointToPosition;
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setOnPressChangeListener(a aVar) {
        this.a = aVar;
    }
}
