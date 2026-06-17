package e.h.a.f.c;

import org.json.JSONObject;

/* loaded from: classes2.dex */
public class l extends e.h.a.f.a {
    private e.h.a.d.f b;

    @Override // e.h.a.f.a
    public String f() {
        return "patch";
    }

    @Override // e.h.a.f.a
    public boolean g(e.h.a.e.a aVar) throws Exception {
        JSONObject jSONObject = new JSONObject(aVar.c());
        if (this.b == null) {
            return false;
        }
        if (e(jSONObject, aVar)) {
            return true;
        }
        this.b.a(jSONObject.optString("url"), jSONObject.optString("md5"));
        e.h.a.e.c c2 = this.b.c();
        if (c2.d()) {
            j(aVar);
        } else {
            i(c2.b(), c2.c(), aVar);
        }
        return true;
    }
}
