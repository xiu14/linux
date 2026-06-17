package com.bytedance.common.wschannel.channel.c.a.i;

import androidx.annotation.Nullable;
import com.bytedance.common.wschannel.WsConstants;
import com.bytedance.common.wschannel.channel.c.a.i.e;
import com.bytedance.common.wschannel.channel.c.a.i.f;
import com.bytedance.common.wschannel.k;
import f.h;
import f.o;
import f.s;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import okhttp3.B;
import okhttp3.F.e.g;
import okhttp3.InterfaceC0836d;
import okhttp3.InterfaceC0837e;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.x;
import okhttp3.y;

/* loaded from: classes.dex */
public class a implements com.bytedance.common.wschannel.channel.c.a.i.b, e.a {
    private com.bytedance.common.wschannel.channel.c.a.i.c a;
    private final Request b;

    /* renamed from: c, reason: collision with root package name */
    private final Random f4222c;

    /* renamed from: d, reason: collision with root package name */
    private final String f4223d;

    /* renamed from: e, reason: collision with root package name */
    private final Runnable f4224e;
    private final long h;
    private InterfaceC0836d i;
    private com.bytedance.common.wschannel.channel.c.a.i.e j;
    private com.bytedance.common.wschannel.channel.c.a.i.f k;
    private ScheduledExecutorService l;
    private okhttp3.F.l.a m;
    private long n;
    private boolean o;
    private ScheduledFuture<?> p;
    private String r;
    private boolean s;
    private int t;
    private int u;
    private int v;
    private boolean w;

    /* renamed from: f, reason: collision with root package name */
    private final ArrayDeque<h> f4225f = new ArrayDeque<>();

    /* renamed from: g, reason: collision with root package name */
    private final ArrayDeque<Object> f4226g = new ArrayDeque<>();
    private int q = -1;

    /* renamed from: com.bytedance.common.wschannel.channel.c.a.i.a$a, reason: collision with other inner class name */
    class RunnableC0184a implements Runnable {
        RunnableC0184a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            do {
                try {
                } catch (IOException e2) {
                    a.this.g(e2, null);
                    return;
                }
            } while (a.this.u());
        }
    }

    class b implements InterfaceC0837e {
        final /* synthetic */ Request a;

        b(Request request) {
            this.a = request;
        }

        @Override // okhttp3.InterfaceC0837e
        public void onFailure(InterfaceC0836d interfaceC0836d, IOException iOException) {
            a.this.g(iOException, null);
        }

        @Override // okhttp3.InterfaceC0837e
        public void onResponse(InterfaceC0836d interfaceC0836d, B b) {
            try {
                a.this.c(b);
                g l = okhttp3.F.a.a.l(interfaceC0836d);
                l.i();
                okhttp3.F.l.a m = l.d().m(l);
                try {
                    if (a.this.a != null) {
                        a.this.a.f(a.this, b);
                    }
                    a.this.h("OkHttp WebSocket " + this.a.url().w(), m);
                    l.d().o().setSoTimeout(0);
                    a.this.i();
                } catch (Exception e2) {
                    a.this.g(e2, null);
                }
            } catch (ProtocolException e3) {
                a.this.g(e3, b);
                okhttp3.F.c.g(b);
            }
        }
    }

    final class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.b();
        }
    }

    static final class d {
        final int a;
        final h b;

        /* renamed from: c, reason: collision with root package name */
        final long f4227c;

        d(int i, h hVar, long j) {
            this.a = i;
            this.b = hVar;
            this.f4227c = j;
        }
    }

    static final class e {
        final int a;
        final h b;

        e(int i, h hVar) {
            this.a = i;
            this.b = hVar;
        }
    }

    private final class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.v(h.f10045d);
        }
    }

    static {
        Collections.singletonList(Protocol.HTTP_1_1);
    }

    public a(Request request, long j, com.bytedance.common.wschannel.channel.c.a.i.c cVar, Random random) {
        if (!"GET".equals(request.method())) {
            StringBuilder M = e.a.a.a.a.M("Request must be GET: ");
            M.append(request.method());
            throw new IllegalArgumentException(M.toString());
        }
        this.b = request;
        this.a = cVar;
        this.f4222c = random;
        this.h = j;
        byte[] bArr = new byte[16];
        random.nextBytes(bArr);
        this.f4223d = h.l(bArr).a();
        this.f4224e = new RunnableC0184a();
    }

    private void p() {
        ScheduledExecutorService scheduledExecutorService = this.l;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.execute(this.f4224e);
        }
    }

    private synchronized boolean s(h hVar, int i) {
        if (!this.s && !this.o) {
            if (this.n + hVar.f() > 16777216) {
                d(1001, null);
                return false;
            }
            this.n += hVar.f();
            this.f4226g.add(new e(i, hVar));
            p();
            return true;
        }
        return false;
    }

    public void b() {
        ((y) this.i).cancel();
    }

    void c(B b2) throws ProtocolException {
        if (b2.l() != 101) {
            StringBuilder M = e.a.a.a.a.M("Expected HTTP 101 response but was '");
            M.append(b2.l());
            M.append(" ");
            M.append(b2.A());
            M.append("'");
            throw new ProtocolException(M.toString());
        }
        String p = b2.p("Connection");
        if (!"Upgrade".equalsIgnoreCase(p)) {
            throw new ProtocolException(e.a.a.a.a.t("Expected 'Connection' header value 'Upgrade' but was '", p, "'"));
        }
        String p2 = b2.p("Upgrade");
        if (!"websocket".equalsIgnoreCase(p2)) {
            throw new ProtocolException(e.a.a.a.a.t("Expected 'Upgrade' header value 'websocket' but was '", p2, "'"));
        }
        String p3 = b2.p("Sec-WebSocket-Accept");
        String a = h.c(this.f4223d + "258EAFA5-E914-47DA-95CA-C5AB0DC85B11").b("SHA-1").a();
        if (!a.equals(p3)) {
            throw new ProtocolException(e.a.a.a.a.v("Expected 'Sec-WebSocket-Accept' header value '", a, "' but was '", p3, "'"));
        }
    }

    public boolean d(int i, String str) {
        boolean z;
        synchronized (this) {
            String a = com.bytedance.common.wschannel.channel.c.a.i.d.a(i);
            if (a != null) {
                throw new IllegalArgumentException(a);
            }
            h hVar = null;
            if (str != null) {
                hVar = h.c(str);
                if (hVar.f() > 123) {
                    throw new IllegalArgumentException("reason.size() > 123: " + str);
                }
            }
            if (!this.s && !this.o) {
                z = true;
                this.o = true;
                this.f4226g.add(new d(i, hVar, com.heytap.mcssdk.constant.a.f6886d));
                p();
            }
            z = false;
        }
        return z;
    }

    public void e(int i, String str) {
        this.a = null;
        try {
            d(i, str);
        } catch (Throwable unused) {
        }
    }

    public void f(x xVar) {
        Request.a newBuilder = this.b.newBuilder();
        newBuilder.d("Upgrade", "websocket");
        newBuilder.d("Connection", "Upgrade");
        newBuilder.d("Sec-WebSocket-Key", this.f4223d);
        newBuilder.d("Sec-WebSocket-Version", "13");
        Request b2 = newBuilder.b();
        int i = k.f4262d;
        InterfaceC0836d i2 = okhttp3.F.a.a.i(xVar, b2);
        this.i = i2;
        ((y) i2).b(new b(b2));
    }

    public void g(Exception exc, @Nullable B b2) {
        synchronized (this) {
            if (this.s) {
                return;
            }
            this.s = true;
            okhttp3.F.l.a aVar = this.m;
            this.m = null;
            ScheduledFuture<?> scheduledFuture = this.p;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            ScheduledExecutorService scheduledExecutorService = this.l;
            if (scheduledExecutorService != null) {
                scheduledExecutorService.shutdown();
            }
            try {
                com.bytedance.common.wschannel.channel.c.a.i.c cVar = this.a;
                if (cVar != null) {
                    cVar.c(this, exc, b2);
                }
            } finally {
                okhttp3.F.c.g(aVar);
            }
        }
    }

    public void h(String str, okhttp3.F.l.a aVar) throws IOException {
        synchronized (this) {
            this.m = aVar;
            this.k = new com.bytedance.common.wschannel.channel.c.a.i.f(aVar.a, aVar.f10576c, this.f4222c);
            this.l = new ScheduledThreadPoolExecutor(1, okhttp3.F.c.z(str, false));
            if (!this.f4226g.isEmpty()) {
                p();
            }
        }
        this.j = new com.bytedance.common.wschannel.channel.c.a.i.e(aVar.a, aVar.b, this, this.h);
    }

    public void i() throws IOException {
        while (this.q == -1) {
            this.j.a();
        }
    }

    public void j(int i, String str) {
        okhttp3.F.l.a aVar;
        if (i == -1) {
            throw new IllegalArgumentException();
        }
        synchronized (this) {
            if (this.q != -1) {
                throw new IllegalStateException("already closed");
            }
            this.q = i;
            this.r = str;
            aVar = null;
            if (this.o && this.f4226g.isEmpty()) {
                okhttp3.F.l.a aVar2 = this.m;
                this.m = null;
                ScheduledFuture<?> scheduledFuture = this.p;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                this.l.shutdown();
                aVar = aVar2;
            }
        }
        try {
            com.bytedance.common.wschannel.channel.c.a.i.c cVar = this.a;
            if (cVar != null) {
                cVar.b(this, i, str);
                if (aVar != null) {
                    this.a.a(this, i, str);
                }
            }
        } finally {
            okhttp3.F.c.g(aVar);
        }
    }

    public void k(String str) throws IOException {
        com.bytedance.common.wschannel.channel.c.a.i.c cVar = this.a;
        if (cVar != null) {
            cVar.d(this, str);
        }
    }

    public void l(h hVar) throws IOException {
        com.bytedance.common.wschannel.channel.c.a.i.c cVar = this.a;
        if (cVar != null) {
            cVar.e(this, hVar);
        }
    }

    public synchronized void m(h hVar) {
        if (!this.s && (!this.o || !this.f4226g.isEmpty())) {
            this.f4225f.add(hVar);
            p();
            this.u++;
        }
    }

    public synchronized void n(h hVar) {
        this.v++;
        this.w = false;
        com.bytedance.common.wschannel.channel.c.a.i.c cVar = this.a;
        if (cVar != null) {
            cVar.g(this, hVar);
        }
    }

    public Request o() {
        return this.b;
    }

    public boolean q(String str) {
        Objects.requireNonNull(str, "text == null");
        return s(h.c(str), 1);
    }

    public boolean r(h hVar) {
        Objects.requireNonNull(hVar, "bytes == null");
        return s(hVar, 2);
    }

    public void t() {
        ScheduledExecutorService scheduledExecutorService = this.l;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.execute(new f());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v9 */
    boolean u() throws IOException {
        okhttp3.F.l.a aVar;
        String str;
        com.bytedance.common.wschannel.channel.c.a.i.c cVar;
        synchronized (this) {
            if (this.s) {
                return false;
            }
            com.bytedance.common.wschannel.channel.c.a.i.f fVar = this.k;
            h poll = this.f4225f.poll();
            int i = -1;
            e eVar = 0;
            if (poll == null) {
                Object poll2 = this.f4226g.poll();
                if (poll2 instanceof d) {
                    int i2 = this.q;
                    str = this.r;
                    if (i2 != -1) {
                        okhttp3.F.l.a aVar2 = this.m;
                        this.m = null;
                        this.l.shutdown();
                        eVar = poll2;
                        aVar = aVar2;
                        i = i2;
                    } else {
                        this.p = this.l.schedule(new c(), ((d) poll2).f4227c, TimeUnit.MILLISECONDS);
                        i = i2;
                        aVar = null;
                        eVar = poll2;
                    }
                } else {
                    if (poll2 == null) {
                        return false;
                    }
                    str = null;
                    eVar = poll2;
                    aVar = null;
                }
            } else {
                aVar = null;
                str = null;
            }
            try {
                if (poll != null) {
                    fVar.e(poll);
                } else if (eVar instanceof e) {
                    h hVar = eVar.b;
                    int i3 = eVar.a;
                    long f2 = hVar.f();
                    if (fVar.h) {
                        throw new IllegalStateException("Another message writer is active. Did you call close()?");
                    }
                    fVar.h = true;
                    f.a aVar3 = fVar.f4237g;
                    aVar3.a = i3;
                    aVar3.b = f2;
                    aVar3.f4238c = true;
                    aVar3.f4239d = false;
                    s sVar = (s) o.a(aVar3);
                    sVar.Z(hVar);
                    sVar.close();
                    synchronized (this) {
                        this.n -= hVar.f();
                    }
                } else {
                    if (!(eVar instanceof d)) {
                        throw new AssertionError();
                    }
                    d dVar = (d) eVar;
                    fVar.a(dVar.a, dVar.b);
                    if (aVar != null && (cVar = this.a) != null) {
                        cVar.a(this, i, str);
                    }
                }
                return true;
            } finally {
                okhttp3.F.c.g(aVar);
            }
        }
    }

    void v(h hVar) {
        synchronized (this) {
            if (this.s) {
                return;
            }
            com.bytedance.common.wschannel.channel.c.a.i.f fVar = this.k;
            int i = this.w ? this.t : -1;
            this.t++;
            this.w = true;
            if (i != -1) {
                g(new SocketTimeoutException(WsConstants.PING_NOT_RECEIVE_PONG_MSG), null);
            } else if (fVar != null) {
                try {
                    fVar.d(hVar);
                } catch (IOException e2) {
                    g(e2, null);
                }
            }
        }
    }
}
