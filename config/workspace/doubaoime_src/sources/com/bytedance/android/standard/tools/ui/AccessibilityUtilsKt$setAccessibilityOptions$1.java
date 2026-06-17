package com.bytedance.android.standard.tools.ui;

import android.view.View;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.ss.android.socialbase.downloader.constants.DBDefinition;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public final class AccessibilityUtilsKt$setAccessibilityOptions$1 extends AccessibilityDelegateCompat {
    @Override // androidx.core.view.AccessibilityDelegateCompat
    public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        l.g(view, "host");
        l.g(accessibilityNodeInfoCompat, DBDefinition.SEGMENT_INFO);
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
        throw null;
    }
}
