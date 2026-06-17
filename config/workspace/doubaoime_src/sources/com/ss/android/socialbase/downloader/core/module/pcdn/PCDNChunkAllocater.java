package com.ss.android.socialbase.downloader.core.module.pcdn;

import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.utils.DownloadHelper;

/* loaded from: classes2.dex */
public class PCDNChunkAllocater {
    private DownloadInfo mDownloadInfo;
    private int mIndex;
    private long mMaxChunkLength;
    private long mStartOffset;

    public PCDNChunkAllocater(DownloadInfo downloadInfo, long j) {
        this.mDownloadInfo = downloadInfo;
        this.mMaxChunkLength = j;
        this.mStartOffset = downloadInfo.getStartOffset() + DownloadHelper.getFirstOffset(downloadInfo);
    }

    public PCDNChunk obtainPCDNChunk() {
        synchronized (this) {
            if (this.mStartOffset >= this.mDownloadInfo.getTotalBytes()) {
                return null;
            }
            PCDNChunk pCDNChunk = new PCDNChunk();
            pCDNChunk.mIndex = this.mIndex;
            long j = this.mStartOffset;
            pCDNChunk.mStartOffset = j;
            long j2 = (j + this.mMaxChunkLength) - 1;
            if (j2 < this.mDownloadInfo.getTotalBytes()) {
                pCDNChunk.mEndOffset = j2;
            } else {
                pCDNChunk.mEndOffset = (this.mDownloadInfo.getStartOffset() + this.mDownloadInfo.getTotalBytes()) - 1;
            }
            this.mStartOffset += this.mMaxChunkLength;
            this.mIndex++;
            return pCDNChunk;
        }
    }
}
