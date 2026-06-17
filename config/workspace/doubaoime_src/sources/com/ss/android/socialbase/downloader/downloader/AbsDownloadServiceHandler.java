package com.ss.android.socialbase.downloader.downloader;

import android.app.Notification;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Binder;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.SparseArray;
import com.ss.android.socialbase.downloader.impls.AbsDownloadEngine;
import com.ss.android.socialbase.downloader.logger.Logger;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import e.a.a.a.a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class AbsDownloadServiceHandler implements IDownloadServiceHandler {
    private static final String TAG = "AbsDownloadServiceHandler";
    private WeakReference<Service> downloadService;
    protected volatile boolean isServiceForeground;
    protected final SparseArray<List<DownloadTask>> pendingTasks = new SparseArray<>();
    protected volatile boolean isServiceAlive = false;
    protected volatile boolean isInvokeStartService = false;
    private Handler handler = new Handler(Looper.getMainLooper());
    private Runnable debounceStartServiceRunnable = new Runnable() { // from class: com.ss.android.socialbase.downloader.downloader.AbsDownloadServiceHandler.1
        @Override // java.lang.Runnable
        public void run() {
            if (Logger.debug()) {
                Logger.globalDebug(AbsDownloadServiceHandler.TAG, "debounceStartServiceRunnable_run", "Try startService");
            }
            if (AbsDownloadServiceHandler.this.isServiceAlive) {
                return;
            }
            if (Logger.debug()) {
                Logger.globalDebug(AbsDownloadServiceHandler.TAG, "debounceStartServiceRunnable_run", "Try startService Error");
            }
            AbsDownloadServiceHandler.this.startService(DownloadComponentManager.getAppContext(), null);
        }
    };

    @Override // com.ss.android.socialbase.downloader.downloader.IDownloadServiceHandler
    public boolean isServiceAlive() {
        return this.isServiceAlive;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.IDownloadServiceHandler
    public boolean isServiceForeground() {
        if (Logger.debug()) {
            String str = TAG;
            StringBuilder M = a.M("IsServiceForeground = ");
            M.append(this.isServiceForeground);
            Logger.globalDebug(str, "isServiceForeground", M.toString());
        }
        return this.isServiceForeground;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.IDownloadServiceHandler
    public IBinder onBind(Intent intent) {
        if (Logger.debug()) {
            Logger.globalDebug(TAG, "onBind", "OnBind Abs");
        }
        return new Binder();
    }

    @Override // com.ss.android.socialbase.downloader.downloader.IDownloadServiceHandler
    public void onDestroy() {
        this.isServiceAlive = false;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.IDownloadServiceHandler
    public void onStartCommand(Intent intent, int i, int i2) {
    }

    @Override // com.ss.android.socialbase.downloader.downloader.IDownloadServiceHandler
    public void onStartCommandOnMainThread() {
    }

    @Override // com.ss.android.socialbase.downloader.downloader.IDownloadServiceHandler
    public void pendDownloadTask(DownloadTask downloadTask) {
        if (downloadTask == null) {
            return;
        }
        int downloadId = downloadTask.getDownloadId();
        synchronized (this.pendingTasks) {
            if (Logger.debug()) {
                Logger.taskDebug(TAG, downloadId, "pendDownloadTask", "PendingTasks.size:" + this.pendingTasks.size());
            }
            List<DownloadTask> list = this.pendingTasks.get(downloadId);
            if (list == null) {
                list = new ArrayList<>();
                this.pendingTasks.put(downloadId, list);
            }
            if (Logger.debug()) {
                Logger.taskDebug(TAG, downloadId, "pendDownloadTask", "Before taskArray.size:" + list.size());
            }
            list.add(downloadTask);
            if (Logger.debug()) {
                Logger.taskDebug(TAG, downloadId, "pendDownloadTask", "After pendingTasks.size:" + this.pendingTasks.size());
            }
        }
    }

    protected void resumePendingTask() {
        SparseArray<List<DownloadTask>> clone;
        synchronized (this.pendingTasks) {
            if (Logger.debug()) {
                Logger.globalDebug(TAG, "resumePendingTask", "PendingTasks.size:" + this.pendingTasks.size());
            }
            clone = this.pendingTasks.clone();
            this.pendingTasks.clear();
        }
        AbsDownloadEngine downloadEngine = DownloadComponentManager.getDownloadEngine();
        if (downloadEngine != null) {
            for (int i = 0; i < clone.size(); i++) {
                List<DownloadTask> list = clone.get(clone.keyAt(i));
                if (list != null) {
                    for (DownloadTask downloadTask : list) {
                        if (Logger.debug()) {
                            Logger.taskDebug(TAG, downloadTask.getDownloadId(), "resumePendingTask", "Resume Task");
                        }
                        downloadEngine.tryDownload(downloadTask);
                    }
                }
            }
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.IDownloadServiceHandler
    public void setDownloadService(WeakReference weakReference) {
        this.downloadService = weakReference;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.IDownloadServiceHandler
    public void setLogLevel(int i) {
        Logger.setLogLevel(i);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.IDownloadServiceHandler
    public void setServiceConnectionListener(IDownloadServiceConnectionListener iDownloadServiceConnectionListener) {
    }

    @Override // com.ss.android.socialbase.downloader.downloader.IDownloadServiceHandler
    public void startForeground(int i, Notification notification) {
        WeakReference<Service> weakReference = this.downloadService;
        if (weakReference == null || weakReference.get() == null) {
            if (Logger.debug()) {
                Logger.globalDebug(TAG, "startForeground", "DownloadService is null");
                return;
            }
            return;
        }
        if (Logger.debug()) {
            String str = TAG;
            StringBuilder N = a.N("Id = ", i, ", service = ");
            N.append(this.downloadService.get());
            N.append(",  isServiceAlive = ");
            N.append(this.isServiceAlive);
            Logger.globalDebug(str, "startForeground", N.toString());
        }
        try {
            this.downloadService.get().startForeground(i, notification);
            this.isServiceForeground = true;
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.IDownloadServiceHandler
    public void startService() {
        if (this.isServiceAlive) {
            return;
        }
        if (Logger.debug()) {
            Logger.globalDebug(TAG, "startService", "Run StartService");
        }
        startService(DownloadComponentManager.getAppContext(), null);
    }

    protected void startService(Context context, ServiceConnection serviceConnection) {
    }

    @Override // com.ss.android.socialbase.downloader.downloader.IDownloadServiceHandler
    public void stopForeground(boolean z) {
        WeakReference<Service> weakReference = this.downloadService;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        if (Logger.debug()) {
            String str = TAG;
            StringBuilder M = a.M("Service = ");
            M.append(this.downloadService.get());
            M.append(",  isServiceAlive = ");
            M.append(this.isServiceAlive);
            Logger.globalDebug(str, "stopForeground", M.toString());
        }
        try {
            this.isServiceForeground = false;
            this.downloadService.get().stopForeground(z);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    protected void stopService(Context context, ServiceConnection serviceConnection) {
    }

    @Override // com.ss.android.socialbase.downloader.downloader.IDownloadServiceHandler
    public void tryDownload(DownloadTask downloadTask) {
        if (downloadTask == null) {
            return;
        }
        if (!this.isServiceAlive) {
            if (Logger.debug()) {
                Logger.taskDebug(TAG, downloadTask.getDownloadId(), "tryDownload", "Service is not alive");
            }
            if (this.isInvokeStartService) {
                this.handler.removeCallbacks(this.debounceStartServiceRunnable);
                this.handler.postDelayed(this.debounceStartServiceRunnable, 10L);
            } else {
                if (Logger.debug()) {
                    Logger.taskDebug(TAG, downloadTask.getDownloadId(), "tryDownload", "Do StartService");
                }
                startService(DownloadComponentManager.getAppContext(), null);
                this.isInvokeStartService = true;
            }
        }
        if (this.pendingTasks.get(downloadTask.getDownloadId()) != null) {
            synchronized (this.pendingTasks) {
                if (this.pendingTasks.get(downloadTask.getDownloadId()) != null) {
                    this.pendingTasks.remove(downloadTask.getDownloadId());
                }
            }
        }
        AbsDownloadEngine downloadEngine = DownloadComponentManager.getDownloadEngine();
        if (downloadEngine != null) {
            downloadEngine.tryDownload(downloadTask);
        }
        resumePendingTask();
    }

    @Override // com.ss.android.socialbase.downloader.downloader.IDownloadServiceHandler
    public void tryDownloadWithEngine(DownloadTask downloadTask) {
    }
}
