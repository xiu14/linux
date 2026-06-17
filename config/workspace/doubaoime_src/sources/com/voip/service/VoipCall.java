package com.voip.service;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public class VoipCall implements Parcelable {
    public static final Parcelable.Creator<VoipCall> CREATOR = new a();
    private String a;
    private String b;

    /* renamed from: c, reason: collision with root package name */
    private int f8943c;

    /* renamed from: d, reason: collision with root package name */
    private String f8944d;

    /* renamed from: e, reason: collision with root package name */
    private byte[] f8945e;

    /* renamed from: f, reason: collision with root package name */
    private String f8946f;

    /* renamed from: g, reason: collision with root package name */
    private String f8947g;
    private int h;
    private int i;
    private boolean j;
    private boolean k;
    private boolean l;

    class a implements Parcelable.Creator<VoipCall> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public VoipCall createFromParcel(Parcel parcel) {
            return new VoipCall(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public VoipCall[] newArray(int i) {
            return new VoipCall[i];
        }
    }

    protected VoipCall(Parcel parcel) {
        this.j = true;
        this.k = false;
        this.l = true;
        this.a = parcel.readString();
        this.b = parcel.readString();
        this.f8943c = parcel.readInt();
        this.f8944d = parcel.readString();
        if (Build.VERSION.SDK_INT >= 33) {
            this.f8945e = parcel.readBlob();
        }
        this.f8946f = parcel.readString();
        this.f8947g = parcel.readString();
        this.h = parcel.readInt();
        this.i = parcel.readInt();
        this.j = parcel.readByte() != 0;
        this.k = parcel.readByte() != 0;
        this.l = parcel.readByte() != 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeInt(this.f8943c);
        parcel.writeString(this.f8944d);
        if (Build.VERSION.SDK_INT >= 33) {
            parcel.writeBlob(this.f8945e);
        }
        parcel.writeString(this.f8946f);
        parcel.writeString(this.f8947g);
        parcel.writeInt(this.h);
        parcel.writeInt(this.i);
        parcel.writeByte(this.j ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.k ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.l ? (byte) 1 : (byte) 0);
    }

    public VoipCall() {
        this.j = true;
        this.k = false;
        this.l = true;
    }
}
