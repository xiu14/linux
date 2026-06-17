package com.bytedance.lego.init;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.bytedance.lego.init.model.DelayTime;
import com.bytedance.lego.init.monitor.InitMonitor;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class a {
    private static volatile int b;

    /* renamed from: d, reason: collision with root package name */
    private static boolean f5289d;

    /* renamed from: e, reason: collision with root package name */
    private static volatile boolean f5290e;
    public static final a h = new a();
    private static final Map<DelayTime, PriorityQueue<com.bytedance.lego.init.model.b>> a = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    private static volatile AtomicInteger f5288c = new AtomicInteger(0);

    /* renamed from: f, reason: collision with root package name */
    private static long f5291f = -1;

    /* renamed from: g, reason: collision with root package name */
    private static final Handler f5292g = new Handler(Looper.getMainLooper(), C0261a.a);

    /* renamed from: com.bytedance.lego.init.a$a, reason: collision with other inner class name */
    static final class C0261a implements Handler.Callback {
        public static final C0261a a = new C0261a();

        /* compiled from: kotlin-style lambda group */
        /* renamed from: com.bytedance.lego.init.a$a$a, reason: collision with other inner class name */
        static final class C0262a extends kotlin.s.c.m implements kotlin.s.b.a<kotlin.o> {
            public static final C0262a b = new C0262a(0);

            /* renamed from: c, reason: collision with root package name */
            public static final C0262a f5293c = new C0262a(1);

            /* renamed from: d, reason: collision with root package name */
            public static final C0262a f5294d = new C0262a(2);

            /* renamed from: e, reason: collision with root package name */
            public static final C0262a f5295e = new C0262a(3);

            /* renamed from: f, reason: collision with root package name */
            public static final C0262a f5296f = new C0262a(4);

            /* renamed from: g, reason: collision with root package name */
            public static final C0262a f5297g = new C0262a(5);
            public static final C0262a h = new C0262a(6);
            public static final C0262a i = new C0262a(7);
            public static final C0262a j = new C0262a(8);
            public final /* synthetic */ int a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0262a(int i2) {
                super(0);
                this.a = i2;
            }

            @Override // kotlin.s.b.a
            public final kotlin.o invoke() {
                switch (this.a) {
                    case 0:
                        a aVar = a.h;
                        a.d(aVar);
                        a.a(aVar, (PriorityQueue) a.b(aVar).get(DelayTime.SECOND_5));
                        return kotlin.o.a;
                    case 1:
                        a aVar2 = a.h;
                        a.a(aVar2, (PriorityQueue) a.b(aVar2).get(DelayTime.SECOND_8));
                        return kotlin.o.a;
                    case 2:
                        a aVar3 = a.h;
                        a.a(aVar3, (PriorityQueue) a.b(aVar3).get(DelayTime.SECOND_15));
                        return kotlin.o.a;
                    case 3:
                        a aVar4 = a.h;
                        a.a(aVar4, (PriorityQueue) a.b(aVar4).get(DelayTime.SECOND_30));
                        return kotlin.o.a;
                    case 4:
                        a aVar5 = a.h;
                        a.a(aVar5, (PriorityQueue) a.b(aVar5).get(DelayTime.SECOND_60));
                        return kotlin.o.a;
                    case 5:
                        a aVar6 = a.h;
                        a.a(aVar6, (PriorityQueue) a.b(aVar6).get(DelayTime.MINUTE_2));
                        return kotlin.o.a;
                    case 6:
                        a aVar7 = a.h;
                        a.a(aVar7, (PriorityQueue) a.b(aVar7).get(DelayTime.MINUTE_5));
                        return kotlin.o.a;
                    case 7:
                        a aVar8 = a.h;
                        a.a(aVar8, (PriorityQueue) a.b(aVar8).get(DelayTime.MINUTE_10));
                        return kotlin.o.a;
                    case 8:
                        a aVar9 = a.h;
                        a.a(aVar9, (PriorityQueue) a.b(aVar9).get(DelayTime.MINUTE_15));
                        return kotlin.o.a;
                    default:
                        throw null;
                }
            }
        }

        C0261a() {
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0125, code lost:
        
            return true;
         */
        @Override // android.os.Handler.Callback
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean handleMessage(android.os.Message r7) {
            /*
                Method dump skipped, instructions count: 316
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.lego.init.a.C0261a.handleMessage(android.os.Message):boolean");
        }
    }

    private a() {
    }

    public static final void a(a aVar, PriorityQueue priorityQueue) {
        if (priorityQueue != null) {
            while (!priorityQueue.isEmpty()) {
                q.a(new c((com.bytedance.lego.init.model.b) priorityQueue.poll()));
            }
        }
    }

    public static final /* synthetic */ Map b(a aVar) {
        return a;
    }

    public static final /* synthetic */ long c(a aVar) {
        return f5291f;
    }

    public static final void d(a aVar) {
        List<com.bytedance.lego.init.model.b> d2;
        if (f5290e) {
            return;
        }
        f5290e = true;
        com.bytedance.lego.init.z.a aVar2 = com.bytedance.lego.init.z.a.a;
        StringBuilder M = e.a.a.a.a.M("initDelayTasks, curTimeFromCreateEnd: ");
        M.append(System.currentTimeMillis() - f5291f);
        aVar2.a("DelayTaskDispatcher", M.toString());
        long currentTimeMillis = System.currentTimeMillis();
        List<com.bytedance.lego.init.model.b> a2 = y.a();
        if (a2 != null) {
            for (com.bytedance.lego.init.model.b bVar : a2) {
                kotlin.s.c.l.b(bVar, "delayTaskInfo");
                if (com.bytedance.feedbackerlib.a.M(bVar)) {
                    Map<DelayTime, PriorityQueue<com.bytedance.lego.init.model.b>> map = a;
                    if (map.get(bVar.f5308f) == null) {
                        DelayTime delayTime = bVar.f5308f;
                        kotlin.s.c.l.b(delayTime, "delayTaskInfo.delayTime");
                        map.put(delayTime, new PriorityQueue<>());
                    }
                    PriorityQueue<com.bytedance.lego.init.model.b> priorityQueue = map.get(bVar.f5308f);
                    if (priorityQueue != null) {
                        priorityQueue.add(bVar);
                    }
                    b++;
                }
            }
        }
        long currentTimeMillis2 = System.currentTimeMillis();
        if (InitScheduler.INSTANCE.isDebug$initscheduler_release() && a2 != null) {
            StringBuilder sb = new StringBuilder("\n-------------------------   AllDelayTasks   ------------------------\n");
            kotlin.s.c.l.f(a2, "<this>");
            if (a2.size() <= 1) {
                d2 = kotlin.collections.g.e0(a2);
            } else {
                Object[] array = a2.toArray(new Comparable[0]);
                kotlin.s.c.l.d(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                kotlin.s.c.l.d(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.CollectionsKt___CollectionsKt.sorted>");
                Comparable[] comparableArr = (Comparable[]) array;
                kotlin.s.c.l.f(comparableArr, "<this>");
                if (comparableArr.length > 1) {
                    Arrays.sort(comparableArr);
                }
                d2 = kotlin.collections.g.d(comparableArr);
            }
            for (com.bytedance.lego.init.model.b bVar2 : d2) {
                if (com.bytedance.feedbackerlib.a.M(bVar2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(bVar2);
                    sb2.append('\n');
                    sb.append(sb2.toString());
                }
            }
            com.bytedance.lego.init.z.a aVar3 = com.bytedance.lego.init.z.a.a;
            String sb3 = sb.toString();
            kotlin.s.c.l.b(sb3, "sb.toString()");
            aVar3.a("DelayTaskDispatcher", sb3);
        }
        com.bytedance.lego.init.z.a aVar4 = com.bytedance.lego.init.z.a.a;
        StringBuilder M2 = e.a.a.a.a.M("init cos: ");
        long j = currentTimeMillis2 - currentTimeMillis;
        M2.append(j);
        aVar4.a("DelayTaskDispatcher", M2.toString());
        com.bytedance.lego.init.monitor.a aVar5 = com.bytedance.lego.init.monitor.a.f5317c;
        com.bytedance.lego.init.monitor.a.b("DelayTaskDispatcher.initDelayTasks", j, false);
    }

    public static final void e(a aVar, com.bytedance.lego.init.model.b bVar, boolean z) {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            com.bytedance.lego.init.monitor.a aVar2 = com.bytedance.lego.init.monitor.a.f5317c;
            com.bytedance.lego.init.monitor.a.c(bVar, z);
            com.bytedance.lego.init.z.a aVar3 = com.bytedance.lego.init.z.a.a;
            aVar3.a("DelayTaskDispatcher", bVar.a + " start. startTimeFromOnCreateEnd: " + (currentTimeMillis - f5291f));
            aVar3.a("DelayTaskDispatcher", bVar.a + " run. isUIThread: " + z);
            throw null;
        } catch (Exception e2) {
            StringBuilder M = e.a.a.a.a.M("\nerror!error!error!  ");
            M.append(bVar.a);
            M.append(" run error.\n");
            String sb = M.toString();
            kotlin.s.c.l.g("DelayTaskDispatcher", "classname");
            kotlin.s.c.l.g(sb, "message");
            Log.e("#inittask#", "DelayTaskDispatcher " + sb);
            String stackTraceString = Log.getStackTraceString(e2);
            kotlin.s.c.l.b(stackTraceString, "Log.getStackTraceString(e)");
            kotlin.s.c.l.g("DelayTaskDispatcher", "classname");
            kotlin.s.c.l.g(stackTraceString, "message");
            Log.e("#inittask#", "DelayTaskDispatcher " + stackTraceString);
            if (!InitScheduler.INSTANCE.getConfig$initscheduler_release().getCatchException()) {
                throw e2;
            }
            InitMonitor initMonitor = InitMonitor.INSTANCE;
            StringBuilder M2 = e.a.a.a.a.M("RUN_DELAY_TASK_EXCEPTION:");
            M2.append(bVar.a);
            initMonitor.ensureNotReachHere(e2, M2.toString());
        }
    }

    public final Handler f() {
        return f5292g;
    }

    public final synchronized void g() {
        if (f5289d) {
            return;
        }
        f5289d = true;
        f5291f = System.currentTimeMillis();
        com.bytedance.lego.init.z.a.a.a("DelayTaskDispatcher", "start, curTime: " + f5291f);
        com.bytedance.lego.init.monitor.a aVar = com.bytedance.lego.init.monitor.a.f5317c;
        com.bytedance.lego.init.monitor.a.d(f5291f);
        Handler handler = f5292g;
        handler.sendEmptyMessageDelayed(1001, com.heytap.mcssdk.constant.a.r);
        handler.sendEmptyMessageDelayed(1002, 8000L);
        handler.sendEmptyMessageDelayed(1003, 15000L);
        handler.sendEmptyMessageDelayed(1004, 30000L);
        handler.sendEmptyMessageDelayed(1005, com.heytap.mcssdk.constant.a.f6886d);
        handler.sendEmptyMessageDelayed(1006, 120000L);
        handler.sendEmptyMessageDelayed(1007, 300000L);
        handler.sendEmptyMessageDelayed(1008, 600000L);
        handler.sendEmptyMessageDelayed(1009, com.heytap.mcssdk.constant.a.h);
    }
}
