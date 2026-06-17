package com.bytedance.feedbackerlib.util;

import android.os.SystemClock;
import com.bytedance.feedbackerlib.manager.z;
import com.bytedance.framwork.core.sdkmonitor.f;

/* loaded from: classes.dex */
final class j implements Runnable {

    class a implements f.j {
        a(j jVar) {
        }

        @Override // com.bytedance.framwork.core.sdkmonitor.f.j
        public void callback(boolean z) {
        }
    }

    class b implements f.j {
        b(j jVar) {
        }

        @Override // com.bytedance.framwork.core.sdkmonitor.f.j
        public void callback(boolean z) {
        }
    }

    j() {
    }

    @Override // java.lang.Runnable
    public void run() {
        for (int i = 0; i < 5; i++) {
            z.b().z(new a(this));
            SystemClock.sleep(2000L);
        }
        z.b().B(new b(this));
    }
}
