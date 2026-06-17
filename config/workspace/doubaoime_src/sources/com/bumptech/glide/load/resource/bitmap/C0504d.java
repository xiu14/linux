package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.io.IOException;

@RequiresApi(api = 28)
/* renamed from: com.bumptech.glide.load.resource.bitmap.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0504d implements com.bumptech.glide.load.g<ImageDecoder.Source, Bitmap> {
    private final com.bumptech.glide.load.engine.B.d a = new com.bumptech.glide.load.engine.B.e();

    @Override // com.bumptech.glide.load.g
    public /* bridge */ /* synthetic */ boolean a(@NonNull ImageDecoder.Source source, @NonNull com.bumptech.glide.load.f fVar) throws IOException {
        return true;
    }

    @Override // com.bumptech.glide.load.g
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public com.bumptech.glide.load.engine.v<Bitmap> b(@NonNull ImageDecoder.Source source, int i, int i2, @NonNull com.bumptech.glide.load.f fVar) throws IOException {
        Bitmap decodeBitmap = ImageDecoder.decodeBitmap(source, new com.bumptech.glide.load.k.a(i, i2, fVar));
        if (Log.isLoggable("BitmapImageDecoder", 2)) {
            StringBuilder M = e.a.a.a.a.M("Decoded [");
            M.append(decodeBitmap.getWidth());
            M.append("x");
            M.append(decodeBitmap.getHeight());
            M.append("] for [");
            M.append(i);
            M.append("x");
            M.append(i2);
            M.append("]");
            Log.v("BitmapImageDecoder", M.toString());
        }
        return new e(decodeBitmap, this.a);
    }
}
