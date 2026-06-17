package e.b.b.n;

import android.app.Application;
import android.content.Context;

/* loaded from: classes.dex */
public class a {
    private static boolean a = false;
    private static Application b;

    public static Application a() {
        return b;
    }

    public static boolean b() {
        return a;
    }

    public static void c(Context context) {
        if (context != null) {
            if (!(context instanceof Application)) {
                context = context.getApplicationContext();
            }
            b = (Application) context;
        }
    }

    public static void d(boolean z) {
        a = z;
    }
}
