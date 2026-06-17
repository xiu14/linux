package com.bytedance.frameworks.baselib.network.http.ok3.impl;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import okhttp3.B;
import okhttp3.InterfaceC0836d;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.r;
import okhttp3.t;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class i extends okhttp3.o {
    private final k b;

    /* renamed from: c, reason: collision with root package name */
    private final okhttp3.o f5183c;

    public i(okhttp3.o oVar, k kVar) {
        this.f5183c = oVar;
        this.b = kVar;
    }

    @Override // okhttp3.o
    public void a(InterfaceC0836d interfaceC0836d) {
        okhttp3.o oVar = this.f5183c;
        if (oVar != null) {
            oVar.a(interfaceC0836d);
        }
        this.b.b();
    }

    @Override // okhttp3.o
    public void b(InterfaceC0836d interfaceC0836d, IOException iOException) {
        okhttp3.o oVar = this.f5183c;
        if (oVar != null) {
            oVar.b(interfaceC0836d, iOException);
        }
        this.b.c(iOException);
    }

    @Override // okhttp3.o
    public void c(InterfaceC0836d interfaceC0836d, JSONObject jSONObject) {
        okhttp3.o oVar = this.f5183c;
        if (oVar != null) {
            oVar.c(interfaceC0836d, jSONObject);
        }
        com.bytedance.ttnet.k.a k = o.k();
        if (k != null) {
            k.g(jSONObject.toString(), "ttnet_insec_rect");
        }
    }

    @Override // okhttp3.o
    public t d(InterfaceC0836d interfaceC0836d, t tVar, String str, t tVar2) {
        return com.bytedance.frameworks.baselib.network.http.ok3.impl.urldispatcher.l.b.a().b(tVar, tVar2, str, this.b);
    }

    @Override // okhttp3.o
    public void e(InterfaceC0836d interfaceC0836d) {
        okhttp3.o oVar = this.f5183c;
        if (oVar != null) {
            oVar.e(interfaceC0836d);
        }
        this.b.d();
    }

    @Override // okhttp3.o
    public void f(InterfaceC0836d interfaceC0836d, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol) {
        okhttp3.o oVar = this.f5183c;
        if (oVar != null) {
            oVar.f(interfaceC0836d, inetSocketAddress, proxy, protocol);
        }
        this.b.e(proxy);
    }

    @Override // okhttp3.o
    public void g(InterfaceC0836d interfaceC0836d, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol, IOException iOException) {
        okhttp3.o oVar = this.f5183c;
        if (oVar != null) {
            oVar.g(interfaceC0836d, inetSocketAddress, proxy, protocol, iOException);
        }
    }

    @Override // okhttp3.o
    public void h(InterfaceC0836d interfaceC0836d, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol, IOException iOException, String str) {
        okhttp3.o oVar = this.f5183c;
        if (oVar != null) {
            oVar.g(interfaceC0836d, inetSocketAddress, proxy, null, iOException);
        }
        this.b.f(inetSocketAddress, iOException, str);
    }

    @Override // okhttp3.o
    public void i(InterfaceC0836d interfaceC0836d, InetSocketAddress inetSocketAddress, Proxy proxy) {
        okhttp3.o oVar = this.f5183c;
        if (oVar != null) {
            oVar.i(interfaceC0836d, inetSocketAddress, proxy);
        }
        this.b.g();
    }

    @Override // okhttp3.o
    public void j(InterfaceC0836d interfaceC0836d, okhttp3.h hVar) {
        okhttp3.o oVar = this.f5183c;
        if (oVar != null) {
            oVar.j(interfaceC0836d, hVar);
        }
        this.b.h(hVar);
    }

    @Override // okhttp3.o
    public void k(InterfaceC0836d interfaceC0836d, okhttp3.h hVar) {
        okhttp3.o oVar = this.f5183c;
        if (oVar != null) {
            oVar.k(interfaceC0836d, hVar);
        }
    }

    @Override // okhttp3.o
    public void l(InterfaceC0836d interfaceC0836d, String str, List<InetAddress> list) {
        okhttp3.o oVar = this.f5183c;
        if (oVar != null) {
            oVar.l(interfaceC0836d, str, list);
        }
        this.b.m();
    }

    @Override // okhttp3.o
    public void m(InterfaceC0836d interfaceC0836d, String str, List<InetAddress> list, String str2) {
        okhttp3.o oVar = this.f5183c;
        if (oVar != null) {
            oVar.l(interfaceC0836d, str, list);
        }
        this.b.n(str2);
    }

    @Override // okhttp3.o
    public void n(InterfaceC0836d interfaceC0836d, String str) {
        okhttp3.o oVar = this.f5183c;
        if (oVar != null) {
            oVar.n(interfaceC0836d, str);
        }
        this.b.o();
    }

    @Override // okhttp3.o
    public void o(InterfaceC0836d interfaceC0836d, long j) {
        okhttp3.o oVar = this.f5183c;
        if (oVar != null) {
            oVar.o(interfaceC0836d, j);
        }
        this.b.v(j);
    }

    @Override // okhttp3.o
    public void p(InterfaceC0836d interfaceC0836d) {
        okhttp3.o oVar = this.f5183c;
        if (oVar != null) {
            oVar.p(interfaceC0836d);
        }
        this.b.w();
    }

    @Override // okhttp3.o
    public void q(InterfaceC0836d interfaceC0836d, Request request) {
        okhttp3.o oVar = this.f5183c;
        if (oVar != null) {
            oVar.q(interfaceC0836d, request);
        }
        this.b.x(request);
    }

    @Override // okhttp3.o
    public void r(InterfaceC0836d interfaceC0836d) {
        okhttp3.o oVar = this.f5183c;
        if (oVar != null) {
            oVar.r(interfaceC0836d);
        }
        this.b.y();
    }

    @Override // okhttp3.o
    public void s(InterfaceC0836d interfaceC0836d, long j) {
        okhttp3.o oVar = this.f5183c;
        if (oVar != null) {
            oVar.s(interfaceC0836d, j);
        }
        this.b.z(j);
    }

    @Override // okhttp3.o
    public void t(InterfaceC0836d interfaceC0836d) {
        okhttp3.o oVar = this.f5183c;
        if (oVar != null) {
            oVar.t(interfaceC0836d);
        }
        this.b.A();
    }

    @Override // okhttp3.o
    public void u(InterfaceC0836d interfaceC0836d, B b) {
        okhttp3.o oVar = this.f5183c;
        if (oVar != null) {
            oVar.u(interfaceC0836d, b);
        }
        this.b.B(b);
    }

    @Override // okhttp3.o
    public void v(InterfaceC0836d interfaceC0836d) {
        okhttp3.o oVar = this.f5183c;
        if (oVar != null) {
            oVar.v(interfaceC0836d);
        }
        this.b.C();
    }

    @Override // okhttp3.o
    public void w(InterfaceC0836d interfaceC0836d, r rVar) {
        okhttp3.o oVar = this.f5183c;
        if (oVar != null) {
            oVar.w(interfaceC0836d, rVar);
        }
        this.b.D();
    }

    @Override // okhttp3.o
    public void x(InterfaceC0836d interfaceC0836d) {
        okhttp3.o oVar = this.f5183c;
        if (oVar != null) {
            oVar.x(interfaceC0836d);
        }
        this.b.E();
    }
}
