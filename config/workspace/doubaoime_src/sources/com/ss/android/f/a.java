package com.ss.android.f;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* loaded from: classes2.dex */
public interface a extends IInterface {

    /* renamed from: com.ss.android.f.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0372a extends Binder implements a {
        public static final /* synthetic */ int a = 0;

        /* renamed from: com.ss.android.f.a$a$a, reason: collision with other inner class name */
        private static class C0373a implements a {
            private IBinder a;

            C0373a(IBinder iBinder) {
                this.a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.a;
            }

            @Override // com.ss.android.f.a
            public String h0(String str, String str2, List list) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.push_common_lib.ICrossProcessAIDL");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeList(list);
                    if (!this.a.transact(1, obtain, obtain2, 0)) {
                        int i = AbstractBinderC0372a.a;
                    }
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public AbstractBinderC0372a() {
            attachInterface(this, "com.ss.android.push_common_lib.ICrossProcessAIDL");
        }

        public static a d(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.push_common_lib.ICrossProcessAIDL");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof a)) ? new C0373a(iBinder) : (a) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i != 1) {
                if (i != 1598968902) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                parcel2.writeString("com.ss.android.push_common_lib.ICrossProcessAIDL");
                return true;
            }
            parcel.enforceInterface("com.ss.android.push_common_lib.ICrossProcessAIDL");
            String h0 = h0(parcel.readString(), parcel.readString(), parcel.readArrayList(getClass().getClassLoader()));
            parcel2.writeNoException();
            parcel2.writeString(h0);
            return true;
        }
    }

    String h0(String str, String str2, List list) throws RemoteException;
}
