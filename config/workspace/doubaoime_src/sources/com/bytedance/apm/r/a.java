package com.bytedance.apm.r;

import com.bytedance.apm.n;
import com.bytedance.apm.r.g.a;
import org.json.JSONObject;

/* loaded from: classes.dex */
final class a implements a.InterfaceC0120a {
    final /* synthetic */ int[] a;
    final /* synthetic */ com.bytedance.android.input.basic.a.b b;

    a(int[] iArr, com.bytedance.android.input.basic.a.b bVar) {
        this.a = iArr;
        this.b = bVar;
    }

    @Override // com.bytedance.apm.r.g.a.InterfaceC0120a
    public void a(boolean z, int i, Exception exc, JSONObject jSONObject) {
        JSONObject P = com.bytedance.android.input.k.b.a.P(z, i, exc, jSONObject);
        com.bytedance.android.input.k.b.a.m0(P.toString());
        int[] iArr = this.a;
        iArr[0] = iArr[0] + 1;
        if (z || iArr[0] >= 2) {
            com.bytedance.android.input.basic.a.b bVar = this.b;
            if (bVar != null) {
                bVar.a(z, P);
            }
            if (!z) {
                com.bytedance.apm.c.k("apm_event_stats_alog_fail", i, P);
            }
            if (exc != null) {
                n.e().d(exc, "apm_event_stats_alog_fail");
            }
        }
    }
}
