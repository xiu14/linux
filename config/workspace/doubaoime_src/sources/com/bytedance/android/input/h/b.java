package com.bytedance.android.input.h;

import android.app.Application;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.bytedance.android.doubaoime.ImeApplication;
import com.bytedance.android.input.h.a;
import com.bytedance.android.input.h.d;
import com.bytedance.android.input.r.j;
import com.bytedance.android.input.upgrade.AppUpgradeDownloadService;
import com.bytedance.android.input.upgrade.f;
import com.obric.common.upgrade.VersionCheckResponse;
import com.obric.common.upgrade.h;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public interface b extends IInterface {

    public static abstract class a extends Binder implements b {
        public static final /* synthetic */ int a = 0;

        /* renamed from: com.bytedance.android.input.h.b$a$a, reason: collision with other inner class name */
        private static class C0073a implements b {
            private IBinder a;

            C0073a(IBinder iBinder) {
                this.a = iBinder;
            }

            @Override // com.bytedance.android.input.h.b
            public void J(boolean z, String str, d dVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.android.input.aidl.IAppUpgradeDownloadService");
                    obtain.writeInt(z ? 1 : 0);
                    obtain.writeString(str);
                    obtain.writeStrongBinder((d.a) dVar);
                    if (!this.a.transact(7, obtain, obtain2, 0)) {
                        int i = a.a;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.bytedance.android.input.h.b
            public void K(com.bytedance.android.input.h.a aVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.android.input.aidl.IAppUpgradeDownloadService");
                    obtain.writeStrongBinder(aVar != null ? (a.AbstractBinderC0071a) aVar : null);
                    if (!this.a.transact(4, obtain, obtain2, 0)) {
                        int i = a.a;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.bytedance.android.input.h.b
            public void X(long j, boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.android.input.aidl.IAppUpgradeDownloadService");
                    obtain.writeLong(j);
                    obtain.writeInt(z ? 1 : 0);
                    if (!this.a.transact(1, obtain, obtain2, 0)) {
                        int i = a.a;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.bytedance.android.input.h.b
            public void Z(VersionCheckResponse versionCheckResponse, boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.android.input.aidl.IAppUpgradeDownloadService");
                    int i = 1;
                    if (versionCheckResponse != null) {
                        obtain.writeInt(1);
                        versionCheckResponse.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!z) {
                        i = 0;
                    }
                    obtain.writeInt(i);
                    if (!this.a.transact(3, obtain, obtain2, 0)) {
                        int i2 = a.a;
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

            @Override // com.bytedance.android.input.h.b
            public void m() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.android.input.aidl.IAppUpgradeDownloadService");
                    if (!this.a.transact(8, obtain, obtain2, 0)) {
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
            attachInterface(this, "com.bytedance.android.input.aidl.IAppUpgradeDownloadService");
        }

        public static b d(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.bytedance.android.input.aidl.IAppUpgradeDownloadService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof b)) ? new C0073a(iBinder) : (b) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1598968902) {
                parcel2.writeString("com.bytedance.android.input.aidl.IAppUpgradeDownloadService");
                return true;
            }
            VersionCheckResponse versionCheckResponse = null;
            d dVar = null;
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.bytedance.android.input.aidl.IAppUpgradeDownloadService");
                    ((AppUpgradeDownloadService.a) this).X(parcel.readLong(), parcel.readInt() != 0);
                    parcel2.writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface("com.bytedance.android.input.aidl.IAppUpgradeDownloadService");
                    long readLong = parcel.readLong();
                    StringBuilder M = e.a.a.a.a.M(" service中 ");
                    if (h.f7570d == null) {
                        throw new IllegalStateException("AppUpgradeManager 还未初始化，请先调用 init 方法。".toString());
                    }
                    h hVar = h.f7570d;
                    l.c(hVar);
                    M.append(hVar.n(readLong));
                    j.m("ImeDownload", M.toString());
                    Application application = ImeApplication.f1883e;
                    l.e(application, "sApplication");
                    f.b(application, null, 2);
                    if (h.f7570d == null) {
                        throw new IllegalStateException("AppUpgradeManager 还未初始化，请先调用 init 方法。".toString());
                    }
                    h hVar2 = h.f7570d;
                    l.c(hVar2);
                    boolean n = hVar2.n(readLong);
                    parcel2.writeNoException();
                    parcel2.writeInt(n ? 1 : 0);
                    return true;
                case 3:
                    parcel.enforceInterface("com.bytedance.android.input.aidl.IAppUpgradeDownloadService");
                    if (parcel.readInt() != 0) {
                        l.f(parcel, "parcel");
                        l.f(parcel, "parcel");
                        boolean z = parcel.readByte() != 0;
                        long readLong2 = parcel.readLong();
                        String readString = parcel.readString();
                        l.c(readString);
                        String readString2 = parcel.readString();
                        l.c(readString2);
                        String readString3 = parcel.readString();
                        l.c(readString3);
                        versionCheckResponse = new VersionCheckResponse(z, readLong2, readString, readString2, readString3, parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readByte() != 0, parcel.readLong());
                    }
                    ((AppUpgradeDownloadService.a) this).Z(versionCheckResponse, parcel.readInt() != 0);
                    parcel2.writeNoException();
                    return true;
                case 4:
                    parcel.enforceInterface("com.bytedance.android.input.aidl.IAppUpgradeDownloadService");
                    ((AppUpgradeDownloadService.a) this).K(a.AbstractBinderC0071a.d(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 5:
                    parcel.enforceInterface("com.bytedance.android.input.aidl.IAppUpgradeDownloadService");
                    ((AppUpgradeDownloadService.a) this).l(a.AbstractBinderC0071a.d(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 6:
                    parcel.enforceInterface("com.bytedance.android.input.aidl.IAppUpgradeDownloadService");
                    VersionCheckResponse h = ((AppUpgradeDownloadService.a) this).h();
                    parcel2.writeNoException();
                    if (h != null) {
                        parcel2.writeInt(1);
                        h.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 7:
                    parcel.enforceInterface("com.bytedance.android.input.aidl.IAppUpgradeDownloadService");
                    boolean z2 = parcel.readInt() != 0;
                    String readString4 = parcel.readString();
                    IBinder readStrongBinder = parcel.readStrongBinder();
                    if (readStrongBinder != null) {
                        IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.bytedance.android.input.aidl.IVersionCheckCallback");
                        dVar = (queryLocalInterface == null || !(queryLocalInterface instanceof d)) ? new d.a.C0075a(readStrongBinder) : (d) queryLocalInterface;
                    }
                    ((AppUpgradeDownloadService.a) this).J(z2, readString4, dVar);
                    parcel2.writeNoException();
                    return true;
                case 8:
                    parcel.enforceInterface("com.bytedance.android.input.aidl.IAppUpgradeDownloadService");
                    ((AppUpgradeDownloadService.a) this).m();
                    parcel2.writeNoException();
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    void J(boolean z, String str, d dVar) throws RemoteException;

    void K(com.bytedance.android.input.h.a aVar) throws RemoteException;

    void X(long j, boolean z) throws RemoteException;

    void Z(VersionCheckResponse versionCheckResponse, boolean z) throws RemoteException;

    void m() throws RemoteException;
}
