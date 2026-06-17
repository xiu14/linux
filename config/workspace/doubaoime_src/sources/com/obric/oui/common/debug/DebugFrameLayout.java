package com.obric.oui.common.debug;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import e.a.a.a.a;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
public final class DebugFrameLayout extends FrameLayout {
    public DebugFrameLayout(Context context) {
        this(context, null);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int i5 = i3 - i;
        StringBuilder O = a.O("Layout left: ", i, ", top: ", i2, ", right: ");
        O.append(i3);
        O.append(", bottom: ");
        O.append(i4);
        String sb = O.toString();
        l.f("DebugFrameLayout onLayout", "tag");
        l.f(sb, "msg");
        Log.d("DebugFrameLayout onLayout", sb);
        String str = "Layout width: " + i5 + ", height: " + (i4 - i2);
        l.f("DebugFrameLayout onLayout", "tag");
        l.f(str, "msg");
        Log.d("DebugFrameLayout onLayout", str);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        String str = GrsBaseInfo.CountryCodeSource.UNKNOWN;
        String str2 = mode != Integer.MIN_VALUE ? mode != 0 ? mode != 1073741824 ? GrsBaseInfo.CountryCodeSource.UNKNOWN : "EXACTLY" : "UNSPECIFIED" : "AT_MOST";
        if (mode2 == Integer.MIN_VALUE) {
            str = "AT_MOST";
        } else if (mode2 == 0) {
            str = "UNSPECIFIED";
        } else if (mode2 == 1073741824) {
            str = "EXACTLY";
        }
        StringBuilder V = a.V("Width mode: ", str2, ", width size: ", size, ", measured width: ");
        V.append(measuredWidth);
        String sb = V.toString();
        l.f("DebugFrameLayout onMeasure", "tag");
        l.f(sb, "msg");
        Log.d("DebugFrameLayout onMeasure", sb);
        String str3 = "Height mode: " + str + ", height size: " + size2 + ", measured height: " + measuredHeight;
        l.f("DebugFrameLayout onMeasure", "tag");
        l.f(str3, "msg");
        Log.d("DebugFrameLayout onMeasure", str3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DebugFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        l.f(context, "context");
    }
}
