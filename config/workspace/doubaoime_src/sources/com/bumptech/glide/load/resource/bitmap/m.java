package com.bumptech.glide.load.resource.bitmap;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.ParcelFileDescriptor;
import android.util.DisplayMetrics;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.PreferredColorSpace;
import com.bumptech.glide.load.resource.bitmap.s;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Queue;
import java.util.Set;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: f, reason: collision with root package name */
    public static final com.bumptech.glide.load.e<DecodeFormat> f1748f = com.bumptech.glide.load.e.d("com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat", DecodeFormat.DEFAULT);

    /* renamed from: g, reason: collision with root package name */
    public static final com.bumptech.glide.load.e<PreferredColorSpace> f1749g = com.bumptech.glide.load.e.c("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace");
    public static final com.bumptech.glide.load.e<Boolean> h;
    public static final com.bumptech.glide.load.e<Boolean> i;
    private static final Set<String> j;
    private static final b k;
    private static final Set<ImageHeaderParser.ImageType> l;
    private static final Queue<BitmapFactory.Options> m;
    private final com.bumptech.glide.load.engine.B.d a;
    private final DisplayMetrics b;

    /* renamed from: c, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.B.b f1750c;

    /* renamed from: d, reason: collision with root package name */
    private final List<ImageHeaderParser> f1751d;

    /* renamed from: e, reason: collision with root package name */
    private final r f1752e = r.a();

    class a implements b {
        a() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.m.b
        public void a(com.bumptech.glide.load.engine.B.d dVar, Bitmap bitmap) {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.m.b
        public void b() {
        }
    }

    public interface b {
        void a(com.bumptech.glide.load.engine.B.d dVar, Bitmap bitmap) throws IOException;

        void b();
    }

    static {
        com.bumptech.glide.load.e<DownsampleStrategy> eVar = DownsampleStrategy.f1745f;
        Boolean bool = Boolean.FALSE;
        h = com.bumptech.glide.load.e.d("com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize", bool);
        i = com.bumptech.glide.load.e.d("com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode", bool);
        j = Collections.unmodifiableSet(new HashSet(Arrays.asList("image/vnd.wap.wbmp", "image/x-ico")));
        k = new a();
        l = Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser.ImageType.JPEG, ImageHeaderParser.ImageType.PNG_A, ImageHeaderParser.ImageType.PNG));
        int i2 = com.bumptech.glide.util.j.f1862d;
        m = new ArrayDeque(0);
    }

    public m(List<ImageHeaderParser> list, DisplayMetrics displayMetrics, com.bumptech.glide.load.engine.B.d dVar, com.bumptech.glide.load.engine.B.b bVar) {
        this.f1751d = list;
        Objects.requireNonNull(displayMetrics, "Argument must not be null");
        this.b = displayMetrics;
        Objects.requireNonNull(dVar, "Argument must not be null");
        this.a = dVar;
        Objects.requireNonNull(bVar, "Argument must not be null");
        this.f1750c = bVar;
    }

    private com.bumptech.glide.load.engine.v<Bitmap> b(s sVar, int i2, int i3, com.bumptech.glide.load.f fVar, b bVar) throws IOException {
        Queue<BitmapFactory.Options> queue;
        BitmapFactory.Options poll;
        BitmapFactory.Options options;
        byte[] bArr = (byte[]) this.f1750c.c(65536, byte[].class);
        synchronized (m.class) {
            queue = m;
            synchronized (queue) {
                poll = queue.poll();
            }
            if (poll == null) {
                poll = new BitmapFactory.Options();
                l(poll);
            }
            options = poll;
        }
        options.inTempStorage = bArr;
        DecodeFormat decodeFormat = (DecodeFormat) fVar.c(f1748f);
        PreferredColorSpace preferredColorSpace = (PreferredColorSpace) fVar.c(f1749g);
        DownsampleStrategy downsampleStrategy = (DownsampleStrategy) fVar.c(DownsampleStrategy.f1745f);
        boolean booleanValue = ((Boolean) fVar.c(h)).booleanValue();
        com.bumptech.glide.load.e<Boolean> eVar = i;
        try {
            e b2 = e.b(e(sVar, options, downsampleStrategy, decodeFormat, preferredColorSpace, fVar.c(eVar) != null && ((Boolean) fVar.c(eVar)).booleanValue(), i2, i3, booleanValue, bVar), this.a);
            l(options);
            synchronized (queue) {
                queue.offer(options);
            }
            this.f1750c.put(bArr);
            return b2;
        } catch (Throwable th) {
            l(options);
            Queue<BitmapFactory.Options> queue2 = m;
            synchronized (queue2) {
                queue2.offer(options);
                this.f1750c.put(bArr);
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x02e7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0359 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x043b  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x029d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private android.graphics.Bitmap e(com.bumptech.glide.load.resource.bitmap.s r33, android.graphics.BitmapFactory.Options r34, com.bumptech.glide.load.resource.bitmap.DownsampleStrategy r35, com.bumptech.glide.load.DecodeFormat r36, com.bumptech.glide.load.PreferredColorSpace r37, boolean r38, int r39, int r40, boolean r41, com.bumptech.glide.load.resource.bitmap.m.b r42) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1144
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.resource.bitmap.m.e(com.bumptech.glide.load.resource.bitmap.s, android.graphics.BitmapFactory$Options, com.bumptech.glide.load.resource.bitmap.DownsampleStrategy, com.bumptech.glide.load.DecodeFormat, com.bumptech.glide.load.PreferredColorSpace, boolean, int, int, boolean, com.bumptech.glide.load.resource.bitmap.m$b):android.graphics.Bitmap");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:?, code lost:
    
        throw r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static android.graphics.Bitmap f(com.bumptech.glide.load.resource.bitmap.s r5, android.graphics.BitmapFactory.Options r6, com.bumptech.glide.load.resource.bitmap.m.b r7, com.bumptech.glide.load.engine.B.d r8) throws java.io.IOException {
        /*
            java.lang.String r0 = "Downsampler"
            boolean r1 = r6.inJustDecodeBounds
            if (r1 != 0) goto Lc
            r7.b()
            r5.c()
        Lc:
            int r1 = r6.outWidth
            int r2 = r6.outHeight
            java.lang.String r3 = r6.outMimeType
            java.util.concurrent.locks.Lock r4 = com.bumptech.glide.load.resource.bitmap.A.g()
            r4.lock()
            android.graphics.Bitmap r5 = r5.b(r6)     // Catch: java.lang.Throwable -> L25 java.lang.IllegalArgumentException -> L27
        L1d:
            java.util.concurrent.locks.Lock r6 = com.bumptech.glide.load.resource.bitmap.A.g()
            r6.unlock()
            return r5
        L25:
            r5 = move-exception
            goto L49
        L27:
            r4 = move-exception
            java.io.IOException r1 = k(r4, r1, r2, r3, r6)     // Catch: java.lang.Throwable -> L25
            r2 = 3
            boolean r2 = android.util.Log.isLoggable(r0, r2)     // Catch: java.lang.Throwable -> L25
            if (r2 == 0) goto L38
            java.lang.String r2 = "Failed to decode with inBitmap, trying again without Bitmap re-use"
            android.util.Log.d(r0, r2, r1)     // Catch: java.lang.Throwable -> L25
        L38:
            android.graphics.Bitmap r0 = r6.inBitmap     // Catch: java.lang.Throwable -> L25
            if (r0 == 0) goto L48
            r8.c(r0)     // Catch: java.lang.Throwable -> L25 java.io.IOException -> L47
            r0 = 0
            r6.inBitmap = r0     // Catch: java.lang.Throwable -> L25 java.io.IOException -> L47
            android.graphics.Bitmap r5 = f(r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L25 java.io.IOException -> L47
            goto L1d
        L47:
            throw r1     // Catch: java.lang.Throwable -> L25
        L48:
            throw r1     // Catch: java.lang.Throwable -> L25
        L49:
            java.util.concurrent.locks.Lock r6 = com.bumptech.glide.load.resource.bitmap.A.g()
            r6.unlock()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.resource.bitmap.m.f(com.bumptech.glide.load.resource.bitmap.s, android.graphics.BitmapFactory$Options, com.bumptech.glide.load.resource.bitmap.m$b, com.bumptech.glide.load.engine.B.d):android.graphics.Bitmap");
    }

    @Nullable
    @TargetApi(19)
    private static String g(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        StringBuilder M = e.a.a.a.a.M(" (");
        M.append(bitmap.getAllocationByteCount());
        M.append(")");
        String sb = M.toString();
        StringBuilder M2 = e.a.a.a.a.M("[");
        M2.append(bitmap.getWidth());
        M2.append("x");
        M2.append(bitmap.getHeight());
        M2.append("] ");
        M2.append(bitmap.getConfig());
        M2.append(sb);
        return M2.toString();
    }

    private static int h(double d2) {
        if (d2 > 1.0d) {
            d2 = 1.0d / d2;
        }
        return (int) Math.round(d2 * 2.147483647E9d);
    }

    private static int[] i(s sVar, BitmapFactory.Options options, b bVar, com.bumptech.glide.load.engine.B.d dVar) throws IOException {
        options.inJustDecodeBounds = true;
        f(sVar, options, bVar, dVar);
        options.inJustDecodeBounds = false;
        return new int[]{options.outWidth, options.outHeight};
    }

    private static boolean j(int i2) {
        return i2 == 90 || i2 == 270;
    }

    private static IOException k(IllegalArgumentException illegalArgumentException, int i2, int i3, String str, BitmapFactory.Options options) {
        StringBuilder O = e.a.a.a.a.O("Exception decoding bitmap, outWidth: ", i2, ", outHeight: ", i3, ", outMimeType: ");
        O.append(str);
        O.append(", inBitmap: ");
        O.append(g(options.inBitmap));
        return new IOException(O.toString(), illegalArgumentException);
    }

    private static void l(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        options.inPreferredColorSpace = null;
        options.outColorSpace = null;
        options.outConfig = null;
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    private static int m(double d2) {
        return (int) (d2 + 0.5d);
    }

    @RequiresApi(21)
    public com.bumptech.glide.load.engine.v<Bitmap> a(ParcelFileDescriptor parcelFileDescriptor, int i2, int i3, com.bumptech.glide.load.f fVar) throws IOException {
        return b(new s.c(parcelFileDescriptor, this.f1751d, this.f1750c), i2, i3, fVar, k);
    }

    public com.bumptech.glide.load.engine.v<Bitmap> c(InputStream inputStream, int i2, int i3, com.bumptech.glide.load.f fVar, b bVar) throws IOException {
        return b(new s.b(inputStream, this.f1751d, this.f1750c), i2, i3, fVar, bVar);
    }

    public com.bumptech.glide.load.engine.v<Bitmap> d(ByteBuffer byteBuffer, int i2, int i3, com.bumptech.glide.load.f fVar) throws IOException {
        return b(new s.a(byteBuffer, this.f1751d, this.f1750c), i2, i3, fVar, k);
    }
}
