package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.EncodeStrategy;

/* renamed from: com.bumptech.glide.load.resource.bitmap.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0503c implements com.bumptech.glide.load.h<Bitmap> {
    public static final com.bumptech.glide.load.e<Integer> b = com.bumptech.glide.load.e.d("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality", 90);

    /* renamed from: c, reason: collision with root package name */
    public static final com.bumptech.glide.load.e<Bitmap.CompressFormat> f1747c = com.bumptech.glide.load.e.c("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat");

    @Nullable
    private final com.bumptech.glide.load.engine.B.b a;

    public C0503c(@NonNull com.bumptech.glide.load.engine.B.b bVar) {
        this.a = bVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0069, code lost:
    
        if (r6 != null) goto L50;
     */
    @Override // com.bumptech.glide.load.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a(@androidx.annotation.NonNull java.lang.Object r9, @androidx.annotation.NonNull java.io.File r10, @androidx.annotation.NonNull com.bumptech.glide.load.f r11) {
        /*
            r8 = this;
            com.bumptech.glide.load.engine.v r9 = (com.bumptech.glide.load.engine.v) r9
            java.lang.String r0 = "BitmapEncoder"
            java.lang.Object r9 = r9.get()
            android.graphics.Bitmap r9 = (android.graphics.Bitmap) r9
            com.bumptech.glide.load.e<android.graphics.Bitmap$CompressFormat> r1 = com.bumptech.glide.load.resource.bitmap.C0503c.f1747c
            java.lang.Object r1 = r11.c(r1)
            android.graphics.Bitmap$CompressFormat r1 = (android.graphics.Bitmap.CompressFormat) r1
            if (r1 == 0) goto L15
            goto L20
        L15:
            boolean r1 = r9.hasAlpha()
            if (r1 == 0) goto L1e
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.PNG
            goto L20
        L1e:
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.JPEG
        L20:
            r9.getWidth()
            r9.getHeight()
            int r2 = com.bumptech.glide.util.f.b     // Catch: java.lang.Throwable -> Lc3
            long r2 = android.os.SystemClock.elapsedRealtimeNanos()     // Catch: java.lang.Throwable -> Lc3
            com.bumptech.glide.load.e<java.lang.Integer> r4 = com.bumptech.glide.load.resource.bitmap.C0503c.b     // Catch: java.lang.Throwable -> Lc3
            java.lang.Object r4 = r11.c(r4)     // Catch: java.lang.Throwable -> Lc3
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch: java.lang.Throwable -> Lc3
            int r4 = r4.intValue()     // Catch: java.lang.Throwable -> Lc3
            r5 = 0
            r6 = 0
            java.io.FileOutputStream r7 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L5a java.io.IOException -> L5c
            r7.<init>(r10)     // Catch: java.lang.Throwable -> L5a java.io.IOException -> L5c
            com.bumptech.glide.load.engine.B.b r10 = r8.a     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L57
            if (r10 == 0) goto L4c
            com.bumptech.glide.load.data.c r10 = new com.bumptech.glide.load.data.c     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L57
            com.bumptech.glide.load.engine.B.b r6 = r8.a     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L57
            r10.<init>(r7, r6)     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L57
            r6 = r10
            goto L4d
        L4c:
            r6 = r7
        L4d:
            r9.compress(r1, r4, r6)     // Catch: java.lang.Throwable -> L5a java.io.IOException -> L5c
            r6.close()     // Catch: java.lang.Throwable -> L5a java.io.IOException -> L5c
            r5 = 1
            goto L6b
        L55:
            r9 = move-exception
            goto Lbd
        L57:
            r10 = move-exception
            r6 = r7
            goto L5d
        L5a:
            r9 = move-exception
            goto Lbc
        L5c:
            r10 = move-exception
        L5d:
            r4 = 3
            boolean r4 = android.util.Log.isLoggable(r0, r4)     // Catch: java.lang.Throwable -> L5a
            if (r4 == 0) goto L69
            java.lang.String r4 = "Failed to encode Bitmap"
            android.util.Log.d(r0, r4, r10)     // Catch: java.lang.Throwable -> L5a
        L69:
            if (r6 == 0) goto L6e
        L6b:
            r6.close()     // Catch: java.io.IOException -> L6e java.lang.Throwable -> Lc3
        L6e:
            r10 = 2
            boolean r10 = android.util.Log.isLoggable(r0, r10)     // Catch: java.lang.Throwable -> Lc3
            if (r10 == 0) goto Lbb
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc3
            r10.<init>()     // Catch: java.lang.Throwable -> Lc3
            java.lang.String r4 = "Compressed with type: "
            r10.append(r4)     // Catch: java.lang.Throwable -> Lc3
            r10.append(r1)     // Catch: java.lang.Throwable -> Lc3
            java.lang.String r1 = " of size "
            r10.append(r1)     // Catch: java.lang.Throwable -> Lc3
            int r1 = com.bumptech.glide.util.j.c(r9)     // Catch: java.lang.Throwable -> Lc3
            r10.append(r1)     // Catch: java.lang.Throwable -> Lc3
            java.lang.String r1 = " in "
            r10.append(r1)     // Catch: java.lang.Throwable -> Lc3
            double r1 = com.bumptech.glide.util.f.a(r2)     // Catch: java.lang.Throwable -> Lc3
            r10.append(r1)     // Catch: java.lang.Throwable -> Lc3
            java.lang.String r1 = ", options format: "
            r10.append(r1)     // Catch: java.lang.Throwable -> Lc3
            com.bumptech.glide.load.e<android.graphics.Bitmap$CompressFormat> r1 = com.bumptech.glide.load.resource.bitmap.C0503c.f1747c     // Catch: java.lang.Throwable -> Lc3
            java.lang.Object r11 = r11.c(r1)     // Catch: java.lang.Throwable -> Lc3
            r10.append(r11)     // Catch: java.lang.Throwable -> Lc3
            java.lang.String r11 = ", hasAlpha: "
            r10.append(r11)     // Catch: java.lang.Throwable -> Lc3
            boolean r9 = r9.hasAlpha()     // Catch: java.lang.Throwable -> Lc3
            r10.append(r9)     // Catch: java.lang.Throwable -> Lc3
            java.lang.String r9 = r10.toString()     // Catch: java.lang.Throwable -> Lc3
            android.util.Log.v(r0, r9)     // Catch: java.lang.Throwable -> Lc3
        Lbb:
            return r5
        Lbc:
            r7 = r6
        Lbd:
            if (r7 == 0) goto Lc2
            r7.close()     // Catch: java.io.IOException -> Lc2 java.lang.Throwable -> Lc3
        Lc2:
            throw r9     // Catch: java.lang.Throwable -> Lc3
        Lc3:
            r9 = move-exception
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.resource.bitmap.C0503c.a(java.lang.Object, java.io.File, com.bumptech.glide.load.f):boolean");
    }

    @Override // com.bumptech.glide.load.h
    @NonNull
    public EncodeStrategy b(@NonNull com.bumptech.glide.load.f fVar) {
        return EncodeStrategy.TRANSFORMED;
    }
}
