package com.ss.android.ugc.aweme.thread;

import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
class l {
    private final Map<String, WeakReference<ExecutorService>> a = new HashMap();
    private Map<ThreadPoolType, AtomicInteger> b = new HashMap();

    l() {
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, WeakReference<ExecutorService>> entry : this.a.entrySet()) {
            String key = entry.getKey();
            if (entry.getValue().get() != null) {
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) entry.getValue().get();
                sb.append("pool=");
                sb.append(key);
                sb.append(", core.size=");
                sb.append(threadPoolExecutor.getCorePoolSize());
                sb.append(", pool.size=");
                sb.append(threadPoolExecutor.getPoolSize());
                sb.append(", largest.pool.size=");
                sb.append(threadPoolExecutor.getLargestPoolSize());
                sb.append(", queue.size=");
                sb.append(threadPoolExecutor.getQueue().size());
                sb.append(", task.count=");
                sb.append(threadPoolExecutor.getTaskCount());
                sb.append(", task.completed.count=");
                sb.append(threadPoolExecutor.getCompletedTaskCount());
                sb.append("\n");
            }
        }
        return sb.toString();
    }
}
