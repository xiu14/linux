package com.bytedance.apm.t.l;

import android.annotation.TargetApi;
import android.app.Activity;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.view.FrameMetrics;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.Window;
import com.bytedance.apm.core.ActivityLifeObserver;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class d implements com.bytedance.apm.core.c {
    private static final d q = new d();
    private static boolean r;
    private static com.bytedance.apm.t.a s;
    private volatile boolean a;
    public final com.bytedance.apm.t.l.c b = new com.bytedance.apm.t.l.c();

    /* renamed from: c, reason: collision with root package name */
    private long[] f3553c = new long[4];

    /* renamed from: d, reason: collision with root package name */
    private final List<com.bytedance.apm.t.a> f3554d = new CopyOnWriteArrayList();

    /* renamed from: e, reason: collision with root package name */
    private boolean f3555e = false;

    /* renamed from: f, reason: collision with root package name */
    private boolean f3556f = false;

    /* renamed from: g, reason: collision with root package name */
    private boolean f3557g = false;
    private boolean h = false;
    private boolean i = false;
    final com.bytedance.apm.F.e j = new com.bytedance.apm.F.e("looper_monitor");
    final com.bytedance.apm.F.f k = new com.bytedance.apm.F.f("looper_monitor");
    private HashMap<String, Window.OnFrameMetricsAvailableListener> l = new HashMap<>();
    private long m = -1;
    private boolean n;
    private boolean o;
    public boolean p;

    class a extends com.bytedance.monitor.collector.a {
        a() {
        }

        @Override // com.bytedance.monitor.collector.a
        public void a(String str, Message message) {
            this.a = false;
            d.f(d.this);
        }

        @Override // com.bytedance.monitor.collector.a
        public void b(String str) {
            this.a = true;
            d.b(d.this, str);
        }

        @Override // com.bytedance.monitor.collector.a
        public boolean c() {
            return d.this.a;
        }
    }

    class b implements Window.OnFrameMetricsAvailableListener {
        String a;
        final /* synthetic */ Activity b;

        class a implements Runnable {
            final /* synthetic */ long a;
            final /* synthetic */ long b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f3560c;

            a(long j, long j2, int i) {
                this.a = j;
                this.b = j2;
                this.f3560c = i;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (this.a == 0) {
                    if (d.s != null && d.this.p) {
                        d.s.f(b.this.a, this.b, this.f3560c);
                        return;
                    }
                    Iterator it2 = d.this.f3554d.iterator();
                    while (it2.hasNext()) {
                        ((com.bytedance.apm.t.a) it2.next()).f(b.this.a, this.b, this.f3560c);
                    }
                }
            }
        }

        /* renamed from: com.bytedance.apm.t.l.d$b$b, reason: collision with other inner class name */
        class RunnableC0127b implements Runnable {
            final /* synthetic */ FrameMetrics a;
            final /* synthetic */ int b;

            RunnableC0127b(FrameMetrics frameMetrics, int i) {
                this.a = frameMetrics;
                this.b = i;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (this.a.getMetric(9) == 0) {
                    if (d.s != null && d.this.p) {
                        d.s.g(b.this.a, this.a, this.b);
                        return;
                    }
                    Iterator it2 = d.this.f3554d.iterator();
                    while (it2.hasNext()) {
                        ((com.bytedance.apm.t.a) it2.next()).g(b.this.a, this.a, this.b);
                    }
                }
            }
        }

        b(Activity activity) {
            this.b = activity;
            this.a = activity.getClass().getName();
        }

        @Override // android.view.Window.OnFrameMetricsAvailableListener
        public void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i) {
            if (!d.this.o) {
                d.this.j.b(new RunnableC0127b(new FrameMetrics(frameMetrics), i));
                return;
            }
            long metric = (frameMetrics.getMetric(5) + (frameMetrics.getMetric(4) + (frameMetrics.getMetric(3) + (frameMetrics.getMetric(2) + (frameMetrics.getMetric(1) + frameMetrics.getMetric(0)))))) / 1000000;
            d.this.j.b(new a(frameMetrics.getMetric(9), metric, i));
        }
    }

    class c extends h {
        c(Window.Callback callback) {
            super(callback);
        }

        @Override // android.view.Window.Callback
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            if (!d.this.h) {
                d.this.b.a(keyEvent.getEventTime());
            }
            return this.a.dispatchKeyEvent(keyEvent);
        }

        @Override // android.view.Window.Callback
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            if (!d.this.h) {
                d.this.b.a(motionEvent.getEventTime());
            }
            return this.a.dispatchTouchEvent(motionEvent);
        }
    }

    /* renamed from: com.bytedance.apm.t.l.d$d, reason: collision with other inner class name */
    class WindowOnFrameMetricsAvailableListenerC0128d implements Window.OnFrameMetricsAvailableListener {
        final /* synthetic */ String a;

        /* renamed from: com.bytedance.apm.t.l.d$d$a */
        class a implements Runnable {
            final /* synthetic */ long a;
            final /* synthetic */ long b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f3563c;

            a(long j, long j2, int i) {
                this.a = j;
                this.b = j2;
                this.f3563c = i;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (this.a == 0) {
                    if (d.s != null && d.this.p) {
                        d.s.f(WindowOnFrameMetricsAvailableListenerC0128d.this.a, this.b, this.f3563c);
                        return;
                    }
                    Iterator it2 = d.this.f3554d.iterator();
                    while (it2.hasNext()) {
                        ((com.bytedance.apm.t.a) it2.next()).f(WindowOnFrameMetricsAvailableListenerC0128d.this.a, this.b, this.f3563c);
                    }
                }
            }
        }

        /* renamed from: com.bytedance.apm.t.l.d$d$b */
        class b implements Runnable {
            final /* synthetic */ FrameMetrics a;
            final /* synthetic */ int b;

            b(FrameMetrics frameMetrics, int i) {
                this.a = frameMetrics;
                this.b = i;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (this.a.getMetric(9) == 0) {
                    if (d.s != null && d.this.p) {
                        d.s.g(WindowOnFrameMetricsAvailableListenerC0128d.this.a, this.a, this.b);
                        return;
                    }
                    Iterator it2 = d.this.f3554d.iterator();
                    while (it2.hasNext()) {
                        ((com.bytedance.apm.t.a) it2.next()).g(WindowOnFrameMetricsAvailableListenerC0128d.this.a, this.a, this.b);
                    }
                }
            }
        }

        WindowOnFrameMetricsAvailableListenerC0128d(String str) {
            this.a = str;
        }

        @Override // android.view.Window.OnFrameMetricsAvailableListener
        public void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i) {
            if (!d.this.o) {
                d.this.j.b(new b(new FrameMetrics(frameMetrics), i));
                return;
            }
            long metric = (frameMetrics.getMetric(5) + (frameMetrics.getMetric(4) + (frameMetrics.getMetric(3) + (frameMetrics.getMetric(2) + (frameMetrics.getMetric(1) + frameMetrics.getMetric(0)))))) / 1000000;
            d.this.j.b(new a(frameMetrics.getMetric(9), metric, i));
        }
    }

    private d() {
    }

    static void b(d dVar, String str) {
        dVar.h = true;
        long[] jArr = dVar.f3553c;
        jArr[0] = com.bytedance.monitor.collector.a.b;
        jArr[2] = com.bytedance.monitor.collector.a.f5422c;
        List<com.bytedance.apm.t.a> list = dVar.f3554d;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            com.bytedance.apm.t.a aVar = list.get(i);
            if (!aVar.e()) {
                aVar.c(str);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static void f(d dVar) {
        int i;
        char c2;
        boolean z = dVar.f3557g;
        long[] jArr = dVar.f3553c;
        jArr[1] = com.bytedance.monitor.collector.a.b;
        char c3 = 3;
        jArr[3] = com.bytedance.monitor.collector.a.f5422c;
        List<com.bytedance.apm.t.a> list = dVar.f3554d;
        int size = list.size();
        char c4 = 0;
        int i2 = 0;
        while (i2 < size) {
            com.bytedance.apm.t.a aVar = list.get(i2);
            if (aVar.e()) {
                long[] jArr2 = dVar.f3553c;
                long j = jArr2[c4];
                long j2 = jArr2[2];
                long j3 = jArr2[1];
                long j4 = jArr2[c3];
                i = i2;
                c2 = c4;
                aVar.d(j, j2, j3, j4, z);
            } else {
                i = i2;
                c2 = c4;
            }
            i2 = i + 1;
            c4 = c2;
            c3 = 3;
        }
        boolean z2 = c4;
        long[] jArr3 = dVar.b.a;
        jArr3[z2 ? 1 : 0] = 0;
        jArr3[1] = 0;
        jArr3[2] = Long.MAX_VALUE;
        jArr3[3] = 0;
        dVar.h = z2;
    }

    public static d i() {
        return q;
    }

    public static Method l(Class cls, String str, Class<?>... clsArr) {
        try {
            Method method = (Method) Class.class.getDeclaredMethod("getDeclaredMethod", String.class, Class[].class).invoke(cls, str, clsArr);
            method.setAccessible(true);
            return method;
        } catch (Exception unused) {
            return null;
        }
    }

    public void h(com.bytedance.apm.t.a aVar) {
        if (!this.a) {
            synchronized (this) {
                if (com.bytedance.apm.g.G()) {
                    if (!this.n) {
                        throw new RuntimeException("never init!");
                    }
                    if (!this.a) {
                        this.a = true;
                    }
                }
            }
        }
        if (this.f3554d.contains(aVar)) {
            return;
        }
        this.f3554d.add(aVar);
        if (this.p) {
            com.bytedance.monitor.collector.g.l();
        }
    }

    public int j() {
        int size = this.f3554d.size();
        return (!r || com.bytedance.apm.D.c.d("block_monitor")) ? size : size - 1;
    }

    @TargetApi(16)
    public void k() {
        if (this.n) {
            return;
        }
        if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
            throw new AssertionError("must be init in main thread!");
        }
        ActivityLifeObserver.getInstance().register(this);
        com.bytedance.monitor.collector.g.g();
        com.bytedance.monitor.collector.g.j(new a());
        this.n = true;
    }

    public void m(com.bytedance.apm.t.a aVar) {
        this.f3554d.remove(aVar);
        if (this.p) {
            if (j() == 0 && com.bytedance.monitor.collector.g.f() == 0) {
                com.bytedance.monitor.collector.g.a();
                return;
            }
            return;
        }
        if (this.f3554d.isEmpty()) {
            synchronized (this) {
                if (com.bytedance.apm.g.F()) {
                    if (!this.n) {
                        throw new RuntimeException("MainThreadMonitor is never init!");
                    }
                    if (this.a) {
                        this.a = false;
                    }
                }
            }
        }
    }

    public void n() {
        r = true;
    }

    public void o(boolean z) {
        this.o = z;
    }

    @Override // com.bytedance.apm.core.c
    public void onActivityCreated(Activity activity, Bundle bundle) {
        try {
            Window window = activity.getWindow();
            window.setCallback(new c(window.getCallback()));
            String name = activity.getClass().getName();
            String obj = activity.toString();
            com.bytedance.monitor.collector.g.c();
            if (!this.f3555e && this.k.d()) {
                WindowOnFrameMetricsAvailableListenerC0128d windowOnFrameMetricsAvailableListenerC0128d = new WindowOnFrameMetricsAvailableListenerC0128d(name);
                this.l.put(obj, windowOnFrameMetricsAvailableListenerC0128d);
                window.addOnFrameMetricsAvailableListener(windowOnFrameMetricsAvailableListenerC0128d, this.k.f3296d);
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.apm.core.c
    public void onActivityDestroyed(Activity activity) {
        try {
            Window.OnFrameMetricsAvailableListener remove = this.l.remove(activity.toString());
            if (remove != null) {
                activity.getWindow().removeOnFrameMetricsAvailableListener(remove);
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.apm.core.c
    public void onBackground(Activity activity) {
    }

    @Override // com.bytedance.apm.core.c
    public void onFront(Activity activity) {
        if (this.f3555e) {
            try {
                Window window = activity.getWindow();
                if (this.k.d()) {
                    b bVar = new b(activity);
                    this.l.put(activity.toString(), bVar);
                    window.addOnFrameMetricsAvailableListener(bVar, this.k.f3296d);
                }
            } catch (Exception unused) {
            }
        }
    }

    public void p(boolean z) {
        this.f3555e = z;
    }

    public void q(com.bytedance.apm.t.a aVar) {
        s = aVar;
    }

    public void r(boolean z) {
        this.f3556f = z;
    }

    public void s() {
        this.j.c();
        this.k.h();
    }
}
