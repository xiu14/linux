package com.xiaomi.push.service;

import android.os.SystemClock;
import java.util.Objects;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes2.dex */
public class s {
    private static long a;
    private static long b;

    /* renamed from: c, reason: collision with root package name */
    private static long f9345c;

    /* renamed from: a, reason: collision with other field name */
    private final a f1143a;

    /* renamed from: a, reason: collision with other field name */
    private final c f1144a;

    private static final class a {
        private final c a;

        a(c cVar) {
            this.a = cVar;
        }

        protected void finalize() {
            try {
                synchronized (this.a) {
                    this.a.f9346c = true;
                    this.a.notify();
                }
            } finally {
                super.finalize();
            }
        }
    }

    public static abstract class b implements Runnable {
        protected int a;

        /* renamed from: a, reason: collision with other field name */
        protected String f1145a;

        public b(int i) {
            this.a = i;
        }

        public void a(String str) {
            this.f1145a = str;
        }
    }

    private static final class c extends Thread {

        /* renamed from: b, reason: collision with other field name */
        private boolean f1148b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f9346c;
        private volatile long a = 0;

        /* renamed from: a, reason: collision with other field name */
        private volatile boolean f1147a = false;
        private long b = 50;

        /* renamed from: a, reason: collision with other field name */
        private a f1146a = new a();

        private static final class a {
            private int a;

            /* renamed from: a, reason: collision with other field name */
            private d[] f1149a;
            private int b;

            /* renamed from: c, reason: collision with root package name */
            private int f9347c;

            private a() {
                this.a = 256;
                this.f1149a = new d[256];
                this.b = 0;
                this.f9347c = 0;
            }

            private void c() {
                int i = this.b - 1;
                int i2 = (i - 1) / 2;
                while (true) {
                    d[] dVarArr = this.f1149a;
                    if (dVarArr[i].f1150a >= dVarArr[i2].f1150a) {
                        return;
                    }
                    d dVar = dVarArr[i];
                    dVarArr[i] = dVarArr[i2];
                    dVarArr[i2] = dVar;
                    int i3 = i2;
                    i2 = (i2 - 1) / 2;
                    i = i3;
                }
            }

            public void b(int i) {
                int i2;
                if (i < 0 || i >= (i2 = this.b)) {
                    return;
                }
                d[] dVarArr = this.f1149a;
                int i3 = i2 - 1;
                this.b = i3;
                dVarArr[i] = dVarArr[i3];
                dVarArr[i3] = null;
                c(i);
            }

            public d a() {
                return this.f1149a[0];
            }

            /* renamed from: a, reason: collision with other method in class */
            public boolean m828a() {
                return this.b == 0;
            }

            public void b() {
                int i = 0;
                while (i < this.b) {
                    if (this.f1149a[i].f1153a) {
                        this.f9347c++;
                        b(i);
                        i--;
                    }
                    i++;
                }
            }

            /* renamed from: a, reason: collision with other method in class */
            public void m827a(d dVar) {
                d[] dVarArr = this.f1149a;
                int length = dVarArr.length;
                int i = this.b;
                if (length == i) {
                    d[] dVarArr2 = new d[i * 2];
                    System.arraycopy(dVarArr, 0, dVarArr2, 0, i);
                    this.f1149a = dVarArr2;
                }
                d[] dVarArr3 = this.f1149a;
                int i2 = this.b;
                this.b = i2 + 1;
                dVarArr3[i2] = dVar;
                c();
            }

            private void c(int i) {
                int i2 = (i * 2) + 1;
                while (true) {
                    int i3 = this.b;
                    if (i2 >= i3 || i3 <= 0) {
                        return;
                    }
                    int i4 = i2 + 1;
                    if (i4 < i3) {
                        d[] dVarArr = this.f1149a;
                        if (dVarArr[i4].f1150a < dVarArr[i2].f1150a) {
                            i2 = i4;
                        }
                    }
                    d[] dVarArr2 = this.f1149a;
                    if (dVarArr2[i].f1150a < dVarArr2[i2].f1150a) {
                        return;
                    }
                    d dVar = dVarArr2[i];
                    dVarArr2[i] = dVarArr2[i2];
                    dVarArr2[i2] = dVar;
                    int i5 = i2;
                    i2 = (i2 * 2) + 1;
                    i = i5;
                }
            }

            /* renamed from: a, reason: collision with other method in class */
            public boolean m829a(int i) {
                for (int i2 = 0; i2 < this.b; i2++) {
                    if (this.f1149a[i2].a == i) {
                        return true;
                    }
                }
                return false;
            }

            public void a(int i) {
                for (int i2 = 0; i2 < this.b; i2++) {
                    d[] dVarArr = this.f1149a;
                    if (dVarArr[i2].a == i) {
                        dVarArr[i2].a();
                    }
                }
                b();
            }

            public void a(int i, b bVar) {
                for (int i2 = 0; i2 < this.b; i2++) {
                    d[] dVarArr = this.f1149a;
                    if (dVarArr[i2].f1151a == bVar) {
                        dVarArr[i2].a();
                    }
                }
                b();
            }

            /* renamed from: a, reason: collision with other method in class */
            public void m826a() {
                this.f1149a = new d[this.a];
                this.b = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public int a(d dVar) {
                int i = 0;
                while (true) {
                    d[] dVarArr = this.f1149a;
                    if (i >= dVarArr.length) {
                        return -1;
                    }
                    if (dVarArr[i] == dVar) {
                        return i;
                    }
                    i++;
                }
            }
        }

        c(String str, boolean z) {
            setName(str);
            setDaemon(z);
            start();
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x0092, code lost:
        
            r10.a = android.os.SystemClock.uptimeMillis();
            r10.f1147a = true;
            r2.f1151a.run();
            r10.f1147a = false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x00a3, code lost:
        
            r1 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x00a4, code lost:
        
            monitor-enter(r10);
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x00a5, code lost:
        
            r10.f1148b = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x00a8, code lost:
        
            throw r1;
         */
        @Override // java.lang.Thread, java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void run() {
            /*
                Method dump skipped, instructions count: 181
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.service.s.c.run():void");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(d dVar) {
            this.f1146a.m827a(dVar);
            notify();
        }

        public synchronized void a() {
            this.f1148b = true;
            this.f1146a.m826a();
            notify();
        }

        /* renamed from: a, reason: collision with other method in class */
        public boolean m824a() {
            return this.f1147a && SystemClock.uptimeMillis() - this.a > 600000;
        }
    }

    static {
        long elapsedRealtime = SystemClock.elapsedRealtime() > 0 ? SystemClock.elapsedRealtime() : 0L;
        a = elapsedRealtime;
        b = elapsedRealtime;
    }

    public s(String str, boolean z) {
        Objects.requireNonNull(str, "name == null");
        c cVar = new c(str, z);
        this.f1144a = cVar;
        this.f1143a = new a(cVar);
    }

    static synchronized long a() {
        long j;
        synchronized (s.class) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j2 = b;
            if (elapsedRealtime > j2) {
                a = (elapsedRealtime - j2) + a;
            }
            b = elapsedRealtime;
            j = a;
        }
        return j;
    }

    private static synchronized long b() {
        long j;
        synchronized (s.class) {
            j = f9345c;
            f9345c = 1 + j;
        }
        return j;
    }

    /* renamed from: b, reason: collision with other method in class */
    public void m822b() {
        synchronized (this.f1144a) {
            this.f1144a.f1146a.m826a();
        }
    }

    static class d {
        int a;

        /* renamed from: a, reason: collision with other field name */
        long f1150a;

        /* renamed from: a, reason: collision with other field name */
        b f1151a;

        /* renamed from: a, reason: collision with other field name */
        final Object f1152a = new Object();

        /* renamed from: a, reason: collision with other field name */
        boolean f1153a;
        private long b;

        d() {
        }

        void a(long j) {
            synchronized (this.f1152a) {
                this.b = j;
            }
        }

        public boolean a() {
            boolean z;
            synchronized (this.f1152a) {
                z = !this.f1153a && this.f1150a > 0;
                this.f1153a = true;
            }
            return z;
        }
    }

    public s(String str) {
        this(str, false);
    }

    public void b(b bVar) {
        try {
            Thread currentThread = Thread.currentThread();
            c cVar = this.f1144a;
            if (currentThread == cVar) {
                a(bVar);
                return;
            }
            synchronized (cVar) {
                d dVar = new d();
                dVar.a = bVar.a;
                dVar.f1151a = bVar;
                dVar.f1150a = -1L;
                this.f1144a.a(dVar);
            }
        } catch (Exception e2) {
            StringBuilder M = e.a.a.a.a.M("execute job now error: ");
            M.append(e2.getMessage());
            com.xiaomi.channel.commonutils.logger.c.d(M.toString());
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public s(boolean r4) {
        /*
            r3 = this;
            java.lang.String r0 = "Timer-"
            java.lang.StringBuilder r0 = e.a.a.a.a.M(r0)
            long r1 = b()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r3.<init>(r0, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.service.s.<init>(boolean):void");
    }

    /* renamed from: a, reason: collision with other method in class */
    public void m819a() {
        StringBuilder M = e.a.a.a.a.M("quit. finalizer:");
        M.append(this.f1143a);
        com.xiaomi.channel.commonutils.logger.c.m15a(M.toString());
        this.f1144a.a();
    }

    public s() {
        this(false);
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m821a(int i) {
        boolean m829a;
        synchronized (this.f1144a) {
            m829a = this.f1144a.f1146a.m829a(i);
        }
        return m829a;
    }

    public void a(int i) {
        synchronized (this.f1144a) {
            this.f1144a.f1146a.a(i);
        }
    }

    public void a(int i, b bVar) {
        synchronized (this.f1144a) {
            this.f1144a.f1146a.a(i, bVar);
        }
    }

    private void b(b bVar, long j) {
        synchronized (this.f1144a) {
            if (!this.f1144a.f1148b) {
                long a2 = j + a();
                if (a2 >= 0) {
                    d dVar = new d();
                    dVar.a = bVar.a;
                    dVar.f1151a = bVar;
                    dVar.f1150a = a2;
                    this.f1144a.a(dVar);
                    bk.m789a().a(this.f1144a.f1146a.f1149a, this.f1144a.f1146a.b);
                } else {
                    throw new IllegalArgumentException("Illegal delay to start the TimerTask: " + a2);
                }
            } else {
                throw new IllegalStateException("Timer was canceled");
            }
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m820a() {
        return this.f1144a.m824a();
    }

    public void a(b bVar) {
        if (com.xiaomi.channel.commonutils.logger.c.a() < 1 && Thread.currentThread() != this.f1144a) {
            com.xiaomi.channel.commonutils.logger.c.d("run job outside job job thread");
            throw new RejectedExecutionException("Run job outside job thread");
        }
        bVar.run();
    }

    public void a(b bVar, long j) {
        if (j >= 0) {
            b(bVar, j);
            return;
        }
        throw new IllegalArgumentException(e.a.a.a.a.n("delay < 0: ", j));
    }
}
