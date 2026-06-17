package com.bytedance.feedbackerlib.service;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.bytedance.feedbackerlib.model.FeedbackCommonInfo;

/* loaded from: classes.dex */
public interface d extends IInterface {

    public static abstract class a extends Binder implements d {
        public static final /* synthetic */ int a = 0;

        /* renamed from: com.bytedance.feedbackerlib.service.d$a$a, reason: collision with other inner class name */
        private static class C0244a implements d {
            private IBinder a;

            C0244a(IBinder iBinder) {
                this.a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.a;
            }

            @Override // com.bytedance.feedbackerlib.service.d
            public void f() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.feedbackerlib.service.IFeedbackCommonInfo");
                    if (!this.a.transact(8, obtain, obtain2, 0)) {
                        int i = a.a;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.bytedance.feedbackerlib.service.d
            public void g() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.feedbackerlib.service.IFeedbackCommonInfo");
                    if (!this.a.transact(9, obtain, obtain2, 0)) {
                        int i = a.a;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.bytedance.feedbackerlib.service.d
            public String getALogFilesDir() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.feedbackerlib.service.IFeedbackCommonInfo");
                    if (!this.a.transact(6, obtain, obtain2, 0)) {
                        int i = a.a;
                    }
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.bytedance.feedbackerlib.service.d
            public int getAid() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.feedbackerlib.service.IFeedbackCommonInfo");
                    if (!this.a.transact(1, obtain, obtain2, 0)) {
                        int i = a.a;
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.bytedance.feedbackerlib.service.d
            public String getAppId() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.feedbackerlib.service.IFeedbackCommonInfo");
                    if (!this.a.transact(2, obtain, obtain2, 0)) {
                        int i = a.a;
                    }
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.bytedance.feedbackerlib.service.d
            public String getChannel() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.feedbackerlib.service.IFeedbackCommonInfo");
                    if (!this.a.transact(5, obtain, obtain2, 0)) {
                        int i = a.a;
                    }
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.bytedance.feedbackerlib.service.d
            public String getDid() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.feedbackerlib.service.IFeedbackCommonInfo");
                    if (!this.a.transact(3, obtain, obtain2, 0)) {
                        int i = a.a;
                    }
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.bytedance.feedbackerlib.service.d
            public String getUpdateVersionCode() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.feedbackerlib.service.IFeedbackCommonInfo");
                    if (!this.a.transact(4, obtain, obtain2, 0)) {
                        int i = a.a;
                    }
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.bytedance.feedbackerlib.service.d
            public String getUserId() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.feedbackerlib.service.IFeedbackCommonInfo");
                    if (!this.a.transact(7, obtain, obtain2, 0)) {
                        int i = a.a;
                    }
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "com.bytedance.feedbackerlib.service.IFeedbackCommonInfo");
        }

        public static d n0(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.bytedance.feedbackerlib.service.IFeedbackCommonInfo");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof d)) ? new C0244a(iBinder) : (d) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1598968902) {
                parcel2.writeString("com.bytedance.feedbackerlib.service.IFeedbackCommonInfo");
                return true;
            }
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.bytedance.feedbackerlib.service.IFeedbackCommonInfo");
                    int aid = ((FeedbackCommonInfo) this).getAid();
                    parcel2.writeNoException();
                    parcel2.writeInt(aid);
                    return true;
                case 2:
                    parcel.enforceInterface("com.bytedance.feedbackerlib.service.IFeedbackCommonInfo");
                    String appId = ((FeedbackCommonInfo) this).getAppId();
                    parcel2.writeNoException();
                    parcel2.writeString(appId);
                    return true;
                case 3:
                    parcel.enforceInterface("com.bytedance.feedbackerlib.service.IFeedbackCommonInfo");
                    String did = ((FeedbackCommonInfo) this).getDid();
                    parcel2.writeNoException();
                    parcel2.writeString(did);
                    return true;
                case 4:
                    parcel.enforceInterface("com.bytedance.feedbackerlib.service.IFeedbackCommonInfo");
                    String updateVersionCode = ((FeedbackCommonInfo) this).getUpdateVersionCode();
                    parcel2.writeNoException();
                    parcel2.writeString(updateVersionCode);
                    return true;
                case 5:
                    parcel.enforceInterface("com.bytedance.feedbackerlib.service.IFeedbackCommonInfo");
                    String channel = ((FeedbackCommonInfo) this).getChannel();
                    parcel2.writeNoException();
                    parcel2.writeString(channel);
                    return true;
                case 6:
                    parcel.enforceInterface("com.bytedance.feedbackerlib.service.IFeedbackCommonInfo");
                    String aLogFilesDir = ((FeedbackCommonInfo) this).getALogFilesDir();
                    parcel2.writeNoException();
                    parcel2.writeString(aLogFilesDir);
                    return true;
                case 7:
                    parcel.enforceInterface("com.bytedance.feedbackerlib.service.IFeedbackCommonInfo");
                    String userId = ((FeedbackCommonInfo) this).getUserId();
                    parcel2.writeNoException();
                    parcel2.writeString(userId);
                    return true;
                case 8:
                    parcel.enforceInterface("com.bytedance.feedbackerlib.service.IFeedbackCommonInfo");
                    ((FeedbackCommonInfo) this).f();
                    parcel2.writeNoException();
                    return true;
                case 9:
                    parcel.enforceInterface("com.bytedance.feedbackerlib.service.IFeedbackCommonInfo");
                    ((FeedbackCommonInfo) this).g();
                    parcel2.writeNoException();
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    void f() throws RemoteException;

    void g() throws RemoteException;

    String getALogFilesDir() throws RemoteException;

    int getAid() throws RemoteException;

    String getAppId() throws RemoteException;

    String getChannel() throws RemoteException;

    String getDid() throws RemoteException;

    String getUpdateVersionCode() throws RemoteException;

    String getUserId() throws RemoteException;
}
