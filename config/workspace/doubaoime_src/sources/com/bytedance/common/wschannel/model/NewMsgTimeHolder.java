package com.bytedance.common.wschannel.model;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class NewMsgTimeHolder implements Parcelable {
    public static final Parcelable.Creator<NewMsgTimeHolder> CREATOR = new a();
    public final long a;
    public final long b;

    /* renamed from: c, reason: collision with root package name */
    public final long f4277c;

    static class a implements Parcelable.Creator<NewMsgTimeHolder> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public NewMsgTimeHolder createFromParcel(Parcel parcel) {
            return new NewMsgTimeHolder(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public NewMsgTimeHolder[] newArray(int i) {
            return new NewMsgTimeHolder[i];
        }
    }

    public NewMsgTimeHolder(long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.f4277c = j3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeLong(this.b);
        parcel.writeLong(this.f4277c);
    }

    protected NewMsgTimeHolder(Parcel parcel) {
        this.a = parcel.readLong();
        this.b = parcel.readLong();
        this.f4277c = parcel.readLong();
    }
}
