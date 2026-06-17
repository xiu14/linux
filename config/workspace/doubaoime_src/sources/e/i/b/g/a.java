package e.i.b.g;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.WindowInsetsController;
import androidx.annotation.RequiresApi;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
public final class a {
    @RequiresApi(30)
    @SuppressLint({"BlockedPrivateApi", "PrivateApi"})
    public static final int a(View view) {
        WindowInsetsController windowInsetsController;
        l.f(view, "rootView");
        try {
            windowInsetsController = view.getWindowInsetsController();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        if (windowInsetsController != null) {
            l.e(windowInsetsController, "rootView.windowInsetsController ?: return 0");
            Method declaredMethod = windowInsetsController.getClass().getDeclaredMethod("getState", new Class[0]);
            l.e(declaredMethod, "getStateMethod");
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(windowInsetsController, new Object[0]);
            int i = Build.VERSION.SDK_INT;
            Class<?> cls = i >= 35 ? Class.forName("android.view.InsetsSource") : Class.forName("android.view.InsetsState");
            Field declaredField = i >= 35 ? cls.getDeclaredField("ID_IME") : cls.getDeclaredField("ITYPE_IME");
            l.e(declaredField, "insetField");
            declaredField.setAccessible(true);
            Object obj = null;
            int i2 = declaredField.getInt(null);
            Method declaredMethod2 = invoke.getClass().getDeclaredMethod("peekSource", Integer.TYPE);
            l.e(declaredMethod2, "peekSourceMethod");
            declaredMethod2.setAccessible(true);
            Object invoke2 = declaredMethod2.invoke(invoke, Integer.valueOf(i2));
            if (!(invoke2 instanceof Object)) {
                invoke2 = null;
            }
            if (invoke2 != null) {
                Method declaredMethod3 = invoke2.getClass().getDeclaredMethod("isVisible", new Class[0]);
                l.e(declaredMethod3, "isVisibleMethod");
                declaredMethod3.setAccessible(true);
                Object invoke3 = declaredMethod3.invoke(invoke2, new Object[0]);
                if (!(invoke3 instanceof Boolean)) {
                    invoke3 = null;
                }
                Boolean bool = (Boolean) invoke3;
                if (bool != null && bool.booleanValue()) {
                    Method declaredMethod4 = invoke2.getClass().getDeclaredMethod("getFrame", new Class[0]);
                    l.e(declaredMethod4, "getFrameMethod");
                    declaredMethod4.setAccessible(true);
                    Object invoke4 = declaredMethod4.invoke(invoke2, new Object[0]);
                    if (invoke4 instanceof Rect) {
                        obj = invoke4;
                    }
                    Rect rect = (Rect) obj;
                    if (rect != null) {
                        return rect.height();
                    }
                }
                return 0;
            }
        }
        return 0;
    }

    public static final int b(Context context) {
        if (context == null) {
            return 0;
        }
        int identifier = context.getResources().getIdentifier("navigation_bar_height", "dimen", "android");
        if (identifier > 0) {
            return context.getResources().getDimensionPixelSize(identifier);
        }
        try {
            Class<?> cls = Class.forName("com.android.internal.R$dimen");
            return context.getResources().getDimensionPixelSize(Integer.parseInt(cls.getField("navigation_bar_height").get(cls.newInstance()).toString()));
        } catch (Exception unused) {
            return 0;
        }
    }
}
