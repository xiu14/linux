package e.h.a.j.d;

import android.text.TextUtils;
import com.bytedance.apm.util.j;
import com.bytedance.common.wschannel.WsConstants;
import com.ss.android.socialbase.downloader.utils.DownloadHelper;
import e.h.a.j.c.b;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.net.HttpURLConnection;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes2.dex */
public class a {
    public static String a = "https://mon.zijieapi.com/monitor/collect/c/cloudcontrol/file";
    public static Map<String, String> b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    static final String f9962c;

    static {
        StringBuilder M = e.a.a.a.a.M("cloudMessage");
        M.append(UUID.randomUUID().toString());
        f9962c = M.toString();
    }

    private static boolean a(String str, File file, int i, String str2, String str3, String str4, long j, HashMap hashMap) {
        DataOutputStream dataOutputStream;
        if (TextUtils.isEmpty(str) || file == null || !file.exists()) {
            throw new IllegalArgumentException("url and file not be null ");
        }
        HttpURLConnection httpURLConnection = null;
        try {
            HttpURLConnection a2 = j.a(str);
            try {
                a2.setReadTimeout(30000);
                a2.setConnectTimeout(30000);
                a2.setDoInput(true);
                a2.setDoOutput(true);
                a2.setUseCaches(false);
                a2.setRequestMethod("POST");
                a2.setRequestProperty("Charset", "UTF-8");
                a2.setRequestProperty(WsConstants.KEY_CONNECTION, "keep-alive");
                a2.setRequestProperty(DownloadHelper.CONTENT_TYPE, "multipart/form-data;boundary=" + f9962c);
                Map<String, String> map = b;
                if (map != null && !map.isEmpty()) {
                    for (Map.Entry<String, String> entry : b.entrySet()) {
                        String key = entry.getKey();
                        String value = entry.getValue();
                        if (!TextUtils.isEmpty(key) && !TextUtils.isEmpty(value)) {
                            a2.setRequestProperty(key, value);
                        }
                    }
                }
                a2.connect();
                dataOutputStream = new DataOutputStream(a2.getOutputStream());
                try {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("--");
                    String str5 = f9962c;
                    stringBuffer.append(str5);
                    stringBuffer.append("\r\n");
                    stringBuffer.append("Content-Disposition: form-data; name=\"status\"\r\n\r\n" + i + "\r\n--" + str5 + "\r\n");
                    stringBuffer.append("Content-Disposition: form-data; name=\"cid\"\r\n\r\n" + str3 + "\r\n--" + str5 + "\r\n");
                    stringBuffer.append("Content-Disposition: form-data; name=\"err_msg\"\r\n\r\n" + str4 + "\r\n--" + str5 + "\r\n");
                    stringBuffer.append("Content-Disposition: form-data; name=\"operate_time\"\r\n\r\n" + j + "\r\n--" + str5 + "\r\n");
                    StringBuilder sb = new StringBuilder();
                    sb.append("Content-Disposition: form-data; name=\"aid\"\r\n\r\n");
                    e.h.a.a.g();
                    sb.append("");
                    sb.append("\r\n");
                    sb.append("--");
                    sb.append(str5);
                    sb.append("\r\n");
                    stringBuffer.append(sb.toString());
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Content-Disposition: form-data; name=\"update_version_code\"\r\n\r\n");
                    e.h.a.a.g();
                    sb2.append("");
                    sb2.append("\r\n");
                    sb2.append("--");
                    sb2.append(str5);
                    sb2.append("\r\n");
                    stringBuffer.append(sb2.toString());
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Content-Disposition: form-data; name=\"uid\"\r\n\r\n");
                    e.h.a.a.g();
                    sb3.append("");
                    sb3.append("\r\n");
                    sb3.append("--");
                    sb3.append(str5);
                    sb3.append("\r\n");
                    stringBuffer.append(sb3.toString());
                    if (i == 2 || i == 3 || (i == 0 && hashMap != null && !hashMap.isEmpty())) {
                        dataOutputStream.write(stringBuffer.toString().getBytes());
                        e(dataOutputStream, hashMap);
                        stringBuffer.setLength(0);
                    }
                    stringBuffer.append("Content-Disposition: form-data; name=\"file\"; filetype=\"" + str2 + "\"; filename=\"" + file.getName() + "\"\r\n");
                    stringBuffer.append("Content-Type: text/plain\r\n");
                    stringBuffer.append("\r\n");
                    dataOutputStream.write(stringBuffer.toString().getBytes());
                    FileInputStream fileInputStream = new FileInputStream(file);
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int read = fileInputStream.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        dataOutputStream.write(bArr, 0, read);
                    }
                    fileInputStream.close();
                    dataOutputStream.write("\r\n".getBytes());
                    dataOutputStream.write(("--" + f9962c + "--\r\n").getBytes());
                    dataOutputStream.flush();
                    dataOutputStream.close();
                    if (a2.getResponseCode() == 200) {
                        a2.disconnect();
                        try {
                            dataOutputStream.close();
                        } catch (Throwable th) {
                            th.printStackTrace();
                        }
                        return true;
                    }
                    a2.disconnect();
                    try {
                        dataOutputStream.close();
                    } catch (Throwable th2) {
                        th2.printStackTrace();
                    }
                    return false;
                } catch (Throwable th3) {
                    th = th3;
                    httpURLConnection = a2;
                    try {
                        th.printStackTrace();
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        if (dataOutputStream != null) {
                            try {
                                dataOutputStream.close();
                            } catch (Throwable th4) {
                                th4.printStackTrace();
                            }
                        }
                        return false;
                    } finally {
                    }
                }
            } catch (Throwable th5) {
                th = th5;
                dataOutputStream = null;
            }
        } catch (Throwable th6) {
            th = th6;
            dataOutputStream = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v4, types: [java.io.DataOutputStream] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.io.DataOutputStream] */
    /* JADX WARN: Type inference failed for: r1v4 */
    public static boolean b(b bVar) {
        ?? r1;
        HttpURLConnection a2;
        ?? dataOutputStream;
        String str = a;
        int a3 = bVar.a();
        String b2 = bVar.b();
        String c2 = bVar.c();
        long e2 = bVar.e();
        HashMap<String, String> f2 = bVar.f();
        HttpURLConnection httpURLConnection = null;
        try {
            try {
                a2 = j.a(str);
                try {
                    a2.setReadTimeout(30000);
                    a2.setConnectTimeout(30000);
                    a2.setDoInput(true);
                    a2.setDoOutput(true);
                    a2.setUseCaches(false);
                    a2.setRequestMethod("POST");
                    a2.setRequestProperty("Charset", "UTF-8");
                    a2.setRequestProperty(WsConstants.KEY_CONNECTION, "keep-alive");
                    a2.setRequestProperty(DownloadHelper.CONTENT_TYPE, "multipart/form-data;boundary=" + f9962c);
                    Map<String, String> map = b;
                    if (map != null && !map.isEmpty()) {
                        for (Map.Entry<String, String> entry : b.entrySet()) {
                            String key = entry.getKey();
                            String value = entry.getValue();
                            if (!TextUtils.isEmpty(key) && !TextUtils.isEmpty(value)) {
                                a2.setRequestProperty(key, value);
                            }
                        }
                    }
                    a2.connect();
                    dataOutputStream = new DataOutputStream(a2.getOutputStream());
                    try {
                        StringBuffer stringBuffer = new StringBuffer();
                        stringBuffer.append("--");
                        String str2 = f9962c;
                        stringBuffer.append(str2);
                        stringBuffer.append("\r\n");
                        stringBuffer.append("Content-Disposition: form-data; name=\"status\"\r\n\r\n" + a3 + "\r\n--" + str2 + "\r\n");
                        stringBuffer.append("Content-Disposition: form-data; name=\"cid\"\r\n\r\n" + b2 + "\r\n--" + str2 + "\r\n");
                        stringBuffer.append("Content-Disposition: form-data; name=\"err_msg\"\r\n\r\n" + c2 + "\r\n--" + str2 + "\r\n");
                        StringBuilder sb = new StringBuilder();
                        sb.append("Content-Disposition: form-data; name=\"aid\"\r\n\r\n");
                        e.h.a.a.g();
                        sb.append("");
                        sb.append("\r\n");
                        sb.append("--");
                        sb.append(str2);
                        sb.append("\r\n");
                        stringBuffer.append(sb.toString());
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Content-Disposition: form-data; name=\"update_version_code\"\r\n\r\n");
                        e.h.a.a.g();
                        sb2.append("");
                        sb2.append("\r\n");
                        sb2.append("--");
                        sb2.append(str2);
                        sb2.append("\r\n");
                        stringBuffer.append(sb2.toString());
                        stringBuffer.append("Content-Disposition: form-data; name=\"operate_time\"\r\n\r\n" + e2 + "\r\n--" + str2 + "\r\n");
                        if (a3 == 2 || a3 == 3 || (a3 == 0 && f2 != null && !f2.isEmpty())) {
                            dataOutputStream.write(stringBuffer.toString().getBytes());
                            e(dataOutputStream, f2);
                            stringBuffer.setLength(0);
                        }
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("Content-Disposition: form-data; name=\"uid\"\r\n\r\n");
                        e.h.a.a.g();
                        sb3.append("");
                        sb3.append("\r\n");
                        sb3.append("--");
                        sb3.append(str2);
                        sb3.append("\r\n");
                        stringBuffer.append(sb3.toString());
                        dataOutputStream.write(stringBuffer.toString().getBytes());
                        dataOutputStream.flush();
                        dataOutputStream.close();
                    } catch (Throwable th) {
                        th = th;
                        httpURLConnection = dataOutputStream;
                        r1 = httpURLConnection;
                        httpURLConnection = a2;
                        try {
                            th.printStackTrace();
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            if (r1 != 0) {
                                r1.close();
                            }
                            return false;
                        } finally {
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th3.printStackTrace();
            }
        } catch (Throwable th4) {
            th = th4;
            r1 = 0;
        }
        if (a2.getResponseCode() != 200) {
            a2.disconnect();
            dataOutputStream.close();
            return false;
        }
        a2.disconnect();
        try {
            dataOutputStream.close();
        } catch (Throwable th5) {
            th5.printStackTrace();
        }
        return true;
    }

    public static boolean c(e.h.a.j.c.a aVar) {
        int i = 0;
        boolean z = false;
        while (i < aVar.l().size()) {
            File file = new File(aVar.l().get(i));
            if (file.exists()) {
                int i2 = i < aVar.l().size() - 1 ? 1 : 2;
                if (aVar.o()) {
                    i2 = aVar.a();
                }
                boolean a2 = a(a, file, i2, aVar.k(), aVar.b(), aVar.c(), aVar.e(), aVar.f());
                if (a2 && aVar.m()) {
                    file.delete();
                }
                z = i == 0 ? a2 : z && a2;
            }
            i++;
        }
        return z;
    }

    public static boolean d(File file, int i, String str, String str2, String str3, long j, HashMap<String, String> hashMap) {
        return a(a, file, i, str, str2, str3, j, null);
    }

    private static void e(DataOutputStream dataOutputStream, HashMap<String, String> hashMap) throws Throwable {
        if (e.h.a.a.g().d() != null && e.h.a.a.g().d().size() != 0) {
            dataOutputStream.write(("Content-Disposition: form-data; name=\"fileCommon\"; filetype=\"command_commonparams\"; filename=\"common_params.txt\"\r\nContent-Type: text/plain\r\n\r\n").getBytes());
            dataOutputStream.write(com.bytedance.feedbackerlib.a.E(e.h.a.a.g().d()).getBytes());
            dataOutputStream.write("\r\n".getBytes());
            dataOutputStream.write(("--" + f9962c + "\r\n").getBytes());
            dataOutputStream.flush();
        }
        if (hashMap == null || hashMap.size() == 0) {
            return;
        }
        dataOutputStream.write(("Content-Disposition: form-data; name=\"fileSpecific\"; filetype=\"command_specificparams\"; filename=\"specific_params.txt\"\r\nContent-Type: text/plain\r\n\r\n").getBytes());
        dataOutputStream.write(com.bytedance.feedbackerlib.a.E(hashMap).getBytes());
        dataOutputStream.write("\r\n".getBytes());
        dataOutputStream.write(("--" + f9962c + "\r\n").getBytes());
        dataOutputStream.flush();
    }
}
