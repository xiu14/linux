package com.bytedance.push.O;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import androidx.annotation.Nullable;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.ss.android.socialbase.downloader.utils.DownloadUtils;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/* loaded from: classes2.dex */
public class d implements a {
    private Bitmap a(InputStream inputStream, c cVar) throws IOException {
        b bVar = new b(inputStream);
        long d2 = bVar.d(65536);
        byte[] bArr = new byte[12];
        boolean z = bVar.read(bArr, 0, 12) == 12 && "RIFF".equals(new String(bArr, 0, 4, "US-ASCII")) && "WEBP".equals(new String(bArr, 8, 4, "US-ASCII"));
        bVar.a(d2);
        if (!z) {
            Bitmap decodeStream = BitmapFactory.decodeStream(bVar, null, null);
            if (decodeStream != null) {
                return decodeStream;
            }
            throw new IOException("Failed to decode stream.");
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr2 = new byte[4096];
        while (true) {
            int read = bVar.read(bArr2);
            if (-1 == read) {
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                return BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length, null);
            }
            byteArrayOutputStream.write(bArr2, 0, read);
        }
    }

    private Bitmap b(c cVar) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(cVar.a.toString()).openConnection();
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
            return null;
        }
        try {
            if (httpURLConnection.getHeaderFieldInt(DownloadUtils.CONTENT_LENGTH, -1) != 0) {
                return a(inputStream, cVar);
            }
            com.bytedance.android.input.k.b.a.g(inputStream);
            throw new IOException("Received response with 0 content-length header.");
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        } finally {
            com.bytedance.android.input.k.b.a.g(inputStream);
        }
    }

    @Override // com.bytedance.push.O.a
    @Nullable
    public Bitmap downloadImage(c cVar) {
        try {
            return b(cVar);
        } catch (IOException e2) {
            e2.printStackTrace();
            return null;
        }
    }
}
