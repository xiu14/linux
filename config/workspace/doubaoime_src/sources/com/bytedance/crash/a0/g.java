package com.bytedance.crash.a0;

import android.content.Context;
import android.content.IntentFilter;
import com.bytedance.crash.C0652g;
import java.util.Objects;

/* loaded from: classes.dex */
public class g {

    static class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            e c2 = e.c();
            Objects.requireNonNull(c2);
            Context g2 = C0652g.g();
            if (g2 == null) {
                return;
            }
            try {
                g2.registerReceiver(new d(c2), new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            } catch (Exception unused) {
            }
        }
    }

    public static void a() {
        com.bytedance.crash.runtime.b.d(new a());
    }
}
