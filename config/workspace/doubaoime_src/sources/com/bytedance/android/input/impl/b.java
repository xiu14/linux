package com.bytedance.android.input.impl;

import android.content.Context;
import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.android.input.basic.applog.api.IAppLog;
import com.bytedance.push.interfaze.e;
import com.prolificinteractive.materialcalendarview.r;
import kotlin.h;
import kotlin.o;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class b implements e {
    public static final b a = new b();

    private b() {
    }

    @Override // com.bytedance.push.interfaze.e
    public void onEvent(Context context, String str, String str2, String str3, long j, long j2, JSONObject jSONObject) {
        Object J2;
        if (str == null || str2 == null || str3 == null) {
            return;
        }
        try {
            com.bytedance.applog.a.m(str, str2, str3, j, j2, jSONObject);
            J2 = o.a;
        } catch (Throwable th) {
            J2 = r.J(th);
        }
        Throwable b = h.b(J2);
        if (b != null) {
            IAppGlobals.a.j("ImePush-Event", "onEvent error: " + b);
        }
    }

    @Override // com.bytedance.push.interfaze.e
    public void onEventV3(String str, JSONObject jSONObject) {
        Object obj;
        if (str != null && jSONObject != null) {
            try {
                IAppLog.a.t(str, jSONObject);
            } catch (Throwable th) {
                obj = r.J(th);
            }
        }
        obj = o.a;
        Throwable b = h.b(obj);
        if (b != null) {
            IAppGlobals.a.j("ImePush-Event", "onEventV3 error: " + b);
        }
    }
}
