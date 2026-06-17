package okhttp3.F.e;

import com.bytedance.frameworks.baselib.network.http.ok3.impl.h;
import com.xiaomi.mipush.sdk.Constants;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;
import okhttp3.C0833a;
import okhttp3.E;
import okhttp3.InterfaceC0836d;
import okhttp3.o;
import okhttp3.t;

/* loaded from: classes2.dex */
public final class f {
    private final C0833a a;
    private final d b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC0836d f10518c;

    /* renamed from: d, reason: collision with root package name */
    private final o f10519d;
    private int h;

    /* renamed from: e, reason: collision with root package name */
    private int f10520e = 0;

    /* renamed from: f, reason: collision with root package name */
    private String f10521f = null;

    /* renamed from: g, reason: collision with root package name */
    private List<Proxy> f10522g = Collections.emptyList();
    private List<InetSocketAddress> i = Collections.emptyList();
    private final List<E> j = new ArrayList();

    public static final class a {
        private final List<E> a;
        private int b = 0;

        /* renamed from: c, reason: collision with root package name */
        private boolean f10523c;

        a(List<E> list) {
            this.f10523c = false;
            this.a = list;
            if (list.size() < okhttp3.G.a.j().g()) {
                ArrayList arrayList = new ArrayList(list);
                list.addAll(arrayList);
                list.addAll(arrayList);
                this.f10523c = true;
            }
            if (list.size() > 1) {
                this.f10523c = true;
            }
        }

        public List<E> a() {
            return new ArrayList(this.a);
        }

        public boolean b() {
            if (this.f10523c && this.b == this.a.size()) {
                this.b = 0;
                this.f10523c = false;
            }
            return this.b < this.a.size();
        }

        public boolean c() {
            return this.f10523c;
        }

        public E d() {
            if (!b()) {
                throw new NoSuchElementException();
            }
            List<E> list = this.a;
            int i = this.b;
            this.b = i + 1;
            return list.get(i);
        }

        public void e(boolean z) {
            this.f10523c = z;
        }
    }

    public f(C0833a c0833a, d dVar, InterfaceC0836d interfaceC0836d, o oVar) {
        this.a = c0833a;
        this.b = dVar;
        this.f10518c = interfaceC0836d;
        this.f10519d = oVar;
        f(c0833a.m(), c0833a.g());
    }

    private boolean c() {
        return this.h < this.f10522g.size();
    }

    private void f(t tVar, Proxy proxy) {
        if (proxy != null) {
            this.f10522g = Collections.singletonList(proxy);
        } else {
            List<Proxy> select = this.a.i().select(tVar.z());
            this.f10522g = (select == null || select.isEmpty()) ? okhttp3.F.c.r(Proxy.NO_PROXY) : okhttp3.F.c.q(select);
        }
        this.h = 0;
    }

    public void a(E e2, IOException iOException) {
        if (e2.c().type() != Proxy.Type.DIRECT && this.a.i() != null) {
            this.a.i().connectFailed(this.a.m().z(), e2.c().address(), iOException);
        }
        this.b.b(e2);
    }

    public boolean b() {
        return c() || !this.j.isEmpty();
    }

    public a d() throws IOException {
        String k;
        int t;
        List<InetAddress> lookup;
        if (!b()) {
            throw new NoSuchElementException();
        }
        ArrayList arrayList = new ArrayList();
        while (c()) {
            if (!c()) {
                StringBuilder M = e.a.a.a.a.M("No route to ");
                M.append(this.a.m().k());
                M.append("; exhausted proxy configurations: ");
                M.append(this.f10522g);
                throw new SocketException(M.toString());
            }
            List<Proxy> list = this.f10522g;
            int i = this.h;
            this.h = i + 1;
            Proxy proxy = list.get(i);
            this.i = new ArrayList();
            if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
                k = this.a.m().k();
                t = this.a.m().t();
            } else {
                SocketAddress address = proxy.address();
                if (!(address instanceof InetSocketAddress)) {
                    StringBuilder M2 = e.a.a.a.a.M("Proxy.address() is not an InetSocketAddress: ");
                    M2.append(address.getClass());
                    throw new IllegalArgumentException(M2.toString());
                }
                InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
                InetAddress address2 = inetSocketAddress.getAddress();
                k = address2 == null ? inetSocketAddress.getHostName() : address2.getHostAddress();
                t = inetSocketAddress.getPort();
            }
            if (t < 1 || t > 65535) {
                throw new SocketException("No route to " + k + Constants.COLON_SEPARATOR + t + "; port is out of range");
            }
            if (proxy.type() == Proxy.Type.SOCKS) {
                this.i.add(InetSocketAddress.createUnresolved(k, t));
            } else {
                this.f10519d.n(this.f10518c, k);
                new ArrayList();
                if (this.a.l() != null) {
                    okhttp3.G.c b = ((h) this.a.l()).b(k, this.f10520e);
                    lookup = b.b();
                    String a2 = b.a();
                    this.f10519d.m(this.f10518c, k, lookup, a2);
                    this.f10521f = a2;
                    if (lookup.isEmpty()) {
                        throw new UnknownHostException(this.a.l() + " returned no addresses for " + k);
                    }
                } else {
                    lookup = this.a.c().lookup(k);
                    this.f10519d.m(this.f10518c, k, lookup, null);
                    if (lookup.isEmpty()) {
                        throw new UnknownHostException(this.a.c() + " returned no addresses for " + k);
                    }
                }
                this.f10519d.l(this.f10518c, k, lookup);
                int size = lookup.size();
                for (int i2 = 0; i2 < size; i2++) {
                    this.i.add(new InetSocketAddress(lookup.get(i2), t));
                }
            }
            int size2 = this.i.size();
            for (int i3 = 0; i3 < size2; i3++) {
                E e2 = new E(this.a, proxy, this.i.get(i3), this.f10521f);
                if (this.b.c(e2)) {
                    this.j.add(e2);
                } else {
                    arrayList.add(e2);
                }
            }
            if (!arrayList.isEmpty()) {
                break;
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.addAll(this.j);
            this.j.clear();
        }
        return new a(arrayList);
    }

    public void e(int i) {
        f(this.a.m(), this.a.g());
        this.i.clear();
        this.j.clear();
        this.f10520e = i;
        this.f10521f = null;
    }
}
