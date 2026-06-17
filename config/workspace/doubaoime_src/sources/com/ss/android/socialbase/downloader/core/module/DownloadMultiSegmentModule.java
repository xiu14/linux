package com.ss.android.socialbase.downloader.core.module;

import android.text.TextUtils;
import com.ss.android.socialbase.downloader.constants.DownloadErrorCode;
import com.ss.android.socialbase.downloader.constants.RunStatus;
import com.ss.android.socialbase.downloader.core.IDownloadModuleChain;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.exception.DownloadHttpException;
import com.ss.android.socialbase.downloader.exception.DownloadMultiSegmentException;
import com.ss.android.socialbase.downloader.logger.Logger;
import com.ss.android.socialbase.downloader.model.HttpResponse;
import com.ss.android.socialbase.downloader.network.AbsDownloadHttpConnection;
import com.ss.android.socialbase.downloader.network.IDownloadHeadHttpConnection;
import com.ss.android.socialbase.downloader.segment.Segment;
import com.ss.android.socialbase.downloader.segment.SegmentDispatcher;
import com.ss.android.socialbase.downloader.segment.SegmentStrategy;
import com.ss.android.socialbase.downloader.setting.DownloadSettingKeys;
import com.ss.android.socialbase.downloader.utils.DownloadHelper;
import com.ss.android.socialbase.downloader.utils.DownloadUtils;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class DownloadMultiSegmentModule extends BaseDownloadNetworkModule {
    private static final String TAG = "DownloadMultiSegmentModule";
    private SegmentDispatcher mSegmentDispatcher;

    private boolean doDownload() throws BaseException {
        if (this.mDownloadInfo.isExpiredRedownload() || this.mDownloadInfo.getChunkCount() != 1 || this.mDownloadInfo.getThrottleNetSpeed() > 0 || !this.mCommonParams.mEnableSegmentDownload) {
            return false;
        }
        JSONObject optJSONObject = this.mSetting.optJSONObject(DownloadSettingKeys.SEGMENT_CONFIG);
        List<Segment> segments = this.mDownloadCache.getSegments(this.mDownloadInfo.getId());
        if (this.mDownloadInfo.getCurBytes() > 0) {
            if (segments == null || segments.isEmpty()) {
                return false;
            }
            if (optJSONObject == null) {
                optJSONObject = new JSONObject();
            }
        }
        if (optJSONObject == null) {
            return false;
        }
        this.mSegmentDispatcher = new SegmentDispatcher(this.mDownloadTask, this.mDownloadInfo, SegmentStrategy.from(optJSONObject), this);
        if (!checkTaskFinishByUser()) {
            try {
                return this.mSegmentDispatcher.downloadSegments(segments);
            } catch (BaseException e2) {
                throw new DownloadMultiSegmentException(e2.getErrorCode(), e2.getErrorMessage());
            } catch (Throwable th) {
                throw new DownloadMultiSegmentException(1000, th.getMessage());
            }
        }
        if (Logger.debug()) {
            Logger.taskDebug(TAG, this.mDownloadInfo.getId(), "downloadSegments", "Stopped by user");
        }
        if (this.mCommonParams.mRunStatus == RunStatus.RUN_STATUS_CANCELED) {
            this.mSegmentDispatcher.cancel();
        } else {
            this.mSegmentDispatcher.pause();
        }
        return true;
    }

    private void handleResponseCodeError(String str, String str2) throws BaseException {
        this.mDownloadCache.removeSegments(this.mDownloadInfo.getId());
        DownloadUtils.deleteAllDownloadFiles(this.mDownloadInfo);
        this.mDownloadInfo.resetDataForEtagEndure(str);
        this.mDownloadCache.updateDownloadInfo(this.mDownloadInfo);
        throw new BaseException(DownloadErrorCode.ERROR_INNER_RETRY, str2);
    }

    private boolean isResponseCodeError(int i, String str, String str2, boolean z, boolean z2) {
        if (i == 412) {
            return true;
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || str.equals(str2) || !(z || z2)) {
            return (i == 201 || i == 416) && this.mDownloadInfo.getCurBytes() > 0;
        }
        return true;
    }

    @Override // com.ss.android.socialbase.downloader.core.AbsDownloadModule, com.ss.android.socialbase.downloader.core.IDownloadModule
    public void cancel() {
        SegmentDispatcher segmentDispatcher = this.mSegmentDispatcher;
        if (segmentDispatcher != null) {
            segmentDispatcher.cancel();
        }
    }

    @Override // com.ss.android.socialbase.downloader.core.module.BaseDownloadNetworkModule, com.ss.android.socialbase.downloader.thread.IDownloadRunnableCallback
    public void handleFirstConnection(String str, IDownloadHeadHttpConnection iDownloadHeadHttpConnection, long j) throws BaseException {
        long j2;
        String str2;
        String str3;
        if (iDownloadHeadHttpConnection == null) {
            return;
        }
        try {
            HttpResponse httpResponse = new HttpResponse(str, iDownloadHeadHttpConnection);
            int i = httpResponse.responseCode;
            String contentType = httpResponse.getContentType();
            if (TextUtils.isEmpty(this.mDownloadInfo.getMimeType()) && !TextUtils.isEmpty(contentType)) {
                this.mDownloadInfo.setMimeType(contentType);
            }
            boolean acceptPartial = httpResponse.acceptPartial();
            this.mDownloadInfo.setSupportPartial(acceptPartial);
            boolean isResponseDataFromBegin = httpResponse.isResponseDataFromBegin();
            String str4 = this.mDownloadInfo.geteTag();
            String etag = httpResponse.getEtag();
            if (Logger.debug()) {
                Logger.taskDebug(TAG, this.mDownloadInfo.getId(), "handleFirstConnection", "ResponseCode=" + i + " isDeleteCacheIfCheckFailed=" + this.mDownloadInfo.isDeleteCacheIfCheckFailed());
                Logger.taskDebug(TAG, this.mDownloadInfo.getId(), "handleFirstConnection", "firstOffset=" + j + " cur=" + httpResponse.getTotalLength() + " before=" + this.mDownloadInfo.getTotalBytes());
            }
            if (iDownloadHeadHttpConnection instanceof AbsDownloadHttpConnection) {
                String redirectPartialUrlResults = ((AbsDownloadHttpConnection) iDownloadHeadHttpConnection).getRedirectPartialUrlResults();
                if (!TextUtils.isEmpty(redirectPartialUrlResults)) {
                    this.mDownloadInfo.setRedirectPartialUrlResults(redirectPartialUrlResults);
                }
            }
            if (isResponseCodeError(i, str4, etag, isResponseDataFromBegin, acceptPartial)) {
                if (!TextUtils.isEmpty(str4) && str4.equals(etag)) {
                    etag = "";
                }
                handleResponseCodeError(etag, "eTag of server file changed");
            }
            if (!acceptPartial && !isResponseDataFromBegin) {
                if (i == 403) {
                    throw new BaseException(DownloadErrorCode.ERROR_DOWNLOAD_FORBIDDEN, "response code error : 403");
                }
                if (this.mDownloadInfo.getStartOffset() >= 0 && (this.mDownloadInfo.getEndOffset() < 0 || this.mDownloadInfo.getStartOffset() <= this.mDownloadInfo.getEndOffset())) {
                    throw new DownloadHttpException(1004, i, "response code error : " + i);
                }
                throw new BaseException(DownloadErrorCode.ERROR_START_END_OFFSET, "startOffset = " + this.mDownloadInfo.getStartOffset() + ", endOffset = " + this.mDownloadInfo.getEndOffset() + ", response code error : " + i);
            }
            if (isResponseDataFromBegin && j > 0) {
                handleResponseCodeError("", "isResponseFromBegin but firstOffset > 0");
            }
            long contentLength = httpResponse.getContentLength();
            if (httpResponse.isChunked()) {
                j2 = -1;
                this.mDownloadInfo.setXTotalBytes(httpResponse.getXContentLength());
            } else {
                String respHeadFieldIgnoreCase = DownloadUtils.getRespHeadFieldIgnoreCase(iDownloadHeadHttpConnection, DownloadUtils.CONTENT_RANGE);
                if (Logger.debug()) {
                    str2 = TAG;
                    str3 = "handleFirstConnection";
                    Logger.taskDebug(str2, this.mDownloadInfo.getId(), str3, "ContentRange:" + respHeadFieldIgnoreCase);
                } else {
                    str2 = TAG;
                    str3 = "handleFirstConnection";
                }
                if (TextUtils.isEmpty(respHeadFieldIgnoreCase)) {
                    j2 = j + contentLength;
                    if (Logger.debug()) {
                        Logger.taskDebug(str2, this.mDownloadInfo.getId(), str3, "TotalLength2:" + j2);
                    }
                } else {
                    j2 = DownloadHelper.parseContentRangeOfInstanceLength(respHeadFieldIgnoreCase);
                    if (Logger.debug()) {
                        Logger.taskDebug(str2, this.mDownloadInfo.getId(), str3, "TotalLength:" + j2);
                    }
                }
            }
            if (this.mDownloadInfo.getStartOffset() > 0 || this.mDownloadInfo.getEndOffset() >= 0) {
                if (this.mDownloadInfo.getStartOffset() < 0 || this.mDownloadInfo.getEndOffset() >= j2 || (this.mDownloadInfo.getEndOffset() >= 0 && this.mDownloadInfo.getStartOffset() > this.mDownloadInfo.getEndOffset())) {
                    throw new BaseException(DownloadErrorCode.ERROR_START_END_OFFSET, "startOffset = " + this.mDownloadInfo.getStartOffset() + ", endOffset = " + this.mDownloadInfo.getEndOffset() + ", totalLength = " + j2);
                }
                j2 = this.mDownloadInfo.getEndOffset() < 0 ? j2 - this.mDownloadInfo.getStartOffset() : (this.mDownloadInfo.getEndOffset() - this.mDownloadInfo.getStartOffset()) + 1;
            }
            if (!TextUtils.isEmpty(this.mDownloadInfo.getTaskKey()) && this.mDownloadInfo.getTotalBytes() > 0 && j2 != this.mDownloadInfo.getTotalBytes()) {
                handleResponseCodeError("", "file totalLength changed");
            }
            if (checkTaskFinishByUser()) {
                return;
            }
            if (this.mDownloadInfo.getExpectFileLength() > 0 && this.mSetting.optInt(DownloadSettingKeys.FORCE_CHECK_FILE_LENGTH) == 1 && this.mDownloadInfo.getExpectFileLength() != j2) {
                throw new BaseException(DownloadErrorCode.ERROR_CHECK_FILE_LENGTH_FAILED, "expectFileLength = " + this.mDownloadInfo.getExpectFileLength() + " , totalLength = " + j2);
            }
            if (DownloadMimeTypeInterceptModule.checkGlobalIntercept(this.mDownloadInfo)) {
                throw new BaseException(DownloadErrorCode.ERROR_BIZ_INTERCEPTOR, "download global intercept");
            }
            this.mStatusHandler.onFirstConnectionSuccessed(j2, etag, this.mDownloadInfo.getName());
        } catch (BaseException e2) {
            throw e2;
        } catch (Throwable th) {
            DownloadHelper.parseException(th, "HandleFirstConnection");
        }
    }

    @Override // com.ss.android.socialbase.downloader.core.AbsDownloadModule, com.ss.android.socialbase.downloader.core.IDownloadModule
    public void pause() {
        SegmentDispatcher segmentDispatcher = this.mSegmentDispatcher;
        if (segmentDispatcher != null) {
            segmentDispatcher.pause();
        }
    }

    @Override // com.ss.android.socialbase.downloader.core.module.BaseDownloadNetworkModule, com.ss.android.socialbase.downloader.core.IDownloadModule
    public void proceed(IDownloadModuleChain iDownloadModuleChain) throws BaseException {
        if (Logger.debug()) {
            Logger.taskDebug(TAG, this.mDownloadInfo.getId(), "proceed", "Run");
        }
        if (checkTaskFinishByUser() || doDownload()) {
            return;
        }
        iDownloadModuleChain.proceed();
    }
}
