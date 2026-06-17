package com.bytedance.rpc.rxjava;

import com.bytedance.rpc.annotation.RpcKeep;
import e.b.l.m;
import e.b.l.q.e;

@RpcKeep
/* loaded from: classes2.dex */
public class RxJavaInvokeInterceptor implements e.b.l.p.c {
    @Override // e.b.l.p.c
    public e.b.l.b invoke(Class cls, m mVar) {
        Class<?> d2 = e.d(mVar.h());
        if (e.b("rx.Observable", d2)) {
            return new a();
        }
        if (e.b("io.reactivex.Observable", d2)) {
            return new b();
        }
        return null;
    }
}
