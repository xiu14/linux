package ms.bd.c;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes2.dex */
public final class i4 implements ServiceConnection {
    public final CountDownLatch a = new CountDownLatch(1);

    @Override // android.content.ServiceConnection
    public final void onNullBinding(ComponentName componentName) {
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        n1 l1Var;
        if (iBinder == null) {
            String str = m1.a;
            l1Var = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface(m1.a);
            l1Var = (queryLocalInterface == null || !(queryLocalInterface instanceof n1)) ? new l1(iBinder) : (n1) queryLocalInterface;
        }
        j4.f10394c = l1Var;
        this.a.countDown();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        j4.f10394c = null;
        j4.f10395d = false;
    }
}
