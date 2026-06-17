package com.bytedance.crash.L;

import android.app.ActivityManager;
import android.content.Context;
import android.os.FileObserver;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.crash.C0653h;
import com.bytedance.crash.jni.NativeBridge;
import com.huawei.hms.framework.common.BundleUtil;
import com.xiaomi.mipush.sdk.Constants;
import java.io.File;
import java.io.FilenameFilter;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: classes.dex */
public class f {
    private boolean a;
    private final d b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f4408c;

    /* renamed from: d, reason: collision with root package name */
    private final File f4409d;

    /* renamed from: e, reason: collision with root package name */
    private e f4410e;

    class a implements FilenameFilter {
        a(f fVar) {
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return str.startsWith("ai_");
        }
    }

    static class b implements FilenameFilter {
        final /* synthetic */ long a;

        b(long j) {
            this.a = j;
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            StringBuilder M = e.a.a.a.a.M(Constants.ACCEPT_TIME_SEPARATOR_SERVER);
            M.append(this.a);
            return str.endsWith(M.toString());
        }
    }

    class c extends Thread {
        private final File a;

        c(File file) {
            super("NPTH-AnrInfoPolling");
            this.a = com.bytedance.android.input.k.b.a.o(file, "monitor.lock");
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            StringBuilder M = e.a.a.a.a.M("AnrInfoMonitor:prepare lock：");
            M.append(com.bytedance.crash.util.a.i());
            com.bytedance.android.input.k.b.a.X("AnrInfoMonitor", M.toString());
            int p = NativeBridge.p(this.a.getAbsolutePath());
            StringBuilder M2 = e.a.a.a.a.M("AnrInfoMonitor:run：");
            M2.append(com.bytedance.crash.util.a.i());
            com.bytedance.android.input.k.b.a.X("AnrInfoMonitor", M2.toString());
            ActivityManager activityManager = (ActivityManager) f.this.f4408c.getSystemService("activity");
            long a = com.bytedance.crash.N.h.a();
            ActivityManager.ProcessErrorStateInfo processErrorStateInfo = null;
            while (f.this.a) {
                SystemClock.sleep(a);
                if (activityManager == null) {
                    activityManager = (ActivityManager) f.this.f4408c.getSystemService("activity");
                }
                if (activityManager != null) {
                    try {
                        List<ActivityManager.ProcessErrorStateInfo> processesInErrorState = activityManager.getProcessesInErrorState();
                        if (processesInErrorState != null) {
                            for (ActivityManager.ProcessErrorStateInfo processErrorStateInfo2 : processesInErrorState) {
                                if (processErrorStateInfo2.condition == 2 && (processErrorStateInfo == null || !g.j(processErrorStateInfo, processErrorStateInfo2))) {
                                    long currentTimeMillis = System.currentTimeMillis();
                                    File file = new File(f.this.f4409d, f.g(currentTimeMillis, processErrorStateInfo2.pid, Process.myPid() == processErrorStateInfo2.pid));
                                    try {
                                        com.bytedance.crash.util.a.x(file, g.e(processErrorStateInfo2), false);
                                    } catch (Exception unused) {
                                    }
                                    if (file.exists()) {
                                        try {
                                            if (Process.myPid() == processErrorStateInfo2.pid) {
                                                j.j(currentTimeMillis, file);
                                            }
                                            SystemClock.sleep(20 * a);
                                            processErrorStateInfo = processErrorStateInfo2;
                                        } catch (Throwable unused2) {
                                            processErrorStateInfo = processErrorStateInfo2;
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                            }
                        }
                    } catch (Throwable unused3) {
                    }
                }
            }
            if (p != -1) {
                try {
                    NativeBridge.e0(p);
                } catch (Throwable th) {
                    com.bytedance.android.input.k.b.a.F(th);
                }
            }
        }
    }

    static class d extends FileObserver {
        private final File a;

        public d(String str) {
            super(str, 264);
            this.a = new File(str);
        }

        @Override // android.os.FileObserver
        public void onEvent(int i, String str) {
            if ((i & 8) != 0 && str.startsWith("ai_") && f.i(str) == Process.myPid() && str.endsWith("_other")) {
                j.j(f.h(str), new File(this.a, str));
            }
        }
    }

    class e extends Thread {
        private final LinkedBlockingQueue<Long> a;

        e() {
            super("FetchingAnrInfo");
            this.a = new LinkedBlockingQueue<>();
        }

        private void a(long j) {
            try {
                System.out.println("get_anr_info_start_" + j);
                String a = com.bytedance.crash.L.a.a(f.this.f4408c, 150);
                if (TextUtils.isEmpty(a)) {
                    System.out.println("get_anr_info_is_empty");
                    a = "silent anr no anr info";
                }
                b(j, a);
            } catch (Throwable unused) {
                b(j, "silent anr no anr info");
            }
        }

        private void b(long j, String str) {
            File file = new File(f.this.f4409d, f.g(j, Process.myPid(), true));
            try {
                com.bytedance.crash.util.a.x(file, str, false);
            } catch (Exception unused) {
            }
            j.j(j, file);
        }

        public void c(long j) {
            if (C0653h.a()) {
                try {
                    com.bytedance.crash.util.a.x(new File(f.this.f4409d, f.g(j, Process.myPid(), true)), "silent anr no anr info", false);
                } catch (Exception unused) {
                }
            }
            this.a.add(Long.valueOf(j));
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            while (true) {
                try {
                    Long take = this.a.take();
                    if (take != null) {
                        a(take.longValue());
                    } else {
                        System.out.println("get_anr_info_start_time_null");
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    f(@NonNull Context context, @NonNull File file) {
        this.f4408c = context;
        File n = com.bytedance.android.input.k.b.a.n(file, "anr_info");
        this.f4409d = n;
        this.b = new d(n.getAbsolutePath());
    }

    @Nullable
    private static File e(File file, long j, long j2, StringBuffer stringBuffer) {
        long j3;
        long j4;
        File[] listFiles = file.listFiles(new b(j2));
        if (listFiles == null || listFiles.length == 0) {
            stringBuffer.append("processDirs==null");
            return null;
        }
        int length = listFiles.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            File file2 = listFiles[i];
            if (file2.isDirectory()) {
                String[] split = file2.getName().split(Constants.ACCEPT_TIME_SEPARATOR_SERVER);
                if (split.length != 2) {
                    continue;
                } else {
                    try {
                        j3 = Long.parseLong(split[i2]);
                    } catch (Throwable unused) {
                        j3 = 0;
                    }
                    if (j3 == 0 || j3 > j) {
                        StringBuilder Q = e.a.a.a.a.Q("startTime:", j3, BundleUtil.UNDERLINE_TAG);
                        Q.append(j);
                        stringBuffer.append(Q.toString());
                    } else {
                        File[] listFiles2 = file2.listFiles();
                        if (listFiles2 == null) {
                            stringBuffer.append("crashDirs is null ");
                        } else {
                            int length2 = listFiles2.length;
                            while (i2 < length2) {
                                File file3 = listFiles2[i2];
                                if (file3.isDirectory()) {
                                    String str = q.f4432f;
                                    if (!new File(file3, q.f4432f).exists()) {
                                        stringBuffer.append("hasSummaryFile is false ");
                                    } else if (e.a.a.a.a.Q0(file3, "anr_info.txt")) {
                                        stringBuffer.append("anrinfo exist:");
                                    } else {
                                        try {
                                            j4 = Long.parseLong(file3.getName());
                                        } catch (Throwable unused2) {
                                            j4 = 0;
                                        }
                                        if (j4 != 0) {
                                            if (Math.abs(j4 - j) <= 35000) {
                                                return file3;
                                            }
                                        }
                                        StringBuilder Q2 = e.a.a.a.a.Q("last error:", j4, BundleUtil.UNDERLINE_TAG);
                                        Q2.append(j);
                                        stringBuffer.append(Q2.toString());
                                    }
                                } else {
                                    stringBuffer.append("crashDirs is not directory ");
                                }
                                i2++;
                            }
                        }
                    }
                }
            }
            i++;
            i2 = 0;
        }
        return null;
    }

    @Nullable
    private File[] f() {
        if (this.f4409d.exists()) {
            return this.f4409d.listFiles(new a(this));
        }
        return null;
    }

    static String g(long j, int i, boolean z) {
        return "ai_" + j + BundleUtil.UNDERLINE_TAG + i + (z ? "_current" : "_other");
    }

    static long h(String str) {
        String[] split = str.split(BundleUtil.UNDERLINE_TAG);
        if (split.length == 4) {
            try {
                return Long.decode(split[1]).longValue();
            } catch (Throwable unused) {
            }
        }
        return System.currentTimeMillis();
    }

    static int i(String str) {
        String[] split = str.split(BundleUtil.UNDERLINE_TAG);
        if (split.length != 4) {
            return 0;
        }
        try {
            return Integer.decode(split[2]).intValue();
        } catch (Throwable unused) {
            return 0;
        }
    }

    @Nullable
    File d(int i, long j) {
        File[] f2 = f();
        if (f2 == null) {
            return null;
        }
        for (File file : f2) {
            if (i(file.getName()) == i) {
                if (Math.abs(j - h(file.getName())) <= 35000) {
                    return file;
                }
            }
        }
        return null;
    }

    void j(File file) {
        int i;
        long h;
        File[] f2 = f();
        if (f2 == null) {
            return;
        }
        for (File file2 : f2) {
            try {
                i = i(file2.getName());
                h = h(file2.getName());
            } catch (Throwable th) {
                com.bytedance.crash.Q.b.f("NPTH_ANR_ERROR", th);
            }
            if (i != 0 && h != 0) {
                StringBuffer stringBuffer = new StringBuffer();
                File e2 = e(file, h, i, stringBuffer);
                if (e2 == null) {
                    file2.delete();
                    com.bytedance.crash.Q.b.f("NPTH_ANR_ERROR", new Exception("Not found matched directory pid:" + i + BundleUtil.UNDERLINE_TAG + file2.getName() + "_:reason:" + ((Object) stringBuffer)));
                } else {
                    file2.renameTo(new File(e2, "anr_info.txt"));
                }
            }
            file2.delete();
            com.bytedance.crash.Q.b.f("NPTH_ANR_ERROR", new Exception("Invalid ANR Info File Name :{" + file2.getName() + "}"));
        }
    }

    void k() {
        if (this.a) {
            return;
        }
        this.a = true;
        this.b.startWatching();
        if (!C0653h.c()) {
            new c(this.f4409d).start();
            return;
        }
        e eVar = new e();
        this.f4410e = eVar;
        eVar.start();
    }

    public void l(long j) {
        this.f4410e.c(j);
    }

    void m() {
        if (this.a) {
            this.a = false;
            this.b.stopWatching();
        }
    }
}
