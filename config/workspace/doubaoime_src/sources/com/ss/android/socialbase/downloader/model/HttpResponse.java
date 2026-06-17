package com.ss.android.socialbase.downloader.model;

import android.text.TextUtils;
import com.ss.android.socialbase.downloader.network.IDownloadHeadHttpConnection;
import com.ss.android.socialbase.downloader.utils.DownloadHelper;
import com.ss.android.socialbase.downloader.utils.DownloadUtils;
import java.io.IOException;

/* loaded from: classes2.dex */
public class HttpResponse {
    public final IDownloadHeadHttpConnection connection;
    private long contentLength;
    public final int responseCode;
    private long totalLength;
    public final String url;

    public HttpResponse(String str, IDownloadHeadHttpConnection iDownloadHeadHttpConnection) throws IOException {
        this.url = str;
        this.responseCode = iDownloadHeadHttpConnection.getResponseCode();
        this.connection = iDownloadHeadHttpConnection;
    }

    public boolean acceptPartial() {
        return DownloadHelper.canAcceptPartial(this.responseCode, this.connection.getResponseHeaderField(DownloadHelper.ACCEPT_RANGES));
    }

    public String getCacheControl() {
        return DownloadUtils.getRespHeadFieldIgnoreCase(this.connection, DownloadHelper.CACHE_CONTROL);
    }

    public String getContentEncoding() {
        return DownloadUtils.getRespHeadFieldIgnoreCase(this.connection, DownloadHelper.CONTENT_ENCODING);
    }

    public long getContentLength() {
        if (this.contentLength <= 0) {
            this.contentLength = DownloadUtils.getContentLength(this.connection);
        }
        return this.contentLength;
    }

    public String getContentRange() {
        return DownloadUtils.getRespHeadFieldIgnoreCase(this.connection, DownloadUtils.CONTENT_RANGE);
    }

    public String getContentType() {
        return this.connection.getResponseHeaderField(DownloadHelper.CONTENT_TYPE);
    }

    public String getEtag() {
        return this.connection.getResponseHeaderField(DownloadHelper.ETAG);
    }

    public String getLastModified() {
        String respHeadFieldIgnoreCase = DownloadUtils.getRespHeadFieldIgnoreCase(this.connection, "last-modified");
        return TextUtils.isEmpty(respHeadFieldIgnoreCase) ? DownloadUtils.getRespHeadFieldIgnoreCase(this.connection, DownloadHelper.LAST_MODIFIED_CASE) : respHeadFieldIgnoreCase;
    }

    public long getMaxAge() {
        return DownloadHelper.parserMaxAge(getCacheControl());
    }

    public long getTotalLength() {
        if (this.totalLength <= 0) {
            if (isChunked()) {
                this.totalLength = -1L;
            } else {
                String contentRange = getContentRange();
                if (!TextUtils.isEmpty(contentRange)) {
                    this.totalLength = DownloadHelper.parseContentRangeOfInstanceLength(contentRange);
                }
            }
        }
        return this.totalLength;
    }

    public long getXContentLength() {
        String respHeadFieldIgnoreCase = DownloadUtils.getRespHeadFieldIgnoreCase(this.connection, DownloadHelper.X_CONTENT_LENGTH);
        if (!TextUtils.isEmpty(respHeadFieldIgnoreCase)) {
            try {
                return Long.parseLong(respHeadFieldIgnoreCase);
            } catch (NumberFormatException unused) {
            }
        }
        return -1L;
    }

    public boolean isChunked() {
        return DownloadHelper.isChunkedTask(this.connection);
    }

    public boolean isResponseDataFromBegin() {
        return DownloadHelper.isResponseDataFromBegin(this.responseCode);
    }

    public HttpResponse(String str, IDownloadHeadHttpConnection iDownloadHeadHttpConnection, int i) {
        this.url = str;
        this.responseCode = i;
        this.connection = iDownloadHeadHttpConnection;
    }
}
