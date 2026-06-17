package ms.bd.c;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes2.dex */
public final class b1 implements IInterface {
    public final IBinder a;

    public b1(IBinder iBinder) {
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
            obtain.writeInterfaceToken((String) y2.a(16777217, 0, 0L, "5f5012", new byte[]{39, 107, 75, 10, 27, 42, 50, 78, 119, 46, 43, 116, 67, 74, 10, 32, 32, 78, 103, 101, 106, 101, 79, 64, 2, 107, 25, 87, 97, 110, 0, 97, 80, 77, 13, 32, 31, 67, 97, 110, 48, 109, 64, 77, 11, 55, 5, 66, 118, 118, 45, 103, 67}));
        } catch (Throwable th) {
            th = th;
        }
        try {
            this.a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            str = obtain2.readString();
        } catch (Throwable th2) {
            th = th2;
            obtain.recycle();
            obtain2.recycle();
            th.printStackTrace();
            str = null;
            obtain.recycle();
            obtain2.recycle();
            return str;
        }
        obtain.recycle();
        obtain2.recycle();
        return str;
    }
}
