package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.huawei.hms.android.SystemUtils;
import java.io.IOException;
import java.util.Objects;

@RequiresApi(21)
/* loaded from: classes.dex */
public final class v implements com.bumptech.glide.load.g<ParcelFileDescriptor, Bitmap> {
    private final m a;

    public v(m mVar) {
        this.a = mVar;
    }

    @Override // com.bumptech.glide.load.g
    public boolean a(@NonNull ParcelFileDescriptor parcelFileDescriptor, @NonNull com.bumptech.glide.load.f fVar) throws IOException {
        ParcelFileDescriptor parcelFileDescriptor2 = parcelFileDescriptor;
        String str = Build.MANUFACTURER;
        if (!(!(SystemUtils.PRODUCT_HUAWEI.equalsIgnoreCase(str) || SystemUtils.PRODUCT_HONOR.equalsIgnoreCase(str)) || parcelFileDescriptor2.getStatSize() <= 536870912)) {
            return false;
        }
        Objects.requireNonNull(this.a);
        return ParcelFileDescriptorRewinder.c();
    }

    @Override // com.bumptech.glide.load.g
    @Nullable
    public com.bumptech.glide.load.engine.v<Bitmap> b(@NonNull ParcelFileDescriptor parcelFileDescriptor, int i, int i2, @NonNull com.bumptech.glide.load.f fVar) throws IOException {
        return this.a.a(parcelFileDescriptor, i, i2, fVar);
    }
}
