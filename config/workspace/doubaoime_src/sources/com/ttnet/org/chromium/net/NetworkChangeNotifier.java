package com.ttnet.org.chromium.net;

import J.N;
import android.annotation.SuppressLint;
import androidx.annotation.VisibleForTesting;
import com.ttnet.org.chromium.base.annotations.CalledByNative;
import com.ttnet.org.chromium.net.NetworkChangeNotifierAutoDetect;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class NetworkChangeNotifier {

    /* renamed from: f, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static NetworkChangeNotifier f8606f;

    /* renamed from: c, reason: collision with root package name */
    private NetworkChangeNotifierAutoDetect f8607c;

    /* renamed from: d, reason: collision with root package name */
    private int f8608d = 0;

    /* renamed from: e, reason: collision with root package name */
    private int f8609e = 0;
    private final ArrayList<Long> a = new ArrayList<>();
    private final com.ttnet.org.chromium.base.g<b> b = new com.ttnet.org.chromium.base.g<>();

    class a implements NetworkChangeNotifierAutoDetect.g {
        a() {
        }
    }

    public interface b {
        void a(int i);
    }

    @VisibleForTesting
    protected NetworkChangeNotifier() {
    }

    static void a(NetworkChangeNotifier networkChangeNotifier, int i) {
        networkChangeNotifier.f8608d = i;
        networkChangeNotifier.f(i, networkChangeNotifier.getCurrentDefaultNetId());
    }

    private void f(int i, long j) {
        Iterator<Long> it2 = this.a.iterator();
        while (it2.hasNext()) {
            N.MjJzrRFH(it2.next().longValue(), this, i, j);
        }
        Iterator<b> it3 = this.b.iterator();
        while (it3.hasNext()) {
            it3.next().a(i);
        }
    }

    @CalledByNative
    @VisibleForTesting
    public static void fakeConnectionCostChanged(int i) {
        setAutoDetectConnectivityState(false);
        f8606f.c(i);
    }

    @CalledByNative
    public static void fakeConnectionSubtypeChanged(int i) {
        setAutoDetectConnectivityState(false);
        f8606f.d(i);
    }

    @CalledByNative
    public static void fakeDefaultNetwork(long j, int i) {
        setAutoDetectConnectivityState(false);
        f8606f.f(i, j);
    }

    @CalledByNative
    public static void fakeNetworkConnected(long j, int i) {
        setAutoDetectConnectivityState(false);
        f8606f.g(j, i, false);
    }

    @CalledByNative
    public static void fakeNetworkDisconnected(long j) {
        setAutoDetectConnectivityState(false);
        f8606f.h(j, false);
    }

    @CalledByNative
    public static void fakeNetworkSoonToBeDisconnected(long j) {
        setAutoDetectConnectivityState(false);
        f8606f.i(j);
    }

    @CalledByNative
    public static void fakePurgeActiveNetworkList(long[] jArr) {
        setAutoDetectConnectivityState(false);
        f8606f.j(jArr);
    }

    @CalledByNative
    public static void forceConnectivityState(boolean z) {
        setAutoDetectConnectivityState(false);
        NetworkChangeNotifier networkChangeNotifier = f8606f;
        if ((networkChangeNotifier.f8608d != 6) != z) {
            networkChangeNotifier.m(z ? 0 : 6);
            networkChangeNotifier.d(!z ? 1 : 0);
        }
    }

    @CalledByNative
    public static void forceUpdateNetworkTypeInfo() {
        NetworkChangeNotifier networkChangeNotifier = f8606f;
        NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect = networkChangeNotifier.f8607c;
        if (networkChangeNotifierAutoDetect != null) {
            NetworkChangeNotifierAutoDetect.f o = networkChangeNotifierAutoDetect.o();
            if (networkChangeNotifier.f8608d != o.c()) {
                networkChangeNotifier.f8608d = o.c();
                networkChangeNotifier.f8607c.w(new o(networkChangeNotifier));
            }
        }
    }

    @CalledByNative
    public static NetworkChangeNotifier init() {
        if (f8606f == null) {
            f8606f = new NetworkChangeNotifier();
        }
        return f8606f;
    }

    public static void k() {
        f8606f.l(true, new s());
    }

    private void l(boolean z, NetworkChangeNotifierAutoDetect.h hVar) {
        if (!z) {
            NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect = this.f8607c;
            if (networkChangeNotifierAutoDetect != null) {
                networkChangeNotifierAutoDetect.m();
                this.f8607c = null;
                return;
            }
            return;
        }
        if (this.f8607c == null) {
            NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect2 = new NetworkChangeNotifierAutoDetect(new a(), hVar);
            this.f8607c = networkChangeNotifierAutoDetect2;
            NetworkChangeNotifierAutoDetect.f o = networkChangeNotifierAutoDetect2.o();
            m(o.c());
            int a2 = o.a();
            this.f8609e = a2;
            c(a2);
            d(o.b());
        }
    }

    private void m(int i) {
        this.f8608d = i;
        f(i, getCurrentDefaultNetId());
    }

    @CalledByNative
    public static void setAutoDetectConnectivityState(boolean z) {
        f8606f.l(z, new t());
    }

    @CalledByNative
    public void addNativeObserver(long j) {
        this.a.add(Long.valueOf(j));
    }

    void c(int i) {
        Iterator<Long> it2 = this.a.iterator();
        while (it2.hasNext()) {
            N.MZnuk2LK(it2.next().longValue(), this, i);
        }
    }

    void d(int i) {
        Iterator<Long> it2 = this.a.iterator();
        while (it2.hasNext()) {
            N.MqNJnYjG(it2.next().longValue(), this, i);
        }
    }

    void e(int i) {
        f(i, getCurrentDefaultNetId());
    }

    void g(long j, int i, boolean z) {
        Iterator<Long> it2 = this.a.iterator();
        while (it2.hasNext()) {
            N.MZ5e75rQ(it2.next().longValue(), this, j, z, i);
        }
    }

    @CalledByNative
    public int getCurrentConnectionCost() {
        return this.f8609e;
    }

    @CalledByNative
    public int getCurrentConnectionSubtype() {
        NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect = this.f8607c;
        if (networkChangeNotifierAutoDetect == null) {
            return 0;
        }
        return networkChangeNotifierAutoDetect.o().b();
    }

    @CalledByNative
    public int getCurrentConnectionType() {
        return this.f8608d;
    }

    @CalledByNative
    public long getCurrentDefaultNetId() {
        NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect = this.f8607c;
        if (networkChangeNotifierAutoDetect == null) {
            return -1L;
        }
        return networkChangeNotifierAutoDetect.p();
    }

    @CalledByNative
    public long[] getCurrentNetworksAndTypes() {
        NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect = this.f8607c;
        return networkChangeNotifierAutoDetect == null ? new long[0] : networkChangeNotifierAutoDetect.q();
    }

    @CalledByNative
    public long getCurrentVpnNetId() {
        NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect = this.f8607c;
        if (networkChangeNotifierAutoDetect == null) {
            return -1L;
        }
        return networkChangeNotifierAutoDetect.r();
    }

    void h(long j, boolean z) {
        Iterator<Long> it2 = this.a.iterator();
        while (it2.hasNext()) {
            N.Ms7JLaGI(it2.next().longValue(), this, z, j);
        }
    }

    void i(long j) {
        Iterator<Long> it2 = this.a.iterator();
        while (it2.hasNext()) {
            N.MssT8yD3(it2.next().longValue(), this, j);
        }
    }

    void j(long[] jArr) {
        Iterator<Long> it2 = this.a.iterator();
        while (it2.hasNext()) {
            N.Mvng38R0(it2.next().longValue(), this, jArr);
        }
    }

    @CalledByNative
    public boolean registerNetworkCallbackFailed() {
        NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect = this.f8607c;
        if (networkChangeNotifierAutoDetect == null) {
            return false;
        }
        return networkChangeNotifierAutoDetect.v();
    }

    @CalledByNative
    public void removeNativeObserver(long j) {
        this.a.remove(Long.valueOf(j));
    }
}
