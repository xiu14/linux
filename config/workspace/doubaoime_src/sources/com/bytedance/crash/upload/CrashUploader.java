package com.bytedance.crash.upload;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.bytedance.common.wschannel.WsConstants;
import com.bytedance.crash.C0651f;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.general.RomInfo;
import com.huawei.hms.framework.common.ContainerUtils;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.ss.android.socialbase.downloader.utils.DownloadHelper;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import javax.net.ssl.SSLContext;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class CrashUploader {
    private static d a;
    private static com.bytedance.crash.Y.a b;

    public enum CompressType {
        NONE(0),
        GZIP(1),
        DEFLATER(2);

        final int nativeInt;

        CompressType(int i) {
            this.nativeInt = i;
        }
    }

    public static String a(String str, int i, String str2, String str3, long j) {
        return b(b(b(b(b(b(b(str, WsConstants.KEY_APP_ID, String.valueOf(i)), "device_id", str2), RomInfo.KEY_OS_TYPE, "Android"), "update_version_code", String.valueOf(j)), "channel", "unknown"), "app_version", str3), "sdk_version", "4.2.1-rc.8-oime");
    }

    public static String b(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || str3 == null) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str);
        if (!str.contains("?")) {
            sb.append("?");
        }
        try {
            if (!sb.toString().endsWith("?")) {
                sb.append(ContainerUtils.FIELD_DELIMITER);
            }
            sb.append(URLEncoder.encode(str2, "UTF-8"));
            sb.append(ContainerUtils.KEY_VALUE_DELIMITER);
            sb.append(URLEncoder.encode(str3, "UTF-8"));
            return sb.toString();
        } catch (Exception unused) {
            return str;
        }
    }

    public static String c(String str, Map map) {
        if (TextUtils.isDigitsOnly(str) || map.isEmpty()) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str);
        if (!str.contains("?")) {
            sb.append("?");
        }
        try {
            for (Map.Entry entry : map.entrySet()) {
                if (entry.getValue() != null) {
                    if (!sb.toString().endsWith("?")) {
                        sb.append(ContainerUtils.FIELD_DELIMITER);
                    }
                    sb.append(URLEncoder.encode(entry.getKey().toString(), "UTF-8"));
                    sb.append(ContainerUtils.KEY_VALUE_DELIMITER);
                    sb.append(URLEncoder.encode(entry.getValue().toString(), "UTF-8"));
                }
            }
            return sb.toString();
        } catch (Exception unused) {
            return str;
        }
    }

    public static String d(String str, JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        if (jSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.opt(next));
            }
        }
        String[] strArr = {WsConstants.KEY_APP_ID, "4444", RomInfo.KEY_OS_TYPE, "Android", "update_version_code", "000000", "channel", "unknown", "app_version", "0.0.0", "sdk_version", "4.2.1-rc.8-oime", "device_id", com.bytedance.crash.general.a.f()};
        HashMap hashMap2 = new HashMap();
        for (int i = 0; i < 14; i += 2) {
            String str2 = strArr[i];
            Object obj = hashMap.get(str2);
            hashMap2.put(str2, obj != null ? String.valueOf(obj) : strArr[i + 1]);
        }
        return c(str, hashMap2);
    }

    @NonNull
    public static String e(@NonNull String str, @NonNull com.bytedance.crash.monitor.h hVar) {
        HashMap hashMap = new HashMap();
        hashMap.put(WsConstants.KEY_APP_ID, hVar.b());
        hashMap.put("version_code", String.valueOf(hVar.m()));
        hashMap.put("update_version_code", String.valueOf(hVar.i()));
        hashMap.put("app_version", String.valueOf(hVar.n()));
        if (!TextUtils.isEmpty(hVar.d())) {
            hashMap.put("channel", hVar.d());
        }
        hashMap.put("device_id", hVar.f("0"));
        return d(str, new JSONObject(hashMap));
    }

    public static byte[] f(String str) {
        return h(str, null, DownloadHelper.GZIP, "GET", false, false).b();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.bytedance.crash.upload.j g(java.lang.String r11, byte[] r12, com.bytedance.crash.upload.CrashUploader.CompressType r13, boolean r14) throws java.io.IOException {
        /*
            if (r11 == 0) goto Lba
            if (r12 == 0) goto Lba
            int r0 = r12.length
            com.bytedance.crash.upload.CrashUploader$CompressType r1 = com.bytedance.crash.upload.CrashUploader.CompressType.GZIP
            r2 = 8192(0x2000, float:1.14794E-41)
            r3 = 128(0x80, float:1.794E-43)
            r4 = 0
            if (r1 != r13) goto L35
            if (r0 <= r3) goto L35
            java.io.ByteArrayOutputStream r13 = new java.io.ByteArrayOutputStream
            r13.<init>(r2)
            java.util.zip.GZIPOutputStream r0 = new java.util.zip.GZIPOutputStream
            r0.<init>(r13)
            r0.write(r12)     // Catch: java.lang.Throwable -> L25
            r0.close()
            byte[] r12 = r13.toByteArray()
            goto L2d
        L25:
            r12 = move-exception
            com.bytedance.android.input.k.b.a.P0(r12)     // Catch: java.lang.Throwable -> L30
            r0.close()
            r12 = r4
        L2d:
            java.lang.String r13 = "gzip"
            goto L65
        L30:
            r11 = move-exception
            r0.close()
            throw r11
        L35:
            com.bytedance.crash.upload.CrashUploader$CompressType r1 = com.bytedance.crash.upload.CrashUploader.CompressType.DEFLATER
            if (r1 != r13) goto L67
            if (r0 <= r3) goto L67
            java.io.ByteArrayOutputStream r13 = new java.io.ByteArrayOutputStream
            r13.<init>(r2)
            java.util.zip.Deflater r0 = new java.util.zip.Deflater
            r0.<init>()
            r0.setInput(r12)
            r0.finish()
            byte[] r12 = new byte[r2]
        L4d:
            boolean r1 = r0.finished()
            if (r1 != 0) goto L5c
            int r1 = r0.deflate(r12)
            r2 = 0
            r13.write(r12, r2, r1)
            goto L4d
        L5c:
            r0.end()
            byte[] r12 = r13.toByteArray()
            java.lang.String r13 = "deflate"
        L65:
            r7 = r13
            goto L68
        L67:
            r7 = r4
        L68:
            if (r12 != 0) goto L72
            com.bytedance.crash.upload.j r11 = new com.bytedance.crash.upload.j
            r12 = 202(0xca, float:2.83E-43)
            r11.<init>(r12)
            return r11
        L72:
            if (r14 == 0) goto L7c
            com.bytedance.crash.m r13 = com.bytedance.crash.N.h.b()
            byte[] r4 = r13.a(r12)
        L7c:
            if (r4 == 0) goto Laf
            java.net.URL r12 = new java.net.URL
            r12.<init>(r11)
            java.lang.String r12 = r12.getQuery()
            boolean r12 = android.text.TextUtils.isEmpty(r12)
            if (r12 == 0) goto L9a
            java.lang.String r12 = "?"
            boolean r13 = r11.endsWith(r12)
            if (r13 != 0) goto La6
            java.lang.String r11 = e.a.a.a.a.s(r11, r12)
            goto La6
        L9a:
            java.lang.String r12 = "&"
            boolean r13 = r11.endsWith(r12)
            if (r13 != 0) goto La6
            java.lang.String r11 = e.a.a.a.a.s(r11, r12)
        La6:
            java.lang.String r12 = "tt_data=a"
            java.lang.String r11 = e.a.a.a.a.s(r11, r12)
            r5 = r11
            r6 = r4
            goto Lb1
        Laf:
            r5 = r11
            r6 = r12
        Lb1:
            r9 = 1
            java.lang.String r8 = "POST"
            r10 = r14
            com.bytedance.crash.upload.j r11 = h(r5, r6, r7, r8, r9, r10)
            return r11
        Lba:
            com.bytedance.crash.upload.j r11 = new com.bytedance.crash.upload.j
            r12 = 201(0xc9, float:2.82E-43)
            r11.<init>(r12)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.upload.CrashUploader.g(java.lang.String, byte[], com.bytedance.crash.upload.CrashUploader$CompressType, boolean):com.bytedance.crash.upload.j");
    }

    private static j h(String str, byte[] bArr, String str2, String str3, boolean z, boolean z2) {
        Throwable th;
        com.bytedance.android.input.k.b.a.X("CustomException", "executeRequest:upload:" + str);
        HttpURLConnection httpURLConnection = null;
        DataOutputStream dataOutputStream = null;
        try {
            d dVar = a;
            if (dVar != null) {
                try {
                    str = dVar.a(str, bArr);
                } catch (Throwable unused) {
                }
            }
            try {
                SSLContext.getInstance(SSLSocketFactory.TLS).init(null, null, null);
            } catch (Throwable unused2) {
            }
            URL url = new URL(str);
            long f2 = h.f(null, url);
            if (f2 < 0) {
                return new j(213);
            }
            if (f2 > 0) {
                return new j(214);
            }
            try {
                com.bytedance.crash.Y.b a2 = C0651f.a();
                if (a2 != null) {
                    a2.a("urlconnection");
                }
            } catch (Throwable unused3) {
            }
            com.bytedance.crash.Y.a aVar = b;
            HttpURLConnection a3 = aVar == null ? (HttpURLConnection) url.openConnection() : aVar.a(url);
            try {
                a3.setDoOutput(z);
                if (z2) {
                    a3.setRequestProperty(DownloadHelper.CONTENT_TYPE, "application/octet-stream;tt-data=a");
                } else {
                    a3.setRequestProperty(DownloadHelper.CONTENT_TYPE, "application/json; charset=utf-8");
                }
                if (str2 != null) {
                    a3.setRequestProperty(DownloadHelper.CONTENT_ENCODING, str2);
                }
                a3.setRequestProperty(DownloadHelper.ACCEPT_ENCODING, DownloadHelper.GZIP);
                a3.setRequestMethod(str3);
                if (bArr != null && bArr.length > 0) {
                    try {
                        DataOutputStream dataOutputStream2 = new DataOutputStream(a3.getOutputStream());
                        try {
                            dataOutputStream2.write(bArr);
                            dataOutputStream2.flush();
                            try {
                                dataOutputStream2.close();
                            } catch (Throwable unused4) {
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            dataOutputStream = dataOutputStream2;
                            if (dataOutputStream != null) {
                                try {
                                    dataOutputStream.close();
                                } catch (Throwable unused5) {
                                }
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
                int responseCode = a3.getResponseCode();
                j jVar = new j(0);
                jVar.i(responseCode);
                jVar.h(a3.getHeaderFields());
                if (responseCode == 200) {
                    byte[] i = i(a3);
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject = new JSONObject(new String(i));
                    } catch (Throwable unused6) {
                    }
                    com.bytedance.android.input.k.b.a.X("CustomException", "uploadEvent:upload:" + jSONObject);
                    jVar.j(jSONObject);
                    jVar.f(i);
                    h.z(url, jVar);
                } else {
                    h.z(url, jVar);
                    jVar.g(207);
                }
                try {
                    a3.disconnect();
                } catch (Exception unused7) {
                }
                return jVar;
            } catch (Throwable th4) {
                th = th4;
                httpURLConnection = a3;
                try {
                    com.bytedance.android.input.k.b.a.F(th);
                    j jVar2 = new j(207);
                    if (httpURLConnection != null) {
                        try {
                            httpURLConnection.disconnect();
                        } catch (Exception unused8) {
                        }
                    }
                    return jVar2;
                } catch (Throwable th5) {
                    if (httpURLConnection != null) {
                        try {
                            httpURLConnection.disconnect();
                        } catch (Exception unused9) {
                        }
                    }
                    throw th5;
                }
            }
        } catch (Throwable th6) {
            th = th6;
        }
    }

    private static byte[] i(HttpURLConnection httpURLConnection) {
        InputStream inputStream;
        GZIPInputStream gZIPInputStream;
        byte[] c2;
        InputStream inputStream2 = null;
        try {
            inputStream = httpURLConnection.getInputStream();
            try {
                if (DownloadHelper.GZIP.equalsIgnoreCase(httpURLConnection.getContentEncoding())) {
                    try {
                        gZIPInputStream = new GZIPInputStream(inputStream);
                    } catch (Throwable th) {
                        th = th;
                        gZIPInputStream = null;
                    }
                    try {
                        c2 = c.c(gZIPInputStream);
                        try {
                            gZIPInputStream.close();
                        } catch (Throwable unused) {
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (gZIPInputStream != null) {
                            try {
                                gZIPInputStream.close();
                            } catch (Throwable unused2) {
                            }
                        }
                        throw th;
                    }
                } else {
                    c2 = c.c(inputStream);
                }
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (Throwable unused3) {
                    }
                }
                return c2;
            } catch (Exception unused4) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (Throwable unused5) {
                    }
                }
                return null;
            } catch (Throwable th3) {
                th = th3;
                inputStream2 = inputStream;
                if (inputStream2 != null) {
                    try {
                        inputStream2.close();
                    } catch (Throwable unused6) {
                    }
                }
                throw th;
            }
        } catch (Exception unused7) {
            inputStream = null;
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public static String j(CrashType crashType, JSONObject jSONObject) {
        String l = crashType == CrashType.NATIVE ? com.bytedance.crash.N.g.l() : (crashType == CrashType.ANR || crashType == CrashType.JAVA || crashType == CrashType.DART) ? com.bytedance.crash.N.g.j() : crashType == CrashType.LAUNCH ? com.bytedance.crash.N.g.k() : crashType == CrashType.ASAN ? com.bytedance.crash.N.g.d() : crashType == CrashType.COREDUMP ? com.bytedance.crash.N.g.f() : crashType == CrashType.NATIVE_CUSTOMIZE ? com.bytedance.crash.N.g.i() : com.bytedance.crash.N.g.j();
        return !com.bytedance.android.input.k.b.a.f0(jSONObject) ? d(l, jSONObject) : l;
    }

    public static HttpURLConnection k(URL url) throws IOException {
        com.bytedance.crash.Y.a aVar = b;
        return aVar == null ? (HttpURLConnection) url.openConnection() : aVar.a(url);
    }

    public static void l(d dVar) {
        a = dVar;
    }

    public static void m(com.bytedance.crash.Y.a aVar) {
        b = aVar;
    }

    public static boolean n(String str, int i, String str2, String str3, List<String> list) {
        JSONObject c2;
        try {
            com.bytedance.crash.Y.b a2 = C0651f.a();
            if (a2 != null) {
                a2.a("urlconnection");
            }
        } catch (Throwable unused) {
        }
        try {
            b bVar = new b(str, false);
            bVar.f(WsConstants.KEY_APP_ID, String.valueOf(i), false);
            bVar.f("device_id", str2, false);
            bVar.f(RomInfo.KEY_OS_TYPE, "Android", false);
            bVar.f("process_name", str3, false);
            Iterator<String> it2 = list.iterator();
            while (it2.hasNext()) {
                File file = new File(it2.next());
                if (file.exists()) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("logtype", "alog");
                    hashMap.put("scene", "npth");
                    bVar.b(file, hashMap);
                }
            }
            bVar.g("alog");
            try {
                c2 = bVar.h().c();
            } catch (Exception unused2) {
            }
            if (c2 == null) {
                return false;
            }
            return c2.optInt("errno", -1) == 200;
        } catch (IOException e2) {
            e2.printStackTrace();
            return false;
        }
    }

    public static boolean o(String str, String str2, String str3, String str4, File file) {
        try {
            com.bytedance.crash.Y.b a2 = C0651f.a();
            if (a2 != null) {
                a2.a("urlconnection");
            }
        } catch (Throwable unused) {
        }
        try {
            b bVar = new b(str2, false);
            bVar.f(RemoteMessageConst.DATA, str4, false);
            bVar.f("header", str3, false);
            bVar.c("file", file);
            bVar.g(str);
            try {
                j h = bVar.h();
                JSONObject c2 = h.c();
                if (c2 == null) {
                    return false;
                }
                if ("success".equals(c2.getString("message"))) {
                    return true;
                }
                com.bytedance.android.input.k.b.a.O0("corefile upload err msg=" + h);
                return false;
            } catch (Exception e2) {
                e2.printStackTrace();
                com.bytedance.android.input.k.b.a.O0("corefile responses err" + e2);
                return true;
            }
        } catch (IOException e3) {
            e3.printStackTrace();
            com.bytedance.android.input.k.b.a.O0("corefile upload err" + e3);
            return false;
        }
    }

    public static j p(String str, String str2, String str3, @NonNull List<File> list) {
        com.bytedance.android.input.k.b.a.W("upload crashType " + str);
        com.bytedance.android.input.k.b.a.W("upload url " + str2);
        for (File file : list) {
            StringBuilder M = e.a.a.a.a.M("upload attachments ");
            M.append(file.getAbsolutePath());
            com.bytedance.android.input.k.b.a.W(M.toString());
        }
        try {
            long f2 = h.f(null, new URL(str2));
            if (f2 < 0) {
                return new j(213);
            }
            if (f2 > 0) {
                return new j(214);
            }
            try {
                com.bytedance.crash.Y.b a2 = C0651f.a();
                if (a2 != null) {
                    a2.a("urlconnection");
                }
            } catch (Throwable unused) {
            }
            b bVar = new b(s(str2, "have_dump=true&encrypt=true"), true);
            bVar.f("json", str3, true);
            bVar.d("file", list);
            bVar.g(str);
            j h = bVar.h();
            com.bytedance.android.input.k.b.a.X("NPTH-CrashUpload", "uploadCrashLogWithAttachment:" + str + " success");
            return h;
        } catch (IOException e2) {
            e2.printStackTrace();
            com.bytedance.android.input.k.b.a.O0("err upload crash log " + e2);
            return new j(207);
        }
    }

    public static boolean q(String str, JSONObject jSONObject) {
        if (!TextUtils.isEmpty(str) && !com.bytedance.android.input.k.b.a.f0(jSONObject)) {
            try {
                return g(str, jSONObject.toString().getBytes(), CompressType.GZIP, true).d();
            } catch (Throwable th) {
                com.bytedance.android.input.k.b.a.P0(th);
            }
        }
        return false;
    }

    public static boolean r(String str, String str2, File... fileArr) {
        ArrayList arrayList = new ArrayList();
        for (File file : fileArr) {
            arrayList.add(file);
        }
        return p("ensure_zip", str, str2, arrayList).d();
    }

    static String s(String str, String str2) {
        try {
            if (TextUtils.isEmpty(new URL(str).getQuery())) {
                if (!str.endsWith("?")) {
                    str = str + "?";
                }
            } else if (!str.endsWith(ContainerUtils.FIELD_DELIMITER)) {
                str = str + ContainerUtils.FIELD_DELIMITER;
            }
            return str + str2;
        } catch (Throwable unused) {
            return str;
        }
    }
}
