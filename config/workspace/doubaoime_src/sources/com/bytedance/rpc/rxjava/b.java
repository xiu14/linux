package com.bytedance.rpc.rxjava;

import e.b.l.b;
import e.b.l.m;
import io.reactivex.Observable;
import io.reactivex.ObservableOnSubscribe;

/* loaded from: classes2.dex */
class b implements e.b.l.b {

    class a implements ObservableOnSubscribe<Object> {
        a(b bVar) {
        }
    }

    b() {
    }

    @Override // e.b.l.b
    public Object a(b.a aVar, m mVar) {
        new c(mVar);
        return Observable.create(new a(this));
    }
}
