package ms.bd.c;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* loaded from: classes2.dex */
public final class r1 implements ServiceConnection {
    public final /* synthetic */ s1 a;

    public r1(s1 s1Var) {
        this.a = s1Var;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.a.b = new t1(iBinder);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
