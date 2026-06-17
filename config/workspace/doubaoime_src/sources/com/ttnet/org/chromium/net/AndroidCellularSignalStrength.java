package com.ttnet.org.chromium.net;

import J.N;
import android.annotation.TargetApi;
import android.os.Handler;
import android.os.HandlerThread;
import android.telephony.PhoneStateListener;
import android.telephony.SignalStrength;
import android.telephony.TelephonyManager;
import com.ttnet.org.chromium.base.ApplicationStatus;
import com.ttnet.org.chromium.base.ThreadUtils;
import com.ttnet.org.chromium.base.annotations.CalledByNative;
import java.util.Objects;

/* loaded from: classes2.dex */
public class AndroidCellularSignalStrength {
    private static final AndroidCellularSignalStrength b = new AndroidCellularSignalStrength();
    private volatile int a = Integer.MIN_VALUE;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AndroidCellularSignalStrength.this.new b();
        }
    }

    private class b extends PhoneStateListener implements ApplicationStatus.b {
        private final TelephonyManager a;

        b() {
            int i = ThreadUtils.f8559c;
            TelephonyManager telephonyManager = (TelephonyManager) com.ttnet.org.chromium.base.c.b().getSystemService("phone");
            this.a = telephonyManager;
            if (telephonyManager.getSimState() != 5) {
                return;
            }
            ApplicationStatus.d(this);
            int stateForApplication = ApplicationStatus.getStateForApplication();
            if (stateForApplication == 1) {
                telephonyManager.listen(this, 256);
            } else if (stateForApplication == 2) {
                AndroidCellularSignalStrength.this.a = Integer.MIN_VALUE;
                telephonyManager.listen(this, 0);
            }
        }

        @Override // android.telephony.PhoneStateListener
        @TargetApi(23)
        public void onSignalStrengthsChanged(SignalStrength signalStrength) {
            if (ApplicationStatus.getStateForApplication() != 1) {
                return;
            }
            try {
                AndroidCellularSignalStrength.this.a = signalStrength.getLevel();
            } catch (SecurityException unused) {
                AndroidCellularSignalStrength.this.a = Integer.MIN_VALUE;
            }
        }
    }

    private AndroidCellularSignalStrength() {
        Objects.requireNonNull(v.a());
        if (N.MaSRwBiO()) {
            return;
        }
        HandlerThread handlerThread = new HandlerThread("AndroidCellularSignalStrength");
        handlerThread.start();
        new Handler(handlerThread.getLooper()).post(new a());
    }

    @CalledByNative
    @TargetApi(23)
    private static int getSignalStrengthLevel() {
        return b.a;
    }
}
