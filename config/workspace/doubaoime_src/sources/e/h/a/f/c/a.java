package e.h.a.f.c;

import android.text.TextUtils;
import com.ss.android.message.log.PushLog;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class a extends e.h.a.f.a {
    private e.h.a.d.a b;

    @Override // e.h.a.f.a
    public String f() {
        return "abtest";
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
        String optString = jSONObject.optString("field");
        if (TextUtils.isEmpty(optString)) {
            return false;
        }
        Object obj = jSONObject.get(PushLog.KEY_VALUE);
        this.b.h(optString, obj);
        if (this.b.g()) {
            this.b.i(jSONObject.optString("spKey"), obj);
        }
        e.h.a.e.c c2 = this.b.c();
        if (c2.d()) {
            j(aVar);
        } else {
            i(c2.b(), c2.c(), aVar);
        }
        return true;
    }
}
