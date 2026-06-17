package com.ttnet.org.chromium.base.library_loader;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import androidx.annotation.VisibleForTesting;
import com.ttnet.org.chromium.base.annotations.AccessedByNative;
import com.ttnet.org.chromium.base.d;
import java.io.IOException;

/* loaded from: classes2.dex */
abstract class Linker {
    private static Linker a;

    protected Linker() {
        a = this;
    }

    @VisibleForTesting(otherwise = 4)
    static class LibInfo implements Parcelable {
        public static final Parcelable.Creator<LibInfo> CREATOR = new a();
        public String a;

        @AccessedByNative
        public long mLoadAddress;

        @AccessedByNative
        public long mLoadSize;

        @AccessedByNative
        public int mRelroFd;

        @AccessedByNative
        public long mRelroSize;

        @AccessedByNative
        public long mRelroStart;

        class a implements Parcelable.Creator<LibInfo> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            public LibInfo createFromParcel(Parcel parcel) {
                return new LibInfo(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public LibInfo[] newArray(int i) {
                return new LibInfo[i];
            }
        }

        LibInfo() {
            this.mRelroFd = -1;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 1;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.a);
            parcel.writeLong(this.mLoadAddress);
            parcel.writeLong(this.mLoadSize);
            parcel.writeLong(this.mRelroStart);
            parcel.writeLong(this.mRelroSize);
            parcel.writeInt(this.mRelroFd >= 0 ? 1 : 0);
            int i2 = this.mRelroFd;
            if (i2 >= 0) {
                try {
                    ParcelFileDescriptor fromFd = ParcelFileDescriptor.fromFd(i2);
                    fromFd.writeToParcel(parcel, 0);
                    fromFd.close();
                } catch (IOException e2) {
                    d.a("Linker", "Can't write LibInfo file descriptor to parcel", e2);
                }
            }
        }

        LibInfo(Parcel parcel) {
            this.mRelroFd = -1;
            this.a = parcel.readString();
            this.mLoadAddress = parcel.readLong();
            this.mLoadSize = parcel.readLong();
            this.mRelroStart = parcel.readLong();
            this.mRelroSize = parcel.readLong();
            if (parcel.readInt() != 0) {
                ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) ParcelFileDescriptor.CREATOR.createFromParcel(parcel);
                if (parcelFileDescriptor != null) {
                    this.mRelroFd = parcelFileDescriptor.detachFd();
                    return;
                }
                return;
            }
            this.mRelroFd = -1;
        }
    }
}
