package com.xiaomi.push;

import android.content.Context;

/* loaded from: classes2.dex */
public class da implements gs {
    private final Context a;

    public da(Context context) {
        this.a = context.getApplicationContext();
    }

    @Override // com.xiaomi.push.gs
    public void a(gp gpVar) {
    }

    @Override // com.xiaomi.push.gs
    public void a(gp gpVar, int i, Exception exc) {
        Context context = this.a;
        if (context != null) {
            cy.a(context).a(i);
        }
    }

    @Override // com.xiaomi.push.gs
    public void a(gp gpVar, Exception exc) {
    }

    @Override // com.xiaomi.push.gs
    public void b(gp gpVar) {
        Context context = this.a;
        if (context != null) {
            cy.a(context).m204a();
        }
    }
}
