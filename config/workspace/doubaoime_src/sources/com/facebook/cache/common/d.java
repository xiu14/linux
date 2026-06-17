package com.facebook.cache.common;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes2.dex */
public class d implements CacheEventListener {
    private List<CacheEventListener> a = new CopyOnWriteArrayList();

    @Override // com.facebook.cache.common.CacheEventListener
    public void a(a aVar) {
        Iterator<CacheEventListener> it2 = this.a.iterator();
        while (it2.hasNext()) {
            it2.next().a(aVar);
        }
    }

    @Override // com.facebook.cache.common.CacheEventListener
    public void b(a aVar) {
        Iterator<CacheEventListener> it2 = this.a.iterator();
        while (it2.hasNext()) {
            it2.next().b(aVar);
        }
    }

    @Override // com.facebook.cache.common.CacheEventListener
    public void c() {
        Iterator<CacheEventListener> it2 = this.a.iterator();
        while (it2.hasNext()) {
            it2.next().c();
        }
    }

    @Override // com.facebook.cache.common.CacheEventListener
    public void d(a aVar) {
        Iterator<CacheEventListener> it2 = this.a.iterator();
        while (it2.hasNext()) {
            it2.next().d(aVar);
        }
    }

    @Override // com.facebook.cache.common.CacheEventListener
    public void e(a aVar) {
        Iterator<CacheEventListener> it2 = this.a.iterator();
        while (it2.hasNext()) {
            it2.next().e(aVar);
        }
    }

    @Override // com.facebook.cache.common.CacheEventListener
    public void f(a aVar) {
        Iterator<CacheEventListener> it2 = this.a.iterator();
        while (it2.hasNext()) {
            it2.next().f(aVar);
        }
    }

    @Override // com.facebook.cache.common.CacheEventListener
    public void g(a aVar) {
        Iterator<CacheEventListener> it2 = this.a.iterator();
        while (it2.hasNext()) {
            it2.next().g(aVar);
        }
    }

    @Override // com.facebook.cache.common.CacheEventListener
    public void h(a aVar) {
        Iterator<CacheEventListener> it2 = this.a.iterator();
        while (it2.hasNext()) {
            it2.next().h(aVar);
        }
    }

    public void i(CacheEventListener cacheEventListener) {
        this.a.add(cacheEventListener);
    }
}
