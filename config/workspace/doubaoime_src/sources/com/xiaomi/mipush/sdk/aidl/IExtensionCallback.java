package com.xiaomi.mipush.sdk.aidl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes2.dex */
public interface IExtensionCallback extends IInterface {

    public static class Default implements IExtensionCallback {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.xiaomi.mipush.sdk.aidl.IExtensionCallback
        public void onFinish(RemoteNotificationContent remoteNotificationContent) {
        }
    }

    public static abstract class Stub extends Binder implements IExtensionCallback {
        private static final String DESCRIPTOR = "com.xiaomi.mipush.sdk.aidl.IExtensionCallback";
        static final int TRANSACTION_onFinish = 1;

        private static class Proxy implements IExtensionCallback {
            public static IExtensionCallback sDefaultImpl;
            private IBinder mRemote;

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return Stub.DESCRIPTOR;
            }

            @Override // com.xiaomi.mipush.sdk.aidl.IExtensionCallback
            public void onFinish(RemoteNotificationContent remoteNotificationContent) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (remoteNotificationContent != null) {
                        obtain.writeInt(1);
                        remoteNotificationContent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.mRemote.transact(1, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                    } else {
                        Stub.getDefaultImpl().onFinish(remoteNotificationContent);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IExtensionCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IExtensionCallback)) ? new Proxy(iBinder) : (IExtensionCallback) queryLocalInterface;
        }

        public static IExtensionCallback getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(IExtensionCallback iExtensionCallback) {
            if (Proxy.sDefaultImpl != null || iExtensionCallback == null) {
                return false;
            }
            Proxy.sDefaultImpl = iExtensionCallback;
            return true;
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
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
            parcel.enforceInterface(DESCRIPTOR);
            onFinish(parcel.readInt() != 0 ? RemoteNotificationContent.CREATOR.createFromParcel(parcel) : null);
            parcel2.writeNoException();
            return true;
        }
    }

    void onFinish(RemoteNotificationContent remoteNotificationContent);
}
