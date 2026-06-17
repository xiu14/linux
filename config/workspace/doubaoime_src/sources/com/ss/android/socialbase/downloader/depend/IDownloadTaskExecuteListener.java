package com.ss.android.socialbase.downloader.depend;

import com.ss.android.socialbase.downloader.constants.BoundType;
import com.ss.android.socialbase.downloader.model.DownloadTask;

/* loaded from: classes2.dex */
public interface IDownloadTaskExecuteListener {
    void onFinish(DownloadTask downloadTask, @BoundType int i);

    void onStart(DownloadTask downloadTask, @BoundType int i);
}
