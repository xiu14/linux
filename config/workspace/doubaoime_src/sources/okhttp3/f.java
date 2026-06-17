package okhttp3;

import com.xiaomi.mipush.sdk.Constants;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;

/* loaded from: classes2.dex */
public final class f {

    /* renamed from: c, reason: collision with root package name */
    public static final f f10601c = new a().a();
    private final Set<b> a;
    private final okhttp3.F.k.c b;

    public static final class a {
        private final List<b> a = new ArrayList();

        public f a() {
            return new f(new LinkedHashSet(this.a), null);
        }
    }

    static final class b {
        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            Objects.requireNonNull((b) obj);
            throw null;
        }

        public int hashCode() {
            throw null;
        }

        public String toString() {
            new StringBuilder().append((String) null);
            throw null;
        }
    }

    f(Set<b> set, okhttp3.F.k.c cVar) {
        this.a = set;
        this.b = cVar;
    }

    public static String b(Certificate certificate) {
        if (!(certificate instanceof X509Certificate)) {
            throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
        }
        StringBuilder M = e.a.a.a.a.M("sha256/");
        M.append(f.h.l(((X509Certificate) certificate).getPublicKey().getEncoded()).b("SHA-256").a());
        return M.toString();
    }

    public void a(String str, List<Certificate> list) throws SSLPeerUnverifiedException {
        List emptyList = Collections.emptyList();
        Iterator<b> it2 = this.a.iterator();
        if (it2.hasNext()) {
            Objects.requireNonNull(it2.next());
            throw null;
        }
        if (emptyList.isEmpty()) {
            return;
        }
        okhttp3.F.k.c cVar = this.b;
        if (cVar != null) {
            list = cVar.a(list, str);
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (emptyList.size() > 0) {
                Objects.requireNonNull((b) emptyList.get(0));
                throw null;
            }
        }
        StringBuilder S = e.a.a.a.a.S("Certificate pinning failure!", "\n  Peer certificate chain:");
        int size2 = list.size();
        for (int i2 = 0; i2 < size2; i2++) {
            X509Certificate x509Certificate = (X509Certificate) list.get(i2);
            S.append("\n    ");
            S.append(b(x509Certificate));
            S.append(": ");
            S.append(x509Certificate.getSubjectDN().getName());
        }
        S.append("\n  Pinned certificates for ");
        S.append(str);
        S.append(Constants.COLON_SEPARATOR);
        int size3 = emptyList.size();
        for (int i3 = 0; i3 < size3; i3++) {
            b bVar = (b) emptyList.get(i3);
            S.append("\n    ");
            S.append(bVar);
        }
        throw new SSLPeerUnverifiedException(S.toString());
    }

    f c(okhttp3.F.k.c cVar) {
        return okhttp3.F.c.n(this.b, cVar) ? this : new f(this.a, cVar);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (okhttp3.F.c.n(this.b, fVar.b) && this.a.equals(fVar.a)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        okhttp3.F.k.c cVar = this.b;
        return this.a.hashCode() + ((cVar != null ? cVar.hashCode() : 0) * 31);
    }
}
