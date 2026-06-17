package com.bytedance.applog.A;

import android.content.Context;
import com.bytedance.applog.c;
import com.bytedance.applog.m;
import com.bytedance.applog.util.e;
import com.bytedance.bdinstall.Level;

/* loaded from: classes.dex */
public class b {
    private final c a;

    public b(c cVar) {
        this.a = cVar;
    }

    public String a(Context context, String str) {
        if (this.a.t()) {
            str = e.a.a.a.a.s(str, "?tt_data=a");
        }
        return a.e(this.a.b(context, str, true, Level.L1), e.f3898d);
    }

    public String[] b(com.bytedance.applog.q.c cVar, boolean z, com.bytedance.applog.y.b bVar) {
        String[] f2;
        m s = cVar.s();
        String[] c2 = z ? s.c() : s.d();
        if (bVar != null && (f2 = bVar.f(c2, "/service/2/app_log/")) != null && f2.length > 0) {
            c2 = f2;
        }
        Context l = cVar.l();
        int length = c2.length;
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            strArr[i] = a(l, c2[i]);
        }
        return strArr;
    }
}
