package com.ss.android.socialbase.downloader.core.module;

import com.ss.android.socialbase.downloader.core.AbsDownloadModule;
import com.ss.android.socialbase.downloader.core.IDownloadModuleChain;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.exception.DownloadOnlyWifiException;
import com.ss.android.socialbase.downloader.exception.DownloadPauseReserveWifiException;
import com.ss.android.socialbase.downloader.exception.DownloadRetryNeedlessException;
import com.ss.android.socialbase.downloader.logger.Logger;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.network.DeviceBandwidthSampler;

/* loaded from: classes2.dex */
public class DownloadCheckWifiTaskValidModule extends AbsDownloadModule {
    private static final String TAG = "DownloadCheckWifiTaskValidModule";

    public static void checkWifiTaskValid(DownloadInfo downloadInfo) throws DownloadRetryNeedlessException {
        if (DeviceBandwidthSampler.isWifi()) {
            return;
        }
        if (downloadInfo.isOnlyWifi()) {
            DeviceBandwidthSampler.updateNetworkStatus();
            if (DeviceBandwidthSampler.isMobileNet()) {
                throw new DownloadOnlyWifiException();
            }
        }
        if (downloadInfo.isDownloadFromReserveWifi() && downloadInfo.isPauseReserveOnWifi()) {
            DeviceBandwidthSampler.updateNetworkStatus();
            if (DeviceBandwidthSampler.isMobileNet()) {
                throw new DownloadPauseReserveWifiException();
            }
        }
    }

    @Override // com.ss.android.socialbase.downloader.core.IDownloadModule
    public void proceed(IDownloadModuleChain iDownloadModuleChain) throws BaseException {
        if (Logger.debug()) {
            Logger.taskDebug(TAG, this.mDownloadInfo.getId(), "proceed", "Run");
        }
        checkWifiTaskValid(this.mDownloadInfo);
        iDownloadModuleChain.proceed();
    }
}
