package com.facebook.imagepipeline.producers;

import android.graphics.Bitmap;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes2.dex */
class H implements com.facebook.cache.common.i {
    final /* synthetic */ Bitmap a;

    H(I i, boolean z, Bitmap bitmap) {
        this.a = bitmap;
    }

    @Override // com.facebook.cache.common.i
    public void a(OutputStream outputStream) throws IOException {
        this.a.compress(Bitmap.CompressFormat.PNG, 100, outputStream);
    }
}
