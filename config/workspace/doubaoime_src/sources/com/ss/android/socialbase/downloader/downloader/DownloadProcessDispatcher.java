package com.ss.android.socialbase.downloader.downloader;

import android.content.Intent;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.ss.android.socialbase.downloader.cleaner.Cleaner;
import com.ss.android.socialbase.downloader.constants.DownloadConstants;
import com.ss.android.socialbase.downloader.constants.ListenerType;
import com.ss.android.socialbase.downloader.depend.IDownloadCacheSyncStatusListener;
import com.ss.android.socialbase.downloader.depend.IDownloadFileUriProvider;
import com.ss.android.socialbase.downloader.depend.IDownloadListener;
import com.ss.android.socialbase.downloader.depend.IDownloadNotificationEventListener;
import com.ss.android.socialbase.downloader.depend.IDownloaderProcessConnectedListener;
import com.ss.android.socialbase.downloader.depend.INotificationClickCallback;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.impls.DownloadHandleService;
import com.ss.android.socialbase.downloader.impls.DownloadProxy;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import com.ss.android.socialbase.downloader.monitor.DownloadMonitorHelper;
import com.ss.android.socialbase.downloader.utils.DownloadHelper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class DownloadProcessDispatcher {
    private static volatile DownloadProcessDispatcher instance;
    private volatile SparseArray<Boolean> independentMap = new SparseArray<>();
    private volatile List<IDownloaderProcessConnectedListener> processConnectedListeners = new ArrayList();

    public static DownloadProcessDispatcher getInstance() {
        if (instance == null) {
            synchronized (DownloadProcessDispatcher.class) {
                instance = new DownloadProcessDispatcher();
            }
        }
        return instance;
    }

    private List<DownloadInfo> handleDownloadInfos(List<DownloadInfo> list, List<DownloadInfo> list2, SparseArray<DownloadInfo> sparseArray) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (DownloadInfo downloadInfo : list) {
                if (downloadInfo != null && sparseArray.get(downloadInfo.getId()) == null) {
                    sparseArray.put(downloadInfo.getId(), downloadInfo);
                }
            }
        }
        if (list2 != null) {
            for (DownloadInfo downloadInfo2 : list2) {
                if (downloadInfo2 != null && sparseArray.get(downloadInfo2.getId()) == null) {
                    sparseArray.put(downloadInfo2.getId(), downloadInfo2);
                }
            }
        }
        for (int i = 0; i < sparseArray.size(); i++) {
            DownloadInfo downloadInfo3 = sparseArray.get(sparseArray.keyAt(i));
            if (!Cleaner.getINSTANCE().isExistInCleanSet(downloadInfo3.getId())) {
                arrayList.add(downloadInfo3);
            }
        }
        return arrayList;
    }

    public void addDownloadListener(int i, IDownloadListener iDownloadListener, ListenerType listenerType, boolean z) {
        IDownloadProxy downloadHandler = getDownloadHandler(i);
        if (downloadHandler == null) {
            return;
        }
        downloadHandler.addDownloadListener(i, iDownloadListener.hashCode(), iDownloadListener, listenerType, z);
    }

    public boolean canResume(int i) {
        IDownloadProxy downloadHandler = getDownloadHandler(i);
        if (downloadHandler == null) {
            return false;
        }
        return downloadHandler.canResume(i);
    }

    public void cancel(int i, boolean z) {
        if (!DownloadHelper.isMainProcess()) {
            IDownloadProxy downloadHandler = getDownloadHandler(i);
            if (downloadHandler != null) {
                downloadHandler.cancel(i, z);
            }
            DownloadProxy.get(true).dispatchProcessCallback(2, i);
            return;
        }
        IDownloadProxy iDownloadProxy = DownloadProxy.get(true);
        if (iDownloadProxy != null) {
            iDownloadProxy.cancel(i, z);
        }
        IDownloadProxy iDownloadProxy2 = DownloadProxy.get(false);
        if (iDownloadProxy2 != null) {
            iDownloadProxy2.cancel(i, z);
        }
    }

    public void clearDownloadData(int i, boolean z) {
        IDownloadProxy downloadHandler = getDownloadHandler(i);
        if (downloadHandler == null) {
            return;
        }
        downloadHandler.clearDownloadData(i, z, true);
    }

    public void dispatchDownloaderProcessConnectedEvent() {
        synchronized (this.processConnectedListeners) {
            for (IDownloaderProcessConnectedListener iDownloaderProcessConnectedListener : this.processConnectedListeners) {
                if (iDownloaderProcessConnectedListener != null) {
                    iDownloaderProcessConnectedListener.onConnected();
                }
            }
        }
    }

    public List<DownloadInfo> getAllDownloadInfo() {
        SparseArray<DownloadInfo> sparseArray = new SparseArray<>();
        IDownloadProxy iDownloadProxy = DownloadProxy.get(false);
        List<DownloadInfo> allDownloadInfo = iDownloadProxy != null ? iDownloadProxy.getAllDownloadInfo() : null;
        IDownloadProxy iDownloadProxy2 = DownloadProxy.get(true);
        return handleDownloadInfos(allDownloadInfo, iDownloadProxy2 != null ? iDownloadProxy2.getAllDownloadInfo() : null, sparseArray);
    }

    public long getCurBytes(int i) {
        IDownloadProxy downloadHandler = getDownloadHandler(i);
        if (downloadHandler == null || Cleaner.getINSTANCE().isExistInCleanSet(i)) {
            return 0L;
        }
        return downloadHandler.getCurBytes(i);
    }

    public IDownloadFileUriProvider getDownloadFileUriProvider(int i) {
        IDownloadProxy downloadHandler = getDownloadHandler(i);
        if (downloadHandler == null) {
            return null;
        }
        return downloadHandler.getDownloadFileUriProvider(i);
    }

    public IDownloadProxy getDownloadHandler(int i) {
        return DownloadProxy.get(getDownloadWithIndependentProcessStatus(i) == 1 && !DownloadHelper.isDownloaderProcess());
    }

    public int getDownloadId(String str, String str2) {
        return DownloadComponentManager.getDownloadId(str, str2);
    }

    @Nullable
    public DownloadInfo getDownloadInfo(int i) {
        IDownloadProxy downloadHandler = getDownloadHandler(i);
        if (downloadHandler == null || Cleaner.getINSTANCE().isExistInCleanSet(i)) {
            return null;
        }
        return downloadHandler.getDownloadInfo(i);
    }

    @Nullable
    public List<DownloadInfo> getDownloadInfoList(String str) {
        List<DownloadInfo> downloadInfoList = DownloadProxy.get(false).getDownloadInfoList(str);
        List<DownloadInfo> downloadInfoList2 = DownloadProxy.get(true).getDownloadInfoList(str);
        if (downloadInfoList == null && downloadInfoList2 == null) {
            return null;
        }
        if (downloadInfoList != null) {
            Iterator<DownloadInfo> it2 = downloadInfoList.iterator();
            while (it2.hasNext()) {
                if (Cleaner.getINSTANCE().isExistInCleanSet(it2.next().getId())) {
                    it2.remove();
                }
            }
        }
        if (downloadInfoList2 != null) {
            Iterator<DownloadInfo> it3 = downloadInfoList2.iterator();
            while (it3.hasNext()) {
                if (Cleaner.getINSTANCE().isExistInCleanSet(it3.next().getId())) {
                    it3.remove();
                }
            }
        }
        if (downloadInfoList == null || downloadInfoList2 == null) {
            return downloadInfoList != null ? downloadInfoList : downloadInfoList2;
        }
        ArrayList arrayList = new ArrayList(downloadInfoList);
        arrayList.addAll(downloadInfoList2);
        return arrayList;
    }

    public List<DownloadInfo> getDownloadInfosByFileExtension(String str) {
        SparseArray<DownloadInfo> sparseArray = new SparseArray<>();
        IDownloadProxy iDownloadProxy = DownloadProxy.get(false);
        List<DownloadInfo> downloadInfosByFileExtension = iDownloadProxy != null ? iDownloadProxy.getDownloadInfosByFileExtension(str) : null;
        IDownloadProxy iDownloadProxy2 = DownloadProxy.get(true);
        return handleDownloadInfos(downloadInfosByFileExtension, iDownloadProxy2 != null ? iDownloadProxy2.getDownloadInfosByFileExtension(str) : null, sparseArray);
    }

    public List<DownloadInfo> getDownloadInfosByFilters(String str, String str2) {
        SparseArray<DownloadInfo> sparseArray = new SparseArray<>();
        IDownloadProxy iDownloadProxy = DownloadProxy.get(false);
        List<DownloadInfo> downloadInfosByFilters = iDownloadProxy != null ? iDownloadProxy.getDownloadInfosByFilters(str, str2) : null;
        IDownloadProxy iDownloadProxy2 = DownloadProxy.get(true);
        return handleDownloadInfos(downloadInfosByFilters, iDownloadProxy2 != null ? iDownloadProxy2.getDownloadInfosByFilters(str, str2) : null, sparseArray);
    }

    @Nullable
    public IDownloadNotificationEventListener getDownloadNotificationEventListener(int i) {
        IDownloadProxy downloadHandler = getDownloadHandler(i);
        if (downloadHandler == null) {
            return null;
        }
        return downloadHandler.getDownloadNotificationEventListener(i);
    }

    public int getDownloadWithIndependentProcessStatus(int i) {
        if (DownloadComponentManager.supportMultiProc()) {
            return (DownloadHelper.isDownloaderProcess() || !DownloadProxy.get(true).isServiceAlive()) ? getDownloadWithIndependentProcessStatusInner(i) : DownloadProxy.get(true).getDownloadWithIndependentProcessStatus(i);
        }
        return -1;
    }

    public synchronized int getDownloadWithIndependentProcessStatusInner(int i) {
        if (this.independentMap.get(i) == null) {
            return -1;
        }
        return this.independentMap.get(i).booleanValue() ? 1 : 0;
    }

    public List<DownloadInfo> getDownloadingDownloadInfosWithMimeType(String str) {
        SparseArray<DownloadInfo> sparseArray = new SparseArray<>();
        IDownloadProxy iDownloadProxy = DownloadProxy.get(false);
        List<DownloadInfo> downloadingDownloadInfosWithMimeType = iDownloadProxy != null ? iDownloadProxy.getDownloadingDownloadInfosWithMimeType(str) : null;
        IDownloadProxy iDownloadProxy2 = DownloadProxy.get(true);
        return handleDownloadInfos(downloadingDownloadInfosWithMimeType, iDownloadProxy2 != null ? iDownloadProxy2.getDownloadingDownloadInfosWithMimeType(str) : null, sparseArray);
    }

    @Nullable
    public INotificationClickCallback getNotificationClickCallback(int i) {
        IDownloadProxy downloadHandler = getDownloadHandler(i);
        if (downloadHandler == null) {
            return null;
        }
        return downloadHandler.getNotificationClickCallback(i);
    }

    public int getStatus(int i) {
        IDownloadProxy downloadHandler = getDownloadHandler(i);
        if (downloadHandler == null) {
            return 0;
        }
        return downloadHandler.getStatus(i);
    }

    public List<DownloadInfo> getSuccessedDownloadInfosWithMimeType(String str) {
        SparseArray<DownloadInfo> sparseArray = new SparseArray<>();
        IDownloadProxy iDownloadProxy = DownloadProxy.get(false);
        List<DownloadInfo> successedDownloadInfosWithMimeType = iDownloadProxy != null ? iDownloadProxy.getSuccessedDownloadInfosWithMimeType(str) : null;
        IDownloadProxy iDownloadProxy2 = DownloadProxy.get(true);
        return handleDownloadInfos(successedDownloadInfosWithMimeType, iDownloadProxy2 != null ? iDownloadProxy2.getSuccessedDownloadInfosWithMimeType(str) : null, sparseArray);
    }

    public List<DownloadInfo> getUnCompletedDownloadInfosWithMimeType(String str) {
        SparseArray<DownloadInfo> sparseArray = new SparseArray<>();
        IDownloadProxy iDownloadProxy = DownloadProxy.get(false);
        List<DownloadInfo> unCompletedDownloadInfosWithMimeType = iDownloadProxy != null ? iDownloadProxy.getUnCompletedDownloadInfosWithMimeType(str) : null;
        IDownloadProxy iDownloadProxy2 = DownloadProxy.get(true);
        return handleDownloadInfos(unCompletedDownloadInfosWithMimeType, iDownloadProxy2 != null ? iDownloadProxy2.getUnCompletedDownloadInfosWithMimeType(str) : null, sparseArray);
    }

    public boolean isDownloadCacheSyncSuccess() {
        IDownloadProxy iDownloadProxy = DownloadProxy.get(false);
        if (iDownloadProxy != null) {
            return iDownloadProxy.isDownloadCacheSyncSuccess();
        }
        return false;
    }

    public boolean isDownloadSuccessAndFileNotExist(DownloadInfo downloadInfo) {
        IDownloadProxy downloadHandler;
        if (downloadInfo == null || (downloadHandler = getDownloadHandler(downloadInfo.getId())) == null) {
            return false;
        }
        return downloadHandler.isDownloadSuccessAndFileNotExist(downloadInfo);
    }

    public boolean isDownloading(int i) {
        IDownloadProxy downloadHandler = getDownloadHandler(i);
        if (downloadHandler == null) {
            return false;
        }
        return downloadHandler.isDownloading(i);
    }

    public boolean isHttpServiceInit() {
        return DownloadComponentManager.isHttpServiceInit();
    }

    public void pause(int i) {
        IDownloadProxy downloadHandler = getDownloadHandler(i);
        if (downloadHandler == null) {
            return;
        }
        downloadHandler.pause(i, false);
    }

    public void pauseAll() {
        IDownloadProxy iDownloadProxy = DownloadProxy.get(false);
        if (iDownloadProxy != null) {
            iDownloadProxy.pauseAll();
        }
        IDownloadProxy iDownloadProxy2 = DownloadProxy.get(true);
        if (iDownloadProxy2 != null) {
            iDownloadProxy2.pauseAll();
        }
    }

    public void recordTaskProcessIndependent(int i) {
        if (i == 0) {
            return;
        }
        setDownloadIndependentProcessStatus(i, true);
        IDownloadProxy iDownloadProxy = DownloadProxy.get(true);
        if (iDownloadProxy == null) {
            return;
        }
        iDownloadProxy.startService();
    }

    public void registerDownloadCacheSyncListener(IDownloadCacheSyncStatusListener iDownloadCacheSyncStatusListener) {
        DownloadComponentManager.registerDownloadCacheSyncListener(iDownloadCacheSyncStatusListener);
    }

    public void registerDownloaderProcessConnectedListener(IDownloaderProcessConnectedListener iDownloaderProcessConnectedListener) {
        if (iDownloaderProcessConnectedListener == null) {
            return;
        }
        if (DownloadHelper.isDownloaderProcess()) {
            iDownloaderProcessConnectedListener.onConnected();
            return;
        }
        if (DownloadProxy.get(true).isServiceAlive()) {
            iDownloaderProcessConnectedListener.onConnected();
        }
        synchronized (this.processConnectedListeners) {
            if (!this.processConnectedListeners.contains(iDownloaderProcessConnectedListener)) {
                this.processConnectedListeners.add(iDownloaderProcessConnectedListener);
            }
        }
    }

    public void removeDownloadListener(int i, IDownloadListener iDownloadListener, ListenerType listenerType, boolean z) {
        IDownloadProxy downloadHandler = getDownloadHandler(i);
        if (downloadHandler == null) {
            return;
        }
        downloadHandler.removeDownloadListener(i, iDownloadListener == null ? 0 : iDownloadListener.hashCode(), iDownloadListener, listenerType, z);
    }

    public void restart(int i) {
        IDownloadProxy downloadHandler = getDownloadHandler(i);
        if (downloadHandler == null) {
            return;
        }
        downloadHandler.restart(i);
    }

    public void restartAllFailedDownloadTasks(List<String> list) {
        IDownloadProxy iDownloadProxy = DownloadProxy.get(false);
        if (iDownloadProxy != null) {
            iDownloadProxy.restartAllFailedDownloadTasks(list);
        }
        IDownloadProxy iDownloadProxy2 = DownloadProxy.get(true);
        if (iDownloadProxy2 != null) {
            iDownloadProxy2.restartAllFailedDownloadTasks(list);
        }
    }

    public void restartAllPauseReserveOnWifiDownloadTasks(List<String> list) {
        IDownloadProxy iDownloadProxy = DownloadProxy.get(false);
        if (iDownloadProxy != null) {
            iDownloadProxy.restartAllPauseReserveOnWifiDownloadTasks(list);
        }
        IDownloadProxy iDownloadProxy2 = DownloadProxy.get(true);
        if (iDownloadProxy2 != null) {
            iDownloadProxy2.restartAllPauseReserveOnWifiDownloadTasks(list);
        }
    }

    public void resume(int i) {
        IDownloadProxy downloadHandler = getDownloadHandler(i);
        if (downloadHandler == null) {
            return;
        }
        downloadHandler.resume(i);
    }

    public synchronized void setDownloadIndependentProcessStatus(int i, boolean z) {
        this.independentMap.put(i, z ? Boolean.TRUE : Boolean.FALSE);
    }

    public void setDownloadNotificationEventListener(int i, IDownloadNotificationEventListener iDownloadNotificationEventListener) {
        IDownloadProxy downloadHandler = getDownloadHandler(i);
        if (downloadHandler == null) {
            return;
        }
        downloadHandler.setDownloadNotificationEventListener(i, iDownloadNotificationEventListener);
    }

    public void setDownloadWithIndependentProcessStatus(int i, boolean z) {
        setDownloadIndependentProcessStatus(i, z);
        if (DownloadComponentManager.supportMultiProc() && !DownloadHelper.isDownloaderProcess() && DownloadProxy.get(true).isServiceAlive()) {
            DownloadProxy.get(true).setDownloadWithIndependentProcessStatus(i, z);
        }
        if (DownloadComponentManager.isDownloadInMultiProcess() || DownloadHelper.isDownloaderProcess() || DownloadHelper.isMainProcess()) {
            return;
        }
        try {
            Intent intent = new Intent(DownloadComponentManager.getAppContext(), (Class<?>) DownloadHandleService.class);
            intent.setAction(DownloadConstants.ACTION_DOWNLOAD_PROCESS_NOTIFY);
            intent.putExtra("extra_download_id", i);
            DownloadComponentManager.getAppContext().startService(intent);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void setLogLevel(int i) {
        IDownloadProxy iDownloadProxy = DownloadProxy.get(false);
        if (iDownloadProxy != null) {
            iDownloadProxy.setLogLevel(i);
        }
        IDownloadProxy iDownloadProxy2 = DownloadProxy.get(true);
        if (iDownloadProxy2 != null) {
            iDownloadProxy2.setLogLevel(i);
        }
    }

    public void setThrottleNetSpeed(int i, long j, int i2) {
        IDownloadProxy downloadHandler = getDownloadHandler(i);
        if (downloadHandler == null) {
            return;
        }
        downloadHandler.setThrottleNetSpeed(i, j, i2);
    }

    public void tryDownload(final DownloadTask downloadTask) {
        final IDownloadProxy downloadHandler = getDownloadHandler(downloadTask);
        if (downloadHandler == null) {
            if (downloadTask != null) {
                DownloadMonitorHelper.monitorSendWithTaskMonitor(downloadTask.getMonitorDepend(), downloadTask.getDownloadInfo(), new BaseException(1003, "tryDownload but getDownloadHandler failed"), downloadTask.getDownloadInfo() != null ? downloadTask.getDownloadInfo().getStatus() : 0);
            }
        } else {
            Cleaner.getINSTANCE().removeFromCleanSet(downloadTask.getDownloadId());
            if (downloadTask.isNeedDelayForCacheSync()) {
                DownloadComponentManager.submitScheduleTask(new Runnable() { // from class: com.ss.android.socialbase.downloader.downloader.DownloadProcessDispatcher.1
                    @Override // java.lang.Runnable
                    public void run() {
                        downloadHandler.tryDownload(downloadTask);
                    }
                }, 500L, TimeUnit.MILLISECONDS);
            } else {
                downloadHandler.tryDownload(downloadTask);
            }
        }
    }

    public void unRegisterDownloadCacheSyncListener(IDownloadCacheSyncStatusListener iDownloadCacheSyncStatusListener) {
        DownloadComponentManager.unRegisterDownloadCacheSyncListener(iDownloadCacheSyncStatusListener);
    }

    public void unRegisterDownloaderProcessConnectedListener(IDownloaderProcessConnectedListener iDownloaderProcessConnectedListener) {
        if (iDownloaderProcessConnectedListener == null) {
            return;
        }
        synchronized (this.processConnectedListeners) {
            if (this.processConnectedListeners.contains(iDownloaderProcessConnectedListener)) {
                this.processConnectedListeners.remove(iDownloaderProcessConnectedListener);
            }
        }
    }

    private IDownloadProxy getDownloadHandler(DownloadTask downloadTask) {
        DownloadInfo downloadInfo;
        if (downloadTask == null || (downloadInfo = downloadTask.getDownloadInfo()) == null) {
            return null;
        }
        boolean isNeedIndependentProcess = downloadInfo.isNeedIndependentProcess();
        if (DownloadHelper.isDownloaderProcess() || !DownloadHelper.isMainProcess()) {
            isNeedIndependentProcess = true;
        }
        int downloadWithIndependentProcessStatus = getDownloadWithIndependentProcessStatus(downloadInfo.getId());
        if (downloadWithIndependentProcessStatus >= 0 && downloadWithIndependentProcessStatus != isNeedIndependentProcess) {
            try {
                if (downloadWithIndependentProcessStatus == 1) {
                    if (DownloadHelper.isMainProcess()) {
                        DownloadProxy.get(true).pause(downloadInfo.getId(), true);
                        DownloadInfo downloadInfo2 = DownloadProxy.get(true).getDownloadInfo(downloadInfo.getId());
                        if (downloadInfo2 != null) {
                            DownloadProxy.get(false).syncDownloadInfo(downloadInfo2);
                        }
                    }
                } else if (DownloadHelper.isMainProcess()) {
                    DownloadProxy.get(false).pause(downloadInfo.getId(), true);
                } else {
                    downloadTask.setNeedDelayForCacheSync(true);
                    DownloadProxy.get(true).dispatchProcessCallback(1, downloadInfo.getId());
                }
            } catch (Throwable unused) {
            }
        }
        setDownloadWithIndependentProcessStatus(downloadInfo.getId(), isNeedIndependentProcess);
        return DownloadProxy.get(isNeedIndependentProcess);
    }

    public void addDownloadListener(int i, IDownloadListener iDownloadListener, ListenerType listenerType, boolean z, boolean z2) {
        IDownloadProxy downloadHandler = getDownloadHandler(i);
        if (downloadHandler == null) {
            return;
        }
        downloadHandler.addDownloadListener(i, iDownloadListener.hashCode(), iDownloadListener, listenerType, z, z2);
    }

    @Nullable
    public DownloadInfo getDownloadInfo(String str, String str2) {
        IDownloadProxy downloadHandler;
        int downloadId = getDownloadId(str, str2);
        if (Cleaner.getINSTANCE().isExistInCleanSet(downloadId) || (downloadHandler = getDownloadHandler(downloadId)) == null) {
            return null;
        }
        return downloadHandler.getDownloadInfo(downloadId);
    }
}
