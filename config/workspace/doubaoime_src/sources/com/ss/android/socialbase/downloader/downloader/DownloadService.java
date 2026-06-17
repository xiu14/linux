package com.ss.android.socialbase.downloader.downloader;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.ss.android.socialbase.downloader.logger.Logger;
import e.a.a.a.a;
import java.lang.ref.WeakReference;
import java.util.concurrent.ExecutorService;

/* loaded from: classes2.dex */
public class DownloadService extends Service {
    private static final String TAG = DownloadService.class.getSimpleName();
    protected IDownloadServiceHandler downloadServiceHandler;

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        if (Logger.debug()) {
            String str = TAG;
            StringBuilder M = a.M("DownloadServiceHandler != null:");
            M.append(this.downloadServiceHandler != null);
            Logger.globalDebug(str, "onBind", M.toString());
        }
        IDownloadServiceHandler iDownloadServiceHandler = this.downloadServiceHandler;
        if (iDownloadServiceHandler != null) {
            return iDownloadServiceHandler.onBind(intent);
        }
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        DownloadComponentManager.setAppContext(this);
        IDownloadServiceHandler downloadServiceHandler = DownloadComponentManager.getDownloadServiceHandler();
        this.downloadServiceHandler = downloadServiceHandler;
        downloadServiceHandler.setDownloadService(new WeakReference(this));
    }

    @Override // android.app.Service
    public void onDestroy() {
        if (Logger.debug()) {
            Logger.globalDebug(TAG, "onDestroy", "Run");
        }
        IDownloadServiceHandler iDownloadServiceHandler = this.downloadServiceHandler;
        if (iDownloadServiceHandler != null) {
            iDownloadServiceHandler.onDestroy();
            this.downloadServiceHandler = null;
        }
        super.onDestroy();
    }

    @Override // android.app.Service
    public int onStartCommand(final Intent intent, final int i, final int i2) {
        if (Logger.debug()) {
            Logger.globalDebug(TAG, "onStartCommand", "Run");
        }
        try {
            IDownloadServiceHandler iDownloadServiceHandler = this.downloadServiceHandler;
            if (iDownloadServiceHandler != null) {
                iDownloadServiceHandler.onStartCommandOnMainThread();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        ExecutorService cPUThreadExecutor = DownloadComponentManager.getCPUThreadExecutor();
        if (cPUThreadExecutor == null) {
            return 2;
        }
        cPUThreadExecutor.execute(new Runnable() { // from class: com.ss.android.socialbase.downloader.downloader.DownloadService.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    IDownloadServiceHandler iDownloadServiceHandler2 = DownloadService.this.downloadServiceHandler;
                    if (iDownloadServiceHandler2 != null) {
                        iDownloadServiceHandler2.onStartCommand(intent, i, i2);
                    }
                } catch (Throwable th2) {
                    th2.printStackTrace();
                }
            }
        });
        return 2;
    }
}
