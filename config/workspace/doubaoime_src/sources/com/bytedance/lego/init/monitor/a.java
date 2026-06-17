package com.bytedance.lego.init.monitor;

import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.g;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public final class a {
    private static final CopyOnWriteArrayList<g<String, Long>> a = new CopyOnWriteArrayList<>();
    private static long b = -1;

    /* renamed from: c, reason: collision with root package name */
    public static final a f5317c = null;

    private static final void a(String str, long j) {
        a.add(new g<>(str, Long.valueOf(j)));
    }

    public static final void b(String str, long j, boolean z) {
        l.g(str, "name");
        a(z ? e.a.a.a.a.s(InitMonitor.MAIN, str) : e.a.a.a.a.s(InitMonitor.ASYNC, str), j);
    }

    public static final void c(com.bytedance.lego.init.model.b bVar, boolean z) {
        l.g(bVar, "taskInfo");
        if (b < 0) {
            return;
        }
        a(z ? e.a.a.a.a.J(e.a.a.a.a.M(InitMonitor.MAIN), bVar.a, "_TASKSTART") : e.a.a.a.a.J(e.a.a.a.a.M(InitMonitor.ASYNC), bVar.a, "_TASKSTART"), System.currentTimeMillis() - b);
    }

    public static final void d(long j) {
        b = j;
    }
}
