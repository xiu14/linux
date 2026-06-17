package com.bytedance.apm.t.l;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Objects;

/* loaded from: classes.dex */
public class e {
    private static e a = new e();
    private static volatile int b = Integer.MAX_VALUE;

    /* renamed from: c, reason: collision with root package name */
    private static volatile boolean f3566c = false;

    /* renamed from: d, reason: collision with root package name */
    private static final Object f3567d;

    /* renamed from: e, reason: collision with root package name */
    private static long[] f3568e = null;

    /* renamed from: f, reason: collision with root package name */
    private static int f3569f = 0;

    /* renamed from: g, reason: collision with root package name */
    private static boolean f3570g = false;
    private static volatile long h;
    private static volatile long i;
    private static Thread j;
    private static volatile Runnable k;
    private static HandlerThread l;
    private static Handler m;
    private static Object n;
    private static boolean o;
    private static Runnable p;
    private static com.bytedance.monitor.collector.a q;
    private static Runnable r;
    private static C0129e s;
    private static C0129e t;

    static class a extends com.bytedance.monitor.collector.a {
        a() {
        }

        @Override // com.bytedance.monitor.collector.a
        public void a(String str, Message message) {
            this.a = false;
            e.l();
        }

        @Override // com.bytedance.monitor.collector.a
        public void b(String str) {
            this.a = true;
            e.k();
        }

        @Override // com.bytedance.monitor.collector.a
        public boolean c() {
            if (e.k != null) {
                e.k.run();
                e.b(null);
            }
            return e.b >= 1;
        }
    }

    static class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            while (true) {
                try {
                    if (e.o || e.b <= -1) {
                        synchronized (e.n) {
                            e.n.wait();
                        }
                    } else {
                        long unused = e.h = SystemClock.uptimeMillis() - e.i;
                        e.h &= 8796093022207L;
                        SystemClock.sleep(5L);
                    }
                } catch (InterruptedException unused2) {
                    return;
                }
            }
        }
    }

    static class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            e.r();
        }
    }

    static class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (e.f3567d) {
                if (e.b == Integer.MAX_VALUE || e.b == 1) {
                    int unused = e.b = -2;
                    boolean unused2 = e.f3566c = true;
                }
            }
        }
    }

    /* renamed from: com.bytedance.apm.t.l.e$e, reason: collision with other inner class name */
    public static final class C0129e {
        public int a;
        int b;

        /* renamed from: c, reason: collision with root package name */
        private C0129e f3571c;

        /* renamed from: d, reason: collision with root package name */
        private C0129e f3572d;

        /* renamed from: e, reason: collision with root package name */
        public String f3573e;

        /* renamed from: f, reason: collision with root package name */
        private long f3574f;

        public C0129e(int i) {
            this.a = i;
        }

        public String toString() {
            StringBuilder M = e.a.a.a.a.M("index:");
            M.append(this.a);
            M.append(",\tisValid:");
            M.append(true);
            M.append(" source:");
            M.append(this.f3573e);
            return M.toString();
        }
    }

    static {
        Object obj = new Object();
        f3567d = obj;
        f3568e = new long[600000];
        h = SystemClock.uptimeMillis();
        i = h;
        j = Looper.getMainLooper().getThread();
        k = null;
        HandlerThread handlerThread = new HandlerThread("trace_time_update_thread");
        handlerThread.start();
        l = handlerThread;
        m = new Handler(l.getLooper());
        n = new Object();
        o = false;
        p = null;
        q = new a();
        r = new b();
        if (b == Integer.MAX_VALUE) {
            synchronized (obj) {
                if (b == Integer.MAX_VALUE) {
                    F();
                    b = 1;
                }
            }
        }
        z(1048574, 0L);
        B("EvilMethodTracer#message_0", com.bytedance.monitor.collector.a.b);
        m.postDelayed(new c(), 15000L);
    }

    public static C0129e B(String str, long j2) {
        if (s == null) {
            C0129e c0129e = new C0129e(f3569f);
            s = c0129e;
            if (j2 <= 0) {
                j2 = SystemClock.uptimeMillis();
            }
            c0129e.f3574f = j2;
            C0129e c0129e2 = s;
            c0129e2.f3573e = str;
            t = c0129e2;
            return c0129e2;
        }
        C0129e c0129e3 = new C0129e(f3569f);
        if (j2 <= 0) {
            j2 = SystemClock.uptimeMillis();
        }
        c0129e3.f3574f = j2;
        c0129e3.f3573e = str;
        c0129e3.f3571c = s;
        C0129e c0129e4 = s;
        c0129e4.b = c0129e3.a - 1;
        c0129e4.f3572d = c0129e3;
        s = c0129e3;
        return c0129e3;
    }

    public static void C(int i2, long j2) {
        if (!f3566c && i2 < 1048575 && Thread.currentThread() == j) {
            if (j2 != 0) {
                h = j2 - i;
                h &= 8796093022207L;
            }
            long j3 = (i2 << 43) | 0 | h;
            long[] jArr = f3568e;
            int i3 = f3569f;
            jArr[i3] = j3;
            int i4 = i3 + 1;
            f3569f = i4;
            if (i4 == 600000) {
                f3569f = 0;
            }
            C0129e c0129e = t;
            if (c0129e == null || c0129e.a != f3569f) {
                return;
            }
            C0129e c0129e2 = c0129e.f3572d;
            t = c0129e2;
            if (c0129e2 != null) {
                c0129e2.f3571c = null;
            } else {
                s = null;
            }
        }
    }

    private static void F() {
        h = SystemClock.uptimeMillis() - i;
        m.removeCallbacksAndMessages(null);
        m.postDelayed(r, 5L);
        Handler handler = m;
        d dVar = new d();
        p = dVar;
        handler.postDelayed(dVar, 15000L);
        com.bytedance.monitor.collector.g.i(q);
    }

    static /* synthetic */ Runnable b(Runnable runnable) {
        k = null;
        return null;
    }

    static /* synthetic */ long[] h(long[] jArr) {
        f3568e = null;
        return null;
    }

    static void k() {
        h = com.bytedance.monitor.collector.a.b - i;
        o = false;
        synchronized (n) {
            n.notify();
        }
    }

    static void l() {
        o = true;
    }

    static void r() {
        synchronized (f3567d) {
            if (b == Integer.MAX_VALUE || b == -4) {
                b = -3;
                f3566c = true;
                k = new f();
            }
        }
    }

    public static long w() {
        return i;
    }

    public static e y() {
        return a;
    }

    public static void z(int i2, long j2) {
        if (!f3566c && i2 < 1048575 && Thread.currentThread() == j && !f3570g) {
            f3570g = true;
            if (j2 != 0) {
                h = j2 - i;
                h &= 8796093022207L;
            }
            long j3 = (i2 << 43) | Long.MIN_VALUE | h;
            long[] jArr = f3568e;
            int i3 = f3569f;
            jArr[i3] = j3;
            int i4 = i3 + 1;
            f3569f = i4;
            if (i4 == 600000) {
                f3569f = 0;
            }
            f3570g = false;
            C0129e c0129e = t;
            if (c0129e != null && c0129e.a == f3569f) {
                C0129e c0129e2 = c0129e.f3572d;
                t = c0129e2;
                if (c0129e2 != null) {
                    c0129e2.f3571c = null;
                } else {
                    s = null;
                }
            }
        }
    }

    public boolean A() {
        return b >= 2;
    }

    public void D() {
        synchronized (f3567d) {
            if (b < 2 && b >= -2) {
                m.removeCallbacks(p);
                if (f3568e == null) {
                    throw new RuntimeException("MethodCollector sBuffer == null");
                }
                b = 2;
                f3566c = false;
            }
        }
    }

    public void E() {
        synchronized (f3567d) {
            if (b == 2) {
                b = -1;
                f3566c = true;
            }
        }
    }

    public long[] s() {
        C0129e c0129e;
        try {
            C0129e c0129e2 = s;
            if (c0129e2 != null && (c0129e = t) != null && c0129e2 != c0129e) {
                int i2 = c0129e2.b;
                if (i2 == 0) {
                    i2 = f3569f - 1;
                }
                return t(c0129e.a, i2);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public long[] t(int i2, int i3) {
        long[] jArr = new long[0];
        int max = Math.max(0, i2);
        int max2 = Math.max(0, i3);
        if (max2 > max) {
            int i4 = (max2 - max) + 1;
            long[] jArr2 = new long[i4];
            System.arraycopy(f3568e, max, jArr2, 0, i4);
            return jArr2;
        }
        if (max2 >= max) {
            return jArr;
        }
        int i5 = max2 + 1;
        long[] jArr3 = f3568e;
        long[] jArr4 = new long[(jArr3.length - max) + i5];
        System.arraycopy(jArr3, max, jArr4, 0, jArr3.length - max);
        long[] jArr5 = f3568e;
        System.arraycopy(jArr5, 0, jArr4, jArr5.length - max, i5);
        return jArr4;
    }

    public long[] u(C0129e c0129e) {
        int i2 = f3569f - 1;
        if (b == -3) {
            return null;
        }
        long[] jArr = new long[0];
        try {
            Objects.requireNonNull(c0129e);
            return t(c0129e.a - 1, i2);
        } catch (OutOfMemoryError unused) {
            return jArr;
        }
    }

    public String v(long[] jArr, long j2) {
        if (jArr == null) {
            return "";
        }
        LinkedList linkedList = new LinkedList();
        e.b.j.a.a.f(jArr, linkedList, true, j2);
        ListIterator listIterator = linkedList.listIterator(linkedList.size());
        while (listIterator.hasPrevious()) {
            g gVar = (g) listIterator.previous();
            if (gVar != null && gVar.b < 1) {
                listIterator.remove();
            }
        }
        StringBuilder sb = new StringBuilder();
        e.b.j.a.a.e(linkedList, sb);
        return sb.toString();
    }

    public String x(long j2, long j3) {
        long[] jArr;
        C0129e c0129e;
        long uptimeMillis = SystemClock.uptimeMillis();
        C0129e c0129e2 = s;
        if (c0129e2 == null || (c0129e = t) == null) {
            jArr = null;
        } else {
            while (c0129e2 != c0129e) {
                if (c0129e2.f3571c.f3574f <= j3) {
                    if (c0129e.f3572d.f3574f >= j2) {
                        break;
                    }
                    c0129e = c0129e.f3572d;
                } else {
                    c0129e2 = c0129e2.f3571c;
                }
            }
            int i2 = c0129e2.b;
            if (i2 == 0) {
                i2 = f3569f - 1;
            }
            jArr = t(c0129e.a, i2);
        }
        return v(jArr, uptimeMillis);
    }
}
