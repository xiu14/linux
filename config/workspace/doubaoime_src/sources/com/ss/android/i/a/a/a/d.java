package com.ss.android.i.a.a.a;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
final class d implements InvocationHandler {
    d() {
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        if (method.getDeclaringClass() == Object.class) {
            return method.invoke(this, objArr);
        }
        Class<?> returnType = method.getReturnType();
        return returnType.isPrimitive() ? b.a(returnType) : method.getDefaultValue();
    }
}
