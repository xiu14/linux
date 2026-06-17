package com.facebook.datasource;

/* loaded from: classes2.dex */
public abstract class c<T> implements f<T> {
    @Override // com.facebook.datasource.f
    public void b(d<T> dVar) {
        try {
            e(dVar);
        } finally {
            dVar.close();
        }
    }

    @Override // com.facebook.datasource.f
    public void c(d<T> dVar) {
        AbstractDataSource abstractDataSource = (AbstractDataSource) dVar;
        boolean b = abstractDataSource.b();
        try {
            f(abstractDataSource);
        } finally {
            if (b) {
                abstractDataSource.close();
            }
        }
    }

    protected abstract void e(d<T> dVar);

    protected abstract void f(d<T> dVar);
}
