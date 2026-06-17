package com.bytedance.bdinstall.m0.w;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.bytedance.bdinstall.m0.w.e;

/* loaded from: classes.dex */
public interface f extends IInterface {

    public static abstract class a extends Binder implements f {
        public static final /* synthetic */ int a = 0;

        /* renamed from: com.bytedance.bdinstall.m0.w.f$a$a, reason: collision with other inner class name */
        private static class C0162a implements f {
            private IBinder a;

            C0162a(IBinder iBinder) {
                this.a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.a;
            }

            @Override // com.bytedance.bdinstall.m0.w.f
            public void k(e eVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.hihonor.cloudservice.oaid.IOAIDService");
                    obtain.writeStrongBinder(eVar != null ? (e.a) eVar : null);
                    if (!this.a.transact(2, obtain, obtain2, 0)) {
                        int i = a.a;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.bytedance.bdinstall.m0.w.f
            public void k0(e eVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.hihonor.cloudservice.oaid.IOAIDService");
                    obtain.writeStrongBinder(eVar != null ? (e.a) eVar : null);
                    if (!this.a.transact(3, obtain, obtain2, 0)) {
                        int i = a.a;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static f d(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.hihonor.cloudservice.oaid.IOAIDService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof f)) ? new C0162a(iBinder) : (f) queryLocalInterface;
        }
    }

    void k(e eVar) throws RemoteException;

    void k0(e eVar) throws RemoteException;
}
