package com.bytedance.memory.c;

import android.os.Debug;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.bytedance.android.input.r.f;
import com.bytedance.apm.g;
import com.bytedance.crash.Npth;
import com.bytedance.memory.b.e;
import com.bytedance.memory.e.a;
import com.bytedance.memory.heap.HeapDump;
import com.huawei.hms.framework.common.BundleUtil;
import java.io.File;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class d {
    private static volatile d b;

    /* renamed from: c, reason: collision with root package name */
    private static b f5372c;
    private long a = System.currentTimeMillis();

    private d() {
        com.bytedance.memory.a.a.j().h();
    }

    @WorkerThread
    private void c(int i) {
        File h;
        long nanoTime = System.nanoTime();
        File i2 = f5372c.i();
        if (i2 == null) {
            return;
        }
        File parentFile = i2.getParentFile();
        if (!parentFile.exists()) {
            parentFile.mkdirs();
        }
        long currentTimeMillis = System.currentTimeMillis();
        com.bytedance.feedbackerlib.a.Q0("dump_begin");
        a.b j = com.bytedance.memory.a.a.j().i().j();
        if (j == null || com.bytedance.feedbackerlib.a.z("close_native_dump_and_shrink")) {
            h = h(i2, i);
            com.bytedance.memory.heap.a.e().m(false);
        } else {
            File file = new File(b.c().g(), ".mini.hprof");
            if (((f) j).a(file)) {
                String optString = g.k().optString("device_id");
                String optString2 = g.k().optString("update_version_code");
                com.bytedance.memory.heap.a.e().n(optString2);
                h = new File(file.getParent(), e.a.a.a.a.u(optString, BundleUtil.UNDERLINE_TAG, optString2, "_shrink.zip"));
                com.bytedance.memory.b.g.b(file, h);
                if (file.exists()) {
                    file.delete();
                }
                com.bytedance.memory.heap.a.e().m(true);
                com.bytedance.memory.heap.a.e().l(h.getAbsolutePath());
                com.bytedance.memory.heap.a.e().k(4);
            } else {
                h = h(i2, i);
                com.bytedance.memory.heap.a.e().m(false);
            }
        }
        com.bytedance.feedbackerlib.a.Q0("dump_end");
        com.bytedance.feedbackerlib.a.S0("dump_time", System.currentTimeMillis() - currentTimeMillis);
        if (h == null) {
            return;
        }
        long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - nanoTime);
        HeapDump.b newBuilder = HeapDump.newBuilder();
        newBuilder.f(h);
        newBuilder.d(0L);
        newBuilder.b(this.a);
        h.length();
        newBuilder.c(e.a);
        newBuilder.e(millis);
        HeapDump a = newBuilder.a();
        com.bytedance.memory.b.c.b(a.toString(), new Object[0]);
        com.bytedance.memory.heap.a.e().j(a);
        com.bytedance.memory.heap.a.e().r(System.currentTimeMillis());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(int i) {
        try {
            if (b()) {
                c(i);
                com.bytedance.memory.g.a.f().e();
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private long f() {
        try {
            if (!TextUtils.isEmpty(com.bytedance.memory.a.a.j().k())) {
                try {
                    return new StatFs(new File(com.bytedance.memory.a.a.j().k()).getPath()).getAvailableBytes();
                } catch (Throwable unused) {
                    return 0L;
                }
            }
            if ("mounted".equals(Environment.getExternalStorageState())) {
                return new StatFs(com.bytedance.apm.util.f.c(g.h()).getPath()).getAvailableBytes();
            }
            return 0L;
        } catch (Throwable unused2) {
            return 0L;
        }
    }

    public static d g() {
        if (b == null) {
            synchronized (d.class) {
                if (b == null) {
                    b = new d();
                    f5372c = b.c();
                }
            }
        }
        return b;
    }

    @Nullable
    private File h(File file, int i) {
        try {
            if (i == 2) {
                com.bytedance.memory.b.c.b("Native dump", new Object[0]);
                Npth.dumpHprof(file.getAbsolutePath());
                com.bytedance.memory.b.c.b("Native dump exist ? " + new File(file.getAbsolutePath()).exists(), new Object[0]);
            } else {
                Debug.dumpHprofData(file.getAbsolutePath());
            }
            com.bytedance.memory.heap.a.e().n(g.k().optString("update_version_code"));
            return file;
        } catch (Exception e2) {
            com.bytedance.memory.b.c.a(e2, "Could not realDump heap", new Object[0]);
            return null;
        }
    }

    public boolean b() {
        try {
            long f2 = f();
            long d2 = com.bytedance.apm.util.b.d();
            return f2 > 0 && d2 > 0 && ((float) f2) > ((float) d2) * 1.5f;
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }

    public void d(long j) {
        int i = com.bytedance.memory.a.a.j().i().n() == 2 ? 2 : 1;
        this.a = j;
        com.bytedance.memory.heap.a.e().g();
        if (com.bytedance.memory.a.a.j().i().n() == 2) {
            com.bytedance.memory.b.b.a.a(new c(this, i), "HeapDumper-dumpHeap");
        } else {
            e(i);
        }
    }
}
