package com.obric.oui.picker.reels.views;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewParent;
import android.view.animation.LinearInterpolator;
import android.widget.OverScroller;
import androidx.core.app.NotificationCompat;
import com.bytedance.android.doubaoime.C0838R;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
public final class b extends OverScroller {
    private int a;
    private float b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f7925c;

    /* renamed from: d, reason: collision with root package name */
    private VelocityTracker f7926d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f7927e;

    /* renamed from: f, reason: collision with root package name */
    private a f7928f;

    /* renamed from: g, reason: collision with root package name */
    private int f7929g;
    private final WheelView h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context, WheelView wheelView) {
        super(context, new LinearInterpolator());
        l.f(wheelView, "mWheelView");
        this.h = wheelView;
        this.f7929g = -1;
    }

    private final void b(int i, String str) {
        this.a += i;
        if (!this.h.j()) {
            int a = this.h.a() * (this.h.b() - 1);
            int a2 = (int) (this.h.a() * 0.4d);
            int i2 = this.a;
            int i3 = -a2;
            if (i2 < i3) {
                this.a = i3;
            } else {
                int i4 = a + a2;
                if (i2 > i4) {
                    this.a = i4;
                }
            }
        }
        f(str);
    }

    private final void e() {
        a aVar;
        int a = this.h.a();
        int i = this.a % a;
        if (i == 0 && (aVar = this.f7928f) != null) {
            aVar.a(this.f7929g);
        }
        if (i > 0 && i < a / 2) {
            this.f7925c = true;
            startScroll(0, this.a, 0, -i, 200);
            this.h.invalidate();
            return;
        }
        if (i >= a / 2) {
            this.f7925c = true;
            startScroll(0, this.a, 0, a - i, 200);
            this.h.invalidate();
        } else if (i < 0 && i > (-a) / 2) {
            this.f7925c = true;
            startScroll(0, this.a, 0, -i, 200);
            this.h.invalidate();
        } else {
            int i2 = -a;
            if (i <= i2 / 2) {
                this.f7925c = true;
                startScroll(0, this.a, 0, i2 - i, 200);
                this.h.invalidate();
            }
        }
    }

    private final void f(String str) {
        int i;
        int i2 = this.f7929g;
        int a = this.h.a();
        int b = this.h.b();
        if (b == 0) {
            i = -1;
        } else {
            int i3 = this.a;
            int i4 = i3 < 0 ? (i3 - (a / 2)) / a : ((a / 2) + i3) / a;
            i = i4 % b;
            if (!this.h.j() && i4 >= b) {
                i = b - 1;
            }
            if (i < 0) {
                i += b;
            }
        }
        if (i2 != i) {
            this.f7929g = i;
            Context context = this.h.getContext();
            e.i.b.f.e.b.a("WheelScroller", "performVibrateEffect, scene: [" + str + ']');
            int hashCode = str.hashCode();
            if (hashCode == -1621011813 ? str.equals("touchEvent") : !(hashCode != 530781668 || !str.equals("computeScroll"))) {
                WheelView wheelView = this.h;
                if (wheelView != null) {
                    try {
                        wheelView.performHapticFeedback(26);
                    } catch (Exception e2) {
                        e.i.b.f.e.b.b("VibratorSmt", "performHapticFeedbackAOSP error: " + e2);
                    }
                }
                e.i.b.c.b.l.f10018e.e(context, C0838R.raw.reel_picker);
            }
            a aVar = this.f7928f;
            if (aVar != null) {
                aVar.b(i2, i);
            }
        }
    }

    public final void a() {
        if (this.f7925c) {
            this.f7925c = computeScrollOffset();
            b(getCurrY() - this.a, "computeScroll");
            if (this.f7925c) {
                this.h.postInvalidate();
            } else {
                e();
            }
        }
    }

    public final int c() {
        if (this.h.a() == 0) {
            return 0;
        }
        return this.a / this.h.a();
    }

    public final int d() {
        if (this.h.a() == 0) {
            return 0;
        }
        return this.a % this.h.a();
    }

    public final boolean g(MotionEvent motionEvent) {
        l.f(motionEvent, NotificationCompat.CATEGORY_EVENT);
        if (this.f7926d == null) {
            this.f7926d = VelocityTracker.obtain();
        }
        VelocityTracker velocityTracker = this.f7926d;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            ViewParent parent = this.h.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            this.b = motionEvent.getY();
            forceFinished(true);
            this.f7927e = false;
        } else if (action == 1) {
            VelocityTracker velocityTracker2 = this.f7926d;
            if (velocityTracker2 != null) {
                velocityTracker2.computeCurrentVelocity(1000);
            }
            VelocityTracker velocityTracker3 = this.f7926d;
            float yVelocity = velocityTracker3 != null ? velocityTracker3.getYVelocity() : 0.0f;
            if (Math.abs(yVelocity) > 0) {
                int a = this.h.a() * (this.h.b() - 1);
                int a2 = (int) (this.h.a() * 0.4d);
                this.f7925c = true;
                if (this.h.j()) {
                    fling(0, this.a, 0, ((int) (-yVelocity)) / 2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
                } else {
                    fling(0, this.a, 0, ((int) (-yVelocity)) / 2, 0, 0, 0, a, 0, a2);
                }
                this.h.invalidate();
            } else if (this.f7927e) {
                e();
            } else {
                float y = motionEvent.getY() - (this.h.getHeight() / 2.0f);
                if (Math.abs(y) > 1) {
                    this.f7925c = true;
                    startScroll(0, this.a, 0, (int) y, 200);
                    this.h.invalidate();
                }
            }
            VelocityTracker velocityTracker4 = this.f7926d;
            if (velocityTracker4 != null) {
                velocityTracker4.recycle();
            }
            this.f7926d = null;
            ViewParent parent2 = this.h.getParent();
            if (parent2 != null) {
                parent2.requestDisallowInterceptTouchEvent(false);
            }
        } else if (action == 2) {
            float y2 = motionEvent.getY();
            int i = (int) (y2 - this.b);
            if (i != 0) {
                this.f7927e = true;
                b(-i, "touchEvent");
                this.h.invalidate();
            }
            this.b = y2;
        } else if (action == 3) {
            if (this.f7927e) {
                e();
            }
            VelocityTracker velocityTracker5 = this.f7926d;
            if (velocityTracker5 != null) {
                velocityTracker5.recycle();
            }
            this.f7926d = null;
            this.f7927e = false;
            ViewParent parent3 = this.h.getParent();
            if (parent3 != null) {
                parent3.requestDisallowInterceptTouchEvent(false);
            }
        }
        return true;
    }

    public final void h() {
        this.f7925c = false;
        this.a = 0;
        this.f7929g = -1;
        f("reset");
        forceFinished(true);
    }

    public final void i(int i, boolean z) {
        int a = this.h.a() * i;
        int i2 = this.a;
        int i3 = a - i2;
        if (i3 == 0) {
            return;
        }
        if (!z) {
            b(i3, "setCurrentIndex");
            this.h.invalidate();
        } else {
            this.f7925c = true;
            startScroll(0, i2, 0, i3, 200);
            this.h.invalidate();
        }
    }

    public final void j(a aVar) {
        this.f7928f = aVar;
    }
}
