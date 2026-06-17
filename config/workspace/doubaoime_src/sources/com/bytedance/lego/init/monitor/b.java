package com.bytedance.lego.init.monitor;

import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.g;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public final class b {
    private static long a;
    private static final CopyOnWriteArrayList<g<String, Long>> b = new CopyOnWriteArrayList<>();

    /* renamed from: c, reason: collision with root package name */
    public static final b f5318c = null;

    private static final void a(String str, long j) {
        b.add(new g<>(str, Long.valueOf(j)));
    }

    public static final void b(com.bytedance.lego.init.model.c cVar, boolean z) {
        l.g(cVar, "taskInfo");
        if (a <= 0) {
            return;
        }
        a(z ? e.a.a.a.a.J(e.a.a.a.a.M(InitMonitor.MAIN), cVar.a, "_TASKSTART") : e.a.a.a.a.J(e.a.a.a.a.M(InitMonitor.ASYNC), cVar.a, "_TASKSTART"), System.currentTimeMillis() - a);
    }

    public static final void c() {
        a = System.currentTimeMillis();
    }
}
