package com.bytedance.android.input.basic.network.c;

import android.os.Looper;
import com.bytedance.android.input.basic.IAppGlobals;
import e.b.l.b;
import e.b.l.m;
import java.util.Objects;

/* loaded from: classes.dex */
public class d implements e.b.l.p.c {
    @Override // e.b.l.p.c
    public e.b.l.b invoke(Class cls, m mVar) {
        Object[] b = mVar.b();
        if (b == null || b.length <= 0) {
            return null;
        }
        final Object obj = b[b.length - 1];
        if (!(obj instanceof kotlin.r.d)) {
            return null;
        }
        try {
            return new e.b.l.b() { // from class: com.bytedance.android.input.basic.network.c.a
                @Override // e.b.l.b
                public final Object a(b.a aVar, m mVar2) {
                    Object obj2 = obj;
                    if (Looper.myLooper() != Looper.getMainLooper()) {
                        return aVar.a(mVar2);
                    }
                    IAppGlobals.a aVar2 = IAppGlobals.a;
                    Objects.requireNonNull(aVar2);
                    aVar2.e("ImeNetworkConst", "RpcInvokeException!! 主线程调用");
                    return c.a(aVar, mVar2, (kotlin.r.d) obj2);
                }
            };
        } catch (Throwable unused) {
            return null;
        }
    }
}
