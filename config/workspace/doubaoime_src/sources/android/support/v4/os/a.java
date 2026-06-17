package android.support.v4.os;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.support.v4.os.ResultReceiver;
import java.util.Objects;

/* loaded from: classes.dex */
public interface a extends IInterface {

    /* renamed from: android.support.v4.os.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0006a extends Binder implements a {
        public static final /* synthetic */ int a = 0;

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: android.support.v4.os.a$a$a, reason: collision with other inner class name */
        static class C0007a implements a {
            private IBinder a;

            C0007a(IBinder iBinder) {
                this.a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.a;
            }

            @Override // android.support.v4.os.a
            public void i0(int i, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.os.IResultReceiver");
                    obtain.writeInt(i);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public AbstractBinderC0006a() {
            attachInterface(this, "android.support.v4.os.IResultReceiver");
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("android.support.v4.os.IResultReceiver");
            }
            if (i == 1598968902) {
                parcel2.writeString("android.support.v4.os.IResultReceiver");
                return true;
            }
            if (i != 1) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            int readInt = parcel.readInt();
            Object createFromParcel = parcel.readInt() != 0 ? Bundle.CREATOR.createFromParcel(parcel) : null;
            ResultReceiver.b bVar = (ResultReceiver.b) this;
            Objects.requireNonNull(ResultReceiver.this);
            ResultReceiver.this.a(readInt, (Bundle) createFromParcel);
            return true;
        }
    }

    void i0(int i, Bundle bundle) throws RemoteException;
}
