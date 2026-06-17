package ms.bd.c;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* loaded from: classes2.dex */
public final class d1 implements ServiceConnection {
    public final /* synthetic */ f1 a;

    public d1(f1 f1Var) {
        this.a = f1Var;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            this.a.f10372c.put(iBinder);
        } catch (Exception unused) {
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
