package com.bytedance.push.W;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes2.dex */
public abstract class e implements InvocationHandler {
    protected Object b;

    /* renamed from: d, reason: collision with root package name */
    protected boolean f5606d;
    protected String a = c();

    /* renamed from: c, reason: collision with root package name */
    protected final Set<a> f5605c = new HashSet();

    public synchronized boolean a(a aVar) {
        com.bytedance.push.g0.f.c(this.a, "add MethodInvokeProxy to mMethodInvokeProxySet:" + aVar);
        if (this.f5606d) {
            com.bytedance.push.g0.f.c(this.a, "has hook success,needn't hook");
        } else {
            com.bytedance.push.g0.f.c(this.a, "not hook success,star hook");
            this.f5606d = b();
        }
        if (this.f5606d) {
            synchronized (this.f5605c) {
                this.f5605c.add(aVar);
            }
        }
        return this.f5606d;
    }

    protected abstract boolean b();

    protected abstract String c();

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        Object[] array;
        synchronized (this.f5605c) {
            array = this.f5605c.toArray();
        }
        for (Object obj2 : array) {
            a aVar = (a) obj2;
            if (aVar != null) {
                f a = aVar.a(this.b, method, objArr);
                if (a.a) {
                    String str = this.a;
                    StringBuilder M = e.a.a.a.a.M("intercept ");
                    M.append(method.getName());
                    M.append(" method");
                    com.bytedance.push.g0.f.c(str, M.toString());
                    return a.b;
                }
            }
        }
        Object obj3 = this.b;
        if (obj3 == null) {
            return null;
        }
        Object invoke = method.invoke(obj3, objArr);
        for (Object obj4 : array) {
            Objects.requireNonNull((a) obj4);
        }
        return invoke;
    }
}
