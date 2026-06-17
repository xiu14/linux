package com.bytedance.android.input.basic.a;

import android.content.Context;
import com.bytedance.android.input.basic.a.c;
import com.prolificinteractive.materialcalendarview.r;
import kotlinx.coroutines.C0795d;
import kotlinx.coroutines.N0.q;
import kotlinx.coroutines.S;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final /* synthetic */ class b {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Context b;

    public /* synthetic */ b(boolean z, Context context) {
        this.a = z;
        this.b = context;
    }

    public final void a(boolean z, JSONObject jSONObject) {
        boolean z2 = this.a;
        Context context = this.b;
        com.ss.android.c.a.l("ImeLogManager", "success = " + z + ", ret = " + jSONObject);
        if (z2) {
            int i = S.f10199c;
            C0795d.l(r.b(q.f10173c), null, null, new c.a(z, context, null), 3, null);
        }
    }
}
