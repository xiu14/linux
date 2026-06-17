package com.ss.android.socialbase.downloader.notification;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.util.SparseArray;
import com.ss.android.socialbase.downloader.constants.NotificationConstants;
import com.ss.android.socialbase.downloader.downloader.DownloadComponentManager;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.model.DownloadInfo;

/* loaded from: classes2.dex */
public class DownloadNotificationManagerImpl {
    private static volatile DownloadNotificationManagerImpl instance;
    private final long PROGRESS_NOTIFY_DURATION = 1000;
    private final SparseArray<Long> PROGRESS_NOTIFY_LAST_TIME_INFO = new SparseArray<>();
    private final SparseArray<AbsNotificationItem> notificationItemArray = new SparseArray<>();

    private DownloadNotificationManagerImpl() {
    }

    public static DownloadNotificationManagerImpl getInstance() {
        if (instance == null) {
            synchronized (DownloadNotificationManagerImpl.class) {
                if (instance == null) {
                    instance = new DownloadNotificationManagerImpl();
                }
            }
        }
        return instance;
    }

    static boolean isCompleteAndVisible(DownloadInfo downloadInfo) {
        return downloadInfo.isDownloadOverStatus() && isCompleteVisibility(downloadInfo.getNotificationVisibility());
    }

    static boolean isCompleteVisibility(int i) {
        return i == 1 || i == 3;
    }

    public void addNotification(AbsNotificationItem absNotificationItem) {
        if (absNotificationItem == null) {
            return;
        }
        synchronized (this.notificationItemArray) {
            this.notificationItemArray.put(absNotificationItem.getId(), absNotificationItem);
        }
    }

    public void cancel(int i) {
        Context appContext = DownloadComponentManager.getAppContext();
        if (appContext == null || i == 0) {
            return;
        }
        try {
            Intent intent = new Intent(appContext, (Class<?>) DownloadNotificationService.class);
            intent.setAction(NotificationConstants.ACTION_NOTIFICATION_CANCEL);
            intent.putExtra(NotificationConstants.EXTRA_NOTIFICATION_ID, i);
            appContext.startService(intent);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    void cancelCompleteNotification(DownloadInfo downloadInfo) {
        if (isCompleteAndVisible(downloadInfo)) {
            cancelNotification(downloadInfo.getId());
        }
    }

    public void cancelNotification(int i) {
        removeNotification(i);
        if (i != 0) {
            DownloadNotificationManager.getInstance().cancel(i);
        }
    }

    public void clearNotification() {
        SparseArray<AbsNotificationItem> clone;
        synchronized (this.notificationItemArray) {
            clone = this.notificationItemArray.clone();
            this.notificationItemArray.clear();
        }
        for (int i = 0; i < clone.size(); i++) {
            clone.get(clone.keyAt(i)).cancel();
        }
    }

    public SparseArray<AbsNotificationItem> getAllNotificationItems() {
        SparseArray<AbsNotificationItem> sparseArray;
        synchronized (this.notificationItemArray) {
            sparseArray = this.notificationItemArray;
        }
        return sparseArray;
    }

    public AbsNotificationItem getNotificationItem(int i) {
        AbsNotificationItem absNotificationItem;
        if (i == 0) {
            return null;
        }
        synchronized (this.notificationItemArray) {
            absNotificationItem = this.notificationItemArray.get(i);
        }
        return absNotificationItem;
    }

    public void hideNotification(int i) {
        DownloadInfo downloadInfo = Downloader.getInstance(DownloadComponentManager.getAppContext()).getDownloadInfo(i);
        if (downloadInfo == null) {
            return;
        }
        updateNotificationState(downloadInfo);
        cancelCompleteNotification(downloadInfo);
    }

    public void notifyByService(int i, int i2, Notification notification) {
        Context appContext = DownloadComponentManager.getAppContext();
        if (appContext == null || i == 0 || notification == null) {
            return;
        }
        if (i2 == 4) {
            synchronized (this.PROGRESS_NOTIFY_LAST_TIME_INFO) {
                Long l = this.PROGRESS_NOTIFY_LAST_TIME_INFO.get(i);
                long currentTimeMillis = System.currentTimeMillis();
                if (l != null && Math.abs(currentTimeMillis - l.longValue()) < 1000) {
                    return;
                } else {
                    this.PROGRESS_NOTIFY_LAST_TIME_INFO.put(i, Long.valueOf(currentTimeMillis));
                }
            }
        }
        try {
            Intent intent = new Intent(appContext, (Class<?>) DownloadNotificationService.class);
            intent.setAction(NotificationConstants.ACTION_NOTIFICATION_NOTIFY);
            intent.putExtra(NotificationConstants.EXTRA_NOTIFICATION_STATUS, i2);
            intent.putExtra(NotificationConstants.EXTRA_NOTIFICATION_ID, i);
            intent.putExtra(NotificationConstants.EXTRA_NOTIFICATION, notification);
            appContext.startService(intent);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public AbsNotificationItem removeNotification(int i) {
        AbsNotificationItem absNotificationItem;
        if (i == 0) {
            return null;
        }
        synchronized (this.notificationItemArray) {
            absNotificationItem = this.notificationItemArray.get(i);
            if (absNotificationItem != null) {
                this.notificationItemArray.remove(i);
            }
        }
        return absNotificationItem;
    }

    void updateNotificationState(DownloadInfo downloadInfo) {
        if (downloadInfo.isDownloadOverStatus()) {
            downloadInfo.setNotificationVisibility(3);
            Downloader.getInstance(DownloadComponentManager.getAppContext()).updateDownloadInfo(downloadInfo);
        }
    }
}
