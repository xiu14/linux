package com.ss.android.socialbase.downloader.service;

import android.content.Context;
import androidx.annotation.Nullable;
import com.ss.android.socialbase.downloader.constants.DownloadConstants;
import com.ss.android.socialbase.downloader.depend.IDownloadDBListener;
import com.ss.android.socialbase.downloader.depend.IDownloadInterceptor;
import com.ss.android.socialbase.downloader.depend.IDownloadStatusListener;
import com.ss.android.socialbase.downloader.depend.IDownloadThreadCheckListener;
import com.ss.android.socialbase.downloader.downloader.DownloaderBuilder;
import com.ss.android.socialbase.downloader.downloader.IDownloadMemoryInfoListener;
import com.ss.android.socialbase.downloader.downloader.IReserveWifiStatusListener;
import com.ss.android.socialbase.downloader.downloader.ITTNetHandler;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public interface IDownloadComponentManagerService {

    public static class DefaultDownloadComponentManagerService implements IDownloadComponentManagerService {
        @Override // com.ss.android.socialbase.downloader.service.IDownloadComponentManagerService
        public void clearMemoryCacheData(double d2) {
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadComponentManagerService
        public void clearSqlDownloadCacheData() {
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadComponentManagerService
        public void coverComponent(DownloaderBuilder downloaderBuilder) {
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadComponentManagerService
        @Nullable
        public Context getAppContext() {
            return null;
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadComponentManagerService
        @Nullable
        public IDownloadInterceptor getDownloadInterceptor() {
            return null;
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadComponentManagerService
        public JSONObject getDownloadSetting() {
            return DownloadConstants.EMPTY_JSON;
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadComponentManagerService
        @Nullable
        public IReserveWifiStatusListener getReserveWifiStatusListener() {
            return null;
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadComponentManagerService
        public ITTNetHandler getTTNetHandler() {
            return new ITTNetHandler.DefaultTTNetHandler();
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadComponentManagerService
        public void initComponent(DownloaderBuilder downloaderBuilder) {
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadComponentManagerService
        public void initDownloadCacheImmediately() {
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadComponentManagerService
        public boolean isInit() {
            return false;
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadComponentManagerService
        public void setAppContext(Context context) {
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadComponentManagerService
        public void setDownloadDBListener(IDownloadDBListener iDownloadDBListener) {
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadComponentManagerService
        public void setDownloadInMultiProcess() {
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadComponentManagerService
        public void setDownloadMemoryInfoListener(IDownloadMemoryInfoListener iDownloadMemoryInfoListener) {
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadComponentManagerService
        public void setDownloadStatusListener(IDownloadStatusListener iDownloadStatusListener) {
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadComponentManagerService
        public void setDownloadThreadCheckListener(IDownloadThreadCheckListener iDownloadThreadCheckListener) {
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadComponentManagerService
        public void setReserveWifiStatusListener(IReserveWifiStatusListener iReserveWifiStatusListener) {
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadComponentManagerService
        public void submitIOTask(Runnable runnable) {
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadComponentManagerService
        public void submitScheduleTask(Runnable runnable, long j, TimeUnit timeUnit) {
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadComponentManagerService
        public void submitSingleTask(Runnable runnable) {
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadComponentManagerService
        public void unRegisterDownloadReceiver() {
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadComponentManagerService
        public void updateDownloadInfo(DownloadInfo downloadInfo) {
        }
    }

    void clearMemoryCacheData(double d2);

    void clearSqlDownloadCacheData();

    void coverComponent(DownloaderBuilder downloaderBuilder);

    @Nullable
    Context getAppContext();

    @Nullable
    IDownloadInterceptor getDownloadInterceptor();

    JSONObject getDownloadSetting();

    @Nullable
    IReserveWifiStatusListener getReserveWifiStatusListener();

    ITTNetHandler getTTNetHandler();

    void initComponent(DownloaderBuilder downloaderBuilder);

    void initDownloadCacheImmediately();

    boolean isInit();

    void setAppContext(Context context);

    void setDownloadDBListener(IDownloadDBListener iDownloadDBListener);

    void setDownloadInMultiProcess();

    void setDownloadMemoryInfoListener(IDownloadMemoryInfoListener iDownloadMemoryInfoListener);

    void setDownloadStatusListener(IDownloadStatusListener iDownloadStatusListener);

    void setDownloadThreadCheckListener(IDownloadThreadCheckListener iDownloadThreadCheckListener);

    void setReserveWifiStatusListener(IReserveWifiStatusListener iReserveWifiStatusListener);

    void submitIOTask(Runnable runnable);

    void submitScheduleTask(Runnable runnable, long j, TimeUnit timeUnit);

    void submitSingleTask(Runnable runnable);

    void unRegisterDownloadReceiver();

    void updateDownloadInfo(DownloadInfo downloadInfo);
}
