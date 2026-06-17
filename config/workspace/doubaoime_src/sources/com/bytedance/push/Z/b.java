package com.bytedance.push.Z;

import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.bytedance.common.utility.Logger;
import com.ss.android.socialbase.downloader.utils.DownloadUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/* loaded from: classes2.dex */
public class b implements a {
    private boolean b(String str, String str2) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setConnectTimeout(15000);
        httpURLConnection.setReadTimeout(AccessibilityNodeInfoCompat.EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_MAX_LENGTH);
        httpURLConnection.setUseCaches(true);
        int responseCode = httpURLConnection.getResponseCode();
        if (responseCode >= 300) {
            httpURLConnection.disconnect();
            throw new IOException(responseCode + " " + httpURLConnection.getResponseMessage());
        }
        InputStream inputStream = httpURLConnection.getInputStream();
        if (inputStream == null) {
            return false;
        }
        if (httpURLConnection.getHeaderFieldInt(DownloadUtils.CONTENT_LENGTH, -1) == 0) {
            com.bytedance.android.input.k.b.a.g(inputStream);
            throw new IOException("Received response with 0 content-length header.");
        }
        FileOutputStream fileOutputStream = null;
        try {
            File file = new File(str2);
            if (!file.exists() && !file.createNewFile()) {
                com.bytedance.android.input.k.b.a.g(inputStream);
                return false;
            }
            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
            try {
                byte[] bArr = new byte[2048];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read == -1) {
                        fileOutputStream2.flush();
                        fileOutputStream2.close();
                        Logger.i("UrlConnectionDownloader", "download success");
                        com.bytedance.android.input.k.b.a.g(inputStream);
                        com.bytedance.android.input.k.b.a.g(fileOutputStream2);
                        return true;
                    }
                    fileOutputStream2.write(bArr, 0, read);
                }
            } catch (Throwable unused) {
                fileOutputStream = fileOutputStream2;
                com.bytedance.android.input.k.b.a.g(inputStream);
                if (fileOutputStream != null) {
                    com.bytedance.android.input.k.b.a.g(fileOutputStream);
                }
                return false;
            }
        } catch (Throwable unused2) {
        }
    }

    public boolean a(String str, String str2) {
        Logger.i("UrlConnectionDownloader", "download url:" + str + " targetPath:" + str2);
        try {
            return b(str, str2);
        } catch (Throwable unused) {
            return false;
        }
    }
}
