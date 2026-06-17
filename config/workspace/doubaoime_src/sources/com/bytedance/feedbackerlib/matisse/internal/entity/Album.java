package com.bytedance.feedbackerlib.matisse.internal.entity;

import android.database.Cursor;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.feedbackerlib.manager.F;

/* loaded from: classes.dex */
public class Album implements Parcelable {
    public static final Parcelable.Creator<Album> CREATOR = new a();

    /* renamed from: e, reason: collision with root package name */
    public static final String f4850e = String.valueOf(-1);
    private final String a;
    private final Uri b;

    /* renamed from: c, reason: collision with root package name */
    private final String f4851c;

    /* renamed from: d, reason: collision with root package name */
    private long f4852d;

    static class a implements Parcelable.Creator<Album> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public Album createFromParcel(Parcel parcel) {
            return new Album(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        public Album[] newArray(int i) {
            return new Album[i];
        }
    }

    public Album(String str, Uri uri, String str2, long j) {
        this.a = str;
        this.b = uri;
        this.f4851c = str2;
        this.f4852d = j;
    }

    public static Album i(Cursor cursor) {
        String string = cursor.getString(cursor.getColumnIndex("uri"));
        String string2 = cursor.getString(cursor.getColumnIndex("bucket_id"));
        if (string == null) {
            string = "";
        }
        return new Album(string2, Uri.parse(string), cursor.getString(cursor.getColumnIndex("bucket_display_name")), cursor.getLong(cursor.getColumnIndex("count")));
    }

    public long a() {
        return this.f4852d;
    }

    public Uri b() {
        return this.b;
    }

    public String c() {
        return f() ? F.d().f("recent") : this.f4851c;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String e() {
        return this.a;
    }

    public boolean f() {
        return f4850e.equals(this.a);
    }

    public boolean g() {
        return this.f4852d == 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeParcelable(this.b, 0);
        parcel.writeString(this.f4851c);
        parcel.writeLong(this.f4852d);
    }

    Album(Parcel parcel, a aVar) {
        this.a = parcel.readString();
        this.b = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.f4851c = parcel.readString();
        this.f4852d = parcel.readLong();
    }
}
