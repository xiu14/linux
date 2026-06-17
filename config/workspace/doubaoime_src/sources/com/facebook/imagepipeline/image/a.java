package com.facebook.imagepipeline.image;

/* loaded from: classes2.dex */
public class a extends d {

    /* renamed from: d, reason: collision with root package name */
    private com.facebook.imagepipeline.animated.base.d f6467d;

    /* renamed from: e, reason: collision with root package name */
    private final com.facebook.imagepipeline.common.c f6468e;

    public a(com.facebook.imagepipeline.animated.base.d dVar, com.facebook.imagepipeline.common.c cVar, e.c.g.d dVar2) {
        this.f6467d = dVar;
        this.f6468e = cVar;
        this.a = dVar2;
    }

    @Override // com.facebook.imagepipeline.image.d, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this) {
            com.facebook.imagepipeline.animated.base.d dVar = this.f6467d;
            if (dVar == null) {
                return;
            }
            this.f6467d = null;
            dVar.a();
        }
    }

    @Override // com.facebook.imagepipeline.image.h
    public synchronized int d() {
        return this.f6467d.e().a();
    }

    @Override // com.facebook.imagepipeline.image.h
    public synchronized int getHeight() {
        return isClosed() ? 0 : this.f6467d.e().getHeight();
    }

    @Override // com.facebook.imagepipeline.image.h
    public synchronized int getWidth() {
        return isClosed() ? 0 : this.f6467d.e().getWidth();
    }

    @Override // com.facebook.imagepipeline.image.d
    public synchronized boolean isClosed() {
        return this.f6467d == null;
    }

    @Override // com.facebook.imagepipeline.image.d
    public synchronized int o() {
        return isClosed() ? 0 : this.f6467d.e().l();
    }

    @Override // com.facebook.imagepipeline.image.d
    public boolean p() {
        return true;
    }

    public synchronized com.facebook.imagepipeline.animated.base.b s() {
        return isClosed() ? null : this.f6467d.e();
    }

    public synchronized com.facebook.imagepipeline.animated.base.d w() {
        return this.f6467d;
    }

    public com.facebook.imagepipeline.common.c x() {
        return this.f6468e;
    }
}
