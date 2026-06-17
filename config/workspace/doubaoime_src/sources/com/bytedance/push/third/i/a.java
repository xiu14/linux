package com.bytedance.push.third.i;

import android.content.Context;

/* loaded from: classes2.dex */
public class a extends b {
    private Context a;

    public a(Context context) {
        this.a = context;
    }

    @Override // com.bytedance.push.third.i.b
    public boolean a(com.bytedance.push.third.c cVar, int i) {
        return cVar != null && cVar.isPushAvailable(this.a, i);
    }
}
