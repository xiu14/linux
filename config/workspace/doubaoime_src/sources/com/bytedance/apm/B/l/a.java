package com.bytedance.apm.B.l;

import org.json.JSONObject;

/* loaded from: classes.dex */
class a implements com.bytedance.apm.data.pipeline.c {
    final /* synthetic */ c a;

    a(c cVar) {
        this.a = cVar;
    }

    @Override // com.bytedance.apm.data.pipeline.c
    public void a(String str, JSONObject jSONObject) {
        boolean z;
        z = this.a.a;
        if (z) {
            this.a.l(str, jSONObject);
        }
    }
}
