package e.f.a.a.a.a.b;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes2.dex */
public interface c extends IInterface {

    public static abstract class a extends Binder implements c {
        private static final String DESCRIPTOR = "com.heytap.mcs.liquid.service.download.result.IPackageAuthCallback";
        static final int TRANSACTION_onAuthResult = 1;

        /* renamed from: e.f.a.a.a.a.b.c$a$a, reason: collision with other inner class name */
        private static class C0458a implements c {
            public static c b;
            private IBinder a;

            C0458a(IBinder iBinder) {
                this.a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.a;
            }
        }

        public a() {
            attachInterface(this, DESCRIPTOR);
        }

        public static c asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof c)) ? new C0458a(iBinder) : (c) queryLocalInterface;
        }

        public static c getDefaultImpl() {
            return C0458a.b;
        }

        public static boolean setDefaultImpl(c cVar) {
            if (C0458a.b != null || cVar == null) {
                return false;
            }
            C0458a.b = cVar;
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                if (i != 1598968902) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
            parcel.enforceInterface(DESCRIPTOR);
            onAuthResult(parcel.readInt());
            parcel2.writeNoException();
            return true;
        }
    }

    void onAuthResult(int i);
}
