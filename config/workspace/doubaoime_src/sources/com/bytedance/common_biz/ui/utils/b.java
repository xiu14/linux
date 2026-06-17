package com.bytedance.common_biz.ui.utils;

import android.util.Log;
import android.view.View;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public final class b {
    public static final b a = null;
    private static Integer b;

    /* renamed from: c, reason: collision with root package name */
    private static final Map<String, Method> f4338c = new HashMap();

    public static final Object a(Object obj) {
        if (!(obj instanceof View)) {
            return obj;
        }
        View view = (View) obj;
        Map<String, Method> map = f4338c;
        Method method = map.get("view_getExtEffect");
        if (method == null) {
            try {
                method = View.class.getDeclaredMethod("getExtEffect", new Class[0]);
                method.setAccessible(true);
                map.put("view_getExtEffect", method);
            } catch (Exception e2) {
                e2.printStackTrace();
                return null;
            }
        }
        return method.invoke(view, new Object[0]);
    }

    public static final boolean b() {
        int i;
        if (b == null) {
            Map<String, Method> map = f4338c;
            Method method = map.get("getEffectApi");
            if (method == null) {
                try {
                    method = Class.forName("android.view.IExtEffect").getDeclaredMethod("getEffectApi", new Class[0]);
                    method.setAccessible(true);
                    map.put("getEffectApi", method);
                } catch (Exception e2) {
                    Log.e("ObricBlurHelper", "getEffectApi failed: " + e2);
                }
            }
            l.c(method);
            Object invoke = method.invoke(null, new Object[0]);
            Integer num = invoke instanceof Integer ? (Integer) invoke : null;
            if (num != null) {
                i = num.intValue();
                b = Integer.valueOf(i);
            }
            i = 0;
            b = Integer.valueOf(i);
        }
        Integer num2 = b;
        l.c(num2);
        boolean z = num2.intValue() > 0;
        Log.i("ObricBlurHelper", "isSupportObricMaterial: " + z);
        return z;
    }

    public static final void c(Object obj, int i, int i2) {
        l.f(obj, TypedValues.AttributesType.S_TARGET);
        if (b()) {
            Object a2 = a(obj);
            Map<String, Method> map = f4338c;
            Method method = map.get("setObricEffectSource_2");
            if (method == null) {
                try {
                    Class<?> cls = Class.forName("android.view.IExtEffect");
                    Class<?> cls2 = Integer.TYPE;
                    method = cls.getDeclaredMethod("setObricEffectSource", cls2, cls2);
                    method.setAccessible(true);
                    map.put("setObricEffectSource_2", method);
                } catch (Exception e2) {
                    e2.printStackTrace();
                    return;
                }
            }
            method.invoke(a2, Integer.valueOf(i), Integer.valueOf(i2));
        }
    }

    public static final void d(View view, Integer num) {
        l.f(view, "view");
        if (num == null) {
            c(view, 0, 1);
            return;
        }
        c(view, 3, 1);
        float intValue = num.intValue();
        l.f(view, TypedValues.AttributesType.S_TARGET);
        l.f(view, TypedValues.AttributesType.S_TARGET);
        if (b()) {
            Object a2 = a(view);
            Map<String, Method> map = f4338c;
            Method method = map.get("setObricBlurEffect_5");
            if (method == null) {
                try {
                    Class<?> cls = Class.forName("android.view.IExtEffect");
                    Class<?> cls2 = Float.TYPE;
                    Class<?> cls3 = Integer.TYPE;
                    method = cls.getDeclaredMethod("setObricBlurEffect", cls2, cls2, cls3, cls3, cls2);
                    method.setAccessible(true);
                    map.put("setObricBlurEffect_5", method);
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
            method.invoke(a2, Float.valueOf(intValue), Float.valueOf(1.0f), 0, 0, Float.valueOf(1.0f));
        }
        Log.i("ObricBlurHelper", "setMaterialFromWindow blurRadius: " + num);
    }
}
