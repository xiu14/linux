package com.facebook.drawee.view;

import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import com.facebook.drawee.components.DraweeEventTracker;
import com.facebook.drawee.drawable.D;
import com.facebook.drawee.drawable.E;
import e.c.c.d.h;
import e.c.e.e.b;
import java.util.Objects;

/* loaded from: classes2.dex */
public class b<DH extends e.c.e.e.b> implements E {

    /* renamed from: d, reason: collision with root package name */
    private DH f6419d;
    private boolean a = false;
    private boolean b = false;

    /* renamed from: c, reason: collision with root package name */
    private boolean f6418c = true;

    /* renamed from: e, reason: collision with root package name */
    private e.c.e.e.a f6420e = null;

    /* renamed from: f, reason: collision with root package name */
    private final DraweeEventTracker f6421f = DraweeEventTracker.a();

    public b(DH dh) {
        if (dh != null) {
            n(dh);
        }
    }

    private void a() {
        if (this.a) {
            return;
        }
        this.f6421f.b(DraweeEventTracker.Event.ON_ATTACH_CONTROLLER);
        this.a = true;
        e.c.e.e.a aVar = this.f6420e;
        if (aVar == null || ((com.facebook.drawee.controller.a) aVar).p() == null) {
            return;
        }
        ((com.facebook.drawee.controller.a) this.f6420e).F();
    }

    private void b() {
        if (this.b && this.f6418c) {
            a();
        } else {
            c();
        }
    }

    private void c() {
        if (this.a) {
            this.f6421f.b(DraweeEventTracker.Event.ON_DETACH_CONTROLLER);
            this.a = false;
            if (g()) {
                ((com.facebook.drawee.controller.a) this.f6420e).H();
            }
        }
    }

    public e.c.e.e.a d() {
        return this.f6420e;
    }

    public DH e() {
        DH dh = this.f6419d;
        Objects.requireNonNull(dh);
        return dh;
    }

    public Drawable f() {
        DH dh = this.f6419d;
        if (dh == null) {
            return null;
        }
        return dh.f();
    }

    public boolean g() {
        e.c.e.e.a aVar = this.f6420e;
        return aVar != null && ((com.facebook.drawee.controller.a) aVar).p() == this.f6419d;
    }

    public void h() {
        this.f6421f.b(DraweeEventTracker.Event.ON_HOLDER_ATTACH);
        this.b = true;
        b();
    }

    public void i() {
        this.f6421f.b(DraweeEventTracker.Event.ON_HOLDER_DETACH);
        this.b = false;
        b();
    }

    public void j() {
        if (this.a) {
            return;
        }
        e.c.c.e.a.v(DraweeEventTracker.class, "%x: Draw requested for a non-attached controller %x. %s", Integer.valueOf(System.identityHashCode(this)), Integer.valueOf(System.identityHashCode(this.f6420e)), toString());
        this.b = true;
        this.f6418c = true;
        b();
    }

    public boolean k(MotionEvent motionEvent) {
        if (g()) {
            return ((com.facebook.drawee.controller.a) this.f6420e).L(motionEvent);
        }
        return false;
    }

    public void l(boolean z) {
        if (this.f6418c == z) {
            return;
        }
        this.f6421f.b(z ? DraweeEventTracker.Event.ON_DRAWABLE_SHOW : DraweeEventTracker.Event.ON_DRAWABLE_HIDE);
        this.f6418c = z;
        b();
    }

    public void m(e.c.e.e.a aVar) {
        boolean z = this.a;
        if (z) {
            c();
        }
        if (g()) {
            this.f6421f.b(DraweeEventTracker.Event.ON_CLEAR_OLD_CONTROLLER);
            this.f6420e.a(null);
        }
        this.f6420e = aVar;
        if (aVar != null) {
            this.f6421f.b(DraweeEventTracker.Event.ON_SET_CONTROLLER);
            this.f6420e.a(this.f6419d);
        } else {
            this.f6421f.b(DraweeEventTracker.Event.ON_CLEAR_CONTROLLER);
        }
        if (z) {
            a();
        }
    }

    public void n(DH dh) {
        this.f6421f.b(DraweeEventTracker.Event.ON_SET_HIERARCHY);
        boolean g2 = g();
        Object f2 = f();
        if (f2 instanceof D) {
            ((D) f2).k(null);
        }
        Objects.requireNonNull(dh);
        this.f6419d = dh;
        Drawable f3 = dh.f();
        l(f3 == null || f3.isVisible());
        Object f4 = f();
        if (f4 instanceof D) {
            ((D) f4).k(this);
        }
        if (g2) {
            this.f6420e.a(dh);
        }
    }

    public String toString() {
        h.b k = h.k(this);
        k.c("controllerAttached", this.a);
        k.c("holderAttached", this.b);
        k.c("drawableVisible", this.f6418c);
        k.b("events", this.f6421f.toString());
        return k.toString();
    }
}
