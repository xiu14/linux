package com.ss.alive.monitor;

import android.content.Context;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileLock;

/* loaded from: classes2.dex */
public class d {
    private boolean a;
    private boolean b;

    /* renamed from: c, reason: collision with root package name */
    private FileLock f8244c;

    /* renamed from: d, reason: collision with root package name */
    private RandomAccessFile f8245d;

    class a implements Runnable {
        final /* synthetic */ RandomAccessFile a;

        a(RandomAccessFile randomAccessFile) {
            this.a = randomAccessFile;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.a == null) {
                return;
            }
            try {
                com.bytedance.push.g0.f.c("ExclusiveFileLock", "pending lock file ...");
                FileLock lock = this.a.getChannel().lock();
                if (lock != null) {
                    d.this.f8244c = lock;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("lock file success!");
                sb.append((d.this.f8244c == null || !d.this.f8244c.isValid() || d.this.f8244c.isShared()) ? false : true);
                com.bytedance.push.g0.f.c("ExclusiveFileLock", sb.toString());
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public d(String str) {
    }

    private void c(RandomAccessFile randomAccessFile) {
        new Thread(new a(randomAccessFile)).start();
    }

    private boolean e(File file) {
        boolean z = false;
        if (!file.exists()) {
            return false;
        }
        FileLock fileLock = null;
        boolean z2 = true;
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rwd");
            this.f8245d = randomAccessFile;
            fileLock = randomAccessFile.getChannel().tryLock();
            if (fileLock != null) {
                this.f8244c = fileLock;
            }
            FileLock fileLock2 = this.f8244c;
            if (fileLock2 != null) {
                if (fileLock2.isValid()) {
                    z = true;
                }
            }
            return z;
        } catch (Throwable th) {
            try {
                if (!(th instanceof IOException) || !th.getMessage().contains("fcntl failed: EAGAIN")) {
                    z2 = false;
                }
                if (!z2) {
                    th.printStackTrace();
                }
                if (fileLock == null) {
                    c(this.f8245d);
                }
                return false;
            } finally {
                if (fileLock == null) {
                    c(this.f8245d);
                }
            }
        }
    }

    public boolean d(Context context) {
        try {
            if (this.a) {
                return this.b;
            }
            this.a = true;
            File file = new File(context.getFilesDir(), "process.lock");
            if (file.isDirectory()) {
                file.delete();
            }
            if (!file.exists()) {
                file.createNewFile();
            }
            this.b = e(file);
            if (com.bytedance.push.g0.f.d()) {
                StringBuilder sb = new StringBuilder();
                sb.append("isFirstLockFile: sIsFirst = ");
                sb.append(this.b);
                sb.append("  process = ");
                int i = com.ss.alive.monitor.util.a.b;
                sb.append(com.ss.android.message.f.a.h(context));
                sb.append(file.getPath());
                com.bytedance.push.g0.f.c("ExclusiveFileLock", sb.toString());
            }
            return this.b;
        } catch (Throwable th) {
            th.printStackTrace();
            this.b = false;
            return false;
        }
    }
}
