package com.xiaomi.push;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.vivo.push.PushClient;
import com.xiaomi.push.ah;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class ed extends ah.a {
    private Context a;

    /* renamed from: a, reason: collision with other field name */
    private SharedPreferences f305a;

    /* renamed from: a, reason: collision with other field name */
    private com.xiaomi.push.service.aq f306a;

    public ed(Context context) {
        this.a = context;
        this.f305a = context.getSharedPreferences("mipush_extra", 0);
        this.f306a = com.xiaomi.push.service.aq.a(context);
    }

    /* renamed from: a, reason: collision with other method in class */
    private boolean m265a() {
        if (ax.d(this.a)) {
            return false;
        }
        if ((ax.f(this.a) || ax.e(this.a)) && !c()) {
            return true;
        }
        return (ax.g(this.a) && !b()) || ax.h(this.a);
    }

    private boolean b() {
        if (!this.f306a.a(hz.Upload3GSwitch.a(), true)) {
            return false;
        }
        return Math.abs((System.currentTimeMillis() / 1000) - this.f305a.getLong("last_upload_data_timestamp", -1L)) > ((long) Math.max(RemoteMessageConst.DEFAULT_TTL, this.f306a.a(hz.Upload3GFrequency.a(), 432000)));
    }

    private boolean c() {
        if (!this.f306a.a(hz.Upload4GSwitch.a(), true)) {
            return false;
        }
        return Math.abs((System.currentTimeMillis() / 1000) - this.f305a.getLong("last_upload_data_timestamp", -1L)) > ((long) Math.max(RemoteMessageConst.DEFAULT_TTL, this.f306a.a(hz.Upload4GFrequency.a(), 259200)));
    }

    @Override // com.xiaomi.push.ah.a
    /* renamed from: a */
    public String mo139a() {
        return PushClient.DEFAULT_REQUEST_ID;
    }

    @Override // java.lang.Runnable
    public void run() {
        File file = new File(this.a.getFilesDir(), "push_cdata.data");
        if (!ax.c(this.a)) {
            if (file.length() > 1863680) {
                file.delete();
                return;
            }
            return;
        }
        if (!m265a() && file.exists()) {
            List<ic> a = a(file);
            if (!ab.a(a)) {
                int size = a.size();
                if (size > 4000) {
                    a = a.subList(size - 4000, size);
                }
                in inVar = new in();
                inVar.a(a);
                byte[] a2 = y.a(je.a(inVar));
                it itVar = new it("-1", false);
                itVar.c(ie.DataCollection.f611a);
                itVar.a(a2);
                dv m260a = dw.a().m260a();
                if (m260a != null) {
                    m260a.a(itVar, hu.Notification, null);
                }
                a();
            }
            file.delete();
        }
    }

    private void a() {
        SharedPreferences.Editor edit = this.f305a.edit();
        edit.putLong("last_upload_data_timestamp", System.currentTimeMillis() / 1000);
        edit.commit();
    }

    private List<ic> a(File file) {
        RandomAccessFile randomAccessFile;
        FileInputStream fileInputStream;
        dv m260a = dw.a().m260a();
        String a = m260a == null ? "" : m260a.a();
        FileLock fileLock = null;
        if (TextUtils.isEmpty(a)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        byte[] bArr = new byte[4];
        synchronized (dz.a) {
            try {
                File file2 = new File(this.a.getFilesDir(), "push_cdata.lock");
                y.m850a(file2);
                randomAccessFile = new RandomAccessFile(file2, "rw");
                try {
                    FileLock lock = randomAccessFile.getChannel().lock();
                    try {
                        fileInputStream = new FileInputStream(file);
                        while (fileInputStream.read(bArr) == 4) {
                            try {
                                int a2 = aa.a(bArr);
                                byte[] bArr2 = new byte[a2];
                                if (fileInputStream.read(bArr2) != a2) {
                                    break;
                                }
                                byte[] a3 = dy.a(a, bArr2);
                                if (a3 != null && a3.length != 0) {
                                    ic icVar = new ic();
                                    je.a(icVar, a3);
                                    arrayList.add(icVar);
                                    a(icVar);
                                }
                            } catch (Exception unused) {
                                fileLock = lock;
                                if (fileLock != null && fileLock.isValid()) {
                                    try {
                                        fileLock.release();
                                    } catch (IOException unused2) {
                                    }
                                }
                                y.a((Closeable) fileInputStream);
                                y.a(randomAccessFile);
                                return arrayList;
                            } catch (Throwable th) {
                                th = th;
                                fileLock = lock;
                                if (fileLock != null && fileLock.isValid()) {
                                    try {
                                        fileLock.release();
                                    } catch (IOException unused3) {
                                    }
                                }
                                y.a((Closeable) fileInputStream);
                                y.a(randomAccessFile);
                                throw th;
                            }
                        }
                        if (lock != null && lock.isValid()) {
                            try {
                                lock.release();
                            } catch (IOException unused4) {
                            }
                        }
                        y.a((Closeable) fileInputStream);
                    } catch (Exception unused5) {
                        fileInputStream = null;
                    } catch (Throwable th2) {
                        th = th2;
                        fileInputStream = null;
                    }
                } catch (Exception unused6) {
                    fileInputStream = null;
                } catch (Throwable th3) {
                    th = th3;
                    fileInputStream = null;
                }
            } catch (Exception unused7) {
                randomAccessFile = null;
                fileInputStream = null;
            } catch (Throwable th4) {
                th = th4;
                randomAccessFile = null;
                fileInputStream = null;
            }
            y.a(randomAccessFile);
        }
        return arrayList;
    }

    private void a(ic icVar) {
        if (icVar.f602a != hw.AppInstallList || icVar.f603a.startsWith("same_")) {
            return;
        }
        SharedPreferences.Editor edit = this.f305a.edit();
        edit.putLong("dc_job_result_time_4", icVar.f601a);
        edit.putString("dc_job_result_4", bm.a(icVar.f603a));
        edit.commit();
    }
}
