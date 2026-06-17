package com.bumptech.glide.load.resource.bitmap;

import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.load.e;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class C<T> implements com.bumptech.glide.load.g<T, Bitmap> {

    /* renamed from: d, reason: collision with root package name */
    public static final com.bumptech.glide.load.e<Long> f1737d = com.bumptech.glide.load.e.a("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new a());

    /* renamed from: e, reason: collision with root package name */
    public static final com.bumptech.glide.load.e<Integer> f1738e = com.bumptech.glide.load.e.a("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, new b());

    /* renamed from: f, reason: collision with root package name */
    private static final f f1739f = new f();

    /* renamed from: g, reason: collision with root package name */
    private static final List<String> f1740g = Collections.unmodifiableList(Arrays.asList("TP1A", "TD1A.220804.031"));
    private final e<T> a;
    private final com.bumptech.glide.load.engine.B.d b;

    /* renamed from: c, reason: collision with root package name */
    private final f f1741c;

    class a implements e.b<Long> {
        private final ByteBuffer a = ByteBuffer.allocate(8);

        a() {
        }

        @Override // com.bumptech.glide.load.e.b
        public void a(@NonNull byte[] bArr, @NonNull Long l, @NonNull MessageDigest messageDigest) {
            Long l2 = l;
            messageDigest.update(bArr);
            synchronized (this.a) {
                this.a.position(0);
                messageDigest.update(this.a.putLong(l2.longValue()).array());
            }
        }
    }

    class b implements e.b<Integer> {
        private final ByteBuffer a = ByteBuffer.allocate(4);

        b() {
        }

        @Override // com.bumptech.glide.load.e.b
        public void a(@NonNull byte[] bArr, @NonNull Integer num, @NonNull MessageDigest messageDigest) {
            Integer num2 = num;
            if (num2 == null) {
                return;
            }
            messageDigest.update(bArr);
            synchronized (this.a) {
                this.a.position(0);
                messageDigest.update(this.a.putInt(num2.intValue()).array());
            }
        }
    }

    @RequiresApi(16)
    private static final class c implements e<AssetFileDescriptor> {
        c(a aVar) {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.C.e
        public void a(MediaExtractor mediaExtractor, AssetFileDescriptor assetFileDescriptor) throws IOException {
            AssetFileDescriptor assetFileDescriptor2 = assetFileDescriptor;
            mediaExtractor.setDataSource(assetFileDescriptor2.getFileDescriptor(), assetFileDescriptor2.getStartOffset(), assetFileDescriptor2.getLength());
        }

        @Override // com.bumptech.glide.load.resource.bitmap.C.e
        public void b(MediaMetadataRetriever mediaMetadataRetriever, AssetFileDescriptor assetFileDescriptor) {
            AssetFileDescriptor assetFileDescriptor2 = assetFileDescriptor;
            mediaMetadataRetriever.setDataSource(assetFileDescriptor2.getFileDescriptor(), assetFileDescriptor2.getStartOffset(), assetFileDescriptor2.getLength());
        }
    }

    @RequiresApi(23)
    static final class d implements e<ByteBuffer> {
        d() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.C.e
        public void a(MediaExtractor mediaExtractor, ByteBuffer byteBuffer) throws IOException {
            mediaExtractor.setDataSource(new D(this, byteBuffer));
        }

        @Override // com.bumptech.glide.load.resource.bitmap.C.e
        public void b(MediaMetadataRetriever mediaMetadataRetriever, ByteBuffer byteBuffer) {
            mediaMetadataRetriever.setDataSource(new D(this, byteBuffer));
        }
    }

    @VisibleForTesting
    interface e<T> {
        @RequiresApi(16)
        void a(MediaExtractor mediaExtractor, T t) throws IOException;

        void b(MediaMetadataRetriever mediaMetadataRetriever, T t);
    }

    @VisibleForTesting
    static class f {
        f() {
        }
    }

    static final class g implements e<ParcelFileDescriptor> {
        g() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.C.e
        @RequiresApi(16)
        public void a(MediaExtractor mediaExtractor, ParcelFileDescriptor parcelFileDescriptor) throws IOException {
            mediaExtractor.setDataSource(parcelFileDescriptor.getFileDescriptor());
        }

        @Override // com.bumptech.glide.load.resource.bitmap.C.e
        public void b(MediaMetadataRetriever mediaMetadataRetriever, ParcelFileDescriptor parcelFileDescriptor) {
            mediaMetadataRetriever.setDataSource(parcelFileDescriptor.getFileDescriptor());
        }
    }

    private static final class h extends RuntimeException {
        h() {
            super("MediaMetadataRetriever failed to retrieve a frame without throwing, check the adb logs for .*MetadataRetriever.* prior to this exception for details");
        }
    }

    C(com.bumptech.glide.load.engine.B.d dVar, e<T> eVar) {
        f fVar = f1739f;
        this.b = dVar;
        this.a = eVar;
        this.f1741c = fVar;
    }

    @RequiresApi(16)
    public static com.bumptech.glide.load.g<AssetFileDescriptor, Bitmap> c(com.bumptech.glide.load.engine.B.d dVar) {
        return new C(dVar, new c(null));
    }

    @RequiresApi(api = 23)
    public static com.bumptech.glide.load.g<ByteBuffer, Bitmap> d(com.bumptech.glide.load.engine.B.d dVar) {
        return new C(dVar, new d());
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x0148, code lost:
    
        if (java.lang.Math.abs(java.lang.Integer.parseInt(r18.extractMetadata(24))) == 180) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0110, code lost:
    
        if (r0 < 33) goto L68;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01a3  */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private android.graphics.Bitmap e(@androidx.annotation.NonNull T r17, android.media.MediaMetadataRetriever r18, long r19, int r21, int r22, int r23, com.bumptech.glide.load.resource.bitmap.DownsampleStrategy r24) {
        /*
            Method dump skipped, instructions count: 434
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.resource.bitmap.C.e(java.lang.Object, android.media.MediaMetadataRetriever, long, int, int, int, com.bumptech.glide.load.resource.bitmap.DownsampleStrategy):android.graphics.Bitmap");
    }

    public static com.bumptech.glide.load.g<ParcelFileDescriptor, Bitmap> f(com.bumptech.glide.load.engine.B.d dVar) {
        return new C(dVar, new g());
    }

    @Override // com.bumptech.glide.load.g
    public boolean a(@NonNull T t, @NonNull com.bumptech.glide.load.f fVar) {
        return true;
    }

    @Override // com.bumptech.glide.load.g
    public com.bumptech.glide.load.engine.v<Bitmap> b(@NonNull T t, int i, int i2, @NonNull com.bumptech.glide.load.f fVar) throws IOException {
        long longValue = ((Long) fVar.c(f1737d)).longValue();
        if (longValue < 0 && longValue != -1) {
            throw new IllegalArgumentException(e.a.a.a.a.n("Requested frame must be non-negative, or DEFAULT_FRAME, given: ", longValue));
        }
        Integer num = (Integer) fVar.c(f1738e);
        if (num == null) {
            num = 2;
        }
        DownsampleStrategy downsampleStrategy = (DownsampleStrategy) fVar.c(DownsampleStrategy.f1745f);
        if (downsampleStrategy == null) {
            downsampleStrategy = DownsampleStrategy.f1744e;
        }
        DownsampleStrategy downsampleStrategy2 = downsampleStrategy;
        Objects.requireNonNull(this.f1741c);
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            this.a.b(mediaMetadataRetriever, t);
            return com.bumptech.glide.load.resource.bitmap.e.b(e(t, mediaMetadataRetriever, longValue, num.intValue(), i, i2, downsampleStrategy2), this.b);
        } finally {
            if (Build.VERSION.SDK_INT >= 29) {
                mediaMetadataRetriever.close();
            } else {
                mediaMetadataRetriever.release();
            }
        }
    }
}
