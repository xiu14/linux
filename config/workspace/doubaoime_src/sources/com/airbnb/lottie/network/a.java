package com.airbnb.lottie.network;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

/* loaded from: classes.dex */
public class a implements Closeable {

    @NonNull
    private final HttpURLConnection a;

    public a(@NonNull HttpURLConnection httpURLConnection) {
        this.a = httpURLConnection;
    }

    private String l(HttpURLConnection httpURLConnection) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getErrorStream()));
        StringBuilder sb = new StringBuilder();
        while (true) {
            try {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine != null) {
                        sb.append(readLine);
                        sb.append('\n');
                    } else {
                        try {
                            break;
                        } catch (Exception unused) {
                        }
                    }
                } catch (Exception e2) {
                    throw e2;
                }
            } finally {
                try {
                    bufferedReader.close();
                } catch (Exception unused2) {
                }
            }
        }
        return sb.toString();
    }

    @NonNull
    public InputStream a() throws IOException {
        return this.a.getInputStream();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.a.disconnect();
    }

    @Nullable
    public String d() {
        return this.a.getContentType();
    }

    @Nullable
    public String h() {
        boolean z = false;
        try {
            if (this.a.getResponseCode() / 100 == 2) {
                z = true;
            }
        } catch (IOException unused) {
        }
        if (z) {
            return null;
        }
        try {
            return "Unable to fetch " + this.a.getURL() + ". Failed with " + this.a.getResponseCode() + "\n" + l(this.a);
        } catch (IOException e2) {
            com.airbnb.lottie.y.d.d("get error failed ", e2);
            return e2.getMessage();
        }
    }

    public boolean o() {
        try {
            return this.a.getResponseCode() / 100 == 2;
        } catch (IOException unused) {
            return false;
        }
    }
}
