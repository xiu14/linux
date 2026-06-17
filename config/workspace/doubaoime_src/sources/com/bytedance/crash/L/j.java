package com.bytedance.crash.L;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import com.bytedance.crash.C0652g;
import com.bytedance.crash.C0653h;
import com.bytedance.crash.L.c;
import java.io.File;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes.dex */
public class j {
    private static j h = null;
    private static long i = 0;
    private static boolean j = true;
    private static boolean k = false;
    private static volatile boolean l = true;
    private c a;

    /* renamed from: c, reason: collision with root package name */
    private final f f4426c;

    /* renamed from: d, reason: collision with root package name */
    private final m f4427d;

    /* renamed from: f, reason: collision with root package name */
    final File f4429f;

    /* renamed from: e, reason: collision with root package name */
    private boolean f4428e = false;

    /* renamed from: g, reason: collision with root package name */
    private long f4430g = 0;
    private final p b = new p();

    static class a implements Runnable {
        final /* synthetic */ Context a;
        final /* synthetic */ File b;

        a(Context context, File file) {
            this.a = context;
            this.b = file;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (j.h == null) {
                j unused = j.h = new j(this.a, this.b, null);
            }
            j.c(j.h);
        }
    }

    static class b implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ com.bytedance.crash.p b;

        b(String str, com.bytedance.crash.p pVar) {
            this.a = str;
            this.b = pVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!com.bytedance.crash.util.a.k() || j.h == null) {
                return;
            }
            f fVar = j.h.f4426c;
            String str = this.a;
            com.bytedance.crash.p pVar = this.b;
            Objects.requireNonNull(fVar);
            new e(fVar, str, 136, pVar, str).startWatching();
        }
    }

    j(Context context, File file, h hVar) {
        File n = com.bytedance.android.input.k.b.a.n(file, "anr");
        this.f4429f = n;
        this.f4426c = new f(context, n);
        this.f4427d = new m();
    }

    static void c(j jVar) {
        if (jVar.f4428e) {
            return;
        }
        jVar.f4428e = true;
        p pVar = jVar.b;
        Objects.requireNonNull(pVar);
        new Handler(Looper.getMainLooper()).post(new n(pVar));
        com.bytedance.crash.runtime.b.d(new o(pVar));
        jVar.f4426c.k();
        m mVar = jVar.f4427d;
        Objects.requireNonNull(mVar);
        com.bytedance.crash.runtime.b.d(new l(mVar));
    }

    public static void e(File file, long j2) {
        m mVar;
        if (!h() || (mVar = h.f4427d) == null) {
            return;
        }
        mVar.b(file, j2);
    }

    public static boolean f() {
        return k || C0652g.l();
    }

    public static boolean g() {
        return j;
    }

    public static boolean h() {
        j jVar = h;
        return jVar != null && jVar.f4428e;
    }

    private void i(long j2, boolean z, File file, int i2) {
        c cVar;
        synchronized (this) {
            c cVar2 = this.a;
            if (cVar2 == null) {
                f fVar = this.f4426c;
                File file2 = this.f4429f;
                this.a = C0653h.c() ? new c.b(fVar, file2, j2, z) : new c.a(fVar, file2, j2, z);
            } else if (cVar2.b(z)) {
                cVar = null;
            }
            cVar = this.a;
        }
        c cVar3 = cVar;
        if (cVar3 != null) {
            cVar3.d(j2, z, file, i2);
        }
    }

    public static void j(long j2, File file) {
        if (h()) {
            try {
                h.i(j2, false, file, 0);
            } catch (Throwable th) {
                com.bytedance.crash.Q.b.f("NPTH_ANR_ERROR", th);
            }
        }
    }

    public static void k(int i2) {
        if (h()) {
            try {
                com.bytedance.crash.monitor.a e2 = com.bytedance.crash.monitor.l.e();
                if (e2 != null) {
                    Iterator<com.bytedance.crash.q> it2 = e2.j().A().iterator();
                    while (it2.hasNext()) {
                        try {
                            it2.next().a();
                        } catch (Throwable unused) {
                        }
                    }
                }
            } catch (Throwable unused2) {
            }
            try {
                long currentTimeMillis = System.currentTimeMillis();
                if (!C0653h.c()) {
                    j jVar = h;
                    if (currentTimeMillis - jVar.f4430g >= com.heytap.mcssdk.constant.a.r) {
                        jVar.f4430g = currentTimeMillis;
                        jVar.i(currentTimeMillis, true, null, i2);
                        return;
                    }
                    return;
                }
                j jVar2 = h;
                Objects.requireNonNull(jVar2);
                if (!C0653h.a()) {
                    if (currentTimeMillis - jVar2.f4430g < com.heytap.mcssdk.constant.a.r) {
                        return;
                    } else {
                        jVar2.f4430g = currentTimeMillis;
                    }
                }
                if ((l || i2 <= 200) && Math.abs(i - currentTimeMillis) >= 120000 && com.bytedance.crash.L.a.b()) {
                    i = currentTimeMillis;
                    h.f4426c.l(currentTimeMillis);
                    h.i(currentTimeMillis, true, null, i2);
                }
            } catch (Throwable th) {
                com.bytedance.crash.Q.b.f("NPTH_ANR_ERROR", th);
            }
        }
    }

    public static void l(String str, com.bytedance.crash.p pVar) {
        com.bytedance.crash.runtime.b.d(new b(str, pVar));
    }

    static void m(c cVar) {
        j jVar = h;
        if (jVar != null) {
            synchronized (jVar) {
                j jVar2 = h;
                if (jVar2.a == cVar) {
                    jVar2.a = null;
                }
            }
        }
    }

    public static void n(boolean z) {
        j = !z;
    }

    public static void o(boolean z) {
        k = z;
    }

    public static void p(boolean z) {
        l = z;
    }

    public static synchronized void q(@NonNull Context context, @NonNull File file) {
        synchronized (j.class) {
            com.bytedance.crash.runtime.b.d(new a(context, file));
        }
    }

    public static void r() {
        j jVar = h;
        if (jVar == null || !jVar.f4428e) {
            return;
        }
        jVar.f4428e = false;
        Objects.requireNonNull(jVar.b);
        jVar.f4426c.m();
        jVar.f4427d.c();
        com.bytedance.crash.U.c.d().h();
    }

    public static void s(@NonNull com.bytedance.crash.monitor.a aVar, long j2) {
        try {
            j jVar = h;
            if (jVar != null) {
                jVar.t(aVar, j2);
            }
        } catch (Exception e2) {
            com.bytedance.crash.Q.b.e("NPTH_ANR_ERROR_upload", e2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x013a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void t(@androidx.annotation.NonNull com.bytedance.crash.monitor.a r25, long r26) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.L.j.t(com.bytedance.crash.monitor.a, long):void");
    }
}
