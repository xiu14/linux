package com.bytedance.rpc.rxjava;

import e.b.l.b;
import e.b.l.m;
import rx.Observable;

/* loaded from: classes2.dex */
class a implements e.b.l.b {

    /* renamed from: com.bytedance.rpc.rxjava.a$a, reason: collision with other inner class name */
    class C0314a implements Observable.OnSubscribe<Object> {
        C0314a(a aVar) {
        }
    }

    a() {
    }

    @Override // e.b.l.b
    public Object a(b.a aVar, m mVar) {
        new c(mVar);
        return Observable.create(new C0314a(this));
    }
}
