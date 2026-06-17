package com.ss.android.socialbase.downloader.thread;

import com.ss.android.socialbase.downloader.core.DownloadRunnable;
import com.ss.android.socialbase.downloader.downloader.DownloadComponentManager;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import com.ss.android.socialbase.downloader.monitor.DownloadMonitorHelper;
import com.ss.android.socialbase.downloader.setting.DownloadSetting;
import com.ss.android.socialbase.downloader.setting.DownloadSettingKeys;
import com.ss.android.socialbase.downloader.utils.DownloadUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class DownloadThreadPool {
    private Map<Integer, DownloadRunnable> downloadRunnablePool = new ConcurrentHashMap();
    private AtomicInteger clearTimes = new AtomicInteger(0);

    private boolean canUseSegmentThreadPool(DownloadInfo downloadInfo, DownloadRunnable downloadRunnable) {
        if (downloadInfo.getExpectFileLength() <= 0) {
            return false;
        }
        JSONObject optJSONObject = DownloadSetting.obtain(downloadInfo.getId()).optJSONObject(DownloadSettingKeys.SEGMENT_CONFIG);
        long optLong = optJSONObject != null ? optJSONObject.optLong(DownloadSettingKeys.SegmentConfig.EXPECT_MIN_DOWNLOAD_SIZE) : 0L;
        if (optLong < 104857600) {
            return false;
        }
        if (downloadInfo.getExpectFileLength() > optLong) {
            return true;
        }
        downloadRunnable.setEnableSegmentDownload(false);
        return false;
    }

    private void clearRunnableNotAlive() {
        Iterator<Map.Entry<Integer, DownloadRunnable>> it2 = this.downloadRunnablePool.entrySet().iterator();
        while (it2.hasNext()) {
            if (!it2.next().getValue().isAlive()) {
                it2.remove();
            }
        }
    }

    private ExecutorService getDownloadExecutorService(DownloadRunnable downloadRunnable) {
        ExecutorService executorService = null;
        try {
            try {
                DownloadInfo downloadInfo = downloadRunnable.getDownloadTask().getDownloadInfo();
                int executorGroup = downloadInfo.getExecutorGroup();
                if (executorGroup == 3) {
                    executorService = DownloadComponentManager.getMixFrequentThreadExecutor();
                } else if (executorGroup == 4) {
                    executorService = DownloadComponentManager.getMixApkThreadExecutor();
                } else if (executorGroup == 7) {
                    executorService = DownloadComponentManager.getCustomThreadExecutor();
                }
                if (executorService == null && canUseSegmentThreadPool(downloadInfo, downloadRunnable)) {
                    executorService = DownloadComponentManager.getSegmentDownloadThreadExecutorService();
                }
                if (executorService != null) {
                    return executorService;
                }
            } catch (Exception e2) {
                e2.printStackTrace();
                if (0 != 0) {
                    return null;
                }
            }
            return DownloadComponentManager.getMixDefaultThreadExecutor();
        } catch (Throwable th) {
            if (0 == 0) {
                DownloadComponentManager.getMixDefaultThreadExecutor();
            }
            throw th;
        }
    }

    private void removeFromThreadPool(DownloadRunnable downloadRunnable) {
        if (downloadRunnable == null) {
            return;
        }
        try {
            ExecutorService downloadExecutorService = getDownloadExecutorService(downloadRunnable);
            if (downloadExecutorService instanceof ThreadPoolExecutor) {
                ((ThreadPoolExecutor) downloadExecutorService).remove(downloadRunnable);
                Future future = downloadRunnable.getFuture();
                if (future != null) {
                    future.cancel(true);
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public DownloadRunnable cancel(int i) {
        clearRunnableNotAlive();
        DownloadRunnable remove = this.downloadRunnablePool.remove(Integer.valueOf(i));
        if (remove != null) {
            remove.cancel();
            removeFromThreadPool(remove);
        }
        return remove;
    }

    public boolean containsTask(int i) {
        DownloadRunnable downloadRunnable = this.downloadRunnablePool.get(Integer.valueOf(i));
        return downloadRunnable != null && downloadRunnable.isAlive();
    }

    public void execute(DownloadRunnable downloadRunnable) {
        downloadRunnable.prepareDownload();
        if (this.clearTimes.compareAndSet(500, 0)) {
            clearRunnableNotAlive();
        }
        this.clearTimes.incrementAndGet();
        this.downloadRunnablePool.put(Integer.valueOf(downloadRunnable.getDownloadId()), downloadRunnable);
        DownloadTask downloadTask = downloadRunnable.getDownloadTask();
        try {
            downloadTask.getTimingInfo().beforeThreadExecuteTime = System.currentTimeMillis();
            downloadRunnable.setFuture(getDownloadExecutorService(downloadRunnable).submit(downloadRunnable));
        } catch (Exception e2) {
            if (downloadTask != null) {
                DownloadMonitorHelper.monitorSendWithTaskMonitor(downloadTask.getMonitorDepend(), downloadTask.getDownloadInfo(), new BaseException(1003, DownloadUtils.getErrorMsgWithTagPrefix(e2, "DownloadThreadPoolExecute")), downloadTask.getDownloadInfo() != null ? downloadTask.getDownloadInfo().getStatus() : 0);
            }
            e2.printStackTrace();
        }
    }

    public List<Integer> getAllAliveDownloadIds() {
        clearRunnableNotAlive();
        return new ArrayList(this.downloadRunnablePool.keySet());
    }

    public void pause(int i) {
        clearRunnableNotAlive();
        DownloadRunnable remove = this.downloadRunnablePool.remove(Integer.valueOf(i));
        if (remove != null) {
            remove.pause();
            removeFromThreadPool(remove);
        }
    }

    public void removeUnAliveDownloadRunnable(DownloadRunnable downloadRunnable) {
        if (downloadRunnable == null) {
            return;
        }
        Iterator<Map.Entry<Integer, DownloadRunnable>> it2 = this.downloadRunnablePool.entrySet().iterator();
        while (it2.hasNext()) {
            if (it2.next().getValue() == downloadRunnable) {
                it2.remove();
                return;
            }
        }
    }

    public void setThrottleNetSpeed(int i, long j, int i2) {
        DownloadRunnable downloadRunnable = this.downloadRunnablePool.get(Integer.valueOf(i));
        if (downloadRunnable != null) {
            downloadRunnable.setThrottleNetSpeed(j, i2);
        }
    }
}
