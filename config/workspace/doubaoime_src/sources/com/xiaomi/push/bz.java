package com.xiaomi.push;

import android.net.Uri;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes2.dex */
public interface bz extends IInterface {
    void a(int i);

    void a(Uri uri);

    void b(int i);

    public static abstract class a extends Binder implements bz {
        public static bz a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.xiaomi.market.IUploadThirdLogServiceCallback");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof bz)) ? new C0411a(iBinder) : (bz) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                parcel.enforceInterface("com.xiaomi.market.IUploadThirdLogServiceCallback");
                a(parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            }
            if (i == 2) {
                parcel.enforceInterface("com.xiaomi.market.IUploadThirdLogServiceCallback");
                a(parcel.readInt());
                parcel2.writeNoException();
                return true;
            }
            if (i != 3) {
                if (i != 1598968902) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                parcel2.writeString("com.xiaomi.market.IUploadThirdLogServiceCallback");
                return true;
            }
            parcel.enforceInterface("com.xiaomi.market.IUploadThirdLogServiceCallback");
            b(parcel.readInt());
            parcel2.writeNoException();
            return true;
        }

        public static bz a() {
            return C0411a.a;
        }

        /* renamed from: com.xiaomi.push.bz$a$a, reason: collision with other inner class name */
        private static class C0411a implements bz {
            public static bz a;

            /* renamed from: a, reason: collision with other field name */
            private IBinder f158a;

            C0411a(IBinder iBinder) {
                this.f158a = iBinder;
            }

            @Override // com.xiaomi.push.bz
            public void a(Uri uri) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.xiaomi.market.IUploadThirdLogServiceCallback");
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.f158a.transact(1, obtain, obtain2, 0) || a.a() == null) {
                        obtain2.readException();
                    } else {
                        a.a().a(uri);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f158a;
            }

            @Override // com.xiaomi.push.bz
            public void b(int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.xiaomi.market.IUploadThirdLogServiceCallback");
                    obtain.writeInt(i);
                    if (this.f158a.transact(3, obtain, obtain2, 0) || a.a() == null) {
                        obtain2.readException();
                    } else {
                        a.a().b(i);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.xiaomi.push.bz
            public void a(int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.xiaomi.market.IUploadThirdLogServiceCallback");
                    obtain.writeInt(i);
                    if (!this.f158a.transact(2, obtain, obtain2, 0) && a.a() != null) {
                        a.a().a(i);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }
    }
}
