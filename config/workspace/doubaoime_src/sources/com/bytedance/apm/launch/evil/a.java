package com.bytedance.apm.launch.evil;

import android.os.Handler;
import com.bytedance.apm.PerfConfig;
import com.bytedance.apm.block.evil.EvilMethodSwitcher;
import com.bytedance.apm.t.l.d;
import com.bytedance.apm.t.l.e;
import com.bytedance.monitor.collector.g;
import java.util.Objects;

/* loaded from: classes.dex */
public class a {
    private static boolean a = false;
    private static boolean b = false;

    /* renamed from: c, reason: collision with root package name */
    private static e.b.j.b.a f3460c;

    /* renamed from: com.bytedance.apm.launch.evil.a$a, reason: collision with other inner class name */
    static class RunnableC0118a implements Runnable {
        RunnableC0118a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.c();
        }
    }

    public static synchronized void a() {
        synchronized (a.class) {
            if (f3460c != null && EvilMethodSwitcher.isOpenLaunchEvilMethod()) {
                f3460c.i();
            }
        }
    }

    public static synchronized void b() {
        synchronized (a.class) {
            if (a) {
                return;
            }
            a = true;
            if (!b) {
                b = true;
                e.b.j.b.a.l(EvilMethodSwitcher.getLaunchEvilThresholdMs());
                e.b.j.b.a.m = true;
                if (EvilMethodSwitcher.isMessageKeyEnable()) {
                    PerfConfig.setReportMessage();
                }
                d.i().k();
                e.y().D();
                e.b.j.b.a.l = true;
                e.b.j.b.a aVar = new e.b.j.b.a(EvilMethodSwitcher.isLaunchLimitEvilMethodDepth(), true);
                f3460c = aVar;
                aVar.m();
                g.d(true, "launch", null);
                new Handler().postDelayed(new RunnableC0118a(), com.heytap.mcssdk.constant.a.q);
            }
            com.bytedance.apm.t.g.a("app_launch_evil_method_scene_apm_2");
        }
    }

    public static synchronized void c() {
        synchronized (a.class) {
            if (a) {
                a = false;
                e.b.j.b.a aVar = f3460c;
                EvilMethodSwitcher.isLimitEvilMethodDepth();
                Objects.requireNonNull(aVar);
                e.b.j.b.a.l(EvilMethodSwitcher.getEvilThresholdMs());
                com.bytedance.apm.t.g.c("app_launch_evil_method_scene_apm_2");
            }
        }
    }
}
