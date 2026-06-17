package com.xiaomi.mipush.sdk.aidl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.xiaomi.mipush.sdk.aidl.IExtensionCallback;

/* loaded from: classes2.dex */
public interface IExtensionInterface extends IInterface {

    public static class Default implements IExtensionInterface {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.xiaomi.mipush.sdk.aidl.IExtensionInterface
        public void baseExtensionTimeWillExpire(RemoteNotificationInfo remoteNotificationInfo, IExtensionCallback iExtensionCallback) {
        }

        @Override // com.xiaomi.mipush.sdk.aidl.IExtensionInterface
        public void baseReceiveRemoteNotification(RemoteNotificationInfo remoteNotificationInfo, IExtensionCallback iExtensionCallback) {
        }
    }

    public static abstract class Stub extends Binder implements IExtensionInterface {
        private static final String DESCRIPTOR = "com.xiaomi.mipush.sdk.aidl.IExtensionInterface";
        static final int TRANSACTION_baseExtensionTimeWillExpire = 2;
        static final int TRANSACTION_baseReceiveRemoteNotification = 1;

        private static class Proxy implements IExtensionInterface {
            public static IExtensionInterface sDefaultImpl;
            private IBinder mRemote;

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.xiaomi.mipush.sdk.aidl.IExtensionInterface
            public void baseExtensionTimeWillExpire(RemoteNotificationInfo remoteNotificationInfo, IExtensionCallback iExtensionCallback) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (remoteNotificationInfo != null) {
                        obtain.writeInt(1);
                        remoteNotificationInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(iExtensionCallback != null ? iExtensionCallback.asBinder() : null);
                    if (this.mRemote.transact(2, obtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().baseExtensionTimeWillExpire(remoteNotificationInfo, iExtensionCallback);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.xiaomi.mipush.sdk.aidl.IExtensionInterface
            public void baseReceiveRemoteNotification(RemoteNotificationInfo remoteNotificationInfo, IExtensionCallback iExtensionCallback) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (remoteNotificationInfo != null) {
                        obtain.writeInt(1);
                        remoteNotificationInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(iExtensionCallback != null ? iExtensionCallback.asBinder() : null);
                    if (this.mRemote.transact(1, obtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().baseReceiveRemoteNotification(remoteNotificationInfo, iExtensionCallback);
                } finally {
                    obtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return Stub.DESCRIPTOR;
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IExtensionInterface asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IExtensionInterface)) ? new Proxy(iBinder) : (IExtensionInterface) queryLocalInterface;
        }

        public static IExtensionInterface getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(IExtensionInterface iExtensionInterface) {
            if (Proxy.sDefaultImpl != null || iExtensionInterface == null) {
                return false;
            }
            Proxy.sDefaultImpl = iExtensionInterface;
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                parcel.enforceInterface(DESCRIPTOR);
                baseReceiveRemoteNotification(parcel.readInt() != 0 ? RemoteNotificationInfo.CREATOR.createFromParcel(parcel) : null, IExtensionCallback.Stub.asInterface(parcel.readStrongBinder()));
                return true;
            }
            if (i == 2) {
                parcel.enforceInterface(DESCRIPTOR);
                baseExtensionTimeWillExpire(parcel.readInt() != 0 ? RemoteNotificationInfo.CREATOR.createFromParcel(parcel) : null, IExtensionCallback.Stub.asInterface(parcel.readStrongBinder()));
                return true;
            }
            if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel2.writeString(DESCRIPTOR);
            return true;
        }
    }

    void baseExtensionTimeWillExpire(RemoteNotificationInfo remoteNotificationInfo, IExtensionCallback iExtensionCallback);

    void baseReceiveRemoteNotification(RemoteNotificationInfo remoteNotificationInfo, IExtensionCallback iExtensionCallback);
}
