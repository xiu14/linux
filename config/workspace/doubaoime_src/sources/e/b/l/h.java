package e.b.l;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class h {
    private d a;
    private n b;

    /* renamed from: c, reason: collision with root package name */
    private final List<e.b.l.p.b> f9619c = new ArrayList(4);

    h(d dVar) {
        this.a = dVar;
        this.b = new n(dVar);
    }

    public void a(e.b.l.p.b bVar) {
        synchronized (this.f9619c) {
            if (!this.f9619c.contains(bVar)) {
                this.f9619c.add(bVar);
            }
        }
    }

    boolean b(String str, Map<String, String> map, Map<String, String> map2) {
        c g2 = this.a.g();
        map.putAll(g2.r());
        map2.putAll(g2.s());
        if (str == null) {
            return true;
        }
        return this.a.e(str, map, map2);
    }

    n c() {
        return this.b;
    }

    public long d() {
        n nVar = this.b;
        long j = nVar.a;
        long j2 = nVar.b;
        long j3 = nVar.f9641c;
        if (j <= 0 || j2 <= 0 || j3 <= 0) {
            return 0L;
        }
        return j + j2 + j3 + 100;
    }

    c e() {
        return this.a.g();
    }

    e.b.l.p.b[] f() {
        List<e.b.l.p.b> h = this.a.h();
        List<e.b.l.p.b> list = this.f9619c;
        int size = h == null ? 0 : h.size();
        int size2 = list == null ? 0 : list.size();
        e.b.l.p.b[] bVarArr = new e.b.l.p.b[size + size2];
        if (size > 0) {
            h.toArray(bVarArr);
        }
        if (size2 > 0) {
            if (size == 0) {
                list.toArray(bVarArr);
            } else {
                for (int i = 0; i < size2; i++) {
                    bVarArr[size + i] = list.get(i);
                }
            }
        }
        return bVarArr;
    }

    e.b.l.p.c[] g() {
        List<e.b.l.p.c> i = this.a.i();
        int size = i == null ? 0 : i.size();
        e.b.l.p.c[] cVarArr = new e.b.l.p.c[size];
        if (size > 0) {
            i.toArray(cVarArr);
        }
        return cVarArr;
    }

    com.bytedance.rpc.transport.h[] h() {
        List<com.bytedance.rpc.transport.h> j = this.a.j();
        int size = j == null ? 0 : j.size();
        com.bytedance.rpc.transport.h[] hVarArr = new com.bytedance.rpc.transport.h[size];
        if (size > 0) {
            j.toArray(hVarArr);
        }
        return hVarArr;
    }

    com.bytedance.rpc.transport.k[] i() {
        List<com.bytedance.rpc.transport.k> k = this.a.k();
        int size = k == null ? 0 : k.size();
        com.bytedance.rpc.transport.k[] kVarArr = new com.bytedance.rpc.transport.k[size];
        if (size > 0) {
            k.toArray(kVarArr);
        }
        return kVarArr;
    }
}
