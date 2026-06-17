package com.facebook.imagepipeline.producers;

import android.content.ContentResolver;
import android.database.Cursor;
import android.graphics.Rect;
import android.provider.MediaStore;
import com.ss.android.socialbase.downloader.constants.DBDefinition;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public class D extends E implements k0<com.facebook.imagepipeline.image.f> {

    /* renamed from: d, reason: collision with root package name */
    private static final String[] f6529d = {DBDefinition.ID, "_data"};

    /* renamed from: e, reason: collision with root package name */
    private static final String[] f6530e = {"_data"};

    /* renamed from: f, reason: collision with root package name */
    private static final Rect f6531f = new Rect(0, 0, 512, 384);

    /* renamed from: g, reason: collision with root package name */
    private static final Rect f6532g = new Rect(0, 0, 96, 96);

    /* renamed from: c, reason: collision with root package name */
    private final ContentResolver f6533c;

    public D(Executor executor, com.facebook.common.memory.h hVar, ContentResolver contentResolver) {
        super(executor, hVar);
        this.f6533c = contentResolver;
    }

    private com.facebook.imagepipeline.image.f f(com.facebook.imagepipeline.common.e eVar, long j) throws IOException {
        Cursor queryMiniThumbnail;
        int g2 = g(eVar);
        if (g2 == 0 || (queryMiniThumbnail = MediaStore.Images.Thumbnails.queryMiniThumbnail(this.f6533c, j, g2, f6530e)) == null) {
            return null;
        }
        try {
            if (queryMiniThumbnail.moveToFirst()) {
                String string = queryMiniThumbnail.getString(queryMiniThumbnail.getColumnIndex("_data"));
                if (new File(string).exists()) {
                    return c(new FileInputStream(string), string == null ? -1 : (int) new File(string).length());
                }
            }
            return null;
        } finally {
            queryMiniThumbnail.close();
        }
    }

    private static int g(com.facebook.imagepipeline.common.e eVar) {
        Rect rect = f6532g;
        if (com.bytedance.feedbackerlib.a.X(rect.width(), rect.height(), eVar)) {
            return 3;
        }
        Rect rect2 = f6531f;
        return com.bytedance.feedbackerlib.a.X(rect2.width(), rect2.height(), eVar) ? 1 : 0;
    }

    @Override // com.facebook.imagepipeline.producers.k0
    public boolean a(com.facebook.imagepipeline.common.e eVar) {
        Rect rect = f6531f;
        return com.bytedance.feedbackerlib.a.X(rect.width(), rect.height(), eVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x009a, code lost:
    
        if (r1 != 0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x008b, code lost:
    
        if (r1 != 0) goto L40;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0110 A[RETURN] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v22, types: [java.io.FileInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v4, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r8v0, types: [com.facebook.imagepipeline.producers.D, com.facebook.imagepipeline.producers.E] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x009a -> B:19:0x009d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x008d -> B:17:0x009d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x008b -> B:19:0x009d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x007f -> B:19:0x009d). Please report as a decompilation issue!!! */
    @Override // com.facebook.imagepipeline.producers.E
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected com.facebook.imagepipeline.image.f d(com.facebook.imagepipeline.request.ImageRequest r9) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.producers.D.d(com.facebook.imagepipeline.request.ImageRequest):com.facebook.imagepipeline.image.f");
    }

    @Override // com.facebook.imagepipeline.producers.E
    protected String e() {
        return "LocalContentUriThumbnailFetchProducer";
    }
}
