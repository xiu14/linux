package com.ss.android.socialbase.downloader.service;

import com.ss.android.socialbase.downloader.downloader.IDownloadServiceLoader;
import com.ss.android.socialbase.downloader.logger.Logger;

/* loaded from: classes2.dex */
public class DownloadServiceLoader implements IDownloadServiceLoader {
    private static final String TAG = "DownloadServiceLoader";
    private static boolean isLoaded = false;

    @Override // com.ss.android.socialbase.downloader.downloader.IDownloadServiceLoader
    public void defaultLoadCallback(boolean z, String str) {
        if (Logger.debug()) {
            Logger.globalDebug(TAG, "defaultLoadCallback", "Load status:" + z + " errorMsg:" + str);
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.IDownloadServiceLoader
    public void load() {
        synchronized (DownloadServiceManager.class) {
            if (isLoaded) {
                return;
            }
            isLoaded = true;
            if (Logger.debug()) {
                Logger.globalDebug(TAG, "load", "Load download service start");
            }
            DownloadServiceManager.registerService(IDownloadMonitorHelperService.class, new DownloadMonitorHelperService());
            DownloadServiceManager.registerService(IDownloadIdGeneratorService.class, new DownloadIdGeneratorService());
            DownloadServiceManager.registerService(IDownloadComponentManagerService.class, new DownloadComponentManagerService());
            DownloadServiceManager.registerService(IDownloadProcessDispatcherService.class, new DownloadProcessDispatcherService());
            DownloadServiceManager.registerService(IDownloadNetTrafficManagerService.class, new DownloadNetTrafficManagerService());
            DownloadServiceManager.registerService(IDownloadNotificationManagerService.class, new DownloadNotificationManagerService());
            DownloadServiceManager.registerService(IDownloadNetworkService.class, new DownloadNetworkService());
            DownloadServiceManager.registerService(IDownloadRetrySchedulerService.class, new DownloadRetrySchedulerService());
            DownloadServiceManager.registerService(IDownloadMultiProcService.class, new DownloadMultiProcService());
            DownloadServiceManager.setServiceLoaded();
            if (Logger.debug()) {
                Logger.globalDebug(TAG, "load", "Load download service end");
            }
        }
    }
}
