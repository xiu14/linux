package e.i.b.d;

import android.content.Context;
import android.os.Vibrator;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import e.i.b.f.e.b;
import java.lang.reflect.Method;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
public final class a {
    private static Class<?> a;
    private static Method b;

    public static final void a(Context context, int i) {
        Object obj = null;
        Object systemService = context != null ? context.getSystemService("vibrator") : null;
        if (systemService != null && (systemService instanceof Vibrator)) {
            obj = systemService;
        }
        Vibrator vibrator = (Vibrator) obj;
        if (vibrator == null) {
            StringBuilder M = e.a.a.a.a.M("vibrateEffectWithHapticPlayer error: vibrator is null, context is null? ");
            M.append(context == null);
            b.b("VibratorSmt", M.toString());
            return;
        }
        l.f(vibrator, TypedValues.AttributesType.S_TARGET);
        try {
            if (a == null) {
                a = Class.forName("smartisanos.api.VibratorSmt");
            }
            if (b == null) {
                Class<?> cls = a;
                l.c(cls);
                Method declaredMethod = cls.getDeclaredMethod("vibrateEffectWithHapticPlayer", Vibrator.class, Integer.TYPE);
                b = declaredMethod;
                if (declaredMethod != null) {
                    declaredMethod.setAccessible(true);
                }
            }
            Method method = b;
            if (method != null) {
                method.invoke(a, vibrator, Integer.valueOf(i));
            }
        } catch (Exception e2) {
            b.b("VibratorSmt", "vibrateEffectWithHapticPlayer error: " + e2);
        }
    }
}
