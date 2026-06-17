package com.xiaomi.push.service;

/* loaded from: classes2.dex */
public abstract class ay {
    public static String A = "ext_broadcast_time";
    public static String B = "ext_sid";
    public static String C = "ext_token";
    public static String D = "ext_auth_method";
    public static String E = "ext_security";
    public static String F = "ext_kick";
    public static String G = "ext_client_attr";
    public static String H = "ext_cloud_attr";
    public static String I = "ext_pkg_name";

    /* renamed from: J, reason: collision with root package name */
    public static String f9325J = "ext_notify_id";
    public static String K = "ext_clicked_button";
    public static String L = "ext_notify_type";
    public static String M = "ext_session";
    public static String N = "sig";
    public static String O = "ext_notify_title";
    public static String P = "ext_notify_description";
    public static String Q = "ext_messenger";
    public static String R = "dump";
    public static String a = "1";
    public static String b = "2";

    /* renamed from: c, reason: collision with root package name */
    public static String f9326c = "3";

    /* renamed from: d, reason: collision with root package name */
    public static String f9327d = "com.xiaomi.push.OPEN_CHANNEL";

    /* renamed from: e, reason: collision with root package name */
    public static String f9328e = "com.xiaomi.push.SEND_MESSAGE";

    /* renamed from: f, reason: collision with root package name */
    public static String f9329f = "com.xiaomi.push.SEND_IQ";

    /* renamed from: g, reason: collision with root package name */
    public static String f9330g = "com.xiaomi.push.BATCH_SEND_MESSAGE";
    public static String h = "com.xiaomi.push.SEND_PRES";
    public static String i = "com.xiaomi.push.CLOSE_CHANNEL";
    public static String j = "com.xiaomi.push.FORCE_RECONN";
    public static String k = "com.xiaomi.push.RESET_CONN";
    public static String l = "com.xiaomi.push.UPDATE_CHANNEL_INFO";
    public static String m = "com.xiaomi.push.SEND_STATS";
    public static String n = "com.xiaomi.push.HANDLE_FCM_MSG";
    public static String o = "com.xiaomi.push.APP_NOTIFY_MSG";
    public static String p = "com.xiaomi.push.SDK_START_ACTIVITY_EVENT_MSG";
    public static String q = "com.xiaomi.push.SDK_LBS_PUSH_EVENT";
    public static String r = "com.xiaomi.push.TRIGGER_PING";
    public static String s = "com.xiaomi.push.CHANGE_HOST";
    public static String t = "com.xiaomi.push.PING_TIMER";
    public static String u = "com.xiaomi.push.APP_CHANNEL_SWITCH";
    public static String v = "ext_user_id";
    public static String w = "ext_user_server";
    public static String x = "ext_user_res";
    public static String y = "ext_chid";
    public static String z = "ext_receive_time";

    public enum a {
        DEFAULT_CACHE(0),
        NOTIFICATION_EXPOSURE_CACHE(1);


        /* renamed from: a, reason: collision with other field name */
        public final int f1070a;

        a(int i) {
            this.f1070a = i;
        }

        public static a a(int i) {
            a aVar = DEFAULT_CACHE;
            a aVar2 = NOTIFICATION_EXPOSURE_CACHE;
            return i == aVar2.f1070a ? aVar2 : aVar;
        }
    }

    public static String a(int i2) {
        switch (i2) {
            case 0:
                return "ERROR_OK";
            case 1:
                return "ERROR_SERVICE_NOT_INSTALLED";
            case 2:
                return "ERROR_NETWORK_NOT_AVAILABLE";
            case 3:
                return "ERROR_NETWORK_FAILED";
            case 4:
                return "ERROR_ACCESS_DENIED";
            case 5:
                return "ERROR_AUTH_FAILED";
            case 6:
                return "ERROR_MULTI_LOGIN";
            case 7:
                return "ERROR_SERVER_ERROR";
            case 8:
                return "ERROR_RECEIVE_TIMEOUT";
            case 9:
                return "ERROR_READ_ERROR";
            case 10:
                return "ERROR_SEND_ERROR";
            case 11:
                return "ERROR_RESET";
            case 12:
                return "ERROR_NO_CLIENT";
            case 13:
                return "ERROR_SERVER_STREAM";
            case 14:
                return "ERROR_THREAD_BLOCK";
            case 15:
                return "ERROR_SERVICE_DESTROY";
            case 16:
                return "ERROR_SESSION_CHANGED";
            case 17:
                return "ERROR_READ_TIMEOUT";
            case 18:
                return "ERROR_CONNECTIING_TIMEOUT";
            case 19:
                return "ERROR_USER_BLOCKED";
            case 20:
                return "ERROR_REDIRECT";
            case 21:
                return "ERROR_BIND_TIMEOUT";
            case 22:
                return "ERROR_PING_TIMEOUT";
            default:
                return String.valueOf(i2);
        }
    }
}
