package com.huawei.hms.hatool;

import android.text.TextUtils;
import com.ss.android.socialbase.downloader.utils.DownloadHelper;
import com.ss.android.socialbase.downloader.utils.DownloadUtils;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class w {

    private static class a extends Exception {
        a(String str) {
            super(str);
        }
    }

    public static n0 a(String str, byte[] bArr, Map<String, String> map) {
        return a(str, bArr, map, "POST");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0149  */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.util.Map, java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v18, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v19, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v20, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v21, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v22, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v23, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v24, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v28 */
    /* JADX WARN: Type inference failed for: r8v29 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v30 */
    /* JADX WARN: Type inference failed for: r8v31 */
    /* JADX WARN: Type inference failed for: r8v32 */
    /* JADX WARN: Type inference failed for: r8v33, types: [java.io.Closeable, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v10, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r9v11, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r9v12, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r9v13, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r9v14, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r9v15, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r9v16, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r9v17, types: [java.io.BufferedOutputStream, java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9, types: [java.io.Closeable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.huawei.hms.hatool.n0 a(java.lang.String r6, byte[] r7, java.util.Map<java.lang.String, java.lang.String> r8, java.lang.String r9) {
        /*
            Method dump skipped, instructions count: 333
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.hatool.w.a(java.lang.String, byte[], java.util.Map, java.lang.String):com.huawei.hms.hatool.n0");
    }

    private static HttpURLConnection a(String str, int i, Map<String, String> map, String str2) {
        if (TextUtils.isEmpty(str)) {
            v.b("hmsSdk", "CreateConnection: invalid urlPath.");
            return null;
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        a(httpURLConnection);
        httpURLConnection.setRequestMethod(str2);
        httpURLConnection.setConnectTimeout(15000);
        httpURLConnection.setReadTimeout(15000);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setRequestProperty(DownloadHelper.CONTENT_TYPE, "application/json; charset=UTF-8");
        httpURLConnection.setRequestProperty(DownloadUtils.CONTENT_LENGTH, String.valueOf(i));
        httpURLConnection.setRequestProperty("Connection", "close");
        if (map != null && map.size() >= 1) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key != null && !TextUtils.isEmpty(key)) {
                    httpURLConnection.setRequestProperty(key, entry.getValue());
                }
            }
        }
        return httpURLConnection;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(java.net.HttpURLConnection r3) {
        /*
            boolean r0 = r3 instanceof javax.net.ssl.HttpsURLConnection
            if (r0 == 0) goto L39
            javax.net.ssl.HttpsURLConnection r3 = (javax.net.ssl.HttpsURLConnection) r3
            r0 = 0
            android.content.Context r1 = com.huawei.hms.hatool.q0.i()     // Catch: java.lang.IllegalAccessException -> L10 java.io.IOException -> L13 java.security.GeneralSecurityException -> L16 java.security.KeyStoreException -> L19 java.security.NoSuchAlgorithmException -> L1c
            com.huawei.e.a.a.b.b r0 = com.huawei.e.a.a.b.b.b(r1)     // Catch: java.lang.IllegalAccessException -> L10 java.io.IOException -> L13 java.security.GeneralSecurityException -> L16 java.security.KeyStoreException -> L19 java.security.NoSuchAlgorithmException -> L1c
            goto L23
        L10:
            java.lang.String r1 = "getSocketFactory(): Illegal Access Exception "
            goto L1e
        L13:
            java.lang.String r1 = "getSocketFactory(): IO Exception!"
            goto L1e
        L16:
            java.lang.String r1 = "getSocketFactory(): General Security Exception"
            goto L1e
        L19:
            java.lang.String r1 = "getSocketFactory(): Key Store exception"
            goto L1e
        L1c:
            java.lang.String r1 = "getSocketFactory(): Algorithm Exception!"
        L1e:
            java.lang.String r2 = "hmsSdk"
            com.huawei.hms.hatool.v.f(r2, r1)
        L23:
            if (r0 == 0) goto L31
            r3.setSSLSocketFactory(r0)
            com.huawei.e.a.a.b.f.a r0 = new com.huawei.e.a.a.b.f.a
            r0.<init>()
            r3.setHostnameVerifier(r0)
            goto L39
        L31:
            com.huawei.hms.hatool.w$a r3 = new com.huawei.hms.hatool.w$a
            java.lang.String r0 = "No ssl socket factory set"
            r3.<init>(r0)
            throw r3
        L39:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.hatool.w.a(java.net.HttpURLConnection):void");
    }

    private static String b(HttpURLConnection httpURLConnection) {
        InputStream inputStream = null;
        try {
            try {
                inputStream = httpURLConnection.getInputStream();
                return k1.a(inputStream);
            } catch (IOException unused) {
                v.f("hmsSdk", "When Response Content From Connection inputStream operation exception! " + httpURLConnection.getResponseCode());
                k1.a((Closeable) inputStream);
                return "";
            }
        } finally {
            k1.a((Closeable) inputStream);
        }
    }
}
