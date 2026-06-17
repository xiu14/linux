package com.heytap.mcs.liquid.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import e.f.a.a.a.a.b.b;

/* loaded from: classes2.dex */
public class SeedingRequest implements Parcelable {
    public static final Parcelable.Creator<SeedingRequest> CREATOR = new a();
    private String a;
    private String b;

    /* renamed from: c, reason: collision with root package name */
    private int f6860c;

    /* renamed from: d, reason: collision with root package name */
    private String f6861d;

    /* renamed from: e, reason: collision with root package name */
    private String f6862e;

    /* renamed from: f, reason: collision with root package name */
    private String f6863f;

    /* renamed from: g, reason: collision with root package name */
    private int f6864g;
    private String h;
    private ActionInfo i;
    private ActionInfo j;
    private int k;
    private b l;

    static class a implements Parcelable.Creator<SeedingRequest> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public SeedingRequest createFromParcel(Parcel parcel) {
            return new SeedingRequest(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public SeedingRequest[] newArray(int i) {
            return new SeedingRequest[i];
        }
    }

    public SeedingRequest() {
    }

    protected SeedingRequest(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readString();
        this.f6860c = parcel.readInt();
        this.f6861d = parcel.readString();
        this.f6862e = parcel.readString();
        this.f6863f = parcel.readString();
        this.f6864g = parcel.readInt();
        this.h = parcel.readString();
        this.i = (ActionInfo) parcel.readParcelable(ActionInfo.class.getClassLoader());
        this.j = (ActionInfo) parcel.readParcelable(ActionInfo.class.getClassLoader());
        this.k = parcel.readInt();
        this.l = b.a.asInterface(parcel.readStrongBinder());
    }

    public SeedingRequest(String str, String str2, int i, String str3, String str4, String str5, int i2, String str6, ActionInfo actionInfo, ActionInfo actionInfo2, int i3, b bVar) {
        this.a = str;
        this.b = str2;
        this.f6860c = i;
        this.f6861d = str3;
        this.f6862e = str4;
        this.f6863f = str5;
        this.f6864g = i2;
        this.h = str6;
        this.i = actionInfo;
        this.j = actionInfo2;
        this.k = i3;
        this.l = bVar;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeInt(this.f6860c);
        parcel.writeString(this.f6861d);
        parcel.writeString(this.f6862e);
        parcel.writeString(this.f6863f);
        parcel.writeInt(this.f6864g);
        parcel.writeString(this.h);
        parcel.writeParcelable(this.i, i);
        parcel.writeParcelable(this.j, i);
        parcel.writeInt(this.k);
        b bVar = this.l;
        parcel.writeStrongBinder(bVar != null ? bVar.asBinder() : null);
    }
}
