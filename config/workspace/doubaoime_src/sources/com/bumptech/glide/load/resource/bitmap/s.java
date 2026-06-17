package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.ParcelFileDescriptor;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
interface s {

    public static final class a implements s {
        private final ByteBuffer a;
        private final List<ImageHeaderParser> b;

        /* renamed from: c, reason: collision with root package name */
        private final com.bumptech.glide.load.engine.B.b f1759c;

        a(ByteBuffer byteBuffer, List<ImageHeaderParser> list, com.bumptech.glide.load.engine.B.b bVar) {
            this.a = byteBuffer;
            this.b = list;
            this.f1759c = bVar;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.s
        public int a() throws IOException {
            return com.bumptech.glide.load.c.c(this.b, com.bumptech.glide.util.a.c(this.a), this.f1759c);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.s
        @Nullable
        public Bitmap b(BitmapFactory.Options options) {
            return BitmapFactory.decodeStream(com.bumptech.glide.util.a.f(com.bumptech.glide.util.a.c(this.a)), null, options);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.s
        public void c() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.s
        public ImageHeaderParser.ImageType d() throws IOException {
            return com.bumptech.glide.load.c.g(this.b, com.bumptech.glide.util.a.c(this.a));
        }
    }

    public static final class b implements s {
        private final com.bumptech.glide.load.data.k a;
        private final com.bumptech.glide.load.engine.B.b b;

        /* renamed from: c, reason: collision with root package name */
        private final List<ImageHeaderParser> f1760c;

        b(InputStream inputStream, List<ImageHeaderParser> list, com.bumptech.glide.load.engine.B.b bVar) {
            Objects.requireNonNull(bVar, "Argument must not be null");
            this.b = bVar;
            Objects.requireNonNull(list, "Argument must not be null");
            this.f1760c = list;
            this.a = new com.bumptech.glide.load.data.k(inputStream, bVar);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.s
        public int a() throws IOException {
            return com.bumptech.glide.load.c.b(this.f1760c, this.a.a(), this.b);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.s
        @Nullable
        public Bitmap b(BitmapFactory.Options options) throws IOException {
            return BitmapFactory.decodeStream(this.a.a(), null, options);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.s
        public void c() {
            this.a.c();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.s
        public ImageHeaderParser.ImageType d() throws IOException {
            return com.bumptech.glide.load.c.f(this.f1760c, this.a.a(), this.b);
        }
    }

    @RequiresApi(21)
    public static final class c implements s {
        private final com.bumptech.glide.load.engine.B.b a;
        private final List<ImageHeaderParser> b;

        /* renamed from: c, reason: collision with root package name */
        private final ParcelFileDescriptorRewinder f1761c;

        c(ParcelFileDescriptor parcelFileDescriptor, List<ImageHeaderParser> list, com.bumptech.glide.load.engine.B.b bVar) {
            Objects.requireNonNull(bVar, "Argument must not be null");
            this.a = bVar;
            Objects.requireNonNull(list, "Argument must not be null");
            this.b = list;
            this.f1761c = new ParcelFileDescriptorRewinder(parcelFileDescriptor);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.s
        public int a() throws IOException {
            return com.bumptech.glide.load.c.a(this.b, this.f1761c, this.a);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.s
        @Nullable
        public Bitmap b(BitmapFactory.Options options) throws IOException {
            return BitmapFactory.decodeFileDescriptor(this.f1761c.a().getFileDescriptor(), null, options);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.s
        public void c() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.s
        public ImageHeaderParser.ImageType d() throws IOException {
            return com.bumptech.glide.load.c.e(this.b, this.f1761c, this.a);
        }
    }

    int a() throws IOException;

    @Nullable
    Bitmap b(BitmapFactory.Options options) throws IOException;

    void c();

    ImageHeaderParser.ImageType d() throws IOException;
}
