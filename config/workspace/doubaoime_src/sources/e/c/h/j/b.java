package e.c.h.j;

import android.graphics.Bitmap;
import android.graphics.Rect;
import com.facebook.imagepipeline.image.i;
import com.facebook.imagepipeline.image.k;
import com.xiaomi.mipush.sdk.Constants;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Map;

/* loaded from: classes2.dex */
public class b implements c {
    private final c a;
    private final c b;

    /* renamed from: c, reason: collision with root package name */
    private final c f9926c;

    /* renamed from: d, reason: collision with root package name */
    private final c f9927d;

    /* renamed from: e, reason: collision with root package name */
    private final com.facebook.imagepipeline.platform.d f9928e;

    /* renamed from: f, reason: collision with root package name */
    private final c f9929f = new a();

    class a implements c {
        a() {
        }

        @Override // e.c.h.j.c
        public com.facebook.imagepipeline.image.d a(com.facebook.imagepipeline.image.f fVar, int i, k kVar, com.facebook.imagepipeline.common.c cVar) {
            com.facebook.imagepipeline.common.c i2 = b.i(cVar, fVar);
            e.c.g.d z = fVar.z();
            if (z == e.c.g.c.a) {
                return b.this.f(fVar, i, kVar, i2);
            }
            if (z == e.c.g.c.f9839c) {
                return b.this.e(fVar, i, kVar, i2);
            }
            if (z == e.c.g.c.j) {
                return b.this.d(fVar, i, kVar, i2);
            }
            if (z == com.facebook.imageutils.c.c()) {
                return b.this.c(fVar, i, kVar, cVar);
            }
            if (z != e.c.g.d.b) {
                return b.this.g(fVar, i2);
            }
            StringBuilder M = e.a.a.a.a.M("unknown image format");
            M.append(b.j(fVar));
            throw new e.c.h.j.a(M.toString(), fVar);
        }
    }

    public b(c cVar, c cVar2, c cVar3, c cVar4, com.facebook.imagepipeline.platform.d dVar, Map<e.c.g.d, c> map) {
        this.a = cVar;
        this.b = cVar2;
        this.f9926c = cVar3;
        this.f9927d = cVar4;
        this.f9928e = dVar;
    }

    private void h(e.c.h.o.a aVar, e.c.c.g.a<Bitmap> aVar2) {
        if (aVar == null) {
            return;
        }
        Bitmap r = aVar2.r();
        if (aVar.a()) {
            r.setHasAlpha(true);
        }
        aVar.b(r);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.facebook.imagepipeline.common.c i(com.facebook.imagepipeline.common.c cVar, com.facebook.imagepipeline.image.f fVar) {
        com.facebook.imagepipeline.common.d dVar = new com.facebook.imagepipeline.common.d();
        dVar.t(cVar);
        dVar.q(cVar.n ? cVar.h : com.facebook.imagepipeline.common.b.b().a(fVar.P(), fVar.z()));
        return new com.facebook.imagepipeline.common.c(dVar);
    }

    public static String j(com.facebook.imagepipeline.image.f fVar) {
        InputStream A = fVar.A();
        byte[] bArr = new byte[64];
        try {
            try {
                A.read(bArr);
            } catch (IOException e2) {
                e.c.c.e.a.y("DefaultImageDecoder", e2, "read encode Image 64 byte", new Object[0]);
            }
            StringBuilder M = e.a.a.a.a.M("ImageFormat:");
            M.append(fVar.z().a());
            M.append(Constants.COLON_SEPARATOR);
            M.append(Arrays.toString(bArr));
            return M.toString();
        } finally {
            try {
                e.c.c.d.a.a(A, true);
            } catch (IOException unused) {
            }
        }
    }

    @Override // e.c.h.j.c
    public com.facebook.imagepipeline.image.d a(com.facebook.imagepipeline.image.f fVar, int i, k kVar, com.facebook.imagepipeline.common.c cVar) {
        c cVar2 = cVar.j;
        if (cVar2 != null) {
            return cVar2.a(fVar, i, kVar, cVar);
        }
        e.c.g.d z = fVar.z();
        if (z == null || z == e.c.g.d.b) {
            fVar.q0(e.c.g.e.b(fVar.A()));
        }
        return this.f9929f.a(fVar, i, kVar, cVar);
    }

    public com.facebook.imagepipeline.image.d c(com.facebook.imagepipeline.image.f fVar, int i, k kVar, com.facebook.imagepipeline.common.c cVar) {
        return this.f9926c.a(fVar, i, kVar, cVar);
    }

    public com.facebook.imagepipeline.image.d d(com.facebook.imagepipeline.image.f fVar, int i, k kVar, com.facebook.imagepipeline.common.c cVar) {
        return this.b.a(fVar, i, kVar, cVar);
    }

    public com.facebook.imagepipeline.image.d e(com.facebook.imagepipeline.image.f fVar, int i, k kVar, com.facebook.imagepipeline.common.c cVar) {
        c cVar2;
        if (fVar.N() == -1 || fVar.x() == -1) {
            throw new e.c.h.j.a("image width or height is incorrect", fVar);
        }
        return (cVar.f6456g || (cVar2 = this.a) == null) ? g(fVar, cVar) : cVar2.a(fVar, i, kVar, cVar);
    }

    public com.facebook.imagepipeline.image.e f(com.facebook.imagepipeline.image.f fVar, int i, k kVar, com.facebook.imagepipeline.common.c cVar) {
        Rect D = fVar.D();
        if (D == null) {
            D = cVar.p;
        } else if (!cVar.o) {
            D = cVar.p;
        }
        e.c.c.g.a<Bitmap> b = this.f9928e.b(fVar, cVar.h, D, i, cVar.l);
        try {
            h(cVar.k, b);
            return new com.facebook.imagepipeline.image.e(b, kVar, fVar.G(), fVar.r(), D, fVar.D(), fVar.H(), fVar.z());
        } finally {
            b.close();
        }
    }

    public com.facebook.imagepipeline.image.e g(com.facebook.imagepipeline.image.f fVar, com.facebook.imagepipeline.common.c cVar) {
        Rect D = fVar.D();
        if (D == null) {
            D = cVar.p;
        } else if (!cVar.o) {
            D = cVar.p;
        }
        Rect rect = D;
        e.c.c.g.a<Bitmap> a2 = this.f9928e.a(fVar, cVar.h, rect, cVar.l);
        try {
            h(cVar.k, a2);
            return new com.facebook.imagepipeline.image.e(a2, i.f6481d, fVar.G(), fVar.r(), rect, fVar.D(), fVar.H(), fVar.z());
        } finally {
            a2.close();
        }
    }
}
