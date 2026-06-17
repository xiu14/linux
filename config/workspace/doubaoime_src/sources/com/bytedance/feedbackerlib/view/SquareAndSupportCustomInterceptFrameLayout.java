package com.bytedance.feedbackerlib.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public class SquareAndSupportCustomInterceptFrameLayout extends FrameLayout {
    private a a;

    public interface a {
        boolean a(MotionEvent motionEvent);
    }

    public SquareAndSupportCustomInterceptFrameLayout(@NonNull Context context) {
        super(context);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
        a aVar = this.a;
        return aVar != null ? onInterceptTouchEvent | aVar.a(motionEvent) : onInterceptTouchEvent;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i);
    }

    public void setOnInterceptTouchEventListener(a aVar) {
        this.a = aVar;
    }

    public SquareAndSupportCustomInterceptFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
