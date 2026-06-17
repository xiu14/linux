package com.bytedance.apm.util;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.os.Debug;
import android.os.Environment;
import android.os.Looper;
import android.os.StatFs;
import android.text.TextUtils;
import com.ss.android.socialbase.downloader.constants.DownloadConstants;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class e {
    private boolean a;
    private boolean b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f3582c;

    /* renamed from: d, reason: collision with root package name */
    private String f3583d;

    /* renamed from: e, reason: collision with root package name */
    private int f3584e;

    /* renamed from: f, reason: collision with root package name */
    private int f3585f;

    /* renamed from: g, reason: collision with root package name */
    private long f3586g;
    private boolean h;
    private long i;
    private long j;
    private String k;
    private boolean l;
    private long m;
    private long n;
    private double o;
    private long p;
    private long q;
    private double r;
    private long s;
    private long t;
    private double u;
    private boolean v;
    private boolean w;

    private static class a {
        static final e a = new e(null);
    }

    e(d dVar) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            com.bytedance.apm.F.b.e().h(new d(this, new Throwable("Don't use DeviceInfoUtil on main thread.")));
        }
        boolean C = com.bytedance.apm.g.C();
        this.a = C;
        if (C) {
            try {
                h();
                ActivityManager activityManager = (ActivityManager) com.bytedance.apm.g.h().getSystemService("activity");
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                activityManager.getMemoryInfo(memoryInfo);
                this.f3585f = (int) (memoryInfo.totalMem / 536870912);
                this.k = "jemalloc";
                i();
            } catch (Throwable unused) {
            }
        }
    }

    private double f(long j, long j2) {
        if (j2 == 0) {
            return 0.0d;
        }
        return Math.round((j / j2) * 100.0d) / 100.0d;
    }

    public static e g() {
        return a.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x00f5, code lost:
    
        if (r4.toLowerCase().startsWith("hua") != false) goto L65;
     */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00d1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void h() {
        /*
            Method dump skipped, instructions count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.apm.util.e.h():void");
    }

    @SuppressLint({"NewApi"})
    private void i() {
        this.l = true;
        StatFs statFs = new StatFs(Environment.getRootDirectory().getAbsolutePath());
        if (this.l) {
            this.n = statFs.getAvailableBytes();
            this.m = statFs.getBlockCountLong() * statFs.getBlockSizeLong();
        } else {
            this.n = statFs.getBlockSize() * statFs.getAvailableBlocks();
            this.m = statFs.getBlockSize() * statFs.getBlockCount();
        }
        this.o = f(this.n, this.m);
        try {
            StatFs statFs2 = new StatFs(com.bytedance.apm.g.h().getFilesDir().getAbsolutePath());
            if (this.l) {
                this.q = statFs2.getAvailableBytes();
                this.p = statFs2.getBlockSizeLong() * statFs2.getBlockCountLong();
            } else {
                this.q = statFs2.getBlockSize() * statFs2.getAvailableBlocks();
                this.p = statFs2.getBlockSize() * statFs2.getBlockCount();
            }
            this.r = f(this.q, this.p);
        } catch (Throwable unused) {
        }
        String str = null;
        try {
            str = Environment.getExternalStorageState();
        } catch (Exception unused2) {
        }
        boolean equals = TextUtils.equals(str, "mounted");
        this.v = equals;
        try {
            if (equals) {
                StatFs statFs3 = new StatFs(Environment.getExternalStorageDirectory().getAbsolutePath());
                if (this.l) {
                    this.t = statFs3.getAvailableBytes();
                    this.s = statFs3.getBlockSizeLong() * statFs3.getBlockCountLong();
                } else {
                    this.t = statFs3.getBlockSize() * statFs3.getAvailableBlocks();
                    this.s = statFs3.getBlockSize() * statFs3.getBlockCount();
                }
                this.u = f(this.t, this.s);
            } else {
                this.s = 0L;
            }
        } catch (Throwable unused3) {
        }
        this.w = Environment.isExternalStorageRemovable();
    }

    public void a(JSONObject jSONObject, boolean z) {
        if (this.a || z) {
            try {
                e eVar = a.a;
                Objects.requireNonNull(eVar);
                if (jSONObject != null && eVar.a) {
                    jSONObject.put("apm_is_app_64", eVar.b);
                    jSONObject.put("apm_is_device_64", eVar.f3582c);
                    jSONObject.put("apm_cpu_model", eVar.f3583d);
                    int i = eVar.f3584e;
                    if (i > 0) {
                        jSONObject.put("apm_cpu_core_num", i);
                    }
                }
                Objects.requireNonNull(eVar);
                if (jSONObject != null && eVar.a) {
                    jSONObject.put("apm_physical_mem", eVar.f3585f);
                    jSONObject.put("apm_malloc_impl", eVar.k);
                }
                eVar.e(jSONObject);
            } catch (JSONException unused) {
            }
        }
    }

    public void b(JSONObject jSONObject) {
        if (this.a) {
            try {
                a.a.d(jSONObject);
            } catch (JSONException unused) {
            }
        }
    }

    public void c(JSONObject jSONObject, boolean z) {
        if (this.a || z) {
            try {
                a.a.d(jSONObject);
            } catch (JSONException unused) {
            }
        }
    }

    public void d(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null || !this.a) {
            return;
        }
        this.f3586g = Debug.getNativeHeapAllocatedSize() / 1048576;
        Runtime runtime = Runtime.getRuntime();
        long maxMemory = runtime.maxMemory();
        long freeMemory = runtime.freeMemory();
        long j = runtime.totalMemory();
        this.i = maxMemory / 1048576;
        long j2 = j - freeMemory;
        this.j = j2 / 1048576;
        this.h = ((float) j2) > ((float) maxMemory) * 0.95f;
        jSONObject.put("apm_native_heap_size", this.f3586g);
        jSONObject.put("apm_java_heap_leak", this.h);
        jSONObject.put("apm_java_heap_used", this.j);
        jSONObject.put("apm_java_heap_max", this.i);
    }

    public void e(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null || !this.a) {
            return;
        }
        if (this.m != 0) {
            jSONObject.put("apm_sys_avail_size", this.n / 1048576);
            jSONObject.put("apm_sys_avail_ratio", this.o);
        }
        if (this.p != 0) {
            jSONObject.put("apm_data_avail_size", this.q / DownloadConstants.GB);
            jSONObject.put("apm_data_avail_ratio", this.r);
        }
        if (this.s != 0) {
            jSONObject.put("apm_sd_avail_size", this.t / DownloadConstants.GB);
            jSONObject.put("apm_sd_avail_ratio", this.u);
        }
        if (this.v) {
            jSONObject.put("apm_external_removable", this.w);
        }
    }
}
