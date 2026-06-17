package com.bumptech.glide.load.data;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.d;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public class j implements d<InputStream> {

    /* renamed from: g, reason: collision with root package name */
    @VisibleForTesting
    static final b f1567g = new a();
    private final com.bumptech.glide.load.j.h a;
    private final int b;

    /* renamed from: c, reason: collision with root package name */
    private final b f1568c;

    /* renamed from: d, reason: collision with root package name */
    private HttpURLConnection f1569d;

    /* renamed from: e, reason: collision with root package name */
    private InputStream f1570e;

    /* renamed from: f, reason: collision with root package name */
    private volatile boolean f1571f;

    private static class a implements b {
        a() {
        }
    }

    interface b {
    }

    public j(com.bumptech.glide.load.j.h hVar, int i) {
        b bVar = f1567g;
        this.a = hVar;
        this.b = i;
        this.f1568c = bVar;
    }

    private static int c(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getResponseCode();
        } catch (IOException e2) {
            if (!Log.isLoggable("HttpUrlFetcher", 3)) {
                return -1;
            }
            Log.d("HttpUrlFetcher", "Failed to get a response code", e2);
            return -1;
        }
    }

    private InputStream f(URL url, int i, URL url2, Map<String, String> map) throws com.bumptech.glide.load.b {
        if (i >= 5) {
            throw new com.bumptech.glide.load.b("Too many (> 5) redirects!", -1, null);
        }
        if (url2 != null) {
            try {
                if (url.toURI().equals(url2.toURI())) {
                    throw new com.bumptech.glide.load.b("In re-direct loop", -1, null);
                }
            } catch (URISyntaxException unused) {
            }
        }
        try {
            Objects.requireNonNull((a) this.f1568c);
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                httpURLConnection.addRequestProperty(entry.getKey(), entry.getValue());
            }
            httpURLConnection.setConnectTimeout(this.b);
            httpURLConnection.setReadTimeout(this.b);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setInstanceFollowRedirects(false);
            this.f1569d = httpURLConnection;
            try {
                httpURLConnection.connect();
                this.f1570e = this.f1569d.getInputStream();
                if (this.f1571f) {
                    return null;
                }
                int c2 = c(this.f1569d);
                int i2 = c2 / 100;
                if (i2 == 2) {
                    HttpURLConnection httpURLConnection2 = this.f1569d;
                    try {
                        if (TextUtils.isEmpty(httpURLConnection2.getContentEncoding())) {
                            this.f1570e = com.bumptech.glide.util.b.d(httpURLConnection2.getInputStream(), httpURLConnection2.getContentLength());
                        } else {
                            if (Log.isLoggable("HttpUrlFetcher", 3)) {
                                Log.d("HttpUrlFetcher", "Got non empty content encoding: " + httpURLConnection2.getContentEncoding());
                            }
                            this.f1570e = httpURLConnection2.getInputStream();
                        }
                        return this.f1570e;
                    } catch (IOException e2) {
                        throw new com.bumptech.glide.load.b("Failed to obtain InputStream", c(httpURLConnection2), e2);
                    }
                }
                if (!(i2 == 3)) {
                    if (c2 == -1) {
                        throw new com.bumptech.glide.load.b("Http request failed", c2, null);
                    }
                    try {
                        throw new com.bumptech.glide.load.b(this.f1569d.getResponseMessage(), c2, null);
                    } catch (IOException e3) {
                        throw new com.bumptech.glide.load.b("Failed to get a response message", c2, e3);
                    }
                }
                String headerField = this.f1569d.getHeaderField("Location");
                if (TextUtils.isEmpty(headerField)) {
                    throw new com.bumptech.glide.load.b("Received empty or null redirect url", c2, null);
                }
                try {
                    URL url3 = new URL(url, headerField);
                    b();
                    return f(url3, i + 1, url, map);
                } catch (MalformedURLException e4) {
                    throw new com.bumptech.glide.load.b(e.a.a.a.a.s("Bad redirect url: ", headerField), c2, e4);
                }
            } catch (IOException e5) {
                throw new com.bumptech.glide.load.b("Failed to connect or obtain data", c(this.f1569d), e5);
            }
        } catch (IOException e6) {
            throw new com.bumptech.glide.load.b("URL.openConnection threw", 0, e6);
        }
    }

    @Override // com.bumptech.glide.load.data.d
    @NonNull
    public Class<InputStream> a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.d
    public void b() {
        InputStream inputStream = this.f1570e;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.f1569d;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.f1569d = null;
    }

    @Override // com.bumptech.glide.load.data.d
    public void cancel() {
        this.f1571f = true;
    }

    @Override // com.bumptech.glide.load.data.d
    @NonNull
    public DataSource d() {
        return DataSource.REMOTE;
    }

    @Override // com.bumptech.glide.load.data.d
    public void e(@NonNull Priority priority, @NonNull d.a<? super InputStream> aVar) {
        StringBuilder sb;
        int i = com.bumptech.glide.util.f.b;
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            try {
                aVar.f(f(this.a.e(), 0, null, this.a.d()));
            } catch (IOException e2) {
                if (Log.isLoggable("HttpUrlFetcher", 3)) {
                    Log.d("HttpUrlFetcher", "Failed to load data for url", e2);
                }
                aVar.c(e2);
                if (!Log.isLoggable("HttpUrlFetcher", 2)) {
                    return;
                } else {
                    sb = new StringBuilder();
                }
            }
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                sb = new StringBuilder();
                sb.append("Finished http url fetcher fetch in ");
                sb.append(com.bumptech.glide.util.f.a(elapsedRealtimeNanos));
                Log.v("HttpUrlFetcher", sb.toString());
            }
        } catch (Throwable th) {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                StringBuilder M = e.a.a.a.a.M("Finished http url fetcher fetch in ");
                M.append(com.bumptech.glide.util.f.a(elapsedRealtimeNanos));
                Log.v("HttpUrlFetcher", M.toString());
            }
            throw th;
        }
    }
}
