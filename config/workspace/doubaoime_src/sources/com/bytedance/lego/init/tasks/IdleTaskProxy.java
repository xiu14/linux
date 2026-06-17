package com.bytedance.lego.init.tasks;

import android.util.Log;
import com.bytedance.lego.init.InitScheduler;
import com.bytedance.lego.init.model.a;
import com.bytedance.lego.init.monitor.InitMonitor;
import com.bytedance.lego.init.monitor.c;
import com.ss.android.socialbase.downloader.constants.DBDefinition;
import kotlin.o;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public final class IdleTaskProxy extends a {
    private final a a;
    private final String b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f5328c;

    /* renamed from: d, reason: collision with root package name */
    private final kotlin.s.b.a<o> f5329d;

    public IdleTaskProxy(a aVar, String str, boolean z, kotlin.s.b.a<o> aVar2) {
        l.g(aVar, "origin");
        l.g(str, DBDefinition.TASK_ID);
        l.g(aVar2, "executeFinish");
        this.a = aVar;
        this.b = str;
        this.f5328c = z;
        this.f5329d = aVar2;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            c cVar = c.f5321e;
            cVar.d(this.b, this.f5328c);
            this.a.run();
            long currentTimeMillis2 = System.currentTimeMillis();
            cVar.c(this.b, this.f5328c);
            long j = currentTimeMillis2 - currentTimeMillis;
            cVar.b(this.b, j, this.f5328c);
            com.bytedance.lego.init.z.a.a.a("IdleTaskDispatcher", this.b + " end. cos " + j + " ms.");
        } catch (Throwable th) {
            th.printStackTrace();
            String str = "\nerror!error!error!  " + this.b + " run error.\n";
            l.g("IdleTaskDispatcher", "classname");
            l.g(str, "message");
            Log.e("#inittask#", "IdleTaskDispatcher " + str);
            String stackTraceString = Log.getStackTraceString(th);
            l.b(stackTraceString, "Log.getStackTraceString(e)");
            l.g("IdleTaskDispatcher", "classname");
            l.g(stackTraceString, "message");
            Log.e("#inittask#", "IdleTaskDispatcher " + stackTraceString);
            if (!InitScheduler.INSTANCE.getConfig$initscheduler_release().getCatchException()) {
                throw th;
            }
            InitMonitor initMonitor = InitMonitor.INSTANCE;
            StringBuilder M = e.a.a.a.a.M("RUN_IDLE_TASK_EXCEPTION:");
            M.append(this.b);
            initMonitor.ensureNotReachHere(th, M.toString());
        }
        this.f5329d.invoke();
    }
}
