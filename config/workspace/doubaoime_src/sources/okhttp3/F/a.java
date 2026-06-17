package okhttp3.F;

import java.io.IOException;
import java.net.Socket;
import javax.net.ssl.SSLSocket;
import okhttp3.B;
import okhttp3.C0833a;
import okhttp3.E;
import okhttp3.F.e.d;
import okhttp3.F.e.g;
import okhttp3.InterfaceC0836d;
import okhttp3.Request;
import okhttp3.i;
import okhttp3.j;
import okhttp3.s;
import okhttp3.x;

/* loaded from: classes2.dex */
public abstract class a {
    public static a a;

    public abstract void a(s.a aVar, String str);

    public abstract void b(s.a aVar, String str, String str2);

    public abstract void c(j jVar, SSLSocket sSLSocket, boolean z);

    public abstract int d(B.a aVar);

    public abstract boolean e(i iVar, okhttp3.F.e.c cVar);

    public abstract Socket f(i iVar, C0833a c0833a, g gVar);

    public abstract boolean g(C0833a c0833a, C0833a c0833a2);

    public abstract okhttp3.F.e.c h(i iVar, C0833a c0833a, g gVar, E e2);

    public abstract InterfaceC0836d i(x xVar, Request request);

    public abstract void j(i iVar, okhttp3.F.e.c cVar);

    public abstract d k(i iVar);

    public abstract g l(InterfaceC0836d interfaceC0836d);

    public abstract IOException m(InterfaceC0836d interfaceC0836d, IOException iOException);
}
