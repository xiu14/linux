package com.ss.android.socialbase.downloader.downloader;

import android.app.Notification;
import com.ss.android.socialbase.downloader.constants.ListenerType;
import com.ss.android.socialbase.downloader.depend.IDownloadFileUriProvider;
import com.ss.android.socialbase.downloader.depend.IDownloadListener;
import com.ss.android.socialbase.downloader.depend.IDownloadNotificationEventListener;
import com.ss.android.socialbase.downloader.depend.INotificationClickCallback;
import com.ss.android.socialbase.downloader.depend.ProcessCallback;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import java.util.List;

/* loaded from: classes2.dex */
public interface IDownloadProxy {
    void addDownloadListener(int i, int i2, IDownloadListener iDownloadListener, ListenerType listenerType, boolean z);

    void addDownloadListener(int i, int i2, IDownloadListener iDownloadListener, ListenerType listenerType, boolean z, boolean z2);

    void addProcessCallback(ProcessCallback processCallback);

    boolean canResume(int i);

    void cancel(int i, boolean z);

    void clearData();

    void clearDownloadData(int i, boolean z, boolean z2);

    void dispatchProcessCallback(int i, int i2);

    List<DownloadInfo> getAllDownloadInfo();

    long getCurBytes(int i);

    IDownloadFileUriProvider getDownloadFileUriProvider(int i);

    int getDownloadId(String str, String str2);

    DownloadInfo getDownloadInfo(int i);

    DownloadInfo getDownloadInfo(String str, String str2);

    List<DownloadInfo> getDownloadInfoList(String str);

    List<DownloadInfo> getDownloadInfosByFileExtension(String str);

    List<DownloadInfo> getDownloadInfosByFilters(String str, String str2);

    IDownloadNotificationEventListener getDownloadNotificationEventListener(int i);

    int getDownloadWithIndependentProcessStatus(int i);

    List<DownloadInfo> getDownloadingDownloadInfosWithMimeType(String str);

    INotificationClickCallback getNotificationClickCallback(int i);

    int getStatus(int i);

    List<DownloadInfo> getSuccessedDownloadInfosWithMimeType(String str);

    List<DownloadInfo> getUnCompletedDownloadInfosWithMimeType(String str);

    boolean isDownloadCacheSyncSuccess();

    boolean isDownloadSuccessAndFileNotExist(DownloadInfo downloadInfo);

    boolean isDownloading(int i);

    boolean isHttpServiceInit();

    boolean isServiceAlive();

    boolean isServiceForeground();

    void pause(int i, boolean z);

    void pauseAll();

    boolean removeDownloadInfo(int i);

    void removeDownloadListener(int i, int i2, IDownloadListener iDownloadListener, ListenerType listenerType, boolean z);

    boolean removeDownloadTaskData(int i);

    void resetDownloadData(int i, boolean z);

    void restart(int i);

    void restartAllFailedDownloadTasks(List<String> list);

    void restartAllPauseReserveOnWifiDownloadTasks(List<String> list);

    void resume(int i);

    void setDownloadNotificationEventListener(int i, IDownloadNotificationEventListener iDownloadNotificationEventListener);

    void setDownloadWithIndependentProcessStatus(int i, boolean z);

    void setLogLevel(int i);

    void setThrottleNetSpeed(int i, long j, int i2);

    void startForeground(int i, Notification notification);

    void startService();

    void stopForeground(boolean z, boolean z2);

    void syncDownloadInfo(DownloadInfo downloadInfo);

    void syncDownloadInfoFromOtherCache(int i);

    void tryDownload(DownloadTask downloadTask);

    void tryDownloadWithEngine(DownloadTask downloadTask);

    boolean updateDownloadInfo(DownloadInfo downloadInfo);
}
