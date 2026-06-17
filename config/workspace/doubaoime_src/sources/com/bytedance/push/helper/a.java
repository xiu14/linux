package com.bytedance.push.helper;

import android.content.Context;
import com.bytedance.push.g0.f;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileLock;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: d, reason: collision with root package name */
    private static final Map<String, a> f5719d = new HashMap();
    private final String a;
    private FileLock b;

    /* renamed from: c, reason: collision with root package name */
    private RandomAccessFile f5720c;

    private a(String str) {
        this.a = str;
    }

    public static a a(String str) {
        Map<String, a> map = f5719d;
        a aVar = map.get(str);
        if (aVar == null) {
            synchronized (map) {
                aVar = map.get(str);
                if (aVar == null) {
                    aVar = new a(str);
                    map.put(str, aVar);
                }
            }
        }
        return aVar;
    }

    private boolean c(File file) {
        if (!file.exists()) {
            return false;
        }
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rwd");
            this.f5720c = randomAccessFile;
            FileLock lock = randomAccessFile.getChannel().lock();
            if (lock != null) {
                this.b = lock;
            }
            FileLock fileLock = this.b;
            if (fileLock != null) {
                return fileLock.isValid();
            }
            return false;
        } catch (Throwable th) {
            if (!((th instanceof IOException) && th.getMessage().contains("fcntl failed: EAGAIN"))) {
                th.printStackTrace();
            }
            return false;
        }
    }

    public boolean b(Context context) {
        try {
            File file = new File(context.getFilesDir(), this.a);
            if (file.isDirectory()) {
                file.delete();
            }
            if (!file.exists()) {
                file.createNewFile();
            }
            boolean c2 = c(file);
            if (f.d()) {
                f.c("FileLockHelper", "isFirstLockFile: sIsFirst = " + c2 + "  process = " + com.ss.android.message.f.a.h(context) + file.getPath());
            }
            return c2;
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x001a -> B:15:0x004d). Please report as a decompilation issue!!! */
    public boolean d() {
        FileLock fileLock = this.b;
        try {
        } catch (IOException e2) {
            e2.printStackTrace();
        }
        if (fileLock == null) {
            return false;
        }
        try {
            try {
                fileLock.release();
                try {
                    this.b.close();
                } catch (IOException e3) {
                    e3.printStackTrace();
                }
                RandomAccessFile randomAccessFile = this.f5720c;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            } catch (IOException e4) {
                e4.printStackTrace();
                try {
                    this.b.close();
                } catch (IOException e5) {
                    e5.printStackTrace();
                }
                RandomAccessFile randomAccessFile2 = this.f5720c;
                if (randomAccessFile2 == null) {
                    return false;
                }
                randomAccessFile2.close();
            }
            return false;
        } finally {
        }
    }
}
