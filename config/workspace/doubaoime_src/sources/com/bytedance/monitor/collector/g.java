package com.bytedance.monitor.collector;

import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Printer;
import com.bytedance.common.utility.Logger;
import java.lang.reflect.Field;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class g {
    private static volatile boolean a;
    private static Printer b;

    /* renamed from: c, reason: collision with root package name */
    private static com.bytedance.apm.t.h f5448c;

    /* renamed from: e, reason: collision with root package name */
    private static com.bytedance.monitor.collector.a f5450e;

    /* renamed from: f, reason: collision with root package name */
    private static volatile c f5451f;
    private static boolean j;
    private static boolean k;
    private static Printer l;

    /* renamed from: d, reason: collision with root package name */
    private static final CopyOnWriteArrayList<com.bytedance.monitor.collector.a> f5449d = new CopyOnWriteArrayList<>();

    /* renamed from: g, reason: collision with root package name */
    private static volatile boolean f5452g = false;
    private static long h = 0;
    private static int i = 0;

    static class a implements Printer {
        a() {
        }

        @Override // android.util.Printer
        public void println(String str) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            if (str.charAt(0) == '>') {
                g.d(true, str, null);
            } else if (str.charAt(0) == '<') {
                g.d(false, str, null);
            }
        }
    }

    static class b implements com.bytedance.apm.t.h {
        b() {
        }

        @Override // com.bytedance.apm.t.h
        public void a(String str) {
            g.d(true, str, null);
        }

        @Override // com.bytedance.apm.t.h
        public void b(String str, Message message) {
            g.d(false, str, message);
        }
    }

    public interface c {
        void a(long j);
    }

    public static void a() {
        if (!a || j) {
            if (!j || k) {
                return;
            }
            b();
            return;
        }
        if (com.bytedance.apm.D.c.d("block_monitor")) {
            return;
        }
        b();
        com.bytedance.common.utility.d.d(b);
        j = true;
    }

    public static void b() {
        Printer printer;
        if (a && !k && m.a) {
            List<Printer> b2 = com.bytedance.common.utility.d.b();
            if (b2 != null && b2.size() == 1 && b2.get(0) == b) {
                try {
                    Field declaredField = Class.forName("android.os.Looper").getDeclaredField("mLogging");
                    declaredField.setAccessible(true);
                    printer = (Printer) declaredField.get(Looper.getMainLooper());
                } catch (Exception unused) {
                    printer = null;
                }
                l = printer;
                if (printer != null) {
                    Looper.getMainLooper().setMessageLogging(null);
                    k = true;
                }
            }
            if (com.bytedance.apm.g.B()) {
                Logger.i("LooperMonitor", "enable Looper Observer block.");
            }
        }
    }

    public static void c() {
        if (a && !j && com.bytedance.apm.t.l.d.i().p) {
            int j2 = com.bytedance.apm.t.l.d.i().j();
            if (f5449d.isEmpty() && j2 == 0) {
                a();
            }
        }
    }

    public static void d(boolean z, String str, Message message) {
        com.bytedance.monitor.collector.a aVar;
        com.bytedance.monitor.collector.a aVar2;
        long nanoTime = System.nanoTime();
        com.bytedance.monitor.collector.a.b = nanoTime / 1000000;
        com.bytedance.monitor.collector.a.f5422c = SystemClock.currentThreadTimeMillis();
        if (z && (aVar2 = f5450e) != null && aVar2.c()) {
            f5450e.b(str);
        }
        try {
            CopyOnWriteArrayList<com.bytedance.monitor.collector.a> copyOnWriteArrayList = f5449d;
            for (int i2 = 0; i2 < copyOnWriteArrayList.size(); i2++) {
                com.bytedance.monitor.collector.a aVar3 = copyOnWriteArrayList.get(i2);
                if (aVar3 == null || !aVar3.c()) {
                    if (!z && aVar3.a) {
                        aVar3.a("", null);
                    }
                } else if (z) {
                    if (!aVar3.a) {
                        aVar3.b(str);
                    }
                } else if (aVar3.a) {
                    aVar3.a(str, message);
                }
            }
        } catch (Exception unused) {
        }
        if (!z && (aVar = f5450e) != null && aVar.c()) {
            f5450e.a("", null);
        }
        if (f5452g) {
            h = (System.nanoTime() - nanoTime) + h;
            int i3 = i;
            i = i3 + 1;
            if (i3 >= 1000) {
                if (f5451f != null) {
                    f5451f.a(h);
                }
                i = 0;
                h = 0L;
                f5452g = false;
            }
        }
    }

    public static void e(boolean z) {
        f5452g = z;
    }

    public static int f() {
        return f5449d.size();
    }

    public static void g() {
        if (a) {
            return;
        }
        a = true;
        b = new a();
        f5448c = new b();
        h();
    }

    public static void h() {
        com.bytedance.common.utility.d.c();
        com.bytedance.common.utility.d.a(b);
    }

    public static void i(com.bytedance.monitor.collector.a aVar) {
        CopyOnWriteArrayList<com.bytedance.monitor.collector.a> copyOnWriteArrayList = f5449d;
        synchronized (copyOnWriteArrayList) {
            if (aVar != null) {
                if (!copyOnWriteArrayList.contains(aVar)) {
                    copyOnWriteArrayList.add(aVar);
                    if (com.bytedance.apm.t.l.d.i().p) {
                        l();
                    }
                }
            }
        }
    }

    public static void j(com.bytedance.monitor.collector.a aVar) {
        f5450e = aVar;
    }

    public static void k(c cVar) {
        f5451f = cVar;
    }

    public static void l() {
        if (a && j) {
            if (a && k && m.a) {
                if (l != null) {
                    Looper.getMainLooper().setMessageLogging(l);
                }
                if (com.bytedance.apm.g.B()) {
                    Logger.i("LooperMonitor", "enable Looper Observer unblock.");
                }
                k = false;
            }
            h();
            j = false;
        }
    }

    public static void m(com.bytedance.monitor.collector.a aVar) {
        if (aVar == null) {
            return;
        }
        CopyOnWriteArrayList<com.bytedance.monitor.collector.a> copyOnWriteArrayList = f5449d;
        synchronized (copyOnWriteArrayList) {
            copyOnWriteArrayList.remove(aVar);
            if (com.bytedance.apm.t.l.d.i().p && copyOnWriteArrayList.isEmpty() && com.bytedance.apm.t.l.d.i().j() == 0) {
                a();
            }
        }
    }
}
