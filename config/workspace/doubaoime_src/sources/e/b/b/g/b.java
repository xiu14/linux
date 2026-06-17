package e.b.b.g;

import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class b extends com.bytedance.apm6.perf.base.model.a {
    private int b;

    /* renamed from: c, reason: collision with root package name */
    private List<String> f9447c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f9448d;

    public b(int i, List<String> list, boolean z) {
        this.b = i;
        this.f9447c = list;
        this.f9448d = z;
    }

    @Override // e.b.b.k.c
    public boolean b() {
        return true;
    }

    @Override // com.bytedance.apm6.perf.base.model.a
    protected JSONObject d() {
        String sb;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("fd_count", this.b);
            if (!com.bytedance.android.input.k.b.a.e0(this.f9447c)) {
                List<String> list = this.f9447c;
                if (list == null) {
                    sb = null;
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    boolean z = true;
                    for (String str : list) {
                        if (z) {
                            z = false;
                        } else {
                            sb2.append("\n");
                        }
                        sb2.append(str.toString());
                    }
                    sb = sb2.toString();
                }
                jSONObject.put("fd_detail", sb);
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    @Override // com.bytedance.apm6.perf.base.model.a
    protected JSONObject e() {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject();
            jSONObject.put("scene", e.b.b.l.a.a.a().e());
            jSONObject.put("process_name", e.b.b.h.c.a.k());
            jSONObject.put("is_main_process", e.b.b.h.c.a.y());
        } catch (Throwable unused) {
            jSONObject = null;
        }
        if (jSONObject == null) {
            try {
                jSONObject = new JSONObject();
            } catch (Exception unused2) {
            }
        }
        jSONObject.put("is_front", this.f9448d);
        return jSONObject;
    }

    @Override // com.bytedance.apm6.perf.base.model.a
    protected JSONObject f() {
        return null;
    }

    @Override // com.bytedance.apm6.perf.base.model.a
    protected JSONObject g() {
        return e.b.b.l.a.a.a().b();
    }

    @Override // com.bytedance.apm6.perf.base.model.a
    protected String h() {
        return "fd";
    }
}
