package com.bytedance.frameworks.baselib.network;

import com.bytedance.frameworks.baselib.network.http.e;
import com.bytedance.retrofit2.RetrofitMetrics;
import com.bytedance.retrofit2.client.d;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public class a extends e {

    /* renamed from: c, reason: collision with root package name */
    private com.bytedance.frameworks.baselib.network.http.b f5013c;

    public a(InputStream inputStream, d dVar, com.bytedance.frameworks.baselib.network.http.b bVar) {
        super(inputStream, dVar);
        this.f5013c = bVar;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.e, java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        RetrofitMetrics retrofitMetrics = this.f5013c.f5083d;
        if (retrofitMetrics != null) {
            retrofitMetrics.R();
        }
        try {
            int read = super.read(bArr);
            RetrofitMetrics retrofitMetrics2 = this.f5013c.f5083d;
            if (retrofitMetrics2 != null) {
                retrofitMetrics2.Q();
            }
            return read;
        } catch (Throwable th) {
            if (this.f5013c.f5083d != null) {
                this.f5013c.f5083d.Q();
            }
            throw th;
        }
    }

    @Override // com.bytedance.frameworks.baselib.network.http.e, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        RetrofitMetrics retrofitMetrics = this.f5013c.f5083d;
        if (retrofitMetrics != null) {
            retrofitMetrics.R();
        }
        try {
            int read = super.read(bArr, i, i2);
            RetrofitMetrics retrofitMetrics2 = this.f5013c.f5083d;
            if (retrofitMetrics2 != null) {
                retrofitMetrics2.Q();
            }
            return read;
        } catch (Throwable th) {
            if (this.f5013c.f5083d != null) {
                this.f5013c.f5083d.Q();
            }
            throw th;
        }
    }

    @Override // com.bytedance.frameworks.baselib.network.http.e, java.io.InputStream
    public int read() throws IOException {
        RetrofitMetrics retrofitMetrics = this.f5013c.f5083d;
        if (retrofitMetrics != null) {
            retrofitMetrics.R();
        }
        try {
            int read = super.read();
            RetrofitMetrics retrofitMetrics2 = this.f5013c.f5083d;
            if (retrofitMetrics2 != null) {
                retrofitMetrics2.Q();
            }
            return read;
        } catch (Throwable th) {
            if (this.f5013c.f5083d != null) {
                this.f5013c.f5083d.Q();
            }
            throw th;
        }
    }
}
