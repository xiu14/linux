package com.bytedance.frameworks.baselib.network.http.ok3.impl.urldispatcher.l;

/* loaded from: classes.dex */
public class a extends com.bytedance.frameworks.baselib.network.c.c.b<c> {
    @Override // com.bytedance.frameworks.baselib.network.c.c.b
    public String a() {
        return "ttnet_redirect_dp";
    }

    @Override // com.bytedance.frameworks.baselib.network.c.c.b
    public c e(Object obj) {
        c cVar = null;
        Integer num = obj instanceof Integer ? (Integer) obj : null;
        if (num != null) {
            cVar = new c();
            cVar.a = num.intValue() == 1;
        }
        return cVar;
    }
}
