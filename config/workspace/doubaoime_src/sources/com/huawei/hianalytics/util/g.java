package com.huawei.hianalytics.util;

import android.text.TextUtils;
import java.util.Map;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public class g {
    public static int a(int i, int i2, int i3) {
        if (i > i2) {
            com.huawei.hianalytics.g.b.c("HianalyticsSDK", "checkIntRange(): parameter overlarge.");
            return i2;
        }
        if (i >= i3) {
            return i;
        }
        com.huawei.hianalytics.g.b.c("HianalyticsSDK", "checkIntRange(): parameter under size.");
        return i3;
    }

    public static String a(String str, int i, int i2) {
        String str2;
        int parseInt;
        try {
            parseInt = Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            str2 = "checkMcc(): mcc is not a number!please set up correctly";
        }
        if (parseInt <= i && parseInt >= i2) {
            return String.valueOf(str);
        }
        str2 = "checkMcc(): MCC out of range!";
        com.huawei.hianalytics.g.b.c("HianalyticsSDK", str2);
        return "";
    }

    public static String a(String str, String str2, String str3, String str4) {
        if (!TextUtils.isEmpty(str2)) {
            return a(str, str2, str3) ? str2 : str4;
        }
        com.huawei.hianalytics.g.b.c("HianalyticsSDK", "checkStrParameter() Parameter verification failure! Parameter:" + str);
        return str4;
    }

    public static boolean a(String str) {
        return !a(com.heytap.mcssdk.constant.b.k, str, 256);
    }

    public static boolean a(String str, String str2, int i) {
        StringBuilder sb;
        if (TextUtils.isEmpty(str2)) {
            sb = new StringBuilder("checkString() Parameter is empty : ");
        } else {
            if (str2.length() <= i) {
                return true;
            }
            sb = new StringBuilder("checkString() Failure of parameter length check! Parameter:");
        }
        sb.append(str);
        com.huawei.hianalytics.g.b.c("HianalyticsSDK", sb.toString());
        return false;
    }

    public static boolean a(String str, String str2, String str3) {
        StringBuilder sb;
        if (TextUtils.isEmpty(str2)) {
            sb = new StringBuilder("checkString() Parameter is null! Parameter:");
        } else {
            if (Pattern.compile(str3).matcher(str2).matches()) {
                return true;
            }
            sb = new StringBuilder("checkString() Parameter verification failure! Parameter:");
        }
        sb.append(str);
        com.huawei.hianalytics.g.b.c("HianalyticsSDK", sb.toString());
        return false;
    }

    public static boolean a(Map<String, String> map) {
        if (map == null || map.size() == 0) {
            com.huawei.hianalytics.g.b.c("HianalyticsSDK", "onEvent() mapValue has not data.so,The data will be empty");
            return false;
        }
        if (map.size() == 1 && (map.get("constants") != null || map.get("_constants") != null)) {
            com.huawei.hianalytics.g.b.c("HianalyticsSDK", "checkMap() the key can't be constants or _constants");
            return false;
        }
        if (map.size() <= 2048 && map.toString().length() <= 204800) {
            return true;
        }
        com.huawei.hianalytics.g.b.c("HianalyticsSDK", "checkMap Map data is too big! size: %d , length: %d", Integer.valueOf(map.size()), Integer.valueOf(map.toString().length()));
        return false;
    }
}
