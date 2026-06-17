package com.obric.oui.calendar;

import android.content.Context;
import android.view.MotionEvent;
import androidx.annotation.NonNull;
import androidx.viewpager.widget.ViewPager;

/* loaded from: classes2.dex */
class c extends ViewPager {
    private boolean a;

    public c(@NonNull Context context) {
        super(context);
        this.a = true;
    }

    public void a(boolean z) {
        this.a = z;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public boolean canScrollHorizontally(int i) {
        return this.a && super.canScrollHorizontally(i);
    }

    @Override // android.view.View
    public boolean canScrollVertically(int i) {
        return this.a && super.canScrollVertically(i);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.a && super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.a && super.onTouchEvent(motionEvent);
    }
}
