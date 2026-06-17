package com.bytedance.praisedialoglib.manager;

import android.app.Application;
import com.bytedance.praisedialoglib.manager.a;

/* loaded from: classes.dex */
public class e {
    private Application a;

    /* JADX INFO: Access modifiers changed from: private */
    static class b {
        private static e a = new e(null);
    }

    e(a aVar) {
    }

    public static e b() {
        return b.a;
    }

    public Application a() {
        return this.a;
    }

    public void c(e.b.k.c.c cVar, Application application) {
        this.a = application;
        a.b.a.F(cVar);
    }
}
