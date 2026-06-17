package com.ss.android.socialbase.downloader.service;

import androidx.annotation.Nullable;
import com.ss.android.socialbase.downloader.downloader.IDownloadServiceLoader;
import com.ss.android.socialbase.downloader.logger.Logger;
import com.ss.android.socialbase.downloader.service.IDownloadComponentManagerService;
import com.ss.android.socialbase.downloader.service.IDownloadIdGeneratorService;
import com.ss.android.socialbase.downloader.service.IDownloadMonitorHelperService;
import com.ss.android.socialbase.downloader.service.IDownloadMultiProcService;
import com.ss.android.socialbase.downloader.service.IDownloadNetTrafficManagerService;
import com.ss.android.socialbase.downloader.service.IDownloadNetworkService;
import com.ss.android.socialbase.downloader.service.IDownloadNotificationManagerService;
import com.ss.android.socialbase.downloader.service.IDownloadProcessDispatcherService;
import com.ss.android.socialbase.downloader.service.IDownloadRetrySchedulerService;
import e.a.a.a.a;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public class DownloadServiceManager {
    private static final String DOWNLOAD_SERVICE_LOADER = "com.ss.android.socialbase.downloader.service.DownloadServiceLoader";
    private static final String TAG = "DownloadServiceManager";
    private static final ConcurrentHashMap<Class, Object> SERVICES = new ConcurrentHashMap<>();
    private static String defaultLoadMsg = null;
    private static volatile boolean isLoadService = false;

    @Nullable
    public static <T> T getService(Class<T> cls) {
        if (!isLoadService) {
            loadDefaultService(DOWNLOAD_SERVICE_LOADER);
        }
        return (T) SERVICES.get(cls);
    }

    private static void loadDefaultService(String str) {
        synchronized (DownloadServiceManager.class) {
            if (isLoadService) {
                return;
            }
            if (runLoad(str)) {
                isLoadService = true;
                return;
            }
            registerService(IDownloadMonitorHelperService.class, new IDownloadMonitorHelperService.DefaultDownloadMonitorHelperService());
            registerService(IDownloadIdGeneratorService.class, new IDownloadIdGeneratorService.DefaultDownloadIdGeneratorService());
            registerService(IDownloadComponentManagerService.class, new IDownloadComponentManagerService.DefaultDownloadComponentManagerService());
            registerService(IDownloadProcessDispatcherService.class, new IDownloadProcessDispatcherService.DefaultDownloadProcessDispatcherService());
            registerService(IDownloadNetTrafficManagerService.class, new IDownloadNetTrafficManagerService.DefaultDownloadNetTrafficManagerService());
            registerService(IDownloadNotificationManagerService.class, new IDownloadNotificationManagerService.DefaultDownloadNotificationManagerService());
            registerService(IDownloadNetworkService.class, new IDownloadNetworkService.DefaultDownloadNetworkService());
            registerService(IDownloadRetrySchedulerService.class, new IDownloadRetrySchedulerService.DefaultDownloadRetrySchedulerService());
            registerService(IDownloadMultiProcService.class, new IDownloadMultiProcService.DefaultDownloadMultiProcService());
            Logger.globalError(TAG, "loadDefaultService", "Run");
            isLoadService = true;
        }
    }

    public static void loadService(IDownloadServiceLoader iDownloadServiceLoader) {
        if (iDownloadServiceLoader != null) {
            iDownloadServiceLoader.load();
            String str = defaultLoadMsg;
            iDownloadServiceLoader.defaultLoadCallback(str == null, str);
        }
    }

    public static <T> void registerService(Class<T> cls, T t) {
        SERVICES.put(cls, t);
    }

    protected static boolean runLoad(String str) {
        try {
            Class<?> cls = Class.forName(str);
            cls.getMethod("load", new Class[0]).invoke(cls.newInstance(), new Object[0]);
            if (!Logger.debug()) {
                return true;
            }
            Logger.globalDebug(TAG, "runLoad", "Run load :" + str + " success");
            return true;
        } catch (Throwable th) {
            defaultLoadMsg = th.toString();
            String str2 = TAG;
            StringBuilder U = a.U("Run load :", str, "fail, ");
            U.append(th.toString());
            Logger.globalError(str2, "runLoad", U.toString());
            th.printStackTrace();
            return false;
        }
    }

    public static void setServiceLoaded() {
        isLoadService = true;
    }
}
