package com.bytedance.memory.d;

import android.os.Debug;
import com.bytedance.android.input.r.f;
import com.bytedance.crash.Npth;
import com.bytedance.memory.e.a;
import java.io.File;
import java.util.Objects;

/* loaded from: classes.dex */
public class b {
    private long a;
    private volatile boolean b;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                b bVar = b.this;
                Objects.requireNonNull(bVar);
                if (com.bytedance.feedbackerlib.a.G("npth_hprof_close_expired")) {
                    return;
                }
                com.bytedance.memory.b.b.a.a(new d(bVar), "checkFileExpired");
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    /* renamed from: com.bytedance.memory.d.b$b, reason: collision with other inner class name */
    private static class C0270b {
        private static final b a = new b(null);
    }

    b(a aVar) {
    }

    static void a(b bVar) {
        File file;
        Objects.requireNonNull(bVar);
        try {
            if (System.currentTimeMillis() - bVar.a < com.heytap.mcssdk.constant.a.f6886d) {
                return;
            }
            bVar.a = System.currentTimeMillis();
            com.bytedance.feedbackerlib.a.Q0("npth_dump_begin");
            a.b j = com.bytedance.memory.a.a.j().i().j();
            File d2 = com.bytedance.memory.c.b.c().d();
            if (j == null || com.bytedance.feedbackerlib.a.z("close_native_dump_and_shrink")) {
                file = new File(d2, "npth.jpg");
                if (file.exists()) {
                    file.delete();
                }
                Debug.dumpHprofData(file.getAbsolutePath());
            } else {
                file = new File(d2, "npth_mini.jpg");
                if (file.exists()) {
                    file.delete();
                }
                if (!((f) j).a(file)) {
                    file = new File(d2, "npth.jpg");
                    if (file.exists()) {
                        file.delete();
                    }
                    Debug.dumpHprofData(file.getAbsolutePath());
                }
            }
            com.bytedance.feedbackerlib.a.Q0("npth_dump_end");
            com.bytedance.memory.b.c.b("onCrash dump finish:" + file.getAbsolutePath(), new Object[0]);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static b b() {
        return C0270b.a;
    }

    public void c() {
        try {
            if (this.b) {
                return;
            }
            this.b = true;
            Npth.registerHprofCallback(new c(this));
            com.bytedance.apm.F.b.e().j(new a(), com.heytap.mcssdk.constant.a.q);
            com.bytedance.memory.b.c.b("registerCrashCallBack", new Object[0]);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
