package com.bytedance.retrofit2;

import com.bytedance.retrofit2.C0708l;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.mime.TTRequestCompressManager;
import com.ss.android.socialbase.downloader.utils.DownloadHelper;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import okhttp3.w;

/* loaded from: classes2.dex */
public final class F {
    private String a;
    private final InterfaceC0707k b;

    /* renamed from: c, reason: collision with root package name */
    private String f5932c;

    /* renamed from: d, reason: collision with root package name */
    private String f5933d;

    /* renamed from: e, reason: collision with root package name */
    private StringBuilder f5934e;

    /* renamed from: f, reason: collision with root package name */
    private String f5935f;

    /* renamed from: g, reason: collision with root package name */
    private List<com.bytedance.retrofit2.client.b> f5936g;
    private String h;
    private final boolean i;
    private final com.bytedance.retrofit2.mime.c j;
    private final com.bytedance.retrofit2.mime.e k;
    private com.bytedance.retrofit2.mime.i l;
    private int m;
    private final int n;
    private final String o;
    private boolean p;
    private int q;
    private boolean r;
    private int s;
    private final w.a u;
    private okhttp3.A v;
    private boolean w;
    private final Map<Class<?>, Object> x = new LinkedHashMap();
    private Object t = null;

    private static class a extends okhttp3.A {
        private final okhttp3.A a;
        private final String b;

        a(okhttp3.A a, String str) {
            this.a = a;
            this.b = str;
        }

        @Override // okhttp3.A
        public long a() throws IOException {
            return this.a.a();
        }

        @Override // okhttp3.A
        public okhttp3.v b() {
            return okhttp3.v.d(this.b);
        }

        @Override // okhttp3.A
        public void e(f.f fVar) throws IOException {
            this.a.e(fVar);
        }
    }

    public static class b extends com.bytedance.retrofit2.mime.a {

        /* renamed from: d, reason: collision with root package name */
        private final com.bytedance.retrofit2.mime.i f5937d;

        /* renamed from: e, reason: collision with root package name */
        private final String f5938e;

        b(com.bytedance.retrofit2.mime.i iVar, String str) {
            this.f5937d = iVar;
            this.f5938e = str;
        }

        @Override // com.bytedance.retrofit2.mime.a, com.bytedance.retrofit2.mime.i
        public String a() {
            return this.f5938e;
        }

        @Override // com.bytedance.retrofit2.mime.a, com.bytedance.retrofit2.mime.i
        public void b(OutputStream outputStream) throws IOException {
            this.f5937d.b(outputStream);
        }

        @Override // com.bytedance.retrofit2.mime.a, com.bytedance.retrofit2.mime.i
        public String c() {
            return this.f5937d.c();
        }

        @Override // com.bytedance.retrofit2.mime.a, com.bytedance.retrofit2.mime.i
        public String e() {
            this.f6027c = this.f5937d.e();
            return this.f6027c;
        }

        @Override // com.bytedance.retrofit2.mime.a
        public String f() {
            com.bytedance.retrofit2.mime.i iVar = this.f5937d;
            if (iVar instanceof com.bytedance.retrofit2.mime.a) {
                return ((com.bytedance.retrofit2.mime.a) iVar).f();
            }
            return null;
        }

        @Override // com.bytedance.retrofit2.mime.a
        public TTRequestCompressManager.a g(String str, String str2, boolean z) {
            com.bytedance.retrofit2.mime.i iVar = this.f5937d;
            if (iVar instanceof com.bytedance.retrofit2.mime.a) {
                return ((com.bytedance.retrofit2.mime.a) iVar).g(str, str2, z);
            }
            return null;
        }

        @Override // com.bytedance.retrofit2.mime.a
        public boolean i() {
            com.bytedance.retrofit2.mime.i iVar = this.f5937d;
            if (iVar instanceof com.bytedance.retrofit2.mime.a) {
                return ((com.bytedance.retrofit2.mime.a) iVar).i();
            }
            return false;
        }

        @Override // com.bytedance.retrofit2.mime.a, com.bytedance.retrofit2.mime.i
        public long length() {
            return this.f5937d.length();
        }
    }

    F(String str, InterfaceC0707k interfaceC0707k, String str2, List<com.bytedance.retrofit2.client.b> list, String str3, int i, int i2, boolean z, int i3, boolean z2, int i4, Object obj, boolean z3, boolean z4, boolean z5, String str4, boolean z6) {
        this.a = str;
        this.b = interfaceC0707k;
        this.f5933d = str2;
        this.h = str3;
        this.m = i;
        this.n = i2;
        this.p = z;
        this.q = i3;
        this.r = z2;
        this.s = i4;
        this.i = z3;
        this.f5936g = list;
        this.o = str4;
        if (z4) {
            com.bytedance.retrofit2.mime.c cVar = new com.bytedance.retrofit2.mime.c(z6);
            this.j = cVar;
            this.k = null;
            this.l = cVar;
            this.u = null;
            return;
        }
        if (!z5) {
            this.j = null;
            this.k = null;
            this.u = null;
            return;
        }
        this.j = null;
        com.bytedance.retrofit2.mime.e eVar = new com.bytedance.retrofit2.mime.e();
        this.k = eVar;
        this.l = eVar;
        w.a aVar = new w.a();
        this.u = aVar;
        aVar.d(okhttp3.w.f10725f);
    }

    private StringBuilder k(String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        if (str.endsWith("/")) {
            sb.deleteCharAt(sb.length() - 1);
        }
        sb.append(str2);
        return sb;
    }

    void a(String str, String str2, boolean z) {
        this.j.k(str, z, str2, z);
    }

    void b(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("Header name must not be null.");
        }
        if (DownloadHelper.CONTENT_TYPE.equalsIgnoreCase(str)) {
            this.h = str2;
            return;
        }
        List list = this.f5936g;
        if (list == null) {
            list = new ArrayList(2);
            this.f5936g = list;
        }
        list.add(new com.bytedance.retrofit2.client.b(str, str2));
    }

    public void c(String str, com.bytedance.retrofit2.mime.i iVar) {
        this.k.f(str, "binary", iVar);
    }

    public void d(String str, String str2, com.bytedance.retrofit2.mime.i iVar) {
        this.k.f(str, str2, iVar);
    }

    void e(okhttp3.s sVar, okhttp3.A a2) {
        this.u.a(sVar, a2);
    }

    void f(w.b bVar) {
        this.u.b(bVar);
    }

    void g(String str, String str2, boolean z) {
        String str3 = this.f5933d;
        if (str3 == null) {
            throw new AssertionError();
        }
        if (str == null) {
            throw new IllegalArgumentException("Path replacement name must not be null.");
        }
        if (str2 == null) {
            throw new IllegalArgumentException(e.a.a.a.a.t("Path replacement \"", str, "\" value must not be null."));
        }
        try {
            if (z) {
                String replace = URLEncoder.encode(str2, "UTF-8").replace("+", "%20");
                this.f5933d = this.f5933d.replace("{" + str + "}", replace);
            } else {
                this.f5933d = str3.replace("{" + str + "}", str2);
            }
        } catch (UnsupportedEncodingException e2) {
            throw new RuntimeException(e.a.a.a.a.u("Unable to convert path parameter \"", str, "\" value to UTF-8:", str2), e2);
        }
    }

    void h(String str, String str2, boolean z) {
        if (str == null) {
            throw new IllegalArgumentException("Query param name must not be null.");
        }
        try {
            StringBuilder sb = this.f5934e;
            if (sb == null) {
                sb = new StringBuilder();
                this.f5934e = sb;
            }
            sb.append(sb.length() > 0 ? '&' : '?');
            if (z) {
                str = URLEncoder.encode(str, "UTF-8");
            }
            if (z) {
                str2 = URLEncoder.encode(str2, "UTF-8");
            }
            if (str2 != null && !str2.isEmpty()) {
                sb.append(str);
                sb.append('=');
                sb.append(str2);
                return;
            }
            sb.append(str);
        } catch (UnsupportedEncodingException e2) {
            throw new RuntimeException(e.a.a.a.a.u("Unable to convert query parameter \"", str, "\" value to UTF-8: ", str2), e2);
        }
    }

    public <T> void i(Class<? super T> cls, T t) {
        this.x.put(cls, cls.cast(t));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v6, types: [com.bytedance.retrofit2.mime.c] */
    /* JADX WARN: Type inference failed for: r20v0, types: [com.bytedance.retrofit2.F] */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v29, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    Request j(InterfaceC0710n<?> interfaceC0710n) {
        com.bytedance.retrofit2.mime.i bVar;
        okhttp3.A a2;
        List<com.bytedance.retrofit2.client.b> list;
        com.bytedance.retrofit2.mime.i iVar;
        String str;
        String str2;
        com.bytedance.retrofit2.mime.e eVar = this.k;
        if (eVar != null && eVar.h() == 0 && !this.w) {
            throw new IllegalStateException("Multipart requests must contain at least one part.");
        }
        ?? a3 = ((C0708l.a) this.b).a();
        if (E.h()) {
            okhttp3.t o = okhttp3.t.o(a3);
            if (o == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + o + ", Relative: " + this.f5933d);
            }
            if (o.f() == null || o.f().length() <= 0 || !"/".equals(this.f5933d)) {
                okhttp3.t x = o.x(this.f5933d);
                if (x == null) {
                    throw new IllegalArgumentException("Malformed URL. Base: " + o + ", Relative: " + this.f5933d);
                }
                a3 = new StringBuilder(x.toString());
            } else {
                a3 = k(a3, this.f5933d);
            }
        } else {
            try {
                URI create = URI.create(a3);
                a3 = (create.getPath() == null || create.getPath().length() < 1 || !"/".equals(this.f5933d)) ? new StringBuilder(create.resolve(this.f5933d).toString()) : k(a3, this.f5933d);
            } catch (Throwable unused) {
                String str3 = this.f5933d;
                a3 = (str3 == null || !(str3.startsWith("http://") || this.f5933d.startsWith("https://"))) ? k(a3, this.f5933d) : new StringBuilder(this.f5933d);
            }
        }
        StringBuilder sb = this.f5934e;
        if (sb != null) {
            if ('?' == sb.charAt(0) && (str2 = this.f5933d) != null && str2.indexOf(63) != -1) {
                sb.setCharAt(0, '&');
            }
            a3.append(sb);
        }
        String str4 = this.f5935f;
        if (str4 != null) {
            a3.append(str4);
        }
        this.f5932c = a3.toString();
        if (interfaceC0710n instanceof InterfaceC0710n) {
            interfaceC0710n.c(this);
        }
        com.bytedance.retrofit2.mime.i iVar2 = this.l;
        List<com.bytedance.retrofit2.client.b> list2 = this.f5936g;
        okhttp3.A a4 = this.v;
        okhttp3.A a5 = null;
        if (this.w) {
            if (a4 == null) {
                w.a aVar = this.u;
                if (aVar != null) {
                    a4 = aVar.c();
                } else if (this.i) {
                    a4 = okhttp3.A.d(null, new byte[0]);
                }
            }
            if (a4 == null || (str = this.h) == null) {
                list = list2;
                a2 = a4;
                iVar = iVar2;
                if (iVar == 0 && P.o(this.a) && !this.w) {
                    iVar = new com.bytedance.retrofit2.mime.c();
                    iVar.k("body", true, "null", true);
                }
                return new Request(this.a, this.f5932c, list, iVar, a2, this.m, this.n, this.p, this.q, this.r, this.s, this.t, this.o, this.x);
            }
            a5 = new a(a4, str);
            bVar = iVar2;
        } else {
            String str5 = this.h;
            bVar = iVar2;
            if (str5 != null) {
                if (iVar2 != null) {
                    bVar = new b(iVar2, str5);
                } else {
                    com.bytedance.retrofit2.client.b bVar2 = new com.bytedance.retrofit2.client.b(DownloadHelper.CONTENT_TYPE, str5);
                    if (list2 == null) {
                        list2 = Collections.singletonList(bVar2);
                        bVar = iVar2;
                    } else {
                        list2.add(bVar2);
                        bVar = iVar2;
                    }
                }
            }
        }
        list = list2;
        a2 = a5;
        iVar = bVar;
        if (iVar == 0) {
            iVar = new com.bytedance.retrofit2.mime.c();
            iVar.k("body", true, "null", true);
        }
        return new Request(this.a, this.f5932c, list, iVar, a2, this.m, this.n, this.p, this.q, this.r, this.s, this.t, this.o, this.x);
    }

    public void l(boolean z) {
        this.r = z;
    }

    public void m(com.bytedance.retrofit2.mime.i iVar) {
        this.l = iVar;
    }

    void n(okhttp3.A a2) {
        this.v = a2;
    }

    public void o(Object obj) {
        this.t = obj;
    }

    public void p(int i) {
        this.q = i;
    }

    void q(String str, String str2) {
        String str3 = this.a;
        if (str3 == null) {
            throw new AssertionError();
        }
        this.a = str3.replace("{" + str + "}", str2);
    }

    void r(String str) {
        this.f5935f = str;
    }

    void s(Object obj) {
        Objects.requireNonNull(obj, "@Url parameter is null.");
        this.f5933d = obj.toString();
    }

    void t() {
        this.w = true;
    }
}
