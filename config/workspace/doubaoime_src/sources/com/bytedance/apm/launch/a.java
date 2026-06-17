package com.bytedance.apm.launch;

import android.util.Log;
import com.bytedance.apm.G.c;
import com.bytedance.apm.g;
import com.bytedance.apm.launch.c;

/* loaded from: classes.dex */
public class a {
    private c a;
    private c.a b;

    /* JADX INFO: Access modifiers changed from: private */
    static final class b {
        private static final a a = new a(null);
    }

    a(C0117a c0117a) {
    }

    public static a b() {
        return b.a;
    }

    public synchronized c a() {
        if (this.a == null) {
            this.a = new c.a().a();
        }
        return this.a;
    }

    public synchronized c.a c() {
        if (this.b == null) {
            this.b = new c.a.C0108a().a();
        }
        return this.b;
    }

    public void d(String str) {
        if (g.B()) {
            Log.d("LaunchAnalysis", str);
        }
    }

    public synchronized void e(c cVar) {
        this.a = cVar;
    }
}
