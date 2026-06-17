package ms.bd.c;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* renamed from: ms.bd.c.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ServiceConnectionC0830a implements ServiceConnection {
    public final /* synthetic */ C0831b a;

    public ServiceConnectionC0830a(C0831b c0831b) {
        this.a = c0831b;
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
