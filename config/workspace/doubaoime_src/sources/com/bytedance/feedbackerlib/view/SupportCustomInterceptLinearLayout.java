package com.bytedance.feedbackerlib.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public class SupportCustomInterceptLinearLayout extends LinearLayout {
    private a a;

    public interface a {
        boolean a(MotionEvent motionEvent);
    }

    public SupportCustomInterceptLinearLayout(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
        a aVar = this.a;
        return aVar != null ? onInterceptTouchEvent | aVar.a(motionEvent) : onInterceptTouchEvent;
    }

    public void setOnInterceptTouchEventListener(a aVar) {
        this.a = aVar;
    }
}
