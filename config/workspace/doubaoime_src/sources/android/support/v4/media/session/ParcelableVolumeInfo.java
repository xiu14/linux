package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new a();
    public int a;
    public int b;

    /* renamed from: c, reason: collision with root package name */
    public int f1203c;

    /* renamed from: d, reason: collision with root package name */
    public int f1204d;

    /* renamed from: e, reason: collision with root package name */
    public int f1205e;

    static class a implements Parcelable.Creator<ParcelableVolumeInfo> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public ParcelableVolumeInfo createFromParcel(Parcel parcel) {
            return new ParcelableVolumeInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public ParcelableVolumeInfo[] newArray(int i) {
            return new ParcelableVolumeInfo[i];
        }
    }

    public ParcelableVolumeInfo(Parcel parcel) {
        this.a = parcel.readInt();
        this.f1203c = parcel.readInt();
        this.f1204d = parcel.readInt();
        this.f1205e = parcel.readInt();
        this.b = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.f1203c);
        parcel.writeInt(this.f1204d);
        parcel.writeInt(this.f1205e);
        parcel.writeInt(this.b);
    }
}
