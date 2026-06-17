package okhttp3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* loaded from: classes2.dex */
public final class j {

    /* renamed from: e, reason: collision with root package name */
    private static final g[] f10693e;

    /* renamed from: f, reason: collision with root package name */
    private static final g[] f10694f;

    /* renamed from: g, reason: collision with root package name */
    private static final TlsVersion[] f10695g;
    private static final TlsVersion[] h;
    public static final j i;
    public static final j j;
    public static final j k;
    final boolean a;
    final boolean b;

    /* renamed from: c, reason: collision with root package name */
    final String[] f10696c;

    /* renamed from: d, reason: collision with root package name */
    final String[] f10697d;

    static {
        g gVar = g.q;
        g gVar2 = g.r;
        g gVar3 = g.s;
        g gVar4 = g.t;
        g gVar5 = g.u;
        g gVar6 = g.k;
        g gVar7 = g.m;
        g gVar8 = g.l;
        g gVar9 = g.n;
        g gVar10 = g.p;
        g gVar11 = g.o;
        g[] gVarArr = {gVar, gVar2, gVar3, gVar4, gVar5, gVar6, gVar7, gVar8, gVar9, gVar10, gVar11};
        f10693e = gVarArr;
        g[] gVarArr2 = {gVar, gVar2, gVar3, gVar4, gVar5, gVar6, gVar7, gVar8, gVar9, gVar10, gVar11, g.i, g.j, g.f10606g, g.h, g.f10604e, g.f10605f, g.f10603d};
        f10694f = gVarArr2;
        a aVar = new a(true);
        aVar.c(gVarArr);
        TlsVersion tlsVersion = TlsVersion.TLS_1_3;
        TlsVersion tlsVersion2 = TlsVersion.TLS_1_2;
        aVar.f(tlsVersion, tlsVersion2);
        aVar.d(true);
        TlsVersion tlsVersion3 = TlsVersion.TLS_1_0;
        TlsVersion[] tlsVersionArr = {tlsVersion, tlsVersion2, TlsVersion.TLS_1_1, tlsVersion3};
        f10695g = tlsVersionArr;
        TlsVersion[] tlsVersionArr2 = {tlsVersion, tlsVersion2};
        h = tlsVersionArr2;
        a aVar2 = new a(true);
        aVar2.c(gVarArr2);
        if (!okhttp3.G.a.j().a()) {
            tlsVersionArr = tlsVersionArr2;
        }
        aVar2.f(tlsVersionArr);
        aVar2.d(true);
        i = new j(aVar2);
        a aVar3 = new a(true);
        aVar3.c(gVarArr2);
        aVar3.f(tlsVersion3);
        aVar3.d(true);
        j = new j(aVar3);
        k = new j(new a(false));
    }

    j(a aVar) {
        this.a = aVar.a;
        this.f10696c = aVar.b;
        this.f10697d = aVar.f10698c;
        this.b = aVar.f10699d;
    }

    public boolean a(SSLSocket sSLSocket) {
        if (!this.a) {
            return false;
        }
        String[] strArr = this.f10697d;
        if (strArr != null && !okhttp3.F.c.v(okhttp3.F.c.p, strArr, sSLSocket.getEnabledProtocols())) {
            return false;
        }
        String[] strArr2 = this.f10696c;
        return strArr2 == null || okhttp3.F.c.v(g.b, strArr2, sSLSocket.getEnabledCipherSuites());
    }

    public boolean b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        j jVar = (j) obj;
        boolean z = this.a;
        if (z != jVar.a) {
            return false;
        }
        return !z || (Arrays.equals(this.f10696c, jVar.f10696c) && Arrays.equals(this.f10697d, jVar.f10697d) && this.b == jVar.b);
    }

    public int hashCode() {
        if (this.a) {
            return ((((527 + Arrays.hashCode(this.f10696c)) * 31) + Arrays.hashCode(this.f10697d)) * 31) + (!this.b ? 1 : 0);
        }
        return 17;
    }

    public String toString() {
        String str;
        List list;
        if (!this.a) {
            return "ConnectionSpec()";
        }
        String[] strArr = this.f10696c;
        if (strArr != null) {
            if (strArr != null) {
                ArrayList arrayList = new ArrayList(strArr.length);
                for (String str2 : strArr) {
                    arrayList.add(g.a(str2));
                }
                list = Collections.unmodifiableList(arrayList);
            } else {
                list = null;
            }
            str = list.toString();
        } else {
            str = "[all enabled]";
        }
        String[] strArr2 = this.f10697d;
        StringBuilder W = e.a.a.a.a.W("ConnectionSpec(cipherSuites=", str, ", tlsVersions=", strArr2 != null ? (strArr2 != null ? TlsVersion.forJavaNames(strArr2) : null).toString() : "[all enabled]", ", supportsTlsExtensions=");
        W.append(this.b);
        W.append(")");
        return W.toString();
    }

    public static final class a {
        boolean a;
        String[] b;

        /* renamed from: c, reason: collision with root package name */
        String[] f10698c;

        /* renamed from: d, reason: collision with root package name */
        boolean f10699d;

        a(boolean z) {
            this.a = z;
        }

        public j a() {
            return new j(this);
        }

        public a b(String... strArr) {
            if (!this.a) {
                throw new IllegalStateException("no cipher suites for cleartext connections");
            }
            if (strArr.length == 0) {
                throw new IllegalArgumentException("At least one cipher suite is required");
            }
            this.b = (String[]) strArr.clone();
            return this;
        }

        public a c(g... gVarArr) {
            if (!this.a) {
                throw new IllegalStateException("no cipher suites for cleartext connections");
            }
            String[] strArr = new String[gVarArr.length];
            for (int i = 0; i < gVarArr.length; i++) {
                strArr[i] = gVarArr[i].a;
            }
            b(strArr);
            return this;
        }

        public a d(boolean z) {
            if (!this.a) {
                throw new IllegalStateException("no TLS extensions for cleartext connections");
            }
            this.f10699d = z;
            return this;
        }

        public a e(String... strArr) {
            if (!this.a) {
                throw new IllegalStateException("no TLS versions for cleartext connections");
            }
            if (strArr.length == 0) {
                throw new IllegalArgumentException("At least one TLS version is required");
            }
            this.f10698c = (String[]) strArr.clone();
            return this;
        }

        public a f(TlsVersion... tlsVersionArr) {
            if (!this.a) {
                throw new IllegalStateException("no TLS versions for cleartext connections");
            }
            String[] strArr = new String[tlsVersionArr.length];
            for (int i = 0; i < tlsVersionArr.length; i++) {
                strArr[i] = tlsVersionArr[i].javaName;
            }
            e(strArr);
            return this;
        }

        public a(j jVar) {
            this.a = jVar.a;
            this.b = jVar.f10696c;
            this.f10698c = jVar.f10697d;
            this.f10699d = jVar.b;
        }
    }
}
