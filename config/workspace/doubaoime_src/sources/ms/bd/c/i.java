package ms.bd.c;

import android.app.Activity;
import java.lang.reflect.Field;

/* loaded from: classes2.dex */
public final class i implements Runnable {
    public final /* synthetic */ Activity a;

    public i(Activity activity) {
        this.a = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Activity activity = this.a;
        int i = n.a;
        try {
            Field declaredField = Class.forName((String) y2.a(16777217, 0, 0L, "bff6c0", new byte[]{114, 106, 17, 80, 83, 46, 101, 9, 54, 118, 99, 42, 52, 65, 72, 46, 119, 78, 35, Byte.MAX_VALUE})).getDeclaredField((String) y2.a(16777217, 0, 0L, "52e8b8", new byte[]{41, 2, 19, 74, 88, 61, 36, 22, 38}));
            declaredField.setAccessible(true);
            String obj = declaredField.get(activity).toString();
            String className = activity.getComponentName().getClassName();
            if (!className.contains(obj)) {
                y2.a(16777222, 0, 0L, className + ((String) y2.a(16777217, 0, 0L, "9a6a96", new byte[]{115})) + obj, null);
            }
        } catch (Throwable unused) {
        }
        n.b(1);
    }
}
