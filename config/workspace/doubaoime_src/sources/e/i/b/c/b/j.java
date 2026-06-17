package e.i.b.c.b;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;

/* loaded from: classes2.dex */
public class j {
    private static TypedValue a;

    public static int a(Context context, int i) {
        if (a == null) {
            a = new TypedValue();
        }
        if (context.getTheme().resolveAttribute(i, a, true)) {
            return TypedValue.complexToDimensionPixelSize(a.data, context.getResources().getDisplayMetrics());
        }
        return 0;
    }

    public static float b(Context context, int i) {
        Resources.Theme theme = context.getTheme();
        if (a == null) {
            a = new TypedValue();
        }
        if (theme.resolveAttribute(i, a, true)) {
            return a.getFloat();
        }
        return -1.0f;
    }
}
