package okhttp3;

import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class E {
    final C0833a a;
    final Proxy b;

    /* renamed from: c, reason: collision with root package name */
    final InetSocketAddress f10496c;

    /* renamed from: d, reason: collision with root package name */
    final String f10497d;

    public E(C0833a c0833a, Proxy proxy, InetSocketAddress inetSocketAddress, String str) {
        Objects.requireNonNull(c0833a, "address == null");
        Objects.requireNonNull(inetSocketAddress, "inetSocketAddress == null");
        this.a = c0833a;
        this.b = proxy;
        this.f10496c = inetSocketAddress;
        this.f10497d = str;
    }

    public C0833a a() {
        return this.a;
    }

    public String b() {
        return this.f10497d;
    }

    public Proxy c() {
        return this.b;
    }

    public boolean d() {
        return this.a.i != null && this.b.type() == Proxy.Type.HTTP;
    }

    public InetSocketAddress e() {
        return this.f10496c;
    }

    public boolean equals(Object obj) {
        if (obj instanceof E) {
            E e2 = (E) obj;
            if (e2.a.equals(this.a) && e2.b.equals(this.b) && e2.f10496c.equals(this.f10496c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f10496c.hashCode() + ((this.b.hashCode() + ((this.a.hashCode() + 527) * 31)) * 31);
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("Route{");
        M.append(this.f10496c);
        M.append("}");
        return M.toString();
    }
}
