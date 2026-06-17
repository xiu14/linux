package android.support.v4.os;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.support.v4.os.a;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.util.Objects;

@SuppressLint({"BanParcelableUsage"})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class ResultReceiver implements Parcelable {
    public static final Parcelable.Creator<ResultReceiver> CREATOR = new a();
    android.support.v4.os.a a;

    class a implements Parcelable.Creator<ResultReceiver> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public ResultReceiver createFromParcel(Parcel parcel) {
            return new ResultReceiver(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public ResultReceiver[] newArray(int i) {
            return new ResultReceiver[i];
        }
    }

    class b extends a.AbstractBinderC0006a {
        b() {
        }

        @Override // android.support.v4.os.a
        public void i0(int i, Bundle bundle) {
            Objects.requireNonNull(ResultReceiver.this);
            ResultReceiver.this.a(i, bundle);
        }
    }

    ResultReceiver(Parcel parcel) {
        android.support.v4.os.a c0007a;
        IBinder readStrongBinder = parcel.readStrongBinder();
        int i = a.AbstractBinderC0006a.a;
        if (readStrongBinder == null) {
            c0007a = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("android.support.v4.os.IResultReceiver");
            c0007a = (queryLocalInterface == null || !(queryLocalInterface instanceof android.support.v4.os.a)) ? new a.AbstractBinderC0006a.C0007a(readStrongBinder) : (android.support.v4.os.a) queryLocalInterface;
        }
        this.a = c0007a;
    }

    protected void a(int i, Bundle bundle) {
    }

    public void b(int i, Bundle bundle) {
        android.support.v4.os.a aVar = this.a;
        if (aVar != null) {
            try {
                aVar.i0(i, bundle);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        synchronized (this) {
            if (this.a == null) {
                this.a = new b();
            }
            parcel.writeStrongBinder(this.a.asBinder());
        }
    }
}
