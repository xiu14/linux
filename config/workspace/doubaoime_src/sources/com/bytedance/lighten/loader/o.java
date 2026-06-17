package com.bytedance.lighten.loader;

import com.bytedance.lighten.core.ScaleType;
import com.facebook.drawee.drawable.q;

/* loaded from: classes.dex */
class o {
    private static final q a = q.f6392g;

    public static q a(ScaleType scaleType) {
        q qVar = a;
        switch (scaleType) {
            case FIT_XY:
                return q.a;
            case FIT_START:
                return q.b;
            case FIT_CENTER:
                return q.f6388c;
            case FIT_END:
                return q.f6389d;
            case CENTER:
                return q.f6390e;
            case CENTER_INSIDE:
                return q.f6391f;
            case CENTER_CROP:
                return q.f6392g;
            case FOCUS_CROP:
                return q.h;
            default:
                return qVar;
        }
    }
}
