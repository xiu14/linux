package com.bumptech.glide.load.data;

import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import com.bumptech.glide.load.data.e;
import java.io.IOException;

/* loaded from: classes.dex */
public final class ParcelFileDescriptorRewinder implements e<ParcelFileDescriptor> {
    private final InternalRewinder a;

    @RequiresApi(21)
    private static final class InternalRewinder {
        private final ParcelFileDescriptor a;

        InternalRewinder(ParcelFileDescriptor parcelFileDescriptor) {
            this.a = parcelFileDescriptor;
        }

        ParcelFileDescriptor rewind() throws IOException {
            try {
                Os.lseek(this.a.getFileDescriptor(), 0L, OsConstants.SEEK_SET);
                return this.a;
            } catch (ErrnoException e2) {
                throw new IOException(e2);
            }
        }
    }

    @RequiresApi(21)
    public static final class a implements e.a<ParcelFileDescriptor> {
        @Override // com.bumptech.glide.load.data.e.a
        @NonNull
        public Class<ParcelFileDescriptor> a() {
            return ParcelFileDescriptor.class;
        }

        @Override // com.bumptech.glide.load.data.e.a
        @NonNull
        public e<ParcelFileDescriptor> b(@NonNull ParcelFileDescriptor parcelFileDescriptor) {
            return new ParcelFileDescriptorRewinder(parcelFileDescriptor);
        }
    }

    @RequiresApi(21)
    public ParcelFileDescriptorRewinder(ParcelFileDescriptor parcelFileDescriptor) {
        this.a = new InternalRewinder(parcelFileDescriptor);
    }

    public static boolean c() {
        return !"robolectric".equals(Build.FINGERPRINT);
    }

    @Override // com.bumptech.glide.load.data.e
    public void b() {
    }

    @Override // com.bumptech.glide.load.data.e
    @NonNull
    @RequiresApi(21)
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public ParcelFileDescriptor a() throws IOException {
        return this.a.rewind();
    }
}
