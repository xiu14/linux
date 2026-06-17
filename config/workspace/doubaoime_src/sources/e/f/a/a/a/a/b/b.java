package e.f.a.a.a.a.b;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.heytap.mcs.liquid.model.ActionResult;

/* loaded from: classes2.dex */
public interface b extends IInterface {

    public static abstract class a extends Binder implements b {
        private static final String DESCRIPTOR = "com.heytap.mcs.liquid.service.download.result.ILiquidCallback";
        static final int TRANSACTION_onClick = 2;
        static final int TRANSACTION_onDismiss = 5;
        static final int TRANSACTION_onFailed = 6;
        static final int TRANSACTION_onPauseClick = 3;
        static final int TRANSACTION_onResumeClick = 4;
        static final int TRANSACTION_onShow = 1;

        /* renamed from: e.f.a.a.a.a.b.b$a$a, reason: collision with other inner class name */
        private static class C0457a implements b {
            public static b b;
            private IBinder a;

            C0457a(IBinder iBinder) {
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

        public static b asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof b)) ? new C0457a(iBinder) : (b) queryLocalInterface;
        }

        public static b getDefaultImpl() {
            return C0457a.b;
        }

        public static boolean setDefaultImpl(b bVar) {
            if (C0457a.b != null || bVar == null) {
                return false;
            }
            C0457a.b = bVar;
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1598968902) {
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
            switch (i) {
                case 1:
                    parcel.enforceInterface(DESCRIPTOR);
                    onShow(parcel.readString(), parcel.readInt());
                    break;
                case 2:
                    parcel.enforceInterface(DESCRIPTOR);
                    onClick(parcel.readString(), parcel.readInt());
                    break;
                case 3:
                    parcel.enforceInterface(DESCRIPTOR);
                    ActionResult onPauseClick = onPauseClick(parcel.readString());
                    parcel2.writeNoException();
                    if (onPauseClick != null) {
                        parcel2.writeInt(1);
                        onPauseClick.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 4:
                    parcel.enforceInterface(DESCRIPTOR);
                    ActionResult onResumeClick = onResumeClick(parcel.readString());
                    parcel2.writeNoException();
                    if (onResumeClick != null) {
                        parcel2.writeInt(1);
                        onResumeClick.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 5:
                    parcel.enforceInterface(DESCRIPTOR);
                    onDismiss(parcel.readString());
                    break;
                case 6:
                    parcel.enforceInterface(DESCRIPTOR);
                    onFailed(parcel.readString(), parcel.readInt(), parcel.readInt());
                    break;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void onClick(String str, int i);

    void onDismiss(String str);

    void onFailed(String str, int i, int i2);

    ActionResult onPauseClick(String str);

    ActionResult onResumeClick(String str);

    void onShow(String str, int i);
}
