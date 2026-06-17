package com.bytedance.apm.net;

import android.text.TextUtils;
import com.bytedance.apm.util.j;
import com.bytedance.services.apm.api.c;
import com.bytedance.services.apm.api.g;
import com.ss.android.socialbase.downloader.utils.DownloadHelper;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.zip.GZIPOutputStream;

/* loaded from: classes.dex */
class b implements g {
    private final String a;
    private HttpURLConnection b;

    /* renamed from: c, reason: collision with root package name */
    private String f3461c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f3462d;

    /* renamed from: e, reason: collision with root package name */
    private DataOutputStream f3463e;

    /* renamed from: f, reason: collision with root package name */
    private GZIPOutputStream f3464f;

    public b(String str, String str2, boolean z, Map<String, String> map) throws IOException {
        this.f3461c = str2;
        this.f3462d = z;
        StringBuilder M = e.a.a.a.a.M("AAA");
        M.append(System.currentTimeMillis());
        M.append("AAA");
        String sb = M.toString();
        this.a = sb;
        HttpURLConnection a = j.a(str);
        this.b = a;
        a.setUseCaches(false);
        this.b.setDoOutput(true);
        this.b.setDoInput(true);
        this.b.setRequestMethod("POST");
        this.b.setRequestProperty(DownloadHelper.CONTENT_TYPE, "multipart/form-data; boundary=" + sb);
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                this.b.setRequestProperty(entry.getKey(), entry.getValue());
            }
        }
        HttpURLConnection httpURLConnection = this.b;
        StringBuilder M2 = e.a.a.a.a.M("multipart/form-data; boundary=");
        M2.append(this.a);
        httpURLConnection.setRequestProperty(DownloadHelper.CONTENT_TYPE, M2.toString());
        if (!z) {
            this.f3463e = new DataOutputStream(this.b.getOutputStream());
        } else {
            this.b.setRequestProperty(DownloadHelper.CONTENT_ENCODING, DownloadHelper.GZIP);
            this.f3464f = new GZIPOutputStream(this.b.getOutputStream());
        }
    }

    @Override // com.bytedance.services.apm.api.g
    public void a(String str, String str2, String str3, Map<String, String> map) throws IOException {
        StringBuilder sb = new StringBuilder(100);
        sb.append("--");
        e.a.a.a.a.M0(sb, this.a, "\r\n", "Content-Disposition: form-data; name=\"", str);
        sb.append("\"; filename=\"");
        sb.append(str);
        sb.append("\"");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            sb.append("; ");
            sb.append(entry.getKey());
            sb.append("=\"");
            sb.append(entry.getValue());
            sb.append("\"");
        }
        if (!TextUtils.isEmpty(str3)) {
            e.a.a.a.a.M0(sb, "\r\n", "Content-Type: ", str3, "\r\n");
        }
        sb.append("\r\n");
        if (this.f3462d) {
            this.f3464f.write(sb.toString().getBytes());
        } else {
            this.f3463e.write(sb.toString().getBytes());
        }
        if (str2 == null) {
            str2 = "";
        }
        if (this.f3462d) {
            this.f3464f.write(str2.getBytes());
        } else {
            this.f3463e.write(str2.getBytes());
        }
        if (this.f3462d) {
            this.f3464f.write("\r\n".getBytes());
        } else {
            this.f3463e.write("\r\n".getBytes());
            this.f3463e.flush();
        }
    }

    @Override // com.bytedance.services.apm.api.g
    public c b() throws IOException {
        ArrayList arrayList = new ArrayList();
        StringBuilder M = e.a.a.a.a.M("\r\n--");
        M.append(this.a);
        M.append("--");
        M.append("\r\n");
        byte[] bytes = M.toString().getBytes();
        if (this.f3462d) {
            this.f3464f.write(bytes);
            this.f3464f.finish();
            this.f3464f.close();
        } else {
            this.f3463e.write(bytes);
            this.f3463e.flush();
            this.f3463e.close();
        }
        int responseCode = this.b.getResponseCode();
        if (responseCode != 200) {
            throw new IOException(e.a.a.a.a.j("Server returned non-OK status: ", responseCode));
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.b.getInputStream()));
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                break;
            }
            arrayList.add(readLine);
        }
        bufferedReader.close();
        this.b.disconnect();
        StringBuilder sb = new StringBuilder();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
        }
        return new c(responseCode, sb.toString().getBytes());
    }

    @Override // com.bytedance.services.apm.api.g
    public void c(String str, String str2) {
        StringBuilder sb = new StringBuilder(100);
        sb.append("--");
        e.a.a.a.a.M0(sb, this.a, "\r\n", "Content-Disposition: form-data; name=\"", str);
        e.a.a.a.a.K0(sb, "\"", "\r\n", "Content-Type: text/plain; charset=");
        e.a.a.a.a.M0(sb, this.f3461c, "\r\n", "\r\n", str2);
        sb.append("\r\n");
        try {
            if (this.f3462d) {
                this.f3464f.write(sb.toString().getBytes());
            } else {
                this.f3463e.write(sb.toString().getBytes());
            }
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.bytedance.services.apm.api.g
    public void d(String str, File file, String str2, Map<String, String> map) throws IOException {
        String name = file.getName();
        StringBuilder sb = new StringBuilder(100);
        sb.append("--");
        e.a.a.a.a.M0(sb, this.a, "\r\n", "Content-Disposition: form-data; name=\"", str);
        sb.append("\"; filename=\"");
        sb.append(name);
        sb.append("\"");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            sb.append("; ");
            sb.append(entry.getKey());
            sb.append("=\"");
            sb.append(entry.getValue());
            sb.append("\"");
        }
        if (!TextUtils.isEmpty(null)) {
            e.a.a.a.a.M0(sb, "\r\n", "Content-Type: ", null, "\r\n");
        }
        e.a.a.a.a.M0(sb, "\r\n", "Content-Transfer-Encoding: binary", "\r\n", "\r\n");
        if (this.f3462d) {
            this.f3464f.write(sb.toString().getBytes());
        } else {
            this.f3463e.write(sb.toString().getBytes());
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        byte[] bArr = new byte[8192];
        while (true) {
            int read = fileInputStream.read(bArr);
            if (read == -1) {
                break;
            } else if (this.f3462d) {
                this.f3464f.write(bArr, 0, read);
            } else {
                this.f3463e.write(bArr, 0, read);
            }
        }
        fileInputStream.close();
        if (this.f3462d) {
            this.f3464f.write("\r\n".getBytes());
        } else {
            this.f3463e.write("\r\n".getBytes());
            this.f3463e.flush();
        }
    }
}
