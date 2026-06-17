package com.facebook.imagepipeline.memory;

import android.graphics.Bitmap;
import com.facebook.common.memory.MemoryTrimType;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes2.dex */
public class o implements e {
    private final Set<Bitmap> a = Collections.newSetFromMap(new IdentityHashMap());

    @Override // com.facebook.common.memory.b
    public void a(MemoryTrimType memoryTrimType) {
    }

    @Override // com.facebook.common.memory.e
    public Bitmap get(int i) {
        Bitmap createBitmap = Bitmap.createBitmap(1, (int) Math.ceil(i / 2.0d), Bitmap.Config.RGB_565);
        this.a.add(createBitmap);
        return createBitmap;
    }

    @Override // com.facebook.common.memory.e, e.c.c.g.d
    public void release(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        Objects.requireNonNull(bitmap);
        this.a.remove(bitmap);
        bitmap.recycle();
    }
}
