package ms.bd.c;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Parcel;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class e0 implements ServiceConnection {
    public final CountDownLatch a = new CountDownLatch(1);
    public IBinder b;

    public final String a() {
        if (!this.a.await(10L, TimeUnit.SECONDS)) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken((String) y2.a(16777217, 0, 0L, "d9c350", new byte[]{118, 52, 29, 9, 13, 40, 104, 31, 62, 102, 59, 58, 30, 67, 24, 40, 110, 28, 124, 100, 120, 40, 94, 70, 14, 52, 41, 17, 54, 102, 123, 47, 25, 65, 3, 34, 117, 86, 59, 109, 97, 62, 2, 73, 11, 43, 41, 49, 19, 103, 99, 62, 2, 83, 3, 52, 110, 22, 53, 74, 113, 8, 21, 85, 28, 46, 100, 29}));
            this.b.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readString();
        } catch (Exception unused) {
            return null;
        } finally {
            obtain.recycle();
            obtain2.recycle();
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.b = iBinder;
        this.a.countDown();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.b = null;
    }
}
