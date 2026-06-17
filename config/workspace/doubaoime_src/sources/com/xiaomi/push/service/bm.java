package com.xiaomi.push.service;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.push.hy;
import com.xiaomi.push.je;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileLock;
import java.util.Arrays;

/* loaded from: classes2.dex */
public class bm {
    public static final Object a = new Object();

    public static void a(final Context context, final hy hyVar) {
        if (bl.a(hyVar.e())) {
            com.xiaomi.push.ah.a(context).a(new Runnable() { // from class: com.xiaomi.push.service.bm.1
                @Override // java.lang.Runnable
                public void run() {
                    RandomAccessFile randomAccessFile;
                    synchronized (bm.a) {
                        FileLock fileLock = null;
                        try {
                            try {
                                File file = new File(context.getFilesDir(), "tiny_data.lock");
                                com.xiaomi.push.y.m850a(file);
                                randomAccessFile = new RandomAccessFile(file, "rw");
                                try {
                                    try {
                                        fileLock = randomAccessFile.getChannel().lock();
                                        bm.c(context, hyVar);
                                        if (fileLock != null && fileLock.isValid()) {
                                            try {
                                                fileLock.release();
                                            } catch (IOException e2) {
                                                com.xiaomi.channel.commonutils.logger.c.m18a((Throwable) e2);
                                            }
                                        }
                                    } catch (Exception e3) {
                                        e = e3;
                                        com.xiaomi.channel.commonutils.logger.c.m18a((Throwable) e);
                                        if (fileLock != null && fileLock.isValid()) {
                                            try {
                                                fileLock.release();
                                            } catch (IOException e4) {
                                                com.xiaomi.channel.commonutils.logger.c.m18a((Throwable) e4);
                                            }
                                        }
                                        com.xiaomi.push.y.a(randomAccessFile);
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    if (fileLock != null && fileLock.isValid()) {
                                        try {
                                            fileLock.release();
                                        } catch (IOException e5) {
                                            com.xiaomi.channel.commonutils.logger.c.m18a((Throwable) e5);
                                        }
                                    }
                                    com.xiaomi.push.y.a(randomAccessFile);
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        } catch (Exception e6) {
                            e = e6;
                            randomAccessFile = null;
                        } catch (Throwable th3) {
                            th = th3;
                            randomAccessFile = null;
                            if (fileLock != null) {
                                fileLock.release();
                            }
                            com.xiaomi.push.y.a(randomAccessFile);
                            throw th;
                        }
                        com.xiaomi.push.y.a(randomAccessFile);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.io.Closeable] */
    public static void c(Context context, hy hyVar) {
        BufferedOutputStream bufferedOutputStream;
        BufferedOutputStream bufferedOutputStream2;
        ?? a2 = a(context);
        try {
            try {
                byte[] b = com.xiaomi.push.i.b(a2, je.a(hyVar));
                if (b != null && b.length >= 1) {
                    if (b.length > 30720) {
                        com.xiaomi.channel.commonutils.logger.c.m15a("TinyData write to cache file failed case too much data content item:" + hyVar.d() + "  ts:" + System.currentTimeMillis());
                        com.xiaomi.push.y.a((Closeable) null);
                        com.xiaomi.push.y.a((Closeable) null);
                    }
                    BufferedOutputStream bufferedOutputStream3 = new BufferedOutputStream(new FileOutputStream(new File(context.getFilesDir(), "tiny_data.data"), true));
                    try {
                        bufferedOutputStream3.write(com.xiaomi.push.aa.a(b.length));
                        bufferedOutputStream3.write(b);
                        bufferedOutputStream3.flush();
                        com.xiaomi.push.y.a((Closeable) null);
                        com.xiaomi.push.y.a(bufferedOutputStream3);
                        return;
                    } catch (IOException e2) {
                        bufferedOutputStream2 = bufferedOutputStream3;
                        e = e2;
                        com.xiaomi.channel.commonutils.logger.c.a("TinyData write to cache file failed cause io exception item:" + hyVar.d(), e);
                        a2 = bufferedOutputStream2;
                        com.xiaomi.push.y.a((Closeable) null);
                        com.xiaomi.push.y.a((Closeable) a2);
                        return;
                    } catch (Exception e3) {
                        bufferedOutputStream = bufferedOutputStream3;
                        e = e3;
                        com.xiaomi.channel.commonutils.logger.c.a("TinyData write to cache file  failed item:" + hyVar.d(), e);
                        a2 = bufferedOutputStream;
                        com.xiaomi.push.y.a((Closeable) null);
                        com.xiaomi.push.y.a((Closeable) a2);
                        return;
                    } catch (Throwable th) {
                        a2 = bufferedOutputStream3;
                        th = th;
                        com.xiaomi.push.y.a((Closeable) null);
                        com.xiaomi.push.y.a((Closeable) a2);
                        throw th;
                    }
                }
                com.xiaomi.channel.commonutils.logger.c.m15a("TinyData write to cache file failed case encryption fail item:" + hyVar.d() + "  ts:" + System.currentTimeMillis());
                com.xiaomi.push.y.a((Closeable) null);
                com.xiaomi.push.y.a((Closeable) null);
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e4) {
            e = e4;
            bufferedOutputStream2 = null;
        } catch (Exception e5) {
            e = e5;
            bufferedOutputStream = null;
        } catch (Throwable th3) {
            th = th3;
            a2 = 0;
        }
    }

    public static byte[] a(Context context) {
        String a2 = com.xiaomi.push.p.a(context).a("mipush", "td_key", "");
        if (TextUtils.isEmpty(a2)) {
            a2 = com.xiaomi.push.bm.a(20);
            com.xiaomi.push.p.a(context).m666a("mipush", "td_key", a2);
        }
        return a(a2);
    }

    private static byte[] a(String str) {
        byte[] copyOf = Arrays.copyOf(com.xiaomi.push.bj.m131a(str), 16);
        copyOf[0] = 68;
        copyOf[15] = 84;
        return copyOf;
    }
}
