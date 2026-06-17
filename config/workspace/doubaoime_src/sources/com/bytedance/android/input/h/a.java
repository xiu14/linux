package com.bytedance.android.input.h;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.obric.common.upgrade.VersionCheckResponse;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public interface a extends IInterface {

    /* renamed from: com.bytedance.android.input.h.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0071a extends Binder implements a {
        public static final /* synthetic */ int a = 0;

        /* renamed from: com.bytedance.android.input.h.a$a$a, reason: collision with other inner class name */
        private static class C0072a implements a {
            private IBinder a;

            C0072a(IBinder iBinder) {
                this.a = iBinder;
            }

            @Override // com.bytedance.android.input.h.a
            public void a(int i, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.android.input.aidl.IAppUpgradeDownloadCallback");
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    if (!this.a.transact(3, obtain, obtain2, 0)) {
                        int i2 = AbstractBinderC0071a.a;
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

            @Override // com.bytedance.android.input.h.a
            public void b(VersionCheckResponse versionCheckResponse) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.android.input.aidl.IAppUpgradeDownloadCallback");
                    if (versionCheckResponse != null) {
                        obtain.writeInt(1);
                        versionCheckResponse.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.a.transact(2, obtain, obtain2, 0)) {
                        int i = AbstractBinderC0071a.a;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.bytedance.android.input.h.a
            public void c(int i, long j, long j2, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.android.input.aidl.IAppUpgradeDownloadCallback");
                    obtain.writeInt(i);
                    obtain.writeLong(j);
                    obtain.writeLong(j2);
                    obtain.writeString(str);
                    if (!this.a.transact(1, obtain, obtain2, 0)) {
                        int i2 = AbstractBinderC0071a.a;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public AbstractBinderC0071a() {
            attachInterface(this, "com.bytedance.android.input.aidl.IAppUpgradeDownloadCallback");
        }

        public static a d(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.bytedance.android.input.aidl.IAppUpgradeDownloadCallback");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof a)) ? new C0072a(iBinder) : (a) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            VersionCheckResponse versionCheckResponse;
            if (i == 1) {
                parcel.enforceInterface("com.bytedance.android.input.aidl.IAppUpgradeDownloadCallback");
                ((com.bytedance.android.input.upgrade.d) this).c(parcel.readInt(), parcel.readLong(), parcel.readLong(), parcel.readString());
                parcel2.writeNoException();
                return true;
            }
            if (i != 2) {
                if (i != 3) {
                    if (i != 1598968902) {
                        return super.onTransact(i, parcel, parcel2, i2);
                    }
                    parcel2.writeString("com.bytedance.android.input.aidl.IAppUpgradeDownloadCallback");
                    return true;
                }
                parcel.enforceInterface("com.bytedance.android.input.aidl.IAppUpgradeDownloadCallback");
                ((com.bytedance.android.input.upgrade.d) this).a(parcel.readInt(), parcel.readString());
                parcel2.writeNoException();
                return true;
            }
            parcel.enforceInterface("com.bytedance.android.input.aidl.IAppUpgradeDownloadCallback");
            if (parcel.readInt() != 0) {
                l.f(parcel, "parcel");
                l.f(parcel, "parcel");
                boolean z = parcel.readByte() != 0;
                long readLong = parcel.readLong();
                String readString = parcel.readString();
                l.c(readString);
                String readString2 = parcel.readString();
                l.c(readString2);
                String readString3 = parcel.readString();
                l.c(readString3);
                versionCheckResponse = new VersionCheckResponse(z, readLong, readString, readString2, readString3, parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readByte() != 0, parcel.readLong());
            } else {
                versionCheckResponse = null;
            }
            ((com.bytedance.android.input.upgrade.d) this).b(versionCheckResponse);
            parcel2.writeNoException();
            return true;
        }
    }

    void a(int i, String str) throws RemoteException;

    void b(VersionCheckResponse versionCheckResponse) throws RemoteException;

    void c(int i, long j, long j2, String str) throws RemoteException;
}
