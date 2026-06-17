package com.ss.android.socialbase.downloader.segment;

import android.os.Process;
import android.text.TextUtils;
import androidx.core.location.LocationRequestCompat;
import com.ss.android.socialbase.downloader.constants.DownloadErrorCode;
import com.ss.android.socialbase.downloader.downloader.NetworkFailoverStrategy;
import com.ss.android.socialbase.downloader.downloader.NetworkRetryStrategy;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.logger.Logger;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import com.ss.android.socialbase.downloader.model.HttpResponse;
import com.ss.android.socialbase.downloader.network.IDownloadHttpConnection;
import com.ss.android.socialbase.downloader.setting.DownloadSetting;
import com.ss.android.socialbase.downloader.utils.DownloadHelper;
import com.ss.android.socialbase.downloader.utils.DownloadStenographer;
import e.a.a.a.a;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;

/* loaded from: classes2.dex */
class SegmentReader implements Runnable {
    private static final int SEGMENT_APPLY_RETRY_MAX_COUNT = 50;
    private static final int SWITCH_URL_MAX_COUNT = 30;
    private static final String TAG = "SegmentReader";
    private volatile boolean changeSegment;
    private volatile boolean closed;
    volatile long connectEndTime;
    volatile long connectStartTime;
    String curHostIp;
    String curHostRealIp;
    private int curRetryCount;
    volatile Segment curSegment;
    String curUrl;
    private final DownloadInfo downloadInfo;
    private final DownloadTask downloadTask;
    private volatile long endOffsetInConnection;
    private boolean exited;
    private boolean failed;
    private BaseException failedException;
    private NetworkFailoverStrategy failoverStrategy;
    private Future future;
    private final ISegmentCallback host;
    private IDownloadHttpConnection httpConnection;
    private HttpResponse httpResponse;
    private boolean httpsToHttpRetryUsed;
    private long lastConnectStartTime;
    private final IBufferPool pool;
    private volatile long readBytes;
    volatile long readEndTime;
    volatile long readStartTime;
    private volatile boolean reconnect;
    private int retryCount;
    private NetworkRetryStrategy retryStrategy;
    private int segmentApplyRetryTimes;
    private volatile long segmentNewEndOffset;
    private final DownloadSetting setting;
    private long startOffsetInConnection;
    private DownloadStenographer stenographer;
    private int switchUrlTimes;
    private Thread thread;
    private volatile boolean threadDirty;
    final int threadIndex;
    UrlRecord urlRecord;
    private final List<Segment> succeedSegments = new ArrayList();
    private volatile long curSegmentReadOffset = -1;

    SegmentReader(DownloadTask downloadTask, DownloadInfo downloadInfo, SegmentDispatcher segmentDispatcher, IBufferPool iBufferPool, UrlRecord urlRecord, int i) {
        this.downloadTask = downloadTask;
        this.downloadInfo = downloadInfo;
        this.host = segmentDispatcher;
        this.pool = iBufferPool;
        this.setting = DownloadSetting.obtain(downloadInfo.getId());
        this.urlRecord = urlRecord;
        this.threadIndex = i;
        this.retryStrategy = new NetworkRetryStrategy(downloadInfo);
        this.failoverStrategy = new NetworkFailoverStrategy(downloadInfo);
    }

    private boolean checkCanUseHttpsToHttpRetry(BaseException baseException) {
        if (!DownloadHelper.isHttpsError(baseException)) {
            return false;
        }
        String str = this.urlRecord.url;
        if (TextUtils.isEmpty(str) || !str.startsWith("https") || !this.downloadInfo.isNeedHttpsToHttpRetry() || this.httpsToHttpRetryUsed) {
            return false;
        }
        this.httpsToHttpRetryUsed = true;
        resetRetryTimes();
        return true;
    }

    private void closeConnection() {
        IDownloadHttpConnection iDownloadHttpConnection = this.httpConnection;
        if (iDownloadHttpConnection != null) {
            try {
                if (Logger.debug()) {
                    Logger.taskDebug(TAG, this.downloadInfo.getId(), "closeConnection", "Thread: " + this.threadIndex);
                }
                iDownloadHttpConnection.end();
                iDownloadHttpConnection.cancel();
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX WARN: Not initialized variable reg: 4, insn: 0x020c: INVOKE 
      (r8v2 ?? I:java.lang.String)
      (r4 I:com.ss.android.socialbase.downloader.network.IDownloadHttpConnection)
      (r2 I:java.lang.Throwable)
      (r3 I:com.ss.android.socialbase.downloader.depend.IDownloadCdnListener)
     STATIC call: com.ss.android.socialbase.downloader.monitor.DownloadMonitorHelper.monitorDownloadCDN(java.lang.String, com.ss.android.socialbase.downloader.network.IDownloadHttpConnection, java.lang.Throwable, com.ss.android.socialbase.downloader.depend.IDownloadCdnListener):void A[MD:(java.lang.String, com.ss.android.socialbase.downloader.network.IDownloadHttpConnection, java.lang.Throwable, com.ss.android.socialbase.downloader.depend.IDownloadCdnListener):void (m)], block:B:93:0x0200 */
    /* JADX WARN: Not initialized variable reg: 8, insn: 0x020c: INVOKE 
      (r8 I:java.lang.String)
      (r4 I:com.ss.android.socialbase.downloader.network.IDownloadHttpConnection)
      (r2 I:java.lang.Throwable)
      (r3 I:com.ss.android.socialbase.downloader.depend.IDownloadCdnListener)
     STATIC call: com.ss.android.socialbase.downloader.monitor.DownloadMonitorHelper.monitorDownloadCDN(java.lang.String, com.ss.android.socialbase.downloader.network.IDownloadHttpConnection, java.lang.Throwable, com.ss.android.socialbase.downloader.depend.IDownloadCdnListener):void A[MD:(java.lang.String, com.ss.android.socialbase.downloader.network.IDownloadHttpConnection, java.lang.Throwable, com.ss.android.socialbase.downloader.depend.IDownloadCdnListener):void (m)], block:B:93:0x0200 */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0157 A[Catch: all -> 0x01be, BaseException -> 0x01c2, TRY_ENTER, TryCatch #11 {BaseException -> 0x01c2, all -> 0x01be, blocks: (B:34:0x0157, B:36:0x0164, B:38:0x0168, B:39:0x0171, B:41:0x0177, B:44:0x01b8, B:45:0x01bd, B:46:0x01c6, B:47:0x01d4), top: B:32:0x0155 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01c6 A[Catch: all -> 0x01be, BaseException -> 0x01c2, TryCatch #11 {BaseException -> 0x01c2, all -> 0x01be, blocks: (B:34:0x0157, B:36:0x0164, B:38:0x0168, B:39:0x0171, B:41:0x0177, B:44:0x01b8, B:45:0x01bd, B:46:0x01c6, B:47:0x01d4), top: B:32:0x0155 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void createConnection(com.ss.android.socialbase.downloader.segment.Segment r23) throws com.ss.android.socialbase.downloader.exception.BaseException {
        /*
            Method dump skipped, instructions count: 528
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.downloader.segment.SegmentReader.createConnection(com.ss.android.socialbase.downloader.segment.Segment):void");
    }

    private void doConnect(Segment segment) throws BaseException {
        createConnection(segment);
        this.host.onSegmentConnected(this, segment, this.urlRecord, this.httpResponse);
        this.urlRecord.recordSucceed();
    }

    private boolean download(Segment segment) throws BaseException {
        initParams();
        while (true) {
            try {
                doConnect(segment);
                loopAndRead(segment);
                return true;
            } catch (SegmentApplyException e2) {
                this.failedException = e2;
                throw e2;
            } catch (Throwable th) {
                try {
                    Logger.taskError(TAG, this.downloadInfo.getId(), "download", "e = " + th + ", threadIndex = " + this.threadIndex + ", reconnect = " + this.reconnect + ", closed = " + this.closed);
                    if (this.closed) {
                        return false;
                    }
                    if (this.reconnect) {
                        this.reconnect = false;
                        try {
                            Thread.interrupted();
                        } catch (Throwable th2) {
                            th2.printStackTrace();
                        }
                        if (this.changeSegment) {
                            this.changeSegment = false;
                            throw new SegmentApplyException(5, "download");
                        }
                    } else {
                        BaseException e3 = null;
                        if (th instanceof BaseException) {
                            e3 = th;
                        } else {
                            try {
                                DownloadHelper.parseException(th, "download");
                            } catch (BaseException e4) {
                                e3 = e4;
                            }
                        }
                        if (e3 == null || !handleFailedAndCheckRetry(segment, e3)) {
                            return false;
                        }
                    }
                } finally {
                    releaseDownload();
                }
            }
        }
    }

    private boolean handleFailedAndCheckRetry(Segment segment, BaseException baseException) {
        Logger.taskError(TAG, this.downloadInfo.getId(), "handleFailedAndCheckRetry", "Exception = " + baseException + ", curRetryCount = " + this.curRetryCount + ", retryCount = " + this.retryCount);
        this.failedException = baseException;
        this.urlRecord.recordFailed();
        if (!this.host.onSegmentRetry(this, this.urlRecord, segment, baseException, this.curRetryCount, this.retryCount)) {
            return false;
        }
        int i = this.curRetryCount;
        if (i < this.retryCount) {
            this.curRetryCount = i + 1;
            return true;
        }
        this.failoverStrategy.handleError(baseException);
        if (this.retryStrategy.canRetry(baseException)) {
            this.retryStrategy.doRetry();
            this.downloadInfo.setCurNetworkRetryCount(this.retryStrategy.getTotalRetryCount());
            return true;
        }
        if (checkCanUseHttpsToHttpRetry(baseException)) {
            return true;
        }
        this.host.onSegmentFailed(this, this.urlRecord, segment, baseException);
        return false;
    }

    private void initParams() {
        this.httpsToHttpRetryUsed = false;
        resetRetryTimes();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:207:0x0185
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    private void loopAndRead(com.ss.android.socialbase.downloader.segment.Segment r41) throws com.ss.android.socialbase.downloader.exception.BaseException {
        /*
            Method dump skipped, instructions count: 1144
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.downloader.segment.SegmentReader.loopAndRead(com.ss.android.socialbase.downloader.segment.Segment):void");
    }

    private Buffer probeFirstBuffer(IBufferPool iBufferPool, InputStream inputStream) throws InterruptedException, BaseException, IOException {
        int i;
        Buffer obtain = iBufferPool.obtain();
        try {
            i = inputStream.read(obtain.data);
        } catch (Throwable th) {
            th = th;
            i = -1;
        }
        try {
            if (i == -1) {
                throw new BaseException(DownloadErrorCode.ERROR_PROBE_FIRST_BUFFER, "probe");
            }
            obtain.size = i;
            if (i == -1) {
                iBufferPool.recycle(obtain);
            }
            return obtain;
        } catch (Throwable th2) {
            th = th2;
            if (i == -1) {
                iBufferPool.recycle(obtain);
            }
            throw th;
        }
    }

    private long refreshSegmentEndOffset() {
        long j = this.segmentNewEndOffset;
        this.segmentNewEndOffset = 0L;
        return j <= 0 ? LocationRequestCompat.PASSIVE_INTERVAL : j;
    }

    private void releaseDownload() {
        this.lastConnectStartTime = this.connectStartTime;
        this.connectStartTime = -1L;
        this.connectEndTime = -1L;
        this.readStartTime = -1L;
        this.readEndTime = -1L;
        closeConnection();
    }

    private void resetRetryTimes() {
        this.retryCount = this.urlRecord.isMainUrl ? this.downloadInfo.getRetryCount() : this.downloadInfo.getBackUpUrlRetryCount();
        this.curRetryCount = 0;
        this.retryStrategy.reset();
    }

    public boolean adjustSegmentEndOffset(long j) {
        long j2 = this.endOffsetInConnection;
        if (j <= 0 && j2 > 0) {
            return false;
        }
        if (j > j2 && j2 > 0) {
            return false;
        }
        this.segmentNewEndOffset = j;
        this.threadDirty = true;
        return true;
    }

    public void close() {
        if (Logger.debug()) {
            a.E0(a.M("ThreadIndex: "), this.threadIndex, TAG, this.downloadInfo.getId(), "close");
        }
        synchronized (this) {
            this.closed = true;
            this.threadDirty = true;
        }
        closeConnection();
        Future future = this.future;
        if (future != null) {
            this.future = null;
            try {
                future.cancel(true);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    int getCurRetryCount() {
        return this.curRetryCount;
    }

    long getCurSegmentDownloadSpeed(long j) {
        long j2 = this.readStartTime;
        if (j2 <= 0) {
            return -1L;
        }
        long j3 = j - j2;
        if (j3 <= 0) {
            return -1L;
        }
        long j4 = this.curSegmentReadOffset;
        long j5 = this.startOffsetInConnection;
        if (j5 < 0 || j4 < j5) {
            return 0L;
        }
        return (j4 - j5) / j3;
    }

    public long getCurSegmentReadOffset() {
        return this.curSegmentReadOffset;
    }

    BaseException getFailedException() {
        return this.failedException;
    }

    public long getReadBytes() {
        long readingBytes;
        synchronized (this.host) {
            readingBytes = this.readBytes + getReadingBytes();
        }
        return readingBytes;
    }

    public long getReadingBytes() {
        synchronized (this.host) {
            long j = this.curSegmentReadOffset;
            long j2 = this.startOffsetInConnection;
            if (j2 < 0 || j <= j2) {
                return 0L;
            }
            return j - j2;
        }
    }

    long getRecentDownloadSpeed(long j, long j2) {
        DownloadStenographer downloadStenographer = this.stenographer;
        if (downloadStenographer == null) {
            return -1L;
        }
        return downloadStenographer.getRecentDownloadSpeed(j, j2);
    }

    int getRetryCount() {
        return this.retryCount;
    }

    long getStartOffsetInConnection() {
        return this.startOffsetInConnection;
    }

    public boolean isExited() {
        return this.exited;
    }

    boolean isFailed() {
        return this.failed;
    }

    void markProgress(long j) {
        long j2 = this.curSegmentReadOffset;
        DownloadStenographer downloadStenographer = this.stenographer;
        if (j2 < 0 || downloadStenographer == null) {
            return;
        }
        if (Logger.debug()) {
            a.E0(a.Q("CurSegmentReadOffset = ", j2, ", threadIndex = "), this.threadIndex, TAG, this.downloadInfo.getId(), "markProgress");
        }
        downloadStenographer.markProgress(j2, j);
    }

    public void reconnect() {
        reconnect(false);
    }

    @Override // java.lang.Runnable
    public void run() {
        ISegmentCallback iSegmentCallback;
        Segment obtainSegment;
        ISegmentCallback iSegmentCallback2;
        ISegmentCallback iSegmentCallback3;
        Process.setThreadPriority(10);
        try {
            try {
                this.thread = Thread.currentThread();
                this.host.onReaderRun(this);
                this.urlRecord.recordUse(this);
                while (true) {
                    obtainSegment = this.host.obtainSegment(this, this.urlRecord);
                    if (obtainSegment != null) {
                        this.curSegment = obtainSegment;
                        try {
                            try {
                            } catch (SegmentApplyException e2) {
                                Logger.taskError(TAG, this.downloadInfo.getId(), "run", "SegmentApplyException, Exception = " + e2);
                                int i = this.segmentApplyRetryTimes;
                                if (i >= 50) {
                                    Logger.taskError(TAG, this.downloadInfo.getId(), "run", "Segment apply failed " + this.segmentApplyRetryTimes + "times, thread_index = " + this.threadIndex);
                                    this.curSegment = null;
                                    iSegmentCallback2 = this.host;
                                    break;
                                }
                                this.segmentApplyRetryTimes = i + 1;
                                this.curSegment = null;
                                iSegmentCallback3 = this.host;
                            }
                            if (!download(obtainSegment)) {
                                if (!this.closed) {
                                    Logger.taskError(TAG, this.downloadInfo.getId(), "run", "Download segment failed, segment = " + obtainSegment + ", thread_index = " + this.threadIndex + ", failedException = " + this.failedException);
                                    break;
                                }
                                break;
                            }
                            this.succeedSegments.add(obtainSegment);
                            this.curSegment = null;
                            iSegmentCallback3 = this.host;
                            iSegmentCallback3.unObtainSegment(this, obtainSegment);
                        } catch (Throwable th) {
                            this.curSegment = null;
                            this.host.unObtainSegment(this, obtainSegment);
                            throw th;
                        }
                    } else if (Logger.debug()) {
                        Logger.taskDebug(TAG, this.downloadInfo.getId(), "run", "No more segment, thread_index: " + this.threadIndex);
                    }
                }
                this.curSegment = null;
                iSegmentCallback2 = this.host;
                iSegmentCallback2.unObtainSegment(this, obtainSegment);
                this.urlRecord.recordUnUse(this);
                iSegmentCallback = this.host;
            } catch (Throwable th2) {
                try {
                    th2.printStackTrace();
                    this.urlRecord.recordUnUse(this);
                    iSegmentCallback = this.host;
                } catch (Throwable th3) {
                    try {
                        this.urlRecord.recordUnUse(this);
                        this.host.onReaderExit(this);
                    } catch (Throwable unused) {
                    }
                    this.thread = null;
                    throw th3;
                }
            }
            iSegmentCallback.onReaderExit(this);
        } catch (Throwable unused2) {
        }
        this.thread = null;
    }

    public void setExited(boolean z) {
        this.exited = z;
    }

    void setFailed(boolean z) {
        this.failed = z;
    }

    void setFuture(Future future) {
        this.future = future;
    }

    boolean switchUrlRecord(UrlRecord urlRecord) {
        int i = this.switchUrlTimes;
        if (i >= 30) {
            return false;
        }
        this.switchUrlTimes = i + 1;
        UrlRecord urlRecord2 = this.urlRecord;
        if (urlRecord2 != null) {
            urlRecord2.recordUnUse(this);
        }
        urlRecord.recordUse(this);
        this.urlRecord = urlRecord;
        resetRetryTimes();
        return true;
    }

    void updateReadBytes() {
        UrlRecord urlRecord = this.urlRecord;
        try {
            synchronized (this.host) {
                long readingBytes = getReadingBytes();
                if (readingBytes > 0) {
                    this.readBytes += readingBytes;
                    urlRecord.increaseDownloadBytes(readingBytes);
                }
                this.curSegmentReadOffset = -1L;
            }
        } catch (Throwable unused) {
        }
    }

    public void reconnect(boolean z) {
        if (Logger.debug()) {
            a.E0(a.M("ThreadIndex: "), this.threadIndex, TAG, this.downloadInfo.getId(), "reconnect");
        }
        synchronized (this) {
            this.changeSegment = z;
            this.reconnect = true;
            this.threadDirty = true;
        }
        closeConnection();
        Thread thread = this.thread;
        if (thread != null) {
            try {
                if (Logger.debug()) {
                    Logger.taskDebug(TAG, this.downloadInfo.getId(), "reconnect", "Interrupt ThreadIndex: " + this.threadIndex);
                }
                thread.interrupt();
            } catch (Throwable unused) {
            }
        }
    }
}
