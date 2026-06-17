package com.bytedance.common_biz.ui.utils;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
class ReflectUtils {
    private ReflectUtils() {
    }

    public native Constructor getDeclaredConstructorNative(Class<?> cls, Class<?>[] clsArr);

    public native Field getDeclaredFieldNative(Class<?> cls, String str);

    public native Method getDeclaredMethodNative(Class<?> cls, String str, Class<?>[] clsArr);
}
