package com.ss.ttuploader;

/* loaded from: classes2.dex */
public interface TTVideoUploaderListener {
    public static final int EndTimeUploadStage1 = 1001;
    public static final int EndTimeUploadStage2 = 1002;
    public static final int EndTimeUploadStage3 = 1003;
    public static final int EndTimeUploadStage4 = 1004;
    public static final int EndTimeUploadStage5 = 1005;

    String getStringFromExtern(int i);

    void onLog(int i, int i2, String str);

    void onNotify(int i, long j, TTVideoInfo tTVideoInfo);

    void onUploadVideoStage(int i, long j);

    int videoUploadCheckNetState(int i, int i2);
}
