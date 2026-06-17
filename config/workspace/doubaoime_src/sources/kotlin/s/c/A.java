package kotlin.s.c;

import java.util.Objects;

/* loaded from: classes2.dex */
public class A {
    private static final B a;
    private static final kotlin.reflect.c[] b;

    static {
        B b2 = null;
        try {
            b2 = (B) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (b2 == null) {
            b2 = new B();
        }
        a = b2;
        b = new kotlin.reflect.c[0];
    }

    public static kotlin.reflect.e a(j jVar) {
        Objects.requireNonNull(a);
        return jVar;
    }

    public static kotlin.reflect.c b(Class cls) {
        Objects.requireNonNull(a);
        return new e(cls);
    }

    public static kotlin.reflect.d c(Class cls) {
        Objects.requireNonNull(a);
        return new q(cls, "");
    }

    public static kotlin.reflect.d d(Class cls, String str) {
        Objects.requireNonNull(a);
        return new q(cls, str);
    }

    public static kotlin.reflect.f e(n nVar) {
        Objects.requireNonNull(a);
        return nVar;
    }

    public static kotlin.reflect.g f(r rVar) {
        Objects.requireNonNull(a);
        return rVar;
    }

    public static kotlin.reflect.h g(s sVar) {
        Objects.requireNonNull(a);
        return sVar;
    }

    public static String h(i iVar) {
        return a.a(iVar);
    }

    public static String i(m mVar) {
        return a.a(mVar);
    }
}
