package e.c.h.l;

import com.facebook.imagepipeline.request.ImageRequest;
import java.io.InputStream;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class a implements f {
    @Override // e.c.h.l.f
    public void a(ImageRequest imageRequest, Object obj, String str, boolean z) {
    }

    @Override // com.facebook.imagepipeline.producers.Y
    public void b(String str, String str2) {
    }

    @Override // e.c.h.l.f
    public void c(ImageRequest imageRequest, String str, boolean z) {
    }

    @Override // com.facebook.imagepipeline.producers.Y
    public void d(String str, String str2, Map<String, String> map) {
    }

    @Override // com.facebook.imagepipeline.producers.Y
    public void e(String str, String str2, boolean z) {
    }

    @Override // com.facebook.imagepipeline.producers.Y
    public boolean f(String str) {
        return false;
    }

    @Override // e.c.h.l.f
    public void g(ImageRequest imageRequest, String str, Throwable th, boolean z) {
    }

    @Override // com.facebook.imagepipeline.producers.Y
    public void h(String str, String str2, String str3) {
    }

    @Override // com.facebook.imagepipeline.producers.Y
    public void i(String str, String str2, Map<String, String> map) {
    }

    @Override // com.facebook.imagepipeline.producers.Y
    public void j(String str, String str2, Throwable th, Map<String, String> map) {
    }

    @Override // e.c.h.l.f
    public void k(String str) {
    }

    public abstract byte[] l(InputStream inputStream);
}
