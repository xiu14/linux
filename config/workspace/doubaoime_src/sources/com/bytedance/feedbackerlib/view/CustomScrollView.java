package com.bytedance.feedbackerlib.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ScrollView;

/* loaded from: classes.dex */
public class CustomScrollView extends ScrollView {
    private a a;

    public interface a {
        boolean a(MotionEvent motionEvent);
    }

    public CustomScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
        a aVar = this.a;
        return aVar != null ? onInterceptTouchEvent | aVar.a(motionEvent) : onInterceptTouchEvent;
    }

    @Override // android.widget.ScrollView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public void setOnInterceptTouchEventListener(a aVar) {
        this.a = aVar;
    }
}
