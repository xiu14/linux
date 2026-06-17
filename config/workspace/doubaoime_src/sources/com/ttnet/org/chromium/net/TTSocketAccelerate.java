package com.ttnet.org.chromium.net;

import J.N;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import androidx.core.app.NotificationManagerCompat;
import com.ttnet.org.chromium.base.annotations.CalledByNative;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public class TTSocketAccelerate {
    private long a = 0;

    protected TTSocketAccelerate() {
    }

    @CalledByNative
    public static TTSocketAccelerate init() {
        return new TTSocketAccelerate();
    }

    @CalledByNative
    public void checkSystemAvailable() {
        if (this.a == 0) {
            return;
        }
        if (!Build.MANUFACTURER.toLowerCase().contains("honor") && !Build.BRAND.toLowerCase().contains("honor")) {
            N.MXvQH$ie(this.a, this, -1002);
        } else if (Build.VERSION.SDK_INT < 29) {
            N.MXvQH$ie(this.a, this, -1003);
        } else {
            N.MXvQH$ie(this.a, this, 0);
        }
    }

    @CalledByNative
    public void notifyAccelerate(int i, int i2, int i3) {
        try {
            Method method = Class.forName("com.hihonor.android.emcom.EmcomManagerEx").getMethod("notifyAppInfo", Bundle.class);
            Log.e("SA", "notify scene:" + i + " value: " + i2 + " fd:" + i3);
            Bundle bundle = new Bundle();
            bundle.putInt("msgType", 49);
            bundle.putInt("scene", 16);
            bundle.putInt("subscene", i2);
            bundle.putInt("status", 1);
            bundle.putInt("accStatus", 3);
            bundle.putString("KFD", "" + i3);
            method.invoke(null, bundle);
            N.MOfWrYJI(this.a, this, i, 0);
        } catch (Throwable th) {
            th.printStackTrace();
            N.MOfWrYJI(this.a, this, i, NotificationManagerCompat.IMPORTANCE_UNSPECIFIED);
        }
    }

    @CalledByNative
    public void setNativeDelegate(long j) {
        this.a = j;
    }
}
