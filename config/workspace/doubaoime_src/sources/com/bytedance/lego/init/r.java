package com.bytedance.lego.init;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.core.os.TraceCompat;
import com.bytedance.lego.init.model.InitPeriod;
import com.bytedance.lego.init.monitor.Category;
import com.bytedance.lego.init.monitor.InitMonitor;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ThreadPoolExecutor;
import kotlin.LazyThreadSafetyMode;
import kotlin.s.c.A;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class r implements Runnable {
    static final /* synthetic */ kotlin.reflect.i[] a;
    private static final InitTaskManager b;

    /* renamed from: c, reason: collision with root package name */
    private static Thread f5323c;

    /* renamed from: d, reason: collision with root package name */
    private static final kotlin.e f5324d;

    /* renamed from: e, reason: collision with root package name */
    private static boolean f5325e;

    /* renamed from: f, reason: collision with root package name */
    private static boolean f5326f;

    /* renamed from: g, reason: collision with root package name */
    private static final CountDownLatch f5327g;
    private static final List<InitPeriod> h;
    private static final List<InitPeriod> i;
    private static long j;
    private static final List<w> k;
    private static final Object l;
    private static boolean m;
    private static final CopyOnWriteArrayList<w> n;
    private static final Handler o;
    public static final r p;

    static final class a extends kotlin.s.c.m implements kotlin.s.b.a<ThreadPoolExecutor> {
        public static final a a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.s.b.a
        public ThreadPoolExecutor invoke() {
            return InitScheduler.INSTANCE.getExecutorService$initscheduler_release();
        }
    }

    public static final class b implements w {
        private com.bytedance.lego.init.model.f a;

        b(com.bytedance.lego.init.model.f fVar) {
            this.a = fVar;
        }

        @Override // com.bytedance.lego.init.w
        public com.bytedance.lego.init.model.f I() {
            return this.a;
        }

        @Override // java.lang.Runnable
        public void run() {
            r.p.g(this.a);
        }
    }

    static {
        kotlin.s.c.t tVar = new kotlin.s.c.t(A.b(r.class), "executor", "getExecutor()Ljava/util/concurrent/ThreadPoolExecutor;");
        A.g(tVar);
        a = new kotlin.reflect.i[]{tVar};
        p = new r();
        b = new InitTaskManager();
        f5324d = kotlin.a.b(LazyThreadSafetyMode.NONE, a.a);
        f5327g = new CountDownLatch(1);
        h = new ArrayList();
        i = new ArrayList();
        k = new ArrayList();
        l = new Object();
        n = new CopyOnWriteArrayList<>();
        o = new Handler(Looper.getMainLooper());
    }

    private r() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g(com.bytedance.lego.init.model.f fVar) {
        Object newInstance;
        boolean a2 = kotlin.s.c.l.a(Looper.getMainLooper(), Looper.myLooper());
        com.bytedance.lego.init.z.a.a.b("", "TaskStart - " + fVar + "  isUIThread:" + a2);
        long currentTimeMillis = System.currentTimeMillis();
        fVar.j = currentTimeMillis;
        InitMonitor.INSTANCE.monitorTaskStart(fVar, a2);
        kotlin.s.c.l.g(fVar, "taskInfo");
        if (InitScheduler.INSTANCE.isDebug$initscheduler_release()) {
            StringBuilder M = e.a.a.a.a.M("Task:");
            M.append(fVar.a);
            TraceCompat.beginSection(M.toString());
        }
        try {
            newInstance = Class.forName(fVar.b).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception e2) {
            StringBuilder M2 = e.a.a.a.a.M("\nerror!error!error! ");
            M2.append(fVar.a);
            M2.append(" run error.\n ");
            e2.printStackTrace();
            M2.append(kotlin.o.a);
            M2.append(" \n");
            String sb = M2.toString();
            kotlin.s.c.l.g("InitTaskDispatcher", "classname");
            kotlin.s.c.l.g(sb, "message");
            Log.e("#inittask#", "InitTaskDispatcher " + sb);
            if (!InitScheduler.INSTANCE.getConfig$initscheduler_release().getCatchException() && !(e2 instanceof ClassNotFoundException)) {
                throw e2;
            }
            InitMonitor initMonitor = InitMonitor.INSTANCE;
            StringBuilder M3 = e.a.a.a.a.M("RUN_TASK_EXCEPTION:");
            M3.append(fVar.b);
            initMonitor.ensureNotReachHere(e2, M3.toString());
            Category category = Category.RUN_TAK_EXCEPTION;
            String str = fVar.b + Constants.COLON_SEPARATOR + e2.getClass().getName();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("exception_detail", Log.getStackTraceString(e2));
            initMonitor.monitorEvent(category, str, jSONObject);
        }
        if (newInstance == null) {
            throw new kotlin.l("null cannot be cast to non-null type com.bytedance.lego.init.model.IInitTask");
        }
        ((com.bytedance.lego.init.model.d) newInstance).run();
        if (InitScheduler.INSTANCE.isDebug$initscheduler_release()) {
            TraceCompat.endSection();
        }
        InitMonitor initMonitor2 = InitMonitor.INSTANCE;
        initMonitor2.monitorTaskEnd(fVar, a2);
        initMonitor2.monitorCosTime(fVar, System.currentTimeMillis() - currentTimeMillis, a2);
        com.bytedance.lego.init.z.a aVar = com.bytedance.lego.init.z.a.a;
        StringBuilder M4 = e.a.a.a.a.M("Task ");
        M4.append(fVar.a);
        M4.append(" done. cos ");
        M4.append(System.currentTimeMillis() - currentTimeMillis);
        M4.append("ms.");
        aVar.a("", M4.toString());
        b.onTaskComplete(fVar);
    }

    private final void h(com.bytedance.lego.init.model.f fVar) {
        InitMonitor initMonitor = InitMonitor.INSTANCE;
        String str = fVar.a;
        kotlin.s.c.l.b(str, "task.taskId");
        initMonitor.onTaskTimeout(str);
        Category category = Category.TASK_TIMEOUT_EXCEPTION;
        String str2 = fVar.a;
        kotlin.s.c.l.b(str2, "task.taskId");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("startTime", fVar.j);
        jSONObject.put("curTime", System.currentTimeMillis());
        initMonitor.monitorEvent(category, str2, jSONObject);
    }

    public final void d() {
        b.beforeSendMonitor();
    }

    public final void e() {
        if (f5325e) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        com.bytedance.lego.init.z.a aVar = com.bytedance.lego.init.z.a.a;
        InitScheduler initScheduler = InitScheduler.INSTANCE;
        if (initScheduler.isDebug$initscheduler_release()) {
            aVar.b("InitTaskDispatcher", "InitTaskDispatcher.init start");
        }
        InitMonitor initMonitor = InitMonitor.INSTANCE;
        initMonitor.monitorStart(InitMonitor.TASKDISPATCHER_INIT, false);
        kotlin.s.c.l.g("InitTaskDispatcher.initInternal", "message");
        if (initScheduler.isDebug$initscheduler_release()) {
            TraceCompat.beginSection("Task:InitTaskDispatcher.initInternal");
        }
        b.init();
        f5325e = true;
        f5327g.countDown();
        if (initScheduler.isDebug$initscheduler_release()) {
            TraceCompat.endSection();
        }
        initMonitor.monitorEnd(InitMonitor.TASKDISPATCHER_INIT, false);
        initMonitor.monitorCosTime(InitMonitor.TASKDISPATCHER_INIT, System.currentTimeMillis() - currentTimeMillis, false);
        if (initScheduler.isDebug$initscheduler_release()) {
            StringBuilder S = e.a.a.a.a.S(InitMonitor.TASKDISPATCHER_INIT, " done. cos: ");
            S.append(System.currentTimeMillis() - currentTimeMillis);
            S.append("ms.");
            aVar.a("InitTaskDispatcher", S.toString());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0052 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0053  */
    /* JADX WARN: Type inference failed for: r0v16, types: [T, com.bytedance.lego.init.model.f] */
    /* JADX WARN: Type inference failed for: r0v41, types: [T, com.bytedance.lego.init.model.f] */
    /* JADX WARN: Type inference failed for: r0v65, types: [T, com.bytedance.lego.init.model.f] */
    @androidx.annotation.UiThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(com.bytedance.lego.init.model.InitPeriod r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 1274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.lego.init.r.f(com.bytedance.lego.init.model.InitPeriod, boolean):void");
    }

    public final void i(boolean z) {
        m = z;
    }

    @Override // java.lang.Runnable
    public void run() {
        while (true) {
            InitTaskManager initTaskManager = b;
            com.bytedance.lego.init.model.f takeNonUiTaskIfExist$default = InitTaskManager.takeNonUiTaskIfExist$default(initTaskManager, null, 1, null);
            if (takeNonUiTaskIfExist$default == null) {
                com.bytedance.lego.init.z.a.a.b("", "异步调度线程 end.");
                return;
            }
            kotlin.s.c.l.g(takeNonUiTaskIfExist$default, "receiver$0");
            if (kotlin.s.c.l.a("init_shceduler_internal_task", takeNonUiTaskIfExist$default.b) || !com.bytedance.feedbackerlib.a.N(takeNonUiTaskIfExist$default)) {
                com.bytedance.lego.init.z.a.a.a("", takeNonUiTaskIfExist$default.a + " complete directly.");
                initTaskManager.onTaskComplete(takeNonUiTaskIfExist$default);
            } else {
                b bVar = new b(takeNonUiTaskIfExist$default);
                if (!takeNonUiTaskIfExist$default.f5313d || InitScheduler.INSTANCE.getConfig$initscheduler_release().getAgreePrivacyPopupWindow()) {
                    kotlin.e eVar = f5324d;
                    kotlin.reflect.i iVar = a[0];
                    ((ThreadPoolExecutor) eVar.getValue()).execute(bVar);
                    synchronized (l) {
                        k.add(bVar);
                    }
                } else {
                    n.add(bVar);
                    com.bytedance.lego.init.z.a.a.a("", takeNonUiTaskIfExist$default.a + " skip directly.");
                    initTaskManager.onTaskComplete(takeNonUiTaskIfExist$default);
                }
            }
        }
    }
}
