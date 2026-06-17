package com.facebook.imagepipeline.producers;

import android.content.res.AssetManager;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public class B extends E {

    /* renamed from: c, reason: collision with root package name */
    private final AssetManager f6526c;

    public B(Executor executor, com.facebook.common.memory.h hVar, AssetManager assetManager) {
        super(executor, hVar);
        this.f6526c = assetManager;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0035, code lost:
    
        if (r1 == null) goto L12;
     */
    @Override // com.facebook.imagepipeline.producers.E
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected com.facebook.imagepipeline.image.f d(com.facebook.imagepipeline.request.ImageRequest r5) throws java.io.IOException {
        /*
            r4 = this;
            android.content.res.AssetManager r0 = r4.f6526c
            android.net.Uri r1 = r5.v()
            java.lang.String r1 = r1.getPath()
            r2 = 1
            java.lang.String r1 = r1.substring(r2)
            r3 = 2
            java.io.InputStream r0 = r0.open(r1, r3)
            r1 = 0
            android.content.res.AssetManager r3 = r4.f6526c     // Catch: java.lang.Throwable -> L2d java.io.IOException -> L34
            android.net.Uri r5 = r5.v()     // Catch: java.lang.Throwable -> L2d java.io.IOException -> L34
            java.lang.String r5 = r5.getPath()     // Catch: java.lang.Throwable -> L2d java.io.IOException -> L34
            java.lang.String r5 = r5.substring(r2)     // Catch: java.lang.Throwable -> L2d java.io.IOException -> L34
            android.content.res.AssetFileDescriptor r1 = r3.openFd(r5)     // Catch: java.lang.Throwable -> L2d java.io.IOException -> L34
            long r2 = r1.getLength()     // Catch: java.lang.Throwable -> L2d java.io.IOException -> L34
            int r5 = (int) r2
            goto L37
        L2d:
            r5 = move-exception
            if (r1 == 0) goto L33
            r1.close()     // Catch: java.io.IOException -> L33
        L33:
            throw r5
        L34:
            r5 = -1
            if (r1 == 0) goto L3a
        L37:
            r1.close()     // Catch: java.io.IOException -> L3a
        L3a:
            com.facebook.imagepipeline.image.f r5 = r4.c(r0, r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.producers.B.d(com.facebook.imagepipeline.request.ImageRequest):com.facebook.imagepipeline.image.f");
    }

    @Override // com.facebook.imagepipeline.producers.E
    protected String e() {
        return "LocalAssetFetchProducer";
    }
}
