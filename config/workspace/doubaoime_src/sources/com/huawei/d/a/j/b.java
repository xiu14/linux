package com.huawei.d.a.j;

import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public class b<TResult> implements com.huawei.d.a.b<TResult> {
    public com.huawei.d.a.c<TResult> a;
    public Executor b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f6983c = new Object();

    public class a implements Runnable {
        public final /* synthetic */ com.huawei.d.a.f a;

        public a(com.huawei.d.a.f fVar) {
            this.a = fVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (b.this.f6983c) {
                com.huawei.d.a.c<TResult> cVar = b.this.a;
                if (cVar != null) {
                    cVar.onComplete(this.a);
                }
            }
        }
    }

    public b(Executor executor, com.huawei.d.a.c<TResult> cVar) {
        this.a = cVar;
        this.b = executor;
    }

    @Override // com.huawei.d.a.b
    public final void onComplete(com.huawei.d.a.f<TResult> fVar) {
        this.b.execute(new a(fVar));
    }
}
