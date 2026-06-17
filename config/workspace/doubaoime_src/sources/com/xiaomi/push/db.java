package com.xiaomi.push;

import android.content.Context;

/* loaded from: classes2.dex */
public class db implements gu, gz {
    private Context a;

    public db(Context context) {
        this.a = context;
    }

    @Override // com.xiaomi.push.gu
    public void a(hd hdVar) {
        dj.b(this.a);
    }

    @Override // com.xiaomi.push.gz
    /* renamed from: a, reason: collision with other method in class */
    public boolean mo226a(hd hdVar) {
        return true;
    }

    @Override // com.xiaomi.push.gu
    public void a(gg ggVar) {
        if (ggVar != null && ggVar.a() == 0 && "PING".equals(ggVar.m414a())) {
            dj.d(this.a);
        } else {
            dj.b(this.a);
        }
    }
}
