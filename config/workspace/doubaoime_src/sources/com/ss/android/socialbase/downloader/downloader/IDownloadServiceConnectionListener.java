package com.ss.android.socialbase.downloader.downloader;

import android.os.IBinder;

/* loaded from: classes2.dex */
public interface IDownloadServiceConnectionListener {
    void onServiceConnection(IBinder iBinder);

    void onServiceDisConnection();
}
