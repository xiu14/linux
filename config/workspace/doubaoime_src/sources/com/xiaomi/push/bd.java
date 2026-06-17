package com.xiaomi.push;

import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.ss.android.socialbase.downloader.constants.MonitorConstants;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
class bd extends az {
    private static AtomicReference<bd> a = new AtomicReference<>();

    private bd() {
        super(4, 10L, TimeUnit.SECONDS, AccessibilityNodeInfoCompat.EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_MAX_LENGTH, MonitorConstants.IO);
    }

    static bd a() {
        if (a.get() == null || a.get().isTerminated()) {
            synchronized (bd.class) {
                if (a.get() == null || a.get().isTerminated()) {
                    a.set(new bd());
                }
            }
        }
        return a.get();
    }
}
