package e.b.b.e.a.j;

import com.ss.android.message.log.PushLog;
import org.json.JSONObject;

/* loaded from: classes.dex */
class d implements e.b.b.k.c {
    final /* synthetic */ JSONObject a;
    final /* synthetic */ JSONObject b;

    d(c cVar, JSONObject jSONObject, JSONObject jSONObject2) {
        this.a = jSONObject;
        this.b = jSONObject2;
    }

    @Override // e.b.b.k.c
    public String a() {
        return "service_monitor";
    }

    @Override // e.b.b.k.c
    public boolean b() {
        return true;
    }

    @Override // e.b.b.k.c
    public JSONObject c() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("log_type", "service_monitor");
            jSONObject.put("service", "apm_error");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("type", "large_data");
            jSONObject2.put("error_service", this.a);
            jSONObject2.put("error_log_type", this.b);
            jSONObject.put(PushLog.KEY_CATEGORY, jSONObject2);
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }
}
