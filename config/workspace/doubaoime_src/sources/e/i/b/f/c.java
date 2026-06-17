package e.i.b.f;

import android.annotation.SuppressLint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.graphics.drawable.VectorDrawable;
import android.util.ArrayMap;
import android.util.Log;
import androidx.annotation.RequiresApi;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
public final class c {
    @SuppressLint({"SoonBlockedPrivateApi"})
    private static final void a(VectorDrawable vectorDrawable, String str, int i) throws Exception {
        Field declaredField = VectorDrawable.class.getDeclaredField("mVectorState");
        l.e(declaredField, "stateField");
        declaredField.setAccessible(true);
        Object obj = declaredField.get(vectorDrawable);
        Field declaredField2 = obj.getClass().getDeclaredField("mVGTargetsMap");
        l.e(declaredField2, "targetsMapField");
        declaredField2.setAccessible(true);
        Object obj2 = declaredField2.get(obj);
        Objects.requireNonNull(obj2, "null cannot be cast to non-null type android.util.ArrayMap<kotlin.String, kotlin.Any>");
        Object obj3 = ((ArrayMap) obj2).get(str);
        if (obj3 == null || !l.a(obj3.getClass().getSimpleName(), "VFullPath")) {
            return;
        }
        Field declaredField3 = Class.forName("android.graphics.drawable.VectorDrawable$VFullPath").getDeclaredField("mNativePtr");
        l.e(declaredField3, "nativePtrField");
        declaredField3.setAccessible(true);
        Object obj4 = declaredField3.get(obj3);
        Objects.requireNonNull(obj4, "null cannot be cast to non-null type kotlin.Long");
        long longValue = ((Long) obj4).longValue();
        Method declaredMethod = Class.forName("android.graphics.drawable.VectorDrawable").getDeclaredMethod("nSetFillColor", Long.TYPE, Integer.TYPE);
        l.e(declaredMethod, "nSetFillColor");
        declaredMethod.setAccessible(true);
        declaredMethod.invoke(null, Long.valueOf(longValue), Integer.valueOf(i));
    }

    @RequiresApi(29)
    public static final void b(StateListDrawable stateListDrawable, String str, int i) {
        l.f(stateListDrawable, "drawable");
        l.f(str, "pathName");
        int stateCount = stateListDrawable.getStateCount();
        for (int i2 = 0; i2 < stateCount; i2++) {
            Drawable stateDrawable = stateListDrawable.getStateDrawable(i2);
            if (stateDrawable instanceof VectorDrawable) {
                VectorDrawable vectorDrawable = (VectorDrawable) stateDrawable;
                l.f(vectorDrawable, "drawable");
                l.f(str, "pathName");
                try {
                    a(vectorDrawable, str, i);
                    vectorDrawable.invalidateSelf();
                } catch (Exception e2) {
                    Log.e("VectorBreaker", "Color injection failed", e2);
                }
            }
        }
    }
}
