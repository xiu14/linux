package okhttp3.F.h;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;
import javax.net.ssl.SSLSocket;
import okhttp3.Protocol;

/* loaded from: classes2.dex */
class e extends g {

    /* renamed from: c, reason: collision with root package name */
    private final Method f10564c;

    /* renamed from: d, reason: collision with root package name */
    private final Method f10565d;

    /* renamed from: e, reason: collision with root package name */
    private final Method f10566e;

    /* renamed from: f, reason: collision with root package name */
    private final Class<?> f10567f;

    /* renamed from: g, reason: collision with root package name */
    private final Class<?> f10568g;

    private static class a implements InvocationHandler {
        private final List<String> a;
        boolean b;

        /* renamed from: c, reason: collision with root package name */
        String f10569c;

        a(List<String> list) {
            this.a = list;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (objArr == null) {
                objArr = okhttp3.F.c.b;
            }
            if (name.equals("supports") && Boolean.TYPE == returnType) {
                return Boolean.TRUE;
            }
            if (name.equals("unsupported") && Void.TYPE == returnType) {
                this.b = true;
                return null;
            }
            if (name.equals("protocols") && objArr.length == 0) {
                return this.a;
            }
            if ((!name.equals("selectProtocol") && !name.equals("select")) || String.class != returnType || objArr.length != 1 || !(objArr[0] instanceof List)) {
                if ((!name.equals("protocolSelected") && !name.equals("selected")) || objArr.length != 1) {
                    return method.invoke(this, objArr);
                }
                this.f10569c = (String) objArr[0];
                return null;
            }
            List list = (List) objArr[0];
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (this.a.contains(list.get(i))) {
                    String str = (String) list.get(i);
                    this.f10569c = str;
                    return str;
                }
            }
            String str2 = this.a.get(0);
            this.f10569c = str2;
            return str2;
        }
    }

    e(Method method, Method method2, Method method3, Class<?> cls, Class<?> cls2) {
        this.f10564c = method;
        this.f10565d = method2;
        this.f10566e = method3;
        this.f10567f = cls;
        this.f10568g = cls2;
    }

    @Override // okhttp3.F.h.g
    public void a(SSLSocket sSLSocket) {
        try {
            this.f10566e.invoke(null, sSLSocket);
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw okhttp3.F.c.b("unable to remove alpn", e2);
        }
    }

    @Override // okhttp3.F.h.g
    public void f(SSLSocket sSLSocket, String str, List<Protocol> list) {
        try {
            this.f10564c.invoke(null, sSLSocket, Proxy.newProxyInstance(g.class.getClassLoader(), new Class[]{this.f10567f, this.f10568g}, new a(g.b(list))));
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw okhttp3.F.c.b("unable to set alpn", e2);
        }
    }

    @Override // okhttp3.F.h.g
    public String j(SSLSocket sSLSocket) {
        try {
            a aVar = (a) Proxy.getInvocationHandler(this.f10565d.invoke(null, sSLSocket));
            boolean z = aVar.b;
            if (!z && aVar.f10569c == null) {
                g.h().n(4, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", null);
                return null;
            }
            if (z) {
                return null;
            }
            return aVar.f10569c;
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw okhttp3.F.c.b("unable to get selected protocol", e2);
        }
    }
}
