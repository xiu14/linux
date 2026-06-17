package com.ss.android.socialbase.downloader.downloader;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.WorkerThread;
import com.ss.android.socialbase.downloader.constants.ListenerType;
import com.ss.android.socialbase.downloader.depend.IDownloadCacheSyncStatusListener;
import com.ss.android.socialbase.downloader.depend.IDownloadDBListener;
import com.ss.android.socialbase.downloader.depend.IDownloadFileUriProvider;
import com.ss.android.socialbase.downloader.depend.IDownloadListener;
import com.ss.android.socialbase.downloader.depend.IDownloadNotificationEventListener;
import com.ss.android.socialbase.downloader.depend.IDownloadStatusListener;
import com.ss.android.socialbase.downloader.depend.IDownloadThreadCheckListener;
import com.ss.android.socialbase.downloader.depend.IDownloaderProcessConnectedListener;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import com.ss.android.socialbase.downloader.service.DownloadServiceManager;
import com.ss.android.socialbase.downloader.service.IDownloadComponentManagerService;
import com.ss.android.socialbase.downloader.service.IDownloadProcessDispatcherService;
import com.ss.android.socialbase.downloader.utils.DownloadDirUtils;
import java.io.File;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class BaseDownloader {
    private String globalDefaultSavePath;
    private String globalDefaultSaveTempPath;
    private IDownloadProcessDispatcherService dispatcherService = (IDownloadProcessDispatcherService) DownloadServiceManager.getService(IDownloadProcessDispatcherService.class);
    private IDownloadComponentManagerService componentService = (IDownloadComponentManagerService) DownloadServiceManager.getService(IDownloadComponentManagerService.class);

    BaseDownloader() {
    }

    public static DownloadTask with(Context context) {
        Downloader.getInstance(context);
        return new DownloadTask();
    }

    @WorkerThread
    public void addMainThreadListener(int i, IDownloadListener iDownloadListener) {
        if (iDownloadListener == null) {
            return;
        }
        this.dispatcherService.addDownloadListener(i, iDownloadListener, ListenerType.MAIN, false);
    }

    @WorkerThread
    public void addNotificationListener(int i, IDownloadListener iDownloadListener) {
        if (iDownloadListener == null) {
            return;
        }
        this.dispatcherService.addDownloadListener(i, iDownloadListener, ListenerType.NOTIFICATION, false);
    }

    @WorkerThread
    public void addSubThreadListener(int i, IDownloadListener iDownloadListener) {
        if (iDownloadListener == null) {
            return;
        }
        this.dispatcherService.addDownloadListener(i, iDownloadListener, ListenerType.SUB, false);
    }

    @WorkerThread
    public boolean canResume(int i) {
        return this.dispatcherService.canResume(i);
    }

    public void cancel(int i) {
        cancel(i, true);
    }

    public void clearDownloadData(int i) {
        this.dispatcherService.clearDownloadData(i, true);
    }

    public void clearMemoryCacheData(double d2) {
        this.componentService.clearMemoryCacheData(d2);
    }

    public void clearSqlDownloadCacheData() {
        this.componentService.clearSqlDownloadCacheData();
    }

    public void destoryDownloader() {
        this.componentService.unRegisterDownloadReceiver();
    }

    @WorkerThread
    @Deprecated
    public List<DownloadInfo> getAllDownloadInfo() {
        return this.dispatcherService.getAllDownloadInfo();
    }

    @WorkerThread
    public long getCurBytes(int i) {
        return this.dispatcherService.getCurBytes(i);
    }

    @WorkerThread
    public IDownloadFileUriProvider getDownloadFileUriProvider(int i) {
        return this.dispatcherService.getDownloadFileUriProvider(i);
    }

    public int getDownloadId(String str, String str2) {
        return this.dispatcherService.getDownloadId(str, str2);
    }

    @WorkerThread
    public DownloadInfo getDownloadInfo(int i) {
        return this.dispatcherService.getDownloadInfo(i);
    }

    @WorkerThread
    public List<DownloadInfo> getDownloadInfoList(String str) {
        return this.dispatcherService.getDownloadInfoList(str);
    }

    @WorkerThread
    public List<DownloadInfo> getDownloadInfosByFileExtension(String str) {
        return this.dispatcherService.getDownloadInfosByFileExtension(str);
    }

    @WorkerThread
    public IDownloadNotificationEventListener getDownloadNotificationEventListener(int i) {
        return this.dispatcherService.getDownloadNotificationEventListener(i);
    }

    @WorkerThread
    public List<DownloadInfo> getDownloadingDownloadInfosWithMimeType(String str) {
        return this.dispatcherService.getDownloadingDownloadInfosWithMimeType(str);
    }

    public File getGlobalSaveDir() {
        return getGlobalSaveDir(this.globalDefaultSavePath);
    }

    public File getGlobalSaveTempDir() {
        return getGlobalSaveDir(this.globalDefaultSaveTempPath);
    }

    public IReserveWifiStatusListener getReserveWifiStatusListener() {
        return this.componentService.getReserveWifiStatusListener();
    }

    @WorkerThread
    public int getStatus(int i) {
        return this.dispatcherService.getStatus(i);
    }

    @WorkerThread
    public List<DownloadInfo> getSuccessedDownloadInfosWithMimeType(String str) {
        return this.dispatcherService.getSuccessedDownloadInfosWithMimeType(str);
    }

    @WorkerThread
    public List<DownloadInfo> getUnCompletedDownloadInfosWithMimeType(String str) {
        return this.dispatcherService.getUnCompletedDownloadInfosWithMimeType(str);
    }

    public void initDownloadCacheImmediately() {
        this.componentService.initDownloadCacheImmediately();
    }

    public boolean isDownloadCacheSyncSuccess() {
        return this.dispatcherService.isDownloadCacheSyncSuccess();
    }

    public boolean isDownloadServiceForeground(int i) {
        return this.dispatcherService.isDownloadServiceForeground(i);
    }

    @WorkerThread
    public boolean isDownloadSuccessAndFileNotExist(DownloadInfo downloadInfo) {
        return this.dispatcherService.isDownloadSuccessAndFileNotExist(downloadInfo);
    }

    @WorkerThread
    public boolean isDownloading(int i) {
        return this.dispatcherService.isDownloading(i);
    }

    public boolean isHttpServiceInit() {
        return this.dispatcherService.isHttpServiceInit();
    }

    public void pause(int i) {
        this.dispatcherService.pause(i);
    }

    public void pauseAll() {
        this.dispatcherService.pauseAll();
    }

    public void registerDownloadCacheSyncListener(IDownloadCacheSyncStatusListener iDownloadCacheSyncStatusListener) {
        this.dispatcherService.registerDownloadCacheSyncListener(iDownloadCacheSyncStatusListener);
    }

    public void registerDownloaderProcessConnectedListener(IDownloaderProcessConnectedListener iDownloaderProcessConnectedListener) {
        this.dispatcherService.registerDownloaderProcessConnectedListener(iDownloaderProcessConnectedListener);
    }

    @WorkerThread
    public void removeMainThreadListener(int i, IDownloadListener iDownloadListener) {
        if (iDownloadListener == null) {
            return;
        }
        this.dispatcherService.removeDownloadListener(i, iDownloadListener, ListenerType.MAIN, false);
    }

    @WorkerThread
    public void removeNotificationListener(int i, IDownloadListener iDownloadListener) {
        if (iDownloadListener == null) {
            return;
        }
        this.dispatcherService.removeDownloadListener(i, iDownloadListener, ListenerType.NOTIFICATION, false);
    }

    @WorkerThread
    public void removeSubThreadListener(int i, IDownloadListener iDownloadListener) {
        if (iDownloadListener == null) {
            return;
        }
        this.dispatcherService.removeDownloadListener(i, iDownloadListener, ListenerType.SUB, false);
    }

    @WorkerThread
    @Deprecated
    public void removeTaskMainListener(int i) {
        this.dispatcherService.removeDownloadListener(i, null, ListenerType.MAIN, true);
    }

    @WorkerThread
    @Deprecated
    public void removeTaskNotificationListener(int i) {
        this.dispatcherService.removeDownloadListener(i, null, ListenerType.NOTIFICATION, true);
    }

    @WorkerThread
    @Deprecated
    public void removeTaskSubListener(int i) {
        this.dispatcherService.removeDownloadListener(i, null, ListenerType.SUB, true);
    }

    public void restart(int i) {
        this.dispatcherService.restart(i);
    }

    public void restartAllFailedDownloadTasks(List<String> list) {
        this.dispatcherService.restartAllFailedDownloadTasks(list);
    }

    public void restartAllPauseReserveOnWifiDownloadTasks(List<String> list) {
        this.dispatcherService.restartAllPauseReserveOnWifiDownloadTasks(list);
    }

    public void resume(int i) {
        this.dispatcherService.resume(i);
    }

    public void setDefaultSavePath(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.globalDefaultSavePath = str;
    }

    public void setDefaultSaveTempPath(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.globalDefaultSaveTempPath = str;
    }

    public void setDownloadDBListener(IDownloadDBListener iDownloadDBListener) {
        this.componentService.setDownloadDBListener(iDownloadDBListener);
    }

    public void setDownloadInMultiProcess() {
        this.componentService.setDownloadInMultiProcess();
    }

    public void setDownloadMemoryInfoListener(IDownloadMemoryInfoListener iDownloadMemoryInfoListener) {
        this.componentService.setDownloadMemoryInfoListener(iDownloadMemoryInfoListener);
    }

    @WorkerThread
    public void setDownloadNotificationEventListener(int i, IDownloadNotificationEventListener iDownloadNotificationEventListener) {
        this.dispatcherService.setDownloadNotificationEventListener(i, iDownloadNotificationEventListener);
    }

    public void setDownloadStatusListener(IDownloadStatusListener iDownloadStatusListener) {
        this.componentService.setDownloadStatusListener(iDownloadStatusListener);
    }

    public void setDownloadThreadCheckListener(IDownloadThreadCheckListener iDownloadThreadCheckListener) {
        this.componentService.setDownloadThreadCheckListener(iDownloadThreadCheckListener);
    }

    public void setLogLevel(int i) {
        this.dispatcherService.setLogLevel(i);
    }

    @WorkerThread
    @Deprecated
    public void setMainThreadListener(int i, IDownloadListener iDownloadListener) {
        if (iDownloadListener == null) {
            return;
        }
        this.dispatcherService.addDownloadListener(i, iDownloadListener, ListenerType.MAIN, true);
    }

    @WorkerThread
    @Deprecated
    public void setNotificationListener(int i, IDownloadListener iDownloadListener) {
        if (iDownloadListener == null) {
            return;
        }
        this.dispatcherService.addDownloadListener(i, iDownloadListener, ListenerType.NOTIFICATION, true);
    }

    public void setReserveWifiStatusListener(IReserveWifiStatusListener iReserveWifiStatusListener) {
        this.componentService.setReserveWifiStatusListener(iReserveWifiStatusListener);
    }

    @WorkerThread
    @Deprecated
    public void setSubThreadListener(int i, IDownloadListener iDownloadListener) {
        if (iDownloadListener == null) {
            return;
        }
        this.dispatcherService.addDownloadListener(i, iDownloadListener, ListenerType.SUB, true);
    }

    public void setThrottleNetSpeed(int i, long j) {
        setThrottleNetSpeed(i, j, 0);
    }

    public void unRegisterDownloadCacheSyncListener(IDownloadCacheSyncStatusListener iDownloadCacheSyncStatusListener) {
        this.dispatcherService.unRegisterDownloadCacheSyncListener(iDownloadCacheSyncStatusListener);
    }

    public void unRegisterDownloaderProcessConnectedListener(IDownloaderProcessConnectedListener iDownloaderProcessConnectedListener) {
        this.dispatcherService.unRegisterDownloaderProcessConnectedListener(iDownloaderProcessConnectedListener);
    }

    @WorkerThread
    public void updateDownloadInfo(DownloadInfo downloadInfo) {
        this.componentService.updateDownloadInfo(downloadInfo);
    }

    private File getGlobalSaveDir(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        File file = new File(str);
        if (DownloadDirUtils.isValidDirectory(file)) {
            return file;
        }
        return null;
    }

    public void cancel(int i, boolean z) {
        this.dispatcherService.cancel(i, z);
    }

    public void clearDownloadData(int i, boolean z) {
        this.dispatcherService.clearDownloadData(i, z);
    }

    @WorkerThread
    public DownloadInfo getDownloadInfo(String str, String str2) {
        return this.dispatcherService.getDownloadInfo(str, str2);
    }

    @WorkerThread
    @Deprecated
    public void setMainThreadListener(int i, IDownloadListener iDownloadListener, boolean z) {
        if (iDownloadListener == null) {
            return;
        }
        this.dispatcherService.addDownloadListener(i, iDownloadListener, ListenerType.MAIN, true, z);
    }

    public void setThrottleNetSpeed(int i, long j, int i2) {
        this.dispatcherService.setThrottleNetSpeed(i, j, i2);
    }
}
