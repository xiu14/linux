package com.ss.android.socialbase.downloader.model;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class DownloadThreadInfo {
    public Map<String, ThreadExecutorInfo> beforeDownloadThreadExecutors = new ConcurrentHashMap();
    public Map<String, ThreadExecutorInfo> afterDownloadThreadExecutors = new ConcurrentHashMap();

    public static class ThreadExecutorInfo {
        public int activeCount;
        public int corePoolSize;
        public int maximumPoolSize;
        public int queueSize;
    }

    public static ThreadExecutorInfo parse(ExecutorService executorService) {
        ThreadExecutorInfo threadExecutorInfo = new ThreadExecutorInfo();
        if (executorService != null && (executorService instanceof ThreadPoolExecutor)) {
            ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) executorService;
            threadExecutorInfo.activeCount = threadPoolExecutor.getActiveCount();
            threadExecutorInfo.corePoolSize = threadPoolExecutor.getCorePoolSize();
            threadExecutorInfo.maximumPoolSize = threadPoolExecutor.getMaximumPoolSize();
            threadExecutorInfo.queueSize = threadPoolExecutor.getQueue().size();
        }
        return threadExecutorInfo;
    }

    private JSONObject translate(Map<String, ThreadExecutorInfo> map) throws Throwable {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, ThreadExecutorInfo> entry : map.entrySet()) {
            ThreadExecutorInfo value = entry.getValue();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("active", value.activeCount);
            jSONObject2.put("core", value.corePoolSize);
            jSONObject2.put("max", value.maximumPoolSize);
            jSONObject2.put("queue", value.queueSize);
            jSONObject.put(entry.getKey(), jSONObject2);
        }
        return jSONObject;
    }

    public JSONObject obtainStats() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("beforeDownload", translate(this.beforeDownloadThreadExecutors));
            jSONObject.put("afterDownload", translate(this.afterDownloadThreadExecutors));
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return jSONObject;
    }

    public void reset() {
        this.beforeDownloadThreadExecutors.clear();
        this.afterDownloadThreadExecutors.clear();
    }
}
