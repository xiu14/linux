package com.ss.ttuploader;

import android.util.Log;
import java.util.Map;

/* loaded from: classes2.dex */
public class TTImageXUploader extends TTImageUploaderAbstractListener implements TTImageUploaderListener {
    private TTImageUploader mImageUploader;
    private TTImageXUploaderAbstractListener mAbstractListener = null;
    private TTImageXUploaderListener mListener = null;

    public TTImageXUploader() throws Exception {
        try {
            TTImageUploader tTImageUploader = new TTImageUploader(4);
            this.mImageUploader = tTImageUploader;
            tTImageUploader.setListener(this);
            this.mImageUploader.setAbstractListener(this);
        } catch (Throwable th) {
            this.mImageUploader = null;
            Log.e("ttmn", th.toString());
        }
        if (this.mImageUploader == null) {
            throw new Exception("create native uploader fail");
        }
    }

    public static boolean isError() {
        return TTImageUploader.isError();
    }

    public void close() {
        TTImageUploader tTImageUploader = this.mImageUploader;
        if (tTImageUploader == null) {
            return;
        }
        tTImageUploader.close();
    }

    @Override // com.ss.ttuploader.TTImageUploaderAbstractListener
    public int imageUploadCheckNetState(int i, int i2) {
        TTImageXUploaderAbstractListener tTImageXUploaderAbstractListener = this.mAbstractListener;
        if (tTImageXUploaderAbstractListener == null) {
            return -2;
        }
        return tTImageXUploaderAbstractListener.imagexUploadCheckNetState(i, i2);
    }

    @Override // com.ss.ttuploader.TTImageUploaderListener
    public void onNotify(int i, long j, TTImageInfo tTImageInfo) {
        Log.e("ttmn", String.format("what:%d,parameter:%d", Integer.valueOf(i), Long.valueOf(j)));
        TTImageXInfo tTImageXInfo = tTImageInfo != null ? new TTImageXInfo(tTImageInfo.mImageToskey, tTImageInfo.mProgress, tTImageInfo.mFileIndex, tTImageInfo.mMetaInfo) : null;
        if (i == 0) {
            this.mListener.onNotify(i, j, null);
            return;
        }
        if (i == 1) {
            this.mListener.onNotify(i, j, null);
            return;
        }
        if (i == 3) {
            this.mListener.onNotify(i, j, tTImageXInfo);
            return;
        }
        if (i == 4) {
            tTImageXInfo.mErrcode = tTImageInfo.mErrcode;
            tTImageXInfo.mProgress = tTImageInfo.mProgress;
            this.mListener.onNotify(i, j, tTImageXInfo);
        } else if (i == 2) {
            this.mListener.onNotify(i, j, tTImageXInfo);
        }
    }

    public void setAbstractListener(TTImageXUploaderAbstractListener tTImageXUploaderAbstractListener) {
        this.mAbstractListener = tTImageXUploaderAbstractListener;
    }

    public void setEnableHttps(int i) {
        TTImageUploader tTImageUploader = this.mImageUploader;
        if (tTImageUploader == null) {
            return;
        }
        tTImageUploader.setEnableHttps(i);
    }

    public void setFileName(int i, String[] strArr) {
        TTImageUploader tTImageUploader = this.mImageUploader;
        if (tTImageUploader == null) {
            return;
        }
        tTImageUploader.setFileName(i, strArr);
    }

    public void setFilePath(int i, String[] strArr) {
        TTImageUploader tTImageUploader = this.mImageUploader;
        if (tTImageUploader == null) {
            return;
        }
        tTImageUploader.setFilePath(i, strArr);
    }

    public void setFileRetryCount(int i) {
        TTImageUploader tTImageUploader = this.mImageUploader;
        if (tTImageUploader == null) {
            return;
        }
        tTImageUploader.setFileRetryCount(i);
    }

    public void setImageUploadDomain(String str) {
        TTImageUploader tTImageUploader = this.mImageUploader;
        if (tTImageUploader == null) {
            return;
        }
        tTImageUploader.setImageUploadDomain(str);
    }

    public void setListener(TTImageXUploaderListener tTImageXUploaderListener) {
        this.mListener = tTImageXUploaderListener;
    }

    public void setMaxFailTime(int i) {
        TTImageUploader tTImageUploader = this.mImageUploader;
        if (tTImageUploader == null) {
            return;
        }
        tTImageUploader.setMaxFailTime(i);
    }

    public void setMediaDataReader(TTMediaDataReader tTMediaDataReader, int i) {
        TTImageUploader tTImageUploader = this.mImageUploader;
        if (tTImageUploader == null) {
            return;
        }
        tTImageUploader.setMediaDataReader(tTMediaDataReader, i);
    }

    public void setOpenBoe(boolean z) {
        TTImageUploader tTImageUploader = this.mImageUploader;
        if (tTImageUploader == null) {
            return;
        }
        tTImageUploader.setOpenBoe(z);
    }

    public void setScenesTag(String str) {
        TTImageUploader tTImageUploader = this.mImageUploader;
        if (tTImageUploader == null) {
            return;
        }
        tTImageUploader.setScenesTag(str);
    }

    public void setServerParameter(String str) {
        TTImageUploader tTImageUploader = this.mImageUploader;
        if (tTImageUploader == null) {
            return;
        }
        tTImageUploader.setServerParameter(str);
    }

    public void setSliceReTryCount(int i) {
        TTImageUploader tTImageUploader = this.mImageUploader;
        if (tTImageUploader == null) {
            return;
        }
        tTImageUploader.setSliceReTryCount(i);
    }

    public void setSliceTimeout(int i) {
        TTImageUploader tTImageUploader = this.mImageUploader;
        if (tTImageUploader == null) {
            return;
        }
        tTImageUploader.setSliceTimeout(i);
    }

    public void setSocketNum(int i) {
        TTImageUploader tTImageUploader = this.mImageUploader;
        if (tTImageUploader == null) {
            return;
        }
        tTImageUploader.setSocketNum(i);
    }

    public void setStringValue(int i, String str) {
        TTImageUploader tTImageUploader = this.mImageUploader;
        if (tTImageUploader == null) {
            return;
        }
        tTImageUploader.setStringValue(i, str);
    }

    public void setTraceIDConfig(Map<Object, Object> map) {
        TTImageUploader tTImageUploader = this.mImageUploader;
        if (tTImageUploader == null) {
            return;
        }
        tTImageUploader.setTraceIDConfig(map);
    }

    public void setTranTimeOutUnit(int i) {
        TTImageUploader tTImageUploader = this.mImageUploader;
        if (tTImageUploader == null) {
            return;
        }
        tTImageUploader.setTranTimeOutUnit(i);
    }

    public void setUploadToken(String str) {
        TTImageUploader tTImageUploader = this.mImageUploader;
        if (tTImageUploader == null) {
            return;
        }
        tTImageUploader.setUploadToken(str);
    }

    public void start() {
        TTImageUploader tTImageUploader = this.mImageUploader;
        if (tTImageUploader == null) {
            return;
        }
        tTImageUploader.start();
    }

    public void stop() {
        TTImageUploader tTImageUploader = this.mImageUploader;
        if (tTImageUploader == null) {
            return;
        }
        tTImageUploader.stop();
    }

    public void setMediaDataReader(TTMediaDataReader tTMediaDataReader, int i, int i2) {
        TTImageUploader tTImageUploader = this.mImageUploader;
        if (tTImageUploader == null) {
            return;
        }
        tTImageUploader.setMediaDataReader(tTMediaDataReader, i, i2);
    }
}
