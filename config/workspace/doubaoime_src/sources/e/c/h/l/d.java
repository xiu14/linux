package e.c.h.l;

import com.facebook.imagepipeline.request.ImageRequest;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public class d extends b {
    private final List<f> a;

    public d(Set<f> set) {
        this.a = new ArrayList(set.size());
        for (f fVar : set) {
            if (fVar != null) {
                this.a.add(fVar);
            }
        }
    }

    @Override // e.c.h.l.b, e.c.h.l.f
    public void a(ImageRequest imageRequest, Object obj, String str, boolean z) {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.a.get(i).a(imageRequest, obj, str, z);
            } catch (Exception e2) {
                e.c.c.e.a.j("ForwardingRequestListener", "InternalListener exception in onRequestStart", e2);
            }
        }
    }

    @Override // e.c.h.l.b, com.facebook.imagepipeline.producers.Y
    public void b(String str, String str2) {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.a.get(i).b(str, str2);
            } catch (Exception e2) {
                e.c.c.e.a.j("ForwardingRequestListener", "InternalListener exception in onProducerStart", e2);
            }
        }
    }

    @Override // e.c.h.l.b, e.c.h.l.f
    public void c(ImageRequest imageRequest, String str, boolean z) {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.a.get(i).c(imageRequest, str, z);
            } catch (Exception e2) {
                e.c.c.e.a.j("ForwardingRequestListener", "InternalListener exception in onRequestSuccess", e2);
            }
        }
    }

    @Override // e.c.h.l.b, com.facebook.imagepipeline.producers.Y
    public void d(String str, String str2, Map<String, String> map) {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.a.get(i).d(str, str2, map);
            } catch (Exception e2) {
                e.c.c.e.a.j("ForwardingRequestListener", "InternalListener exception in onProducerFinishWithCancellation", e2);
            }
        }
    }

    @Override // e.c.h.l.b, com.facebook.imagepipeline.producers.Y
    public void e(String str, String str2, boolean z) {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.a.get(i).e(str, str2, z);
            } catch (Exception e2) {
                e.c.c.e.a.j("ForwardingRequestListener", "InternalListener exception in onProducerFinishWithSuccess", e2);
            }
        }
    }

    @Override // e.c.h.l.b, com.facebook.imagepipeline.producers.Y
    public boolean f(String str) {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            if (this.a.get(i).f(str)) {
                return true;
            }
        }
        return false;
    }

    @Override // e.c.h.l.b, e.c.h.l.f
    public void g(ImageRequest imageRequest, String str, Throwable th, boolean z) {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.a.get(i).g(imageRequest, str, th, z);
            } catch (Exception e2) {
                e.c.c.e.a.j("ForwardingRequestListener", "InternalListener exception in onRequestFailure", e2);
            }
        }
    }

    @Override // e.c.h.l.b, com.facebook.imagepipeline.producers.Y
    public void h(String str, String str2, String str3) {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.a.get(i).h(str, str2, str3);
            } catch (Exception e2) {
                e.c.c.e.a.j("ForwardingRequestListener", "InternalListener exception in onIntermediateChunkStart", e2);
            }
        }
    }

    @Override // e.c.h.l.b, com.facebook.imagepipeline.producers.Y
    public void i(String str, String str2, Map<String, String> map) {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.a.get(i).i(str, str2, map);
            } catch (Exception e2) {
                e.c.c.e.a.j("ForwardingRequestListener", "InternalListener exception in onProducerFinishWithSuccess", e2);
            }
        }
    }

    @Override // e.c.h.l.b, com.facebook.imagepipeline.producers.Y
    public void j(String str, String str2, Throwable th, Map<String, String> map) {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.a.get(i).j(str, str2, th, map);
            } catch (Exception e2) {
                e.c.c.e.a.j("ForwardingRequestListener", "InternalListener exception in onProducerFinishWithFailure", e2);
            }
        }
    }

    @Override // e.c.h.l.b, e.c.h.l.f
    public void k(String str) {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.a.get(i).k(str);
            } catch (Exception e2) {
                e.c.c.e.a.j("ForwardingRequestListener", "InternalListener exception in onRequestCancellation", e2);
            }
        }
    }

    @Override // e.c.h.l.b
    public void l(ImageRequest imageRequest, String str, boolean z) {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            f fVar = this.a.get(i);
            try {
                if (fVar instanceof b) {
                    ((b) fVar).l(imageRequest, str, z);
                }
            } catch (Exception e2) {
                e.c.c.e.a.j("ForwardingRequestListener", "InternalListener exception in onRequestIntermediateResult", e2);
            }
        }
    }

    public void m(f fVar) {
        this.a.add(fVar);
    }

    public byte[] n(InputStream inputStream) {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            if (this.a.get(i) instanceof a) {
                return ((a) this.a.get(i)).l(inputStream);
            }
        }
        return null;
    }

    public d(f... fVarArr) {
        this.a = new ArrayList(fVarArr.length);
        for (f fVar : fVarArr) {
            if (fVar != null) {
                this.a.add(fVar);
            }
        }
    }
}
