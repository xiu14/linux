package com.xiaomi.push;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.xiaomi.push.ah;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileLock;

/* loaded from: classes2.dex */
public abstract class eb extends ah.a {
    protected int a;

    /* renamed from: a, reason: collision with other field name */
    protected Context f304a;

    public eb(Context context, int i) {
        this.a = i;
        this.f304a = context;
    }

    private String c() {
        StringBuilder M = e.a.a.a.a.M("dc_job_result_time_");
        M.append(mo139a());
        return M.toString();
    }

    private String d() {
        StringBuilder M = e.a.a.a.a.M("dc_job_result_");
        M.append(mo139a());
        return M.toString();
    }

    public abstract hw a();

    /* renamed from: a, reason: collision with other method in class */
    protected boolean m262a() {
        return dy.a(this.f304a, String.valueOf(mo139a()), this.a);
    }

    public abstract String b();

    /* renamed from: b, reason: collision with other method in class */
    protected boolean m263b() {
        return true;
    }

    /* renamed from: c, reason: collision with other method in class */
    protected boolean m264c() {
        return false;
    }

    @Override // java.lang.Runnable
    public void run() {
        String b = b();
        if (TextUtils.isEmpty(b)) {
            return;
        }
        if (m262a()) {
            StringBuilder M = e.a.a.a.a.M("DC run job mutual: ");
            M.append(mo139a());
            com.xiaomi.channel.commonutils.logger.c.m15a(M.toString());
            return;
        }
        dv m260a = dw.a().m260a();
        String a = m260a == null ? "" : m260a.a();
        if (!TextUtils.isEmpty(a) && m263b()) {
            if (m264c()) {
                SharedPreferences sharedPreferences = this.f304a.getSharedPreferences("mipush_extra", 0);
                if (bm.a(b).equals(sharedPreferences.getString(d(), null))) {
                    long j = sharedPreferences.getLong(c(), 0L);
                    int a2 = com.xiaomi.push.service.aq.a(this.f304a).a(hz.DCJobUploadRepeatedInterval.a(), 604800);
                    if ((System.currentTimeMillis() - j) / 1000 < this.a) {
                        return;
                    }
                    if ((System.currentTimeMillis() - j) / 1000 < a2) {
                        b = e.a.a.a.a.n("same_", j);
                    }
                }
            }
            ic icVar = new ic();
            icVar.a(b);
            icVar.a(System.currentTimeMillis());
            icVar.a(a());
            a(this.f304a, icVar, a);
        }
    }

    public static void a(Context context, ic icVar) {
        dv m260a = dw.a().m260a();
        String a = m260a == null ? "" : m260a.a();
        if (TextUtils.isEmpty(a) || TextUtils.isEmpty(icVar.a())) {
            return;
        }
        a(context, icVar, a);
    }

    private static void a(Context context, ic icVar, String str) {
        BufferedOutputStream bufferedOutputStream;
        RandomAccessFile randomAccessFile;
        byte[] b = dy.b(str, je.a(icVar));
        if (b == null || b.length == 0) {
            return;
        }
        synchronized (dz.a) {
            FileLock fileLock = null;
            BufferedOutputStream bufferedOutputStream2 = null;
            fileLock = null;
            fileLock = null;
            fileLock = null;
            try {
                try {
                    File file = new File(context.getFilesDir(), "push_cdata.lock");
                    y.m850a(file);
                    randomAccessFile = new RandomAccessFile(file, "rw");
                    try {
                        FileLock lock = randomAccessFile.getChannel().lock();
                        try {
                            File file2 = new File(context.getFilesDir(), "push_cdata.data");
                            if (x.m849a(file2)) {
                                bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file2, true));
                                try {
                                    bufferedOutputStream.write(aa.a(b.length));
                                    bufferedOutputStream.write(b);
                                    bufferedOutputStream.flush();
                                    file2.setLastModified(0L);
                                    bufferedOutputStream2 = bufferedOutputStream;
                                } catch (IOException e2) {
                                    e = e2;
                                    fileLock = lock;
                                    try {
                                        e.printStackTrace();
                                        if (fileLock != null && fileLock.isValid()) {
                                            try {
                                                fileLock.release();
                                            } catch (IOException unused) {
                                            }
                                        }
                                        y.a(bufferedOutputStream);
                                        y.a(randomAccessFile);
                                    } catch (Throwable th) {
                                        th = th;
                                        if (fileLock != null && fileLock.isValid()) {
                                            try {
                                                fileLock.release();
                                            } catch (IOException unused2) {
                                            }
                                        }
                                        y.a(bufferedOutputStream);
                                        y.a(randomAccessFile);
                                        throw th;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    fileLock = lock;
                                    if (fileLock != null) {
                                        fileLock.release();
                                    }
                                    y.a(bufferedOutputStream);
                                    y.a(randomAccessFile);
                                    throw th;
                                }
                            }
                            if (lock != null && lock.isValid()) {
                                try {
                                    lock.release();
                                } catch (IOException unused3) {
                                }
                            }
                            y.a(bufferedOutputStream2);
                        } catch (IOException e3) {
                            e = e3;
                            bufferedOutputStream = null;
                        } catch (Throwable th3) {
                            th = th3;
                            bufferedOutputStream = null;
                        }
                    } catch (IOException e4) {
                        e = e4;
                        bufferedOutputStream = null;
                    } catch (Throwable th4) {
                        th = th4;
                        bufferedOutputStream = null;
                    }
                } catch (Throwable th5) {
                    throw th5;
                }
            } catch (IOException e5) {
                e = e5;
                bufferedOutputStream = null;
                randomAccessFile = null;
            } catch (Throwable th6) {
                th = th6;
                bufferedOutputStream = null;
                randomAccessFile = null;
            }
            y.a(randomAccessFile);
        }
    }
}
