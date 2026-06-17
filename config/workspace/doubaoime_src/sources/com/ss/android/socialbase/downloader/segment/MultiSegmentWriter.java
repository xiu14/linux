package com.ss.android.socialbase.downloader.segment;

import com.ss.android.socialbase.downloader.common.AppStatusManager;
import com.ss.android.socialbase.downloader.downloader.DownloadComponentManager;
import com.ss.android.socialbase.downloader.downloader.IDownloadCache;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.setting.DownloadSetting;
import com.ss.android.socialbase.downloader.setting.DownloadSettingKeys;
import com.ss.android.socialbase.downloader.setting.DownloadSettingValues;
import com.ss.android.socialbase.downloader.thread.IDownloadRunnableCallback;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
class MultiSegmentWriter {
    private static final int MIN_CACHE_BYTES = 65536;
    private static final int MIN_CACHE_TIME_MS = 200;
    private static final int MIN_SYNC_STEP_BYTE = 65536;
    private static final long MIN_SYNC_TIME_MS = 500;
    private static final String TAG = "MultiSegmentWriter";
    private final IDownloadRunnableCallback callback;
    private final DownloadInfo downloadInfo;
    private BaseException exception;
    private final boolean hasSyncStrategy;
    private final boolean isMonitorRw;
    private final long minSyncLength;
    private final IBufferPool pool;
    private final DownloadSetting setting;
    private final long syncIntervalMsBg;
    private final long syncIntervalMsFg;
    private long syncTimeNs;
    private final List<SegmentOutput> outputs = new LinkedList();
    private final List<SegmentOutput> doneOutputs = new ArrayList();
    private volatile boolean threadDirty = false;
    private volatile boolean paused = false;
    private volatile boolean canceled = false;
    private boolean needSync = true;
    private volatile long lastSyncBytes = 0;
    private volatile long lastSyncTimestamp = 0;
    private final IDownloadCache downloadCache = DownloadComponentManager.getDownloadCache();
    private final AppStatusManager appStatusManager = AppStatusManager.getInstance();

    MultiSegmentWriter(DownloadInfo downloadInfo, IDownloadRunnableCallback iDownloadRunnableCallback, IBufferPool iBufferPool) {
        this.downloadInfo = downloadInfo;
        this.callback = iDownloadRunnableCallback;
        this.pool = iBufferPool;
        DownloadSetting obtain = DownloadSetting.obtain(downloadInfo.getId());
        this.setting = obtain;
        boolean z = obtain.optInt(DownloadSettingKeys.SYNC_STRATEGY, 0) == 1;
        this.hasSyncStrategy = z;
        if (z) {
            long optInt = obtain.optInt(DownloadSettingKeys.SYNC_INTERVAL_MS_FG, DownloadSettingValues.SYNC_INTERVAL_MS_FG);
            long optInt2 = obtain.optInt(DownloadSettingKeys.SYNC_INTERVAL_MS_BG, 1000);
            this.syncIntervalMsFg = Math.max(optInt, MIN_SYNC_TIME_MS);
            this.syncIntervalMsBg = Math.max(optInt2, MIN_SYNC_TIME_MS);
            this.minSyncLength = obtain.optLong(DownloadSettingKeys.SYNC_MIN_LENGTH, 10485760L);
        } else {
            this.syncIntervalMsFg = 0L;
            this.syncIntervalMsBg = 0L;
            this.minSyncLength = 0L;
        }
        this.isMonitorRw = obtain.optInt(DownloadSettingKeys.MONITOR_RW) == 1;
    }

    private void checkAndSync(long j, boolean z) throws IOException {
        long j2 = j - this.lastSyncTimestamp;
        if (this.hasSyncStrategy) {
            if (j2 > (this.appStatusManager.isAppForeground() ? this.syncIntervalMsFg : this.syncIntervalMsBg)) {
                flushAndSync();
                this.lastSyncTimestamp = j;
                return;
            }
            return;
        }
        long curBytes = this.downloadInfo.getCurBytes() - this.lastSyncBytes;
        if (z || isNeedSync(curBytes, j2)) {
            flushAndSync();
            this.lastSyncTimestamp = j;
        }
    }

    private void close(List<SegmentOutput> list) {
        Iterator<SegmentOutput> it2 = list.iterator();
        while (it2.hasNext()) {
            it2.next().close();
        }
    }

    private void flush(List<SegmentOutput> list) throws IOException {
        Iterator<SegmentOutput> it2 = list.iterator();
        while (it2.hasNext()) {
            it2.next().flush();
        }
    }

    private void flushAndSync() throws IOException {
        boolean z = this.isMonitorRw;
        long nanoTime = z ? System.nanoTime() : 0L;
        DownloadInfo downloadInfo = this.downloadInfo;
        IDownloadCache iDownloadCache = this.downloadCache;
        List<SegmentOutput> list = this.outputs;
        List<SegmentOutput> list2 = this.doneOutputs;
        Map<Long, Segment> segmentMap = iDownloadCache.getSegmentMap(downloadInfo.getId());
        if (segmentMap == null) {
            segmentMap = new HashMap<>(4);
        }
        boolean z2 = false;
        synchronized (this) {
            flush(list);
            try {
                if (this.needSync) {
                    sync(list);
                }
                z2 = true;
            } catch (Throwable th) {
                th.printStackTrace();
            }
            updateSegmentToMap(list, segmentMap);
            if (list2.size() > 0) {
                close(list2);
                list.removeAll(list2);
                list2.clear();
            }
        }
        if (z2) {
            downloadInfo.updateRealDownloadTime(true);
            iDownloadCache.updateSegments(downloadInfo.getId(), segmentMap);
            iDownloadCache.updateDownloadInfo(downloadInfo);
            this.lastSyncBytes = downloadInfo.getCurBytes();
        }
        if (z) {
            this.syncTimeNs += System.nanoTime() - nanoTime;
        }
    }

    private boolean isNeedSync(long j, long j2) {
        return j > 65536 && j2 > MIN_SYNC_TIME_MS;
    }

    private void outputDone(IOutput iOutput) {
        synchronized (this) {
            this.doneOutputs.add((SegmentOutput) iOutput);
        }
    }

    private void sync(List<SegmentOutput> list) throws IOException {
        Iterator<SegmentOutput> it2 = list.iterator();
        while (it2.hasNext()) {
            it2.next().sync();
        }
    }

    private void updateSegmentToMap(List<SegmentOutput> list, Map<Long, Segment> map) {
        Iterator<SegmentOutput> it2 = list.iterator();
        while (it2.hasNext()) {
            Segment segment = it2.next().getSegment();
            Segment segment2 = map.get(Long.valueOf(segment.getStartOffset()));
            if (segment2 == null) {
                map.put(Long.valueOf(segment.getStartOffset()), new Segment(segment));
            } else {
                segment2.setCurrentOffset(segment.getCurrentOffset());
                segment2.setEndOffset(segment.getEndOffset());
            }
        }
    }

    void assignOutput(SegmentOutput segmentOutput) {
        synchronized (this) {
            this.outputs.add(segmentOutput);
        }
    }

    public void cancel() {
        this.canceled = true;
        this.threadDirty = true;
    }

    public long getLastSyncBytes() {
        return this.lastSyncBytes;
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x03c9, code lost:
    
        r3.onProgress(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x0300, code lost:
    
        r3.onProgress(r2);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x03a4 A[Catch: all -> 0x0453, TryCatch #17 {all -> 0x0453, blocks: (B:152:0x0238, B:154:0x023c, B:157:0x0242, B:159:0x0248, B:161:0x0267, B:208:0x02fa, B:209:0x02fc, B:94:0x0395, B:96:0x0399, B:99:0x039e, B:101:0x03a4, B:102:0x03c3, B:103:0x03c5), top: B:12:0x0036, inners: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x03fd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x03d0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x023c A[Catch: all -> 0x0453, TryCatch #17 {all -> 0x0453, blocks: (B:152:0x0238, B:154:0x023c, B:157:0x0242, B:159:0x0248, B:161:0x0267, B:208:0x02fa, B:209:0x02fc, B:94:0x0395, B:96:0x0399, B:99:0x039e, B:101:0x03a4, B:102:0x03c3, B:103:0x03c5), top: B:12:0x0036, inners: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0248 A[Catch: all -> 0x0453, TRY_LEAVE, TryCatch #17 {all -> 0x0453, blocks: (B:152:0x0238, B:154:0x023c, B:157:0x0242, B:159:0x0248, B:161:0x0267, B:208:0x02fa, B:209:0x02fc, B:94:0x0395, B:96:0x0399, B:99:0x039e, B:101:0x03a4, B:102:0x03c3, B:103:0x03c5), top: B:12:0x0036, inners: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x02a3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0276 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0335 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x046c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0474  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x04a2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x049f  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0399 A[Catch: all -> 0x0453, TryCatch #17 {all -> 0x0453, blocks: (B:152:0x0238, B:154:0x023c, B:157:0x0242, B:159:0x0248, B:161:0x0267, B:208:0x02fa, B:209:0x02fc, B:94:0x0395, B:96:0x0399, B:99:0x039e, B:101:0x03a4, B:102:0x03c3, B:103:0x03c5), top: B:12:0x0036, inners: #7 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void loopAndWrite(com.ss.android.socialbase.downloader.segment.IInput r30) throws com.ss.android.socialbase.downloader.exception.BaseException {
        /*
            Method dump skipped, instructions count: 1271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.downloader.segment.MultiSegmentWriter.loopAndWrite(com.ss.android.socialbase.downloader.segment.IInput):void");
    }

    public void pause() {
        this.paused = true;
        this.threadDirty = true;
    }
}
