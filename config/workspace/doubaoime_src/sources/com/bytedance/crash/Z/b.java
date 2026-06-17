package com.bytedance.crash.Z;

import android.app.ApplicationExitInfo;
import java.util.Comparator;

/* loaded from: classes.dex */
final class b implements Comparator<ApplicationExitInfo> {
    b() {
    }

    @Override // java.util.Comparator
    public int compare(ApplicationExitInfo applicationExitInfo, ApplicationExitInfo applicationExitInfo2) {
        long timestamp = applicationExitInfo2.getTimestamp() - applicationExitInfo.getTimestamp();
        if (timestamp > 0) {
            return 1;
        }
        return timestamp == 0 ? 0 : -1;
    }
}
