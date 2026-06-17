package com.ss.android.socialbase.downloader.service;

import android.app.Notification;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.ss.android.socialbase.downloader.notification.AbsNotificationItem;

/* loaded from: classes2.dex */
public interface IDownloadNotificationManagerService {

    public static class DefaultDownloadNotificationManagerService implements IDownloadNotificationManagerService {
        @Override // com.ss.android.socialbase.downloader.service.IDownloadNotificationManagerService
        public void addNotification(AbsNotificationItem absNotificationItem) {
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadNotificationManagerService
        public void cancel(int i) {
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadNotificationManagerService
        public void cancelNotification(int i) {
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadNotificationManagerService
        public void clearNotification() {
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadNotificationManagerService
        @Nullable
        public SparseArray<AbsNotificationItem> getAllNotificationItems() {
            return null;
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadNotificationManagerService
        @Nullable
        public AbsNotificationItem getNotificationItem(int i) {
            return null;
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadNotificationManagerService
        public void hideNotification(int i) {
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadNotificationManagerService
        public void notifyByService(int i, int i2, Notification notification) {
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadNotificationManagerService
        @Nullable
        public AbsNotificationItem removeNotification(int i) {
            return null;
        }
    }

    void addNotification(AbsNotificationItem absNotificationItem);

    void cancel(int i);

    void cancelNotification(int i);

    void clearNotification();

    @Nullable
    SparseArray<AbsNotificationItem> getAllNotificationItems();

    @Nullable
    AbsNotificationItem getNotificationItem(int i);

    void hideNotification(int i);

    void notifyByService(int i, int i2, Notification notification);

    @Nullable
    AbsNotificationItem removeNotification(int i);
}
