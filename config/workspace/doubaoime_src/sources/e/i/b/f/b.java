package e.i.b.f;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import java.util.Objects;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
public final class b {
    public static final boolean a(Context context) {
        l.f(context, "context");
        Object systemService = context.getSystemService("connectivity");
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
        Network activeNetwork = connectivityManager.getActiveNetwork();
        if (activeNetwork == null) {
            return false;
        }
        l.e(activeNetwork, "connectivityManager.activeNetwork ?: return false");
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
        if (networkCapabilities == null) {
            return false;
        }
        l.e(networkCapabilities, "connectivityManager.getN…          ?: return false");
        return networkCapabilities.hasTransport(1) || networkCapabilities.hasTransport(0) || networkCapabilities.hasTransport(3);
    }
}
