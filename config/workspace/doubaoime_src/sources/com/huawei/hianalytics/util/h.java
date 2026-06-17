package com.huawei.hianalytics.util;

import android.annotation.TargetApi;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.URLUtil;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Locale;

/* loaded from: classes2.dex */
public class h {
    private static final String[] a = {"dbankcloud.com", "dbankcloud.cn", "dbankcloud.eu", "dbankcloud.asia", "digitalincloud.com", "digitalincloud.cn", "digitalincloud.eu", "digitalincloud.asia", "dbankcdn.com", "dbankcdn.cn", "dbankcdn.eu", "dbankcdn.asia", "hicloud.com"};

    public static boolean a(String str) {
        for (String str2 : a) {
            if (b(str, str2)) {
                return true;
            }
        }
        return false;
    }

    public static boolean a(String str, String str2) {
        if (str.toLowerCase(Locale.US).startsWith("https://abn-")) {
            return b(str, str2);
        }
        com.huawei.hianalytics.g.b.c("UriUtil", "url head check failed");
        return false;
    }

    @TargetApi(9)
    public static String b(String str) {
        if (TextUtils.isEmpty(str)) {
            com.huawei.hianalytics.g.b.b("UriUtil", "url is null");
            return str;
        }
        try {
            if (URLUtil.isNetworkUrl(str) && !str.toLowerCase(Locale.US).startsWith("http:")) {
                return new URI(str).getHost();
            }
            com.huawei.hianalytics.g.b.d("UriUtil", "url don't starts with https");
            return null;
        } catch (URISyntaxException e2) {
            com.huawei.hianalytics.g.b.d("UriUtil", "getHostByURI error : " + e2.getMessage());
            return null;
        }
    }

    public static boolean b(String str, String str2) {
        String b = b(str);
        if (TextUtils.isEmpty(b) || TextUtils.isEmpty(str2)) {
            com.huawei.hianalytics.g.b.d("UriUtil", "url or whitelist is null");
            return false;
        }
        if (TextUtils.isEmpty(str2)) {
            com.huawei.hianalytics.g.b.b("UriUtil", "whiteListUrl is null");
            str2 = null;
        } else if (URLUtil.isNetworkUrl(str2)) {
            str2 = b(str2);
        }
        if (TextUtils.isEmpty(str2)) {
            Log.e("UriUtil", "whitelist host is null");
            return false;
        }
        if (str2.equals(b)) {
            return true;
        }
        if (b.endsWith(str2)) {
            try {
                String substring = b.substring(0, b.length() - str2.length());
                if (substring.endsWith(".")) {
                    return substring.matches("^[A-Za-z0-9.-]+$");
                }
                return false;
            } catch (IndexOutOfBoundsException e2) {
                com.huawei.hianalytics.g.b.d("UriUtil", "IndexOutOfBoundsException" + e2.getMessage());
            } catch (Exception e3) {
                com.huawei.hianalytics.g.b.d("UriUtil", "Exception : " + e3.getMessage());
                return false;
            }
        }
        return false;
    }
}
