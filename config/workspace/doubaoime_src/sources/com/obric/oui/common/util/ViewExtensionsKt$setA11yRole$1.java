package com.obric.oui.common.util;

import android.view.View;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;

/* loaded from: classes2.dex */
public final class ViewExtensionsKt$setA11yRole$1 extends AccessibilityDelegateCompat {
    @Override // androidx.core.view.AccessibilityDelegateCompat
    public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
        if (accessibilityNodeInfoCompat != null) {
            accessibilityNodeInfoCompat.setRoleDescription(null);
        }
    }
}
