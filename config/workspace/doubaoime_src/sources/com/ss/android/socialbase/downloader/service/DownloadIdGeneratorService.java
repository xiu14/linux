package com.ss.android.socialbase.downloader.service;

import android.text.TextUtils;
import com.ss.android.socialbase.downloader.downloader.IDownloadIdGenerator;
import com.ss.android.socialbase.downloader.file.DownloadFileUtils;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.utils.DownloadUtils;

/* loaded from: classes2.dex */
public class DownloadIdGeneratorService implements IDownloadIdGeneratorService {
    private IDownloadIdGenerator mDownloadIdGenerator;

    private int generateImpl(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return 0;
        }
        if (DownloadFileUtils.isMediaUri(str2)) {
            str2 = DownloadFileUtils.getContentUriString(str2);
        }
        String md5Hex = DownloadUtils.md5Hex(String.format("%s_%s", str, str2));
        if (TextUtils.isEmpty(md5Hex)) {
            return 0;
        }
        return md5Hex.hashCode();
    }

    @Override // com.ss.android.socialbase.downloader.downloader.IDownloadIdGenerator
    public int generate(String str, String str2) {
        IDownloadIdGenerator iDownloadIdGenerator = this.mDownloadIdGenerator;
        return iDownloadIdGenerator != null ? iDownloadIdGenerator.generate(str, str2) : generateImpl(str, str2);
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadIdGeneratorService, com.ss.android.socialbase.downloader.downloader.IDownloadIdGenerator
    public boolean isDefaultIdGenerator() {
        return this.mDownloadIdGenerator == null;
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadIdGeneratorService
    public void setDownloadIdGenerator(IDownloadIdGenerator iDownloadIdGenerator) {
        this.mDownloadIdGenerator = iDownloadIdGenerator;
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadIdGeneratorService
    public int generate(DownloadInfo downloadInfo) {
        if (downloadInfo == null) {
            return 0;
        }
        String taskKey = downloadInfo.getTaskKey();
        if (TextUtils.isEmpty(taskKey)) {
            taskKey = downloadInfo.getUrl();
        }
        return generate(taskKey, downloadInfo.getSavePath());
    }
}
