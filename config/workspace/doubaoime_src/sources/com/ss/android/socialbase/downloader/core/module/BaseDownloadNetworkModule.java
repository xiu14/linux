package com.ss.android.socialbase.downloader.core.module;

import android.text.TextUtils;
import com.ss.android.socialbase.downloader.constants.DownloadErrorCode;
import com.ss.android.socialbase.downloader.core.AbsDownloadModule;
import com.ss.android.socialbase.downloader.core.IDownloadModuleChain;
import com.ss.android.socialbase.downloader.downloader.DownloadComponentManager;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.logger.Logger;
import com.ss.android.socialbase.downloader.model.HttpHeader;
import com.ss.android.socialbase.downloader.model.HttpResponse;
import com.ss.android.socialbase.downloader.network.AbsDownloadHttpConnection;
import com.ss.android.socialbase.downloader.network.IDownloadHeadHttpConnection;
import com.ss.android.socialbase.downloader.network.IDownloadHttpConnection;
import com.ss.android.socialbase.downloader.setting.DownloadSettingKeys;
import com.ss.android.socialbase.downloader.thread.IDownloadRunnableCallback;
import com.ss.android.socialbase.downloader.utils.DownloadHelper;
import com.ss.android.socialbase.downloader.utils.DownloadHttpUtils;
import com.ss.android.socialbase.downloader.utils.DownloadUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

/* loaded from: classes2.dex */
public class BaseDownloadNetworkModule extends AbsDownloadModule implements IDownloadRunnableCallback {
    private static final String TAG = "AbsDownloadNetworkModule";

    private void handleResponseCodeError(String str, Throwable th) throws BaseException {
        resetDownloadInfo();
        throw new BaseException(DownloadErrorCode.ERROR_INNER_RETRY, str, th);
    }

    private void resetDownloadInfo() {
        DownloadUtils.deleteAllDownloadFiles(this.mDownloadInfo);
        this.mCommonParams.mNeedCheckIfModified = false;
        this.mDownloadInfo.resetDataForEtagEndure("");
        this.mDownloadCache.updateDownloadInfo(this.mDownloadInfo);
    }

    private void setHttpResponseStatus(IDownloadHttpConnection iDownloadHttpConnection, int i) {
        String responseHeaderField;
        if (iDownloadHttpConnection == null) {
            return;
        }
        try {
            this.mDownloadInfo.setHttpStatusCode(i);
            this.mDownloadInfo.setHttpStatusMessage(DownloadHttpUtils.httpCodeToMessage(i));
            List<String> accessHttpHeaderKeys = this.mDownloadInfo.getAccessHttpHeaderKeys();
            if (accessHttpHeaderKeys == null || accessHttpHeaderKeys.isEmpty()) {
                return;
            }
            HashMap hashMap = new HashMap();
            for (String str : accessHttpHeaderKeys) {
                if (str != null && (responseHeaderField = iDownloadHttpConnection.getResponseHeaderField(str)) != null) {
                    hashMap.put(str, responseHeaderField);
                }
            }
            if (hashMap.isEmpty()) {
                return;
            }
            this.mDownloadInfo.setHttpHeaders(hashMap);
        } catch (Throwable th) {
            try {
                th.printStackTrace();
            } finally {
                this.mDownloadInfo.setHttpStatusCode(-1);
                this.mDownloadInfo.setHttpStatusMessage("");
            }
        }
    }

    private void setMaxAge(HttpResponse httpResponse) {
        if (!TextUtils.isEmpty(httpResponse.getCacheControl()) && httpResponse.getMaxAge() > 0) {
            this.mDownloadInfo.setCacheExpiredTime((httpResponse.getMaxAge() * 1000) + System.currentTimeMillis());
        }
    }

    public List<HttpHeader> buildRequestHeader(long j, long j2, boolean z) {
        boolean z2;
        List<HttpHeader> extraHeaders = this.mDownloadInfo.getExtraHeaders();
        ArrayList arrayList = new ArrayList();
        String str = DownloadHelper.GZIP;
        boolean z3 = false;
        if (extraHeaders == null || extraHeaders.size() <= 0) {
            z2 = false;
        } else {
            z2 = false;
            for (HttpHeader httpHeader : extraHeaders) {
                if (httpHeader != null) {
                    if (DownloadHelper.ACCEPT_ENCODING.equalsIgnoreCase(httpHeader.getName()) && DownloadHelper.GZIP.equalsIgnoreCase(httpHeader.getValue())) {
                        z2 = true;
                    } else {
                        arrayList.add(httpHeader);
                    }
                }
            }
        }
        String str2 = this.mDownloadInfo.geteTag();
        if (this.mCommonParams.mNeedCheckIfModified) {
            if (!TextUtils.isEmpty(str2)) {
                arrayList.add(new HttpHeader(DownloadHelper.IF_NONE_MATCH, str2));
            }
            if (!TextUtils.isEmpty(this.mDownloadInfo.getLastModified())) {
                arrayList.add(new HttpHeader(DownloadHelper.IF_MODIFIED_SINCE, this.mDownloadInfo.getLastModified()));
                arrayList.add(new HttpHeader(DownloadUtils.HEADER_TAG_DOWNLOAD_CACHE, DownloadUtils.HEADER_TAG_DOWNLOAD_CACHE));
            }
        } else if (!TextUtils.isEmpty(str2)) {
            arrayList.add(new HttpHeader(DownloadHelper.IF_MATCH, str2));
        }
        String str3 = null;
        if (j2 > 0) {
            str3 = String.format(Locale.US, "bytes=%d-%d", Long.valueOf(j), Long.valueOf(j2));
        } else if (j > 0) {
            str3 = String.format(Locale.US, "bytes=%d-", Long.valueOf(j));
        } else if (!z) {
            str3 = "bytes=0-0";
        }
        if (str3 != null) {
            arrayList.add(new HttpHeader("Range", str3));
        } else {
            z3 = z2;
        }
        if (!z3) {
            str = DownloadHelper.IDENTITY;
        }
        arrayList.add(new HttpHeader(DownloadHelper.ACCEPT_ENCODING, str));
        arrayList.add(new HttpHeader("extra_download_id", String.valueOf(this.mDownloadInfo.getId())));
        DownloadHelper.addTTNetParam(this.mSetting, arrayList, this.mDownloadInfo);
        this.mCommonParams.mFailoverStrategy.handleHeader(extraHeaders);
        return arrayList;
    }

    @Override // com.ss.android.socialbase.downloader.thread.IDownloadRunnableCallback
    public void checkMaxBytes(long j, int i) throws BaseException {
        if (j <= 0 || i <= 0 || j <= i) {
            return;
        }
        throw new BaseException(DownloadErrorCode.ERROR_MAX_BYTE_LIMIT, "Current Bytes:" + j + "Limit bytes:" + i);
    }

    public void closeConnection(final IDownloadHttpConnection iDownloadHttpConnection) {
        if (iDownloadHttpConnection == null) {
            return;
        }
        DownloadComponentManager.submitIOTask(new Runnable() { // from class: com.ss.android.socialbase.downloader.core.module.BaseDownloadNetworkModule.1
            @Override // java.lang.Runnable
            public void run() {
                IDownloadHttpConnection iDownloadHttpConnection2 = iDownloadHttpConnection;
                if (iDownloadHttpConnection2 == null) {
                    return;
                }
                try {
                    iDownloadHttpConnection2.end();
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }, true);
    }

    @Override // com.ss.android.socialbase.downloader.thread.IDownloadRunnableCallback
    public void handleFirstConnection(String str, IDownloadHeadHttpConnection iDownloadHeadHttpConnection, long j) throws BaseException {
    }

    public void handleResponseHeader(String str, long j, IDownloadHttpConnection iDownloadHttpConnection) throws BaseException {
        long j2;
        try {
            HttpResponse httpResponse = new HttpResponse(str, iDownloadHttpConnection);
            int i = httpResponse.responseCode;
            String contentType = httpResponse.getContentType();
            if (TextUtils.isEmpty(this.mDownloadInfo.getMimeType()) && !TextUtils.isEmpty(contentType)) {
                this.mDownloadInfo.setMimeType(contentType);
            }
            this.mDownloadInfo.setSupportPartial(httpResponse.acceptPartial());
            String etag = httpResponse.getEtag();
            if (!TextUtils.isEmpty(etag)) {
                this.mDownloadInfo.seteTag(etag);
            }
            String lastModified = httpResponse.getLastModified();
            if (!TextUtils.isEmpty(lastModified)) {
                this.mDownloadInfo.setLastModified(lastModified);
            }
            this.mDownloadInfo.setContentEncoding(httpResponse.getContentEncoding());
            if (DownloadHelper.GZIP.equalsIgnoreCase(this.mDownloadInfo.getContentEncoding())) {
                this.mDownloadInfo.setIgnoreDataVerify(true);
            }
            setMaxAge(httpResponse);
            if (Logger.debug()) {
                Logger.taskDebug(TAG, this.mDownloadInfo.getId(), "handleResponseHeader", "ResponseCode=" + i + " last_modified=" + lastModified + " CACHE_CONTROL=" + httpResponse.getCacheControl() + " max-age=" + httpResponse.getMaxAge() + " isDeleteCacheIfCheckFailed=" + this.mDownloadInfo.isDeleteCacheIfCheckFailed());
                int id = this.mDownloadInfo.getId();
                StringBuilder sb = new StringBuilder();
                sb.append(" cur=");
                sb.append(lastModified);
                sb.append(" before=");
                sb.append(this.mDownloadInfo.getLastModified());
                sb.append(" cur=");
                sb.append(httpResponse.getTotalLength());
                sb.append(" before=");
                sb.append(this.mDownloadInfo.getTotalBytes());
                Logger.taskDebug(TAG, id, "handleResponseHeader", sb.toString());
            }
            if (iDownloadHttpConnection instanceof AbsDownloadHttpConnection) {
                String redirectPartialUrlResults = ((AbsDownloadHttpConnection) iDownloadHttpConnection).getRedirectPartialUrlResults();
                if (!TextUtils.isEmpty(redirectPartialUrlResults)) {
                    this.mDownloadInfo.setRedirectPartialUrlResults(redirectPartialUrlResults);
                }
            }
            if (httpResponse.isChunked()) {
                j2 = -1;
                this.mDownloadInfo.setXTotalBytes(httpResponse.getXContentLength());
            } else {
                String contentRange = httpResponse.getContentRange();
                if (Logger.debug()) {
                    Logger.taskDebug(TAG, this.mDownloadInfo.getId(), "handleResponseHeader", "ContentRange:" + contentRange);
                }
                if (TextUtils.isEmpty(contentRange)) {
                    j2 = j + httpResponse.getContentLength();
                    if (Logger.debug()) {
                        Logger.taskDebug(TAG, this.mDownloadInfo.getId(), "handleResponseHeader", "TotalLength2:" + j2);
                    }
                } else {
                    j2 = DownloadHelper.parseContentRangeOfInstanceLength(contentRange);
                    if (Logger.debug()) {
                        Logger.taskDebug(TAG, this.mDownloadInfo.getId(), "handleResponseHeader", "TotalLength:" + j2);
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
                handleResponseCodeError("file totalLength changed", null);
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
            DownloadHelper.parseException(th, "handleResponseHeader");
        }
    }

    @Override // com.ss.android.socialbase.downloader.thread.IDownloadRunnableCallback
    public boolean onProgress(long j) throws BaseException {
        return this.mStatusHandler.onProgress(j);
    }

    @Override // com.ss.android.socialbase.downloader.core.IDownloadModule
    public void proceed(IDownloadModuleChain iDownloadModuleChain) throws BaseException {
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0074 A[Catch: all -> 0x009d, TRY_ENTER, TryCatch #1 {all -> 0x009d, blocks: (B:11:0x0074, B:13:0x007c, B:14:0x0081, B:16:0x008f, B:17:0x0097, B:18:0x009c, B:26:0x00b0, B:28:0x00ba, B:29:0x00c3, B:30:0x00d7, B:34:0x00e1, B:36:0x00e5, B:38:0x00ee, B:39:0x00f3, B:40:0x00f8, B:42:0x00fb, B:47:0x010a, B:48:0x010f, B:52:0x011a, B:53:0x0123), top: B:9:0x0072 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.ss.android.socialbase.downloader.network.IDownloadHttpConnection sendRequest(java.lang.String r16, java.util.List<com.ss.android.socialbase.downloader.model.HttpHeader> r17, long r18) throws com.ss.android.socialbase.downloader.exception.BaseException {
        /*
            Method dump skipped, instructions count: 313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.downloader.core.module.BaseDownloadNetworkModule.sendRequest(java.lang.String, java.util.List, long):com.ss.android.socialbase.downloader.network.IDownloadHttpConnection");
    }
}
