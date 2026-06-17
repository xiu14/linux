package com.ss.android.socialbase.downloader.service;

import android.content.Context;
import androidx.annotation.Nullable;
import com.ss.android.socialbase.downloader.depend.IDownloadDBListener;
import com.ss.android.socialbase.downloader.depend.IDownloadInterceptor;
import com.ss.android.socialbase.downloader.depend.IDownloadStatusListener;
import com.ss.android.socialbase.downloader.depend.IDownloadThreadCheckListener;
import com.ss.android.socialbase.downloader.downloader.DownloadComponentManager;
import com.ss.android.socialbase.downloader.downloader.DownloaderBuilder;
import com.ss.android.socialbase.downloader.downloader.IDownloadCache;
import com.ss.android.socialbase.downloader.downloader.IDownloadMemoryInfoListener;
import com.ss.android.socialbase.downloader.downloader.IReserveWifiStatusListener;
import com.ss.android.socialbase.downloader.downloader.ISqlDownloadCache;
import com.ss.android.socialbase.downloader.downloader.ITTNetHandler;
import com.ss.android.socialbase.downloader.impls.DefaultDownloadCache;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.utils.DownloadHelper;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class DownloadComponentManagerService implements IDownloadComponentManagerService {
    @Override // com.ss.android.socialbase.downloader.service.IDownloadComponentManagerService
    public void clearMemoryCacheData(final double d2) {
        DownloadComponentManager.submitIOTask(new Runnable() { // from class: com.ss.android.socialbase.downloader.service.DownloadComponentManagerService.1
            @Override // java.lang.Runnable
            public void run() {
                DownloadComponentManager.getDownloadCache().clearMemoryCacheData(d2);
            }
        });
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadComponentManagerService
    public void clearSqlDownloadCacheData() {
        ISqlDownloadCache sqlDownloadCache;
        try {
            IDownloadCache downloadCache = DownloadComponentManager.getDownloadCache();
            if (downloadCache == null || !(downloadCache instanceof DefaultDownloadCache) || (sqlDownloadCache = ((DefaultDownloadCache) downloadCache).getSqlDownloadCache()) == null) {
                return;
            }
            sqlDownloadCache.clearData();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadComponentManagerService
    public void coverComponent(DownloaderBuilder downloaderBuilder) {
        DownloadComponentManager.coverComponent(downloaderBuilder);
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadComponentManagerService
    @Nullable
    public Context getAppContext() {
        return DownloadComponentManager.getAppContext();
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadComponentManagerService
    @Nullable
    public IDownloadInterceptor getDownloadInterceptor() {
        return DownloadComponentManager.getDownloadInterceptor();
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadComponentManagerService
    public JSONObject getDownloadSetting() {
        return DownloadComponentManager.getDownloadSetting();
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadComponentManagerService
    @Nullable
    public IReserveWifiStatusListener getReserveWifiStatusListener() {
        return DownloadComponentManager.getReserveWifiStatusListener();
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadComponentManagerService
    public ITTNetHandler getTTNetHandler() {
        return DownloadComponentManager.getTTNetHandler();
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadComponentManagerService
    public void initComponent(DownloaderBuilder downloaderBuilder) {
        DownloadComponentManager.initComponent(downloaderBuilder);
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadComponentManagerService
    public void initDownloadCacheImmediately() {
        DownloadComponentManager.initDownloadCacheImmediately();
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadComponentManagerService
    public boolean isInit() {
        return DownloadComponentManager.isInit();
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadComponentManagerService
    public void setAppContext(Context context) {
        DownloadComponentManager.setAppContext(context);
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadComponentManagerService
    public void setDownloadDBListener(IDownloadDBListener iDownloadDBListener) {
        DownloadComponentManager.setDownloadDBListener(iDownloadDBListener);
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadComponentManagerService
    public void setDownloadInMultiProcess() {
        DownloadComponentManager.setDownloadInMultiProcess();
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadComponentManagerService
    public void setDownloadMemoryInfoListener(IDownloadMemoryInfoListener iDownloadMemoryInfoListener) {
        DownloadComponentManager.setDownloadMemoryInfoListener(iDownloadMemoryInfoListener);
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadComponentManagerService
    public void setDownloadStatusListener(IDownloadStatusListener iDownloadStatusListener) {
        DownloadComponentManager.setDownloadStatusListener(iDownloadStatusListener);
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadComponentManagerService
    public void setDownloadThreadCheckListener(IDownloadThreadCheckListener iDownloadThreadCheckListener) {
        DownloadComponentManager.setDownloadThreadCheckListener(iDownloadThreadCheckListener);
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadComponentManagerService
    public void setReserveWifiStatusListener(IReserveWifiStatusListener iReserveWifiStatusListener) {
        DownloadComponentManager.setReserveWifiStatusListener(iReserveWifiStatusListener);
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadComponentManagerService
    public void submitIOTask(Runnable runnable) {
        DownloadComponentManager.submitIOTask(runnable);
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadComponentManagerService
    public void submitScheduleTask(Runnable runnable, long j, TimeUnit timeUnit) {
        DownloadComponentManager.submitScheduleTask(runnable, j, timeUnit);
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadComponentManagerService
    public void submitSingleTask(Runnable runnable) {
        DownloadComponentManager.submitSingleTask(runnable);
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadComponentManagerService
    public void unRegisterDownloadReceiver() {
        DownloadComponentManager.unRegisterDownloadReceiver();
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadComponentManagerService
    public void updateDownloadInfo(DownloadInfo downloadInfo) {
        DownloadHelper.checkWorkerThread("updateDownloadInfo");
        try {
            DownloadComponentManager.getDownloadCache().updateDownloadInfo(downloadInfo);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
