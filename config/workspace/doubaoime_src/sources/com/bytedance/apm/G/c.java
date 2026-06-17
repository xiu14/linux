package com.bytedance.apm.G;

import androidx.annotation.RequiresApi;
import com.bytedance.apm.block.evil.EvilMethodSwitcher;

/* loaded from: classes.dex */
public final class c {
    private static g a = null;
    private static boolean b = false;

    public static class a {

        /* renamed from: com.bytedance.apm.G.c$a$a, reason: collision with other inner class name */
        public static class C0108a {
            public a a() {
                return new a(this, null);
            }
        }

        a(C0108a c0108a, b bVar) {
        }
    }

    public static void a() {
        if (b) {
            com.bytedance.apm.launch.evil.a.c();
        }
        g gVar = a;
        if (gVar != null) {
            gVar.d();
            a = null;
        }
    }

    public static void b(String str, String str2) {
        g gVar = a;
        if (gVar != null) {
            gVar.e(str, str2);
        }
    }

    public static void c(int i, String str, long j) {
        if (b) {
            com.bytedance.apm.launch.evil.a.c();
        }
        g gVar = a;
        if (gVar != null) {
            gVar.f(i, str, j, 0L);
        }
    }

    public static long d() {
        g gVar = a;
        if (gVar == null) {
            return 0L;
        }
        return gVar.g();
    }

    public static void e(String str, String str2) {
        g gVar = a;
        if (gVar != null) {
            gVar.i(str, str2);
        }
    }

    @RequiresApi(api = 18)
    public static void f() {
        g gVar = new g("start_trace", "launch_stats");
        a = gVar;
        gVar.j();
        if (com.bytedance.apm.g.G()) {
            boolean isOpenLaunchEvilMethod = EvilMethodSwitcher.isOpenLaunchEvilMethod();
            b = isOpenLaunchEvilMethod;
            if (isOpenLaunchEvilMethod) {
                com.bytedance.apm.launch.evil.a.b();
            }
        }
    }
}
