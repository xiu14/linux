package com.bytedance.push.settings.r;

import android.content.Context;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileLock;

/* loaded from: classes2.dex */
public class a {
    private final String a;
    private boolean b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f5819c;

    /* renamed from: d, reason: collision with root package name */
    private FileLock f5820d;

    /* renamed from: e, reason: collision with root package name */
    private RandomAccessFile f5821e;

    public a(String str) {
        this.a = str;
    }

    private boolean b(File file) {
        if (!file.exists()) {
            return false;
        }
        boolean z = true;
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rwd");
            this.f5821e = randomAccessFile;
            FileLock tryLock = randomAccessFile.getChannel().tryLock();
            if (tryLock != null) {
                this.f5820d = tryLock;
            }
            FileLock fileLock = this.f5820d;
            if (fileLock != null) {
                return fileLock.isValid();
            }
            return false;
        } catch (Throwable th) {
            if (!(th instanceof IOException) || !th.getMessage().contains("fcntl failed: EAGAIN")) {
                z = false;
            }
            if (!z) {
                th.printStackTrace();
            }
            return false;
        }
    }

    public boolean a(Context context) {
        try {
            if (this.b) {
                return this.f5819c;
            }
            this.b = true;
            File file = new File(context.getFilesDir(), this.a);
            if (file.isDirectory()) {
                file.delete();
            }
            if (!file.exists()) {
                file.createNewFile();
            }
            this.f5819c = b(file);
            com.bytedance.push.settings.s.a.b().a("SettingsExclusiveFileLock", "isFirstLockFile: sIsFirst = " + this.f5819c + "  process = " + com.bytedance.push.settings.D.a.a(context) + file.getPath());
            return this.f5819c;
        } catch (Throwable th) {
            th.printStackTrace();
            this.f5819c = false;
            return false;
        }
    }

    public void c() {
        try {
            this.f5820d.release();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }
}
