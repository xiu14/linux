package com.bytedance.apm.t;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.bytedance.apm.PerfConfig;
import com.bytedance.apm.core.ActivityLifeObserver;
import com.bytedance.apm.n;
import com.bytedance.common.utility.Logger;
import com.bytedance.monitor.collector.e;
import com.bytedance.sliver.Sliver;
import com.ss.android.socialbase.downloader.constants.MonitorConstants;
import com.xiaomi.mipush.sdk.Constants;
import java.util.LinkedList;
import java.util.Objects;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class j {
    private static long t = 1000;
    private static volatile j u;
    private com.bytedance.apm.F.f a;
    private c j;
    private volatile boolean b = false;

    /* renamed from: c, reason: collision with root package name */
    private long f3539c = 2500;

    /* renamed from: d, reason: collision with root package name */
    private long f3540d = com.heytap.mcssdk.constant.a.r;

    /* renamed from: e, reason: collision with root package name */
    private boolean f3541e = true;

    /* renamed from: g, reason: collision with root package name */
    private final StringBuilder f3543g = new StringBuilder(1200);
    private final StringBuilder h = new StringBuilder(1200);
    private final StringBuilder i = new StringBuilder(1200);
    private c k = null;
    private volatile boolean l = false;
    private volatile boolean m = false;
    private boolean n = true;
    private boolean o = true;
    private LinkedList<com.bytedance.apm.v.d.c> p = new LinkedList<>();
    private boolean q = false;
    private final Runnable r = new a();
    private final Runnable s = new b();

    /* renamed from: f, reason: collision with root package name */
    private final String f3542f = j.class.getName();

    class a implements Runnable {
        a() {
        }

        private void a(StackTraceElement[] stackTraceElementArr) {
            TimeoutException timeoutException = new TimeoutException(e.a.a.a.a.F(e.a.a.a.a.M("main thread task execute more than "), j.this.f3539c, "ms"));
            timeoutException.setStackTrace(stackTraceElementArr);
            Logger.e("StackThread", "block detected", timeoutException);
        }

        @Override // java.lang.Runnable
        public void run() {
            String[] split;
            int length;
            if (j.this.j == null) {
                return;
            }
            try {
                j.this.j.b();
                int i = 0;
                if (!j.this.q) {
                    StackTraceElement[] stackTrace = Looper.getMainLooper().getThread().getStackTrace();
                    if (stackTrace[0].getClassName().startsWith(j.this.f3542f)) {
                        return;
                    }
                    j.this.j.m = System.currentTimeMillis();
                    j.this.j.o = stackTrace;
                    if (com.bytedance.apm.g.B()) {
                        a(stackTrace);
                    }
                    j.this.f3543g.setLength(0);
                    int length2 = stackTrace.length;
                    while (i < length2) {
                        StackTraceElement stackTraceElement = stackTrace[i];
                        StringBuilder sb = j.this.f3543g;
                        sb.append("\tat " + stackTraceElement.getClassName());
                        sb.append(".");
                        sb.append(stackTraceElement.getMethodName());
                        sb.append("(");
                        sb.append(stackTraceElement.getFileName());
                        sb.append(Constants.COLON_SEPARATOR);
                        sb.append(stackTraceElement.getLineNumber());
                        sb.append(")\n");
                        i++;
                    }
                    j.this.j.q = j.this.f3543g.toString();
                    return;
                }
                String stackTrace2 = Sliver.getStackTrace(Looper.getMainLooper().getThread());
                if (stackTrace2.contains(j.this.f3542f)) {
                    return;
                }
                String[] split2 = stackTrace2.split("\\)\\n");
                j.this.f3543g.setLength(0);
                int length3 = split2.length;
                while (i < length3) {
                    String str = split2[i];
                    String str2 = "";
                    char[] charArray = str.toCharArray();
                    if (charArray != null && charArray.length != 0) {
                        if (charArray[charArray.length - 1] == '(' && (length = (split = str.split("\\.")).length) > 2) {
                            str2 = split[length - 2];
                        }
                        StringBuilder sb2 = j.this.f3543g;
                        sb2.append("\tat " + str);
                        sb2.append(str2);
                        sb2.append(".java:1");
                        sb2.append(")\n");
                    }
                    i++;
                }
                j.this.j.q = j.this.f3543g.toString();
                if (com.bytedance.apm.g.B()) {
                    Logger.e("StackThread", "block detected: " + j.this.f3543g.toString());
                }
            } catch (Throwable th) {
                n.e().d(th, "block_deal_exception");
            }
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            String[] split;
            int length;
            try {
                if (j.this.j == null) {
                    return;
                }
                if (!j.this.q) {
                    StackTraceElement[] stackTrace = Looper.getMainLooper().getThread().getStackTrace();
                    if (stackTrace[0].getClassName().startsWith(j.this.f3542f)) {
                        return;
                    }
                    j.this.j.n = System.currentTimeMillis();
                    j.this.j.p = stackTrace;
                    j.this.j.u = com.bytedance.apm.B.c.b().a();
                    j.this.j.v = j.j(j.this);
                    j.this.j.j = true;
                    return;
                }
                String stackTrace2 = Sliver.getStackTrace(Looper.getMainLooper().getThread());
                if (stackTrace2.contains(j.this.f3542f)) {
                    return;
                }
                String[] split2 = stackTrace2.split("\\)\\n");
                j.this.h.setLength(0);
                for (String str : split2) {
                    String str2 = "";
                    char[] charArray = str.toCharArray();
                    if (charArray != null && charArray.length != 0) {
                        if (charArray[charArray.length - 1] == '(' && (length = (split = str.split("\\.")).length) > 2) {
                            str2 = split[length - 2];
                        }
                        StringBuilder sb = j.this.h;
                        sb.append("\tat " + str);
                        sb.append(str2);
                        sb.append(".java:1");
                        sb.append(")\n");
                    }
                }
                j.this.j.q = j.this.h.toString();
                j.this.j.n = System.currentTimeMillis();
                j.this.j.u = com.bytedance.apm.B.c.b().a();
                j.this.j.v = j.j(j.this);
                j.this.j.j = true;
            } catch (Throwable th) {
                n.e().d(th, "serious_block_deal_exception");
            }
        }
    }

    private j() {
    }

    public static void A(long j) {
        if (j < 70) {
            j = 1000;
        }
        t = j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0097, code lost:
    
        if ((r9 == r11 || (r9 != null && r9.equals(r11))) != false) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0185 A[LOOP:1: B:44:0x0183->B:45:0x0185, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static void d(com.bytedance.apm.t.j r17, com.bytedance.apm.t.c r18, java.lang.String r19, boolean r20) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 573
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.apm.t.j.d(com.bytedance.apm.t.j, com.bytedance.apm.t.c, java.lang.String, boolean):void");
    }

    static void e(j jVar, c cVar, String str) throws JSONException {
        Objects.requireNonNull(jVar);
        if (PerfConfig.a()) {
            JSONObject u2 = jVar.u(cVar);
            JSONObject c2 = e.b.b.l.a.a.a().c(true);
            c2.put("crash_section", com.bytedance.apm.g.A(cVar.i));
            c2.put("belong_frame", String.valueOf(cVar.f3529d));
            c2.put("belong_dump", String.valueOf(cVar.f3528c));
            c2.put("block_stack_type", "messageKey");
            u2.put("filters", c2);
            u2.put("event_type", "lag");
            u2.put("stack", "at " + str + ".*(a.java:-1)");
            com.bytedance.apm.v.d.c cVar2 = new com.bytedance.apm.v.d.c("block_monitor", u2);
            cVar2.g();
            com.bytedance.apm.data.pipeline.a.k().d(cVar2);
        }
    }

    static JSONObject j(j jVar) {
        Objects.requireNonNull(jVar);
        try {
            JSONObject jSONObject = new JSONObject();
            Context h = com.bytedance.apm.g.h();
            if (h != null) {
                ActivityManager activityManager = (ActivityManager) h.getSystemService("activity");
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                activityManager.getMemoryInfo(memoryInfo);
                jSONObject.put("availMem", memoryInfo.availMem);
                jSONObject.put("lowMemory", memoryInfo.lowMemory);
                jSONObject.put("threshold", memoryInfo.threshold);
                jSONObject.put("totalMem", memoryInfo.totalMem);
            }
            Runtime runtime = Runtime.getRuntime();
            jSONObject.put("max_memory", runtime.maxMemory());
            jSONObject.put("free_memory", runtime.freeMemory());
            jSONObject.put("total_memory", runtime.totalMemory());
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    static void m(j jVar, boolean z, c cVar, String str) throws JSONException {
        if (jVar.n) {
            JSONObject u2 = jVar.u(cVar);
            u2.put("stack", cVar.q);
            u2.put("message", str);
            u2.put("ignore_stack", jVar.j.l);
            u2.put("event_type", "lag");
            u2.put("filters", jVar.q(z, cVar, str));
            u2.put(MonitorConstants.CUSTOM, new JSONObject());
            com.bytedance.apm.v.d.c cVar2 = new com.bytedance.apm.v.d.c("block_monitor", u2, cVar.f3532g);
            jVar.o(cVar2);
            com.bytedance.apm.data.pipeline.a.k().d(cVar2);
        }
    }

    private StackTraceElement[] n(StackTraceElement[] stackTraceElementArr) {
        return stackTraceElementArr != null ? stackTraceElementArr : new StackTraceElement[]{new StackTraceElement("Invalid Stack\n", "a", "a.java", 1)};
    }

    private void o(com.bytedance.apm.v.d.c cVar) {
        while (this.p.size() != 0) {
            if (cVar.f() - this.p.getFirst().f() >= 0 && cVar.f() - this.p.getFirst().f() <= com.heytap.mcssdk.constant.a.f6886d) {
                if (this.p.size() <= 60) {
                    break;
                } else {
                    this.p.removeFirst();
                }
            } else {
                this.p.removeFirst();
            }
        }
        this.p.addLast(cVar);
    }

    private void p(c cVar) {
        String b2 = g.b();
        if (TextUtils.isEmpty(b2)) {
            cVar.s = ActivityLifeObserver.getInstance().getTopActivityClassName();
            return;
        }
        StringBuilder S = e.a.a.a.a.S(b2, Constants.ACCEPT_TIME_SEPARATOR_SP);
        S.append(ActivityLifeObserver.getInstance().getTopActivityClassName());
        cVar.s = S.toString();
    }

    private JSONObject q(boolean z, c cVar, String str) throws JSONException {
        JSONObject c2 = e.b.b.l.a.a.a().c(true);
        c2.put("crash_section", com.bytedance.apm.g.A(cVar.i));
        c2.put("belong_frame", String.valueOf(z));
        c2.put("belong_dump", String.valueOf(cVar.f3528c));
        c2.put("block_input", String.valueOf(cVar.f3530e));
        c2.put("block_frame", String.valueOf(cVar.f3531f));
        c2.put("block_message", str);
        c2.put("block_stack_type", "stack");
        c2.put("buuid", cVar.r);
        c2.put("belong_poll_once", String.valueOf(cVar.k));
        return c2;
    }

    static j r() {
        if (u == null) {
            synchronized (j.class) {
                if (u == null) {
                    u = new j();
                }
            }
        }
        return u;
    }

    private void s(c cVar) {
        if (!cVar.a) {
            cVar.b();
        }
        cVar.j = cVar.h - cVar.f3532g >= this.f3540d;
        e.g i = com.bytedance.monitor.collector.j.h().i();
        if (i != null) {
            i.c("uuid", n(cVar.o), cVar.j ? n(cVar.p) : null, null);
        }
        if (cVar.k) {
            com.bytedance.apm.F.b.e().h(new k(this, cVar));
        } else {
            this.k = cVar;
        }
    }

    private JSONObject u(@NonNull c cVar) {
        long j = cVar.h - cVar.f3532g;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("timestamp", cVar.i);
            jSONObject.put("crash_time", cVar.i);
            jSONObject.put("is_main_process", com.bytedance.apm.g.F());
            jSONObject.put("process_name", com.bytedance.apm.g.i());
            jSONObject.put("block_duration", j);
            jSONObject.put("last_scene", cVar.s);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return jSONObject;
    }

    public void B(boolean z) {
        this.n = z;
    }

    public void C(boolean z) {
        this.o = z;
    }

    public void D(long j) {
        long j2 = this.f3539c;
        if (j < j2) {
            j = com.heytap.mcssdk.constant.a.r;
        }
        this.f3540d = j;
        if (j < j2) {
            this.f3540d = j2 + 50;
        }
    }

    public void E(boolean z) {
        this.q = z;
    }

    public void F(boolean z) {
        this.b = z;
    }

    public void t() {
        com.bytedance.apm.F.f fVar = new com.bytedance.apm.F.f("StackThread");
        this.a = fVar;
        fVar.h();
    }

    public void v(boolean z) {
        try {
            if (this.a.d()) {
                c cVar = this.k;
                if (cVar != null) {
                    if (z) {
                        cVar.f3531f = true;
                    }
                    com.bytedance.apm.F.b.e().h(new k(this, cVar));
                    this.k = null;
                }
                c cVar2 = this.j;
                if (cVar2 != null && cVar2.f3532g >= 0 && cVar2.h == -1) {
                    cVar2.h = com.bytedance.monitor.collector.a.b;
                    if (this.f3541e) {
                        this.a.f(this.r);
                        this.a.f(this.s);
                    }
                    c cVar3 = this.j;
                    if (cVar3.h - cVar3.f3532g > this.f3539c) {
                        p(cVar3);
                        this.j.i = System.currentTimeMillis();
                        if (!this.f3541e) {
                            this.j.l = true;
                        }
                        c cVar4 = this.j;
                        cVar4.f3529d = z;
                        cVar4.f3528c = this.l;
                        s(this.j.a());
                        c cVar5 = this.j;
                        if (cVar5.h - cVar5.f3532g > this.f3540d && z && this.m) {
                            com.bytedance.android.input.k.b.a.K();
                        }
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    public void w(String str) {
        try {
            if (this.a.d()) {
                if (this.k != null && com.bytedance.apm.t.l.d.i().b.b()) {
                    this.k.f3530e = true;
                }
                c cVar = this.j;
                if (cVar == null) {
                    this.j = new c(com.bytedance.monitor.collector.a.b, str);
                } else {
                    cVar.f3532g = com.bytedance.monitor.collector.a.b;
                    cVar.b = str;
                    cVar.h = -1L;
                    cVar.a = false;
                }
                if (this.f3541e) {
                    this.a.e(this.r, this.f3539c);
                    if (this.b && this.o) {
                        this.a.e(this.s, this.f3540d);
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    public void x(long j) {
        if (j < 70) {
            j = 2500;
        }
        this.f3539c = j;
        if (this.f3540d < j) {
            this.f3540d = j + 50;
        }
    }

    public void y(boolean z) {
        this.f3541e = z;
    }

    public void z(boolean z) {
        this.m = z;
    }
}
