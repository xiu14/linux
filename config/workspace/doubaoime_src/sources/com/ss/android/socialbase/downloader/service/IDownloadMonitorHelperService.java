package com.ss.android.socialbase.downloader.service;

import com.ss.android.socialbase.downloader.depend.IDownloadMonitorDepend;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.DownloadTask;

/* loaded from: classes2.dex */
public interface IDownloadMonitorHelperService {

    public static class DefaultDownloadMonitorHelperService implements IDownloadMonitorHelperService {
        @Override // com.ss.android.socialbase.downloader.service.IDownloadMonitorHelperService
        public void monitorSend(DownloadTask downloadTask, BaseException baseException, int i) {
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadMonitorHelperService
        public void monitorSendWithTaskMonitor(IDownloadMonitorDepend iDownloadMonitorDepend, DownloadInfo downloadInfo, BaseException baseException, int i) {
        }
    }

    void monitorSend(DownloadTask downloadTask, BaseException baseException, int i);

    void monitorSendWithTaskMonitor(IDownloadMonitorDepend iDownloadMonitorDepend, DownloadInfo downloadInfo, BaseException baseException, int i);
}
