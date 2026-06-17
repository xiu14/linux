package com.bytedance.bdinstall.m0;

import android.os.IBinder;
import android.util.Pair;
import com.bytedance.bdinstall.m0.u;
import com.bytedance.bdinstall.m0.x.a;

/* loaded from: classes.dex */
final class f implements u.b<com.bytedance.bdinstall.m0.x.a, Pair<String, Boolean>> {
    f() {
    }

    @Override // com.bytedance.bdinstall.m0.u.b
    public com.bytedance.bdinstall.m0.x.a a(IBinder iBinder) {
        return a.AbstractBinderC0165a.d(iBinder);
    }

    @Override // com.bytedance.bdinstall.m0.u.b
    public Pair<String, Boolean> b(com.bytedance.bdinstall.m0.x.a aVar) throws Exception {
        com.bytedance.bdinstall.m0.x.a aVar2 = aVar;
        if (aVar2 == null) {
            return null;
        }
        return new Pair<>(aVar2.b0(), Boolean.valueOf(aVar2.u()));
    }
}
