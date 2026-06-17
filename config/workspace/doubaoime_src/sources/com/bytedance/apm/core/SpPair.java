package com.bytedance.apm.core;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class SpPair implements Parcelable {
    public static final Parcelable.Creator<SpPair> CREATOR = new a();
    public String a;
    public Object b;

    static class a implements Parcelable.Creator<SpPair> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public SpPair createFromParcel(Parcel parcel) {
            return new SpPair(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public SpPair[] newArray(int i) {
            return new SpPair[i];
        }
    }

    public SpPair(String str, Object obj) {
        this.a = str;
        this.b = obj;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeValue(this.b);
    }

    protected SpPair(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readValue(getClass().getClassLoader());
    }
}
