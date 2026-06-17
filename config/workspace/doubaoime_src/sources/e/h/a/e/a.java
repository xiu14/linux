package e.h.a.e;

import android.text.TextUtils;
import com.bytedance.apm.g;
import com.bytedance.apm.y.d;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class a {
    private String a;
    private String b;

    /* renamed from: c, reason: collision with root package name */
    private String f9946c;

    /* renamed from: d, reason: collision with root package name */
    private JSONObject f9947d;

    public static a a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            a aVar = new a();
            JSONObject jSONObject = new JSONObject(str);
            aVar.f9946c = jSONObject.optString("command_id");
            aVar.b = jSONObject.optString("type");
            String optString = jSONObject.optString(com.heytap.mcssdk.constant.b.D);
            JSONObject jSONObject2 = new JSONObject();
            if (!TextUtils.isEmpty(optString)) {
                jSONObject2 = new JSONObject(optString);
            }
            aVar.a = optString;
            aVar.f9947d = jSONObject2;
            return aVar;
        } catch (Exception e2) {
            if (g.B()) {
                d.f("cloudmessage", e2, "Parse CloudMessage Error.");
            }
            return null;
        }
    }

    public String b() {
        return this.f9946c;
    }

    public String c() {
        return this.a;
    }

    public JSONObject d() {
        return this.f9947d;
    }

    public String e() {
        return this.b;
    }

    public boolean f() {
        return this.f9947d.optBoolean("wifiOnly");
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("CloudMessage{mParams='");
        e.a.a.a.a.G0(M, this.a, '\'', ", mType=");
        M.append(this.b);
        M.append(", send_time=");
        M.append(0L);
        M.append(", command_id='");
        return e.a.a.a.a.H(M, this.f9946c, '\'', '}');
    }
}
