package e.b.l;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class g implements InvocationHandler {
    private Class<?> a;
    private i b;

    /* renamed from: c, reason: collision with root package name */
    private h f9617c;

    /* renamed from: d, reason: collision with root package name */
    private final Map<Method, k> f9618d = new LinkedHashMap();

    public g(Class<?> cls, i iVar, h hVar) {
        this.a = cls;
        this.b = iVar;
        this.f9617c = hVar;
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) {
        k kVar;
        h hVar = this.f9617c;
        synchronized (this.f9618d) {
            kVar = this.f9618d.get(method);
            if (kVar == null) {
                kVar = new k(this.a, method);
                this.f9618d.put(method, kVar);
            }
        }
        return this.b.j(kVar.o(hVar, objArr));
    }
}
