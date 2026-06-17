package com.bytedance.common.wschannel.model;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class ServiceConnectEvent implements Parcelable {
    public static final Parcelable.Creator<ServiceConnectEvent> CREATOR = new a();
    private final int a;
    private final int b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f4278c;

    /* renamed from: d, reason: collision with root package name */
    private final String f4279d;

    static class a implements Parcelable.Creator<ServiceConnectEvent> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public ServiceConnectEvent createFromParcel(Parcel parcel) {
            return new ServiceConnectEvent(parcel.readInt(), parcel.readInt(), parcel.readByte() != 0, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public ServiceConnectEvent[] newArray(int i) {
            return new ServiceConnectEvent[i];
        }
    }

    public ServiceConnectEvent(int i, int i2, boolean z, String str) {
        this.a = i;
        this.b = i2;
        this.f4278c = z;
        this.f4279d = str;
    }

    public int a() {
        return this.b;
    }

    public boolean b() {
        return this.f4278c;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int l() {
        return this.a;
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("ServiceConnectEvent{mChannelId=");
        M.append(this.a);
        M.append(", mServiceId=");
        M.append(this.b);
        M.append(", mConnected=");
        M.append(this.f4278c);
        M.append(", mLogInfo='");
        return e.a.a.a.a.H(M, this.f4279d, '\'', '}');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeByte(this.f4278c ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f4279d);
    }
}
