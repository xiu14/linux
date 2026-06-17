package com.ss.android.socialbase.downloader.depend;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;

/* loaded from: classes2.dex */
public interface IDownloadNotificationEventAidlListener extends IInterface {

    public static class Default implements IDownloadNotificationEventAidlListener {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.ss.android.socialbase.downloader.depend.IDownloadNotificationEventAidlListener
        public String getNotifyProcessName() throws RemoteException {
            return null;
        }

        @Override // com.ss.android.socialbase.downloader.depend.IDownloadNotificationEventAidlListener
        public boolean interceptAfterNotificationSuccess(boolean z) throws RemoteException {
            return false;
        }

        @Override // com.ss.android.socialbase.downloader.depend.IDownloadNotificationEventAidlListener
        public void onNotificationEvent(int i, DownloadInfo downloadInfo, String str, String str2) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IDownloadNotificationEventAidlListener {
        private static final String DESCRIPTOR = "com.ss.android.socialbase.downloader.depend.IDownloadNotificationEventAidlListener";
        static final int TRANSACTION_getNotifyProcessName = 3;
        static final int TRANSACTION_interceptAfterNotificationSuccess = 2;
        static final int TRANSACTION_onNotificationEvent = 1;

        private static class Proxy implements IDownloadNotificationEventAidlListener {
            public static IDownloadNotificationEventAidlListener sDefaultImpl;
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

            @Override // com.ss.android.socialbase.downloader.depend.IDownloadNotificationEventAidlListener
            public String getNotifyProcessName() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(3, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getNotifyProcessName();
                    }
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.depend.IDownloadNotificationEventAidlListener
            public boolean interceptAfterNotificationSuccess(boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(z ? 1 : 0);
                    if (!this.mRemote.transact(2, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().interceptAfterNotificationSuccess(z);
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.depend.IDownloadNotificationEventAidlListener
            public void onNotificationEvent(int i, DownloadInfo downloadInfo, String str, String str2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    if (downloadInfo != null) {
                        obtain.writeInt(1);
                        downloadInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    if (this.mRemote.transact(1, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                    } else {
                        Stub.getDefaultImpl().onNotificationEvent(i, downloadInfo, str, str2);
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

        public static IDownloadNotificationEventAidlListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IDownloadNotificationEventAidlListener)) ? new Proxy(iBinder) : (IDownloadNotificationEventAidlListener) queryLocalInterface;
        }

        public static IDownloadNotificationEventAidlListener getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(IDownloadNotificationEventAidlListener iDownloadNotificationEventAidlListener) {
            if (Proxy.sDefaultImpl != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (iDownloadNotificationEventAidlListener == null) {
                return false;
            }
            Proxy.sDefaultImpl = iDownloadNotificationEventAidlListener;
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface(DESCRIPTOR);
                onNotificationEvent(parcel.readInt(), parcel.readInt() != 0 ? DownloadInfo.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            }
            if (i == 2) {
                parcel.enforceInterface(DESCRIPTOR);
                boolean interceptAfterNotificationSuccess = interceptAfterNotificationSuccess(parcel.readInt() != 0);
                parcel2.writeNoException();
                parcel2.writeInt(interceptAfterNotificationSuccess ? 1 : 0);
                return true;
            }
            if (i != 3) {
                if (i != 1598968902) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
            parcel.enforceInterface(DESCRIPTOR);
            String notifyProcessName = getNotifyProcessName();
            parcel2.writeNoException();
            parcel2.writeString(notifyProcessName);
            return true;
        }
    }

    String getNotifyProcessName() throws RemoteException;

    boolean interceptAfterNotificationSuccess(boolean z) throws RemoteException;

    void onNotificationEvent(int i, DownloadInfo downloadInfo, String str, String str2) throws RemoteException;
}
