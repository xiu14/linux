package com.bytedance.bdinstall.g0.i;

import android.text.TextUtils;
import com.bytedance.bdinstall.C0640u;
import com.bytedance.bdinstall.Q;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class c {
    protected abstract JSONObject a();

    public void b(Q q, String str) {
        JSONObject a = a();
        if (q.u() != null) {
            q.u().a(str, a);
            if (!TextUtils.isEmpty(str)) {
                StringBuilder S = e.a.a.a.a.S("EventTracking# ", str);
                S.append(q.h());
                S.append(", ");
                S.append(a);
                S.toString();
                int i = C0640u.a;
            }
            c();
            if (TextUtils.isEmpty(str)) {
                return;
            }
            int i2 = C0640u.a;
        }
    }

    protected abstract void c();
}
