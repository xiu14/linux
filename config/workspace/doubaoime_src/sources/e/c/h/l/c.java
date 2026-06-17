package e.c.h.l;

import com.facebook.imagepipeline.producers.V;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public class c implements e {
    private final List<e> a;

    public c(Set<e> set) {
        this.a = new ArrayList(set.size());
        for (e eVar : set) {
            if (eVar != null) {
                this.a.add(eVar);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.X
    public void a(V v, String str, String str2) {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.a.get(i).a(v, str, str2);
            } catch (Exception e2) {
                e.c.c.e.a.j("ForwardingRequestListener2", "InternalListener exception in onIntermediateChunkStart", e2);
            }
        }
    }

    @Override // e.c.h.l.e
    public void b(V v) {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.a.get(i).b(v);
            } catch (Exception e2) {
                e.c.c.e.a.j("ForwardingRequestListener2", "InternalListener exception in onRequestStart", e2);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.X
    public void c(V v, String str, boolean z) {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.a.get(i).c(v, str, z);
            } catch (Exception e2) {
                e.c.c.e.a.j("ForwardingRequestListener2", "InternalListener exception in onProducerFinishWithSuccess", e2);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.X
    public void d(V v, String str, Map<String, String> map) {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.a.get(i).d(v, str, map);
            } catch (Exception e2) {
                e.c.c.e.a.j("ForwardingRequestListener2", "InternalListener exception in onProducerFinishWithCancellation", e2);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.X
    public void e(V v, String str) {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.a.get(i).e(v, str);
            } catch (Exception e2) {
                e.c.c.e.a.j("ForwardingRequestListener2", "InternalListener exception in onProducerStart", e2);
            }
        }
    }

    @Override // e.c.h.l.e
    public void f(V v) {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.a.get(i).f(v);
            } catch (Exception e2) {
                e.c.c.e.a.j("ForwardingRequestListener2", "InternalListener exception in onRequestSuccess", e2);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.X
    public boolean g(V v, String str) {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            if (this.a.get(i).g(v, str)) {
                return true;
            }
        }
        return false;
    }

    @Override // e.c.h.l.e
    public void h(V v, Throwable th) {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.a.get(i).h(v, th);
            } catch (Exception e2) {
                e.c.c.e.a.j("ForwardingRequestListener2", "InternalListener exception in onRequestFailure", e2);
            }
        }
    }

    @Override // e.c.h.l.e
    public void i(V v) {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.a.get(i).i(v);
            } catch (Exception e2) {
                e.c.c.e.a.j("ForwardingRequestListener2", "InternalListener exception in onRequestCancellation", e2);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.X
    public void j(V v, String str, Map<String, String> map) {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.a.get(i).j(v, str, map);
            } catch (Exception e2) {
                e.c.c.e.a.j("ForwardingRequestListener2", "InternalListener exception in onProducerFinishWithSuccess", e2);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.X
    public void k(V v, String str, Throwable th, Map<String, String> map) {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.a.get(i).k(v, str, th, map);
            } catch (Exception e2) {
                e.c.c.e.a.j("ForwardingRequestListener2", "InternalListener exception in onProducerFinishWithFailure", e2);
            }
        }
    }
}
