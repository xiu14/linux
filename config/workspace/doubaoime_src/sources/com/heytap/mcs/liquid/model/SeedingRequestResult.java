package com.heytap.mcs.liquid.model;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public class SeedingRequestResult implements Parcelable {
    public static final Parcelable.Creator<SeedingRequestResult> CREATOR = new a();
    private boolean a;
    private String b;

    /* renamed from: c, reason: collision with root package name */
    private String f6865c;

    /* renamed from: d, reason: collision with root package name */
    private int f6866d;

    /* renamed from: e, reason: collision with root package name */
    private int f6867e;

    static class a implements Parcelable.Creator<SeedingRequestResult> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public SeedingRequestResult createFromParcel(Parcel parcel) {
            return new SeedingRequestResult(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public SeedingRequestResult[] newArray(int i) {
            return new SeedingRequestResult[i];
        }
    }

    public SeedingRequestResult() {
    }

    protected SeedingRequestResult(Parcel parcel) {
        this.a = parcel.readByte() != 0;
        this.b = parcel.readString();
        this.f6865c = parcel.readString();
        this.f6866d = parcel.readInt();
        this.f6867e = parcel.readInt();
    }

    public int a() {
        return this.f6866d;
    }

    public String b() {
        return this.b;
    }

    public String c() {
        return this.f6865c;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int e() {
        return this.f6867e;
    }

    public String toString() {
        StringBuilder R = e.a.a.a.a.R("SeedingRequestResult{", "isSuccess=");
        R.append(this.a);
        R.append(", requestId='");
        e.a.a.a.a.G0(R, this.b, '\'', ", traceId='");
        e.a.a.a.a.G0(R, this.f6865c, '\'', ", currentStatus=");
        R.append(this.f6866d);
        R.append(", verifyStatus=");
        return e.a.a.a.a.C(R, this.f6867e, '}');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.a ? (byte) 1 : (byte) 0);
        parcel.writeString(this.b);
        parcel.writeString(this.f6865c);
        parcel.writeInt(this.f6866d);
        parcel.writeInt(this.f6867e);
    }
}
