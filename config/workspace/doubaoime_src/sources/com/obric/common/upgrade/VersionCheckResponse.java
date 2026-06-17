package com.obric.common.upgrade;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class VersionCheckResponse implements Parcelable {
    public static final a l = new a(null);
    private final boolean a;
    private final long b;

    /* renamed from: c, reason: collision with root package name */
    private final String f7555c;

    /* renamed from: d, reason: collision with root package name */
    private final String f7556d;

    /* renamed from: e, reason: collision with root package name */
    private final String f7557e;

    /* renamed from: f, reason: collision with root package name */
    private final int f7558f;

    /* renamed from: g, reason: collision with root package name */
    private final String f7559g;
    private String h;
    private int i;
    private boolean j;
    private long k;

    public static final class a implements Parcelable.Creator<VersionCheckResponse> {
        public a(kotlin.s.c.g gVar) {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public VersionCheckResponse createFromParcel(Parcel parcel) {
            kotlin.s.c.l.f(parcel, "parcel");
            kotlin.s.c.l.f(parcel, "parcel");
            boolean z = parcel.readByte() != 0;
            long readLong = parcel.readLong();
            String readString = parcel.readString();
            kotlin.s.c.l.c(readString);
            String readString2 = parcel.readString();
            kotlin.s.c.l.c(readString2);
            String readString3 = parcel.readString();
            kotlin.s.c.l.c(readString3);
            return new VersionCheckResponse(z, readLong, readString, readString2, readString3, parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readByte() != 0, parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public VersionCheckResponse[] newArray(int i) {
            return new VersionCheckResponse[i];
        }
    }

    public VersionCheckResponse(boolean z, long j, String str, String str2, String str3, int i, String str4, String str5, int i2, boolean z2, long j2) {
        e.a.a.a.a.u0(str, "versionName", str2, "apkUrl", str3, "md5");
        this.a = z;
        this.b = j;
        this.f7555c = str;
        this.f7556d = str2;
        this.f7557e = str3;
        this.f7558f = i;
        this.f7559g = str4;
        this.h = str5;
        this.i = i2;
        this.j = z2;
        this.k = j2;
    }

    public final String a() {
        return this.h;
    }

    public final String b() {
        return this.f7556d;
    }

    public final int c() {
        return this.i;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final boolean e() {
        return this.a;
    }

    public final String f() {
        return this.f7557e;
    }

    public final long g() {
        return this.k;
    }

    public final String i() {
        return this.f7559g;
    }

    public final int j() {
        return this.f7558f;
    }

    public final long k() {
        return this.b;
    }

    public final String m() {
        return this.f7555c;
    }

    public final boolean n() {
        return this.j;
    }

    public final void q(String str) {
        this.h = str;
    }

    public final void t(boolean z) {
        this.j = z;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        kotlin.s.c.l.f(parcel, "parcel");
        parcel.writeByte(this.a ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.b);
        parcel.writeString(this.f7555c);
        parcel.writeString(this.f7556d);
        parcel.writeString(this.f7557e);
        parcel.writeInt(this.f7558f);
        parcel.writeString(this.f7559g);
        parcel.writeString(this.h);
        parcel.writeInt(this.i);
        parcel.writeByte(this.j ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.k);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ VersionCheckResponse(boolean z, long j, String str, String str2, String str3, int i, String str4, String str5, int i2, boolean z2, long j2, int i3) {
        this(z, j, str, str2, str3, i, (i3 & 64) != 0 ? "" : str4, null, (i3 & 256) != 0 ? 0 : i2, (i3 & 512) != 0 ? true : z2, (i3 & 1024) != 0 ? 0L : j2);
        int i4 = i3 & 128;
    }
}
