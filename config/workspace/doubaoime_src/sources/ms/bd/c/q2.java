package ms.bd.c;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;

/* loaded from: classes2.dex */
public abstract class q2 extends t2 {
    public p2 a;
    public o2 b;

    public static boolean a() {
        ConnectivityManager connectivityManager;
        Network activeNetwork;
        Context context = m2.b.a;
        if (context == null || (connectivityManager = (ConnectivityManager) context.getSystemService((String) y2.a(16777217, 0, 0L, "e85f8e", new byte[]{119, 53, 72, 28, 2, 113, 114, 16, 114, 63, 96, 35}))) == null || (activeNetwork = connectivityManager.getActiveNetwork()) == null) {
            return true;
        }
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
        return networkCapabilities != null && networkCapabilities.hasCapability(12);
    }

    public final void b() {
        ConnectivityManager connectivityManager;
        this.a = new p2() { // from class: ms.bd.c.A
            @Override // ms.bd.c.p2
            public final void a(boolean z) {
                y2.a(150994945, z ? 1 : 0, 0L, null, null);
            }
        };
        Context context = m2.b.a;
        if (context == null || (connectivityManager = (ConnectivityManager) context.getSystemService((String) y2.a(16777217, 0, 0L, "10d4f0", new byte[]{35, 61, 25, 78, 92, 36, 38, 24, 35, 109, 52, 43}))) == null) {
            return;
        }
        if (this.b == null) {
            this.b = new o2(this);
        }
        connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().addCapability(12).build(), this.b);
    }
}
