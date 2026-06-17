package com.facebook.imagepipeline.producers;

import android.content.ContentResolver;
import android.media.ExifInterface;
import android.util.Pair;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imageutils.HeifExifUtil;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public class LocalExifThumbnailProducer implements k0<com.facebook.imagepipeline.image.f> {
    private final Executor a;
    private final com.facebook.common.memory.h b;

    /* renamed from: c, reason: collision with root package name */
    private final ContentResolver f6553c;

    @com.facebook.soloader.e
    private class Api24Utils {
    }

    class a extends d0<com.facebook.imagepipeline.image.f> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ImageRequest f6554f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC0732l interfaceC0732l, X x, V v, String str, ImageRequest imageRequest) {
            super(interfaceC0732l, x, v, str);
            this.f6554f = imageRequest;
        }

        @Override // e.c.c.b.g
        protected void b(Object obj) {
            com.facebook.imagepipeline.image.f.d((com.facebook.imagepipeline.image.f) obj);
        }

        @Override // e.c.c.b.g
        protected Object c() throws Exception {
            ExifInterface d2 = LocalExifThumbnailProducer.this.d(this.f6554f.v());
            if (d2 == null || !d2.hasThumbnail()) {
                return null;
            }
            com.facebook.common.memory.g b = LocalExifThumbnailProducer.this.b.b(d2.getThumbnail());
            Objects.requireNonNull(LocalExifThumbnailProducer.this);
            Pair<Integer, Integer> a = com.facebook.imageutils.b.a(new com.facebook.common.memory.i(b));
            int c2 = HeifExifUtil.c(Integer.parseInt(d2.getAttribute(androidx.exifinterface.media.ExifInterface.TAG_ORIENTATION)));
            int intValue = a != null ? ((Integer) a.first).intValue() : -1;
            int intValue2 = a != null ? ((Integer) a.second).intValue() : -1;
            e.c.c.g.a z = e.c.c.g.a.z(b);
            try {
                com.facebook.imagepipeline.image.f fVar = new com.facebook.imagepipeline.image.f(z);
                z.close();
                fVar.q0(e.c.g.c.a);
                fVar.t0(c2);
                fVar.v0(intValue);
                fVar.p0(intValue2);
                return fVar;
            } catch (Throwable th) {
                if (z != null) {
                    z.close();
                }
                throw th;
            }
        }

        @Override // com.facebook.imagepipeline.producers.d0
        protected Map h(com.facebook.imagepipeline.image.f fVar) {
            return e.c.c.d.f.of("createdThumbnail", Boolean.toString(fVar != null));
        }
    }

    class b extends C0725e {
        final /* synthetic */ d0 a;

        b(LocalExifThumbnailProducer localExifThumbnailProducer, d0 d0Var) {
            this.a = d0Var;
        }

        @Override // com.facebook.imagepipeline.producers.W
        public void a() {
            this.a.a();
        }
    }

    public LocalExifThumbnailProducer(Executor executor, com.facebook.common.memory.h hVar, ContentResolver contentResolver) {
        this.a = executor;
        this.b = hVar;
        this.f6553c = contentResolver;
    }

    @Override // com.facebook.imagepipeline.producers.k0
    public boolean a(com.facebook.imagepipeline.common.e eVar) {
        return com.bytedance.feedbackerlib.a.X(512, 512, eVar);
    }

    @Override // com.facebook.imagepipeline.producers.U
    public void b(InterfaceC0732l<com.facebook.imagepipeline.image.f> interfaceC0732l, V v) {
        X n = v.n();
        ImageRequest d2 = v.d();
        v.g("local", "exif");
        a aVar = new a(interfaceC0732l, n, v, "LocalExifThumbnailProducer", d2);
        v.e(new b(this, aVar));
        this.a.execute(aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0075 A[Catch: StackOverflowError -> 0x0082, IOException -> 0x0089, TRY_ENTER, TRY_LEAVE, TryCatch #5 {IOException -> 0x0089, StackOverflowError -> 0x0082, blocks: (B:28:0x0049, B:30:0x0054, B:13:0x005d, B:16:0x0063, B:24:0x006b, B:20:0x0075), top: B:27:0x0049 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    android.media.ExifInterface d(android.net.Uri r8) {
        /*
            r7 = this;
            android.content.ContentResolver r0 = r7.f6553c
            boolean r1 = com.facebook.common.util.c.e(r8)
            r6 = 0
            if (r1 == 0) goto L39
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r1 = r8
            android.database.Cursor r0 = r0.query(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L32
            if (r0 == 0) goto L2b
            boolean r1 = r0.moveToFirst()     // Catch: java.lang.Throwable -> L28
            if (r1 == 0) goto L2b
            java.lang.String r1 = "_data"
            int r1 = r0.getColumnIndex(r1)     // Catch: java.lang.Throwable -> L28
            r2 = -1
            if (r1 == r2) goto L2b
            java.lang.String r1 = r0.getString(r1)     // Catch: java.lang.Throwable -> L28
            goto L2c
        L28:
            r8 = move-exception
            r6 = r0
            goto L33
        L2b:
            r1 = r6
        L2c:
            if (r0 == 0) goto L45
            r0.close()
            goto L45
        L32:
            r8 = move-exception
        L33:
            if (r6 == 0) goto L38
            r6.close()
        L38:
            throw r8
        L39:
            boolean r0 = com.facebook.common.util.c.f(r8)
            if (r0 == 0) goto L44
            java.lang.String r1 = r8.getPath()
            goto L45
        L44:
            r1 = r6
        L45:
            r0 = 0
            if (r1 != 0) goto L49
            goto L5b
        L49:
            java.io.File r2 = new java.io.File     // Catch: java.lang.StackOverflowError -> L82 java.io.IOException -> L89
            r2.<init>(r1)     // Catch: java.lang.StackOverflowError -> L82 java.io.IOException -> L89
            boolean r3 = r2.exists()     // Catch: java.lang.StackOverflowError -> L82 java.io.IOException -> L89
            if (r3 == 0) goto L5b
            boolean r2 = r2.canRead()     // Catch: java.lang.StackOverflowError -> L82 java.io.IOException -> L89
            if (r2 == 0) goto L5b
            r0 = 1
        L5b:
            if (r0 == 0) goto L63
            android.media.ExifInterface r8 = new android.media.ExifInterface     // Catch: java.lang.StackOverflowError -> L82 java.io.IOException -> L89
            r8.<init>(r1)     // Catch: java.lang.StackOverflowError -> L82 java.io.IOException -> L89
            return r8
        L63:
            android.content.ContentResolver r0 = r7.f6553c     // Catch: java.lang.StackOverflowError -> L82 java.io.IOException -> L89
            boolean r1 = com.facebook.common.util.c.e(r8)     // Catch: java.lang.StackOverflowError -> L82 java.io.IOException -> L89
            if (r1 == 0) goto L72
            java.lang.String r1 = "r"
            android.content.res.AssetFileDescriptor r8 = r0.openAssetFileDescriptor(r8, r1)     // Catch: java.io.FileNotFoundException -> L72 java.lang.StackOverflowError -> L82 java.io.IOException -> L89
            goto L73
        L72:
            r8 = r6
        L73:
            if (r8 == 0) goto L89
            java.io.FileDescriptor r0 = r8.getFileDescriptor()     // Catch: java.lang.StackOverflowError -> L82 java.io.IOException -> L89
            android.media.ExifInterface r1 = new android.media.ExifInterface     // Catch: java.lang.StackOverflowError -> L82 java.io.IOException -> L89
            r1.<init>(r0)     // Catch: java.lang.StackOverflowError -> L82 java.io.IOException -> L89
            r8.close()     // Catch: java.lang.StackOverflowError -> L82 java.io.IOException -> L89
            return r1
        L82:
            java.lang.Class<com.facebook.imagepipeline.producers.LocalExifThumbnailProducer> r8 = com.facebook.imagepipeline.producers.LocalExifThumbnailProducer.class
            java.lang.String r0 = "StackOverflowError in ExifInterface constructor"
            e.c.c.e.a.e(r8, r0)
        L89:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.producers.LocalExifThumbnailProducer.d(android.net.Uri):android.media.ExifInterface");
    }
}
