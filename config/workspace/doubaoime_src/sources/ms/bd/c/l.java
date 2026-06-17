package ms.bd.c;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.view.Window;
import com.bytedance.mobsec.metasec.core.SwitchManager;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class l implements Application.ActivityLifecycleCallbacks {
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(final Activity activity, Bundle bundle) {
        if (((String) y2.a(16777217, 0, 0L, "28b0fd", new byte[]{39, 53, 4, 93, 80, 125})).equals((String) y2.a(16777217, 0, 0L, "4e1dfb", new byte[]{33, 104, 87, 9, 80, 123}))) {
            n.h.post(new Runnable() { // from class: ms.bd.c.B
                @Override // java.lang.Runnable
                public final void run() {
                    Window.Callback callback;
                    Activity activity2 = activity;
                    int i = n.a;
                    String packageName = activity2.getPackageName();
                    if (SwitchManager.a().b(5) && Arrays.asList(b3.a).contains(packageName) && (callback = activity2.getWindow().getCallback()) != null) {
                        activity2.getWindow().setCallback(new x(callback));
                    }
                }
            });
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        if (n.f10409e) {
            return;
        }
        n.f10409e = true;
        n.h.post(new i(activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        if (n.f10409e) {
            n.h.post(new k(this));
        }
    }
}
