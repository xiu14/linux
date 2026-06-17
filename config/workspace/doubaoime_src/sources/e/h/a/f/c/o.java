package e.h.a.f.c;

import android.text.TextUtils;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class o extends e.h.a.f.a {
    private e.h.a.d.h b = null;

    @Override // e.h.a.f.a
    public String f() {
        return "route";
    }

    @Override // e.h.a.f.a
    public boolean g(e.h.a.e.a aVar) throws Exception {
        String optString = new JSONObject(aVar.c()).optString("schema");
        if (TextUtils.isEmpty(optString)) {
            h("路由scheme为空", aVar);
            return true;
        }
        e.h.a.d.h hVar = this.b;
        if (hVar == null) {
            return false;
        }
        hVar.d(optString);
        e.h.a.e.c c2 = this.b.c();
        if (c2.d()) {
            j(aVar);
        } else {
            i(c2.b(), c2.c(), aVar);
        }
        return true;
    }
}
