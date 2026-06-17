package com.bytedance.android.input.speech;

import com.bytedance.android.input.basic.IAppGlobals;
import java.util.ArrayList;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class J {
    private final kotlin.s.b.q<String, Boolean, Boolean, kotlin.o> a;
    private final kotlin.s.b.l<Boolean, kotlin.o> b;

    /* renamed from: c, reason: collision with root package name */
    private int f3089c;

    /* renamed from: d, reason: collision with root package name */
    private int f3090d;

    /* renamed from: e, reason: collision with root package name */
    private String f3091e;

    /* renamed from: f, reason: collision with root package name */
    private String f3092f;

    /* renamed from: g, reason: collision with root package name */
    private ScheduledExecutorService f3093g;
    private Runnable h;
    private ArrayList<Integer> i;
    private final Object j;
    private boolean k;
    private boolean l;
    private boolean m;
    private long n;
    private Runnable o;
    private boolean p;

    /* JADX WARN: Multi-variable type inference failed */
    public J(kotlin.s.b.q<? super String, ? super Boolean, ? super Boolean, kotlin.o> qVar, kotlin.s.b.l<? super Boolean, kotlin.o> lVar) {
        kotlin.s.c.l.f(qVar, "notifyUpdateAction");
        kotlin.s.c.l.f(lVar, "stopCallback");
        this.a = qVar;
        this.b = lVar;
        this.f3091e = "";
        this.f3092f = "";
        this.f3093g = Executors.newSingleThreadScheduledExecutor();
        this.i = new ArrayList<>();
        this.j = new Object();
    }

    private final String a() {
        StringBuilder M = e.a.a.a.a.M("isOffline = ");
        M.append(this.p);
        M.append(", mStopFromFail = ");
        M.append(this.m);
        M.append(", mStop = ");
        M.append(this.l);
        M.append(", mAsrUpdate = ");
        M.append(this.k);
        M.append(", mCurrentIndex = ");
        M.append(this.f3089c);
        M.append(", mCurrentStopIndex = ");
        M.append(this.f3090d);
        M.append(", mStartTime= ");
        M.append(this.n);
        M.append(", mMessageStop = ");
        M.append(this.i);
        M.append(", mPreText = ");
        M.append(this.f3092f);
        M.append(", mCurrentText = ");
        M.append(this.f3091e);
        return M.toString();
    }

    private final boolean b(char c2) {
        if ('a' <= c2 && c2 < '{') {
            return true;
        }
        return 'A' <= c2 && c2 < '[';
    }

    public static void c(J j) {
        kotlin.s.c.l.f(j, "this$0");
        IAppGlobals.a.x("Asr-Flow-StreamManager", "taskStop, run");
        j.e("taskStop run, " + j.a());
        j.l = true;
        Runnable runnable = j.h;
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003b A[Catch: all -> 0x0158, TryCatch #0 {, blocks: (B:6:0x0008, B:8:0x0014, B:10:0x0037, B:12:0x003b, B:14:0x0040, B:15:0x005d, B:17:0x00ac, B:21:0x00b4, B:23:0x00c5, B:25:0x00c9, B:26:0x00d4, B:28:0x00d8, B:30:0x00e1, B:31:0x00e6, B:33:0x010c, B:39:0x0049, B:41:0x0051, B:42:0x012a, B:44:0x012e, B:45:0x001d, B:47:0x0027, B:48:0x0030), top: B:5:0x0008, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d8 A[Catch: all -> 0x0158, TryCatch #0 {, blocks: (B:6:0x0008, B:8:0x0014, B:10:0x0037, B:12:0x003b, B:14:0x0040, B:15:0x005d, B:17:0x00ac, B:21:0x00b4, B:23:0x00c5, B:25:0x00c9, B:26:0x00d4, B:28:0x00d8, B:30:0x00e1, B:31:0x00e6, B:33:0x010c, B:39:0x0049, B:41:0x0051, B:42:0x012a, B:44:0x012e, B:45:0x001d, B:47:0x0027, B:48:0x0030), top: B:5:0x0008, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x012a A[Catch: all -> 0x0158, TryCatch #0 {, blocks: (B:6:0x0008, B:8:0x0014, B:10:0x0037, B:12:0x003b, B:14:0x0040, B:15:0x005d, B:17:0x00ac, B:21:0x00b4, B:23:0x00c5, B:25:0x00c9, B:26:0x00d4, B:28:0x00d8, B:30:0x00e1, B:31:0x00e6, B:33:0x010c, B:39:0x0049, B:41:0x0051, B:42:0x012a, B:44:0x012e, B:45:0x001d, B:47:0x0027, B:48:0x0030), top: B:5:0x0008, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void d(com.bytedance.android.input.speech.J r10) {
        /*
            Method dump skipped, instructions count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.input.speech.J.d(com.bytedance.android.input.speech.J):void");
    }

    private final void e(String str) {
        IAppGlobals.a.j("Asr-Flow-StreamManager", str);
    }

    private final void f() {
        if (!b(this.f3091e.charAt(this.f3089c - 1)) || this.f3089c >= this.f3091e.length()) {
            return;
        }
        int i = 0;
        for (int i2 = 1; i2 < 3 && this.f3089c + i2 < this.f3091e.length() && b(this.f3091e.charAt((this.f3089c + i2) - 1)); i2++) {
            i = i2;
        }
        StringBuilder N = e.a.a.a.a.N("moveLimitLetter step = ", i, ", mCurrentIndex = ");
        N.append(this.f3089c);
        e(N.toString());
        this.f3089c += i;
    }

    private final void h(boolean z) {
        ScheduledExecutorService scheduledExecutorService = this.f3093g;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
        }
        ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        this.f3093g = newSingleThreadScheduledExecutor;
        if (z) {
            newSingleThreadScheduledExecutor.scheduleAtFixedRate(this.h, 0L, 100L, TimeUnit.MILLISECONDS);
        } else {
            newSingleThreadScheduledExecutor.schedule(this.h, 0L, TimeUnit.MILLISECONDS);
        }
    }

    public void g(String str, boolean z, boolean z2) {
        kotlin.s.c.l.f(str, "text");
        synchronized (this.j) {
            this.p = z2;
            long currentTimeMillis = System.currentTimeMillis();
            long j = currentTimeMillis - this.n;
            e("onTextResponse start = " + str + ", mPreText = " + this.f3092f + ", cost time = " + (currentTimeMillis - this.n));
            this.n = currentTimeMillis;
            this.k = true;
            StringBuilder sb = new StringBuilder();
            sb.append(this.f3092f);
            sb.append(str);
            this.f3091e = sb.toString();
            if (z) {
                String str2 = this.f3092f + str;
                this.f3092f = str2;
                this.i.add(Integer.valueOf(str2.length()));
            }
            e("onTextResponse end isFinish = " + z + ", mCurrentText = " + this.f3091e + ", mPreText = " + this.f3092f + ", mMessageStop = " + this.i);
            if (z) {
                this.l = true;
                h(false);
            } else if (j > 100) {
                h(true);
            }
        }
    }

    public void i(boolean z) {
        this.p = z;
        this.h = new Runnable() { // from class: com.bytedance.android.input.speech.r
            @Override // java.lang.Runnable
            public final void run() {
                J.d(J.this);
            }
        };
        this.o = new Runnable() { // from class: com.bytedance.android.input.speech.q
            @Override // java.lang.Runnable
            public final void run() {
                J.c(J.this);
            }
        };
        StringBuilder M = e.a.a.a.a.M("start, ");
        M.append(a());
        e(M.toString());
        this.n = System.currentTimeMillis();
        this.f3093g.scheduleAtFixedRate(this.h, 0L, 100L, TimeUnit.MILLISECONDS);
    }

    public void j(boolean z) {
        this.m = z;
        if (this.h == null) {
            StringBuilder X = e.a.a.a.a.X("stop fromFail = ", z, ", task is null - notify stop, ");
            X.append(a());
            e(X.toString());
            this.b.invoke(Boolean.valueOf(this.m));
            this.l = true;
            return;
        }
        if (this.f3093g.isShutdown()) {
            IAppGlobals.a.x("Asr-Flow-StreamManager", "executor.isShutdown");
            e("stop executor.isShutdown, " + a());
            this.b.invoke(Boolean.valueOf(this.m));
            this.l = true;
            return;
        }
        try {
            this.f3093g.schedule(this.o, 0L, TimeUnit.MILLISECONDS);
        } catch (Exception e2) {
            this.b.invoke(Boolean.valueOf(this.m));
            e("stop exception " + a());
            IAppGlobals.a.e("Asr-Flow-StreamManager", String.valueOf(e2.getMessage()));
        }
    }
}
