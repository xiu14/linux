package com.bytedance.apm.B.l;

import java.util.Objects;
import org.json.JSONObject;

/* loaded from: classes.dex */
class b implements com.bytedance.apm.data.pipeline.b {
    final /* synthetic */ c a;

    b(c cVar) {
        this.a = cVar;
    }

    @Override // com.bytedance.apm.data.pipeline.b
    public void a(String str, String str2, JSONObject jSONObject) {
        boolean z;
        z = this.a.a;
        if (z && "image_monitor_v2".equals(str2)) {
            Objects.requireNonNull(this.a);
        }
    }
}
