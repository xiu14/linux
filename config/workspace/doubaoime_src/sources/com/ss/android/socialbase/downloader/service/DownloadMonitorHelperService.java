package com.ss.android.socialbase.downloader.service;

import com.ss.android.socialbase.downloader.depend.IDownloadMonitorDepend;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import com.ss.android.socialbase.downloader.monitor.DownloadMonitorHelper;

/* loaded from: classes2.dex */
public class DownloadMonitorHelperService implements IDownloadMonitorHelperService {
    @Override // com.ss.android.socialbase.downloader.service.IDownloadMonitorHelperService
    public void monitorSend(DownloadTask downloadTask, BaseException baseException, int i) {
        DownloadMonitorHelper.monitorSend(downloadTask, baseException, i);
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadMonitorHelperService
    public void monitorSendWithTaskMonitor(IDownloadMonitorDepend iDownloadMonitorDepend, DownloadInfo downloadInfo, BaseException baseException, int i) {
        DownloadMonitorHelper.monitorSendWithTaskMonitor(iDownloadMonitorDepend, downloadInfo, baseException, i);
    }
}
