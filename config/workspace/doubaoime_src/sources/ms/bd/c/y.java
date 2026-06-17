package ms.bd.c;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* loaded from: classes2.dex */
public final class y implements ServiceConnection {
    public final /* synthetic */ z a;

    public y(z zVar) {
        this.a = zVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            this.a.f10483c.put(iBinder);
        } catch (Exception unused) {
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
