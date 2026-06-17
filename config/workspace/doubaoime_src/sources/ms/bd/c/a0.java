package ms.bd.c;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes2.dex */
public final class a0 implements IInterface {
    public final IBinder a;

    public a0(IBinder iBinder) {
        this.a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.a;
    }

    public final String d() {
        String str;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken((String) y2.a(16777217, 0, 0L, "2fa033", new byte[]{32, 107, 31, 10, 14, 49, 63, 9, 60, 105, 33, 42, 63, 87, 13, 13, 53, 110, 62, 116, 38, 118, 20, 69, 15, 33}));
            this.a.transact(3, obtain, obtain2, 0);
            obtain2.readException();
            str = obtain2.readString();
        } catch (Throwable unused) {
            obtain2.recycle();
            obtain.recycle();
            str = null;
        }
        obtain2.recycle();
        obtain.recycle();
        return str;
    }
}
