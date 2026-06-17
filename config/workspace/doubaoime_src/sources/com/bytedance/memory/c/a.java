package com.bytedance.memory.c;

import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import java.io.File;

/* loaded from: classes.dex */
public class a {
    private static volatile a a;

    /* renamed from: com.bytedance.memory.c.a$a, reason: collision with other inner class name */
    class RunnableC0269a implements Runnable {
        RunnableC0269a(a aVar) {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                long j = com.bytedance.memory.heap.a.e().g().getLong("lastDumpTime", 0L);
                if (j == 0 || System.currentTimeMillis() - j <= 259200000) {
                    return;
                }
                com.bytedance.memory.heap.a.e().c();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    private a() {
    }

    public static a c() {
        if (a == null) {
            synchronized (a.class) {
                if (a == null) {
                    a = new a();
                }
            }
        }
        return a;
    }

    @WorkerThread
    public void a() {
        com.bytedance.memory.b.b.a.a(new RunnableC0269a(this), "DumpFileController-checkWidgetFolder");
    }

    @WorkerThread
    public void b(@NonNull File file) {
        File[] listFiles;
        if (file.isFile()) {
            com.bytedance.memory.b.c.b("lastModified %d now %d", Long.valueOf(file.lastModified()), Long.valueOf(System.currentTimeMillis()));
            if ((System.currentTimeMillis() - file.lastModified() > 604800000 ? 1 : 0) != 0 || file.length() == 0) {
                file.delete();
                return;
            }
            return;
        }
        if (!file.isDirectory() || (listFiles = file.listFiles()) == null || listFiles.length <= 0) {
            return;
        }
        int length = listFiles.length;
        while (r1 < length) {
            b(listFiles[r1]);
            r1++;
        }
    }
}
