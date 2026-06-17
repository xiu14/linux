package com.ttnet.org.chromium.net;

import J.N;
import android.net.ConnectivityManager;
import com.ttnet.org.chromium.base.annotations.CalledByNative;

/* loaded from: classes2.dex */
public class NetworkActiveNotifier implements ConnectivityManager.OnNetworkActiveListener {
    private final ConnectivityManager a = (ConnectivityManager) com.ttnet.org.chromium.base.c.b().getSystemService("connectivity");
    private final long b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f8605c;

    private NetworkActiveNotifier(long j) {
        this.b = j;
    }

    @CalledByNative
    public static NetworkActiveNotifier build(long j) {
        return new NetworkActiveNotifier(j);
    }

    @CalledByNative
    public void disableNotifications() {
        this.f8605c = false;
        this.a.removeDefaultNetworkActiveListener(this);
    }

    @CalledByNative
    public void enableNotifications() {
        this.f8605c = true;
        this.a.addDefaultNetworkActiveListener(this);
    }

    @CalledByNative
    public void fakeDefaultNetworkActive() {
        if (this.f8605c) {
            onNetworkActive();
        }
    }

    @CalledByNative
    public boolean isDefaultNetworkActive() {
        return this.a.isDefaultNetworkActive();
    }

    @Override // android.net.ConnectivityManager.OnNetworkActiveListener
    public void onNetworkActive() {
        N.M5aI8A5Z(this.b);
    }
}
