package com.xiaomi.push;

import android.content.Context;

/* loaded from: classes2.dex */
public class dh implements gs {
    private Context a;

    public dh(Context context) {
        this.a = context;
    }

    @Override // com.xiaomi.push.gs
    public void a(gp gpVar) {
    }

    @Override // com.xiaomi.push.gs
    public void a(gp gpVar, int i, Exception exc) {
        dd.a(this.a, gpVar.mo438a(), i);
    }

    @Override // com.xiaomi.push.gs
    public void a(gp gpVar, Exception exc) {
    }

    @Override // com.xiaomi.push.gs
    public void b(gp gpVar) {
        dd.m228a(this.a);
    }
}
