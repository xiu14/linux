package com.facebook.imagepipeline.platform;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import com.facebook.soloader.e;

@e
/* loaded from: classes2.dex */
class PreverificationHelper {
    PreverificationHelper() {
    }

    @e
    @TargetApi(26)
    boolean shouldUseHardwareBitmapConfig(Bitmap.Config config) {
        return config == Bitmap.Config.HARDWARE;
    }
}
