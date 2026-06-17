package ms.bd.c;

import android.net.ConnectivityManager;
import android.net.Network;

/* loaded from: classes2.dex */
public final class o2 extends ConnectivityManager.NetworkCallback {
    public final /* synthetic */ q2 a;

    public o2(q2 q2Var) {
        this.a = q2Var;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        p2 p2Var = this.a.a;
        if (p2Var != null) {
            p2Var.a(true);
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        p2 p2Var = this.a.a;
        if (p2Var != null) {
            p2Var.a(false);
        }
    }
}
