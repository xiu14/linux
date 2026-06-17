package com.bumptech.glide.util;

import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Queue;

/* loaded from: classes.dex */
public final class c extends InputStream {

    /* renamed from: c, reason: collision with root package name */
    @GuardedBy("POOL")
    private static final Queue<c> f1858c;
    private InputStream a;
    private IOException b;

    static {
        int i = j.f1862d;
        f1858c = new ArrayDeque(0);
    }

    c() {
    }

    @NonNull
    public static c d(@NonNull InputStream inputStream) {
        c poll;
        Queue<c> queue = f1858c;
        synchronized (queue) {
            poll = queue.poll();
        }
        if (poll == null) {
            poll = new c();
        }
        poll.a = inputStream;
        return poll;
    }

    @Nullable
    public IOException a() {
        return this.b;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        return this.a.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.a.close();
    }

    public void h() {
        this.b = null;
        this.a = null;
        Queue<c> queue = f1858c;
        synchronized (queue) {
            queue.offer(this);
        }
    }

    @Override // java.io.InputStream
    public void mark(int i) {
        this.a.mark(i);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.a.markSupported();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        try {
            return this.a.read();
        } catch (IOException e2) {
            this.b = e2;
            throw e2;
        }
    }

    @Override // java.io.InputStream
    public synchronized void reset() throws IOException {
        this.a.reset();
    }

    @Override // java.io.InputStream
    public long skip(long j) throws IOException {
        try {
            return this.a.skip(j);
        } catch (IOException e2) {
            this.b = e2;
            throw e2;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        try {
            return this.a.read(bArr);
        } catch (IOException e2) {
            this.b = e2;
            throw e2;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        try {
            return this.a.read(bArr, i, i2);
        } catch (IOException e2) {
            this.b = e2;
            throw e2;
        }
    }
}
