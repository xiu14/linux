package ms.bd.c;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class l4 implements Parcelable {
    public final int a;
    public final byte[] b;

    /* renamed from: c, reason: collision with root package name */
    public final int f10404c;

    public l4(Parcel parcel) {
        this.a = parcel.readInt();
        this.b = parcel.createByteArray();
        this.f10404c = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeByteArray(this.b);
        parcel.writeInt(this.f10404c);
    }
}
