package com.bytedance.android.input.basic.recognition.accessibilityImpl;

import android.accessibilityservice.AccessibilityService;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.app.NotificationCompat;
import kotlin.o;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public final class ImeAccessibilityService extends AccessibilityService {
    private static kotlin.s.b.a<o> a;

    @Override // android.accessibilityservice.AccessibilityService
    public void onAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        l.f(accessibilityEvent, NotificationCompat.CATEGORY_EVENT);
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // android.accessibilityservice.AccessibilityService
    public void onInterrupt() {
    }

    @Override // android.accessibilityservice.AccessibilityService
    protected void onServiceConnected() {
    }
}
