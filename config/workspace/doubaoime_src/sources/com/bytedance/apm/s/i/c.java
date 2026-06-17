package com.bytedance.apm.s.i;

import android.text.TextUtils;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/* loaded from: classes.dex */
public class c implements InvocationHandler {
    private Object a;
    private b b;

    class a implements InvocationHandler {
        final /* synthetic */ Object a;

        a(Object obj) {
            this.a = obj;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            try {
                c.this.b.invoke(obj, method, objArr);
            } catch (Throwable th) {
                StringBuilder M = e.a.a.a.a.M("hookServiceImpl invoke failed: ");
                M.append(th.getMessage());
                com.bytedance.apm.y.a.a("APM-Battery", M.toString());
            }
            return method.invoke(this.a, objArr);
        }
    }

    public c(Object obj, b bVar) {
        this.a = obj;
        this.b = bVar;
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        try {
            if ("getService".equals(method.getName())) {
                Object invoke = method.invoke(this.a, objArr);
                Field declaredField = invoke.getClass().getDeclaredField("mService");
                declaredField.setAccessible(true);
                Object obj2 = declaredField.get(invoke);
                String name = obj2.getClass().getName();
                if (!TextUtils.isEmpty(name) && name.startsWith(this.b.c())) {
                    declaredField.set(invoke, Proxy.newProxyInstance(obj2.getClass().getClassLoader(), new Class[]{Class.forName(this.b.c())}, new a(obj2)));
                }
                return invoke;
            }
        } catch (Throwable th) {
            StringBuilder M = e.a.a.a.a.M("ServiceFetcher getService hook failed: ");
            M.append(th.getMessage());
            com.bytedance.apm.y.a.a("APM-Battery", M.toString());
        }
        return method.invoke(this.a, objArr);
    }
}
