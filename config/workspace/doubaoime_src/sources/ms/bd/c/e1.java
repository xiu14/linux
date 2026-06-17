package ms.bd.c;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes2.dex */
public final class e1 extends Binder implements IInterface {

    /* renamed from: d, reason: collision with root package name */
    public static final String f10366d = (String) y2.a(16777217, 0, 0, "3a9919", new byte[]{33, 108, 71, 3, 6, 39, 56, 79, 102, 102, 48, 45, 73, 65, 1, 59, 52, 83, 109, 123, 52, 106, 73, 72, 64, 33, 49, 73, 108, 39, 11, 76, 107, 100, 42, 13, 49, 76, 100, 75, 35, 96, 65});
    public volatile String a;
    public final j1 b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f1 f10367c;

    public e1(f1 f1Var, j1 j1Var) {
        this.f10367c = f1Var;
        attachInterface(this, (String) y2.a(16777217, 0, 0L, "08aa1f", new byte[]{34, 53, 31, 91, 6, 120, 59, 22, 62, 62, 51, 116, 17, 25, 1, 100, 55, 10, 53, 35, 55, 51, 17, 16, 64, 126, 50, 16, 52, Byte.MAX_VALUE, 8, 21, 51, 60, 42, 82, 50, 21, 60, 19, 32, 57, 25}));
        this.a = "";
        this.b = j1Var;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        String str = f10366d;
        if (i == 1) {
            parcel.enforceInterface(str);
            parcel.readInt();
            parcel.readLong();
            parcel.readInt();
            parcel.readFloat();
            parcel.readDouble();
            parcel.readString();
            parcel2.writeNoException();
            return true;
        }
        if (i != 2) {
            if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel2.writeString(str);
            return true;
        }
        parcel.enforceInterface(str);
        int readInt = parcel.readInt();
        Bundle bundle = parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null;
        this.f10367c.getClass();
        if (readInt == 0 && bundle != null) {
            this.a = bundle.getString(this.f10367c.a);
            j1 j1Var = this.b;
            if (j1Var != null) {
                j1Var.a.a = this.a;
            }
        }
        parcel2.writeNoException();
        return true;
    }
}
