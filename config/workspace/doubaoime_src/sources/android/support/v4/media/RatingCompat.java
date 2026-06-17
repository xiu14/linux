package android.support.v4.media;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new a();
    private final int a;
    private final float b;

    static class a implements Parcelable.Creator<RatingCompat> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public RatingCompat createFromParcel(Parcel parcel) {
            return new RatingCompat(parcel.readInt(), parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        public RatingCompat[] newArray(int i) {
            return new RatingCompat[i];
        }
    }

    RatingCompat(int i, float f2) {
        this.a = i;
        this.b = f2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return this.a;
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("Rating:style=");
        M.append(this.a);
        M.append(" rating=");
        float f2 = this.b;
        M.append(f2 < 0.0f ? "unrated" : String.valueOf(f2));
        return M.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeFloat(this.b);
    }
}
