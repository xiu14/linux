package com.obric.oui.common.util;

import android.view.MotionEvent;
import android.view.TouchDelegate;
import androidx.core.app.NotificationCompat;
import java.util.List;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
public final class a extends TouchDelegate {
    private final List<TouchDelegate> a;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public a(android.view.View r1, android.graphics.Rect r2, int r3) {
        /*
            r0 = this;
            r2 = r3 & 2
            if (r2 == 0) goto La
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            goto Lb
        La:
            r2 = 0
        Lb:
            java.lang.String r3 = "view"
            kotlin.s.c.l.f(r1, r3)
            java.lang.String r3 = "emptyRect"
            kotlin.s.c.l.f(r2, r3)
            r0.<init>(r2, r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.a = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obric.oui.common.util.a.<init>(android.view.View, android.graphics.Rect, int):void");
    }

    public final void a(TouchDelegate touchDelegate) {
        l.f(touchDelegate, "delegate");
        this.a.add(touchDelegate);
    }

    @Override // android.view.TouchDelegate
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        l.f(motionEvent, NotificationCompat.CATEGORY_EVENT);
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        while (true) {
            for (TouchDelegate touchDelegate : this.a) {
                motionEvent.setLocation(x, y);
                z = touchDelegate.onTouchEvent(motionEvent) || z;
            }
            return z;
        }
    }
}
