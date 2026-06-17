package com.ss.ttuploader;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import com.ss.ttuploader.net.TTUploadDNSParser;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class TTVideoUploader implements Handler.Callback {
    public static final int FileUploadProcessEncryption = 1;
    public static final int FileUploadProcessTypeOriginal = 0;
    public static final int FileUploadProcessUri = 3;
    public static final int IsClose = 5;
    public static final int IsComplete = 3;
    private static boolean IsErrored = false;
    public static final int IsFail = 2;
    public static final int IsInit = 0;
    public static final int IsStart = 1;
    public static final int IsStop = 4;
    public static final int KeIsAuthorization = 15;
    public static final int KeIsGetRedirectLocation = 14;
    public static final int KeyIsAliveMaxFailTime = 22;
    public static final int KeyIsDisableUploadInfo = 301;
    public static final int KeyIsEnableExternDNS = 21;
    public static final int KeyIsEnableExternNet = 26;
    public static final int KeyIsEnableFileTryHttps = 25;
    public static final int KeyIsEnableHeaderXStorageMode = 83;
    public static final int KeyIsEnableHttps = 19;
    public static final int KeyIsEnableKeepAlive = 20;
    public static final int KeyIsEnableMutiTask = 29;
    public static final int KeyIsEnablePostMethod = 23;
    public static final int KeyIsEnableQuic = 28;
    public static final int KeyIsExternFileReader = 200;
    public static final int KeyIsExternNetLoader = 27;
    public static final int KeyIsExternNetParameter = 41;
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
    public static final int KeyIsGetTosKey = 300;
    public static final int KeyIsGetVersion = 53;
    public static final int KeyIsGetVideoId = 10;
    public static final int KeyIsHostWeight = 87;
    public static final int KeyIsIsUseServerHost = 17;
    public static final int KeyIsIsUseUpHost = 18;
    public static final int KeyIsLogCallback = 78;
    public static final int KeyIsMaxFailTime = 13;
    public static final int KeyIsMediaDataReader = 201;
    public static final int KeyIsMediaInfo = 68;
    public static final int KeyIsNetworkRoutMode = 86;
    public static final int KeyIsNewHttpProxyLoader = 40;
    public static final int KeyIsObjectType = 54;
    public static final int KeyIsOpenResume = 70;
    public static final int KeyIsPathName = 0;
    public static final int KeyIsPlainObjectId = 59;
    public static final int KeyIsPolicyParams = 55;
    public static final int KeyIsPreUploadEncryptionMode = 74;
    public static final int KeyIsPrivateVideo = 88;
    public static final int KeyIsScenesTag = 85;
    public static final int KeyIsServerParameter = 16;
    public static final int KeyIsSetCustomConfig = 63;
    public static final int KeyIsSetDeviceID = 66;
    public static final int KeyIsSetEvStateEnable = 79;
    public static final int KeyIsSetLinkTurboEnable = 82;
    public static final int KeyIsSetMinSize = 77;
    public static final int KeyIsSetOpenBoe = 67;
    public static final int KeyIsSetResponeTimeOut = 76;
    public static final int KeyIsSetTraceId = 69;
    public static final int KeyIsSetTranTimeOutUnit = 64;
    public static final int KeyIsSetUserRefrence = 62;
    public static final int KeyIsSliceRetryCount = 5;
    public static final int KeyIsSliceSize = 8;
    public static final int KeyIsSliceTimeout = 7;
    public static final int KeyIsSocketNum = 9;
    public static final int KeyIsSourceMd5 = 57;
    public static final int KeyIsTcpOpenTimeOutMilliSec = 24;
    public static final int KeyIsTotalTimeout = 89;
    public static final int KeyIsUploadCookie = 4;
    public static final int KeyIsUserName = 1;
    public static final int KeyIsVideoUploadDomain = 3;
    public static final int MAX_HEADER_SIZE = 20;
    public static final int MessageIsCallBackError = 101;
    public static final int MessageIsCallBackHeader = 102;
    public static final int MessageIsCallBackStage = 103;
    public static final int MessageIsCallBackStageEvent = 104;
    public static final int MessageIsNetRoutError = 112;
    public static final int MessageIsNetRoutVidInfoFirst = 110;
    public static final int MessageIsSpeedTestError = 106;
    public static final int MessageIsSpeedTestSuccess = 105;
    public static final int MessageIsSpeedTestUseless = 108;
    public static final int MessageIsnetRoutVidInfoAll = 111;
    public static final int MsgIsCallBackLog = 100;
    public static final int MsgIsComplete = 0;
    public static final int MsgIsFail = 2;
    public static final int MsgIsUpdateProgress = 1;
    public static final int MsgIsUploadCancel = 3;
    public static final int NetStateIsClose = -1;
    public static final int NetStateIsNotReachable = 0;
    public static final int NetStateIsReachable = 1;
    public static final int NetwrokRoutModeDomain = 0;
    public static final int NetwrokRoutModeTopN = 1;
    public static final int TestModeRout = 1;
    public static final int TestModeSpeed = 0;
    public static final int keyIsConfigString = 56;
    int headerIndex;
    private long mEndTime;
    private long mHandle;
    private Handler mHandler;
    private String[] mHeaders;
    private boolean mIsTestSpeed;
    private JSONObject mJsonInfo;
    private final ReentrantReadWriteLock.ReadLock mReadLock;
    private long mSartTime;
    private int mState;
    private final ReentrantReadWriteLock.WriteLock mWriteLock;
    int currentType = 0;
    private final ReentrantReadWriteLock mReadWritedLock = new ReentrantReadWriteLock();
    private TTVideoUploaderListener mListener = null;
    private TTVideoUploaderAbstractListener mAbstractListener = null;
    private Lock mHeadersLock = new ReentrantLock();

    public static class LogInfo {
        private int code;
        private String info;

        public LogInfo(int i, String str) {
            this.code = i;
            this.info = str;
        }

        public int getCode() {
            return this.code;
        }

        public String getInfo() {
            return this.info;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface Type {
    }

    static {
        if (TTUploadUtil.initInternal()) {
            return;
        }
        IsErrored = true;
    }

    public TTVideoUploader(int i) throws Exception {
        this.mState = -1;
        this.mHandler = null;
        if (IsErrored) {
            TTUploadUtil.initInternal();
        }
        setCurrentType(i);
        if (i == 0 || i == 1 || i == 3) {
            try {
                this.mHandle = _create(i);
            } catch (Throwable unused) {
                this.mHandle = 0L;
            }
        } else {
            this.mHandle = 0L;
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
        this.mIsTestSpeed = false;
        getDNSIP();
        this.mHeaders = new String[20];
        for (int i2 = 0; i2 < 20; i2++) {
            this.mHeaders[i2] = null;
        }
        this.headerIndex = 0;
    }

    private static native void _cancelUpload(long j);

    private static native String _close(long j, int i);

    private final native long _create(int i);

    private static native long _getLongValue(long j, int i);

    private static native String _getStringValue(long j, int i);

    private static native void _mergeUpload(long j);

    private static native void _setContext(long j, String str);

    private static native void _setInt64Value(long j, int i, long j2);

    private static native void _setIntValue(long j, int i, int i2);

    private static native void _setObject(long j, int i, Object obj);

    private static native void _setPoster(long j, float f2);

    private static native void _setStringValue(long j, int i, String str);

    private static native void _start(long j);

    private static native void _startSpeedTest(long j, int i, int i2, int i3);

    private static native String _stop(long j);

    private static native void _stopSpeedTest(long j);

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
        _setStringValue(this.mHandle, 69, str);
    }

    public JSONObject addLogToManager(String str) {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject(str);
            jSONObject.put("dns_version", TTUploadResolver.mDNSVersion);
            jSONObject.put("main_dns_type", TTUploadDNSParser.mGlobalMainType);
            jSONObject.put("main_back_type", TTUploadDNSParser.mGlobalBackType);
            jSONObject.put("back_delayed_time", TTUploadDNSParser.mGlobalBackUpDelayedTime);
            jSONObject.put("expired_time", TTUploadDNSParser.mGlobalDefaultExpiredTime);
            JSONObject jSONObject2 = this.mJsonInfo;
            if (jSONObject2 != null) {
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    jSONObject.put(next, this.mJsonInfo.get(next));
                }
            }
            String str2 = "";
            try {
                this.mHeadersLock.lock();
                for (int i = 0; i < 20; i++) {
                    if (!TextUtils.isEmpty(this.mHeaders[i])) {
                        str2 = str2 + "#" + this.mHeaders[i];
                    }
                }
                this.mHeadersLock.unlock();
                if (!TextUtils.isEmpty(str2)) {
                    jSONObject.put("cdn_headers", str2);
                }
            } catch (Throwable th) {
                this.mHeadersLock.unlock();
                throw th;
            }
        } catch (Exception unused) {
            jSONObject = null;
        }
        if (!this.mIsTestSpeed) {
            UploadEventManager.instance.addEvent(jSONObject);
        }
        return jSONObject;
    }

    public void allowMergeUpload() {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        _mergeUpload(j);
    }

    public void cancelUpload() {
        this.mWriteLock.lock();
        long j = this.mHandle;
        if (j == 0) {
            this.mWriteLock.unlock();
        } else {
            _cancelUpload(j);
            this.mWriteLock.unlock();
        }
    }

    public int checkNet(int i, int i2) {
        Log.e("ttmn", "checketNet");
        TTVideoUploaderListener tTVideoUploaderListener = this.mListener;
        if (tTVideoUploaderListener == null) {
            return 1;
        }
        return tTVideoUploaderListener.videoUploadCheckNetState(i, i2);
    }

    public void close() {
        close(0);
    }

    public String getDNSIP() {
        return TTUploadUtil.getDNSServerIP();
    }

    public String getStringFromExtern(int i) {
        TTVideoUploaderListener tTVideoUploaderListener = this.mListener;
        if (tTVideoUploaderListener != null) {
            return tTVideoUploaderListener.getStringFromExtern(i);
        }
        return null;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        int i = message.what;
        Object obj = message.obj;
        if (obj instanceof LogInfo) {
            LogInfo logInfo = (LogInfo) obj;
            onLogInfoSync(i, logInfo.getCode(), logInfo.getInfo());
            return true;
        }
        TTVideoUploaderListener tTVideoUploaderListener = this.mListener;
        if (tTVideoUploaderListener == null) {
            return true;
        }
        TTVideoInfo tTVideoInfo = (TTVideoInfo) obj;
        tTVideoUploaderListener.onNotify(i, tTVideoInfo != null ? tTVideoInfo.mProgress : 0L, tTVideoInfo);
        return true;
    }

    public void onLogInfo(int i, int i2, String str) {
        if (this.mState != 1) {
            return;
        }
        LogInfo logInfo = new LogInfo(i2, str);
        Message obtainMessage = this.mHandler.obtainMessage();
        obtainMessage.what = i;
        obtainMessage.obj = logInfo;
        obtainMessage.sendToTarget();
    }

    public void onLogInfoSync(int i, int i2, String str) {
        JSONObject jSONObject;
        JSONException e2;
        if (i == 102 && !TextUtils.isEmpty(str)) {
            try {
                this.mHeadersLock.lock();
                if (this.headerIndex >= 20) {
                    this.headerIndex = 0;
                }
                String[] strArr = this.mHeaders;
                int i3 = this.headerIndex;
                strArr[i3] = str;
                this.headerIndex = i3 + 1;
                return;
            } finally {
                this.mHeadersLock.unlock();
            }
        }
        if (i == 104) {
            if (this.mAbstractListener != null) {
                Map<String, String> hashMap = new HashMap<>(20);
                try {
                    jSONObject = new JSONObject(str);
                    try {
                        JSONObject jSONObject2 = this.mJsonInfo;
                        if (jSONObject2 != null) {
                            Iterator<String> keys = jSONObject2.keys();
                            while (keys.hasNext()) {
                                String next = keys.next();
                                jSONObject.put(next, this.mJsonInfo.get(next));
                            }
                        }
                        hashMap = TTUploadUtil.jsonToHashMap(jSONObject);
                    } catch (JSONException e3) {
                        e2 = e3;
                        e2.printStackTrace();
                        this.mAbstractListener.onEventLog(jSONObject);
                        this.mAbstractListener.onEventLogMap(hashMap);
                        return;
                    }
                } catch (JSONException e4) {
                    jSONObject = null;
                    e2 = e4;
                }
                this.mAbstractListener.onEventLog(jSONObject);
                this.mAbstractListener.onEventLogMap(hashMap);
                return;
            }
            return;
        }
        if (i == 105) {
            TTVideoUploaderAbstractListener tTVideoUploaderAbstractListener = this.mAbstractListener;
            if (tTVideoUploaderAbstractListener != null) {
                tTVideoUploaderAbstractListener.onSpeedVidContext(0, i2, str);
                return;
            }
            return;
        }
        if (i == 106) {
            TTVideoUploaderAbstractListener tTVideoUploaderAbstractListener2 = this.mAbstractListener;
            if (tTVideoUploaderAbstractListener2 != null) {
                tTVideoUploaderAbstractListener2.onSpeedVidContext(1, i2, str);
                return;
            }
            return;
        }
        if (i == 110) {
            TTVideoUploaderAbstractListener tTVideoUploaderAbstractListener3 = this.mAbstractListener;
            if (tTVideoUploaderAbstractListener3 != null) {
                tTVideoUploaderAbstractListener3.onSpeedVidContext(2, i2, str);
                return;
            }
            return;
        }
        if (i == 111) {
            TTVideoUploaderAbstractListener tTVideoUploaderAbstractListener4 = this.mAbstractListener;
            if (tTVideoUploaderAbstractListener4 != null) {
                tTVideoUploaderAbstractListener4.onSpeedVidContext(3, i2, str);
                return;
            }
            return;
        }
        if (i == 112) {
            TTVideoUploaderAbstractListener tTVideoUploaderAbstractListener5 = this.mAbstractListener;
            if (tTVideoUploaderAbstractListener5 != null) {
                tTVideoUploaderAbstractListener5.onSpeedVidContext(4, i2, str);
                return;
            }
            return;
        }
        if (i == 103) {
            long time = new Date().getTime() / 1000;
            TTVideoUploaderListener tTVideoUploaderListener = this.mListener;
            if (tTVideoUploaderListener != null) {
                tTVideoUploaderListener.onUploadVideoStage(i2, time);
            }
        }
        TTVideoUploaderListener tTVideoUploaderListener2 = this.mListener;
        if (tTVideoUploaderListener2 != null) {
            tTVideoUploaderListener2.onLog(i, i2, str);
        }
    }

    public void onNotify(int i, long j, int i2) {
        if (this.mState != 1) {
            return;
        }
        TTVideoInfo tTVideoInfo = null;
        if (i == 0) {
            this.mEndTime = System.currentTimeMillis();
            tTVideoInfo = this.currentType == 1 ? new TTVideoInfo(_getStringValue(this.mHandle, 51), _getStringValue(this.mHandle, 50), _getStringValue(this.mHandle, 52), _getStringValue(this.mHandle, 53), j, _getStringValue(this.mHandle, 57), _getStringValue(this.mHandle, 58), _getStringValue(this.mHandle, 59)) : new TTVideoInfo(_getStringValue(this.mHandle, 10), _getStringValue(this.mHandle, 11), _getStringValue(this.mHandle, 12), j, _getStringValue(this.mHandle, 300), _getStringValue(this.mHandle, 68));
            String dnsip = getDNSIP();
            if (dnsip != null && !dnsip.isEmpty()) {
                setStringValue(75, dnsip);
            }
            tTVideoInfo.mLog = addLogToManager(_getStringValue(this.mHandle, 100));
            this.mState = 3;
        } else if (i == 1) {
            tTVideoInfo = new TTVideoInfo(null, null, null, j, null, null);
        } else if (i == 2) {
            String dnsip2 = getDNSIP();
            if (dnsip2 != null && !dnsip2.isEmpty()) {
                setStringValue(75, dnsip2);
            }
            String _getStringValue = _getStringValue(this.mHandle, 100);
            TTVideoInfo tTVideoInfo2 = new TTVideoInfo(null, null, null, j, _getStringValue(this.mHandle, 14), null);
            addLogToManager(_getStringValue);
            this.mState = 2;
            tTVideoInfo = tTVideoInfo2;
        } else if (i == 3) {
            addLogToManager(_getStringValue(this.mHandle, 100));
            tTVideoInfo = new TTVideoInfo(null, null, null, j, _getStringValue(this.mHandle, 14), null);
        } else if (i == 105) {
            tTVideoInfo = new TTVideoInfo(null, null, null, j, _getStringValue(this.mHandle, 14), null);
        } else if (i == 106) {
            tTVideoInfo = new TTVideoInfo(null, null, null, j, _getStringValue(this.mHandle, 14), null);
            this.mState = 2;
        } else if (i == 108) {
            tTVideoInfo = new TTVideoInfo(null, null, null, j, _getStringValue(this.mHandle, 14), null);
        }
        Message obtainMessage = this.mHandler.obtainMessage();
        obtainMessage.what = i;
        obtainMessage.obj = tTVideoInfo;
        obtainMessage.sendToTarget();
    }

    public void setAbstractListener(TTVideoUploaderAbstractListener tTVideoUploaderAbstractListener) {
        this.mAbstractListener = tTVideoUploaderAbstractListener;
    }

    public void setAliveMaxFailTime(int i) {
        long j = this.mHandle;
        if (j == 0 || i < 0) {
            return;
        }
        _setIntValue(j, 22, i);
    }

    public void setAuthorization(String str) {
        long j = this.mHandle;
        if (j == 0 || str == null) {
            return;
        }
        _setStringValue(j, 15, str);
    }

    public void setConfig(TreeMap<String, Object> treeMap) {
        String mapToString;
        if (this.mHandle == 0 || treeMap == null || (mapToString = TTUploadUtil.mapToString(treeMap)) == null) {
            return;
        }
        setStringValue(56, mapToString);
    }

    public void setContext(String str) {
        long j = this.mHandle;
        if (j == 0 || str == null) {
            return;
        }
        _setContext(j, str);
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

    public void setEnableBigFile(int i) {
        if (this.mHandle == 0 || i < 0) {
            return;
        }
        Log.e("ttmn", "TTVideoUploader-222222!");
        _setIntValue(this.mHandle, 83, i);
    }

    public void setEnableExternDNS(int i) {
        long j = this.mHandle;
        if (j != 0) {
            if (i == 0 || i == 1) {
                _setIntValue(j, 21, i);
            }
        }
    }

    public void setEnableExternNet(int i) {
        long j = this.mHandle;
        if (j == 0 || i < 0) {
            return;
        }
        _setIntValue(j, 26, i);
    }

    public void setEnableFiletryHttps(int i) {
        long j = this.mHandle;
        if (j != 0) {
            if (i == 0 || i == 1) {
                _setIntValue(j, 25, i);
            }
        }
    }

    public void setEnableHttps(int i) {
        long j = this.mHandle;
        if (j == 0 || i < 0) {
            return;
        }
        _setIntValue(j, 19, i);
    }

    public void setEnableKeepAlive(int i) {
        long j = this.mHandle;
        if (j != 0) {
            if (i == 0 || i == 1) {
                _setIntValue(j, 20, i);
            }
        }
    }

    public void setEnableLinkTurbo(int i) {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        _setIntValue(j, 82, i);
    }

    public void setEnableLogCallBack(boolean z) {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        if (z) {
            _setIntValue(j, 78, 1);
        } else {
            _setIntValue(j, 78, 0);
        }
    }

    public void setEnableMutiTask(int i) {
        long j = this.mHandle;
        if (j != 0) {
            if (i == 0 || i == 1) {
                _setIntValue(j, 29, i);
            }
        }
    }

    public void setEnablePostMethod(int i) {
        long j = this.mHandle;
        if (j != 0) {
            if (i == 0 || i == 1) {
                _setIntValue(j, 23, i);
            }
        }
    }

    public void setEnableQuic(int i) {
        long j = this.mHandle;
        if (j != 0) {
            if (i == 0 || i == 1) {
                _setIntValue(j, 28, i);
            }
        }
    }

    public void setEnableServerHost(int i) {
        long j = this.mHandle;
        if (j != 0) {
            if (i == 0 || i == 1) {
                _setIntValue(j, 17, i);
            }
        }
    }

    public void setEnableUpHost(int i) {
        long j = this.mHandle;
        if (j != 0) {
            if (i == 0 || i == 1) {
                _setIntValue(j, 18, i);
            }
        }
    }

    public void setEvStateEnable(boolean z) {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        _setIntValue(j, 79, z ? 1 : 0);
    }

    public void setExternFileReader(TTExternFileReader tTExternFileReader) {
        long j = this.mHandle;
        if (j == 0 || tTExternFileReader == null) {
            return;
        }
        _setObject(j, 200, tTExternFileReader);
    }

    public void setExternLogInfo(JSONObject jSONObject) {
        this.mJsonInfo = jSONObject;
    }

    public void setExternMinSIze(int i) {
        long j = this.mHandle;
        if (j == 0 || i <= 0) {
            return;
        }
        _setIntValue(j, 77, i);
    }

    public void setExternNetInfo(String str) {
        long j = this.mHandle;
        if (j == 0 || str == null) {
            return;
        }
        _setStringValue(j, 41, str);
    }

    public void setFileRetryCount(int i) {
        long j = this.mHandle;
        if (j == 0 || i < 0) {
            return;
        }
        _setIntValue(j, 6, i);
    }

    public void setFileUploadDomain(String str) {
        setStringValue(2, str);
    }

    public void setHandler(Handler handler) {
        this.mHandler = handler;
    }

    public void setListener(TTVideoUploaderListener tTVideoUploaderListener) {
        this.mListener = tTVideoUploaderListener;
    }

    public void setMaxFailTime(int i) {
        long j = this.mHandle;
        if (j == 0 || i < 0) {
            return;
        }
        _setIntValue(j, 13, i);
    }

    public void setMediaDataReader(TTMediaDataReader tTMediaDataReader) {
        long j = this.mHandle;
        if (j == 0 || tTMediaDataReader == null) {
            return;
        }
        _setObject(j, 201, tTMediaDataReader);
    }

    public void setNetworkRoutMode(int i, int i2) {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        _setIntValue(j, 86, i);
        _setIntValue(this.mHandle, 87, i2);
        Log.v("ttmn", "weight" + i2);
    }

    public void setNewHttpProxyLoader(int i) {
        long j = this.mHandle;
        if (j != 0) {
            if (i == 0 || i == 1) {
                _setIntValue(j, 40, i);
            }
        }
    }

    public void setOpenBoe(boolean z) {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        if (z) {
            _setIntValue(j, 67, 1);
        } else {
            _setIntValue(j, 67, 0);
        }
    }

    public void setOpenResume(boolean z) {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        if (z) {
            _setIntValue(j, 70, 1);
        } else {
            _setIntValue(j, 70, 0);
        }
    }

    public void setPathName(String str) {
        setStringValue(0, str);
    }

    public void setPolicyParams(TreeMap<String, Object> treeMap) {
        if (this.mHandle == 0 || treeMap == null) {
            return;
        }
        String mapToString = TTUploadUtil.mapToString(treeMap);
        if (TextUtils.isEmpty(mapToString)) {
            return;
        }
        setStringValue(55, mapToString);
    }

    public void setPoster(float f2) {
        long j = this.mHandle;
        if (j == 0 || f2 < 0.0f) {
            return;
        }
        _setPoster(j, f2);
    }

    public void setPreUploadEncryptionMode(int i) {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        _setIntValue(j, 74, i);
    }

    public void setPrivateVideo(boolean z) {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        if (z) {
            _setIntValue(j, 88, 1);
        } else {
            _setIntValue(j, 88, 0);
        }
    }

    public void setResponeTimeOut(int i) {
        long j = this.mHandle;
        if (j == 0 || i < 0) {
            return;
        }
        _setIntValue(j, 76, i);
    }

    public void setScenesTag(String str) {
        long j = this.mHandle;
        if (j == 0 || str == null) {
            return;
        }
        _setStringValue(j, 85, str);
    }

    public void setServerParameter(String str) {
        long j = this.mHandle;
        if (j == 0 || str == null) {
            return;
        }
        _setStringValue(j, 16, str);
    }

    public void setSliceReTryCount(int i) {
        long j = this.mHandle;
        if (j == 0 || i < 0) {
            return;
        }
        _setIntValue(j, 5, i);
    }

    public void setSliceSize(int i) {
        long j = this.mHandle;
        if (j == 0 || i < 0) {
            return;
        }
        _setIntValue(j, 8, i);
    }

    public void setSliceTimeout(int i) {
        long j = this.mHandle;
        if (j == 0 || i < 0) {
            return;
        }
        _setIntValue(j, 7, i);
    }

    public void setSocketNum(int i) {
        long j = this.mHandle;
        if (j == 0 || i < 0) {
            return;
        }
        _setIntValue(j, 9, i);
    }

    public void setStringValue(int i, String str) {
        long j = this.mHandle;
        if (j == 0 || str == null) {
            return;
        }
        _setStringValue(j, i, str);
    }

    public void setTTExternLoader(TTExternNetLoader tTExternNetLoader) {
        long j = this.mHandle;
        if (j == 0 || tTExternNetLoader == null) {
            return;
        }
        _setObject(j, 27, tTExternNetLoader);
    }

    public void setTcpOpenTimeOutMilliSec(int i) {
        long j = this.mHandle;
        if (j == 0 || i < 0) {
            return;
        }
        _setIntValue(j, 24, i);
    }

    public void setTestSpeed(boolean z) {
        if (this.mHandle == 0) {
            return;
        }
        this.mIsTestSpeed = z;
    }

    public void setTotalTimeout(int i) {
        long j = this.mHandle;
        if (j == 0 || i < 0) {
            return;
        }
        _setIntValue(j, 89, i);
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
        _setIntValue(j, 64, i);
    }

    public void setUploadCookie(String str) {
        setStringValue(4, str);
    }

    public void setUserKey(String str) {
        setStringValue(1, str);
    }

    public void setUserRefrence(String str) {
        long j = this.mHandle;
        if (j == 0 || str == null) {
            return;
        }
        _setStringValue(j, 62, str);
    }

    public void setVideoObjectType(String str) {
        if (this.mHandle == 0 || str == null || str.equals("")) {
            return;
        }
        setStringValue(54, str);
    }

    public void setVideoUploadDomain(String str) {
        setStringValue(3, str);
    }

    public void start() {
        this.mReadLock.lock();
        try {
            if (this.mHandle != 0) {
                this.mState = 1;
                this.mSartTime = System.currentTimeMillis();
                _start(this.mHandle);
            }
        } finally {
            this.mReadLock.unlock();
        }
    }

    public void startSpeedTest(int i, int i2, int i3) {
        this.mReadLock.lock();
        try {
            if (this.mHandle != 0) {
                this.mState = 1;
                this.mSartTime = System.currentTimeMillis();
                _startSpeedTest(this.mHandle, i, i2, i3);
            }
        } finally {
            this.mReadLock.unlock();
        }
    }

    public void stop() {
        this.mWriteLock.lock();
        try {
            if (this.mHandle != 0) {
                String dnsip = getDNSIP();
                if (dnsip != null && !dnsip.isEmpty()) {
                    setStringValue(75, dnsip);
                }
                addLogToManager(_stop(this.mHandle));
                this.mState = 4;
            }
        } finally {
            this.mWriteLock.unlock();
        }
    }

    public void stopSpeedTest() {
        this.mReadLock.lock();
        long j = this.mHandle;
        if (j == 0) {
            this.mReadLock.unlock();
        } else {
            _stopSpeedTest(j);
            this.mReadLock.unlock();
        }
    }

    public int switchNetType(int i) {
        TTVideoUploaderAbstractListener tTVideoUploaderAbstractListener = this.mAbstractListener;
        return (tTVideoUploaderAbstractListener == null || !tTVideoUploaderAbstractListener.switchNetType(i)) ? 0 : 1;
    }

    public void close(int i) {
        this.mWriteLock.lock();
        try {
            if (this.mHandle != 0) {
                String dnsip = getDNSIP();
                if (dnsip != null && !dnsip.isEmpty()) {
                    setStringValue(75, dnsip);
                }
                String _close = _close(this.mHandle, i);
                if (i != 0) {
                    addLogToManager(_close);
                }
                this.mHandle = 0L;
                this.mState = 5;
                this.mHandler.removeCallbacksAndMessages(null);
            }
        } finally {
            this.mWriteLock.unlock();
        }
    }

    public TTVideoUploader() throws Exception {
        this.mState = -1;
        this.mHandler = null;
        try {
            this.mHandle = _create(0);
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
            getDNSIP();
            this.mState = 0;
            this.mIsTestSpeed = false;
            this.mHeaders = new String[20];
            for (int i = 0; i < 20; i++) {
                this.mHeaders[i] = null;
            }
            this.headerIndex = 0;
            return;
        }
        throw new Exception("create native uploader fail");
    }
}
