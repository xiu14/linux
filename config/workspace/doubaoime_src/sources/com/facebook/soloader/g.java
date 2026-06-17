package com.facebook.soloader;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/* loaded from: classes2.dex */
public class g implements f {
    private File a;
    private FileInputStream b;

    /* renamed from: c, reason: collision with root package name */
    private FileChannel f6707c;

    public g(File file) throws IOException {
        this.a = file;
        FileInputStream fileInputStream = new FileInputStream(this.a);
        this.b = fileInputStream;
        this.f6707c = fileInputStream.getChannel();
    }

    @Override // com.facebook.soloader.f
    public int F(ByteBuffer byteBuffer, long j) throws IOException {
        return this.f6707c.read(byteBuffer, j);
    }

    public void a() throws IOException {
        FileInputStream fileInputStream = new FileInputStream(this.a);
        this.b = fileInputStream;
        this.f6707c = fileInputStream.getChannel();
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.b.close();
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return this.f6707c.isOpen();
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) throws IOException {
        return this.f6707c.read(byteBuffer);
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) throws IOException {
        return this.f6707c.write(byteBuffer);
    }
}
