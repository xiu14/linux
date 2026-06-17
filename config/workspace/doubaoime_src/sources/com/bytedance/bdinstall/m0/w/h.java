package com.bytedance.bdinstall.m0.w;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public interface h extends IInterface {

    public static abstract class a extends Binder implements h {
        public static final /* synthetic */ int a = 0;

        /* renamed from: com.bytedance.bdinstall.m0.w.h$a$a, reason: collision with other inner class name */
        private static class C0164a implements h {
            private IBinder a;

            C0164a(IBinder iBinder) {
                this.a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.a;
            }

            @Override // com.bytedance.bdinstall.m0.w.h
            public String e() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bun.lib.MsaIdInterface");
                    if (!this.a.transact(1, obtain, obtain2, 0)) {
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

        public static h d(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.bun.lib.MsaIdInterface");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof h)) ? new C0164a(iBinder) : (h) queryLocalInterface;
        }
    }

    String e() throws RemoteException;
}
