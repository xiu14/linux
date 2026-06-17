package com.bytedance.push;

import android.app.Application;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.bytedance.android.service.manager.pull.PullConfiguration;
import com.bytedance.push.interfaze.C;
import com.bytedance.push.interfaze.InterfaceC0686a;
import com.bytedance.push.interfaze.InterfaceC0687b;
import com.bytedance.push.interfaze.InterfaceC0688c;
import com.bytedance.push.interfaze.InterfaceC0689d;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;

/* renamed from: com.bytedance.push.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C0679c {
    private static C0679c P;
    public final com.bytedance.push.interfaze.y A;
    public final boolean B;
    private final boolean C;
    public final com.bytedance.push.notification.b D;
    public final int[] E;
    public boolean F = true;
    public boolean G;
    public String H;
    private final com.bytedance.push.interfaze.p I;

    /* renamed from: J, reason: collision with root package name */
    public final boolean f5617J;
    public final boolean K;
    public final boolean L;
    private final com.bytedance.common.push.e.g M;
    private final com.bytedance.common.model.a N;
    private volatile com.bytedance.common.model.c O;
    public final Application a;
    public final int b;

    /* renamed from: c, reason: collision with root package name */
    public final int f5618c;

    /* renamed from: d, reason: collision with root package name */
    public final int f5619d;

    /* renamed from: e, reason: collision with root package name */
    public final String f5620e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f5621f;

    /* renamed from: g, reason: collision with root package name */
    public final int f5622g;
    public final String h;
    public final String i;
    public final String j;
    public final C0293c k;
    public final List<com.ss.android.message.b> l;
    public final com.bytedance.push.interfaze.e m;
    public final com.bytedance.push.notification.q n;
    public final String o;
    public final com.ss.android.g.c p;
    public final InterfaceC0688c q;
    public final InterfaceC0687b r;
    public final com.bytedance.push.interfaze.z s;
    public final com.bytedance.push.monitor.c t;
    public final boolean u;
    public final com.bytedance.common.push.e.a v;
    public final com.bytedance.push.monitor.m.a w;
    public final boolean x;
    public final long y;
    public final com.bytedance.push.interfaze.q z;

    /* renamed from: com.bytedance.push.c$b */
    public static class b {
        private com.bytedance.push.interfaze.m A;
        private InterfaceC0689d B;
        private com.bytedance.push.interfaze.q C;
        private com.bytedance.push.interfaze.y D;
        private com.bytedance.push.Z.a E;
        private int[] F;
        private com.bytedance.push.interfaze.p G;
        private boolean H;

        /* renamed from: J, reason: collision with root package name */
        private String f5623J;
        private boolean K;
        private com.bytedance.common.push.e.g O;
        private com.bytedance.common.model.a P;
        private final Application a;
        private boolean b;

        /* renamed from: d, reason: collision with root package name */
        private String f5625d;

        /* renamed from: e, reason: collision with root package name */
        private C0293c f5626e;

        /* renamed from: g, reason: collision with root package name */
        private com.bytedance.push.interfaze.e f5628g;
        private final String h;
        private com.bytedance.push.interfaze.D i;
        private InterfaceC0686a j;
        private boolean k;
        private com.ss.android.g.c l;
        private InterfaceC0688c m;
        private InterfaceC0687b n;
        private com.bytedance.push.O.a o;
        private com.bytedance.push.interfaze.z p;
        private com.bytedance.push.monitor.c q;
        private com.bytedance.push.interfaze.C r;
        private final C0677a s;
        private String t;
        private String u;
        private boolean v;
        private com.bytedance.common.push.e.a w;
        private com.bytedance.push.monitor.m.a x;
        private boolean y;

        /* renamed from: c, reason: collision with root package name */
        private int f5624c = 3;

        /* renamed from: f, reason: collision with root package name */
        private List<com.ss.android.message.b> f5627f = new ArrayList();
        private long z = TimeUnit.MINUTES.toMillis(2);
        private boolean I = true;
        private boolean L = false;
        private boolean M = false;
        private boolean N = true;

        public b(@NonNull Application application, C0677a c0677a, @NonNull String str) {
            this.a = application;
            this.s = c0677a;
            this.h = str;
        }

        private void D(String str) {
            if (this.b) {
                throw new IllegalArgumentException(str);
            }
            com.bytedance.push.g0.f.e("init", str);
        }

        public b A(String str) {
            this.f5623J = str;
            return this;
        }

        public b B(List<com.ss.android.message.b> list) {
            if (list != null) {
                this.f5627f = list;
            }
            return this;
        }

        public b C(com.bytedance.push.interfaze.m mVar) {
            this.A = mVar;
            return this;
        }

        public b E(com.bytedance.common.push.e.a aVar) {
            this.w = aVar;
            return this;
        }

        public b F(String str) {
            this.u = str;
            return this;
        }

        public b G(boolean z) {
            this.b = z;
            return this;
        }

        public b H(String str) {
            this.f5626e = new C0293c(PullConfiguration.PROCESS_NAME_PUSH, str);
            return this;
        }

        public b I(boolean z) {
            this.K = z;
            return this;
        }

        public b J(InterfaceC0688c interfaceC0688c) {
            this.m = interfaceC0688c;
            return this;
        }

        public b K(String str) {
            this.t = str;
            return this;
        }

        public b L(com.bytedance.push.interfaze.D d2) {
            this.i = d2;
            return this;
        }

        public b M(InterfaceC0686a interfaceC0686a) {
            this.j = interfaceC0686a;
            return this;
        }

        public b N(InterfaceC0687b interfaceC0687b) {
            this.n = interfaceC0687b;
            return this;
        }

        public b O(com.bytedance.push.O.a aVar) {
            this.o = aVar;
            return this;
        }

        public b P(boolean z) {
            this.H = z;
            return this;
        }

        public b Q(boolean z) {
            this.M = z;
            return this;
        }

        public b R(int i) {
            this.f5624c = i;
            return this;
        }

        public b S(com.bytedance.push.monitor.c cVar) {
            this.q = cVar;
            return this;
        }

        public b T(int[] iArr) {
            this.F = iArr;
            return this;
        }

        public b U(com.bytedance.push.monitor.m.a aVar) {
            this.x = aVar;
            return this;
        }

        public b V(String str) {
            this.f5625d = str;
            return this;
        }

        public b W(com.bytedance.push.interfaze.z zVar) {
            this.p = zVar;
            return this;
        }

        public b X(com.bytedance.push.interfaze.e eVar) {
            this.f5628g = eVar;
            return this;
        }

        public b Y(com.ss.android.g.c cVar) {
            this.l = cVar;
            return this;
        }

        @Deprecated
        public b Z(com.bytedance.push.interfaze.A a) {
            this.B = a;
            this.A = a;
            return this;
        }

        public b a0(com.bytedance.push.interfaze.p pVar) {
            this.G = pVar;
            return this;
        }

        public b b0(com.bytedance.push.interfaze.C c2) {
            this.r = c2;
            return this;
        }

        public b c0(com.bytedance.push.Z.a aVar) {
            this.E = aVar;
            return this;
        }

        public C0679c n() {
            C0677a c0677a = this.s;
            if (c0677a == null) {
                D("appinfo is null");
            } else {
                if (c0677a.a() <= 0) {
                    StringBuilder M = e.a.a.a.a.M(" aid {");
                    M.append(c0677a.a());
                    M.append("} is invalid");
                    D(M.toString());
                }
                if (TextUtils.isEmpty(c0677a.b())) {
                    StringBuilder M2 = e.a.a.a.a.M("appName {");
                    M2.append(c0677a.b());
                    M2.append("} is invalid");
                    D(M2.toString());
                }
                if (TextUtils.isEmpty(c0677a.f())) {
                    StringBuilder M3 = e.a.a.a.a.M("versionName {");
                    M3.append(c0677a.f());
                    M3.append("} is invalid");
                    D(M3.toString());
                }
                if (c0677a.e() <= 0) {
                    StringBuilder M4 = e.a.a.a.a.M("versionCode {");
                    M4.append(c0677a.e());
                    M4.append("} is invalid");
                    D(M4.toString());
                }
                if (c0677a.d() <= 0) {
                    StringBuilder M5 = e.a.a.a.a.M("updateVersionCode {");
                    M5.append(c0677a.d());
                    M5.append("} is invalid");
                    D(M5.toString());
                }
                if (TextUtils.isEmpty(c0677a.c())) {
                    StringBuilder M6 = e.a.a.a.a.M("channel {");
                    M6.append(c0677a.c());
                    M6.append("} is invalid");
                    D(M6.toString());
                }
            }
            if (TextUtils.isEmpty(this.h)) {
                D("please set none empty host in builder constructor");
            }
            if (!this.H && !this.h.startsWith("https:")) {
                D("please set https host in builder constructor");
            }
            if (this.f5628g == null) {
                D("please implement the event callback");
            }
            if (this.p == null) {
                D("click event listener is null, you'll not receive the event when user click notifications.Please implement it.");
            }
            if (TextUtils.isEmpty(this.f5625d)) {
                this.f5625d = com.ss.android.message.f.a.h(this.a);
            }
            if (this.l == null) {
                C0680d c0680d = new C0680d(this.k, this.s.c());
                this.l = c0680d;
                if (this.b) {
                    c0680d.a(this.a);
                }
            }
            if (this.o == null) {
                this.o = new com.bytedance.push.O.d();
            }
            if (this.r == null) {
                this.r = new C.a();
            }
            if (this.w == null) {
                this.w = new com.bytedance.common.push.f.a();
            }
            com.bytedance.push.notification.q qVar = new com.bytedance.push.notification.q(this.B, this.A, this.o);
            if (this.E == null) {
                this.E = new com.bytedance.push.Z.b();
            }
            com.bytedance.push.notification.b bVar = new com.bytedance.push.notification.b(this.E);
            StringBuilder M7 = e.a.a.a.a.M("debuggable = ");
            M7.append(this.b);
            com.bytedance.push.g0.f.g("init", M7.toString());
            if (this.b) {
                C0677a c0677a2 = this.s;
                com.bytedance.push.g0.f.c("init", c0677a2 == null ? "" : c0677a2.toString());
                StringBuilder sb = new StringBuilder();
                sb.append("process:\t");
                e.a.a.a.a.J0(sb, this.f5625d, "init");
            }
            if (this.k && this.n == null && this.b) {
                throw new IllegalArgumentException("please set mI18nCommonParams with com.bytedance.push.Configuration.Builder.withI18nCommonParams function");
            }
            if (this.O == null) {
                this.O = new C0681e();
            }
            return new C0679c(this.a, this.s, this.b, this.f5624c, this.f5625d, this.f5626e, this.f5627f, this.f5628g, qVar, this.h, this.i, this.j, this.l, this.m, this.n, this.p, this.q, this.r, this.t, this.v, this.w, this.x, bVar, this.F, this.G, this.u, this, null);
        }

        public b o(long j) {
            if (j > 0) {
                this.z = j;
            }
            return this;
        }

        public b p(boolean z) {
            this.I = z;
            return this;
        }

        public b q(boolean z) {
            this.y = z;
            return this;
        }

        public b r(boolean z) {
            this.k = z;
            return this;
        }

        public b s(boolean z) {
            this.N = z;
            return this;
        }

        public b t(boolean z) {
            this.L = z;
            return this;
        }

        public b u(com.bytedance.common.model.a aVar) {
            this.P = aVar;
            return this;
        }

        public b v(InterfaceC0689d interfaceC0689d) {
            this.B = interfaceC0689d;
            return this;
        }

        public b w(com.bytedance.common.push.e.g gVar) {
            this.O = gVar;
            return this;
        }

        public b x(com.bytedance.push.interfaze.q qVar) {
            this.C = qVar;
            return this;
        }

        public b y(com.bytedance.push.interfaze.y yVar) {
            this.D = yVar;
            return this;
        }

        public b z(boolean z) {
            this.v = z;
            return this;
        }
    }

    /* renamed from: com.bytedance.push.c$c, reason: collision with other inner class name */
    public static class C0293c {
        public String a;
        public String b;

        public C0293c(String str, String str2) {
            this.a = str2;
            this.b = str;
        }
    }

    C0679c(Application application, C0677a c0677a, boolean z, int i, String str, C0293c c0293c, List list, com.bytedance.push.interfaze.e eVar, com.bytedance.push.notification.q qVar, String str2, com.bytedance.push.interfaze.D d2, InterfaceC0686a interfaceC0686a, com.ss.android.g.c cVar, InterfaceC0688c interfaceC0688c, InterfaceC0687b interfaceC0687b, com.bytedance.push.interfaze.z zVar, com.bytedance.push.monitor.c cVar2, com.bytedance.push.interfaze.C c2, String str3, boolean z2, com.bytedance.common.push.e.a aVar, com.bytedance.push.monitor.m.a aVar2, com.bytedance.push.notification.b bVar, int[] iArr, com.bytedance.push.interfaze.p pVar, String str4, b bVar2, a aVar3) {
        this.a = application;
        this.b = c0677a.a();
        this.f5618c = c0677a.e();
        this.f5619d = c0677a.d();
        this.f5620e = c0677a.f();
        this.h = c0677a.c();
        this.j = c0677a.b();
        this.f5621f = z;
        this.f5622g = i;
        this.i = str;
        this.k = c0293c;
        this.l = new CopyOnWriteArrayList(list);
        this.m = eVar;
        this.n = qVar;
        this.o = str2;
        this.p = cVar;
        this.q = interfaceC0688c;
        this.r = interfaceC0687b;
        this.s = zVar;
        this.t = cVar2;
        this.u = z2;
        this.v = aVar;
        this.w = aVar2;
        this.x = bVar2.y;
        this.y = bVar2.z;
        this.z = bVar2.C;
        this.A = bVar2.D;
        this.D = bVar;
        this.E = iArr;
        this.I = pVar;
        this.G = bVar2.I;
        this.H = bVar2.f5623J;
        this.B = bVar2.K;
        this.f5617J = bVar2.L;
        this.K = bVar2.M;
        this.M = bVar2.O;
        this.L = bVar2.N;
        this.C = bVar2.H;
        this.N = bVar2.P;
    }

    public static C0679c a() {
        return P;
    }

    public static void d(C0679c c0679c) {
        P = c0679c;
    }

    public com.bytedance.common.model.c b() {
        if (this.O == null) {
            synchronized (this) {
                if (this.O == null) {
                    this.O = new com.bytedance.common.model.c();
                    this.O.a = this.a;
                    this.O.b = this.b;
                    this.O.f4151c = this.o;
                    this.O.f4152d = this.f5618c;
                    this.O.f4153e = this.f5619d;
                    this.O.f4154f = this.f5620e;
                    this.O.f4155g = this.j;
                    this.O.h = this.h;
                    this.O.i = this.q;
                    this.O.j = this.r;
                    Objects.requireNonNull(this.O);
                    this.O.k = this.f5621f;
                    this.O.l = this.m;
                    this.O.m = this.K;
                    Objects.requireNonNull(this.O);
                    Objects.requireNonNull(this.O);
                    this.O.o = this.M;
                    Objects.requireNonNull(this.O);
                    this.O.n = this.N;
                    com.bytedance.common.model.c cVar = this.O;
                    String.valueOf(this.b);
                    Objects.requireNonNull(cVar);
                    this.O.p = this.i;
                    Objects.requireNonNull(this.O);
                    Objects.requireNonNull(this.O);
                }
            }
        }
        return this.O;
    }

    public com.bytedance.push.interfaze.p c() {
        return this.I;
    }
}
