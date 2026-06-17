package com.xiaomi.mipush.sdk;

import android.content.Context;
import com.xiaomi.push.dv;
import com.xiaomi.push.hu;
import com.xiaomi.push.ih;
import com.xiaomi.push.it;

/* loaded from: classes2.dex */
public class i implements dv {
    private Context a;

    public i(Context context) {
        this.a = context;
    }

    @Override // com.xiaomi.push.dv
    public String a() {
        return b.m41a(this.a).d();
    }

    @Override // com.xiaomi.push.dv
    public void a(it itVar, hu huVar, ih ihVar) {
        u.a(this.a).a((u) itVar, huVar, ihVar);
    }
}
