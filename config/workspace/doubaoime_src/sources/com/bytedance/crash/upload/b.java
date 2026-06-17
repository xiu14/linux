package com.bytedance.crash.upload;

import androidx.annotation.Nullable;
import com.bytedance.crash.C0651f;
import com.bytedance.crash.Q.b;
import com.bytedance.crash.m;
import com.ss.android.socialbase.downloader.utils.DownloadHelper;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.net.ssl.SSLContext;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class b {
    private final String a;
    private final HttpURLConnection b;

    /* renamed from: c, reason: collision with root package name */
    private final b.C0199b f4687c;

    /* renamed from: d, reason: collision with root package name */
    private final c f4688d;

    /* renamed from: e, reason: collision with root package name */
    public final m f4689e;

    public b(String str, boolean z) throws IOException {
        Map<String, String> a;
        StringBuilder M = e.a.a.a.a.M("AAA");
        M.append(System.currentTimeMillis());
        M.append("AAA");
        this.a = M.toString();
        try {
            SSLContext.getInstance(SSLSocketFactory.TLS).init(null, null, null);
        } catch (Throwable unused) {
        }
        HttpURLConnection k = CrashUploader.k(new URL(str));
        this.b = k;
        k.setUseCaches(false);
        k.setDoOutput(true);
        k.setDoInput(true);
        k.setRequestMethod("POST");
        k.setRequestProperty(DownloadHelper.CONTENT_TYPE, "multipart/form-data; boundary=" + this.a);
        if (z) {
            k.setRequestProperty(DownloadHelper.CONTENT_ENCODING, DownloadHelper.GZIP);
        }
        try {
            com.bytedance.crash.Y.c b = C0651f.b();
            if (b != null && (a = b.a("urlconnection")) != null) {
                for (String str2 : a.keySet()) {
                    this.b.setRequestProperty(str2, a.get(str2));
                }
            }
        } catch (Throwable unused2) {
        }
        this.f4688d = new c(this.b.getOutputStream(), z);
        this.f4689e = com.bytedance.crash.N.h.b();
        this.f4687c = new b.C0199b("crash_upload_size");
    }

    private void a(File file) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        byte[] bArr = new byte[8192];
        while (true) {
            int read = fileInputStream.read(bArr);
            if (read == -1) {
                fileInputStream.close();
                this.f4688d.d("\r\n");
                return;
            }
            this.f4688d.f(bArr, 0, read);
        }
    }

    private void e(String str, @Nullable Map<String, String> map) throws IOException {
        StringBuilder M = e.a.a.a.a.M("--");
        e.a.a.a.a.M0(M, this.a, "\r\n", "Content-Disposition: form-data; name=\"", str);
        e.a.a.a.a.K0(M, "\"; filename=\"", str, "\"");
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                M.append("; ");
                M.append(entry.getKey());
                M.append("=\"");
                M.append(entry.getValue());
                M.append("\"");
            }
        }
        e.a.a.a.a.M0(M, "\r\n", "Content-Transfer-Encoding: binary", "\r\n", "\r\n");
        this.f4688d.e(M.toString().getBytes());
    }

    public void b(File file, Map<String, String> map) throws IOException {
        e(file.getName(), map);
        a(file);
    }

    public void c(String str, File file) throws IOException {
        long b = this.f4688d.b();
        e(str, null);
        a(file);
        this.f4687c.c(e.a.a.a.a.s(str, "_size"), Long.valueOf(this.f4688d.b() - b));
    }

    public void d(String str, List<File> list) throws IOException {
        long b = this.f4688d.b();
        e(str, null);
        this.f4688d.g(list);
        this.f4688d.d("\r\n");
        this.f4687c.c(e.a.a.a.a.s(str, "_size"), Long.valueOf(this.f4688d.b() - b));
    }

    public void f(String str, String str2, boolean z) {
        long b = this.f4688d.b();
        StringBuilder M = e.a.a.a.a.M("--");
        e.a.a.a.a.M0(M, this.a, "\r\n", "Content-Disposition: form-data; name=\"", str);
        e.a.a.a.a.M0(M, "\"", "\r\n", "Content-Type: text/plain; charset=UTF-8", "\r\n");
        M.append("\r\n");
        try {
            this.f4688d.d(M.toString());
        } catch (IOException unused) {
        }
        byte[] bytes = str2.getBytes();
        if (z) {
            try {
                bytes = this.f4689e.a(bytes);
            } catch (Throwable unused2) {
            }
        }
        try {
            this.f4688d.e(bytes);
            this.f4688d.d("\r\n");
        } catch (IOException unused3) {
        }
        this.f4687c.c(e.a.a.a.a.s(str, "_size"), Long.valueOf(this.f4688d.b() - b));
    }

    public void g(String str) throws IOException {
        this.f4688d.d(e.a.a.a.a.K(e.a.a.a.a.M("\r\n--"), this.a, "--", "\r\n"));
        this.f4688d.a();
        this.f4687c.a("data_type", str);
        this.f4687c.c("total_size", Long.valueOf(this.f4688d.b()));
        this.f4687c.d();
    }

    public j h() throws IOException {
        JSONObject jSONObject;
        ArrayList arrayList = new ArrayList();
        StringBuilder M = e.a.a.a.a.M("getHeaderFields:");
        M.append(this.b.getHeaderFields());
        com.bytedance.android.input.k.b.a.p(M.toString());
        int responseCode = this.b.getResponseCode();
        j jVar = new j(responseCode);
        if (responseCode == 200) {
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
        } else {
            jVar.g(207);
        }
        StringBuilder sb = new StringBuilder();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
        }
        try {
            jSONObject = new JSONObject(sb.toString());
        } catch (JSONException unused) {
            jSONObject = new JSONObject();
            jVar.g(207);
        }
        jVar.j(jSONObject);
        try {
            h.z(this.b.getURL(), jVar);
        } catch (Throwable unused2) {
        }
        jVar.f(sb.toString().getBytes());
        return jVar;
    }
}
