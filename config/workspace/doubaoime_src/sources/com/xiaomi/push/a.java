package com.xiaomi.push;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes2.dex */
public interface a extends IInterface {

    /* renamed from: com.xiaomi.push.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0410a extends Binder implements a {
        public AbstractBinderC0410a() {
            attachInterface(this, "android.telephony.tcpka.IModemTcpKeepAliveIndCallback");
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
                parcel2.writeString("android.telephony.tcpka.IModemTcpKeepAliveIndCallback");
                return true;
            }
            parcel.enforceInterface("android.telephony.tcpka.IModemTcpKeepAliveIndCallback");
            a(parcel.readString());
            parcel2.writeNoException();
            return true;
        }
    }

    void a(String str);
}
