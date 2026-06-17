package org.chromium;

import android.os.Process;
import com.bytedance.frameworks.baselib.network.TTNetInitMetrics;
import com.prolificinteractive.materialcalendarview.r;
import com.ttnet.org.chromium.net.w;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class f extends w {
    private static volatile f b;
    private boolean a = false;

    class a implements Runnable {
        final /* synthetic */ long a;

        a(f fVar, long j) {
            this.a = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            JSONObject b = TTNetInitMetrics.j().b();
            JSONObject c2 = TTNetInitMetrics.j().c(this.a);
            d.U().w0(b.toString(), "ttnet_init");
            d.U().w0(c2.toString(), "ttnet_init_v2");
        }
    }

    private f() {
    }

    public static f k() {
        if (b == null) {
            synchronized (f.class) {
                if (b == null) {
                    b = new f();
                }
            }
        }
        return b;
    }

    @Override // com.ttnet.org.chromium.net.w
    public void a(String str) {
        if (this.a) {
            d.U().b0(str);
        }
    }

    @Override // com.ttnet.org.chromium.net.w
    public void b() {
        if (this.a) {
            d.U().c0();
        }
    }

    @Override // com.ttnet.org.chromium.net.w
    public void c(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16) {
        TTNetInitMetrics j17 = TTNetInitMetrics.j();
        boolean z = false;
        j17.f5008c = Process.getThreadPriority(0);
        j17.F = r.f8224c;
        j17.G = r.f8225d;
        j17.H = r.a;
        j17.I = r.b;
        j17.f5007J = r.f8226e;
        j17.L = r.f8227f;
        j17.K = System.nanoTime();
        j17.N = j;
        j17.O = j2;
        j17.P = j3;
        j17.M = j4;
        j17.Q = j5;
        j17.R = j6;
        j17.S = j7;
        j17.T = j8;
        j17.U = j9;
        j17.V = j10;
        j17.W = j11;
        j17.X = j12;
        j17.Y = j13;
        j17.Z = j14;
        j17.a0 = j15;
        j17.b0 = j16;
        long f2 = d.U().f();
        TTNetInitMetrics j18 = TTNetInitMetrics.j();
        if (j18.f5009d != 0 && j18.f5010e != 0 && j18.f5011f != 0 && j18.f5012g != 0 && j18.h != 0 && j18.i != 0 && j18.j != 0 && j18.k != 0 && j18.l != 0 && j18.n != 0 && j18.o != 0 && j18.p != 0 && j18.q != 0 && j18.r != 0 && j18.s != 0 && j18.t != 0 && j18.u != 0 && j18.v != 0 && j18.w != 0 && j18.x != 0 && j18.y != 0 && j18.z != 0 && j18.A != 0 && j18.B != 0 && j18.C != 0 && j18.D != 0 && j18.E != 0) {
            z = true;
        }
        if (!z) {
            com.bytedance.common.utility.h.a.d().schedule(new a(this, f2), 5L, TimeUnit.SECONDS);
            TTNetInitMetrics.m(true);
            return;
        }
        JSONObject b2 = TTNetInitMetrics.j().b();
        JSONObject c2 = TTNetInitMetrics.j().c(f2);
        TTNetInitMetrics.m(true);
        d.U().w0(b2.toString(), "ttnet_init");
        d.U().w0(c2.toString(), "ttnet_init_v2");
    }

    @Override // com.ttnet.org.chromium.net.w
    public void d() {
        if (this.a) {
            d.U().d0();
        }
    }

    @Override // com.ttnet.org.chromium.net.w
    public void e(boolean z, List<Integer> list) {
        if (this.a) {
            d.U().e0(z, list);
        }
    }

    @Override // com.ttnet.org.chromium.net.w
    public void f(List<String> list, List<String> list2) {
        if (this.a) {
            d.U().m0(list, list2);
        }
    }

    @Override // com.ttnet.org.chromium.net.w
    public void g(String str, String str2, String str3) {
        if (this.a) {
            d.U().o0(str, str2, str3);
        }
    }

    @Override // com.ttnet.org.chromium.net.w
    public void h(String str, String str2, String str3, String str4, String str5, String str6) {
        if (this.a) {
            d.U().p0(str, str2, str3, str4, str5, str6);
        }
    }

    @Override // com.ttnet.org.chromium.net.w
    public void i(String[] strArr, String str) {
        if (this.a) {
            d.U().q0(strArr, str);
        }
    }

    @Override // com.ttnet.org.chromium.net.w
    public void j(String str) {
        if (this.a) {
            d.U().s0(str);
        }
    }

    public void l(String str, int i) {
        if (this.a) {
            d.U().g0(str, i);
        }
    }

    public void m(boolean z) {
        this.a = z;
    }
}
