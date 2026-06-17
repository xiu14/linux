package androidx.lifecycle;

import androidx.arch.core.util.Function;
import kotlin.o;
import kotlin.s.b.l;
import kotlin.s.c.m;

/* JADX INFO: Add missing generic type declarations: [X] */
/* loaded from: classes.dex */
final class Transformations$map$2<X> extends m implements l<X, o> {
    final /* synthetic */ Function<X, Y> $mapFunction;
    final /* synthetic */ MediatorLiveData<Y> $result;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Transformations$map$2(MediatorLiveData<Y> mediatorLiveData, Function<X, Y> function) {
        super(1);
        this.$result = mediatorLiveData;
        this.$mapFunction = function;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.s.b.l
    public /* bridge */ /* synthetic */ o invoke(Object obj) {
        invoke2((Transformations$map$2<X>) obj);
        return o.a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(X x) {
        this.$result.setValue(this.$mapFunction.apply(x));
    }
}
