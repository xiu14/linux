package com.bytedance.retrofit2;

import java.io.IOException;
import java.util.Iterator;

/* JADX INFO: Add missing generic type declarations: [T] */
/* loaded from: classes2.dex */
class B<T> extends D<Iterable<T>> {
    final /* synthetic */ D a;

    B(D d2) {
        this.a = d2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.bytedance.retrofit2.D
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(F f2, Iterable<T> iterable) throws IOException {
        if (iterable == null) {
            return;
        }
        Iterator<T> it2 = iterable.iterator();
        while (it2.hasNext()) {
            this.a.a(f2, it2.next());
        }
    }
}
