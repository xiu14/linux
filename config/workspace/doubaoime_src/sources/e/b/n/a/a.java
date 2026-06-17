package e.b.n.a;

import com.bytedance.news.common.service.manager.c;
import com.bytedance.services.slardar.config.IConfigManager;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class a implements com.bytedance.services.slardar.config.a {

    /* renamed from: e, reason: collision with root package name */
    private static volatile a f9697e;
    private boolean a;
    private boolean b = true;

    /* renamed from: c, reason: collision with root package name */
    private JSONObject f9698c;

    /* renamed from: d, reason: collision with root package name */
    private JSONObject f9699d;

    private a() {
    }

    public static a a() {
        if (f9697e == null) {
            synchronized (a.class) {
                if (f9697e == null) {
                    f9697e = new a();
                    ((IConfigManager) c.a(IConfigManager.class)).registerConfigListener(f9697e);
                }
            }
        }
        return f9697e;
    }

    public int b(boolean z, String str) {
        JSONObject jSONObject;
        int i = 0;
        if (!this.b) {
            return 0;
        }
        if (z && ((jSONObject = this.f9699d) == null || jSONObject.optDouble(null, -1.0d) > 0.0d)) {
            i = 16;
        }
        JSONObject jSONObject2 = this.f9698c;
        return (jSONObject2 == null || jSONObject2.optDouble(null, -1.0d) <= 0.0d) ? i : i | 1;
    }

    @Override // com.bytedance.services.slardar.config.a
    public void onReady() {
    }

    @Override // com.bytedance.services.slardar.config.a
    public void onRefresh(JSONObject jSONObject, boolean z) {
        JSONObject optJSONObject;
        this.b = (jSONObject == null || (optJSONObject = jSONObject.optJSONObject("tracing")) == null) ? true : optJSONObject.optBoolean("enable_open", true);
        if (this.a) {
            return;
        }
        this.f9698c = com.bytedance.android.input.k.b.a.r0(jSONObject, "tracing", "allow_service_list");
        this.f9699d = com.bytedance.android.input.k.b.a.r0(jSONObject, "tracing", "allow_error_list");
        this.a = true;
    }
}
