package e.i.b;

import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import e.i.b.f.e.b;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
public final class a implements ComponentCallbacks2 {
    private static boolean a;
    public static final a b = new a();

    private a() {
    }

    public final void a() {
        try {
            if (a) {
                b.a("OUISdk", "init already");
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            Application application = null;
            try {
                application = (Application) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, new Object[0]);
            } catch (Exception e2) {
                b.c("OUISdk", "getApplicationReflect failed", e2);
            }
            if (application != null) {
                application.registerComponentCallbacks(this);
            }
            a = true;
            b.a("OUISdk", "init success, cost: " + (System.currentTimeMillis() - currentTimeMillis) + " ms");
        } catch (Exception e3) {
            b.c("OUISdk", "init failed", e3);
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        l.f(configuration, "newConfig");
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        e.i.b.c.b.l.f10018e.f();
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        e.i.b.c.b.l.f10018e.f();
    }
}
