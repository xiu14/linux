package com.ss.android.socialbase.downloader.segment;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.core.location.LocationRequestCompat;
import com.ss.android.socialbase.downloader.constants.DownloadErrorCode;
import com.ss.android.socialbase.downloader.downloader.DownloadComponentManager;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.exception.DownloadHttpException;
import com.ss.android.socialbase.downloader.logger.Logger;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import com.ss.android.socialbase.downloader.model.HttpResponse;
import com.ss.android.socialbase.downloader.monitor.DownloadMonitorHelper;
import com.ss.android.socialbase.downloader.network.DownloadDnsManager;
import com.ss.android.socialbase.downloader.setting.DownloadSetting;
import com.ss.android.socialbase.downloader.setting.DownloadSettingKeys;
import com.ss.android.socialbase.downloader.thread.DownloadWatchDog;
import com.ss.android.socialbase.downloader.thread.IDownloadRunnableCallback;
import com.ss.android.socialbase.downloader.utils.DownloadHelper;
import com.ss.android.socialbase.downloader.utils.DownloadStenographer;
import e.a.a.a.a;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class SegmentDispatcher implements ISegmentCallback, DownloadDnsManager.Callback {
    private static final int READ_WATCH_TIME = 2000;
    private static final String TAG = "SegmentDispatcher";
    private final BufferQueue bufferQueue;
    private long connectTimeout;
    private final boolean debug;
    private final DownloadInfo downloadInfo;
    private final DownloadTask downloadTask;
    private BaseException failedException;
    private HttpResponse firstBackupUrlHttpResponse;
    private final IDownloadRunnableCallback hostCallback;
    private volatile boolean isAllContentDownloaded;
    private long lastReconnectTime;
    private HttpResponse mainUrlHttpResponse;
    private float poorSpeedRatio;
    private long readTimeout;
    private int reconnectCount;
    private final DownloadStenographer stenographer;
    private final SegmentStrategy strategy;
    private long totalLength;
    private int urlIndex;
    private final DownloadWatchDog watchDog;
    private final MultiSegmentWriter writer;
    private volatile boolean canceled = false;
    private volatile boolean paused = false;
    private final List<SegmentReader> readers = new ArrayList();
    private final List<UrlRecord> urlRecords = new ArrayList();
    private volatile boolean needWaitDnsResolve = true;
    private final LinkedList<Segment> toDispatchSegments = new LinkedList<>();
    private final List<Segment> dispatchedSegments = new ArrayList();
    private final Object firstConnectionLock = new Object();
    private volatile boolean allReaderFailed = false;
    private final DownloadWatchDog.IWatcher connectWatcher = new DownloadWatchDog.IWatcher() { // from class: com.ss.android.socialbase.downloader.segment.SegmentDispatcher.1
        private int watchTimes;

        @Override // com.ss.android.socialbase.downloader.thread.DownloadWatchDog.IWatcher
        public long onScheduleWatch() {
            if (SegmentDispatcher.this.canceled || SegmentDispatcher.this.paused) {
                return -1L;
            }
            synchronized (SegmentDispatcher.this) {
                if (SegmentDispatcher.this.mainUrlHttpResponse == null && SegmentDispatcher.this.firstBackupUrlHttpResponse == null) {
                    long j = SegmentDispatcher.this.connectTimeout;
                    if (j <= 0) {
                        return -1L;
                    }
                    this.watchTimes++;
                    SegmentReader findEarliestConnectTimeoutReader = SegmentDispatcher.this.findEarliestConnectTimeoutReader(false, System.currentTimeMillis(), j);
                    if (findEarliestConnectTimeoutReader == null) {
                        return j;
                    }
                    if (Logger.debug()) {
                        Logger.taskDebug(SegmentDispatcher.TAG, SegmentDispatcher.this.downloadInfo.getId(), "onScheduleWatch", "connectWatcher: switchUrl and reconnect");
                    }
                    SegmentDispatcher.this.trySwitchNextUrlForReader(findEarliestConnectTimeoutReader);
                    findEarliestConnectTimeoutReader.reconnect();
                    return ((this.watchTimes / SegmentDispatcher.this.urlRecords.size()) + 1) * j;
                }
                return -1L;
            }
        }
    };
    private final DownloadWatchDog.IWatcher readWatcher = new DownloadWatchDog.IWatcher() { // from class: com.ss.android.socialbase.downloader.segment.SegmentDispatcher.2
        @Override // com.ss.android.socialbase.downloader.thread.DownloadWatchDog.IWatcher
        public long onScheduleWatch() {
            return SegmentDispatcher.this.scheduleWatchRead();
        }
    };

    public SegmentDispatcher(@NonNull DownloadTask downloadTask, @NonNull DownloadInfo downloadInfo, @NonNull SegmentStrategy segmentStrategy, IDownloadRunnableCallback iDownloadRunnableCallback) {
        this.downloadTask = downloadTask;
        this.downloadInfo = downloadInfo;
        this.strategy = segmentStrategy;
        BufferQueue bufferQueue = new BufferQueue(segmentStrategy.getBufferCount(), segmentStrategy.getBufferSize());
        this.bufferQueue = bufferQueue;
        this.hostCallback = iDownloadRunnableCallback;
        this.writer = new MultiSegmentWriter(downloadInfo, iDownloadRunnableCallback, bufferQueue);
        this.watchDog = new DownloadWatchDog();
        this.stenographer = new DownloadStenographer();
        this.debug = DownloadSetting.obtain(downloadInfo.getId()).optInt(DownloadSettingKeys.DEBUG) == 1;
    }

    private void addIpListLocked(String str, List<UrlRecord> list) {
        int indexOfUrl;
        if (this.debug) {
            for (UrlRecord urlRecord : list) {
                if (Logger.debug()) {
                    Logger.taskDebug(TAG, this.downloadInfo.getId(), "addIpListLocked", "UrlRecord: " + urlRecord);
                }
            }
        }
        int ipStrategy = this.strategy.getIpStrategy();
        if ((ipStrategy == 1 || ipStrategy == 3) && (indexOfUrl = indexOfUrl(str)) >= 0 && indexOfUrl < this.urlRecords.size()) {
            this.urlRecords.addAll(indexOfUrl + 1, list);
        } else {
            this.urlRecords.addAll(list);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00bd, code lost:
    
        if ((r11.getCurrentOffsetRead() - r24.getCurrentOffsetRead()) < (r15 / 2)) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void applySegmentLocked(com.ss.android.socialbase.downloader.segment.SegmentReader r23, com.ss.android.socialbase.downloader.segment.Segment r24) throws com.ss.android.socialbase.downloader.segment.SegmentApplyException {
        /*
            Method dump skipped, instructions count: 910
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.downloader.segment.SegmentDispatcher.applySegmentLocked(com.ss.android.socialbase.downloader.segment.SegmentReader, com.ss.android.socialbase.downloader.segment.Segment):void");
    }

    private void arrangeSegmentLocked(List<Segment> list, Segment segment, boolean z) {
        long startOffset = segment.getStartOffset();
        int size = list.size();
        int i = 0;
        while (i < size && startOffset >= list.get(i).getStartOffset()) {
            i++;
        }
        list.add(i, segment);
        if (z) {
            segment.setIndex(size);
        }
    }

    private List<UrlRecord> assembleIpAddress(String str, List<InetAddress> list) {
        boolean z;
        if (list != null && !list.isEmpty()) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            int i = 0;
            for (InetAddress inetAddress : list) {
                if (inetAddress != null) {
                    String hostAddress = inetAddress.getHostAddress();
                    if (!TextUtils.isEmpty(hostAddress)) {
                        if (this.debug && Logger.debug()) {
                            Logger.taskDebug(TAG, this.downloadInfo.getId(), "assembleIpAddress", "Ip: " + hostAddress);
                        }
                        UrlRecord urlRecord = new UrlRecord(str, hostAddress);
                        LinkedList linkedList = (LinkedList) linkedHashMap.get(urlRecord.ipFamily);
                        if (linkedList == null) {
                            linkedList = new LinkedList();
                            linkedHashMap.put(urlRecord.ipFamily, linkedList);
                        }
                        linkedList.add(urlRecord);
                        i++;
                    }
                }
            }
            if (i > 0) {
                ArrayList arrayList = new ArrayList();
                do {
                    Iterator it2 = linkedHashMap.entrySet().iterator();
                    z = false;
                    while (it2.hasNext()) {
                        LinkedList linkedList2 = (LinkedList) ((Map.Entry) it2.next()).getValue();
                        if (linkedList2 != null && !linkedList2.isEmpty()) {
                            arrayList.add((UrlRecord) linkedList2.pollFirst());
                            i--;
                            z = true;
                        }
                    }
                    if (i <= 0) {
                        break;
                    }
                } while (z);
                return arrayList;
            }
        }
        return null;
    }

    private void checkDownloadedBytesLocked(List<Segment> list) {
        long downloadedBytes = SegmentUtils.getDownloadedBytes(list);
        if (Logger.debug()) {
            int id = this.downloadInfo.getId();
            StringBuilder M = a.M("GetCurBytes = ");
            M.append(this.downloadInfo.getCurBytes());
            M.append(", totalBytes = ");
            M.append(this.downloadInfo.getTotalBytes());
            M.append(", downloadedBytes = ");
            M.append(downloadedBytes);
            Logger.taskDebug(TAG, id, "checkDownloadedBytesLocked", M.toString());
        }
        if (downloadedBytes > this.downloadInfo.getTotalBytes() && this.downloadInfo.getTotalBytes() > 0) {
            downloadedBytes = this.downloadInfo.getTotalBytes();
        }
        if (this.downloadInfo.getCurBytes() == this.downloadInfo.getTotalBytes() || this.downloadInfo.getCurBytes() == downloadedBytes) {
            return;
        }
        this.downloadInfo.setCurBytes(downloadedBytes);
    }

    private void checkSegmentHttpResponseLocked(SegmentReader segmentReader, Segment segment, UrlRecord urlRecord, HttpResponse httpResponse) throws BaseException {
        SegmentReader segmentReader2 = segment.owner;
        if (segmentReader2 != null && segmentReader2 != segmentReader) {
            throw new SegmentApplyException(1, "segment already has an owner");
        }
        if (segmentReader.getStartOffsetInConnection() != segment.getCurrentOffsetRead()) {
            throw new SegmentApplyException(5, "applySegment");
        }
        if (!httpResponse.acceptPartial()) {
            if (segment.getCurrentOffsetRead() > 0) {
                int i = httpResponse.responseCode;
                StringBuilder M = a.M("1: response code error : ");
                M.append(httpResponse.responseCode);
                M.append(" segment=");
                M.append(segment);
                throw new DownloadHttpException(1004, i, M.toString());
            }
            int id = this.downloadInfo.getId();
            StringBuilder M2 = a.M("Segment.getCurrentOffsetRead = ");
            M2.append(segment.getCurrentOffsetRead());
            Logger.taskError(TAG, id, "checkSegmentHttpResponseLocked", M2.toString());
            if (!httpResponse.isResponseDataFromBegin()) {
                int i2 = httpResponse.responseCode;
                StringBuilder M3 = a.M("2: response code error : ");
                M3.append(httpResponse.responseCode);
                M3.append(" segment=");
                M3.append(segment);
                throw new DownloadHttpException(1004, i2, M3.toString());
            }
        }
        IDownloadRunnableCallback iDownloadRunnableCallback = this.hostCallback;
        if (iDownloadRunnableCallback != null) {
            iDownloadRunnableCallback.checkMaxBytes(httpResponse.getTotalLength(), this.downloadInfo.getMaxBytes());
        }
        if (!urlRecord.isMainUrl) {
            validateHttpResponse(httpResponse);
            if (this.firstBackupUrlHttpResponse == null) {
                this.firstBackupUrlHttpResponse = httpResponse;
                if (this.downloadInfo.getTotalBytes() <= 0) {
                    long totalLength = httpResponse.getTotalLength();
                    if (Logger.debug()) {
                        int id2 = this.downloadInfo.getId();
                        StringBuilder Q = a.Q("Len=", totalLength, ",url=");
                        Q.append(urlRecord.url);
                        Logger.taskDebug(TAG, id2, "checkSegmentHttpResponseLocked", Q.toString());
                    }
                    this.downloadInfo.setTotalBytes(totalLength);
                }
                synchronized (this.firstConnectionLock) {
                    this.firstConnectionLock.notify();
                }
                return;
            }
            return;
        }
        if (this.mainUrlHttpResponse == null) {
            this.mainUrlHttpResponse = httpResponse;
            synchronized (this.firstConnectionLock) {
                this.firstConnectionLock.notify();
            }
            IDownloadRunnableCallback iDownloadRunnableCallback2 = this.hostCallback;
            if (iDownloadRunnableCallback2 != null) {
                iDownloadRunnableCallback2.handleFirstConnection(urlRecord.url, httpResponse.connection, segment.getCurrentOffsetRead());
            }
            long totalLength2 = httpResponse.getTotalLength();
            if (totalLength2 > 0) {
                for (Segment segment2 : this.dispatchedSegments) {
                    if (segment2.getEndOffset() <= 0 || segment2.getEndOffset() > totalLength2 - 1) {
                        segment2.setEndOffset(totalLength2 - 1);
                    }
                }
            }
        }
    }

    private void clearCoveredSegmentLocked() {
        int size;
        if (this.totalLength > 0 && (size = this.dispatchedSegments.size()) > 1) {
            ArrayList<Segment> arrayList = null;
            int i = 0;
            for (int i2 = 1; i2 < size; i2++) {
                Segment segment = this.dispatchedSegments.get(i);
                Segment segment2 = this.dispatchedSegments.get(i2);
                if (segment.getCurrentOffsetRead() > segment2.getStartOffset() && segment2.getDownloadBytes() <= 0 && segment2.owner == null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList(1);
                    }
                    arrayList.add(segment2);
                    if (this.debug && Logger.debug()) {
                        Logger.taskDebug(TAG, this.downloadInfo.getId(), "clearCoveredSegmentLocked", "covered = " + segment2 + ", prev = " + segment);
                    }
                } else if (segment2.getCurrentOffsetRead() > segment.getCurrentOffsetRead()) {
                    i++;
                }
            }
            if (arrayList != null) {
                for (Segment segment3 : arrayList) {
                    this.dispatchedSegments.remove(segment3);
                    for (SegmentReader segmentReader : this.readers) {
                        if (segmentReader.curSegment == segment3) {
                            if (this.debug && Logger.debug()) {
                                int id = this.downloadInfo.getId();
                                StringBuilder sb = new StringBuilder();
                                sb.append("reconnect, segment = ");
                                sb.append(segment3);
                                sb.append(", threadIndex = ");
                                a.E0(sb, segmentReader.threadIndex, TAG, id, "clearCoveredSegmentLocked");
                            }
                            segmentReader.reconnect(true);
                        }
                    }
                }
            }
        }
    }

    private void dispatchReadThread() {
        int i;
        if (this.totalLength <= 0 || this.needWaitDnsResolve) {
            i = 1;
        } else {
            i = this.strategy.getThreadCount();
            int segmentMinInitSize = (int) (this.totalLength / this.strategy.getSegmentMinInitSize());
            if (i > segmentMinInitSize) {
                i = segmentMinInitSize;
            }
        }
        if (Logger.debug()) {
            int id = this.downloadInfo.getId();
            StringBuilder M = a.M("TotalLength = ");
            M.append(this.totalLength);
            M.append(", threadCount = ");
            M.append(i);
            Logger.taskDebug(TAG, id, "dispatchReadThread", M.toString());
        }
        int i2 = i > 0 ? i : 1;
        synchronized (this) {
            do {
                if (this.readers.size() >= i2) {
                    break;
                }
                if (!this.paused && !this.canceled) {
                    dispatchReadThreadOnce(obtainUrl());
                }
                return;
            } while (!this.strategy.segmentOneByOne());
        }
    }

    private void dispatchReadThreadOnce(UrlRecord urlRecord) {
        SegmentReader segmentReader = new SegmentReader(this.downloadTask, this.downloadInfo, this, this.bufferQueue, urlRecord, this.readers.size());
        this.readers.add(segmentReader);
        segmentReader.setFuture(DownloadComponentManager.getChunkDownloadThreadExecutorService().submit(segmentReader));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public SegmentReader findEarliestConnectTimeoutReader(boolean z, long j, long j2) {
        SegmentReader segmentReader = null;
        for (SegmentReader segmentReader2 : this.readers) {
            if (segmentReader2.threadIndex != 0 || z) {
                if (segmentReader2.connectStartTime > 0 && segmentReader2.connectEndTime <= 0 && j - segmentReader2.connectStartTime > j2 && (segmentReader == null || segmentReader2.connectStartTime < segmentReader.connectStartTime)) {
                    segmentReader = segmentReader2;
                }
            }
        }
        return segmentReader;
    }

    private UrlRecord findNextUrlLocked(SegmentReader segmentReader) {
        UrlRecord urlRecord;
        Iterator<UrlRecord> it2 = this.urlRecords.iterator();
        UrlRecord urlRecord2 = null;
        while (true) {
            if (!it2.hasNext()) {
                urlRecord = null;
                break;
            }
            urlRecord = it2.next();
            if (urlRecord != segmentReader.urlRecord && !urlRecord.isCurrentFailed()) {
                if (urlRecord2 == null) {
                    urlRecord2 = urlRecord;
                }
                if (urlRecord.getCurrentUsers() <= 0) {
                    break;
                }
            }
        }
        if (this.strategy.urlBalance()) {
            if (urlRecord != null) {
                return urlRecord;
            }
            if (this.strategy.urlBalanceStrictly()) {
                return null;
            }
        }
        return urlRecord2;
    }

    private SegmentReader findPoorReadThread(long j, long j2, long j3, int i) {
        long j4;
        long j5 = j;
        long j6 = LocationRequestCompat.PASSIVE_INTERVAL;
        int i2 = 0;
        SegmentReader segmentReader = null;
        for (SegmentReader segmentReader2 : this.readers) {
            if (segmentReader2.readStartTime > 0) {
                i2++;
                if (segmentReader2.readStartTime < j5) {
                    long recentDownloadSpeed = segmentReader2.getRecentDownloadSpeed(j5, j2);
                    if (this.debug && Logger.debug()) {
                        a.E0(a.Q("Speed = ", recentDownloadSpeed, ", threadIndex = "), segmentReader2.threadIndex, TAG, this.downloadInfo.getId(), "findPoorReadThread");
                        j4 = 0;
                    } else {
                        j4 = 0;
                    }
                    if (recentDownloadSpeed >= j4 && recentDownloadSpeed < j6) {
                        segmentReader = segmentReader2;
                        j6 = recentDownloadSpeed;
                    }
                    j5 = j;
                }
            }
            j5 = j;
        }
        if (segmentReader == null || i2 < i || j6 >= j3) {
            return null;
        }
        if (Logger.debug()) {
            a.E0(a.Q("MinSpeed = ", j6, ", threadIndex = "), segmentReader.threadIndex, TAG, this.downloadInfo.getId(), "findPoorReadThread");
        }
        return segmentReader;
    }

    private boolean findPoorReadThreadAndReconnect(long j, long j2) {
        long j3 = j - j2;
        long recentDownloadSpeed = this.stenographer.getRecentDownloadSpeed(j3, j);
        int size = this.readers.size();
        if (size > 0) {
            recentDownloadSpeed /= size;
        }
        SegmentReader findPoorReadThread = findPoorReadThread(j3, j, (long) Math.max(10.0f, recentDownloadSpeed * this.poorSpeedRatio), size / 2);
        if (findPoorReadThread != null) {
            trySwitchNextUrlForReader(findPoorReadThread);
            if (Logger.debug()) {
                a.E0(a.M("HandlePoorReadThread: reconnect for poor speed, threadIndex = "), findPoorReadThread.threadIndex, TAG, this.downloadInfo.getId(), "findPoorReadThreadAndReconnect");
            }
            findPoorReadThread.reconnect();
            return true;
        }
        SegmentReader findEarliestConnectTimeoutReader = findEarliestConnectTimeoutReader(true, j, j2);
        if (findEarliestConnectTimeoutReader == null) {
            return false;
        }
        trySwitchNextUrlForReader(findEarliestConnectTimeoutReader);
        if (Logger.debug()) {
            a.E0(a.M("handlePoorReadThread: reconnect for connect timeout, threadIndex = "), findEarliestConnectTimeoutReader.threadIndex, TAG, this.downloadInfo.getId(), "findPoorReadThreadAndReconnect");
        }
        findEarliestConnectTimeoutReader.reconnect();
        return true;
    }

    private void fixSegmentsLocked(List<Segment> list) {
        Segment segment = list.get(0);
        long startOffset = this.downloadInfo.getStartOffset();
        if (startOffset < 0) {
            startOffset = 0;
        }
        long startOffset2 = segment.getStartOffset();
        if (startOffset2 > startOffset) {
            Segment segment2 = new Segment(startOffset, startOffset2 - 1);
            if (Logger.debug()) {
                Logger.taskDebug(TAG, this.downloadInfo.getId(), "fixSegmentsLocked", "First = " + segment + ", add new first = " + segment2);
            }
            arrangeSegmentLocked(list, segment2, true);
        }
        Iterator<Segment> it2 = list.iterator();
        if (it2.hasNext()) {
            Segment next = it2.next();
            while (it2.hasNext()) {
                Segment next2 = it2.next();
                if (next.getEndOffset() < next2.getStartOffset() - 1) {
                    if (Logger.debug()) {
                        Logger.taskDebug(TAG, this.downloadInfo.getId(), "fixSegmentsLocked", "Segment = " + next + ", new end = " + (next2.getStartOffset() - 1));
                    }
                    next.setEndOffset(next2.getStartOffset() - 1);
                }
                next = next2;
            }
        }
        Segment segment3 = list.get(list.size() - 1);
        long endOffset = this.downloadInfo.getEndOffset();
        if (endOffset > 0 && endOffset > startOffset) {
            segment3.setEndOffset(endOffset);
            return;
        }
        long totalBytes = this.downloadInfo.getTotalBytes();
        if (totalBytes <= 0 || (segment3.getEndOffset() != -1 && segment3.getEndOffset() < totalBytes - 1)) {
            if (Logger.debug()) {
                Logger.taskDebug(TAG, this.downloadInfo.getId(), "fixSegmentsLocked", "Last segment = " + segment3 + ", new end=-1");
            }
            segment3.setEndOffset(-1L);
        }
    }

    private float getDownloadRatio(SegmentReader segmentReader, UrlRecord urlRecord) {
        long readBytes = segmentReader.getReadBytes();
        int size = this.readers.size();
        if (size <= 1) {
            size = this.strategy.getThreadCount();
        }
        float f2 = 1.0f;
        if (readBytes <= 0) {
            float mainRatio = this.strategy.getMainRatio();
            if (mainRatio <= 0.0f || mainRatio >= 1.0f) {
                mainRatio = 1.0f / size;
            }
            if (segmentReader.threadIndex == 0) {
                return mainRatio;
            }
            if (size > 1) {
                f2 = 1.0f - mainRatio;
                size--;
            }
        } else {
            long totalReadBytes = getTotalReadBytes();
            if (totalReadBytes > readBytes) {
                return readBytes / totalReadBytes;
            }
        }
        return f2 / size;
    }

    private long getRemainReadBytes(Segment segment) {
        long remainReadBytes = segment.getRemainReadBytes();
        if (remainReadBytes != -1) {
            return remainReadBytes;
        }
        long j = this.totalLength;
        return j > 0 ? j - segment.getCurrentOffsetRead() : remainReadBytes;
    }

    private long getTotalReadBytes() {
        Iterator<SegmentReader> it2 = this.readers.iterator();
        long j = 0;
        while (it2.hasNext()) {
            j += it2.next().getReadBytes();
        }
        return j;
    }

    private long getUnconfirmedRemainBytes(int i, int i2) {
        Segment segment = this.dispatchedSegments.get(i);
        long remainReadBytes = getRemainReadBytes(segment);
        int i3 = i + 1;
        Segment segment2 = i3 < i2 ? this.dispatchedSegments.get(i3) : null;
        if (segment2 == null) {
            return remainReadBytes;
        }
        long startOffset = segment2.getStartOffset() - segment.getCurrentOffsetRead();
        return remainReadBytes == -1 ? startOffset : Math.min(remainReadBytes, startOffset);
    }

    private int indexOfSegmentLocked(long j) {
        int size = this.dispatchedSegments.size();
        for (int i = 0; i < size; i++) {
            Segment segment = this.dispatchedSegments.get(i);
            if (segment.getStartOffset() == j) {
                return i;
            }
            if (segment.getStartOffset() > j) {
                return -1;
            }
        }
        return -1;
    }

    private int indexOfUrl(String str) {
        int size = this.urlRecords.size();
        for (int i = 0; i < size; i++) {
            if (TextUtils.equals(this.urlRecords.get(i).url, str)) {
                return i;
            }
        }
        return -1;
    }

    private void initDns() {
        List<String> backUpUrls;
        int ipStrategy = this.strategy.getIpStrategy();
        if (ipStrategy <= 0) {
            this.needWaitDnsResolve = false;
            dispatchReadThread();
            return;
        }
        DownloadDnsManager downloadDnsManager = DownloadDnsManager.getInstance();
        downloadDnsManager.resolveDnsAsync(this.downloadInfo.getUrl(), this, 2000L);
        if (ipStrategy <= 2 || (backUpUrls = this.downloadInfo.getBackUpUrls()) == null) {
            return;
        }
        for (String str : backUpUrls) {
            if (!TextUtils.isEmpty(str)) {
                downloadDnsManager.resolveDnsAsync(str, this, 2000L);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00bf A[Catch: all -> 0x00e1, TryCatch #0 {, blocks: (B:8:0x0039, B:10:0x0041, B:13:0x0048, B:14:0x004c, B:16:0x0052, B:18:0x0063, B:19:0x00b9, B:21:0x00bf, B:22:0x00df, B:26:0x006e, B:33:0x0087, B:34:0x00af), top: B:7:0x0039 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void initSegments(java.util.List<com.ss.android.socialbase.downloader.segment.Segment> r10) {
        /*
            r9 = this;
            com.ss.android.socialbase.downloader.model.DownloadInfo r0 = r9.downloadInfo
            long r0 = r0.getTotalBytes()
            r9.totalLength = r0
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 > 0) goto L38
            com.ss.android.socialbase.downloader.model.DownloadInfo r0 = r9.downloadInfo
            long r0 = r0.getExpectFileLength()
            r9.totalLength = r0
            boolean r0 = com.ss.android.socialbase.downloader.logger.Logger.debug()
            if (r0 == 0) goto L38
            java.lang.String r0 = "SegmentDispatcher"
            com.ss.android.socialbase.downloader.model.DownloadInfo r1 = r9.downloadInfo
            int r1 = r1.getId()
            java.lang.String r4 = "initSegments"
            java.lang.String r5 = "GetExpectFileLength: "
            java.lang.StringBuilder r5 = e.a.a.a.a.M(r5)
            long r6 = r9.totalLength
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            com.ss.android.socialbase.downloader.logger.Logger.taskDebug(r0, r1, r4, r5)
        L38:
            monitor-enter(r9)
            java.util.LinkedList<com.ss.android.socialbase.downloader.segment.Segment> r0 = r9.toDispatchSegments     // Catch: java.lang.Throwable -> Le1
            r0.clear()     // Catch: java.lang.Throwable -> Le1
            r0 = 0
            if (r10 == 0) goto L6e
            boolean r1 = r10.isEmpty()     // Catch: java.lang.Throwable -> Le1
            if (r1 == 0) goto L48
            goto L6e
        L48:
            java.util.Iterator r10 = r10.iterator()     // Catch: java.lang.Throwable -> Le1
        L4c:
            boolean r1 = r10.hasNext()     // Catch: java.lang.Throwable -> Le1
            if (r1 == 0) goto L63
            java.lang.Object r1 = r10.next()     // Catch: java.lang.Throwable -> Le1
            com.ss.android.socialbase.downloader.segment.Segment r1 = (com.ss.android.socialbase.downloader.segment.Segment) r1     // Catch: java.lang.Throwable -> Le1
            java.util.LinkedList<com.ss.android.socialbase.downloader.segment.Segment> r2 = r9.toDispatchSegments     // Catch: java.lang.Throwable -> Le1
            com.ss.android.socialbase.downloader.segment.Segment r3 = new com.ss.android.socialbase.downloader.segment.Segment     // Catch: java.lang.Throwable -> Le1
            r3.<init>(r1)     // Catch: java.lang.Throwable -> Le1
            r9.arrangeSegmentLocked(r2, r3, r0)     // Catch: java.lang.Throwable -> Le1
            goto L4c
        L63:
            java.util.LinkedList<com.ss.android.socialbase.downloader.segment.Segment> r10 = r9.toDispatchSegments     // Catch: java.lang.Throwable -> Le1
            r9.fixSegmentsLocked(r10)     // Catch: java.lang.Throwable -> Le1
            java.util.LinkedList<com.ss.android.socialbase.downloader.segment.Segment> r10 = r9.toDispatchSegments     // Catch: java.lang.Throwable -> Le1
            r9.checkDownloadedBytesLocked(r10)     // Catch: java.lang.Throwable -> Le1
            goto Lb9
        L6e:
            com.ss.android.socialbase.downloader.model.DownloadInfo r10 = r9.downloadInfo     // Catch: java.lang.Throwable -> Le1
            long r4 = r10.getStartOffset()     // Catch: java.lang.Throwable -> Le1
            com.ss.android.socialbase.downloader.model.DownloadInfo r10 = r9.downloadInfo     // Catch: java.lang.Throwable -> Le1
            long r6 = r10.getEndOffset()     // Catch: java.lang.Throwable -> Le1
            int r10 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r10 >= 0) goto L7f
            r4 = r2
        L7f:
            int r10 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r10 <= 0) goto Laf
            int r10 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r10 >= 0) goto Laf
            java.lang.String r10 = "SegmentDispatcher"
            com.ss.android.socialbase.downloader.model.DownloadInfo r1 = r9.downloadInfo     // Catch: java.lang.Throwable -> Le1
            int r1 = r1.getId()     // Catch: java.lang.Throwable -> Le1
            java.lang.String r2 = "initSegments"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Le1
            r3.<init>()     // Catch: java.lang.Throwable -> Le1
            java.lang.String r8 = "DownloadInfo.getEndOffset invalid, start = "
            r3.append(r8)     // Catch: java.lang.Throwable -> Le1
            r3.append(r4)     // Catch: java.lang.Throwable -> Le1
            java.lang.String r8 = ", end = "
            r3.append(r8)     // Catch: java.lang.Throwable -> Le1
            r3.append(r6)     // Catch: java.lang.Throwable -> Le1
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> Le1
            com.ss.android.socialbase.downloader.logger.Logger.taskError(r10, r1, r2, r3)     // Catch: java.lang.Throwable -> Le1
            r6 = -1
        Laf:
            java.util.LinkedList<com.ss.android.socialbase.downloader.segment.Segment> r10 = r9.toDispatchSegments     // Catch: java.lang.Throwable -> Le1
            com.ss.android.socialbase.downloader.segment.Segment r1 = new com.ss.android.socialbase.downloader.segment.Segment     // Catch: java.lang.Throwable -> Le1
            r1.<init>(r4, r6)     // Catch: java.lang.Throwable -> Le1
            r9.arrangeSegmentLocked(r10, r1, r0)     // Catch: java.lang.Throwable -> Le1
        Lb9:
            boolean r10 = com.ss.android.socialbase.downloader.logger.Logger.debug()     // Catch: java.lang.Throwable -> Le1
            if (r10 == 0) goto Ldf
            java.lang.String r10 = "SegmentDispatcher"
            com.ss.android.socialbase.downloader.model.DownloadInfo r0 = r9.downloadInfo     // Catch: java.lang.Throwable -> Le1
            int r0 = r0.getId()     // Catch: java.lang.Throwable -> Le1
            java.lang.String r1 = "initSegments"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Le1
            r2.<init>()     // Catch: java.lang.Throwable -> Le1
            java.lang.String r3 = "TotalLength: "
            r2.append(r3)     // Catch: java.lang.Throwable -> Le1
            long r3 = r9.totalLength     // Catch: java.lang.Throwable -> Le1
            r2.append(r3)     // Catch: java.lang.Throwable -> Le1
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> Le1
            com.ss.android.socialbase.downloader.logger.Logger.taskDebug(r10, r0, r1, r2)     // Catch: java.lang.Throwable -> Le1
        Ldf:
            monitor-exit(r9)     // Catch: java.lang.Throwable -> Le1
            return
        Le1:
            r10 = move-exception
            monitor-exit(r9)     // Catch: java.lang.Throwable -> Le1
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.downloader.segment.SegmentDispatcher.initSegments(java.util.List):void");
    }

    private void initUrlRecords() {
        this.urlRecords.add(new UrlRecord(this.downloadInfo.getUrl(), true));
        List<String> backUpUrls = this.downloadInfo.getBackUpUrls();
        if (backUpUrls != null) {
            for (String str : backUpUrls) {
                if (!TextUtils.isEmpty(str)) {
                    this.urlRecords.add(new UrlRecord(str, false));
                }
            }
        }
        this.strategy.updateUrlCount(this.urlRecords.size());
    }

    private void initWatchDog() {
        SegmentStrategy segmentStrategy = this.strategy;
        this.connectTimeout = segmentStrategy.getConnectTimeout();
        this.readTimeout = segmentStrategy.getReadTimeout();
        this.poorSpeedRatio = segmentStrategy.getPoorSpeedRatio();
        int i = this.reconnectCount;
        if (i > 0) {
            this.watchDog.addWatcher(this.connectWatcher, i);
        }
    }

    private void initWatchDog2() {
        if (this.readTimeout > 0) {
            this.lastReconnectTime = System.currentTimeMillis();
            this.watchDog.addWatcher(this.readWatcher, 0L);
        }
    }

    private boolean isAllContentDownloaded() {
        long j = this.totalLength;
        if (j <= 0) {
            this.isAllContentDownloaded = false;
            return false;
        }
        synchronized (this) {
            long firstOffset = SegmentUtils.getFirstOffset(this.dispatchedSegments);
            if (Logger.debug()) {
                Logger.taskDebug(TAG, this.downloadInfo.getId(), "isAllContentDownloaded", "FirstOffset: " + firstOffset);
            }
            if (firstOffset >= j) {
                this.isAllContentDownloaded = true;
                return true;
            }
            this.isAllContentDownloaded = false;
            return false;
        }
    }

    private boolean isAllReaderFailedLocked() {
        Iterator<SegmentReader> it2 = this.readers.iterator();
        while (it2.hasNext()) {
            if (!it2.next().isFailed()) {
                return false;
            }
        }
        return true;
    }

    private boolean isDownloadSpeedPoor(SegmentReader segmentReader, long j, long j2, long j3, double d2) {
        if (segmentReader.readStartTime <= 0) {
            return false;
        }
        long recentDownloadSpeed = this.stenographer.getRecentDownloadSpeed(j, j2);
        int size = this.readers.size();
        long j4 = size > 0 ? recentDownloadSpeed / size : recentDownloadSpeed;
        long recentDownloadSpeed2 = segmentReader.getRecentDownloadSpeed(j, j2);
        if (recentDownloadSpeed2 >= j3 && recentDownloadSpeed2 >= j4 * d2) {
            return false;
        }
        if (!Logger.debug()) {
            return true;
        }
        int id = this.downloadInfo.getId();
        StringBuilder Q = a.Q("TotalSpeed = ", recentDownloadSpeed, ", threadAvgSpeed = ");
        Q.append(j4);
        Q.append(", poorSpeed = ");
        Q.append(j3);
        Q.append(", speed = ");
        Q.append(recentDownloadSpeed2);
        Q.append(",threadIndex = ");
        a.E0(Q, segmentReader.threadIndex, TAG, id, "isDownloadSpeedPoor");
        return true;
    }

    private void markProgress(long j) {
        this.stenographer.markProgress(this.downloadInfo.getCurBytes(), j);
        Iterator<SegmentReader> it2 = this.readers.iterator();
        while (it2.hasNext()) {
            it2.next().markProgress(j);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.ss.android.socialbase.downloader.segment.Segment obtainChildSegmentFromMaxRemain(com.ss.android.socialbase.downloader.segment.SegmentReader r31, com.ss.android.socialbase.downloader.segment.UrlRecord r32) {
        /*
            Method dump skipped, instructions count: 519
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.downloader.segment.SegmentDispatcher.obtainChildSegmentFromMaxRemain(com.ss.android.socialbase.downloader.segment.SegmentReader, com.ss.android.socialbase.downloader.segment.UrlRecord):com.ss.android.socialbase.downloader.segment.Segment");
    }

    private Segment obtainLeastCompetitorSegment() {
        int competitor;
        Segment segment = null;
        int i = Integer.MAX_VALUE;
        for (Segment segment2 : this.dispatchedSegments) {
            if (getRemainReadBytes(segment2) > 0 && (competitor = segment2.getCompetitor()) < i) {
                segment = segment2;
                i = competitor;
            }
        }
        return segment;
    }

    private Segment obtainSegmentLocked(SegmentReader segmentReader, UrlRecord urlRecord) {
        while (!this.toDispatchSegments.isEmpty()) {
            Segment poll = this.toDispatchSegments.poll();
            if (poll != null) {
                arrangeSegmentLocked(this.dispatchedSegments, poll, true);
                if (getRemainReadBytes(poll) > 0 || this.totalLength <= 0) {
                    return poll;
                }
            }
        }
        clearCoveredSegmentLocked();
        Segment obtainChildSegmentFromMaxRemain = obtainChildSegmentFromMaxRemain(segmentReader, urlRecord);
        if (obtainChildSegmentFromMaxRemain != null && getRemainReadBytes(obtainChildSegmentFromMaxRemain) > 0) {
            arrangeSegmentLocked(this.dispatchedSegments, obtainChildSegmentFromMaxRemain, true);
            return obtainChildSegmentFromMaxRemain;
        }
        Segment obtainSegmentWhenNoNewSegment = obtainSegmentWhenNoNewSegment();
        if (obtainSegmentWhenNoNewSegment != null) {
            return obtainSegmentWhenNoNewSegment;
        }
        return null;
    }

    private Segment obtainSegmentWhenNoNewSegment() {
        int i = 0;
        while (true) {
            Segment obtainLeastCompetitorSegment = obtainLeastCompetitorSegment();
            if (obtainLeastCompetitorSegment == null) {
                return null;
            }
            SegmentReader segmentReader = obtainLeastCompetitorSegment.owner;
            if (segmentReader == null) {
                return obtainLeastCompetitorSegment;
            }
            if (obtainLeastCompetitorSegment.getCompetitor() >= 2) {
                return null;
            }
            long currentTimeMillis = System.currentTimeMillis();
            markProgress(currentTimeMillis);
            if (currentTimeMillis - segmentReader.readStartTime > 2000 && isDownloadSpeedPoor(segmentReader, currentTimeMillis - 2000, currentTimeMillis, 500L, 1.0d)) {
                if (this.debug && Logger.debug()) {
                    int id = this.downloadInfo.getId();
                    StringBuilder sb = new StringBuilder();
                    sb.append("IsDownloadSpeedPoor segment = ");
                    sb.append(obtainLeastCompetitorSegment);
                    sb.append(", owner.threadIndex = ");
                    a.E0(sb, segmentReader.threadIndex, TAG, id, "obtainSegmentWhenNoNewSegment");
                }
                return obtainLeastCompetitorSegment;
            }
            int i2 = i + 1;
            if (i > 2) {
                if (this.debug && Logger.debug()) {
                    Logger.taskDebug(TAG, this.downloadInfo.getId(), "obtainSegmentWhenNoNewSegment", "WaitCount > 2, return segment = " + obtainLeastCompetitorSegment);
                }
                return obtainLeastCompetitorSegment;
            }
            try {
                synchronized (this) {
                    wait(500L);
                }
                i = i2;
            } catch (InterruptedException unused) {
                return null;
            }
        }
    }

    private UrlRecord obtainUrl() {
        UrlRecord urlRecord;
        synchronized (this) {
            int size = this.urlIndex % this.urlRecords.size();
            if (this.strategy.urlBalance()) {
                this.urlIndex++;
            }
            urlRecord = this.urlRecords.get(size);
        }
        return urlRecord;
    }

    private void onComplete() {
        if (Logger.debug()) {
            Logger.taskDebug(TAG, this.downloadInfo.getId(), "onComplete", "Run");
        }
        this.bufferQueue.close();
        synchronized (this.firstConnectionLock) {
            this.firstConnectionLock.notify();
        }
    }

    private void onError(BaseException baseException) {
        Logger.taskError(TAG, this.downloadInfo.getId(), "onError", "Exception: " + baseException);
        this.failedException = baseException;
        this.bufferQueue.close();
        synchronized (this) {
            Iterator<SegmentReader> it2 = this.readers.iterator();
            while (it2.hasNext()) {
                it2.next().close();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long scheduleWatchRead() {
        if (this.canceled || this.paused) {
            return -1L;
        }
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (this) {
            markProgress(currentTimeMillis);
            long readTimeout = this.strategy.getReadTimeout();
            if (readTimeout > 0) {
                long j = this.lastReconnectTime;
                if (j > 0 && currentTimeMillis - j > readTimeout && findPoorReadThreadAndReconnect(currentTimeMillis, readTimeout)) {
                    this.lastReconnectTime = currentTimeMillis;
                    this.reconnectCount++;
                }
            }
        }
        return 2000L;
    }

    private void switchToNextUrl() {
        synchronized (this) {
            this.urlIndex++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean trySwitchNextUrlForReader(SegmentReader segmentReader) {
        synchronized (this) {
            UrlRecord findNextUrlLocked = findNextUrlLocked(segmentReader);
            if (findNextUrlLocked == null) {
                return false;
            }
            return segmentReader.switchUrlRecord(findNextUrlLocked);
        }
    }

    private void validateHttpResponse(HttpResponse httpResponse) throws BaseException {
        HttpResponse httpResponse2 = this.mainUrlHttpResponse;
        if (httpResponse2 == null && (httpResponse2 = this.firstBackupUrlHttpResponse) == null) {
            return;
        }
        long totalLength = httpResponse.getTotalLength();
        long totalLength2 = httpResponse2.getTotalLength();
        if (totalLength != totalLength2) {
            StringBuilder Q = a.Q("Total len not equals,len=", totalLength, ",sLen=");
            Q.append(totalLength2);
            Q.append(",code=");
            Q.append(httpResponse.responseCode);
            Q.append(",sCode=");
            Q.append(httpResponse2.responseCode);
            Q.append(",range=");
            Q.append(httpResponse.getContentRange());
            Q.append(",sRange = ");
            Q.append(httpResponse2.getContentRange());
            Q.append(",url = ");
            Q.append(httpResponse.url);
            Q.append(",sUrl=");
            Q.append(httpResponse2.url);
            String sb = Q.toString();
            Logger.taskError(TAG, this.downloadInfo.getId(), "validateHttpResponse", sb);
            if (totalLength > 0 && totalLength2 > 0) {
                throw new BaseException(DownloadErrorCode.ERROR_BAD_URL, sb);
            }
        }
        String etag = httpResponse.getEtag();
        String etag2 = httpResponse2.getEtag();
        if (TextUtils.equals(etag, etag2)) {
            return;
        }
        String u = a.u("Etag not equals with main url, etag = ", etag, ", mainEtag = ", etag2);
        Logger.taskError(TAG, this.downloadInfo.getId(), "validateHttpResponse", u);
        if (!TextUtils.isEmpty(etag) && !TextUtils.isEmpty(etag2) && !etag.equalsIgnoreCase(etag2)) {
            throw new BaseException(DownloadErrorCode.ERROR_BAD_URL, u);
        }
    }

    private void waitFirstConnection() throws BaseException, InterruptedException {
        BaseException baseException;
        synchronized (this.firstConnectionLock) {
            if (this.mainUrlHttpResponse == null && this.firstBackupUrlHttpResponse == null) {
                this.firstConnectionLock.wait();
            }
        }
        if (this.mainUrlHttpResponse == null && this.firstBackupUrlHttpResponse == null && (baseException = this.failedException) != null) {
            throw baseException;
        }
    }

    private void writeSegments() throws BaseException {
        try {
            this.writer.loopAndWrite(this.bufferQueue);
        } catch (StreamClosedException unused) {
        } catch (BaseException e2) {
            Logger.taskError(TAG, this.downloadInfo.getId(), "writeSegments", "DispatchSegments: loopAndWrite e = " + e2);
            onError(e2);
            throw e2;
        }
        if (this.paused || this.canceled) {
            return;
        }
        try {
            synchronized (this) {
                while (!this.toDispatchSegments.isEmpty()) {
                    Segment poll = this.toDispatchSegments.poll();
                    if (poll != null) {
                        arrangeSegmentLocked(this.dispatchedSegments, poll, true);
                    }
                }
                checkDownloadedBytesLocked(this.dispatchedSegments);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        if (this.allReaderFailed && this.failedException != null) {
            int id = this.downloadInfo.getId();
            StringBuilder M = a.M("DispatchSegments: failedException = ");
            M.append(this.failedException);
            Logger.taskError(TAG, id, "writeSegments", M.toString());
            throw this.failedException;
        }
        if (this.downloadInfo.getCurBytes() != this.downloadInfo.getTotalBytes()) {
            DownloadMonitorHelper.monitorSegmentsError(this.downloadInfo, this.dispatchedSegments);
        }
        if (Logger.debug()) {
            Logger.taskDebug(TAG, this.downloadInfo.getId(), "writeSegments", "DispatchSegments::download finished");
        }
    }

    @Override // com.ss.android.socialbase.downloader.segment.ISegmentCallback
    public void applySegment(SegmentReader segmentReader, Segment segment) throws BaseException {
        synchronized (this) {
            applySegmentLocked(segmentReader, segment);
        }
    }

    public void cancel() {
        if (Logger.debug()) {
            Logger.taskDebug(TAG, this.downloadInfo.getId(), "cancel", "Run");
        }
        this.canceled = true;
        synchronized (this) {
            Iterator<SegmentReader> it2 = this.readers.iterator();
            while (it2.hasNext()) {
                it2.next().close();
            }
        }
        this.writer.cancel();
        this.bufferQueue.close();
    }

    @Override // com.ss.android.socialbase.downloader.segment.ISegmentCallback
    public IOutput createOutput(SegmentReader segmentReader, Segment segment) throws BaseException {
        IOutput stub;
        synchronized (this) {
            SegmentOutput segmentOutput = new SegmentOutput(this.downloadInfo, this.bufferQueue, segment);
            this.writer.assignOutput(segmentOutput);
            stub = segmentOutput.getStub();
        }
        return stub;
    }

    public boolean downloadSegments(List<Segment> list) throws BaseException, InterruptedException {
        try {
            initUrlRecords();
            initSegments(list);
            dispatchReadThread();
            initWatchDog();
            initDns();
            long currentTimeMillis = System.currentTimeMillis();
            try {
                waitFirstConnection();
                long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                this.downloadInfo.increaseAllConnectTime(currentTimeMillis2);
                this.downloadInfo.setFirstSpeedTime(currentTimeMillis2);
                if (!this.paused && !this.canceled) {
                    initWatchDog2();
                    writeSegments();
                    return true;
                }
                if (!this.paused && !this.canceled) {
                    if (Logger.debug()) {
                        Logger.taskDebug(TAG, this.downloadInfo.getId(), "downloadSegments", "Finally pause");
                    }
                    pause();
                }
                this.watchDog.release();
                return true;
            } catch (Throwable th) {
                long currentTimeMillis3 = System.currentTimeMillis() - currentTimeMillis;
                this.downloadInfo.increaseAllConnectTime(currentTimeMillis3);
                this.downloadInfo.setFirstSpeedTime(currentTimeMillis3);
                throw th;
            }
        } finally {
            if (!this.paused && !this.canceled) {
                if (Logger.debug()) {
                    Logger.taskDebug(TAG, this.downloadInfo.getId(), "downloadSegments", "Finally pause");
                }
                pause();
            }
            this.watchDog.release();
        }
    }

    @Override // com.ss.android.socialbase.downloader.segment.ISegmentCallback
    public Segment obtainSegment(SegmentReader segmentReader, UrlRecord urlRecord) {
        if (this.canceled || this.paused) {
            return null;
        }
        synchronized (this) {
            Segment obtainSegmentLocked = obtainSegmentLocked(segmentReader, urlRecord);
            if (obtainSegmentLocked != null) {
                obtainSegmentLocked.increaseCompetitor();
                if (obtainSegmentLocked.getCompetitor() > 1) {
                    return new Segment(obtainSegmentLocked);
                }
            }
            return obtainSegmentLocked;
        }
    }

    @Override // com.ss.android.socialbase.downloader.network.DownloadDnsManager.Callback
    public void onDnsResolved(String str, List<InetAddress> list) {
        if (this.paused || this.canceled) {
            return;
        }
        List<UrlRecord> list2 = null;
        try {
            list2 = assembleIpAddress(str, list);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        synchronized (this) {
            if (list2 != null) {
                addIpListLocked(str, list2);
            }
            this.needWaitDnsResolve = false;
            this.strategy.updateUrlCount(this.urlRecords.size());
            if (Logger.debug()) {
                Logger.taskDebug(TAG, this.downloadInfo.getId(), "onDnsResolved", "DispatchReadThread");
            }
            dispatchReadThread();
        }
    }

    @Override // com.ss.android.socialbase.downloader.segment.ISegmentCallback
    public void onReaderExit(SegmentReader segmentReader) {
        if (Logger.debug()) {
            a.E0(a.M("ThreadIndex = "), segmentReader.threadIndex, TAG, this.downloadInfo.getId(), "onReaderExit");
        }
        synchronized (this) {
            segmentReader.setExited(true);
            this.readers.remove(segmentReader);
            clearCoveredSegmentLocked();
            if (this.readers.isEmpty()) {
                onComplete();
            } else if (isAllContentDownloaded()) {
                if (Logger.debug()) {
                    Logger.taskDebug(TAG, this.downloadInfo.getId(), "onReaderExit", "allContentDownloaded");
                }
                Iterator<SegmentReader> it2 = this.readers.iterator();
                while (it2.hasNext()) {
                    it2.next().close();
                }
                onComplete();
            }
        }
    }

    @Override // com.ss.android.socialbase.downloader.segment.ISegmentCallback
    public void onReaderRun(SegmentReader segmentReader) {
        if (this.debug && Logger.debug()) {
            a.E0(a.M("ThreadIndex = "), segmentReader.threadIndex, TAG, this.downloadInfo.getId(), "onReaderRun");
        }
    }

    @Override // com.ss.android.socialbase.downloader.segment.ISegmentCallback
    public void onSegmentConnected(SegmentReader segmentReader, Segment segment, UrlRecord urlRecord, HttpResponse httpResponse) throws BaseException {
        synchronized (this) {
            if (this.canceled || this.paused) {
                throw new StreamClosedException("connected");
            }
            checkSegmentHttpResponseLocked(segmentReader, segment, urlRecord, httpResponse);
            segmentReader.setFailed(false);
            if (this.totalLength <= 0) {
                long totalBytes = this.downloadInfo.getTotalBytes();
                this.totalLength = totalBytes;
                if (totalBytes <= 0) {
                    this.totalLength = httpResponse.getTotalLength();
                }
                dispatchReadThread();
            } else if (this.strategy.segmentOneByOne()) {
                dispatchReadThread();
            }
        }
    }

    @Override // com.ss.android.socialbase.downloader.segment.ISegmentCallback
    public void onSegmentFailed(SegmentReader segmentReader, UrlRecord urlRecord, Segment segment, BaseException baseException) {
        synchronized (this) {
            Logger.taskError(TAG, this.downloadInfo.getId(), "onSegmentFailed", "Segment: " + segment + " e:" + baseException);
            segmentReader.setFailed(true);
            if (segmentReader.threadIndex == 0) {
                this.failedException = baseException;
            }
            if (isAllReaderFailedLocked()) {
                if (this.failedException == null) {
                    this.failedException = baseException;
                }
                this.allReaderFailed = true;
                onError(this.failedException);
            }
        }
    }

    @Override // com.ss.android.socialbase.downloader.segment.ISegmentCallback
    public boolean onSegmentRetry(SegmentReader segmentReader, UrlRecord urlRecord, Segment segment, BaseException baseException, int i, int i2) {
        int errorCode = baseException.getErrorCode();
        if (errorCode == 1083) {
            onError(baseException);
            return false;
        }
        boolean z = errorCode == 1047 || errorCode == 1074 || errorCode == 1055;
        if (DownloadHelper.isResponseCodeError(baseException)) {
            z = true;
        }
        if (z || i >= i2) {
            trySwitchNextUrlForReader(segmentReader);
        }
        return true;
    }

    public void pause() {
        if (Logger.debug()) {
            Logger.taskDebug(TAG, this.downloadInfo.getId(), "pause", "Run");
        }
        this.paused = true;
        synchronized (this) {
            Iterator<SegmentReader> it2 = this.readers.iterator();
            while (it2.hasNext()) {
                it2.next().close();
            }
        }
        this.writer.pause();
        this.bufferQueue.close();
    }

    @Override // com.ss.android.socialbase.downloader.segment.ISegmentCallback
    public void unApplySegment(SegmentReader segmentReader, Segment segment) {
        synchronized (this) {
            if (segment.owner == segmentReader) {
                if (Logger.debug()) {
                    Logger.taskDebug(TAG, this.downloadInfo.getId(), "unApplySegment", "Segment: " + segment);
                }
                segment.setCurrentOffsetRead(segmentReader.getCurSegmentReadOffset());
                segment.owner = null;
                segmentReader.updateReadBytes();
            }
        }
    }

    @Override // com.ss.android.socialbase.downloader.segment.ISegmentCallback
    public void unObtainSegment(SegmentReader segmentReader, Segment segment) {
        synchronized (this) {
            segment.decreaseCompetitor();
        }
    }
}
