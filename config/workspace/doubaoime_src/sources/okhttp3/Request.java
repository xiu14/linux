package okhttp3;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import okhttp3.s;

/* loaded from: classes2.dex */
public final class Request {
    final A body;
    private volatile C0835c cacheControl;
    final s headers;
    final String method;
    final t originUrl;
    final Map<Class<?>, Object> tags;
    final t url;

    Request(a aVar) {
        this.url = aVar.a;
        this.originUrl = aVar.b;
        this.method = aVar.f10587c;
        this.headers = new s(aVar.f10588d);
        this.body = aVar.f10589e;
        Map<Class<?>, Object> map = aVar.f10590f;
        byte[] bArr = okhttp3.F.c.a;
        this.tags = map.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(new LinkedHashMap(map));
    }

    public A body() {
        return this.body;
    }

    public C0835c cacheControl() {
        C0835c c0835c = this.cacheControl;
        if (c0835c != null) {
            return c0835c;
        }
        C0835c j = C0835c.j(this.headers);
        this.cacheControl = j;
        return j;
    }

    public String header(String str) {
        return this.headers.d(str);
    }

    public s headers() {
        return this.headers;
    }

    public boolean isHttps() {
        return this.url.l();
    }

    public String method() {
        return this.method;
    }

    public a newBuilder() {
        return new a(this);
    }

    public t originUrl() {
        return this.originUrl;
    }

    public Object tag() {
        return tag(Object.class);
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("Request{method=");
        M.append(this.method);
        M.append(", url=");
        M.append(this.url);
        M.append(", tags=");
        M.append(this.tags);
        M.append('}');
        return M.toString();
    }

    public t url() {
        return this.url;
    }

    public List<String> headers(String str) {
        return this.headers.l(str);
    }

    public <T> T tag(Class<? extends T> cls) {
        return cls.cast(this.tags.get(cls));
    }

    public static class a {
        t a;
        t b;

        /* renamed from: c, reason: collision with root package name */
        String f10587c;

        /* renamed from: d, reason: collision with root package name */
        s.a f10588d;

        /* renamed from: e, reason: collision with root package name */
        A f10589e;

        /* renamed from: f, reason: collision with root package name */
        Map<Class<?>, Object> f10590f;

        public a() {
            this.f10590f = Collections.emptyMap();
            this.f10587c = "GET";
            this.f10588d = new s.a();
        }

        public a a(String str, String str2) {
            this.f10588d.a(str, str2);
            return this;
        }

        public Request b() {
            if (this.a != null) {
                return new Request(this);
            }
            throw new IllegalStateException("url == null");
        }

        public a c() {
            f("GET", null);
            return this;
        }

        public a d(String str, String str2) {
            s.a aVar = this.f10588d;
            Objects.requireNonNull(aVar);
            s.b(str);
            s.c(str2, str);
            aVar.d(str);
            aVar.a.add(str);
            aVar.a.add(str2.trim());
            return this;
        }

        public a e(s sVar) {
            this.f10588d = sVar.g();
            return this;
        }

        public a f(String str, A a) {
            Objects.requireNonNull(str, "method == null");
            if (str.length() == 0) {
                throw new IllegalArgumentException("method.length() == 0");
            }
            if (a != null && !com.prolificinteractive.materialcalendarview.r.c0(str)) {
                throw new IllegalArgumentException(e.a.a.a.a.t("method ", str, " must not have a request body."));
            }
            if (a == null) {
                if (str.equals("POST") || str.equals("PUT") || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("REPORT")) {
                    throw new IllegalArgumentException(e.a.a.a.a.t("method ", str, " must have a request body."));
                }
            }
            this.f10587c = str;
            this.f10589e = a;
            return this;
        }

        public a g(String str) {
            Objects.requireNonNull(str, "url == null");
            if (str.regionMatches(true, 0, "ws:", 0, 3)) {
                StringBuilder M = e.a.a.a.a.M("http:");
                M.append(str.substring(3));
                str = M.toString();
            } else if (str.regionMatches(true, 0, "wss:", 0, 4)) {
                StringBuilder M2 = e.a.a.a.a.M("https:");
                M2.append(str.substring(4));
                str = M2.toString();
            }
            this.b = t.j(str);
            return this;
        }

        public a h(String str) {
            this.f10588d.d(str);
            return this;
        }

        public a i(Object obj) {
            if (obj == null) {
                this.f10590f.remove(Object.class);
            } else {
                if (this.f10590f.isEmpty()) {
                    this.f10590f = new LinkedHashMap();
                }
                this.f10590f.put(Object.class, Object.class.cast(obj));
            }
            return this;
        }

        public a j(String str) {
            Objects.requireNonNull(str, "url == null");
            if (str.regionMatches(true, 0, "ws:", 0, 3)) {
                StringBuilder M = e.a.a.a.a.M("http:");
                M.append(str.substring(3));
                str = M.toString();
            } else if (str.regionMatches(true, 0, "wss:", 0, 4)) {
                StringBuilder M2 = e.a.a.a.a.M("https:");
                M2.append(str.substring(4));
                str = M2.toString();
            }
            k(t.j(str));
            return this;
        }

        public a k(t tVar) {
            Objects.requireNonNull(tVar, "url == null");
            this.a = tVar;
            return this;
        }

        a(Request request) {
            this.f10590f = Collections.emptyMap();
            this.a = request.url;
            this.f10587c = request.method;
            this.f10589e = request.body;
            this.f10590f = request.tags.isEmpty() ? Collections.emptyMap() : new LinkedHashMap<>(request.tags);
            this.f10588d = request.headers.g();
            this.b = request.originUrl;
        }
    }
}
