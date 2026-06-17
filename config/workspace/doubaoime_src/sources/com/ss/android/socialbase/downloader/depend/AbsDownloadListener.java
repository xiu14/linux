package com.ss.android.socialbase.downloader.depend;

import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.logger.Logger;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import e.a.a.a.a;

/* loaded from: classes2.dex */
public abstract class AbsDownloadListener implements IDownloadListener {
    private static final String TAG = "AbsDownloadListener";

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public void onCanceled(DownloadInfo downloadInfo) {
        if (!Logger.debug() || downloadInfo == null) {
            return;
        }
        String str = TAG;
        int id = downloadInfo.getId();
        StringBuilder M = a.M("Name: ");
        M.append(downloadInfo.getName());
        Logger.taskDebug(str, id, "onCanceled", M.toString());
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
        if (!Logger.debug() || downloadInfo == null) {
            return;
        }
        String str = TAG;
        int id = downloadInfo.getId();
        Object[] objArr = new Object[2];
        objArr[0] = downloadInfo.getName();
        objArr[1] = baseException != null ? baseException.getErrorMessage() : "unkown";
        Logger.taskDebug(str, id, "onFailed", String.format("Name: %s because of : %s", objArr));
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public void onFirstStart(DownloadInfo downloadInfo) {
        if (!Logger.debug() || downloadInfo == null) {
            return;
        }
        String str = TAG;
        int id = downloadInfo.getId();
        StringBuilder M = a.M("Name: ");
        M.append(downloadInfo.getName());
        Logger.taskDebug(str, id, "onFirstStart", M.toString());
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public void onFirstSuccess(DownloadInfo downloadInfo) {
        if (!Logger.debug() || downloadInfo == null) {
            return;
        }
        String str = TAG;
        int id = downloadInfo.getId();
        StringBuilder M = a.M("Name: ");
        M.append(downloadInfo.getName());
        Logger.taskDebug(str, id, "onFirstSuccess", M.toString());
    }

    public void onIntercept(DownloadInfo downloadInfo) {
        if (!Logger.debug() || downloadInfo == null) {
            return;
        }
        String str = TAG;
        int id = downloadInfo.getId();
        StringBuilder M = a.M("Name: ");
        M.append(downloadInfo.getName());
        Logger.taskDebug(str, id, "onIntercept", M.toString());
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public void onPause(DownloadInfo downloadInfo) {
        if (!Logger.debug() || downloadInfo == null) {
            return;
        }
        String str = TAG;
        int id = downloadInfo.getId();
        StringBuilder M = a.M("Name: ");
        M.append(downloadInfo.getName());
        Logger.taskDebug(str, id, "onPause", M.toString());
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public void onPrepare(DownloadInfo downloadInfo) {
        if (!Logger.debug() || downloadInfo == null) {
            return;
        }
        String str = TAG;
        int id = downloadInfo.getId();
        StringBuilder M = a.M("Name: ");
        M.append(downloadInfo.getName());
        Logger.taskDebug(str, id, "onPrepare", M.toString());
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public void onProgress(DownloadInfo downloadInfo) {
        if (!Logger.debug() || downloadInfo == null || downloadInfo.getTotalBytes() == 0) {
            return;
        }
        Logger.taskDebug(TAG, downloadInfo.getId(), "onProgress", String.format("Name: %s %.2f%%", downloadInfo.getName(), Float.valueOf((downloadInfo.getCurBytes() / downloadInfo.getTotalBytes()) * 100.0f)));
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public void onRetry(DownloadInfo downloadInfo, BaseException baseException) {
        if (!Logger.debug() || downloadInfo == null) {
            return;
        }
        String str = TAG;
        int id = downloadInfo.getId();
        Object[] objArr = new Object[2];
        objArr[0] = downloadInfo.getName();
        objArr[1] = baseException != null ? baseException.getErrorMessage() : "unkown";
        Logger.taskDebug(str, id, "onRetry", String.format("Name: %s because of : %s", objArr));
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public void onRetryDelay(DownloadInfo downloadInfo, BaseException baseException) {
        if (!Logger.debug() || downloadInfo == null) {
            return;
        }
        String str = TAG;
        int id = downloadInfo.getId();
        Object[] objArr = new Object[2];
        objArr[0] = downloadInfo.getName();
        objArr[1] = baseException != null ? baseException.getErrorMessage() : "unkown";
        Logger.taskDebug(str, id, "onRetryDelay", String.format("Name: %s because of : %s", objArr));
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public void onStart(DownloadInfo downloadInfo) {
        if (!Logger.debug() || downloadInfo == null) {
            return;
        }
        String str = TAG;
        int id = downloadInfo.getId();
        StringBuilder M = a.M("Name: ");
        M.append(downloadInfo.getName());
        Logger.taskDebug(str, id, "onStart", M.toString());
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public void onSuccessed(DownloadInfo downloadInfo) {
        if (!Logger.debug() || downloadInfo == null) {
            return;
        }
        String str = TAG;
        int id = downloadInfo.getId();
        StringBuilder M = a.M("Name: ");
        M.append(downloadInfo.getName());
        M.append(" ");
        M.append(downloadInfo.isSuccessByCache());
        Logger.taskDebug(str, id, "onSuccessed", M.toString());
    }
}
