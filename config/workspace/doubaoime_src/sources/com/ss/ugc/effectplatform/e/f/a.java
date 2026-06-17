package com.ss.ugc.effectplatform.e.f;

import bytekn.foundation.io.file.ContentEncoding;
import bytekn.foundation.io.file.h;
import bytekn.foundation.io.file.j;
import com.ss.android.socialbase.downloader.constants.DownloadConstants;
import com.vivo.push.PushClient;
import java.io.File;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.o;
import kotlin.s.c.l;
import kotlin.s.c.m;
import kotlin.text.i;

/* loaded from: classes2.dex */
public final class a {
    private final bytekn.foundation.io.file.f a;
    private final bytekn.foundation.io.file.f b;

    /* renamed from: c, reason: collision with root package name */
    private final bytekn.foundation.io.file.f f8467c;

    /* renamed from: d, reason: collision with root package name */
    private d.a.b.b<Long> f8468d = new d.a.b.b<>(0L);

    /* renamed from: e, reason: collision with root package name */
    private d.a.b.b<Integer> f8469e = new d.a.b.b<>(0);

    /* renamed from: f, reason: collision with root package name */
    private d.a.b.b<j> f8470f = new d.a.b.b<>(null);

    /* renamed from: g, reason: collision with root package name */
    private final d.a.b.d.e f8471g = new d.a.b.d.e();
    private d.a.b.b<Boolean> h;
    private d.a.b.b<Boolean> i;
    private d.a.b.b<Long> j;
    private final d.a.a.b<String, c> k;
    private final d.a.b.c.a l;
    private final Runnable m;
    private final String n;
    private final int o;
    private final int p;
    private long q;
    private final f r;
    private final boolean s;
    private final boolean t;
    private final boolean u;
    public static final C0390a w = new C0390a(null);
    private static final i v = new i("[a-z0-9_-]{1,120}");

    /* renamed from: com.ss.ugc.effectplatform.e.f.a$a, reason: collision with other inner class name */
    public static final class C0390a {
        public C0390a(kotlin.s.c.g gVar) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void c(bytekn.foundation.io.file.f fVar, bytekn.foundation.io.file.f fVar2, boolean z) {
            if (z) {
                bytekn.foundation.io.file.c cVar = bytekn.foundation.io.file.c.b;
                if (cVar.c(fVar2) && !cVar.p(fVar2)) {
                    throw new bytekn.foundation.io.file.g("delete file exception occur,file = " + fVar2);
                }
            }
            if (bytekn.foundation.io.file.c.b.r(fVar, fVar2)) {
                return;
            }
            throw new bytekn.foundation.io.file.g("rename file exception occur, from = " + fVar + ",to = " + fVar2);
        }

        public final a b(String str, int i, int i2, long j, f fVar, boolean z, boolean z2, boolean z3) {
            bytekn.foundation.io.file.f a;
            l.g(str, "directory");
            if (j <= 0) {
                throw new IllegalArgumentException("maxSize <= 0");
            }
            if (i2 <= 0) {
                throw new IllegalArgumentException("valueCount <= 0");
            }
            bytekn.foundation.io.file.c cVar = bytekn.foundation.io.file.c.b;
            if (!cVar.d(str)) {
                cVar.j(str, true);
                if (!cVar.d(str)) {
                    d.a.c.b.b.b("DiskLruCache", "Cache directory error" + str, null);
                }
            }
            bytekn.foundation.io.file.f a2 = new bytekn.foundation.io.file.f(str).a("journal.bkp");
            if (a2 != null && cVar.c(a2) && (a = new bytekn.foundation.io.file.f(str).a("journal")) != null && cVar.c(a)) {
                if (cVar.c(a)) {
                    cVar.p(a2);
                } else {
                    a.w.c(a2, a, false);
                }
            }
            a aVar = new a(str, i, i2, j, fVar, z, z2, z3, null);
            if (cVar.c(aVar.a)) {
                try {
                    aVar.A();
                    aVar.z();
                    aVar.h.b(Boolean.TRUE);
                    return aVar;
                } catch (Exception e2) {
                    d.a.c.b bVar = d.a.c.b.b;
                    StringBuilder U = e.a.a.a.a.U("DiskLruCache ", str, " is corrupt: ");
                    U.append(e2.getMessage());
                    U.append(", removing");
                    bVar.b("DiskLruCache", U.toString(), null);
                    aVar.p();
                }
            }
            bytekn.foundation.io.file.c.b.j(str, true);
            a aVar2 = new a(str, i, i2, j, fVar, z, z2, z3, null);
            aVar2.C();
            return aVar2;
        }

        public final String d(String str) {
            l.g(str, "fileName");
            char[] cArr = new char[str.length()];
            int length = str.length();
            for (int i = 0; i < length; i++) {
                cArr[i] = str.charAt(i);
                char c2 = cArr[i];
                if (c2 != '_' && c2 != '-' && ((c2 < 'a' || c2 > 'z') && (c2 < '0' || c2 > '9'))) {
                    cArr[i] = '_';
                }
            }
            return new String(cArr);
        }
    }

    public final class b {
        private final d.a.b.b<boolean[]> a;
        private d.a.b.b<Boolean> b;

        /* renamed from: c, reason: collision with root package name */
        private d.a.b.b<Boolean> f8472c;

        /* renamed from: d, reason: collision with root package name */
        private final c f8473d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ a f8474e;

        /* renamed from: com.ss.ugc.effectplatform.e.f.a$b$a, reason: collision with other inner class name */
        static final class C0391a extends m implements kotlin.s.b.a<o> {
            C0391a(int i) {
                super(0);
            }

            @Override // kotlin.s.b.a
            public o invoke() {
                b.this.b.b(Boolean.TRUE);
                return o.a;
            }
        }

        public b(a aVar, c cVar) {
            l.g(cVar, "entry");
            this.f8474e = aVar;
            this.f8473d = cVar;
            this.a = new d.a.b.b<>(new boolean[aVar.p]);
            Boolean bool = Boolean.FALSE;
            this.b = new d.a.b.b<>(bool);
            this.f8472c = new d.a.b.b<>(bool);
        }

        public final void a() {
            a.a(this.f8474e, this, false);
        }

        public final void c() {
            if (this.b.a().booleanValue()) {
                a.a(this.f8474e, this, false);
                this.f8474e.D(this.f8473d.d());
            } else {
                a.a(this.f8474e, this, true);
            }
            this.f8472c.b(Boolean.TRUE);
        }

        public final c d() {
            return this.f8473d;
        }

        public final d.a.b.b<boolean[]> e() {
            return this.a;
        }

        public final bytekn.foundation.io.file.e f(int i) {
            bytekn.foundation.io.file.e m;
            if (!(i >= 0 && i < this.f8474e.p)) {
                StringBuilder P = e.a.a.a.a.P("Expected index ", i, " to ", "be greater than 0 and less than the maximum value count ", "of ");
                P.append(this.f8474e.p);
                throw new IllegalArgumentException(P.toString().toString());
            }
            d.a.b.d.e eVar = this.f8474e.f8471g;
            eVar.a();
            try {
                if (!l.a(this.f8473d.b().a(), this)) {
                    throw new IllegalStateException("Check failed.".toString());
                }
                if (!this.f8473d.g().a().booleanValue()) {
                    boolean[] zArr = new boolean[this.f8474e.p];
                    zArr[i] = true;
                    this.a.b(zArr);
                }
                bytekn.foundation.io.file.f c2 = this.f8473d.c(i);
                try {
                    m = bytekn.foundation.io.file.c.b.m(c2, false);
                } catch (Exception unused) {
                    bytekn.foundation.io.file.c cVar = bytekn.foundation.io.file.c.b;
                    cVar.j(this.f8474e.n, true);
                    try {
                        m = cVar.m(c2, false);
                    } catch (Exception unused2) {
                        com.ss.ugc.effectplatform.e.f.d dVar = new com.ss.ugc.effectplatform.e.f.d();
                        eVar.b();
                        return dVar;
                    }
                }
                if (m == null) {
                    l.k();
                    throw null;
                }
                e eVar2 = new e(m, new C0391a(i));
                eVar.b();
                return eVar2;
            } catch (Throwable th) {
                eVar.b();
                throw th;
            }
        }
    }

    public final class c {
        private final d.a.a.a<Long> a;
        private d.a.b.b<Boolean> b;

        /* renamed from: c, reason: collision with root package name */
        private d.a.b.b<b> f8475c;

        /* renamed from: d, reason: collision with root package name */
        private d.a.b.b<Long> f8476d;

        /* renamed from: e, reason: collision with root package name */
        private d.a.a.a<Long> f8477e;

        /* renamed from: f, reason: collision with root package name */
        private final String f8478f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ a f8479g;

        public c(a aVar, String str) {
            l.g(str, "key");
            this.f8479g = aVar;
            this.f8478f = str;
            this.a = new d.a.a.a<>(false, 1);
            this.b = new d.a.b.b<>(Boolean.FALSE);
            this.f8475c = new d.a.b.b<>(null);
            this.f8476d = new d.a.b.b<>(0L);
            this.f8477e = new d.a.a.a<>(false, 1);
            int i = aVar.p;
            for (int i2 = 0; i2 < i; i2++) {
                this.a.add(0L);
                this.f8477e.add(0L);
            }
        }

        private final bytekn.foundation.io.file.g k(String[] strArr) {
            StringBuilder M = e.a.a.a.a.M("unexpected journal line: ");
            M.append(strArr);
            throw new Exception(M.toString());
        }

        public final bytekn.foundation.io.file.f a(int i) {
            if (i == 0) {
                return new bytekn.foundation.io.file.f(this.f8479g.n).a(this.f8478f);
            }
            return new bytekn.foundation.io.file.f(this.f8479g.n).a(this.f8478f + '.' + i);
        }

        public final d.a.b.b<b> b() {
            return this.f8475c;
        }

        public final bytekn.foundation.io.file.f c(int i) {
            if (i == 0) {
                return new bytekn.foundation.io.file.f(this.f8479g.n).a(this.f8478f + ".tmp");
            }
            return new bytekn.foundation.io.file.f(this.f8479g.n).a(this.f8478f + '.' + i + ".tmp");
        }

        public final String d() {
            return this.f8478f;
        }

        public final d.a.a.a<Long> e() {
            return this.a;
        }

        public final String f() {
            StringBuilder sb = new StringBuilder();
            Iterator<Long> it2 = this.a.iterator();
            while (it2.hasNext()) {
                long longValue = it2.next().longValue();
                sb.append(' ');
                sb.append(longValue);
            }
            String sb2 = sb.toString();
            l.b(sb2, "result.toString()");
            return sb2;
        }

        public final d.a.b.b<Boolean> g() {
            return this.b;
        }

        public final d.a.b.b<Long> h() {
            return this.f8476d;
        }

        public final String i() {
            StringBuilder sb = new StringBuilder();
            Iterator<Long> it2 = this.f8477e.iterator();
            while (it2.hasNext()) {
                long longValue = it2.next().longValue();
                sb.append(' ');
                sb.append(longValue);
            }
            String sb2 = sb.toString();
            l.b(sb2, "result.toString()");
            return sb2;
        }

        public final d.a.a.a<Long> j() {
            return this.f8477e;
        }

        public final void l(String[] strArr) {
            l.g(strArr, "strings");
            if (strArr.length != this.f8479g.p) {
                k(strArr);
                throw null;
            }
            try {
                int length = strArr.length;
                for (int i = 0; i < length; i++) {
                    this.a.set(i, Long.valueOf(Long.parseLong(strArr[i])));
                }
            } catch (NumberFormatException unused) {
                k(strArr);
                throw null;
            }
        }

        public final void m(String[] strArr) {
            l.g(strArr, "times");
            if (strArr.length != this.f8479g.p) {
                k(strArr);
                throw null;
            }
            try {
                int length = strArr.length;
                for (int i = 0; i < length; i++) {
                    this.f8477e.set(i, Long.valueOf(Long.parseLong(strArr[i])));
                }
            } catch (NumberFormatException unused) {
                k(strArr);
                throw null;
            }
        }
    }

    public final class d implements h {
        private final bytekn.foundation.io.file.f[] a;
        private final bytekn.foundation.io.file.b[] b;

        public d(a aVar, String str, long j, bytekn.foundation.io.file.f[] fVarArr, bytekn.foundation.io.file.b[] bVarArr, long[] jArr) {
            l.g(str, "key");
            l.g(fVarArr, "cleanFiles");
            l.g(bVarArr, "ins");
            l.g(jArr, "lengths");
            this.a = fVarArr;
            this.b = bVarArr;
        }

        public final bytekn.foundation.io.file.f a(int i) {
            return this.a[i];
        }

        @Override // bytekn.foundation.io.file.h
        public void close() {
            for (bytekn.foundation.io.file.b bVar : this.b) {
                if (bVar != null) {
                    bytekn.foundation.io.file.c.b.b(bVar);
                }
            }
        }
    }

    public a(String str, int i, int i2, long j, f fVar, boolean z, boolean z2, boolean z3, kotlin.s.c.g gVar) {
        this.n = str;
        this.o = i;
        this.p = i2;
        this.q = j;
        this.r = fVar;
        this.s = z;
        this.t = z2;
        this.u = z3;
        Boolean bool = Boolean.FALSE;
        this.h = new d.a.b.b<>(bool);
        this.i = new d.a.b.b<>(bool);
        this.j = new d.a.b.b<>(0L);
        this.k = new d.a.a.b<>(false, 1);
        this.l = new d.a.b.c.a();
        this.m = new com.ss.ugc.effectplatform.e.f.b(this);
        bytekn.foundation.io.file.f a = new bytekn.foundation.io.file.f(str).a("journal");
        if (a == null) {
            l.k();
            throw null;
        }
        this.a = a;
        bytekn.foundation.io.file.f a2 = new bytekn.foundation.io.file.f(str).a("journal.tmp");
        if (a2 == null) {
            l.k();
            throw null;
        }
        this.b = a2;
        bytekn.foundation.io.file.f a3 = new bytekn.foundation.io.file.f(str).a("journal.bkp");
        if (a3 != null) {
            this.f8467c = a3;
        } else {
            l.k();
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void A() {
        bytekn.foundation.io.file.b k = bytekn.foundation.io.file.c.b.k(this.a);
        if (k != null) {
            int i = 0;
            g gVar = new g(k, 0, ContentEncoding.Ascii, 2);
            try {
                try {
                    String e2 = gVar.e();
                    String e3 = gVar.e();
                    String e4 = gVar.e();
                    String e5 = gVar.e();
                    String e6 = gVar.e();
                    boolean z = this.u ? false : !l.a(String.valueOf(this.o), e4);
                    if ((!l.a("libcore.io.DiskLruCache", e2)) || (!l.a(PushClient.DEFAULT_REQUEST_ID, e3)) || z || (!l.a(String.valueOf(this.p), e5)) || (!l.a(e6, ""))) {
                        throw new bytekn.foundation.io.file.g("unexpected journal header: [" + e2 + ", " + e3 + ", " + e5 + ", " + e6 + "]");
                    }
                    int i2 = 0;
                    while (true) {
                        try {
                            String e7 = gVar.e();
                            if (e7 == null || !B(e7)) {
                                break;
                            } else {
                                i2++;
                            }
                        } catch (Exception unused) {
                        }
                    }
                    Collection<c> values = this.k.values();
                    if (!(values instanceof Collection) || !values.isEmpty()) {
                        int i3 = 0;
                        for (c cVar : values) {
                            if ((cVar.j().size() > 0 && cVar.j().get(0).longValue() > 0) && (i3 = i3 + 1) < 0) {
                                kotlin.collections.g.a0();
                                throw null;
                            }
                        }
                        i = i3;
                    }
                    this.f8469e.b(Integer.valueOf((i2 - this.k.size()) - i));
                    if (gVar.d()) {
                        C();
                    } else {
                        d.a.b.b<j> bVar = this.f8470f;
                        bytekn.foundation.io.file.e m = bytekn.foundation.io.file.c.b.m(this.a, true);
                        if (m == null) {
                            l.k();
                            throw null;
                        }
                        d.a.b.a.n(bVar, new bytekn.foundation.io.file.i(m, ContentEncoding.Ascii));
                    }
                } catch (Exception e8) {
                    throw e8;
                }
            } finally {
                bytekn.foundation.io.file.c.b.b(gVar);
            }
        }
    }

    private final boolean B(String str) {
        String substring;
        int p = kotlin.text.a.p(str, ' ', 0, false, 6, null);
        if (p == -1) {
            return false;
        }
        int i = p + 1;
        int p2 = kotlin.text.a.p(str, ' ', i, false, 4, null);
        if (p2 == -1) {
            substring = str.substring(i);
            l.b(substring, "(this as java.lang.String).substring(startIndex)");
            if (p == 6 && kotlin.text.a.K(str, "REMOVE", false, 2, null)) {
                this.k.remove(substring);
                return true;
            }
        } else {
            substring = str.substring(i, p2);
            l.b(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        }
        c cVar = this.k.get(substring);
        if (cVar == null) {
            cVar = new c(this, substring);
            this.k.put(substring, cVar);
        }
        if (p2 != -1 && p == 5 && kotlin.text.a.K(str, "CLEAN", false, 2, null)) {
            String substring2 = str.substring(p2 + 1);
            l.b(substring2, "(this as java.lang.String).substring(startIndex)");
            Object[] array = kotlin.text.a.J(substring2, new String[]{" "}, false, 0, 6, null).toArray(new String[0]);
            if (array == null) {
                throw new kotlin.l("null cannot be cast to non-null type kotlin.Array<T>");
            }
            cVar.g().b(Boolean.TRUE);
            cVar.b().b(null);
            cVar.l((String[]) array);
        } else if (p2 != -1 && p == 3 && kotlin.text.a.K(str, "USE", false, 2, null)) {
            String substring3 = str.substring(p2 + 1);
            l.b(substring3, "(this as java.lang.String).substring(startIndex)");
            Object[] array2 = kotlin.text.a.J(substring3, new String[]{" "}, false, 0, 6, null).toArray(new String[0]);
            if (array2 == null) {
                throw new kotlin.l("null cannot be cast to non-null type kotlin.Array<T>");
            }
            cVar.m((String[]) array2);
        } else if (p2 == -1 && p == 5 && kotlin.text.a.K(str, "DIRTY", false, 2, null)) {
            cVar.b().b(new b(this, cVar));
        } else if (p2 != -1 || p != 4 || !kotlin.text.a.K(str, "READ", false, 2, null)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C() {
        bytekn.foundation.io.file.e m;
        d.a.c.b.b.a("DiskLruCache", "rebuildJournal");
        d.a.b.d.e eVar = this.f8471g;
        eVar.a();
        try {
            j a = this.f8470f.a();
            if (a != null) {
                a.close();
            }
            try {
                m = bytekn.foundation.io.file.c.b.m(this.b, false);
            } catch (Exception unused) {
                bytekn.foundation.io.file.c cVar = bytekn.foundation.io.file.c.b;
                bytekn.foundation.io.file.f fVar = this.b;
                l.g(fVar, "pathComponent");
                String b2 = fVar.b();
                if (b2 != null) {
                    l.g(b2, DownloadConstants.PATH_KEY);
                    new File(b2).getAbsoluteFile().createNewFile();
                }
                m = cVar.m(this.b, false);
            }
            if (m != null) {
                bytekn.foundation.io.file.i iVar = new bytekn.foundation.io.file.i(m, ContentEncoding.Ascii);
                try {
                    iVar.c("libcore.io.DiskLruCache");
                    iVar.c("\n");
                    iVar.c(PushClient.DEFAULT_REQUEST_ID);
                    iVar.c("\n");
                    if (this.u) {
                        iVar.c(String.valueOf(0));
                    } else {
                        iVar.c(String.valueOf(this.o));
                    }
                    iVar.c("\n");
                    iVar.c(String.valueOf(this.p));
                    iVar.c("\n");
                    iVar.c("\n");
                    for (c cVar2 : this.k.values()) {
                        if (cVar2.b().a() != null) {
                            iVar.c("DIRTY " + cVar2.d() + '\n');
                        } else {
                            iVar.c("CLEAN " + cVar2.d() + cVar2.f() + '\n');
                        }
                        if (cVar2.j().size() > 0 && cVar2.j().get(0).longValue() > 0) {
                            iVar.c("USE " + cVar2.d() + cVar2.i() + '\n');
                        }
                    }
                    iVar.close();
                    bytekn.foundation.io.file.c cVar3 = bytekn.foundation.io.file.c.b;
                    if (cVar3.c(this.a)) {
                        w.c(this.a, this.f8467c, true);
                    }
                    w.c(this.b, this.a, false);
                    cVar3.p(this.f8467c);
                    d.a.b.b<j> bVar = this.f8470f;
                    bytekn.foundation.io.file.e m2 = cVar3.m(this.a, true);
                    if (m2 == null) {
                        l.k();
                        throw null;
                    }
                    d.a.b.a.n(bVar, new bytekn.foundation.io.file.i(m2, ContentEncoding.Ascii));
                } catch (Throwable th) {
                    iVar.close();
                    throw th;
                }
            }
        } finally {
            eVar.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E() {
        while (this.f8468d.a().longValue() > this.q) {
            int size = this.k.size();
            int i = 0;
            for (Map.Entry<String, c> entry : this.k.entrySet()) {
                f fVar = this.r;
                if (fVar == null || !fVar.a(entry.getKey())) {
                    if (size - i < 10) {
                        d.a.b.d.e eVar = this.f8471g;
                        eVar.a();
                        try {
                            long j = this.q;
                            eVar.b();
                            long j2 = j * 2;
                            this.f8471g.a();
                            try {
                                this.q = j2;
                                if (this.h.a().booleanValue()) {
                                    this.l.execute(this.m);
                                }
                            } finally {
                            }
                        } finally {
                        }
                    }
                    d.a.c.b bVar = d.a.c.b.b;
                    StringBuilder M = e.a.a.a.a.M("remove ");
                    M.append(entry.getKey());
                    M.append(" because exceed to maxSize(");
                    bVar.a("DiskLruCache", e.a.a.a.a.E(M, this.q, ')'));
                    D(entry.getKey());
                } else {
                    i++;
                }
            }
        }
    }

    private final boolean F(String str) {
        return v.d(str);
    }

    public static final void a(a aVar, b bVar, boolean z) {
        Long c2;
        d.a.b.d.e eVar = aVar.f8471g;
        eVar.a();
        try {
            c d2 = bVar.d();
            if (!l.a(d2.b().a(), bVar)) {
                throw new IllegalStateException();
            }
            if (z && !d2.g().a().booleanValue()) {
                int i = aVar.p;
                for (int i2 = 0; i2 < i; i2++) {
                    if (!bVar.e().a()[i2]) {
                        bVar.a();
                        throw new IllegalStateException("Newly created entry didn't create value for index " + i2);
                    }
                    if (d2.c(i2) != null && !bytekn.foundation.io.file.c.b.c(d2.c(i2))) {
                        bVar.a();
                        break;
                    }
                }
            }
            int i3 = aVar.p;
            for (int i4 = 0; i4 < i3; i4++) {
                bytekn.foundation.io.file.f c3 = d2.c(i4);
                if (c3 != null) {
                    if (z) {
                        bytekn.foundation.io.file.c cVar = bytekn.foundation.io.file.c.b;
                        if (cVar.c(c3)) {
                            bytekn.foundation.io.file.f a = d2.a(i4);
                            cVar.r(c3, a);
                            long longValue = d2.e().get(i4).longValue();
                            bytekn.foundation.io.file.d e2 = cVar.e(a);
                            long longValue2 = (e2 == null || (c2 = e2.c()) == null) ? 0L : c2.longValue();
                            d2.e().set(i4, Long.valueOf(longValue2));
                            d.a.b.b<Long> bVar2 = aVar.f8468d;
                            bVar2.b(Long.valueOf((bVar2.a().longValue() - longValue) + longValue2));
                        }
                    } else {
                        com.ss.ugc.effectplatform.util.f.a.c(c3);
                    }
                }
            }
            d.a.b.b<Integer> bVar3 = aVar.f8469e;
            bVar3.b(Integer.valueOf(bVar3.a().intValue() + 1));
            d2.b().b(null);
            if (d2.g().a().booleanValue() || z) {
                d2.g().b(Boolean.TRUE);
                j a2 = aVar.f8470f.a();
                if (a2 != null) {
                    a2.c("CLEAN " + d2.d() + d2.f() + '\n');
                }
                if (z) {
                    d.a.b.b<Long> bVar4 = aVar.j;
                    bVar4.b(Long.valueOf(bVar4.a().longValue() + 1));
                    d2.h().b(aVar.j.a());
                }
            } else {
                aVar.k.remove(d2.d());
                j a3 = aVar.f8470f.a();
                if (a3 != null) {
                    a3.c("REMOVE " + d2.d() + '\n');
                }
            }
            j a4 = aVar.f8470f.a();
            if (a4 != null) {
                a4.b();
            }
            if (aVar.f8468d.a().longValue() > aVar.q || aVar.v()) {
                aVar.l.execute(aVar.m);
            }
        } finally {
            eVar.b();
        }
    }

    private final void o() {
        if (this.i.a().booleanValue()) {
            throw new IllegalStateException("cache is closed");
        }
    }

    private final void t() {
        if (this.h.a().booleanValue()) {
            return;
        }
        d.a.b.d.e eVar = this.f8471g;
        eVar.a();
        try {
            bytekn.foundation.io.file.c cVar = bytekn.foundation.io.file.c.b;
            if (cVar.c(this.f8467c)) {
                if (!cVar.c(this.a)) {
                    w.c(this.f8467c, this.a, false);
                } else if (cVar.p(this.f8467c) && cVar.c(this.f8467c)) {
                    throw new bytekn.foundation.io.file.g("failed to delete " + this.f8467c);
                }
            }
            if (cVar.c(this.a)) {
                try {
                    A();
                    z();
                    this.h.b(Boolean.TRUE);
                    return;
                } catch (bytekn.foundation.io.file.g e2) {
                    d.a.c.b.b.b("DiskLruCache", "DiskLruCache " + this.n + " is corrupt: " + e2.getMessage() + ", removing", null);
                    try {
                        p();
                        this.i.b(Boolean.FALSE);
                    } catch (Throwable th) {
                        this.i.b(Boolean.FALSE);
                        throw th;
                    }
                }
            }
            C();
            this.h.b(Boolean.TRUE);
        } finally {
            eVar.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean v() {
        d.a.c.b bVar = d.a.c.b.b;
        StringBuilder M = e.a.a.a.a.M("journalRebuildRequired, redundantOpCount:");
        M.append(this.f8469e.a().intValue());
        M.append(", lruEntries.size:");
        M.append(this.k.size());
        bVar.a("DiskLruCache", M.toString());
        return this.f8469e.a().intValue() >= 2000 && this.f8469e.a().intValue() >= this.k.size();
    }

    private final void w(c cVar) {
        if (!this.s) {
            x(cVar);
        } else if (d.a.b.a.j()) {
            this.l.execute(new com.ss.ugc.effectplatform.e.f.c(this, cVar));
        } else {
            x(cVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x(c cVar) {
        try {
            d.a.b.d.e eVar = this.f8471g;
            eVar.a();
            try {
                cVar.j().set(0, Long.valueOf(System.currentTimeMillis()));
                j a = this.f8470f.a();
                if (a != null) {
                    a.c("USE " + cVar.d() + cVar.i() + '\n');
                }
                j a2 = this.f8470f.a();
                if (a2 != null) {
                    a2.b();
                }
                eVar.b();
            } catch (Throwable th) {
                eVar.b();
                throw th;
            }
        } catch (Exception e2) {
            d.a.c.b.b.b("DiskLruCache", "markEntryUsedSync ", e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z() {
        Double b2;
        bytekn.foundation.io.file.c.b.p(this.b);
        Iterator<c> it2 = this.k.values().iterator();
        while (true) {
            int i = 0;
            if (!it2.hasNext()) {
                break;
            }
            c next = it2.next();
            if (next.b().a() == null) {
                int i2 = this.p;
                while (i < i2) {
                    d.a.b.b<Long> bVar = this.f8468d;
                    bVar.b(Long.valueOf(next.e().get(i).longValue() + bVar.a().longValue()));
                    i++;
                }
            } else {
                next.b().b(null);
                int i3 = this.p;
                while (i < i3) {
                    com.ss.ugc.effectplatform.util.f fVar = com.ss.ugc.effectplatform.util.f.a;
                    fVar.c(next.a(i));
                    fVar.c(next.c(i));
                    i++;
                }
                it2.remove();
            }
        }
        if (this.t) {
            return;
        }
        Iterator<T> it3 = this.k.entrySet().iterator();
        while (it3.hasNext()) {
            Map.Entry entry = (Map.Entry) it3.next();
            if (((c) entry.getValue()).j().size() > 0) {
                long j = 0;
                if (((c) entry.getValue()).j().get(0).longValue() <= 0) {
                    bytekn.foundation.io.file.c cVar = bytekn.foundation.io.file.c.b;
                    if (cVar.c(((c) entry.getValue()).a(0))) {
                        bytekn.foundation.io.file.d e2 = cVar.e(((c) entry.getValue()).a(0));
                        if (e2 != null && (b2 = e2.b()) != null) {
                            j = (long) b2.doubleValue();
                        }
                        d.a.c.b.b.a("DiskLruCache", ((String) entry.getKey()) + ":modifiedAt:" + j);
                        ((c) entry.getValue()).j().set(0, Long.valueOf(j));
                    }
                }
            }
        }
    }

    public final boolean D(String str) {
        if (str == null) {
            return false;
        }
        d.a.b.d.e eVar = this.f8471g;
        eVar.a();
        try {
            t();
            o();
            if (!F(str)) {
                throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,120}: \"" + str + "\"");
            }
            c cVar = this.k.get(str);
            if (cVar != null && cVar.b().a() == null) {
                d.a.b.b<Integer> bVar = this.f8469e;
                bVar.b(Integer.valueOf(bVar.a().intValue() + 1));
                j a = this.f8470f.a();
                if (a != null) {
                    a.a("REMOVE " + str + '\n');
                }
                j a2 = this.f8470f.a();
                if (a2 != null) {
                    a2.b();
                }
                this.k.remove(str);
                int i = this.p;
                for (int i2 = 0; i2 < i; i2++) {
                    bytekn.foundation.io.file.f a3 = cVar.a(i2);
                    try {
                        com.ss.ugc.effectplatform.util.f.a.c(a3);
                        d.a.b.b<Long> bVar2 = this.f8468d;
                        bVar2.b(Long.valueOf(bVar2.a().longValue() - cVar.e().get(i2).longValue()));
                        cVar.e().set(i2, 0L);
                    } catch (Exception unused) {
                        throw new Exception("failed to delete " + a3);
                    }
                }
                if (v()) {
                    this.l.execute(this.m);
                }
                return true;
            }
            return false;
        } finally {
            eVar.b();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p() {
        /*
            r3 = this;
            d.a.b.d.e r0 = r3.f8471g
            r0.a()
            d.a.b.b<java.lang.Boolean> r1 = r3.h     // Catch: java.lang.Throwable -> L88
            java.lang.Object r1 = r1.a()     // Catch: java.lang.Throwable -> L88
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L88
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L88
            if (r1 == 0) goto L6b
            d.a.b.b<java.lang.Boolean> r1 = r3.i     // Catch: java.lang.Throwable -> L88
            java.lang.Object r1 = r1.a()     // Catch: java.lang.Throwable -> L88
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L88
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L88
            if (r1 == 0) goto L22
            goto L6b
        L22:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L88
            d.a.a.b<java.lang.String, com.ss.ugc.effectplatform.e.f.a$c> r2 = r3.k     // Catch: java.lang.Throwable -> L88
            java.util.Collection r2 = r2.values()     // Catch: java.lang.Throwable -> L88
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L88
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L88
        L31:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L88
            if (r2 == 0) goto L4d
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L88
            com.ss.ugc.effectplatform.e.f.a$c r2 = (com.ss.ugc.effectplatform.e.f.a.c) r2     // Catch: java.lang.Throwable -> L88
            d.a.b.b r2 = r2.b()     // Catch: java.lang.Throwable -> L88
            java.lang.Object r2 = r2.a()     // Catch: java.lang.Throwable -> L88
            com.ss.ugc.effectplatform.e.f.a$b r2 = (com.ss.ugc.effectplatform.e.f.a.b) r2     // Catch: java.lang.Throwable -> L88
            if (r2 == 0) goto L31
            r2.a()     // Catch: java.lang.Throwable -> L88
            goto L31
        L4d:
            r3.E()     // Catch: java.lang.Throwable -> L88
            d.a.b.b<bytekn.foundation.io.file.j> r1 = r3.f8470f     // Catch: java.lang.Throwable -> L88
            java.lang.Object r1 = r1.a()     // Catch: java.lang.Throwable -> L88
            bytekn.foundation.io.file.j r1 = (bytekn.foundation.io.file.j) r1     // Catch: java.lang.Throwable -> L88
            if (r1 == 0) goto L5d
            r1.close()     // Catch: java.lang.Throwable -> L88
        L5d:
            d.a.b.b<bytekn.foundation.io.file.j> r1 = r3.f8470f     // Catch: java.lang.Throwable -> L88
            r2 = 0
            d.a.b.a.n(r1, r2)     // Catch: java.lang.Throwable -> L88
            d.a.b.b<java.lang.Boolean> r1 = r3.i     // Catch: java.lang.Throwable -> L88
            java.lang.Boolean r2 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L88
            r1.b(r2)     // Catch: java.lang.Throwable -> L88
            goto L72
        L6b:
            d.a.b.b<java.lang.Boolean> r1 = r3.i     // Catch: java.lang.Throwable -> L88
            java.lang.Boolean r2 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L88
            r1.b(r2)     // Catch: java.lang.Throwable -> L88
        L72:
            r0.b()
            com.ss.ugc.effectplatform.util.f r0 = com.ss.ugc.effectplatform.util.f.a
            java.lang.String r1 = r3.n
            boolean r0 = r0.d(r1)
            if (r0 == 0) goto L87
            bytekn.foundation.io.file.c r0 = bytekn.foundation.io.file.c.b
            java.lang.String r1 = r3.n
            r2 = 1
            r0.j(r1, r2)
        L87:
            return
        L88:
            r1 = move-exception
            r0.b()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ugc.effectplatform.e.f.a.p():void");
    }

    public final b q(String str) {
        b bVar;
        d.a.b.d.e eVar = this.f8471g;
        eVar.a();
        try {
            t();
            o();
            if (!F(str)) {
                throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,120}: \"" + str + "\"");
            }
            c cVar = this.k.get(str);
            if (cVar == null) {
                cVar = new c(this, str);
                this.k.put(str, cVar);
            } else if (cVar.b().a() != null) {
                d.a.c.b.b.a("DiskLruCache", "key: " + str + " is now in editing, return null!");
                bVar = null;
                return bVar;
            }
            b bVar2 = new b(this, cVar);
            cVar.b().b(bVar2);
            j a = this.f8470f.a();
            if (a != null) {
                a.c("DIRTY " + str + '\n');
            }
            j a2 = this.f8470f.a();
            if (a2 != null) {
                a2.b();
            }
            bVar = bVar2;
            return bVar;
        } finally {
            eVar.b();
        }
    }

    public final d r(String str) {
        bytekn.foundation.io.file.b bVar;
        if (str == null) {
            return null;
        }
        d.a.b.d.e eVar = this.f8471g;
        eVar.a();
        try {
            t();
            o();
            if (!F(str)) {
                D(str);
                throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,120}: \"" + str + "\"");
            }
            c cVar = this.k.get(str);
            if (cVar == null) {
                return null;
            }
            if (!cVar.g().a().booleanValue()) {
                return null;
            }
            int i = this.p;
            bytekn.foundation.io.file.b[] bVarArr = new bytekn.foundation.io.file.b[i];
            bytekn.foundation.io.file.f[] fVarArr = new bytekn.foundation.io.file.f[i];
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                try {
                    fVarArr[i3] = cVar.a(i3);
                    bytekn.foundation.io.file.f fVar = fVarArr[i3];
                    if (fVar != null) {
                        bVarArr[i3] = bytekn.foundation.io.file.c.b.k(fVar);
                    }
                } catch (Exception unused) {
                    while (i2 < this.p && (bVar = bVarArr[i2]) != null) {
                        bytekn.foundation.io.file.c.b.b(bVar);
                        i2++;
                    }
                    return null;
                }
            }
            d.a.b.b<Integer> bVar2 = this.f8469e;
            bVar2.b(Integer.valueOf(bVar2.a().intValue() + 1));
            j a = this.f8470f.a();
            if (a != null) {
                a.a("READ " + str + '\n');
            }
            w(cVar);
            if (v()) {
                this.l.execute(this.m);
            }
            long longValue = cVar.h().a().longValue();
            d.a.a.a<Long> e2 = cVar.e();
            l.f(e2, "<this>");
            long[] jArr = new long[e2.size()];
            Iterator<Long> it2 = e2.iterator();
            while (it2.hasNext()) {
                jArr[i2] = it2.next().longValue();
                i2++;
            }
            return new d(this, str, longValue, fVarArr, bVarArr, jArr);
        } finally {
            eVar.b();
        }
    }

    public final Set<String> s() {
        d.a.b.d.e eVar = this.f8471g;
        eVar.a();
        try {
            return kotlin.collections.g.m0(new LinkedHashSet(this.k.keySet()));
        } finally {
            eVar.b();
        }
    }

    public final boolean u() {
        bytekn.foundation.io.file.c cVar = bytekn.foundation.io.file.c.b;
        return cVar.d(this.n) && cVar.c(this.a);
    }

    public final void y(String str) {
        l.g(str, "key");
        d.a.b.d.e eVar = this.f8471g;
        eVar.a();
        try {
            t();
            o();
            if (!F(str)) {
                throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,120}: \"" + str + "\"");
            }
            c cVar = this.k.get(str);
            if (cVar == null) {
                cVar = new c(this, str);
                this.k.put(str, cVar);
            }
            w(cVar);
        } finally {
            eVar.b();
        }
    }
}
