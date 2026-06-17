package e.b.l;

import android.os.Handler;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class l {
    private m a;
    private com.bytedance.rpc.transport.g b;

    /* renamed from: c, reason: collision with root package name */
    private e.b.l.q.d f9631c;

    /* renamed from: d, reason: collision with root package name */
    List<f> f9632d;

    /* renamed from: e, reason: collision with root package name */
    private long f9633e;

    /* renamed from: f, reason: collision with root package name */
    private long f9634f;

    /* renamed from: g, reason: collision with root package name */
    long f9635g;
    long h;
    private f i;

    l(m mVar) {
        this.a = mVar;
    }

    void a() {
        k();
        this.f9631c = null;
    }

    void b() {
        this.a = null;
        List<f> list = this.f9632d;
        if (list != null) {
            list.clear();
            this.f9632d = null;
        }
        if (this.b != null) {
            this.b = null;
        }
        e.b.l.q.d dVar = this.f9631c;
        if (dVar != null) {
            dVar.a();
            this.f9631c = null;
        }
    }

    public f c() {
        return this.i;
    }

    public long d() {
        return this.f9633e;
    }

    public long e() {
        return this.f9634f;
    }

    public m f() {
        return this.a;
    }

    public com.bytedance.rpc.transport.g g() {
        return this.b;
    }

    public boolean h() {
        return this.f9631c == null && this.f9633e > 0;
    }

    com.bytedance.rpc.transport.g i(com.bytedance.rpc.transport.g gVar) {
        this.b = gVar;
        this.f9634f = System.currentTimeMillis();
        return gVar;
    }

    public void j(f fVar) {
        this.i = fVar;
        if (this.f9632d == null) {
            synchronized (this) {
                if (this.f9632d == null) {
                    this.f9632d = new ArrayList();
                }
            }
        }
        this.f9632d.add(fVar);
    }

    void k() {
        e.b.l.q.d dVar = this.f9631c;
        if (dVar != null) {
            dVar.a();
        }
    }

    void l(m mVar) {
        this.a = mVar;
    }

    void m(Handler handler, int i) {
        int g2 = this.a.g();
        long d2 = this.a.i().d();
        k();
        this.f9633e = System.currentTimeMillis();
        e.b.l.q.d dVar = new e.b.l.q.d(handler, d2, i, g2, false);
        this.f9631c = dVar;
        dVar.b();
    }
}
