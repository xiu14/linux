package ms.bd.c;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes2.dex */
public final class x3 implements IInterface {
    public final IBinder a;

    public x3(IBinder iBinder) {
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
            obtain.writeInterfaceToken((String) y2.a(16777217, 0, 0L, "c72d5e", new byte[]{113, 58, 76, 94, 25, 115, 109, 5, 118, 58, 117, 123, 64, 30, 14, 96, 111, 31, 103, 122, 118, 48, 87, 25, 9, 119, 105, 18, 112, 49, 96, 35, 72, 19, 15, 60, 73, 50, 102, 34, 123, 54, 68, 57, 14, 65, 101, 4, 117, 61, 113, 48}));
        } catch (Throwable th) {
            th = th;
        }
        try {
            this.a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            str = obtain2.readString();
        } catch (Throwable th2) {
            th = th2;
            obtain2.recycle();
            obtain.recycle();
            th.printStackTrace();
            str = null;
            obtain2.recycle();
            obtain.recycle();
            return str;
        }
        obtain2.recycle();
        obtain.recycle();
        return str;
    }
}
