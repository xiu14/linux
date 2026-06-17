package com.ss.android.socialbase.downloader.core.module.pcdn;

import com.ss.android.socialbase.downloader.constants.DownloadErrorCode;
import com.ss.android.socialbase.downloader.core.IDownloadModule;
import com.ss.android.socialbase.downloader.core.IDownloadModuleChain;
import com.ss.android.socialbase.downloader.core.module.BaseDownloadNetworkModule;
import com.ss.android.socialbase.downloader.core.module.DownloadCommonParams;
import com.ss.android.socialbase.downloader.core.module.pcdn.PCDNChunkRunnableModule;
import com.ss.android.socialbase.downloader.downloader.DownloadComponentManager;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.exception.DownloadFileExistException;
import com.ss.android.socialbase.downloader.exception.DownloadPCDNException;
import com.ss.android.socialbase.downloader.logger.Logger;
import com.ss.android.socialbase.downloader.network.IDownloadHttpConnection;
import com.ss.android.socialbase.downloader.setting.DownloadSettingKeys;
import com.ss.android.socialbase.downloader.utils.DownloadHelper;
import e.a.a.a.a;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class DownloadPCDNSegmentModule extends BaseDownloadNetworkModule implements PCDNChunkRunnableModule.IDownloadChunkCallback {
    private static final String TAG = "DownloadPCDNSegmentModule";
    private int mChunkRetryCount;
    private List<PCDNChunkRunnableModule> mChunkRunnables = new CopyOnWriteArrayList();
    private int mChunkThreadCount;
    private IDownloadHttpConnection mConnection;
    private Throwable mError;
    private long mMaxChunkLength;
    private PCDNBandwidthSampler mPcdnBandwidthSampler;
    private PCDNChunkAllocater mPcdnChunkAllocater;
    private PCDNChunkProgressManager mPcdnChunkProgressManager;
    private PCDNChunkUrlPolicy mPcdnChunkUrlPolicy;
    private long mPcdnDegradeBandWidthLimit;
    private int mPcdnDegradeSampleCount;
    private PCDNStats mPcdnStats;

    private void checkTotalSize() throws BaseException {
        if (Logger.debug()) {
            Logger.taskDebug(TAG, this.mDownloadInfo.getId(), "checkTotalSize", "Run");
        }
        long totalBytes = this.mDownloadInfo.getTotalBytes();
        if (totalBytes <= 0 || this.mCommonParams.mNeedCheckIfModified) {
            fetchTotalSize();
            totalBytes = this.mDownloadInfo.getTotalBytes();
        }
        if (totalBytes <= 0) {
            throw new BaseException(DownloadErrorCode.ERROR_PCDN_CONTENT_LENGTH_EMPTY, "pcdn content-length empty");
        }
        checkMaxBytes(totalBytes, this.mDownloadInfo.getMaxBytes());
        if (Logger.debug()) {
            Logger.taskDebug(TAG, this.mDownloadInfo.getId(), "checkTotalSize", a.n("TotalSize: ", totalBytes));
        }
    }

    private void doDownload() throws BaseException {
        Throwable th;
        long startOffset = this.mDownloadInfo.getStartOffset() + DownloadHelper.getFirstOffset(this.mDownloadInfo);
        int ceil = (int) Math.ceil(((this.mDownloadInfo.getTotalBytes() - startOffset) * 1.0d) / this.mMaxChunkLength);
        int i = this.mChunkThreadCount;
        if (ceil < i) {
            i = ceil;
        }
        if (Logger.debug()) {
            Logger.taskDebug(TAG, this.mDownloadInfo.getId(), "doDownload", "StartOffset:" + startOffset + " chunkCount:" + ceil + " threadCount:" + i);
        }
        for (int i2 = 0; i2 < i; i2++) {
            PCDNChunkRunnableModule pCDNChunkRunnableModule = new PCDNChunkRunnableModule(this.mPcdnChunkProgressManager, this.mPcdnChunkAllocater, this.mPcdnBandwidthSampler, this.mPcdnStats, this.mPcdnChunkUrlPolicy, this.mChunkRetryCount, this);
            pCDNChunkRunnableModule.init(this.mCommonParams);
            pCDNChunkRunnableModule.setFuture(DownloadComponentManager.getChunkDownloadThreadExecutorService().submit(pCDNChunkRunnableModule));
            this.mChunkRunnables.add(pCDNChunkRunnableModule);
        }
        Iterator<PCDNChunkRunnableModule> it2 = this.mChunkRunnables.iterator();
        while (it2.hasNext()) {
            try {
                it2.next().getFuture().get();
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }
        if (Logger.debug()) {
            Logger.taskDebug(TAG, this.mDownloadInfo.getId(), "doDownload", "ChunkRunnable End");
        }
        this.mPcdnBandwidthSampler.stopSampling();
        this.mPcdnStats.collectPCDNStats();
        if (checkTaskFinishByUser() || (th = this.mError) == null) {
            return;
        }
        if (!(th instanceof BaseException)) {
            throw new BaseException(1000, this.mError);
        }
        throw ((BaseException) th);
    }

    private void fetchTotalSize() throws BaseException {
        boolean debug;
        this.mPcdnChunkUrlPolicy = new PCDNChunkUrlPolicy(this.mDownloadInfo.getPcdnUrls(), this.mDownloadInfo.getCdnUrls());
        PCDNRetryPolicy pCDNRetryPolicy = new PCDNRetryPolicy(this.mChunkRetryCount);
        String str = null;
        while (!checkTaskFinishByUser()) {
            try {
                str = this.mPcdnChunkUrlPolicy.obtainUrl();
                if (Logger.debug()) {
                    Logger.taskDebug(TAG, this.mDownloadInfo.getId(), "getTotalSize", "Before Url:" + str + " isPcdn:" + this.mPcdnChunkUrlPolicy.isPCDN());
                }
                IDownloadHttpConnection sendRequest = sendRequest(str, buildRequestHeader(this.mDownloadInfo.getStartOffset(), this.mDownloadInfo.getEndOffset(), false), this.mDownloadInfo.getStartOffset());
                this.mConnection = sendRequest;
                handleResponseHeader(str, 0L, sendRequest);
                if (debug) {
                    return;
                } else {
                    return;
                }
            } catch (DownloadFileExistException e2) {
                throw e2;
            } catch (BaseException e3) {
                try {
                    e3.printStackTrace();
                    if (!pCDNRetryPolicy.canRetry(true)) {
                        throw e3;
                    }
                    this.mPcdnChunkUrlPolicy.onError();
                    IDownloadHttpConnection iDownloadHttpConnection = this.mConnection;
                    if (iDownloadHttpConnection != null) {
                        iDownloadHttpConnection.end();
                    }
                    if (Logger.debug()) {
                        int id = this.mDownloadInfo.getId();
                        StringBuilder U = a.U("After Url:", str, " isPcdn:");
                        U.append(this.mPcdnChunkUrlPolicy.isPCDN());
                        Logger.taskDebug(TAG, id, "getTotalSize", U.toString());
                    }
                } finally {
                    IDownloadHttpConnection iDownloadHttpConnection2 = this.mConnection;
                    if (iDownloadHttpConnection2 != null) {
                        iDownloadHttpConnection2.end();
                    }
                    if (Logger.debug()) {
                        int id2 = this.mDownloadInfo.getId();
                        StringBuilder U2 = a.U("After Url:", str, " isPcdn:");
                        U2.append(this.mPcdnChunkUrlPolicy.isPCDN());
                        Logger.taskDebug(TAG, id2, "getTotalSize", U2.toString());
                    }
                }
            }
        }
    }

    private void initImpl(JSONObject jSONObject) {
        this.mMaxChunkLength = jSONObject.optLong(DownloadSettingKeys.PCDNConfig.MAX_CHUNK_LENGTH);
        this.mChunkThreadCount = jSONObject.optInt("thread_count");
        this.mChunkRetryCount = jSONObject.optInt(DownloadSettingKeys.PCDNConfig.CHUNK_RETRY_COUNT);
        this.mPcdnDegradeBandWidthLimit = jSONObject.optLong(DownloadSettingKeys.PCDNConfig.PCDN_DEGRADE_BANDWIDTH_LIMIT);
        int optInt = jSONObject.optInt(DownloadSettingKeys.PCDNConfig.PCDN_DEGRADE_SAMPLE_COUNT);
        this.mPcdnDegradeSampleCount = optInt;
        if (this.mMaxChunkLength <= 0) {
            this.mMaxChunkLength = 2097152L;
        }
        if (this.mChunkThreadCount <= 0) {
            this.mChunkThreadCount = 3;
        }
        if (this.mChunkThreadCount > 6) {
            this.mChunkThreadCount = 6;
        }
        if (this.mChunkRetryCount > 20) {
            this.mChunkRetryCount = 20;
        }
        if (optInt < 3) {
            this.mPcdnDegradeSampleCount = 3;
        }
    }

    @Override // com.ss.android.socialbase.downloader.core.AbsDownloadModule, com.ss.android.socialbase.downloader.core.IDownloadModule
    public void cancel() {
        closeConnection(this.mConnection);
        Iterator<PCDNChunkRunnableModule> it2 = this.mChunkRunnables.iterator();
        while (it2.hasNext()) {
            it2.next().cancel();
        }
    }

    @Override // com.ss.android.socialbase.downloader.core.AbsDownloadModule, com.ss.android.socialbase.downloader.core.IDownloadModule
    public IDownloadModule init(DownloadCommonParams downloadCommonParams) {
        JSONObject optJSONObject = downloadCommonParams.mSetting.optJSONObject(DownloadSettingKeys.PCDN_CONFIG);
        if (optJSONObject == null) {
            return null;
        }
        if ((downloadCommonParams.mDownloadInfo.getPcdnUrls() == null || downloadCommonParams.mDownloadInfo.getPcdnUrls().isEmpty()) && (downloadCommonParams.mDownloadInfo.getCdnUrls() == null || downloadCommonParams.mDownloadInfo.getCdnUrls().isEmpty())) {
            return null;
        }
        initImpl(optJSONObject);
        return super.init(downloadCommonParams);
    }

    @Override // com.ss.android.socialbase.downloader.core.module.pcdn.PCDNChunkRunnableModule.IDownloadChunkCallback
    public void onError(Throwable th) {
        this.mError = th;
        cancel();
    }

    @Override // com.ss.android.socialbase.downloader.core.AbsDownloadModule, com.ss.android.socialbase.downloader.core.IDownloadModule
    public void pause() {
        closeConnection(this.mConnection);
        Iterator<PCDNChunkRunnableModule> it2 = this.mChunkRunnables.iterator();
        while (it2.hasNext()) {
            it2.next().pause();
        }
    }

    @Override // com.ss.android.socialbase.downloader.core.module.BaseDownloadNetworkModule, com.ss.android.socialbase.downloader.core.IDownloadModule
    public void proceed(IDownloadModuleChain iDownloadModuleChain) throws BaseException {
        if (Logger.debug()) {
            Logger.taskDebug(TAG, this.mDownloadInfo.getId(), "proceed", "Run");
        }
        try {
            checkTotalSize();
            if (checkTaskFinishByUser()) {
                return;
            }
            init();
            doDownload();
        } catch (DownloadFileExistException e2) {
            throw e2;
        } catch (BaseException e3) {
            throw new DownloadPCDNException(e3.getErrorCode(), e3.getErrorMessage());
        } catch (Throwable th) {
            throw new DownloadPCDNException(1000, th.getMessage());
        }
    }

    private void init() {
        if (Logger.debug()) {
            Logger.taskDebug(TAG, this.mDownloadInfo.getId(), "init", "Run");
        }
        DownloadCommonParams downloadCommonParams = this.mCommonParams;
        this.mPcdnChunkProgressManager = new PCDNChunkProgressManager(this, downloadCommonParams.mDownloadCache, downloadCommonParams.mDownloadInfo);
        this.mPcdnChunkAllocater = new PCDNChunkAllocater(this.mCommonParams.mDownloadInfo, this.mMaxChunkLength);
        this.mPcdnBandwidthSampler = new PCDNBandwidthSampler(this.mCommonParams.mDownloadInfo.getId(), this.mPcdnDegradeBandWidthLimit, this.mPcdnDegradeSampleCount);
        if (this.mPcdnStats == null) {
            this.mPcdnStats = new PCDNStats(this.mDownloadInfo, this.mChunkRetryCount);
        }
        this.mChunkRunnables.clear();
        this.mError = null;
    }
}
