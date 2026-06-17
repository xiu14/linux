package e.b.n.a;

import androidx.annotation.Nullable;
import com.bytedance.apm.v.c;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class b implements c {
    private final JSONObject a;
    private final String b;

    public b(JSONObject jSONObject, String str, boolean z, String str2) {
        this.a = jSONObject;
        this.b = str2;
    }

    @Override // com.bytedance.apm.v.c
    public String a() {
        return this.b;
    }

    @Override // com.bytedance.apm.v.c
    public boolean b(JSONObject jSONObject) {
        return "app_launch_trace".equals(null) ? com.bytedance.apm.D.c.b("start_trace") : a.a().b(false, null) != 0;
    }

    @Override // com.bytedance.apm.v.c
    @Nullable
    public JSONObject c() {
        return this.a;
    }

    @Override // com.bytedance.apm.v.c
    public boolean d() {
        return false;
    }

    @Override // com.bytedance.apm.v.c
    public String e() {
        return "tracing";
    }
}
