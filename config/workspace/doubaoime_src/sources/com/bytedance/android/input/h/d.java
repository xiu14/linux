package com.bytedance.android.input.h;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.bytedance.android.input.upgrade.DownloadClient;
import com.obric.common.upgrade.VersionCheckResponse;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public interface d extends IInterface {

    public static abstract class a extends Binder implements d {
        public static final /* synthetic */ int a = 0;

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: com.bytedance.android.input.h.d$a$a, reason: collision with other inner class name */
        static class C0075a implements d {
            private IBinder a;

            C0075a(IBinder iBinder) {
                this.a = iBinder;
            }

            @Override // com.bytedance.android.input.h.d
            public void R(VersionCheckResponse versionCheckResponse) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.android.input.aidl.IVersionCheckCallback");
                    obtain.writeInt(1);
                    versionCheckResponse.writeToParcel(obtain, 0);
                    if (!this.a.transact(1, obtain, obtain2, 0)) {
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
        }

        public a() {
            attachInterface(this, "com.bytedance.android.input.aidl.IVersionCheckCallback");
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            VersionCheckResponse versionCheckResponse;
            if (i != 1) {
                if (i != 1598968902) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                parcel2.writeString("com.bytedance.android.input.aidl.IVersionCheckCallback");
                return true;
            }
            parcel.enforceInterface("com.bytedance.android.input.aidl.IVersionCheckCallback");
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
            ((DownloadClient.d) this).R(versionCheckResponse);
            parcel2.writeNoException();
            return true;
        }
    }

    void R(VersionCheckResponse versionCheckResponse) throws RemoteException;
}
