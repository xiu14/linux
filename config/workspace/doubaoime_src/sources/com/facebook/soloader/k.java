package com.facebook.soloader;

import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileLock;

/* loaded from: classes2.dex */
public final class k implements Closeable {
    private FileOutputStream a;
    private FileLock b;

    private k(File file, boolean z) throws IOException {
        FileLock fileLock;
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        this.a = fileOutputStream;
        try {
            if (z) {
                try {
                    fileLock = fileOutputStream.getChannel().tryLock();
                } catch (IOException unused) {
                    fileLock = null;
                }
            } else {
                fileLock = fileOutputStream.getChannel().lock();
            }
            if (fileLock == null) {
            }
            this.b = fileLock;
        } finally {
            this.a.close();
        }
    }

    public static k a(File file) throws IOException {
        return new k(file, false);
    }

    public static k d(File file) throws IOException {
        k kVar = new k(file, true);
        if (kVar.b != null) {
            return kVar;
        }
        kVar.close();
        return null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            FileLock fileLock = this.b;
            if (fileLock != null) {
                fileLock.release();
            }
        } finally {
            this.a.close();
        }
    }
}
