package com.bytedance.common.wschannel.model;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class ServiceParcelable implements Parcelable {
    public static final Parcelable.Creator<ServiceParcelable> CREATOR = new a();
    private final int a;
    private final int b;

    static class a implements Parcelable.Creator<ServiceParcelable> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public ServiceParcelable createFromParcel(Parcel parcel) {
            return new ServiceParcelable(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public ServiceParcelable[] newArray(int i) {
            return new ServiceParcelable[i];
        }
    }

    public ServiceParcelable(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public int a() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int l() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
    }
}
