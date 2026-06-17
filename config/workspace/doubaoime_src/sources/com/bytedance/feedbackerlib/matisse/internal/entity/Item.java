package com.bytedance.feedbackerlib.matisse.internal.entity;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.provider.MediaStore;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.feedbackerlib.matisse.MimeType;
import com.bytedance.feedbackerlib.util.f;
import com.ss.android.socialbase.downloader.constants.DBDefinition;

/* loaded from: classes.dex */
public class Item implements Parcelable {
    public static final Parcelable.Creator<Item> CREATOR = new a();
    public final long a;
    public final String b;

    /* renamed from: c, reason: collision with root package name */
    public Uri f4853c;

    /* renamed from: d, reason: collision with root package name */
    public final long f4854d;

    /* renamed from: e, reason: collision with root package name */
    public final long f4855e;

    /* renamed from: f, reason: collision with root package name */
    public String f4856f;

    static class a implements Parcelable.Creator<Item> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        @Nullable
        public Item createFromParcel(Parcel parcel) {
            return new Item(parcel, (a) null);
        }

        @Override // android.os.Parcelable.Creator
        public Item[] newArray(int i) {
            return new Item[i];
        }
    }

    public Item(long j, String str, long j2, long j3, String str2) {
        this.a = j;
        this.b = str;
        this.f4856f = str2;
        this.f4853c = ContentUris.withAppendedId(b() ? MediaStore.Images.Media.EXTERNAL_CONTENT_URI : c() ? MediaStore.Video.Media.EXTERNAL_CONTENT_URI : MediaStore.Files.getContentUri("external"), j);
        this.f4854d = j2;
        this.f4855e = j3;
    }

    public static Item e(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("bucket_id");
        return new Item(cursor.getLong(cursor.getColumnIndex(DBDefinition.ID)), cursor.getString(cursor.getColumnIndex("mime_type")), cursor.getLong(cursor.getColumnIndex("_size")), cursor.getLong(cursor.getColumnIndex("duration")), columnIndex >= 0 ? cursor.getString(columnIndex) : "");
    }

    public boolean a() {
        return MimeType.isGif(this.b);
    }

    public boolean b() {
        return MimeType.isImage(this.b);
    }

    public boolean c() {
        return MimeType.isVideo(this.b);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Item)) {
            return false;
        }
        Item item = (Item) obj;
        Uri uri = this.f4853c;
        return (uri != null && uri.equals(item.f4853c)) || (this.f4853c == null && item.f4853c == null);
    }

    public int hashCode() {
        return this.f4853c.hashCode() + 31;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeString(this.b);
        parcel.writeParcelable(this.f4853c, 0);
        parcel.writeLong(this.f4854d);
        parcel.writeLong(this.f4855e);
        parcel.writeString(this.f4856f);
    }

    public Item(@NonNull Context context, @NonNull Uri uri) {
        if (uri != null && context != null) {
            ContentResolver contentResolver = context.getContentResolver();
            if (contentResolver == null) {
                this.f4853c = null;
                this.a = -1L;
                this.b = null;
                this.f4854d = -1L;
                this.f4855e = -1L;
                this.f4856f = null;
                return;
            }
            this.f4853c = uri;
            Cursor query = contentResolver.query(uri, null, null, null, null);
            try {
                if (!query.moveToFirst()) {
                    this.f4853c = null;
                    this.a = -1L;
                    this.b = null;
                    this.f4854d = -1L;
                    this.f4855e = -1L;
                    this.f4856f = null;
                    return;
                }
                if (f.g(uri)) {
                    this.a = query.getLong(query.getColumnIndex(DBDefinition.ID));
                    this.b = query.getString(query.getColumnIndex("mime_type"));
                    this.f4854d = query.getLong(query.getColumnIndex("_size"));
                    this.f4855e = 0L;
                    this.f4856f = query.getString(query.getColumnIndex("bucket_id"));
                } else {
                    this.a = query.getLong(query.getColumnIndex(DBDefinition.ID));
                    this.b = query.getString(query.getColumnIndex("mime_type"));
                    this.f4854d = query.getLong(query.getColumnIndex("_size"));
                    this.f4855e = 0L;
                    this.f4856f = query.getString(query.getColumnIndex("bucket_id"));
                }
                return;
            } finally {
                query.close();
            }
        }
        this.f4853c = null;
        this.a = -1L;
        this.b = null;
        this.f4854d = -1L;
        this.f4855e = -1L;
        this.f4856f = null;
    }

    Item(Parcel parcel, a aVar) {
        this.a = parcel.readLong();
        this.b = parcel.readString();
        this.f4853c = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.f4854d = parcel.readLong();
        this.f4855e = parcel.readLong();
        this.f4856f = parcel.readString();
    }
}
