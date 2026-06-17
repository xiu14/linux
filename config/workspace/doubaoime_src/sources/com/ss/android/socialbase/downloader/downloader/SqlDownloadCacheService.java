package com.ss.android.socialbase.downloader.downloader;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Binder;
import android.os.IBinder;
import com.ss.android.socialbase.downloader.impls.DefaultDownloadCache;
import com.ss.android.socialbase.downloader.logger.Logger;
import e.a.a.a.a;

/* loaded from: classes2.dex */
public class SqlDownloadCacheService extends Service {
    private static final String TAG = SqlDownloadCacheService.class.getSimpleName();

    public static void startServiceAndBind(Context context, ServiceConnection serviceConnection) {
        if (context != null) {
            try {
                Intent intent = new Intent(context, (Class<?>) SqlDownloadCacheService.class);
                if (serviceConnection != null) {
                    context.bindService(intent, serviceConnection, 1);
                }
                context.startService(intent);
            } catch (Throwable th) {
                String str = TAG;
                StringBuilder M = a.M("Exception:");
                M.append(th.toString());
                Logger.globalError(str, "startServiceAndBind", M.toString());
            }
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        IDownloadCache downloadCache = DownloadComponentManager.getDownloadCache();
        ISqlDownloadCache sqlDownloadCache = downloadCache instanceof DefaultDownloadCache ? ((DefaultDownloadCache) downloadCache).getSqlDownloadCache() : downloadCache instanceof ISqlDownloadCache ? (ISqlDownloadCache) downloadCache : null;
        return sqlDownloadCache instanceof IBinder ? (IBinder) sqlDownloadCache : new Binder();
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        DownloadComponentManager.setAppContext(getApplicationContext());
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        return 2;
    }
}
