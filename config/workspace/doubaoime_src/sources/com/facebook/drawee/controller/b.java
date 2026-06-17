package com.facebook.drawee.controller;

import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import e.c.c.d.h;

/* JADX INFO: Add missing generic type declarations: [IMAGE] */
/* loaded from: classes2.dex */
class b<IMAGE> extends AbstractDraweeControllerBuilder<BUILDER, REQUEST, IMAGE, INFO>.b<com.facebook.datasource.d<IMAGE>> {
    final /* synthetic */ Object a;
    final /* synthetic */ e.c.e.e.a b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f6346c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Object f6347d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ AbstractDraweeControllerBuilder.CacheLevel f6348e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ AbstractDraweeControllerBuilder f6349f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(AbstractDraweeControllerBuilder abstractDraweeControllerBuilder, Object obj, e.c.e.e.a aVar, String str, Object obj2, AbstractDraweeControllerBuilder.CacheLevel cacheLevel) {
        super(abstractDraweeControllerBuilder);
        this.f6349f = abstractDraweeControllerBuilder;
        this.a = obj;
        this.b = aVar;
        this.f6346c = str;
        this.f6347d = obj2;
        this.f6348e = cacheLevel;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [REQUEST, java.lang.Object] */
    @Override // com.facebook.drawee.controller.AbstractDraweeControllerBuilder.b
    public REQUEST a() {
        return this.a;
    }

    @Override // e.c.c.d.j
    public Object get() {
        return this.f6349f.d(this.b, this.f6346c, this.a, this.f6347d, this.f6348e);
    }

    public String toString() {
        h.b k = h.k(this);
        k.b("request", this.a.toString());
        return k.toString();
    }
}
