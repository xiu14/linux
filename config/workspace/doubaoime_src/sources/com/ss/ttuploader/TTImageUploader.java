package com.ss.ttuploader;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.ss.ttuploader.net.TTUploadDNSParser;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class TTImageUploader implements Handler.Callback {
    public static final int FileUploadProcessEncryption = 1;
    public static final int FileUploadProcessMediaInfo = 2;
    public static final int FileUploadProcessTypeImageX = 4;
    public static final int FileUploadProcessTypeOriginal = 0;
    public static final int FileUploadProcessTypeUri = 3;
    public static final int IsClose = 5;
    public static final int IsComplete = 3;
    private static boolean IsErrored = false;
    public static final int IsFail = 2;
    public static final int IsInit = 0;
    public static final int IsStart = 1;
    public static final int IsStop = 4;
    public static final int KeIsAuthorization = 15;
    public static final int KeIsGetRedirectLocation = 14;
    public static final int KeyIsApplyAuth = 83;
    public static final int KeyIsCommitAuth = 84;
    public static final int KeyIsEnableHttps = 19;
    public static final int KeyIsExtra = 58;
    public static final int KeyIsFileRetryCount = 6;
    public static final int KeyIsFileUploadDomain = 2;
    public static final int KeyIsGetAlgorithm = 52;
    public static final int KeyIsGetCoverUrI = 12;
    public static final int KeyIsGetCoverUrl = 11;
    public static final int KeyIsGetDNSIp = 75;
    public static final int KeyIsGetLog = 100;
    public static final int KeyIsGetObjectId = 51;
    public static final int KeyIsGetSecretKey = 50;
    public static final int KeyIsGetVersion = 53;
    public static final int KeyIsGetVideoId = 10;
    public static final int KeyIsMaxFailTime = 13;
    public static final int KeyIsMediaDataReader = 201;
    public static final int KeyIsMetaInfoParams = 61;
    public static final int KeyIsObjectType = 54;
    public static final int KeyIsPathName = 0;
    public static final int KeyIsPlainObjectId = 59;
    public static final int KeyIsPolicyParams = 55;
    public static final int KeyIsPreUpload = 80;
    public static final int KeyIsPreUploadEncryptionMode = 74;
    public static final int KeyIsScenesTag = 85;
    public static final int KeyIsServerParameter = 16;
    public static final int KeyIsSetCustomConfig = 63;
    public static final int KeyIsSetDeviceID = 66;
    public static final int KeyIsSetOpenBoe = 67;
    public static final int KeyIsSetProcessAction = 65;
    public static final int KeyIsSetReaderType = 81;
    public static final int KeyIsSetTraceId = 69;
    public static final int KeyIsSetTranTimeOutUnit = 64;
    public static final int KeyIsSetfileNum = 71;
    public static final int KeyIsSliceRetryCount = 5;
    public static final int KeyIsSliceSize = 8;
    public static final int KeyIsSliceTimeout = 7;
    public static final int KeyIsSocketNum = 9;
    public static final int KeyIsSourceMd5 = 57;
    public static final int KeyIsUploadCookie = 4;
    public static final int KeyIsUserName = 1;
    public static final int KeyIsVideoUploadDomain = 3;
    public static final int MsgIsComplete = 0;
    public static final int MsgIsFail = 2;
    public static final int MsgIsSingleImageComplete = 3;
    public static final int MsgIsSingleImageFail = 4;
    public static final int MsgIsUpdateProgress = 1;
    public static final int TTUploadReaderTypeCallBack = 1;
    public static final int TTUploadReaderTypeFilePath = 0;
    public static final int TTUploadReaderTypeMedia = 2;
    public static final int keyIsConfigString = 56;
    private long mEndTime;
    private long mHandle;
    private Handler mHandler;
    private final ReentrantReadWriteLock.ReadLock mReadLock;
    private long mSartTime;
    private int mState;
    private final ReentrantReadWriteLock.WriteLock mWriteLock;
    private int mImageNum = 0;
    int currentType = 0;
    private final ReentrantReadWriteLock mReadWritedLock = new ReentrantReadWriteLock();
    private TTImageUploaderListener mListener = null;
    private TTImageUploaderAbstractListener mAbstractListener = null;

    @Retention(RetentionPolicy.SOURCE)
    public @interface Type {
    }

    static {
        if (TTUploadUtil.initInternal()) {
            return;
        }
        IsErrored = true;
    }

    public TTImageUploader(int i) throws Exception {
        this.mState = -1;
        this.mHandler = null;
        setCurrentType(i);
        try {
            this.mHandle = _imageUploaderCreate(i);
        } catch (Throwable th) {
            this.mHandle = 0L;
            Log.e("ttmn", th.toString());
        }
        if (this.mHandle == 0) {
            throw new Exception("create native uploader fail");
        }
        if (Looper.myLooper() != null) {
            this.mHandler = new Handler(this);
        } else {
            this.mHandler = new Handler(Looper.getMainLooper(), this);
        }
        this.mReadLock = this.mReadWritedLock.readLock();
        this.mWriteLock = this.mReadWritedLock.writeLock();
        this.mState = 0;
        getDNSIP();
    }

    private static native void _allowUpload(long j);

    private static native long _getLongValue(long j, int i);

    private static native void _imageUploaderClose(long j);

    private final native long _imageUploaderCreate(int i);

    private static native String _imageUploaderGetImageMetaInfo(long j, int i);

    private static native String _imageUploaderGetImageUri(long j, int i);

    private static native String _imageUploaderGetStringValue(long j, int i);

    private static native void _imageUploaderSetFileName(long j, int i, String[] strArr);

    private static native void _imageUploaderSetFilePath(long j, int i, String[] strArr);

    private static native void _imageUploaderSetIntValue(long j, int i, int i2);

    private static native void _imageUploaderSetStringValue(long j, int i, String str);

    private static native void _imageUploaderStart(long j);

    private static native String _imageUploaderStop(long j);

    private static native void _setInt64Value(long j, int i, long j2);

    private static native void _setObject(long j, int i, Object obj);

    public static boolean isError() {
        return IsErrored;
    }

    private void setDeviceID(long j) {
        long j2 = this.mHandle;
        if (j2 == 0 || j <= 0) {
            return;
        }
        _setInt64Value(j2, 66, j);
    }

    private void setTraceId(String str) {
        if (this.mHandle == 0 || str == null || str.isEmpty()) {
            return;
        }
        _imageUploaderSetStringValue(this.mHandle, 69, str);
    }

    public void addLogToManager(String str) {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject(str);
            jSONObject.put("dns_version", TTUploadResolver.mDNSVersion);
            jSONObject.put("main_dns_type", TTUploadDNSParser.mGlobalMainType);
            jSONObject.put("main_back_type", TTUploadDNSParser.mGlobalBackType);
            jSONObject.put("back_delayed_time", TTUploadDNSParser.mGlobalBackUpDelayedTime);
            jSONObject.put("expired_time", TTUploadDNSParser.mGlobalDefaultExpiredTime);
        } catch (Exception unused) {
            jSONObject = null;
        }
        UploadEventManager.instance.addImageEvent(jSONObject);
    }

    public void allowContinueUpload() {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        _allowUpload(j);
    }

    public int checkNet(int i, int i2) {
        TTImageUploaderAbstractListener tTImageUploaderAbstractListener = this.mAbstractListener;
        if (tTImageUploaderAbstractListener == null) {
            return -2;
        }
        return tTImageUploaderAbstractListener.imageUploadCheckNetState(i, i2);
    }

    public void close() {
        this.mWriteLock.lock();
        try {
            long j = this.mHandle;
            if (j != 0) {
                _imageUploaderClose(j);
                this.mHandle = 0L;
                this.mState = 5;
                this.mHandler.removeCallbacksAndMessages(null);
            }
        } finally {
            this.mWriteLock.unlock();
        }
    }

    public void extraParams(JSONObject jSONObject) {
        String jSONObject2;
        if (this.mHandle == 0 || jSONObject == null || (jSONObject2 = jSONObject.toString()) == null) {
            return;
        }
        setStringValue(61, jSONObject2);
    }

    public String getDNSIP() {
        return TTUploadUtil.getDNSServerIP();
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        int i = message.what;
        TTImageUploaderListener tTImageUploaderListener = this.mListener;
        if (tTImageUploaderListener == null) {
            return true;
        }
        TTImageInfo tTImageInfo = (TTImageInfo) message.obj;
        tTImageUploaderListener.onNotify(i, tTImageInfo != null ? tTImageInfo.mProgress : 0L, tTImageInfo);
        return true;
    }

    public void onLogInfo(int i, int i2, String str) {
        if (this.mListener == null) {
        }
    }

    public void onNotify(int i, long j, int i2) {
        if (this.mState != 1) {
            return;
        }
        TTImageInfo tTImageInfo = null;
        int i3 = (int) j;
        if (i == 0) {
            String dnsip = getDNSIP();
            if (dnsip != null && !dnsip.isEmpty()) {
                setStringValue(75, dnsip);
            }
            addLogToManager(_imageUploaderGetStringValue(this.mHandle, 100));
            this.mState = 3;
        } else if (i == 1) {
            tTImageInfo = new TTImageInfo(null, i2, i3, null);
        } else if (i == 2) {
            String dnsip2 = getDNSIP();
            if (dnsip2 != null && !dnsip2.isEmpty()) {
                setStringValue(75, dnsip2);
            }
            addLogToManager(_imageUploaderGetStringValue(this.mHandle, 100));
            this.mState = 2;
        } else if (i == 3) {
            this.mEndTime = System.currentTimeMillis();
            String _imageUploaderGetStringValue = _imageUploaderGetStringValue(this.mHandle, 51);
            String _imageUploaderGetStringValue2 = _imageUploaderGetStringValue(this.mHandle, 50);
            String _imageUploaderGetStringValue3 = _imageUploaderGetStringValue(this.mHandle, 52);
            String _imageUploaderGetStringValue4 = _imageUploaderGetStringValue(this.mHandle, 53);
            String _imageUploaderGetStringValue5 = _imageUploaderGetStringValue(this.mHandle, 57);
            String _imageUploaderGetStringValue6 = _imageUploaderGetStringValue(this.mHandle, 58);
            String _imageUploaderGetImageUri = _imageUploaderGetImageUri(this.mHandle, i3);
            tTImageInfo = this.currentType == 1 ? new TTImageInfo(_imageUploaderGetStringValue, _imageUploaderGetStringValue2, _imageUploaderGetStringValue3, _imageUploaderGetStringValue4, _imageUploaderGetImageUri, _imageUploaderGetStringValue5, _imageUploaderGetStringValue6, _imageUploaderGetStringValue(this.mHandle, 59), 0L, i3) : new TTImageInfo(_imageUploaderGetImageUri, 0L, i3, _imageUploaderGetImageMetaInfo(this.mHandle, i3));
        } else if (i == 4) {
            tTImageInfo = new TTImageInfo(null, i2, i3, null);
        }
        Message obtainMessage = this.mHandler.obtainMessage();
        obtainMessage.what = i;
        obtainMessage.obj = tTImageInfo;
        obtainMessage.sendToTarget();
    }

    public void setAbstractListener(TTImageUploaderAbstractListener tTImageUploaderAbstractListener) {
        this.mAbstractListener = tTImageUploaderAbstractListener;
    }

    public void setAuthorization(String str) {
        long j = this.mHandle;
        if (j == 0 || str == null) {
            return;
        }
        _imageUploaderSetStringValue(j, 15, str);
    }

    public void setConfig(TreeMap<String, Object> treeMap) {
        String mapToString;
        if (this.mHandle == 0 || treeMap == null || (mapToString = TTUploadUtil.mapToString(treeMap)) == null) {
            return;
        }
        setStringValue(56, mapToString);
    }

    public void setCurrentType(int i) {
        this.currentType = i;
    }

    public void setCustomConfig(TreeMap<String, Object> treeMap) {
        JSONObject mapToJSON;
        if (this.mHandle == 0 || treeMap == null || (mapToJSON = TTUploadUtil.mapToJSON(treeMap)) == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("custom_config", mapToJSON);
            String jSONObject2 = jSONObject.toString();
            if (TextUtils.isEmpty(jSONObject2)) {
                return;
            }
            setStringValue(63, jSONObject2);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void setEnableHttps(int i) {
        long j = this.mHandle;
        if (j != 0) {
            if (i == 0 || i == 1) {
                _imageUploaderSetIntValue(j, 19, i);
            }
        }
    }

    public void setFileName(int i, String[] strArr) {
        long j = this.mHandle;
        if (j == 0 || strArr == null || i <= 0) {
            return;
        }
        _imageUploaderSetFileName(j, i, strArr);
    }

    public void setFilePath(int i, String[] strArr) {
        long j = this.mHandle;
        if (j == 0 || strArr == null || i <= 0) {
            return;
        }
        this.mImageNum = i;
        _imageUploaderSetFilePath(j, i, strArr);
        _imageUploaderSetIntValue(this.mHandle, 81, 0);
    }

    public void setFileRetryCount(int i) {
        long j = this.mHandle;
        if (j == 0 || i < 0) {
            return;
        }
        _imageUploaderSetIntValue(j, 6, i);
    }

    public void setFileUploadDomain(String str) {
        setStringValue(2, str);
    }

    public void setHandler(Handler handler) {
        this.mHandler = handler;
    }

    public void setImageUploadDomain(String str) {
        setStringValue(3, str);
    }

    public void setListener(TTImageUploaderListener tTImageUploaderListener) {
        this.mListener = tTImageUploaderListener;
    }

    public void setMaxFailTime(int i) {
        long j = this.mHandle;
        if (j == 0 || i < 0) {
            return;
        }
        _imageUploaderSetIntValue(j, 13, i);
    }

    public void setMediaDataReader(TTMediaDataReader tTMediaDataReader, int i) {
        long j = this.mHandle;
        if (j == 0 || tTMediaDataReader == null || i <= 0) {
            return;
        }
        _imageUploaderSetIntValue(j, 71, i);
        _setObject(this.mHandle, 201, tTMediaDataReader);
        _imageUploaderSetIntValue(this.mHandle, 81, 2);
    }

    public void setObjectType(String str) {
        setStringValue(54, str);
    }

    public void setOpenBoe(boolean z) {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        if (z) {
            _imageUploaderSetIntValue(j, 67, 1);
        } else {
            _imageUploaderSetIntValue(j, 67, 0);
        }
    }

    public void setPolicyParams(TreeMap<String, Object> treeMap) {
        String mapToString;
        if (this.mHandle == 0 || treeMap == null || (mapToString = TTUploadUtil.mapToString(treeMap)) == null) {
            return;
        }
        setStringValue(55, mapToString);
    }

    public void setPreUpload(boolean z) {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        _imageUploaderSetIntValue(j, 80, z ? 1 : 0);
    }

    public void setPreheatUploader(boolean z) {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        _imageUploaderSetIntValue(j, 74, z ? 1 : 0);
    }

    public void setProcessAction(String str) {
        setStringValue(65, str);
    }

    public void setScenesTag(String str) {
        long j = this.mHandle;
        if (j == 0 || str == null) {
            return;
        }
        _imageUploaderSetStringValue(j, 85, str);
    }

    public void setServerParameter(String str) {
        long j = this.mHandle;
        if (j == 0 || str == null) {
            return;
        }
        _imageUploaderSetStringValue(j, 16, str);
    }

    public void setSliceReTryCount(int i) {
        long j = this.mHandle;
        if (j == 0 || i < 0) {
            return;
        }
        _imageUploaderSetIntValue(j, 5, i);
    }

    public void setSliceSize(int i) {
        long j = this.mHandle;
        if (j == 0 || i < 0) {
            return;
        }
        _imageUploaderSetIntValue(j, 8, i);
    }

    public void setSliceTimeout(int i) {
        long j = this.mHandle;
        if (j == 0 || i < 0) {
            return;
        }
        _imageUploaderSetIntValue(j, 7, i);
    }

    public void setSocketNum(int i) {
        long j = this.mHandle;
        if (j == 0 || i < 0) {
            return;
        }
        _imageUploaderSetIntValue(j, 9, i);
    }

    public void setStringValue(int i, String str) {
        long j = this.mHandle;
        if (j == 0 || str == null) {
            return;
        }
        _imageUploaderSetStringValue(j, i, str);
    }

    public void setTraceIDConfig(Map<Object, Object> map) {
        if (map.get(69) != null && (map.get(69) instanceof String)) {
            String str = (String) map.get(69);
            if (str == null || str.isEmpty()) {
                return;
            }
            setTraceId(str);
            return;
        }
        if (map.get(66) == null || !(map.get(66) instanceof Long)) {
            return;
        }
        long longValue = ((Long) map.get(66)).longValue();
        if (longValue > 0) {
            setDeviceID(longValue);
        }
    }

    public void setTranTimeOutUnit(int i) {
        long j = this.mHandle;
        if (j == 0 || i <= 0) {
            return;
        }
        _imageUploaderSetIntValue(j, 64, i);
    }

    public void setUploadCookie(String str) {
        setStringValue(4, str);
    }

    public void setUploadToken(String str) {
        Log.e("ttmn", str);
        if (str == null || str.isEmpty()) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(new String(Base64.decode(str.getBytes(), 2)));
            String string = jSONObject.getString("ApplyUploadToken");
            String string2 = jSONObject.getString("CommitUploadToken");
            if (string != null && !string.isEmpty()) {
                setStringValue(83, string);
            }
            if (string2 == null || string2.isEmpty()) {
                return;
            }
            setStringValue(84, string2);
        } catch (JSONException e2) {
            Log.e("ttmn", "uploadToken is encode json error !!!");
            e2.printStackTrace();
        }
    }

    public void setUserKey(String str) {
        setStringValue(1, str);
    }

    public void start() {
        this.mReadLock.lock();
        try {
            if (this.mHandle != 0) {
                this.mState = 1;
                this.mSartTime = System.currentTimeMillis();
                _imageUploaderStart(this.mHandle);
            }
        } finally {
            this.mReadLock.unlock();
        }
    }

    public void stop() {
        this.mWriteLock.lock();
        try {
            long j = this.mHandle;
            if (j != 0) {
                addLogToManager(_imageUploaderStop(j));
                this.mState = 4;
            }
        } finally {
            this.mWriteLock.unlock();
        }
    }

    public void setMediaDataReader(TTMediaDataReader tTMediaDataReader, int i, int i2) {
        if (this.mHandle == 0 || tTMediaDataReader == null || i <= 0) {
            return;
        }
        setMediaDataReader(tTMediaDataReader, i);
        _imageUploaderSetIntValue(this.mHandle, 81, i2);
    }

    public TTImageUploader() throws Exception {
        this.mState = -1;
        this.mHandler = null;
        if (IsErrored) {
            TTUploadUtil.initInternal();
        }
        try {
            this.mHandle = _imageUploaderCreate(0);
        } catch (Throwable unused) {
            this.mHandle = 0L;
        }
        if (this.mHandle != 0) {
            if (Looper.myLooper() != null) {
                this.mHandler = new Handler(this);
            } else {
                this.mHandler = new Handler(Looper.getMainLooper(), this);
            }
            this.mReadLock = this.mReadWritedLock.readLock();
            this.mWriteLock = this.mReadWritedLock.writeLock();
            this.mState = 0;
            getDNSIP();
            return;
        }
        throw new Exception("create native uploader fail");
    }
}
