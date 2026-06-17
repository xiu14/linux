package com.huawei.hms.support.hianalytics;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.android.SystemUtils;
import com.huawei.hms.common.internal.RequestHeader;
import com.huawei.hms.common.internal.ResponseHeader;
import com.huawei.hms.common.internal.TransactionIdCreater;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.Util;
import e.a.a.a.a;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class HiAnalyticsUtil {
    private static final Object a = new Object();
    private static HiAnalyticsUtil b;

    /* renamed from: c, reason: collision with root package name */
    private static HiAnalyticsUtils f7452c;

    private String a(Context context, String str) {
        StringBuilder W = a.W("01|", "", HiAnalyticsConstant.REPORT_VAL_SEPARATOR, context.getPackageName(), HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
        W.append(Util.getAppId(context));
        W.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
        W.append(61300301);
        W.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
        W.append(str);
        return W.toString();
    }

    public static HiAnalyticsUtil getInstance() {
        HiAnalyticsUtil hiAnalyticsUtil;
        synchronized (a) {
            if (b == null) {
                b = new HiAnalyticsUtil();
                f7452c = HiAnalyticsUtils.getInstance();
            }
            hiAnalyticsUtil = b;
        }
        return hiAnalyticsUtil;
    }

    public static Map<String, String> getMapFromForegroundResponseHeader(ResponseHeader responseHeader) {
        HashMap hashMap = new HashMap();
        if (responseHeader == null) {
            return hashMap;
        }
        hashMap.put(HiAnalyticsConstant.HaKey.BI_KEY_TRANSID, responseHeader.getTransactionId());
        hashMap.put(HiAnalyticsConstant.HaKey.BI_KEY_APPID, responseHeader.getActualAppID());
        hashMap.put("service", responseHeader.getSrvName());
        hashMap.put("apiName", responseHeader.getApiName());
        hashMap.put("package", responseHeader.getPkgName());
        hashMap.put(HiAnalyticsConstant.HaKey.BI_KEY_RESULT, String.valueOf(responseHeader.getStatusCode()));
        hashMap.put("result", String.valueOf(responseHeader.getErrorCode()));
        hashMap.put(HiAnalyticsConstant.HaKey.BI_KEY_ERRORREASON, responseHeader.getErrorReason());
        hashMap.put("callTime", String.valueOf(System.currentTimeMillis()));
        hashMap.put(HiAnalyticsConstant.HaKey.BI_KEY_BASE_VERSION, "6.13.0.301");
        return hashMap;
    }

    public static Map<String, String> getMapFromRequestHeader(ResponseHeader responseHeader) {
        HashMap hashMap = new HashMap();
        if (responseHeader == null) {
            return hashMap;
        }
        hashMap.put(HiAnalyticsConstant.HaKey.BI_KEY_TRANSID, responseHeader.getTransactionId());
        hashMap.put(HiAnalyticsConstant.HaKey.BI_KEY_APPID, responseHeader.getActualAppID());
        hashMap.put("service", responseHeader.getSrvName());
        String apiName = responseHeader.getApiName();
        if (!TextUtils.isEmpty(apiName)) {
            String[] split = apiName.split("\\.");
            if (split.length >= 2) {
                hashMap.put("apiName", split[1]);
            }
        }
        hashMap.put("package", responseHeader.getPkgName());
        hashMap.put(HiAnalyticsConstant.HaKey.BI_KEY_RESULT, String.valueOf(responseHeader.getStatusCode()));
        hashMap.put("result", String.valueOf(responseHeader.getErrorCode()));
        hashMap.put(HiAnalyticsConstant.HaKey.BI_KEY_ERRORREASON, responseHeader.getErrorReason());
        hashMap.put("callTime", String.valueOf(System.currentTimeMillis()));
        hashMap.put(HiAnalyticsConstant.HaKey.BI_KEY_BASE_VERSION, "6.13.0.301");
        return hashMap;
    }

    public static String versionCodeToName(String str) {
        return HiAnalyticsUtils.versionCodeToName(str);
    }

    @Deprecated
    public Map<String, String> getMapForBi(Context context, String str) {
        HashMap hashMap = new HashMap();
        String[] split = str.split("\\.");
        if (split.length >= 2) {
            String str2 = split[0];
            String str3 = split[1];
            String appId = Util.getAppId(context);
            hashMap.put(HiAnalyticsConstant.HaKey.BI_KEY_TRANSID, TransactionIdCreater.getId(appId, str));
            hashMap.put(HiAnalyticsConstant.HaKey.BI_KEY_APPID, appId);
            hashMap.put("service", str2);
            hashMap.put("apiName", str3);
            if (context != null) {
                hashMap.put("package", context.getPackageName());
            }
            hashMap.put("version", "6.13.0.301");
            hashMap.put("callTime", String.valueOf(System.currentTimeMillis()));
        }
        return hashMap;
    }

    public Map<String, String> getMapFromForegroundRequestHeader(RequestHeader requestHeader) {
        HashMap hashMap = new HashMap();
        if (requestHeader == null) {
            return hashMap;
        }
        hashMap.put(HiAnalyticsConstant.HaKey.BI_KEY_TRANSID, requestHeader.getTransactionId());
        hashMap.put(HiAnalyticsConstant.HaKey.BI_KEY_APPID, requestHeader.getActualAppID());
        hashMap.put("service", requestHeader.getSrvName());
        hashMap.put("apiName", requestHeader.getApiName());
        hashMap.put("package", requestHeader.getPkgName());
        hashMap.put("callTime", String.valueOf(System.currentTimeMillis()));
        hashMap.put(HiAnalyticsConstant.HaKey.BI_KEY_BASE_VERSION, "6.13.0.301");
        return hashMap;
    }

    @Deprecated
    public boolean hasError() {
        if (SystemUtils.isChinaROM()) {
            return false;
        }
        HMSLog.i("HiAnalyticsUtil", "not ChinaROM ");
        return true;
    }

    public void onBuoyEvent(Context context, String str, String str2) {
        f7452c.onBuoyEvent(context, str, str2);
    }

    public void onEvent(Context context, String str, Map<String, String> map) {
        f7452c.onEvent(context, str, map);
    }

    public void onEvent2(Context context, String str, String str2) {
        f7452c.onEvent2(context, str, str2);
    }

    public void onNewEvent(Context context, String str, Map map) {
        f7452c.onNewEvent(context, str, map);
    }

    public void onEvent(Context context, String str, String str2) {
        if (context != null) {
            onEvent2(context, str, a(context, str2));
        }
    }

    public boolean hasError(Context context) {
        return f7452c.hasError(context);
    }

    public Map<String, String> getMapFromRequestHeader(RequestHeader requestHeader) {
        HashMap hashMap = new HashMap();
        if (requestHeader == null) {
            return hashMap;
        }
        hashMap.put(HiAnalyticsConstant.HaKey.BI_KEY_TRANSID, requestHeader.getTransactionId());
        hashMap.put(HiAnalyticsConstant.HaKey.BI_KEY_APPID, requestHeader.getActualAppID());
        hashMap.put("service", requestHeader.getSrvName());
        String apiName = requestHeader.getApiName();
        if (!TextUtils.isEmpty(apiName)) {
            String[] split = apiName.split("\\.");
            if (split.length >= 2) {
                hashMap.put("apiName", split[1]);
            }
        }
        hashMap.put("package", requestHeader.getPkgName());
        hashMap.put("callTime", String.valueOf(System.currentTimeMillis()));
        hashMap.put(HiAnalyticsConstant.HaKey.BI_KEY_BASE_VERSION, "6.13.0.301");
        return hashMap;
    }
}
