package com.facebook.imagepipeline.memory;

import android.graphics.Bitmap;
import com.facebook.common.memory.MemoryTrimType;
import java.util.Objects;

/* loaded from: classes2.dex */
public class n implements e {
    @Override // com.facebook.common.memory.b
    public void a(MemoryTrimType memoryTrimType) {
    }

    @Override // com.facebook.common.memory.e
    public Bitmap get(int i) {
        return Bitmap.createBitmap(1, (int) Math.ceil(i / 2.0d), Bitmap.Config.RGB_565);
    }

    @Override // com.facebook.common.memory.e, e.c.c.g.d
    public void release(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        Objects.requireNonNull(bitmap);
        bitmap.recycle();
    }
}
