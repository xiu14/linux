package com.ss.android.socialbase.downloader.model;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import com.ss.android.socialbase.downloader.constants.AsyncHandleStatus;
import com.ss.android.socialbase.downloader.constants.ByteInvalidRetryStatus;
import com.ss.android.socialbase.downloader.constants.DbJsonConstants;
import com.ss.android.socialbase.downloader.constants.DownloadConstants;
import com.ss.android.socialbase.downloader.constants.DownloadStatus;
import com.ss.android.socialbase.downloader.constants.EnqueueType;
import com.ss.android.socialbase.downloader.constants.SpJsonConstants;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.file.DownloadFile;
import com.ss.android.socialbase.downloader.logger.Logger;
import com.ss.android.socialbase.downloader.service.DownloadServiceManager;
import com.ss.android.socialbase.downloader.service.IDownloadComponentManagerService;
import com.ss.android.socialbase.downloader.service.IDownloadIdGeneratorService;
import com.ss.android.socialbase.downloader.service.IDownloadProcessDispatcherService;
import com.ss.android.socialbase.downloader.setting.DownloadSetting;
import com.ss.android.socialbase.downloader.utils.DownloadDirUtils;
import com.ss.android.socialbase.downloader.utils.DownloadUtils;
import e.a.a.a.a;
import java.io.File;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class DownloadInfo implements Parcelable {
    public static final Parcelable.Creator<DownloadInfo> CREATOR = new Parcelable.Creator<DownloadInfo>() { // from class: com.ss.android.socialbase.downloader.model.DownloadInfo.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DownloadInfo createFromParcel(Parcel parcel) {
            return new DownloadInfo(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DownloadInfo[] newArray(int i) {
            return new DownloadInfo[i];
        }
    };
    private static final int DEFAULT_MAX_PROCESS_POST_COUNT = 100;
    private static final long DEFAULT_MIN_BYTES_INTERVAL = 1048576;
    private static final int RESERVE_STATUS_NEVER = 0;
    private static final int RESERVE_STATUS_NOW = 2;
    private static final int RESERVE_STATUS_ONCE = 1;
    private static final String TAG = "DownloadInfo";
    private List<String> accessHttpHeaderKeys;
    private boolean addListenerToSameTask;
    private boolean addTTNetCommonParam;
    private AtomicLong allConnectTime;
    private int appVersionCode;
    private AsyncHandleStatus asyncHandleStatus;
    private boolean autoResumed;
    private int backUpUrlRetryCount;
    private boolean backUpUrlUsed;
    private List<String> backUpUrls;
    private String backUpUrlsStr;
    private int bindValueCount;
    private ByteInvalidRetryStatus byteInvalidRetryStatus;
    private long cacheLifeTimeMax;
    private List<String> cdnUrls;
    private String cdnUrlsStr;
    private int chunkCount;
    private String contentEncoding;
    private int curBackUpUrlIndex;
    private AtomicLong curBytes;
    private int curNetworkRetryCount;
    private int curRetryTime;
    private JSONObject dbJsonData;
    private String dbJsonDataString;
    private boolean deleteCacheIfCheckFailed;
    private long downloadFinishTimeStamp;
    private long downloadStartTimeStamp;
    private long downloadTime;
    private String eTag;
    private EnqueueType enqueueType;
    private boolean expiredHttpCheck;
    private boolean expiredRedownload;
    private String extra;
    private List<HttpHeader> extraHeaders;
    private int[] extraMonitorStatus;
    private BaseException failedException;
    private String filePackageName;
    private List<String> forbiddenBackupUrls;
    private boolean force;
    private boolean hasDoInstallation;
    private Map<String, String> httpHeaders;
    private int httpStatusCode;
    private String httpStatusMessage;
    private boolean httpsToHttpRetryUsed;
    private String iconUrl;
    private int id;
    private boolean ignoreDataVerify;
    private Boolean ignoreInterceptor;
    private long installedTimeStamp;
    private int interceptFlag;
    private Boolean isAutoInstallWithoutNotification;
    private boolean isCacheExistsInDownloading;
    private boolean isFirstDownload;
    private boolean isFirstSuccess;
    private boolean isForbiddenRetryed;
    private AtomicLong lastNotifyProgressTime;
    private boolean mDownloadFromReserveWifi;
    private int maxBytes;
    private int maxProgressCount;
    private String md5;
    private String mimeType;
    private int minProgressTimeMsInterval;
    private String monitorScene;
    private String name;
    private boolean needDefaultHttpServiceBackUp;
    private boolean needHttpsToHttpRetry;
    private boolean needIndependentProcess;
    private boolean needPostProgress;
    private boolean needSDKMonitor;
    private String networkQuality;
    private int notificationVisibility;
    private boolean onlyWifi;
    private boolean openLimitSpeed;
    private String[] outIp;
    private int[] outSize;
    private SoftReference<PackageInfo> packageInfoRef;
    private String packageName;
    private JSONObject pcdnStats;
    private List<String> pcdnUrls;
    private String pcdnUrlsStr;
    private long realDownloadTime;
    private long realStartDownloadTime;
    private int retryCount;
    private String savePath;
    private boolean showNotification;
    private boolean showNotificationForAutoResumed;
    private boolean showNotificationForNetworkResumed;
    private JSONObject spData;
    private long startDownloadTime;
    private AtomicInteger status;
    private int statusAtDbInit;
    private boolean successByCache;
    private boolean supportPartial;
    private ConcurrentHashMap<String, Object> tempCacheData;
    private String tempPath;
    private long throttleNetSpeed;
    private int throttleSmoothness;
    private String title;
    private long totalBytes;
    private long ttnetProtectTimeout;
    private String url;
    private long xTotalBytes;

    public static class RawBuilder extends Builder {
        public String backUpUrlsStr;
        public String cdnUrlsStr;
        public int chunkCount;
        public long curBytes;
        public int curRetryTime;
        public String dbJsonDataString;
        public long downloadFinishTimeStamp;
        public long downloadStartTimeStamp;
        public long downloadTime;
        public String etag;
        public boolean hasDoInstallation;
        public int id;
        public long installedTimeStamp;
        public boolean isFirstDownload;
        public boolean isFirstSuccess;
        public int notificationVisibility;
        public String pcdnUrlsStr;
        public long realDownloadTime;
        public int status;
        public long totalBytes;

        @Override // com.ss.android.socialbase.downloader.model.DownloadInfo.Builder
        public DownloadInfo build() {
            return new DownloadInfo(this);
        }
    }

    private void convertEnqueueType(int i) {
        EnqueueType enqueueType = EnqueueType.ENQUEUE_HEAD;
        if (i == 1) {
            this.enqueueType = enqueueType;
            return;
        }
        EnqueueType enqueueType2 = EnqueueType.ENQUEUE_TAIL;
        if (i == 2) {
            this.enqueueType = enqueueType2;
        } else {
            this.enqueueType = EnqueueType.ENQUEUE_NONE;
        }
    }

    private JSONObject convertStrToJson(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            return new JSONObject(str);
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    private void ensureDBJsonData() {
        if (this.dbJsonData == null) {
            synchronized (this) {
                if (this.dbJsonData == null) {
                    try {
                        if (TextUtils.isEmpty(this.dbJsonDataString)) {
                            this.dbJsonData = new JSONObject();
                        } else {
                            this.dbJsonData = new JSONObject(this.dbJsonDataString);
                            this.dbJsonDataString = null;
                        }
                    } catch (Throwable unused) {
                        this.dbJsonData = new JSONObject();
                    }
                }
            }
        }
    }

    private void ensureSpData() {
        if (this.spData == null) {
            Context appContext = ((IDownloadComponentManagerService) DownloadServiceManager.getService(IDownloadComponentManagerService.class)).getAppContext();
            if (appContext != null) {
                String string = appContext.getSharedPreferences(DownloadConstants.SP_DOWNLOAD_INFO, 0).getString(Long.toString(getId()), "");
                if (!TextUtils.isEmpty(string)) {
                    try {
                        this.spData = new JSONObject(string);
                    } catch (JSONException e2) {
                        e2.printStackTrace();
                    }
                }
            }
            if (this.spData == null) {
                this.spData = new JSONObject();
            }
        }
    }

    private void ensureTempCacheData() {
        if (this.tempCacheData == null) {
            synchronized (this) {
                if (this.tempCacheData == null) {
                    this.tempCacheData = new ConcurrentHashMap<>();
                }
            }
        }
    }

    private int getReserveWifiStatus() {
        ensureSpData();
        try {
            return this.spData.optInt(SpJsonConstants.PAUSE_RESERVE_ON_WIFI, 0);
        } catch (Exception unused) {
            return 0;
        }
    }

    private void mergeAuxiliaryJSONObject(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        ensureDBJsonData();
        synchronized (this.dbJsonData) {
            try {
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    Object opt = jSONObject.opt(next);
                    if (!this.dbJsonData.has(next) && opt != null) {
                        this.dbJsonData.put(next, opt);
                    }
                }
            } catch (Exception unused) {
            }
            this.dbJsonDataString = null;
        }
        parseMonitorSetting();
    }

    private void parseMonitorSetting() {
        ensureDBJsonData();
        this.needSDKMonitor = this.dbJsonData.optBoolean(DbJsonConstants.NEED_SDK_MONITOR, false);
        this.monitorScene = this.dbJsonData.optString(DbJsonConstants.MONITOR_SCENE, "");
        JSONArray optJSONArray = this.dbJsonData.optJSONArray(DbJsonConstants.EXTRA_MONITOR_STATUS);
        if (optJSONArray == null || optJSONArray.length() <= 0) {
            return;
        }
        this.extraMonitorStatus = new int[optJSONArray.length()];
        for (int i = 0; i < optJSONArray.length(); i++) {
            this.extraMonitorStatus[i] = optJSONArray.optInt(i);
        }
    }

    private void putMonitorSetting() {
        safePutToDBJsonData(DbJsonConstants.NEED_SDK_MONITOR, Boolean.valueOf(this.needSDKMonitor));
        safePutToDBJsonData(DbJsonConstants.MONITOR_SCENE, this.monitorScene);
        try {
            JSONArray jSONArray = new JSONArray();
            int[] iArr = this.extraMonitorStatus;
            if (iArr != null && iArr.length > 0) {
                int i = 0;
                while (true) {
                    int[] iArr2 = this.extraMonitorStatus;
                    if (i >= iArr2.length) {
                        break;
                    }
                    jSONArray.put(iArr2[i]);
                    i++;
                }
            }
            safePutToDBJsonData(DbJsonConstants.EXTRA_MONITOR_STATUS, jSONArray);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void refreshBackupUrls(boolean z) {
        List<String> list = this.forbiddenBackupUrls;
        if (list == null || list.size() <= z) {
            return;
        }
        List<String> list2 = this.backUpUrls;
        if (list2 == null) {
            this.backUpUrls = new ArrayList();
        } else {
            list2.clear();
        }
        this.backUpUrlUsed = false;
        this.curBackUpUrlIndex = 0;
        for (int i = z; i < this.forbiddenBackupUrls.size(); i++) {
            this.backUpUrls.add(this.forbiddenBackupUrls.get(i));
        }
    }

    private void setBackUpUrlsStr(String str) {
        if (TextUtils.isEmpty(str) || getStatus() == -3) {
            return;
        }
        this.backUpUrlsStr = str;
        this.backUpUrls = DownloadUtils.jsonStringTolist(str);
    }

    public void bindValue(SQLiteStatement sQLiteStatement) {
        if (sQLiteStatement == null) {
            return;
        }
        this.bindValueCount = 0;
        sQLiteStatement.clearBindings();
        int i = this.bindValueCount + 1;
        this.bindValueCount = i;
        sQLiteStatement.bindLong(i, this.id);
        int i2 = this.bindValueCount + 1;
        this.bindValueCount = i2;
        String str = this.url;
        if (str == null) {
            str = "";
        }
        sQLiteStatement.bindString(i2, str);
        int i3 = this.bindValueCount + 1;
        this.bindValueCount = i3;
        String str2 = this.savePath;
        if (str2 == null) {
            str2 = "";
        }
        sQLiteStatement.bindString(i3, str2);
        int i4 = this.bindValueCount + 1;
        this.bindValueCount = i4;
        String str3 = this.tempPath;
        if (str3 == null) {
            str3 = "";
        }
        sQLiteStatement.bindString(i4, str3);
        int i5 = this.bindValueCount + 1;
        this.bindValueCount = i5;
        String str4 = this.name;
        if (str4 == null) {
            str4 = "";
        }
        sQLiteStatement.bindString(i5, str4);
        int i6 = this.bindValueCount + 1;
        this.bindValueCount = i6;
        sQLiteStatement.bindLong(i6, this.chunkCount);
        int i7 = this.bindValueCount + 1;
        this.bindValueCount = i7;
        sQLiteStatement.bindLong(i7, getStatus());
        int i8 = this.bindValueCount + 1;
        this.bindValueCount = i8;
        sQLiteStatement.bindLong(i8, getCurBytes());
        int i9 = this.bindValueCount + 1;
        this.bindValueCount = i9;
        sQLiteStatement.bindLong(i9, this.totalBytes);
        int i10 = this.bindValueCount + 1;
        this.bindValueCount = i10;
        String str5 = this.eTag;
        if (str5 == null) {
            str5 = "";
        }
        sQLiteStatement.bindString(i10, str5);
        int i11 = this.bindValueCount + 1;
        this.bindValueCount = i11;
        sQLiteStatement.bindLong(i11, this.onlyWifi ? 1L : 0L);
        int i12 = this.bindValueCount + 1;
        this.bindValueCount = i12;
        sQLiteStatement.bindLong(i12, this.force ? 1L : 0L);
        int i13 = this.bindValueCount + 1;
        this.bindValueCount = i13;
        sQLiteStatement.bindLong(i13, this.retryCount);
        int i14 = this.bindValueCount + 1;
        this.bindValueCount = i14;
        String str6 = this.extra;
        if (str6 == null) {
            str6 = "";
        }
        sQLiteStatement.bindString(i14, str6);
        int i15 = this.bindValueCount + 1;
        this.bindValueCount = i15;
        String str7 = this.mimeType;
        if (str7 == null) {
            str7 = "";
        }
        sQLiteStatement.bindString(i15, str7);
        int i16 = this.bindValueCount + 1;
        this.bindValueCount = i16;
        String str8 = this.title;
        if (str8 == null) {
            str8 = "";
        }
        sQLiteStatement.bindString(i16, str8);
        int i17 = this.bindValueCount + 1;
        this.bindValueCount = i17;
        sQLiteStatement.bindLong(i17, this.showNotification ? 1L : 0L);
        int i18 = this.bindValueCount + 1;
        this.bindValueCount = i18;
        sQLiteStatement.bindLong(i18, this.notificationVisibility);
        int i19 = this.bindValueCount + 1;
        this.bindValueCount = i19;
        sQLiteStatement.bindLong(i19, this.isFirstDownload ? 1L : 0L);
        int i20 = this.bindValueCount + 1;
        this.bindValueCount = i20;
        sQLiteStatement.bindLong(i20, this.isFirstSuccess ? 1L : 0L);
        int i21 = this.bindValueCount + 1;
        this.bindValueCount = i21;
        sQLiteStatement.bindLong(i21, this.needHttpsToHttpRetry ? 1L : 0L);
        int i22 = this.bindValueCount + 1;
        this.bindValueCount = i22;
        sQLiteStatement.bindLong(i22, this.downloadTime);
        int i23 = this.bindValueCount + 1;
        this.bindValueCount = i23;
        String str9 = this.packageName;
        if (str9 == null) {
            str9 = "";
        }
        sQLiteStatement.bindString(i23, str9);
        int i24 = this.bindValueCount + 1;
        this.bindValueCount = i24;
        String str10 = this.md5;
        if (str10 == null) {
            str10 = "";
        }
        sQLiteStatement.bindString(i24, str10);
        int i25 = this.bindValueCount + 1;
        this.bindValueCount = i25;
        sQLiteStatement.bindLong(i25, 0L);
        int i26 = this.bindValueCount + 1;
        this.bindValueCount = i26;
        sQLiteStatement.bindLong(i26, this.curRetryTime);
        int i27 = this.bindValueCount + 1;
        this.bindValueCount = i27;
        sQLiteStatement.bindLong(i27, 0L);
        int i28 = this.bindValueCount + 1;
        this.bindValueCount = i28;
        sQLiteStatement.bindLong(i28, this.needDefaultHttpServiceBackUp ? 1L : 0L);
        int i29 = this.bindValueCount + 1;
        this.bindValueCount = i29;
        sQLiteStatement.bindLong(i29, 0L);
        int i30 = this.bindValueCount + 1;
        this.bindValueCount = i30;
        sQLiteStatement.bindString(i30, "");
        int i31 = this.bindValueCount + 1;
        this.bindValueCount = i31;
        sQLiteStatement.bindLong(i31, 0L);
        int i32 = this.bindValueCount + 1;
        this.bindValueCount = i32;
        sQLiteStatement.bindString(i32, getBackUpUrlsStr());
        int i33 = this.bindValueCount + 1;
        this.bindValueCount = i33;
        sQLiteStatement.bindLong(i33, this.backUpUrlRetryCount);
        int i34 = this.bindValueCount + 1;
        this.bindValueCount = i34;
        sQLiteStatement.bindLong(i34, this.realDownloadTime);
        int i35 = this.bindValueCount + 1;
        this.bindValueCount = i35;
        sQLiteStatement.bindLong(i35, 0L);
        int i36 = this.bindValueCount + 1;
        this.bindValueCount = i36;
        sQLiteStatement.bindLong(i36, this.needIndependentProcess ? 1L : 0L);
        int i37 = this.bindValueCount + 1;
        this.bindValueCount = i37;
        sQLiteStatement.bindString(i37, getDBJsonDataString());
        int i38 = this.bindValueCount + 1;
        this.bindValueCount = i38;
        String str11 = this.iconUrl;
        if (str11 == null) {
            str11 = "";
        }
        sQLiteStatement.bindString(i38, str11);
        int i39 = this.bindValueCount + 1;
        this.bindValueCount = i39;
        sQLiteStatement.bindLong(i39, this.appVersionCode);
        int i40 = this.bindValueCount + 1;
        this.bindValueCount = i40;
        sQLiteStatement.bindString(i40, "");
        int i41 = this.bindValueCount + 1;
        this.bindValueCount = i41;
        sQLiteStatement.bindLong(i41, this.downloadStartTimeStamp);
        int i42 = this.bindValueCount + 1;
        this.bindValueCount = i42;
        sQLiteStatement.bindLong(i42, this.downloadFinishTimeStamp);
        int i43 = this.bindValueCount + 1;
        this.bindValueCount = i43;
        sQLiteStatement.bindLong(i43, this.installedTimeStamp);
        int i44 = this.bindValueCount + 1;
        this.bindValueCount = i44;
        sQLiteStatement.bindLong(i44, this.hasDoInstallation ? 1L : 0L);
        int i45 = this.bindValueCount + 1;
        this.bindValueCount = i45;
        sQLiteStatement.bindLong(i45, this.cacheLifeTimeMax);
        int i46 = this.bindValueCount + 1;
        this.bindValueCount = i46;
        sQLiteStatement.bindString(i46, getPcdnUrlsStr());
        int i47 = this.bindValueCount + 1;
        this.bindValueCount = i47;
        sQLiteStatement.bindString(i47, getCdnUrlsStr());
    }

    public boolean cacheExpierd() {
        if (isDownloaded()) {
            return DownloadUtils.cacheExpired(this);
        }
        return true;
    }

    public boolean canNotifyProgress() {
        long j = this.lastNotifyProgressTime.get();
        return j == 0 || SystemClock.uptimeMillis() - j > 20;
    }

    public boolean canReStartAsyncTask() {
        return getStatus() != -3 && this.asyncHandleStatus == AsyncHandleStatus.ASYNC_HANDLE_WAITING;
    }

    public boolean canReplaceHttpForRetry() {
        return !TextUtils.isEmpty(this.url) && this.url.startsWith("https") && this.needHttpsToHttpRetry && !this.httpsToHttpRetryUsed;
    }

    public boolean canShowNotification() {
        boolean z = this.autoResumed;
        return (!z && this.showNotification) || (z && (this.showNotificationForAutoResumed || this.showNotificationForNetworkResumed));
    }

    public boolean canSkipStatusHandler() {
        AsyncHandleStatus asyncHandleStatus;
        return getStatus() == 8 || (asyncHandleStatus = this.asyncHandleStatus) == AsyncHandleStatus.ASYNC_HANDLE_WAITING || asyncHandleStatus == AsyncHandleStatus.ASYNC_HANDLE_RESTART || this.byteInvalidRetryStatus == ByteInvalidRetryStatus.BYTE_INVALID_RETRY_STATUS_RESTART;
    }

    public void changeSkipStatus() {
        AsyncHandleStatus asyncHandleStatus;
        if (getStatus() == 8 || (asyncHandleStatus = this.asyncHandleStatus) == AsyncHandleStatus.ASYNC_HANDLE_WAITING || asyncHandleStatus == AsyncHandleStatus.ASYNC_HANDLE_RESTART) {
            setAsyncHandleStatus(AsyncHandleStatus.ASYNC_HANDLE_DOWNLOADING);
        }
        if (this.byteInvalidRetryStatus == ByteInvalidRetryStatus.BYTE_INVALID_RETRY_STATUS_RESTART) {
            setByteInvalidRetryStatus(ByteInvalidRetryStatus.BYTE_INVALID_RETRY_STATUS_DOWNLOADING);
        }
    }

    public int checkMd5Status() {
        return DownloadUtils.checkMd5Status(new DownloadFile(getSavePath(), getName()), this.md5);
    }

    public boolean checkMd5Valid() {
        return DownloadUtils.checkMd5Valid(getSavePath(), getName(), this.md5);
    }

    public void copyFromCacheData(DownloadInfo downloadInfo, boolean z) {
        if (downloadInfo == null) {
            return;
        }
        setChunkCount(downloadInfo.getChunkCount());
        setTotalBytes(downloadInfo.getTotalBytes());
        setCurBytes(downloadInfo.getCurBytes(), true);
        this.realDownloadTime = downloadInfo.realDownloadTime;
        if (downloadInfo.canSkipStatusHandler() || canSkipStatusHandler()) {
            this.curRetryTime = downloadInfo.getCurRetryTime();
        } else {
            this.curRetryTime = 0;
            this.isForbiddenRetryed = false;
            this.backUpUrlUsed = false;
            this.curBackUpUrlIndex = 0;
            this.httpsToHttpRetryUsed = false;
        }
        seteTag(downloadInfo.geteTag());
        setMimeType(downloadInfo.getMimeType());
        if (z) {
            setStatus(downloadInfo.getStatus());
        }
        this.isFirstDownload = downloadInfo.getIsFirstDownload();
        this.isFirstSuccess = downloadInfo.isFirstSuccess();
        this.downloadStartTimeStamp = downloadInfo.getDownloadStartTimeStamp();
        this.downloadFinishTimeStamp = downloadInfo.getDownloadFinishTimeStamp();
        this.installedTimeStamp = downloadInfo.getInstalledTimeStamp();
        this.hasDoInstallation = downloadInfo.hasDoInstallation;
        mergeAuxiliaryJSONObject(downloadInfo.dbJsonData);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equalsTask(DownloadInfo downloadInfo) {
        String str;
        String str2;
        return (downloadInfo == null || (str = this.url) == null || !str.equals(downloadInfo.getUrl()) || (str2 = this.savePath) == null || !str2.equals(downloadInfo.getSavePath())) ? false : true;
    }

    public void erase() {
        setCurBytes(0L, true);
        this.totalBytes = 0L;
        this.chunkCount = 1;
        this.downloadTime = 0L;
        this.realStartDownloadTime = 0L;
        this.realDownloadTime = 0L;
        this.curRetryTime = 0;
        this.isFirstDownload = true;
        this.isFirstSuccess = true;
        this.backUpUrlUsed = false;
        this.httpsToHttpRetryUsed = false;
        this.eTag = null;
        this.failedException = null;
        this.tempCacheData = null;
        this.packageInfoRef = null;
    }

    public List<String> getAccessHttpHeaderKeys() {
        return this.accessHttpHeaderKeys;
    }

    public long getAllConnectTime() {
        ensureDBJsonData();
        if (this.allConnectTime == null) {
            this.allConnectTime = new AtomicLong(this.dbJsonData.optLong(DbJsonConstants.DBJSON_KEY_ALL_CONNECT_TIME));
        }
        return this.allConnectTime.get();
    }

    public int getAntiHijackErrorCode(int i) {
        ensureDBJsonData();
        return this.dbJsonData.optInt(DbJsonConstants.DBJSON_KEY_ANTI_HIJACK_ERROR_CODE, i);
    }

    public int getAppVersionCode() {
        return this.appVersionCode;
    }

    public AsyncHandleStatus getAsyncHandleStatus() {
        return this.asyncHandleStatus;
    }

    public String getBackUpUrl() {
        List<String> list;
        int i;
        if (this.backUpUrlUsed && (list = this.backUpUrls) != null && list.size() > 0 && (i = this.curBackUpUrlIndex) >= 0 && i < this.backUpUrls.size()) {
            String str = this.backUpUrls.get(this.curBackUpUrlIndex);
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
        }
        return "";
    }

    public int getBackUpUrlRetryCount() {
        return this.backUpUrlRetryCount;
    }

    public List<String> getBackUpUrls() {
        return this.backUpUrls;
    }

    public String getBackUpUrlsStr() {
        if (this.backUpUrlsStr == null) {
            this.backUpUrlsStr = DownloadUtils.listToJsonString(this.backUpUrls);
        }
        return this.backUpUrlsStr;
    }

    public int getBindValueCount() {
        return this.bindValueCount;
    }

    public ByteInvalidRetryStatus getByteInvalidRetryStatus() {
        return this.byteInvalidRetryStatus;
    }

    public long getCacheExpiredTime() {
        ensureSpData();
        try {
            return this.spData.optLong(SpJsonConstants.CACHE_CONTROL_EXPIRED_TIME, -1L);
        } catch (Exception unused) {
            return -1L;
        }
    }

    public long getCacheLifeTimeMax() {
        return this.cacheLifeTimeMax;
    }

    public List<String> getCdnUrls() {
        return this.cdnUrls;
    }

    public String getCdnUrlsStr() {
        if (this.cdnUrlsStr == null) {
            this.cdnUrlsStr = DownloadUtils.listToJsonString(this.cdnUrls);
        }
        return this.cdnUrlsStr;
    }

    @Deprecated
    public int getChunkCount() {
        return this.chunkCount;
    }

    public String getConnectionUrl() {
        List<String> list;
        int i;
        List<String> list2;
        String str = this.url;
        if (getStatus() == 8 && (list2 = this.forbiddenBackupUrls) != null && !list2.isEmpty() && !this.backUpUrlUsed) {
            return this.forbiddenBackupUrls.get(0);
        }
        if (!this.backUpUrlUsed || (list = this.backUpUrls) == null || list.size() <= 0 || (i = this.curBackUpUrlIndex) < 0 || i >= this.backUpUrls.size()) {
            return (!TextUtils.isEmpty(this.url) && this.url.startsWith("https") && this.needHttpsToHttpRetry && this.httpsToHttpRetryUsed) ? this.url.replaceFirst("https", "http") : str;
        }
        String str2 = this.backUpUrls.get(this.curBackUpUrlIndex);
        return !TextUtils.isEmpty(str2) ? str2 : str;
    }

    public String getContentEncoding() {
        return this.contentEncoding;
    }

    public int getCurBackUpUrlIndex() {
        return this.curBackUpUrlIndex;
    }

    public long getCurBytes() {
        AtomicLong atomicLong = this.curBytes;
        if (atomicLong != null) {
            return atomicLong.get();
        }
        return 0L;
    }

    public int getCurNetworkRetryCount() {
        return this.curNetworkRetryCount;
    }

    public int getCurRetryTime() {
        return this.curRetryTime;
    }

    public int getCurRetryTimeInTotal() {
        int i = this.curRetryTime;
        if (!this.backUpUrlUsed) {
            return i;
        }
        int i2 = i + this.retryCount;
        int i3 = this.curBackUpUrlIndex;
        return i3 > 0 ? i2 + (i3 * this.backUpUrlRetryCount) : i2;
    }

    public String getDBJsonDataString() {
        String jSONObject;
        String str = this.dbJsonDataString;
        if (str != null) {
            return str;
        }
        ensureDBJsonData();
        synchronized (this.dbJsonData) {
            jSONObject = this.dbJsonData.toString();
            this.dbJsonDataString = jSONObject;
        }
        return jSONObject;
    }

    public int getDBJsonInt(String str) {
        ensureDBJsonData();
        return this.dbJsonData.optInt(str);
    }

    public String getDBJsonString(String str) {
        ensureDBJsonData();
        return this.dbJsonData.optString(str);
    }

    public long getDownloadFinishTimeStamp() {
        return this.downloadFinishTimeStamp;
    }

    public long getDownloadPrepareTime() {
        ensureDBJsonData();
        return this.dbJsonData.optLong(DbJsonConstants.DBJSON_KEY_DOWNLOAD_PREPARE_TIME);
    }

    public int getDownloadProcess() {
        if (this.totalBytes <= 0) {
            return 0;
        }
        if (getCurBytes() > this.totalBytes) {
            return 100;
        }
        return (int) ((getCurBytes() * 100) / this.totalBytes);
    }

    public String getDownloadSettingString() {
        ensureDBJsonData();
        return this.dbJsonData.optString(DbJsonConstants.DOWNLOAD_SETTING);
    }

    public double getDownloadSpeed() {
        double curBytes = getCurBytes() / 1048576.0d;
        double realDownloadTime = getRealDownloadTime() / 1000.0d;
        if (curBytes <= 0.0d || realDownloadTime <= 0.0d) {
            return -1.0d;
        }
        return curBytes / realDownloadTime;
    }

    public long getDownloadStartTimeStamp() {
        return this.downloadStartTimeStamp;
    }

    public long getDownloadTime() {
        return this.downloadTime;
    }

    public long getEndOffset() {
        ensureDBJsonData();
        return this.dbJsonData.optLong(DbJsonConstants.DBJSON_KEY_END_OFFSET, -1L);
    }

    public EnqueueType getEnqueueType() {
        return this.enqueueType;
    }

    public int getExecutorGroup() {
        ensureDBJsonData();
        return this.dbJsonData.optInt(DbJsonConstants.DBJSON_KEY_EXECUTOR, 2);
    }

    public long getExpectFileLength() {
        ensureDBJsonData();
        return this.dbJsonData.optLong(DbJsonConstants.DBJSON_KEY_EXPECT_FILE_LENGTH);
    }

    public String getExtra() {
        return this.extra;
    }

    public List<HttpHeader> getExtraHeaders() {
        return this.extraHeaders;
    }

    public int[] getExtraMonitorStatus() {
        return this.extraMonitorStatus;
    }

    public BaseException getFailedException() {
        return this.failedException;
    }

    public int getFailedResumeCount() {
        ensureSpData();
        return this.spData.optInt(SpJsonConstants.KEY_FAILED_RESUME_COUNT, 0);
    }

    public String getFilePackageName() {
        return this.filePackageName;
    }

    public long getFirstSpeedTime() {
        ensureDBJsonData();
        return this.dbJsonData.optLong(DbJsonConstants.DBJSON_KEY_FIRST_SPEED_TIME);
    }

    public List<String> getForbiddenBackupUrls() {
        return this.forbiddenBackupUrls;
    }

    public Map<String, String> getHttpHeaders() {
        return this.httpHeaders;
    }

    public int getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public String getHttpStatusMessage() {
        return this.httpStatusMessage;
    }

    public String getIconUrl() {
        return this.iconUrl;
    }

    public int getId() {
        if (this.id == 0) {
            this.id = ((IDownloadIdGeneratorService) DownloadServiceManager.getService(IDownloadIdGeneratorService.class)).generate(this);
        }
        return this.id;
    }

    public long getInstalledTimeStamp() {
        return this.installedTimeStamp;
    }

    public int getInterceptFlag() {
        return this.interceptFlag;
    }

    public boolean getIsFirstDownload() {
        return this.isFirstDownload;
    }

    public long getLastDownloadTime() {
        ensureDBJsonData();
        return this.dbJsonData.optLong(DbJsonConstants.DBJSON_KEY_LAST_START_DOWNLOAD_TIME, 0L);
    }

    public long getLastFailedResumeTime() {
        ensureSpData();
        return this.spData.optLong(SpJsonConstants.KEY_LAST_FAILED_RESUME_TIME, 0L);
    }

    public String getLastModified() {
        ensureSpData();
        try {
            return this.spData.optString("last-modified", null);
        } catch (Exception unused) {
            return null;
        }
    }

    public long getLastUninstallResumeTime() {
        ensureSpData();
        return this.spData.optLong(SpJsonConstants.KEY_LAST_UNINSTALL_RESUME_TIME, 0L);
    }

    public int getLinkMode() {
        ensureDBJsonData();
        return this.dbJsonData.optInt(DbJsonConstants.DBJSON_KEY_LINK_MODE);
    }

    public int getMaxBytes() {
        return this.maxBytes;
    }

    public int getMaxProgressCount() {
        return this.maxProgressCount;
    }

    public String getMd5() {
        return this.md5;
    }

    public String getMimeType() {
        return this.mimeType;
    }

    public long getMinByteIntervalForPostToMainThread(long j) {
        int i = this.maxProgressCount;
        if (i <= 0) {
            i = 100;
        }
        long j2 = j / (i + 1);
        if (j2 <= 0) {
            return 1048576L;
        }
        return j2;
    }

    public int getMinProgressTimeMsInterval() {
        int i = this.minProgressTimeMsInterval;
        if (i < 1000) {
            return 1000;
        }
        return i;
    }

    public String getMonitorScene() {
        return this.monitorScene;
    }

    public String getName() {
        return this.name;
    }

    public String getNetworkQuality() {
        return this.networkQuality;
    }

    public int getNotificationVisibility() {
        return this.notificationVisibility;
    }

    public boolean getOpenLimitSpeed() {
        return this.openLimitSpeed;
    }

    public String[] getOutIp() {
        return this.outIp;
    }

    public int[] getOutSize() {
        return this.outSize;
    }

    public PackageInfo getPackageInfo() {
        SoftReference<PackageInfo> softReference = this.packageInfoRef;
        if (softReference == null) {
            return null;
        }
        return softReference.get();
    }

    public String getPackageName() {
        return this.packageName;
    }

    public int getPausedResumeCount() {
        ensureSpData();
        return this.spData.optInt(DownloadConstants.KEY_PAUSED_RESUME_COUNT, 0);
    }

    public JSONObject getPcdnStats() {
        return this.pcdnStats;
    }

    public List<String> getPcdnUrls() {
        return this.pcdnUrls;
    }

    public String getPcdnUrlsStr() {
        if (this.pcdnUrlsStr == null) {
            this.pcdnUrlsStr = DownloadUtils.listToJsonString(this.pcdnUrls);
        }
        return this.pcdnUrlsStr;
    }

    public int getRawId() {
        return this.id;
    }

    public long getRawRealDownloadTime() {
        return this.realDownloadTime;
    }

    public String getRawTempPath() {
        return this.tempPath;
    }

    public String getRawTitle() {
        return this.title;
    }

    public long getRealDownloadTime() {
        return TimeUnit.NANOSECONDS.toMillis(this.realDownloadTime);
    }

    public int getRealStatus() {
        AtomicInteger atomicInteger = this.status;
        if (atomicInteger != null) {
            return atomicInteger.get();
        }
        return 0;
    }

    public String getRedirectPartialUrlResults() {
        ensureDBJsonData();
        return this.dbJsonData.optString(DbJsonConstants.DBJSON_KEY_REDIRECT_PARTIAL_URL_RESULTS);
    }

    public int getRetryCount() {
        return this.retryCount;
    }

    public int getRetryScheduleCount() {
        ensureDBJsonData();
        return this.dbJsonData.optInt(DbJsonConstants.RETRY_SCHEDULE_COUNT, 0);
    }

    public String getSavePath() {
        return this.savePath;
    }

    public int getSpIntVal(String str) {
        ensureSpData();
        return this.spData.optInt(str, 0);
    }

    public long getSpLongVal(String str) {
        ensureSpData();
        return this.spData.optLong(str, 0L);
    }

    public String getSpStringVal(String str) {
        ensureSpData();
        return this.spData.optString(str, null);
    }

    public long getStartOffset() {
        ensureDBJsonData();
        return this.dbJsonData.optLong(DbJsonConstants.DBJSON_KEY_START_OFFSET);
    }

    public int getStatus() {
        AtomicInteger atomicInteger = this.status;
        if (atomicInteger == null) {
            return 0;
        }
        int i = atomicInteger.get();
        if (i == -5) {
            return -2;
        }
        return i;
    }

    public int getStatusAtDbInit() {
        return this.statusAtDbInit;
    }

    public int getTTMd5CheckStatus() {
        ensureDBJsonData();
        return this.dbJsonData.optInt(DbJsonConstants.DBJSON_KEY_TTMD5_CHECK_STATUS, -1);
    }

    public String getTargetFilePath() {
        return DownloadUtils.getTargetFilePath(this.savePath, this.name);
    }

    public String getTaskKey() {
        ensureDBJsonData();
        return this.dbJsonData.optString(DbJsonConstants.DBJSON_KEY_TASK_KEY);
    }

    public ConcurrentHashMap<String, Object> getTempCacheData() {
        ensureTempCacheData();
        return this.tempCacheData;
    }

    public String getTempFilePath() {
        return DownloadUtils.getTempFilePath(this.savePath, this.tempPath, this.name);
    }

    public String getTempName() {
        return DownloadUtils.getTempFileName(this.name);
    }

    public String getTempPath() {
        return DownloadUtils.getTempFileSavePath(this.savePath, this.tempPath);
    }

    public long getThrottleNetSpeed() {
        return this.throttleNetSpeed;
    }

    public int getThrottleSmoothness() {
        return this.throttleSmoothness;
    }

    public String getTitle() {
        return TextUtils.isEmpty(this.title) ? this.name : this.title;
    }

    public long getTotalBytes() {
        return this.totalBytes;
    }

    public int getTotalRetryCount() {
        int i = this.retryCount;
        List<String> list = this.backUpUrls;
        if (list == null || list.isEmpty()) {
            return i;
        }
        return i + (this.backUpUrls.size() * this.backUpUrlRetryCount);
    }

    public long getTtnetProtectTimeout() {
        return this.ttnetProtectTimeout;
    }

    public int getUninstallResumeCount() {
        ensureSpData();
        return this.spData.optInt(SpJsonConstants.KEY_UNINSTALL_RESUME_COUNT, 0);
    }

    public String getUrl() {
        return this.url;
    }

    public long getXTotalBytes() {
        return this.xTotalBytes;
    }

    public String geteTag() {
        return this.eTag;
    }

    public boolean hasNextBackupUrl() {
        List<String> list = this.backUpUrls;
        if (list != null && list.size() > 0) {
            if (!this.backUpUrlUsed) {
                return true;
            }
            int i = this.curBackUpUrlIndex;
            if (i >= 0 && i < this.backUpUrls.size() - 1) {
                return true;
            }
        }
        return false;
    }

    public boolean hasPauseReservedOnWifi() {
        return (getReserveWifiStatus() & 1) > 0;
    }

    public void increaseAllConnectTime(long j) {
        if (j > 0) {
            getAllConnectTime();
            safePutToDBJsonData(DbJsonConstants.DBJSON_KEY_ALL_CONNECT_TIME, Long.valueOf(this.allConnectTime.addAndGet(j)));
        }
    }

    public void increaseCurBytes(long j) {
        this.curBytes.addAndGet(j);
    }

    public void increaseDownloadPrepareTime(long j) {
        if (j > 0) {
            safePutToDBJsonData(DbJsonConstants.DBJSON_KEY_DOWNLOAD_PREPARE_TIME, Long.valueOf(getDownloadPrepareTime() + j));
        }
    }

    public boolean isAddListenerToSameTask() {
        return this.addListenerToSameTask;
    }

    public boolean isAddTTNetCommonParam() {
        return this.addTTNetCommonParam;
    }

    public boolean isAutoInstall() {
        ensureDBJsonData();
        return this.dbJsonData.optInt(DbJsonConstants.AUTO_INSTALL, 1) == 1;
    }

    public boolean isAutoInstallWithoutNotification() {
        if (this.isAutoInstallWithoutNotification == null) {
            if (TextUtils.isEmpty(this.extra)) {
                this.isAutoInstallWithoutNotification = Boolean.FALSE;
            } else {
                try {
                    this.isAutoInstallWithoutNotification = Boolean.valueOf(new JSONObject(this.extra).optBoolean(DownloadConstants.AUTO_INSTALL_WITHOUT_NOTIFICATION, false));
                } catch (JSONException unused) {
                    this.isAutoInstallWithoutNotification = Boolean.FALSE;
                }
            }
        }
        return this.isAutoInstallWithoutNotification.booleanValue();
    }

    public boolean isAutoResumed() {
        return this.autoResumed;
    }

    public boolean isBackUpUrlUsed() {
        return this.backUpUrlUsed;
    }

    public boolean isCacheExistsInDownloading() {
        return this.isCacheExistsInDownloading;
    }

    public boolean isCanResumeFromBreakPointStatus() {
        int status = getStatus();
        if (status == 4 || status == 3 || status == -1 || status == 5 || status == 8) {
            return true;
        }
        return (status == 1 || status == 2) && getCurBytes() > 0;
    }

    public boolean isChunked() {
        return DownloadUtils.isChunkedTask(this.totalBytes);
    }

    public boolean isDeleteCacheIfCheckFailed() {
        return this.deleteCacheIfCheckFailed;
    }

    public boolean isDownloadFromReserveWifi() {
        return this.mDownloadFromReserveWifi;
    }

    public boolean isDownloadOverStatus() {
        return DownloadStatus.isDownloadOver(getStatus());
    }

    public boolean isDownloadWithWifiValid() {
        return !isOnlyWifi() || DownloadUtils.isWifi(((IDownloadComponentManagerService) DownloadServiceManager.getService(IDownloadComponentManagerService.class)).getAppContext());
    }

    public boolean isDownloaded() {
        return DownloadUtils.isFileDownloaded(this);
    }

    public boolean isDownloadingStatus() {
        return DownloadStatus.isDownloading(getStatus());
    }

    public boolean isEntityInvalid() {
        return TextUtils.isEmpty(this.url) || TextUtils.isEmpty(this.name) || TextUtils.isEmpty(this.savePath);
    }

    public boolean isExpiredHttpCheck() {
        return this.expiredHttpCheck;
    }

    public boolean isExpiredRedownload() {
        return this.expiredRedownload;
    }

    public boolean isFileDataExists() {
        if (isEntityInvalid()) {
            return false;
        }
        File file = new File(getTempPath(), getTempName());
        return file.exists() && !file.isDirectory();
    }

    public boolean isFileDataValid() {
        if (isEntityInvalid()) {
            return false;
        }
        File file = new File(getTempPath(), getTempName());
        boolean exists = file.exists();
        boolean isDirectory = file.isDirectory();
        if (exists && !isDirectory) {
            long length = file.length();
            long curBytes = getCurBytes();
            if (curBytes > 0) {
                long j = this.totalBytes;
                if (j > 0 && this.chunkCount > 0 && length >= curBytes && length <= j) {
                    return true;
                }
            }
            if (Logger.debug()) {
                int i = this.id;
                StringBuilder Q = a.Q("Cur = ", curBytes, ",totalBytes =");
                Q.append(this.totalBytes);
                Q.append(",fileLength=");
                Q.append(length);
                Logger.taskDebug(TAG, i, "isFileDataValid", Q.toString());
            }
        }
        return false;
    }

    public boolean isFirstDownload() {
        if (!this.isFirstDownload || TextUtils.isEmpty(getTempPath()) || TextUtils.isEmpty(getTempName())) {
            return false;
        }
        return !new File(getTempPath(), getTempName()).exists();
    }

    public boolean isFirstSuccess() {
        return this.isFirstSuccess;
    }

    public boolean isForbiddenRetryed() {
        return this.isForbiddenRetryed;
    }

    public boolean isForce() {
        return this.force;
    }

    public boolean isHasDoInstallation() {
        return this.hasDoInstallation;
    }

    public boolean isHttpsToHttpRetryUsed() {
        return this.httpsToHttpRetryUsed;
    }

    public boolean isIgnoreDataVerify() {
        return this.ignoreDataVerify;
    }

    public boolean isIgnoreInterceptor() {
        if (this.ignoreInterceptor == null) {
            ensureDBJsonData();
            this.ignoreInterceptor = Boolean.valueOf(this.dbJsonData.optInt(DbJsonConstants.IGNORE_INTERCEPT, 0) == 1);
        }
        return this.ignoreInterceptor.booleanValue();
    }

    public boolean isNeedDefaultHttpServiceBackUp() {
        return this.needDefaultHttpServiceBackUp;
    }

    public boolean isNeedHttpsToHttpRetry() {
        return this.needHttpsToHttpRetry;
    }

    public boolean isNeedIndependentProcess() {
        return this.needIndependentProcess;
    }

    public boolean isNeedPostProgress() {
        return this.needPostProgress;
    }

    public boolean isNeedSDKMonitor() {
        return this.needSDKMonitor;
    }

    public boolean isNewTask() {
        return getStatus() == 0;
    }

    public boolean isOnlyWifi() {
        return this.onlyWifi;
    }

    public boolean isPauseByNotification() {
        if (TextUtils.isEmpty(this.extra)) {
            return false;
        }
        try {
            return new JSONObject(this.extra).optBoolean(DownloadConstants.PAUSE_BY_NOTIFICATION);
        } catch (JSONException e2) {
            e2.printStackTrace();
            return false;
        }
    }

    public boolean isPauseReserveOnWifi() {
        return (getReserveWifiStatus() & 2) > 0;
    }

    public boolean isPauseReserveWithWifiValid() {
        if (this.mDownloadFromReserveWifi) {
            return isPauseReserveOnWifi() && DownloadUtils.isWifi(((IDownloadComponentManagerService) DownloadServiceManager.getService(IDownloadComponentManagerService.class)).getAppContext());
        }
        return true;
    }

    public boolean isSavePathRedirected() {
        ensureDBJsonData();
        return this.dbJsonData.optBoolean(DbJsonConstants.DBJSON_KEY_IS_SAVE_PATH_REDIRECTED, false);
    }

    public boolean isShowNotification() {
        return this.showNotification;
    }

    public boolean isShowNotificationForAutoResumed() {
        return this.showNotificationForAutoResumed;
    }

    public boolean isShowNotificationForNetworkResumed() {
        return this.showNotificationForNetworkResumed;
    }

    public boolean isSuccessByCache() {
        return this.successByCache;
    }

    public boolean isSupportPartial() {
        return this.supportPartial;
    }

    public boolean isWaitingWifiStatus() {
        BaseException baseException = this.failedException;
        return baseException != null && baseException.getErrorCode() == 1013;
    }

    public void readFromParcel(Parcel parcel) {
        this.id = parcel.readInt();
        this.name = parcel.readString();
        this.title = parcel.readString();
        this.url = parcel.readString();
        this.savePath = parcel.readString();
        this.tempPath = parcel.readString();
        this.onlyWifi = parcel.readByte() != 0;
        this.extra = parcel.readString();
        this.extraHeaders = parcel.createTypedArrayList(HttpHeader.CREATOR);
        this.maxBytes = parcel.readInt();
        this.outIp = parcel.createStringArray();
        this.outSize = parcel.createIntArray();
        this.retryCount = parcel.readInt();
        this.backUpUrlRetryCount = parcel.readInt();
        this.force = parcel.readByte() != 0;
        this.needPostProgress = parcel.readByte() != 0;
        this.maxProgressCount = parcel.readInt();
        this.minProgressTimeMsInterval = parcel.readInt();
        this.backUpUrls = parcel.createStringArrayList();
        this.showNotification = parcel.readByte() != 0;
        this.mimeType = parcel.readString();
        this.needHttpsToHttpRetry = parcel.readByte() != 0;
        this.packageName = parcel.readString();
        this.md5 = parcel.readString();
        this.needDefaultHttpServiceBackUp = parcel.readByte() != 0;
        this.eTag = parcel.readString();
        this.curRetryTime = parcel.readInt();
        this.networkQuality = parcel.readString();
        this.curBackUpUrlIndex = parcel.readInt();
        this.notificationVisibility = parcel.readInt();
        this.chunkCount = parcel.readInt();
        setCurBytes(parcel.readLong());
        this.totalBytes = parcel.readLong();
        setStatus(parcel.readInt());
        this.downloadTime = parcel.readLong();
        this.realDownloadTime = parcel.readLong();
        this.backUpUrlUsed = parcel.readByte() != 0;
        this.httpsToHttpRetryUsed = parcel.readByte() != 0;
        this.autoResumed = parcel.readByte() != 0;
        this.showNotificationForAutoResumed = parcel.readByte() != 0;
        this.showNotificationForNetworkResumed = parcel.readByte() != 0;
        this.forbiddenBackupUrls = parcel.createStringArrayList();
        this.needIndependentProcess = parcel.readByte() != 0;
        convertEnqueueType(parcel.readInt());
        this.httpStatusCode = parcel.readInt();
        this.httpStatusMessage = parcel.readString();
        this.isForbiddenRetryed = parcel.readByte() != 0;
        this.addListenerToSameTask = parcel.readByte() != 0;
        this.failedException = (BaseException) parcel.readParcelable(BaseException.class.getClassLoader());
        this.dbJsonDataString = parcel.readString();
        this.supportPartial = parcel.readByte() != 0;
        this.iconUrl = parcel.readString();
        this.appVersionCode = parcel.readInt();
        this.expiredRedownload = parcel.readByte() != 0;
        this.deleteCacheIfCheckFailed = parcel.readByte() != 0;
        this.successByCache = parcel.readByte() != 0;
        this.expiredHttpCheck = parcel.readByte() != 0;
        this.xTotalBytes = parcel.readLong();
        this.interceptFlag = parcel.readInt();
        this.accessHttpHeaderKeys = parcel.createStringArrayList();
        this.httpHeaders = parcel.readHashMap(getClass().getClassLoader());
        this.downloadStartTimeStamp = parcel.readLong();
        this.downloadFinishTimeStamp = parcel.readLong();
        this.installedTimeStamp = parcel.readLong();
        this.hasDoInstallation = parcel.readByte() != 0;
        this.isCacheExistsInDownloading = parcel.readByte() != 0;
        this.cacheLifeTimeMax = parcel.readLong();
        this.pcdnUrls = parcel.createStringArrayList();
        this.cdnUrls = parcel.createStringArrayList();
        this.contentEncoding = parcel.readString();
        parseMonitorSetting();
    }

    public void reset() {
        setCurBytes(0L, true);
        this.totalBytes = 0L;
        this.chunkCount = 1;
        this.downloadTime = 0L;
        this.realStartDownloadTime = 0L;
        this.realDownloadTime = 0L;
    }

    public void resetCacheLifeTimeMax() {
        this.cacheLifeTimeMax = 0L;
    }

    public void resetDataForEtagEndure(String str) {
        setCurBytes(0L, true);
        setTotalBytes(0L);
        seteTag(str);
        setChunkCount(1);
        setLastModified(null);
        this.downloadTime = 0L;
        this.realStartDownloadTime = 0L;
        this.realDownloadTime = 0L;
    }

    public void resetRealStartDownloadTime() {
        this.realStartDownloadTime = 0L;
    }

    public void safePutToDBJsonData(String str, Object obj) {
        ensureDBJsonData();
        synchronized (this.dbJsonData) {
            try {
                this.dbJsonData.put(str, obj);
            } catch (Exception unused) {
            }
            this.dbJsonDataString = null;
        }
    }

    public void setAddListenerToSameTask(boolean z) {
        this.addListenerToSameTask = z;
    }

    public void setAntiHijackErrorCode(int i) {
        safePutToDBJsonData(DbJsonConstants.DBJSON_KEY_ANTI_HIJACK_ERROR_CODE, Integer.valueOf(i));
    }

    public void setAppVersionCode(int i) {
        this.appVersionCode = i;
    }

    public void setAsyncHandleStatus(AsyncHandleStatus asyncHandleStatus) {
        this.asyncHandleStatus = asyncHandleStatus;
    }

    public void setAutoResumed(boolean z) {
        this.autoResumed = z;
    }

    public void setByteInvalidRetryStatus(ByteInvalidRetryStatus byteInvalidRetryStatus) {
        this.byteInvalidRetryStatus = byteInvalidRetryStatus;
    }

    public void setCacheExistsInDownloading(boolean z) {
        this.isCacheExistsInDownloading = z;
    }

    public void setCacheExpiredTime(long j) {
        ensureSpData();
        try {
            this.spData.put(SpJsonConstants.CACHE_CONTROL_EXPIRED_TIME, j);
            updateSpData();
        } catch (Exception unused) {
        }
    }

    public void setChunkCount(int i) {
        this.chunkCount = i;
    }

    public void setContentEncoding(String str) {
        this.contentEncoding = str;
    }

    public void setCurBytes(long j) {
        AtomicLong atomicLong = this.curBytes;
        if (atomicLong != null) {
            atomicLong.set(j);
        } else {
            this.curBytes = new AtomicLong(j);
        }
    }

    public void setCurNetworkRetryCount(int i) {
        this.curNetworkRetryCount = i;
    }

    public void setDeleteCacheIfCheckFailed() {
        this.deleteCacheIfCheckFailed = true;
    }

    public void setDownloadFinishTimeStamp(long j) {
        this.downloadFinishTimeStamp = j;
    }

    public void setDownloadFromReserveWifi(boolean z) {
        this.mDownloadFromReserveWifi = z;
    }

    public void setDownloadStartTimeStamp(long j) {
        this.downloadStartTimeStamp = j;
    }

    public void setExtra(String str) {
        this.extra = str;
    }

    public void setFailedException(BaseException baseException) {
        this.failedException = baseException;
    }

    public void setFailedResumeCount(int i) {
        ensureSpData();
        try {
            this.spData.put(SpJsonConstants.KEY_FAILED_RESUME_COUNT, i);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void setFilePackageName(String str) {
        this.filePackageName = str;
    }

    public void setFirstDownload(boolean z) {
        this.isFirstDownload = z;
    }

    public void setFirstSpeedTime(long j) {
        safePutToDBJsonData(DbJsonConstants.DBJSON_KEY_FIRST_SPEED_TIME, Long.valueOf(j));
    }

    public void setFirstSuccess(boolean z) {
        this.isFirstSuccess = z;
    }

    public void setForbiddenBackupUrls(List<String> list, boolean z) {
        this.forbiddenBackupUrls = list;
        refreshBackupUrls(z);
    }

    public void setForbiddenRetryed() {
        this.isForbiddenRetryed = true;
    }

    public void setHasDoInstallation(boolean z) {
        this.hasDoInstallation = z;
    }

    public void setHttpHeaders(Map<String, String> map) {
        this.httpHeaders = map;
    }

    public void setHttpStatusCode(int i) {
        this.httpStatusCode = i;
    }

    public void setHttpStatusMessage(String str) {
        this.httpStatusMessage = str;
    }

    public void setHttpsToHttpRetryUsed(boolean z) {
        this.httpsToHttpRetryUsed = z;
    }

    public void setIconUrl(String str) {
        this.iconUrl = str;
    }

    public void setId(int i) {
        this.id = i;
    }

    public void setIgnoreDataVerify(boolean z) {
        this.ignoreDataVerify = z;
    }

    public void setInstalledTimeStamp(long j) {
        this.installedTimeStamp = j;
    }

    public void setInterceptFlag(int i) {
        this.interceptFlag = i;
    }

    public void setLastFailedResumeTime(long j) {
        ensureSpData();
        try {
            this.spData.put(SpJsonConstants.KEY_LAST_FAILED_RESUME_TIME, j);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void setLastModified(String str) {
        ensureSpData();
        try {
            this.spData.put("last-modified", str);
            updateSpData();
        } catch (Exception unused) {
        }
    }

    public void setLastNotifyProgressTime() {
        this.lastNotifyProgressTime.set(SystemClock.uptimeMillis());
    }

    public void setLastUninstallResumeTime(long j) {
        ensureSpData();
        try {
            this.spData.put(SpJsonConstants.KEY_LAST_UNINSTALL_RESUME_TIME, j);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void setLinkMode(int i) {
        safePutToDBJsonData(DbJsonConstants.DBJSON_KEY_LINK_MODE, Integer.valueOf(i));
    }

    public void setMd5(String str) {
        this.md5 = str;
    }

    public void setMimeType(String str) {
        this.mimeType = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setNetworkQuality(String str) {
        this.networkQuality = str;
    }

    public void setNotificationVisibility(int i) {
        this.notificationVisibility = i;
    }

    public void setOnlyWifi(boolean z) {
        this.onlyWifi = z;
    }

    public void setOpenLimitSpeed(boolean z) {
        this.openLimitSpeed = z;
    }

    public void setPackageInfo(PackageInfo packageInfo) {
        this.packageInfoRef = new SoftReference<>(packageInfo);
    }

    public void setPackageName(String str) {
        this.packageName = str;
    }

    public void setPauseByNotification(boolean z) {
        try {
            JSONObject jSONObject = TextUtils.isEmpty(this.extra) ? new JSONObject() : new JSONObject(this.extra);
            jSONObject.put(DownloadConstants.PAUSE_BY_NOTIFICATION, z);
            this.extra = jSONObject.toString();
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    public void setPausedResumeCount(int i) {
        ensureSpData();
        try {
            this.spData.put(DownloadConstants.KEY_PAUSED_RESUME_COUNT, i);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void setPcdnStats(JSONObject jSONObject) {
        this.pcdnStats = jSONObject;
    }

    public void setRedirectPartialUrlResults(String str) {
        safePutToDBJsonData(DbJsonConstants.DBJSON_KEY_REDIRECT_PARTIAL_URL_RESULTS, str);
    }

    public void setRetryCount(int i) {
        this.retryCount = i;
    }

    public void setRetryScheduleCount(int i) {
        safePutToDBJsonData(DbJsonConstants.RETRY_SCHEDULE_COUNT, Integer.valueOf(i));
    }

    public void setSavePath(String str) {
        this.savePath = str;
    }

    public void setSavePathRedirected(boolean z) {
        safePutToDBJsonData(DbJsonConstants.DBJSON_KEY_IS_SAVE_PATH_REDIRECTED, Boolean.valueOf(z));
    }

    public void setShowNotification(boolean z) {
        this.showNotification = z;
    }

    public void setShowNotificationForAutoResumed(boolean z) {
        this.showNotificationForAutoResumed = z;
    }

    public void setShowNotificationForNetworkResumed(boolean z) {
        this.showNotificationForNetworkResumed = z;
    }

    public void setSpValue(String str, String str2) {
        ensureSpData();
        try {
            this.spData.put(str, str2);
            updateSpData();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void setStatus(int i) {
        AtomicInteger atomicInteger = this.status;
        if (atomicInteger != null) {
            atomicInteger.set(i);
        } else {
            this.status = new AtomicInteger(i);
        }
    }

    public void setStatusAtDbInit(int i) {
        this.statusAtDbInit = i;
    }

    public void setSuccessByCache(boolean z) {
        this.successByCache = z;
    }

    public void setSupportPartial(boolean z) {
        this.supportPartial = z;
    }

    public void setTTMd5CheckStatus(int i) {
        safePutToDBJsonData(DbJsonConstants.DBJSON_KEY_TTMD5_CHECK_STATUS, Integer.valueOf(i));
    }

    public void setThrottleNetSpeed(long j) {
        setThrottleNetSpeed(j, -1);
    }

    public void setTotalBytes(long j) {
        this.totalBytes = j;
    }

    public void setUninstallResumeCount(int i) {
        ensureSpData();
        try {
            this.spData.put(SpJsonConstants.KEY_UNINSTALL_RESUME_COUNT, i);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public void setXTotalBytes(long j) {
        this.xTotalBytes = j;
    }

    public void seteTag(String str) {
        this.eTag = str;
    }

    public void startPauseReserveOnWifi() {
        ensureSpData();
        try {
            this.spData.put(SpJsonConstants.PAUSE_RESERVE_ON_WIFI, 3);
            updateSpData();
        } catch (Exception unused) {
        }
    }

    public boolean statusInPause() {
        return getRealStatus() == -2 || getRealStatus() == -5;
    }

    public void stopPauseReserveOnWifi() {
        ensureSpData();
        try {
            this.spData.put(SpJsonConstants.PAUSE_RESERVE_ON_WIFI, 1);
            updateSpData();
        } catch (Exception unused) {
        }
    }

    public String toDetailString() {
        StringBuilder M = a.M("DownloadInfo{id=");
        M.append(this.id);
        M.append(", name='");
        a.G0(M, this.name, '\'', ", title='");
        a.G0(M, this.title, '\'', ", url='");
        a.G0(M, this.url, '\'', ", savePath='");
        a.G0(M, this.savePath, '\'', ", tempPath='");
        a.G0(M, this.tempPath, '\'', ", onlyWifi=");
        M.append(this.onlyWifi);
        M.append(", extra='");
        a.G0(M, this.extra, '\'', ", extraHeaders=");
        M.append(this.extraHeaders);
        M.append(", maxBytes=");
        M.append(this.maxBytes);
        M.append(", outIp=");
        M.append(Arrays.toString(this.outIp));
        M.append(", outSize=");
        M.append(Arrays.toString(this.outSize));
        M.append(", retryCount=");
        M.append(this.retryCount);
        M.append(", backUpUrlRetryCount=");
        M.append(this.backUpUrlRetryCount);
        M.append(", force=");
        M.append(this.force);
        M.append(", needPostProgress=");
        M.append(this.needPostProgress);
        M.append(", maxProgressCount=");
        M.append(this.maxProgressCount);
        M.append(", minProgressTimeMsInterval=");
        M.append(this.minProgressTimeMsInterval);
        M.append(", backUpUrls=");
        M.append(this.backUpUrls);
        M.append(", showNotification=");
        M.append(this.showNotification);
        M.append(", mimeType='");
        a.G0(M, this.mimeType, '\'', ", needHttpsToHttpRetry=");
        M.append(this.needHttpsToHttpRetry);
        M.append(", cacheLifeTimeMax=");
        M.append(this.cacheLifeTimeMax);
        M.append(", pcdnUrls=");
        M.append(this.pcdnUrls);
        M.append(", cdnUrls=");
        M.append(this.cdnUrls);
        M.append(", pcdnUrlsStr='");
        a.G0(M, this.pcdnUrlsStr, '\'', ", cdnUrlsStr='");
        a.G0(M, this.cdnUrlsStr, '\'', ", packageName='");
        a.G0(M, this.packageName, '\'', ", filePackageName='");
        a.G0(M, this.filePackageName, '\'', ", md5='");
        a.G0(M, this.md5, '\'', ", allConnectTime=");
        M.append(this.allConnectTime);
        M.append(", needDefaultHttpServiceBackUp=");
        M.append(this.needDefaultHttpServiceBackUp);
        M.append(", eTag='");
        a.G0(M, this.eTag, '\'', ", curRetryTime=");
        M.append(this.curRetryTime);
        M.append(", asyncHandleStatus=");
        M.append(this.asyncHandleStatus);
        M.append(", ignoreDataVerify=");
        M.append(this.ignoreDataVerify);
        M.append(", needIndependentProcess=");
        M.append(this.needIndependentProcess);
        M.append(", supportPartial=");
        M.append(this.supportPartial);
        M.append(", iconUrl='");
        a.G0(M, this.iconUrl, '\'', ", curNetworkRetryCount=");
        M.append(this.curNetworkRetryCount);
        M.append(", needSDKMonitor=");
        M.append(this.needSDKMonitor);
        M.append(", monitorScene='");
        a.G0(M, this.monitorScene, '\'', ", extraMonitorStatus=");
        M.append(Arrays.toString(this.extraMonitorStatus));
        M.append(", expiredRedownload=");
        M.append(this.expiredRedownload);
        M.append(", expiredHttpCheck=");
        M.append(this.expiredHttpCheck);
        M.append(", deleteCacheIfCheckFailed=");
        M.append(this.deleteCacheIfCheckFailed);
        M.append(", successByCache=");
        M.append(this.successByCache);
        M.append(", ignoreInterceptor=");
        M.append(this.ignoreInterceptor);
        M.append(", interceptFlag=");
        M.append(this.interceptFlag);
        M.append(", downloadStartTimeStamp=");
        M.append(this.downloadStartTimeStamp);
        M.append(", downloadFinishTimeStamp=");
        M.append(this.downloadFinishTimeStamp);
        M.append(", installedTimeStamp=");
        M.append(this.installedTimeStamp);
        M.append(", hasDoInstallation=");
        M.append(this.hasDoInstallation);
        M.append(", networkQuality='");
        a.G0(M, this.networkQuality, '\'', ", curBackUpUrlIndex=");
        M.append(this.curBackUpUrlIndex);
        M.append(", notificationVisibility=");
        M.append(this.notificationVisibility);
        M.append(", chunkCount=");
        M.append(this.chunkCount);
        M.append(", curBytes=");
        M.append(this.curBytes);
        M.append(", totalBytes=");
        M.append(this.totalBytes);
        M.append(", xTotalBytes=");
        M.append(this.xTotalBytes);
        M.append(", status=");
        M.append(this.status);
        M.append(", isFirstDownload=");
        M.append(this.isFirstDownload);
        M.append(", isFirstSuccess=");
        M.append(this.isFirstSuccess);
        M.append(", downloadTime=");
        M.append(this.downloadTime);
        M.append(", realDownloadTime=");
        M.append(this.realDownloadTime);
        M.append(", backUpUrlUsed=");
        M.append(this.backUpUrlUsed);
        M.append(", httpsToHttpRetryUsed=");
        M.append(this.httpsToHttpRetryUsed);
        M.append(", startDownloadTime=");
        M.append(this.startDownloadTime);
        M.append(", realStartDownloadTime=");
        M.append(this.realStartDownloadTime);
        M.append(", bindValueCount=");
        M.append(this.bindValueCount);
        M.append(", autoResumed=");
        M.append(this.autoResumed);
        M.append(", showNotificationForAutoResumed=");
        M.append(this.showNotificationForAutoResumed);
        M.append(", showNotificationForNetworkResumed=");
        M.append(this.showNotificationForNetworkResumed);
        M.append(", forbiddenBackupUrls=");
        M.append(this.forbiddenBackupUrls);
        M.append(", byteInvalidRetryStatus=");
        M.append(this.byteInvalidRetryStatus);
        M.append(", enqueueType=");
        M.append(this.enqueueType);
        M.append(", httpStatusCode=");
        M.append(this.httpStatusCode);
        M.append(", httpStatusMessage='");
        a.G0(M, this.httpStatusMessage, '\'', ", lastNotifyProgressTime=");
        M.append(this.lastNotifyProgressTime);
        M.append(", isForbiddenRetryed=");
        M.append(this.isForbiddenRetryed);
        M.append(", appVersionCode=");
        M.append(this.appVersionCode);
        M.append(", throttleNetSpeed=");
        M.append(this.throttleNetSpeed);
        M.append(", throttleSmoothness=");
        M.append(this.throttleSmoothness);
        M.append(", openLimitSpeed=");
        M.append(this.openLimitSpeed);
        M.append(", isCacheExistsInDownloading=");
        M.append(this.isCacheExistsInDownloading);
        M.append(", contentEncoding='");
        a.G0(M, this.contentEncoding, '\'', ", addListenerToSameTask=");
        M.append(this.addListenerToSameTask);
        M.append(", backUpUrlsStr='");
        a.G0(M, this.backUpUrlsStr, '\'', ", failedException=");
        M.append(this.failedException);
        M.append(", pcdnStats=");
        M.append(this.pcdnStats);
        M.append(", spData=");
        M.append(this.spData);
        M.append(", dbJsonData=");
        M.append(this.dbJsonData);
        M.append(", dbJsonDataString='");
        a.G0(M, this.dbJsonDataString, '\'', ", tempCacheData=");
        M.append(this.tempCacheData);
        M.append(", statusAtDbInit=");
        M.append(this.statusAtDbInit);
        M.append(", mDownloadFromReserveWifi=");
        M.append(this.mDownloadFromReserveWifi);
        M.append(", packageInfoRef=");
        M.append(this.packageInfoRef);
        M.append(", ttnetProtectTimeout=");
        M.append(this.ttnetProtectTimeout);
        M.append(", addTTNetCommonParam=");
        M.append(this.addTTNetCommonParam);
        M.append(", accessHttpHeaderKeys=");
        M.append(this.accessHttpHeaderKeys);
        M.append(", httpHeaders=");
        M.append(this.httpHeaders);
        M.append(", isAutoInstallWithoutNotification=");
        M.append(this.isAutoInstallWithoutNotification);
        M.append('}');
        return M.toString();
    }

    public String toString() {
        StringBuilder M = a.M("DownloadInfo{id=");
        M.append(this.id);
        M.append(", name='");
        a.G0(M, this.name, '\'', ", title='");
        a.G0(M, this.title, '\'', ", url='");
        a.G0(M, this.url, '\'', ", savePath='");
        return a.H(M, this.savePath, '\'', '}');
    }

    public boolean trySwitchToNextBackupUrl() {
        if (this.backUpUrlUsed) {
            this.curBackUpUrlIndex++;
        }
        List<String> list = this.backUpUrls;
        if (list != null && list.size() != 0 && this.curBackUpUrlIndex >= 0) {
            while (this.curBackUpUrlIndex < this.backUpUrls.size()) {
                if (!TextUtils.isEmpty(this.backUpUrls.get(this.curBackUpUrlIndex))) {
                    this.backUpUrlUsed = true;
                    return true;
                }
                this.curBackUpUrlIndex++;
            }
        }
        return false;
    }

    public void updateCurRetryTime(int i) {
        int i2 = (this.backUpUrlUsed ? this.backUpUrlRetryCount : this.retryCount) - i;
        this.curRetryTime = i2;
        if (i2 < 0) {
            this.curRetryTime = 0;
        }
    }

    public void updateDownloadTime() {
        if (this.startDownloadTime == 0) {
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis() - this.startDownloadTime;
        if (this.downloadTime < 0) {
            this.downloadTime = 0L;
        }
        if (uptimeMillis > 0) {
            this.downloadTime = uptimeMillis;
        }
    }

    public void updateRealDownloadTime(boolean z) {
        long nanoTime = System.nanoTime();
        long j = this.realStartDownloadTime;
        if (j <= 0) {
            if (z) {
                this.realStartDownloadTime = nanoTime;
                return;
            }
            return;
        }
        long j2 = nanoTime - j;
        if (z) {
            this.realStartDownloadTime = nanoTime;
        } else {
            this.realStartDownloadTime = 0L;
        }
        if (j2 > 0) {
            this.realDownloadTime += j2;
        }
    }

    public void updateRealStartDownloadTime() {
        if (this.realStartDownloadTime == 0) {
            this.realStartDownloadTime = System.nanoTime();
        }
    }

    public void updateSpData() {
        Context appContext;
        if (this.spData == null || (appContext = ((IDownloadComponentManagerService) DownloadServiceManager.getService(IDownloadComponentManagerService.class)).getAppContext()) == null) {
            return;
        }
        appContext.getSharedPreferences(DownloadConstants.SP_DOWNLOAD_INFO, 0).edit().putString(Integer.toString(getId()), this.spData.toString()).apply();
    }

    public void updateStartDownloadTime() {
        this.startDownloadTime = SystemClock.uptimeMillis();
        safePutToDBJsonData(DbJsonConstants.DBJSON_KEY_LAST_START_DOWNLOAD_TIME, Long.valueOf(System.currentTimeMillis()));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        parcel.writeString(this.name);
        parcel.writeString(this.title);
        parcel.writeString(this.url);
        parcel.writeString(this.savePath);
        parcel.writeString(this.tempPath);
        parcel.writeByte(this.onlyWifi ? (byte) 1 : (byte) 0);
        parcel.writeString(this.extra);
        parcel.writeTypedList(this.extraHeaders);
        parcel.writeInt(this.maxBytes);
        parcel.writeStringArray(this.outIp);
        parcel.writeIntArray(this.outSize);
        parcel.writeInt(this.retryCount);
        parcel.writeInt(this.backUpUrlRetryCount);
        parcel.writeByte(this.force ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.needPostProgress ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.maxProgressCount);
        parcel.writeInt(this.minProgressTimeMsInterval);
        parcel.writeStringList(this.backUpUrls);
        parcel.writeByte(this.showNotification ? (byte) 1 : (byte) 0);
        parcel.writeString(this.mimeType);
        parcel.writeByte(this.needHttpsToHttpRetry ? (byte) 1 : (byte) 0);
        parcel.writeString(this.packageName);
        parcel.writeString(this.md5);
        parcel.writeByte(this.needDefaultHttpServiceBackUp ? (byte) 1 : (byte) 0);
        parcel.writeString(this.eTag);
        parcel.writeInt(this.curRetryTime);
        parcel.writeString(this.networkQuality);
        parcel.writeInt(this.curBackUpUrlIndex);
        parcel.writeInt(this.notificationVisibility);
        parcel.writeInt(this.chunkCount);
        parcel.writeLong(getCurBytes());
        parcel.writeLong(this.totalBytes);
        parcel.writeInt(getRealStatus());
        parcel.writeLong(this.downloadTime);
        parcel.writeLong(this.realDownloadTime);
        parcel.writeByte(this.backUpUrlUsed ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.httpsToHttpRetryUsed ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.autoResumed ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.showNotificationForAutoResumed ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.showNotificationForNetworkResumed ? (byte) 1 : (byte) 0);
        parcel.writeStringList(this.forbiddenBackupUrls);
        parcel.writeByte(this.needIndependentProcess ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.enqueueType.ordinal());
        parcel.writeInt(this.httpStatusCode);
        parcel.writeString(this.httpStatusMessage);
        parcel.writeByte(this.isForbiddenRetryed ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.addListenerToSameTask ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.failedException, i);
        parcel.writeString(getDBJsonDataString());
        parcel.writeByte(this.supportPartial ? (byte) 1 : (byte) 0);
        parcel.writeString(this.iconUrl);
        parcel.writeInt(this.appVersionCode);
        parcel.writeByte(this.expiredRedownload ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.deleteCacheIfCheckFailed ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.successByCache ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.expiredHttpCheck ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.xTotalBytes);
        parcel.writeInt(this.interceptFlag);
        parcel.writeStringList(this.accessHttpHeaderKeys);
        parcel.writeMap(this.httpHeaders);
        parcel.writeLong(this.downloadStartTimeStamp);
        parcel.writeLong(this.downloadFinishTimeStamp);
        parcel.writeLong(this.installedTimeStamp);
        parcel.writeByte(this.hasDoInstallation ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isCacheExistsInDownloading ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.cacheLifeTimeMax);
        parcel.writeStringList(this.pcdnUrls);
        parcel.writeStringList(this.cdnUrls);
        parcel.writeString(this.contentEncoding);
    }

    public void setThrottleNetSpeed(long j, int i) {
        this.throttleNetSpeed = j;
        this.throttleSmoothness = i;
    }

    public DownloadInfo() {
        this.needDefaultHttpServiceBackUp = true;
        this.asyncHandleStatus = AsyncHandleStatus.ASYNC_HANDLE_NONE;
        this.supportPartial = true;
        this.needSDKMonitor = true;
        this.expiredRedownload = false;
        this.expiredHttpCheck = false;
        this.deleteCacheIfCheckFailed = false;
        this.successByCache = false;
        this.ignoreInterceptor = null;
        this.interceptFlag = -1;
        this.downloadStartTimeStamp = 0L;
        this.downloadFinishTimeStamp = 0L;
        this.installedTimeStamp = 0L;
        this.hasDoInstallation = false;
        this.chunkCount = 1;
        this.isFirstDownload = true;
        this.isFirstSuccess = true;
        this.byteInvalidRetryStatus = ByteInvalidRetryStatus.BYTE_INVALID_RETRY_STATUS_NONE;
        this.enqueueType = EnqueueType.ENQUEUE_NONE;
        this.lastNotifyProgressTime = new AtomicLong(0L);
        this.isAutoInstallWithoutNotification = null;
    }

    public void setCurBytes(long j, boolean z) {
        if (z) {
            setCurBytes(j);
        } else if (j > getCurBytes()) {
            setCurBytes(j);
        }
    }

    public static class Builder {
        private List<String> accessHttpHeaderKeys;
        private boolean addListenerToSameTask;
        private boolean addTTNetCommonParam;
        protected int appVersionCode;
        private boolean autoResumed;
        protected int backUpUrlRetryCount;
        private List<String> backUpUrls;
        protected long cacheLifeTimeMax;
        protected List<String> cdnUrls;
        private boolean deleteCacheIfCheckFailed;
        private boolean distinctDirectory;
        private JSONObject downloadSetting;
        private int executorGroup;
        private long expectFileLength;
        private boolean expiredHttpCheck;
        private boolean expiredRedownload;
        protected String extra;
        private List<HttpHeader> extraHeaders;
        private int[] extraMonitorStatus;
        protected boolean force;
        protected String iconUrl;
        private boolean ignoreDataVerify;
        private boolean ignoreInterceptor;
        private int maxBytes;
        private int maxProgressCount;
        protected String md5;
        protected String mimeType;
        private int minProgressTimeMsInterval;
        private String monitorScene;
        protected String name;
        protected boolean needHttpsToHttpRetry;
        protected boolean needIndependentProcess;
        protected boolean onlyWifi;
        private boolean openLimitSpeed;
        private String[] outIp;
        private int[] outSize;
        protected String packageName;
        protected List<String> pcdnUrls;
        protected int retryCount;
        protected String savePath;
        protected boolean showNotification;
        private boolean showNotificationForAutoResumed;
        private String taskKey;
        protected String tempPath;
        private long throttleNetSpeed;
        private int throttleSmoothness;
        protected String title;
        private long ttnetProtectTimeout;
        protected String url;
        private boolean needPostProgress = true;
        private boolean autoInstall = true;
        protected boolean needDefaultHttpServiceBackUp = true;
        private EnqueueType enqueueType = EnqueueType.ENQUEUE_NONE;
        private long startOffset = 0;
        private long endOffset = -1;
        private boolean needSDKMonitor = true;

        public Builder() {
        }

        public Builder accessHttpHeaderKeys(List<String> list) {
            this.accessHttpHeaderKeys = list;
            return this;
        }

        public Builder addListenerToSameTask(boolean z) {
            this.addListenerToSameTask = z;
            return this;
        }

        public Builder addTTNetCommonParam(boolean z) {
            this.addTTNetCommonParam = z;
            return this;
        }

        public Builder appVersionCode(int i) {
            this.appVersionCode = i;
            return this;
        }

        public Builder autoResumed(boolean z) {
            this.autoResumed = z;
            return this;
        }

        public Builder backUpUrlRetryCount(int i) {
            this.backUpUrlRetryCount = i;
            return this;
        }

        public Builder backUpUrls(List<String> list) {
            this.backUpUrls = list;
            return this;
        }

        public DownloadInfo build() {
            return new DownloadInfo(this);
        }

        public Builder cacheLifeTimeMax(long j) {
            this.cacheLifeTimeMax = j;
            return this;
        }

        public Builder cdnUrls(List<String> list) {
            this.cdnUrls = list;
            return this;
        }

        public Builder deleteCacheIfCheckFailed(boolean z) {
            this.deleteCacheIfCheckFailed = z;
            return this;
        }

        public Builder distinctDirectory(boolean z) {
            this.distinctDirectory = z;
            return this;
        }

        public Builder downloadSetting(JSONObject jSONObject) {
            this.downloadSetting = jSONObject;
            return this;
        }

        public Builder endOffset(long j) {
            this.endOffset = j;
            return this;
        }

        public Builder enqueueType(EnqueueType enqueueType) {
            this.enqueueType = enqueueType;
            return this;
        }

        public Builder executorGroup(int i) {
            this.executorGroup = i;
            return this;
        }

        public Builder expectFileLength(long j) {
            this.expectFileLength = j;
            return this;
        }

        public Builder expiredHttpCheck(boolean z) {
            this.expiredHttpCheck = z;
            return this;
        }

        public Builder expiredRedownload(boolean z) {
            this.expiredRedownload = z;
            return this;
        }

        public Builder extra(String str) {
            this.extra = str;
            return this;
        }

        public Builder extraHeaders(List<HttpHeader> list) {
            this.extraHeaders = list;
            return this;
        }

        public Builder extraMonitorStatus(int[] iArr) {
            this.extraMonitorStatus = iArr;
            return this;
        }

        public Builder force(boolean z) {
            this.force = z;
            return this;
        }

        public Builder iconUrl(String str) {
            this.iconUrl = str;
            return this;
        }

        public Builder ignoreDataVerify(boolean z) {
            this.ignoreDataVerify = z;
            return this;
        }

        public Builder ignoreInterceptor(boolean z) {
            this.ignoreInterceptor = z;
            return this;
        }

        public Builder isOpenLimitSpeed(boolean z) {
            this.openLimitSpeed = z;
            return this;
        }

        public Builder maxBytes(int i) {
            this.maxBytes = i;
            return this;
        }

        public Builder maxProgressCount(int i) {
            this.maxProgressCount = i;
            return this;
        }

        public Builder md5(String str) {
            this.md5 = str;
            return this;
        }

        public Builder mimeType(String str) {
            this.mimeType = str;
            return this;
        }

        public Builder minProgressTimeMsInterval(int i) {
            this.minProgressTimeMsInterval = i;
            return this;
        }

        public Builder monitorScene(String str) {
            this.monitorScene = str;
            return this;
        }

        public Builder name(String str) {
            this.name = str;
            return this;
        }

        public Builder needDefaultHttpServiceBackUp(boolean z) {
            this.needDefaultHttpServiceBackUp = z;
            return this;
        }

        public Builder needHttpsToHttpRetry(boolean z) {
            this.needHttpsToHttpRetry = z;
            return this;
        }

        public Builder needIndependentProcess(boolean z) {
            this.needIndependentProcess = z;
            return this;
        }

        public Builder needPostProgress(boolean z) {
            this.needPostProgress = z;
            return this;
        }

        public Builder needSDKMonitor(boolean z) {
            this.needSDKMonitor = z;
            return this;
        }

        public Builder onlyWifi(boolean z) {
            this.onlyWifi = z;
            return this;
        }

        public Builder outIp(String[] strArr) {
            this.outIp = strArr;
            return this;
        }

        public Builder outSize(int[] iArr) {
            this.outSize = iArr;
            return this;
        }

        public Builder packageName(String str) {
            this.packageName = str;
            return this;
        }

        public Builder pcdnUrls(List<String> list) {
            this.pcdnUrls = list;
            return this;
        }

        public Builder retryCount(int i) {
            this.retryCount = i;
            return this;
        }

        public Builder savePath(String str) {
            this.savePath = str;
            return this;
        }

        public Builder setAutoInstall(boolean z) {
            this.autoInstall = z;
            return this;
        }

        public Builder showNotification(boolean z) {
            this.showNotification = z;
            return this;
        }

        public Builder showNotificationForAutoResumed(boolean z) {
            this.showNotificationForAutoResumed = z;
            return this;
        }

        public Builder startOffset(long j) {
            if (j > 0) {
                this.startOffset = j;
            }
            return this;
        }

        public Builder taskKey(String str) {
            this.taskKey = str;
            return this;
        }

        public Builder tempPath(String str) {
            this.tempPath = str;
            return this;
        }

        public Builder throttleNetSpeed(long j) {
            this.throttleNetSpeed = j;
            return this;
        }

        public Builder throttleSmoothness(int i) {
            this.throttleSmoothness = i;
            return this;
        }

        public Builder title(String str) {
            this.title = str;
            return this;
        }

        public Builder ttnetProtectTimeout(long j) {
            this.ttnetProtectTimeout = j;
            return this;
        }

        public Builder url(String str) {
            this.url = str;
            return this;
        }

        public Builder(String str) {
            this.url = str;
        }
    }

    @Deprecated
    public DownloadInfo(Cursor cursor) {
        this.needDefaultHttpServiceBackUp = true;
        this.asyncHandleStatus = AsyncHandleStatus.ASYNC_HANDLE_NONE;
        this.supportPartial = true;
        this.needSDKMonitor = true;
        this.expiredRedownload = false;
        this.expiredHttpCheck = false;
        this.deleteCacheIfCheckFailed = false;
        this.successByCache = false;
        this.ignoreInterceptor = null;
        this.interceptFlag = -1;
        this.downloadStartTimeStamp = 0L;
        this.downloadFinishTimeStamp = 0L;
        this.installedTimeStamp = 0L;
        this.hasDoInstallation = false;
        this.chunkCount = 1;
        this.isFirstDownload = true;
        this.isFirstSuccess = true;
        this.byteInvalidRetryStatus = ByteInvalidRetryStatus.BYTE_INVALID_RETRY_STATUS_NONE;
        this.enqueueType = EnqueueType.ENQUEUE_NONE;
        this.lastNotifyProgressTime = new AtomicLong(0L);
        this.isAutoInstallWithoutNotification = null;
    }

    private DownloadInfo(Builder builder) {
        this.needDefaultHttpServiceBackUp = true;
        this.asyncHandleStatus = AsyncHandleStatus.ASYNC_HANDLE_NONE;
        this.supportPartial = true;
        this.needSDKMonitor = true;
        this.expiredRedownload = false;
        this.expiredHttpCheck = false;
        this.deleteCacheIfCheckFailed = false;
        this.successByCache = false;
        this.ignoreInterceptor = null;
        this.interceptFlag = -1;
        this.downloadStartTimeStamp = 0L;
        this.downloadFinishTimeStamp = 0L;
        this.installedTimeStamp = 0L;
        this.hasDoInstallation = false;
        this.chunkCount = 1;
        this.isFirstDownload = true;
        this.isFirstSuccess = true;
        this.byteInvalidRetryStatus = ByteInvalidRetryStatus.BYTE_INVALID_RETRY_STATUS_NONE;
        this.enqueueType = EnqueueType.ENQUEUE_NONE;
        this.lastNotifyProgressTime = new AtomicLong(0L);
        this.isAutoInstallWithoutNotification = null;
        if (builder == null) {
            return;
        }
        this.name = builder.name;
        this.title = builder.title;
        this.url = builder.url;
        String str = builder.savePath;
        if (TextUtils.isEmpty(str)) {
            try {
                str = DownloadDirUtils.getDownloadPath();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        this.savePath = str;
        this.tempPath = builder.tempPath;
        safePutToDBJsonData(DbJsonConstants.DBJSON_KEY_TASK_KEY, builder.taskKey);
        if (TextUtils.isEmpty(this.tempPath) && !DownloadDirUtils.isSavePathSecurity(str)) {
            this.tempPath = DownloadDirUtils.getDownloadTempPath();
        }
        if (builder.distinctDirectory && ((IDownloadProcessDispatcherService) DownloadServiceManager.getService(IDownloadProcessDispatcherService.class)).getDownloadInfo(getId()) == null) {
            this.savePath = DownloadUtils.generateDistinctDirectory(this.savePath, this.url);
            this.tempPath = DownloadUtils.generateDistinctDirectory(this.tempPath, this.url);
        }
        this.status = new AtomicInteger(0);
        this.curBytes = new AtomicLong(0L);
        this.extra = builder.extra;
        this.onlyWifi = builder.onlyWifi;
        this.extraHeaders = builder.extraHeaders;
        this.maxBytes = builder.maxBytes;
        this.retryCount = builder.retryCount;
        this.backUpUrlRetryCount = builder.backUpUrlRetryCount;
        this.force = builder.force;
        this.outIp = builder.outIp;
        this.outSize = builder.outSize;
        this.needPostProgress = builder.needPostProgress;
        this.maxProgressCount = builder.maxProgressCount;
        this.minProgressTimeMsInterval = builder.minProgressTimeMsInterval;
        this.backUpUrls = builder.backUpUrls;
        this.showNotification = builder.showNotification;
        this.mimeType = builder.mimeType;
        this.needHttpsToHttpRetry = builder.needHttpsToHttpRetry;
        this.autoResumed = builder.autoResumed;
        this.showNotificationForAutoResumed = builder.showNotificationForAutoResumed;
        this.needDefaultHttpServiceBackUp = builder.needDefaultHttpServiceBackUp;
        this.packageName = builder.packageName;
        this.md5 = builder.md5;
        this.needIndependentProcess = builder.needIndependentProcess;
        this.enqueueType = builder.enqueueType;
        this.ignoreDataVerify = builder.ignoreDataVerify;
        this.addListenerToSameTask = builder.addListenerToSameTask;
        this.iconUrl = builder.iconUrl;
        this.throttleNetSpeed = builder.throttleNetSpeed;
        this.throttleSmoothness = builder.throttleSmoothness;
        this.openLimitSpeed = builder.openLimitSpeed;
        getId();
        JSONObject jSONObject = builder.downloadSetting;
        if (jSONObject != null) {
            DownloadSetting.addTaskDownloadSetting(getId(), jSONObject);
            safePutToDBJsonData(DbJsonConstants.DOWNLOAD_SETTING, jSONObject.toString());
        }
        safePutToDBJsonData(DbJsonConstants.DBJSON_KEY_EXPECT_FILE_LENGTH, Long.valueOf(builder.expectFileLength));
        safePutToDBJsonData(DbJsonConstants.DBJSON_KEY_EXECUTOR, Integer.valueOf(builder.executorGroup));
        safePutToDBJsonData(DbJsonConstants.AUTO_INSTALL, Integer.valueOf(builder.autoInstall ? 1 : 0));
        this.needSDKMonitor = builder.needSDKMonitor;
        this.monitorScene = builder.monitorScene;
        this.extraMonitorStatus = builder.extraMonitorStatus;
        this.expiredRedownload = builder.expiredRedownload;
        this.expiredHttpCheck = builder.expiredHttpCheck;
        this.deleteCacheIfCheckFailed = builder.deleteCacheIfCheckFailed;
        this.ttnetProtectTimeout = builder.ttnetProtectTimeout;
        this.addTTNetCommonParam = builder.addTTNetCommonParam;
        if (this.expiredRedownload && this.retryCount <= 0) {
            this.retryCount = 1;
        }
        Boolean valueOf = Boolean.valueOf(builder.ignoreInterceptor);
        this.ignoreInterceptor = valueOf;
        if (valueOf.booleanValue() || ((IDownloadComponentManagerService) DownloadServiceManager.getService(IDownloadComponentManagerService.class)).getDownloadInterceptor() == null) {
            this.interceptFlag = 0;
        }
        this.accessHttpHeaderKeys = builder.accessHttpHeaderKeys;
        this.pcdnUrls = builder.pcdnUrls;
        this.cdnUrls = builder.cdnUrls;
        this.cacheLifeTimeMax = builder.cacheLifeTimeMax;
        safePutToDBJsonData(DbJsonConstants.IGNORE_INTERCEPT, Integer.valueOf(builder.ignoreInterceptor ? 1 : 0));
        safePutToDBJsonData(DbJsonConstants.DBJSON_KEY_START_OFFSET, Long.valueOf(builder.startOffset));
        safePutToDBJsonData(DbJsonConstants.DBJSON_KEY_END_OFFSET, Long.valueOf(builder.endOffset));
        putMonitorSetting();
    }

    private DownloadInfo(RawBuilder rawBuilder) {
        this.needDefaultHttpServiceBackUp = true;
        this.asyncHandleStatus = AsyncHandleStatus.ASYNC_HANDLE_NONE;
        this.supportPartial = true;
        this.needSDKMonitor = true;
        this.expiredRedownload = false;
        this.expiredHttpCheck = false;
        this.deleteCacheIfCheckFailed = false;
        this.successByCache = false;
        this.ignoreInterceptor = null;
        this.interceptFlag = -1;
        this.downloadStartTimeStamp = 0L;
        this.downloadFinishTimeStamp = 0L;
        this.installedTimeStamp = 0L;
        this.hasDoInstallation = false;
        this.chunkCount = 1;
        this.isFirstDownload = true;
        this.isFirstSuccess = true;
        this.byteInvalidRetryStatus = ByteInvalidRetryStatus.BYTE_INVALID_RETRY_STATUS_NONE;
        this.enqueueType = EnqueueType.ENQUEUE_NONE;
        this.lastNotifyProgressTime = new AtomicLong(0L);
        this.isAutoInstallWithoutNotification = null;
        this.id = rawBuilder.id;
        this.name = rawBuilder.name;
        this.title = rawBuilder.title;
        this.url = rawBuilder.url;
        this.savePath = rawBuilder.savePath;
        this.tempPath = rawBuilder.tempPath;
        this.chunkCount = rawBuilder.chunkCount;
        setStatus(rawBuilder.status);
        setCurBytes(rawBuilder.curBytes);
        this.totalBytes = rawBuilder.totalBytes;
        this.eTag = rawBuilder.etag;
        this.onlyWifi = rawBuilder.onlyWifi;
        this.force = rawBuilder.force;
        this.retryCount = rawBuilder.retryCount;
        this.extra = rawBuilder.extra;
        this.mimeType = rawBuilder.mimeType;
        this.showNotification = rawBuilder.showNotification;
        this.notificationVisibility = rawBuilder.notificationVisibility;
        this.isFirstDownload = rawBuilder.isFirstDownload;
        this.isFirstSuccess = rawBuilder.isFirstSuccess;
        this.needHttpsToHttpRetry = rawBuilder.needHttpsToHttpRetry;
        this.downloadTime = rawBuilder.downloadTime;
        this.packageName = rawBuilder.packageName;
        this.md5 = rawBuilder.md5;
        this.curRetryTime = rawBuilder.curRetryTime;
        this.needDefaultHttpServiceBackUp = rawBuilder.needDefaultHttpServiceBackUp;
        this.backUpUrlsStr = rawBuilder.backUpUrlsStr;
        this.backUpUrlRetryCount = rawBuilder.backUpUrlRetryCount;
        this.realDownloadTime = rawBuilder.realDownloadTime;
        this.needIndependentProcess = rawBuilder.needIndependentProcess;
        this.dbJsonDataString = rawBuilder.dbJsonDataString;
        this.iconUrl = rawBuilder.iconUrl;
        this.appVersionCode = rawBuilder.appVersionCode;
        this.downloadStartTimeStamp = rawBuilder.downloadStartTimeStamp;
        this.downloadFinishTimeStamp = rawBuilder.downloadFinishTimeStamp;
        this.installedTimeStamp = rawBuilder.installedTimeStamp;
        this.hasDoInstallation = rawBuilder.hasDoInstallation;
        this.pcdnUrlsStr = rawBuilder.pcdnUrlsStr;
        this.cdnUrlsStr = rawBuilder.cdnUrlsStr;
        this.cacheLifeTimeMax = rawBuilder.cacheLifeTimeMax;
        try {
            parseMonitorSetting();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    protected DownloadInfo(Parcel parcel) {
        this.needDefaultHttpServiceBackUp = true;
        this.asyncHandleStatus = AsyncHandleStatus.ASYNC_HANDLE_NONE;
        this.supportPartial = true;
        this.needSDKMonitor = true;
        this.expiredRedownload = false;
        this.expiredHttpCheck = false;
        this.deleteCacheIfCheckFailed = false;
        this.successByCache = false;
        this.ignoreInterceptor = null;
        this.interceptFlag = -1;
        this.downloadStartTimeStamp = 0L;
        this.downloadFinishTimeStamp = 0L;
        this.installedTimeStamp = 0L;
        this.hasDoInstallation = false;
        this.chunkCount = 1;
        this.isFirstDownload = true;
        this.isFirstSuccess = true;
        this.byteInvalidRetryStatus = ByteInvalidRetryStatus.BYTE_INVALID_RETRY_STATUS_NONE;
        this.enqueueType = EnqueueType.ENQUEUE_NONE;
        this.lastNotifyProgressTime = new AtomicLong(0L);
        this.isAutoInstallWithoutNotification = null;
        readFromParcel(parcel);
    }
}
