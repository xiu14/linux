package com.bytedance.lego.init;

import android.app.Activity;
import android.util.Log;
import androidx.annotation.UiThread;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.os.TraceCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.lego.init.config.ProcessMatchMode;
import com.bytedance.lego.init.config.TaskConfig;
import com.bytedance.lego.init.model.ExecutionPeriod;
import com.bytedance.lego.init.model.InitPeriod;
import com.bytedance.lego.init.monitor.Category;
import com.bytedance.lego.init.monitor.InitMonitor;
import java.lang.ref.WeakReference;
import java.util.Objects;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class InitScheduler {
    public static TaskConfig config;
    private static WeakReference<Activity> mainActivityWR;
    private static WeakReference<Activity> splashActivityWR;
    private static ThreadPoolExecutor taskExecutor;
    public static final InitScheduler INSTANCE = new InitScheduler();
    private static final String INIT_SCHEDULER_CATEGORY = INIT_SCHEDULER_CATEGORY;
    private static final String INIT_SCHEDULER_CATEGORY = INIT_SCHEDULER_CATEGORY;

    private InitScheduler() {
    }

    public static final void afterPrivacyPopupWindow() {
        try {
            Objects.requireNonNull(r.p);
            com.bytedance.lego.init.z.a.a.a("", "startPrivacyTask");
            q.a(t.a);
        } catch (Exception e2) {
            e2.printStackTrace();
            if (!INSTANCE.enableCatchException()) {
                throw e2;
            }
            InitMonitor.INSTANCE.ensureNotReachHere(e2, "START_DELAY_TASK_DISPATCHER");
        }
        TaskConfig taskConfig = config;
        if (taskConfig != null) {
            taskConfig.setAgreePrivacyPopupWindow(true);
        } else {
            kotlin.s.c.l.l("config");
            throw null;
        }
    }

    public static final void config(TaskConfig taskConfig) {
        kotlin.s.c.l.g(taskConfig, "config");
        config = taskConfig;
        j.i.e(taskConfig.getIdleTaskConfig());
        com.bytedance.lego.init.monitor.c.f5321e.g(taskConfig.getApplicationStartTime());
    }

    public static final Activity getMainActivity$initscheduler_release() {
        WeakReference<Activity> weakReference = mainActivityWR;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public static final Activity getSplashActivity$initscheduler_release() {
        WeakReference<Activity> weakReference = splashActivityWR;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public static final void initPeriodTask() {
        kotlin.s.c.l.g("initPeriodTask", "message");
        if (INSTANCE.isDebug$initscheduler_release()) {
            TraceCompat.beginSection("Task:initPeriodTask");
        }
        v.f5331d.h();
        if (INSTANCE.isDebug$initscheduler_release()) {
            TraceCompat.endSection();
        }
    }

    public static final void initTasks() {
        kotlin.s.c.l.g("initTasks", "message");
        if (INSTANCE.isDebug$initscheduler_release()) {
            TraceCompat.beginSection("Task:initTasks");
        }
        r.p.e();
        if (INSTANCE.isDebug$initscheduler_release()) {
            TraceCompat.endSection();
        }
    }

    @UiThread
    public static final void onFeedShow() {
        TaskConfig taskConfig = config;
        if (taskConfig == null) {
            kotlin.s.c.l.l("config");
            throw null;
        }
        taskConfig.isDebug();
        try {
            d.f5299d.c();
        } catch (Exception e2) {
            e2.printStackTrace();
            if (!INSTANCE.enableCatchException()) {
                throw e2;
            }
            InitMonitor.INSTANCE.ensureNotReachHere(e2, "START_FEED_SHOW_TASK_DISPATCHER");
        }
    }

    @UiThread
    public static final void onPeriodEnd(InitPeriod initPeriod) {
        kotlin.s.c.l.g(initPeriod, TypedValues.CycleType.S_WAVE_PERIOD);
        try {
            r.p.f(initPeriod, true);
        } catch (Exception e2) {
            e2.printStackTrace();
            InitMonitor initMonitor = InitMonitor.INSTANCE;
            Category category = Category.ON_PERIOD_EXCEPTION;
            String name = initPeriod.name();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("exception_detail", Log.getStackTraceString(e2));
            initMonitor.monitorEvent(category, name, jSONObject);
            TaskConfig taskConfig = config;
            if (taskConfig == null) {
                kotlin.s.c.l.l("config");
                throw null;
            }
            if (!taskConfig.getCatchException()) {
                throw e2;
            }
            StringBuilder M = e.a.a.a.a.M("ON_PERIOD_EXCEPTION:");
            M.append(initPeriod.name());
            initMonitor.ensureNotReachHere(e2, M.toString());
        }
    }

    @UiThread
    public static final void onPeriodStart(InitPeriod initPeriod) {
        kotlin.s.c.l.g(initPeriod, TypedValues.CycleType.S_WAVE_PERIOD);
        TaskConfig taskConfig = config;
        if (taskConfig == null) {
            kotlin.s.c.l.l("config");
            throw null;
        }
        taskConfig.isDebug();
        try {
            r.p.f(initPeriod, false);
        } catch (Exception e2) {
            e2.printStackTrace();
            InitMonitor initMonitor = InitMonitor.INSTANCE;
            Category category = Category.ON_PERIOD_EXCEPTION;
            String name = initPeriod.name();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("exception_detail", Log.getStackTraceString(e2));
            initMonitor.monitorEvent(category, name, jSONObject);
            TaskConfig taskConfig2 = config;
            if (taskConfig2 == null) {
                kotlin.s.c.l.l("config");
                throw null;
            }
            if (!taskConfig2.getCatchException()) {
                throw e2;
            }
            StringBuilder M = e.a.a.a.a.M("ON_PERIOD_EXCEPTION:");
            M.append(initPeriod.name());
            initMonitor.ensureNotReachHere(e2, M.toString());
        }
    }

    public static final void registerMainActivity(Activity activity) {
        kotlin.s.c.l.g(activity, "mainActivity");
        mainActivityWR = new WeakReference<>(activity);
        boolean z = activity instanceof LifecycleOwner;
        Object obj = activity;
        if (!z) {
            obj = null;
        }
        LifecycleOwner lifecycleOwner = (LifecycleOwner) obj;
        Lifecycle lifecycle = lifecycleOwner != null ? lifecycleOwner.getLifecycle() : null;
        if (lifecycle == null) {
            throw new IllegalArgumentException("mainActivity must be LifecycleOwner.");
        }
        v vVar = v.f5331d;
        kotlin.s.c.l.g(lifecycle, "lifecycle");
        lifecycle.addObserver(new LifecycleObserver() { // from class: com.bytedance.lego.init.PeriodTaskManager$registerMain$1
            @OnLifecycleEvent(Lifecycle.Event.ON_ANY)
            public final void onAny() {
                boolean z2;
                v vVar2 = v.f5331d;
                ExecutionPeriod executionPeriod = ExecutionPeriod.MAIN_ON_ANY;
                z2 = v.b;
                vVar2.f(executionPeriod, !z2);
            }

            @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
            public final void onCreate() {
                boolean z2;
                com.bytedance.lego.init.z.a.a.a("PeriodTaskManager", "main - onCreate");
                v vVar2 = v.f5331d;
                ExecutionPeriod executionPeriod = ExecutionPeriod.MAIN_ON_CREATE;
                z2 = v.b;
                vVar2.f(executionPeriod, !z2);
            }

            @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
            public final void onDestroy() {
                com.bytedance.lego.init.z.a.a.a("PeriodTaskManager", "main - onDestroy");
                try {
                    v.g(v.f5331d, ExecutionPeriod.MAIN_ON_DESTROY, false, 2);
                    InitScheduler.unRegisterMainActivity$initscheduler_release();
                } catch (Exception e2) {
                    InitMonitor.INSTANCE.ensureNotReachHere(e2, "MAIN_ON_DESTROY_EXCEPTION");
                }
            }

            @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
            public final void onPause() {
                com.bytedance.lego.init.z.a.a.a("PeriodTaskManager", "main - onPause");
                v.g(v.f5331d, ExecutionPeriod.MAIN_ON_PAUSE, false, 2);
            }

            @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
            public final void onResume() {
                boolean z2;
                com.bytedance.lego.init.z.a.a.a("PeriodTaskManager", "main - onResume");
                v vVar2 = v.f5331d;
                ExecutionPeriod executionPeriod = ExecutionPeriod.MAIN_ON_RESUME;
                z2 = v.b;
                vVar2.f(executionPeriod, !z2);
                v.b = true;
            }

            @OnLifecycleEvent(Lifecycle.Event.ON_START)
            public final void onStart() {
                boolean z2;
                com.bytedance.lego.init.z.a.a.a("PeriodTaskManager", "main - onStart");
                v vVar2 = v.f5331d;
                ExecutionPeriod executionPeriod = ExecutionPeriod.MAIN_ON_START;
                z2 = v.b;
                vVar2.f(executionPeriod, !z2);
            }

            @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
            public final void onStop() {
                com.bytedance.lego.init.z.a.a.a("PeriodTaskManager", "main - onStop");
                v.g(v.f5331d, ExecutionPeriod.MAIN_ON_STOP, false, 2);
            }
        });
    }

    public static final void registerSplashActivity(Activity activity) {
        kotlin.s.c.l.g(activity, "splashActivity");
        splashActivityWR = new WeakReference<>(activity);
        boolean z = activity instanceof LifecycleOwner;
        Object obj = activity;
        if (!z) {
            obj = null;
        }
        LifecycleOwner lifecycleOwner = (LifecycleOwner) obj;
        Lifecycle lifecycle = lifecycleOwner != null ? lifecycleOwner.getLifecycle() : null;
        if (lifecycle == null) {
            throw new IllegalArgumentException("splashActivity must be LifecycleOwner.");
        }
        v vVar = v.f5331d;
        kotlin.s.c.l.g(lifecycle, "lifecycle");
        lifecycle.addObserver(new LifecycleObserver() { // from class: com.bytedance.lego.init.PeriodTaskManager$registerSplash$1
            @OnLifecycleEvent(Lifecycle.Event.ON_ANY)
            public final void onAny() {
                boolean z2;
                v vVar2 = v.f5331d;
                ExecutionPeriod executionPeriod = ExecutionPeriod.SPLASH_ON_ANY;
                z2 = v.f5330c;
                vVar2.f(executionPeriod, !z2);
            }

            @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
            public final void onCreate() {
                boolean z2;
                com.bytedance.lego.init.z.a.a.a("PeriodTaskManager", "splash - onCreate");
                v vVar2 = v.f5331d;
                ExecutionPeriod executionPeriod = ExecutionPeriod.SPLASH_ON_CREATE;
                z2 = v.f5330c;
                vVar2.f(executionPeriod, !z2);
            }

            @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
            public final void onDestroy() {
                com.bytedance.lego.init.z.a.a.a("PeriodTaskManager", "splash - onDestroy");
                try {
                    v.g(v.f5331d, ExecutionPeriod.SPLASH_ON_DESTROY, false, 2);
                    InitScheduler.unRegisterSplashActivity$initscheduler_release();
                } catch (Exception e2) {
                    InitMonitor.INSTANCE.ensureNotReachHere(e2, "SPALSH_ON_DESTROY_EXCEPTION");
                }
            }

            @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
            public final void onPause() {
                com.bytedance.lego.init.z.a.a.a("PeriodTaskManager", "splash - onPause");
                v.g(v.f5331d, ExecutionPeriod.SPLASH_ON_PAUSE, false, 2);
            }

            @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
            public final void onResume() {
                boolean z2;
                com.bytedance.lego.init.z.a.a.a("PeriodTaskManager", "splash - onResume");
                v vVar2 = v.f5331d;
                ExecutionPeriod executionPeriod = ExecutionPeriod.SPLASH_ON_RESUME;
                z2 = v.f5330c;
                vVar2.f(executionPeriod, !z2);
                v.f5330c = true;
            }

            @OnLifecycleEvent(Lifecycle.Event.ON_START)
            public final void onStart() {
                boolean z2;
                com.bytedance.lego.init.z.a.a.a("PeriodTaskManager", "splash - onStart");
                v vVar2 = v.f5331d;
                ExecutionPeriod executionPeriod = ExecutionPeriod.SPLASH_ON_START;
                z2 = v.f5330c;
                vVar2.f(executionPeriod, !z2);
            }

            @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
            public final void onStop() {
                com.bytedance.lego.init.z.a.a.a("PeriodTaskManager", "splash - onStop");
                v.g(v.f5331d, ExecutionPeriod.SPLASH_ON_STOP, false, 2);
            }
        });
    }

    public static final void setExecutorService(ThreadPoolExecutor threadPoolExecutor) {
        kotlin.s.c.l.g(threadPoolExecutor, "executor");
        taskExecutor = threadPoolExecutor;
    }

    public static final void setServiceManagerProxy(h hVar) {
        kotlin.s.c.l.g(hVar, "proxy");
        x.b.b(hVar);
    }

    @UiThread
    public static final void startDispatchDelayTask() {
        TaskConfig taskConfig = config;
        if (taskConfig == null) {
            kotlin.s.c.l.l("config");
            throw null;
        }
        taskConfig.isDebug();
        try {
            a.h.g();
        } catch (Exception e2) {
            e2.printStackTrace();
            if (!INSTANCE.enableCatchException()) {
                throw e2;
            }
            InitMonitor.INSTANCE.ensureNotReachHere(e2, "START_DELAY_TASK_DISPATCHER");
        }
    }

    @UiThread
    public static final void startDispatchIdleTask() {
        try {
            j.i.d();
        } catch (Exception e2) {
            e2.printStackTrace();
            if (!INSTANCE.enableCatchException()) {
                throw e2;
            }
            InitMonitor.INSTANCE.ensureNotReachHere(e2, "START_IDLE_TASK_DISPATCHER");
        }
    }

    public static final void unRegisterMainActivity$initscheduler_release() {
        WeakReference<Activity> weakReference = mainActivityWR;
        if (weakReference != null) {
            weakReference.clear();
        }
    }

    public static final void unRegisterSplashActivity$initscheduler_release() {
        WeakReference<Activity> weakReference = splashActivityWR;
        if (weakReference != null) {
            weakReference.clear();
        }
    }

    public final boolean enableCatchException() {
        TaskConfig taskConfig = config;
        if (taskConfig != null) {
            return taskConfig.getCatchException();
        }
        kotlin.s.c.l.l("config");
        throw null;
    }

    public final TaskConfig getConfig$initscheduler_release() {
        TaskConfig taskConfig = config;
        if (taskConfig != null) {
            return taskConfig;
        }
        kotlin.s.c.l.l("config");
        throw null;
    }

    public final ThreadPoolExecutor getExecutorService$initscheduler_release() {
        ThreadPoolExecutor threadPoolExecutor = taskExecutor;
        if (threadPoolExecutor != null) {
            if (threadPoolExecutor != null) {
                return threadPoolExecutor;
            }
            kotlin.s.c.l.k();
            throw null;
        }
        TaskConfig taskConfig = config;
        if (taskConfig == null) {
            kotlin.s.c.l.l("config");
            throw null;
        }
        ThreadPoolExecutor taskExecutor2 = taskConfig.getTaskExecutor();
        if (taskExecutor2 != null) {
            return taskExecutor2;
        }
        kotlin.s.c.l.k();
        throw null;
    }

    public final ThreadPoolExecutor getExecutorServiceOrNull$initscheduler_release() {
        ThreadPoolExecutor threadPoolExecutor = taskExecutor;
        if (threadPoolExecutor != null) {
            return threadPoolExecutor;
        }
        try {
            TaskConfig taskConfig = config;
            if (taskConfig != null) {
                return taskConfig.getTaskExecutor();
            }
            kotlin.s.c.l.l("config");
            throw null;
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public final String getINIT_SCHEDULER_CATEGORY$initscheduler_release() {
        return INIT_SCHEDULER_CATEGORY;
    }

    public final ProcessMatchMode getProcessMatchMode$initscheduler_release() {
        TaskConfig taskConfig = config;
        if (taskConfig != null) {
            return taskConfig.getMode();
        }
        kotlin.s.c.l.l("config");
        throw null;
    }

    public final boolean isDebug$initscheduler_release() {
        try {
            TaskConfig taskConfig = config;
            if (taskConfig != null) {
                return taskConfig.isDebug();
            }
            kotlin.s.c.l.l("config");
            throw null;
        } catch (Exception e2) {
            e2.printStackTrace();
            return true;
        }
    }

    public final void setConfig$initscheduler_release(TaskConfig taskConfig) {
        kotlin.s.c.l.g(taskConfig, "<set-?>");
        config = taskConfig;
    }
}
