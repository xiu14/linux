package e.b.l;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class e {
    private Map<String, String> a = new HashMap(4);
    private Map<String, String> b = new HashMap(4);

    /* renamed from: c, reason: collision with root package name */
    private List<com.bytedance.rpc.serialize.c> f9601c = new ArrayList(2);

    /* renamed from: d, reason: collision with root package name */
    private Map<String, String> f9602d = new HashMap(4);

    /* renamed from: e, reason: collision with root package name */
    private Map<String, File> f9603e = new HashMap(4);

    public static class b {
        private Map<String, String> a;
        private Map<String, String> b;

        /* renamed from: c, reason: collision with root package name */
        private List<com.bytedance.rpc.serialize.c> f9604c;

        /* renamed from: d, reason: collision with root package name */
        private Map<String, String> f9605d;

        /* renamed from: e, reason: collision with root package name */
        private Map<String, File> f9606e;

        b(e eVar, a aVar) {
            this.a = eVar.a;
            this.b = eVar.b;
            this.f9604c = eVar.f9601c;
            this.f9605d = eVar.f9602d;
            this.f9606e = eVar.f9603e;
        }

        public List<com.bytedance.rpc.serialize.c> f() {
            return this.f9604c;
        }

        public Map<String, String> g() {
            return this.f9605d;
        }

        public Map<String, File> h() {
            return this.f9606e;
        }

        public Map<String, String> i() {
            return this.a;
        }

        public Map<String, String> j() {
            return this.b;
        }

        public boolean k() {
            if (this.f9605d.size() > 0 && this.f9606e.isEmpty()) {
                if (this.f9604c.isEmpty()) {
                    return true;
                }
                if (this.f9604c.size() == 1 && this.f9604c.get(0).a() <= 0) {
                    return true;
                }
            }
            return false;
        }

        public boolean l() {
            if (this.f9606e.size() <= 0) {
                if (this.f9604c.size() + this.f9605d.size() <= 1 && (this.f9604c.size() != 1 || !this.f9604c.get(0).b().equals("multipart/form-data"))) {
                    return false;
                }
            }
            return true;
        }

        public String toString() {
            StringBuilder M = e.a.a.a.a.M("SerializerData{mHeaders=");
            M.append(this.a);
            M.append(", mQueries=");
            M.append(this.b);
            M.append(", mData=");
            M.append(this.f9604c);
            M.append(", mFields=");
            M.append(this.f9605d);
            M.append(", mFiles=");
            M.append(this.f9606e);
            M.append('}');
            return M.toString();
        }
    }

    public e f(byte[] bArr, String str, String str2) {
        this.f9601c.add(new com.bytedance.rpc.serialize.c(bArr, str, str2, null));
        return this;
    }

    public e g(String str, String str2) {
        Map<String, String> map = this.a;
        if (map != null && !e.b.l.q.c.a(str)) {
            if (str2 == null) {
                map.remove(str);
            } else {
                map.put(str, str2);
            }
        }
        return this;
    }

    e h(b bVar) {
        com.bytedance.feedbackerlib.a.v0(this.a, bVar.a);
        com.bytedance.feedbackerlib.a.v0(this.b, bVar.b);
        Map<? extends String, ? extends File> map = bVar.f9606e;
        if (map != null && map.size() > 0) {
            this.f9603e.putAll(map);
        }
        com.bytedance.feedbackerlib.a.v0(this.f9602d, bVar.f9605d);
        if (bVar.f9604c.size() > 1 || (bVar.f9604c.size() == 1 && ((com.bytedance.rpc.serialize.c) bVar.f9604c.get(0)).a() > 0)) {
            this.f9601c.addAll(bVar.f9604c);
        }
        return this;
    }

    public b i() {
        return new b(this, null);
    }

    Map<String, String> j() {
        return this.f9602d;
    }

    Map<String, String> k() {
        return this.a;
    }

    Map<String, String> l() {
        return this.b;
    }

    e m(com.bytedance.rpc.serialize.c cVar) {
        this.f9601c.clear();
        this.f9601c.add(cVar);
        return this;
    }

    public e n(byte[] bArr, String str) {
        this.f9601c.clear();
        this.f9601c.add(new com.bytedance.rpc.serialize.c(bArr, str, null, null));
        return this;
    }
}
