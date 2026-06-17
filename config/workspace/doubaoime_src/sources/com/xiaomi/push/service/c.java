package com.xiaomi.push.service;

import android.content.Context;
import android.text.TextUtils;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileLock;

/* loaded from: classes2.dex */
public class c {
    private static volatile c a;

    /* renamed from: a, reason: collision with other field name */
    private Context f1101a;

    /* renamed from: e, reason: collision with root package name */
    private volatile String f9340e;

    /* renamed from: f, reason: collision with root package name */
    private volatile String f9341f;

    /* renamed from: a, reason: collision with other field name */
    private final Object f1102a = new Object();
    private final Object b = new Object();

    /* renamed from: a, reason: collision with other field name */
    private final String f1103a = "mipush_region";

    /* renamed from: b, reason: collision with other field name */
    private final String f1104b = "mipush_country_code";

    /* renamed from: c, reason: collision with root package name */
    private final String f9338c = "mipush_region.lock";

    /* renamed from: d, reason: collision with root package name */
    private final String f9339d = "mipush_country_code.lock";

    public c(Context context) {
        this.f1101a = context;
    }

    public static c a(Context context) {
        if (a == null) {
            synchronized (c.class) {
                if (a == null) {
                    a = new c(context);
                }
            }
        }
        return a;
    }

    public String b() {
        if (TextUtils.isEmpty(this.f9341f)) {
            this.f9341f = a(this.f1101a, "mipush_country_code", "mipush_country_code.lock", this.b);
        }
        return this.f9341f;
    }

    public void b(String str, boolean z) {
        if (!TextUtils.equals(str, this.f9341f)) {
            this.f9341f = str;
        }
        if (z) {
            a(this.f1101a, str, "mipush_country_code", "mipush_region.lock", this.f1102a);
        }
    }

    public String a() {
        if (TextUtils.isEmpty(this.f9340e)) {
            this.f9340e = a(this.f1101a, "mipush_region", "mipush_region.lock", this.f1102a);
        }
        return this.f9340e;
    }

    public void a(String str, boolean z) {
        if (!TextUtils.equals(str, this.f9340e)) {
            this.f9340e = str;
        }
        if (z) {
            a(this.f1101a, str, "mipush_region", "mipush_region.lock", this.f1102a);
        }
    }

    private void a(Context context, String str, String str2, String str3, Object obj) {
        RandomAccessFile randomAccessFile;
        synchronized (obj) {
            FileLock fileLock = null;
            try {
                try {
                    File file = new File(context.getFilesDir(), str3);
                    com.xiaomi.push.y.m850a(file);
                    randomAccessFile = new RandomAccessFile(file, "rw");
                    try {
                        try {
                            fileLock = randomAccessFile.getChannel().lock();
                            com.xiaomi.push.y.a(new File(context.getFilesDir(), str2), str);
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

    private String a(Context context, String str, String str2, Object obj) {
        RandomAccessFile randomAccessFile;
        FileLock fileLock;
        File file = new File(context.getFilesDir(), str);
        FileLock fileLock2 = null;
        if (!file.exists()) {
            com.xiaomi.channel.commonutils.logger.c.m15a("No ready file to get data from " + str);
            return null;
        }
        synchronized (obj) {
            try {
                File file2 = new File(context.getFilesDir(), str2);
                com.xiaomi.push.y.m850a(file2);
                randomAccessFile = new RandomAccessFile(file2, "rw");
            } catch (Exception e2) {
                e = e2;
                randomAccessFile = null;
                fileLock = null;
            } catch (Throwable th) {
                th = th;
                randomAccessFile = null;
            }
            try {
                fileLock = randomAccessFile.getChannel().lock();
                try {
                    try {
                        String a2 = com.xiaomi.push.y.a(file);
                        if (fileLock != null && fileLock.isValid()) {
                            try {
                                fileLock.release();
                            } catch (IOException e3) {
                                com.xiaomi.channel.commonutils.logger.c.m18a((Throwable) e3);
                            }
                        }
                        com.xiaomi.push.y.a(randomAccessFile);
                        return a2;
                    } catch (Exception e4) {
                        e = e4;
                        com.xiaomi.channel.commonutils.logger.c.m18a((Throwable) e);
                        if (fileLock != null && fileLock.isValid()) {
                            try {
                                fileLock.release();
                            } catch (IOException e5) {
                                com.xiaomi.channel.commonutils.logger.c.m18a((Throwable) e5);
                            }
                        }
                        com.xiaomi.push.y.a(randomAccessFile);
                        return null;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileLock2 = fileLock;
                    if (fileLock2 != null && fileLock2.isValid()) {
                        try {
                            fileLock2.release();
                        } catch (IOException e6) {
                            com.xiaomi.channel.commonutils.logger.c.m18a((Throwable) e6);
                        }
                    }
                    com.xiaomi.push.y.a(randomAccessFile);
                    throw th;
                }
            } catch (Exception e7) {
                e = e7;
                fileLock = null;
            } catch (Throwable th3) {
                th = th3;
                if (fileLock2 != null) {
                    fileLock2.release();
                }
                com.xiaomi.push.y.a(randomAccessFile);
                throw th;
            }
        }
    }
}
