package com.bumptech.glide.load.data.o;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* loaded from: classes.dex */
class e {

    /* renamed from: f, reason: collision with root package name */
    private static final a f1575f = new a();
    private final a a = f1575f;
    private final d b;

    /* renamed from: c, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.B.b f1576c;

    /* renamed from: d, reason: collision with root package name */
    private final ContentResolver f1577d;

    /* renamed from: e, reason: collision with root package name */
    private final List<ImageHeaderParser> f1578e;

    e(List<ImageHeaderParser> list, d dVar, com.bumptech.glide.load.engine.B.b bVar, ContentResolver contentResolver) {
        this.b = dVar;
        this.f1576c = bVar;
        this.f1577d = contentResolver;
        this.f1578e = list;
    }

    int a(Uri uri) {
        InputStream inputStream = null;
        try {
            try {
                inputStream = this.f1577d.openInputStream(uri);
                int b = com.bumptech.glide.load.c.b(this.f1578e, inputStream, this.f1576c);
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused) {
                    }
                }
                return b;
            } catch (Throwable th) {
                if (0 != 0) {
                    try {
                        inputStream.close();
                    } catch (IOException unused2) {
                    }
                }
                throw th;
            }
        } catch (IOException | NullPointerException e2) {
            if (Log.isLoggable("ThumbStreamOpener", 3)) {
                Log.d("ThumbStreamOpener", "Failed to open uri: " + uri, e2);
            }
            if (inputStream == null) {
                return -1;
            }
            try {
                inputStream.close();
                return -1;
            } catch (IOException unused3) {
                return -1;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0048, code lost:
    
        if (r3 != null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0020, code lost:
    
        if (r3 != null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0022, code lost:
    
        r3.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0025, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x001b: MOVE (r2 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]), block:B:41:0x001b */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.io.InputStream b(android.net.Uri r9) throws java.io.FileNotFoundException {
        /*
            r8 = this;
            java.lang.String r0 = "ThumbStreamOpener"
            r1 = 0
            r2 = 0
            com.bumptech.glide.load.data.o.d r3 = r8.b     // Catch: java.lang.Throwable -> L27 java.lang.SecurityException -> L2a
            android.database.Cursor r3 = r3.a(r9)     // Catch: java.lang.Throwable -> L27 java.lang.SecurityException -> L2a
            if (r3 == 0) goto L20
            boolean r4 = r3.moveToFirst()     // Catch: java.lang.Throwable -> L1a java.lang.SecurityException -> L1e
            if (r4 == 0) goto L20
            java.lang.String r0 = r3.getString(r1)     // Catch: java.lang.Throwable -> L1a java.lang.SecurityException -> L1e
            r3.close()
            goto L4b
        L1a:
            r9 = move-exception
            r2 = r3
            goto Lab
        L1e:
            r4 = move-exception
            goto L2d
        L20:
            if (r3 == 0) goto L25
        L22:
            r3.close()
        L25:
            r0 = r2
            goto L4b
        L27:
            r9 = move-exception
            goto Lab
        L2a:
            r3 = move-exception
            r4 = r3
            r3 = r2
        L2d:
            r5 = 3
            boolean r5 = android.util.Log.isLoggable(r0, r5)     // Catch: java.lang.Throwable -> L1a
            if (r5 == 0) goto L48
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1a
            r5.<init>()     // Catch: java.lang.Throwable -> L1a
            java.lang.String r6 = "Failed to query for thumbnail for Uri: "
            r5.append(r6)     // Catch: java.lang.Throwable -> L1a
            r5.append(r9)     // Catch: java.lang.Throwable -> L1a
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L1a
            android.util.Log.d(r0, r5, r4)     // Catch: java.lang.Throwable -> L1a
        L48:
            if (r3 == 0) goto L25
            goto L22
        L4b:
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            if (r3 == 0) goto L52
            return r2
        L52:
            com.bumptech.glide.load.data.o.a r3 = r8.a
            java.util.Objects.requireNonNull(r3)
            java.io.File r3 = new java.io.File
            r3.<init>(r0)
            com.bumptech.glide.load.data.o.a r0 = r8.a
            java.util.Objects.requireNonNull(r0)
            boolean r0 = r3.exists()
            if (r0 == 0) goto L77
            r4 = 0
            com.bumptech.glide.load.data.o.a r0 = r8.a
            java.util.Objects.requireNonNull(r0)
            long r6 = r3.length()
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 >= 0) goto L77
            r1 = 1
        L77:
            if (r1 != 0) goto L7a
            return r2
        L7a:
            android.net.Uri r0 = android.net.Uri.fromFile(r3)
            android.content.ContentResolver r1 = r8.f1577d     // Catch: java.lang.NullPointerException -> L85
            java.io.InputStream r9 = r1.openInputStream(r0)     // Catch: java.lang.NullPointerException -> L85
            return r9
        L85:
            r1 = move-exception
            java.io.FileNotFoundException r2 = new java.io.FileNotFoundException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "NPE opening uri: "
            r3.append(r4)
            r3.append(r9)
            java.lang.String r9 = " -> "
            r3.append(r9)
            r3.append(r0)
            java.lang.String r9 = r3.toString()
            r2.<init>(r9)
            java.lang.Throwable r9 = r2.initCause(r1)
            java.io.FileNotFoundException r9 = (java.io.FileNotFoundException) r9
            throw r9
        Lab:
            if (r2 == 0) goto Lb0
            r2.close()
        Lb0:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.data.o.e.b(android.net.Uri):java.io.InputStream");
    }
}
