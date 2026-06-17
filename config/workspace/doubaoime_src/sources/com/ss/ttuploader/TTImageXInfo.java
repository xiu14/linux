package com.ss.ttuploader;

/* loaded from: classes2.dex */
public class TTImageXInfo {
    public long mErrcode;
    public int mFileIndex;
    public String mMediaInfo;
    public long mProgress;
    public String mStoreUri;

    public TTImageXInfo(String str, long j, int i, String str2) {
        this.mFileIndex = -1;
        this.mStoreUri = str;
        this.mProgress = j;
        this.mErrcode = j;
        this.mFileIndex = i;
        this.mMediaInfo = str2;
    }
}
