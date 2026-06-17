package com.bytedance.android.input.h;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public interface c extends IInterface {

    public static abstract class a extends Binder implements c {
        public static final /* synthetic */ int a = 0;

        /* renamed from: com.bytedance.android.input.h.c$a$a, reason: collision with other inner class name */
        private static class C0074a implements c {
            private IBinder a;

            C0074a(IBinder iBinder) {
                this.a = iBinder;
            }

            @Override // com.bytedance.android.input.h.c
            public void O() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.android.input.aidl.IServiceTask");
                    if (!this.a.transact(3, obtain, obtain2, 0)) {
                        int i = a.a;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.bytedance.android.input.h.c
            public void V(int i, boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.android.input.aidl.IServiceTask");
                    obtain.writeInt(i);
                    obtain.writeInt(z ? 1 : 0);
                    if (!this.a.transact(5, obtain, obtain2, 0)) {
                        int i2 = a.a;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.bytedance.android.input.h.c
            public void W() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.android.input.aidl.IServiceTask");
                    if (!this.a.transact(2, obtain, obtain2, 0)) {
                        int i = a.a;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.a;
            }

            @Override // com.bytedance.android.input.h.c
            public void g0(String str, String str2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.android.input.aidl.IServiceTask");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    if (!this.a.transact(1, obtain, obtain2, 0)) {
                        int i = a.a;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.bytedance.android.input.h.c
            public void t() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.android.input.aidl.IServiceTask");
                    if (!this.a.transact(4, obtain, obtain2, 0)) {
                        int i = a.a;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "com.bytedance.android.input.aidl.IServiceTask");
        }

        public static c d(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.bytedance.android.input.aidl.IServiceTask");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof c)) ? new C0074a(iBinder) : (c) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface("com.bytedance.android.input.aidl.IServiceTask");
                g0(parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            }
            if (i == 2) {
                parcel.enforceInterface("com.bytedance.android.input.aidl.IServiceTask");
                W();
                parcel2.writeNoException();
                return true;
            }
            if (i == 3) {
                parcel.enforceInterface("com.bytedance.android.input.aidl.IServiceTask");
                O();
                parcel2.writeNoException();
                return true;
            }
            if (i == 4) {
                parcel.enforceInterface("com.bytedance.android.input.aidl.IServiceTask");
                t();
                parcel2.writeNoException();
                return true;
            }
            if (i != 5) {
                if (i != 1598968902) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                parcel2.writeString("com.bytedance.android.input.aidl.IServiceTask");
                return true;
            }
            parcel.enforceInterface("com.bytedance.android.input.aidl.IServiceTask");
            V(parcel.readInt(), parcel.readInt() != 0);
            parcel2.writeNoException();
            return true;
        }
    }

    void O() throws RemoteException;

    void V(int i, boolean z) throws RemoteException;

    void W() throws RemoteException;

    void g0(String str, String str2) throws RemoteException;

    void t() throws RemoteException;
}
