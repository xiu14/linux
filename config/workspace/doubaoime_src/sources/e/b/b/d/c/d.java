package e.b.b.d.c;

import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class d implements e.b.b.k.c {
    private JSONArray a;

    public d(JSONArray jSONArray) {
        this.a = jSONArray;
    }

    @Override // e.b.b.k.c
    public String a() {
        return "tracing";
    }

    @Override // e.b.b.k.c
    public boolean b() {
        return true;
    }

    @Override // e.b.b.k.c
    public final JSONObject c() {
        try {
            JSONObject put = new JSONObject().put("wrapper_array_data", this.a);
            put.put("log_type", "tracing");
            put.put("wrapper_type_description", 1);
            return put;
        } catch (Exception unused) {
            return null;
        }
    }

    public d(JSONObject jSONObject) {
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(jSONObject);
        this.a = jSONArray;
    }
}
