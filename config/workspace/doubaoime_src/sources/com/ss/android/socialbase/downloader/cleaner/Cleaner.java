package com.ss.android.socialbase.downloader.cleaner;

import com.ss.android.socialbase.downloader.downloader.DownloadComponentManager;
import com.ss.android.socialbase.downloader.logger.Logger;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.setting.DownloadSetting;
import com.ss.android.socialbase.downloader.setting.DownloadSettingKeys;
import com.ss.android.socialbase.downloader.utils.DownloadHelper;
import e.a.a.a.a;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public class Cleaner {
    private static final String TAG = "Cleaner";
    private volatile CleanerConfig mCleanerConfig = new CleanerConfig();
    private static AtomicBoolean mIsRunCleaner = new AtomicBoolean();
    private static volatile Cleaner INSTANCE = null;

    public static Cleaner getINSTANCE() {
        if (INSTANCE == null) {
            synchronized (Cleaner.class) {
                if (INSTANCE == null) {
                    INSTANCE = new Cleaner();
                }
            }
        }
        return INSTANCE;
    }

    public void init() {
        long currentTimeMillis = Logger.debug() ? System.currentTimeMillis() : 0L;
        this.mCleanerConfig.init();
        if (Logger.debug()) {
            StringBuilder M = a.M("Cleaner init cost time=");
            M.append(System.currentTimeMillis() - currentTimeMillis);
            Logger.globalDebug(TAG, "init", M.toString());
        }
    }

    public boolean isExistInCleanSet(int i) {
        if (i == 0) {
            return false;
        }
        return this.mCleanerConfig.isExistInCleanSet(i);
    }

    public void removeFromCleanSet(int i) {
        this.mCleanerConfig.removeFromCleanDownloadIdSet(i);
    }

    public void start() {
        if (Logger.debug()) {
            Logger.globalDebug(TAG, "start", "enter Cleaner start");
        }
        if (mIsRunCleaner.compareAndSet(true, true)) {
            return;
        }
        if (!DownloadHelper.isMainProcess()) {
            this.mCleanerConfig.finish();
            return;
        }
        int optInt = DownloadSetting.obtainGlobal().optInt(DownloadSettingKeys.CacheCleaner.START_CLEAN_DELAY_TIME_S);
        if (Logger.debug()) {
            StringBuilder N = a.N("Run cleaner startCleanDelayTime: ", optInt, " isNoCacheNeedClean:");
            N.append(this.mCleanerConfig.isNoCacheNeedClean());
            Logger.globalDebug(TAG, "run", N.toString());
        }
        if (optInt <= 0 || this.mCleanerConfig.isNoCacheNeedClean()) {
            this.mCleanerConfig.finish();
        } else {
            DownloadComponentManager.submitScheduleTask(new Runnable() { // from class: com.ss.android.socialbase.downloader.cleaner.Cleaner.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        new CleanerImpl(Cleaner.this.mCleanerConfig).startSync();
                    } finally {
                        try {
                        } finally {
                        }
                    }
                }
            }, optInt, TimeUnit.SECONDS);
        }
    }

    public boolean updateCleanDownloadId(DownloadInfo downloadInfo) {
        return this.mCleanerConfig.updateCleanDownloadId(downloadInfo);
    }
}
