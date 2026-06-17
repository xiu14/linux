package com.facebook.imagepipeline.producers;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import com.facebook.imagepipeline.request.ImageRequest;
import com.xiaomi.mipush.sdk.Constants;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public class I implements U<e.c.c.g.a<com.facebook.imagepipeline.image.d>> {
    private final Executor a;
    private final ContentResolver b;

    class a extends d0<e.c.c.g.a<com.facebook.imagepipeline.image.d>> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ X f6537f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ V f6538g;
        final /* synthetic */ ImageRequest h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC0732l interfaceC0732l, X x, V v, String str, X x2, V v2, ImageRequest imageRequest) {
            super(interfaceC0732l, x, v, str);
            this.f6537f = x2;
            this.f6538g = v2;
            this.h = imageRequest;
        }

        @Override // e.c.c.b.g
        protected void b(Object obj) {
            e.c.c.g.a aVar = (e.c.c.g.a) obj;
            int i = e.c.c.g.a.h;
            if (aVar != null) {
                aVar.close();
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x010d  */
        /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
        @Override // e.c.c.b.g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        protected java.lang.Object c() throws java.lang.Exception {
            /*
                Method dump skipped, instructions count: 348
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.producers.I.a.c():java.lang.Object");
        }

        @Override // com.facebook.imagepipeline.producers.d0, e.c.c.b.g
        protected void e(Exception exc) {
            super.e(exc);
            this.f6537f.c(this.f6538g, "VideoThumbnailProducer", false);
            this.f6538g.l("local");
        }

        @Override // com.facebook.imagepipeline.producers.d0, e.c.c.b.g
        protected void f(Object obj) {
            e.c.c.g.a aVar = (e.c.c.g.a) obj;
            super.f(aVar);
            this.f6537f.c(this.f6538g, "VideoThumbnailProducer", aVar != null);
            this.f6538g.l("local");
        }

        @Override // com.facebook.imagepipeline.producers.d0
        protected Map h(e.c.c.g.a<com.facebook.imagepipeline.image.d> aVar) {
            return e.c.c.d.f.of("createdThumbnail", String.valueOf(aVar != null));
        }
    }

    class b extends C0725e {
        final /* synthetic */ d0 a;

        b(I i, d0 d0Var) {
            this.a = d0Var;
        }

        @Override // com.facebook.imagepipeline.producers.W
        public void a() {
            this.a.a();
        }
    }

    public I(Executor executor, ContentResolver contentResolver) {
        this.a = executor;
        this.b = contentResolver;
    }

    static String d(I i, ImageRequest imageRequest) {
        Uri uri;
        String str;
        String[] strArr;
        Objects.requireNonNull(i);
        Uri v = imageRequest.v();
        if (com.facebook.common.util.c.f(v)) {
            return imageRequest.u().getPath();
        }
        if (com.facebook.common.util.c.e(v)) {
            if ("com.android.providers.media.documents".equals(v.getAuthority())) {
                String documentId = DocumentsContract.getDocumentId(v);
                str = "_id=?";
                uri = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                strArr = new String[]{documentId.split(Constants.COLON_SEPARATOR)[1]};
            } else {
                uri = v;
                str = null;
                strArr = null;
            }
            Cursor query = i.b.query(uri, new String[]{"_data"}, str, strArr, null);
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        return query.getString(query.getColumnIndexOrThrow("_data"));
                    }
                } finally {
                    query.close();
                }
            }
            if (query != null) {
            }
        }
        return null;
    }

    @Override // com.facebook.imagepipeline.producers.U
    public void b(InterfaceC0732l<e.c.c.g.a<com.facebook.imagepipeline.image.d>> interfaceC0732l, V v) {
        X n = v.n();
        ImageRequest d2 = v.d();
        v.g("local", "video");
        a aVar = new a(interfaceC0732l, n, v, "VideoThumbnailProducer", n, v, d2);
        v.e(new b(this, aVar));
        this.a.execute(aVar);
    }
}
