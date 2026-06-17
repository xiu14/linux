package ms.bd.c;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes2.dex */
public final class t1 implements IInterface {
    public final IBinder a;

    public t1(IBinder iBinder) {
        this.a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return null;
    }

    public final String d() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            try {
                obtain.writeInterfaceToken((String) y2.a(16777217, 0, 0L, "d00703", new byte[]{118, 61, 78, 13, 21, 49, 110, 95, 101, 98, 99, 59, 64, 70, 6, 32, 116, 20, 115, 113, 124, 49, 70, 13, 38, 0, 98, 7, 104, 100, 112, 59, 71, 106, 1, 48, 98, 3, 103, 102, 118, 55}));
                try {
                    this.a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    String readString = obtain2.readString();
                    obtain2.recycle();
                    obtain.recycle();
                    return readString;
                } catch (Exception e2) {
                    e = e2;
                    e.printStackTrace();
                    obtain2.recycle();
                    obtain.recycle();
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                obtain2.recycle();
                obtain.recycle();
                throw th;
            }
        } catch (Exception e3) {
            e = e3;
        } catch (Throwable th2) {
            th = th2;
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
    }
}
