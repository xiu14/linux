package com.bytedance.bdinstall;

import android.content.Context;
import com.bytedance.bdinstall.W;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
final class X implements com.bytedance.bdinstall.o0.b, W.b {
    private P a;
    private com.bytedance.bdinstall.g0.c b;

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC0645z f3965c;

    X(InterfaceC0645z interfaceC0645z) {
        this.f3965c = interfaceC0645z;
        int i = C0640u.a;
    }

    @Override // com.bytedance.bdinstall.o0.b
    public void a(C0641v c0641v) {
    }

    @Override // com.bytedance.bdinstall.o0.b
    public void b(Context context, Map<String, Object> map) {
    }

    @Override // com.bytedance.bdinstall.o0.b
    public boolean c() {
        return false;
    }

    @Override // com.bytedance.bdinstall.o0.b
    public void d(Context context, Map<String, String> map, boolean z, boolean z2) {
    }

    @Override // com.bytedance.bdinstall.o0.b
    public void e(P p) {
        this.a = p;
    }

    @Override // com.bytedance.bdinstall.o0.b
    public P f() {
        P p = this.a;
        if (p == null) {
            return null;
        }
        return p.a();
    }

    @Override // com.bytedance.bdinstall.o0.b
    public void g(Context context, C0641v c0641v, long j, V v) {
    }

    @Override // com.bytedance.bdinstall.o0.b
    public String getDid() {
        P p = this.a;
        if (p == null) {
            return null;
        }
        return p.c();
    }

    @Override // com.bytedance.bdinstall.o0.b
    public boolean h(JSONObject jSONObject) {
        return false;
    }

    @Override // com.bytedance.bdinstall.o0.b
    public void i(Q q, C0641v c0641v) {
        W w = new W(q.q());
        w.c(q);
        w.d(q.q(), this);
        C0635o.c(q);
        com.bytedance.bdinstall.o0.d.b(InterfaceC0638s.class, new C0636p(q), String.valueOf(q.h()));
    }

    public void j(P p, String str) {
        String str2 = "install info changed : " + p;
        int i = C0640u.a;
        ((C0632l) this.f3965c).t(p);
        com.bytedance.bdinstall.g0.c cVar = this.b;
        if (cVar != null) {
            cVar.b(new com.bytedance.bdinstall.g0.i.b(p));
        }
    }

    public void k(com.bytedance.bdinstall.g0.c cVar) {
        this.b = cVar;
    }

    @Override // com.bytedance.bdinstall.o0.b
    public void start() {
    }
}
