package com.ttnet.org.chromium.base;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.ttnet.org.chromium.base.annotations.CalledByNative;

/* loaded from: classes2.dex */
public class UnguessableToken implements Parcelable {
    public static final Parcelable.Creator<UnguessableToken> CREATOR = new a();
    private final long a;
    private final long b;

    class a implements Parcelable.Creator<UnguessableToken> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public UnguessableToken createFromParcel(Parcel parcel) {
            long readLong = parcel.readLong();
            long readLong2 = parcel.readLong();
            if (readLong == 0 || readLong2 == 0) {
                return null;
            }
            return new UnguessableToken(readLong, readLong2, null);
        }

        @Override // android.os.Parcelable.Creator
        public UnguessableToken[] newArray(int i) {
            return new UnguessableToken[i];
        }
    }

    private UnguessableToken(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    @CalledByNative
    private static UnguessableToken create(long j, long j2) {
        return new UnguessableToken(j, j2);
    }

    @CalledByNative
    private UnguessableToken parcelAndUnparcelForTesting() {
        Parcel obtain = Parcel.obtain();
        writeToParcel(obtain, 0);
        obtain.setDataPosition(0);
        UnguessableToken createFromParcel = CREATOR.createFromParcel(obtain);
        obtain.recycle();
        return createFromParcel;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UnguessableToken unguessableToken = (UnguessableToken) obj;
        return unguessableToken.a == this.a && unguessableToken.b == this.b;
    }

    @CalledByNative
    public long getHighForSerialization() {
        return this.a;
    }

    @CalledByNative
    public long getLowForSerialization() {
        return this.b;
    }

    public int hashCode() {
        long j = this.b;
        long j2 = this.a;
        return (((int) (j ^ (j >>> 32))) * 31) + ((int) ((j2 >>> 32) ^ j2));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeLong(this.b);
    }

    UnguessableToken(long j, long j2, a aVar) {
        this.a = j;
        this.b = j2;
    }
}
