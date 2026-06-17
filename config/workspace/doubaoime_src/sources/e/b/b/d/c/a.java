package e.b.b.d.c;

import android.text.TextUtils;
import com.ss.android.message.log.PushLog;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class a implements e.b.b.k.c {
    private String a;
    private int b;

    /* renamed from: c, reason: collision with root package name */
    private JSONObject f9365c;

    /* renamed from: d, reason: collision with root package name */
    private JSONObject f9366d;

    /* renamed from: e, reason: collision with root package name */
    private JSONObject f9367e;

    /* renamed from: f, reason: collision with root package name */
    private JSONObject f9368f;

    public a(String str, int i, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4) {
        this.a = str;
        this.b = i;
        this.f9365c = jSONObject;
        this.f9366d = jSONObject2;
        this.f9367e = jSONObject3;
        this.f9368f = jSONObject4;
    }

    @Override // e.b.b.k.c
    public String a() {
        return "service_monitor";
    }

    @Override // e.b.b.k.c
    public boolean b() {
        return !TextUtils.isEmpty(this.a);
    }

    @Override // e.b.b.k.c
    public JSONObject c() {
        try {
            JSONObject jSONObject = this.f9368f;
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            jSONObject.put("log_type", "service_monitor");
            jSONObject.put("service", this.a);
            jSONObject.put("status", this.b);
            JSONObject jSONObject2 = this.f9365c;
            if (jSONObject2 != null) {
                jSONObject.put(PushLog.KEY_VALUE, jSONObject2);
            }
            JSONObject jSONObject3 = this.f9366d;
            if (jSONObject3 != null) {
                jSONObject.put(PushLog.KEY_CATEGORY, jSONObject3);
            }
            JSONObject jSONObject4 = this.f9367e;
            if (jSONObject4 != null) {
                jSONObject.put("metric", jSONObject4);
            }
            return jSONObject;
        } catch (Exception e2) {
            if (!e.b.b.n.a.b()) {
                return null;
            }
            e.b.b.n.g.b.g("APM-CommonEvent", "toJsonObject Error.", e2);
            return null;
        }
    }

    public void d() {
        this.f9365c = e.b.b.n.b.h(this.f9365c);
        this.f9366d = e.b.b.n.b.h(this.f9366d);
        this.f9367e = e.b.b.n.b.h(this.f9367e);
        this.f9368f = e.b.b.n.b.h(this.f9368f);
    }

    public String e() {
        return this.a;
    }

    public String toString() {
        return e.a.a.a.a.H(e.a.a.a.a.M("CommonEvent{serviceName='"), this.a, '\'', '}');
    }
}
