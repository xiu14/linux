package ms.bd.c;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes2.dex */
public final class j3 implements IInterface {
    public final IBinder a;

    public j3(IBinder iBinder) {
        this.a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.a;
    }
}
