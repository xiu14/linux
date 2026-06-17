package com.bytedance.bdinstall.k0;

import com.bytedance.bdinstall.Q;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class h extends d {

    /* renamed from: e, reason: collision with root package name */
    private final Q f4022e;

    h(Q q) {
        super(false, true);
        this.f4022e = q;
    }

    @Override // com.bytedance.bdinstall.k0.d
    protected boolean a(JSONObject jSONObject) throws SecurityException {
        Map<String, Object> p = this.f4022e.p();
        if (p == null) {
            return true;
        }
        try {
            if (p.isEmpty()) {
                return true;
            }
            for (Map.Entry<String, Object> entry : p.entrySet()) {
                if (entry != null) {
                    jSONObject.put(entry.getKey(), entry.getValue());
                }
            }
            return true;
        } catch (Exception e2) {
            e2.printStackTrace();
            return true;
        }
    }
}
