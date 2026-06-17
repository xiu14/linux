package com.ss.android.socialbase.downloader.cleaner;

import com.ss.android.socialbase.downloader.cleaner.Detecter;
import com.ss.android.socialbase.downloader.downloader.DownloadComponentManager;
import com.ss.android.socialbase.downloader.logger.Logger;
import com.ss.android.socialbase.downloader.utils.DownloadUtils;
import e.a.a.a.a;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Semaphore;

/* loaded from: classes2.dex */
public class CleanerImpl {
    private static final String TAG = "CleanerImpl";
    private Map<Integer, List<Integer>> mCleanCacheKeyMaps;
    private CleanerConfig mCleanerConfig;
    private Semaphore mCleanCompletedSem = new Semaphore(0);
    private volatile boolean mIsStop = false;

    public CleanerImpl(CleanerConfig cleanerConfig) {
        this.mCleanerConfig = cleanerConfig;
        this.mCleanCacheKeyMaps = cleanerConfig.getCleanCacheKeyMaps();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startClean() {
        if (this.mIsStop) {
            return;
        }
        Iterator<Map.Entry<Integer, List<Integer>>> it2 = this.mCleanCacheKeyMaps.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry<Integer, List<Integer>> next = it2.next();
            int intValue = next.getKey().intValue();
            Iterator<Integer> it3 = next.getValue().iterator();
            while (it3.hasNext()) {
                if (this.mIsStop) {
                    if (Logger.debug()) {
                        Logger.globalDebug(TAG, "startClean", "stop cleaning");
                    }
                    this.mIsStop = false;
                    return;
                }
                int intValue2 = it3.next().intValue();
                if (this.mCleanerConfig.isExistInCleanSet(intValue2)) {
                    DownloadUtils.clearDownloadFile(this.mCleanerConfig.getSavePath(intValue2), this.mCleanerConfig.getTempSavePath(intValue2), this.mCleanerConfig.getName(intValue2));
                    DownloadComponentManager.getDownloadCache().removeDownloadTaskData(intValue2);
                    if (Logger.debug()) {
                        Logger.globalDebug(TAG, "startClean", "clean cache downloadId=" + intValue2);
                    }
                    it3.remove();
                    this.mCleanerConfig.removeFromCleanDownloadIdSet(intValue2);
                } else {
                    if (Logger.debug()) {
                        Logger.globalDebug(TAG, "startClean", "dwg888Find in visit history,can't do clean,downloadId=" + intValue2);
                    }
                    it3.remove();
                }
            }
            it2.remove();
            this.mCleanerConfig.updateCleanSetting(intValue);
        }
        if (Logger.debug()) {
            Logger.globalDebug(TAG, "startClean", "clean completed!");
        }
        this.mCleanCompletedSem.release();
    }

    public void startSync() throws InterruptedException {
        if (this.mCleanerConfig.isNoCacheNeedClean() || this.mCleanCacheKeyMaps.isEmpty()) {
            if (Logger.debug()) {
                Logger.globalDebug(TAG, "startSync", "CleanCacheKeyMaps Empty");
                return;
            }
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        Detecter detecter = new Detecter(new Detecter.IDetecterEventCallback() { // from class: com.ss.android.socialbase.downloader.cleaner.CleanerImpl.1
            @Override // com.ss.android.socialbase.downloader.cleaner.Detecter.IDetecterEventCallback
            public void onSmooth() {
                if (Logger.debug()) {
                    Logger.globalDebug(CleanerImpl.TAG, "startSync", "enter onSmooth");
                }
                CleanerImpl.this.startClean();
            }

            @Override // com.ss.android.socialbase.downloader.cleaner.Detecter.IDetecterEventCallback
            public void onStuck() {
                if (Logger.debug()) {
                    Logger.globalDebug(CleanerImpl.TAG, "startSync", "enter onStuck");
                }
                CleanerImpl.this.mIsStop = true;
            }
        });
        detecter.start();
        startClean();
        this.mCleanCompletedSem.acquire();
        detecter.stop();
        if (Logger.debug()) {
            StringBuilder M = a.M("clear all cache end---cost time=");
            M.append(System.currentTimeMillis() - currentTimeMillis);
            Logger.globalDebug(TAG, "startSync", M.toString());
        }
    }
}
