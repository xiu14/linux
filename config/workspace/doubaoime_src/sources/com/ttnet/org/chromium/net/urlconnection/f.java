package com.ttnet.org.chromium.net.urlconnection;

import com.ttnet.org.chromium.net.D;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes2.dex */
abstract class f extends OutputStream {
    private IOException a;
    private boolean b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f8778c;

    f() {
    }

    protected void a() throws IOException {
        IOException iOException = this.a;
        if (iOException != null) {
            throw iOException;
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.b = true;
    }

    protected void d() throws IOException {
        if (this.f8778c) {
            a();
            throw new IOException("Writing after request completed.");
        }
        if (this.b) {
            throw new IOException("Stream has been closed.");
        }
    }

    abstract void h() throws IOException;

    abstract D l();

    abstract void o() throws IOException;

    void p(IOException iOException) {
        this.a = iOException;
        this.f8778c = true;
    }
}
