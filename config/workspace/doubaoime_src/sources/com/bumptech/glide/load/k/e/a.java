package com.bumptech.glide.load.k.e;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.engine.v;
import com.bumptech.glide.load.g;
import com.bumptech.glide.util.j;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

@RequiresApi(28)
/* loaded from: classes.dex */
public final class a {
    private final List<ImageHeaderParser> a;
    private final com.bumptech.glide.load.engine.B.b b;

    /* renamed from: com.bumptech.glide.load.k.e.a$a, reason: collision with other inner class name */
    private static final class C0038a implements v<Drawable> {
        private final AnimatedImageDrawable a;

        C0038a(AnimatedImageDrawable animatedImageDrawable) {
            this.a = animatedImageDrawable;
        }

        @Override // com.bumptech.glide.load.engine.v
        public int a() {
            return j.d(Bitmap.Config.ARGB_8888) * this.a.getIntrinsicHeight() * this.a.getIntrinsicWidth() * 2;
        }

        @Override // com.bumptech.glide.load.engine.v
        @NonNull
        public Class<Drawable> c() {
            return Drawable.class;
        }

        @Override // com.bumptech.glide.load.engine.v
        @NonNull
        public Drawable get() {
            return this.a;
        }

        @Override // com.bumptech.glide.load.engine.v
        public void recycle() {
            this.a.stop();
            this.a.clearAnimationCallbacks();
        }
    }

    private static final class b implements g<ByteBuffer, Drawable> {
        private final a a;

        b(a aVar) {
            this.a = aVar;
        }

        @Override // com.bumptech.glide.load.g
        public boolean a(@NonNull ByteBuffer byteBuffer, @NonNull com.bumptech.glide.load.f fVar) throws IOException {
            return this.a.d(byteBuffer);
        }

        @Override // com.bumptech.glide.load.g
        public v<Drawable> b(@NonNull ByteBuffer byteBuffer, int i, int i2, @NonNull com.bumptech.glide.load.f fVar) throws IOException {
            return this.a.b(ImageDecoder.createSource(byteBuffer), i, i2, fVar);
        }
    }

    private static final class c implements g<InputStream, Drawable> {
        private final a a;

        c(a aVar) {
            this.a = aVar;
        }

        @Override // com.bumptech.glide.load.g
        public boolean a(@NonNull InputStream inputStream, @NonNull com.bumptech.glide.load.f fVar) throws IOException {
            return this.a.c(inputStream);
        }

        @Override // com.bumptech.glide.load.g
        public v<Drawable> b(@NonNull InputStream inputStream, int i, int i2, @NonNull com.bumptech.glide.load.f fVar) throws IOException {
            return this.a.b(ImageDecoder.createSource(com.bumptech.glide.util.a.b(inputStream)), i, i2, fVar);
        }
    }

    private a(List<ImageHeaderParser> list, com.bumptech.glide.load.engine.B.b bVar) {
        this.a = list;
        this.b = bVar;
    }

    public static g<ByteBuffer, Drawable> a(List<ImageHeaderParser> list, com.bumptech.glide.load.engine.B.b bVar) {
        return new b(new a(list, bVar));
    }

    private boolean e(ImageHeaderParser.ImageType imageType) {
        return imageType == ImageHeaderParser.ImageType.ANIMATED_WEBP || (Build.VERSION.SDK_INT >= 31 && imageType == ImageHeaderParser.ImageType.ANIMATED_AVIF);
    }

    public static g<InputStream, Drawable> f(List<ImageHeaderParser> list, com.bumptech.glide.load.engine.B.b bVar) {
        return new c(new a(list, bVar));
    }

    v<Drawable> b(@NonNull ImageDecoder.Source source, int i, int i2, @NonNull com.bumptech.glide.load.f fVar) throws IOException {
        Drawable decodeDrawable = ImageDecoder.decodeDrawable(source, new com.bumptech.glide.load.k.a(i, i2, fVar));
        if (decodeDrawable instanceof AnimatedImageDrawable) {
            return new C0038a((AnimatedImageDrawable) decodeDrawable);
        }
        throw new IOException("Received unexpected drawable type for animated image, failing: " + decodeDrawable);
    }

    boolean c(InputStream inputStream) throws IOException {
        return e(com.bumptech.glide.load.c.f(this.a, inputStream, this.b));
    }

    boolean d(ByteBuffer byteBuffer) throws IOException {
        return e(com.bumptech.glide.load.c.g(this.a, byteBuffer));
    }
}
