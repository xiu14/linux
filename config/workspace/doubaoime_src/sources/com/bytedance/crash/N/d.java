package com.bytedance.crash.N;

import androidx.annotation.NonNull;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class d extends com.bytedance.crash.monitor.b {
    public d(com.bytedance.crash.monitor.f fVar) {
        super(fVar);
    }

    @Override // com.bytedance.crash.monitor.g
    @NonNull
    protected b b() {
        return new e(this.a);
    }

    @Override // com.bytedance.crash.monitor.g
    protected void d(JSONObject jSONObject) {
        if (com.bytedance.crash.dumper.b.e()) {
            this.f4639c = new com.bytedance.crash.R.c(true);
        } else {
            super.d(jSONObject);
        }
    }

    @Override // com.bytedance.crash.monitor.g
    protected void e(JSONObject jSONObject) {
        super.e(jSONObject);
    }

    @Override // com.bytedance.crash.monitor.b
    protected void i(JSONObject jSONObject) {
        super.i(jSONObject);
    }
}
