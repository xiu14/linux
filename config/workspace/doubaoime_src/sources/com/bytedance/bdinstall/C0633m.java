package com.bytedance.bdinstall;

import android.accounts.Account;
import android.content.Context;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.bytedance.bdinstall.j0.a;
import com.bytedance.bdinstall.util.DeviceCategory;
import java.util.Map;

/* renamed from: com.bytedance.bdinstall.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0633m {
    Account A;
    F C;
    C D;
    J E;
    boolean F;
    com.bytedance.bdinstall.j0.b G;
    DeviceCategory M;
    com.bytedance.bdinstall.n0.c N;
    TelephonyManager O;
    Y a;
    boolean b;

    /* renamed from: c, reason: collision with root package name */
    D f4056c;

    /* renamed from: d, reason: collision with root package name */
    boolean f4057d;

    /* renamed from: e, reason: collision with root package name */
    boolean f4058e;

    /* renamed from: f, reason: collision with root package name */
    boolean f4059f;

    /* renamed from: g, reason: collision with root package name */
    A f4060g;
    boolean h;
    int i;
    G j;
    Context k;
    String l;
    String m;
    String n;
    String o;
    long p;
    long q;
    long r;
    String s;
    String t;
    String u;
    String v;
    InterfaceC0627g w;
    String x;
    String y;
    Map<String, Object> z;
    boolean B = false;
    com.bytedance.bdinstall.j0.a H = new a.C0155a();
    boolean I = true;

    /* renamed from: J, reason: collision with root package name */
    boolean f4055J = false;
    boolean K = true;
    public boolean L = false;

    public C0633m A(Y y) {
        this.a = null;
        return this;
    }

    public C0633m B(String str) {
        this.v = null;
        return this;
    }

    public C0633m C(J j) {
        this.E = j;
        return this;
    }

    public C0633m D(com.bytedance.bdinstall.n0.c cVar) {
        this.N = null;
        return this;
    }

    public C0633m E(boolean z) {
        this.f4057d = z;
        return this;
    }

    public C0633m F(String str) {
        this.l = str;
        return this;
    }

    public C0633m G(boolean z) {
        this.F = z;
        return this;
    }

    @Deprecated
    public C0633m H(String str) {
        this.u = null;
        return this;
    }

    public C0633m I(long j) {
        this.q = j;
        return this;
    }

    public C0633m J(String str) {
        this.o = str;
        return this;
    }

    public C0633m K(long j) {
        this.p = j;
        return this;
    }

    public C0633m L(String str) {
        this.n = str;
        return this;
    }

    public C0633m M(String str) {
        this.m = null;
        return this;
    }

    public Q a() {
        if (this.k == null || this.i <= 0 || TextUtils.isEmpty(this.t)) {
            StringBuilder M = e.a.a.a.a.M("parameters error:");
            M.append(this.k == null);
            M.append(", ");
            M.append(this.i);
            M.append(", ");
            M.append(this.t);
            throw new IllegalArgumentException(M.toString());
        }
        if (TextUtils.isEmpty(this.s)) {
            throw new IllegalArgumentException("appName is empty");
        }
        int i = C0640u.a;
        if (this.j == null) {
            throw new IllegalArgumentException("please set network client");
        }
        if (this.f4056c == null) {
            throw new IllegalArgumentException("please set event depend");
        }
        if (TextUtils.isEmpty(this.u)) {
            this.u = this.t;
        }
        if (this.O == null) {
            this.O = (TelephonyManager) this.k.getSystemService("phone");
        }
        com.bytedance.bdinstall.util.d.b().f(this.i);
        return new Q(this);
    }

    public C0633m b(boolean z) {
        this.K = z;
        return this;
    }

    public C0633m c(boolean z) {
        this.f4055J = z;
        return this;
    }

    public C0633m d(boolean z) {
        this.I = z;
        return this;
    }

    public C0633m e(boolean z) {
        e0.j(z);
        return this;
    }

    public C0633m f(InterfaceC0627g interfaceC0627g) {
        this.w = interfaceC0627g;
        return this;
    }

    public C0633m g(Account account) {
        this.A = null;
        return this;
    }

    public C0633m h(int i) {
        this.i = i;
        return this;
    }

    public C0633m i(boolean z) {
        this.b = z;
        return this;
    }

    public C0633m j(String str) {
        this.x = null;
        return this;
    }

    public C0633m k(String str) {
        this.s = str;
        return this;
    }

    public C0633m l(String str) {
        this.y = null;
        return this;
    }

    public C0633m m(com.bytedance.bdinstall.j0.b bVar) {
        this.G = null;
        return this;
    }

    public C0633m n(boolean z) {
        this.f4058e = z;
        return this;
    }

    public C0633m o(D d2) {
        this.f4056c = d2;
        return this;
    }

    public C0633m p(String str) {
        this.t = str;
        return this;
    }

    public C0633m q(Context context) {
        this.k = context;
        return this;
    }

    public C0633m r(A a) {
        this.f4060g = a;
        return this;
    }

    public C0633m s(Map<String, Object> map) {
        this.z = null;
        return this;
    }

    public C0633m t(boolean z) {
        this.B = z;
        return this;
    }

    public C0633m u(DeviceCategory deviceCategory) {
        this.M = null;
        return this;
    }

    public C0633m v(boolean z) {
        this.h = z;
        return this;
    }

    public C0633m w(boolean z) {
        this.f4059f = z;
        return this;
    }

    public C0633m x(F f2) {
        this.C = f2;
        return this;
    }

    public C0633m y(long j) {
        this.r = j;
        return this;
    }

    public C0633m z(G g2) {
        this.j = g2;
        return this;
    }
}
