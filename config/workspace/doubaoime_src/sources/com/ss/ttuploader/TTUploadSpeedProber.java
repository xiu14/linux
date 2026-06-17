package com.ss.ttuploader;

import android.content.Context;
import android.util.Log;
import e.a.a.a.a;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes2.dex */
public class TTUploadSpeedProber implements TTVideoUploaderListener {
    public static final int MsgIsSpeedProbeComplete = 0;
    public static final int MsgIsSpeedProbeFail = 1;
    public static final int MsgIsSpeedProbeTimeOut = 2;
    private Context mContext;
    private long mEndTime;
    private long mEndTime1;
    private String mFilePath;
    private InputStream mInputStream;
    AtomicBoolean mIsEnd;
    private TTUploadSpeedProberListener mListener;
    private final ReentrantReadWriteLock.ReadLock mReadLock;
    private final ReentrantReadWriteLock mReadWritedLock;
    private long mStartTime;
    private long mStartTime1;
    private int mTestSize;
    private Timer mTimer;
    private TTVideoUploader mUploader;
    private final ReentrantReadWriteLock.WriteLock mWriteLock;

    public TTUploadSpeedProber(Context context, int i) throws Exception {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.mReadWritedLock = reentrantReadWriteLock;
        if (context == null) {
            throw new Exception("context is null create TTUploadSpeedProber fail");
        }
        String filePath = getFilePath(context);
        this.mFilePath = filePath;
        if (filePath == null) {
            throw new Exception("get file path null");
        }
        if (!initFile(i)) {
            throw new Exception("init file fail");
        }
        this.mTestSize = i;
        this.mContext = context;
        try {
            TTVideoUploader tTVideoUploader = new TTVideoUploader();
            this.mUploader = tTVideoUploader;
            tTVideoUploader.setPathName(this.mFilePath);
            this.mUploader.setListener(this);
            this.mUploader.setTestSpeed(true);
            this.mReadLock = reentrantReadWriteLock.readLock();
            this.mWriteLock = reentrantReadWriteLock.writeLock();
            this.mStartTime = 0L;
            this.mEndTime = 0L;
            this.mStartTime1 = 0L;
            this.mEndTime1 = 0L;
            this.mTimer = new Timer();
            this.mIsEnd = new AtomicBoolean(false);
        } catch (Throwable th) {
            StringBuilder M = a.M("TTUploadSpeedProber create image uploader fail");
            M.append(th.toString());
            throw new Exception(M.toString());
        }
    }

    private String getFilePath(Context context) {
        try {
            String absolutePath = context.getApplicationContext().getFilesDir().getAbsolutePath();
            if (absolutePath == null) {
                return null;
            }
            StringBuilder M = a.M(absolutePath);
            String str = File.separator;
            String J2 = a.J(M, str, "speedprober");
            File file = new File(J2);
            if (!file.exists()) {
                file.mkdirs();
            }
            return a.t(J2, str, "speedprober.test");
        } catch (Exception unused) {
            return null;
        }
    }

    private boolean initFile(int i) {
        FileWriter fileWriter = null;
        try {
            File file = new File(this.mFilePath);
            if (file.exists()) {
                file.delete();
                file.createNewFile();
            } else {
                file.createNewFile();
            }
            byte[] bArr = new byte[1024];
            for (int i2 = 0; i2 < 1024; i2++) {
                bArr[i2] = 97;
            }
            String str = new String(bArr);
            FileWriter fileWriter2 = new FileWriter(file, true);
            try {
                int i3 = (i / 1024) + 1;
                for (int i4 = 0; i4 <= i3; i4++) {
                    fileWriter2.write(str);
                }
                fileWriter2.close();
                return true;
            } catch (Throwable unused) {
                fileWriter = fileWriter2;
                if (fileWriter != null) {
                    try {
                        fileWriter.close();
                    } catch (IOException e2) {
                        e2.printStackTrace();
                    }
                }
                return false;
            }
        } catch (Throwable unused2) {
        }
    }

    public void close() {
        this.mWriteLock.lock();
        try {
            TTVideoUploader tTVideoUploader = this.mUploader;
            if (tTVideoUploader != null) {
                tTVideoUploader.close();
                this.mUploader = null;
            }
        } finally {
            this.mWriteLock.unlock();
        }
    }

    @Override // com.ss.ttuploader.TTVideoUploaderListener
    public String getStringFromExtern(int i) {
        return null;
    }

    @Override // com.ss.ttuploader.TTVideoUploaderListener
    public void onLog(int i, int i2, String str) {
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0036  */
    @Override // com.ss.ttuploader.TTVideoUploaderListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onNotify(int r4, long r5, com.ss.ttuploader.TTVideoInfo r7) {
        /*
            r3 = this;
            r0 = 1
            if (r4 != 0) goto L3c
            long r4 = java.lang.System.currentTimeMillis()
            r3.mEndTime = r4
            com.ss.ttuploader.TTUploadSpeedProberListener r4 = r3.mListener
            if (r4 == 0) goto L5e
            java.util.concurrent.atomic.AtomicBoolean r4 = r3.mIsEnd
            r4.set(r0)
            r4 = 0
            if (r7 == 0) goto L17
            org.json.JSONObject r4 = r7.mLog
        L17:
            r5 = 0
            if (r4 == 0) goto L31
            java.lang.String r6 = "speedinfo"
            org.json.JSONObject r4 = r4.getJSONObject(r6)     // Catch: java.lang.Exception -> L2d
            java.lang.String r6 = "0"
            org.json.JSONObject r4 = r4.getJSONObject(r6)     // Catch: java.lang.Exception -> L2d
            java.lang.String r6 = "avspeed"
            int r4 = r4.getInt(r6)     // Catch: java.lang.Exception -> L2d
            goto L32
        L2d:
            r4 = move-exception
            r4.printStackTrace()
        L31:
            r4 = r5
        L32:
            com.ss.ttuploader.TTUploadSpeedProberListener r6 = r3.mListener
            if (r4 <= 0) goto L37
            r0 = r5
        L37:
            long r4 = (long) r4
            r6.onNotify(r0, r4)
            goto L5e
        L3c:
            if (r4 != r0) goto L4b
            r0 = 2
            int r4 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r4 != 0) goto L5e
            long r4 = java.lang.System.currentTimeMillis()
            r3.mStartTime1 = r4
            goto L5e
        L4b:
            r7 = 2
            if (r4 != r7) goto L5e
            java.util.concurrent.atomic.AtomicBoolean r4 = r3.mIsEnd
            r4.set(r0)
            r1 = 0
            r3.mEndTime = r1
            com.ss.ttuploader.TTUploadSpeedProberListener r4 = r3.mListener
            if (r4 == 0) goto L5e
            r4.onNotify(r0, r5)
        L5e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttuploader.TTUploadSpeedProber.onNotify(int, long, com.ss.ttuploader.TTVideoInfo):void");
    }

    @Override // com.ss.ttuploader.TTVideoUploaderListener
    public void onUploadVideoStage(int i, long j) {
    }

    public void setListener(TTUploadSpeedProberListener tTUploadSpeedProberListener) {
        if (tTUploadSpeedProberListener != null) {
            this.mListener = tTUploadSpeedProberListener;
        }
    }

    public void start(String str, String str2, String str3, long j) {
        this.mWriteLock.lock();
        try {
            if (this.mStartTime == 0) {
                this.mStartTime = System.currentTimeMillis();
                this.mUploader.setVideoUploadDomain(str);
                this.mUploader.setAuthorization(str2);
                this.mUploader.setUserKey(str3);
                this.mUploader.setSocketNum(1);
                this.mUploader.setSliceSize(524288);
                this.mUploader.setSliceTimeout(10);
                this.mUploader.setFileRetryCount(0);
                this.mUploader.setSliceReTryCount(0);
                this.mUploader.start();
                this.mTimer.schedule(new TimerTask() { // from class: com.ss.ttuploader.TTUploadSpeedProber.1
                    @Override // java.util.TimerTask, java.lang.Runnable
                    public void run() {
                        TTUploadSpeedProber.this.mWriteLock.lock();
                        try {
                            if (!TTUploadSpeedProber.this.mIsEnd.get() && TTUploadSpeedProber.this.mUploader != null) {
                                TTUploadSpeedProber.this.mUploader.close();
                                TTUploadSpeedProber.this.mUploader = null;
                                if (TTUploadSpeedProber.this.mListener != null) {
                                    TTUploadSpeedProber.this.mListener.onNotify(2, 0L);
                                }
                            }
                            TTUploadSpeedProber.this.mWriteLock.unlock();
                            Log.e("lzp", "timer excute");
                        } catch (Throwable th) {
                            TTUploadSpeedProber.this.mWriteLock.unlock();
                            throw th;
                        }
                    }
                }, j);
            }
        } finally {
            this.mWriteLock.unlock();
        }
    }

    @Override // com.ss.ttuploader.TTVideoUploaderListener
    public int videoUploadCheckNetState(int i, int i2) {
        return 1;
    }
}
