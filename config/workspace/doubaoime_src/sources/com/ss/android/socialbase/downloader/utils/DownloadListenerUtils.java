package com.ss.android.socialbase.downloader.utils;

import android.util.SparseArray;
import com.ss.android.socialbase.downloader.constants.ListenerType;
import com.ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.ss.android.socialbase.downloader.depend.IDownloadExtListener;
import com.ss.android.socialbase.downloader.depend.IDownloadListener;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.DownloadTask;

/* loaded from: classes2.dex */
public class DownloadListenerUtils {
    public static void notifyListener(int i, SparseArray<IDownloadListener> sparseArray, boolean z, DownloadInfo downloadInfo, BaseException baseException, ListenerType listenerType, DownloadTask downloadTask) {
        SparseArray<IDownloadListener> clone;
        if (!z || sparseArray == null) {
            return;
        }
        try {
            if (sparseArray.size() <= 0) {
                return;
            }
            synchronized (sparseArray) {
                clone = sparseArray.clone();
            }
            for (int i2 = 0; i2 < clone.size(); i2++) {
                IDownloadListener iDownloadListener = clone.get(clone.keyAt(i2));
                if (iDownloadListener != null) {
                    if (i == 1) {
                        iDownloadListener.onPrepare(downloadInfo);
                    } else if (i == 2) {
                        iDownloadListener.onStart(downloadInfo);
                    } else if (i == 4) {
                        iDownloadListener.onProgress(downloadInfo);
                    } else if (i == 5) {
                        iDownloadListener.onRetry(downloadInfo, baseException);
                    } else if (i == 6) {
                        iDownloadListener.onFirstStart(downloadInfo);
                    } else if (i != 11) {
                        switch (i) {
                            case -7:
                                if (iDownloadListener instanceof AbsDownloadListener) {
                                    ((AbsDownloadListener) iDownloadListener).onIntercept(downloadInfo);
                                    removeCallback(downloadTask, listenerType, iDownloadListener);
                                    break;
                                } else {
                                    break;
                                }
                            case -6:
                                iDownloadListener.onFirstSuccess(downloadInfo);
                                break;
                            case -5:
                            case -2:
                                iDownloadListener.onPause(downloadInfo);
                                removeCallback(downloadTask, listenerType, iDownloadListener);
                                break;
                            case -4:
                                iDownloadListener.onCanceled(downloadInfo);
                                removeCallback(downloadTask, listenerType, iDownloadListener);
                                break;
                            case -3:
                                iDownloadListener.onSuccessed(downloadInfo);
                                removeCallback(downloadTask, listenerType, iDownloadListener);
                                break;
                            case -1:
                                iDownloadListener.onFailed(downloadInfo, baseException);
                                removeCallback(downloadTask, listenerType, iDownloadListener);
                                break;
                        }
                    } else if (iDownloadListener instanceof IDownloadExtListener) {
                        ((IDownloadExtListener) iDownloadListener).onWaitingDownloadCompleteHandler(downloadInfo);
                    }
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private static void removeCallback(DownloadTask downloadTask, ListenerType listenerType, IDownloadListener iDownloadListener) {
        if (downloadTask != null) {
            downloadTask.removeCallback(listenerType, iDownloadListener);
        }
    }
}
