package com.ttnet.org.chromium.base;

import J.N;
import android.os.Looper;
import android.os.MessageQueue;
import android.os.SystemClock;
import android.util.Log;
import android.util.Printer;
import androidx.annotation.VisibleForTesting;
import com.ttnet.org.chromium.base.TraceEvent;
import com.ttnet.org.chromium.base.annotations.CalledByNative;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public class TraceEvent implements AutoCloseable {
    private static volatile boolean b;

    /* renamed from: c, reason: collision with root package name */
    private static AtomicBoolean f8560c;

    /* renamed from: d, reason: collision with root package name */
    private static boolean f8561d;
    private final String a;

    @VisibleForTesting(otherwise = 2)
    static class b implements Printer {
        private String a;

        b() {
        }

        void a(String str) {
            String J2;
            boolean c2 = EarlyTraceEvent.c();
            if (TraceEvent.b || c2) {
                if (TraceEvent.f8561d) {
                    J2 = "Looper.dispatch: EVENT_NAME_FILTERED";
                } else {
                    StringBuilder M = e.a.a.a.a.M("Looper.dispatch: ");
                    int indexOf = str.indexOf(40, 18);
                    int indexOf2 = indexOf == -1 ? -1 : str.indexOf(41, indexOf);
                    M.append(indexOf2 != -1 ? str.substring(indexOf + 1, indexOf2) : "");
                    M.append("(");
                    int indexOf3 = str.indexOf(125, 18);
                    int indexOf4 = indexOf3 == -1 ? -1 : str.indexOf(58, indexOf3);
                    if (indexOf4 == -1) {
                        indexOf4 = str.length();
                    }
                    J2 = e.a.a.a.a.J(M, indexOf3 != -1 ? str.substring(indexOf3 + 2, indexOf4) : "", ")");
                }
                this.a = J2;
                if (TraceEvent.b) {
                    N.MljCyOuh(this.a);
                } else {
                    EarlyTraceEvent.a(this.a, true);
                }
            }
        }

        void b(String str) {
            boolean c2 = EarlyTraceEvent.c();
            if ((TraceEvent.b || c2) && this.a != null) {
                if (TraceEvent.b) {
                    N.M6R6NWXS(this.a);
                } else {
                    EarlyTraceEvent.d(this.a, true);
                }
            }
            this.a = null;
        }

        @Override // android.util.Printer
        public void println(String str) {
            if (str.startsWith(">")) {
                a(str);
            } else {
                b(str);
            }
        }
    }

    private static final class c extends b implements MessageQueue.IdleHandler {
        private long b;

        /* renamed from: c, reason: collision with root package name */
        private long f8562c;

        /* renamed from: d, reason: collision with root package name */
        private int f8563d;

        /* renamed from: e, reason: collision with root package name */
        private int f8564e;

        /* renamed from: f, reason: collision with root package name */
        private int f8565f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f8566g;

        c(a aVar) {
        }

        private final void c() {
            if (TraceEvent.b && !this.f8566g) {
                this.b = SystemClock.elapsedRealtime();
                Looper.myQueue().addIdleHandler(this);
                this.f8566g = true;
                Log.v("TraceEvent_LooperMonitor", "attached idle handler");
                return;
            }
            if (!this.f8566g || TraceEvent.b) {
                return;
            }
            Looper.myQueue().removeIdleHandler(this);
            this.f8566g = false;
            Log.v("TraceEvent_LooperMonitor", "detached idle handler");
        }

        @Override // com.ttnet.org.chromium.base.TraceEvent.b
        final void a(String str) {
            if (this.f8565f == 0) {
                TraceEvent.l("Looper.queueIdle");
            }
            this.f8562c = SystemClock.elapsedRealtime();
            c();
            super.a(str);
        }

        @Override // com.ttnet.org.chromium.base.TraceEvent.b
        final void b(String str) {
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.f8562c;
            if (elapsedRealtime > 16) {
                String str2 = "observed a task that took " + elapsedRealtime + "ms: " + str;
                TraceEvent.o("TraceEvent.LooperMonitor:IdleStats", str2);
                Log.println(5, "TraceEvent_LooperMonitor", str2);
            }
            super.b(str);
            c();
            this.f8563d++;
            this.f8565f++;
        }

        @Override // android.os.MessageQueue.IdleHandler
        public final boolean queueIdle() {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (this.b == 0) {
                this.b = elapsedRealtime;
            }
            long j = elapsedRealtime - this.b;
            this.f8564e++;
            TraceEvent.h("Looper.queueIdle", this.f8565f + " tasks since last idle.");
            if (j > 48) {
                String str = this.f8563d + " tasks and " + this.f8564e + " idles processed so far, " + this.f8565f + " tasks bursted and " + j + "ms elapsed since last idle";
                TraceEvent.o("TraceEvent.LooperMonitor:IdleStats", str);
                Log.println(3, "TraceEvent_LooperMonitor", str);
            }
            this.b = elapsedRealtime;
            this.f8565f = 0;
            return true;
        }
    }

    private static final class d {
        private static final b a;

        static {
            a = com.ttnet.org.chromium.base.b.a().b("enable-idle-tracing") ? new c(null) : new b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class e implements MessageQueue.IdleHandler {
        private static boolean b;

        /* renamed from: c, reason: collision with root package name */
        private static e f8567c;
        private long a;

        private e() {
        }

        public static void a() {
            if (!ThreadUtils.b()) {
                ThreadUtils.a().post(new Runnable() { // from class: com.ttnet.org.chromium.base.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        TraceEvent.e.a();
                    }
                });
                return;
            }
            if (N.MpI7Xy5x()) {
                if (f8567c == null) {
                    f8567c = new e();
                }
                int i = ThreadUtils.f8559c;
                if (b) {
                    return;
                }
                Looper.myQueue().addIdleHandler(f8567c);
                b = true;
                return;
            }
            if (f8567c != null) {
                int i2 = ThreadUtils.f8559c;
                if (b) {
                    Looper.myQueue().removeIdleHandler(f8567c);
                    b = false;
                }
            }
        }

        @Override // android.os.MessageQueue.IdleHandler
        public final boolean queueIdle() {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j = this.a;
            if (j != 0 && elapsedRealtime - j <= 1000) {
                return true;
            }
            this.a = elapsedRealtime;
            N.MgOuiubc();
            return true;
        }
    }

    static {
        new AtomicBoolean();
        f8560c = new AtomicBoolean();
    }

    private TraceEvent(String str, String str2) {
        this.a = str;
        EarlyTraceEvent.a(str, false);
        if (b) {
            N.MajVTFsV(str, str2);
        }
    }

    @CalledByNative
    public static void dumpViewHierarchy(long j) {
        ApplicationStatus.c();
    }

    public static void h(String str, String str2) {
        EarlyTraceEvent.a(str, false);
        if (b) {
            N.MajVTFsV(str, str2);
        }
    }

    public static void l(String str) {
        EarlyTraceEvent.d(str, false);
        if (b) {
            N.M5yUVmrW(str, null);
        }
    }

    public static void o(String str, String str2) {
        if (b) {
            N.Mz5qii_R(str, str2);
        }
    }

    static void p() {
        f8560c.set(true);
        if (b) {
            e.a();
        }
    }

    public static TraceEvent r(String str) {
        if (EarlyTraceEvent.c() || b) {
            return new TraceEvent(str, null);
        }
        return null;
    }

    @CalledByNative
    public static void setEnabled(boolean z) {
        if (z) {
            EarlyTraceEvent.b();
        }
        if (b != z) {
            b = z;
            ThreadUtils.a().getLooper().setMessageLogging(z ? d.a : null);
        }
        if (f8560c.get()) {
            e.a();
        }
    }

    @CalledByNative
    public static void setEventNameFilteringEnabled(boolean z) {
        f8561d = z;
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        String str = this.a;
        EarlyTraceEvent.d(str, false);
        if (b) {
            N.M5yUVmrW(str, null);
        }
    }
}
