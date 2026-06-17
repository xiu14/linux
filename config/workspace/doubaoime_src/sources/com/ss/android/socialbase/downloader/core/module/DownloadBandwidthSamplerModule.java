package com.ss.android.socialbase.downloader.core.module;

import com.ss.android.socialbase.downloader.core.AbsDownloadModule;
import com.ss.android.socialbase.downloader.core.IDownloadModuleChain;
import com.ss.android.socialbase.downloader.downloader.DownloadComponentManager;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.logger.Logger;
import com.ss.android.socialbase.downloader.network.DeviceBandwidthSampler;

/* loaded from: classes2.dex */
public class DownloadBandwidthSamplerModule extends AbsDownloadModule {
    private static final String TAG = "DownloadBandwidthSamplerModule";

    @Override // com.ss.android.socialbase.downloader.core.IDownloadModule
    public void proceed(IDownloadModuleChain iDownloadModuleChain) throws BaseException {
        if (Logger.debug()) {
            Logger.taskDebug(TAG, this.mDownloadInfo.getId(), "proceed", "Run");
        }
        DownloadComponentManager.onDownloadTaskStart(this.mDownloadTask, 3);
        DeviceBandwidthSampler.getInstance().startSampling();
        iDownloadModuleChain.proceed();
        DeviceBandwidthSampler.getInstance().stopSampling();
        DownloadComponentManager.onDownloadTaskFinish(this.mDownloadTask, 3);
    }
}
