package com.facebook.imagepipeline.platform;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import androidx.core.util.Pools;
import com.facebook.imagepipeline.memory.e;

@TargetApi(26)
/* loaded from: classes2.dex */
public class b extends a {
    public b(e eVar, int i, Pools.SynchronizedPool synchronizedPool) {
        super(eVar, i, synchronizedPool);
    }

    @Override // com.facebook.imagepipeline.platform.a
    public int e(int i, int i2, BitmapFactory.Options options) {
        ColorSpace colorSpace = options.outColorSpace;
        return colorSpace != null && colorSpace.isWideGamut() && options.inPreferredConfig != Bitmap.Config.RGBA_F16 ? i * i2 * 8 : com.facebook.imageutils.b.d(i, i2, options.inPreferredConfig);
    }
}
