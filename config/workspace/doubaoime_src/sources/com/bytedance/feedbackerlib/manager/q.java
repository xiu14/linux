package com.bytedance.feedbackerlib.manager;

import android.view.MotionEvent;
import com.bytedance.feedbackerlib.manager.k;

/* loaded from: classes.dex */
class q extends k.m.a {
    private float b;

    /* renamed from: c, reason: collision with root package name */
    private float f4842c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ k f4843d;

    q(k kVar) {
        this.f4843d = kVar;
    }

    @Override // com.bytedance.feedbackerlib.manager.k.m.a, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        super.onDown(motionEvent);
        this.b = motionEvent.getX();
        this.f4842c = motionEvent.getY();
        return true;
    }

    @Override // com.bytedance.feedbackerlib.manager.k.m.a, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
        int i;
        float rawX = motionEvent2.getRawX() - this.b;
        float rawY = motionEvent2.getRawY();
        i = this.f4843d.a0;
        float f4 = (rawY - i) - this.f4842c;
        this.f4843d.G.setX(rawX);
        this.f4843d.G.setY(f4);
        super.onScroll(motionEvent, motionEvent2, f2, f3);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        k.z(this.f4843d);
        return super.onSingleTapUp(motionEvent);
    }
}
