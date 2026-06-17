package kotlin.r.h.a;

import java.lang.reflect.Method;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
final class f {
    public static final f a = new f();
    private static final a b = new a(null, null, null);

    /* renamed from: c, reason: collision with root package name */
    private static a f10119c;

    private static final class a {
        public final Method a;
        public final Method b;

        /* renamed from: c, reason: collision with root package name */
        public final Method f10120c;

        public a(Method method, Method method2, Method method3) {
            this.a = method;
            this.b = method2;
            this.f10120c = method3;
        }
    }

    private f() {
    }

    public final String a(kotlin.r.h.a.a aVar) {
        l.f(aVar, "continuation");
        a aVar2 = f10119c;
        if (aVar2 == null) {
            try {
                a aVar3 = new a(Class.class.getDeclaredMethod("getModule", new Class[0]), aVar.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", new Class[0]), aVar.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", new Class[0]));
                f10119c = aVar3;
                aVar2 = aVar3;
            } catch (Exception unused) {
                aVar2 = b;
                f10119c = aVar2;
            }
        }
        if (aVar2 == b) {
            return null;
        }
        Method method = aVar2.a;
        Object invoke = method != null ? method.invoke(aVar.getClass(), new Object[0]) : null;
        if (invoke == null) {
            return null;
        }
        Method method2 = aVar2.b;
        Object invoke2 = method2 != null ? method2.invoke(invoke, new Object[0]) : null;
        if (invoke2 == null) {
            return null;
        }
        Method method3 = aVar2.f10120c;
        Object invoke3 = method3 != null ? method3.invoke(invoke2, new Object[0]) : null;
        if (invoke3 instanceof String) {
            return (String) invoke3;
        }
        return null;
    }
}
