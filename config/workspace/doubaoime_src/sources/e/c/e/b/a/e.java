package e.c.e.b.a;

import android.content.Context;
import android.net.Uri;
import android.util.TypedValue;
import androidx.appcompat.content.res.AppCompatResources;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import com.facebook.imagepipeline.common.Priority;
import com.facebook.imagepipeline.image.h;
import com.facebook.imagepipeline.request.ImageRequest;
import e.c.c.d.j;
import e.c.c.d.k;
import e.c.h.f.l;
import java.util.Set;

/* loaded from: classes2.dex */
public class e extends AbstractDraweeControllerBuilder<e, ImageRequest, e.c.c.g.a<com.facebook.imagepipeline.image.d>, h> {
    private final e.c.h.g.h r;
    private final g s;
    private e.c.e.b.a.i.e t;

    public e(Context context, g gVar, e.c.h.g.h hVar, Set<com.facebook.drawee.controller.e> set, Set<e.c.f.b.a.b> set2) {
        super(context, set, set2);
        this.r = hVar;
        this.s = gVar;
        q(gVar.a());
    }

    @Override // com.facebook.drawee.controller.AbstractDraweeControllerBuilder
    protected com.facebook.datasource.d<e.c.c.g.a<com.facebook.imagepipeline.image.d>> d(e.c.e.e.a aVar, String str, ImageRequest imageRequest, Object obj, AbstractDraweeControllerBuilder.CacheLevel cacheLevel) {
        ImageRequest.RequestLevel requestLevel;
        ImageRequest imageRequest2 = imageRequest;
        Uri v = imageRequest2.v();
        if (com.facebook.common.util.c.g(v) || "android.resource".equals(com.facebook.common.util.c.b(v))) {
            try {
                int a = com.facebook.common.util.c.a(this.a, v);
                TypedValue typedValue = new TypedValue();
                this.a.getResources().getValue(a, typedValue, true);
                CharSequence charSequence = typedValue.string;
                String charSequence2 = charSequence == null ? null : charSequence.toString();
                if (charSequence2 == null ? false : charSequence2.endsWith(".xml")) {
                    return com.facebook.datasource.e.b(e.c.c.g.a.z(new com.facebook.imagepipeline.image.c(AppCompatResources.getDrawable(this.a, a))));
                }
            } catch (Exception unused) {
            }
        }
        e.c.h.g.h hVar = this.r;
        int ordinal = cacheLevel.ordinal();
        if (ordinal == 0) {
            requestLevel = ImageRequest.RequestLevel.FULL_FETCH;
        } else if (ordinal == 1) {
            requestLevel = ImageRequest.RequestLevel.DISK_CACHE;
        } else {
            if (ordinal != 2) {
                throw new RuntimeException("Cache level" + cacheLevel + "is not supported. ");
            }
            requestLevel = ImageRequest.RequestLevel.BITMAP_MEMORY_CACHE;
        }
        return hVar.b(imageRequest2, obj, requestLevel, aVar instanceof d ? ((d) aVar).e0() : null, Priority.getHigherPriority(Priority.MEDIUM, imageRequest2.n()));
    }

    @Override // com.facebook.drawee.controller.AbstractDraweeControllerBuilder
    protected com.facebook.drawee.controller.a j() {
        e.c.h.m.b.b();
        try {
            e.c.e.e.a i = i();
            String b = AbstractDraweeControllerBuilder.b();
            d c2 = i instanceof d ? (d) i : this.s.c();
            c2.Z(false);
            j<com.facebook.datasource.d<e.c.c.g.a<com.facebook.imagepipeline.image.d>>> k = k(c2, b);
            ImageRequest imageRequest = (ImageRequest) g();
            e.c.h.f.g d2 = this.r.d();
            c2.f0(k, b, (d2 == null || imageRequest == null) ? null : imageRequest.k() != null ? ((l) d2).d(imageRequest, c()) : ((l) d2).a(imageRequest, c()), c(), null, null, (ImageRequest) g());
            c2.g0(this.t, this, k.a);
            return c2;
        } finally {
            e.c.h.m.b.b();
        }
    }

    public e w(e.c.e.b.a.i.e eVar) {
        this.t = eVar;
        return this;
    }

    public e.c.e.e.d x(Uri uri) {
        if (uri == null) {
            r(null);
        } else {
            com.facebook.imagepipeline.request.b y = com.facebook.imagepipeline.request.b.y(uri);
            y.G(com.facebook.imagepipeline.common.f.b());
            r(y.a());
        }
        return this;
    }
}
