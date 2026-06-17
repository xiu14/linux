package com.bytedance.lighten.loader;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes.dex */
class h implements View.OnAttachStateChangeListener, View.OnTouchListener, i {
    com.facebook.drawee.view.b<e.c.e.e.b> a;

    public h(com.facebook.drawee.view.b<e.c.e.e.b> bVar) {
        this.a = bVar;
    }

    @Override // com.bytedance.lighten.loader.i
    public void a(i iVar) {
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        com.facebook.drawee.view.b<e.c.e.e.b> bVar = this.a;
        return bVar != null && bVar.k(motionEvent);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        com.facebook.drawee.view.b<e.c.e.e.b> bVar = this.a;
        if (bVar != null) {
            bVar.h();
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        com.facebook.drawee.view.b<e.c.e.e.b> bVar = this.a;
        if (bVar != null) {
            bVar.i();
        }
    }
}
