package com.bumptech.glide.load.resource.gif;

import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.engine.v;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes.dex */
public class i implements com.bumptech.glide.load.g<InputStream, GifDrawable> {
    private final List<ImageHeaderParser> a;
    private final com.bumptech.glide.load.g<ByteBuffer, GifDrawable> b;

    /* renamed from: c, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.B.b f1786c;

    public i(List<ImageHeaderParser> list, com.bumptech.glide.load.g<ByteBuffer, GifDrawable> gVar, com.bumptech.glide.load.engine.B.b bVar) {
        this.a = list;
        this.b = gVar;
        this.f1786c = bVar;
    }

    @Override // com.bumptech.glide.load.g
    public boolean a(@NonNull InputStream inputStream, @NonNull com.bumptech.glide.load.f fVar) throws IOException {
        return !((Boolean) fVar.c(h.b)).booleanValue() && com.bumptech.glide.load.c.f(this.a, inputStream, this.f1786c) == ImageHeaderParser.ImageType.GIF;
    }

    @Override // com.bumptech.glide.load.g
    public v<GifDrawable> b(@NonNull InputStream inputStream, int i, int i2, @NonNull com.bumptech.glide.load.f fVar) throws IOException {
        byte[] bArr;
        InputStream inputStream2 = inputStream;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            byte[] bArr2 = new byte[16384];
            while (true) {
                int read = inputStream2.read(bArr2);
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr2, 0, read);
            }
            byteArrayOutputStream.flush();
            bArr = byteArrayOutputStream.toByteArray();
        } catch (IOException e2) {
            if (Log.isLoggable("StreamGifDecoder", 5)) {
                Log.w("StreamGifDecoder", "Error reading data from stream", e2);
            }
            bArr = null;
        }
        if (bArr == null) {
            return null;
        }
        return this.b.b(ByteBuffer.wrap(bArr), i, i2, fVar);
    }
}
