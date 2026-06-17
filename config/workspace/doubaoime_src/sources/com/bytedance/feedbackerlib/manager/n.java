package com.bytedance.feedbackerlib.manager;

import android.view.MotionEvent;
import com.bytedance.feedbackerlib.manager.k;
import java.util.Objects;

/* loaded from: classes.dex */
class n extends k.m.a {
    private float b = -1.0f;

    /* renamed from: c, reason: collision with root package name */
    private float f4839c = -1.0f;

    /* renamed from: d, reason: collision with root package name */
    private boolean f4840d = false;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ k f4841e;

    n(k kVar) {
        this.f4841e = kVar;
    }

    @Override // com.bytedance.feedbackerlib.manager.k.m.a, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        this.f4840d = true;
        this.b = motionEvent.getX();
        this.f4839c = motionEvent.getY();
        super.onDown(motionEvent);
        return true;
    }

    @Override // com.bytedance.feedbackerlib.manager.k.m.a, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
        boolean z;
        int i;
        z = this.f4841e.S;
        if (z || !this.f4840d) {
            return false;
        }
        int rawX = (int) (motionEvent2.getRawX() - this.b);
        float rawY = motionEvent2.getRawY();
        i = this.f4841e.a0;
        int i2 = (int) ((rawY - i) - this.f4839c);
        this.f4841e.i.setX(rawX);
        this.f4841e.i.setY(i2);
        Objects.requireNonNull(this.f4841e);
        Objects.requireNonNull(this.f4841e);
        super.onScroll(motionEvent, motionEvent2, f2, f3);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        this.f4840d = false;
        return super.onSingleTapUp(motionEvent);
    }
}
