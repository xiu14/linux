package com.obric.oui.banner;

import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.AccessibilityDelegateCompat;

/* loaded from: classes2.dex */
public final class OBanner$initViewPager2$2 extends AccessibilityDelegateCompat {
    @Override // androidx.core.view.AccessibilityDelegateCompat
    public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent == null || accessibilityEvent.getEventType() != 4096) {
            return super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        }
        throw null;
    }
}
