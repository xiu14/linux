package com.ss.android.socialbase.downloader.monitor;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.ss.android.socialbase.downloader.constants.DBDefinition;
import com.ss.android.socialbase.downloader.constants.DownloadErrorCode;
import com.ss.android.socialbase.downloader.constants.DownloadStatus;
import com.ss.android.socialbase.downloader.constants.MonitorConstants;
import com.ss.android.socialbase.downloader.depend.AbsDownloadMonitorDepend;
import com.ss.android.socialbase.downloader.depend.IDownloadCdnListener;
import com.ss.android.socialbase.downloader.depend.IDownloadDepend;
import com.ss.android.socialbase.downloader.depend.IDownloadMonitorDepend;
import com.ss.android.socialbase.downloader.downloader.DownloadComponentManager;
import com.ss.android.socialbase.downloader.downloader.IMonitorConfig;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.exception.DownloadTTNetException;
import com.ss.android.socialbase.downloader.model.DownloadCdnStats;
import com.ss.android.socialbase.downloader.model.DownloadDBInitInfo;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import com.ss.android.socialbase.downloader.network.AbsDownloadHttpConnection;
import com.ss.android.socialbase.downloader.network.IDownloadHttpConnection;
import com.ss.android.socialbase.downloader.segment.Segment;
import com.ss.android.socialbase.downloader.service.DownloadServiceManager;
import com.ss.android.socialbase.downloader.service.IDownloadComponentManagerService;
import com.ss.android.socialbase.downloader.setting.DownloadSetting;
import com.ss.android.socialbase.downloader.setting.DownloadSettingKeys;
import com.ss.android.socialbase.downloader.utils.DownloadHelper;
import com.ss.android.socialbase.downloader.utils.DownloadUtils;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class DownloadMonitorHelper {
    private static final String DEFAULT_MONITOR_SCENE = "default";

    private static JSONObject getMonitorJson(String str, DownloadInfo downloadInfo, BaseException baseException, int i) {
        return getMonitorJson(str, null, downloadInfo, baseException, i);
    }

    private static boolean isMonitorStatus(int[] iArr, int i) {
        if (iArr != null && iArr.length > 0) {
            for (int i2 : iArr) {
                if (i == i2) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void monitorDownloadCDN(String str, IDownloadHttpConnection iDownloadHttpConnection, Throwable th, IDownloadCdnListener iDownloadCdnListener) {
        if (iDownloadCdnListener == null || str == null) {
            return;
        }
        DownloadCdnStats downloadCdnStats = new DownloadCdnStats();
        boolean z = true;
        if (iDownloadHttpConnection != null && (iDownloadHttpConnection instanceof AbsDownloadHttpConnection)) {
            AbsDownloadHttpConnection absDownloadHttpConnection = (AbsDownloadHttpConnection) iDownloadHttpConnection;
            try {
                downloadCdnStats.isTTNet = absDownloadHttpConnection.isOkhttp() ? false : true;
                downloadCdnStats.responseCode = absDownloadHttpConnection.getResponseCode();
                downloadCdnStats.ip = absDownloadHttpConnection.getHostIp();
                downloadCdnStats.cacheHit = DownloadHelper.isCdnCacheHit(absDownloadHttpConnection.getResponseHeaders());
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
            r1 = true;
        }
        if (th != null) {
            if (downloadCdnStats.responseCode <= 0) {
                downloadCdnStats.responseCode = ((IDownloadComponentManagerService) DownloadServiceManager.getService(IDownloadComponentManagerService.class)).getTTNetHandler().getResponseCode(th);
            }
            try {
                DownloadHelper.parseException(th, "monitor_cdn");
            } catch (DownloadTTNetException e2) {
                if (downloadCdnStats.ip == null) {
                    downloadCdnStats.ip = e2.getRemoteIp();
                }
                downloadCdnStats.errorCode = e2.getErrorCode();
            } catch (BaseException e3) {
                downloadCdnStats.errorCode = e3.getErrorCode();
            }
            downloadCdnStats.errorMsg = th.toString();
        } else {
            z = r1;
        }
        if (z) {
            try {
                downloadCdnStats.host = Uri.parse(str).getHost();
            } catch (Throwable unused) {
            }
            iDownloadCdnListener.onCollectStats(downloadCdnStats);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(25:11|12|(4:67|68|69|(15:71|15|(2:49|(1:(2:57|(2:62|63)(1:61)))(1:54))|18|19|(2:23|24)|27|28|29|(1:31)|32|33|(1:45)|36|(2:40|42)(1:39)))|14|15|(0)|49|(1:51)|(0)|18|19|(3:21|23|24)|27|28|29|(0)|32|33|(0)|43|45|36|(0)|40|42) */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x010f, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0110, code lost:
    
        r0.printStackTrace();
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e4 A[Catch: JSONException -> 0x010f, all -> 0x0135, TryCatch #4 {JSONException -> 0x010f, blocks: (B:29:0x00ae, B:31:0x00e4, B:32:0x00f5), top: B:28:0x00ae, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0056 A[Catch: all -> 0x0135, TryCatch #0 {all -> 0x0135, blocks: (B:69:0x002f, B:71:0x0033, B:19:0x0080, B:21:0x0096, B:27:0x00a9, B:29:0x00ae, B:31:0x00e4, B:32:0x00f5, B:40:0x0129, B:43:0x011b, B:45:0x0121, B:48:0x0110, B:49:0x0045, B:51:0x004b, B:57:0x0056, B:59:0x0060, B:63:0x006f, B:66:0x0076, B:75:0x002c, B:68:0x0025), top: B:12:0x0023, inners: #2, #3, #4 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void monitorDownloadConnect(@androidx.annotation.Nullable com.ss.android.socialbase.downloader.network.IDownloadHeadHttpConnection r13, java.lang.String r14, java.lang.String r15, long r16, java.lang.String r18, int r19, java.io.IOException r20, com.ss.android.socialbase.downloader.model.DownloadInfo r21) {
        /*
            Method dump skipped, instructions count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.downloader.monitor.DownloadMonitorHelper.monitorDownloadConnect(com.ss.android.socialbase.downloader.network.IDownloadHeadHttpConnection, java.lang.String, java.lang.String, long, java.lang.String, int, java.io.IOException, com.ss.android.socialbase.downloader.model.DownloadInfo):void");
    }

    public static void monitorDownloadDB(DownloadDBInitInfo downloadDBInitInfo) {
        IDownloadMonitorListener downloadMonitorListener = DownloadComponentManager.getDownloadMonitorListener();
        if (downloadMonitorListener == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(MonitorConstants.DB_INIT_DURATION, downloadDBInitInfo.initDuration);
            jSONObject.put(MonitorConstants.DB_INIT_DISK_CACHE_COUNT, downloadDBInitInfo.diskCacheCount);
            jSONObject.put(MonitorConstants.DB_INIT_MEMORY_CACHE_COUNT, downloadDBInitInfo.memoryCacheCount);
            jSONObject.put(MonitorConstants.DB_INIT_DISK_CACHE_SIZE, downloadDBInitInfo.diskCacheSize);
            downloadMonitorListener.monitorEvent(MonitorConstants.DOWNLOAD_DB, jSONObject, null, null);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void monitorDownloadIO(DownloadSetting downloadSetting, DownloadInfo downloadInfo, String str, IDownloadHttpConnection iDownloadHttpConnection, boolean z, boolean z2, BaseException baseException, long j, long j2, boolean z3, long j3, long j4, long j5, JSONObject jSONObject) {
        monitorIO(MonitorConstants.DOWNLOAD_IO, downloadSetting.optInt(DownloadSettingKeys.MONITOR_DOWNLOAD_IO), downloadSetting, downloadInfo, str, null, null, iDownloadHttpConnection, z, z2, baseException, j, j2, z3, j3, j4, j5, null);
    }

    public static void monitorDownloadOtherError(Throwable th) {
        IDownloadMonitorListener downloadMonitorListener = DownloadComponentManager.getDownloadMonitorListener();
        if (downloadMonitorListener == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("error_code", DownloadErrorCode.ERROR_MONITOR_REPORT);
            jSONObject.put("error_msg", th.toString());
            jSONObject.put(MonitorConstants.EXTRA_DOWNLOAD_STATUS, -1);
            jSONObject.put(MonitorConstants.EXTRA_DOWNLOAD_ERROR_STACK, Log.getStackTraceString(th));
            downloadMonitorListener.monitorEvent(MonitorConstants.EXTRA_DOWNLOAD_SERVICE_NAME_FAIL, jSONObject, null, null);
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007a A[Catch: all -> 0x0199, TryCatch #1 {all -> 0x0199, blocks: (B:6:0x0016, B:8:0x002d, B:17:0x006f, B:19:0x007a, B:22:0x0081, B:24:0x008d, B:25:0x0097, B:29:0x00a4, B:31:0x00a8, B:32:0x00ae, B:34:0x00b2, B:36:0x00c6, B:38:0x0113, B:39:0x0124, B:41:0x0136, B:43:0x013f, B:44:0x015a, B:53:0x018d, B:56:0x0179, B:58:0x017f, B:66:0x004b, B:68:0x0055, B:71:0x0068, B:72:0x0064), top: B:5:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0113 A[Catch: all -> 0x0199, TryCatch #1 {all -> 0x0199, blocks: (B:6:0x0016, B:8:0x002d, B:17:0x006f, B:19:0x007a, B:22:0x0081, B:24:0x008d, B:25:0x0097, B:29:0x00a4, B:31:0x00a8, B:32:0x00ae, B:34:0x00b2, B:36:0x00c6, B:38:0x0113, B:39:0x0124, B:41:0x0136, B:43:0x013f, B:44:0x015a, B:53:0x018d, B:56:0x0179, B:58:0x017f, B:66:0x004b, B:68:0x0055, B:71:0x0068, B:72:0x0064), top: B:5:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0136 A[Catch: all -> 0x0199, TryCatch #1 {all -> 0x0199, blocks: (B:6:0x0016, B:8:0x002d, B:17:0x006f, B:19:0x007a, B:22:0x0081, B:24:0x008d, B:25:0x0097, B:29:0x00a4, B:31:0x00a8, B:32:0x00ae, B:34:0x00b2, B:36:0x00c6, B:38:0x0113, B:39:0x0124, B:41:0x0136, B:43:0x013f, B:44:0x015a, B:53:0x018d, B:56:0x0179, B:58:0x017f, B:66:0x004b, B:68:0x0055, B:71:0x0068, B:72:0x0064), top: B:5:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x013f A[Catch: all -> 0x0199, TryCatch #1 {all -> 0x0199, blocks: (B:6:0x0016, B:8:0x002d, B:17:0x006f, B:19:0x007a, B:22:0x0081, B:24:0x008d, B:25:0x0097, B:29:0x00a4, B:31:0x00a8, B:32:0x00ae, B:34:0x00b2, B:36:0x00c6, B:38:0x0113, B:39:0x0124, B:41:0x0136, B:43:0x013f, B:44:0x015a, B:53:0x018d, B:56:0x0179, B:58:0x017f, B:66:0x004b, B:68:0x0055, B:71:0x0068, B:72:0x0064), top: B:5:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x018b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x017f A[Catch: all -> 0x0199, TryCatch #1 {all -> 0x0199, blocks: (B:6:0x0016, B:8:0x002d, B:17:0x006f, B:19:0x007a, B:22:0x0081, B:24:0x008d, B:25:0x0097, B:29:0x00a4, B:31:0x00a8, B:32:0x00ae, B:34:0x00b2, B:36:0x00c6, B:38:0x0113, B:39:0x0124, B:41:0x0136, B:43:0x013f, B:44:0x015a, B:53:0x018d, B:56:0x0179, B:58:0x017f, B:66:0x004b, B:68:0x0055, B:71:0x0068, B:72:0x0064), top: B:5:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00bf  */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void monitorIO(java.lang.String r19, int r20, com.ss.android.socialbase.downloader.setting.DownloadSetting r21, com.ss.android.socialbase.downloader.model.DownloadInfo r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, com.ss.android.socialbase.downloader.network.IDownloadHttpConnection r26, boolean r27, boolean r28, com.ss.android.socialbase.downloader.exception.BaseException r29, long r30, long r32, boolean r34, long r35, long r37, long r39, org.json.JSONObject r41) {
        /*
            Method dump skipped, instructions count: 414
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.downloader.monitor.DownloadMonitorHelper.monitorIO(java.lang.String, int, com.ss.android.socialbase.downloader.setting.DownloadSetting, com.ss.android.socialbase.downloader.model.DownloadInfo, java.lang.String, java.lang.String, java.lang.String, com.ss.android.socialbase.downloader.network.IDownloadHttpConnection, boolean, boolean, com.ss.android.socialbase.downloader.exception.BaseException, long, long, boolean, long, long, long, org.json.JSONObject):void");
    }

    public static void monitorSegmentIO(DownloadSetting downloadSetting, DownloadInfo downloadInfo, String str, String str2, String str3, boolean z, IDownloadHttpConnection iDownloadHttpConnection, BaseException baseException, long j, long j2) {
        monitorIO(MonitorConstants.SEGMENT_IO, downloadSetting.optInt(DownloadSettingKeys.MONITOR_SEGMENT_IO), downloadSetting, downloadInfo, str, str2, str3, iDownloadHttpConnection, z, false, baseException, j, j2, false, -1L, -1L, -1L, null);
    }

    public static void monitorSegmentsError(DownloadInfo downloadInfo, List<Segment> list) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(DBDefinition.SEGMENT_TABLE_NAME, Segment.toString(list));
            jSONObject.put(MonitorConstants.EXTRA_DOWNLOAD_CUR_BYTES, downloadInfo.getCurBytes());
            jSONObject.put(MonitorConstants.EXTRA_DOWNLOAD_TOTAL_BYTES, downloadInfo.getTotalBytes());
            InnerEventListener eventListener = DownloadComponentManager.getEventListener();
            if (eventListener != null) {
                eventListener.onEvent(downloadInfo.getId(), "segments_error", jSONObject);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void monitorSend(DownloadTask downloadTask, BaseException baseException, int i) {
        if (downloadTask == null) {
            return;
        }
        try {
            DownloadInfo downloadInfo = downloadTask.getDownloadInfo();
            if (downloadInfo == null) {
                return;
            }
            IDownloadMonitorDepend monitorDepend = downloadTask.getMonitorDepend();
            boolean isMonitorStatus = DownloadStatus.isMonitorStatus(i);
            if (!isMonitorStatus && !(isMonitorStatus = isMonitorStatus(downloadInfo.getExtraMonitorStatus(), i)) && monitorDepend != null && (monitorDepend instanceof AbsDownloadMonitorDepend)) {
                isMonitorStatus = isMonitorStatus(((AbsDownloadMonitorDepend) monitorDepend).getAdditionalMonitorStatus(), i);
            }
            if (isMonitorStatus) {
                try {
                    IDownloadDepend depend = downloadTask.getDepend();
                    if (depend != null) {
                        depend.monitorLogSend(downloadInfo, baseException, i);
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                }
                monitorSendWithTaskMonitor(monitorDepend, downloadInfo, baseException, i);
                monitorSendWithGlobalSdkMonitor(DownloadComponentManager.getDownloadMonitorListener(), downloadTask, downloadInfo, baseException, i);
            }
        } catch (Throwable th2) {
            monitorDownloadOtherError(th2);
            th2.printStackTrace();
        }
    }

    public static void monitorSendWithGlobalSdkMonitor(IDownloadMonitorListener iDownloadMonitorListener, DownloadInfo downloadInfo, BaseException baseException, int i) {
        monitorSendWithGlobalSdkMonitor(iDownloadMonitorListener, null, downloadInfo, baseException, i);
    }

    public static void monitorSendWithTaskMonitor(IDownloadMonitorDepend iDownloadMonitorDepend, DownloadInfo downloadInfo, BaseException baseException, int i) {
        if (iDownloadMonitorDepend == null) {
            return;
        }
        try {
            String eventPage = iDownloadMonitorDepend.getEventPage();
            if (TextUtils.isEmpty(eventPage)) {
                eventPage = "default";
            }
            JSONObject monitorJson = getMonitorJson(eventPage, downloadInfo, baseException, i);
            if (monitorJson == null) {
                monitorJson = new JSONObject();
            }
            iDownloadMonitorDepend.monitorLogSend(monitorJson);
        } catch (Throwable unused) {
        }
    }

    private static void putMonitorJsonStatus(int i, JSONObject jSONObject, DownloadInfo downloadInfo) throws JSONException {
        String str;
        if (i == -5) {
            str = "download_uncomplete";
        } else if (i == -4) {
            str = "download_cancel";
        } else if (i != -3) {
            str = i != -2 ? i != 0 ? i != 2 ? i != 6 ? "" : "download_first_start" : "download_start" : "download_create" : "download_pause";
        } else {
            double downloadSpeed = downloadInfo.getDownloadSpeed();
            if (downloadSpeed >= 0.0d) {
                jSONObject.put(MonitorConstants.DOWNLOAD_SPEED, downloadSpeed);
            }
            jSONObject.put(MonitorConstants.THROTTLE_SPEED, downloadInfo.getThrottleNetSpeed());
            str = "download_success";
        }
        jSONObject.put("status", str);
    }

    private static JSONObject getMonitorJson(String str, DownloadTask downloadTask, DownloadInfo downloadInfo, BaseException baseException, int i) {
        String str2;
        String str3;
        String str4;
        int i2;
        String str5;
        String str6;
        String str7;
        JSONObject jSONObject = null;
        try {
            JSONObject jSONObject2 = new JSONObject();
            try {
                IMonitorConfig monitorConfig = DownloadComponentManager.getMonitorConfig();
                if (monitorConfig != null) {
                    str2 = monitorConfig.getDeviceId();
                    str3 = DownloadUtils.parseDevicePostfix(str2);
                    str4 = monitorConfig.getAppId();
                    i2 = monitorConfig.getUpdateVersion();
                } else {
                    str2 = "";
                    str3 = str2;
                    str4 = str3;
                    i2 = 0;
                }
                jSONObject2.put(MonitorConstants.EXTRA_DOWNLOAD_PAGE, str);
                jSONObject2.put("app_id", str4);
                jSONObject2.put("device_id", str2);
                jSONObject2.put(MonitorConstants.EXTRA_DEVICE_ID_POSTFIX, str3);
                jSONObject2.put("update_version", i2);
                jSONObject2.put(MonitorConstants.EXTRA_DOWNLOAD_STATUS, i);
                jSONObject2.put(MonitorConstants.EXTRA_TTNET_TNC_ABHIT, DownloadComponentManager.getTTNetHandler().getABTestInfo());
                if (downloadInfo != null) {
                    jSONObject2.put(DownloadSettingKeys.SETTING_TAG, DownloadSetting.obtain(downloadInfo).optString(DownloadSettingKeys.SETTING_TAG));
                    jSONObject2.put(MonitorConstants.EXTRA_DOWNLOAD_ID, downloadInfo.getId());
                    jSONObject2.put("name", downloadInfo.getName());
                    jSONObject2.put("url", downloadInfo.getUrl());
                    jSONObject2.put(MonitorConstants.EXTRA_DOWNLOAD_SAVE_PATH, downloadInfo.getSavePath());
                    jSONObject2.put(MonitorConstants.EXTRA_DOWNLOAD_TIME, downloadInfo.getDownloadTime());
                    jSONObject2.put(MonitorConstants.EXTRA_DOWNLOAD_CUR_BYTES, downloadInfo.getCurBytes());
                    jSONObject2.put(MonitorConstants.EXTRA_DOWNLOAD_TOTAL_BYTES, downloadInfo.getTotalBytes());
                    jSONObject2.put(MonitorConstants.EXTRA_DOWNLOAD_NETWORK_QUALITY, downloadInfo.getNetworkQuality());
                    int i3 = 1;
                    jSONObject2.put(MonitorConstants.EXTRA_DOWNLOAD_ONLY_WIFI, downloadInfo.isOnlyWifi() ? 1 : 0);
                    jSONObject2.put(MonitorConstants.EXTRA_DOWNLOAD_NEED_HTTPS_DEGRADE, downloadInfo.isNeedHttpsToHttpRetry() ? 1 : 0);
                    jSONObject2.put(MonitorConstants.EXTRA_DOWNLOAD_HTTPS_DEGRADE_RETRY_USED, downloadInfo.isHttpsToHttpRetryUsed() ? 1 : 0);
                    jSONObject2.put("md5", downloadInfo.getMd5() == null ? "" : downloadInfo.getMd5());
                    jSONObject2.put(MonitorConstants.EXTRA_DOWNLOAD_IS_FORCE, downloadInfo.isForce() ? 1 : 0);
                    jSONObject2.put("retry_count", downloadInfo.getRetryCount());
                    jSONObject2.put(MonitorConstants.EXTRA_DOWNLOAD_DEFAULT_HTTP_SERVICE_BACKUP, downloadInfo.isNeedDefaultHttpServiceBackUp() ? 1 : 0);
                    jSONObject2.put(MonitorConstants.EXTRA_DOWNLOAD_BYTE_ERROR_RETRY_STATUS, downloadInfo.getByteInvalidRetryStatus().ordinal());
                    jSONObject2.put(MonitorConstants.EXTRA_DOWNLOAD_FORBIDDEN_HANDLER_STATUS, downloadInfo.getAsyncHandleStatus().ordinal());
                    jSONObject2.put(MonitorConstants.EXTRA_DOWNLOAD_NEED_INDEPENDENT_PROCESS, downloadInfo.isNeedIndependentProcess() ? 1 : 0);
                    jSONObject2.put("extra", downloadInfo.getExtra() != null ? downloadInfo.getExtra() : "");
                    jSONObject2.put(MonitorConstants.EXTRA_DOWNLOAD_ADD_LISTENER_TO_SAME_TASK, downloadInfo.isAddListenerToSameTask() ? 1 : 0);
                    jSONObject2.put(MonitorConstants.EXTRA_DOWNLOAD_BACKUP_URL_COUNT, downloadInfo.getBackUpUrls() != null ? downloadInfo.getBackUpUrls().size() : 0);
                    jSONObject2.put(MonitorConstants.EXTRA_DOWNLOAD_CUR_BACKUP_URL_INDEX, downloadInfo.getBackUpUrls() != null ? downloadInfo.getCurBackUpUrlIndex() : -1);
                    jSONObject2.put(MonitorConstants.EXTRA_DOWNLOAD_FORBIDDEN_URLS, downloadInfo.getForbiddenBackupUrls() != null ? downloadInfo.getForbiddenBackupUrls().toString() : "");
                    jSONObject2.put(MonitorConstants.EXTRA_DOWNLOAD_NETWORK_RETRY_COUNT, downloadInfo.getCurNetworkRetryCount());
                    jSONObject2.put(MonitorConstants.EXTRA_CACHE_EXISTS_IN_DOWNLOADING, downloadInfo.isCacheExistsInDownloading());
                    jSONObject2.put(MonitorConstants.EXTRA_CONTENT_TYPE, downloadInfo.getMimeType());
                    jSONObject2.put(MonitorConstants.EXTRA_CONTENT_ENCODING, downloadInfo.getContentEncoding());
                    if (downloadInfo.getPcdnStats() != null) {
                        jSONObject2.put(MonitorConstants.EXTRA_PCDN_LOG, downloadInfo.getPcdnStats());
                    }
                    if (downloadTask != null) {
                        jSONObject2.put(MonitorConstants.EXTRA_DOWNLOAD_ORIGIN_TIMING_INFO, downloadTask.getTimingInfo().obtainOriginStats());
                        jSONObject2.put(MonitorConstants.EXTRA_DOWNLOAD_TIMING_INFO, downloadTask.getTimingInfo().obtainDurationStats());
                        jSONObject2.put(MonitorConstants.EXTRA_DOWNLOAD_THREAD_INFO, downloadTask.getThreadInfo().obtainStats());
                    }
                    if (i == -3 || i == -4 || i == -1 || i == -2) {
                        jSONObject2.put(MonitorConstants.ALL_CONNECT_TIME, downloadInfo.getAllConnectTime());
                        jSONObject2.put(MonitorConstants.FIRST_SPEED_TIME, downloadInfo.getFirstSpeedTime());
                        jSONObject2.put(MonitorConstants.REAL_DOWNLOAD_TIME, downloadInfo.getRealDownloadTime());
                        jSONObject2.put(MonitorConstants.EXTRA_DOWNLOAD_TIME, downloadInfo.getDownloadTime());
                        jSONObject2.put(MonitorConstants.EXTRA_DOWNLOAD_HTTPS_DEGRADE_RETRY_USED, downloadInfo.isHttpsToHttpRetryUsed() ? 1 : 0);
                        if (!downloadInfo.isBackUpUrlUsed()) {
                            i3 = 0;
                        }
                        jSONObject2.put(MonitorConstants.EXTRA_DOWNLOAD_BACKUP_URL_USED, i3);
                        jSONObject2.put(MonitorConstants.EXTRA_DOWNLOAD_CUR_RETRY_TIME, downloadInfo.getCurRetryTime());
                        jSONObject2.put(MonitorConstants.EXTRA_CUR_RETRY_TIME_IN_TOTAL, downloadInfo.getCurRetryTimeInTotal());
                    }
                    try {
                        String url = downloadInfo.getUrl();
                        if (TextUtils.isEmpty(url)) {
                            str5 = "";
                            str6 = str5;
                            str7 = str6;
                        } else {
                            Uri parse = Uri.parse(url);
                            str6 = parse.getHost();
                            str7 = parse.getPath();
                            str5 = parse.getLastPathSegment();
                            if (!TextUtils.isEmpty(str7) && !TextUtils.isEmpty(str5)) {
                                try {
                                    str7 = str7.substring(0, str7.length() - str5.length());
                                } catch (Throwable th) {
                                    th.printStackTrace();
                                }
                            }
                        }
                        jSONObject2.put(MonitorConstants.URL_HOST, str6);
                        jSONObject2.put(MonitorConstants.URL_PATH, str7);
                        jSONObject2.put(MonitorConstants.URL_LAST_PATH_SEGMENT, str5);
                    } catch (Throwable th2) {
                        th2.printStackTrace();
                    }
                }
                jSONObject2.put("error_code", baseException != null ? baseException.getErrorCode() : 0);
                jSONObject2.put("error_msg", baseException != null ? baseException.getErrorMessage() : "");
                return jSONObject2;
            } catch (JSONException e2) {
                e = e2;
                jSONObject = jSONObject2;
                monitorDownloadOtherError(e);
                e.printStackTrace();
                return jSONObject;
            }
        } catch (JSONException e3) {
            e = e3;
        }
    }

    public static void monitorSendWithGlobalSdkMonitor(IDownloadMonitorListener iDownloadMonitorListener, DownloadTask downloadTask, DownloadInfo downloadInfo, BaseException baseException, int i) {
        if (iDownloadMonitorListener == null || !downloadInfo.isNeedSDKMonitor()) {
            return;
        }
        try {
            JSONObject monitorJson = getMonitorJson(downloadInfo.getMonitorScene(), downloadTask, downloadInfo, baseException, i);
            if (monitorJson == null) {
                monitorJson = new JSONObject();
            }
            if (i != -1) {
                putMonitorJsonStatus(i, monitorJson, downloadInfo);
                iDownloadMonitorListener.monitorEvent(MonitorConstants.EXTRA_DOWNLOAD_SERVICE_NAME_COMMON, monitorJson, null, null);
            } else {
                monitorJson.put("status", baseException.getErrorCode());
                monitorJson.put(MonitorConstants.NET_CONNECTED, DownloadUtils.isNetworkConnected(DownloadComponentManager.getAppContext()) ? 1 : 0);
                iDownloadMonitorListener.monitorEvent(MonitorConstants.EXTRA_DOWNLOAD_SERVICE_NAME_FAIL, monitorJson, null, null);
            }
        } catch (Throwable th) {
            monitorDownloadOtherError(th);
            th.printStackTrace();
        }
    }
}
