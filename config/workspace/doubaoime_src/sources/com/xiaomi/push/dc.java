package com.xiaomi.push;

import android.content.Context;

/* loaded from: classes2.dex */
public class dc implements gu, gz {
    private Context a;

    public dc(Context context) {
        this.a = context;
    }

    @Override // com.xiaomi.push.gu
    public void a(hd hdVar) {
        dj.a(this.a);
    }

    @Override // com.xiaomi.push.gz
    /* renamed from: a */
    public boolean mo226a(hd hdVar) {
        return true;
    }

    @Override // com.xiaomi.push.gu
    public void a(gg ggVar) {
        if (ggVar != null && ggVar.a() == 0 && "PING".equals(ggVar.m414a())) {
            dj.c(this.a);
        } else {
            dj.a(this.a);
        }
    }
}
