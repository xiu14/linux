package e.i.b.f;

import android.app.Activity;
import android.content.res.Resources;
import android.view.Window;
import android.view.WindowInsetsController;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatDelegate;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
public final class a {
    @RequiresApi(30)
    public static final void a(Activity activity) {
        l.f(activity, "$this$adaptLightDarkStatusBar");
        Window window = activity.getWindow();
        WindowInsetsController insetsController = window != null ? window.getInsetsController() : null;
        if (insetsController != null) {
            Resources system = Resources.getSystem();
            l.e(system, "Resources.getSystem()");
            int i = system.getConfiguration().uiMode & 48;
            boolean z = i == 32;
            e.i.b.f.e.b.a("ActivityUtils", "isSystemInDarkTheme: " + z + ", currentNightMode" + i);
            if (!z) {
                boolean z2 = AppCompatDelegate.getDefaultNightMode() == 2;
                e.i.b.f.e.b.a("ActivityUtils", "isAppInDarkTheme: " + z2);
                if (!z2) {
                    insetsController.setSystemBarsAppearance(8, 8);
                    return;
                }
            }
            insetsController.setSystemBarsAppearance(0, 8);
        }
    }
}
