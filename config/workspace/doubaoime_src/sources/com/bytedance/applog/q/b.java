package com.bytedance.applog.q;

import com.bytedance.bdinstall.Level;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
class b extends a {

    /* renamed from: f, reason: collision with root package name */
    private static final List<String> f3873f = Collections.singletonList("Configer");

    b(c cVar) {
        super(cVar, cVar.k().i());
    }

    @Override // com.bytedance.applog.q.a
    public boolean c(int i) throws JSONException {
        d().I().n(f3873f, "configer start doWork curTs = {}", Long.valueOf(System.currentTimeMillis()));
        com.bytedance.applog.x.c n = this.a.n();
        if (n.k()) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("magic_tag", "ss_app_log");
            jSONObject.put("header", n.c());
            jSONObject.put("_gen_time", System.currentTimeMillis());
            JSONObject jSONObject2 = new JSONObject();
            if (d().e0()) {
                jSONObject2.put("params_block_enable", 1);
            }
            if (d().Y()) {
                jSONObject2.put("header_custom_allow_enable", 1);
            }
            if (jSONObject2.length() > 0) {
                jSONObject.put("options", jSONObject2);
            }
            d().i().d(jSONObject, false);
            JSONObject b = d().i().b(com.bytedance.applog.A.a.e(d().b(this.a.l(), this.a.s().e(), true, Level.L1), com.bytedance.applog.util.e.f3899e), jSONObject);
            com.bytedance.applog.x.b k = this.a.k();
            if (d().q() != null) {
                d().q().c(!((b == null || k.g() == null) ? Objects.equals(b, r4) : b.toString().equals(r4.toString())), b);
            }
            if (b != null) {
                k.N(b);
                Objects.requireNonNull(this.a.k().r());
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.applog.q.a
    protected String e() {
        return "configer";
    }

    @Override // com.bytedance.applog.q.a
    protected long[] f() {
        return a.f3870e;
    }

    @Override // com.bytedance.applog.q.a
    protected boolean g() {
        return true;
    }

    @Override // com.bytedance.applog.q.a
    protected long h() {
        return this.a.k().h();
    }
}
