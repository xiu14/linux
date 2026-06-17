package com.bumptech.glide.load.j;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public class h implements com.bumptech.glide.load.d {
    private final i b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    private final URL f1705c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    private final String f1706d;

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    private String f1707e;

    /* renamed from: f, reason: collision with root package name */
    @Nullable
    private URL f1708f;

    /* renamed from: g, reason: collision with root package name */
    @Nullable
    private volatile byte[] f1709g;
    private int h;

    public h(URL url) {
        i iVar = i.a;
        Objects.requireNonNull(url, "Argument must not be null");
        this.f1705c = url;
        this.f1706d = null;
        Objects.requireNonNull(iVar, "Argument must not be null");
        this.b = iVar;
    }

    @Override // com.bumptech.glide.load.d
    public void a(@NonNull MessageDigest messageDigest) {
        if (this.f1709g == null) {
            this.f1709g = c().getBytes(com.bumptech.glide.load.d.a);
        }
        messageDigest.update(this.f1709g);
    }

    public String c() {
        String str = this.f1706d;
        if (str != null) {
            return str;
        }
        URL url = this.f1705c;
        Objects.requireNonNull(url, "Argument must not be null");
        return url.toString();
    }

    public Map<String, String> d() {
        return this.b.d();
    }

    public URL e() throws MalformedURLException {
        if (this.f1708f == null) {
            if (TextUtils.isEmpty(this.f1707e)) {
                String str = this.f1706d;
                if (TextUtils.isEmpty(str)) {
                    URL url = this.f1705c;
                    Objects.requireNonNull(url, "Argument must not be null");
                    str = url.toString();
                }
                this.f1707e = Uri.encode(str, "@#&=*+-_.,:!?()/~'%;$");
            }
            this.f1708f = new URL(this.f1707e);
        }
        return this.f1708f;
    }

    @Override // com.bumptech.glide.load.d
    public boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return c().equals(hVar.c()) && this.b.equals(hVar.b);
    }

    @Override // com.bumptech.glide.load.d
    public int hashCode() {
        if (this.h == 0) {
            int hashCode = c().hashCode();
            this.h = hashCode;
            this.h = this.b.hashCode() + (hashCode * 31);
        }
        return this.h;
    }

    public String toString() {
        return c();
    }

    public h(String str) {
        i iVar = i.a;
        this.f1705c = null;
        if (!TextUtils.isEmpty(str)) {
            this.f1706d = str;
            Objects.requireNonNull(iVar, "Argument must not be null");
            this.b = iVar;
            return;
        }
        throw new IllegalArgumentException("Must not be null or empty");
    }
}
