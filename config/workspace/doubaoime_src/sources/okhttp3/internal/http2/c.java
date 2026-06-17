package okhttp3.internal.http2;

import com.ss.android.socialbase.downloader.utils.DownloadHelper;
import f.t;
import f.z;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
final class c {
    static final okhttp3.internal.http2.b[] a;
    static final Map<f.h, Integer> b;

    static final class a {
        private final f.g b;

        /* renamed from: c, reason: collision with root package name */
        private final int f10617c;

        /* renamed from: d, reason: collision with root package name */
        private int f10618d;
        private final List<okhttp3.internal.http2.b> a = new ArrayList();

        /* renamed from: e, reason: collision with root package name */
        okhttp3.internal.http2.b[] f10619e = new okhttp3.internal.http2.b[8];

        /* renamed from: f, reason: collision with root package name */
        int f10620f = 7;

        /* renamed from: g, reason: collision with root package name */
        int f10621g = 0;
        int h = 0;

        a(int i, z zVar) {
            this.f10617c = i;
            this.f10618d = i;
            kotlin.s.c.l.g(zVar, "$receiver");
            this.b = new t(zVar);
        }

        private void a() {
            Arrays.fill(this.f10619e, (Object) null);
            this.f10620f = this.f10619e.length - 1;
            this.f10621g = 0;
            this.h = 0;
        }

        private int b(int i) {
            return this.f10620f + 1 + i;
        }

        private int c(int i) {
            int i2;
            int i3 = 0;
            if (i > 0) {
                int length = this.f10619e.length;
                while (true) {
                    length--;
                    i2 = this.f10620f;
                    if (length < i2 || i <= 0) {
                        break;
                    }
                    okhttp3.internal.http2.b[] bVarArr = this.f10619e;
                    i -= bVarArr[length].f10616c;
                    this.h -= bVarArr[length].f10616c;
                    this.f10621g--;
                    i3++;
                }
                okhttp3.internal.http2.b[] bVarArr2 = this.f10619e;
                System.arraycopy(bVarArr2, i2 + 1, bVarArr2, i2 + 1 + i3, this.f10621g);
                this.f10620f += i3;
            }
            return i3;
        }

        private f.h e(int i) throws IOException {
            if (i >= 0 && i <= c.a.length - 1) {
                return c.a[i].a;
            }
            int b = b(i - c.a.length);
            if (b >= 0) {
                okhttp3.internal.http2.b[] bVarArr = this.f10619e;
                if (b < bVarArr.length) {
                    return bVarArr[b].a;
                }
            }
            StringBuilder M = e.a.a.a.a.M("Header index too large ");
            M.append(i + 1);
            throw new IOException(M.toString());
        }

        private void f(int i, okhttp3.internal.http2.b bVar) {
            this.a.add(bVar);
            int i2 = bVar.f10616c;
            if (i != -1) {
                i2 -= this.f10619e[(this.f10620f + 1) + i].f10616c;
            }
            int i3 = this.f10618d;
            if (i2 > i3) {
                a();
                return;
            }
            int c2 = c((this.h + i2) - i3);
            if (i == -1) {
                int i4 = this.f10621g + 1;
                okhttp3.internal.http2.b[] bVarArr = this.f10619e;
                if (i4 > bVarArr.length) {
                    okhttp3.internal.http2.b[] bVarArr2 = new okhttp3.internal.http2.b[bVarArr.length * 2];
                    System.arraycopy(bVarArr, 0, bVarArr2, bVarArr.length, bVarArr.length);
                    this.f10620f = this.f10619e.length - 1;
                    this.f10619e = bVarArr2;
                }
                int i5 = this.f10620f;
                this.f10620f = i5 - 1;
                this.f10619e[i5] = bVar;
                this.f10621g++;
            } else {
                this.f10619e[this.f10620f + 1 + i + c2 + i] = bVar;
            }
            this.h += i2;
        }

        public List<okhttp3.internal.http2.b> d() {
            ArrayList arrayList = new ArrayList(this.a);
            this.a.clear();
            return arrayList;
        }

        f.h g() throws IOException {
            int readByte = this.b.readByte() & 255;
            boolean z = (readByte & 128) == 128;
            int i = i(readByte, 127);
            return z ? f.h.l(m.d().a(this.b.X(i))) : this.b.m(i);
        }

        void h() throws IOException {
            while (!this.b.v()) {
                int readByte = this.b.readByte() & 255;
                if (readByte == 128) {
                    throw new IOException("index == 0");
                }
                if ((readByte & 128) == 128) {
                    int i = i(readByte, 127) - 1;
                    if (!(i >= 0 && i <= c.a.length - 1)) {
                        int b = b(i - c.a.length);
                        if (b >= 0) {
                            okhttp3.internal.http2.b[] bVarArr = this.f10619e;
                            if (b < bVarArr.length) {
                                this.a.add(bVarArr[b]);
                            }
                        }
                        StringBuilder M = e.a.a.a.a.M("Header index too large ");
                        M.append(i + 1);
                        throw new IOException(M.toString());
                    }
                    this.a.add(c.a[i]);
                } else if (readByte == 64) {
                    f.h g2 = g();
                    c.a(g2);
                    f(-1, new okhttp3.internal.http2.b(g2, g()));
                } else if ((readByte & 64) == 64) {
                    f(-1, new okhttp3.internal.http2.b(e(i(readByte, 63) - 1), g()));
                } else if ((readByte & 32) == 32) {
                    int i2 = i(readByte, 31);
                    this.f10618d = i2;
                    if (i2 < 0 || i2 > this.f10617c) {
                        StringBuilder M2 = e.a.a.a.a.M("Invalid dynamic table size update ");
                        M2.append(this.f10618d);
                        throw new IOException(M2.toString());
                    }
                    int i3 = this.h;
                    if (i2 < i3) {
                        if (i2 == 0) {
                            a();
                        } else {
                            c(i3 - i2);
                        }
                    }
                } else if (readByte == 16 || readByte == 0) {
                    f.h g3 = g();
                    c.a(g3);
                    this.a.add(new okhttp3.internal.http2.b(g3, g()));
                } else {
                    this.a.add(new okhttp3.internal.http2.b(e(i(readByte, 15) - 1), g()));
                }
            }
        }

        int i(int i, int i2) throws IOException {
            int i3 = i & i2;
            if (i3 < i2) {
                return i3;
            }
            int i4 = 0;
            while (true) {
                int readByte = this.b.readByte() & 255;
                if ((readByte & 128) == 0) {
                    return i2 + (readByte << i4);
                }
                i2 += (readByte & 127) << i4;
                i4 += 7;
            }
        }
    }

    static final class b {
        private final f.e a;

        /* renamed from: c, reason: collision with root package name */
        private boolean f10622c;
        private int b = Integer.MAX_VALUE;

        /* renamed from: e, reason: collision with root package name */
        okhttp3.internal.http2.b[] f10624e = new okhttp3.internal.http2.b[8];

        /* renamed from: f, reason: collision with root package name */
        int f10625f = 7;

        /* renamed from: g, reason: collision with root package name */
        int f10626g = 0;
        int h = 0;

        /* renamed from: d, reason: collision with root package name */
        int f10623d = 4096;

        b(f.e eVar) {
            this.a = eVar;
        }

        private void a() {
            Arrays.fill(this.f10624e, (Object) null);
            this.f10625f = this.f10624e.length - 1;
            this.f10626g = 0;
            this.h = 0;
        }

        private int b(int i) {
            int i2;
            int i3 = 0;
            if (i > 0) {
                int length = this.f10624e.length;
                while (true) {
                    length--;
                    i2 = this.f10625f;
                    if (length < i2 || i <= 0) {
                        break;
                    }
                    okhttp3.internal.http2.b[] bVarArr = this.f10624e;
                    i -= bVarArr[length].f10616c;
                    this.h -= bVarArr[length].f10616c;
                    this.f10626g--;
                    i3++;
                }
                okhttp3.internal.http2.b[] bVarArr2 = this.f10624e;
                System.arraycopy(bVarArr2, i2 + 1, bVarArr2, i2 + 1 + i3, this.f10626g);
                okhttp3.internal.http2.b[] bVarArr3 = this.f10624e;
                int i4 = this.f10625f;
                Arrays.fill(bVarArr3, i4 + 1, i4 + 1 + i3, (Object) null);
                this.f10625f += i3;
            }
            return i3;
        }

        private void c(okhttp3.internal.http2.b bVar) {
            int i = bVar.f10616c;
            int i2 = this.f10623d;
            if (i > i2) {
                a();
                return;
            }
            b((this.h + i) - i2);
            int i3 = this.f10626g + 1;
            okhttp3.internal.http2.b[] bVarArr = this.f10624e;
            if (i3 > bVarArr.length) {
                okhttp3.internal.http2.b[] bVarArr2 = new okhttp3.internal.http2.b[bVarArr.length * 2];
                System.arraycopy(bVarArr, 0, bVarArr2, bVarArr.length, bVarArr.length);
                this.f10625f = this.f10624e.length - 1;
                this.f10624e = bVarArr2;
            }
            int i4 = this.f10625f;
            this.f10625f = i4 - 1;
            this.f10624e[i4] = bVar;
            this.f10626g++;
            this.h += i;
        }

        void d(int i) {
            int min = Math.min(i, 16384);
            int i2 = this.f10623d;
            if (i2 == min) {
                return;
            }
            if (min < i2) {
                this.b = Math.min(this.b, min);
            }
            this.f10622c = true;
            this.f10623d = min;
            int i3 = this.h;
            if (min < i3) {
                if (min == 0) {
                    a();
                } else {
                    b(i3 - min);
                }
            }
        }

        void e(f.h hVar) throws IOException {
            if (m.d().c(hVar) >= hVar.f()) {
                g(hVar.f(), 127, 0);
                this.a.N(hVar);
                return;
            }
            f.e eVar = new f.e();
            m.d().b(hVar, eVar);
            f.h w = eVar.w();
            g(w.f(), 127, 128);
            this.a.N(w);
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0070  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00a7  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00af  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        void f(java.util.List<okhttp3.internal.http2.b> r14) throws java.io.IOException {
            /*
                Method dump skipped, instructions count: 235
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.c.b.f(java.util.List):void");
        }

        void g(int i, int i2, int i3) {
            if (i < i2) {
                this.a.U(i | i3);
                return;
            }
            this.a.U(i3 | i2);
            int i4 = i - i2;
            while (i4 >= 128) {
                this.a.U(128 | (i4 & 127));
                i4 >>>= 7;
            }
            this.a.U(i4);
        }
    }

    static {
        okhttp3.internal.http2.b bVar = new okhttp3.internal.http2.b(okhttp3.internal.http2.b.i, "");
        int i = 0;
        f.h hVar = okhttp3.internal.http2.b.f10614f;
        f.h hVar2 = okhttp3.internal.http2.b.f10615g;
        f.h hVar3 = okhttp3.internal.http2.b.h;
        f.h hVar4 = okhttp3.internal.http2.b.f10613e;
        okhttp3.internal.http2.b[] bVarArr = {bVar, new okhttp3.internal.http2.b(hVar, "GET"), new okhttp3.internal.http2.b(hVar, "POST"), new okhttp3.internal.http2.b(hVar2, "/"), new okhttp3.internal.http2.b(hVar2, "/index.html"), new okhttp3.internal.http2.b(hVar3, "http"), new okhttp3.internal.http2.b(hVar3, "https"), new okhttp3.internal.http2.b(hVar4, "200"), new okhttp3.internal.http2.b(hVar4, "204"), new okhttp3.internal.http2.b(hVar4, "206"), new okhttp3.internal.http2.b(hVar4, "304"), new okhttp3.internal.http2.b(hVar4, "400"), new okhttp3.internal.http2.b(hVar4, "404"), new okhttp3.internal.http2.b(hVar4, "500"), new okhttp3.internal.http2.b(f.h.c("accept-charset"), f.h.c("")), new okhttp3.internal.http2.b(f.h.c("accept-encoding"), f.h.c("gzip, deflate")), new okhttp3.internal.http2.b(f.h.c("accept-language"), f.h.c("")), new okhttp3.internal.http2.b(f.h.c("accept-ranges"), f.h.c("")), new okhttp3.internal.http2.b(f.h.c("accept"), f.h.c("")), new okhttp3.internal.http2.b(f.h.c("access-control-allow-origin"), f.h.c("")), new okhttp3.internal.http2.b(f.h.c("age"), f.h.c("")), new okhttp3.internal.http2.b(f.h.c("allow"), f.h.c("")), new okhttp3.internal.http2.b(f.h.c("authorization"), f.h.c("")), new okhttp3.internal.http2.b(f.h.c("cache-control"), f.h.c("")), new okhttp3.internal.http2.b(f.h.c("content-disposition"), f.h.c("")), new okhttp3.internal.http2.b(f.h.c("content-encoding"), f.h.c("")), new okhttp3.internal.http2.b(f.h.c("content-language"), f.h.c("")), new okhttp3.internal.http2.b(f.h.c("content-length"), f.h.c("")), new okhttp3.internal.http2.b(f.h.c("content-location"), f.h.c("")), new okhttp3.internal.http2.b(f.h.c("content-range"), f.h.c("")), new okhttp3.internal.http2.b(f.h.c("content-type"), f.h.c("")), new okhttp3.internal.http2.b(f.h.c("cookie"), f.h.c("")), new okhttp3.internal.http2.b(f.h.c("date"), f.h.c("")), new okhttp3.internal.http2.b(f.h.c("etag"), f.h.c("")), new okhttp3.internal.http2.b(f.h.c("expect"), f.h.c("")), new okhttp3.internal.http2.b(f.h.c("expires"), f.h.c("")), new okhttp3.internal.http2.b(f.h.c("from"), f.h.c("")), new okhttp3.internal.http2.b(f.h.c("host"), f.h.c("")), new okhttp3.internal.http2.b(f.h.c("if-match"), f.h.c("")), new okhttp3.internal.http2.b(f.h.c(DownloadHelper.IF_MODIFIED_SINCE), f.h.c("")), new okhttp3.internal.http2.b(f.h.c("if-none-match"), f.h.c("")), new okhttp3.internal.http2.b(f.h.c("if-range"), f.h.c("")), new okhttp3.internal.http2.b(f.h.c("if-unmodified-since"), f.h.c("")), new okhttp3.internal.http2.b(f.h.c("last-modified"), f.h.c("")), new okhttp3.internal.http2.b(f.h.c("link"), f.h.c("")), new okhttp3.internal.http2.b(f.h.c("location"), f.h.c("")), new okhttp3.internal.http2.b(f.h.c("max-forwards"), f.h.c("")), new okhttp3.internal.http2.b(f.h.c("proxy-authenticate"), f.h.c("")), new okhttp3.internal.http2.b(f.h.c("proxy-authorization"), f.h.c("")), new okhttp3.internal.http2.b(f.h.c("range"), f.h.c("")), new okhttp3.internal.http2.b(f.h.c("referer"), f.h.c("")), new okhttp3.internal.http2.b(f.h.c("refresh"), f.h.c("")), new okhttp3.internal.http2.b(f.h.c("retry-after"), f.h.c("")), new okhttp3.internal.http2.b(f.h.c("server"), f.h.c("")), new okhttp3.internal.http2.b(f.h.c("set-cookie"), f.h.c("")), new okhttp3.internal.http2.b(f.h.c("strict-transport-security"), f.h.c("")), new okhttp3.internal.http2.b(f.h.c("transfer-encoding"), f.h.c("")), new okhttp3.internal.http2.b(f.h.c("user-agent"), f.h.c("")), new okhttp3.internal.http2.b(f.h.c("vary"), f.h.c("")), new okhttp3.internal.http2.b(f.h.c("via"), f.h.c("")), new okhttp3.internal.http2.b(f.h.c("www-authenticate"), f.h.c(""))};
        a = bVarArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(bVarArr.length);
        while (true) {
            okhttp3.internal.http2.b[] bVarArr2 = a;
            if (i >= bVarArr2.length) {
                b = Collections.unmodifiableMap(linkedHashMap);
                return;
            } else {
                if (!linkedHashMap.containsKey(bVarArr2[i].a)) {
                    linkedHashMap.put(bVarArr2[i].a, Integer.valueOf(i));
                }
                i++;
            }
        }
    }

    static f.h a(f.h hVar) throws IOException {
        int f2 = hVar.f();
        for (int i = 0; i < f2; i++) {
            byte j = hVar.j(i);
            if (j >= 65 && j <= 90) {
                StringBuilder M = e.a.a.a.a.M("PROTOCOL_ERROR response malformed: mixed case name: ");
                M.append(hVar.t());
                throw new IOException(M.toString());
            }
        }
        return hVar;
    }
}
