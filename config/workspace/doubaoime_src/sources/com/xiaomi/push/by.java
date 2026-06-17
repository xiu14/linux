package com.xiaomi.push;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.xiaomi.push.bz;

/* loaded from: classes2.dex */
public interface by extends IInterface {

    public static abstract class a extends Binder implements by {
        public a() {
            attachInterface(this, "com.xiaomi.market.IUploadThirdLogService");
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                if (i != 1598968902) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                parcel2.writeString("com.xiaomi.market.IUploadThirdLogService");
                return true;
            }
            parcel.enforceInterface("com.xiaomi.market.IUploadThirdLogService");
            a(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null, bz.a.a(parcel.readStrongBinder()));
            parcel2.writeNoException();
            return true;
        }
    }

    void a(Bundle bundle, bz bzVar);
}
