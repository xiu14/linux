package e.b.l;

import com.bytedance.rpc.serialize.SerializeType;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public class a extends n {
    private int k;

    a() {
        super(null);
        this.k = 0;
    }

    private void l(Map<Integer, Map<String, String>> map, Map<Integer, Map<String, String>> map2) {
        Iterator<String> it2 = e(0, map).keySet().iterator();
        while (it2.hasNext()) {
            f(map2, it2.next(), null);
        }
        for (Map.Entry<String, String> entry : e(1, map).entrySet()) {
            f(map2, entry.getKey(), entry.getValue());
        }
    }

    @Override // e.b.l.n
    public void i(String str) {
        this.f9645g[0] = str;
        this.k |= 32;
    }

    @Override // e.b.l.n
    public void j(String str) {
        this.f9645g[1] = str;
        this.k |= 64;
    }

    void k(n nVar) {
        SerializeType serializeType;
        int i = this.k;
        if (i != 0) {
            if ((i & 2) == 2 && !this.h.isEmpty()) {
                l(this.h, nVar.h);
            }
            if ((this.k & 1) == 1 && !this.i.isEmpty()) {
                l(this.i, nVar.i);
            }
            if ((this.k & 4) == 4 && !this.j.isEmpty()) {
                l(this.j, nVar.j);
            }
            int i2 = this.k;
            if ((i2 & 8) == 8) {
                nVar.f9642d = this.f9642d;
            }
            if ((i2 & 16) == 16) {
                nVar.f9643e = this.f9643e;
            }
            if ((i2 & 32) == 32) {
                nVar.i(this.f9645g[0]);
            }
            if ((this.k & 64) == 64) {
                nVar.j(this.f9645g[1]);
            }
            int i3 = this.k;
            if ((i3 & 128) == 128) {
                nVar.a = this.a;
                nVar.b = this.b;
                nVar.f9641c = this.f9641c;
            }
            if ((i3 & 256) == 256 && (serializeType = this.f9644f) != null) {
                nVar.f9644f = serializeType;
            }
        }
        this.k = 0;
    }

    public boolean m() {
        return this.k != 0;
    }
}
