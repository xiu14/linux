package com.obric.common.oea.foundation.blur;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public class NativeReflect {
    private NativeReflect() {
    }

    public native Constructor getDeclaredConstructorNative(Class<?> cls, Class<?>[] clsArr);

    public native Field getDeclaredFieldNative(Class<?> cls, String str);

    public native Method getDeclaredMethodNative(Class<?> cls, String str, Class<?>[] clsArr);
}
