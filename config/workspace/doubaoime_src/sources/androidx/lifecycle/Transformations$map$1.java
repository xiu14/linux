package androidx.lifecycle;

import kotlin.o;
import kotlin.s.b.l;
import kotlin.s.c.m;

/* JADX INFO: Add missing generic type declarations: [X] */
/* loaded from: classes.dex */
final class Transformations$map$1<X> extends m implements l<X, o> {
    final /* synthetic */ MediatorLiveData<Y> $result;
    final /* synthetic */ l<X, Y> $transform;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Transformations$map$1(MediatorLiveData<Y> mediatorLiveData, l<X, Y> lVar) {
        super(1);
        this.$result = mediatorLiveData;
        this.$transform = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.s.b.l
    public /* bridge */ /* synthetic */ o invoke(Object obj) {
        invoke2((Transformations$map$1<X>) obj);
        return o.a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(X x) {
        this.$result.setValue(this.$transform.invoke(x));
    }
}
