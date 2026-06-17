package e.b.b.d.c;

import android.text.TextUtils;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class c implements e.b.b.k.c {
    private String a;
    private JSONObject b;

    public c(String str, JSONObject jSONObject) {
        this.a = str;
        this.b = jSONObject;
    }

    @Override // e.b.b.k.c
    public String a() {
        return this.a;
    }

    @Override // e.b.b.k.c
    public boolean b() {
        return !TextUtils.isEmpty(this.a);
    }

    @Override // e.b.b.k.c
    public JSONObject c() {
        try {
            JSONObject jSONObject = this.b;
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            jSONObject.put("log_type", this.a);
            return jSONObject;
        } catch (Exception e2) {
            if (!e.b.b.n.a.b()) {
                return null;
            }
            e.b.b.n.g.b.g("APM-CommonEvent", "toJsonObject Error.", e2);
            return null;
        }
    }

    public JSONObject d() {
        return this.b;
    }

    public String toString() {
        return e.a.a.a.a.H(e.a.a.a.a.M("Apm5LegacyEvent{logType='"), this.a, '\'', '}');
    }
}
