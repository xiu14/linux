package e.c.h.f;

import com.facebook.imagepipeline.request.ImageRequest;

/* loaded from: classes2.dex */
public class l implements g {
    private static l a;

    protected l() {
    }

    public static synchronized l c() {
        l lVar;
        synchronized (l.class) {
            if (a == null) {
                a = new l();
            }
            lVar = a;
        }
        return lVar;
    }

    public com.facebook.cache.common.b a(ImageRequest imageRequest, Object obj) {
        return new c(imageRequest.v().toString(), imageRequest.s(), imageRequest.t(), imageRequest.h(), null, null, obj);
    }

    public com.facebook.cache.common.b b(ImageRequest imageRequest, Object obj) {
        return new com.facebook.cache.common.h(imageRequest.v().toString());
    }

    public com.facebook.cache.common.b d(ImageRequest imageRequest, Object obj) {
        com.facebook.cache.common.b bVar;
        String str;
        com.facebook.imagepipeline.request.c k = imageRequest.k();
        if (k != null) {
            com.facebook.cache.common.b c2 = k.c();
            str = k.getClass().getName();
            bVar = c2;
        } else {
            bVar = null;
            str = null;
        }
        return new c(imageRequest.v().toString(), imageRequest.s(), imageRequest.t(), imageRequest.h(), bVar, str, obj);
    }
}
