package ms.bd.c;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* loaded from: classes2.dex */
public final class v3 implements ServiceConnection {
    public final /* synthetic */ w3 a;

    public v3(w3 w3Var) {
        this.a = w3Var;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            this.a.b.put(iBinder);
        } catch (Exception unused) {
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
