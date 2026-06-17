package com.ss.android.c;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import androidx.profileinstaller.ProfileVerifier;
import com.bytedance.android.alog.Alog;
import com.prolificinteractive.materialcalendarview.r;
import com.ss.android.agilelogger.utils.FormatUtils;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.TimerTask;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes2.dex */
public class a {
    private static int a = 3;
    public static com.ss.android.c.d b = null;

    /* renamed from: c, reason: collision with root package name */
    private static volatile boolean f8273c = false;

    /* renamed from: d, reason: collision with root package name */
    private static volatile boolean f8274d = false;
    private static HandlerThread i;
    private static Handler j;

    /* renamed from: e, reason: collision with root package name */
    private static volatile List<com.ss.android.c.e> f8275e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    private static Alog f8276f = null;

    /* renamed from: g, reason: collision with root package name */
    private static ArrayList<WeakReference<Alog>> f8277g = new ArrayList<>();
    private static ExecutorService h = null;
    private static boolean k = false;
    private static Object l = new Object();
    private static final ThreadLocal<Long> m = new c();

    /* renamed from: com.ss.android.c.a$a, reason: collision with other inner class name */
    static class RunnableC0371a implements Runnable {
        RunnableC0371a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.bytedance.android.alog.c.a();
        }
    }

    static class b implements Runnable {
        final /* synthetic */ int a;
        final /* synthetic */ FormatUtils.TYPE b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Throwable f8278c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f8279d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Object f8280e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f8281f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ long f8282g;
        final /* synthetic */ long h;

        b(int i, FormatUtils.TYPE type, Throwable th, String str, Object obj, String str2, long j, long j2) {
            this.a = i;
            this.b = type;
            this.f8278c = th;
            this.f8279d = str;
            this.f8280e = obj;
            this.f8281f = str2;
            this.f8282g = j;
            this.h = j2;
        }

        @Override // java.lang.Runnable
        public void run() {
            int i = this.a - 2;
            FormatUtils.TYPE type = this.b;
            if (type != null) {
                FormatUtils.TYPE type2 = FormatUtils.TYPE.BORDER;
                if (type == type2) {
                    FormatUtils.c(type2, this.f8279d);
                } else {
                    FormatUtils.TYPE type3 = FormatUtils.TYPE.JSON;
                    if (type == type3) {
                        FormatUtils.c(type3, this.f8279d);
                    } else {
                        FormatUtils.TYPE type4 = FormatUtils.TYPE.BUNDLE;
                        if (type == type4) {
                            FormatUtils.b(type4, (Bundle) this.f8280e);
                        } else {
                            FormatUtils.TYPE type5 = FormatUtils.TYPE.INTENT;
                            if (type == type5) {
                                FormatUtils.a(type5, (Intent) this.f8280e);
                            } else {
                                FormatUtils.TYPE type6 = FormatUtils.TYPE.THROWABLE;
                                if (type == type6) {
                                    FormatUtils.e(type6, (Throwable) this.f8280e);
                                } else {
                                    FormatUtils.TYPE type7 = FormatUtils.TYPE.THREAD;
                                    if (type == type7) {
                                        FormatUtils.d(type7, (Thread) this.f8280e);
                                    } else {
                                        FormatUtils.TYPE type8 = FormatUtils.TYPE.STACKTRACE;
                                        if (type == type8) {
                                            FormatUtils.f(type8, (StackTraceElement[]) this.f8280e);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } else if (this.f8278c != null) {
                if (this.f8279d != null) {
                    String str = this.f8279d + "\n";
                }
                com.ss.android.agilelogger.utils.a.c(this.f8278c);
            }
            com.bytedance.android.alog.c.d(i, this.f8281f, this.f8279d, this.f8282g, this.h);
        }
    }

    static class c extends ThreadLocal<Long> {
        c() {
        }

        @Override // java.lang.ThreadLocal
        protected Long initialValue() {
            return Long.valueOf(Process.myTid());
        }
    }

    static class d implements ThreadFactory {
        d() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName("Alog_newthreadpoolimpl");
            return thread;
        }
    }

    static class e extends Handler {
        e(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            String str;
            String f2;
            int i = message.what;
            if (i != 1) {
                if (i != 2) {
                    return;
                }
                com.bytedance.android.alog.c.a();
                return;
            }
            Object obj = message.obj;
            if (obj == null || !(obj instanceof i)) {
                return;
            }
            i iVar = (i) obj;
            int i2 = iVar.a - 2;
            FormatUtils.TYPE type = iVar.f8285e;
            if (type != null) {
                FormatUtils.TYPE type2 = FormatUtils.TYPE.BORDER;
                if (type == type2) {
                    f2 = FormatUtils.c(type2, iVar.f8283c);
                } else {
                    FormatUtils.TYPE type3 = FormatUtils.TYPE.JSON;
                    if (type == type3) {
                        f2 = FormatUtils.c(type3, iVar.f8283c);
                    } else {
                        FormatUtils.TYPE type4 = FormatUtils.TYPE.BUNDLE;
                        if (type == type4) {
                            f2 = FormatUtils.b(type4, (Bundle) iVar.f8286f);
                        } else {
                            FormatUtils.TYPE type5 = FormatUtils.TYPE.INTENT;
                            if (type == type5) {
                                f2 = FormatUtils.a(type5, (Intent) iVar.f8286f);
                            } else {
                                FormatUtils.TYPE type6 = FormatUtils.TYPE.THROWABLE;
                                if (type == type6) {
                                    f2 = FormatUtils.e(type6, (Throwable) iVar.f8286f);
                                } else {
                                    FormatUtils.TYPE type7 = FormatUtils.TYPE.THREAD;
                                    if (type == type7) {
                                        f2 = FormatUtils.d(type7, (Thread) iVar.f8286f);
                                    } else {
                                        FormatUtils.TYPE type8 = FormatUtils.TYPE.STACKTRACE;
                                        if (type != type8) {
                                            str = "";
                                            com.bytedance.android.alog.c.d(i2, iVar.b, str, iVar.f8287g, iVar.h);
                                            iVar.b();
                                        }
                                        f2 = FormatUtils.f(type8, (StackTraceElement[]) iVar.f8286f);
                                    }
                                }
                            }
                        }
                    }
                }
            } else if (iVar.f8284d == null) {
                f2 = iVar.f8283c;
            } else {
                StringBuilder M = e.a.a.a.a.M(iVar.f8283c != null ? e.a.a.a.a.J(new StringBuilder(), iVar.f8283c, "\n") : "");
                M.append(com.ss.android.agilelogger.utils.a.c(iVar.f8284d));
                f2 = M.toString();
            }
            str = f2;
            com.bytedance.android.alog.c.d(i2, iVar.b, str, iVar.f8287g, iVar.h);
            iVar.b();
        }
    }

    static class f implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ String b;

        f(Queue queue, String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (com.ss.android.c.e eVar : a.k()) {
                if (eVar != null) {
                    eVar.a(com.bytedance.android.alog.c.b());
                }
            }
            try {
                Thread.sleep(15000L);
            } catch (Exception unused) {
            }
            a.a(this.a, this.b);
        }
    }

    static class g extends TimerTask {
        final /* synthetic */ String a;
        final /* synthetic */ String b;

        g(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            a.a(this.a, this.b);
        }
    }

    static class h implements Runnable {
        h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.bytedance.android.alog.c.a();
        }
    }

    private static class i {
        private static final Object j = new Object();
        private static i k;
        private static int l;
        public int a;
        public String b;

        /* renamed from: c, reason: collision with root package name */
        public String f8283c;

        /* renamed from: d, reason: collision with root package name */
        public Throwable f8284d;

        /* renamed from: e, reason: collision with root package name */
        public FormatUtils.TYPE f8285e = null;

        /* renamed from: f, reason: collision with root package name */
        public Object f8286f;

        /* renamed from: g, reason: collision with root package name */
        public long f8287g;
        public long h;
        public i i;

        private i() {
        }

        public static i a() {
            synchronized (j) {
                i iVar = k;
                if (iVar == null) {
                    return new i();
                }
                k = iVar.i;
                iVar.i = null;
                l--;
                return iVar;
            }
        }

        public void b() {
            this.b = null;
            this.f8283c = null;
            this.f8284d = null;
            this.f8285e = null;
            this.f8286f = null;
            this.f8287g = -1L;
            this.h = 0L;
            this.i = null;
            synchronized (j) {
                int i = l;
                if (i < 50) {
                    this.i = k;
                    k = this;
                    l = i + 1;
                }
            }
        }
    }

    public static class j {
        private final Alog a;

        j(Alog alog) {
            this.a = alog;
        }

        public void a(String str, String str2) {
            if (a.e(6, str)) {
                this.a.q(4, str, str2);
            }
        }

        public void b(String str, String str2) {
            if (a.e(4, str)) {
                this.a.q(2, str, str2);
            }
        }

        public void c(String str, String str2) {
            if (a.e(5, str)) {
                this.a.q(3, str, str2);
            }
        }
    }

    static void a(String str, String str2) {
        File[] listFiles;
        File[] listFiles2;
        File file = new File(str);
        if (file.exists() && (listFiles2 = file.listFiles(new com.ss.android.c.b())) != null) {
            for (File file2 : listFiles2) {
                file2.delete();
            }
        }
        File file3 = new File(str2);
        if (!file3.exists() || (listFiles = file3.listFiles(new com.ss.android.c.c())) == null) {
            return;
        }
        for (File file4 : listFiles) {
            file4.delete();
        }
    }

    public static void b(com.ss.android.c.e eVar) {
        f8275e.add(eVar);
    }

    public static void c() {
        Alog alog;
        ExecutorService executorService = h;
        if (executorService != null) {
            executorService.execute(new h());
        } else {
            Handler handler = j;
            if (handler != null) {
                handler.sendEmptyMessage(2);
            }
        }
        com.bytedance.android.alog.c.a();
        Alog alog2 = f8276f;
        if (alog2 != null) {
            alog2.h();
        }
        Iterator<WeakReference<Alog>> it2 = f8277g.iterator();
        while (it2.hasNext()) {
            WeakReference<Alog> next = it2.next();
            if (next != null && (alog = next.get()) != null) {
                alog.h();
            }
        }
    }

    public static void d(int i2) {
        a = i2;
        int i3 = i2 - 2;
        com.bytedance.android.alog.c.f(i3);
        Alog alog = f8276f;
        if (alog != null) {
            alog.n(i3);
        }
    }

    public static boolean e(int i2, String str) {
        return i2 >= a;
    }

    public static j f(String str, com.ss.android.c.d dVar) {
        if (!f8274d) {
            try {
                Alog.m(new com.ss.android.c.f());
            } catch (Throwable unused) {
                return null;
            }
        }
        Alog.a aVar = new Alog.a(dVar.e());
        aVar.g(str);
        aVar.h(dVar.f() - 2);
        aVar.q(f8273c);
        com.ss.android.c.d dVar2 = b;
        aVar.i(dVar2 != null ? dVar2.g() : dVar.g());
        aVar.k(dVar.j());
        aVar.l(dVar.i());
        aVar.j(dVar.h());
        com.ss.android.c.d dVar3 = b;
        aVar.c(dVar3 != null ? dVar3.c() : dVar.c());
        aVar.d(65536);
        aVar.e(ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
        aVar.m(Alog.Mode.SAFE);
        aVar.r(Alog.TimeFormat.RAW);
        aVar.n(Alog.PrefixFormat.LEGACY);
        aVar.f(dVar.m() ? Alog.Compress.ZSTD : Alog.Compress.NONE);
        aVar.p(dVar.n() ? Alog.SymCrypt.TEA_16 : Alog.SymCrypt.NONE);
        aVar.b(dVar.n() ? Alog.AsymCrypt.EC_SECP256K1 : Alog.AsymCrypt.NONE);
        aVar.o(dVar.k());
        Alog a2 = aVar.a();
        if (a2 == null) {
            return null;
        }
        f8277g.add(new WeakReference<>(a2));
        return new j(a2);
    }

    public static void g(String str, String str2) {
        if (e(3, str)) {
            com.ss.android.c.d dVar = b;
            if (dVar != null && dVar.b() && h != null) {
                q(3, str, str2);
                return;
            }
            com.ss.android.c.d dVar2 = b;
            if (dVar2 != null && dVar2.b() && j != null) {
                o(3, str, str2);
                return;
            }
            boolean X = r.X();
            if (X && h != null) {
                q(3, str, str2);
                return;
            }
            if (X && j != null) {
                o(3, str, str2);
                return;
            }
            Alog alog = f8276f;
            if (alog == null || !X) {
                com.bytedance.android.alog.c.i(1, str, str2);
            } else {
                alog.q(1, str, str2);
            }
        }
    }

    public static void h(String str, String str2) {
        if (e(6, str)) {
            com.ss.android.c.d dVar = b;
            if (dVar != null && dVar.b() && h != null) {
                q(6, str, str2);
                return;
            }
            com.ss.android.c.d dVar2 = b;
            if (dVar2 != null && dVar2.b() && j != null) {
                o(6, str, str2);
                return;
            }
            boolean X = r.X();
            if (X && h != null) {
                q(6, str, str2);
                return;
            }
            if (X && j != null) {
                o(6, str, str2);
                return;
            }
            Alog alog = f8276f;
            if (alog == null || !X) {
                com.bytedance.android.alog.c.i(4, str, str2);
            } else {
                alog.q(4, str, str2);
            }
        }
    }

    public static void i(String str, String str2, Throwable th) {
        if (e(6, str)) {
            com.ss.android.c.d dVar = b;
            if (dVar != null && dVar.b() && h != null) {
                r(6, str, str2, th, null, null);
                return;
            }
            com.ss.android.c.d dVar2 = b;
            if (dVar2 != null && dVar2.b() && j != null) {
                p(6, str, str2, th, null, null);
                return;
            }
            boolean X = r.X();
            if (X && h != null) {
                r(6, str, str2, th, null, null);
                return;
            }
            if (X && j != null) {
                p(6, str, str2, th, null, null);
                return;
            }
            StringBuilder S = e.a.a.a.a.S(str2, "\n");
            S.append(com.ss.android.agilelogger.utils.a.c(th));
            String sb = S.toString();
            Alog alog = f8276f;
            if (alog == null || !X) {
                com.bytedance.android.alog.c.i(4, str, sb);
            } else {
                alog.q(4, str, sb);
            }
        }
    }

    public static void j(String str, Throwable th) {
        if (e(6, str)) {
            com.ss.android.c.d dVar = b;
            if (dVar != null && dVar.b() && h != null) {
                r(6, str, null, th, null, null);
                return;
            }
            com.ss.android.c.d dVar2 = b;
            if (dVar2 != null && dVar2.b() && j != null) {
                p(6, str, null, th, null, null);
                return;
            }
            boolean X = r.X();
            if (X && h != null) {
                r(6, str, null, th, null, null);
                return;
            }
            if (X && j != null) {
                p(6, str, null, th, null, null);
                return;
            }
            String c2 = com.ss.android.agilelogger.utils.a.c(th);
            Alog alog = f8276f;
            if (alog == null || !X) {
                com.bytedance.android.alog.c.i(4, str, c2);
            } else {
                alog.q(4, str, c2);
            }
        }
    }

    public static List<com.ss.android.c.e> k() {
        return f8275e;
    }

    public static void l(String str, String str2) {
        if (e(4, str)) {
            com.ss.android.c.d dVar = b;
            if (dVar != null && dVar.b() && h != null) {
                q(4, str, str2);
                return;
            }
            com.ss.android.c.d dVar2 = b;
            if (dVar2 != null && dVar2.b() && j != null) {
                o(4, str, str2);
                return;
            }
            boolean X = r.X();
            if (X && h != null) {
                q(4, str, str2);
                return;
            }
            if (X && j != null) {
                o(4, str, str2);
                return;
            }
            Alog alog = f8276f;
            if (alog == null || !X) {
                com.bytedance.android.alog.c.i(2, str, str2);
            } else {
                alog.q(2, str, str2);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x0078, code lost:
    
        if (r3 != null) goto L118;
     */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0073 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m(com.ss.android.c.d r14) {
        /*
            Method dump skipped, instructions count: 627
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.c.a.m(com.ss.android.c.d):boolean");
    }

    public static boolean n() {
        return f8274d;
    }

    private static void o(int i2, String str, String str2) {
        p(i2, str, str2, null, null, null);
    }

    private static void p(int i2, String str, String str2, Throwable th, FormatUtils.TYPE type, Object obj) {
        i a2 = i.a();
        a2.a = i2;
        a2.b = str;
        a2.f8283c = str2;
        a2.f8284d = th;
        a2.f8285e = null;
        a2.f8286f = null;
        a2.f8287g = m.get().longValue();
        a2.h = System.currentTimeMillis();
        Message obtain = Message.obtain();
        obtain.what = 1;
        obtain.obj = a2;
        j.sendMessage(obtain);
    }

    private static void q(int i2, String str, String str2) {
        r(i2, str, str2, null, null, null);
    }

    private static void r(int i2, String str, String str2, Throwable th, FormatUtils.TYPE type, Object obj) {
        h.execute(new b(i2, null, th, str2, null, str, m.get().longValue(), System.currentTimeMillis()));
    }

    public static void s(boolean z) {
        f8273c = z;
        com.bytedance.android.alog.c.g(f8273c);
        Alog alog = f8276f;
        if (alog != null) {
            alog.o(f8273c);
        }
    }

    public static void t() {
        ExecutorService executorService = h;
        if (executorService != null) {
            executorService.execute(new RunnableC0371a());
        }
        Handler handler = j;
        if (handler != null) {
            handler.sendEmptyMessage(2);
        }
        com.bytedance.android.alog.c.h();
        Alog alog = f8276f;
        if (alog != null) {
            alog.p();
        }
        Iterator<WeakReference<Alog>> it2 = f8277g.iterator();
        while (it2.hasNext()) {
            Alog alog2 = it2.next().get();
            if (alog2 != null) {
                alog2.p();
            }
        }
    }

    public static void u(String str, String str2) {
        if (e(5, str)) {
            com.ss.android.c.d dVar = b;
            if (dVar != null && dVar.b() && h != null) {
                q(5, str, str2);
                return;
            }
            com.ss.android.c.d dVar2 = b;
            if (dVar2 != null && dVar2.b() && j != null) {
                o(5, str, str2);
                return;
            }
            boolean X = r.X();
            if (X && h != null) {
                q(5, str, str2);
                return;
            }
            if (X && j != null) {
                o(5, str, str2);
                return;
            }
            Alog alog = f8276f;
            if (alog == null || !X) {
                com.bytedance.android.alog.c.i(3, str, str2);
            } else {
                alog.q(3, str, str2);
            }
        }
    }
}
