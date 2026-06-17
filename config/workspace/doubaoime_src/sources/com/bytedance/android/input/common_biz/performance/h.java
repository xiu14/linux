package com.bytedance.android.input.common_biz.performance;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.android.input.common_biz.performance.api.PerformanceConfig;
import com.bytedance.android.input.common_biz.performance.h;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class h implements Choreographer.FrameCallback {

    /* renamed from: c, reason: collision with root package name */
    private static boolean f2245c;

    /* renamed from: d, reason: collision with root package name */
    private static long f2246d;

    /* renamed from: e, reason: collision with root package name */
    private static int f2247e;

    /* renamed from: f, reason: collision with root package name */
    private static long f2248f;

    /* renamed from: g, reason: collision with root package name */
    private static int f2249g;
    private static int h;
    private static long i;
    private static long j;
    private static int k;
    private static int o;
    public static final h a = new h();
    private static final DateTimeFormatter b = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");
    private static List<a> l = new ArrayList();
    private static float m = 60.0f;
    private static float n = 33.33f;

    public static final class a {
        private final String a;
        private final float b;

        /* renamed from: c, reason: collision with root package name */
        private final float f2250c;

        /* renamed from: d, reason: collision with root package name */
        private final int f2251d;

        /* renamed from: e, reason: collision with root package name */
        private final int f2252e;

        /* renamed from: f, reason: collision with root package name */
        private final int f2253f;

        /* renamed from: g, reason: collision with root package name */
        private final boolean f2254g;

        public a(String str, float f2, float f3, int i, int i2, int i3, boolean z) {
            kotlin.s.c.l.f(str, "timestamp");
            this.a = str;
            this.b = f2;
            this.f2250c = f3;
            this.f2251d = i;
            this.f2252e = i2;
            this.f2253f = i3;
            this.f2254g = z;
        }

        public final float a() {
            return this.f2250c;
        }

        public final int b() {
            return this.f2251d;
        }

        public final float c() {
            return this.b;
        }

        public final int d() {
            return this.f2252e;
        }

        public final String e() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.s.c.l.a(this.a, aVar.a) && Float.compare(this.b, aVar.b) == 0 && Float.compare(this.f2250c, aVar.f2250c) == 0 && this.f2251d == aVar.f2251d && this.f2252e == aVar.f2252e && this.f2253f == aVar.f2253f && this.f2254g == aVar.f2254g;
        }

        public final int f() {
            return this.f2253f;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int I = e.a.a.a.a.I(this.f2253f, e.a.a.a.a.I(this.f2252e, e.a.a.a.a.I(this.f2251d, e.a.a.a.a.x(this.f2250c, e.a.a.a.a.x(this.b, this.a.hashCode() * 31, 31), 31), 31), 31), 31);
            boolean z = this.f2254g;
            int i = z;
            if (z != 0) {
                i = 1;
            }
            return I + i;
        }

        public String toString() {
            StringBuilder M = e.a.a.a.a.M("PerformanceDiagnostic(timestamp=");
            M.append(this.a);
            M.append(", fps=");
            M.append(this.b);
            M.append(", avgFrameTimeMs=");
            M.append(this.f2250c);
            M.append(", droppedFrames=");
            M.append(this.f2251d);
            M.append(", severeDroppedFrames=");
            M.append(this.f2252e);
            M.append(", totalFrames=");
            M.append(this.f2253f);
            M.append(", isSevere=");
            return e.a.a.a.a.L(M, this.f2254g, ')');
        }
    }

    static {
        new Handler(Looper.getMainLooper());
    }

    private h() {
    }

    private final void a() {
        try {
            if (f2247e == 0) {
                return;
            }
            float f2 = (f2248f / r0) / 1000.0f;
            float f3 = 1000.0f / f2;
            String format = LocalDateTime.now().format(b);
            boolean z = true;
            boolean z2 = h >= 3;
            boolean z3 = o >= 2;
            boolean z4 = f3 < m * 0.5f;
            boolean z5 = f2 > n;
            if (!z2 || (!z3 && !z4 && !z5)) {
                z = false;
            }
            kotlin.s.c.l.e(format, "currentTime");
            a aVar = new a(format, f3, f2, f2249g, h, f2247e, z);
            if (z) {
                b(aVar);
            }
        } catch (Exception e2) {
            e.a.a.a.a.d0(e2, e.a.a.a.a.M("reportFrameRate，Error reporting frame rate: "), IAppGlobals.a, "FrameRateMonitor");
        }
    }

    private final void b(final a aVar) {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - j < 30000) {
                IAppGlobals.a.j("FrameRateMonitor", "[FrameRateMonitor] Report skipped due to cooldown period");
                return;
            }
            if (k >= 5 && !PerformanceConfig.INSTANCE.isNoFreqRender()) {
                IAppGlobals.a.j("FrameRateMonitor", "[FrameRateMonitor] Report skipped due to max reports per session reached");
                return;
            }
            j = currentTimeMillis;
            k++;
            com.bytedance.android.input.basic.d.a.a(new Runnable() { // from class: com.bytedance.android.input.common_biz.performance.a
                @Override // java.lang.Runnable
                public final void run() {
                    h.a aVar2 = h.a.this;
                    kotlin.s.c.l.f(aVar2, "$diagnostic");
                    try {
                        StringBuilder sb = new StringBuilder();
                        sb.append("[FrameRateMonitor] SEVERE PERFORMANCE ISSUE DETECTED: ");
                        sb.append("Timestamp: " + aVar2.e() + ", ");
                        String format = String.format("fps: %.2f, ", Arrays.copyOf(new Object[]{Float.valueOf(aVar2.c())}, 1));
                        kotlin.s.c.l.e(format, "format(this, *args)");
                        sb.append(format);
                        String format2 = String.format("avg_frame_time: %.2fms, ", Arrays.copyOf(new Object[]{Float.valueOf(aVar2.a())}, 1));
                        kotlin.s.c.l.e(format2, "format(this, *args)");
                        sb.append(format2);
                        sb.append("dropped_frames: " + aVar2.b() + ", ");
                        sb.append("severe_dropped_frames: " + aVar2.d() + ", ");
                        sb.append("total_frames: " + aVar2.f() + ", ");
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("refresh_rate: ");
                        sb2.append(j.f());
                        sb.append(sb2.toString());
                        String sb3 = sb.toString();
                        kotlin.s.c.l.e(sb3, "StringBuilder().apply(builderAction).toString()");
                        IAppGlobals.a.j("FrameRateMonitor", sb3);
                        PerformanceConfig.INSTANCE.trace("ime_perf_fps", kotlin.collections.g.J(new kotlin.g("fps", Float.valueOf(aVar2.c())), new kotlin.g("avg_frame_time_ms", Float.valueOf(aVar2.a())), new kotlin.g("dropped_frames", Integer.valueOf(aVar2.b())), new kotlin.g("severe_dropped_frames", Integer.valueOf(aVar2.d())), new kotlin.g("total_frames", Integer.valueOf(aVar2.f())), new kotlin.g("refresh_rate", Float.valueOf(j.f()))));
                    } catch (Exception e2) {
                        e.a.a.a.a.d0(e2, e.a.a.a.a.M("reportSeverePerformanceIssue Error reporting severe issue: "), IAppGlobals.a, "FrameRateMonitor");
                    }
                }
            });
        } catch (Exception e2) {
            e.a.a.a.a.d0(e2, e.a.a.a.a.M("reportSeverePerformanceIssue Error in main thread: "), IAppGlobals.a, "FrameRateMonitor");
        }
    }

    public final void c() {
        try {
            if (f2245c || !PerformanceConfig.INSTANCE.isUploadFpsPerData()) {
                return;
            }
            try {
                float f2 = j.f();
                if (f2 > 0.0f) {
                    m = f2;
                    n = (1000.0f / f2) * 2;
                    IAppGlobals.a.j("FrameRateMonitor", "[FrameRateMonitor] Device refresh rate: " + m + "Hz, severe threshold: " + n + "ms");
                }
            } catch (Exception e2) {
                IAppGlobals.a.e("FrameRateMonitor", "startMonitoring Error getting refresh rate: " + e2.getMessage());
            }
            f2245c = true;
            f2246d = 0L;
            f2247e = 0;
            f2248f = 0L;
            f2249g = 0;
            h = 0;
            o = 0;
            j = 0L;
            k = 0;
            try {
                l.clear();
            } catch (Exception e3) {
                IAppGlobals.a.e("FrameRateMonitor", "clearDiagnosticCache Error clearing cache: " + e3.getMessage());
            }
            i = System.currentTimeMillis();
            Choreographer.getInstance().postFrameCallback(this);
            IAppGlobals.a.j("FrameRateMonitor", "[FrameRateMonitor] Started monitoring frame rate");
        } catch (Exception e4) {
            e.a.a.a.a.d0(e4, e.a.a.a.a.M("startMonitoring Error starting monitor: "), IAppGlobals.a, "FrameRateMonitor");
            f2245c = false;
        }
    }

    public final void d() {
        try {
            if (f2245c && PerformanceConfig.INSTANCE.isUploadFpsPerData()) {
                f2245c = false;
                Choreographer.getInstance().removeFrameCallback(this);
                IAppGlobals.a.j("FrameRateMonitor", "[FrameRateMonitor] Stopped monitoring frame rate");
            }
        } catch (Exception e2) {
            e.a.a.a.a.d0(e2, e.a.a.a.a.M("stopMonitoring Error stopping monitor: "), IAppGlobals.a, "FrameRateMonitor");
        }
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j2) {
        if (f2245c && PerformanceConfig.INSTANCE.isUploadFpsPerData()) {
            try {
                if (f2246d > 0) {
                    float f2 = (j2 - r0) / 1000000.0f;
                    f2247e++;
                    f2248f += (long) (1000 * f2);
                    if (f2 > 16.67f) {
                        f2249g += Math.abs(((int) (f2 / 16.67f)) - 1);
                        if (f2 > n) {
                            h++;
                            o++;
                        } else {
                            o = 0;
                        }
                    } else {
                        o = 0;
                    }
                    long currentTimeMillis = System.currentTimeMillis();
                    if (currentTimeMillis - i >= 1000) {
                        a();
                        f2247e = 0;
                        f2248f = 0L;
                        f2249g = 0;
                        h = 0;
                        o = 0;
                        i = currentTimeMillis;
                    }
                }
                f2246d = j2;
                Choreographer.getInstance().postFrameCallback(this);
            } catch (Exception e2) {
                e.a.a.a.a.d0(e2, e.a.a.a.a.M("doFrame Error in doFrame: "), IAppGlobals.a, "FrameRateMonitor");
                if (f2245c) {
                    Choreographer.getInstance().postFrameCallback(this);
                }
            }
        }
    }
}
