package com.facebook.imagepipeline.platform;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.MemoryFile;
import com.facebook.common.memory.g;
import com.facebook.common.memory.i;
import com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder;
import e.c.c.d.h;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.util.Objects;

@e.c.c.d.c
/* loaded from: classes2.dex */
public class GingerbreadPurgeableDecoder extends DalvikPurgeableDecoder {

    /* renamed from: d, reason: collision with root package name */
    private static Method f6519d;

    /* renamed from: c, reason: collision with root package name */
    private final e.c.c.i.b f6520c = e.c.c.i.c.h();

    @e.c.c.d.c
    public GingerbreadPurgeableDecoder() {
    }

    private static MemoryFile g(e.c.c.g.a<g> aVar, int i, byte[] bArr) throws IOException {
        OutputStream outputStream;
        e.c.c.h.a aVar2;
        i iVar = null;
        OutputStream outputStream2 = null;
        MemoryFile memoryFile = new MemoryFile(null, (bArr == null ? 0 : bArr.length) + i);
        memoryFile.allowPurging(false);
        try {
            i iVar2 = new i(aVar.r());
            try {
                aVar2 = new e.c.c.h.a(iVar2, i);
                try {
                    outputStream2 = memoryFile.getOutputStream();
                    Objects.requireNonNull(outputStream2);
                    byte[] bArr2 = new byte[4096];
                    while (true) {
                        int read = aVar2.read(bArr2);
                        if (read == -1) {
                            break;
                        }
                        outputStream2.write(bArr2, 0, read);
                    }
                    if (bArr != null) {
                        memoryFile.writeBytes(bArr, 0, i, bArr.length);
                    }
                    aVar.close();
                    e.c.c.d.a.b(iVar2);
                    e.c.c.d.a.b(aVar2);
                    e.c.c.d.a.a(outputStream2, true);
                    return memoryFile;
                } catch (Throwable th) {
                    th = th;
                    outputStream = outputStream2;
                    iVar = iVar2;
                    int i2 = e.c.c.g.a.h;
                    if (aVar != null) {
                        aVar.close();
                    }
                    e.c.c.d.a.b(iVar);
                    e.c.c.d.a.b(aVar2);
                    e.c.c.d.a.a(outputStream, true);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                outputStream = null;
                aVar2 = null;
            }
        } catch (Throwable th3) {
            th = th3;
            outputStream = null;
            aVar2 = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private android.graphics.Bitmap h(e.c.c.g.a<com.facebook.common.memory.g> r2, int r3, byte[] r4, android.graphics.BitmapFactory.Options r5) {
        /*
            r1 = this;
            r0 = 0
            android.os.MemoryFile r2 = g(r2, r3, r4)     // Catch: java.lang.Throwable -> L2a java.io.IOException -> L2c
            java.io.FileDescriptor r3 = r1.j(r2)     // Catch: java.lang.Throwable -> L24 java.io.IOException -> L27
            e.c.c.i.b r4 = r1.f6520c     // Catch: java.lang.Throwable -> L24 java.io.IOException -> L27
            if (r4 == 0) goto L1c
            android.graphics.Bitmap r3 = r4.a(r3, r0, r5)     // Catch: java.lang.Throwable -> L24 java.io.IOException -> L27
            java.lang.String r4 = "BitmapFactory returned null"
            e.c.c.d.h.e(r3, r4)     // Catch: java.lang.Throwable -> L24 java.io.IOException -> L27
            android.graphics.Bitmap r3 = (android.graphics.Bitmap) r3     // Catch: java.lang.Throwable -> L24 java.io.IOException -> L27
            r2.close()
            return r3
        L1c:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L24 java.io.IOException -> L27
            java.lang.String r4 = "WebpBitmapFactory is null"
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L24 java.io.IOException -> L27
            throw r3     // Catch: java.lang.Throwable -> L24 java.io.IOException -> L27
        L24:
            r3 = move-exception
            r0 = r2
            goto L3a
        L27:
            r3 = move-exception
            r0 = r2
            goto L2d
        L2a:
            r3 = move-exception
            goto L3a
        L2c:
            r3 = move-exception
        L2d:
            e.c.c.d.h.j(r3)     // Catch: java.lang.Throwable -> L38
            java.lang.RuntimeException r2 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L38
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L38
            throw r2     // Catch: java.lang.Throwable -> L38
        L36:
            r3 = r2
            goto L3a
        L38:
            r2 = move-exception
            goto L36
        L3a:
            if (r0 == 0) goto L3f
            r0.close()
        L3f:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.platform.GingerbreadPurgeableDecoder.h(e.c.c.g.a, int, byte[], android.graphics.BitmapFactory$Options):android.graphics.Bitmap");
    }

    private synchronized Method i() {
        if (f6519d == null) {
            try {
                f6519d = MemoryFile.class.getDeclaredMethod("getFileDescriptor", new Class[0]);
            } catch (Exception e2) {
                h.j(e2);
                throw new RuntimeException(e2);
            }
        }
        return f6519d;
    }

    private FileDescriptor j(MemoryFile memoryFile) {
        try {
            return (FileDescriptor) i().invoke(memoryFile, new Object[0]);
        } catch (Exception e2) {
            h.j(e2);
            throw new RuntimeException(e2);
        }
    }

    @Override // com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder
    protected Bitmap c(e.c.c.g.a<g> aVar, BitmapFactory.Options options) {
        return h(aVar, aVar.r().size(), null, options);
    }

    @Override // com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder
    protected Bitmap d(e.c.c.g.a<g> aVar, int i, BitmapFactory.Options options) {
        return h(aVar, i, DalvikPurgeableDecoder.e(aVar, i) ? null : DalvikPurgeableDecoder.b, options);
    }
}
