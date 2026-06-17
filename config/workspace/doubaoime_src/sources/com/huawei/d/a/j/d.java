package com.huawei.d.a.j;

import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public class d<TResult> implements com.huawei.d.a.b<TResult> {
    public com.huawei.d.a.e<TResult> a;
    public Executor b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f6985c = new Object();

    public class a implements Runnable {
        public final /* synthetic */ com.huawei.d.a.f a;

        public a(com.huawei.d.a.f fVar) {
            this.a = fVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            synchronized (d.this.f6985c) {
                com.huawei.d.a.e<TResult> eVar = d.this.a;
                if (eVar != 0) {
                    eVar.onSuccess(this.a.e());
                }
            }
        }
    }

    public d(Executor executor, com.huawei.d.a.e<TResult> eVar) {
        this.a = eVar;
        this.b = executor;
    }

    @Override // com.huawei.d.a.b
    public final void onComplete(com.huawei.d.a.f<TResult> fVar) {
        if (!fVar.f() || ((e) fVar).f6986c) {
            return;
        }
        this.b.execute(new a(fVar));
    }
}
