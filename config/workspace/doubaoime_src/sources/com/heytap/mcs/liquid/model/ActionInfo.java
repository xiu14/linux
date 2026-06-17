package com.heytap.mcs.liquid.model;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public class ActionInfo implements Parcelable {
    public static final Parcelable.Creator<ActionInfo> CREATOR = new a();
    private int a;
    private String b;

    /* renamed from: c, reason: collision with root package name */
    private String f6857c;

    /* renamed from: d, reason: collision with root package name */
    private String f6858d;

    /* renamed from: e, reason: collision with root package name */
    private String f6859e;

    static class a implements Parcelable.Creator<ActionInfo> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public ActionInfo createFromParcel(Parcel parcel) {
            return new ActionInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public ActionInfo[] newArray(int i) {
            return new ActionInfo[i];
        }
    }

    protected ActionInfo(Parcel parcel) {
        this.a = parcel.readInt();
        this.b = parcel.readString();
        this.f6857c = parcel.readString();
        this.f6858d = parcel.readString();
        this.f6859e = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder R = e.a.a.a.a.R("ActionInfo{", "clickType=");
        R.append(this.a);
        R.append(", actionActivity='");
        e.a.a.a.a.G0(R, this.b, '\'', ", actionUrl='");
        e.a.a.a.a.G0(R, this.f6857c, '\'', ", actionParams='");
        e.a.a.a.a.G0(R, this.f6858d, '\'', ", targetPkgName='");
        return e.a.a.a.a.H(R, this.f6859e, '\'', '}');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.f6857c);
        parcel.writeString(this.f6858d);
        parcel.writeString(this.f6859e);
    }
}
