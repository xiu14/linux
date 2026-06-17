package kotlin.x;

import java.util.Iterator;

/* JADX INFO: Add missing generic type declarations: [T] */
/* loaded from: classes2.dex */
public final class k<T> implements e<T> {
    final /* synthetic */ Iterator a;

    public k(Iterator it2) {
        this.a = it2;
    }

    @Override // kotlin.x.e
    public Iterator<T> iterator() {
        return this.a;
    }
}
