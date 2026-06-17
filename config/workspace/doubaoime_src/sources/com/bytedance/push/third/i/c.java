package com.bytedance.push.third.i;

import android.content.Context;
import com.bytedance.push.C;
import com.bytedance.push.H;

/* loaded from: classes2.dex */
public class c extends b {
    private Context a;

    public c(Context context) {
        this.a = context;
    }

    @Override // com.bytedance.push.third.i.b
    public boolean a(com.bytedance.push.third.c cVar, int i) {
        return (cVar == null || !cVar.isPushAvailable(this.a, i) || ((H) C.B()).b(i) == null) ? false : true;
    }
}
