package okhttp3;

import com.ss.android.socialbase.downloader.utils.DownloadHelper;
import com.ss.android.socialbase.downloader.utils.DownloadUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import okhttp3.s;

/* loaded from: classes2.dex */
public final class w extends A {

    /* renamed from: e, reason: collision with root package name */
    public static final v f10724e = v.c("multipart/mixed");

    /* renamed from: f, reason: collision with root package name */
    public static final v f10725f;

    /* renamed from: g, reason: collision with root package name */
    private static final byte[] f10726g;
    private static final byte[] h;
    private static final byte[] i;
    private final f.h a;
    private final v b;

    /* renamed from: c, reason: collision with root package name */
    private final List<b> f10727c;

    /* renamed from: d, reason: collision with root package name */
    private long f10728d = -1;

    public static final class a {
        private final f.h a;
        private v b;

        /* renamed from: c, reason: collision with root package name */
        private final List<b> f10729c;

        public a() {
            String uuid = UUID.randomUUID().toString();
            this.b = w.f10724e;
            this.f10729c = new ArrayList();
            this.a = f.h.c(uuid);
        }

        public a a(s sVar, A a) {
            this.f10729c.add(b.a(sVar, a));
            return this;
        }

        public a b(b bVar) {
            Objects.requireNonNull(bVar, "part == null");
            this.f10729c.add(bVar);
            return this;
        }

        public w c() {
            if (this.f10729c.isEmpty()) {
                throw new IllegalStateException("Multipart body must have at least one part.");
            }
            return new w(this.a, this.b, this.f10729c);
        }

        public a d(v vVar) {
            Objects.requireNonNull(vVar, "type == null");
            if (vVar.f().equals("multipart")) {
                this.b = vVar;
                return this;
            }
            throw new IllegalArgumentException("multipart != " + vVar);
        }
    }

    public static final class b {
        final s a;
        final A b;

        private b(s sVar, A a) {
            this.a = sVar;
            this.b = a;
        }

        public static b a(s sVar, A a) {
            Objects.requireNonNull(a, "body == null");
            if (sVar != null && sVar.d(DownloadHelper.CONTENT_TYPE) != null) {
                throw new IllegalArgumentException("Unexpected header: Content-Type");
            }
            if (sVar == null || sVar.d(DownloadUtils.CONTENT_LENGTH) == null) {
                return new b(sVar, a);
            }
            throw new IllegalArgumentException("Unexpected header: Content-Length");
        }

        public static b b(String str, String str2, A a) {
            StringBuilder sb = new StringBuilder("form-data; name=");
            w.f(sb, str);
            sb.append("; filename=");
            w.f(sb, str2);
            s.a aVar = new s.a();
            String sb2 = sb.toString();
            s.b("Content-Disposition");
            aVar.a.add("Content-Disposition");
            aVar.a.add(sb2.trim());
            return a(new s(aVar), a);
        }
    }

    static {
        v.c("multipart/alternative");
        v.c("multipart/digest");
        v.c("multipart/parallel");
        f10725f = v.c("multipart/form-data");
        f10726g = new byte[]{58, 32};
        h = new byte[]{13, 10};
        i = new byte[]{45, 45};
    }

    w(f.h hVar, v vVar, List<b> list) {
        this.a = hVar;
        this.b = v.c(vVar + "; boundary=" + hVar.t());
        this.f10727c = okhttp3.F.c.q(list);
    }

    static StringBuilder f(StringBuilder sb, String str) {
        sb.append('\"');
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (charAt == '\n') {
                sb.append("%0A");
            } else if (charAt == '\r') {
                sb.append("%0D");
            } else if (charAt != '\"') {
                sb.append(charAt);
            } else {
                sb.append("%22");
            }
        }
        sb.append('\"');
        return sb;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private long g(f.f fVar, boolean z) throws IOException {
        f.e eVar;
        if (z) {
            fVar = new f.e();
            eVar = fVar;
        } else {
            eVar = 0;
        }
        int size = this.f10727c.size();
        long j = 0;
        for (int i2 = 0; i2 < size; i2++) {
            b bVar = this.f10727c.get(i2);
            s sVar = bVar.a;
            A a2 = bVar.b;
            fVar.write(i);
            fVar.Z(this.a);
            fVar.write(h);
            if (sVar != null) {
                int i3 = sVar.i();
                for (int i4 = 0; i4 < i3; i4++) {
                    fVar.J(sVar.e(i4)).write(f10726g).J(sVar.k(i4)).write(h);
                }
            }
            v b2 = a2.b();
            if (b2 != null) {
                fVar.J("Content-Type: ").J(b2.toString()).write(h);
            }
            long a3 = a2.a();
            if (a3 != -1) {
                fVar.J("Content-Length: ").h0(a3).write(h);
            } else if (z) {
                eVar.a();
                return -1L;
            }
            byte[] bArr = h;
            fVar.write(bArr);
            if (z) {
                j += a3;
            } else {
                a2.e(fVar);
            }
            fVar.write(bArr);
        }
        byte[] bArr2 = i;
        fVar.write(bArr2);
        fVar.Z(this.a);
        fVar.write(bArr2);
        fVar.write(h);
        if (!z) {
            return j;
        }
        long I = j + eVar.I();
        eVar.a();
        return I;
    }

    @Override // okhttp3.A
    public long a() throws IOException {
        long j = this.f10728d;
        if (j != -1) {
            return j;
        }
        long g2 = g(null, true);
        this.f10728d = g2;
        return g2;
    }

    @Override // okhttp3.A
    public v b() {
        return this.b;
    }

    @Override // okhttp3.A
    public void e(f.f fVar) throws IOException {
        g(fVar, false);
    }
}
