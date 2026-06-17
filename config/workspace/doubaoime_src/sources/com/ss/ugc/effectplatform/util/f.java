package com.ss.ugc.effectplatform.util;

import bytekn.foundation.io.file.FileType;
import java.io.File;
import java.util.List;
import kotlin.o;
import kotlin.s.b.p;

/* loaded from: classes2.dex */
public final class f {
    public static final f a = new f();

    private f() {
    }

    public static long h(f fVar, String str, bytekn.foundation.io.file.b bVar, long j, p pVar, int i) {
        long j2 = (i & 4) != 0 ? 0L : j;
        int i2 = i & 8;
        kotlin.s.c.l.g(str, "outFilePath");
        kotlin.s.c.l.g(bVar, "inputStream");
        a.a(bVar, bytekn.foundation.io.file.c.b.n(str, false), j2, null);
        return 0L;
    }

    public final long a(bytekn.foundation.io.file.b bVar, bytekn.foundation.io.file.e eVar, long j, p<? super Integer, ? super Long, o> pVar) {
        kotlin.s.c.l.g(bVar, "source");
        kotlin.s.c.l.g(eVar, "sink");
        byte[] bArr = new byte[8192];
        int a2 = bVar.a(bArr, 0, 8192);
        long j2 = 0;
        while (a2 > 0) {
            eVar.b(bArr, 0, a2);
            j2 += a2;
            if (j2 < j && j > 0 && pVar != null) {
                pVar.invoke(Integer.valueOf((int) ((j2 / j) * 100)), Long.valueOf(j));
            }
            a2 = bVar.a(bArr, 0, 8192);
        }
        if (pVar != null) {
            pVar.invoke(100, Long.valueOf(j));
        }
        eVar.a();
        eVar.close();
        return j2;
    }

    public final String b(bytekn.foundation.io.file.b bVar, bytekn.foundation.io.file.e eVar, long j, p<? super Integer, ? super Long, o> pVar) {
        kotlin.s.c.l.g(bVar, "source");
        kotlin.s.c.l.g(eVar, "sink");
        bytekn.foundation.encryption.e eVar2 = new bytekn.foundation.encryption.e();
        byte[] bArr = new byte[8192];
        int a2 = bVar.a(bArr, 0, 8192);
        long j2 = 0;
        while (a2 > 0) {
            eVar.b(bArr, 0, a2);
            j2 += a2;
            eVar2.g(bArr, 0, a2);
            if (j2 < j && j > 0 && pVar != null) {
                pVar.invoke(Integer.valueOf((int) ((j2 / j) * 100)), Long.valueOf(j));
            }
            a2 = bVar.a(bArr, 0, 8192);
        }
        if (pVar != null) {
            pVar.invoke(100, Long.valueOf(j));
        }
        byte[] e2 = eVar2.e();
        eVar.a();
        eVar.close();
        return bytekn.foundation.encryption.a.a(e2);
    }

    public final boolean c(bytekn.foundation.io.file.f fVar) {
        if (fVar == null) {
            return false;
        }
        bytekn.foundation.io.file.c cVar = bytekn.foundation.io.file.c.b;
        boolean p = cVar.p(fVar);
        if (!p && cVar.c(fVar)) {
            d.a.c.b bVar = d.a.c.b.b;
            StringBuilder M = e.a.a.a.a.M("remove file: ");
            M.append(fVar.b());
            M.append(" failed!");
            bVar.b("FileUtils", M.toString(), null);
            g(fVar.b(), fVar.b() + "_dirty", true);
        }
        return p;
    }

    public final boolean d(String str) {
        if (str == null) {
            return false;
        }
        bytekn.foundation.io.file.c cVar = bytekn.foundation.io.file.c.b;
        boolean q = cVar.q(str);
        if (!q && cVar.d(str)) {
            d.a.c.b.b.b("FileUtils", e.a.a.a.a.t("remove file: ", str, " failed!"), null);
            g(str, str + "_dirty", true);
        }
        return q;
    }

    public final long e(String str) {
        long longValue;
        if (str == null) {
            return 0L;
        }
        bytekn.foundation.io.file.c cVar = bytekn.foundation.io.file.c.b;
        bytekn.foundation.io.file.d f2 = cVar.f(str);
        if (f2.d() != FileType.Directory) {
            Long c2 = f2.c();
            if (c2 != null) {
                return c2.longValue();
            }
            return 0L;
        }
        List<bytekn.foundation.io.file.d> o = cVar.o(str);
        if (o == null) {
            return 0L;
        }
        long j = 0;
        for (bytekn.foundation.io.file.d dVar : o) {
            if (dVar.d() == FileType.Directory) {
                longValue = a.e(dVar.a().b());
            } else {
                Long c3 = dVar.c();
                longValue = c3 != null ? c3.longValue() : 0L;
            }
            j += longValue;
        }
        return j;
    }

    public final String f(String str) {
        int w;
        if (str == null || (w = kotlin.text.a.w(str, bytekn.foundation.io.file.c.b.i(), 0, false, 6, null)) < 0) {
            return null;
        }
        String substring = str.substring(0, w);
        kotlin.s.c.l.b(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    public final boolean g(String str, String str2, boolean z) {
        kotlin.s.c.l.g(str2, "destPath");
        if (str == null) {
            return false;
        }
        bytekn.foundation.io.file.c cVar = bytekn.foundation.io.file.c.b;
        kotlin.s.c.l.g(str, "srcPath");
        kotlin.s.c.l.g(str2, "destPath");
        if (new File(str).getAbsoluteFile().renameTo(new File(str2).getAbsoluteFile())) {
            return true;
        }
        if (z) {
            return cVar.r(new bytekn.foundation.io.file.f(str), new bytekn.foundation.io.file.f(str2));
        }
        return false;
    }
}
