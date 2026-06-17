package e.b.l;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class c {
    private String a;
    private Map<String, String> b;

    /* renamed from: c, reason: collision with root package name */
    private Map<String, String> f9586c;

    /* renamed from: d, reason: collision with root package name */
    private long f9587d;

    /* renamed from: e, reason: collision with root package name */
    private long f9588e;

    /* renamed from: f, reason: collision with root package name */
    private long f9589f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f9590g;

    c(b bVar, a aVar) {
        this.f9587d = bVar.f9592d;
        this.f9588e = bVar.f9593e;
        this.f9589f = bVar.f9594f;
        this.a = bVar.a;
        this.b = bVar.b;
        this.f9586c = bVar.f9591c;
        this.f9590g = bVar.f9595g;
    }

    private boolean o(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        return (obj == null || obj2 == null || !obj.equals(obj2)) ? false : true;
    }

    public boolean equals(Object obj) {
        boolean equals = super.equals(obj);
        if (equals || !(obj instanceof c)) {
            return equals;
        }
        c cVar = (c) obj;
        return this.f9587d == cVar.f9587d && this.f9588e == cVar.f9588e && this.f9589f == cVar.f9589f && this.f9590g == cVar.f9590g && TextUtils.equals(this.a, cVar.a) && o(this.b, cVar.b) && o(this.f9586c, cVar.f9586c);
    }

    public String p() {
        return this.a;
    }

    public long q() {
        return this.f9587d;
    }

    public Map<String, String> r() {
        return this.b;
    }

    public Map<String, String> s() {
        return this.f9586c;
    }

    public long t() {
        return this.f9588e;
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("RpcConfig{mBaseUrl='");
        e.a.a.a.a.G0(M, this.a, '\'', ", mHeaders=");
        M.append(this.b);
        M.append(", mQueries=");
        M.append(this.f9586c);
        M.append(", mConnectTimeout=");
        M.append(this.f9587d);
        M.append(", mReadTimeout=");
        M.append(this.f9588e);
        M.append(", mWriteTimeout=");
        M.append(this.f9589f);
        M.append(", mRequestGzip=");
        M.append(this.f9590g);
        M.append(", mChangedFlag=");
        M.append(0);
        M.append('}');
        return M.toString();
    }

    public long u() {
        return this.f9589f;
    }

    public boolean v() {
        return this.f9590g;
    }

    public static class b {
        private String a;
        private Map<String, String> b;

        /* renamed from: c, reason: collision with root package name */
        private Map<String, String> f9591c;

        /* renamed from: d, reason: collision with root package name */
        private long f9592d;

        /* renamed from: e, reason: collision with root package name */
        private long f9593e;

        /* renamed from: f, reason: collision with root package name */
        private long f9594f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f9595g;

        b(c cVar, a aVar) {
            this.f9592d = cVar.f9587d;
            this.f9593e = cVar.f9588e;
            this.f9594f = cVar.f9589f;
            this.a = cVar.a;
            this.f9595g = cVar.f9590g;
            this.b = new HashMap(cVar.b);
            this.f9591c = new HashMap(cVar.f9586c);
        }

        public b h(String str, String str2) {
            Map<String, String> map = this.b;
            if (e.b.l.q.c.c(str)) {
                if (str2 == null) {
                    map.remove(str);
                } else {
                    map.put(str, str2);
                }
            }
            return this;
        }

        public c i(c... cVarArr) {
            if (cVarArr.length == 0) {
                return new c(this, null);
            }
            for (c cVar : cVarArr) {
                cVar.f9587d = this.f9592d;
                cVar.f9588e = this.f9593e;
                cVar.f9589f = this.f9594f;
                cVar.a = this.a;
                cVar.b = this.b;
                cVar.f9586c = this.f9591c;
                cVar.f9590g = this.f9595g;
            }
            return cVarArr[0];
        }

        public b j(String str) {
            this.a = str;
            return this;
        }

        b() {
            this.b = new HashMap();
            this.f9591c = new HashMap();
        }
    }
}
