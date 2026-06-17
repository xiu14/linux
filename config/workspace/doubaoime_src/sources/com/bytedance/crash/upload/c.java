package com.bytedance.crash.upload;

import androidx.annotation.NonNull;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.zip.GZIPOutputStream;

/* loaded from: classes.dex */
public class c {
    private final OutputStream a;
    private final a b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f4690c;

    static class b extends DataOutputStream {
        public b(OutputStream outputStream) {
            super(outputStream);
        }

        public void a() throws IOException {
            super.close();
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }
    }

    /* renamed from: com.bytedance.crash.upload.c$c, reason: collision with other inner class name */
    static class C0218c extends GZIPOutputStream {
        public C0218c(OutputStream outputStream) throws IOException {
            super(outputStream);
        }

        public void a() throws IOException {
            super.close();
        }

        @Override // java.util.zip.DeflaterOutputStream, java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        public void d() throws IOException {
            super.finish();
        }

        @Override // java.util.zip.GZIPOutputStream, java.util.zip.DeflaterOutputStream
        public void finish() {
        }
    }

    c(OutputStream outputStream, boolean z) throws IOException {
        a aVar = new a(outputStream);
        this.b = aVar;
        if (z) {
            this.a = new C0218c(aVar);
        } else {
            this.a = new b(aVar);
        }
        this.f4690c = z;
    }

    static byte[] c(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[8192];
        while (true) {
            int read = inputStream.read(bArr);
            if (-1 == read) {
                break;
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
        inputStream.close();
        try {
            return byteArrayOutputStream.toByteArray();
        } finally {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable unused) {
            }
        }
    }

    public void a() throws IOException {
        if (this.f4690c) {
            C0218c c0218c = (C0218c) this.a;
            c0218c.d();
            c0218c.a();
        } else {
            b bVar = (b) this.a;
            bVar.flush();
            bVar.a();
        }
    }

    public long b() {
        return this.b.a();
    }

    public void d(String str) throws IOException {
        this.a.write(str.getBytes());
    }

    public void e(byte[] bArr) throws IOException {
        this.a.write(bArr);
    }

    public void f(byte[] bArr, int i, int i2) throws IOException {
        this.a.write(bArr, i, i2);
    }

    public void g(@NonNull List<File> list) throws IOException {
        com.bytedance.crash.util.a.z(this.a, list);
    }

    static class a extends FilterOutputStream {
        private long a;

        public a(@NonNull OutputStream outputStream) {
            super(outputStream);
            this.a = 0L;
        }

        long a() {
            return this.a;
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(int i) throws IOException {
            this.a++;
            ((FilterOutputStream) this).out.write(i);
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(@NonNull byte[] bArr, int i, int i2) throws IOException {
            this.a += i2;
            ((FilterOutputStream) this).out.write(bArr, i, i2);
        }
    }
}
