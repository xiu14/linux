package com.bytedance.bdinstall.m0.w;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public interface a extends IInterface {

    /* renamed from: com.bytedance.bdinstall.m0.w.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0157a extends Binder implements a {
        public static final /* synthetic */ int a = 0;

        /* renamed from: com.bytedance.bdinstall.m0.w.a$a$a, reason: collision with other inner class name */
        private static class C0158a implements a {
            private IBinder a;

            C0158a(IBinder iBinder) {
                this.a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.a;
            }

            @Override // com.bytedance.bdinstall.m0.w.a
            public String v(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.coolpad.deviceidsupport.IDeviceIdManager");
                    obtain.writeString(str);
                    if (!this.a.transact(2, obtain, obtain2, 0)) {
                        int i = AbstractBinderC0157a.a;
                    }
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static a d(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.coolpad.deviceidsupport.IDeviceIdManager");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof a)) ? new C0158a(iBinder) : (a) queryLocalInterface;
        }
    }

    String v(String str) throws RemoteException;
}
