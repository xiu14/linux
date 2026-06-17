package com.bytedance.apm;

import android.util.Log;
import java.util.HashSet;

/* loaded from: classes.dex */
public class n {
    private a a;
    private HashSet<String> b = new HashSet<>();

    public interface a {
        void a(Throwable th, String str);

        void ensureNotReachHere(String str);

        void ensureNotReachHere(Throwable th, String str);
    }

    private static class b {
        private static final n a = new n(null);
    }

    n(m mVar) {
    }

    public static n e() {
        return b.a;
    }

    public void b(Throwable th, String str) {
        try {
            a aVar = this.a;
            if (aVar != null) {
                aVar.a(th, str);
            }
        } catch (Throwable unused) {
        }
        if (g.B() || g.E()) {
            throw new RuntimeException(th);
        }
    }

    public void c(String str) {
        if (this.a != null && !this.b.contains(str)) {
            this.b.add(str);
            this.a.ensureNotReachHere("apm_" + str);
        }
        if (g.B()) {
            Log.e("apm_", "ensureNotReachHere", new RuntimeException(str));
            System.exit(1);
        }
    }

    public void d(Throwable th, String str) {
        if (this.a != null && !this.b.contains(str)) {
            this.b.add(str);
            this.a.ensureNotReachHere(th, "apm_" + str);
        }
        if (g.B()) {
            th.printStackTrace();
        }
    }

    public void f(a aVar) {
        this.a = aVar;
        ((com.bytedance.monitor.util.thread.a) com.bytedance.monitor.util.thread.c.a()).n(new m(this));
    }
}
