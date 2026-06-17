package ms.bd.c;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* loaded from: classes2.dex */
public final class h3 implements ServiceConnection {
    public final /* synthetic */ i3 a;

    public h3(i3 i3Var) {
        this.a = i3Var;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        i3 i3Var = this.a;
        i3Var.f10391c = new j3(iBinder);
        i3Var.f10392d.countDown();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        i3 i3Var = this.a;
        i3Var.f10391c = null;
        i3Var.f10392d.countDown();
    }
}
