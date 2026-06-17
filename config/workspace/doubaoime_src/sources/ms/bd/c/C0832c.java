package ms.bd.c;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: ms.bd.c.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0832c implements IInterface {
    public final IBinder a;

    public C0832c(IBinder iBinder) {
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
            obtain.writeInterfaceToken((String) y2.a(16777217, 0, 0L, "e29022", new byte[]{119, 63, 71, 10, 12, 54, 115, 0, 38, 109, 103, 49, 4, 119, 24, 53, 118, 31, 109, 109, 113, 62, 94, 69, 31, 60, 66, 58, 76, 46, 93, 20, 67, 64, 44, 44, 98, 31, 65, 110, 96, 53, 88, 66, 12, 38, 99}));
            this.a.transact(3, obtain, obtain2, 0);
            obtain2.readException();
            str = obtain2.readString();
        } catch (Throwable unused) {
            obtain.recycle();
            obtain2.recycle();
            str = null;
        }
        obtain.recycle();
        obtain2.recycle();
        return str;
    }
}
