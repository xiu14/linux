package com.ss.android.socialbase.downloader.notification;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.IBinder;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.ss.android.socialbase.downloader.constants.DownloadConstants;
import com.ss.android.socialbase.downloader.constants.NotificationConstants;
import com.ss.android.socialbase.downloader.downloader.DownloadComponentManager;
import com.ss.android.socialbase.downloader.downloader.DownloadProcessDispatcher;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.downloader.IDownloadProxy;
import com.ss.android.socialbase.downloader.logger.Logger;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.setting.DownloadSetting;
import com.ss.android.socialbase.downloader.setting.DownloadSettingKeys;
import com.ss.android.socialbase.downloader.thread.ThreadWithHandler;
import com.ss.android.socialbase.downloader.utils.DownloadHelper;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class DownloadNotificationService extends Service {
    private static final long NOTIFY_TIME_WINDOW = 1000;
    private static volatile long sLastImportantNotifyTimestamp;
    private static volatile long sLastNotifyTimestamp;
    private ThreadWithHandler mNotifyThreadHandler;
    private final SparseArray<Notification> pendingImportantNotify = new SparseArray<>(2);
    private static final String TAG = DownloadNotificationService.class.getSimpleName();
    private static int sForegroundId = -1;
    private static int sIndependentProcessForegroundId = -1;
    private static boolean sAllowStartForeground = true;
    private static long sNotifyTimeWindow = 1000;

    private void createNotifyHandlerThread() {
        if (this.mNotifyThreadHandler == null) {
            ThreadWithHandler threadWithHandler = new ThreadWithHandler("DownloaderNotifyThread");
            this.mNotifyThreadHandler = threadWithHandler;
            threadWithHandler.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void doCancel(NotificationManager notificationManager, int i) {
        boolean z;
        AbsNotificationItem absNotificationItem;
        int id;
        int i2 = sForegroundId;
        if (i2 != i && sIndependentProcessForegroundId != i) {
            try {
                notificationManager.cancel(i);
                return;
            } catch (Throwable unused) {
                return;
            }
        }
        boolean z2 = true;
        if (i2 == i) {
            sForegroundId = 0;
            z = false;
        } else {
            sIndependentProcessForegroundId = 0;
            z = true;
        }
        try {
            IDownloadProxy downloadHandler = DownloadProcessDispatcher.getInstance().getDownloadHandler(i);
            if (!downloadHandler.isServiceForeground()) {
                sAllowStartForeground = false;
                if (Logger.debug()) {
                    Logger.globalDebug(TAG, "doCancel", "Yry to stopForeground when is not Foreground, id = " + i + ", isIndependentProcess = " + z);
                }
            }
            if (Logger.debug()) {
                Logger.globalDebug(TAG, "doCancel", "StopForeground id = " + i + ", isIndependentProcess = " + z);
            }
            downloadHandler.stopForeground(false, true);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        try {
            notificationManager.cancel(i);
        } catch (Throwable unused2) {
        }
        if (sAllowStartForeground) {
            try {
                SparseArray<AbsNotificationItem> allNotificationItems = DownloadNotificationManager.getInstance().getAllNotificationItems();
                if (allNotificationItems != null) {
                    for (int size = allNotificationItems.size() - 1; size >= 0; size--) {
                        absNotificationItem = allNotificationItems.valueAt(size);
                        if (absNotificationItem != null && (id = absNotificationItem.getId()) != i && id != sForegroundId && id != sIndependentProcessForegroundId && absNotificationItem.isOngoing()) {
                            if ((DownloadProcessDispatcher.getInstance().getDownloadWithIndependentProcessStatus(absNotificationItem.getId()) == 1 && !DownloadHelper.isDownloaderProcess()) == z) {
                                break;
                            }
                        }
                    }
                }
                absNotificationItem = null;
                if (absNotificationItem != null) {
                    int id2 = absNotificationItem.getId();
                    try {
                        notificationManager.cancel(id2);
                    } catch (Throwable th2) {
                        th2.printStackTrace();
                    }
                    if (Downloader.getInstance(this).getStatus(id2) != 1) {
                        z2 = false;
                    }
                    if (Logger.debug()) {
                        Logger.globalDebug(TAG, "doCancel", "UpdateNotification id: " + id2);
                    }
                    absNotificationItem.updateNotification(null, z2);
                }
            } catch (Throwable th3) {
                th3.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void doImportantNotify(final NotificationManager notificationManager, final int i, Notification notification) {
        synchronized (this.pendingImportantNotify) {
            int indexOfKey = this.pendingImportantNotify.indexOfKey(i);
            if (indexOfKey >= 0 && indexOfKey < this.pendingImportantNotify.size()) {
                this.pendingImportantNotify.setValueAt(indexOfKey, notification);
                return;
            }
            long currentTimeMillis = sNotifyTimeWindow - (System.currentTimeMillis() - sLastNotifyTimestamp);
            if (currentTimeMillis <= 0) {
                currentTimeMillis = 0;
            }
            if (currentTimeMillis > 20000) {
                currentTimeMillis = 20000;
            }
            long currentTimeMillis2 = System.currentTimeMillis() + currentTimeMillis;
            sLastImportantNotifyTimestamp = currentTimeMillis2;
            sLastNotifyTimestamp = currentTimeMillis2;
            if (currentTimeMillis <= 0) {
                doNotify(notificationManager, i, notification);
            } else if (this.mNotifyThreadHandler != null) {
                synchronized (this.pendingImportantNotify) {
                    this.pendingImportantNotify.put(i, notification);
                }
                this.mNotifyThreadHandler.postDelayed(new Runnable() { // from class: com.ss.android.socialbase.downloader.notification.DownloadNotificationService.2
                    @Override // java.lang.Runnable
                    public void run() {
                        DownloadNotificationService.this.performImportantNotify(notificationManager, i);
                    }
                }, currentTimeMillis);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x001f, code lost:
    
        if (com.ss.android.socialbase.downloader.notification.DownloadNotificationService.sForegroundId == 0) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void doNotify(android.app.NotificationManager r7, int r8, android.app.Notification r9) {
        /*
            r6 = this;
            boolean r0 = r6.needStartForeground(r8, r9)
            if (r0 == 0) goto L93
            com.ss.android.socialbase.downloader.downloader.DownloadProcessDispatcher r0 = com.ss.android.socialbase.downloader.downloader.DownloadProcessDispatcher.getInstance()     // Catch: java.lang.Throwable -> L8e
            int r0 = r0.getDownloadWithIndependentProcessStatus(r8)     // Catch: java.lang.Throwable -> L8e
            r1 = 0
            r2 = 1
            if (r0 != r2) goto L1a
            boolean r0 = com.ss.android.socialbase.downloader.utils.DownloadHelper.isDownloaderProcess()     // Catch: java.lang.Throwable -> L8e
            if (r0 != 0) goto L1a
            r0 = r2
            goto L1b
        L1a:
            r0 = r1
        L1b:
            if (r0 != 0) goto L23
            int r3 = com.ss.android.socialbase.downloader.notification.DownloadNotificationService.sForegroundId     // Catch: java.lang.Throwable -> L8e
            if (r3 != 0) goto L23
        L21:
            r1 = r2
            goto L2a
        L23:
            if (r0 == 0) goto L2a
            int r3 = com.ss.android.socialbase.downloader.notification.DownloadNotificationService.sIndependentProcessForegroundId     // Catch: java.lang.Throwable -> L8e
            if (r3 != 0) goto L2a
            goto L21
        L2a:
            if (r1 == 0) goto La4
            com.ss.android.socialbase.downloader.downloader.DownloadProcessDispatcher r1 = com.ss.android.socialbase.downloader.downloader.DownloadProcessDispatcher.getInstance()     // Catch: java.lang.Throwable -> L8e
            com.ss.android.socialbase.downloader.downloader.IDownloadProxy r1 = r1.getDownloadHandler(r8)     // Catch: java.lang.Throwable -> L8e
            boolean r2 = r1.isServiceAlive()     // Catch: java.lang.Throwable -> L8e
            java.lang.String r3 = "doNotify"
            if (r2 == 0) goto L71
            boolean r2 = r1.isServiceForeground()     // Catch: java.lang.Throwable -> L8e
            if (r2 != 0) goto L71
            boolean r2 = com.ss.android.socialbase.downloader.logger.Logger.debug()     // Catch: java.lang.Throwable -> L8e
            if (r2 == 0) goto L66
            java.lang.String r2 = com.ss.android.socialbase.downloader.notification.DownloadNotificationService.TAG     // Catch: java.lang.Throwable -> L8e
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8e
            r4.<init>()     // Catch: java.lang.Throwable -> L8e
            java.lang.String r5 = "StartForeground, id = "
            r4.append(r5)     // Catch: java.lang.Throwable -> L8e
            r4.append(r8)     // Catch: java.lang.Throwable -> L8e
            java.lang.String r5 = ", isIndependentProcess = "
            r4.append(r5)     // Catch: java.lang.Throwable -> L8e
            r4.append(r0)     // Catch: java.lang.Throwable -> L8e
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L8e
            com.ss.android.socialbase.downloader.logger.Logger.globalDebug(r2, r3, r4)     // Catch: java.lang.Throwable -> L8e
        L66:
            if (r0 == 0) goto L6b
            com.ss.android.socialbase.downloader.notification.DownloadNotificationService.sIndependentProcessForegroundId = r8     // Catch: java.lang.Throwable -> L8e
            goto L6d
        L6b:
            com.ss.android.socialbase.downloader.notification.DownloadNotificationService.sForegroundId = r8     // Catch: java.lang.Throwable -> L8e
        L6d:
            r1.startForeground(r8, r9)     // Catch: java.lang.Throwable -> L8e
            goto La4
        L71:
            boolean r1 = com.ss.android.socialbase.downloader.logger.Logger.debug()     // Catch: java.lang.Throwable -> L8e
            if (r1 == 0) goto La4
            java.lang.String r1 = com.ss.android.socialbase.downloader.notification.DownloadNotificationService.TAG     // Catch: java.lang.Throwable -> L8e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8e
            r2.<init>()     // Catch: java.lang.Throwable -> L8e
            java.lang.String r4 = "CanStartForeground = true, but proxy can not startForeground, isIndependentProcess = "
            r2.append(r4)     // Catch: java.lang.Throwable -> L8e
            r2.append(r0)     // Catch: java.lang.Throwable -> L8e
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L8e
            com.ss.android.socialbase.downloader.logger.Logger.globalDebug(r1, r3, r0)     // Catch: java.lang.Throwable -> L8e
            goto La4
        L8e:
            r0 = move-exception
            r0.printStackTrace()
            goto La4
        L93:
            int r0 = com.ss.android.socialbase.downloader.notification.DownloadNotificationService.sForegroundId
            if (r0 == r8) goto L9b
            int r0 = com.ss.android.socialbase.downloader.notification.DownloadNotificationService.sIndependentProcessForegroundId
            if (r0 != r8) goto La4
        L9b:
            int r0 = r9.flags
            r0 = r0 & 2
            if (r0 != 0) goto La4
            r6.doCancel(r7, r8)
        La4:
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> Lb3
            long r2 = com.ss.android.socialbase.downloader.notification.DownloadNotificationService.sLastNotifyTimestamp     // Catch: java.lang.Throwable -> Lb3
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 >= 0) goto Lb0
            com.ss.android.socialbase.downloader.notification.DownloadNotificationService.sLastNotifyTimestamp = r0     // Catch: java.lang.Throwable -> Lb3
        Lb0:
            r7.notify(r8, r9)     // Catch: java.lang.Throwable -> Lb3
        Lb3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.downloader.notification.DownloadNotificationService.doNotify(android.app.NotificationManager, int, android.app.Notification):void");
    }

    private void handleIntent(final Intent intent) {
        ThreadWithHandler threadWithHandler;
        if (intent == null) {
            return;
        }
        final String action = intent.getAction();
        if (TextUtils.isEmpty(action) || (threadWithHandler = this.mNotifyThreadHandler) == null) {
            return;
        }
        threadWithHandler.post(new Runnable() { // from class: com.ss.android.socialbase.downloader.notification.DownloadNotificationService.1
            @Override // java.lang.Runnable
            public void run() {
                ConnectivityManager connectivityManager;
                NetworkInfo activeNetworkInfo;
                DownloadInfo downloadInfo;
                NotificationManager notificationManager = (NotificationManager) DownloadNotificationService.this.getSystemService(RemoteMessageConst.NOTIFICATION);
                int intExtra = intent.getIntExtra(NotificationConstants.EXTRA_NOTIFICATION_ID, 0);
                if (action.equals(NotificationConstants.ACTION_NOTIFICATION_NOTIFY)) {
                    Notification notification = (Notification) intent.getParcelableExtra(NotificationConstants.EXTRA_NOTIFICATION);
                    int intExtra2 = intent.getIntExtra(NotificationConstants.EXTRA_NOTIFICATION_STATUS, 0);
                    if (intExtra == 0 || notification == null || notificationManager == null) {
                        return;
                    }
                    if (intExtra2 != 4) {
                        if (intExtra2 == -2 || intExtra2 == -3) {
                            DownloadNotificationService.this.doImportantNotify(notificationManager, intExtra, notification);
                            return;
                        } else {
                            DownloadNotificationService.this.doImportantNotify(notificationManager, intExtra, notification);
                            return;
                        }
                    }
                    if (Downloader.getInstance(DownloadComponentManager.getAppContext()).isDownloading(intExtra) && (downloadInfo = Downloader.getInstance(DownloadComponentManager.getAppContext()).getDownloadInfo(intExtra)) != null && downloadInfo.canNotifyProgress() && System.currentTimeMillis() - DownloadNotificationService.sLastImportantNotifyTimestamp > DownloadNotificationService.sNotifyTimeWindow) {
                        DownloadNotificationService.this.doNotify(notificationManager, intExtra, notification);
                        downloadInfo.setLastNotifyProgressTime();
                        return;
                    }
                    return;
                }
                if (action.equals(NotificationConstants.ACTION_NOTIFICATION_CANCEL)) {
                    if (intExtra != 0) {
                        DownloadNotificationService.this.doCancel(notificationManager, intExtra);
                        return;
                    }
                    return;
                }
                if (!action.equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                    if (action.equals("android.intent.action.MEDIA_UNMOUNTED") || action.equals("android.intent.action.MEDIA_REMOVED") || action.equals("android.intent.action.MEDIA_BAD_REMOVAL") || action.equals("android.intent.action.MEDIA_EJECT")) {
                        try {
                            Downloader.getInstance(DownloadNotificationService.this).pauseAll();
                            return;
                        } catch (Exception e2) {
                            e2.printStackTrace();
                            return;
                        }
                    }
                    return;
                }
                try {
                    if (DownloadHelper.checkPermission(DownloadNotificationService.this, "android.permission.ACCESS_NETWORK_STATE") && (connectivityManager = (ConnectivityManager) DownloadNotificationService.this.getSystemService("connectivity")) != null && (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) != null && activeNetworkInfo.isConnected()) {
                        ArrayList arrayList = new ArrayList();
                        if (!TextUtils.isEmpty(DownloadConstants.MIME_APK)) {
                            arrayList.add(DownloadConstants.MIME_APK);
                        }
                        arrayList.add(DownloadConstants.MIME_PLG);
                        Context applicationContext = DownloadNotificationService.this.getApplicationContext();
                        if (applicationContext != null) {
                            Downloader.getInstance(applicationContext).restartAllFailedDownloadTasks(arrayList);
                            Downloader.getInstance(applicationContext).restartAllPauseReserveOnWifiDownloadTasks(arrayList);
                        }
                    }
                } catch (Exception e3) {
                    e3.printStackTrace();
                }
            }
        });
    }

    private boolean needStartForeground(int i, Notification notification) {
        int i2;
        int i3;
        if (!sAllowStartForeground || (i2 = sForegroundId) == i || (i3 = sIndependentProcessForegroundId) == i) {
            return false;
        }
        return ((i2 != 0 && i3 != 0) || (notification.flags & 2) == 0 || TextUtils.isEmpty(notification.getChannelId())) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void performImportantNotify(NotificationManager notificationManager, int i) {
        Notification notification;
        synchronized (this.pendingImportantNotify) {
            notification = this.pendingImportantNotify.get(i);
            this.pendingImportantNotify.remove(i);
        }
        if (notification != null) {
            doNotify(notificationManager, i, notification);
        }
    }

    @Override // android.app.Service
    @Nullable
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        createNotifyHandlerThread();
        DownloadComponentManager.setAppContext(this);
        DownloadSetting obtainGlobal = DownloadSetting.obtainGlobal();
        int optInt = obtainGlobal.optInt(DownloadSettingKeys.DOWNLOAD_SERVICE_FOREGROUND, 0);
        if ((optInt == 1 || optInt == 3) && sForegroundId == -1) {
            sForegroundId = 0;
        }
        if ((optInt == 2 || optInt == 3) && sIndependentProcessForegroundId == -1) {
            sIndependentProcessForegroundId = 0;
        }
        long optLong = obtainGlobal.optLong(DownloadSettingKeys.NOTIFICATION_TIME_WINDOW, 1000L);
        sNotifyTimeWindow = optLong;
        if (optLong < 0 || optLong > 1200) {
            sNotifyTimeWindow = 1000L;
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        ThreadWithHandler threadWithHandler = this.mNotifyThreadHandler;
        if (threadWithHandler != null) {
            try {
                threadWithHandler.quit();
            } catch (Throwable unused) {
            }
            this.mNotifyThreadHandler = null;
        }
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        handleIntent(intent);
        return 2;
    }
}
