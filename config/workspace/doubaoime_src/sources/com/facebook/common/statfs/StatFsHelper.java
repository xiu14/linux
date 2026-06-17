package com.facebook.common.statfs;

import android.os.Environment;
import android.os.StatFs;
import android.os.SystemClock;
import e.c.c.d.h;
import e.c.c.e.a;
import java.io.File;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes2.dex */
public class StatFsHelper {
    private static StatFsHelper h;
    private static final long i = TimeUnit.MINUTES.toMillis(2);
    private volatile File b;

    /* renamed from: d, reason: collision with root package name */
    private volatile File f6318d;

    /* renamed from: e, reason: collision with root package name */
    private long f6319e;
    private volatile StatFs a = null;

    /* renamed from: c, reason: collision with root package name */
    private volatile StatFs f6317c = null;

    /* renamed from: g, reason: collision with root package name */
    private volatile boolean f6321g = false;

    /* renamed from: f, reason: collision with root package name */
    private final Lock f6320f = new ReentrantLock();

    public enum StorageType {
        INTERNAL,
        EXTERNAL
    }

    protected StatFsHelper() {
    }

    private void a() {
        if (!this.f6321g || this.f6318d == null) {
            this.f6320f.lock();
            try {
                if (!this.f6321g || this.f6318d == null) {
                    this.b = Environment.getDataDirectory();
                    try {
                        this.f6318d = Environment.getExternalStorageDirectory();
                    } catch (ArrayIndexOutOfBoundsException unused) {
                        a.i("StatFsHelper", "getExternalStorageDirectory return null");
                    }
                    d();
                    this.f6321g = true;
                }
            } finally {
                this.f6320f.unlock();
            }
        }
    }

    public static synchronized StatFsHelper b() {
        StatFsHelper statFsHelper;
        synchronized (StatFsHelper.class) {
            if (h == null) {
                h = new StatFsHelper();
            }
            statFsHelper = h;
        }
        return statFsHelper;
    }

    private void d() {
        this.a = e(this.a, this.b);
        this.f6317c = e(this.f6317c, this.f6318d);
        this.f6319e = SystemClock.uptimeMillis();
    }

    private StatFs e(StatFs statFs, File file) {
        StatFs statFs2 = null;
        if (file == null || !file.exists()) {
            return null;
        }
        try {
            if (statFs == null) {
                statFs = new StatFs(file.getAbsolutePath());
            } else {
                statFs.restat(file.getAbsolutePath());
            }
            statFs2 = statFs;
            return statFs2;
        } catch (IllegalArgumentException unused) {
            return statFs2;
        } catch (Throwable th) {
            h.j(th);
            throw new RuntimeException(th);
        }
    }

    public boolean c(StorageType storageType, long j) {
        a();
        a();
        if (this.f6320f.tryLock()) {
            try {
                if (SystemClock.uptimeMillis() - this.f6319e > i) {
                    d();
                }
            } finally {
                this.f6320f.unlock();
            }
        }
        StatFs statFs = storageType == StorageType.INTERNAL ? this.a : this.f6317c;
        long availableBlocksLong = statFs != null ? statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong() : 0L;
        return availableBlocksLong <= 0 || availableBlocksLong < j;
    }
}
