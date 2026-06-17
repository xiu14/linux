package com.bytedance.lego.init;

import com.bytedance.lego.init.model.ExecutionPeriod;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class v {
    private static volatile boolean b;

    /* renamed from: c, reason: collision with root package name */
    private static volatile boolean f5330c;

    /* renamed from: d, reason: collision with root package name */
    public static final v f5331d = new v();
    private static final Map<ExecutionPeriod, List<com.bytedance.lego.init.model.g>> a = new LinkedHashMap();

    private v() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f(ExecutionPeriod executionPeriod, boolean z) {
        List<com.bytedance.lego.init.model.g> list = a.get(executionPeriod);
        if (list != null) {
            Iterator<T> it2 = list.iterator();
            if (it2.hasNext()) {
                Objects.requireNonNull((com.bytedance.lego.init.model.g) it2.next());
                throw null;
            }
        }
    }

    static /* synthetic */ void g(v vVar, ExecutionPeriod executionPeriod, boolean z, int i) {
        if ((i & 2) != 0) {
            z = false;
        }
        vVar.f(executionPeriod, z);
    }

    public final void h() {
        List<com.bytedance.lego.init.model.g> c2 = y.c();
        kotlin.s.c.l.b(c2, "TaskCollectorManager.getAllPeriodTaskInfo()");
        for (com.bytedance.lego.init.model.g gVar : c2) {
            Map<ExecutionPeriod, List<com.bytedance.lego.init.model.g>> map = a;
            kotlin.s.c.l.b(gVar, "taskInfo");
            List<com.bytedance.lego.init.model.g> list = map.get(ExecutionPeriod.from(null));
            if (list == null) {
                list = new ArrayList<>();
                ExecutionPeriod from = ExecutionPeriod.from(null);
                kotlin.s.c.l.b(from, "taskInfo.executionPeriod");
                map.put(from, list);
            }
            list.add(gVar);
        }
        if (InitScheduler.INSTANCE.isDebug$initscheduler_release()) {
            StringBuilder sb = new StringBuilder("------------------------------ AllPeriodTask --------------------------------\n");
            for (Map.Entry<ExecutionPeriod, List<com.bytedance.lego.init.model.g>> entry : a.entrySet()) {
                if (!entry.getValue().isEmpty()) {
                    sb.append(entry.getKey().name() + ": ");
                    Iterator<T> it2 = entry.getValue().iterator();
                    while (it2.hasNext()) {
                        Objects.requireNonNull((com.bytedance.lego.init.model.g) it2.next());
                        sb.append("null ");
                    }
                    sb.append("\n");
                }
            }
            com.bytedance.lego.init.z.a aVar = com.bytedance.lego.init.z.a.a;
            String sb2 = sb.toString();
            kotlin.s.c.l.b(sb2, "totalInfo.toString()");
            aVar.a("PeriodTaskManager", sb2);
        }
    }
}
