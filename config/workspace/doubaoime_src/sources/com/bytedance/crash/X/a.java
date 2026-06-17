package com.bytedance.crash.X;

import android.content.Context;
import android.util.Log;
import com.bytedance.crash.C0652g;
import com.bytedance.crash.monitor.l;
import com.bytedance.crash.npth_repair.NpthRepair;
import com.bytedance.crash.npth_repair.monitor.SignalMonitor;
import com.bytedance.crash.npth_repair.nativeCrash.ArtDumpNativeStackFixer;
import com.bytedance.crash.npth_repair.nativeCrash.DvmSuspendTimeOpt;
import com.bytedance.crash.npth_repair.nativeCrash.MTKBufferOpt;
import com.bytedance.crash.npth_repair.nativeCrash.ScudoVmaLeakFixer;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class a {

    /* renamed from: g, reason: collision with root package name */
    private static boolean f4523g = false;
    private static boolean h = true;
    private static com.bytedance.crash.X.b i;
    private static final f j = new C0205a();
    private static final f k = new b();
    private static final f l = new c();
    private boolean a = false;
    private int b = -1;

    /* renamed from: c, reason: collision with root package name */
    private ArrayList<f> f4524c;

    /* renamed from: d, reason: collision with root package name */
    private int f4525d;

    /* renamed from: e, reason: collision with root package name */
    private int f4526e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f4527f;

    /* renamed from: com.bytedance.crash.X.a$a, reason: collision with other inner class name */
    static class C0205a implements f {
        C0205a() {
        }

        @Override // com.bytedance.crash.X.a.f
        public int a(int i) {
            if (a.f4523g || (a.h && a.c(i, 0))) {
                return ArtDumpNativeStackFixer.a();
            }
            return -1;
        }
    }

    static class b implements f {
        b() {
        }

        @Override // com.bytedance.crash.X.a.f
        public int a(int i) {
            if (a.c(i, 1)) {
                return DvmSuspendTimeOpt.a();
            }
            return -1;
        }
    }

    static class c implements f {
        c() {
        }

        @Override // com.bytedance.crash.X.a.f
        public int a(int i) {
            if (a.c(i, 2)) {
                return SignalMonitor.b().c(a.i.c());
            }
            return -1;
        }
    }

    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            for (int i = 0; i < 3; i++) {
                try {
                    if (i >= a.this.f4524c.size()) {
                        return;
                    }
                    Log.d("NpthRepairAdapter", "fix ret: " + ((f) a.this.f4524c.get(i)).a(a.this.f4525d));
                } catch (Throwable unused) {
                    return;
                }
            }
        }
    }

    private static final class e {
        static final a a = new a(null);
    }

    interface f {
        int a(int i);
    }

    private a() {
    }

    static boolean c(int i2, int i3) {
        return (i2 & (1 << i3)) != 0;
    }

    public static synchronized int g(int i2, String str) {
        int a;
        synchronized (a.class) {
            boolean z = true;
            if ((e.a.f4525d & (1 << i2)) == 0) {
                z = false;
            }
            a = !z ? -1 : i2 == 2 ? SignalMonitor.b().a(str) : -2;
        }
        return a;
    }

    public static int h() {
        int i2 = i(false);
        if (i2 == 0) {
            i2 = ScudoVmaLeakFixer.a();
            try {
                com.bytedance.crash.monitor.a e2 = l.e();
                if (e2 != null) {
                    e2.a("fix_scudo", String.valueOf(i2));
                }
            } catch (Throwable unused) {
            }
        }
        return i2;
    }

    private static int i(boolean z) {
        Context g2 = C0652g.g();
        if (g2 != null) {
            return NpthRepair.a(g2, z);
        }
        return -7;
    }

    public static void j(boolean z) {
        f4523g = z;
        h = false;
    }

    public static synchronized int k(int i2) {
        synchronized (a.class) {
            int i3 = i(false);
            if (i3 != 0) {
                return i3;
            }
            return MTKBufferOpt.a(i2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0048, code lost:
    
        if (r3.b == 0) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void l() {
        /*
            r3 = this;
            com.bytedance.crash.X.b r0 = com.bytedance.crash.X.a.i
            int r0 = r0.d()
            r3.f4525d = r0
            com.bytedance.crash.X.b r0 = com.bytedance.crash.X.a.i
            int r0 = r0.b()
            r3.f4526e = r0
            com.bytedance.crash.X.b r0 = com.bytedance.crash.X.a.i
            boolean r0 = r0.a()
            r3.f4527f = r0
            java.lang.String r0 = "type: "
            java.lang.StringBuilder r0 = e.a.a.a.a.M(r0)
            int r1 = r3.f4525d
            r0.append(r1)
            java.lang.String r1 = " debug: "
            r0.append(r1)
            boolean r1 = r3.f4527f
            r0.append(r1)
            java.lang.String r1 = " delayedTime: "
            r0.append(r1)
            int r1 = r3.f4526e
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "NpthRepairAdapter"
            com.bytedance.android.input.k.b.a.X(r1, r0)
            boolean r0 = r3.a
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L4b
            int r0 = r3.b
            if (r0 != 0) goto L73
            goto L72
        L4b:
            r3.a = r2
            boolean r0 = r3.f4527f
            int r0 = i(r0)
            r3.b = r0
            if (r0 == 0) goto L58
            goto L73
        L58:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.f4524c = r0
            com.bytedance.crash.X.a$f r1 = com.bytedance.crash.X.a.j
            r0.add(r1)
            java.util.ArrayList<com.bytedance.crash.X.a$f> r0 = r3.f4524c
            com.bytedance.crash.X.a$f r1 = com.bytedance.crash.X.a.k
            r0.add(r1)
            java.util.ArrayList<com.bytedance.crash.X.a$f> r0 = r3.f4524c
            com.bytedance.crash.X.a$f r1 = com.bytedance.crash.X.a.l
            r0.add(r1)
        L72:
            r1 = r2
        L73:
            if (r1 == 0) goto L80
            com.bytedance.crash.X.a$d r0 = new com.bytedance.crash.X.a$d
            r0.<init>()
            int r1 = r3.f4526e
            long r1 = (long) r1
            com.bytedance.crash.runtime.b.f(r0, r1)
        L80:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.X.a.l():void");
    }

    public static synchronized void m(com.bytedance.crash.X.b bVar) {
        synchronized (a.class) {
            i = bVar;
            e.a.l();
        }
    }

    a(C0205a c0205a) {
    }
}
