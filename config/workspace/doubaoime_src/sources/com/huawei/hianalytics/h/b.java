package com.huawei.hianalytics.h;

import android.os.Build;
import android.text.TextUtils;
import com.ss.android.socialbase.downloader.utils.DownloadHelper;
import com.ss.android.socialbase.downloader.utils.DownloadUtils;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import javax.net.SocketFactory;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes2.dex */
public abstract class b {

    private static class a extends Exception {
        a(String str) {
            super(str);
        }
    }

    public static c a(String str, String str2, String str3) {
        Throwable th;
        HttpURLConnection httpURLConnection;
        OutputStream outputStream;
        c cVar;
        int responseCode;
        HashMap hashMap = new HashMap();
        hashMap.put("App-Id", com.huawei.hianalytics.a.b.f());
        hashMap.put("App-Ver", com.huawei.hianalytics.a.b.g());
        hashMap.put("Sdk-Name", "hianalytics");
        hashMap.put("Sdk-Ver", "2.1.4.308");
        hashMap.put("Device-Type", Build.MODEL);
        hashMap.put("Package-Name", com.huawei.hianalytics.a.b.e());
        hashMap.put("Authorization", str3);
        hashMap.put("Charset", "UTF-8");
        hashMap.put(DownloadHelper.CONTENT_ENCODING, DownloadHelper.GZIP);
        hashMap.put(DownloadHelper.CONTENT_TYPE, "application/x-www-form-urlencoded; charset=UTF-8");
        if (TextUtils.isEmpty(str)) {
            return new c(-100, "");
        }
        int i = -103;
        BufferedWriter bufferedWriter = null;
        try {
            try {
                httpURLConnection = b(str, str2.length(), "POST", hashMap);
                try {
                } catch (IOException unused) {
                    outputStream = null;
                } catch (Throwable th2) {
                    th = th2;
                    outputStream = null;
                }
            } catch (a unused2) {
                com.huawei.hianalytics.g.b.c("HttpClient", "sendPostRequest(String): No ssl socket factory set!");
                c cVar2 = new c(-105, "");
                com.huawei.hianalytics.util.f.a(9, (Closeable) null);
                com.huawei.hianalytics.util.f.a(6, (Closeable) null);
                return cVar2;
            }
        } catch (IOException unused3) {
            httpURLConnection = null;
            outputStream = null;
        } catch (Throwable th3) {
            th = th3;
            httpURLConnection = null;
            outputStream = null;
        }
        if (httpURLConnection == null) {
            cVar = new c(-105, "");
            com.huawei.hianalytics.util.f.a(9, (Closeable) null);
            com.huawei.hianalytics.util.f.a(6, (Closeable) null);
            if (httpURLConnection != null) {
                try {
                    httpURLConnection.getInputStream().close();
                } catch (IOException unused4) {
                    com.huawei.hianalytics.g.b.c("HttpClient", "event PostRequest(String): connHttp.getInputStream() close exception !");
                }
                httpURLConnection.disconnect();
                com.huawei.hianalytics.g.b.a("HttpClient", "disconnect");
            }
            return cVar;
        }
        outputStream = httpURLConnection.getOutputStream();
        try {
            try {
                BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(outputStream, "UTF-8"));
                try {
                    try {
                        bufferedWriter2.append((CharSequence) str2);
                        bufferedWriter2.flush();
                        responseCode = httpURLConnection.getResponseCode();
                    } catch (IOException unused5) {
                    }
                    try {
                        c cVar3 = new c(responseCode, c(httpURLConnection));
                        com.huawei.hianalytics.util.f.a(9, bufferedWriter2);
                        com.huawei.hianalytics.util.f.a(6, outputStream);
                        try {
                            httpURLConnection.getInputStream().close();
                        } catch (IOException unused6) {
                            com.huawei.hianalytics.g.b.c("HttpClient", "event PostRequest(String): connHttp.getInputStream() close exception !");
                        }
                        httpURLConnection.disconnect();
                        com.huawei.hianalytics.g.b.a("HttpClient", "disconnect");
                        return cVar3;
                    } catch (IOException unused7) {
                        i = responseCode;
                        bufferedWriter = bufferedWriter2;
                        com.huawei.hianalytics.g.b.c("HttpClient", "log file PostRequest(String): IO operation exception !");
                        cVar = new c(i, "");
                        com.huawei.hianalytics.util.f.a(9, bufferedWriter);
                        com.huawei.hianalytics.util.f.a(6, outputStream);
                        if (httpURLConnection != null) {
                            try {
                                httpURLConnection.getInputStream().close();
                            } catch (IOException unused8) {
                                com.huawei.hianalytics.g.b.c("HttpClient", "event PostRequest(String): connHttp.getInputStream() close exception !");
                            }
                            httpURLConnection.disconnect();
                            com.huawei.hianalytics.g.b.a("HttpClient", "disconnect");
                        }
                        return cVar;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    bufferedWriter = bufferedWriter2;
                    com.huawei.hianalytics.util.f.a(9, bufferedWriter);
                    com.huawei.hianalytics.util.f.a(6, outputStream);
                    if (httpURLConnection != null) {
                        try {
                            httpURLConnection.getInputStream().close();
                        } catch (IOException unused9) {
                            com.huawei.hianalytics.g.b.c("HttpClient", "event PostRequest(String): connHttp.getInputStream() close exception !");
                        }
                        httpURLConnection.disconnect();
                        com.huawei.hianalytics.g.b.a("HttpClient", "disconnect");
                    }
                    throw th;
                }
            } catch (IOException unused10) {
            }
        } catch (Throwable th5) {
            th = th5;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0130 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ee A[Catch: all -> 0x0142, TryCatch #0 {all -> 0x0142, blocks: (B:40:0x00df, B:43:0x00e9, B:44:0x0123, B:54:0x00ee, B:57:0x00f5, B:59:0x00f9, B:60:0x00ff, B:62:0x0103, B:63:0x010b, B:66:0x0111, B:67:0x0116, B:70:0x011d), top: B:39:0x00df }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x014b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v18, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12, types: [java.io.Closeable, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r13v8, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r13v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.huawei.hianalytics.h.c a(java.lang.String r11, byte[] r12, java.lang.String r13, java.util.Map<java.lang.String, java.lang.String> r14) {
        /*
            Method dump skipped, instructions count: 349
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hianalytics.h.b.a(java.lang.String, byte[], java.lang.String, java.util.Map):com.huawei.hianalytics.h.c");
    }

    public static c a(String str, byte[] bArr, Map<String, String> map) {
        return a(str, bArr, "POST", map);
    }

    private static HttpURLConnection b(String str, int i, String str2, Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            com.huawei.hianalytics.g.b.d("HttpClient", "CreateConnection: invalid urlPath.");
            return null;
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        if (httpURLConnection instanceof HttpsURLConnection) {
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) httpURLConnection;
            SocketFactory a2 = com.huawei.hianalytics.h.a.a();
            if (a2 == null || !(a2 instanceof SSLSocketFactory)) {
                throw new a("No ssl socket factory set");
            }
            httpsURLConnection.setSSLSocketFactory((SSLSocketFactory) a2);
            httpsURLConnection.setHostnameVerifier(com.huawei.hianalytics.h.a.a);
        }
        httpURLConnection.setRequestMethod(str2);
        httpURLConnection.setConnectTimeout(16000);
        httpURLConnection.setReadTimeout(16000);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setRequestProperty(DownloadHelper.CONTENT_TYPE, "application/json; charset=UTF-8");
        httpURLConnection.setRequestProperty(DownloadUtils.CONTENT_LENGTH, String.valueOf(i));
        httpURLConnection.setRequestProperty("App-Ver", "2.1.4.308");
        httpURLConnection.setRequestProperty("Connection", "close");
        if (map != null && map.size() > 0) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key != null && !TextUtils.isEmpty(key)) {
                    httpURLConnection.setRequestProperty(key, entry.getValue());
                }
            }
        }
        return httpURLConnection;
    }

    private static String c(HttpURLConnection httpURLConnection) {
        InputStream inputStream = null;
        try {
            inputStream = httpURLConnection.getInputStream();
            return com.huawei.hianalytics.util.f.a(inputStream, 2048);
        } catch (IOException unused) {
            com.huawei.hianalytics.g.b.c("HttpClient", "When Response Content From Connection inputStream operation exception!", Integer.valueOf(httpURLConnection.getResponseCode()));
            return "";
        } finally {
            com.huawei.hianalytics.util.f.a(7, inputStream);
        }
    }
}
