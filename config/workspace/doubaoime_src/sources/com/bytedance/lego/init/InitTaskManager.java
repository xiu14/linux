package com.bytedance.lego.init;

import androidx.annotation.UiThread;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bytedance.lego.init.model.InitPeriod;
import com.bytedance.lego.init.monitor.Category;
import com.bytedance.lego.init.monitor.InitMonitor;
import com.ss.android.socialbase.downloader.constants.DBDefinition;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class InitTaskManager {
    private Map<String, com.bytedance.lego.init.model.f> taskIndex = new LinkedHashMap();
    private final ArrayList<com.bytedance.lego.init.model.f> unDispatchTask = new ArrayList<>();
    private final PriorityBlockingQueue<com.bytedance.lego.init.model.f> uiReadyQueue = new PriorityBlockingQueue<>();
    private final PriorityBlockingQueue<com.bytedance.lego.init.model.f> nonUiReadyQueue = new PriorityBlockingQueue<>();
    private final Object readWriteLock = new Object();
    private AtomicInteger completedTaskCount = new AtomicInteger(0);
    private final String TAG = "InitTaskManager";

    private final boolean hasNonUiTask() {
        synchronized (this.readWriteLock) {
            if (!this.nonUiReadyQueue.isEmpty()) {
                return true;
            }
            Iterator<T> it2 = this.unDispatchTask.iterator();
            while (it2.hasNext()) {
                if (!((com.bytedance.lego.init.model.f) it2.next()).f5312c) {
                    return true;
                }
            }
            return false;
        }
    }

    private final void initReadyQueue() {
        Collection<com.bytedance.lego.init.model.f> values = this.taskIndex.values();
        if (values != null) {
            for (com.bytedance.lego.init.model.f fVar : values) {
                List<String> list = fVar.h;
                if (list == null || list.isEmpty()) {
                    letTaskReady(fVar);
                }
            }
        }
    }

    private final void letTaskReady(com.bytedance.lego.init.model.f fVar) {
        com.bytedance.lego.init.z.a aVar = com.bytedance.lego.init.z.a.a;
        String str = this.TAG;
        StringBuilder M = e.a.a.a.a.M("letTaskReady: ");
        M.append(fVar.a);
        aVar.a(str, M.toString());
        if (fVar.f5312c) {
            this.uiReadyQueue.add(fVar);
        } else {
            this.nonUiReadyQueue.add(fVar);
        }
        this.unDispatchTask.remove(fVar);
    }

    public static /* synthetic */ com.bytedance.lego.init.model.f takeNonUiTaskIfExist$default(InitTaskManager initTaskManager, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            l = null;
        }
        return initTaskManager.takeNonUiTaskIfExist(l);
    }

    @UiThread
    public static /* synthetic */ com.bytedance.lego.init.model.f takeUiTaskIfExist$default(InitTaskManager initTaskManager, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 5;
        }
        return initTaskManager.takeUiTaskIfExist(j);
    }

    public final void beforeSendMonitor() {
        try {
            if (this.completedTaskCount.get() != this.taskIndex.size()) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("count", this.completedTaskCount.get() - this.taskIndex.size());
                jSONObject.put("undispatchCount", this.unDispatchTask.size());
                Iterator<T> it2 = this.unDispatchTask.iterator();
                while (it2.hasNext()) {
                    jSONObject.put(((com.bytedance.lego.init.model.f) it2.next()).a, "task");
                }
                InitMonitor initMonitor = InitMonitor.INSTANCE;
                Category category = Category.TASK_COUNT_EXCEPTION;
                String valueOf = String.valueOf(this.completedTaskCount.get() - this.taskIndex.size());
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("task_count_exception", jSONObject);
                initMonitor.monitorEvent(category, valueOf, jSONObject2);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final com.bytedance.lego.init.model.f getInitTaskInfoById(String str) {
        kotlin.s.c.l.g(str, DBDefinition.TASK_ID);
        return this.taskIndex.get(str);
    }

    public final float getPriorityByTaskId(String str) {
        kotlin.s.c.l.g(str, DBDefinition.TASK_ID);
        com.bytedance.lego.init.model.f fVar = this.taskIndex.get(str);
        if (fVar != null) {
            return fVar.f5315f;
        }
        return -1.0f;
    }

    public final List<String> getTaskDependencyById(String str) {
        kotlin.s.c.l.g(str, DBDefinition.TASK_ID);
        ArrayList arrayList = new ArrayList();
        synchronized (this.readWriteLock) {
            com.bytedance.lego.init.model.f fVar = this.taskIndex.get(str);
            if (fVar != null) {
                List<String> list = fVar.h;
                kotlin.s.c.l.b(list, "it.dependencies");
                arrayList.addAll(list);
            }
        }
        return arrayList;
    }

    public final void init() {
        long currentTimeMillis = System.currentTimeMillis();
        Map<String, com.bytedance.lego.init.model.f> d2 = y.d();
        kotlin.s.c.l.b(d2, "TaskCollectorManager.getInitTaskIndexs()");
        this.taskIndex = d2;
        com.bytedance.lego.init.z.a aVar = com.bytedance.lego.init.z.a.a;
        StringBuilder M = e.a.a.a.a.M("collect cos: ");
        M.append(System.currentTimeMillis() - currentTimeMillis);
        M.append("ms  size: ");
        M.append(this.taskIndex.size());
        aVar.a("", M.toString());
        InitMonitor initMonitor = InitMonitor.INSTANCE;
        initMonitor.monitorCosTime("InitTaskManager.CollectTasks", System.currentTimeMillis() - currentTimeMillis, false);
        this.unDispatchTask.addAll(this.taskIndex.values());
        initReadyQueue();
        r.p.i(this.taskIndex.isEmpty());
        initMonitor.monitorCosTime("InitTaskManager.init", System.currentTimeMillis() - currentTimeMillis, false);
    }

    public final void onTaskComplete(com.bytedance.lego.init.model.f fVar) {
        kotlin.s.c.l.g(fVar, "task");
        synchronized (this.readWriteLock) {
            if (fVar.k) {
                return;
            }
            fVar.k = true;
            this.completedTaskCount.getAndIncrement();
            List<String> list = fVar.f5316g;
            if (list != null) {
                Iterator<T> it2 = list.iterator();
                while (it2.hasNext()) {
                    com.bytedance.lego.init.model.f fVar2 = this.taskIndex.get((String) it2.next());
                    if (fVar2 != null && this.unDispatchTask.contains(fVar2)) {
                        List<String> list2 = fVar2.h;
                        if (list2 != null) {
                            list2.remove(fVar.a);
                        }
                        List<String> list3 = fVar2.h;
                        if (list3 == null || list3.isEmpty()) {
                            letTaskReady(fVar2);
                        }
                    }
                }
            }
        }
    }

    public final com.bytedance.lego.init.model.f takeNonUiTaskIfExist(Long l) {
        if (hasNonUiTask()) {
            return l != null ? this.nonUiReadyQueue.poll(l.longValue(), TimeUnit.MILLISECONDS) : this.nonUiReadyQueue.take();
        }
        return null;
    }

    public final com.bytedance.lego.init.model.f takeNonUiTaskMainThreadIfExist(InitPeriod initPeriod) {
        kotlin.s.c.l.g(initPeriod, TypedValues.CycleType.S_WAVE_PERIOD);
        if (!hasNonUiTask()) {
            return null;
        }
        Iterator<com.bytedance.lego.init.model.f> it2 = this.nonUiReadyQueue.iterator();
        kotlin.s.c.l.b(it2, "nonUiReadyQueue.iterator()");
        while (it2.hasNext()) {
            com.bytedance.lego.init.model.f next = it2.next();
            InitPeriod initPeriod2 = next.i;
            kotlin.s.c.l.b(initPeriod2, "next.endPeriod");
            if (initPeriod2.getValue() <= initPeriod.getValue()) {
                it2.remove();
                return next;
            }
        }
        return null;
    }

    @UiThread
    public final com.bytedance.lego.init.model.f takeUiTaskIfExist(long j) {
        try {
            return this.uiReadyQueue.poll(j, TimeUnit.MILLISECONDS);
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }
}
