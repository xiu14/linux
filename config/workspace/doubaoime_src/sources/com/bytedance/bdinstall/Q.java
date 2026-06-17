package com.bytedance.bdinstall;

import android.accounts.Account;
import android.content.Context;
import android.content.SharedPreferences;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.bytedance.bdinstall.C;
import com.bytedance.bdinstall.util.DeviceCategory;
import com.huawei.hms.framework.common.BundleUtil;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class Q {
    private final boolean A;
    private final boolean B;
    private final boolean C;
    private final D D;
    private final boolean E;
    private final Y F;
    private final boolean G;
    private final boolean H;
    private final boolean I;

    /* renamed from: J, reason: collision with root package name */
    private final boolean f3953J;
    private final DeviceCategory K;
    private final com.bytedance.bdinstall.n0.c L;
    private final com.bytedance.bdinstall.n0.c M;
    TelephonyManager N;
    boolean O;
    private SharedPreferences P = null;
    private final int a;
    private final G b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f3954c;

    /* renamed from: d, reason: collision with root package name */
    private final String f3955d;

    /* renamed from: e, reason: collision with root package name */
    private final String f3956e;

    /* renamed from: f, reason: collision with root package name */
    private final String f3957f;

    /* renamed from: g, reason: collision with root package name */
    private final String f3958g;
    private final String h;
    private final String i;
    private final InterfaceC0627g j;
    private final String k;
    private final String l;
    private final Map<String, Object> m;
    private final boolean n;
    private final C0628h o;
    private final boolean p;
    private final C q;
    private final J r;
    private final boolean s;
    private final com.bytedance.bdinstall.j0.b t;
    private final com.bytedance.bdinstall.j0.a u;
    private final boolean v;
    private final boolean w;
    private Account x;
    private final A y;
    private final boolean z;

    Q(C0633m c0633m) {
        this.f3954c = c0633m.k;
        this.a = c0633m.i;
        G g2 = c0633m.j;
        this.b = g2 == null ? new C0637q() : g2;
        this.f3955d = TextUtils.isEmpty(c0633m.l) ? "applog_stats" : c0633m.l;
        this.f3956e = c0633m.m;
        this.f3957f = c0633m.s;
        this.f3958g = c0633m.t;
        this.h = c0633m.u;
        this.i = c0633m.v;
        this.j = c0633m.w;
        this.k = c0633m.x;
        this.l = c0633m.y;
        this.m = c0633m.z;
        this.y = c0633m.f4060g;
        this.z = c0633m.h;
        this.A = c0633m.f4059f;
        this.n = c0633m.f4058e;
        this.B = c0633m.f4057d;
        this.C = true;
        this.D = c0633m.f4056c;
        this.E = c0633m.b;
        this.F = c0633m.a;
        this.o = new C0628h(c0633m);
        this.x = c0633m.A;
        this.p = c0633m.B;
        C c2 = c0633m.D;
        this.q = c2 == null ? new C.a() : c2;
        this.r = c0633m.E;
        this.s = c0633m.F;
        this.t = c0633m.G;
        this.G = true;
        this.u = c0633m.H;
        this.v = c0633m.I;
        this.w = c0633m.f4055J;
        this.H = c0633m.K;
        this.I = true;
        this.f3953J = c0633m.L;
        this.K = c0633m.M;
        com.bytedance.bdinstall.n0.c cVar = c0633m.N;
        this.L = cVar;
        this.N = c0633m.O;
        if (cVar != null) {
            this.M = cVar;
            cVar.k(this);
        } else {
            com.bytedance.bdinstall.n0.c cVar2 = new com.bytedance.bdinstall.n0.c();
            this.M = cVar2;
            cVar2.k(this);
        }
    }

    public SharedPreferences A() {
        String str;
        if (this.P == null) {
            if (this.O) {
                str = this.f3955d;
            } else {
                str = this.f3955d + BundleUtil.UNDERLINE_TAG + this.a;
            }
            this.P = this.f3954c.getSharedPreferences(str, 0);
        }
        return this.P;
    }

    public J B() {
        return this.r;
    }

    public TelephonyManager C() {
        return this.N;
    }

    public String D() {
        return this.h;
    }

    public long E() {
        return this.o.c();
    }

    public String F() {
        if (TextUtils.isEmpty(null)) {
            return com.bytedance.bdinstall.util.g.d(this.f3954c, this).getString("user_agent", null);
        }
        return null;
    }

    public String G() {
        return this.o.d();
    }

    public long H() {
        return this.o.e();
    }

    public String I() {
        return this.o.f();
    }

    public String J() {
        return this.f3956e;
    }

    public boolean K() {
        return this.E;
    }

    public boolean L() {
        return this.n;
    }

    public boolean M() {
        return this.H;
    }

    public boolean N() {
        return this.w;
    }

    public boolean O() {
        return this.I;
    }

    public boolean P() {
        return this.f3953J;
    }

    public boolean Q() {
        return this.A;
    }

    public boolean R() {
        return this.O;
    }

    public boolean S() {
        return this.B;
    }

    public boolean T() {
        return this.s;
    }

    public boolean U() {
        return this.C;
    }

    public boolean a() {
        return this.G;
    }

    public boolean b() {
        return this.v;
    }

    public boolean c() {
        if (this.p) {
            return this.z;
        }
        return true;
    }

    public InterfaceC0627g d() {
        return this.j;
    }

    public String e() {
        InterfaceC0627g interfaceC0627g = this.j;
        if (interfaceC0627g != null) {
            return interfaceC0627g.getAbVersion();
        }
        return null;
    }

    public Account f() {
        return this.x;
    }

    public com.bytedance.bdinstall.j0.a g() {
        return this.u;
    }

    public int h() {
        return this.a;
    }

    public String i() {
        return String.valueOf(this.a);
    }

    public String j() {
        return !TextUtils.isEmpty(this.k) ? this.k : com.bytedance.bdinstall.util.g.d(this.f3954c, this).getString("app_language", null);
    }

    public String k() {
        return this.f3957f;
    }

    public String l() {
        return !TextUtils.isEmpty(this.l) ? this.l : com.bytedance.bdinstall.util.g.d(this.f3954c, this).getString("app_region", null);
    }

    public JSONObject m() {
        String string = com.bytedance.bdinstall.util.g.d(this.f3954c, this).getString("app_track", null);
        if (string != null) {
            try {
                return new JSONObject(string);
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    public com.bytedance.bdinstall.j0.b n() {
        return this.t;
    }

    public String o() {
        return this.f3958g;
    }

    public Map<String, Object> p() {
        return this.m;
    }

    public Context q() {
        return this.f3954c;
    }

    public Map<String, Object> r() {
        A a = this.y;
        if (a != null) {
            return a.a();
        }
        return null;
    }

    public String s() {
        DeviceCategory deviceCategory = this.K;
        if (deviceCategory != null) {
            return deviceCategory.getLower();
        }
        return null;
    }

    C t() {
        return this.q;
    }

    public D u() {
        return this.D;
    }

    public long v() {
        return this.o.b();
    }

    public G w() {
        return this.b;
    }

    public Y x() {
        return this.F;
    }

    public String y() {
        return this.i;
    }

    public com.bytedance.bdinstall.n0.c z() {
        return this.M;
    }
}
