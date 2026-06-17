package com.bytedance.lego.init;

import android.util.Log;
import com.bytedance.lego.init.monitor.InitMonitor;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: c, reason: collision with root package name */
    private static boolean f5298c;

    /* renamed from: d, reason: collision with root package name */
    public static final d f5299d = new d();
    private static volatile AtomicInteger a = new AtomicInteger(0);
    private static final List<com.bytedance.lego.init.model.c> b = new ArrayList();

    static final class a implements Runnable {
        public static final a a = new a();

        /* renamed from: com.bytedance.lego.init.d$a$a, reason: collision with other inner class name */
        static final class RunnableC0263a implements Runnable {
            final /* synthetic */ com.bytedance.lego.init.model.c a;

            RunnableC0263a(com.bytedance.lego.init.model.c cVar) {
                this.a = cVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                d.b(d.f5299d, this.a, true);
            }
        }

        a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            d dVar = d.f5299d;
            List a2 = d.a(dVar);
            List<com.bytedance.lego.init.model.c> b = y.b();
            kotlin.s.c.l.b(b, "TaskCollectorManager.getAllFeedShowTaskInfo()");
            a2.addAll(b);
            kotlin.collections.g.X(d.a(dVar));
            List<com.bytedance.lego.init.model.c> a3 = d.a(dVar);
            if (InitScheduler.INSTANCE.isDebug$initscheduler_release() && a3 != null) {
                StringBuilder sb = new StringBuilder("\n-------------------------   AllFeedShowTasks   ------------------------\n");
                for (com.bytedance.lego.init.model.c cVar : a3) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(cVar);
                    sb2.append('\n');
                    sb.append(sb2.toString());
                }
                com.bytedance.lego.init.z.a aVar = com.bytedance.lego.init.z.a.a;
                String sb3 = sb.toString();
                kotlin.s.c.l.b(sb3, "sb.toString()");
                aVar.a("FeedShowTaskDispatcher", sb3);
            }
            for (com.bytedance.lego.init.model.c cVar2 : d.a(d.f5299d)) {
                if (cVar2.f5310c) {
                    com.bytedance.lego.init.a.h.f().post(new RunnableC0263a(cVar2));
                } else {
                    d.b(d.f5299d, cVar2, false);
                }
            }
        }
    }

    private d() {
    }

    public static final /* synthetic */ List a(d dVar) {
        return b;
    }

    public static final void b(d dVar, com.bytedance.lego.init.model.c cVar, boolean z) {
        try {
            System.currentTimeMillis();
            com.bytedance.lego.init.monitor.b bVar = com.bytedance.lego.init.monitor.b.f5318c;
            com.bytedance.lego.init.monitor.b.b(cVar, z);
            com.bytedance.lego.init.z.a.a.a("FeedShowTaskDispatcher", cVar.a + " start. isUIThread: " + z);
            throw null;
        } catch (Exception e2) {
            e2.printStackTrace();
            String str = "\nerror!error!error!  " + cVar.a + " run error.\n";
            kotlin.s.c.l.g("FeedShowTaskDispatcher", "classname");
            kotlin.s.c.l.g(str, "message");
            Log.e("#inittask#", "FeedShowTaskDispatcher " + str);
            String stackTraceString = Log.getStackTraceString(e2);
            kotlin.s.c.l.b(stackTraceString, "Log.getStackTraceString(e)");
            kotlin.s.c.l.g("FeedShowTaskDispatcher", "classname");
            kotlin.s.c.l.g(stackTraceString, "message");
            Log.e("#inittask#", "FeedShowTaskDispatcher " + stackTraceString);
            if (!InitScheduler.INSTANCE.getConfig$initscheduler_release().getCatchException()) {
                throw e2;
            }
            InitMonitor initMonitor = InitMonitor.INSTANCE;
            StringBuilder M = e.a.a.a.a.M("RUN_FEED_SHOW_TASK_EXCEPTION:");
            M.append(cVar.a);
            initMonitor.ensureNotReachHere(e2, M.toString());
        }
    }

    public final synchronized void c() {
        if (f5298c) {
            return;
        }
        f5298c = true;
        new Thread(a.a, "A-FeedShowTaskDispatcher").start();
    }
}
