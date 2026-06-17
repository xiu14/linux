package com.ss.android.socialbase.downloader.downloader;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.ss.android.socialbase.downloader.common.AppStatusManager;
import com.ss.android.socialbase.downloader.constants.BoundType;
import com.ss.android.socialbase.downloader.constants.DownloadCacheSyncStatus;
import com.ss.android.socialbase.downloader.constants.DownloadConstants;
import com.ss.android.socialbase.downloader.constants.MonitorConstants;
import com.ss.android.socialbase.downloader.depend.IDownloadCacheSyncStatusListener;
import com.ss.android.socialbase.downloader.depend.IDownloadCompleteHandler;
import com.ss.android.socialbase.downloader.depend.IDownloadDBListener;
import com.ss.android.socialbase.downloader.depend.IDownloadInterceptor;
import com.ss.android.socialbase.downloader.depend.IDownloadSettings;
import com.ss.android.socialbase.downloader.depend.IDownloadStatusListener;
import com.ss.android.socialbase.downloader.depend.IDownloadTaskExecuteListener;
import com.ss.android.socialbase.downloader.depend.IDownloadThreadCheckListener;
import com.ss.android.socialbase.downloader.depend.INotificationClickCallback;
import com.ss.android.socialbase.downloader.depend.ProcessCallback;
import com.ss.android.socialbase.downloader.downloader.ITTNetHandler;
import com.ss.android.socialbase.downloader.impls.AbsDownloadEngine;
import com.ss.android.socialbase.downloader.impls.DefaultDownloadCache;
import com.ss.android.socialbase.downloader.impls.DefaultDownloadEngine;
import com.ss.android.socialbase.downloader.impls.DefaultDownloadHttpService;
import com.ss.android.socialbase.downloader.impls.DefaultDownloadServiceHandler;
import com.ss.android.socialbase.downloader.impls.DownloadHandleService;
import com.ss.android.socialbase.downloader.impls.DownloadProxy;
import com.ss.android.socialbase.downloader.logger.Logger;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import com.ss.android.socialbase.downloader.model.DownloadThreadInfo;
import com.ss.android.socialbase.downloader.model.HttpHeader;
import com.ss.android.socialbase.downloader.monitor.IDownloadMonitorListener;
import com.ss.android.socialbase.downloader.monitor.InnerEventListener;
import com.ss.android.socialbase.downloader.network.IDownloadDns;
import com.ss.android.socialbase.downloader.network.IDownloadHeadHttpConnection;
import com.ss.android.socialbase.downloader.network.IDownloadHttpConnection;
import com.ss.android.socialbase.downloader.network.IDownloadHttpService;
import com.ss.android.socialbase.downloader.service.DownloadServiceManager;
import com.ss.android.socialbase.downloader.service.IDownloadIdGeneratorService;
import com.ss.android.socialbase.downloader.service.IDownloadMultiProcService;
import com.ss.android.socialbase.downloader.service.IDownloadNetworkService;
import com.ss.android.socialbase.downloader.setting.DownloadSetting;
import com.ss.android.socialbase.downloader.setting.DownloadSettingKeys;
import com.ss.android.socialbase.downloader.thread.DefaultThreadFactory;
import com.ss.android.socialbase.downloader.utils.DownloadHelper;
import com.ss.android.socialbase.downloader.utils.DownloadUtils;
import e.a.a.a.a;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import okhttp3.Protocol;
import okhttp3.m;
import okhttp3.n;
import okhttp3.x;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class DownloadComponentManager {
    public static final int NET_LIB_DEFAULT = 0;
    public static final int NET_LIB_HOST = 1;
    public static final int NET_LIB_NO_BACKUP = 2;
    private static final String TAG = "DownloadComponentManager";
    private static volatile Context appContext;
    private static volatile ExecutorService chunkDownloadExecutor;
    private static volatile ExecutorService cpuThreadExecutor;
    private static volatile ExecutorService customThreadExecutor;
    private static volatile ExecutorService dbThreadExecutor;
    private static volatile IDownloadDns defaultDownloadDns;
    private static volatile IDownloadHttpService defaultHttpService;
    private static volatile IDownloadCache downloadCache;
    private static final List<IDownloadCacheSyncStatusListener> downloadCacheSyncStatusListeners;
    private static volatile IDownloadDBListener downloadDBListener;
    private static volatile IDownloadDns downloadDns;
    private static volatile AbsDownloadEngine downloadEngine;
    private static InnerEventListener downloadEventListener;
    private static volatile IDownloadInterceptor downloadInterceptor;
    private static volatile IDownloadLaunchHandler downloadLaunchHandler;
    private static volatile IDownloadMemoryInfoListener downloadMemoryInfoListener;
    private static volatile IDownloadMonitorListener downloadMonitorListener;
    private static volatile DownloadReceiver downloadReceiver;
    private static volatile IDownloadServiceHandler downloadServiceHandler;
    private static volatile IDownloadSettings downloadSettings;
    private static volatile IDownloadStatusListener downloadStatusListener;
    private static final List<IDownloadTaskExecuteListener> downloadTaskExecuteListeners;
    private static final int fixedCPUPoolSize;
    private static final int fixedDBPoolSize;
    private static final int fixedIOPoolSize;
    private static final int fixedMIXPoolSize;
    private static volatile boolean hasInit;
    private static volatile IDownloadHttpService httpService;
    private static boolean httpServiceInit;
    private static volatile ITTNetHandler iTTNetHandler;
    private static volatile IDownloadServiceHandler independentDownloadServiceHandler;
    private static volatile IndependentHolderCreator independentHolderCreator;
    private static volatile ExecutorService ioThreadExecutor;
    private static volatile ExecutorService mixApkDownloadExecutor;
    private static volatile ExecutorService mixDefaultDownloadExecutor;
    private static volatile ExecutorService mixFrequentDownloadExecutor;
    private static volatile IMonitorConfig monitorConfig;
    private static boolean needAutoRefreshUnSuccessTask;
    private static volatile INotificationClickCallback notificationClickCallback;
    private static volatile ExecutorService okHttpDispatcherExecutor;
    private static IReserveWifiStatusListener reserveWifiStatusListener;
    private static volatile ScheduledExecutorService scheduledExecutor;
    private static volatile ExecutorService segmentThreadExecutor;
    private static volatile ExecutorService singleThreadExecutor;
    private static volatile IDownloadThreadCheckListener threadCheckListener;
    private static int writeBufferSize;
    private static volatile List<ProcessCallback> processCallbacks = new CopyOnWriteArrayList();
    private static volatile boolean downloadInMultiProcess = false;
    private static volatile x sOkHttpClient = null;
    private static final List<IDownloadCompleteHandler> downloadCompleteHandlers = new ArrayList();
    private static boolean isReceiverRegistered = false;

    public interface IndependentHolderCreator {

        public interface OnMainProcessRebindErrorListener {
            void onRebindError();
        }

        ISqlDownloadCache createCache(OnMainProcessRebindErrorListener onMainProcessRebindErrorListener);

        IDownloadProxy createProxy();

        IDownloadServiceHandler createServiceHandler();
    }

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors() + 1;
        fixedCPUPoolSize = availableProcessors;
        fixedIOPoolSize = (Runtime.getRuntime().availableProcessors() * 2) + 1;
        fixedMIXPoolSize = availableProcessors;
        fixedDBPoolSize = availableProcessors;
        writeBufferSize = DownloadConstants.TTNET_DEFAULT_BUFFER_SIZE;
        downloadCacheSyncStatusListeners = new ArrayList();
        downloadTaskExecuteListeners = new ArrayList();
        needAutoRefreshUnSuccessTask = true;
        hasInit = false;
        IDownloadMultiProcService iDownloadMultiProcService = (IDownloadMultiProcService) DownloadServiceManager.getService(IDownloadMultiProcService.class);
        if (iDownloadMultiProcService != null) {
            iDownloadMultiProcService.registerIndependentServiceCreator();
        }
    }

    private DownloadComponentManager() {
    }

    public static void addDownloadCompleteHandler(IDownloadCompleteHandler iDownloadCompleteHandler) {
        List<IDownloadCompleteHandler> list = downloadCompleteHandlers;
        synchronized (list) {
            if (iDownloadCompleteHandler != null) {
                if (!list.contains(iDownloadCompleteHandler)) {
                    list.add(iDownloadCompleteHandler);
                }
            }
        }
    }

    public static void addProcessCallback(ProcessCallback processCallback) {
        if (processCallback == null) {
            return;
        }
        processCallbacks.add(processCallback);
    }

    public static synchronized void coverComponent(DownloaderBuilder downloaderBuilder) {
        synchronized (DownloadComponentManager.class) {
            setDownloadBuilder(downloaderBuilder);
        }
    }

    public static x.b createDownloadClientBuilder() {
        x.b bVar = new x.b();
        int optInt = DownloadSetting.getGlobalSettings().optInt("connect_timeout", 30000);
        int optInt2 = DownloadSetting.getGlobalSettings().optInt(DownloadSettingKeys.IO_TIMEOUT, 30000);
        long j = optInt;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        bVar.d(j, timeUnit);
        long j2 = optInt2;
        bVar.o(j2, timeUnit);
        bVar.s(j2, timeUnit);
        bVar.p(true);
        bVar.l(true);
        bVar.m(Collections.singletonList(Protocol.HTTP_1_1));
        if (okHttpDispatcherExecutor != null) {
            bVar.h(new m(okHttpDispatcherExecutor));
        }
        return bVar;
    }

    public static IDownloadHttpConnection downloadWithConnection(boolean z, int i, String str, List<HttpHeader> list) throws Exception {
        return ((IDownloadNetworkService) DownloadServiceManager.getService(IDownloadNetworkService.class)).downloadWithConnection(z, i, str, list);
    }

    @Deprecated
    public static IDownloadHeadHttpConnection downloadWithHeadConnection(String str, List<HttpHeader> list) throws Exception {
        return ((IDownloadNetworkService) DownloadServiceManager.getService(IDownloadNetworkService.class)).downloadWithConnection(true, 0, str, list);
    }

    public static void ensureOPPO() {
        if (TextUtils.isEmpty(DownloadConstants.LOWER_OPPO)) {
            DownloadConstants.LOWER_OPPO = "oppo";
            DownloadConstants.UPPER_OPPO = DownloadConstants.LOWER_OPPO.toUpperCase();
        }
    }

    public static synchronized Context getAppContext() {
        Context context;
        synchronized (DownloadComponentManager.class) {
            context = appContext;
        }
        return context;
    }

    public static ExecutorService getCPUThreadExecutor() {
        if (cpuThreadExecutor == null) {
            synchronized (DownloadComponentManager.class) {
                if (cpuThreadExecutor == null) {
                    int i = fixedCPUPoolSize;
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i, i, 15L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new DefaultThreadFactory("DownloadThreadPool-cpu-fixed", true));
                    try {
                        threadPoolExecutor.allowCoreThreadTimeOut(true);
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                    cpuThreadExecutor = threadPoolExecutor;
                }
            }
        }
        return cpuThreadExecutor;
    }

    public static ExecutorService getChunkDownloadThreadExecutorService() {
        if (chunkDownloadExecutor == null) {
            synchronized (DownloadComponentManager.class) {
                if (chunkDownloadExecutor == null) {
                    int i = fixedIOPoolSize;
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i, i, 15L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new DefaultThreadFactory("DownloadThreadPool-chunk-fixed", true));
                    try {
                        threadPoolExecutor.allowCoreThreadTimeOut(true);
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                    chunkDownloadExecutor = threadPoolExecutor;
                }
            }
        }
        return chunkDownloadExecutor;
    }

    public static ExecutorService getCustomThreadExecutor() {
        return customThreadExecutor;
    }

    public static ExecutorService getDBThreadExecutorService() {
        if (dbThreadExecutor == null) {
            synchronized (DownloadComponentManager.class) {
                if (dbThreadExecutor == null) {
                    int i = fixedDBPoolSize;
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i, i, 15L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new DefaultThreadFactory("DownloadThreadPool-db-fixed", true));
                    try {
                        threadPoolExecutor.allowCoreThreadTimeOut(true);
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                    dbThreadExecutor = threadPoolExecutor;
                }
            }
        }
        return dbThreadExecutor;
    }

    public static IDownloadDns getDefaultDownloadDns() {
        if (defaultDownloadDns == null) {
            synchronized (DownloadComponentManager.class) {
                if (defaultDownloadDns == null) {
                    defaultDownloadDns = new IDownloadDns() { // from class: com.ss.android.socialbase.downloader.downloader.DownloadComponentManager.3
                        @Override // com.ss.android.socialbase.downloader.network.IDownloadDns
                        public List<InetAddress> lookup(String str) throws UnknownHostException {
                            return n.a.lookup(str);
                        }
                    };
                }
            }
        }
        return defaultDownloadDns;
    }

    public static IDownloadHttpService getDefaultHttpService() {
        if (defaultHttpService == null) {
            synchronized (DownloadComponentManager.class) {
                if (defaultHttpService == null) {
                    defaultHttpService = new DefaultDownloadHttpService();
                }
            }
        }
        return defaultHttpService;
    }

    public static IDownloadCache getDownloadCache() {
        if (downloadCache == null) {
            synchronized (DownloadComponentManager.class) {
                if (downloadCache == null) {
                    downloadCache = new DefaultDownloadCache();
                }
            }
        }
        return downloadCache;
    }

    public static x getDownloadClient() {
        if (sOkHttpClient == null) {
            synchronized (DownloadComponentManager.class) {
                if (sOkHttpClient == null) {
                    sOkHttpClient = createDownloadClientBuilder().c();
                }
            }
        }
        return sOkHttpClient;
    }

    public static List<IDownloadCompleteHandler> getDownloadCompleteHandlers() {
        return downloadCompleteHandlers;
    }

    public static IDownloadDBListener getDownloadDBListener() {
        return downloadDBListener;
    }

    public static IDownloadDns getDownloadDns() {
        return downloadDns;
    }

    public static AbsDownloadEngine getDownloadEngine() {
        if (downloadEngine == null) {
            synchronized (DownloadComponentManager.class) {
                if (downloadEngine == null) {
                    downloadEngine = new DefaultDownloadEngine();
                }
            }
        }
        return downloadEngine;
    }

    public static int getDownloadId(DownloadInfo downloadInfo) {
        return ((IDownloadIdGeneratorService) DownloadServiceManager.getService(IDownloadIdGeneratorService.class)).generate(downloadInfo);
    }

    public static IDownloadInterceptor getDownloadInterceptor() {
        return downloadInterceptor;
    }

    public static synchronized IDownloadLaunchHandler getDownloadLaunchHandler() {
        IDownloadLaunchHandler iDownloadLaunchHandler;
        synchronized (DownloadComponentManager.class) {
            iDownloadLaunchHandler = downloadLaunchHandler;
        }
        return iDownloadLaunchHandler;
    }

    public static IDownloadMemoryInfoListener getDownloadMemoryInfoListener() {
        return downloadMemoryInfoListener;
    }

    public static IDownloadMonitorListener getDownloadMonitorListener() {
        return downloadMonitorListener;
    }

    public static IDownloadServiceHandler getDownloadServiceHandler() {
        if (downloadServiceHandler == null) {
            synchronized (DownloadComponentManager.class) {
                if (downloadServiceHandler == null) {
                    downloadServiceHandler = new DefaultDownloadServiceHandler();
                }
            }
        }
        return downloadServiceHandler;
    }

    @NonNull
    public static JSONObject getDownloadSetting() {
        JSONObject jSONObject = (downloadSettings == null || downloadSettings.get() == null) ? DownloadConstants.EMPTY_JSON : downloadSettings.get();
        return jSONObject.optInt(DownloadSettingKeys.ENABLE_TTNET_TNC_SETTING) <= 0 ? jSONObject : getTTNetHandler().mergeTNCConfig(jSONObject);
    }

    public static IDownloadStatusListener getDownloadStatusListener() {
        return downloadStatusListener;
    }

    public static IDownloadThreadCheckListener getDownloadThreadCheckListener() {
        return threadCheckListener;
    }

    @NonNull
    public static InnerEventListener getEventListener() {
        if (downloadEventListener == null) {
            downloadEventListener = new InnerEventListener() { // from class: com.ss.android.socialbase.downloader.downloader.DownloadComponentManager.4
                @Override // com.ss.android.socialbase.downloader.monitor.InnerEventListener
                public void onEvent(int i, String str, JSONObject jSONObject) {
                }

                @Override // com.ss.android.socialbase.downloader.monitor.InnerEventListener
                public void onUnityEvent(int i, String str, JSONObject jSONObject) {
                }
            };
        }
        return downloadEventListener;
    }

    public static IDownloadHttpService getHttpService() {
        return httpService;
    }

    public static ExecutorService getIOThreadExecutor() {
        return ioThreadExecutor != null ? ioThreadExecutor : getCPUThreadExecutor();
    }

    public static IDownloadServiceHandler getIndependentDownloadServiceHandler() {
        if (independentDownloadServiceHandler == null) {
            synchronized (DownloadComponentManager.class) {
                if (independentDownloadServiceHandler == null) {
                    independentDownloadServiceHandler = independentHolderCreator.createServiceHandler();
                }
            }
        }
        return independentDownloadServiceHandler;
    }

    public static IndependentHolderCreator getIndependentHolderCreator() {
        return independentHolderCreator;
    }

    public static ExecutorService getMixApkThreadExecutor() {
        return mixApkDownloadExecutor != null ? mixApkDownloadExecutor : getMixDefaultThreadExecutor();
    }

    public static ExecutorService getMixDefaultThreadExecutor() {
        if (mixDefaultDownloadExecutor == null) {
            synchronized (DownloadComponentManager.class) {
                if (mixDefaultDownloadExecutor == null) {
                    int i = fixedMIXPoolSize;
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i, i, 15L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new DefaultThreadFactory("DownloadThreadPool-mix-fixed", true));
                    try {
                        threadPoolExecutor.allowCoreThreadTimeOut(true);
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                    mixDefaultDownloadExecutor = threadPoolExecutor;
                }
            }
        }
        return mixDefaultDownloadExecutor;
    }

    public static ExecutorService getMixFrequentThreadExecutor() {
        return mixFrequentDownloadExecutor != null ? mixFrequentDownloadExecutor : getMixDefaultThreadExecutor();
    }

    public static synchronized IMonitorConfig getMonitorConfig() {
        IMonitorConfig iMonitorConfig;
        synchronized (DownloadComponentManager.class) {
            iMonitorConfig = monitorConfig;
        }
        return iMonitorConfig;
    }

    public static INotificationClickCallback getNotificationClickCallback() {
        return notificationClickCallback;
    }

    public static List<ProcessCallback> getProcessCallbacks() {
        return processCallbacks;
    }

    public static IReserveWifiStatusListener getReserveWifiStatusListener() {
        return reserveWifiStatusListener;
    }

    public static ScheduledExecutorService getScheduledExecutorService() {
        if (scheduledExecutor == null) {
            synchronized (DownloadComponentManager.class) {
                if (scheduledExecutor == null) {
                    scheduledExecutor = new ScheduledThreadPoolExecutor(4, new DefaultThreadFactory("DownloadThreadPool-Schedule", true));
                }
            }
        }
        return scheduledExecutor;
    }

    public static ExecutorService getSegmentDownloadThreadExecutorService() {
        if (segmentThreadExecutor == null) {
            synchronized (DownloadComponentManager.class) {
                if (segmentThreadExecutor == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new DefaultThreadFactory("DownloadThreadPool-segment-fixed", true));
                    try {
                        threadPoolExecutor.allowCoreThreadTimeOut(true);
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                    segmentThreadExecutor = threadPoolExecutor;
                }
            }
        }
        return segmentThreadExecutor;
    }

    public static ExecutorService getSingleThreadExecutorService() {
        if (singleThreadExecutor == null) {
            synchronized (DownloadComponentManager.class) {
                if (singleThreadExecutor == null) {
                    singleThreadExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new DefaultThreadFactory("DownloadThreadPool-Single", true));
                }
            }
        }
        return singleThreadExecutor;
    }

    public static ITTNetHandler getTTNetHandler() {
        if (iTTNetHandler == null) {
            synchronized (DownloadComponentManager.class) {
                if (iTTNetHandler == null) {
                    iTTNetHandler = new ITTNetHandler.DefaultTTNetHandler();
                }
            }
        }
        return iTTNetHandler;
    }

    public static synchronized int getWriteBufferSize() {
        int i;
        synchronized (DownloadComponentManager.class) {
            i = writeBufferSize;
        }
        return i;
    }

    public static synchronized void initComponent(DownloaderBuilder downloaderBuilder) {
        synchronized (DownloadComponentManager.class) {
            if (hasInit) {
                Logger.globalError(TAG, "initComponent", "Component has init");
                return;
            }
            boolean z = downloadInMultiProcess;
            setDownloadBuilder(downloaderBuilder);
            if (downloadCache == null) {
                downloadCache = new DefaultDownloadCache();
            }
            if (downloadServiceHandler == null) {
                downloadServiceHandler = new DefaultDownloadServiceHandler();
            }
            if (independentDownloadServiceHandler == null && independentHolderCreator != null) {
                independentDownloadServiceHandler = independentHolderCreator.createServiceHandler();
            }
            if (downloadEngine == null) {
                downloadEngine = new DefaultDownloadEngine();
            }
            registerAsync((!downloadInMultiProcess || z || DownloadHelper.isDownloaderProcess()) ? false : true);
            ensureOPPO();
            hasInit = true;
        }
    }

    public static void initDownloadCacheImmediately() {
        getDownloadCache().initImmediately();
    }

    public static synchronized boolean isDownloadInMultiProcess() {
        boolean z;
        synchronized (DownloadComponentManager.class) {
            z = downloadInMultiProcess;
        }
        return z;
    }

    public static synchronized boolean isHttpServiceInit() {
        boolean z;
        synchronized (DownloadComponentManager.class) {
            z = httpServiceInit;
        }
        return z;
    }

    public static boolean isInit() {
        return hasInit;
    }

    private static void needAutoRefreshUnSuccessTask(boolean z) {
        needAutoRefreshUnSuccessTask = z;
    }

    public static void onDownloadCacheSyncCallback(DownloadCacheSyncStatus downloadCacheSyncStatus) {
        List<IDownloadCacheSyncStatusListener> list = downloadCacheSyncStatusListeners;
        synchronized (list) {
            for (IDownloadCacheSyncStatusListener iDownloadCacheSyncStatusListener : list) {
                if (iDownloadCacheSyncStatusListener != null) {
                    if (downloadCacheSyncStatus == DownloadCacheSyncStatus.SYNC_START) {
                        iDownloadCacheSyncStatusListener.onStart();
                    } else if (downloadCacheSyncStatus == DownloadCacheSyncStatus.SYNC_SUCCESS) {
                        iDownloadCacheSyncStatusListener.onSuccess();
                    }
                }
            }
            if (downloadCacheSyncStatus == DownloadCacheSyncStatus.SYNC_SUCCESS) {
                downloadCacheSyncStatusListeners.clear();
            }
        }
    }

    public static void onDownloadTaskFinish(DownloadTask downloadTask, @BoundType int i) {
        List<IDownloadTaskExecuteListener> list = downloadTaskExecuteListeners;
        synchronized (list) {
            for (IDownloadTaskExecuteListener iDownloadTaskExecuteListener : list) {
                if (iDownloadTaskExecuteListener != null) {
                    iDownloadTaskExecuteListener.onFinish(downloadTask, i);
                }
            }
        }
    }

    public static void onDownloadTaskStart(DownloadTask downloadTask, @BoundType int i) {
        List<IDownloadTaskExecuteListener> list = downloadTaskExecuteListeners;
        synchronized (list) {
            for (IDownloadTaskExecuteListener iDownloadTaskExecuteListener : list) {
                if (iDownloadTaskExecuteListener != null) {
                    iDownloadTaskExecuteListener.onStart(downloadTask, i);
                }
            }
        }
    }

    private static void registerAsync(final boolean z) {
        submitIOTask(new Runnable() { // from class: com.ss.android.socialbase.downloader.downloader.DownloadComponentManager.1
            @Override // java.lang.Runnable
            public void run() {
                DownloadComponentManager.registerIndependentService(z);
                DownloadComponentManager.registerDownloadReceiver();
                DownloadComponentManager.getTTNetHandler().saveABTestInfo();
                Context appContext2 = DownloadComponentManager.getAppContext();
                if (appContext2 != null) {
                    DownloadUtils.getCurProcessName(appContext2);
                }
            }
        });
    }

    public static void registerDownloadCacheSyncListener(IDownloadCacheSyncStatusListener iDownloadCacheSyncStatusListener) {
        List<IDownloadCacheSyncStatusListener> list = downloadCacheSyncStatusListeners;
        synchronized (list) {
            if (iDownloadCacheSyncStatusListener != null) {
                if (!list.contains(iDownloadCacheSyncStatusListener)) {
                    list.add(iDownloadCacheSyncStatusListener);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static synchronized void registerDownloadReceiver() {
        synchronized (DownloadComponentManager.class) {
            if (downloadReceiver == null) {
                downloadReceiver = new DownloadReceiver();
            }
            if (isReceiverRegistered) {
                return;
            }
            try {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                appContext.registerReceiver(downloadReceiver, intentFilter);
                isReceiverRegistered = true;
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public static void registerDownloadTaskExecuteListener(IDownloadTaskExecuteListener iDownloadTaskExecuteListener) {
        List<IDownloadTaskExecuteListener> list = downloadTaskExecuteListeners;
        synchronized (list) {
            if (iDownloadTaskExecuteListener != null) {
                if (!list.contains(iDownloadTaskExecuteListener)) {
                    list.add(iDownloadTaskExecuteListener);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void registerIndependentService(boolean z) {
        if (z) {
            DownloadProxy.get(true).startService();
        }
    }

    public static void removeDownloadCompleteHandler(IDownloadCompleteHandler iDownloadCompleteHandler) {
        List<IDownloadCompleteHandler> list = downloadCompleteHandlers;
        synchronized (list) {
            if (iDownloadCompleteHandler != null) {
                if (list.contains(iDownloadCompleteHandler)) {
                    list.remove(iDownloadCompleteHandler);
                }
            }
        }
    }

    public static synchronized void setAppContext(Context context) {
        synchronized (DownloadComponentManager.class) {
            if (context != null) {
                if (appContext == null) {
                    appContext = context.getApplicationContext();
                    AppStatusManager.getInstance().init(appContext);
                }
            }
        }
    }

    private static void setCPUThreadExecutor(ExecutorService executorService) {
        if (executorService != null) {
            cpuThreadExecutor = executorService;
        }
    }

    public static void setChunkDownloadExecutor(ExecutorService executorService) {
        if (executorService != null) {
            chunkDownloadExecutor = executorService;
        }
    }

    public static void setCustomThreadExecutor(ExecutorService executorService) {
        if (executorService != null) {
            customThreadExecutor = executorService;
        }
    }

    private static void setDBThreadExecutor(ExecutorService executorService) {
        if (executorService != null) {
            dbThreadExecutor = executorService;
        }
    }

    private static void setDownloadBuilder(DownloaderBuilder downloaderBuilder) {
        if (downloaderBuilder != null) {
            if (downloaderBuilder.getContext() != null) {
                setAppContext(downloaderBuilder.getContext());
            }
            if (downloaderBuilder.getIdGenerator() != null) {
                setIdGenerator(downloaderBuilder.getIdGenerator());
            }
            if (downloaderBuilder.getNotificationClickCallback() != null) {
                setNotificationClickCallback(downloaderBuilder.getNotificationClickCallback());
            }
            if (downloaderBuilder.getHttpService() != null) {
                setHttpService(downloaderBuilder.getHttpService());
            }
            if (downloaderBuilder.getDownloadLaunchHandler() != null) {
                setDownloadLaunchHandler(downloaderBuilder.getDownloadLaunchHandler());
            }
            if (downloaderBuilder.getCPUThreadExecutor() != null) {
                setCPUThreadExecutor(downloaderBuilder.getCPUThreadExecutor());
            }
            if (downloaderBuilder.getIOThreadExecutor() != null) {
                setIOThreadExecutor(downloaderBuilder.getIOThreadExecutor());
            }
            if (downloaderBuilder.getMixDefaultDownloadExecutor() != null) {
                setMixDefaultDownloadExecutor(downloaderBuilder.getMixDefaultDownloadExecutor());
            }
            if (downloaderBuilder.getMixFrequentDownloadExecutor() != null) {
                setMixFrequentDownloadExecutor(downloaderBuilder.getMixFrequentDownloadExecutor());
            }
            if (downloaderBuilder.getMixApkDownloadExecutor() != null) {
                setMixApkDownloadExecutor(downloaderBuilder.getMixApkDownloadExecutor());
            }
            if (downloaderBuilder.getDBThreadExecutor() != null) {
                setDBThreadExecutor(downloaderBuilder.getDBThreadExecutor());
            }
            if (downloaderBuilder.getChunkThreadExecutor() != null) {
                setChunkDownloadExecutor(downloaderBuilder.getChunkThreadExecutor());
            }
            if (downloaderBuilder.getOkHttpDispatcherExecutor() != null) {
                setOkHttpDispatcherExecutor(downloaderBuilder.getOkHttpDispatcherExecutor());
            }
            if (downloaderBuilder.getCustomThreadExecutor() != null) {
                setCustomThreadExecutor(downloaderBuilder.getCustomThreadExecutor());
            }
            if (!downloaderBuilder.getDownloadCompleteHandlers().isEmpty()) {
                setDownloadCompleteHandlers(downloaderBuilder.getDownloadCompleteHandlers());
            }
            if (downloaderBuilder.getMonitorConfig() != null) {
                monitorConfig = downloaderBuilder.getMonitorConfig();
            }
            if (downloaderBuilder.getWriteBufferSize() > 1024) {
                writeBufferSize = downloaderBuilder.getWriteBufferSize();
            }
            if (downloaderBuilder.isDownloadInMultiProcess()) {
                downloadInMultiProcess = true;
            }
            if (downloaderBuilder.getTTNetHandler() != null) {
                iTTNetHandler = downloaderBuilder.getTTNetHandler();
                if (iTTNetHandler.isTTNetEnable()) {
                    setHttpService(iTTNetHandler.getTTNetDownloadHttpService());
                } else {
                    setHttpService(getDefaultHttpService());
                }
            }
            if (downloaderBuilder.getDownloadSetting() != null) {
                setDownloadSetting(downloaderBuilder.getDownloadSetting());
            }
            if (downloaderBuilder.getDownloadDns() != null) {
                downloadDns = downloaderBuilder.getDownloadDns();
            }
            if (downloaderBuilder.getDownloadInterceptor() != null) {
                setDownloadInterceptor(downloaderBuilder.getDownloadInterceptor());
            }
            needAutoRefreshUnSuccessTask(downloaderBuilder.needAutoRefreshUnSuccessTask());
            if (downloaderBuilder.getDownloadMonitorListener() != null) {
                setDownloadMonitorListener(downloaderBuilder.getDownloadMonitorListener());
            }
        }
    }

    private static void setDownloadCompleteHandlers(List<IDownloadCompleteHandler> list) {
        List<IDownloadCompleteHandler> list2 = downloadCompleteHandlers;
        if (list2.isEmpty()) {
            synchronized (list2) {
                list2.addAll(list);
            }
        }
    }

    public static void setDownloadDBListener(IDownloadDBListener iDownloadDBListener) {
        downloadDBListener = iDownloadDBListener;
    }

    public static void setDownloadEventListener(InnerEventListener innerEventListener) {
        downloadEventListener = innerEventListener;
    }

    public static synchronized void setDownloadInMultiProcess() {
        synchronized (DownloadComponentManager.class) {
            if (downloadInMultiProcess || !supportMultiProc()) {
                return;
            }
            try {
                Intent intent = new Intent(getAppContext(), (Class<?>) DownloadHandleService.class);
                intent.setAction(DownloadConstants.ACTION_DOWNLOAD_MULTI_PROCESS_NOTIFY);
                getAppContext().startService(intent);
                if (!DownloadHelper.isDownloaderProcess()) {
                    submitIOTask(new Runnable() { // from class: com.ss.android.socialbase.downloader.downloader.DownloadComponentManager.2
                        @Override // java.lang.Runnable
                        public void run() {
                            DownloadComponentManager.registerIndependentService(true);
                        }
                    });
                }
                downloadInMultiProcess = true;
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public static void setDownloadInterceptor(IDownloadInterceptor iDownloadInterceptor) {
        if (iDownloadInterceptor != null) {
            downloadInterceptor = iDownloadInterceptor;
        }
    }

    public static synchronized void setDownloadLaunchHandler(IDownloadLaunchHandler iDownloadLaunchHandler) {
        synchronized (DownloadComponentManager.class) {
            if (iDownloadLaunchHandler != null) {
                downloadLaunchHandler = iDownloadLaunchHandler;
                if (downloadCache instanceof DefaultDownloadCache) {
                    ((DefaultDownloadCache) downloadCache).resumeUnCompleteTaskMayDelayed();
                }
            }
        }
    }

    public static void setDownloadMemoryInfoListener(IDownloadMemoryInfoListener iDownloadMemoryInfoListener) {
        downloadMemoryInfoListener = iDownloadMemoryInfoListener;
    }

    public static void setDownloadMonitorListener(IDownloadMonitorListener iDownloadMonitorListener) {
        if (iDownloadMonitorListener != null) {
            downloadMonitorListener = iDownloadMonitorListener;
        }
    }

    public static void setDownloadSetting(IDownloadSettings iDownloadSettings) {
        downloadSettings = iDownloadSettings;
        DownloadSetting.init();
        if (!Logger.debug() || downloadSettings == null) {
            return;
        }
        StringBuilder M = a.M("Setting: ");
        M.append(downloadSettings.get());
        Logger.globalDebug(TAG, "setDownloadSetting", M.toString());
    }

    public static void setDownloadStatusListener(IDownloadStatusListener iDownloadStatusListener) {
        downloadStatusListener = iDownloadStatusListener;
    }

    public static void setDownloadThreadCheckListener(IDownloadThreadCheckListener iDownloadThreadCheckListener) {
        if (iDownloadThreadCheckListener != null) {
            threadCheckListener = iDownloadThreadCheckListener;
        }
    }

    public static void setHttpService(IDownloadHttpService iDownloadHttpService) {
        if (iDownloadHttpService != null) {
            httpService = iDownloadHttpService;
        }
        httpServiceInit = httpService != null;
    }

    private static void setIOThreadExecutor(ExecutorService executorService) {
        if (executorService != null) {
            ioThreadExecutor = executorService;
        }
    }

    private static void setIdGenerator(IDownloadIdGenerator iDownloadIdGenerator) {
        if (iDownloadIdGenerator != null) {
            ((IDownloadIdGeneratorService) DownloadServiceManager.getService(IDownloadIdGeneratorService.class)).setDownloadIdGenerator(iDownloadIdGenerator);
        }
    }

    public static void setIndependentServiceCreator(IndependentHolderCreator independentHolderCreator2) {
        if (Logger.debug()) {
            Logger.globalDebug(TAG, "setIndependentServiceCreator", "Creator: " + independentHolderCreator2);
        }
        independentHolderCreator = independentHolderCreator2;
    }

    private static void setMixApkDownloadExecutor(ExecutorService executorService) {
        if (executorService != null) {
            mixApkDownloadExecutor = executorService;
        }
    }

    private static void setMixDefaultDownloadExecutor(ExecutorService executorService) {
        if (executorService != null) {
            mixDefaultDownloadExecutor = executorService;
        }
    }

    private static void setMixFrequentDownloadExecutor(ExecutorService executorService) {
        if (executorService != null) {
            mixFrequentDownloadExecutor = executorService;
        }
    }

    @Deprecated
    public static void setNotAutoRebootService(boolean z) {
    }

    public static void setNotificationClickCallback(INotificationClickCallback iNotificationClickCallback) {
        if (iNotificationClickCallback != null) {
            notificationClickCallback = iNotificationClickCallback;
        }
    }

    public static void setOkHttpDispatcherExecutor(ExecutorService executorService) {
        if (executorService != null) {
            okHttpDispatcherExecutor = executorService;
        }
    }

    public static void setReserveWifiStatusListener(IReserveWifiStatusListener iReserveWifiStatusListener) {
        reserveWifiStatusListener = iReserveWifiStatusListener;
    }

    public static void submitCPUTask(Runnable runnable) {
        submitCPUTask(runnable, false);
    }

    public static void submitDBTask(Runnable runnable) {
        if (runnable == null) {
            return;
        }
        if (DownloadUtils.isMainThread()) {
            getDBThreadExecutorService().execute(runnable);
        } else {
            runnable.run();
        }
    }

    public static void submitIOTask(Runnable runnable) {
        submitIOTask(runnable, false);
    }

    public static void submitScheduleTask(Runnable runnable, long j, TimeUnit timeUnit) {
        if (runnable == null) {
            return;
        }
        getScheduledExecutorService().schedule(runnable, j, timeUnit);
    }

    public static void submitSingleTask(Runnable runnable) {
        if (runnable == null) {
            return;
        }
        getSingleThreadExecutorService().execute(runnable);
    }

    public static boolean supportMultiProc() {
        return independentHolderCreator != null;
    }

    public static void unRegisterDownloadCacheSyncListener(IDownloadCacheSyncStatusListener iDownloadCacheSyncStatusListener) {
        List<IDownloadCacheSyncStatusListener> list = downloadCacheSyncStatusListeners;
        synchronized (list) {
            if (iDownloadCacheSyncStatusListener != null) {
                if (list.contains(iDownloadCacheSyncStatusListener)) {
                    list.remove(iDownloadCacheSyncStatusListener);
                }
            }
        }
    }

    public static synchronized void unRegisterDownloadReceiver() {
        synchronized (DownloadComponentManager.class) {
            try {
                if (isReceiverRegistered && downloadReceiver != null && appContext != null) {
                    appContext.unregisterReceiver(downloadReceiver);
                    isReceiverRegistered = false;
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public static void unRegisterDownloadTaskExecuteListener(IDownloadTaskExecuteListener iDownloadTaskExecuteListener) {
        List<IDownloadTaskExecuteListener> list = downloadTaskExecuteListeners;
        synchronized (list) {
            if (iDownloadTaskExecuteListener != null) {
                if (list.contains(iDownloadTaskExecuteListener)) {
                    list.remove(iDownloadTaskExecuteListener);
                }
            }
        }
    }

    public static void updateCurrentDownloadThreadInfo(DownloadTask downloadTask, boolean z) {
        if (downloadTask == null) {
            return;
        }
        Map<String, DownloadThreadInfo.ThreadExecutorInfo> map = z ? downloadTask.getThreadInfo().beforeDownloadThreadExecutors : downloadTask.getThreadInfo().afterDownloadThreadExecutors;
        if (map.isEmpty()) {
            map.put(MonitorConstants.CPU, DownloadThreadInfo.parse(cpuThreadExecutor));
            map.put(MonitorConstants.IO, DownloadThreadInfo.parse(ioThreadExecutor));
            map.put(MonitorConstants.MIX_DEFAULT, DownloadThreadInfo.parse(mixDefaultDownloadExecutor));
            map.put(MonitorConstants.MIX_APK, DownloadThreadInfo.parse(mixApkDownloadExecutor));
            map.put(MonitorConstants.DB, DownloadThreadInfo.parse(dbThreadExecutor));
            map.put(MonitorConstants.CHUNK, DownloadThreadInfo.parse(chunkDownloadExecutor));
            map.put(MonitorConstants.SEGMENT, DownloadThreadInfo.parse(segmentThreadExecutor));
            map.put(MonitorConstants.OKHTTP, DownloadThreadInfo.parse(okHttpDispatcherExecutor));
            map.put(MonitorConstants.SCHEDULE, DownloadThreadInfo.parse(scheduledExecutor));
            map.put(MonitorConstants.SINGLE, DownloadThreadInfo.parse(singleThreadExecutor));
            map.put(MonitorConstants.CUSTOM, DownloadThreadInfo.parse(customThreadExecutor));
        }
    }

    public static int getDownloadId(String str, String str2) {
        return ((IDownloadIdGeneratorService) DownloadServiceManager.getService(IDownloadIdGeneratorService.class)).generate(str, str2);
    }

    public static boolean needAutoRefreshUnSuccessTask() {
        return needAutoRefreshUnSuccessTask;
    }

    public static void submitCPUTask(Runnable runnable, boolean z) {
        if (runnable == null) {
            return;
        }
        if (!z || DownloadUtils.isMainThread()) {
            getCPUThreadExecutor().execute(runnable);
        } else {
            runnable.run();
        }
    }

    public static void submitIOTask(Runnable runnable, boolean z) {
        if (runnable == null) {
            return;
        }
        if (!z || DownloadUtils.isMainThread()) {
            getIOThreadExecutor().execute(runnable);
        } else {
            runnable.run();
        }
    }

    public static IDownloadHttpConnection downloadWithConnection(boolean z, int i, String str, String str2, List<HttpHeader> list, int i2, boolean z2, DownloadInfo downloadInfo) throws Exception {
        return ((IDownloadNetworkService) DownloadServiceManager.getService(IDownloadNetworkService.class)).downloadWithConnection(z, i, str, str2, list, i2, z2, downloadInfo);
    }
}
