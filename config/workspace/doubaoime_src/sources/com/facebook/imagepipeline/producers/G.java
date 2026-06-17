package com.facebook.imagepipeline.producers;

import android.content.res.Resources;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public class G extends E {

    /* renamed from: c, reason: collision with root package name */
    private final Resources f6536c;

    public G(Executor executor, com.facebook.common.memory.h hVar, Resources resources) {
        super(executor, hVar);
        this.f6536c = resources;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003c, code lost:
    
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
            android.content.res.Resources r0 = r4.f6536c
            android.net.Uri r1 = r5.v()
            java.lang.String r1 = r1.getPath()
            r2 = 1
            java.lang.String r1 = r1.substring(r2)
            int r1 = java.lang.Integer.parseInt(r1)
            java.io.InputStream r0 = r0.openRawResource(r1)
            r1 = 0
            android.content.res.Resources r3 = r4.f6536c     // Catch: java.lang.Throwable -> L34 android.content.res.Resources.NotFoundException -> L3b
            android.net.Uri r5 = r5.v()     // Catch: java.lang.Throwable -> L34 android.content.res.Resources.NotFoundException -> L3b
            java.lang.String r5 = r5.getPath()     // Catch: java.lang.Throwable -> L34 android.content.res.Resources.NotFoundException -> L3b
            java.lang.String r5 = r5.substring(r2)     // Catch: java.lang.Throwable -> L34 android.content.res.Resources.NotFoundException -> L3b
            int r5 = java.lang.Integer.parseInt(r5)     // Catch: java.lang.Throwable -> L34 android.content.res.Resources.NotFoundException -> L3b
            android.content.res.AssetFileDescriptor r1 = r3.openRawResourceFd(r5)     // Catch: java.lang.Throwable -> L34 android.content.res.Resources.NotFoundException -> L3b
            long r2 = r1.getLength()     // Catch: java.lang.Throwable -> L34 android.content.res.Resources.NotFoundException -> L3b
            int r5 = (int) r2
            goto L3e
        L34:
            r5 = move-exception
            if (r1 == 0) goto L3a
            r1.close()     // Catch: java.io.IOException -> L3a
        L3a:
            throw r5
        L3b:
            r5 = -1
            if (r1 == 0) goto L41
        L3e:
            r1.close()     // Catch: java.io.IOException -> L41
        L41:
            com.facebook.imagepipeline.image.f r5 = r4.c(r0, r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.producers.G.d(com.facebook.imagepipeline.request.ImageRequest):com.facebook.imagepipeline.image.f");
    }

    @Override // com.facebook.imagepipeline.producers.E
    protected String e() {
        return "LocalResourceFetchProducer";
    }
}
