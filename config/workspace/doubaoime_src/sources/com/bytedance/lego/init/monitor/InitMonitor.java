package com.bytedance.lego.init.monitor;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.Pair;
import com.bytedance.lego.init.InitScheduler;
import com.bytedance.lego.init.model.f;
import com.bytedance.lego.init.model.g;
import com.bytedance.lego.init.r;
import com.bytedance.lego.init.x;
import com.bytedance.services.apm.api.IApmAgent;
import com.bytedance.services.apm.api.IEnsure;
import com.bytedance.services.apm.api.ILaunchTrace;
import com.ss.android.message.log.PushLog;
import com.ss.android.socialbase.downloader.constants.DBDefinition;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ThreadPoolExecutor;
import kotlin.e;
import kotlin.reflect.i;
import kotlin.s.c.A;
import kotlin.s.c.l;
import kotlin.s.c.m;
import kotlin.s.c.t;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class InitMonitor {
    static final /* synthetic */ i[] $$delegatedProperties;
    private static final String ALL_FEED_FIRST_SHOWN;
    public static final String ASYNC = "Async:";
    private static final String INIT_SCHEDULER;
    public static final InitMonitor INSTANCE;
    public static final String MAIN = "Main:";
    private static final String MONITOR_INIT = "init_task_monitor";
    private static final String MONITOR_INIT_EXCEPTION = "init_task_exception_monitor";
    public static final String TASKDISPATCHER_INIT = "InitTaskDispatcher.init";
    public static final String TASK_END_SUFFIX = "##TASKEND";
    public static final String TASK_START_SUFFIX = "##TASKSTART";
    public static final String WAIT_ASYNC_TASK_INIT = "wait_async_task_init";
    private static volatile boolean alreadyFeedShown;
    private static volatile boolean alreadyUpload;
    private static final CopyOnWriteArrayList<Pair<String, Long>> cosTimeList;
    private static final e launchTraceService$delegate;
    private static long onAttachBaseTime;
    private static final List<String> timeoutTaskList;

    static final class a extends m implements kotlin.s.b.a<ILaunchTrace> {
        public static final a a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.s.b.a
        public ILaunchTrace invoke() {
            return (ILaunchTrace) x.b.a(ILaunchTrace.class);
        }
    }

    static final class b implements Runnable {
        public static final b a = new b();

        static final class a implements Runnable {
            public static final a a = new a();

            a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                try {
                    InitMonitor.INSTANCE.sendStartUpTimeAsyncInternal();
                } catch (Exception e2) {
                    InitMonitor initMonitor = InitMonitor.INSTANCE;
                    Category category = Category.OTHER_EXCEPTION;
                    String name = e2.getClass().getName();
                    l.b(name, "e.javaClass.name");
                    JSONObject jSONObject = new JSONObject();
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("exception_detail", Log.getStackTraceString(e2));
                    jSONObject.put("exception_detail", jSONObject2);
                    initMonitor.monitorEvent(category, name, jSONObject);
                }
            }
        }

        b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            a aVar = a.a;
            ThreadPoolExecutor executorServiceOrNull$initscheduler_release = InitScheduler.INSTANCE.getExecutorServiceOrNull$initscheduler_release();
            if (executorServiceOrNull$initscheduler_release == null || executorServiceOrNull$initscheduler_release.submit(aVar) == null) {
                InitMonitor initMonitor = InitMonitor.INSTANCE;
                new Thread(aVar).start();
            }
        }
    }

    static {
        t tVar = new t(A.b(InitMonitor.class), "launchTraceService", "getLaunchTraceService()Lcom/bytedance/services/apm/api/ILaunchTrace;");
        A.g(tVar);
        $$delegatedProperties = new i[]{tVar};
        INSTANCE = new InitMonitor();
        cosTimeList = new CopyOnWriteArrayList<>();
        timeoutTaskList = new ArrayList();
        launchTraceService$delegate = kotlin.a.c(a.a);
        ALL_FEED_FIRST_SHOWN = ALL_FEED_FIRST_SHOWN;
        INIT_SCHEDULER = INIT_SCHEDULER;
    }

    private InitMonitor() {
    }

    private final synchronized void addDuration(String str, long j) {
        if (alreadyFeedShown) {
            return;
        }
        cosTimeList.add(new Pair<>(str, Long.valueOf(j)));
    }

    private final ILaunchTrace getLaunchTraceService() {
        e eVar = launchTraceService$delegate;
        i iVar = $$delegatedProperties[0];
        return (ILaunchTrace) eVar.getValue();
    }

    private final String getMonitorEndTag(String str, boolean z) {
        return z ? e.a.a.a.a.t(MAIN, str, TASK_END_SUFFIX) : e.a.a.a.a.t(ASYNC, str, TASK_END_SUFFIX);
    }

    private final String getMonitorStartTag(String str, boolean z) {
        return z ? e.a.a.a.a.t(MAIN, str, TASK_START_SUFFIX) : e.a.a.a.a.t(ASYNC, str, TASK_START_SUFFIX);
    }

    private final String getMonitorTag(String str, boolean z) {
        return z ? e.a.a.a.a.s(MAIN, str) : e.a.a.a.a.s(ASYNC, str);
    }

    private final String getPeriodTaskTag(g gVar, boolean z) {
        if (z) {
            Objects.requireNonNull(gVar);
            return "Main:null";
        }
        Objects.requireNonNull(gVar);
        return "Async:null";
    }

    private final String getTaskEndTag(f fVar, boolean z) {
        return z ? e.a.a.a.a.J(e.a.a.a.a.M(MAIN), fVar.a, TASK_END_SUFFIX) : e.a.a.a.a.J(e.a.a.a.a.M(ASYNC), fVar.a, TASK_END_SUFFIX);
    }

    private final String getTaskStartTag(f fVar, boolean z) {
        return z ? e.a.a.a.a.J(e.a.a.a.a.M(MAIN), fVar.a, TASK_START_SUFFIX) : e.a.a.a.a.J(e.a.a.a.a.M(ASYNC), fVar.a, TASK_START_SUFFIX);
    }

    private final String getTaskTag(f fVar, boolean z) {
        if (z) {
            StringBuilder M = e.a.a.a.a.M("Main:Task-");
            M.append(fVar.a);
            return M.toString();
        }
        StringBuilder M2 = e.a.a.a.a.M("Async:Task-");
        M2.append(fVar.a);
        return M2.toString();
    }

    private final boolean monitorTaskTimeout() {
        try {
            List<String> list = timeoutTaskList;
            if (list.isEmpty()) {
                return false;
            }
            for (String str : list) {
                InitMonitor initMonitor = INSTANCE;
                Category category = Category.TASK_TIMEOUT_EXCEPTION_REAL;
                StringBuilder sb = new StringBuilder();
                InitScheduler initScheduler = InitScheduler.INSTANCE;
                sb.append(initScheduler.getConfig$initscheduler_release().getTimeout());
                sb.append(':');
                sb.append(str);
                initMonitor.monitorEvent(category, sb.toString(), new JSONObject());
                com.bytedance.lego.init.z.a.a.a("", "TaskTimeout: " + str + ", " + initScheduler.getConfig$initscheduler_release().getTimeout());
            }
            sendStartUpTimeAsyncInternal();
            return true;
        } catch (Exception e2) {
            e2.printStackTrace();
            String stackTraceString = Log.getStackTraceString(e2);
            l.b(stackTraceString, "Log.getStackTraceString(e)");
            l.g("", "classname");
            l.g(stackTraceString, "message");
            Log.e("#inittask#", " " + stackTraceString);
            return false;
        }
    }

    private final void sendStartUpTimeAsync(long j) {
        new Handler(Looper.getMainLooper()).postDelayed(b.a, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void sendStartUpTimeAsyncInternal() {
        if (alreadyUpload) {
            return;
        }
        alreadyUpload = true;
        IApmAgent iApmAgent = (IApmAgent) x.b.a(IApmAgent.class);
        if (iApmAgent != null) {
            alreadyFeedShown = true;
            JSONObject jSONObject = new JSONObject();
            try {
                Iterator<T> it2 = cosTimeList.iterator();
                while (it2.hasNext()) {
                    Pair pair = (Pair) it2.next();
                    String str = (String) pair.first;
                    Object obj = pair.second;
                    l.b(obj, "it.second");
                    jSONObject.put(str, ((Number) obj).longValue());
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            com.bytedance.lego.init.z.a aVar = com.bytedance.lego.init.z.a.a;
            String jSONObject2 = jSONObject.toString();
            l.b(jSONObject2, "metric.toString()");
            aVar.a("sendStartUpTimeAsync", jSONObject2);
            r.p.d();
            iApmAgent.monitorEvent(MONITOR_INIT, new JSONObject(), jSONObject, new JSONObject());
            cosTimeList.clear();
        }
    }

    public final void ensureNotReachHere(Throwable th, String str) {
        l.g(th, "t");
        l.g(str, "msg");
        x xVar = x.b;
        IEnsure iEnsure = (IEnsure) xVar.a(IEnsure.class);
        if (iEnsure != null) {
            iEnsure.ensureNotReachHere(th, str);
        }
        IApmAgent iApmAgent = (IApmAgent) xVar.a(IApmAgent.class);
        if (iApmAgent != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("EnsureNotReachHere", str);
            JSONObject jSONObject2 = new JSONObject();
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("detail", Log.getStackTraceString(th));
            iApmAgent.monitorEvent(MONITOR_INIT_EXCEPTION, jSONObject, jSONObject2, jSONObject3);
        }
    }

    public final void monitor(String str) {
        l.g(str, "name");
        addDuration(str, System.currentTimeMillis() - onAttachBaseTime);
    }

    public final void monitorCosTime(f fVar, long j, boolean z) {
        l.g(fVar, "taskInfo");
        addDuration(getTaskTag(fVar, z), j);
    }

    public final void monitorEnd(String str, boolean z) {
        l.g(str, "name");
        addDuration(getMonitorEndTag(str, z), System.currentTimeMillis() - onAttachBaseTime);
        ILaunchTrace launchTraceService = getLaunchTraceService();
        if (launchTraceService != null) {
            launchTraceService.endSpan(INIT_SCHEDULER, str);
        }
    }

    public final void monitorEvent(Category category, String str, JSONObject jSONObject) {
        l.g(category, PushLog.KEY_CATEGORY);
        l.g(str, "type");
        l.g(jSONObject, "extraLog");
        IApmAgent iApmAgent = (IApmAgent) x.b.a(IApmAgent.class);
        if (iApmAgent != null) {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put(category.getValue(), str);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            jSONObject.put("processName", InitScheduler.INSTANCE.getConfig$initscheduler_release().getProcessName());
            jSONObject.put("isUIThread", l.a(Looper.getMainLooper(), Looper.myLooper()));
            iApmAgent.monitorEvent(MONITOR_INIT, jSONObject2, new JSONObject(), jSONObject);
            com.bytedance.lego.init.z.a.a.a("", category.name() + ' ' + str + ' ' + jSONObject.toString());
        }
    }

    public final void monitorLog(LogType logType, JSONObject jSONObject) {
        l.g(logType, "logType");
        l.g(jSONObject, "logExtr");
        IApmAgent iApmAgent = (IApmAgent) x.b.a(IApmAgent.class);
        if (iApmAgent != null) {
            iApmAgent.monitorLog(logType.name(), jSONObject);
            com.bytedance.lego.init.z.a.a.a("", logType.name() + " " + jSONObject.toString());
        }
    }

    public final void monitorStart(String str, boolean z) {
        l.g(str, "name");
        addDuration(getMonitorStartTag(str, z), System.currentTimeMillis() - onAttachBaseTime);
        ILaunchTrace launchTraceService = getLaunchTraceService();
        if (launchTraceService != null) {
            launchTraceService.startSpan(INIT_SCHEDULER, str);
        }
    }

    public final void monitorTaskEnd(f fVar, boolean z) {
        l.g(fVar, "taskInfo");
        addDuration(getTaskEndTag(fVar, z), System.currentTimeMillis() - onAttachBaseTime);
        ILaunchTrace launchTraceService = getLaunchTraceService();
        if (launchTraceService != null) {
            launchTraceService.endSpan(null, fVar.a);
        }
    }

    public final void monitorTaskStart(f fVar, boolean z) {
        l.g(fVar, "taskInfo");
        addDuration(getTaskStartTag(fVar, z), System.currentTimeMillis() - onAttachBaseTime);
        ILaunchTrace launchTraceService = getLaunchTraceService();
        if (launchTraceService != null) {
            launchTraceService.startSpan(null, fVar.a);
        }
    }

    public final void onAttachBase() {
        onAttachBaseTime = System.currentTimeMillis();
        com.bytedance.lego.init.monitor.b bVar = com.bytedance.lego.init.monitor.b.f5318c;
        com.bytedance.lego.init.monitor.b.c();
        ILaunchTrace launchTraceService = getLaunchTraceService();
        if (launchTraceService != null) {
            launchTraceService.startTrace();
        }
    }

    public final void onFeedFirstShown(boolean z) {
        Class<?> cls;
        try {
            long currentTimeMillis = System.currentTimeMillis() - onAttachBaseTime;
            boolean monitorTaskTimeout = currentTimeMillis <= ((long) 30000) ? monitorTaskTimeout() : false;
            if (!z) {
                ILaunchTrace launchTraceService = getLaunchTraceService();
                if (launchTraceService != null) {
                    launchTraceService.cancelTrace();
                }
                cosTimeList.clear();
                return;
            }
            ILaunchTrace launchTraceService2 = getLaunchTraceService();
            if (launchTraceService2 != null) {
                Activity mainActivity$initscheduler_release = InitScheduler.getMainActivity$initscheduler_release();
                launchTraceService2.endTrace(2, (mainActivity$initscheduler_release == null || (cls = mainActivity$initscheduler_release.getClass()) == null) ? null : cls.getName(), 20000L);
            }
            addDuration(ALL_FEED_FIRST_SHOWN, currentTimeMillis);
            com.bytedance.lego.init.z.a.a.a("", "onFeedFirstShown: cos " + currentTimeMillis + " ms.");
            if (monitorTaskTimeout) {
                return;
            }
            sendStartUpTimeAsync(com.heytap.mcssdk.constant.a.r);
        } catch (Exception e2) {
            ensureNotReachHere(e2, "ON_FEED_FIRST_SHOW_EXCEPTION");
            Category category = Category.OTHER_EXCEPTION;
            String name = e2.getClass().getName();
            l.b(name, "e.javaClass.name");
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("exception_detail", Log.getStackTraceString(e2));
            jSONObject.put("exception_detail", jSONObject2);
            monitorEvent(category, name, jSONObject);
        }
    }

    public final void onTaskTimeout(String str) {
        l.g(str, DBDefinition.TASK_ID);
        try {
            timeoutTaskList.add(str);
        } catch (Exception e2) {
            e2.printStackTrace();
            String stackTraceString = Log.getStackTraceString(e2);
            l.b(stackTraceString, "Log.getStackTraceString(e)");
            l.g("", "classname");
            l.g(stackTraceString, "message");
            Log.e("#inittask#", " " + stackTraceString);
        }
    }

    public final synchronized void sendStartUpTimeImmediately() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("curTime", System.currentTimeMillis() - onAttachBaseTime);
            Iterator<T> it2 = cosTimeList.iterator();
            while (it2.hasNext()) {
                Pair pair = (Pair) it2.next();
                String str = (String) pair.first;
                Object obj = pair.second;
                l.b(obj, "it.second");
                jSONObject.put(str, ((Number) obj).longValue());
            }
            com.bytedance.lego.init.z.a aVar = com.bytedance.lego.init.z.a.a;
            String jSONObject2 = jSONObject.toString();
            l.b(jSONObject2, "metric.toString()");
            aVar.a("sendStartUpTimeImmediately", jSONObject2);
            IApmAgent iApmAgent = (IApmAgent) x.b.a(IApmAgent.class);
            if (iApmAgent != null) {
                iApmAgent.monitorEvent(MONITOR_INIT, new JSONObject(), jSONObject, new JSONObject());
            }
        } catch (Exception e2) {
            com.bytedance.lego.init.z.a aVar2 = com.bytedance.lego.init.z.a.a;
            String stackTraceString = Log.getStackTraceString(e2);
            l.b(stackTraceString, "Log.getStackTraceString(e)");
            aVar2.a("", stackTraceString);
            Category category = Category.OTHER_EXCEPTION;
            String str2 = "sendStartUpTimeImmediately" + e2.getClass().getName();
            JSONObject jSONObject3 = new JSONObject();
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("exception_detail", Log.getStackTraceString(e2));
            jSONObject3.put("exception_detail", jSONObject4);
            monitorEvent(category, str2, jSONObject3);
        }
    }

    public final void monitorCosTime(g gVar, long j, boolean z) {
        l.g(gVar, "taskInfo");
        addDuration(getPeriodTaskTag(gVar, z), j);
    }

    public final void monitorCosTime(String str, long j, boolean z) {
        l.g(str, "name");
        addDuration(getMonitorTag(str, z), j);
    }

    public final void ensureNotReachHere(Throwable th) {
        l.g(th, "t");
        IEnsure iEnsure = (IEnsure) x.b.a(IEnsure.class);
        if (iEnsure != null) {
            iEnsure.ensureNotReachHere(th);
        }
    }
}
