package com.ss.ugc.effectplatform;

import com.heytap.mcssdk.liquid.DownloadRequest;
import com.heytap.msp.push.callback.INotificationPermissionCallback;
import com.huawei.hms.common.internal.RequestManager;

/* loaded from: classes2.dex */
public final class b {
    public static final String a(int i) {
        if (i == 1) {
            return "unknown error";
        }
        if (i == 10014) {
            return "Invalid effect id";
        }
        if (i == 10016) {
            return "link-selector context is null";
        }
        if (i == 10019) {
            return "Pause download";
        }
        if (i == 1100) {
            return "The current application is not a test application";
        }
        if (i == 1101) {
            return "access_key does not exist";
        }
        switch (i) {
            case 1000:
                return "Illegal params (missing or wrong params)";
            case 1001:
                return "access_key is invalid";
            case 1002:
                return "app_version is invalid";
            case 1003:
                return "sdk_version is invalid";
            case 1004:
                return "device_id is invalid";
            case 1005:
                return "device_platform is invalid";
            case 1006:
                return "device_type is invalid";
            case 1007:
                return "channel is invalid";
            case 1008:
                return "app_channel is invalid";
            default:
                switch (i) {
                    case INotificationPermissionCallback.CODE_NOT_TOP /* 2001 */:
                        return "no change in content";
                    case INotificationPermissionCallback.CODE_HAD_PERMISSION /* 2002 */:
                        return "Effect is offline";
                    case INotificationPermissionCallback.CODE_SHOWING /* 2003 */:
                        return "Does not support the current device";
                    case INotificationPermissionCallback.CODE_FREQUENT /* 2004 */:
                        return "The current effect id does not exist";
                    case INotificationPermissionCallback.CODE_UNSUPPORT /* 2005 */:
                        return "Not on allowed list";
                    case 2006:
                        return "App needs to be updated";
                    default:
                        switch (i) {
                            case DownloadRequest.ErrorCode.ERROR_CONTEXT /* 10001 */:
                                return "Cancel download";
                            case DownloadRequest.ErrorCode.ERROR_ILLEGAL_COMPONENT /* 10002 */:
                                return "Download error";
                            case DownloadRequest.ErrorCode.ERROR_CODE_FREQUENT /* 10003 */:
                                return "Sticker is null";
                            case DownloadRequest.ErrorCode.ERROR_MAX_LIMIT /* 10004 */:
                                return "Invalid effect list cache !!!";
                            case DownloadRequest.ErrorCode.ERROR_MCS_NOT_SUPPORT_LIQUID /* 10005 */:
                                return "SDK error";
                            case DownloadRequest.ErrorCode.ERROR_MCS_NOT_SUPPORT_LIQUID_BATCH /* 10006 */:
                                return "No Downloaded Effects";
                            case DownloadRequest.ErrorCode.ERROR_OS_VERSION_BELOW_15 /* 10007 */:
                                return "panel is null";
                            default:
                                switch (i) {
                                    case 10009:
                                        return "No local TAG cache";
                                    case 10010:
                                        return "MD5 error";
                                    case RequestManager.NOTIFY_CONNECT_SUCCESS /* 10011 */:
                                        return "No network";
                                    case RequestManager.NOTIFY_CONNECT_FAILED /* 10012 */:
                                        return "io error";
                                    default:
                                        return "Unkown error";
                                }
                        }
                }
        }
    }
}
