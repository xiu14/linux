package com.vivo.push;

import android.net.Uri;
import com.heytap.msp.push.callback.INotificationPermissionCallback;

/* loaded from: classes2.dex */
public final class x {
    public static final Uri a = Uri.parse("content://com.vivo.push.sdk.service.SystemPushConfig/config");
    public static final Uri b = Uri.parse("content://com.vivo.push.sdk.service.SystemPushConfig/permission");

    /* renamed from: c, reason: collision with root package name */
    public static final Uri f8936c = Uri.parse("content://com.vivo.push.sdk.service.SystemPushConfig/clientState");

    /* renamed from: d, reason: collision with root package name */
    public static final Uri f8937d = Uri.parse("content://com.vivo.push.sdk.service.SystemPushConfig/debugInfo");

    /* renamed from: e, reason: collision with root package name */
    public static final Uri f8938e = Uri.parse("content://com.vivo.push.sdk.service.SystemPushConfig/agreePrivacyStatement");

    /* renamed from: f, reason: collision with root package name */
    public static final Uri f8939f = Uri.parse("content://com.vivo.push.sdk.service.SystemPushConfig/queryAppState");

    public static String a(int i) {
        switch (i) {
            case INotificationPermissionCallback.CODE_HAD_PERMISSION /* 2002 */:
                return "method_alias_bind";
            case INotificationPermissionCallback.CODE_SHOWING /* 2003 */:
                return "method_alias_unbind";
            case INotificationPermissionCallback.CODE_FREQUENT /* 2004 */:
                return "method_tag_bind";
            case INotificationPermissionCallback.CODE_UNSUPPORT /* 2005 */:
                return "method_tag_unbind";
            case 2006:
                return "method_sdk_bind";
            case 2007:
                return "method_sdk_unbind";
            case 2008:
                return "method_stop";
            default:
                return null;
        }
    }
}
