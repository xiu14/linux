package ms.bd.c;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class k4 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new l4(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new l4[i];
    }
}
