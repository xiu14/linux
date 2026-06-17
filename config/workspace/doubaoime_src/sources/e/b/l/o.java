package e.b.l;

import android.app.Application;
import e.b.l.c;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class o {
    private static volatile d a;
    private static volatile i b;

    /* renamed from: c, reason: collision with root package name */
    private static Map<Class<?>, h> f9646c = new HashMap(4);

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f9647d = 0;

    public static void a(e.b.l.p.b bVar, Class<?>... clsArr) {
        if (bVar != null) {
            if (clsArr.length == 0) {
                a.a(bVar);
                return;
            }
            for (Class<?> cls : clsArr) {
                if (cls != null) {
                    h(cls).a(bVar);
                }
            }
        }
    }

    public static void b(e.b.l.p.c cVar) {
        if (cVar != null) {
            a.b(cVar);
        }
    }

    public static void c(com.bytedance.rpc.transport.h hVar) {
        if (hVar != null) {
            a.c(hVar);
        }
    }

    public static void d(com.bytedance.rpc.transport.k kVar) {
        if (kVar != null) {
            a.d(kVar);
        }
    }

    public static c.b e() {
        return a == null ? new c.b() : new c.b(a.g(), null);
    }

    public static synchronized <T> T f(Class<T> cls) {
        T t;
        synchronized (o.class) {
            k();
            t = (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new g(cls, b, h(cls)));
        }
        return t;
    }

    public static d g() {
        k();
        return a;
    }

    public static h h(Object obj) {
        h hVar;
        synchronized (f9646c) {
            hVar = f9646c.get(obj);
            if (hVar == null) {
                k();
                hVar = new h(a);
                f9646c.put((Class) obj, hVar);
            }
        }
        return hVar;
    }

    public static void i(Application application, c cVar) {
        if (application == null || cVar == null) {
            throw new RuntimeException("parameters of RpcService.init should not be null ");
        }
        if (com.bytedance.rpc.log.b.d()) {
            com.bytedance.rpc.log.b.a(String.format("rpc: init config=%s", cVar));
        }
        if (a == null) {
            synchronized (o.class) {
                if (a == null) {
                    a = new d(application, cVar);
                    b = new i(a);
                }
            }
        }
    }

    public static void j(com.bytedance.rpc.serialize.e eVar) {
        k();
        b.l(eVar);
    }

    private static void k() {
        if (a == null) {
            throw new RuntimeException("had you called RpcService.init(Application,RpcConfig)");
        }
    }
}
