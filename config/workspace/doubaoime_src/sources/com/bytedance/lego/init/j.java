package com.bytedance.lego.init;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.MessageQueue;
import com.bytedance.lego.init.tasks.IdleTaskProxy;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

@SuppressLint({"CI_ByteDanceKotlinRules_Static_Names"})
/* loaded from: classes.dex */
public final class j {
    private static IdleTaskConfig a;
    private static final ArrayList<com.bytedance.lego.init.model.e> b;

    /* renamed from: c, reason: collision with root package name */
    private static final ArrayList<com.bytedance.lego.init.model.e> f5300c;

    /* renamed from: d, reason: collision with root package name */
    private static volatile AtomicInteger f5301d;

    /* renamed from: e, reason: collision with root package name */
    private static int f5302e;

    /* renamed from: f, reason: collision with root package name */
    private static final Handler f5303f;

    /* renamed from: g, reason: collision with root package name */
    private static volatile boolean f5304g;
    private static final b h;
    public static final j i = new j();

    static final class a implements Runnable {
        public static final a a = new a();

        a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            InitScheduler.startDispatchIdleTask();
        }
    }

    public static final class b implements MessageQueue.IdleHandler {
        b() {
        }

        @Override // android.os.MessageQueue.IdleHandler
        public boolean queueIdle() {
            j jVar = j.i;
            if (!j.b(jVar)) {
                return true;
            }
            j.c(jVar);
            return (jVar.f().isEmpty() ^ true) || (jVar.g().isEmpty() ^ true);
        }
    }

    static {
        IdleTaskConfig idleTaskConfig;
        Objects.requireNonNull(IdleTaskConfig.Companion);
        idleTaskConfig = IdleTaskConfig.DEFAULT_IDLETASK_CONFIG;
        a = idleTaskConfig;
        b = new ArrayList<>();
        f5300c = new ArrayList<>();
        f5301d = new AtomicInteger(0);
        f5303f = new Handler(Looper.getMainLooper());
        h = new b();
    }

    private j() {
    }

    public static final void a(j jVar) {
        if (f5301d.incrementAndGet() != f5302e) {
            return;
        }
        q.a(i.a);
    }

    public static final /* synthetic */ boolean b(j jVar) {
        return f5304g;
    }

    public static final boolean c(j jVar) {
        int min = Math.min(b.size(), a.getUiThreadTaskNum());
        int i2 = 0;
        boolean z = false;
        while (i2 < min) {
            kotlin.s.c.l.b(b.remove(0), "uiTaskList.removeAt(0)");
            kotlin.s.c.l.b(null, "task.task");
            kotlin.s.c.l.b(null, "task.taskId");
            new IdleTaskProxy(null, null, true, m.a).run();
            i2++;
            z = true;
        }
        if (!z) {
            int min2 = Math.min(f5300c.size(), a.getNonUIThreadTaskNum());
            int i3 = 0;
            z = false;
            while (i3 < min2) {
                com.bytedance.lego.init.model.e remove = f5300c.remove(0);
                kotlin.s.c.l.b(remove, "nonUiTaskList.removeAt(0)");
                q.a(new l(remove));
                i3++;
                z = true;
            }
        }
        return z;
    }

    public final void d() {
        if (InitScheduler.INSTANCE.getConfig$initscheduler_release().isMainProcess() && !f5304g) {
            f5304g = true;
            ArrayList<com.bytedance.lego.init.model.e> arrayList = b;
            arrayList.addAll(y.f());
            ArrayList<com.bytedance.lego.init.model.e> arrayList2 = f5300c;
            arrayList2.addAll(y.e());
            int size = arrayList2.size() + arrayList.size();
            f5302e = size;
            if (size == 0) {
                return;
            }
            Looper.myQueue().addIdleHandler(h);
        }
    }

    public final void e(IdleTaskConfig idleTaskConfig) {
        kotlin.s.c.l.g(idleTaskConfig, "config");
        if (InitScheduler.INSTANCE.getConfig$initscheduler_release().isMainProcess()) {
            f5304g = false;
            a = idleTaskConfig;
            if (idleTaskConfig.getAutoIdleTask()) {
                f5303f.postDelayed(a.a, a.getBootFinishTimeOut());
            }
        }
    }

    public final ArrayList<com.bytedance.lego.init.model.e> f() {
        return f5300c;
    }

    public final ArrayList<com.bytedance.lego.init.model.e> g() {
        return b;
    }
}
