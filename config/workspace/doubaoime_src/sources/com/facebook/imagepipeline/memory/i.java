package com.facebook.imagepipeline.memory;

import android.annotation.TargetApi;
import android.graphics.Bitmap;

@TargetApi(21)
/* loaded from: classes2.dex */
public class i extends AbstractC0719b<Bitmap> implements e {
    public i(com.facebook.common.memory.c cVar, B b, C c2, boolean z) {
        super(cVar, b, c2, z);
        j();
    }

    @Override // com.facebook.imagepipeline.memory.AbstractC0719b
    protected Bitmap b(int i) {
        return Bitmap.createBitmap(1, (int) Math.ceil(i / 2.0d), Bitmap.Config.RGB_565);
    }

    @Override // com.facebook.imagepipeline.memory.AbstractC0719b
    protected void d(Bitmap bitmap) {
        bitmap.recycle();
    }

    @Override // com.facebook.imagepipeline.memory.AbstractC0719b
    protected int f(int i) {
        return i;
    }

    @Override // com.facebook.imagepipeline.memory.AbstractC0719b
    protected int g(Bitmap bitmap) {
        return bitmap.getAllocationByteCount();
    }

    @Override // com.facebook.imagepipeline.memory.AbstractC0719b
    protected int h(int i) {
        return i;
    }

    @Override // com.facebook.imagepipeline.memory.AbstractC0719b
    protected Bitmap i(g<Bitmap> gVar) {
        Bitmap c2;
        synchronized (this) {
            c2 = gVar.c();
        }
        Bitmap bitmap = c2;
        if (bitmap != null) {
            bitmap.eraseColor(0);
        }
        return bitmap;
    }

    @Override // com.facebook.imagepipeline.memory.AbstractC0719b
    protected boolean l(Bitmap bitmap) {
        Bitmap bitmap2 = bitmap;
        return !bitmap2.isRecycled() && bitmap2.isMutable();
    }
}
