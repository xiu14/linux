package e.c.e.d;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewConfiguration;

/* loaded from: classes2.dex */
public class a {
    final float b;

    /* renamed from: e, reason: collision with root package name */
    long f9800e;

    /* renamed from: f, reason: collision with root package name */
    float f9801f;

    /* renamed from: g, reason: collision with root package name */
    float f9802g;
    InterfaceC0449a a = null;

    /* renamed from: c, reason: collision with root package name */
    boolean f9798c = false;

    /* renamed from: d, reason: collision with root package name */
    boolean f9799d = false;

    /* renamed from: e.c.e.d.a$a, reason: collision with other inner class name */
    public interface InterfaceC0449a {
    }

    public a(Context context) {
        this.b = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    public void a() {
        this.a = null;
        this.f9798c = false;
        this.f9799d = false;
    }

    public boolean b() {
        return this.f9798c;
    }

    public boolean c(MotionEvent motionEvent) {
        InterfaceC0449a interfaceC0449a;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f9798c = true;
            this.f9799d = true;
            this.f9800e = motionEvent.getEventTime();
            this.f9801f = motionEvent.getX();
            this.f9802g = motionEvent.getY();
        } else if (action == 1) {
            this.f9798c = false;
            if (Math.abs(motionEvent.getX() - this.f9801f) > this.b || Math.abs(motionEvent.getY() - this.f9802g) > this.b) {
                this.f9799d = false;
            }
            if (this.f9799d && motionEvent.getEventTime() - this.f9800e <= ViewConfiguration.getLongPressTimeout() && (interfaceC0449a = this.a) != null) {
                ((com.facebook.drawee.controller.a) interfaceC0449a).G();
            }
            this.f9799d = false;
        } else if (action != 2) {
            if (action == 3) {
                this.f9798c = false;
                this.f9799d = false;
            }
        } else if (Math.abs(motionEvent.getX() - this.f9801f) > this.b || Math.abs(motionEvent.getY() - this.f9802g) > this.b) {
            this.f9799d = false;
        }
        return true;
    }

    public void d() {
        this.f9798c = false;
        this.f9799d = false;
    }

    public void e(InterfaceC0449a interfaceC0449a) {
        this.a = interfaceC0449a;
    }
}
