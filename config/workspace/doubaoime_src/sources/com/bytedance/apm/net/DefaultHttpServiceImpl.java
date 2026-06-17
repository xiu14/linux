package com.bytedance.apm.net;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.bytedance.apm.util.j;
import com.bytedance.services.apm.api.IHttpService;
import com.bytedance.services.apm.api.c;
import com.bytedance.services.apm.api.g;
import com.ss.android.socialbase.downloader.setting.DownloadSettingValues;
import com.ss.android.socialbase.downloader.utils.DownloadHelper;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;

/* loaded from: classes.dex */
public class DefaultHttpServiceImpl implements IHttpService {
    private static String METHOD_GET = "GET";
    private static String METHOD_POST = "POST";

    private c doRequest(String str, byte[] bArr, String str2, Map<String, String> map) throws Exception {
        HttpURLConnection httpURLConnection;
        InputStream inputStream;
        byte[] byteArray;
        if (str2 == null) {
            throw new IllegalArgumentException("request method is not null");
        }
        try {
            httpURLConnection = j.a(str);
            try {
                httpURLConnection.setConnectTimeout(DownloadSettingValues.SYNC_INTERVAL_MS_FG);
                httpURLConnection.setReadTimeout(DownloadSettingValues.SYNC_INTERVAL_MS_FG);
                if (map != null && !map.isEmpty()) {
                    for (Map.Entry<String, String> entry : map.entrySet()) {
                        if (entry != null) {
                            httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
                        }
                    }
                }
                if (TextUtils.equals(str2, METHOD_POST)) {
                    httpURLConnection.setDoOutput(true);
                } else {
                    httpURLConnection.setDoOutput(false);
                }
                httpURLConnection.setRequestMethod(str2);
                if (bArr != null && bArr.length > 0) {
                    DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
                    dataOutputStream.write(bArr);
                    dataOutputStream.flush();
                    dataOutputStream.close();
                }
                int responseCode = httpURLConnection.getResponseCode();
                if (responseCode != 200) {
                    c cVar = new c(responseCode, null);
                    try {
                        httpURLConnection.disconnect();
                    } catch (Exception unused) {
                    }
                    return cVar;
                }
                inputStream = httpURLConnection.getInputStream();
                try {
                    String contentEncoding = httpURLConnection.getContentEncoding();
                    if (TextUtils.isEmpty(contentEncoding) || !contentEncoding.equalsIgnoreCase(DownloadHelper.GZIP)) {
                        byteArray = toByteArray(inputStream);
                    } else {
                        GZIPInputStream gZIPInputStream = new GZIPInputStream(inputStream);
                        byteArray = toByteArray(gZIPInputStream);
                        gZIPInputStream.close();
                    }
                    Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                    HashMap hashMap = new HashMap();
                    for (String str3 : headerFields.keySet()) {
                        List<String> list = headerFields.get(str3);
                        if (list != null && !com.bytedance.android.input.k.b.a.a0(list)) {
                            hashMap.put(str3, list.get(0));
                        }
                    }
                    c cVar2 = new c(responseCode, hashMap, byteArray);
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (Exception unused2) {
                        }
                    }
                    try {
                        httpURLConnection.disconnect();
                    } catch (Exception unused3) {
                    }
                    return cVar2;
                } catch (Throwable th) {
                    th = th;
                    try {
                        com.bytedance.apm.y.a.b("apm_debug", "http request msg: " + th.getMessage() + " ,stack: " + com.bytedance.android.input.k.b.a.Q(th, 10));
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Exception unused4) {
                            }
                        }
                        if (httpURLConnection != null) {
                            try {
                                httpURLConnection.disconnect();
                            } catch (Exception unused5) {
                            }
                        }
                        return null;
                    } finally {
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                inputStream = null;
            }
        } catch (Throwable th3) {
            th = th3;
            httpURLConnection = null;
            inputStream = null;
        }
    }

    public static byte[] toByteArray(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[8192];
        while (true) {
            int read = inputStream.read(bArr);
            if (-1 == read) {
                inputStream.close();
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    @Override // com.bytedance.services.apm.api.IHttpService
    public g buildMultipartUpload(String str, String str2, boolean z) throws IOException {
        return new b(str, str2, z, null);
    }

    @Override // com.bytedance.services.apm.api.IHttpService
    public c doGet(String str, Map<String, String> map) throws Exception {
        return doRequest(str, null, METHOD_GET, map);
    }

    @Override // com.bytedance.services.apm.api.IHttpService
    public c doPost(String str, byte[] bArr, Map<String, String> map) throws Exception {
        return doRequest(str, bArr, METHOD_POST, map);
    }

    @Override // com.bytedance.services.apm.api.IHttpService
    @Nullable
    public c uploadFiles(String str, List<File> list, Map<String, String> map) throws Exception {
        return com.bytedance.android.input.k.b.a.N0(str, list, map);
    }

    @Override // com.bytedance.services.apm.api.IHttpService
    public g buildMultipartUpload(String str, String str2, boolean z, Map<String, String> map) throws Exception {
        return new b(str, str2, z, map);
    }
}
