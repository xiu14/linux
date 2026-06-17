package com.facebook.imagepipeline.producers;

import com.facebook.imagepipeline.producers.L;
import com.facebook.imagepipeline.producers.M;
import java.util.concurrent.Future;

/* renamed from: com.facebook.imagepipeline.producers.y, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C0744y extends C0725e {
    final /* synthetic */ Future a;
    final /* synthetic */ M.a b;

    C0744y(C0745z c0745z, Future future, M.a aVar) {
        this.a = future;
        this.b = aVar;
    }

    @Override // com.facebook.imagepipeline.producers.W
    public void a() {
        if (this.a.cancel(false)) {
            L.a aVar = (L.a) this.b;
            L.d(L.this, aVar.a);
        }
    }
}
