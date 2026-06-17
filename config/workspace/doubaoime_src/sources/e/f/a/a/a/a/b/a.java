package e.f.a.a.a.a.b;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.heytap.mcs.liquid.model.SeedingRequestResult;
import java.util.List;

/* loaded from: classes2.dex */
public interface a extends IInterface {

    /* renamed from: e.f.a.a.a.a.b.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0455a extends Binder implements a {
        private static final String DESCRIPTOR = "com.heytap.mcs.liquid.service.download.result.ILiquidBatchCallback";
        static final int TRANSACTION_onFailed = 1;

        /* renamed from: e.f.a.a.a.a.b.a$a$a, reason: collision with other inner class name */
        private static class C0456a implements a {
            public static a b;
            private IBinder a;

            C0456a(IBinder iBinder) {
                this.a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.a;
            }
        }

        public AbstractBinderC0455a() {
            attachInterface(this, DESCRIPTOR);
        }

        public static a asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof a)) ? new C0456a(iBinder) : (a) queryLocalInterface;
        }

        public static a getDefaultImpl() {
            return C0456a.b;
        }

        public static boolean setDefaultImpl(a aVar) {
            if (C0456a.b != null || aVar == null) {
                return false;
            }
            C0456a.b = aVar;
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
            onFailed(parcel.createTypedArrayList(SeedingRequestResult.CREATOR));
            parcel2.writeNoException();
            return true;
        }
    }

    void onFailed(List<SeedingRequestResult> list);
}
