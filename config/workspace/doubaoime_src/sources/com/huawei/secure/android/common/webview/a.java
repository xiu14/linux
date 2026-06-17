package com.huawei.secure.android.common.webview;

import android.annotation.TargetApi;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.URLUtil;
import java.net.MalformedURLException;
import java.net.URL;

/* loaded from: classes2.dex */
public class a {
    private static String a(String str) {
        if (!TextUtils.isEmpty(str)) {
            return !URLUtil.isNetworkUrl(str) ? str : b(str);
        }
        com.huawei.secure.android.common.util.a.e("UriUtil", "whiteListUrl is null");
        return null;
    }

    @TargetApi(9)
    public static String b(String str) {
        if (TextUtils.isEmpty(str)) {
            com.huawei.secure.android.common.util.a.e("UriUtil", "url is null");
            return str;
        }
        try {
            if (URLUtil.isNetworkUrl(str)) {
                return new URL(str.replaceAll("[\\\\#]", "/")).getHost();
            }
            com.huawei.secure.android.common.util.a.c("UriUtil", "url don't starts with http or https");
            return "";
        } catch (MalformedURLException e2) {
            StringBuilder M = e.a.a.a.a.M("getHostByURI error  MalformedURLException : ");
            M.append(e2.getMessage());
            com.huawei.secure.android.common.util.a.c("UriUtil", M.toString());
            return "";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0092 A[LOOP:0: B:6:0x000c->B:16:0x0092, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0091 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean c(java.lang.String r8, java.lang.String[] r9) {
        /*
            java.lang.String r0 = "UriUtil"
            r1 = 0
            if (r9 == 0) goto L97
            int r2 = r9.length
            if (r2 != 0) goto La
            goto L97
        La:
            int r2 = r9.length
            r3 = r1
        Lc:
            if (r3 >= r2) goto L96
            r4 = r9[r3]
            java.lang.String r5 = b(r8)
            boolean r6 = android.text.TextUtils.isEmpty(r5)
            r7 = 1
            if (r6 != 0) goto L89
            boolean r6 = android.text.TextUtils.isEmpty(r4)
            if (r6 == 0) goto L22
            goto L89
        L22:
            java.lang.String r4 = a(r4)
            boolean r6 = android.text.TextUtils.isEmpty(r4)
            if (r6 == 0) goto L32
            java.lang.String r4 = "whitelist host is null"
            android.util.Log.e(r0, r4)
            goto L8e
        L32:
            boolean r6 = r4.equals(r5)
            if (r6 == 0) goto L3a
            r4 = r7
            goto L8f
        L3a:
            boolean r6 = r5.endsWith(r4)
            if (r6 == 0) goto L8e
            int r6 = r5.length()     // Catch: java.lang.Exception -> L5d java.lang.IndexOutOfBoundsException -> L73
            int r4 = r4.length()     // Catch: java.lang.Exception -> L5d java.lang.IndexOutOfBoundsException -> L73
            int r6 = r6 - r4
            java.lang.String r4 = r5.substring(r1, r6)     // Catch: java.lang.Exception -> L5d java.lang.IndexOutOfBoundsException -> L73
            java.lang.String r5 = "."
            boolean r5 = r4.endsWith(r5)     // Catch: java.lang.Exception -> L5d java.lang.IndexOutOfBoundsException -> L73
            if (r5 != 0) goto L56
            goto L8e
        L56:
            java.lang.String r5 = "^[A-Za-z0-9.-]+$"
            boolean r4 = r4.matches(r5)     // Catch: java.lang.Exception -> L5d java.lang.IndexOutOfBoundsException -> L73
            goto L8f
        L5d:
            r4 = move-exception
            java.lang.String r5 = "Exception : "
            java.lang.StringBuilder r5 = e.a.a.a.a.M(r5)
            java.lang.String r4 = r4.getMessage()
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            com.huawei.secure.android.common.util.a.c(r0, r4)
            goto L8e
        L73:
            r4 = move-exception
            java.lang.String r5 = "IndexOutOfBoundsException"
            java.lang.StringBuilder r5 = e.a.a.a.a.M(r5)
            java.lang.String r4 = r4.getMessage()
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            com.huawei.secure.android.common.util.a.c(r0, r4)
            goto L8e
        L89:
            java.lang.String r4 = "url or whitelist is null"
            com.huawei.secure.android.common.util.a.c(r0, r4)
        L8e:
            r4 = r1
        L8f:
            if (r4 == 0) goto L92
            return r7
        L92:
            int r3 = r3 + 1
            goto Lc
        L96:
            return r1
        L97:
            java.lang.String r8 = "whitelist is null"
            com.huawei.secure.android.common.util.a.c(r0, r8)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.secure.android.common.webview.a.c(java.lang.String, java.lang.String[]):boolean");
    }

    public static boolean d(String str, String[] strArr) {
        boolean z;
        if (strArr == null || strArr.length == 0) {
            com.huawei.secure.android.common.util.a.c("UriUtil", "whitelist is null");
            return false;
        }
        for (String str2 : strArr) {
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                Log.e("UriUtil", "isUrlHostSameWhitelist: url or host is null");
                z = false;
            } else {
                z = TextUtils.equals(b(str), a(str2));
            }
            if (z) {
                return true;
            }
        }
        return false;
    }
}
