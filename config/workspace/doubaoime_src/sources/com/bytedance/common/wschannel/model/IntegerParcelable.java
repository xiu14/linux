package com.bytedance.common.wschannel.model;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class IntegerParcelable implements Parcelable {
    public static final Parcelable.Creator<IntegerParcelable> CREATOR = new a();
    private final int a;

    static class a implements Parcelable.Creator<IntegerParcelable> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public IntegerParcelable createFromParcel(Parcel parcel) {
            return new IntegerParcelable(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public IntegerParcelable[] newArray(int i) {
            return new IntegerParcelable[i];
        }
    }

    protected IntegerParcelable(Parcel parcel) {
        this.a = parcel.readInt();
    }

    public int a() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
    }
}
