package com.obric.oui.segmentedtab;

import android.view.MotionEvent;
import android.view.View;
import androidx.core.app.NotificationCompat;
import java.util.Objects;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
final class a implements View.OnTouchListener {
    final /* synthetic */ OTabSegmentedLayout a;

    a(OTabSegmentedLayout oTabSegmentedLayout) {
        this.a = oTabSegmentedLayout;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        l.e(motionEvent, NotificationCompat.CATEGORY_EVENT);
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1 && action != 3) {
                return false;
            }
            this.a.f7981f = -1;
            this.a.postInvalidate();
            return false;
        }
        OTabSegmentedLayout oTabSegmentedLayout = this.a;
        l.e(view, "v");
        Object tag = view.getTag();
        Objects.requireNonNull(tag, "null cannot be cast to non-null type kotlin.Int");
        oTabSegmentedLayout.f7981f = ((Integer) tag).intValue();
        this.a.postInvalidate();
        return false;
    }
}
